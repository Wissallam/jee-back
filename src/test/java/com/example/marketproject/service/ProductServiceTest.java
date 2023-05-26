package com.example.marketproject.service;

import com.example.marketproject.bean.Product;
import com.example.marketproject.dao.ProductDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    // @Mock is used to create a mock object of the ProductDao
    // interface. This allows us to define the behavior of the
    // productDao dependency without using a real database.
    @Mock
    private ProductDao productDao;

    // @InjectMocks is used to inject the mocked ProductDao object
    // into the ProductService instance being tested.
    @InjectMocks
    private ProductService productService;

    //@BeforeEach is a JUnit annotation that indicates a method to
    // be executed before each test method. In this case, we initialize
    // the Mockito annotations using MockitoAnnotations.initMocks(this);
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindByLabel() {
        //given
        String label = "TestProduct";
        Product product = new Product();
        product.setLabel(label);

        //when
        when(productDao.findByLabel(label)).thenReturn(product);

        Product result = productService.findByLabel(label);
        //then
        assertEquals(product, result);
        verify(productDao, times(1)).findByLabel(label);
    }

    @Test
    public void testFindAll() {
        //given
        List<Product> productList = new ArrayList<>();
        productList.add(new Product());
        productList.add(new Product());
       //when
        when(productDao.findAll()).thenReturn(productList);

        List<Product> result = productService.findAll();
       //then
        assertEquals(productList, result);
        verify(productDao, times(1)).findAll();
    }

// build trigger test
    // 2-build trigger test
    //3-build trigger test

}
