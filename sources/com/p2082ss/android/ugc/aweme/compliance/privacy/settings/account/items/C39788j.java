package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39247h;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.C68570bv;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.j */
public final class C39788j extends AbstractC39751a implements AbstractC39718e.AbstractC39719a {

    /* renamed from: a */
    public final PrivacySettingViewModel f93675a;

    /* renamed from: b */
    private final AbstractC89244h f93676b = C89250i.m154773a((AbstractC89171a) C39790b.f93680a);

    /* renamed from: c */
    private final int f93677c = R.string.n8;

    /* renamed from: d */
    private final int f93678d = R.raw.icon_heart;

    static {
        Covode.recordClassIndex(47518);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return (C39256o) this.f93676b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93677c;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.j$b */
    static final class C39790b extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39790b f93680a = new C39790b();

        static {
            Covode.recordClassIndex(47520);
        }

        C39790b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "favorite");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93678d);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        boolean f = C68432f.f153189a.mo108870f();
        if (!super.mo69103d() || f) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e.AbstractC39719a
    /* renamed from: a */
    public final void mo69100a(AbstractC39718e eVar) {
        C89219l.m154721d(eVar, "");
        this.f93675a.f93548c.observe(eVar, C39789a.f93679a);
    }

    public C39788j(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93675a = privacySettingViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.j$a */
    static final class C39789a<T> implements AbstractC1214u {

        /* renamed from: a */
        public static final C39789a f93679a = new C39789a();

        static {
            Covode.recordClassIndex(47519);
        }

        C39789a() {
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C39247h hVar;
            C39258q qVar = (C39258q) obj;
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Integer> c = sVar.mo60059c();
            C89219l.m154716b(c, "");
            if (qVar == null || (hVar = qVar.f92744c) == null) {
                num = null;
            } else {
                num = Integer.valueOf(hVar.f92705a);
            }
            c.mo59940b(num);
            AbstractC81915c.m141874a(new C68570bv());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_liked_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
        SmartRouter.buildRoute(context, "//mylikelistcontrol/setting").open(7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69095a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h r7, int r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.C39788j.mo69095a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h, int):void");
    }
}
