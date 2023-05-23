package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.dto.CategoryDto;
import bd.edu.diu.cis.library.model.Category;

import java.util.List;

public interface CategoryService {
    /*Admin*/
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void hideById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();
    void deleteById(Long id);

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();


}
