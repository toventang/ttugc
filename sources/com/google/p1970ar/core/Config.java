package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Config */
public class Config {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    static {
        Covode.recordClassIndex(32581);
    }

    protected Config() {
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j, long j2);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetDepthMode(long j, long j2);

    private native int nativeGetDepthModePrivate(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetInstantPlacementMode(long j, long j2);

    private native int nativeGetInstantPlacementModePrivate(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetSegmentationMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetDepthMode(long j, long j2, int i);

    private native void nativeSetDepthModePrivate(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementModePrivate(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetSegmentationMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    /* renamed from: com.google.ar.core.Config$FocusMode */
    public enum FocusMode {
        FIXED(0),
        AUTO(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32585);
        }

        static FocusMode forNumber(int i) {
            FocusMode[] values = values();
            for (FocusMode focusMode : values) {
                if (focusMode.nativeCode == i) {
                    return focusMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native FocusMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private FocusMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$UpdateMode */
    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32590);
        }

        static UpdateMode forNumber(int i) {
            UpdateMode[] values = values();
            for (UpdateMode updateMode : values) {
                if (updateMode.nativeCode == i) {
                    return updateMode;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native UpdateMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private UpdateMode(int i) {
            this.nativeCode = i;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(14101);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(14101);
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        MethodCollector.m26663i(14020);
        AugmentedFaceMode forNumber = AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14020);
        return forNumber;
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        MethodCollector.m26663i(13993);
        AugmentedImageDatabase augmentedImageDatabase = new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13993);
        return augmentedImageDatabase;
    }

    public CloudAnchorMode getCloudAnchorMode() {
        MethodCollector.m26663i(13954);
        CloudAnchorMode forNumber = CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13954);
        return forNumber;
    }

    public DepthMode getDepthMode() {
        MethodCollector.m26663i(14099);
        DepthMode forNumber = DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14099);
        return forNumber;
    }

    public DepthMode getDepthModePrivate() {
        MethodCollector.m26663i(14100);
        DepthMode forNumber = DepthMode.forNumber(nativeGetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14100);
        return forNumber;
    }

    public FocusMode getFocusMode() {
        MethodCollector.m26663i(14065);
        FocusMode forNumber = FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14065);
        return forNumber;
    }

    public InstantPlacementMode getInstantPlacementMode() {
        MethodCollector.m26663i(14095);
        InstantPlacementMode forNumber = InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14095);
        return forNumber;
    }

    public InstantPlacementMode getInstantPlacementModePrivate() {
        MethodCollector.m26663i(14096);
        InstantPlacementMode forNumber = InstantPlacementMode.forNumber(nativeGetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14096);
        return forNumber;
    }

    public LightEstimationMode getLightEstimationMode() {
        MethodCollector.m26663i(13941);
        LightEstimationMode forNumber = LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13941);
        return forNumber;
    }

    public PlaneFindingMode getPlaneFindingMode() {
        MethodCollector.m26663i(13943);
        PlaneFindingMode forNumber = PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13943);
        return forNumber;
    }

    public SegmentationMode getSegmentationMode() {
        MethodCollector.m26663i(14040);
        SegmentationMode forNumber = SegmentationMode.forNumber(nativeGetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14040);
        return forNumber;
    }

