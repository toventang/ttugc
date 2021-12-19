package com.p2082ss.android.ugc.aweme.profile.widgets.p3586d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.p2082ss.android.ugc.aweme.donation.IDonationService;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.views.DonationLinkView;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a */
public final class C64649a extends AbstractC12769a {

    /* renamed from: k */
    public static final C64651b f146362k = new C64651b((byte) 0);

    /* renamed from: j */
    public C23226a f146363j;

    /* renamed from: l */
    private final C12786i f146364l = new C12786i(bW_(), new C64650a(this, null));

    /* renamed from: m */
    private DonationLinkView f146365m;

    static {
        Covode.recordClassIndex(76115);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a$b */
    public static final class C64651b {
        static {
            Covode.recordClassIndex(76117);
        }

        private C64651b() {
        }

        public /* synthetic */ C64651b(byte b) {
            this();
        }
    }

    /* renamed from: v */
    public final boolean mo104162v() {
        C64870a aVar = (C64870a) this.f146364l.getValue();
        if (aVar != null) {
            return aVar.f146660c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a$a */
    public static final class C64650a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146366a;

        /* renamed from: b */
        final /* synthetic */ String f146367b;

        static {
            Covode.recordClassIndex(76116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64650a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146366a = aVar;
            this.f146367b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146366a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146367b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3586d.C64649a.C64650a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a$e */
    static final class C64654e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64649a f146372a;

        static {
            Covode.recordClassIndex(76120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64654e(C64649a aVar) {
            super(1);
            this.f146372a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            this.f146372a.mo104161a((ProfileNgoStruct) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a$d */
    static final class C64653d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64649a f146371a;

        static {
            Covode.recordClassIndex(76119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64653d(C64649a aVar) {
            super(1);
            this.f146371a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            ProfileNgoStruct profileNgoStruct;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || t.isBlock)) {
                C64649a aVar3 = this.f146371a;
                T t2 = aVar2.f31085a;
                if (t2 != null) {
                    profileNgoStruct = t2.getProfileNgoStruct();
                } else {
                    profileNgoStruct = null;
                }
                aVar3.mo104161a(profileNgoStruct);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof DonationLinkView)) {
            view = null;
        }
        this.f146365m = (DonationLinkView) view;
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64655b.f146373a, new C64653d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64656c.f146374a, new C64654e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a$c */
    public static final class C64652c implements DonationLinkView.AbstractC64317b {

        /* renamed from: a */
        final /* synthetic */ C64649a f146368a;

        /* renamed from: b */
        final /* synthetic */ User f146369b;

        /* renamed from: c */
        final /* synthetic */ Map f146370c;

        static {
            Covode.recordClassIndex(76118);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.views.DonationLinkView.AbstractC64317b
        /* renamed from: a */
        public final void mo103810a(int i) {
            String str;
            AbstractC0952i supportFragmentManager;
            C23226a aVar = this.f146368a.f146363j;
            if (aVar != null) {
                aVar.dismiss();
            }
            Bundle bundle = new Bundle();
            if (this.f146368a.mo104162v()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", "click");
            bundle.putBoolean("should_dim_bg", true);
            C64649a aVar2 = this.f146368a;
            IDonationService b = DonationServiceImpl.m86009b();
            String secUid = this.f146369b.getSecUid();
            C89219l.m154716b(secUid, "");
            aVar2.f146363j = b.mo73340a(i, secUid, bundle);
            C39162r.m79460a("click_link", this.f146370c);
            ActivityC0945e b2 = C12777b.m23004b(this.f146368a);
            if (b2 != null && (supportFragmentManager = b2.getSupportFragmentManager()) != null) {
                C23226a aVar3 = this.f146368a.f146363j;
                if (aVar3 == null) {
                    C89219l.m154715b();
                }
                aVar3.show(supportFragmentManager, "DonationFragment");
            }
        }

        C64652c(C64649a aVar, User user, Map map) {
            this.f146368a = aVar;
            this.f146369b = user;
            this.f146370c = map;
        }
    }

    /* renamed from: a */
    public final void mo104161a(ProfileNgoStruct profileNgoStruct) {
        boolean z;
        String str;
        String str2;
        DonationLinkView donationLinkView;
        String donationLink;
        if (!C16048b.m29633a().mo25421a(true, "enable_profile_support_cause", false) && !mo104162v()) {
            z = false;
        } else {
            z = true;
        }
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        User user = null;
        if (iVar != null) {
            user = iVar.f146329a;
        }
        C33744d a = new C33744d().mo59983a("enter_from", "others_homepage");
        if (profileNgoStruct == null || (str = profileNgoStruct.getDonationLink()) == null) {
            str = "";
        }
        C33744d a2 = a.mo59983a("link", str);
        if (user == null || (str2 = user.getUid()) == null) {
            str2 = "";
        }
        Map<String, String> map = a2.mo59983a("author_id", str2).mo59983a("link_type", "nonprofit").f79943a;
        C89219l.m154716b(map, "");
        if (!mo104162v() && profileNgoStruct != null && (donationLink = profileNgoStruct.getDonationLink()) != null && donationLink.length() > 0) {
            C39162r.m79460a("show_link", map);
        }
        if (!(user == null || !z || (donationLinkView = this.f146365m) == null)) {
            C64652c cVar = new C64652c(this, user, map);
            C89219l.m154721d(cVar, "");
            if (profileNgoStruct != null && Integer.valueOf(profileNgoStruct.getId()) != null && !TextUtils.isEmpty(profileNgoStruct.getIconUrl()) && !TextUtils.isEmpty(profileNgoStruct.getName())) {
                donationLinkView.f145783b.setText(donationLinkView.getResources().getString(R.string.dhd, profileNgoStruct.getName()));
                donationLinkView.f145783b.setOnClickListener(new DonationLinkView.View$OnClickListenerC64318c(cVar, profileNgoStruct));
                donationLinkView.f145782a.setColorFilter(donationLinkView.getResources().getColor(DonationLinkView.f145780c));
                donationLinkView.f145783b.setTextColor(donationLinkView.getResources().getColor(DonationLinkView.f145780c));
                DonationLinkView donationLinkView2 = this.f146365m;
                if (donationLinkView2 != null) {
                    donationLinkView2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        DonationLinkView donationLinkView3 = this.f146365m;
        if (donationLinkView3 != null) {
            donationLinkView3.setVisibility(8);
        }
    }
}
