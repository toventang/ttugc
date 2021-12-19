package com.p2082ss.android.ugc.effectmanager.common.listener;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.common.listener.IJsonConverter */
public interface IJsonConverter {
    static {
        Covode.recordClassIndex(95474);
    }

    <T> T convertJsonToObj(InputStream inputStream, Class<T> cls);

    <T> String convertObjToJson(T t);
}
