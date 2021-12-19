package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39633a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingFragmentMain */
public final class PrivacySettingFragmentMain extends AbstractC39712a {

    /* renamed from: a */
    public C47809e f93537a;

    /* renamed from: b */
    private C39709a f93538b;

    /* renamed from: c */
    private PrivacySettingViewModel f93539c;

    /* renamed from: d */
    private long f93540d;

    /* renamed from: e */
    private final AbstractC89244h f93541e = RouteArgExtension.INSTANCE.optionalArg(this, C39701a.f93543a, "highlight_private_account_item", Boolean.class);

    /* renamed from: f */
    private SparseArray f93542f;

    static {
        Covode.recordClassIndex(47426);
    }

    /* renamed from: c */
    private final Boolean m80588c() {
        return (Boolean) this.f93541e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93542f == null) {
            this.f93542f = new SparseArray();
        }
        View view = (View) this.f93542f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93542f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93542f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingFragmentMain$c */
    static final class C39703c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingFragmentMain f93545a;

        static {
            Covode.recordClassIndex(47429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39703c(PrivacySettingFragmentMain privacySettingFragmentMain) {
            super(0);
            this.f93545a = privacySettingFragmentMain;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93545a.mo69088a();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final void mo69088a() {
        super.mo69088a();
        long j = this.f93540d;
        C39162r.m79460a("stay_time", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59981a("duration", System.currentTimeMillis() - j).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingFragmentMain$a */
    static final class C39701a extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        public static final C39701a f93543a = new C39701a();

        static {
            Covode.recordClassIndex(47427);
        }

        C39701a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingFragmentMain$b */
    static final class C39702b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingFragmentMain f93544a;

        static {
            Covode.recordClassIndex(47428);
        }

        C39702b(PrivacySettingFragmentMain privacySettingFragmentMain) {
            this.f93544a = privacySettingFragmentMain;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C68348f fVar = (C68348f) obj;
            C89219l.m154716b(fVar, "");
            int i = fVar.f152952O;
            int i2 = fVar.f152953P;
            boolean z = fVar.f152954Q;
            String a = C39631a.m80484a();
            C47809e eVar = this.f93544a.f93537a;
            if (eVar != null) {
                eVar.mo79876b("comment_filter_status_".concat(String.valueOf(a)), Integer.valueOf(i));
            }
            C47809e eVar2 = this.f93544a.f93537a;
            if (eVar2 != null) {
                eVar2.mo79876b("comment_offensive_filter_".concat(String.valueOf(a)), Integer.valueOf(i2));
            }
            C47809e eVar3 = this.f93544a.f93537a;
            if (eVar3 != null) {
                eVar3.mo79875b("author_review_all_comments_".concat(String.valueOf(a)), Boolean.valueOf(z));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(PrivacySettingViewModel.class);
        C89219l.m154716b(a, "");
        PrivacySettingViewModel privacySettingViewModel = (PrivacySettingViewModel) a;
        this.f93539c = privacySettingViewModel;
        if (privacySettingViewModel == null) {
            C89219l.m154710a("privacySettingViewModel");
        }
        Boolean c = m80588c();
        if (c != null) {
            z = c.booleanValue();
        } else {
            z = false;
        }
        privacySettingViewModel.f93547b = z;
        if (C89219l.m154714a((Object) m80588c(), (Object) true)) {
            C39162r.m79460a("enter_privacy_setting", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("enter_method", "pop_up").f79943a);
        }
        PrivacySettingViewModel privacySettingViewModel2 = this.f93539c;
        if (privacySettingViewModel2 == null) {
            C89219l.m154710a("privacySettingViewModel");
        }
        privacySettingViewModel2.f93546a.observe(this, new C39702b(this));
        this.f93537a = C47809e.C47810a.f110762a;
        C39659b.m80539a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxNavBar) mo69087a(R.id.ejf)).mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C39703c(this)));
        C23194g gVar = new C23194g();
        String string = getString(R.string.c4);
        C89219l.m154716b(string, "");
        ((TuxNavBar) mo69087a(R.id.ejf)).mo37725a(gVar.mo37753a(string));
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) mo69087a(R.id.c_1);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo69087a(R.id.c_1);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        PrivacySettingViewModel privacySettingViewModel = this.f93539c;
        if (privacySettingViewModel == null) {
            C89219l.m154710a("privacySettingViewModel");
        }
        C39709a aVar = new C39709a(privacySettingViewModel, this);
        this.f93538b = aVar;
        List a = C89070n.m154516a(aVar);
        RecyclerView recyclerView3 = (RecyclerView) mo69087a(R.id.c_1);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setAdapter(new C39633a(a));
        PrivacySettingViewModel privacySettingViewModel2 = this.f93539c;
        if (privacySettingViewModel2 == null) {
            C89219l.m154710a("privacySettingViewModel");
        }
        privacySettingViewModel2.mo69090a();
        this.f93540d = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C39709a aVar = this.f93538b;
        if (aVar == null) {
            C89219l.m154710a("adapter");
        }
        Iterator it = C89070n.m154585g((Collection) aVar.f93565c).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
