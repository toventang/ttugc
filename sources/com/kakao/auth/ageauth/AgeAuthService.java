package com.kakao.auth.ageauth;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface AgeAuthService {
    static {
        Covode.recordClassIndex(33838);
    }

    int requestAgeAuth(Bundle bundle, Context context);
}
