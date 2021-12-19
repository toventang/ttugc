package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.SuggestAccountPrivacySettingFragment */
public final class SuggestAccountPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    public String f93922a = "privacy_setting";

    /* renamed from: b */
    public String f93923b = "";

    /* renamed from: c */
    public int f93924c;

    /* renamed from: d */
    private C39949b f93925d;

    /* renamed from: e */
    private C39955c f93926e;

    /* renamed from: f */
    private C39967e f93927f;

    /* renamed from: g */
    private C39970f f93928g;

    /* renamed from: h */
    private C39964d f93929h;

    /* renamed from: i */
    private SparseArray f93930i;

    static {
        Covode.recordClassIndex(47699);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93930i == null) {
            this.f93930i = new SparseArray();
        }
        View view = (View) this.f93930i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93930i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93930i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.SuggestAccountPrivacySettingFragment$a */
    static final class C39940a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SuggestAccountPrivacySettingFragment f93931a;

        static {
            Covode.recordClassIndex(47700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39940a(SuggestAccountPrivacySettingFragment suggestAccountPrivacySettingFragment) {
            super(0);
            this.f93931a = suggestAccountPrivacySettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Context context = this.f93931a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(context).mo37483b(R.string.g8a).mo37482a(false), C399411.f93932a).mo37405a().mo37396b().show();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d
    /* renamed from: c */
    public final List<AbstractC39713b> mo69099c() {
        AbstractC39943a[] aVarArr = new AbstractC39943a[5];
        C39949b bVar = this.f93925d;
        if (bVar == null) {
            C89219l.m154710a("sugToContactsAdapter");
        }
        aVarArr[0] = bVar;
        C39955c cVar = this.f93926e;
        if (cVar == null) {
            C89219l.m154710a("sugToFbFriendsAdapter");
        }
        aVarArr[1] = cVar;
        C39967e eVar = this.f93927f;
        if (eVar == null) {
            C89219l.m154710a("sugToMutualConnectionsAdapter");
        }
        aVarArr[2] = eVar;
        C39970f fVar = this.f93928g;
        if (fVar == null) {
            C89219l.m154710a("sugToWhoShareLinkAdapter");
        }
        aVarArr[3] = fVar;
        C39964d dVar = this.f93929h;
        if (dVar == null) {
            C89219l.m154710a("sugToInterestedUsersAdapter");
        }
        aVarArr[4] = dVar;
        return C89070n.m154522b(aVarArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.SuggestAccountPrivacySettingFragment$b */
    static final class C39942b extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39942b f93933a = new C39942b();

        static {
            Covode.recordClassIndex(47702);
        }

        C39942b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Show suggest account page");
            return C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f93922a;
        String str2 = this.f93923b;
        int i = this.f93924c;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("enter_suggest_accounts", new C33744d().mo59983a("enter_from", str).mo59983a("previous_page", str2).mo59980a("is_rec", i).f79943a);
        AbstractC1174ac a = new C1175ad(this).mo3983a(SugToContactsViewModel.class);
        C89219l.m154716b(a, "");
        this.f93925d = new C39949b((SugToContactsViewModel) a, this);
        AbstractC1174ac a2 = new C1175ad(this).mo3983a(SugToFbFriendsViewModel.class);
        C89219l.m154716b(a2, "");
        this.f93926e = new C39955c((SugToFbFriendsViewModel) a2, this);
        AbstractC1174ac a3 = new C1175ad(this).mo3983a(SugToMutualConnectionsViewModel.class);
        C89219l.m154716b(a3, "");
        this.f93927f = new C39967e((SugToMutualConnectionsViewModel) a3, this);
        AbstractC1174ac a4 = new C1175ad(this).mo3983a(SugToWhoShareLinkViewModel.class);
        C89219l.m154716b(a4, "");
        this.f93928g = new C39970f((SugToWhoShareLinkViewModel) a4, this);
        AbstractC1174ac a5 = new C1175ad(this).mo3983a(SugToInterestedUsersViewModel.class);
        C89219l.m154716b(a5, "");
        this.f93929h = new C39964d((SugToInterestedUsersViewModel) a5, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.erd);
        ((TuxNavBar) mo69087a(R.id.ejf)).mo37728b(new C23187b().mo37738a(R.raw.icon_info_circle).mo37741a((AbstractC89171a<C89391z>) new C39940a(this)));
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39942b.f93933a);
    }
}
