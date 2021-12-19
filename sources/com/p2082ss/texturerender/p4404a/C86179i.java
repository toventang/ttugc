package com.p2082ss.texturerender.p4404a;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86197g;

/* renamed from: com.ss.texturerender.a.i */
public final class C86179i {

    /* renamed from: a */
    public int f192208a;

    static {
        Covode.recordClassIndex(101322);
    }

    public C86179i() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        C86197g.m148104a("createFbo");
        this.f192208a = iArr[0];
    }

    /* renamed from: a */
    public final int mo136490a(int i) {
        GLES20.glBindFramebuffer(36160, this.f192208a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            return -1;
        }
        return 0;
    }
}
