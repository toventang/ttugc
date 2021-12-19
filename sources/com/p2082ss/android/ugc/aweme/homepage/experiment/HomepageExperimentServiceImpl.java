package com.p2082ss.android.ugc.aweme.homepage.experiment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.PreDrawableInflate;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CActivityMain;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMain;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPage;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.X2CTabItem;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;

/* renamed from: com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl */
public final class HomepageExperimentServiceImpl implements IHomepageExperimentService {
    static {
        Covode.recordClassIndex(62502);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IHomepageExperimentService
    /* renamed from: a */
    public final void mo89410a() {
        C58221f.f132590n.mo95697a(X2CActivityMain.class, new X2CActivityMain()).mo95697a(X2CFragmentMainPage.class, new X2CFragmentMainPage()).mo95697a(X2CFragmentMain.class, new X2CFragmentMain()).mo95697a(X2CTabItem.class, new X2CTabItem()).mo95697a(PreDrawableInflate.class, new PreDrawableInflate());
        CommentServiceImpl.m73664e();
        new C58221f.C58222a().mo95699b(PreDrawableInflate.class).mo95706a();
    }
}
