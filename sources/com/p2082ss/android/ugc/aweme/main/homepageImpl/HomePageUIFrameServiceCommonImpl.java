package com.p2082ss.android.ugc.aweme.main.homepageImpl;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49682j;
import com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl */
public abstract class HomePageUIFrameServiceCommonImpl implements HomePageUIFrameService {
    static {
        Covode.recordClassIndex(69452);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    public void setTitleTabVisibility(boolean z) {
        AbstractC81915c.m141874a(new C49682j(z, (byte) 0));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    public void runInTabHostRunnable(AbstractC18234b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.af_()) {
            ActivityC0945e activity = bVar.getActivity();
            if (!(activity instanceof MainActivity)) {
                activity = null;
            }
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity != null) {
                mainActivity.refreshSlideSwitchCanScrollRight();
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r8.equals("UNLOGIN_NOTIFICATION") != false) goto L_0x003b;
     */
    @Override // com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTagForCurrentTabInMainPageFragment(com.p2082ss.android.ugc.aweme.main.TabChangeManager r6, java.lang.String r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl.getTagForCurrentTabInMainPageFragment(com.ss.android.ugc.aweme.main.TabChangeManager, java.lang.String, java.lang.String):java.lang.String");
    }
}
