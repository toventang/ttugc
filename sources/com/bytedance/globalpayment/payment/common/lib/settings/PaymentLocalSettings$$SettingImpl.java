package com.bytedance.globalpayment.payment.common.lib.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.AbstractC21887a;
import com.bytedance.push.settings.AbstractC21890c;
import com.bytedance.push.settings.storage.AbstractC21912i;

public class PaymentLocalSettings$$SettingImpl implements PaymentLocalSettings {

    /* renamed from: a */
    private Context f37291a;

    /* renamed from: b */
    private AbstractC21912i f37292b;

    /* renamed from: c */
    private final AbstractC21890c f37293c = new AbstractC21890c() {
        /* class com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings$$SettingImpl.C152841 */

        static {
            Covode.recordClassIndex(17486);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            return null;
        }
    };

    static {
        Covode.recordClassIndex(17485);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    /* renamed from: a */
    public final String mo24746a() {
        AbstractC21912i iVar = this.f37292b;
        if (iVar == null || !iVar.mo35656f("need_restore_orders")) {
            return "";
        }
        return this.f37292b.mo35647a("need_restore_orders");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    /* renamed from: b */
    public final long mo24749b() {
        AbstractC21912i iVar = this.f37292b;
        if (iVar == null || !iVar.mo35656f("last_settings_request_time")) {
            return 0;
        }
        return this.f37292b.mo35653c("last_settings_request_time");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f37292b;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    /* renamed from: a */
    public final void mo24747a(long j) {
        AbstractC21912i iVar = this.f37292b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putLong("last_settings_request_time", j);
            a.apply();
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    /* renamed from: a */
    public final void mo24748a(String str) {
        AbstractC21912i iVar = this.f37292b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("need_restore_orders", str);
            a.apply();
        }
    }

    public PaymentLocalSettings$$SettingImpl(Context context, AbstractC21912i iVar) {
        this.f37291a = context;
        this.f37292b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f37292b;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
