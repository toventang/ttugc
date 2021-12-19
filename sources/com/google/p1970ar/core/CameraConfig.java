package com.google.p1970ar.core;

import android.util.Range;
import android.util.Size;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.util.EnumSet;

/* renamed from: com.google.ar.core.CameraConfig */
public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32574);
    }

    protected CameraConfig() {
    }

    private static native void nativeDestroyCameraConfig(long j, long j2);

    private native String nativeGetCameraId(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native void nativeGetFpsRange(long j, long j2, int[] iArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j, long j2);

    private native void nativeGetTextureDimensions(long j, long j2, int[] iArr);

    /* renamed from: com.google.ar.core.CameraConfig$FacingDirection */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32576);
        }

        static FacingDirection forNumber(int i) {
            FacingDirection[] values = values();
            for (FacingDirection facingDirection : values) {
                if (facingDirection.nativeCode == i) {
                    return facingDirection;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native FacingDirection, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private FacingDirection(int i) {
            this.nativeCode = i;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(10053);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(10053);
    }

    public String getCameraId() {
        MethodCollector.m26663i(10672);
        String nativeGetCameraId = nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(10672);
        return nativeGetCameraId;
    }

    public DepthSensorUsage getDepthSensorUsage() {
        MethodCollector.m26663i(10505);
        DepthSensorUsage forNumber = DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(10505);
        return forNumber;
    }

    public FacingDirection getFacingDirection() {
        MethodCollector.m26663i(10674);
        FacingDirection forNumber = FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(10674);
        return forNumber;
    }

    public StereoCameraUsage getStereoCameraUsage() {
        MethodCollector.m26663i(10814);
        StereoCameraUsage forNumber = StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(10814);
        return forNumber;
    }

    /* renamed from: com.google.ar.core.CameraConfig$DepthSensorUsage */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32575);
        }

        static EnumSet<DepthSensorUsage> forBitFlags(int i) {
            EnumSet<DepthSensorUsage> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            DepthSensorUsage[] values = values();
            for (DepthSensorUsage depthSensorUsage : values) {
                if ((depthSensorUsage.nativeCode & i) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        static DepthSensorUsage forNumber(int i) {
            DepthSensorUsage[] values = values();
            for (DepthSensorUsage depthSensorUsage : values) {
                if (depthSensorUsage.nativeCode == i) {
                    return depthSensorUsage;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native DepthSensorUsage, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private DepthSensorUsage(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$StereoCameraUsage */
    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32577);
        }

        static EnumSet<StereoCameraUsage> forBitFlags(int i) {
            EnumSet<StereoCameraUsage> noneOf = EnumSet.noneOf(StereoCameraUsage.class);
            StereoCameraUsage[] values = values();
            for (StereoCameraUsage stereoCameraUsage : values) {
                if ((stereoCameraUsage.nativeCode & i) != 0) {
                    noneOf.add(stereoCameraUsage);
                }
            }
            return noneOf;
        }

        static StereoCameraUsage forNumber(int i) {
            StereoCameraUsage[] values = values();
            for (StereoCameraUsage stereoCameraUsage : values) {
                if (stereoCameraUsage.nativeCode == i) {
                    return stereoCameraUsage;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native StereoCameraUsage, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private StereoCameraUsage(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$TargetFps */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32578);
        }

        static EnumSet<TargetFps> forBitFlags(int i) {
            EnumSet<TargetFps> noneOf = EnumSet.noneOf(TargetFps.class);
            TargetFps[] values = values();
            for (TargetFps targetFps : values) {
                if ((targetFps.nativeCode & i) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }

        private TargetFps(int i) {
            this.nativeCode = i;
        }
    }

    public Range<Integer> getFpsRange() {
        MethodCollector.m26663i(10504);
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        Range<Integer> range = new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        MethodCollector.m26664o(10504);
        return range;
    }

    public Size getImageSize() {
        MethodCollector.m26663i(10212);
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        Size size = new Size(iArr[0], iArr[1]);
        MethodCollector.m26664o(10212);
        return size;
    }

    public Size getTextureSize() {
        MethodCollector.m26663i(10365);
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        Size size = new Size(iArr[0], iArr[1]);
        MethodCollector.m26664o(10365);
        return size;
    }

    CameraConfig(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
