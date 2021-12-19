package com.p2082ss.android.ugc.aweme.video.simplayer.p4226b;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.b.a */
public final class C80995a {

    /* renamed from: a */
    private static final int f181043a = SettingsManager.m29616a().mo25394a("playermanager_background_check", 0);

    static {
        Covode.recordClassIndex(94313);
    }

    /* renamed from: b */
    private static void m140555b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            C12290b.m22066a("play_video_in_app_background", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m140554a(String str) {
        int i = f181043a;
        if (i == 1) {
            if (TextUtils.equals("resumePlay", str)) {
                C51423a.m95791b(4, "PlayerManagerLegacyHelper", Log.getStackTraceString(new Throwable("resumePlay")));
            }
        } else if (i != 1) {
            return false;
        }
        if (!C17873f.f42636l) {
            return false;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable("PlayVideoInAppBackground"));
        m140555b(stackTraceString);
        C51423a.m95791b(4, "PlayerManagerLegacyHelper", "Try play video when app is in background, trace is ".concat(String.valueOf(stackTraceString)));
        return true;
    }
}
