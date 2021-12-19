package com.bytedance.android.livesdk.chatroom.p499ui;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p220b.C3922b;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dk */
final /* synthetic */ class C7908dk implements AbstractC89172b {

    /* renamed from: a */
    private final C7891dd f19667a;

    static {
        Covode.recordClassIndex(8703);
    }

    C7908dk(C7891dd ddVar) {
        this.f19667a = ddVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7891dd ddVar = this.f19667a;
        int intValue = ((Integer) obj).intValue();
        if (ddVar.f19629I != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ddVar.f19629I.getLayoutParams();
            layoutParams.topMargin = intValue;
            int c = C3966y.m9664c();
            if (C3922b.m9559b() && C3922b.m9557a() == 0) {
                c = 0;
            }
            layoutParams.width = c;
            layoutParams.gravity |= 1;
            ddVar.f19629I.setLayoutParams(layoutParams);
        }
        return C89391z.f203057a;
    }
}
