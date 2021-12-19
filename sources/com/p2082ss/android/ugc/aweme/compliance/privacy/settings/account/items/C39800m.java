package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.m */
public final class C39800m extends C39723h {

    /* renamed from: a */
    final Context f93702a;

    /* renamed from: b */
    public final PrivacySettingViewModel f93703b;

    /* renamed from: c */
    public final C1213t<Boolean> f93704c;

    /* renamed from: d */
    public final C1213t<Boolean> f93705d;

    static {
        Covode.recordClassIndex(47530);
    }

    /* renamed from: a */
    public static void m80714a(String str) {
        C73991bj.m130128a("PreUploadingItem ".concat(String.valueOf(str)));
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.m$a */
    static final class C39801a<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ boolean f93706a;

        static {
            Covode.recordClassIndex(47531);
        }

        C39801a(boolean z) {
            this.f93706a = z;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<BaseResponse> adVar) {
            int i;
            C89219l.m154721d(adVar, "");
            C68432f fVar = C68432f.f153189a;
            if (this.f93706a) {
                i = 2;
            } else {
                i = 1;
            }
            adVar.mo142931a(fVar.mo108856a("enable_tiktok_preupload", i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.m$b */
    static final class C39802b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39800m f93707a;

        /* renamed from: b */
        final /* synthetic */ boolean f93708b;

        static {
            Covode.recordClassIndex(47532);
        }

        C39802b(C39800m mVar, boolean z) {
            this.f93707a = mVar;
            this.f93708b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39800m.m80714a("request success use newStatus:" + this.f93708b);
            this.f93707a.f93704c.setValue(false);
            this.f93707a.f93705d.setValue(Boolean.valueOf(this.f93708b));
            C39800m.m80715a(true, this.f93708b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.m$c */
    static final class C39803c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39800m f93709a;

        /* renamed from: b */
        final /* synthetic */ boolean f93710b;

        static {
            Covode.recordClassIndex(47533);
        }

        C39803c(C39800m mVar, boolean z) {
            this.f93709a = mVar;
            this.f93710b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39800m.m80714a("request failed use originStatus:" + this.f93710b);
            this.f93709a.f93704c.setValue(false);
            this.f93709a.f93705d.setValue(Boolean.valueOf(this.f93710b));
            View view = this.f93709a.itemView;
            C89219l.m154716b(view, "");
            new C23144b(view).mo37640e(R.string.dl6);
            C39800m.m80715a(false, this.f93710b);
        }
    }

    /* renamed from: a */
    public static void m80715a(boolean z, boolean z2) {
        m80714a("mobPreUploadSwitch isSuccess:" + z + " isOpen:" + z2);
        C39162r.m79460a("click_pre_release", new C33744d().mo59980a("status", z2 ? 1 : 0).mo59982a("reaction", Boolean.valueOf(z)).f79943a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39800m(View view, PrivacySettingViewModel privacySettingViewModel, C1213t<Boolean> tVar, C1213t<Boolean> tVar2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(privacySettingViewModel, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(tVar2, "");
        this.f93703b = privacySettingViewModel;
        this.f93704c = tVar;
        this.f93705d = tVar2;
        this.f93702a = view.getContext();
    }
}
