package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39245f;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention.TagMentionPrivacySettingFragment */
public final class TagMentionPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    private C39982c f93965a;

    /* renamed from: b */
    private C39976a f93966b;

    /* renamed from: c */
    private C39979b f93967c;

    /* renamed from: d */
    private SparseArray f93968d;

    static {
        Covode.recordClassIndex(47735);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93968d == null) {
            this.f93968d = new SparseArray();
        }
        View view = (View) this.f93968d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93968d.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93968d;
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
        AbstractC39856a[] aVarArr = new AbstractC39856a[3];
        C39982c cVar = this.f93965a;
        if (cVar == null) {
            C89219l.m154710a("tagAdapter");
        }
        aVarArr[0] = cVar;
        C39976a aVar = this.f93966b;
        if (aVar == null) {
            C89219l.m154710a("mentionAdapter");
        }
        aVarArr[1] = aVar;
        C39979b bVar = this.f93967c;
        if (bVar == null) {
            C89219l.m154710a("mentionNoticeAdapter");
        }
        aVarArr[2] = bVar;
        return C89070n.m154522b(aVarArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention.TagMentionPrivacySettingFragment$a */
    static final class C39973a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39973a f93969a = new C39973a();

        static {
            Covode.recordClassIndex(47736);
        }

        C39973a() {
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
            C40043a.m80991a(cVar2, "Show mention setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "mention"));
            C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
            C40043a.m80992a(cVar2, "is_private", Boolean.valueOf(C39631a.m80486b()));
            C39258q b = C39659b.m80540b();
            if (b == null || (fVar = b.f92747f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f92696a);
            }
            return C40043a.m80992a(cVar2, "cur_value", num);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention.TagMentionPrivacySettingFragment$b */
    static final class C39974b extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39974b f93970a = new C39974b();

        static {
            Covode.recordClassIndex(47737);
        }

        C39974b() {
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
            C40043a.m80991a(cVar2, "Show mention notice setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "mention_notice"));
            C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
            C40043a.m80992a(cVar2, "is_private", Boolean.valueOf(C39631a.m80486b()));
            C39258q b = C39659b.m80540b();
            if (b == null || (fVar = b.f92747f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f92697b);
            }
            return C40043a.m80992a(cVar2, "cur_value", num);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention.TagMentionPrivacySettingFragment$c */
    static final class C39975c extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39975c f93971a = new C39975c();

        static {
            Covode.recordClassIndex(47738);
        }

        C39975c() {
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
            C40043a.m80991a(cVar2, "Show tag setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "tag"));
            C40043a.m80992a(cVar2, "restriction_logid", C39659b.m80538a());
            C40043a.m80992a(cVar2, "is_private", Boolean.valueOf(C39631a.m80486b()));
            C39258q b = C39659b.m80540b();
            if (b == null || (fVar = b.f92747f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f92698c);
            }
            return C40043a.m80992a(cVar2, "cur_value", num);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(TagViewModel.class);
        C89219l.m154716b(a, "");
        this.f93965a = new C39982c((TagViewModel) a, this);
        AbstractC1174ac a2 = new C1175ad(this).mo3983a(MentionViewModel.class);
        C89219l.m154716b(a2, "");
        this.f93966b = new C39976a((MentionViewModel) a2, this);
        AbstractC1174ac a3 = new C1175ad(this).mo3983a(MentionNoticeViewModel.class);
        C89219l.m154716b(a3, "");
        this.f93967c = new C39979b((MentionNoticeViewModel) a3, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C39982c cVar = this.f93965a;
        if (cVar == null) {
            C89219l.m154710a("tagAdapter");
        }
        if (!C39699a.m80586b(cVar.mo69148b()).f93536b || !C36410g.m74111b()) {
            i = R.string.d20;
        } else {
            i = R.string.d21;
        }
        mo69098b(i);
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39973a.f93969a);
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39974b.f93970a);
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39975c.f93971a);
    }
}
