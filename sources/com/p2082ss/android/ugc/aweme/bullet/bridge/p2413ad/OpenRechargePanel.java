package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.p701n.C11840a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel */
public final class OpenRechargePanel extends BaseBridgeMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(42051);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "openRechargePanel";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenRechargePanel(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel$a */
    public static final class C34989a implements AbstractC11635b {

        /* renamed from: a */
        final /* synthetic */ OpenRechargePanel f82543a;

        /* renamed from: b */
        final /* synthetic */ int f82544b;

        /* renamed from: c */
        final /* synthetic */ Map f82545c;

        static {
            Covode.recordClassIndex(42052);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18419a(long j) {
            if (this.f82544b == 5) {
                OpenRechargePanel openRechargePanel = this.f82543a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                openRechargePanel.mo61865a("coinsRechargeStatus", jSONObject);
                return;
            }
            this.f82545c.put("code", "1");
            C18494b.m34415a(new C18484a("coinsRechargeStatus", SystemClock.currentThreadTimeMillis(), C18822b.m34925a(this.f82545c)));
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18420a(Exception exc, String str) {
            C89219l.m154721d(exc, "");
            C89219l.m154721d(str, "");
            if (this.f82544b == 5) {
                OpenRechargePanel openRechargePanel = this.f82543a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error_code", 10001);
                jSONObject.put("args", jSONObject2);
                openRechargePanel.mo61865a("coinsRechargeStatus", jSONObject);
                return;
            }
            this.f82545c.put("code", "0");
            this.f82545c.put("error_code", 10001);
            C18494b.m34415a(new C18484a("coinsRechargeStatus", SystemClock.currentThreadTimeMillis(), C18822b.m34925a(this.f82545c)));
        }

        C34989a(OpenRechargePanel openRechargePanel, int i, Map map) {
            this.f82543a = openRechargePanel;
            this.f82544b = i;
            this.f82545c = map;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18418a(int i, int i2, String str) {
            C89219l.m154721d(str, "");
            if (this.f82544b != 5) {
                return;
            }
            if (i == 1) {
                Integer num = null;
                C12290b.m22060a("promote_iap_charge_show", 0, (JSONObject) null);
                C33744d dVar = new C33744d();
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a = C33113b.m67826a();
                if (a != null) {
                    num = Integer.valueOf(a.mo58967n());
                }
                C39162r.m79460a("promote_iap_recharge_panel_show", dVar.mo59982a("user_account_type", num).f79943a);
            } else if (i == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_status_code ", i2);
                jSONObject.put("error_message", str);
                C12290b.m22060a("promote_iap_charge_show", 1, jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Bundle bundle = new Bundle();
        int optInt = jSONObject.optInt("key_bundle_charge_source", 0);
        long optLong = jSONObject.optLong("diamond_count", 0);
        long optLong2 = jSONObject.optLong("total_diamond_acount_needed", 0);
        String optString = jSONObject.optString("charge_reason");
        JSONObject optJSONObject = jSONObject.optJSONObject("track_info");
        bundle.putInt("key_bundle_charge_source", optInt);
        bundle.putLong("key_bundle_need_coins", optLong);
        bundle.putLong("key_bundle_total_coins", optLong2);
        bundle.putString("KEY_CHARGE_REASON", optString);
        Context e = mo26893e();
        if (e instanceof ActivityC0945e) {
            C11637d dVar = new C11637d();
            dVar.mo18421a(C11840a.C11841a.m20842a(optJSONObject));
            HashMap hashMap = new HashMap();
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            ActivityC0945e eVar = (ActivityC0945e) e;
            s.mo95830d().mo12973a(eVar, new C34989a(this, optInt, hashMap), bundle, dVar).showNow(eVar.getSupportFragmentManager(), getClass().getSimpleName());
            aVar.mo61872a((Object) null);
        }
    }
}
