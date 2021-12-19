package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40593h;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40620b;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper */
public class CommercializeWebViewHelper extends C38682bi implements AbstractC33974au {

    /* renamed from: a */
    private AbstractC1204m f91216a;

    /* renamed from: b */
    private long f91217b;

    static {
        Covode.recordClassIndex(46138);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.f91385d.mo69913a(this.f91384c);
    }

    /* renamed from: a */
    private AbstractC40593h m78330a() {
        return (AbstractC40593h) CrossPlatformLegacyServiceImpl.m65225f().mo57032a(this.f91388g, AbstractC40593h.class);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f91385d.mo69928d(this.f91384c);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f91388g.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69707a(true);
        }
        this.f91216a.getLifecycle().mo4013b(this);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.f91385d.mo69926c(this.f91384c);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f91388g.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69707a(false);
        }
        this.f91217b = 0;
        C33744d dVar = new C33744d();
        dVar.mo59981a("duration", System.currentTimeMillis() - this.f91217b);
        C39162r.m79460a("h5_stay_time", dVar.f79943a);
        m78330a();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        this.f91385d.mo69923b(this.f91384c);
        this.f91388g.mo69749a();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f91388g.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69708b();
        }
        this.f91217b = System.currentTimeMillis();
        if (m78330a() != null) {
            this.f91385d.mo69911a(AbstractC40746j.class);
        }
    }

    private CommercializeWebViewHelper(Activity activity, AbstractC40735a aVar, AbstractC40691e eVar, C40618a aVar2, AbstractC1204m mVar) {
        super(activity, aVar, eVar, aVar2);
        aVar.setCrossPlatformActivityContainer(this);
        this.f91216a = mVar;
        mVar.getLifecycle().mo4012a(this);
    }

    /* renamed from: a */
    public static CommercializeWebViewHelper m78329a(AbstractC40735a aVar, AbstractC40691e eVar, AbstractC1204m mVar, Activity activity, Bundle bundle) {
        return new CommercializeWebViewHelper(activity, aVar, eVar, C40620b.C40622b.m81989a(bundle), mVar);
    }
}
