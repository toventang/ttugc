package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.metrics.ae */
public final class C59210ae extends AbstractC59242h<C59210ae> {

    /* renamed from: X */
    public String f134750X;

    /* renamed from: Y */
    public boolean f134751Y;

    /* renamed from: Z */
    public int f134752Z = 1;

    /* renamed from: a */
    public String f134753a;

    /* renamed from: aA */
    private Aweme f134754aA;

    /* renamed from: aB */
    private String f134755aB;

    /* renamed from: aC */
    private boolean f134756aC;

    /* renamed from: aD */
    private String f134757aD;

    /* renamed from: aE */
    private String f134758aE;

    /* renamed from: aF */
    private String f134759aF;

    /* renamed from: aG */
    private String f134760aG;

    /* renamed from: aH */
    private int f134761aH;

    /* renamed from: aI */
    private String f134762aI;

    /* renamed from: aJ */
    private int f134763aJ = -1;

    /* renamed from: aK */
    private Integer f134764aK;

    /* renamed from: aL */
    private AwemeRelationRecommendModel f134765aL;

    /* renamed from: aM */
    private boolean f134766aM;

    /* renamed from: aN */
    private int f134767aN = -1;

    /* renamed from: aO */
    private int f134768aO;

    /* renamed from: aP */
    private String f134769aP = "";

    /* renamed from: aQ */
    private int f134770aQ;

    /* renamed from: aa */
    public int f134771aa;

    /* renamed from: ab */
    public int f134772ab;

    /* renamed from: ac */
    public String f134773ac = "";

    /* renamed from: ad */
    public String f134774ad;

    /* renamed from: ae */
    public String f134775ae;

    /* renamed from: af */
    public int f134776af;

    /* renamed from: ag */
    public String f134777ag;

    /* renamed from: ah */
    public int f134778ah;

    /* renamed from: ai */
    public String f134779ai;

    /* renamed from: aj */
    public String f134780aj;

    /* renamed from: ak */
    public String f134781ak;

    /* renamed from: al */
    public String f134782al;

    /* renamed from: am */
    public String f134783am = "";

    /* renamed from: an */
    public int f134784an;

    /* renamed from: ao */
    public String f134785ao = "";

    /* renamed from: ap */
    public String f134786ap = "";

    /* renamed from: aq */
    public int f134787aq;

    /* renamed from: ar */
    public String f134788ar = "";

    /* renamed from: as */
    public String f134789as = "";

    /* renamed from: at */
    public String f134790at = "";

    /* renamed from: au */
    public String f134791au = "";

    /* renamed from: av */
    public String f134792av;

    /* renamed from: aw */
    public String f134793aw;

    /* renamed from: ax */
    private String f134794ax;

    /* renamed from: ay */
    private String f134795ay;

    /* renamed from: az */
    private String f134796az;

    /* renamed from: b */
    public String f134797b;

    /* renamed from: c */
    public String f134798c;

    /* renamed from: d */
    public String f134799d;

    /* renamed from: e */
    public String f134800e;

    /* renamed from: p */
    public String f134801p;

    /* renamed from: q */
    public int f134802q;

    /* renamed from: r */
    public boolean f134803r;

    /* renamed from: s */
    public String f134804s;

    /* renamed from: t */
    public String f134805t;

    /* renamed from: u */
    public String f134806u;

    /* renamed from: v */
    public String f134807v;

    static {
        Covode.recordClassIndex(69573);
    }

