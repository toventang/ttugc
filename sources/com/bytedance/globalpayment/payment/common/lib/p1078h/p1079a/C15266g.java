package com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15238d;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g;
import com.bytedance.globalpayment.payment.common.lib.p1081i.RunnableC15277a;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.push.settings.C21895h;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.g */
public final class C15266g implements AbstractC15275g {

    /* renamed from: a */
    private AtomicBoolean f37278a = new AtomicBoolean(false);

    /* renamed from: b */
    private Set<AbstractC15238d> f37279b;

    static {
        Covode.recordClassIndex(17466);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15238d
    /* renamed from: a */
    public final void mo24696a() {
        Set<AbstractC15238d> set = this.f37279b;
        if (set != null) {
            for (AbstractC15238d dVar : set) {
                dVar.mo24696a();
            }
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: b */
    public final PaymentOnlineSettings mo24735b() {
        return (PaymentOnlineSettings) C21895h.m41120a(C15253a.m28071a().mo24709i().mo24713b(), PaymentOnlineSettings.class);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: c */
    public final PaymentLocalSettings mo24736c() {
        return (PaymentLocalSettings) C21895h.m41120a(C15253a.m28071a().mo24709i().mo24713b(), PaymentLocalSettings.class);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: d */
    public final boolean mo24737d() {
        JSONObject a = mo24735b().mo24753a();
        if (a != null) {
            return a.optBoolean("use_new_restore_order", true);
        }
        return true;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: e */
    public final long mo24738e() {
        JSONObject a = mo24735b().mo24753a();
        if (a != null) {
            return a.optLong("try_to_start_restore_task_delay", InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: f */
    public final long mo24739f() {
        JSONObject a = mo24735b().mo24753a();
        if (a != null) {
            return a.optLong("try_to_start_restore_task_delay", 5000);
        }
        return 5000;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: g */
    public final long mo24740g() {
        JSONObject a = mo24735b().mo24753a();
        if (a != null) {
            return a.optLong("restore_order_task_delay", 0);
        }
        return 0;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: h */
    public final boolean mo24741h() {
        JSONObject a = mo24735b().mo24753a();
        if (a != null) {
            return a.optBoolean("use_new_logic_on_purchase_ok", false);
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: i */
    public final long mo24742i() {
        JSONObject a = mo24735b().mo24753a();
        if (a != null) {
            return a.optLong("max_restore_order_time", 259200000);
        }
        return 259200000;
    }

    public C15266g() {
        String str = C15253a.m28071a().mo24709i().mo24714c().f37173e;
        if (!TextUtils.isEmpty(str) && this.f37278a.compareAndSet(false, true)) {
            C15253a.m28071a().mo24703c().mo24721b().execute(new RunnableC15277a(str, this));
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g
    /* renamed from: a */
    public final void mo24734a(JSONObject jSONObject) {
        if (jSONObject != null) {
            final Context b = C15253a.m28071a().mo24709i().mo24713b();
            final JSONObject optJSONObject = jSONObject.optJSONObject("sdk_key_pipo_pay");
            if (optJSONObject != null) {
                RunnableC152671 r2 = new Runnable() {
                    /* class com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15266g.RunnableC152671 */

                    static {
                        Covode.recordClassIndex(17467);
                    }

                    public final void run() {
                        ((PaymentOnlineSettings) C21895h.m41120a(b, PaymentOnlineSettings.class)).updateSettings(b, optJSONObject);
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    RunnableC13596e.m24423a(r2);
                } else {
                    r2.run();
                }
            }
        }
    }
}
