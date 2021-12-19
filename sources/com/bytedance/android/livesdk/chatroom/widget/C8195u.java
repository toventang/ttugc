package com.bytedance.android.livesdk.chatroom.widget;

import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.u */
final /* synthetic */ class C8195u implements AbstractC88433f {

    /* renamed from: a */
    private final OrientationChangeWidget f20320a;

    static {
        Covode.recordClassIndex(9018);
    }

    C8195u(OrientationChangeWidget orientationChangeWidget) {
        this.f20320a = orientationChangeWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        OrientationChangeWidget orientationChangeWidget = this.f20320a;
        C8454g gVar = (C8454g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f20901a;
        boolean z = gVar.f20903c;
        boolean z2 = false;
        boolean z3 = sparseBooleanArray.get(0);
        boolean z4 = sparseBooleanArray.get(2);
        if (orientationChangeWidget.getView() != null) {
            if (z3 || z4) {
                z2 = true;
            }
            C7573e.m15564a(orientationChangeWidget.context, orientationChangeWidget.getView(), !z2, z);
        }
    }
}
