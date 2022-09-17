package com.chb.tags.platform.repo;

import com.chb.tags.platform.entity.po.ModelPo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<ModelPo, Long> {

    ModelPo findByTagId(Long tagId);


}
