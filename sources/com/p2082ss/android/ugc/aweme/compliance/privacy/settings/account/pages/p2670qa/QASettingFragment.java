package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39245f;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39742b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa.QAProfileEntranceViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QASettingFragment */
public final class QASettingFragment extends AbstractC39716d {

    /* renamed from: a */
    public static final C39920a f93896a = new C39920a((byte) 0);

    /* renamed from: b */
    private C39922a f93897b;

    /* renamed from: c */
    private C39925b f93898c;

    /* renamed from: d */
    private SparseArray f93899d;

    static {
        Covode.recordClassIndex(47669);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93899d == null) {
            this.f93899d = new SparseArray();
        }
        View view = (View) this.f93899d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93899d.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93899d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QASettingFragment$a */
    public static final class C39920a {
        static {
            Covode.recordClassIndex(47670);
        }

        private C39920a() {
        }

        public /* synthetic */ C39920a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d
    /* renamed from: c */
    public final List<AbstractC39713b> mo69099c() {
        AbstractC39713b[] bVarArr = new AbstractC39713b[2];
        C39925b bVar = this.f93898c;
        if (bVar == null) {
            C89219l.m154710a("qaProfileEntranceAdapter");
        }
        bVarArr[0] = bVar;
        C39922a aVar = this.f93897b;
        if (aVar == null) {
            C89219l.m154710a("qaInviteAdapter");
        }
        bVarArr[1] = aVar;
        return C89070n.m154522b(bVarArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QASettingFragment$b */
    static final class C39921b extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39921b f93900a = new C39921b();

        static {
            Covode.recordClassIndex(47671);
        }

        C39921b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            Integer num;
            C39245f fVar;
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Show qa setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "qna_invite"));
            C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
            C39258q b = C39659b.m80540b();
            if (b == null || (fVar = b.f92747f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f92700e);
            }
            return C40043a.m80992a(cVar2, "cur_value", num);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(QAProfileEntranceViewModel.class);
        C89219l.m154716b(a, "");
        QAProfileEntranceViewModel qAProfileEntranceViewModel = (QAProfileEntranceViewModel) a;
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        if (activity.getIntent().hasExtra("enable_qna_on_profile")) {
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            qAProfileEntranceViewModel.f93798d.postValue(Integer.valueOf(activity2.getIntent().getIntExtra("enable_qna_on_profile", -1)));
        } else {
            C39742b.m80624a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(QAProfileEntranceViewModel.C39914a.f93890a).mo143264a(QAProfileEntranceViewModel.C39916b.f93892a).mo143254a(new QAProfileEntranceViewModel.C39918c(qAProfileEntranceViewModel), QAProfileEntranceViewModel.C39919d.f93895a);
        }
        this.f93898c = new C39925b(qAProfileEntranceViewModel, this);
        AbstractC1174ac a2 = new C1175ad(this).mo3983a(QAInviteViewModel.class);
        C89219l.m154716b(a2, "");
        this.f93897b = new C39922a((QAInviteViewModel) a2, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.f3e);
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39921b.f93900a);
    }
}
