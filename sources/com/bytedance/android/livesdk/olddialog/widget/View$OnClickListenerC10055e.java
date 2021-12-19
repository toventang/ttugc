package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p600b.C10010b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.e */
final /* synthetic */ class View$OnClickListenerC10055e implements View.OnClickListener {

    /* renamed from: a */
    private final LiveNewGiftBottomWidget f24459a;

    static {
        Covode.recordClassIndex(11617);
    }

    View$OnClickListenerC10055e(LiveNewGiftBottomWidget liveNewGiftBottomWidget) {
        this.f24459a = liveNewGiftBottomWidget;
    }

    public final void onClick(View view) {
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f24459a;
        if (liveNewGiftBottomWidget.f24397d != null) {
            liveNewGiftBottomWidget.f24395b.f24388d.postValue(new C10010b(liveNewGiftBottomWidget.f24397d, "click_more_button"));
        }
    }
}
