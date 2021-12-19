package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.metrics.r */
public final class C59253r extends AbstractC59203a<C59253r> {

    /* renamed from: X */
    public String f135320X;

    /* renamed from: Y */
    public String f135321Y;

    /* renamed from: Z */
    public boolean f135322Z;

    /* renamed from: aa */
    public String f135323aa;

    /* renamed from: ab */
    public String f135324ab;

    /* renamed from: ac */
    private String f135325ac;

    /* renamed from: ad */
    private String f135326ad;

    /* renamed from: ae */
    private String f135327ae;

    /* renamed from: af */
    private Aweme f135328af;

    /* renamed from: ag */
    private String f135329ag;

    /* renamed from: ah */
    private String f135330ah;

    /* renamed from: ai */
    private String f135331ai;

    /* renamed from: aj */
    private String f135332aj;

    /* renamed from: ak */
    private boolean f135333ak;

    /* renamed from: al */
    private String f135334al;

    /* renamed from: am */
    private String f135335am;

    /* renamed from: an */
    private String f135336an;

    /* renamed from: ao */
    private String f135337ao;

    /* renamed from: e */
    public String f135338e;

    /* renamed from: p */
    public String f135339p;

    /* renamed from: q */
    public String f135340q;

    /* renamed from: r */
    public String f135341r;

    /* renamed from: s */
    public String f135342s;

    /* renamed from: t */
    public String f135343t;

    /* renamed from: u */
    public String f135344u;

    /* renamed from: v */
    public String f135345v;

    static {
        Covode.recordClassIndex(69616);
    }

    public C59253r() {
        super("enter_tag_detail");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        mo96790a("group_id", this.f135338e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135339p, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("tag_id", this.f135340q, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("request_id", this.f135325ac, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("category_name", this.f135324ab, AbstractC59233c.AbstractC59234a.f135177a);
        try {
            this.f135337ao = ChallengeUtilApi.m108746a(this.f135340q);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!C13627m.m24498a(this.f135326ad)) {
            mo96790a("content_type", this.f135326ad, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96788a(ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f135328af, this.f135327ae));
        if (C65724g.m117661a().mo104866a(this.f135338e)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        } else if (!TextUtils.isEmpty(this.f135320X)) {
            mo96790a("previous_page", this.f135320X, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("previous_page_position", this.f135321Y, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135322Z) {
            mo96790a("is_instructive", "1", AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", "1", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135325ac);
        }
        if (!TextUtils.isEmpty(this.f135344u)) {
            mo96790a(this.f135344u, this.f135345v, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (!TextUtils.isEmpty(this.f135343t)) {
            mo96790a("playlist_type", this.f135343t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135329ag)) {
            mo96790a("impr_type", this.f135329ag, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135330ah)) {
            mo96790a("compilation_id", this.f135330ah, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96786a("impr_id", this.f135325ac);
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f135331ai)) {
            mo96790a("search_keyword", this.f135331ai, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f135333ak) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo96786a("relation_type", str);
            mo96786a("video_type", this.f135334al);
            mo96786a("rec_uid", this.f135335am);
        }
        String str2 = this.f135341r;
        if (!TextUtils.isEmpty(str2)) {
            mo96786a("process_id", str2);
        }
        if (!TextUtils.isEmpty(this.f135228x)) {
            mo96786a("tab_name", this.f135228x);
        }
        if (!TextUtils.isEmpty(this.f135336an)) {
            mo96786a("hashtag", this.f135336an);
        }
        if (!TextUtils.isEmpty(this.f135323aa)) {
            mo96786a("parent_tag_id", this.f135323aa);
        }
        if (!TextUtils.isEmpty(this.f135332aj)) {
            mo96786a("search_type", this.f135332aj);
        }
        if (!TextUtils.isEmpty(this.f135342s)) {
            mo96786a("tag_line", this.f135342s);
        }
        if (!TextUtils.isEmpty(this.f135229y)) {
            mo96786a("order", this.f135229y);
        }
        mo96785a("is_bundled", !TextUtils.isEmpty(this.f135337ao) ? 1 : 0);
        if (!TextUtils.isEmpty(this.f135337ao)) {
            mo96786a("prop_id", this.f135337ao);
        }
    }

    /* renamed from: o */
    public final C59253r mo96827o(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: p */
    public final C59253r mo96828p(String str) {
        if (!C13627m.m24498a(str)) {
            this.f135325ac = str;
        }
        return this;
    }

    /* renamed from: f */
    public final C59253r mo96749g(Aweme aweme) {
        String str;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135328af = aweme;
            this.f135338e = aweme.getAid();
            if (TextUtils.isEmpty(this.f135325ac)) {
                this.f135325ac = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            this.f135339p = str;
            this.f135326ad = C59208ac.m108773g(aweme);
            this.f135329ag = C59208ac.m108776j(aweme);
            if (aweme.getMixInfo() != null) {
                this.f135330ah = aweme.getMixInfo().mixId;
            }
            this.f135333ak = C80580in.m139680a(aweme);
            this.f135334al = C59208ac.m108777k(aweme);
            this.f135335am = C59208ac.m108778l(aweme);
        }
        return this;
    }
}
