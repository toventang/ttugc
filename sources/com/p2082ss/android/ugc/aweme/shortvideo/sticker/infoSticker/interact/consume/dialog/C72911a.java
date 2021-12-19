package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a */
public final class C72911a {
    static {
        Covode.recordClassIndex(85611);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a$a */
    public static class C72912a extends ViewPager.C1582h {

        /* renamed from: a */
        private final ViewPager f163632a;

        /* renamed from: b */
        private final ViewPagerBottomSheetBehavior<View> f163633b;

        static {
            Covode.recordClassIndex(85612);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            ViewPager viewPager = this.f163632a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f163633b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(new RunnableC72913b(viewPagerBottomSheetBehavior));
        }

        private C72912a(ViewPager viewPager, View view) {
            this.f163632a = viewPager;
            this.f163633b = ViewPagerBottomSheetBehavior.m128739b(view);
        }

        public /* synthetic */ C72912a(ViewPager viewPager, View view, byte b) {
            this(viewPager, view);
        }
    }
}
