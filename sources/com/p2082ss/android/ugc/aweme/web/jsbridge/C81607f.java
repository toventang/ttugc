package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.sdk.webview.p2175a.C30242g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.f */
public final class C81607f extends C30242g {

    /* renamed from: b */
    private C18288a f182495b;

    static {
        Covode.recordClassIndex(95004);
    }

    public C81607f(C18288a aVar, WeakReference<Context> weakReference) {
        super(weakReference);
        this.f182495b = aVar;
    }

    @Override // com.p2082ss.android.sdk.webview.p2175a.C30242g, com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        String string = hVar.f43671d.getString(StringSet.type);
        hVar.f43670c = "open";
        hVar.f43671d.put(StringSet.type, string);
        hVar.f43676i = false;
        mo53694a(hVar.f43671d);
    }
}
