package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.compliance.common.p2660a.C39605a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.c */
public final class C39929c {

    /* renamed from: a */
    static final QAProfileEntranceApi f93906a = ((QAProfileEntranceApi) RetrofitFactory.m33635a().mo28816a(C39605a.f93367a).mo28858a(QAProfileEntranceApi.class));

    /* renamed from: b */
    public static final C39929c f93907b = new C39929c();

    private C39929c() {
    }

    static {
        Covode.recordClassIndex(47679);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.c$a */
    static final class C39930a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39930a f93908a = new C39930a();

        static {
            Covode.recordClassIndex(47680);
        }

        C39930a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/aweme/v1/user/proaccount/edit/", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.c$b */
    static final class C39931b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39931b f93909a = new C39931b();

        static {
            Covode.recordClassIndex(47681);
        }

        C39931b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/aweme/v1/user/proaccount/edit/", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }
}
