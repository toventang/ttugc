package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.b */
final /* synthetic */ class RunnableC72913b implements Runnable {

    /* renamed from: a */
    private final ViewPagerBottomSheetBehavior f163634a;

    static {
        Covode.recordClassIndex(85613);
    }

    RunnableC72913b(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.f163634a = viewPagerBottomSheetBehavior;
    }

    public final void run() {
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f163634a;
        viewPagerBottomSheetBehavior.f163610j = new WeakReference<>(viewPagerBottomSheetBehavior.mo115289a(viewPagerBottomSheetBehavior.f163609i.get()));
    }
}
