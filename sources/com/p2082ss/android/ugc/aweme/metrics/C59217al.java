package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;

/* renamed from: com.ss.android.ugc.aweme.metrics.al */
public final class C59217al extends AbstractC59233c {

    /* renamed from: A */
    private String f134875A;

    /* renamed from: B */
    private String f134876B;

    /* renamed from: C */
    private String f134877C;

    /* renamed from: D */
    private String f134878D;

    /* renamed from: E */
    private String f134879E;

    /* renamed from: F */
    private Aweme f134880F;

    /* renamed from: G */
    private String f134881G;

    /* renamed from: H */
    private String f134882H;

    /* renamed from: a */
    public String f134883a;

    /* renamed from: b */
    public String f134884b;

    /* renamed from: c */
    public String f134885c;

    /* renamed from: d */
    public String f134886d;

    /* renamed from: e */
    public String f134887e;

    /* renamed from: p */
    public String f134888p;

    /* renamed from: q */
    public String f134889q;

    /* renamed from: r */
    private String f134890r;

    /* renamed from: s */
    private String f134891s;

    /* renamed from: t */
    private String f134892t;

    /* renamed from: u */
    private String f134893u;

    /* renamed from: v */
    private String f134894v;

    /* renamed from: w */
    private Long f134895w;

    /* renamed from: x */
    private String f134896x;

    /* renamed from: y */
    private String f134897y;

    /* renamed from: z */
    private String f134898z;

    static {
        Covode.recordClassIndex(69580);
    }

    public C59217al() {
        super("client_show");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        if (!TextUtils.isEmpty(this.f134890r)) {
            mo96786a("content_type", this.f134890r);
        }
        if (!TextUtils.isEmpty(this.f134877C)) {
            mo96790a("rank_index", this.f134877C, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134878D)) {
            mo96790a("banner_id", this.f134878D, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134879E)) {
            mo96790a("previous_page", this.f134879E, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("group_id", this.f134891s, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f134892t, AbstractC59233c.AbstractC59234a.f135178b);
        if (!TextUtils.isEmpty(this.f134882H)) {
            mo96790a("topic_name", this.f134882H, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134889q)) {
            mo96790a("tab_name", this.f134889q, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134893u)) {
            mo96786a("repost_from_group_id", this.f134893u);
        }
        if (!TextUtils.isEmpty(this.f134894v)) {
            mo96786a("repost_from_user_id", this.f134894v);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh")) {
            C81469a.m141252a();
        }
        if (TextUtils.equals(this.f135169h, "sticker_profile_detail")) {
            mo96790a("tab_name", "effect", AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("request_id", this.f134875A, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("content", this.f134898z, AbstractC59233c.AbstractC59234a.f135177a);
        if ("prop_page".equals(this.f135169h)) {
            mo96790a("prop_id", this.f134896x, AbstractC59233c.AbstractC59234a.f135178b);
            mo96790a("log_pb", C48027ac.C48028a.f111257a.mo80055a(this.f134875A), AbstractC59233c.AbstractC59234a.f135178b);
        } else {
            mo96790a("music_id", String.valueOf(this.f134895w), AbstractC59233c.AbstractC59234a.f135178b);
            if ("homepage_fresh".equals(this.f135169h) || "homepage_channel".equalsIgnoreCase(this.f135169h)) {
                mo96794h(this.f134875A);
            }
        }
        mo96790a("display", this.f134883a, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134876B)) {
            mo96790a("distance_km", this.f134876B, AbstractC59233c.AbstractC59234a.f135177a);
        }
        String str = this.f135169h;
        String str2 = this.f134885c;
        String str3 = this.f134887e;
        String str4 = this.f134886d;
        if (TextUtils.equals("challenge", str)) {
            mo96786a("process_id", str2);
            mo96786a("tag_id", str3);
            mo96786a("rank_index", str4);
        }
        if (!TextUtils.isEmpty(this.f134881G)) {
            mo96790a("parent_tag_id", this.f134888p, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134881G)) {
            mo96790a("page_type", this.f134881G, AbstractC59233c.AbstractC59234a.f135177a);
        }
    }

    /* renamed from: a */
    public final C59217al mo96756a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: c */
    public final C59217al mo96757c(Aweme aweme, int i) {
        this.f134880F = aweme;
        if (aweme != null) {
            this.f134890r = aweme.getLiveType();
            this.f134891s = aweme.getAid();
            this.f134892t = m108854c(aweme);
            this.f134875A = m108852a(aweme, i);
            this.f134898z = m108855d(aweme);
            this.f134895w = m108856e(aweme);
            this.f134897y = aweme.getAid();
            if (aweme.isForwardAweme()) {
                this.f134893u = aweme.getRepostFromGroupId();
                this.f134894v = aweme.getRepostFromUserId();
            }
            if (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 9) {
                this.f134882H = aweme.getHotListStruct().getTitile();
            }
        }
        return this;
    }
}
