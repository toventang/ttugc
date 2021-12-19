package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.r */
public class C58871r extends C58868o {

    /* renamed from: c */
    private int f134028c;

    /* renamed from: d */
    private int f134029d;

    static {
        Covode.recordClassIndex(69185);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58868o
    /* renamed from: c */
    public final void mo96301c() {
        super.mo96301c();
        int i = this.f134028c;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f134028c = 0;
        }
        int i2 = this.f134029d;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f134029d = 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58868o
    /* renamed from: a */
    public final boolean mo96300a(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.f134028c = iArr[0];
        if (!super.mo96300a(i, i2)) {
            return false;
        }
        this.f134029d = C58859i.m108119a(i, i2);
        return true;
    }
}
