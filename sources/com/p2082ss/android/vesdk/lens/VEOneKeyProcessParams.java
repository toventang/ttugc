package com.p2082ss.android.vesdk.lens;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.lens.VEOneKeyProcessParams */
public class VEOneKeyProcessParams extends VEBaseRecorderLensParams {
    public int faceNum;
    public Rect[] faceRects;
    public boolean isFirstFrame;
    public int iso;
    public int maxIso;
    public int minIso;

    static {
        Covode.recordClassIndex(99689);
    }
}
