package com.p2082ss.android.medialib;

import android.media.Image;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.camera.C30002e;
import com.p2082ss.android.medialib.camera.ImageFrame;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.g */
public final class C30007g {

    /* renamed from: a */
    ImageFrame f71609a;

    static {
        Covode.recordClassIndex(36460);
    }

    public C30007g(ImageFrame imageFrame) {
        this.f71609a = imageFrame;
    }

    /* renamed from: a */
    public final boolean mo52833a(int[][] iArr, ByteBuffer[] byteBufferArr) {
        Image.Plane[] planeArr;
        C30002e plane = this.f71609a.getPlane();
        if (plane == null || (planeArr = plane.f71604a) == null) {
            return false;
        }
        for (int i = 0; i < planeArr.length; i++) {
            byteBufferArr[i] = planeArr[i].getBuffer();
            int remaining = byteBufferArr[i].remaining();
            int rowStride = planeArr[i].getRowStride();
            if (rowStride <= 0) {
                rowStride = this.f71609a.width;
                C85315al.m146642d("PlanFrame", "rowStride <= 0");
            }
            int pixelStride = planeArr[i].getPixelStride();
            if (pixelStride <= 0) {
                C85315al.m146642d("PlanFrame", "pixelStride <= 0");
                pixelStride = 1;
            }
            iArr[i] = new int[]{remaining, rowStride, pixelStride};
        }
        return true;
    }
}
