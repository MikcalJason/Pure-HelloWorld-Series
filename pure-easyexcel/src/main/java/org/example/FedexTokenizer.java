package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FedexTokenizer {

    Map<String, List<FedexToken>> map = new HashMap<>();
    Map<String, String> serviceMap = new HashMap<>();//key = serviceName,value = serviceCode;

    public static Map<String, List<FedexToken>> tokenizes() {

    }

    public static List<FedexToken> tokenize(List<FedexToken> sheet) {


    }

    public Boolean isService(FedexToken fedexToken) {
        String lowerCase = fedexToken.getFirstColumn().toLowerCase();

        for (Map.Entry<String, String> entry : serviceMap.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            if (k.toLowerCase().equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }
}
