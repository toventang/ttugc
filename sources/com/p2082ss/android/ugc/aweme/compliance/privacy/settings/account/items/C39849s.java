package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.s */
public final class C39849s extends AbstractC39751a {

    /* renamed from: a */
    private final C39256o f93786a;

    /* renamed from: b */
    private final AbstractC89244h f93787b = C89250i.m154773a((AbstractC89171a) C39851b.f93793a);

    /* renamed from: c */
    private final AbstractC89244h f93788c = C89250i.m154773a((AbstractC89171a) C39850a.f93792a);

    /* renamed from: d */
    private final AbstractC89244h f93789d = C89250i.m154773a((AbstractC89171a) C39852c.f93794a);

    /* renamed from: e */
    private final int f93790e;

    /* renamed from: f */
    private final int f93791f;

    static {
        Covode.recordClassIndex(47580);
    }

    /* renamed from: i */
    private C39256o m80756i() {
        return (C39256o) this.f93787b.getValue();
    }

    /* renamed from: j */
    private final C39256o m80757j() {
        return (C39256o) this.f93788c.getValue();
    }

    /* renamed from: k */
    private final C39256o m80758k() {
        return (C39256o) this.f93789d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return this.f93786a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93790e;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.s$a */
    static final class C39850a extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39850a f93792a = new C39850a();

        static {
            Covode.recordClassIndex(47581);
        }

        C39850a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "mention_notice");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.s$b */
    static final class C39851b extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39851b f93793a = new C39851b();

        static {
            Covode.recordClassIndex(47582);
        }

        C39851b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "mention");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.s$c */
    static final class C39852c extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39852c f93794a = new C39852c();

        static {
            Covode.recordClassIndex(47583);
        }

        C39852c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "tag");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93791f);
    }

    public C39849s() {
        int i;
        if (!C39699a.m80586b(m80758k()).f93536b || !C36410g.m74111b()) {
            i = R.string.d20;
        } else {
            i = R.string.d21;
        }
        this.f93790e = i;
        this.f93791f = R.raw.icon_at;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: c */
    public final boolean mo69102c() {
        if (C39699a.m80586b(m80756i()).f93535a || C39699a.m80586b(m80757j()).f93535a || C39699a.m80586b(m80758k()).f93535a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        if (C39699a.m80586b(m80756i()).f93536b || C39699a.m80586b(m80757j()).f93536b || C39699a.m80586b(m80758k()).f93536b) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_tag_mention_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
        SmartRouter.buildRoute(context, "aweme://mentioncontrol/setting").open();
    }
}
