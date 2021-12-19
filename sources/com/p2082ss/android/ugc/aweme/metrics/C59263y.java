package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.follow.p3001e.C51078a;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.metrics.y */
public final class C59263y extends AbstractC59242h<C59263y> {

    /* renamed from: X */
    public String f135429X;

    /* renamed from: Y */
    public String f135430Y;

    /* renamed from: Z */
    public String f135431Z;

    /* renamed from: a */
    public int f135432a;

    /* renamed from: aa */
    public String f135433aa;

    /* renamed from: ab */
    public String f135434ab = "";

    /* renamed from: ac */
    public String f135435ac = "";

    /* renamed from: ad */
    public String f135436ad = "";

    /* renamed from: ae */
    private String f135437ae;

    /* renamed from: af */
    private String f135438af;

    /* renamed from: ag */
    private String f135439ag;

    /* renamed from: ah */
    private int f135440ah;

    /* renamed from: ai */
    private String f135441ai;

    /* renamed from: aj */
    private String f135442aj;

    /* renamed from: ak */
    private int f135443ak = 1;

    /* renamed from: al */
    private String f135444al;

    /* renamed from: am */
    private String f135445am;

    /* renamed from: an */
    private String f135446an;

    /* renamed from: ao */
    private boolean f135447ao;

    /* renamed from: ap */
    private boolean f135448ap;

    /* renamed from: aq */
    private String f135449aq;

    /* renamed from: ar */
    private String f135450ar;

    /* renamed from: as */
    private String f135451as;

    /* renamed from: at */
    private int f135452at;

    /* renamed from: au */
    private int f135453au;

    /* renamed from: av */
    private boolean f135454av;

    /* renamed from: aw */
    private int f135455aw = -1;

    /* renamed from: ax */
    private AwemeRelationRecommendModel f135456ax;

    /* renamed from: ay */
    private int f135457ay;

    /* renamed from: az */
    private int f135458az;

    /* renamed from: b */
    public String f135459b;

    /* renamed from: c */
    public String f135460c;

    /* renamed from: d */
    public String f135461d;

    /* renamed from: e */
    public String f135462e;

    /* renamed from: p */
    public String f135463p;

    /* renamed from: q */
    public boolean f135464q;

    /* renamed from: r */
    public String f135465r;

    /* renamed from: s */
    public String f135466s;

    /* renamed from: t */
    public String f135467t;

    /* renamed from: u */
    public int f135468u = -1;

    /* renamed from: v */
    public long f135469v;

    static {
        Covode.recordClassIndex(69626);
    }

