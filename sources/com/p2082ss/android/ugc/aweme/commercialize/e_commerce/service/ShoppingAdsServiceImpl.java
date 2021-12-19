package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2543a.C37701a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2544b.C37702a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2545c.C37703a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.GetSharedMemoryItemMethod;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.OpenHybridMethod;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.SetSharedMemoryItemMethod;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2549c.C37741a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2551e.C37753b;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl */
public final class ShoppingAdsServiceImpl implements IShoppingAdsService {
    static {
        Covode.recordClassIndex(45176);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    /* renamed from: a */
    public final boolean mo65746a() {
        return C37741a.m76370a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    /* renamed from: b */
    public final /* synthetic */ AbstractC34586a mo65748b() {
        return new C37753b();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    /* renamed from: c */
    public final boolean mo65749c() {
        return C37702a.m76322a();
    }

    /* renamed from: d */
    public static IShoppingAdsService m76354d() {
        MethodCollector.m26663i(6379);
        Object a = C81908b.m141854a(IShoppingAdsService.class, false);
        if (a != null) {
            IShoppingAdsService iShoppingAdsService = (IShoppingAdsService) a;
            MethodCollector.m26664o(6379);
            return iShoppingAdsService;
        }
        if (C81908b.f183183am == null) {
            synchronized (IShoppingAdsService.class) {
                try {
                    if (C81908b.f183183am == null) {
                        C81908b.f183183am = new ShoppingAdsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6379);
                    throw th;
                }
            }
        }
        ShoppingAdsServiceImpl shoppingAdsServiceImpl = (ShoppingAdsServiceImpl) C81908b.f183183am;
        MethodCollector.m26664o(6379);
        return shoppingAdsServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    /* renamed from: a */
    public final List<AbstractC16183k> mo65744a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return C89070n.m154522b(new SetSharedMemoryItemMethod(bVar), new GetSharedMemoryItemMethod(bVar), new OpenHybridMethod(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    /* renamed from: a */
    public final boolean mo65747a(Context context) {
        Fragment a;
        if (context != null && (context instanceof Activity) && (context instanceof ActivityC0945e)) {
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (!eVar.isFinishing() && (a = eVar.getSupportFragmentManager().mo3551a("BulletBottomSheetFragment")) != null && (a instanceof DialogInterface$OnCancelListenerC0944d)) {
                DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) a;
                if (dVar.isVisible()) {
                    dVar.dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService
    /* renamed from: a */
    public final void mo65745a(AbstractC0952i iVar, C37701a aVar, C37703a aVar2) {
        String str = "";
        C89219l.m154721d(aVar2, str);
        C89219l.m154721d(aVar2, str);
        C37712d dVar = new C37712d();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PDP_AD_INFO", aVar2);
        bundle.putFloat("PEEK_HEIGHT_RATIO", aVar.f89059a);
        bundle.putFloat("MAX_HEIGHT_RATIO", aVar.f89060b);
        String str2 = aVar.f89061c;
        if (str2 != null) {
            str = str2;
        }
        bundle.putString("SCHEMA", str);
        dVar.f89092c = aVar.f89063e;
        dVar.f89093d = aVar.f89062d;
        dVar.setArguments(bundle);
        if (iVar != null) {
            dVar.show(iVar, "BulletBottomSheetFragment");
        }
    }
}
