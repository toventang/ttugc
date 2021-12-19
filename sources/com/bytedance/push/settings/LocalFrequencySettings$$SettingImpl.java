package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1593f.C21804c;
import com.bytedance.push.settings.storage.AbstractC21912i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class LocalFrequencySettings$$SettingImpl implements LocalFrequencySettings {

    /* renamed from: a */
    private Context f51842a;

    /* renamed from: b */
    private AbstractC21912i f51843b;

    /* renamed from: c */
    private final AbstractC21890c f51844c = new AbstractC21890c() {
        /* class com.bytedance.push.settings.LocalFrequencySettings$$SettingImpl.C218841 */

        static {
            Covode.recordClassIndex(25543);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            if (cls == C21897j.class) {
                return (T) new C21897j();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25542);
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public final long mo35573a() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_update_sender_time_mil")) {
            return 0;
        }
        return this.f51843b.mo35653c("last_update_sender_time_mil");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public final String mo35579b() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_update_sender_did")) {
            return "";
        }
        return this.f51843b.mo35647a("last_update_sender_did");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: c */
    public final String mo35582c() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_update_sender_vc")) {
            return "";
        }
        return this.f51843b.mo35647a("last_update_sender_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: d */
    public final String mo35584d() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_update_sender_gray_vc")) {
            return "";
        }
        return this.f51843b.mo35647a("last_update_sender_gray_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: e */
    public final String mo35586e() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_update_sender_channel")) {
            return "";
        }
        return this.f51843b.mo35647a("last_update_sender_channel");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: f */
    public final String mo35588f() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_update_sender_supported")) {
            return "";
        }
        return this.f51843b.mo35647a("last_update_sender_supported");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: g */
    public final boolean mo35590g() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_send_switcher_stat")) {
            return false;
        }
        return this.f51843b.mo35655e("last_send_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: h */
    public final int mo35591h() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("sys_switcher_stat")) {
            return -2;
        }
        return this.f51843b.mo35652b("sys_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: i */
    public final String mo35592i() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("notify_channel_stat")) {
            return "";
        }
        return this.f51843b.mo35647a("notify_channel_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: k */
    public final long mo35594k() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("last_upload_switch_ts")) {
            return 0;
        }
        return this.f51843b.mo35653c("last_upload_switch_ts");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: j */
    public final List<C21804c> mo35593j() {
        AbstractC21912i iVar = this.f51843b;
        if (iVar == null || !iVar.mo35656f("token_cache")) {
            C21889b.m41112a(C21897j.class, this.f51844c);
            return new ArrayList();
        }
        String a = this.f51843b.mo35647a("token_cache");
        C21889b.m41112a(C21897j.class, this.f51844c);
        return C21897j.m41122a(a);
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public final void mo35574a(int i) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putInt("sys_switcher_stat", i);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public final void mo35580b(long j) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putLong("last_upload_switch_ts", j);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: c */
    public final void mo35583c(String str) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("last_update_sender_gray_vc", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: d */
    public final void mo35585d(String str) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("last_update_sender_channel", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: e */
    public final void mo35587e(String str) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("last_update_sender_supported", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: f */
    public final void mo35589f(String str) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("notify_channel_stat", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public final void mo35575a(long j) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putLong("last_update_sender_time_mil", j);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: b */
    public final void mo35581b(String str) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("last_update_sender_vc", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public final void mo35576a(String str) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("last_update_sender_did", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public final void mo35577a(List<C21804c> list) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            C21889b.m41112a(C21897j.class, this.f51844c);
            JSONArray jSONArray = new JSONArray();
            for (C21804c cVar : list) {
                if (cVar != null) {
                    jSONArray.put(cVar.mo35484a());
                }
            }
            a.putString("token_cache", jSONArray.toString());
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /* renamed from: a */
    public final void mo35578a(boolean z) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("last_send_switcher_stat", z);
            a.apply();
        }
    }

    public LocalFrequencySettings$$SettingImpl(Context context, AbstractC21912i iVar) {
        this.f51842a = context;
        this.f51843b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51843b;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
