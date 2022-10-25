package com.conrad.managementsystem.mapper;

import com.conrad.managementsystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * from employee")
    List<Employee> findAll();
}
