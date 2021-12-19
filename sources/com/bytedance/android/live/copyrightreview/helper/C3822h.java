package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.message.C9629az;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.copyrightreview.helper.h */
public final /* synthetic */ class C3822h implements AbstractC88433f {

    /* renamed from: a */
    private final CopyrightViolationHelper f10568a;

    static {
        Covode.recordClassIndex(4351);
    }

    C3822h(CopyrightViolationHelper copyrightViolationHelper) {
        this.f10568a = copyrightViolationHelper;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = this.f10568a;
        C5832d dVar = (C5832d) obj;
        copyrightViolationHelper.f10549e = false;
        if (dVar != null && dVar.data != null && ((C9629az) dVar.data).f23468a != 0) {
            copyrightViolationHelper.mo9163a(2);
        }
    }
}
