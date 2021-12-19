package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer */
public class MainMixActivityContainer extends MixActivityContainer implements AbstractC33974au, AbstractC90253j {
    static {
        Covode.recordClassIndex(48346);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    /* renamed from: m */
    public final void mo69628m() {
        super.mo69628m();
        ShareH5Service.C68827a.m121397a().mo109389b(this.f94813d, ((AbstractC40746j) mo67258f().mo69911a(AbstractC40746j.class)).mo69969a(), 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    /* renamed from: o */
    public final void mo69630o() {
        super.mo69630o();
        ((DownloadBusiness) this.f94813d.mo69748a(DownloadBusiness.class)).mo66191a(this.f94810a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    /* renamed from: p */
    public final void mo69631p() {
        super.mo69631p();
        ((DownloadBusiness) this.f94813d.mo69748a(DownloadBusiness.class)).mo66192a(this.f94810a, (AbstractC40746j) mo67258f().mo69911a(AbstractC40746j.class));
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40741f, com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    /* renamed from: q */
    public final void mo69632q() {
        super.mo69632q();
        ShareH5Service.C68827a.m121397a().mo109381a(getCrossPlatformBusiness(), mo67258f().getCurrentUrl(), 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    /* renamed from: n */
    public final void mo69629n() {
        super.mo69629n();
        if (mo67263h()) {
            ShareH5Service.C68827a.m121397a().mo109380a(this.f94813d, ((AbstractC40746j) mo67258f().mo69911a(AbstractC40746j.class)).mo69969a(), 1);
        } else {
            ShareH5Service.C68827a.m121397a().mo109379a(this.f94813d, 1);
        }
    }

    public MainMixActivityContainer(Activity activity, C40618a aVar) {
        super(activity, aVar);
    }
}
