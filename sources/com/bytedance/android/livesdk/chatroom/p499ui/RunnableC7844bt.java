package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.C10609s;
import com.bytedance.android.livesdk.C6807ap;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bt */
final /* synthetic */ class RunnableC7844bt implements Runnable {

    /* renamed from: a */
    private final C7822br f19564a;

    static {
        Covode.recordClassIndex(8639);
    }

    RunnableC7844bt(C7822br brVar) {
        this.f19564a = brVar;
    }

    public final void run() {
        C7822br brVar = this.f19564a;
        int[] iArr = new int[4];
        int[] iArr2 = new int[2];
        if (brVar.f19514v != null) {
            brVar.f19514v.getVideoSize(iArr2);
        }
        brVar.mo14109a(iArr, iArr2[0], iArr2[1]);
        if (brVar.f19423V != null) {
            C6807ap apVar = new C6807ap();
            apVar.f17079a = iArr[0];
            apVar.f17080b = iArr[1];
            apVar.f17081c = iArr[2];
            apVar.f17082d = iArr[3];
            brVar.f19423V.mo28315b(C10609s.class, apVar);
        }
    }
}
