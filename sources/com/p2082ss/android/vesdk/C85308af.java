package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.VEImageDetectUtils;
import java.util.List;

/* renamed from: com.ss.android.vesdk.af */
public final class C85308af {

    /* renamed from: a */
    private VEImageDetectUtils f190911a;

    static {
        Covode.recordClassIndex(99419);
    }

    /* renamed from: a */
    public final synchronized void mo130626a(String str, String str2, List<String> list, VEImageDetectUtils.IDetectImageResultListener iDetectImageResultListener) {
        MethodCollector.m26663i(3628);
        VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
        this.f190911a = vEImageDetectUtils;
        vEImageDetectUtils.init();
        this.f190911a.setDetectImageContentListener(iDetectImageResultListener);
        this.f190911a.detectImageContent(str, str2, list, 1280, 1280);
        this.f190911a.destroy();
        MethodCollector.m26664o(3628);
    }
}
