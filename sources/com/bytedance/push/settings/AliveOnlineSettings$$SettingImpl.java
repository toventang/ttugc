package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.AbstractC21912i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class AliveOnlineSettings$$SettingImpl implements AliveOnlineSettings {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Object> f51837a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f51838b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private AbstractC21912i f51839c;

    /* renamed from: d */
    private final AbstractC21890c f51840d = new AbstractC21890c() {
        /* class com.bytedance.push.settings.AliveOnlineSettings$$SettingImpl.C218831 */

        static {
            Covode.recordClassIndex(25538);
        }

        @Override // com.bytedance.push.settings.AbstractC21890c
        /* renamed from: a */
        public final <T> T mo24752a(Class<T> cls) {
            if (cls == C21892e.class) {
                return (T) new C21892e();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25537);
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: a */
    public final void mo35567a() {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("allow_push_job_service", false);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: b */
    public final void mo35570b() {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("allow_push_daemon_monitor", false);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: c */
    public final void mo35571c() {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("is_close_alarm_wakeup", true);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: d */
    public final void mo35572d() {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("is_notify_service_stick", false);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            iVar.mo35650a(aVar);
        }
    }

    public AliveOnlineSettings$$SettingImpl(AbstractC21912i iVar) {
        this.f51839c = iVar;
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: a */
    public final void mo35568a(String str) {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putString("uninstall_question_url", str);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    /* renamed from: a */
    public final void mo35569a(boolean z) {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            a.putBoolean("allow_off_alive", z);
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        AbstractC21912i iVar;
        if (jSONObject != null && (iVar = this.f51839c) != null) {
            SharedPreferences.Editor a = iVar.mo35633a();
            if (jSONObject.has("ttpush_i18n_allow_off_alive")) {
                a.putBoolean("allow_off_alive", C21891d.m41115a(jSONObject, "ttpush_i18n_allow_off_alive"));
            }
            if (jSONObject.has("ttpush_uninstall_question_url")) {
                a.putString("uninstall_question_url", jSONObject.optString("ttpush_uninstall_question_url"));
            }
            if (jSONObject.has("ttpush_allow_push_job_service")) {
                a.putBoolean("allow_push_job_service", C21891d.m41115a(jSONObject, "ttpush_allow_push_job_service"));
            }
            if (jSONObject.has("ttpush_i18n_allow_push_daemon_monitor")) {
                a.putBoolean("allow_push_daemon_monitor", C21891d.m41115a(jSONObject, "ttpush_i18n_allow_push_daemon_monitor"));
            }
            if (jSONObject.has("ttpush_allow_close_boot_receiver")) {
                a.putBoolean("allow_close_boot_receiver", C21891d.m41115a(jSONObject, "ttpush_allow_close_boot_receiver"));
            }
            if (jSONObject.has("ttpush_is_close_alarm_wakeup")) {
                a.putBoolean("is_close_alarm_wakeup", C21891d.m41115a(jSONObject, "ttpush_is_close_alarm_wakeup"));
            }
            if (jSONObject.has("ttpush_use_start_foreground_notification")) {
                a.putBoolean("is_use_start_foreground_notification", C21891d.m41115a(jSONObject, "ttpush_use_start_foreground_notification"));
            }
            if (jSONObject.has("ttpush_job_schedule_wake_up_interval_second")) {
                a.putInt("job_schedule_wake_up_interval_second", jSONObject.optInt("ttpush_job_schedule_wake_up_interval_second"));
            }
            if (jSONObject.has("ttpush_is_use_c_native_process_keep_alive")) {
                a.putBoolean("is_use_c_native_process_keep_alive", C21891d.m41115a(jSONObject, "ttpush_is_use_c_native_process_keep_alive"));
            }
            if (jSONObject.has("ttpush_is_notify_service_stick")) {
                a.putBoolean("is_notify_service_stick", C21891d.m41115a(jSONObject, "ttpush_is_notify_service_stick"));
            }
            if (jSONObject.has("ttpush_key_is_miui_close_daemon")) {
                a.putBoolean("key_is_miui_close_daemon", C21891d.m41115a(jSONObject, "ttpush_key_is_miui_close_daemon"));
            }
            if (jSONObject.has("ttpush_alv_white_list")) {
                a.putString("ttpush_alv_white_list", jSONObject.optString("ttpush_alv_white_list"));
            }
            a.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar) {
        AbstractC21912i iVar = this.f51839c;
        if (iVar != null) {
            iVar.mo35649a(context, str, str2, aVar);
        }
    }
}
