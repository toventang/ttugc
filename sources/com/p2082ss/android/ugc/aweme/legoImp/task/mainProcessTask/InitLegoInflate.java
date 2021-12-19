package com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.api.C48334h;
import com.p2082ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate */
public final class InitLegoInflate implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68700);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        IHomepageExperimentService homepageExperimentServiceImpl;
        MethodCollector.m26663i(4661);
        if (Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25) {
            new FrameLayout(context);
        }
        Object a = C81908b.m141854a(IHomepageExperimentService.class, false);
        if (a != null) {
            homepageExperimentServiceImpl = (IHomepageExperimentService) a;
        } else {
            homepageExperimentServiceImpl = new HomepageExperimentServiceImpl();
        }
        homepageExperimentServiceImpl.mo89410a();
        CommonFeedLaunchServiceImpl.m91019b();
        NoticeServiceImpl.m112566f();
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).initLegoInflate();
        C48334h.m91798a();
        C58221f.f132590n.mo95697a(X2CFragmentMainPageIcon.class, new X2CFragmentMainPageIcon());
        MethodCollector.m26664o(4661);
    }
}
