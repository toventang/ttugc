package com.p2082ss.android.ugc.aweme.video.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.player.C62933c;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80674af;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80682h;
import com.toutiao.proxyserver.C87383u;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.util.c */
public final class C81077c {
    static {
        Covode.recordClassIndex(94399);
    }

    /* renamed from: a */
    private static boolean m140770a() {
        return C16048b.m29633a().mo25421a(true, "use_video_cache_http_dns", false);
    }

    /* renamed from: a */
    public static JSONObject m140769a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("playerType", C81079v.m140776O().mo123877a().toString());
        jSONObject.put("from", "PlayerCommonParamManager");
        jSONObject.put("is_break_resume_check_enabled", C62933c.m113348a());
        jSONObject.put("is_force_request_validation", C62933c.m113349b());
        jSONObject.put("is_play_link_select_enabled", C80682h.m139907a());
        jSONObject.put("is_preload_enabled", C81075a.m140765a());
        jSONObject.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().mo59941c());
        jSONObject.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59941c());
        boolean z = true;
        if (C16048b.m29633a().mo25412a(true, "use_ttnet", 1) != C80674af.f180369a) {
            z = false;
        }
        jSONObject.put("video_cache_use_ttnet", z);
        return jSONObject;
    }

    /* renamed from: a */
    public static C33743c m140768a(C33743c cVar) {
        if (cVar == null) {
            cVar = new C33743c();
        }
        cVar.mo59976a("playerType", C81079v.m140776O().mo123877a().toString());
        cVar.mo59976a("from", "PlayerCommonParamManager");
        cVar.mo59971a("is_break_resume_check_enabled", Boolean.valueOf(C62933c.m113348a()));
        cVar.mo59971a("is_force_request_validation", Boolean.valueOf(C62933c.m113349b()));
        cVar.mo59971a("is_play_link_select_enabled", Boolean.valueOf(C80682h.m139907a()));
        cVar.mo59971a("is_preload_enabled", Boolean.valueOf(C81075a.m140765a()));
        cVar.mo59971a("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().mo59941c());
        cVar.mo59974a("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59941c());
        cVar.mo59971a("use_video_cache_http_dns", Boolean.valueOf(m140770a()));
        cVar.mo59971a("video_cache_use_ttnet", Boolean.valueOf(C87383u.f198092l));
        return cVar;
    }
}
