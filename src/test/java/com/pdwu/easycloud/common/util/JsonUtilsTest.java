package com.pdwu.easycloud.common.util;

import com.pdwu.easycloud.common.bean.ResultBean;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by pdwu on 2017/12/16.
 */
public class JsonUtilsTest {
    @Test
    public void objectToJson() throws Exception {

        String res = JsonUtils.objectToJson(ResultBean.fail(123, "fail"));
        assertEquals("{\"msg\":\"fail\",\"code\":123,\"data\":{}}", res);

        String res2 = JsonUtils.objectToJson(ResultBean.success("hehe"));
        assertEquals("{\"msg\":\"\",\"code\":200,\"data\":\"hehe\"}", res2);

        new JsonUtils();
    }

}