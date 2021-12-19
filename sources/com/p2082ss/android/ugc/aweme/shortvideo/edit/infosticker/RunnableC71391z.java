package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.z */
public final /* synthetic */ class RunnableC71391z implements Runnable {

    /* renamed from: a */
    private final C71056i f159975a;

    /* renamed from: b */
    private final int f159976b;

    /* renamed from: c */
    private final int f159977c;

    /* renamed from: d */
    private final int[] f159978d;

    static {
        Covode.recordClassIndex(83919);
    }

    public RunnableC71391z(C71056i iVar, int i, int i2, int[] iArr) {
        this.f159975a = iVar;
        this.f159976b = i;
        this.f159977c = i2;
        this.f159978d = iArr;
    }

    public final void run() {
        C71056i iVar = this.f159975a;
        int i = this.f159976b;
        int i2 = this.f159977c;
        int[] iArr = this.f159978d;
        if (i != 0 && i2 != 0 && iArr != null) {
            iVar.f159099F = new Rect(0, iArr[1], i, i2 + iArr[1]);
        }
    }
}