    public C59210ae() {
        super("post_comment");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        int i;
        String str2;
        Aweme aweme;
        mo96790a("group_id", this.f134794ax, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f134795ay, AbstractC59233c.AbstractC59234a.f135178b);
        mo96786a("user_level", this.f134791au);
        if (!TextUtils.isEmpty(this.f134792av)) {
            mo96786a("comment_author_level", this.f134792av);
        }
        if (!TextUtils.isEmpty(this.f134793aw)) {
            mo96786a("reply_comment_level", this.f134793aw);
        }
        if (!TextUtils.isEmpty(this.f134797b)) {
            mo96790a("comment_category", this.f134797b, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134753a)) {
            mo96790a("reply_to_comment_id", this.f134753a, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(C59208ac.m108763b(this.f134754aA));
        }
        mo96788a(ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f134754aA, this.f134801p));
        if (C65724g.m117661a().mo104866a(this.f134794ax)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        } else {
            mo96790a("previous_page", this.f134807v, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("previous_page_position", this.f134750X, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134751Y) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134802q == 1) {
            mo96790a("is_long_item", new StringBuilder().append(this.f134802q).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("is_repost_comment", new StringBuilder().append(this.f134771aa).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134798c)) {
            mo96790a("emoji_times", this.f134798c, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134805t)) {
            mo96790a(this.f134805t, this.f134806u, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("is_retry", String.valueOf(this.f134803r ? 1 : 0), AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134804s)) {
            mo96790a("playlist_type", this.f134804s, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f134756aC) {
            str = "1";
        } else {
            str = "0";
        }
        mo96786a("is_text_empty", str);
        if (!TextUtils.isEmpty(this.f134799d)) {
            mo96790a("enter_method", this.f134799d, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134755aB)) {
            mo96790a("impr_type", this.f134755aB, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().mo121229a()) && (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel"))) {
            C81469a.m141252a();
        }
        if (C59208ac.m108766b(this.f135169h)) {
            if (!TextUtils.isEmpty(this.f134757aD)) {
                mo96790a("content_type", this.f134757aD, AbstractC59233c.AbstractC59234a.f135177a);
            }
            mo96790a("enter_fullscreen", String.valueOf(this.f134752Z), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134758aE)) {
            mo96790a("is_reposted", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_group_id", this.f134758aE, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("repost_from_user_id", this.f134759aF, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134760aG)) {
            mo96790a("compilation_id", this.f134760aG, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96786a("request_id", C59208ac.m108763b(this.f134754aA));
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (this.f135201A.booleanValue()) {
            mo96786a("is_fullscreen", "0");
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h) || ((aweme = this.f134754aA) != null && aweme.isFamiliar())) {
            mo96790a("relation_type", this.f134762aI, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("rec_uid", C59208ac.m108778l(this.f134754aA), AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("video_type", C59208ac.m108777k(this.f134754aA), AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96786a("label_type", this.f134774ad);
        mo96786a("relation_label_type", this.f134775ae);
        if (!TextUtils.isEmpty(this.f135173l)) {
            mo96786a("creation_id", this.f135173l);
        }
        int i2 = this.f134776af;
        if (i2 != -1) {
            mo96785a("follow_status", i2);
        }
        mo96786a("send_method", this.f134777ag);
        mo96786a("is_pure_emoji", String.valueOf(this.f134778ah));
        mo96786a("emoji_order", this.f134779ai);
        mo96786a("reply_comment_type", this.f134780aj);
        mo96786a("reply_method", this.f134800e);
        mo96786a("search_id", this.f135215O);
        mo96786a("relation_tag", new StringBuilder().append(this.f134763aJ).toString());
        mo96786a("relation_tag_reply", new StringBuilder().append(this.f134772ab).toString());
        Integer num = this.f134764aK;
        if (num != null) {
            mo96786a("is_zero_comment", String.valueOf(num));
        }
        if (C51487e.m95905b() && (i = this.f134761aH) != 0) {
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    str2 = "friends with";
                } else if (valueOf.intValue() == 2) {
                    str2 = "followed by";
                } else if (valueOf.intValue() == 3) {
                    str2 = "follows";
                }
                mo96786a("label_text", str2);
                mo96786a("is_avatar", C51487e.m95906c());
            }
            str2 = "";
            mo96786a("label_text", str2);
            mo96786a("is_avatar", C51487e.m95906c());
        }
        mo96786a("reply_uid", this.f134773ac);
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f134765aL;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f134765aL.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.f134781ak)) {
            mo96786a("tag_id", this.f134781ak);
        }
        if (!TextUtils.isEmpty(this.f134790at)) {
            mo96786a("news_id", this.f134790at);
        }
        if (!TextUtils.isEmpty(this.f134782al)) {
            mo96786a("parent_tag_id", this.f134782al);
        }
        mo96787a("is_highlighted", this.f134766aM);
        mo96785a("rank_index", this.f134767aN);
        mo96785a("is_promoted", this.f134768aO);
        if (!TextUtils.isEmpty(this.f134769aP)) {
            mo96786a("playlist_id", this.f134769aP);
        }
        if (!TextUtils.isEmpty(this.f134783am)) {
            mo96786a("category_name", this.f134783am);
        }
        mo96785a("is_long", this.f134770aQ);
        int i3 = this.f134784an;
        if (i3 != -1) {
            mo96785a("follow_status_to_user", i3);
        }
        if (!TextUtils.isEmpty(this.f134785ao)) {
            mo96786a("story_type", this.f134785ao);
        }
        if (!TextUtils.isEmpty(this.f134786ap)) {
            mo96786a("story_collection_id", this.f134786ap);
        }
        mo96785a("is_emoji_react", this.f134787aq);
        if (!TextUtils.isEmpty(this.f134788ar) && (TextUtils.equals(this.f134788ar, "click_comment_chain") || TextUtils.equals(this.f134788ar, "click_comment_bubble") || TextUtils.equals(this.f134788ar, "push"))) {
            mo96786a("comment_enter_method", this.f134788ar);
            mo96786a("last_group_id", this.f134789as);
        } else if (!TextUtils.isEmpty(this.f134788ar) && TextUtils.equals(this.f134788ar, "notification_page")) {
            mo96786a("comment_enter_method", "notification");
            mo96786a("last_group_id", this.f134789as);
        } else if (!TextUtils.isEmpty(this.f134788ar) && TextUtils.equals(this.f134788ar, UGCMonitor.EVENT_COMMENT)) {
            mo96786a("comment_enter_method", "comment_panel");
            mo96786a("last_group_id", this.f134789as);
        }
    }

    /* renamed from: a */
    public final C59210ae mo96747a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: o */
    public final C59210ae mo96750o(String str) {
        this.f135173l = str;
        return this;
    }

    /* renamed from: f */
    public final C59210ae mo96749g(Aweme aweme) {
        String str;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f134754aA = aweme;
            this.f134796az = aweme.getAid();
            this.f134794ax = aweme.getAid();
            this.f134795ay = aweme.getAuthorUid();
            this.f134755aB = C59208ac.m108776j(aweme);
            this.f134757aD = C59208ac.m108773g(aweme);
            this.f134758aE = aweme.getRepostFromGroupId();
            this.f134759aF = aweme.getRepostFromUserId();
            if (C80580in.m139680a(aweme)) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            this.f134762aI = str;
            if (aweme.getAuthor() != null) {
                this.f134763aJ = aweme.getAuthor().getFollowStatus();
            }
            if (aweme.getMixInfo() != null) {
                this.f134760aG = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f134761aH = aweme.getMutualRelation().getMutualType();
            }
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            this.f134765aL = aweme.getRelationRecommendInfo();
            this.f134766aM = aweme.isHighlighted();
            this.f134767aN = aweme.getOriginalPos();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f134768aO = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.f134769aP = aweme.playlist_info.getMixId();
            }
            C80409eu.m139391a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f134770aQ = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f134770aQ = 1;
            }
        }
        return this;
    }
}
