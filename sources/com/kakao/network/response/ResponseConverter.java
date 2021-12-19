package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public interface ResponseConverter<F, T> {
    static {
        Covode.recordClassIndex(33961);
    }

    T convert(F f);

    F fromArray(JSONArray jSONArray, int i);
}
