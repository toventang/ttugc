package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
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
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentPrivacySettingFragment */
public final class CommentPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    private CommentViewModel f93827a;

    /* renamed from: b */
    private C39874a f93828b;

    /* renamed from: c */
    private C39877b f93829c;

    /* renamed from: d */
    private SparseArray f93830d;

    static {
        Covode.recordClassIndex(47608);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93830d == null) {
            this.f93830d = new SparseArray();
        }
        View view = (View) this.f93830d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93830d.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93830d;
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
        AbstractC39713b[] bVarArr = new AbstractC39713b[2];
        C39874a aVar = this.f93828b;
        if (aVar == null) {
            C89219l.m154710a("commentAdapter");
        }
        bVarArr[0] = aVar;
        C39877b bVar = this.f93829c;
        if (bVar == null) {
            C89219l.m154710a("commentFilterAdapter");
        }
        bVarArr[1] = bVar;
        return C89070n.m154522b(bVarArr);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(CommentViewModel.class);
        C89219l.m154716b(a, "");
        this.f93827a = (CommentViewModel) a;
        CommentViewModel commentViewModel = this.f93827a;
        if (commentViewModel == null) {
            C89219l.m154710a("commentViewModel");
        }
        this.f93828b = new C39874a(commentViewModel, this);
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        this.f93829c = new C39877b(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentPrivacySettingFragment$a */
    static final class C39873a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39873a f93831a = new C39873a();

        static {
            Covode.recordClassIndex(47609);
        }

        C39873a() {
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
            C40043a.m80991a(cVar2, "Show comments setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, UGCMonitor.EVENT_COMMENT));
            C39258q b = C39659b.m80540b();
            if (b == null || (gVar = b.f92742a) == null) {
                num = null;
            } else {
                num = Integer.valueOf(gVar.f92704d);
            }
            C40043a.m80992a(cVar2, "cur_value", num);
            C40043a.m80992a(cVar2, "restriction_comment_filter", C39659b.m80537a(0, "filter_spam"));
            C40043a.m80992a(cVar2, "is_private", Boolean.valueOf(C39631a.m80486b()));
            return C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.n4);
        C39874a aVar = this.f93828b;
        if (aVar == null) {
            C89219l.m154710a("commentAdapter");
        }
        mo69097a(aVar.mo69151d());
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39873a.f93831a);
    }
}
