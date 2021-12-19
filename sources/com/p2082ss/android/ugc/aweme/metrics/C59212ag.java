package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.metrics.ag */
public final class C59212ag extends AbstractC59242h<C59212ag> {

    /* renamed from: X */
    public String f134812X;

    /* renamed from: Y */
    public boolean f134813Y;

    /* renamed from: Z */
    public String f134814Z;

    /* renamed from: a */
    public String f134815a;

    /* renamed from: aa */
    public String f134816aa;

    /* renamed from: ab */
    public String f134817ab;

    /* renamed from: ac */
    public String f134818ac = "";

    /* renamed from: ad */
    public Boolean f134819ad = false;

    /* renamed from: ae */
    public String f134820ae;

    /* renamed from: af */
    public String f134821af = "";

    /* renamed from: ag */
    public String f134822ag = "";

    /* renamed from: ah */
    private String f134823ah;

    /* renamed from: ai */
    private String f134824ai;

    /* renamed from: aj */
    private Aweme f134825aj;

    /* renamed from: ak */
    private String f134826ak;

    /* renamed from: al */
    private String f134827al;

    /* renamed from: am */
    private int f134828am;

    /* renamed from: an */
    private String f134829an;

    /* renamed from: ao */
    private String f134830ao;

    /* renamed from: ap */
    private boolean f134831ap;

    /* renamed from: aq */
    private String f134832aq;

    /* renamed from: ar */
    private String f134833ar;

    /* renamed from: as */
    private boolean f134834as;

    /* renamed from: at */
    private boolean f134835at;

    /* renamed from: au */
    private int f134836au = -1;

    /* renamed from: av */
    private String f134837av = "";

    /* renamed from: aw */
    private int f134838aw;

    /* renamed from: ax */
    private int f134839ax;

    /* renamed from: ay */
    private AwemeRelationRecommendModel f134840ay;

    /* renamed from: b */
    public String f134841b;

    /* renamed from: c */
    public String f134842c;

    /* renamed from: d */
    public String f134843d = "normal_share";

    /* renamed from: e */
    public int f134844e;

    /* renamed from: p */
    public int f134845p;

    /* renamed from: q */
    public String f134846q;

    /* renamed from: r */
    public String f134847r;

    /* renamed from: s */
    public String f134848s;

    /* renamed from: t */
    public String f134849t;

    /* renamed from: u */
    public String f134850u;

    /* renamed from: v */
    public String f134851v;

    static {
        Covode.recordClassIndex(69575);
    }

