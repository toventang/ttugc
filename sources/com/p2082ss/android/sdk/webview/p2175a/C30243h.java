package com.p2082ss.android.sdk.webview.p2175a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.h */
public final class C30243h implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f72159a;

    static {
        Covode.recordClassIndex(36754);
    }

    public C30243h(WeakReference<Context> weakReference) {
        this.f72159a = weakReference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r6 != null) goto L_0x0053;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m61210a(org.json.JSONObject r9) {
        /*
            r8 = this;
            r6 = 0
            if (r9 == 0) goto L_0x005a
            java.lang.String r0 = "pkg_name"
            java.lang.String r5 = r9.optString(r0)
            java.lang.String r0 = "pkg_class"
            java.lang.String r7 = r9.optString(r0)
        L_0x000f:
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.f72159a
            android.content.Context r4 = com.p2082ss.android.sdk.webview.C30246d.m61214a(r0)
            r3 = 0
            if (r4 == 0) goto L_0x001e
            boolean r0 = com.bytedance.common.utility.C13627m.m24498a(r5)
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            return r3
        L_0x001f:
            java.lang.String r0 = r4.getPackageName()
            boolean r2 = r5.equals(r0)
            boolean r0 = com.bytedance.common.utility.C13627m.m24498a(r7)
            if (r0 != 0) goto L_0x0045
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r5, r7)
            r1.setComponent(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            boolean r0 = com.p2082ss.android.common.util.C29843f.m60130a(r4, r1)
            if (r0 != 0) goto L_0x004b
        L_0x0045:
            r0 = 1
            if (r6 != 0) goto L_0x0053
            if (r2 == 0) goto L_0x004d
            return r0
        L_0x004b:
            r6 = r1
            goto L_0x0045
        L_0x004d:
            android.content.Intent r6 = com.p2082ss.android.common.util.C29843f.m60127a(r4, r5)
            if (r6 == 0) goto L_0x001e
        L_0x0053:
            com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a.m145093a(r6, r4)     // Catch:{ Exception -> 0x001e }
            r4.startActivity(r6)     // Catch:{ Exception -> 0x001e }
            goto L_0x005d
        L_0x005a:
            r5 = r6
            r7 = r6
            goto L_0x000f
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.webview.p2175a.C30243h.m61210a(org.json.JSONObject):boolean");
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (m61210a(hVar.f43671d)) {
            jSONObject.put("code", 1);
        } else {
            jSONObject.put("code", 0);
        }
    }
}
