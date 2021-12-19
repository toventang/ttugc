package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import android.content.Context;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18368x;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.a */
public final class C7046a implements AbstractC18293d {

    /* renamed from: a */
    private final WeakReference<Context> f17652a;

    /* renamed from: b */
    private final WeakReference<C18368x> f17653b;

    /* renamed from: c */
    private String f17654c;

    /* renamed from: d */
    private IWalletService f17655d = ((IWalletService) C6193a.m13435a(IWalletService.class));

    static {
        Covode.recordClassIndex(7785);
    }

    public C7046a(WeakReference<Context> weakReference, C18368x xVar) {
        this.f17652a = weakReference;
        this.f17653b = new WeakReference<>(xVar);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (hVar != null && hVar.f43671d != null) {
            hVar.f43676i = false;
            this.f17654c = hVar.f43669b;
            hVar.f43671d.optJSONObject("args").optString("auth_info");
        }
    }
}
