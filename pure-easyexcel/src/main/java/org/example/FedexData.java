package org.example;


import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class FedexData {
    @ExcelProperty(index = 0)
    private String firstColumn;
    @ExcelProperty(index = 1)
    private String secondColumn;
    @ExcelIgnore
    private Integer row;
    @ExcelIgnore
    private Integer col;
}
