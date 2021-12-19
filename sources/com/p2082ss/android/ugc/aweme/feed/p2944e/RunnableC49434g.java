package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38150a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71947n;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.util.C81077c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.toutiao.proxyserver.p4495g.C87327a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.e.g */
final /* synthetic */ class RunnableC49434g implements Runnable {

    /* renamed from: a */
    private final C49433f f113609a;

    /* renamed from: b */
    private final C84208l f113610b;

    /* renamed from: c */
    private final Video f113611c;

    /* renamed from: d */
    private final AbstractC48149ai f113612d;

    static {
        Covode.recordClassIndex(58247);
    }

    RunnableC49434g(C49433f fVar, C84208l lVar, Video video, AbstractC48149ai aiVar) {
        this.f113609a = fVar;
        this.f113610b = lVar;
        this.f113611c = video;
        this.f113612d = aiVar;
    }

    public final void run() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        String str2;
        C49433f fVar = this.f113609a;
        C84208l lVar = this.f113610b;
        Video video = this.f113611c;
        AbstractC48149ai aiVar = this.f113612d;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sourceId", lVar.f188032a);
            jSONObject3.put("errorCode", lVar.f188035d);
            jSONObject3.put("errorExtra", lVar.f188036e);
            jSONObject3.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
            jSONObject3.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
            jSONObject3.put("playUrl", C80361dw.m139334a(video.getProperPlayAddr()));
            jSONObject3.put("playUrlIsLowBr", video.isLowBr());
            jSONObject3.put("video_duration", video.getDuration());
            C81077c.m140769a(jSONObject3);
            if (lVar.f188037f != null) {
                jSONObject3.put("extraInfo", lVar.f188037f.toString());
            }
            File a = C80720e.m139915a(C80720e.m139914a(), "cache");
            video.getProperPlayAddr();
            if (a == null) {
                str2 = "";
            } else {
                str2 = new C71947n("file", a.getPath() + "/" + C87327a.m151540a(video.getPlayAddr().getBitRatedRatioUri())).toString();
            }
            jSONObject3.put("file", str2);
            jSONObject = new JSONObject(jSONObject3.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C39162r.onEvent(MobClick.obtain().setEventName("play_error").setLabelName("perf_monitor").setJsonObject(jSONObject));
        if (C50539g.m94748c(aiVar)) {
            try {
                jSONObject2 = new JSONObject(jSONObject3.toString());
                jSONObject2.put("aweme_id", aiVar.mo80206b().getAid());
                jSONObject2.put("creative_id", aiVar.mo80206b().getAwemeRawAd().getCreativeId());
                if (C37699a.m76199B(aiVar.mo80206b())) {
                    jSONObject2.put("is_topview", true);
                }
            } catch (Exception unused) {
                jSONObject2 = new JSONObject();
            }
            C12290b.m22060a("aweme_ad_media_play_error_rate", 1, jSONObject2);
            C12290b.m22060a("aweme_ad_media_play_error", 1, jSONObject2);
            Aweme b = aiVar.mo80206b();
            if (b != null && b.isAd()) {
                C38000g.m77050a().mo65900l(fVar.mo81059d(), b);
                C18129a.m33746a("draw_ad", "play_failed", b.getAwemeRawAd()).mo28902c();
            }
        }
        fVar.mo81059d();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C49433f.m92538q();
        }
        if (C58029j.f132256h) {
            C12290b.m22060a("aweme_media_error_rate", 1, jSONObject3);
            if (C50539g.m94749d(aiVar)) {
                C38150a.m77331a(aiVar.mo80206b(), 1, 1);
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("alarm_reason", "fail_to_play");
                    if (aiVar.mo80206b() != null) {
                        jSONObject4.put("group_id", aiVar.mo80206b().getAid());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                C39162r.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject4));
            }
            if (VideoBitRateABManager.f180314a.mo123829d()) {
                str = "aweme_media_bitrated_error_rate";
            } else {
                str = "aweme_media_original_error_rate";
            }
            C12290b.m22060a(str, 1, jSONObject3);
        }
        C33830n.m69192a("aweme_media_play_error_log", "play_error", jSONObject3);
    }
}
