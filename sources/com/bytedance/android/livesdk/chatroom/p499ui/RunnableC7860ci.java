package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.C10609s;
import com.bytedance.android.livesdk.C6807ap;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ci */
final /* synthetic */ class RunnableC7860ci implements Runnable {

    /* renamed from: a */
    private final C7822br f19580a;

    /* renamed from: b */
    private final int[] f19581b;

    static {
        Covode.recordClassIndex(8655);
    }

    RunnableC7860ci(C7822br brVar, int[] iArr) {
        this.f19580a = brVar;
        this.f19581b = iArr;
    }

    public final void run() {
        C7822br brVar = this.f19580a;
        int[] iArr = this.f19581b;
        int[] iArr2 = new int[4];
        brVar.mo14109a(iArr2, iArr[0], iArr[1]);
        if (brVar.f19423V != null) {
            C6807ap apVar = new C6807ap();
            apVar.f17079a = iArr2[0];
            apVar.f17080b = iArr2[1];
            apVar.f17081c = iArr2[2];
            apVar.f17082d = iArr2[3];
            brVar.f19423V.mo28315b(C10609s.class, apVar);
        }
    }
}
