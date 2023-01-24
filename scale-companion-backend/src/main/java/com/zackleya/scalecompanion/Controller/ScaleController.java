package com.zackleya.scalecompanion.Controller;

import com.zackleya.scalecompanion.Dao.scaleDao;
import com.zackleya.scalecompanion.Model.Scale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ScaleController {

    @Autowired
    private scaleDao scaleDao;

    @GetMapping("/scale/{root}/{type}")
    public Scale getScaleByRootAndType(@PathVariable("root") String root, @PathVariable("type") String type) {
        return scaleDao.getScaleByRootAndType(root, type);
    }

    @GetMapping("/scale")
    public List<Scale> getAllScales() {
        return scaleDao.getAllScales();
    }

    @GetMapping("/scale/{root}")
    public List<Scale> getScalesByRoot(@PathVariable("root") String root) {
        return scaleDao.getScalesByRoot(root);
    }

    @GetMapping("/scale/{type}")
    public List<Scale> getScalesByType(@PathVariable("type") String type) {
        return scaleDao.getScalesByType(type);
    }

}
