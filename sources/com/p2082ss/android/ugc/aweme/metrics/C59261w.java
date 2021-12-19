package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.push.C65724g;

/* renamed from: com.ss.android.ugc.aweme.metrics.w */
public final class C59261w extends AbstractC59242h<C59261w> {

    /* renamed from: a */
    public String f135413a;

    /* renamed from: b */
    public String f135414b;

    /* renamed from: c */
    public String f135415c;

    /* renamed from: d */
    public String f135416d;

    /* renamed from: e */
    private String f135417e;

    /* renamed from: p */
    private String f135418p;

    /* renamed from: q */
    private String f135419q;

    /* renamed from: r */
    private String f135420r;

    /* renamed from: s */
    private String f135421s;

    static {
        Covode.recordClassIndex(69624);
    }

    public C59261w() {
        super("unlogin_follow");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("previous_page", this.f135413a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("previous_page_position", this.f135414b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f135416d, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("to_user_id", this.f135415c, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("group_id", this.f135417e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135415c, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("request_id", this.f135418p, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("enter_type", this.f135420r, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f135419q)) {
            mo96790a("enter_from_request", this.f135419q, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (C59208ac.m108762a(this.f135169h) || "homepage_hot".equals(this.f135413a)) {
            mo96794h(this.f135418p);
        }
        if (!TextUtils.equals(this.f135167f, "follow_cancel")) {
            TextUtils.equals(this.f135167f, "unlogin_follow");
        }
        if (C65724g.m117661a().mo104866a(this.f135417e)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135421s)) {
            mo96790a("impr_type", this.f135421s, AbstractC59233c.AbstractC59234a.f135177a);
        }
    }

    /* renamed from: a */
    public final C59261w mo96850a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: c */
    public final C59261w mo96851c(Aweme aweme, int i) {
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135417e = aweme.getAid();
            this.f135418p = m108852a(aweme, i);
            this.f135415c = aweme.getAuthorUid();
            this.f135421s = C59208ac.m108776j(aweme);
        }
        return this;
    }
}
