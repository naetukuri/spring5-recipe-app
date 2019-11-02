package guru.springframework.controller;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repository.CategoryRepository;
import guru.springframework.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Controller
public class IndexController {
    CategoryRepository categoryRepository;
    UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional =categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat Id is:"+categoryOptional.get().getId());
        System.out.println("UPM Id is:"+unitOfMeasureOptional.get().getId());
        return "index";
    }
}
