package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public final class BlankApiResponse {
    public static final ResponseStringConverter<Boolean> CONVERTER = new ResponseStringConverter<Boolean>() {
        /* class com.kakao.network.response.BlankApiResponse.C281001 */

        static {
            Covode.recordClassIndex(33953);
        }

        public final Boolean convert(String str) {
            return true;
        }
    };

    static {
        Covode.recordClassIndex(33952);
    }
}
