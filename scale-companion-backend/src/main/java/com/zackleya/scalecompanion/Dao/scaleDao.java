package com.zackleya.scalecompanion.Dao;

import com.zackleya.scalecompanion.Model.Scale;

import java.util.List;

public interface scaleDao {

    Scale getScaleById(int id);

    Scale getScaleByRootAndType(String root, String type);

    List<Scale> getAllScales();

    List<Scale> getScalesByRoot(String root);

    List<Scale> getScalesByType(String type);

    //Add scale?

    //Favorite?

    //Delete

}
