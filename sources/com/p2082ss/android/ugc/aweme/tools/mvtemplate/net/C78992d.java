package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d */
public final /* synthetic */ class C78992d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f177519a;

    static {
        Covode.recordClassIndex(92150);
        int[] iArr = new int[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.values().length];
        f177519a = iArr;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE.ordinal()] = 1;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON.ordinal()] = 2;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO.ordinal()] = 3;
        iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON.ordinal()] = 4;
    }
}
