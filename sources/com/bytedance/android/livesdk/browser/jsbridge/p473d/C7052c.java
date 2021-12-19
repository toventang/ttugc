package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import android.content.Context;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.c */
public final class C7052c implements AbstractC18293d {

    /* renamed from: a */
    public final WeakReference<Context> f17660a;

    /* renamed from: b */
    private IWalletService f17661b = ((IWalletService) C6193a.m13435a(IWalletService.class));

    static {
        Covode.recordClassIndex(7791);
    }

    public C7052c(WeakReference<Context> weakReference) {
        this.f17660a = weakReference;
    }

    /* renamed from: a */
    private static int m15015a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            if (C6193a.m13435a(IWalletService.class) != null) {
                String optString = jSONObject.optString(StringSet.type);
                JSONObject optJSONObject = jSONObject.optJSONObject("args");
                if (optJSONObject != null) {
                    optJSONObject.optString("order_id");
                    optJSONObject.optString("channel_id");
                    optJSONObject.optString("product_id");
                    optJSONObject.optInt("real_count");
                    C3854a.m9459b("Unknown pay way: ".concat(String.valueOf(optString)));
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (hVar != null && hVar.f43671d != null) {
            jSONObject.put("code", m15015a(hVar.f43671d));
        }
    }
}
