package com.bytedance.globalpayment.payment.common.lib.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.AbstractC21887a;
import com.bytedance.push.settings.AbstractC21890c;
import com.bytedance.push.settings.C21889b;
import com.bytedance.push.settings.C21891d;
import com.bytedance.push.settings.storage.AbstractC21912i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class PaymentOnlineSettings$$SettingImpl implements PaymentOnlineSettings {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Object> f37295a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f37296b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private AbstractC21912i f37297c;

    /* renamed from: d */
    private final AbstractC21890c f37298d = new AbstractC21890c() {
        /* class com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings$$SettingImpl.C152851 */

        static {
            Covode.recordClassIndex(17489);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            if (cls == C15286a.class) {
                return (T) new C15286a();
            }
            if (cls == C15286a.class) {
                return (T) new C15286a();
            }
            if (cls == C15286a.class) {
                return (T) new C15286a();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(17488);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    /* renamed from: a */
    public final JSONObject mo24753a() {
        AbstractC21912i iVar = this.f37297c;
        if (iVar == null || !iVar.mo35656f("restore_settings")) {
            return null;
        }
        String a = this.f37297c.mo35647a("restore_settings");
        C21889b.m41112a(C15286a.class, this.f37298d);
        return C15286a.m28180a(a);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    /* renamed from: b */
    public final boolean mo24754b() {
        AbstractC21912i iVar = this.f37297c;
        if (iVar == null || !iVar.mo35656f("pipo_process_settings")) {
            return true;
        }
        return this.f37297c.mo35655e("pipo_process_settings");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    /* renamed from: c */
    public final long mo24755c() {
        AbstractC21912i iVar = this.f37297c;
        if (iVar == null || !iVar.mo35656f("payment_settings_request_interval")) {
            return 10800000;
        }
        return this.f37297c.mo35653c("payment_settings_request_interval");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    /* renamed from: d */
    public final long mo24756d() {
        AbstractC21912i iVar = this.f37297c;
        if (iVar == null || !iVar.mo35656f("auto_ack_after_upload_token_in_ms")) {
            return 120000;
        }
        return this.f37297c.mo35653c("auto_ack_after_upload_token_in_ms");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    /* renamed from: e */
    public final boolean mo24757e() {
        AbstractC21912i iVar = this.f37297c;
        if (iVar == null || !iVar.mo35656f("need_ack_after_success_query")) {
            return false;
        }
        return this.f37297c.mo35655e("need_ack_after_success_query");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f37297c;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    public PaymentOnlineSettings$$SettingImpl(AbstractC21912i iVar) {
        this.f37297c = iVar;
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        AbstractC21912i iVar;
        if (jSONObject != null && (iVar = this.f37297c) != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            if (jSONObject.has("restore_settings")) {
                a.putString("restore_settings", jSONObject.optString("restore_settings"));
            }
            if (jSONObject.has("pipo_process_settings")) {
                a.putBoolean("pipo_process_settings", C21891d.m41115a(jSONObject, "pipo_process_settings"));
            }
            if (jSONObject.has("payment_settings_request_interval")) {
                a.putLong("payment_settings_request_interval", jSONObject.optLong("payment_settings_request_interval"));
            }
            if (jSONObject.has("gecko_config")) {
                a.putString("gecko_config", jSONObject.optString("gecko_config"));
            }
            if (jSONObject.has("webview_config")) {
                a.putString("webview_config", jSONObject.optString("webview_config"));
            }
            if (jSONObject.has("auto_ack_after_upload_token_in_ms")) {
                a.putLong("auto_ack_after_upload_token_in_ms", jSONObject.optLong("auto_ack_after_upload_token_in_ms"));
            }
            if (jSONObject.has("need_ack_after_success_query")) {
                a.putBoolean("need_ack_after_success_query", C21891d.m41115a(jSONObject, "need_ack_after_success_query"));
            }
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f37297c;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
