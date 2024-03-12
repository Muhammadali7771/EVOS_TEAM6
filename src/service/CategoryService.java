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
    public Category getCategoryById(UUID id) {
        for (Category category : categories) {
            if (category != null && category.getId().equals(id)) {
                return category;
            }
        }
        return null;
    }

    public void deleteCategory(UUID id){
        for (int i=0; i < categories.length; i++){
            if (categories[i] != null && categories[i].getId().equals(id)){
                for (int j = i; j < index - 1; j++){
                    categories[j] = categories[j+1];
                }
                categories[index - 1] = null;
                index--;
                return;
            }
        }
    }

    public void updateCategory(UUID id, String name){
        Category existingCategory = getCategoryById(id);
        if (existingCategory != null){
            existingCategory.setName(name);
        }
    }
}
