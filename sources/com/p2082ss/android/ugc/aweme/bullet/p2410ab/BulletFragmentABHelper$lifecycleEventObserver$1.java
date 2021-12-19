package com.p2082ss.android.ugc.aweme.bullet.p2410ab;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.p2082ss.android.ugc.aweme.bullet.p2409a.C34954a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.ab.BulletFragmentABHelper$lifecycleEventObserver$1 */
final class BulletFragmentABHelper$lifecycleEventObserver$1 implements AbstractC1202k {

    /* renamed from: a */
    public static final BulletFragmentABHelper$lifecycleEventObserver$1 f82459a = new BulletFragmentABHelper$lifecycleEventObserver$1();

    static {
        Covode.recordClassIndex(41982);
    }

    BulletFragmentABHelper$lifecycleEventObserver$1() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        IResourceLoaderService iResourceLoaderService;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        int i = C34960b.f82468a[aVar.ordinal()];
        if (i == 1) {
            IResourceLoaderService iResourceLoaderService2 = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class);
            if (iResourceLoaderService2 != null) {
                iResourceLoaderService2.registerCustomLoader(C34954a.class, EnumC16636e.HIGH);
            }
        } else if (i == 2 && (iResourceLoaderService = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class)) != null) {
            iResourceLoaderService.unregisterCustomLoader(C34954a.class, EnumC16636e.HIGH);
        }
    }
}
