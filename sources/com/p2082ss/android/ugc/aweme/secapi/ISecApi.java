package com.p2082ss.android.ugc.aweme.secapi;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.secapi.p3710a.EnumC67838a;

/* renamed from: com.ss.android.ugc.aweme.secapi.ISecApi */
public interface ISecApi {
    static {
        Covode.recordClassIndex(79498);
    }

    void dismissCaptcha();

    void initSec(Context context, String str, int i, String str2, String str3, boolean z, AbstractC67839b bVar);

    void initTask();

    boolean isCaptchaUrl(String str);

    void loadSo();

    boolean needVerifyImage(int i);

    String onEvent();

    void popCaptcha(Activity activity, int i, C67837a aVar);

    void popCaptchaV2(Activity activity, String str, C67837a aVar);

    void reportData(String str);

    void setParams();

    void updateCollectMode(EnumC67838a aVar);

    void updateDeviceIdAndInstallId(String str, String str2);
}
