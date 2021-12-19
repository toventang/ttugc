package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;

/* renamed from: com.ss.android.ugc.aweme.metrics.v */
public final class C59260v extends AbstractC59242h<C59260v> {

    /* renamed from: X */
    public String f135369X;

    /* renamed from: Y */
    public String f135370Y;

    /* renamed from: Z */
    public String f135371Z = "";

    /* renamed from: a */
    public String f135372a;

    /* renamed from: aA */
    private boolean f135373aA;

    /* renamed from: aB */
    private String f135374aB = "";

    /* renamed from: aC */
    private int f135375aC;

    /* renamed from: aa */
    public int f135376aa = -1;

    /* renamed from: ab */
    public int f135377ab = -1;

    /* renamed from: ac */
    public AwemeRelationRecommendModel f135378ac;

    /* renamed from: ad */
    public boolean f135379ad;

    /* renamed from: ae */
    public int f135380ae = -1;

    /* renamed from: af */
    public String f135381af = "";

    /* renamed from: ag */
    public String f135382ag;

    /* renamed from: ah */
    public int f135383ah;

    /* renamed from: ai */
    private String f135384ai;

    /* renamed from: aj */
    private String f135385aj;

    /* renamed from: ak */
    private String f135386ak;

    /* renamed from: al */
    private String f135387al;

    /* renamed from: am */
    private String f135388am;

    /* renamed from: an */
    private String f135389an;

    /* renamed from: ao */
    private int f135390ao;

    /* renamed from: ap */
    private String f135391ap;

    /* renamed from: aq */
    private String f135392aq;

    /* renamed from: ar */
    private int f135393ar;

    /* renamed from: as */
    private String f135394as;

    /* renamed from: at */
    private String f135395at;

    /* renamed from: au */
    private String f135396au;

    /* renamed from: av */
    private String f135397av;

    /* renamed from: aw */
    private String f135398aw;

    /* renamed from: ax */
    private String f135399ax;

    /* renamed from: ay */
    private String f135400ay;

    /* renamed from: az */
    private int f135401az = -1;

    /* renamed from: b */
    public String f135402b;

    /* renamed from: c */
    public String f135403c;

    /* renamed from: d */
    public boolean f135404d;

    /* renamed from: e */
    public String f135405e;

    /* renamed from: p */
    public String f135406p;

    /* renamed from: q */
    public String f135407q;

    /* renamed from: r */
    public String f135408r;

    /* renamed from: s */
    public String f135409s;

    /* renamed from: t */
    public String f135410t;

    /* renamed from: u */
    public String f135411u;

    /* renamed from: v */
    public String f135412v;

    static {
        Covode.recordClassIndex(69623);
    }

