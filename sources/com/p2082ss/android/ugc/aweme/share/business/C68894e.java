package com.p2082ss.android.ugc.aweme.share.business;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59212ag;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69190a;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69199c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.business.e */
public final class C68894e {
    static {
        Covode.recordClassIndex(81199);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.e$d */
    public static final class C68898d implements AbstractC69575a {

        /* renamed from: a */
        final /* synthetic */ Activity f154107a;

        static {
            Covode.recordClassIndex(81203);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
        /* renamed from: a */
        public final Activity mo81451a() {
            return this.f154107a;
        }

        public C68898d(Activity activity) {
            this.f154107a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.e$a */
    public static final class C68895a extends C69692g {

        /* renamed from: a */
        final /* synthetic */ Aweme f154104a;

        static {
            Covode.recordClassIndex(81200);
        }

        public C68895a(Aweme aweme) {
            this.f154104a = aweme;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b, com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g
        /* renamed from: a */
        public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
            String str;
            String str2;
            Bundle bundle;
            Bundle bundle2;
            Bundle bundle3;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            C59212ag a = new C59212ag().mo96751a("release");
            a.f134843d = "publish_then_share";
            C59212ag f = a.mo96749g(this.f154104a);
            f.f134842c = bVar.mo109548a();
            f.f134845p = 0;
            String str3 = null;
            if (sharePackage == null || (bundle3 = sharePackage.f155492i) == null) {
                str = null;
            } else {
                str = bundle3.getString("share_form");
            }
            f.f134814Z = str;
            if (sharePackage == null || (bundle2 = sharePackage.f155492i) == null) {
                str2 = null;
            } else {
                str2 = bundle2.getString("share_form");
            }
            if (C89219l.m154714a((Object) str2, (Object) "url_form")) {
                if (!(sharePackage == null || (bundle = sharePackage.f155492i) == null)) {
                    str3 = bundle.getString("share_url");
                }
                f.f134846q = str3;
            } else {
                ShareInfo shareInfo = this.f154104a.getShareInfo();
                C89219l.m154716b(shareInfo, "");
                String shareUrl = shareInfo.getShareUrl();
                if (shareUrl == null) {
                    shareUrl = this.f154104a.getShareUrl();
                }
                f.f134846q = shareUrl;
            }
            f.mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.e$b */
    public static final class C68896b implements AbstractC56264b {

        /* renamed from: a */
        final /* synthetic */ Activity f154105a;

        static {
            Covode.recordClassIndex(81201);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
        /* renamed from: a */
        public final void mo90144a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
        /* renamed from: b */
        public final void mo90150b(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
        /* renamed from: c */
        public final void mo90151c(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
        }

        public C68896b(Activity activity) {
            this.f154105a = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
        /* renamed from: a */
        public final boolean mo90149a(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            if (C37699a.m76218U(C68893d.m121577a(sharePackage))) {
                new C23144b(this.f154105a).mo37640e(R.string.o7).mo37637b();
                return false;
            }
            C89219l.m154721d(sharePackage, "");
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
        /* renamed from: a */
        public final void mo90147a(String str, SharePackage sharePackage) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(sharePackage, "");
            AbstractC56264b.C56265a.m102234a(str, sharePackage);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.e$c */
    public static final class C68897c extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        public static final C68897c f154106a = new C68897c();

        static {
            Covode.recordClassIndex(81202);
        }

        C68897c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            boolean z;
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (C69190a.C69191a.m122288a().isEmpty() || C89219l.m154714a((Object) bVar2.mo109548a(), (Object) "download")) {
                z = true;
            } else {
                z = C69190a.C69191a.m122288a().contains(bVar2.mo109548a());
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private static AbstractC69581b m121578a(AbstractC69581b bVar, ACLCommonShare aCLCommonShare) {
        return new C69199c(bVar, aCLCommonShare);
    }

    /* renamed from: a */
    public static void m121579a(Aweme aweme, String str, C69584d dVar, C69684e.C69686b bVar) {
        AbstractC69581b a;
        ACLCommonShare a2 = C69157h.C69158a.m122258a(aweme, str);
        if ((a2 == null || a2.getShowType() != 0) && (a = C69583c.m122807a(str, dVar)) != null) {
            bVar.mo109823a(m121578a(a, a2));
        }
    }
}
