package com.kakao.auth.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ApiResponseStatusError;

public abstract class AuthorizedApiResponse {
    static {
        Covode.recordClassIndex(33915);
    }

    public static class SessionClosedException extends ApiResponseStatusError {
        static {
            Covode.recordClassIndex(33916);
        }

        public SessionClosedException(String str) {
            this(-401, str, 401);
        }

        public SessionClosedException(int i, String str, int i2) {
            super(i, str, i2);
        }
    }
}
