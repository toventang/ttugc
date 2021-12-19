package com.p2082ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.vealgorithm.params.VEFaceReenactParam */
public class VEFaceReenactParam extends VEAlgorithmParam {
    public String algConfigJson;
    public boolean blend;
    public int faceCount;
    public boolean hwEncode;
    public String imagePath;
    public String kernel_path;
    public String keyPointFilePath;
    public int outMaxHeight;
    public int outMaxWidth;
    public String outputPath;

    static {
        Covode.recordClassIndex(37365);
    }

    public VEFaceReenactParam() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_FACE_REENACT;
    }
}
