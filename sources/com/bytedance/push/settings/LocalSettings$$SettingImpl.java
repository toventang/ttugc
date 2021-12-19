package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.AbstractC21912i;

public class LocalSettings$$SettingImpl implements LocalSettings {

    /* renamed from: a */
    private Context f51846a;

    /* renamed from: b */
    private AbstractC21912i f51847b;

    /* renamed from: c */
    private final AbstractC21890c f51848c = new AbstractC21890c() {
        /* class com.bytedance.push.settings.LocalSettings$$SettingImpl.C218851 */

        static {
            Covode.recordClassIndex(25546);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25545);
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public final String mo35595a() {
        AbstractC21912i iVar = this.f51847b;
        if (iVar == null || !iVar.mo35656f("push_daemon_monitor_result")) {
            return "";
        }
        return this.f51847b.mo35647a("push_daemon_monitor_result");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: b */
    public final String mo35598b() {
        AbstractC21912i iVar = this.f51847b;
        if (iVar == null || !iVar.mo35656f("push_channels_json_array")) {
            return "";
        }
        return this.f51847b.mo35647a("push_channels_json_array");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: c */
    public final boolean mo35600c() {
        AbstractC21912i iVar = this.f51847b;
        if (iVar == null || !iVar.mo35656f("push_notify_enable")) {
            return true;
        }
        return this.f51847b.mo35655e("push_notify_enable");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51847b;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public final void mo35596a(String str) {
        AbstractC21912i iVar = this.f51847b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("push_daemon_monitor_result", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: b */
    public final void mo35599b(String str) {
        AbstractC21912i iVar = this.f51847b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("push_channels_json_array", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    /* renamed from: a */
    public final void mo35597a(boolean z) {
        AbstractC21912i iVar = this.f51847b;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("allow_network", z);
            a.apply();
        }
    }

    public LocalSettings$$SettingImpl(Context context, AbstractC21912i iVar) {
        this.f51846a = context;
        this.f51847b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51847b;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
