package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C6911bk;
import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.x */
final /* synthetic */ class C8198x implements AbstractC88433f {

    /* renamed from: a */
    private final SplitScreenWidget f20323a;

    static {
        Covode.recordClassIndex(9021);
    }

    C8198x(SplitScreenWidget splitScreenWidget) {
        this.f20323a = splitScreenWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        SplitScreenWidget splitScreenWidget = this.f20323a;
        C7401r rVar = (C7401r) obj;
        if (splitScreenWidget.f20243a != null && rVar != null && C7298b.m15199a(splitScreenWidget.dataChannel)) {
            if (!rVar.f18339b) {
                C13628n.m24511a(splitScreenWidget.f20243a.f18138c, C3966y.m9667d(R.dimen.wo), -1);
                C13628n.m24511a(splitScreenWidget.f20243a.f18139d, -1, -1);
                return;
            }
            int b = C3966y.m9662b() - (rVar.f18338a + C3966y.m9667d(R.dimen.wp));
            C89378p pVar = (C89378p) splitScreenWidget.dataChannel.mo28318b(C6911bk.class);
            if (pVar == null || ((Integer) pVar.getFirst()).intValue() <= 0 || ((Integer) pVar.getSecond()).intValue() <= 0) {
                C13628n.m24511a(splitScreenWidget.f20243a.f18138c, C3966y.m9667d(R.dimen.wm), -1);
            } else {
                int c = C3966y.m9664c() - ((((Integer) pVar.getFirst()).intValue() / ((Integer) pVar.getSecond()).intValue()) * b);
                if (C3931d.m9571a(splitScreenWidget.getContext())) {
                    c -= C3966y.m9666d();
                }
                C13628n.m24511a(splitScreenWidget.f20243a.f18138c, c, -1);
            }
            C13628n.m24511a(splitScreenWidget.f20243a.f18139d, -1, b - C3966y.m9653a(24.0f));
        }
    }
}
