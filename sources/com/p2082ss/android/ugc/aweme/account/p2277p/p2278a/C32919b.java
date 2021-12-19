package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22298d;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.bytedance.sdk.p1625a.p1643f.C22375e;
import com.p2082ss.android.account.C29346c;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32334a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32355o;
import com.p2082ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.p2082ss.android.ugc.aweme.account.util.C33047p;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.service.IRegionMockService;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.b */
public final class C32919b implements AbstractC18293d {

    /* renamed from: a */
    public final WeakReference<Context> f78327a;

    /* renamed from: b */
    public final C18288a f78328b;

    static {
        Covode.recordClassIndex(39707);
    }

    public C32919b(WeakReference<Context> weakReference, C18288a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        this.f78327a = weakReference;
        this.f78328b = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        AbstractC32572b bVar;
        AuthorizeActivity authorizeActivity;
        C89219l.m154721d(hVar, "");
        if (hVar.f43671d != null) {
            AccountRetrofitInetcept.m67474a("");
            C29346c a = C29346c.C29347a.m58778a(hVar.f43671d);
            WeakReference<AbstractC32572b> weakReference = C32355o.f77168a;
            if (weakReference != null) {
                bVar = weakReference.get();
            } else {
                bVar = null;
            }
            C22375e.m42171a(this.f78327a.get()).mo36615a(a);
            C22375e.m42171a(this.f78327a.get()).mo36626e();
            C22374d.m42169a(this.f78327a.get()).mo36635a("wap_login", (AbstractC22298d) null);
            if (bVar != null) {
                EnumC32592i A = bVar.mo58458A();
                EnumC32594j Z_ = bVar.mo58460Z_();
                C89219l.m154716b(a, "");
                C32334a.m66709a(bVar, A, Z_, a);
            } else {
                Context context = this.f78327a.get();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                JSONObject jSONObject2 = hVar.f43671d;
                C89219l.m154716b(a, "");
                C89219l.m154721d(activity, "");
                C89219l.m154721d(a, "");
                C36085cj.m73542a(a);
                AccountRetrofitInetcept.m67474a("");
                Bundle bundle = new Bundle();
                if (C36085cj.m73547a()) {
                    bundle.putBoolean("only_login", true);
                }
                C31604d.m65915a(bundle, activity, new C32334a.C32335a(activity, jSONObject2));
                if (C33047p.m67683a()) {
                    ServiceManager.get().getService(IRegionMockService.class);
                }
            }
            WeakReference<AuthorizeActivity> weakReference2 = C32355o.f77169b;
            if (!(weakReference2 == null || (authorizeActivity = weakReference2.get()) == null)) {
                authorizeActivity.mo57801b(a);
            }
            C32355o.f77169b = null;
            C32355o.f77168a = null;
        }
    }
}
