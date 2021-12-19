package com.p2082ss.android.ugc.aweme.follow.widet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.follow.widet.FollowUserBlock$2 */
public class FollowUserBlock$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC51754w f117873a;

    /* renamed from: b */
    final /* synthetic */ C51086a f117874b;

    static {
        Covode.recordClassIndex(60282);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f117873a.ck_();
    }

    FollowUserBlock$2(C51086a aVar, AbstractC51754w wVar) {
        this.f117874b = aVar;
        this.f117873a = wVar;
    }
}
