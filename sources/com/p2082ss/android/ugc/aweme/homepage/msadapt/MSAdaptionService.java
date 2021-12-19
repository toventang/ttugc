package com.p2082ss.android.ugc.aweme.homepage.msadapt;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.C52981a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService */
public final class MSAdaptionService implements IMSAdaptionService {

    /* renamed from: b */
    private WeakReference<Fragment> f121826b;

    /* renamed from: c */
    private Aweme f121827c;

    static {
        Covode.recordClassIndex(62513);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: b */
    public final Aweme mo89373b() {
        return this.f121827c;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final Fragment mo89366a() {
        WeakReference<Fragment> weakReference = this.f121826b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    public static IMSAdaptionService m97895c() {
        MethodCollector.m26663i(10213);
        Object a = C81908b.m141854a(IMSAdaptionService.class, false);
        if (a != null) {
            IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) a;
            MethodCollector.m26664o(10213);
            return iMSAdaptionService;
        }
        if (C81908b.f183242bs == null) {
            synchronized (IMSAdaptionService.class) {
                try {
                    if (C81908b.f183242bs == null) {
                        C81908b.f183242bs = new MSAdaptionService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10213);
                    throw th;
                }
            }
        }
        MSAdaptionService mSAdaptionService = (MSAdaptionService) C81908b.f183242bs;
        MethodCollector.m26664o(10213);
        return mSAdaptionService;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService$a */
    static final class C52979a implements AwemeChangeCallBack.AbstractC59111a {

        /* renamed from: a */
        final /* synthetic */ MSAdaptionService f121828a;

        static {
            Covode.recordClassIndex(62514);
        }

        C52979a(MSAdaptionService mSAdaptionService) {
            this.f121828a = mSAdaptionService;
        }

        @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
        /* renamed from: a */
        public final void mo37101a(Aweme aweme) {
            if (aweme != null) {
                this.f121828a.mo89371a(aweme);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final void mo89371a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f121827c = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: b */
    public final boolean mo89375b(Context context) {
        if (context != null && mo89372a(context)) {
            return C52981a.C52982a.m97914d(context);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: b */
    public final void mo89374b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        if (mo89377c((Context) eVar)) {
            SmartRouter.buildRoute(eVar, "//duo").open();
            eVar.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final AbstractC59105l mo89368a(Activity activity) {
        AbstractC59105l lVar = null;
        if (activity == null) {
            return null;
        }
        if (!(activity instanceof ActivityC0945e)) {
            activity = null;
        }
        Fragment b = TabChangeManager.C59002a.m108439a((ActivityC0945e) activity).mo96536b();
        if (b instanceof AbstractC59105l) {
            lVar = b;
        }
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final void mo89369a(Fragment fragment) {
        if (fragment != null) {
            this.f121826b = new WeakReference<>(fragment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: c */
    public final void mo89376c(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1196i lifecycle = eVar.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
            mo89374b(eVar);
            int e = C52981a.C52982a.m97915e(eVar);
            if (!mo89375b((Context) eVar)) {
                return;
            }
            if (e == 3 || e == 1) {
                LoginUtilsServiceImpl.m108310a().mo96439a(new Bundle());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final void mo89370a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        if (mo89372a((Context) eVar)) {
            AwemeChangeCallBack.m108594a(eVar, eVar, new C52979a(this));
            eVar.setRequestedOrientation(-1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: c */
    public final boolean mo89377c(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        boolean b = mo89375b(context);
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        if (resources.getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!b || !z) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final boolean mo89372a(Context context) {
        if (context == null) {
            return false;
        }
        return C52981a.C52982a.m97912b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    /* renamed from: a */
    public final AbstractC58264w mo89367a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        return new ReportActivityStatusTask(str, bundle);
    }
}
