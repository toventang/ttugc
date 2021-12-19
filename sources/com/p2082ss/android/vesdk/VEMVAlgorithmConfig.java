package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig */
public class VEMVAlgorithmConfig {
    public AlgorithmInfo[] infos;

    static {
        Covode.recordClassIndex(99338);
    }

    /* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig$MV_REESULT_IN_TYPE */
    public enum MV_REESULT_IN_TYPE {
        MV_REESULT_IN_TYPE_IMAGE,
        MV_REESULT_IN_TYPE_VIDEO,
        MV_REESULT_IN_TYPE_JSON;

        static {
            Covode.recordClassIndex(99341);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig$MV_REESULT_OUT_TYPE */
    public enum MV_REESULT_OUT_TYPE {
        MV_REESULT_OUT_TYPE_IMAGE,
        MV_REESULT_OUT_TYPE_VIDEO,
        MV_REESULT_OUT_TYPE_IMAGE_AND_JSON,
        MV_REESULT_OUT_TYPE_VIDEO_AND_JSON,
        MV_REESULT_OUT_TYPE_JSON,
        MV_REESULT_OUT_TYPE_INVALID;

        static {
            Covode.recordClassIndex(99342);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig$AlgorithmInfo */
    public class AlgorithmInfo {
        public AlgorithmItem[] items;
        public String photoPath;

        static {
            Covode.recordClassIndex(99339);
        }

        public AlgorithmInfo() {
        }

        /* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig$AlgorithmInfo$AlgorithmItem */
        public class AlgorithmItem {
            public String algorithmName;
            public String algorithmParamJson;
            public boolean isNeedServerExecute;
            public MV_REESULT_OUT_TYPE result_out_type;

            static {
                Covode.recordClassIndex(99340);
            }

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z) {
                this(algorithmInfo, str, z, null);
            }

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z, String str2) {
                this(str, z, str2, -1);
            }

            public AlgorithmItem(String str, boolean z, String str2, int i) {
                this.algorithmName = str;
                this.isNeedServerExecute = z;
                this.algorithmParamJson = str2;
                if (i == 0) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE;
                } else if (i == 1) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO;
                } else if (i == 2) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON;
                } else if (i == 3) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON;
                } else if (i == 4) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_JSON;
                } else {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_INVALID;
                }
            }
        }
    }
}
