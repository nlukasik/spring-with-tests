package pl.edu.wszib.springwithtests.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.springwithtests.dao.ProductDao;
import pl.edu.wszib.springwithtests.dto.ProductDTO;
import pl.edu.wszib.springwithtests.model.Product;
import pl.edu.wszib.springwithtests.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao dao;

    @Autowired
    private Mapper mapper;

    @Override
    public ProductDTO add(ProductDTO productDTO) {
        return mapper.map(
                dao.save(
                        mapper.map(productDTO, Product.class)
                ), ProductDTO.class);
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) {
        return mapper.map(
                dao.save(
                        mapper.map(productDTO, Product.class)
                ), ProductDTO.class);    }

    @Override
    public void remove(Integer integer) {
        dao.deleteById(integer);
    }

    @Override
    public ProductDTO find(Integer integer) {
        return dao.findById(integer)
                .map(p -> mapper.map(p, ProductDTO.class))
                .orElse(null);
    }

    @Override
    public List<ProductDTO> findAll() {
        return  dao.findAll().stream()
                .map(p -> mapper.map(p, ProductDTO.class))
                .collect(Collectors.toList());
    }


}
