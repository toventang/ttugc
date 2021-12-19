package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.d */
public final class C55081d implements AbstractC56222f {

    /* renamed from: a */
    private AbstractC80747i f126059a;

    /* renamed from: b */
    private OnUIPlayListener f126060b;

    static {
        Covode.recordClassIndex(64809);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f
    /* renamed from: a */
    public final Object mo91999a() {
        return this.f126059a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f
    /* renamed from: c */
    public final void mo92001c() {
        AbstractC80747i iVar = this.f126059a;
        if (iVar != null) {
            iVar.mo123913G();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f
    /* renamed from: d */
    public final void mo92002d() {
        AbstractC80747i iVar = this.f126059a;
        if (iVar != null) {
            iVar.mo123908B();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f
    /* renamed from: b */
    public final boolean mo92000b() {
        AbstractC80747i iVar = this.f126059a;
        if (iVar == null || !iVar.mo123892o()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f
    /* renamed from: e */
    public final void mo92003e() {
        AbstractC80747i iVar = this.f126059a;
        if (iVar != null) {
            iVar.mo123909C();
            this.f126059a = null;
        }
        this.f126060b = null;
    }
}
