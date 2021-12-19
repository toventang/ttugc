package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.p3001e.C51078a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.am */
public final class C59218am extends AbstractC59242h<C59218am> {

    /* renamed from: a */
    public String f134899a;

    /* renamed from: b */
    public String f134900b;

    /* renamed from: c */
    public String f134901c;

    /* renamed from: d */
    public String f134902d;

    /* renamed from: e */
    public String f134903e;

    /* renamed from: p */
    public String f134904p;

    /* renamed from: q */
    public String f134905q;

    /* renamed from: r */
    public String f134906r;

    /* renamed from: s */
    protected String f134907s;

    /* renamed from: t */
    private String f134908t;

    /* renamed from: u */
    private Aweme f134909u;

    static {
        Covode.recordClassIndex(69581);
    }

    public C59218am() {
        super("stay_time");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("duration", this.f134899a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f134907s, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("group_id", this.f134900b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("author_id", C59208ac.m108758a(this.f134909u), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("city_info", "", AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("page_uid", this.f134903e, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134902d)) {
            mo96790a("previous_page", this.f134902d, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134908t)) {
            mo96790a("page_type", this.f134908t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f134902d, "homepage_hot") || TextUtils.equals(this.f134902d, "homepage_follow")) {
            int i = !TextUtils.equals(this.f134902d, "homepage_hot") ? 1 : 0;
            mo96790a("feeds_group_id", this.f134901c, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(this.f134901c, i)), AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108766b(this.f135169h)) {
            mo96786a("notice_type", C51078a.f117813a);
            mo96786a("show_cnt", String.valueOf(C51078a.f117814b));
            mo96786a("yellow_dot_logid", C51078a.f117815c);
        }
        if (TextUtils.equals("challenge", this.f135169h)) {
            String str = this.f134904p;
            String str2 = this.f134905q;
            mo96786a("process_id", str);
            mo96786a("tag_id", str2);
        }
        if (!TextUtils.isEmpty(this.f134906r)) {
            mo96786a("playlist_id", this.f134906r);
        }
    }

    /* renamed from: a */
    public final C59218am mo96758a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: o */
    public final C59218am mo96760o(String str) {
        this.f134907s = str;
        return this;
    }

    /* renamed from: f */
    public final C59218am mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        this.f134909u = aweme;
        this.f134900b = C59208ac.m108771e(aweme);
        if (!(aweme == null || aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
            this.f134906r = aweme.playlist_info.getMixId();
        }
        return this;
    }
}
