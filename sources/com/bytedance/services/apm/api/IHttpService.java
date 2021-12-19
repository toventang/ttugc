package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import java.io.File;
import java.util.List;
import java.util.Map;

public interface IHttpService extends IService {
    static {
        Covode.recordClassIndex(26534);
    }

    C22710c doGet(String str, Map<String, String> map);

    C22710c doPost(String str, byte[] bArr, Map<String, String> map);

    C22710c uploadFiles(String str, List<File> list, Map<String, String> map);
}
