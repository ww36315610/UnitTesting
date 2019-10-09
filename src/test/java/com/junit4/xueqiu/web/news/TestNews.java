package com.junit4.xueqiu.web.news;

import com.junit4.xueqiu.web.XueQiuApi;
import org.junit.BeforeClass;

public class TestNews extends News {

    @BeforeClass
    public void beforeNews() {
        XueQiuApi xueQiuApi = new XueQiuApi();
        xueQiuApi.login();
    }
}
