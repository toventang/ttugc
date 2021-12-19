package com.kakao.network.storage;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ResponseStringConverter;

public class ImageDeleteResponse {
    public static final ResponseStringConverter<ImageDeleteResponse> CONVERTER = new ResponseStringConverter<ImageDeleteResponse>() {
        /* class com.kakao.network.storage.ImageDeleteResponse.C281031 */

        static {
            Covode.recordClassIndex(33968);
        }

        public final ImageDeleteResponse convert(String str) {
            return new ImageDeleteResponse();
        }
    };

    ImageDeleteResponse() {
    }

    static {
        Covode.recordClassIndex(33967);
    }
}
