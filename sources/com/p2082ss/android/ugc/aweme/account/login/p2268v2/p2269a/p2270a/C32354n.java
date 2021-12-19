package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.n */
public final class C32354n extends AbstractC32581c {

    /* renamed from: b */
    public final JSONObject f77167b;

    static {
        Covode.recordClassIndex(39122);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        if (this.f77167b == null) {
            return false;
        }
        C32355o.f77168a = new WeakReference<>(this.f77733a);
        String optString = this.f77167b.optString("webapp_url");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        SmartRouter.buildRoute(this.f77733a.getActivity(), optString).open();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32354n(AbstractC32572b bVar, JSONObject jSONObject) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f77167b = jSONObject;
    }
}
