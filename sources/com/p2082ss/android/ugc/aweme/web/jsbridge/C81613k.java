package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.sdk.webview.C30246d;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59303b;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3444a.C59311a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.k */
public final class C81613k implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f182508a;

    static {
        Covode.recordClassIndex(95010);
    }

    public C81613k(WeakReference<Context> weakReference) {
        this.f182508a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if ((C30246d.m61213a(this.f182508a.get()) instanceof CrossPlatformActivity) && hVar.f43671d != null) {
            int optInt = hVar.f43671d.optInt("status");
            String optString = jSONObject.optString("msg");
            C59311a.C59312a aVar = new C59311a.C59312a();
            aVar.f135524b = optInt;
            aVar.f135523a = "game_pay";
            aVar.f135525c = optString;
            C59303b.m109000a().f135514b = aVar.mo96909a();
        }
    }
}
