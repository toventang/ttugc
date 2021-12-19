package com.bytedance.push.frontier.setting;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.AbstractC21887a;
import com.bytedance.push.settings.AbstractC21890c;
import com.bytedance.push.settings.C21889b;
import com.bytedance.push.settings.storage.AbstractC21912i;

public class FrontierLocalSetting$$SettingImpl implements FrontierLocalSetting {

    /* renamed from: a */
    private Context f51699a;

    /* renamed from: b */
    private AbstractC21912i f51700b;

    /* renamed from: c */
    private final AbstractC21890c f51701c = new AbstractC21890c() {
        /* class com.bytedance.push.frontier.setting.FrontierLocalSetting$$SettingImpl.C218141 */

        static {
            Covode.recordClassIndex(25466);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            if (cls == C21816b.class) {
                return (T) new C21816b();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25465);
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    /* renamed from: a */
    public final long mo35497a() {
        AbstractC21912i iVar = this.f51700b;
        if (iVar == null || !iVar.mo35656f("last_request_setting_time_mil")) {
            return 0;
        }
        return this.f51700b.mo35653c("last_request_setting_time_mil");
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    /* renamed from: b */
    public final C21815a mo35500b() {
        AbstractC21912i iVar = this.f51700b;
        if (iVar == null || !iVar.mo35656f("frontier_setting")) {
            C21889b.m41112a(C21816b.class, this.f51701c);
            return new C21815a();
        }
        String a = this.f51700b.mo35647a("frontier_setting");
        C21889b.m41112a(C21816b.class, this.f51701c);
        return C21816b.m40865a(a);
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51700b;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    /* renamed from: a */
    public final void mo35498a(long j) {
        AbstractC21912i iVar = this.f51700b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putLong("last_request_setting_time_mil", j);
            a.apply();
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    /* renamed from: a */
    public final void mo35499a(C21815a aVar) {
        AbstractC21912i iVar = this.f51700b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            C21889b.m41112a(C21816b.class, this.f51701c);
            a.putString("frontier_setting", aVar.mo35501a().toString());
            a.apply();
        }
    }

    public FrontierLocalSetting$$SettingImpl(Context context, AbstractC21912i iVar) {
        this.f51699a = context;
        this.f51700b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51700b;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
