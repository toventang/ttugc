package com.p2082ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.account.login.h */
final /* synthetic */ class RunnableC31939h implements Runnable {

    /* renamed from: a */
    private final ViewPagerBottomSheetBehavior f76282a;

    static {
        Covode.recordClassIndex(38683);
    }

    RunnableC31939h(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.f76282a = viewPagerBottomSheetBehavior;
    }

    public final void run() {
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f76282a;
        if (viewPagerBottomSheetBehavior.f76016j != null) {
            viewPagerBottomSheetBehavior.f76017k = new WeakReference<>(viewPagerBottomSheetBehavior.mo57748a(viewPagerBottomSheetBehavior.f76016j.get()));
        }
    }
}
