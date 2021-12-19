package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.push.C65724g;

/* renamed from: com.ss.android.ugc.aweme.metrics.z */
public final class C59264z extends AbstractC59242h<C59264z> {

    /* renamed from: a */
    public String f135470a;

    /* renamed from: b */
    public String f135471b;

    /* renamed from: c */
    public int f135472c;

    /* renamed from: d */
    public int f135473d;

    /* renamed from: e */
    public int f135474e;

    /* renamed from: p */
    private String f135475p;

    /* renamed from: q */
    private String f135476q;

    static {
        Covode.recordClassIndex(69627);
    }

    public C59264z() {
        super("unlogin_like");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("group_id", this.f135470a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135475p, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("request_id", this.f135476q, AbstractC59233c.AbstractC59234a.f135178b);
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135476q);
        }
        if (!TextUtils.equals(this.f135167f, "like_cancel")) {
            TextUtils.equals(this.f135167f, "unlogin_like");
        }
        if (C65724g.m117661a().mo104866a(this.f135470a)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135471b)) {
            mo96790a("enter_method", this.f135471b, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("is_first", String.valueOf(this.f135472c), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("is_login_notify", String.valueOf(this.f135473d), AbstractC59233c.AbstractC59234a.f135177a);
    }

    /* renamed from: a */
    public final C59264z mo96855a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: f */
    public final C59264z mo96749g(Aweme aweme) {
        String a;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135470a = aweme.getAid();
            this.f135475p = m108854c(aweme);
            if (TextUtils.isEmpty(C59208ac.m108759a(aweme, this.f135474e))) {
                a = aweme.getRequestId();
            } else {
                a = C59208ac.m108759a(aweme, this.f135474e);
            }
            this.f135476q = a;
        }
        return this;
    }
}