    public UpdateMode getUpdateMode() {
        MethodCollector.m26663i(13947);
        UpdateMode forNumber = UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13947);
        return forNumber;
    }

    /* renamed from: com.google.ar.core.Config$CloudAnchorMode */
    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1),
        ENABLED_WITH_EARTH_LOCALIZATION(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32583);
        }

        static CloudAnchorMode forNumber(int i) {
            CloudAnchorMode[] values = values();
            for (CloudAnchorMode cloudAnchorMode : values) {
                if (cloudAnchorMode.nativeCode == i) {
                    return cloudAnchorMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AnchorHostingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private CloudAnchorMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$DepthMode */
    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        ALWAYS_ENABLED(4),
        RAW_DEPTH_ONLY(3);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32584);
        }

        static DepthMode forNumber(int i) {
            DepthMode[] values = values();
            for (DepthMode depthMode : values) {
                if (depthMode.nativeCode == i) {
                    return depthMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native DepthMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private DepthMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$InstantPlacementMode */
    public enum InstantPlacementMode {
        DISABLED(0),
        ENABLED(1),
        LOCAL_Y_UP(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32586);
        }

        static InstantPlacementMode forNumber(int i) {
            InstantPlacementMode[] values = values();
            for (InstantPlacementMode instantPlacementMode : values) {
                if (instantPlacementMode.nativeCode == i) {
                    return instantPlacementMode;
                }
            }
            StringBuilder sb = new StringBuilder(67);
            sb.append("Unexpected value for native InstantPlacementMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private InstantPlacementMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$LightEstimationMode */
    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32587);
        }

        static LightEstimationMode forNumber(int i) {
            LightEstimationMode[] values = values();
            for (LightEstimationMode lightEstimationMode : values) {
                if (lightEstimationMode.nativeCode == i) {
                    return lightEstimationMode;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private LightEstimationMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$PlaneFindingMode */
    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3),
        HORIZONTAL_AND_VERTICAL_LOW_FEATURE_GROWTH(4);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32588);
        }

        static PlaneFindingMode forNumber(int i) {
            PlaneFindingMode[] values = values();
            for (PlaneFindingMode planeFindingMode : values) {
                if (planeFindingMode.nativeCode == i) {
                    return planeFindingMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native PlaneFindingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private PlaneFindingMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$SegmentationMode */
    public enum SegmentationMode {
        DISABLED(0),
        PEOPLE(6);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32589);
        }

        static SegmentationMode forNumber(int i) {
            SegmentationMode[] values = values();
            for (SegmentationMode segmentationMode : values) {
                if (segmentationMode.nativeCode == i) {
                    return segmentationMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native SegmentationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private SegmentationMode(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Config$AugmentedFaceMode */
    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2),
        MESH3D_IMPROVED_LIP_EYE(401),
        MESH3D_IMPROVED_EYE(405),
        MESH3D_FRONT_OR_BACK_PARTNER(418);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32582);
        }

        static AugmentedFaceMode forNumber(int i) {
            AugmentedFaceMode[] values = values();
            for (AugmentedFaceMode augmentedFaceMode : values) {
                if (augmentedFaceMode.nativeCode == i) {
                    return augmentedFaceMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AugmentedFaceMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private AugmentedFaceMode(int i) {
            this.nativeCode = i;
        }
    }

    public Config(Session session2) {
        MethodCollector.m26663i(13163);
        this.session = session2;
        this.nativeHandle = nativeCreate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.m26664o(13163);
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        MethodCollector.m26663i(14021);
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        MethodCollector.m26664o(14021);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        long j;
        MethodCollector.m26663i(13992);
        long j2 = this.session.nativeWrapperHandle;
        long j3 = this.nativeHandle;
        if (augmentedImageDatabase == null) {
            j = 0;
        } else {
            j = augmentedImageDatabase.nativeHandle;
        }
        nativeSetAugmentedImageDatabase(j2, j3, j);
        MethodCollector.m26664o(13992);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        MethodCollector.m26663i(13952);
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        MethodCollector.m26664o(13952);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        MethodCollector.m26663i(14097);
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        MethodCollector.m26664o(14097);
        return this;
    }

    public Config setDepthModePrivate(DepthMode depthMode) {
        MethodCollector.m26663i(14098);
        nativeSetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        MethodCollector.m26664o(14098);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        MethodCollector.m26663i(14092);
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        MethodCollector.m26664o(14092);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        MethodCollector.m26663i(14093);
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        MethodCollector.m26664o(14093);
        return this;
    }

    public Config setInstantPlacementModePrivate(InstantPlacementMode instantPlacementMode) {
        MethodCollector.m26663i(14094);
        nativeSetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        MethodCollector.m26664o(14094);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        MethodCollector.m26663i(13942);
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        MethodCollector.m26664o(13942);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        MethodCollector.m26663i(13945);
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        MethodCollector.m26664o(13945);
        return this;
    }

    public Config setSegmentationMode(SegmentationMode segmentationMode) {
        MethodCollector.m26663i(14064);
        nativeSetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle, segmentationMode.nativeCode);
        MethodCollector.m26664o(14064);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        MethodCollector.m26663i(13950);
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        MethodCollector.m26664o(13950);
        return this;
    }

    Config(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
