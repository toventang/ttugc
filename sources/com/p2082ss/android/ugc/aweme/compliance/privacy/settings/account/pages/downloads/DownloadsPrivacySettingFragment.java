package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
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
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsPrivacySettingFragment */
public final class DownloadsPrivacySettingFragment extends AbstractC39716d {

    /* renamed from: a */
    public static final C39882a f93837a = new C39882a((byte) 0);

    /* renamed from: b */
    private DownloadsViewModel f93838b;

    /* renamed from: c */
    private C39884a f93839c;

    /* renamed from: d */
    private SparseArray f93840d;

    static {
        Covode.recordClassIndex(47619);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public final View mo69087a(int i) {
        if (this.f93840d == null) {
            this.f93840d = new SparseArray();
        }
        View view = (View) this.f93840d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93840d.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public final void mo69089b() {
        SparseArray sparseArray = this.f93840d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsPrivacySettingFragment$a */
    public static final class C39882a {
        static {
            Covode.recordClassIndex(47620);
        }

        private C39882a() {
        }

        public /* synthetic */ C39882a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d
    /* renamed from: c */
    public final List<AbstractC39713b> mo69099c() {
        C39884a aVar = this.f93839c;
        if (aVar == null) {
            C89219l.m154710a("downloadsAdapter");
        }
        return C89070n.m154516a(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        C39246g gVar;
        super.onDestroy();
        C39258q b = C39659b.m80540b();
        int i2 = 0;
        if (b == null || (gVar = b.f92742a) == null) {
            i = 0;
        } else {
            i = gVar.f92701a;
        }
        C33744d a = new C33744d().mo59983a("user_id", C39631a.m80484a()).mo59983a("enter_from", "account_download_setting");
        if (i == 3) {
            i2 = 1;
        }
        C39162r.m79460a("tns_video_download_use_leave", a.mo59980a("enter_status", i2).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsPrivacySettingFragment$b */
    static final class C39883b extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39883b f93841a = new C39883b();

        static {
            Covode.recordClassIndex(47621);
        }

        C39883b() {
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
            C40043a.m80991a(cVar2, "Show download setting page");
            C40043a.m80990a(cVar2, C39659b.m80537a(0, "download"));
            C40043a.m80992a(cVar2, "restriction_id", C39659b.m80538a());
            C40043a.m80992a(cVar2, "is_private", Boolean.valueOf(C39631a.m80486b()));
            C39258q b = C39659b.m80540b();
            if (b == null || (gVar = b.f92742a) == null) {
                num = null;
            } else {
                num = Integer.valueOf(gVar.f92701a);
            }
            return C40043a.m80992a(cVar2, "cur_value", num);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public final void onCreate(Bundle bundle) {
        int i;
        C39246g gVar;
        super.onCreate(bundle);
        AbstractC1174ac a = new C1175ad(this).mo3983a(DownloadsViewModel.class);
        C89219l.m154716b(a, "");
        this.f93838b = (DownloadsViewModel) a;
        DownloadsViewModel downloadsViewModel = this.f93838b;
        if (downloadsViewModel == null) {
            C89219l.m154710a("downloadsViewModel");
        }
        this.f93839c = new C39884a(downloadsViewModel, this);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        String a2 = m80807a(activity.getIntent(), "enter_from");
        if (a2 == null) {
            a2 = "privacy_and_safety_setting";
        }
        C89219l.m154716b(a2, "");
        C39258q b = C39659b.m80540b();
        int i2 = 0;
        if (b == null || (gVar = b.f92742a) == null) {
            i = 0;
        } else {
            i = gVar.f92701a;
        }
        C89219l.m154721d(a2, "");
        C33744d a3 = new C33744d().mo59983a("user_id", C39631a.m80484a()).mo59983a("enter_from", a2);
        if (i == 3) {
            i2 = 1;
        }
        C39162r.m79460a("tns_video_download_use_show", a3.mo59980a("enter_status", i2).f79943a);
    }

    /* renamed from: a */
    private static String m80807a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39716d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo69098b(R.string.n6);
        C39884a aVar = this.f93839c;
        if (aVar == null) {
            C89219l.m154710a("downloadsAdapter");
        }
        mo69097a(aVar.mo69151d());
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39883b.f93841a);
    }
}
