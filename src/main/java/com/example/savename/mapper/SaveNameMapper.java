package com.example.savename.mapper;

import com.example.savename.bean.SaveName;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/6/27
 */
@Mapper
public interface SaveNameMapper {
    public int insetSaveName(SaveName saveName);
    public List<SaveName> getAllSaveName();
    public SaveName getSaveNameById(Integer id);
    public int delSaveNameById(Integer id);
}
