package com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.p2082ss.android.p2092ad.splash.AbstractC29637f;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.b */
public final /* synthetic */ class C17953b implements AbstractC29637f {

    /* renamed from: a */
    static final AbstractC29637f f42772a = new C17953b();

    static {
        Covode.recordClassIndex(20569);
    }

    private C17953b() {
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29637f
    /* renamed from: a */
    public final boolean mo28700a(AbstractC29383a aVar) {
        if (C17957a.m33426a().mo28636f()) {
            C17957a.m33426a().mo28620a("Child mode does not show ads");
            return false;
        } else if (!aVar.mo51368C() || !C17957a.m33426a().mo28637g()) {
            return true;
        } else {
            C17957a.m33426a().mo28620a("Personalized display off, no ads");
            return false;
        }
    }
}
