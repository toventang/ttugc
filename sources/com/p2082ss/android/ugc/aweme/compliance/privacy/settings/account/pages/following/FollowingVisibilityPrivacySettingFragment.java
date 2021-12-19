package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.following;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39242c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.following.FollowingVisibilityPrivacySettingFragment */
public final class FollowingVisibilityPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    private FollowingVisibilityViewModel f93856a;

    /* renamed from: b */
    private C39898a f93857b;

    /* renamed from: c */
    private SparseArray f93858c;

    static {
        Covode.recordClassIndex(47638);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93858c == null) {
            this.f93858c = new SparseArray();
        }
        View view = (View) this.f93858c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93858c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93858c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d
    /* renamed from: c */
    public final List<AbstractC39713b> mo69099c() {
        C39898a aVar = this.f93857b;
        if (aVar == null) {
            C89219l.m154710a("fvAdapter");
        }
        return C89070n.m154516a(aVar);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(FollowingVisibilityViewModel.class);
        C89219l.m154716b(a, "");
        this.f93856a = (FollowingVisibilityViewModel) a;
        FollowingVisibilityViewModel followingVisibilityViewModel = this.f93856a;
        if (followingVisibilityViewModel == null) {
            C89219l.m154710a("fvViewModel");
        }
        this.f93857b = new C39898a(followingVisibilityViewModel, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.following.FollowingVisibilityPrivacySettingFragment$a */
    static final class C39897a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39897a f93859a = new C39897a();

        static {
            Covode.recordClassIndex(47639);
        }

        C39897a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            Integer num;
            C39242c cVar2;
            C33743c cVar3 = cVar;
            C89219l.m154721d(cVar3, "");
            C40043a.m80991a(cVar3, "Show following visibility setting page");
            C40043a.m80990a(cVar3, C39659b.m80537a(0, "following_visibility"));
            C40043a.m80992a(cVar3, "restriction_logid", C39659b.m80538a());
            C40043a.m80992a(cVar3, "is_private", Boolean.valueOf(C39631a.m80486b()));
            C39258q b = C39659b.m80540b();
            if (b == null || (cVar2 = b.f92745d) == null) {
                num = null;
            } else {
                num = Integer.valueOf(cVar2.f92684a);
            }
            return C40043a.m80992a(cVar3, "cur_value", num);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.erl);
        C39898a aVar = this.f93857b;
        if (aVar == null) {
            C89219l.m154710a("fvAdapter");
        }
        mo69097a(aVar.mo69151d());
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39897a.f93859a);
    }
}
