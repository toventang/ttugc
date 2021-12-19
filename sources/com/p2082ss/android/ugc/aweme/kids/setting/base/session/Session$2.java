package com.p2082ss.android.ugc.aweme.kids.setting.base.session;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.session.Session$2 */
public class Session$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C57806a f131843a;

    static {
        Covode.recordClassIndex(67809);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f131843a.mo95141b();
    }

    Session$2(C57806a aVar) {
        this.f131843a = aVar;
    }
}