    public C59263y() {
        super("like");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        String str2;
        mo96790a("group_id", this.f135437ae, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135438af, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("request_id", this.f135439ag, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("previous_page", this.f135462e, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page_position", this.f135463p, AbstractC59233c.AbstractC59234a.f135177a);
        if (this.f135464q) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("duration", String.valueOf(this.f135469v), AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f135436ad)) {
            mo96786a("news_id", this.f135436ad);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135439ag);
        }
        TextUtils.equals(this.f135167f, "like_cancel");
        if (C65724g.m117661a().mo104866a(this.f135437ae)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135440ah != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f135440ah).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135460c)) {
            mo96790a(this.f135460c, this.f135461d, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135459b)) {
            mo96790a("playlist_type", this.f135459b, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135434ab) && (TextUtils.equals(this.f135434ab, "click_comment_chain") || TextUtils.equals(this.f135434ab, "click_comment_bubble") || TextUtils.equals(this.f135434ab, "push"))) {
            mo96786a("comment_enter_method", this.f135434ab);
            mo96786a("last_group_id", this.f135435ac);
        } else if (!TextUtils.isEmpty(this.f135434ab) && TextUtils.equals(this.f135434ab, "notification_page")) {
            mo96786a("comment_enter_method", "notification");
            mo96786a("last_group_id", this.f135435ac);
        } else if (!TextUtils.isEmpty(this.f135434ab) && TextUtils.equals(this.f135434ab, UGCMonitor.EVENT_COMMENT)) {
            mo96786a("comment_enter_method", "comment_panel");
            mo96786a("last_group_id", this.f135435ac);
        }
        if (!TextUtils.isEmpty(this.f135441ai)) {
            mo96790a("impr_type", this.f135441ai, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135447ao) {
            str = "1";
        } else {
            str = "0";
        }
        mo96786a("is_text_empty", str);
        if (C59208ac.m108766b(this.f135169h)) {
            if (!TextUtils.isEmpty(this.f135467t)) {
                mo96790a("enter_method", this.f135467t, AbstractC59233c.AbstractC59234a.f135177a);
            }
            if (!TextUtils.isEmpty(this.f135442aj)) {
                mo96790a("content_type", this.f135442aj, AbstractC59233c.AbstractC59234a.f135177a);
            }
            mo96790a("enter_fullscreen", String.valueOf(this.f135443ak), AbstractC59233c.AbstractC59234a.f135177a);
            mo96786a("notice_type", C51078a.f117813a);
            mo96786a("show_cnt", String.valueOf(C51078a.f117814b));
            mo96786a("yellow_dot_logid", C51078a.f117815c);
        }
        if (!TextUtils.isEmpty(this.f135444al)) {
            mo96790a("is_reposted", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_group_id", this.f135444al, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_user_id", this.f135445am, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f135448ap) {
                str2 = "follow";
            } else {
                str2 = "unfollow";
            }
            mo96786a("relation_type", str2);
            mo96786a("video_type", this.f135449aq);
            mo96786a("rec_uid", this.f135450ar);
        }
        if (!TextUtils.isEmpty(this.f135467t)) {
            mo96790a("enter_method", this.f135467t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135446an)) {
            mo96790a("compilation_id", this.f135446an, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135468u != -1) {
            mo96790a("is_logged_in", new StringBuilder().append(this.f135468u).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f135433aa)) {
            mo96786a("is_fullscreen", this.f135433aa);
        }
        if (!TextUtils.isEmpty(this.f135430Y)) {
            mo96786a("search_keywords", this.f135430Y);
        }
        if (!TextUtils.isEmpty(this.f135431Z)) {
            mo96786a("search_type", this.f135431Z);
        }
        if (!TextUtils.isEmpty(this.f135173l)) {
            mo96786a("creation_id", this.f135173l);
        }
        if (!TextUtils.isEmpty(this.f135465r)) {
            mo96786a("tag_id", this.f135465r);
        }
        if (!TextUtils.isEmpty(this.f135466s)) {
            mo96786a("parent_tag_id", this.f135466s);
        }
        if (C51487e.m95905b() && this.f135453au != 0) {
            mo96786a("is_avatar", C51487e.m95906c());
        }
        if (!TextUtils.isEmpty(this.f135451as)) {
            mo96786a("follow_status", this.f135451as);
        }
        if (!TextUtils.isEmpty(this.f135429X)) {
            mo96786a("playlist_id", this.f135429X);
        }
        mo96786a("relation_tag", new StringBuilder().append(this.f135452at).toString());
        mo96787a("is_highlighted", this.f135454av);
        mo96785a("rank_index", this.f135455aw);
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135456ax;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f135456ax.getFriendTypeStr());
        }
        mo96785a("is_long", this.f135458az);
        mo96785a("is_promoted", this.f135457ay);
    }

    /* renamed from: a */
    public final C59263y mo96852a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: o */
    public final C59263y mo96854o(String str) {
        this.f135173l = str;
        return this;
    }

    public C59263y(String str) {
        super(str);
        this.f135172k = true;
    }

    /* renamed from: f */
    public final C59263y mo96749g(Aweme aweme) {
        String a;
        int followStatus;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135437ae = aweme.getAid();
            this.f135438af = m108854c(aweme);
            if (TextUtils.isEmpty(C59208ac.m108759a(aweme, this.f135432a))) {
                a = aweme.getRequestId();
            } else {
                a = C59208ac.m108759a(aweme, this.f135432a);
            }
            this.f135439ag = a;
            this.f135441ai = C59208ac.m108776j(aweme);
            this.f135442aj = C59208ac.m108773g(aweme);
            this.f135444al = aweme.getRepostFromGroupId();
            this.f135445am = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f135446an = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f135453au = aweme.getMutualRelation().getMutualType();
            }
            this.f135448ap = C80580in.m139680a(aweme);
            this.f135449aq = C59208ac.m108777k(aweme);
            this.f135450ar = C59208ac.m108778l(aweme);
            this.f135451as = C59205aa.m108754a(aweme);
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            if (aweme.getAuthor() == null) {
                followStatus = -2;
            } else {
                followStatus = aweme.getAuthor().getFollowStatus();
            }
            this.f135452at = followStatus;
            this.f135454av = aweme.isHighlighted();
            this.f135455aw = aweme.getOriginalPos();
            this.f135456ax = aweme.getRelationRecommendInfo();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f135457ay = 1;
            }
            C80409eu.m139391a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f135458az = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f135458az = 1;
            }
        }
        return this;
    }
}
