package com.kakao.util;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface KakaoUtilService {
    static {
        Covode.recordClassIndex(34044);
    }

    Intent resolveIntent(Context context, Intent intent, int i);

    public static class Factory {
        private static KakaoUtilService instance = new DefaultKakaoUtilService();

        private Factory() {
        }

        public static KakaoUtilService getInstance() {
            return instance;
        }

        static {
            Covode.recordClassIndex(34045);
        }
    }
}
