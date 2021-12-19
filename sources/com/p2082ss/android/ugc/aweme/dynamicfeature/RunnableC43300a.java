package com.p2082ss.android.ugc.aweme.dynamicfeature;

import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.C27031d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.a */
final /* synthetic */ class RunnableC43300a implements Runnable {

    /* renamed from: a */
    private final LivePluginInitTask f101070a;

    static {
        Covode.recordClassIndex(51509);
    }

    RunnableC43300a(LivePluginInitTask livePluginInitTask) {
        this.f101070a = livePluginInitTask;
    }

    public final void run() {
        int i;
        LivePluginInitTask livePluginInitTask = this.f101070a;
        if (livePluginInitTask.f101068c != null) {
            if (livePluginInitTask.f101066a == null) {
                livePluginInitTask.f101066a = C34822d.m71158a(livePluginInitTask.f101068c, "google_play_plugin_status", 0);
            }
            if (livePluginInitTask.f101067b == null) {
                livePluginInitTask.f101067b = C27031d.m53717a(livePluginInitTask.f101068c);
            }
            Set<String> b = livePluginInitTask.f101067b.mo44709b();
            for (String str : livePluginInitTask.f101069d) {
                boolean contains = b.contains(str);
                String string = livePluginInitTask.f101066a.getString(str, "");
                if (contains) {
                    i = 3;
                    if (TextUtils.equals("stage_installed", string)) {
                        i = 1;
                    } else if (TextUtils.equals("stage_start_install", string)) {
                        i = 2;
                    }
                } else {
                    i = TextUtils.equals("stage_start_install", string) ? 4 : 0;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("plugin_name", str);
                } catch (Exception unused) {
                }
                try {
                    jSONObject.put("plugin_status", i);
                } catch (Exception unused2) {
                }
                C12290b.m22065a("ttlive_plugin_installed_all", (JSONObject) null, LivePluginInitTask.m86427a(jSONObject));
            }
        }
    }
}
