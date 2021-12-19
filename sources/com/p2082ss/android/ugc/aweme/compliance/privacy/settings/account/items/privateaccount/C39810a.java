package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39660c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39727a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.verification.C68706b;
import com.p2082ss.android.ugc.aweme.setting.verification.C68707c;
import com.p2082ss.android.ugc.aweme.setting.verification.VerificationResponse;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a */
public final class C39810a {

    /* renamed from: a */
    public static final C39810a f93726a = new C39810a();

    private C39810a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a$b */
    static final class C39813b implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C68707c f93730a;

        static {
            Covode.recordClassIndex(47544);
        }

        C39813b(C68707c cVar) {
            this.f93730a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f93730a.f153712a.mo142944a();
        }
    }

    static {
        Covode.recordClassIndex(47541);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a$a */
    static final class C39811a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C68707c f93727a;

        /* renamed from: b */
        final /* synthetic */ User f93728b;

        static {
            Covode.recordClassIndex(47542);
        }

        C39811a(C68707c cVar, User user) {
            this.f93727a = cVar;
            this.f93728b = user;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<VerificationResponse> vVar) {
            C89219l.m154721d(vVar, "");
            C68707c cVar = this.f93727a;
            User user = this.f93728b;
            C398121 r1 = new C68706b() {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39810a.C39811a.C398121 */

                static {
                    Covode.recordClassIndex(47543);
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.verification.C68706b
                /* renamed from: a */
                public final void mo69127a(VerificationResponse verificationResponse) {
                    C89219l.m154721d(verificationResponse, "");
                    vVar.mo143031a(verificationResponse);
                    vVar.mo143023a();
                }
            };
            C89219l.m154721d(user, "");
            C89219l.m154721d(r1, "");
            cVar.mo109186a(C68707c.C68708a.m121145b(), user, r1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a$c */
    static final class C39814c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f93731a;

        static {
            Covode.recordClassIndex(47545);
        }

        C39814c(boolean z) {
            this.f93731a = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39631a.m80490f().mo57069e().updateCurSecret(this.f93731a);
            C39258q b = C39659b.m80540b();
            if (b != null) {
                b.f92749h = this.f93731a ? 1 : 0;
            } else {
                b = null;
            }
            C39660c.m80544a(b);
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<BaseResponse> m80730a(boolean z, boolean z2) {
        AbstractC88979t<BaseResponse> b = C39727a.f93575a.setPrivateAccount("private_account", z ? 1 : 0, z2 ? 1 : 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(new C39814c(z));
        C89219l.m154716b(b, "");
        return b;
    }
}
