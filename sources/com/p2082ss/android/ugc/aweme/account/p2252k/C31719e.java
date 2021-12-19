package com.p2082ss.android.ugc.aweme.account.p2252k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.p2252k.AbstractC31712a;

/* renamed from: com.ss.android.ugc.aweme.account.k.e */
public final class C31719e extends AbstractC31712a {

    /* renamed from: b */
    public String f75863b;

    /* renamed from: c */
    public String f75864c;

    /* renamed from: d */
    public String f75865d;

    /* renamed from: e */
    public String f75866e;

    static {
        Covode.recordClassIndex(38453);
    }

    public C31719e() {
        super("sign_in_response");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.account.p2252k.AbstractC31712a
    /* renamed from: b */
    public final void mo57685b() {
        mo57684a("is_success", this.f75863b, AbstractC31712a.AbstractC31713a.f75857a);
        mo57684a("platform", this.f75864c, AbstractC31712a.AbstractC31713a.f75857a);
        mo57684a("error_code", this.f75865d, AbstractC31712a.AbstractC31713a.f75857a);
        mo57684a("url_path", this.f75866e, AbstractC31712a.AbstractC31713a.f75857a);
    }
}
