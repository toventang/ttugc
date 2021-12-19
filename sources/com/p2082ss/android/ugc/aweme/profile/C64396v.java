package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.v */
public final /* synthetic */ class C64396v implements AbstractC89172b {

    /* renamed from: a */
    private final C63810k f146003a;

    /* renamed from: b */
    private final boolean f146004b;

    static {
        Covode.recordClassIndex(75850);
    }

    C64396v(C63810k kVar, boolean z) {
        this.f146003a = kVar;
        this.f146004b = z;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C63810k kVar = this.f146003a;
        boolean z = this.f146004b;
        AbstractC64147a aVar = (AbstractC64147a) obj;
        aVar.mo67006a(z);
        if (!z) {
            return null;
        }
        aVar.mo67004a(new C63892t(kVar));
        return null;
    }
}
