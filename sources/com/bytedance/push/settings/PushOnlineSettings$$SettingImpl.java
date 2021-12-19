package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.AbstractC21912i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class PushOnlineSettings$$SettingImpl implements PushOnlineSettings {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Object> f51850a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f51851b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private AbstractC21912i f51852c;

    /* renamed from: d */
    private final AbstractC21890c f51853d = new AbstractC21890c() {
        /* class com.bytedance.push.settings.PushOnlineSettings$$SettingImpl.C218861 */

        static {
            Covode.recordClassIndex(25549);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25548);
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: b */
    public final long mo35603b() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("ttpush_update_sender_interval")) {
            return 10800000;
        }
        return this.f51852c.mo35653c("ttpush_update_sender_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: c */
    public final long mo35605c() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("ttpush_update_token_interval")) {
            return 86400000;
        }
        return this.f51852c.mo35653c("ttpush_update_token_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: d */
    public final boolean mo35606d() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("ttpush_enable_restrict_update_token")) {
            return false;
        }
        return this.f51852c.mo35655e("ttpush_enable_restrict_update_token");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: e */
    public final boolean mo35607e() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("ttpush_shut_push_on_stop_service")) {
            return false;
        }
        return this.f51852c.mo35655e("ttpush_shut_push_on_stop_service");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: f */
    public final boolean mo35608f() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("is_receiver_message_wakeup_screen")) {
            return false;
        }
        return this.f51852c.mo35655e("is_receiver_message_wakeup_screen");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: g */
    public final int mo35609g() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("receiver_message_wakeup_screen_time")) {
            return 5000;
        }
        return this.f51852c.mo35652b("receiver_message_wakeup_screen_time");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: h */
    public final long mo35610h() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("ttpush_upload_switch_interval")) {
            return 86400000;
        }
        return this.f51852c.mo35653c("ttpush_upload_switch_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: i */
    public final int mo35611i() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("ttpush_forbid_alias")) {
            return 0;
        }
        return this.f51852c.mo35652b("ttpush_forbid_alias");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: j */
    public final boolean mo35612j() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("need_control_miui_flares_v2")) {
            return true;
        }
        return this.f51852c.mo35655e("need_control_miui_flares_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: k */
    public final boolean mo35613k() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("remove_auto_boot_v2")) {
            return false;
        }
        return this.f51852c.mo35655e("remove_auto_boot_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: l */
    public final long mo35614l() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("frontier_update_setting_interval")) {
            return 10080;
        }
        return this.f51852c.mo35653c("frontier_update_setting_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: m */
    public final int mo35615m() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("frontier_strategy")) {
            return 0;
        }
        return this.f51852c.mo35652b("frontier_strategy");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: a */
    public final boolean mo35602a() {
        AbstractC21912i iVar = this.f51852c;
        if (iVar == null || !iVar.mo35656f("allow_settings_notify_enable")) {
            return true;
        }
        return this.f51852c.mo35655e("allow_settings_notify_enable");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51852c;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    public PushOnlineSettings$$SettingImpl(AbstractC21912i iVar) {
        this.f51852c = iVar;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: a */
    public final void mo35601a(boolean z) {
        AbstractC21912i iVar = this.f51852c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("allow_settings_notify_enable", z);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    /* renamed from: b */
    public final void mo35604b(boolean z) {
        AbstractC21912i iVar = this.f51852c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("ttpush_shut_push_on_stop_service", z);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        AbstractC21912i iVar;
        if (jSONObject != null && (iVar = this.f51852c) != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            if (jSONObject.has("ttpush_allow_settings_notify_enable")) {
                a.putBoolean("allow_settings_notify_enable", C21891d.m41115a(jSONObject, "ttpush_allow_settings_notify_enable"));
            }
            if (jSONObject.has("ttpush_update_sender_interval")) {
                a.putLong("ttpush_update_sender_interval", jSONObject.optLong("ttpush_update_sender_interval"));
            }
            if (jSONObject.has("ttpush_update_token_interval")) {
                a.putLong("ttpush_update_token_interval", jSONObject.optLong("ttpush_update_token_interval"));
            }
            if (jSONObject.has("ttpush_enable_restrict_update_token")) {
                a.putBoolean("ttpush_enable_restrict_update_token", C21891d.m41115a(jSONObject, "ttpush_enable_restrict_update_token"));
            }
            if (jSONObject.has("ttpush_shut_push_on_stop_service")) {
                a.putBoolean("ttpush_shut_push_on_stop_service", C21891d.m41115a(jSONObject, "ttpush_shut_push_on_stop_service"));
            }
            if (jSONObject.has("ttpush_is_receiver_message_wakeup_screen")) {
                a.putBoolean("is_receiver_message_wakeup_screen", C21891d.m41115a(jSONObject, "ttpush_is_receiver_message_wakeup_screen"));
            }
            if (jSONObject.has("ttpush_receiver_message_wakeup_screen_time")) {
                a.putInt("receiver_message_wakeup_screen_time", jSONObject.optInt("ttpush_receiver_message_wakeup_screen_time"));
            }
            if (jSONObject.has("ttpush_upload_switch_interval")) {
                a.putLong("ttpush_upload_switch_interval", jSONObject.optLong("ttpush_upload_switch_interval"));
            }
            if (jSONObject.has("ttpush_forbid_alias")) {
                a.putInt("ttpush_forbid_alias", jSONObject.optInt("ttpush_forbid_alias"));
            }
            if (jSONObject.has("need_control_miui_flares_v2")) {
                a.putBoolean("need_control_miui_flares_v2", C21891d.m41115a(jSONObject, "need_control_miui_flares_v2"));
            }
            if (jSONObject.has("remove_auto_boot_v2")) {
                a.putBoolean("remove_auto_boot_v2", C21891d.m41115a(jSONObject, "remove_auto_boot_v2"));
            }
            if (jSONObject.has("remove_umeng_autoboot")) {
                a.putBoolean("remove_umeng_autoboot", C21891d.m41115a(jSONObject, "remove_umeng_autoboot"));
            }
            if (jSONObject.has("frontier_update_setting_interval")) {
                a.putLong("frontier_update_setting_interval", jSONObject.optLong("frontier_update_setting_interval"));
            }
            if (jSONObject.has("frontier_strategy")) {
                a.putInt("frontier_strategy", jSONObject.optInt("frontier_strategy"));
            }
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51852c;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
