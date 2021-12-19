package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.CameraId */
public enum CameraId {
    CAMERA_ID_FRONT(0),
    CAMERA_ID_BACK(1);
    
    private int value = 1;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        int i = C860901.$SwitchMap$com$ss$bytertc$engine$data$CameraId[ordinal()];
        if (i == 1) {
            return "kCameraIDFront";
        }
        if (i != 2) {
            return "";
        }
        return "kCameraIDBack";
    }

    /* renamed from: com.ss.bytertc.engine.data.CameraId$1 */
    static /* synthetic */ class C860901 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$CameraId;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 100973(0x18a6d, float:1.41493E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.CameraId[] r0 = com.p2082ss.bytertc.engine.data.CameraId.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.bytertc.engine.data.CameraId.C860901.$SwitchMap$com$ss$bytertc$engine$data$CameraId = r2
                com.ss.bytertc.engine.data.CameraId r0 = com.p2082ss.bytertc.engine.data.CameraId.CAMERA_ID_FRONT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.bytertc.engine.data.CameraId.C860901.$SwitchMap$com$ss$bytertc$engine$data$CameraId     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.CameraId r0 = com.p2082ss.bytertc.engine.data.CameraId.CAMERA_ID_BACK     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.data.CameraId.C860901.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100972);
    }

    public static CameraId fromId(int i) {
        CameraId[] values = values();
        for (CameraId cameraId : values) {
            if (cameraId.value() == i) {
                return cameraId;
            }
        }
        return null;
    }

    private CameraId(int i) {
        this.value = i;
    }
}
