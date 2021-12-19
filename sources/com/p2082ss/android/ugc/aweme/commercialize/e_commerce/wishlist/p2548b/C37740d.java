package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2548b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.C37764b;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b.d */
public final class C37740d implements AbstractC88078c<C37764b> {

    /* renamed from: a */
    private final AbstractC89405a<WishListBulletApi> f89134a;

    /* renamed from: b */
    private final AbstractC89405a<IAdLandPagePreloadService> f89135b;

    static {
        Covode.recordClassIndex(45183);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m76369a(this.f89134a.get(), this.f89135b.get());
    }

    /* renamed from: a */
    public static C37764b m76369a(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        return (C37764b) C88081f.m153153a(C37737a.m76365a(wishListBulletApi, iAdLandPagePreloadService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
