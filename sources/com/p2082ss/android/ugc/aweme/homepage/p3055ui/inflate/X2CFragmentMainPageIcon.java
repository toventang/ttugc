package com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.experiment.C46722ay;
import com.p2082ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.C53308a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.C53312b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53330b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53331c;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.hometab.C53343a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53323c;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53324d;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53392e;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.notification.view.C62309h;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon */
public class X2CFragmentMainPageIcon implements AbstractC58258q {

    /* renamed from: a */
    public C53331c f122360a;

    /* renamed from: b */
    public C53348m f122361b;

    /* renamed from: c */
    public C53348m f122362c;

    /* renamed from: d */
    public C53330b f122363d;

    /* renamed from: e */
    public C53348m f122364e;

    /* renamed from: f */
    public C53348m f122365f;

    /* renamed from: g */
    public C53324d f122366g;

    /* renamed from: h */
    public Boolean f122367h;

    /* renamed from: i */
    public C53362a f122368i;

    static {
        Covode.recordClassIndex(62865);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "inflate_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return EnumC58150ad.INFLATE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: b */
    public final Class<? extends Activity> mo28743b() {
        return HomePageUIFrameServiceImpl.m108627e().mo89381a();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public final void mo89731c() {
        this.f122367h = Boolean.valueOf(AVExternalServiceImpl.m113114a().specialPlusService().isNeedShowSpecialPlusDirect());
    }

    /* renamed from: a */
    public static void m98293a(View view) {
        MethodCollector.m26663i(3678);
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        MethodCollector.m26664o(3678);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public final void mo28741a(Context context, Activity activity) {
        C53330b bVar;
        if (activity != null) {
            context = activity;
        }
        try {
            if (C46722ay.m90105a()) {
                C58221f.f132590n.mo95697a(PreDrawableInflate.class, new PreDrawableInflate());
                this.f122360a = new C53331c(C53343a.m98412a(context));
                this.f122361b = new C53348m(HomePageUIFrameServiceImpl.m108627e().mo89390c(context));
                this.f122362c = new C53348m(HomePageUIFrameServiceImpl.m108627e().mo89393d(context));
                this.f122364e = new C53348m(C62309h.m112710a(context));
                this.f122365f = new C53348m(ProfileServiceImpl.m114884g().mo101964c(context));
                C33931ar a = C53323c.m98355a(context);
                this.f122363d = new C53330b(a.f100353g, a.f100354h, a.f80245c, a.f80246d, a.f80243a);
            }
            if (C67248d.m119176d() && (bVar = this.f122363d) != null) {
                this.f122366g = new C53324d(context, this.f122363d, (ImageView) bVar.mo89795q(), (ImageView) this.f122363d.mo89801s());
                mo89731c();
            }
            if (C67248d.m119177e() && (context instanceof ActivityC0945e)) {
                this.f122368i = new C53362a(context, (char) 0);
                ActivityC0945e eVar = (ActivityC0945e) context;
                HomeTabViewModel a2 = HomeTabViewModel.C53309a.m98315a(eVar);
                for (AbstractC35329by byVar : a2.mo89740b()) {
                    View a3 = byVar.mo62208a(C53312b.f122382a);
                    this.f122368i.mo89842a(this.f122368i.mo89840a(a3, byVar.mo62209d()));
                    a2.mo89738a(byVar.mo62209d(), byVar);
                    a2.mo89737a(byVar, a3);
                }
                float a4 = (float) C53308a.m98305a(context, FollowFeedServiceImpl.m95503c().mo86503b(eVar) + ((C53392e) a2.mo89739b("For You")).getTextWidth());
                FollowFeedServiceImpl.m95503c().mo86502a(eVar, a4);
                ((C53392e) a2.mo89739b("For You")).setTextSize(a4);
            }
        } catch (Exception unused) {
        }
    }
}
