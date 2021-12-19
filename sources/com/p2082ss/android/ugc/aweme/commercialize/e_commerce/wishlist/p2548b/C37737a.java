package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2548b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.C37764b;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b.a */
public final class C37737a {

    /* renamed from: a */
    public static final C37737a f89133a = new C37737a();

    private C37737a() {
    }

    static {
        Covode.recordClassIndex(45180);
    }

    /* renamed from: b */
    public static IAdLandPagePreloadService m76366b() {
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        C89219l.m154716b(f, "");
        return f;
    }

    /* renamed from: a */
    public static WishListBulletApi m76364a() {
        Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(WishListBulletApi.class);
        C89219l.m154716b(a, "");
        return (WishListBulletApi) a;
    }

    /* renamed from: a */
    public static C37764b m76365a(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        C89219l.m154721d(wishListBulletApi, "");
        C89219l.m154721d(iAdLandPagePreloadService, "");
        return new C37764b(wishListBulletApi, iAdLandPagePreloadService);
    }
}
