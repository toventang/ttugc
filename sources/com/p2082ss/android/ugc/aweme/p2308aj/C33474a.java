package com.p2082ss.android.ugc.aweme.p2308aj;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.VEImageDetectUtils;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aj.a */
public final class C33474a {

    /* renamed from: a */
    private VEImageDetectUtils f79538a;

    static {
        Covode.recordClassIndex(40331);
    }

    /* renamed from: a */
    public final void mo59555a() {
        VEImageDetectUtils vEImageDetectUtils = this.f79538a;
        if (vEImageDetectUtils != null) {
            vEImageDetectUtils.stopDetectImagesContentIfNeed();
        }
    }

    /* renamed from: a */
    public final synchronized void mo59556a(String str, List<String> list, List<String> list2, VEImageDetectUtils.IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        MethodCollector.m26663i(5414);
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(iDetectImageResultWithNumListener, "");
        VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
        vEImageDetectUtils.init();
        vEImageDetectUtils.setDetectImageContentWithNumListener(iDetectImageResultWithNumListener);
        vEImageDetectUtils.detectImagesContentWithSize(str, list, list2, 1280, 1280);
        vEImageDetectUtils.destroy();
        this.f79538a = vEImageDetectUtils;
        MethodCollector.m26664o(5414);
    }
}
