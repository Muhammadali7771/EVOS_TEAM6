package service;

import model.Category;
import model.User;

import java.util.UUID;

public class CategoryService {
    private Category[] categories = new Category[100];
    private int index = 0;
    public boolean addCategory(Category category) {
        if (!hasCategory(category.getName())) {
            categories[index++] = category;
            return true;
        }
        return false;
    }

    private boolean hasCategory(String name) {
        for (Category category : categories) {
            if (category != null && category.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public Category[] getCategories() {
        return categories;
    }
    private Category getCategoryById(UUID id) {
        for (Category category : categories) {
            if (category != null && category.getId().equals(id)) {
                return category;
            }
        }
        return null;
    }

}
