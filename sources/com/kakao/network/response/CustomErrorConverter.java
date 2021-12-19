package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public interface CustomErrorConverter<T> {
    static {
        Covode.recordClassIndex(33954);
    }

    T convert(int i, String str);
}