    public C59212ag() {
        super("share_video");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        String str2;
        mo96790a("group_id", this.f134815a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f134841b, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("platform", this.f134842c, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("content_type", this.f134823ah, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("share_mode", this.f134824ai, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("reflow_flag", String.valueOf(this.f134845p), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f134843d, AbstractC59233c.AbstractC59234a.f135177a);
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(C59208ac.m108763b(this.f134825aj));
        }
        if (this.f134844e != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f134844e).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96788a(ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f134825aj, ForwardStatisticsServiceImpl.m95759b().mo86842a()));
        if (C65724g.m117661a().mo104866a(this.f134815a)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        } else {
            mo96790a("previous_page", this.f134851v, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("previous_page_position", this.f134812X, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134813Y) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134846q)) {
            mo96790a("share_url", this.f134846q, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134847r)) {
            mo96790a("news_id", this.f134847r, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134849t)) {
            mo96790a(this.f134849t, this.f134850u, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134848s)) {
            mo96790a("playlist_type", this.f134848s, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        mo96790a("sector", this.f134826ak, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134827al)) {
            mo96790a("impr_type", this.f134827al, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134829an)) {
            mo96790a("is_reposted", new StringBuilder().append(this.f134828am).toString(), AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_group_id", this.f134829an, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_user_id", this.f134830ao, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134834as) {
            str = "1";
        } else {
            str = "0";
        }
        mo96786a("is_horizontal_screen", str);
        mo96790a("request_id", C59208ac.m108763b(this.f134825aj), AbstractC59233c.AbstractC59234a.f135178b);
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f134831ap) {
                str2 = "follow";
            } else {
                str2 = "unfollow";
            }
            mo96786a("relation_type", str2);
            mo96786a("video_type", this.f134832aq);
            mo96786a("rec_uid", this.f134833ar);
        }
        if (!TextUtils.isEmpty(this.f135173l)) {
            mo96786a("creation_id", this.f135173l);
        }
        if (!TextUtils.isEmpty(this.f134814Z)) {
            mo96786a("share_form", this.f134814Z);
        }
        if (!TextUtils.isEmpty(this.f134816aa)) {
            mo96786a("tag_id", this.f134816aa);
        }
        if (!TextUtils.isEmpty(this.f134817ab)) {
            mo96786a("parent_tag_id", this.f134817ab);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f134840ay;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f134840ay.getFriendTypeStr());
        }
        mo96787a("is_highlighted", this.f134835at);
        mo96785a("rank_index", this.f134836au);
        mo96785a("is_promoted", this.f134839ax);
        if (!TextUtils.isEmpty(this.f134837av)) {
            mo96786a("playlist_id", this.f134837av);
        }
        if (!TextUtils.isEmpty(this.f134818ac)) {
            mo96786a("category_name", this.f134818ac);
        }
        mo96785a("is_long", this.f134838aw);
        if (!TextUtils.isEmpty(this.f134821af) && (TextUtils.equals(this.f134821af, "click_comment_chain") || TextUtils.equals(this.f134821af, "click_comment_bubble") || TextUtils.equals(this.f134821af, "push"))) {
            mo96786a("comment_enter_method", this.f134821af);
            mo96786a("last_group_id", this.f134822ag);
        } else if (!TextUtils.isEmpty(this.f134821af) && TextUtils.equals(this.f134821af, "notification_page")) {
            mo96786a("comment_enter_method", "notification");
            mo96786a("last_group_id", this.f134822ag);
        } else if (!TextUtils.isEmpty(this.f134821af) && TextUtils.equals(this.f134821af, UGCMonitor.EVENT_COMMENT)) {
            mo96786a("comment_enter_method", "comment_panel");
            mo96786a("last_group_id", this.f134822ag);
        }
        if (this.f134819ad.booleanValue()) {
            mo96786a("story_type", "story");
        } else {
            mo96786a("story_type", UGCMonitor.TYPE_POST);
        }
        if (!TextUtils.isEmpty(this.f134820ae)) {
            mo96786a("story_collection_id", this.f134820ae);
        }
    }

    /* renamed from: a */
    public final C59212ag mo96751a(String str) {
        this.f135169h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: b_ */
    public final /* bridge */ /* synthetic */ C59212ag mo96752b_(String str) {
        this.f134820ae = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C59212ag mo96754m(String str) {
        this.f134847r = str;
        return this;
    }

    /* renamed from: o */
    public final C59212ag mo96755o(String str) {
        this.f135173l = str;
        return this;
    }

    /* renamed from: f */
    public final C59212ag mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f134825aj = aweme;
            this.f134815a = aweme.getAid();
            this.f134841b = m108854c(aweme);
            this.f134823ah = C59208ac.m108773g(aweme);
            this.f134827al = C59208ac.m108776j(aweme);
            this.f134828am = aweme.isForwardAweme() ? 1 : 0;
            this.f134829an = aweme.getRepostFromGroupId();
            this.f134830ao = aweme.getRepostFromUserId();
            this.f134831ap = C80580in.m139680a(aweme);
            this.f134832aq = C59208ac.m108777k(aweme);
            this.f134833ar = C59208ac.m108778l(aweme);
            this.f134835at = aweme.isHighlighted();
            this.f134836au = aweme.getOriginalPos();
            this.f134840ay = aweme.getRelationRecommendInfo();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f134839ax = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.f134837av = aweme.playlist_info.getMixId();
            }
            C80409eu.m139391a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f134838aw = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f134838aw = 1;
            }
        }
        return this;
    }
}
