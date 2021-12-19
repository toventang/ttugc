package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6366h;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.browser.jsbridge.p470a.C7035b;
import com.bytedance.android.livesdk.browser.p462c.C6966g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.p674b.AbstractC11613c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.as */
public final class C7100as extends AbstractC18337f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(7846);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, C18338g gVar) {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return null;
        }
        if (gVar.f43859a instanceof AbstractC11613c) {
            String optString = jSONObject2.optString("diamond");
            if (!TextUtils.isEmpty(optString)) {
                Bundle bundle = new Bundle();
                bundle.putString("KEY_REQUEST_PAGE", "h5");
                ((IWalletService) C6193a.m13435a(IWalletService.class)).getConsumeDialog(C11279p.m20001a(gVar.f43859a), bundle, jSONObject2, new IWalletService.AbstractC6245a() {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7100as.C71011 */

                    static {
                        Covode.recordClassIndex(7847);
                    }

                    @Override // com.bytedance.android.live.wallet.IWalletService.AbstractC6245a
                    /* renamed from: b */
                    public final void mo12251b(Dialog dialog, AbstractC6366h hVar) {
                    }

                    @Override // com.bytedance.android.live.wallet.IWalletService.AbstractC6245a
                    /* renamed from: a */
                    public final void mo12250a(Dialog dialog, AbstractC6366h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", "success");
                            jSONObject.put("code", "1");
                        } catch (Exception e) {
                            C3854a.m9458a("PackagePurchaseMethod", e);
                        }
                        C6966g.m14875b().mo13254a("H5_payStatus", jSONObject);
                    }
                }, optString).show();
            }
        } else {
            C7035b bVar = new C7035b(jSONObject2, jSONObject2.getString("diamond"));
            try {
                str = Uri.parse(gVar.f43860b).getQueryParameter("event_page");
            } catch (Exception e) {
                C3854a.m9458a("PackagePurchaseMethod", e);
                str = "";
            }
            bVar.f17638c = str;
            C6779a.m14563a().mo13053a(bVar);
        }
        return null;
    }
}
