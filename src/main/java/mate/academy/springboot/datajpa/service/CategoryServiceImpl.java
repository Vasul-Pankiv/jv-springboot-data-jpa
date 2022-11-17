package mate.academy.springboot.datajpa.service;

import mate.academy.springboot.datajpa.model.Category;
import mate.academy.springboot.datajpa.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository productRepository) {
        this.categoryRepository = productRepository;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public Category deleteById(Long id) {
        Category category = categoryRepository.getById(id);
        categoryRepository.deleteById(id);
        return category;
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }
}