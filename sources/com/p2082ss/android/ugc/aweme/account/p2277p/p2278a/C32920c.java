package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32355o;
import com.p2082ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.c */
public final class C32920c implements AbstractC18293d {

    /* renamed from: a */
    public final WeakReference<Context> f78329a;

    /* renamed from: b */
    public final C18288a f78330b;

    static {
        Covode.recordClassIndex(39708);
    }

    public C32920c(WeakReference<Context> weakReference, C18288a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        this.f78329a = weakReference;
        this.f78330b = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        AbstractC32572b bVar;
        ActivityC0945e activity;
        AuthorizeActivity authorizeActivity;
        WeakReference<AuthorizeActivity> weakReference = C32355o.f77169b;
        if (!(weakReference == null || (authorizeActivity = weakReference.get()) == null)) {
            authorizeActivity.mo57805g();
        }
        AccountRetrofitInetcept.m67474a("");
        WeakReference<AbstractC32572b> weakReference2 = C32355o.f77168a;
        if (!(weakReference2 == null || (bVar = weakReference2.get()) == null || (activity = bVar.getActivity()) == null)) {
            activity.finish();
        }
        C32355o.f77168a = null;
        C32355o.f77169b = null;
    }
}
