package com.p2082ss.android.sdk.webview.p2175a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.d */
public final class C30238d implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f72150a;

    static {
        Covode.recordClassIndex(36749);
    }

    public C30238d(WeakReference<Context> weakReference) {
        this.f72150a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        jSONObject.put("code", 0);
    }
}
