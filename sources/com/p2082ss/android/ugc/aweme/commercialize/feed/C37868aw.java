package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38162ah;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38154aa;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38185g;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38192m;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38195p;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38196q;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38197r;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.aw */
public final class C37868aw implements AbstractC37880bd {
    static {
        Covode.recordClassIndex(45320);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65883a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        C38189j.m77494a(context, str, str2, jSONObject, str3, j);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65884a(Collection<String> collection) {
        C38185g.m77450a((AbstractC38162ah) null, collection, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65882a(Context context, AwemeRawAd awemeRawAd, String str) {
        if (C38189j.m77514b(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            C38189j.m77493a(context, str, "hide_app", C38189j.m77470a(context, awemeRawAd, false, (Map<String, String>) null), awemeRawAd);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final long mo65872a(AwemeRawAd awemeRawAd) {
        return C38189j.m77458a(awemeRawAd);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: d */
    public final void mo65892d(Context context, Aweme aweme) {
        C38189j.m77540o(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: f */
    public final void mo65894f(Context context, Aweme aweme) {
        C38189j.m77534i(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: g */
    public final void mo65895g(Context context, Aweme aweme) {
        C38189j.m77535j(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: k */
    public final void mo65899k(Context context, Aweme aweme) {
        C38189j.m77504b(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: p */
    public final void mo65904p(Context context, Aweme aweme) {
        C38189j.m77543r(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: r */
    public final void mo65906r(Context context, Aweme aweme) {
        C38189j.m77544s(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: s */
    public final void mo65907s(Context context, Aweme aweme) {
        C38189j.m77545t(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: t */
    public final void mo65908t(Context context, Aweme aweme) {
        C38189j.m77547v(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: v */
    public final void mo65910v(Context context, Aweme aweme) {
        C38189j.m77476a(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: c */
    public final void mo65891c(Context context, Aweme aweme) {
        C38189j.m77482a(context, aweme, (String) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: b */
    public final void mo65887b(Context context, Aweme aweme) {
        C38189j.m77524d(context, "follow_cancel", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: i */
    public final void mo65897i(Context context, Aweme aweme) {
        C38189j.m77510b(context, "logo_show", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: l */
    public final void mo65900l(Context context, Aweme aweme) {
        C38189j.m77510b(context, "play_failed", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: m */
    public final void mo65901m(Context context, Aweme aweme) {
        C38189j.m77524d(context, "homepagelink_click", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65877a(Context context, Aweme aweme) {
        C38189j.m77481a(context, aweme, (FollowStatus) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: j */
    public final void mo65898j(Context context, Aweme aweme) {
        C38189j.m77510b(context, "button_show", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C38189j.m77510b(context, "othershow", aweme, C38189j.m77467a(context, aweme, "raw ad button show refer", "button"));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: e */
    public final void mo65893e(Context context, Aweme aweme) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "draw_ad";
        a.f90212b = "otherclick";
        a.mo66497b(aweme).mo66504c("comment_sign").mo66491a(C38189j.m77462a()).mo66495a(context);
        if (aweme != null) {
            C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", "comment_sign").mo28898a(C38189j.m77462a()).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: h */
    public final void mo65896h(Context context, Aweme aweme) {
        C38189j.m77510b(context, "logo_click", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38154aa(awemeRawAd));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: n */
    public final void mo65902n(Context context, Aweme aweme) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "homepage_ad";
        a.f90212b = "click_download";
        a.mo66497b(aweme).mo66495a(context);
        if (aweme != null) {
            C18129a.m33746a("homepage_ad", "click_download", aweme.getAwemeRawAd()).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: o */
    public final void mo65903o(Context context, Aweme aweme) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "homepage_ad";
        a.f90212b = "click_website";
        a.mo66497b(aweme).mo66495a(context);
        if (aweme != null) {
            C18129a.m33746a("homepage_ad", "click_website", aweme.getAwemeRawAd()).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: q */
    public final void mo65905q(Context context, Aweme aweme) {
        C38189j.m77524d(context, "click", aweme, C38189j.m77468a(context, aweme, true, (Map<String, String>) null));
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38192m(awemeRawAd));
        }
        C40584a.m81930a("homepage_ad", "button");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: u */
    public final void mo65909u(Context context, Aweme aweme) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "draw_ad";
        a.f90212b = "otherclick";
        a.mo66497b(aweme).mo66504c("share_sign").mo66491a(C38189j.m77462a()).mo66495a(context);
        C18129a.m33746a("draw_ad", "otherclick", aweme.getAwemeRawAd()).mo28900b("refer", "share_sign").mo28898a(C38189j.m77462a()).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65878a(Context context, Aweme aweme, int i) {
        C38189j.m77477a(context, aweme, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: b */
    public final void mo65889b(Context context, Aweme aweme, String str) {
        C38189j.m77523d(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final JSONObject mo65873a(Context context, JSONObject jSONObject, String str) {
        return C38189j.m77471a(context, jSONObject, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65879a(Context context, Aweme aweme, FollowStatus followStatus) {
        C38189j.m77481a(context, aweme, followStatus);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: b */
    public final void mo65886b(Context context, Banner banner, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        C38182f.C38184b a = C38182f.m77418a();
        a.f90212b = "click";
        C38182f.C38184b e = a.mo66506e(banner.getLogExtra());
        e.f90211a = "discovery_ad";
        e.mo66504c("banner").mo66490a(Long.valueOf(banner.getCreativeId())).mo66491a(hashMap).mo66495a(context);
        C18129a.m33747a("discovery_ad", "click", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), "0").mo28900b("refer", "banner").mo28897a("banner_order", Integer.valueOf(i)).mo28902c();
        C38164aj.m77371a("click", banner.getClickTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap), new C38197r(hashMap, banner));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: b */
    public final void mo65888b(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject a;
        int i;
        if (C37699a.m76222Y(aweme)) {
            HashMap hashMap = new HashMap();
            int i2 = 1;
            if (followStatus == null || !followStatus.isCheating()) {
                i = 0;
            } else {
                i = 1;
            }
            hashMap.put("is_cheated_follow", Integer.valueOf(i));
            if (followStatus != null) {
                i2 = followStatus.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i2));
            a = C38189j.m77468a(context, aweme, false, C38189j.m77464a(hashMap));
        } else {
            a = C38189j.m77468a(context, aweme, false, (Map<String, String>) null);
        }
        C38189j.m77524d(context, "follow", aweme, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65876a(Context context, Banner banner, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        C38182f.C38184b a = C38182f.m77418a();
        a.f90212b = "show";
        C38182f.C38184b e = a.mo66506e(banner.getLogExtra());
        e.f90211a = "discovery_ad";
        e.mo66504c("banner").mo66490a(Long.valueOf(banner.getCreativeId())).mo66491a(hashMap).mo66495a(context);
        C18129a.m33747a("discovery_ad", "show", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), "0").mo28900b("refer", "banner").mo28897a("banner_order", Integer.valueOf(i)).mo28902c();
        C38164aj.m77371a("show", banner.getTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap), new C38196q(hashMap, banner));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65880a(Context context, Aweme aweme, String str) {
        C38189j.m77482a(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65881a(Context context, Aweme aweme, JSONObject jSONObject) {
        C38189j.m77485a(context, aweme, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: b */
    public final void mo65885b(Context context, long j, String str, UrlModel urlModel) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90212b = "click";
        C38182f.C38184b e = a.mo66506e(str);
        e.f90211a = "discovery_ad";
        e.mo66504c("title").mo66490a(Long.valueOf(j)).mo66495a(context);
        C18129a.m33747a("discovery_ad", "click", String.valueOf(j), str, "0").mo28900b("refer", "title").mo28902c();
        C38164aj.m77369a("click", urlModel, Long.valueOf(j), str, (AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b>) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: c */
    public final void mo65890c(Context context, long j, String str, UrlModel urlModel) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90212b = "show";
        C38182f.C38184b e = a.mo66506e(str);
        e.f90211a = "discovery_ad";
        e.mo66504c("hashtag").mo66490a(Long.valueOf(j)).mo66495a(context);
        C18129a.m33747a("discovery_ad", "show", String.valueOf(j), str, "0").mo28900b("refer", "hashtag").mo28902c();
        C38164aj.m77369a("show", urlModel, Long.valueOf(j), str, (AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b>) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65874a(Context context, long j, String str, UrlModel urlModel) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90212b = "video_slide";
        C38182f.C38184b e = a.mo66506e(str);
        e.f90211a = "discovery_ad";
        e.mo66504c("video").mo66490a(Long.valueOf(j)).mo66495a(context);
        C18129a.m33747a("discovery_ad", "video_slide", String.valueOf(j), str, "0").mo28900b("refer", "video").mo28902c();
        C38182f.C38184b a2 = C38182f.m77418a();
        a2.f90212b = "click";
        C38182f.C38184b e2 = a2.mo66506e(str);
        e2.f90211a = "discovery_ad";
        e2.mo66504c("video").mo66490a(Long.valueOf(j)).mo66495a(context);
        C18129a.m33747a("discovery_ad", "click", String.valueOf(j), str, "0").mo28900b("refer", "video").mo28902c();
        C38164aj.m77369a("click", urlModel, Long.valueOf(j), str, (AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b>) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd
    /* renamed from: a */
    public final void mo65875a(Context context, long j, String str, UrlModel urlModel, String str2) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90212b = "auto_full_screen";
        a.f90211a = "discovery_ad";
        C38182f.C38184b e = a.mo66504c("video").mo66490a(Long.valueOf(j)).mo66506e(str);
        e.f90215e.mo66484a("item_id", str2);
        e.mo66495a(context);
        C18129a.m33747a("discovery_ad", "auto_full_screen", String.valueOf(j), str, "0").mo28900b("item_id", str2).mo28900b("refer", "video").mo28902c();
        C38164aj.m77369a("click", urlModel, Long.valueOf(j), str, C38195p.f90236a);
    }
}
