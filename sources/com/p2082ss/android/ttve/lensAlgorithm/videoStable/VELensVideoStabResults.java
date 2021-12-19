package com.p2082ss.android.ttve.lensAlgorithm.videoStable;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.lensAlgorithm.VEBaseLensResults;

/* renamed from: com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults */
public class VELensVideoStabResults extends VEBaseLensResults {
    public int processHeight;
    public int processWidth;
    public String ptsList;
    public VideoStabResult[] videoStabResult;

    static {
        Covode.recordClassIndex(37198);
    }

    /* renamed from: com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults$VideoStabResult */
    public static class VideoStabResult {
        public String matrixList;
        public float realCropRatio;
        public int realRadius;
        public float videoStabMaxCropRatio;
        public int videoStabMotionType;
        public int videoStabSmoothRadius;

        static {
            Covode.recordClassIndex(37199);
        }

        public VideoStabResult() {
        }

        public VideoStabResult(float f, int i, int i2, String str, int i3, float f2) {
            this.videoStabMaxCropRatio = f;
            this.videoStabSmoothRadius = i;
            this.videoStabMotionType = i2;
            this.matrixList = str;
            this.realRadius = i3;
            this.realCropRatio = f2;
        }
    }

    public VELensVideoStabResults() {
    }

    public VELensVideoStabResults(VideoStabResult[] videoStabResultArr, String str, int i, int i2) {
        this.videoStabResult = videoStabResultArr;
        this.ptsList = str;
        this.processWidth = i;
        this.processHeight = i2;
    }
}
