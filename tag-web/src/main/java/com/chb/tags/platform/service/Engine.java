package com.chb.tags.platform.service;


import com.chb.tags.platform.entity.dto.ModelDto;

public interface Engine {

    String startModel(ModelDto modelDto);
    void stopModel(ModelDto modelDto);
}
