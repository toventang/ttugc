package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.f */
final /* synthetic */ class C10056f implements AbstractC88433f {

    /* renamed from: a */
    private final LiveNewGiftBottomWidget f24460a;

    static {
        Covode.recordClassIndex(11618);
    }

    C10056f(LiveNewGiftBottomWidget liveNewGiftBottomWidget) {
        this.f24460a = liveNewGiftBottomWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f24460a;
        if (liveNewGiftBottomWidget.isViewValid()) {
            liveNewGiftBottomWidget.mo16868a(((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b());
        }
    }
}
