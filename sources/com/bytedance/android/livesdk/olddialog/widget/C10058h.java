package com.bytedance.android.livesdk.olddialog.widget;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p600b.C10009a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.h */
final /* synthetic */ class C10058h implements AbstractC1214u {

    /* renamed from: a */
    private final LiveNewGiftPageIndicatorWidget f24462a;

    static {
        Covode.recordClassIndex(11620);
    }

    C10058h(LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget) {
        this.f24462a = liveNewGiftPageIndicatorWidget;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        MethodCollector.m26663i(5918);
        LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = this.f24462a;
        C10009a aVar = (C10009a) obj;
        if (aVar != null) {
            boolean z = liveNewGiftPageIndicatorWidget.f24413c == aVar.f24315a;
            liveNewGiftPageIndicatorWidget.f24413c = aVar.f24315a;
            liveNewGiftPageIndicatorWidget.f24414d = aVar.f24316b;
            if (liveNewGiftPageIndicatorWidget.f24413c == 0 || liveNewGiftPageIndicatorWidget.f24413c == 1) {
                liveNewGiftPageIndicatorWidget.f24411a.setVisibility(4);
                MethodCollector.m26664o(5918);
                return;
            } else if (!z) {
                liveNewGiftPageIndicatorWidget.f24411a.removeAllViews();
                liveNewGiftPageIndicatorWidget.f24411a.setVisibility(0);
                liveNewGiftPageIndicatorWidget.f24416f.clear();
                for (int i = 0; i < liveNewGiftPageIndicatorWidget.f24413c; i++) {
                    ImageView imageView = new ImageView(liveNewGiftPageIndicatorWidget.getContext());
                    liveNewGiftPageIndicatorWidget.f24411a.addView(imageView);
                    liveNewGiftPageIndicatorWidget.f24416f.add(imageView);
                    LiveTextView liveTextView = new LiveTextView(liveNewGiftPageIndicatorWidget.getContext());
                    liveTextView.setTextSize(16.0f);
                    liveTextView.setText("  ");
                    liveNewGiftPageIndicatorWidget.f24411a.addView(liveTextView);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams.height = C3966y.m9653a(6.0f);
                    layoutParams.width = C3966y.m9653a(6.0f);
                    imageView.setBackground(C3966y.m9665c(2131234703));
                }
                ImageView imageView2 = liveNewGiftPageIndicatorWidget.f24416f.get(liveNewGiftPageIndicatorWidget.f24414d);
                if (imageView2 != null) {
                    imageView2.setBackground(C3966y.m9665c(2131234661));
                    liveNewGiftPageIndicatorWidget.f24415e = imageView2;
                }
                MethodCollector.m26664o(5918);
                return;
            } else {
                ImageView imageView3 = null;
                try {
                    imageView3 = liveNewGiftPageIndicatorWidget.f24416f.get(liveNewGiftPageIndicatorWidget.f24414d);
                } catch (Exception unused) {
                }
                if (imageView3 != liveNewGiftPageIndicatorWidget.f24415e) {
                    if (liveNewGiftPageIndicatorWidget.f24415e != null) {
                        liveNewGiftPageIndicatorWidget.f24415e.setBackground(C3966y.m9665c(2131234703));
                    }
                    if (imageView3 != null) {
                        imageView3.setBackground(C3966y.m9665c(2131234661));
                        liveNewGiftPageIndicatorWidget.f24415e = imageView3;
                    }
                }
            }
        }
        MethodCollector.m26664o(5918);
    }
}
