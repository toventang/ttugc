package com.p2082ss.android.sdk.webview.p2175a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.sdk.webview.C30246d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.c */
public final class C30237c implements AbstractC18293d {

    /* renamed from: a */
    private WeakReference<Context> f72149a;

    static {
        Covode.recordClassIndex(36748);
    }

    public C30237c(WeakReference<Context> weakReference) {
        this.f72149a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = hVar.f43671d;
        int i = -1;
        if (jSONObject2 == null) {
            jSONObject.put("installed", -1);
            return;
        }
        String optString = jSONObject2.optString("pkg_name");
        String optString2 = jSONObject2.optString("open_url");
        Context a = C30246d.m61214a(this.f72149a);
        if (a != null) {
            if (!TextUtils.isEmpty(optString)) {
                if (C29843f.m60133b(a, optString)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (!TextUtils.isEmpty(optString2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString2));
                if (C29843f.m60130a(a, intent)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
        }
        jSONObject.put("installed", i);
    }
}
