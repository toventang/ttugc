package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.d */
public final class C32921d implements AbstractC18293d {

    /* renamed from: a */
    public final WeakReference<Context> f78331a;

    /* renamed from: b */
    public final C18288a f78332b;

    static {
        Covode.recordClassIndex(39709);
    }

    public C32921d(WeakReference<Context> weakReference, C18288a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        this.f78331a = weakReference;
        this.f78332b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.p1285a.C18297h r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.f78331a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r4 = "interstitial_token"
            if (r6 == 0) goto L_0x0051
            org.json.JSONObject r0 = r6.f43671d
            if (r0 == 0) goto L_0x0051
            java.lang.String r3 = r0.optString(r4)
            if (r3 != 0) goto L_0x004f
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            com.p2082ss.android.ugc.aweme.account.network.AccountRetrofitInetcept.m67474a(r0)
            android.content.Intent r2 = new android.content.Intent
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.f78331a
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity> r0 = com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity.class
            r2.<init>(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "mandatory_page"
            r2.putExtra(r1, r0)
            r1 = 1
            java.lang.String r0 = "is_from_un_login_user"
            r2.putExtra(r0, r1)
            r2.putExtra(r4, r3)
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.f78331a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0046
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0046:
            android.content.Context r0 = (android.content.Context) r0
            com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a.m145093a(r2, r0)
            r0.startActivity(r2)
            return
        L_0x004f:
            r0 = r3
            goto L_0x0019
        L_0x0051:
            r3 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32921d.call(com.bytedance.ies.web.a.h, org.json.JSONObject):void");
    }
}
