package com.p2082ss.android.ugc.aweme.main.uiApiImpl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.AbstractC15498b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tiktok.homepage.mainfragment.inflate.C22769a;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.C59052bb;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.main.MainPageFragment;
import com.p2082ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.p2082ss.android.ugc.aweme.main.bottomobserver.View$OnClickListenerC59058a;
import com.p2082ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61514b;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61515c;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.DiscoverCompassTab;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.DiscoverSearchTab;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.View$OnClickListenerC61510a;
import com.p2082ss.android.ugc.aweme.node.C61522a;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import com.p2082ss.android.ugc.aweme.notification.view.View$OnClickListenerC62284a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.C63810k;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl */
public final class HomePageUIFrameServiceImpl extends HomePageUIFrameServiceCommonImpl {
    static {
        Covode.recordClassIndex(69493);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: a */
    public final Class<? extends Activity> mo89381a() {
        return MainActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: b */
    public final void mo89387b() {
        ShareServiceImpl.m121448d().mo109418c().mo109466b();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: c */
    public final View mo89388c() {
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) C58221f.m105142a(new X2CFragmentMainPageIcon());
        if (x2CFragmentMainPageIcon.f122365f == null) {
            return null;
        }
        X2CFragmentMainPageIcon.m98293a(x2CFragmentMainPageIcon.f122365f);
        C53348m mVar = x2CFragmentMainPageIcon.f122365f;
        x2CFragmentMainPageIcon.f122365f = null;
        return mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: d */
    public final View mo89391d() {
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) C58221f.m105142a(new X2CFragmentMainPageIcon());
        if (x2CFragmentMainPageIcon.f122364e == null) {
            return null;
        }
        X2CFragmentMainPageIcon.m98293a(x2CFragmentMainPageIcon.f122364e);
        C53348m mVar = x2CFragmentMainPageIcon.f122364e;
        x2CFragmentMainPageIcon.f122364e = null;
        return mVar;
    }

    /* renamed from: e */
    public static HomePageUIFrameService m108627e() {
        MethodCollector.m26663i(6369);
        Object a = C81908b.m141854a(HomePageUIFrameService.class, false);
        if (a != null) {
            HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) a;
            MethodCollector.m26664o(6369);
            return homePageUIFrameService;
        }
        if (C81908b.f183300cx == null) {
            synchronized (HomePageUIFrameService.class) {
                try {
                    if (C81908b.f183300cx == null) {
                        C81908b.f183300cx = new HomePageUIFrameServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6369);
                    throw th;
                }
            }
        }
        HomePageUIFrameServiceCommonImpl homePageUIFrameServiceCommonImpl = (HomePageUIFrameServiceCommonImpl) C81908b.f183300cx;
        MethodCollector.m26664o(6369);
        return homePageUIFrameServiceCommonImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: a */
    public final AbstractC15498b mo89379a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return new C61522a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: c */
    public final C33931ar mo89390c(Context context) {
        C89219l.m154721d(context, "");
        return C61514b.m111389a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: d */
    public final ImageView mo89392d(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return (ImageView) C22769a.m42956e(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: e */
    public final View mo89394e(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return C22769a.m42953b(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: g */
    public final View mo89396g(ActivityC0945e eVar) {
        if (eVar == null) {
            return null;
        }
        return C22769a.m42952a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: i */
    public final View mo89399i(ActivityC0945e eVar) {
        if (eVar == null) {
            return null;
        }
        return C22769a.m42955d(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: k */
    public final View mo89401k(ActivityC0945e eVar) {
        if (eVar == null) {
            return null;
        }
        return C22769a.m42954c(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: a */
    public final AbstractC59108o mo89380a(Context context) {
        C89219l.m154721d(context, "");
        if (MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return new C59052bb(context, null, null);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: b */
    public final ImageView mo89384b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return (ImageView) ((MainFragmentTopRightIconInflate) C58221f.m105149b(MainFragmentTopRightIconInflate.class)).mo37083a(eVar, 6);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: h */
    public final View mo89398h(ActivityC0945e eVar) {
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C58221f.m105149b(MainFragmentTopRightIconInflate.class);
        if (eVar == null) {
            return null;
        }
        View a = mainFragmentTopRightIconInflate.mo37083a(eVar, 4);
        if (a == null) {
            return mo89399i(eVar);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: j */
    public final View mo89400j(ActivityC0945e eVar) {
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C58221f.m105149b(MainFragmentTopRightIconInflate.class);
        if (eVar == null) {
            return null;
        }
        View a = mainFragmentTopRightIconInflate.mo37083a(eVar, 5);
        if (a == null) {
            return mo89401k(eVar);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: b */
    public final AbstractC35329by mo89385b(Context context) {
        C89219l.m154721d(context, "");
        if (SearchServiceImpl.m119336t().mo106220i()) {
            return new DiscoverCompassTab(context);
        }
        return new DiscoverSearchTab(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: c */
    public final View mo89389c(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return ((MainFragmentTopRightIconInflate) C58221f.m105149b(MainFragmentTopRightIconInflate.class)).mo37083a(eVar, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: d */
    public final C33931ar mo89393d(Context context) {
        C89219l.m154721d(context, "");
        return C61514b.m111390b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: b */
    public final Class<? extends Fragment> mo89386b(String str) {
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    Class<? extends Fragment> a = C61611b.f139811a.mo99371a();
                    Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.Class<out androidx.fragment.app.Fragment>");
                    return a;
                }
                break;
            case 2223327:
                if (str.equals("HOME")) {
                    return C59014ae.class;
                }
                break;
            case 2614219:
                str.equals("USER");
                break;
            case 185242617:
                if (str.equals("page_profile")) {
                    return C63810k.class;
                }
                break;
            case 883457358:
                if (str.equals("page_feed")) {
                    return MainPageFragment.class;
                }
                break;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return C61515c.class;
                }
                break;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: f */
    public final View mo89395f(ActivityC0945e eVar) {
        ViewParent viewParent;
        MethodCollector.m26663i(8425);
        MainFragmentTopLeftIconInflate mainFragmentTopLeftIconInflate = (MainFragmentTopLeftIconInflate) C58221f.m105149b(MainFragmentTopLeftIconInflate.class);
        ImageView imageView = null;
        if (eVar == null) {
            MethodCollector.m26664o(8425);
            return null;
        }
        C89219l.m154721d(eVar, "");
        if (mainFragmentTopLeftIconInflate.f53773a == null) {
            mainFragmentTopLeftIconInflate.f53773a = C22769a.m42952a(eVar);
            if (C67248d.m119180h()) {
                mainFragmentTopLeftIconInflate.mo37082c();
            }
        }
        ImageView imageView2 = mainFragmentTopLeftIconInflate.f53773a;
        if (imageView2 != null) {
            viewParent = imageView2.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(mainFragmentTopLeftIconInflate.f53773a);
        }
        ImageView imageView3 = mainFragmentTopLeftIconInflate.f53773a;
        mainFragmentTopLeftIconInflate.f53773a = null;
        if (imageView3 != null) {
            if (imageView3 instanceof ImageView) {
                imageView = imageView3;
            }
            ImageView imageView4 = imageView;
            MethodCollector.m26664o(8425);
            return imageView4;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        MethodCollector.m26664o(8425);
        throw nullPointerException;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: a */
    public final void mo89383a(String str) {
        Activity j = C17873f.m33102j();
        if (!TextUtils.equals("HOME", str) && j != null) {
            UgCommonServiceImpl.m138290j().mo123094a(j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: a */
    public final void mo89382a(ActivityC0945e eVar, Bundle bundle) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bundle, "");
        IMService.createIIMServicebyMonsterPlugin(false).openSessionListActivity(eVar, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* renamed from: a */
    public final View.OnClickListener mo89378a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    return new View$OnClickListenerC62284a(context);
                }
                break;
            case 2223327:
                if (str.equals("HOME")) {
                    return new View$OnClickListenerC59058a(context);
                }
                break;
            case 482617583:
                if (str.equals("PUBLISH")) {
                    return new BottomPublishObserver(context);
                }
                break;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return new View$OnClickListenerC61510a(context);
                }
                break;
        }
        C89219l.m154715b();
        return null;
    }
}
