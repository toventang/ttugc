package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.k */
public final class C7180k extends AbstractC18334e<JSONObject, Object> {

    /* renamed from: a */
    private Dialog f17875a;

    static {
        Covode.recordClassIndex(7926);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        Dialog dialog = this.f17875a;
        if (dialog != null && dialog.isShowing()) {
            this.f17875a.dismiss();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        if (TextUtils.equals(jSONObject2.optString(StringSet.type), "recharge")) {
            ChargeDeal chargeDeal = new ChargeDeal();
            Bundle bundle = new Bundle();
            if (optJSONObject != null) {
                bundle.putString("KEY_CHARGE_REASON", "");
                bundle.putString("KEY_REQUEST_PAGE", "");
                chargeDeal.f23072e = optJSONObject.optInt("diamond_count");
                chargeDeal.f23069b = optJSONObject.optInt("exchange_price");
                chargeDeal.f23070c = optJSONObject.optInt("price");
                chargeDeal.f23068a = (long) optJSONObject.optInt("id");
                chargeDeal.f23073f = optJSONObject.optInt("giving_count");
            }
            Dialog payDialog = ((IWalletService) C6193a.m13435a(IWalletService.class)).getPayDialog(gVar.f43859a, 0, bundle, chargeDeal);
            this.f17875a = payDialog;
            payDialog.show();
        }
        finishWithSuccess();
    }
}
