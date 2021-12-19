package com.p2082ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.j */
public final class C60853j extends AbstractC60842b {
    static {
        Covode.recordClassIndex(71441);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60842b
    /* renamed from: d */
    public final void mo98494d() {
        int i;
        if ((this.f138261b == 1 || this.f138261b == 2) && this.f138262c != null) {
            if (this.f138260a == 1) {
                i = R.string.ah8;
            } else {
                i = R.string.a93;
            }
            new C79459a(this.f138262c).mo123050a(i).mo123053a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60853j(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }
}
