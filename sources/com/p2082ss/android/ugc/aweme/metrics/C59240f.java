package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.f */
public final class C59240f extends AbstractC59242h<C59240f> {

    /* renamed from: X */
    private String f135183X;

    /* renamed from: Y */
    private Aweme f135184Y;

    /* renamed from: Z */
    private int f135185Z;

    /* renamed from: a */
    public String f135186a;

    /* renamed from: aa */
    private String f135187aa;

    /* renamed from: ab */
    private String f135188ab;

    /* renamed from: ac */
    private boolean f135189ac;

    /* renamed from: b */
    public String f135190b;

    /* renamed from: c */
    public int f135191c;

    /* renamed from: d */
    public String f135192d;

    /* renamed from: e */
    public String f135193e;

    /* renamed from: p */
    public String f135194p;

    /* renamed from: q */
    public String f135195q;

    /* renamed from: r */
    public int f135196r;

    /* renamed from: s */
    public String f135197s;

    /* renamed from: t */
    public String f135198t;

    /* renamed from: u */
    public Boolean f135199u;

    /* renamed from: v */
    public String f135200v;

    static {
        Covode.recordClassIndex(69603);
    }

    public C59240f() {
        super("click_more_button");
        this.f135199u = false;
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        AwemeTrendingBar trendingBarFYP;
        mo96790a("group_id", this.f135186a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135190b, AbstractC59233c.AbstractC59234a.f135178b);
        if (this.f135184Y != null) {
            mo96788a(ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f135184Y, this.f135183X));
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(C59208ac.m108763b(this.f135184Y));
        }
        if (this.f135185Z != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f135185Z).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135193e)) {
            mo96790a(this.f135193e, this.f135194p, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135192d)) {
            mo96790a("playlist_type", this.f135192d, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135197s)) {
            mo96790a("log_pb", this.f135197s, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135195q)) {
            mo96790a("prop_id", this.f135195q, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135188ab)) {
            mo96786a("enter_method", this.f135188ab);
        }
        if (this.f135196r != 0) {
            mo96790a("scene_id", new StringBuilder().append(this.f135196r).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (this.f135189ac) {
            str = "1";
        } else {
            str = "0";
        }
        mo96786a("is_horizontal_screen", str);
        mo96790a("previous_page", this.f135198t, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f135187aa)) {
            mo96790a("impr_type", this.f135187aa, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96786a("request_id", C59208ac.m108763b(this.f135184Y));
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", "1");
        }
        if (this.f135199u.booleanValue()) {
            mo96786a("story_type", "story");
        } else {
            mo96786a("story_type", UGCMonitor.TYPE_POST);
        }
        Aweme aweme = this.f135184Y;
        if (!(aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || this.f135191c != 30)) {
            Map<String, String> trackMap = trendingBarFYP.getTrackMap();
            mo96786a("enter_from", "trending_inflow_page");
            mo96786a("trending_entrance", "homepage_hot_trending_bar");
            mo96786a("group_id", this.f135186a);
            mo96786a("trending_topic", trendingBarFYP.getEventKeyword());
            mo96786a("trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
            mo96786a("trending_topic_source", trackMap.get("trending_topic_source"));
            mo96786a("topic_rank", trackMap.get("topic_rank"));
            mo96786a("topic_group_rank", trackMap.get("topic_group_rank"));
            mo96786a("topic_group_num", trackMap.get("topic_group_num"));
        }
        if (!TextUtils.isEmpty(this.f135200v)) {
            mo96786a("story_collection_id", this.f135200v);
        }
    }

    /* renamed from: a */
    public final C59240f mo96797a(String str) {
        this.f135169h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: b_ */
    public final /* bridge */ /* synthetic */ C59240f mo96752b_(String str) {
        this.f135200v = str;
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59240f(boolean r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "click_share_button"
        L_0x0004:
            r1.<init>(r0)
            r0 = 0
            r1.f135185Z = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.f135199u = r0
            r0 = 1
            r1.f135172k = r0
            return
        L_0x0014:
            java.lang.String r0 = "click_more_button"
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.metrics.C59240f.<init>(boolean):void");
    }

    /* renamed from: f */
    public final C59240f mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135184Y = aweme;
            this.f135186a = aweme.getAid();
            this.f135187aa = C59208ac.m108776j(aweme);
        }
        return this;
    }
}
