package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.C39745b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a */
public abstract class AbstractC39943a extends AbstractC39856a<BasePrivacySettingViewModel> {

    /* renamed from: b */
    public static final C39944a f93934b = new C39944a((byte) 0);

    /* renamed from: e */
    private final AbstractC89244h f93935e;

    static {
        Covode.recordClassIndex(47703);
    }

    /* renamed from: f */
    private final Keva m80916f() {
        return (Keva) this.f93935e.getValue();
    }

    /* renamed from: e */
    public abstract String mo69168e();

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$a */
    public static final class C39944a {
        static {
            Covode.recordClassIndex(47704);
        }

        private C39944a() {
        }

        public /* synthetic */ C39944a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$b */
    static final class C39945b extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39943a f93936a;

        static {
            Covode.recordClassIndex(47705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39945b(AbstractC39943a aVar) {
            super(0);
            this.f93936a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoFromSp(this.f93936a.f93566d, "compliance_setting", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$c */
    static final class C39946c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39943a f93937a;

        /* renamed from: b */
        final /* synthetic */ int f93938b;

        static {
            Covode.recordClassIndex(47706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39946c(AbstractC39943a aVar, int i) {
            super(1);
            this.f93937a = aVar;
            this.f93938b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.ept, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a.C39946c.C399471 */

                /* renamed from: a */
                final /* synthetic */ C39946c f93939a;

                static {
                    Covode.recordClassIndex(47707);
                }

                {
                    this.f93939a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f93939a.f93937a.mo69149b(this.f93939a.f93938b);
                    C39745b.C39750e.m80631a(this.f93939a.f93937a.mo69168e(), true);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.eps, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a.C39946c.C399482 */

                /* renamed from: a */
                final /* synthetic */ C39946c f93940a;

                static {
                    Covode.recordClassIndex(47708);
                }

                {
                    this.f93940a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C39745b.C39750e.m80631a(this.f93940a.f93937a.mo69168e(), false);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: b */
    public final void mo69149b(int i) {
        String str;
        super.mo69149b(i);
        String e = mo69168e();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        C89219l.m154721d(e, "");
        C33744d a = new C33744d().mo59983a("account_type", e);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C39162r.m79460a("account_auth_switch", a.mo59983a("to_status", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: a */
    public final boolean mo69147a(int i) {
        if (i == 1) {
            StringBuilder sb = new StringBuilder("has_show_dialog_for_sug_");
            IAccountUserService e = C39631a.m80490f().mo57069e();
            C89219l.m154716b(e, "");
            String sb2 = sb.append(e.getCurSecUserId()).toString();
            if (!m80916f().getBoolean(sb2, false)) {
                C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(this.f93566d).mo37479a(R.string.epv).mo37483b(R.string.epu), new C39946c(this, i)).mo37405a().mo37396b().show();
                m80916f().storeBoolean(sb2, true);
                String e2 = mo69168e();
                C89219l.m154721d(e2, "");
                C39162r.m79460a("account_auth_pop_up", new C33744d().mo59983a("account_type", e2).f79943a);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractC39943a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel r3, androidx.fragment.app.Fragment r4) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r1)
            android.content.Context r0 = r4.getContext()
            if (r0 != 0) goto L_0x0011
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0011:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$b r0 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$b
            r0.<init>(r2)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r2.f93935e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, androidx.fragment.app.Fragment):void");
    }
}
