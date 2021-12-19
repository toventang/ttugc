package com.p2082ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.t */
public final class C65687t {
    static {
        Covode.recordClassIndex(77178);
    }

    /* renamed from: c */
    public static final int m117581c() {
        return Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0);
    }

    /* renamed from: a */
    public static final boolean m117579a() {
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("USER_HD_VIDEO_SWITCH_SETTING", 0);
        if (i == 0) {
            return SettingsManager.m29616a().mo25400a("enable_default_open_hd_video_switch", false);
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final int m117580b() {
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        Boolean a = C63238c.f143586m.mo93856c().mo93860a();
        C89219l.m154716b(a, "");
        return repo.getInt("save_to_local_config", a.booleanValue() ? 1 : 0);
    }

    /* renamed from: a */
    public static final void m117578a(int i) {
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("save_to_local_config", i);
    }
}
