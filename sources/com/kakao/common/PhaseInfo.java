package com.kakao.common;

import com.bytedance.covode.number.Covode;

public interface PhaseInfo {
    static {
        Covode.recordClassIndex(33924);
    }

    String appKey();

    String clientSecret();

    KakaoPhase phase();
}
