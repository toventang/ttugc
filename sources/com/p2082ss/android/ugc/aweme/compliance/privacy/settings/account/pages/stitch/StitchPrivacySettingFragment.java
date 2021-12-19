package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39246g;
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
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchPrivacySettingFragment */
public final class StitchPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    private StitchViewModel f93916a;

    /* renamed from: b */
    private C39937a f93917b;

    /* renamed from: c */
    private SparseArray f93918c;

    static {
        Covode.recordClassIndex(47688);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93918c == null) {
            this.f93918c = new SparseArray();
        }
        View view = (View) this.f93918c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93918c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93918c;
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
        C39937a aVar = this.f93917b;
        if (aVar == null) {
            C89219l.m154710a("stitchAdapter");
        }
        return C89070n.m154516a(aVar);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(StitchViewModel.class);
        C89219l.m154716b(a, "");
        this.f93916a = (StitchViewModel) a;
        StitchViewModel stitchViewModel = this.f93916a;
        if (stitchViewModel == null) {
            C89219l.m154710a("stitchViewModel");
        }
        this.f93917b = new C39937a(stitchViewModel, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchPrivacySettingFragment$a */
    static final class C39936a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39936a f93919a = new C39936a();

        static {
            Covode.recordClassIndex(47689);
        }

        C39936a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            Integer num;
            C39246g gVar;
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Show stitch setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "stitch"));
            C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
            C40043a.m80992a(cVar2, "is_private", Boolean.valueOf(C39631a.m80486b()));
            C39258q b = C39659b.m80540b();
            if (b == null || (gVar = b.f92742a) == null) {
                num = null;
            } else {
                num = Integer.valueOf(gVar.f92703c);
            }
            return C40043a.m80992a(cVar2, "cur_value", num);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.n9);
        C39937a aVar = this.f93917b;
        if (aVar == null) {
            C89219l.m154710a("stitchAdapter");
        }
        mo69097a(aVar.mo69151d());
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39936a.f93919a);
    }
}