    public C59260v() {
        super("follow");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("scene_id", this.f135372a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page", this.f135402b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page_position", this.f135403c, AbstractC59233c.AbstractC59234a.f135177a);
        if (this.f135404d) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("enter_method", this.f135409s, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("to_user_id", this.f135405e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("group_id", this.f135406p, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135405e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135405e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("follow_type", this.f135412v, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("page_status", this.f135389an, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("request_id", this.f135407q, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("req_id", this.f135408r, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("enter_type", this.f135385aj, AbstractC59233c.AbstractC59234a.f135177a);
        mo96786a("is_reposted", new StringBuilder().append(this.f135390ao).toString());
        mo96786a("repost_from_group_id", this.f135391ap);
        mo96786a("repost_from_user_id", this.f135392aq);
        mo96785a("is_search_scene", this.f135383ah);
        if (!TextUtils.isEmpty(this.f135384ai)) {
            mo96790a("enter_from_request", this.f135384ai, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f135371Z)) {
            mo96786a("homepage_user_id", this.f135371Z);
        }
        if (C59208ac.m108762a(this.f135169h) || "homepage_hot".equals(this.f135402b) || "potential_friends".equals(this.f135402b) || "homepage_familiar".equals(this.f135402b)) {
            mo96794h(this.f135407q);
        }
        TextUtils.equals(this.f135167f, "follow_cancel");
        if (C65724g.m117661a().mo104866a(this.f135406p)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135387al)) {
            mo96790a(this.f135387al, this.f135388am, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135386ak)) {
            mo96790a("playlist_type", this.f135386ak, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (!TextUtils.isEmpty(this.f135411u)) {
            mo96790a("rule_id", this.f135411u, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135394as)) {
            mo96790a("impr_type", this.f135394as, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135395at)) {
            mo96790a("compilation_id", this.f135395at, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135398aw)) {
            mo96790a("card_type", this.f135398aw, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            mo96786a("video_type", this.f135397av);
        }
        if (!TextUtils.isEmpty(this.f135396au)) {
            mo96786a("search_keyword", this.f135396au);
        }
        if (C51487e.m95905b() && this.f135393ar != 0) {
            mo96786a("is_avatar", C51487e.m95906c());
        }
        if (TextUtils.equals(this.f135169h, "others_homepage") && !TextUtils.isEmpty(this.f135203C)) {
            mo96790a("rec_type", this.f135203C, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135399ax)) {
            mo96786a("cid", this.f135399ax);
        }
        if (!TextUtils.isEmpty(this.f135369X)) {
            mo96786a("tag_id", this.f135369X);
        }
        if (!TextUtils.isEmpty(this.f135370Y)) {
            mo96786a("parent_tag_id", this.f135370Y);
        }
        if (!TextUtils.isEmpty(this.f135400ay)) {
            mo96786a("log_extra", this.f135400ay);
        }
        int i = this.f135401az;
        if (i != -1) {
            mo96786a("is_child_mode", String.valueOf(i));
        }
        if (this.f135373aA) {
            mo96786a("is_live_record", "1");
        }
        int i2 = this.f135376aa;
        if (i2 != -1) {
            mo96786a("is_private", String.valueOf(i2));
        }
        int i3 = this.f135377ab;
        if (i3 != -1) {
            mo96786a("cancel_type", String.valueOf(i3));
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135378ac;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f135378ac.getFriendTypeStr());
        }
        mo96786a("is_highlighted", String.valueOf(this.f135379ad));
        mo96786a("rank_index", String.valueOf(this.f135380ae));
        if (!TextUtils.isEmpty(this.f135374aB)) {
            mo96786a("playlist_id", this.f135374aB);
        }
        if (!TextUtils.isEmpty(this.f135382ag)) {
            mo96786a("account_type", this.f135382ag);
        }
        if (!TextUtils.isEmpty(this.f135381af)) {
            mo96786a("category_name", this.f135381af);
        }
        String str = this.f135410t;
        if (str != null && !TextUtils.isEmpty(str)) {
            mo96786a("sub_page", this.f135410t);
        }
        mo96785a("is_long", this.f135375aC);
    }

    /* renamed from: a */
    public final C59260v mo96847a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: o */
    public final C59260v mo96849o(String str) {
        this.f135175n = str;
        return this;
    }

    /* renamed from: a */
    public final C59260v mo96846a(User user) {
        return (C59260v) C80409eu.m139391a(this, user);
    }

    public C59260v(String str) {
        super(str);
        this.f135172k = true;
    }

    /* renamed from: c */
    public final C59260v mo96848c(Aweme aweme, int i) {
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135406p = aweme.getAid();
            this.f135407q = m108852a(aweme, i);
            this.f135405e = aweme.getAuthorUid();
            this.f135394as = C59208ac.m108776j(aweme);
            if (aweme.getMixInfo() != null) {
                this.f135395at = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f135393ar = aweme.getMutualRelation().getMutualType();
            }
            this.f135397av = C59208ac.m108777k(aweme);
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            this.f135378ac = aweme.getRelationRecommendInfo();
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.f135374aB = aweme.playlist_info.getMixId();
            }
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.f135375aC = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.f135375aC = 1;
            }
        }
        return this;
    }
}
