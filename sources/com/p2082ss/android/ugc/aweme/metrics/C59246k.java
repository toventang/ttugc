package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;

/* renamed from: com.ss.android.ugc.aweme.metrics.k */
public final class C59246k extends AbstractC59242h<C59246k> {

    /* renamed from: X */
    private AwemeRelationRecommendModel f135234X;

    /* renamed from: a */
    public String f135235a;

    /* renamed from: b */
    public String f135236b;

    /* renamed from: c */
    public String f135237c;

    /* renamed from: d */
    public String f135238d;

    /* renamed from: e */
    public String f135239e;

    /* renamed from: p */
    public String f135240p;

    /* renamed from: q */
    public int f135241q;

    /* renamed from: r */
    public String f135242r;

    /* renamed from: s */
    public String f135243s;

    /* renamed from: t */
    public String f135244t;

    /* renamed from: u */
    private String f135245u;

    /* renamed from: v */
    private int f135246v;

    static {
        Covode.recordClassIndex(69609);
    }

    public C59246k() {
        super("dislike");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("group_id", this.f135235a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135236b, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("enter_method", this.f135237c, AbstractC59233c.AbstractC59234a.f135177a);
        if (C65724g.m117661a().mo104866a(this.f135235a)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135238d);
        }
        if (!TextUtils.isEmpty(this.f135245u)) {
            mo96790a("impr_type", this.f135245u, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135239e)) {
            mo96790a("content_type", this.f135239e, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135240p)) {
            mo96790a("display_method", this.f135240p, AbstractC59233c.AbstractC59234a.f135177a);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.f135234X;
        if (awemeRelationRecommendModel != null) {
            mo96786a("rec_type", awemeRelationRecommendModel.getRecType());
            mo96786a("relation_type", this.f135234X.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.f135244t)) {
            mo96790a("follow_status", this.f135244t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96786a("is_reposted", new StringBuilder().append(this.f135241q).toString());
        mo96786a("repost_from_group_id", this.f135242r);
        mo96786a("repost_from_user_id", this.f135243s);
        mo96785a("is_promoted", this.f135246v);
    }

    /* renamed from: a */
    public final C59246k mo96814a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: f */
    public final C59246k mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        this.f135245u = C59208ac.m108776j(aweme);
        if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
            this.f135246v = 1;
        }
        this.f135234X = aweme.getRelationRecommendInfo();
        C80409eu.m139391a(this, aweme.getAuthor());
        return this;
    }
}
