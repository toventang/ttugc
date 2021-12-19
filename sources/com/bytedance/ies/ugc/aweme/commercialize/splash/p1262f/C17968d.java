package com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17966c;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.f.d */
final /* synthetic */ class C17968d implements C17966c.AbstractC17967a {

    /* renamed from: a */
    private final Long f42792a;

    /* renamed from: b */
    private final String f42793b;

    static {
        Covode.recordClassIndex(20586);
    }

    C17968d(Long l, String str) {
        this.f42792a = l;
        this.f42793b = str;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17966c.AbstractC17967a
    /* renamed from: a */
    public final void mo28729a(boolean z) {
        Long l = this.f42792a;
        String str = this.f42793b;
        if (z) {
            C18129a.m33747a("splash_ad", "deeplink_success", l.toString(), str, null).mo28901b();
        } else {
            C18129a.m33747a("splash_ad", "deeplink_failed", l.toString(), str, null).mo28901b();
        }
    }
}
