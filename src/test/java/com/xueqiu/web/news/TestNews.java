package com.xueqiu.web.news;

import com.xueqiu.web.XueQiuApi;
import org.junit.BeforeClass;

public class TestNews extends News {

    @BeforeClass
    public void beforeNews() {
        XueQiuApi xueQiuApi = new XueQiuApi();
        xueQiuApi.login();
    }
}
