package org.example;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.util.StringUtil;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class FedexDataListener extends AnalysisEventListener<FedexData> {

    Map<String, List<FedexData>> sheetDataMap = new HashMap<>();
    List<FedexData> fedexDataList = new ArrayList<>();

    @Override
    public void invoke(FedexData fedexData, AnalysisContext context) {
        if (StringUtils.isEmpty(fedexData.getFirstColumn())) {
            fedexDataList.add(fedexData);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        String sheetName = context.getCurrentSheet().getSheetName();
        sheetDataMap.put(sheetName, fedexDataList);
        fedexDataList.clear();
    }

}
