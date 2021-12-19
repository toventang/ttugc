package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.metrics.q */
public final class C59252q extends AbstractC59203a<C59252q> {

    /* renamed from: X */
    public String f135284X;

    /* renamed from: Y */
    public String f135285Y;

    /* renamed from: Z */
    public String f135286Z;

    /* renamed from: aa */
    public boolean f135287aa;

    /* renamed from: ab */
    public int f135288ab;

    /* renamed from: ac */
    public String f135289ac;

    /* renamed from: ad */
    public String f135290ad;

    /* renamed from: ae */
    public String f135291ae;

    /* renamed from: af */
    private Aweme f135292af;

    /* renamed from: ag */
    private String f135293ag;

    /* renamed from: ah */
    private String f135294ah;

    /* renamed from: ai */
    private String f135295ai;

    /* renamed from: aj */
    private int f135296aj;

    /* renamed from: ak */
    private String f135297ak;

    /* renamed from: al */
    private String f135298al;

    /* renamed from: am */
    private int f135299am;

    /* renamed from: an */
    private boolean f135300an;

    /* renamed from: ao */
    private String f135301ao;

    /* renamed from: ap */
    private String f135302ap;

    /* renamed from: aq */
    private String f135303aq;

    /* renamed from: ar */
    private String f135304ar;

    /* renamed from: as */
    private String f135305as;

    /* renamed from: at */
    private int f135306at;

    /* renamed from: au */
    private boolean f135307au;

    /* renamed from: av */
    private AwemeRelationRecommendModel f135308av;

    /* renamed from: aw */
    private int f135309aw;

    /* renamed from: ax */
    private boolean f135310ax;

    /* renamed from: ay */
    private int f135311ay;

    /* renamed from: e */
    public String f135312e;

    /* renamed from: p */
    public String f135313p;

    /* renamed from: q */
    public String f135314q;

    /* renamed from: r */
    public String f135315r;

    /* renamed from: s */
    public String f135316s;

    /* renamed from: t */
    public String f135317t;

    /* renamed from: u */
    public String f135318u;

    /* renamed from: v */
    public String f135319v;

    static {
        Covode.recordClassIndex(69615);
    }

    public C59252q() {
        super("enter_personal_detail");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        String str2;
        mo96790a("group_id", this.f135312e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135313p, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("to_user_id", this.f135314q, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("request_id", this.f135315r, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("req_id", this.f135316s, AbstractC59233c.AbstractC59234a.f135178b);
        mo96788a(ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f135292af, this.f135293ag));
        mo96786a("is_reposted", new StringBuilder().append(this.f135296aj).toString());
        mo96786a("repost_from_group_id", this.f135297ak);
        mo96786a("repost_from_user_id", this.f135298al);
        mo96786a("is_original_author_homepage", new StringBuilder().append(this.f135299am).toString());
        mo96786a("relation_tag", new StringBuilder().append(this.f135288ab).toString());
        if (this.f135307au) {
            str = "1";
        } else {
            str = "0";
        }
        mo96786a("is_live_record", str);
        if (C65724g.m117661a().mo104866a(this.f135312e)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        } else if (!TextUtils.isEmpty(this.f135285Y)) {
            mo96790a("previous_page", this.f135285Y, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("previous_page_position", this.f135286Z, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135287aa) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135315r);
        }
        if (!TextUtils.isEmpty(this.f135318u)) {
            mo96790a(this.f135318u, this.f135319v, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135317t)) {
            mo96790a("playlist_type", this.f135317t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135284X)) {
            mo96790a("scene_id", this.f135284X, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135294ah)) {
            mo96790a("impr_type", this.f135294ah, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135295ai)) {
            mo96790a("compilation_id", this.f135295ai, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135303aq)) {
            mo96790a("card_type", this.f135303aq, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f135300an) {
                str2 = "follow";
            } else {
                str2 = "unfollow";
            }
            mo96786a("relation_type", str2);
            mo96786a("video_type", this.f135301ao);
            mo96786a("rec_uid", this.f135302ap);
        }
        if (!TextUtils.isEmpty(this.f135304ar)) {
            mo96790a("rec_user_type", this.f135304ar, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135305as)) {
            mo96786a("follow_status", this.f135305as);
        }
        if (!TextUtils.isEmpty(this.f135228x)) {
            mo96786a("tab_name", this.f135228x);
        }
        if (C51487e.m95905b() && this.f135306at != 0) {
            mo96786a("is_avatar", C51487e.m95906c());
        }
        if (TextUtils.equals(this.f135169h, "general_search") || TextUtils.equals(this.f135169h, "search_result") || TextUtils.equals(this.f135169h, "trending_page")) {
            if (!TextUtils.isEmpty(this.f135289ac)) {
                mo96786a("user_tag", this.f135289ac);
            } else {
                mo96786a("user_tag", "");
            }
            if (!TextUtils.isEmpty(this.f135215O)) {
                mo96786a("search_id", this.f135215O);
            } else if (!TextUtils.isEmpty(this.f135210J)) {
                mo96786a("search_id", this.f135210J);
            } else {
                mo96786a("search_id", this.f135315r);
            }
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135308av;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f135308av.getFriendTypeStr());
        }
        mo96787a("is_highlighted", this.f135310ax);
        mo96785a("rank_index", this.f135311ay);
        mo96785a("is_promoted", this.f135309aw);
        mo96786a("category_name", this.f135290ad);
        String str3 = this.f135291ae;
        if (str3 != null && !"".equals(str3)) {
            mo96786a("new_sug_session_id", this.f135291ae);
        }
    }

    /* renamed from: o */
    public final C59252q mo96825o(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: a */
    public final C59252q mo96822a(User user) {
        return (C59252q) C80409eu.m139391a(this, user);
    }

    /* renamed from: f */
    public final C59252q mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135315r = C59208ac.m108763b(aweme);
            m108918h(aweme);
        }
        return this;
    }

    /* renamed from: h */
    private void m108918h(Aweme aweme) {
        int i;
        boolean z;
        if (aweme != null) {
            this.f135292af = aweme;
            this.f135312e = aweme.getAid();
            this.f135313p = m108854c(aweme);
            this.f135314q = aweme.getAuthorUid();
            if (aweme.getAuthor() != null) {
                i = aweme.getAuthor().getFollowStatus();
            } else {
                i = -2;
            }
            this.f135288ab = i;
            this.f135294ah = C59208ac.m108776j(aweme);
            if (aweme.getMixInfo() != null) {
                this.f135295ai = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.f135306at = aweme.getMutualRelation().getMutualType();
            }
            this.f135300an = C80580in.m139680a(aweme);
            this.f135301ao = C59208ac.m108777k(aweme);
            this.f135302ap = C59208ac.m108778l(aweme);
            this.f135305as = C59205aa.m108754a(aweme);
            this.f135203C = C59208ac.m108779m(aweme);
            this.f135204D = C59208ac.m108780n(aweme);
            if (aweme.getAwemeType() == 63) {
                z = true;
            } else {
                z = false;
            }
            this.f135307au = z;
            this.f135308av = aweme.getRelationRecommendInfo();
            this.f135310ax = aweme.isHighlighted();
            this.f135311ay = aweme.getOriginalPos();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.f135309aw = 1;
            }
            mo96822a(aweme.getAuthor());
        }
    }

    /* renamed from: c */
    public final C59252q mo96823c(Aweme aweme, int i) {
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135315r = m108852a(aweme, i);
            m108918h(aweme);
        }
        return this;
    }
}
