package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.i */
public final /* synthetic */ class C40025i implements AbstractC88433f {

    /* renamed from: a */
    private final C39986a f94049a;

    /* renamed from: b */
    private final boolean f94050b;

    static {
        Covode.recordClassIndex(47791);
    }

    C40025i(C39986a aVar, boolean z) {
        this.f94049a = aVar;
        this.f94050b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C39986a aVar = this.f94049a;
        boolean z = this.f94050b;
        new C23144b(aVar.getParentFragment() instanceof C23226a ? aVar.getParentFragment() : aVar).mo37640e(R.string.bof).mo37637b();
        aVar.f93989h = !z;
        aVar.f93993l.mo70126a(new C40011aw(aVar));
    }
}
