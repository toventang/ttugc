package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.widget.RelativeLayout;
import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.livesdk.p561j.C9046bl;
import com.bytedance.android.livesdk.p561j.C9117eb;
import com.bytedance.android.livesdk.p561j.C9134p;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.s */
final /* synthetic */ class C8116s implements AbstractC89172b {

    /* renamed from: a */
    private final BottomRightBannerWidget f20128a;

    static {
        Covode.recordClassIndex(8923);
    }

    C8116s(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20128a = bottomRightBannerWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20128a;
        boolean z = true;
        boolean z2 = !((C4419h) obj).f12018a;
        boolean a = bottomRightBannerWidget.mo14258a();
        if (bottomRightBannerWidget.isViewValid && bottomRightBannerWidget.getView() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bottomRightBannerWidget.getView().getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (z2) {
                bottomRightBannerWidget.f19811i = false;
                layoutParams2.addRule(12);
                layoutParams2.bottomMargin = C3966y.m9667d(R.dimen.zc);
                layoutParams2.addRule(11);
                layoutParams2.rightMargin = C3966y.m9667d(R.dimen.ze);
                bottomRightBannerWidget.show();
                bottomRightBannerWidget.dataChannel.mo28320c(C9046bl.class, false);
            } else {
                bottomRightBannerWidget.f19811i = true;
                layoutParams2.addRule(10);
                if (C11279p.m20029f()) {
                    layoutParams2.topMargin = C3966y.m9667d(R.dimen.zf);
                } else {
                    layoutParams2.topMargin = C3966y.m9667d(R.dimen.zg);
                }
                layoutParams2.addRule(21);
                layoutParams2.setMarginEnd(C3966y.m9667d(R.dimen.ze));
                if (a) {
                    bottomRightBannerWidget.hide();
                    C3227a.m8722b("task_banner");
                } else if (bottomRightBannerWidget.isShowing() && bottomRightBannerWidget.f19803a != null && bottomRightBannerWidget.f19803a.f17423a != null && bottomRightBannerWidget.f19803a.f17423a.getVisibility() == 0) {
                    bottomRightBannerWidget.dataChannel.mo28320c(C9046bl.class, true);
                }
            }
            DataChannel dataChannel = bottomRightBannerWidget.dataChannel;
            if (!bottomRightBannerWidget.isShowing() || bottomRightBannerWidget.f19803a == null || bottomRightBannerWidget.f19803a.f17423a == null || bottomRightBannerWidget.f19803a.f17423a.getVisibility() != 0) {
                z = false;
            }
            dataChannel.mo28315b(C9134p.class, Boolean.valueOf(z));
            bottomRightBannerWidget.dataChannel.mo28315b(C9117eb.class, layoutParams2);
            bottomRightBannerWidget.getView().setLayoutParams(layoutParams2);
        }
        return C89391z.f203057a;
    }
}
