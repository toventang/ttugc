package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.p2542a.C37700a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.WishListManager$lifecycleEventObserver$1 */
public final class WishListManager$lifecycleEventObserver$1 implements AbstractC1202k {

    /* renamed from: a */
    public static final WishListManager$lifecycleEventObserver$1 f89171a = new WishListManager$lifecycleEventObserver$1();

    static {
        Covode.recordClassIndex(45209);
    }

    WishListManager$lifecycleEventObserver$1() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        IResourceLoaderService iResourceLoaderService;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        int i = C37778c.f89199a[aVar.ordinal()];
        if (i == 1) {
            IResourceLoaderService iResourceLoaderService2 = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class);
            if (iResourceLoaderService2 != null) {
                iResourceLoaderService2.registerCustomLoader(C37700a.class, EnumC16636e.HIGH);
            }
        } else if (i == 2 && (iResourceLoaderService = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class)) != null) {
            iResourceLoaderService.unregisterCustomLoader(C37700a.class, EnumC16636e.HIGH);
        }
    }
}
