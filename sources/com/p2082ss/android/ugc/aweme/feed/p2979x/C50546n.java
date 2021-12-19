package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.experiment.C47039q;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.background.C49286c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59217al;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.x.n */
public final class C50546n {
    static {
        Covode.recordClassIndex(59693);
    }

    /* renamed from: a */
    public static void m94775a(C49672ag agVar, C49812b bVar, String str) {
        C1731i.m5640b(new CallableC50547o(agVar, str, bVar), C39162r.m79452a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m94771a(C49672ag agVar, String str, C49812b bVar) {
        String str2;
        int i = agVar.f114315a;
        String str3 = "";
        if (i == 19) {
            str3 = "head";
            str2 = "click_head";
        } else if (i == 18) {
            str3 = StringSet.name;
            str2 = "click_name";
        } else {
            str2 = str3;
        }
        C39163s sVar = new C39163s();
        try {
            sVar.mo67941a("group_id", ((Aweme) agVar.f114316b).getAid());
            sVar.mo67941a("request_id", str);
            if (C50545m.m94767d((Aweme) agVar.f114316b)) {
                sVar.mo67941a("is_photo", "1");
            }
            sVar.mo67941a("to_user_id", ((Aweme) agVar.f114316b).getAuthorUid());
            sVar.mo67941a("author_id", ((Aweme) agVar.f114316b).getAuthorUid());
            C39162r.onEvent(MobClick.obtain().setEventName(str3).setLabelName(bVar.getEventType()).setValue(((Aweme) agVar.f114316b).getAuthor().getUid()).setJsonObject(sVar.mo67942a()));
            sVar.mo67941a("enter_from", bVar.getEventType());
            sVar.mo67941a("enter_method", str2);
            C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(((Aweme) agVar.f114316b).getAuthor().getUid()).setJsonObject(sVar.mo67942a()));
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m94774a(Context context, Aweme aweme, JSONObject jSONObject, C49812b bVar, String str) {
        String str2;
        int pageType = bVar.getPageType();
        if (pageType == 0) {
            str2 = "homepage_hot";
        } else if (pageType == 1) {
            str2 = "homepage_follow";
        } else if (pageType == 7) {
            str2 = "homepage_fresh";
        } else {
            return;
        }
        C1731i.m5640b(new CallableC50548p(jSONObject, aweme, str, context, str2, aweme.getAid(), bVar), C39162r.m79452a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m94772a(JSONObject jSONObject, Aweme aweme, String str, String str2, String str3, C49812b bVar) {
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", aweme.getAuthorUid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            if (C59208ac.m108766b(str)) {
                jSONObject.put("enter_fullscreen", "1");
                jSONObject.put("content_type", C59208ac.m108773g(aweme));
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                jSONObject.put("is_reposted", "1");
                jSONObject.put("repost_from_group_id", aweme.getRepostFromGroupId());
                jSONObject.put("repost_from_user_id", aweme.getRepostFromUserId());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.m79456a("show", str2, str3, 0, jSONObject);
        if (C59208ac.m108766b(str)) {
            jSONObject.put("enter_from", str2);
            C39162r.m79463b("show", jSONObject);
        }
        C33744d a = new C33744d().mo59983a("enter_from", str2).mo59983a("group_id", str3).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(str3, 0))).mo59980a("_staging_flag", 0).mo59981a("feed_count", aweme.getFeedCount()).mo59983a("order", C59208ac.m108764b(aweme, bVar.getPageType()));
        if (!C49286c.m92321a()) {
            C39162r.m79460a("video_show", a.f79943a);
        }
        String aT = C37699a.m76248aT(aweme);
        if (!TextUtils.isEmpty(aT)) {
            if (aweme.isAd()) {
                a.mo59982a("ad_id", aweme.getAwemeRawAd().getAdId());
            }
            try {
                a.mo59980a("study_id", Integer.parseInt(aT));
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
            C39162r.m79460a("ads_bls_ugc_show", a.f79943a);
        }
        if (C47039q.m90298a()) {
            return null;
        }
        new C59217al().mo96756a(str).mo96757c(aweme, bVar.getPageType()).mo96792f();
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m94773a(boolean z, String str, String str2, String str3, String str4, C49812b bVar) {
        String str5;
        String str6;
        MobClick obtain = MobClick.obtain();
        if (z) {
            str5 = "slide_down";
        } else {
            str5 = "slide_up";
        }
        C39162r.onEvent(obtain.setEventName(str5).setLabelName("homepage_hot").setJsonObject(new C33743c().mo59976a("request_id", str).mo59976a("author_id", str2).mo59976a("from_group_id", str3).mo59976a("to_group_id", str4).mo59977a()));
        C33744d a = new C33744d().mo59983a("request_id", str).mo59983a("author_id", str2).mo59983a("from_group_id", str3).mo59983a("to_group_id", str4).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(str4));
        if (z) {
            str6 = "homepage_hot_slide_down";
        } else {
            str6 = "homepage_hot_slide_up";
        }
        if (C49286c.m92321a()) {
            return null;
        }
        if (TextUtils.equals("homepage_hot", bVar.getEventType())) {
            a.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(str));
            a.mo59983a("enter_play_method", "manul_play");
            C39162r.m79461a(str6, C59208ac.m108761a(a.f79943a));
            return null;
        }
        C39162r.m79460a(str6, a.f79943a);
        return null;
    }
}
