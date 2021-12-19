package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38682bi;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40620b;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer */
public final class AdPopUpWebPageContainer extends C38682bi implements AbstractC33974au {

    /* renamed from: b */
    public static final C37939a f89622b = new C37939a((byte) 0);

    /* renamed from: a */
    public final AbstractC1204m f89623a;

    /* renamed from: h */
    private boolean f89624h;

    /* renamed from: i */
    private boolean f89625i;

    /* renamed from: j */
    private final int f89626j = R.id.ff;

    /* renamed from: k */
    private final int f89627k = R.id.fe;

    static {
        Covode.recordClassIndex(45395);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer$a */
    public static final class C37939a {
        static {
            Covode.recordClassIndex(45396);
        }

        private C37939a() {
        }

        public /* synthetic */ C37939a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AdPopUpWebPageContainer m76912a(Activity activity, AbstractC40735a aVar, AbstractC40691e eVar, Bundle bundle, AbstractC1204m mVar) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(bundle, "");
            C89219l.m154721d(mVar, "");
            C40618a a = C40620b.C40622b.m81989a(bundle);
            C89219l.m154716b(a, "");
            return new AdPopUpWebPageContainer(activity, aVar, eVar, a, mVar);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        m76909j();
    }

    /* renamed from: j */
    private final void m76909j() {
        if (this.f89625i) {
            this.f89624h = false;
            this.f91385d.mo69928d(this.f91384c);
        }
    }

    /* renamed from: b */
    public final void mo66098b() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f91388g.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69708b();
        }
    }

    /* renamed from: a */
    public final void mo66097a() {
        this.f89623a.getLifecycle().mo4013b(this);
        m76908i();
        m76909j();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        m76908i();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f91388g.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69707a(false);
        }
    }

    /* renamed from: i */
    private final void m76908i() {
        if (this.f89624h) {
            this.f89624h = false;
            this.f91385d.mo69926c(this.f91384c);
            if (this.f91384c.findViewById(this.f89626j) != null) {
                ((DownloadBusiness) this.f91388g.mo69748a(DownloadBusiness.class)).mo66191a(this.f91384c);
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        this.f91385d.mo69923b(this.f91384c);
        this.f91388g.mo69749a();
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.f91388g.mo69748a(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.f89706a = this.f89626j;
            downloadBusiness.f89707b = this.f89627k;
            downloadBusiness.mo66192a(this.f91384c, (AbstractC40746j) mo67258f().mo69911a(AbstractC40746j.class));
            this.f89624h = true;
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f91388g.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69708b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdPopUpWebPageContainer(Activity activity, AbstractC40735a aVar, AbstractC40691e eVar, C40618a aVar2, AbstractC1204m mVar) {
        super(activity, aVar, eVar, aVar2);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(mVar, "");
        this.f89623a = mVar;
        aVar.setCrossPlatformActivityContainer(this);
        mVar.getLifecycle().mo4012a(this);
        this.f89625i = true;
    }
}
