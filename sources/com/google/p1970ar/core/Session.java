package com.google.p1970ar.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.p1970ar.core.Config;
import com.google.p1970ar.core.exceptions.FatalException;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.google.ar.core.Session */
public class Session {
    final C27080ac faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    static {
        Covode.recordClassIndex(32617);
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRecordExternalDataTrackSample(long j, byte[] bArr, byte[] bArr2);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    /* access modifiers changed from: package-private */
    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireAllTrackables(long j, int i);

    /* access modifiers changed from: package-private */
    public native void nativeDestroySessionWrapper(long j);

    /* access modifiers changed from: package-private */
    public native long nativeGetSessionNativeHandle(long j);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsDepthModeSupported(long j, int i);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    /* access modifiers changed from: package-private */
    public native long nativeReleaseSessionOwnership(long j);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            sharedCamera2.pause();
        }
    }

    public void close() {
        MethodCollector.m26663i(13232);
        nativeCloseSession(this.nativeWrapperHandle);
        MethodCollector.m26664o(13232);
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            return sharedCamera2;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    public void resume() {
        MethodCollector.m26663i(13607);
        nativeResume(this.nativeWrapperHandle);
        MethodCollector.m26664o(13607);
    }

    public void stopRecording() {
        MethodCollector.m26663i(7603);
        nativeStopRecording(this.nativeWrapperHandle);
        MethodCollector.m26664o(7603);
    }

    protected Session() {
        this.faceCache = new C27080ac();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    static void loadDynamicSymbolsAfterSessionCreate() {
        MethodCollector.m26663i(6994);
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
            MethodCollector.m26664o(6994);
            return;
        }
        MethodCollector.m26664o(6994);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(13231);
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(13231);
    }

    public Collection<Anchor> getAllAnchors() {
        MethodCollector.m26663i(13731);
        Collection<Anchor> convertNativeAnchorsToCollection = convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
        MethodCollector.m26664o(13731);
        return convertNativeAnchorsToCollection;
    }

    public CameraConfig getCameraConfig() {
        MethodCollector.m26663i(6853);
        CameraConfig cameraConfig = new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
        MethodCollector.m26664o(6853);
        return cameraConfig;
    }

    public PlaybackStatus getPlaybackStatus() {
        MethodCollector.m26663i(7293);
        PlaybackStatus forNumber = PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
        MethodCollector.m26664o(7293);
        return forNumber;
    }

    public RecordingStatus getRecordingStatus() {
        MethodCollector.m26663i(7604);
        RecordingStatus forNumber = RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
        MethodCollector.m26664o(7604);
        return forNumber;
    }

    public List<CameraConfig> getSupportedCameraConfigs() {
        MethodCollector.m26663i(6412);
        List<CameraConfig> convertNativeCameraConfigsToCollection = convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
        MethodCollector.m26664o(6412);
        return convertNativeCameraConfigsToCollection;
    }

    public void pause() {
        MethodCollector.m26663i(13655);
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
        MethodCollector.m26664o(13655);
    }

    public Frame update() {
        MethodCollector.m26663i(13654);
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        MethodCollector.m26664o(13654);
        return frame;
    }

    /* renamed from: com.google.ar.core.Session$FeatureMapQuality */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32619);
        }

        static FeatureMapQuality forNumber(int i) {
            FeatureMapQuality[] values = values();
            for (FeatureMapQuality featureMapQuality : values) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native FeatureMapQuality, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private FeatureMapQuality(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Session$Feature */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32618);
        }

        private Feature(int i) {
            this.nativeCode = i;
        }
    }

    static void throwExceptionFromArStatus(int i) {
        throwExceptionFromArStatus(null, i, null, null);
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    /* renamed from: com_google_ar_core_Session_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m53843x50de3703(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public void configure(Config config) {
        MethodCollector.m26663i(13301);
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
        MethodCollector.m26664o(13301);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        MethodCollector.m26663i(6706);
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
        MethodCollector.m26664o(6706);
    }

    public void setCameraTextureName(int i) {
        MethodCollector.m26663i(13728);
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
        MethodCollector.m26664o(13728);
    }

    public void setPlaybackDataset(String str) {
        MethodCollector.m26663i(7150);
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
        MethodCollector.m26664o(7150);
    }

    static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        MethodCollector.m26663i(13435);
        ModuleAvailability forNumber = ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
        MethodCollector.m26664o(13435);
        return forNumber;
    }

    /* access modifiers changed from: package-private */
    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        MethodCollector.m26663i(13786);
        Anchor anchor = new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
        MethodCollector.m26664o(13786);
        return anchor;
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        MethodCollector.m26663i(5809);
        FeatureMapQuality forNumber = FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
        MethodCollector.m26664o(5809);
        return forNumber;
    }

    public void getConfig(Config config) {
        MethodCollector.m26663i(13352);
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
        MethodCollector.m26664o(13352);
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        MethodCollector.m26663i(5946);
        Anchor anchor2 = new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
        MethodCollector.m26664o(5946);
        return anchor2;
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        MethodCollector.m26663i(6991);
        boolean nativeIsDepthModeSupported = nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
        MethodCollector.m26664o(6991);
        return nativeIsDepthModeSupported;
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        MethodCollector.m26663i(6992);
        boolean nativeIsDepthModeSupportedPrivate = nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
        MethodCollector.m26664o(6992);
        return nativeIsDepthModeSupportedPrivate;
    }

    public boolean isSupported(Config config) {
        MethodCollector.m26663i(13730);
        boolean nativeIsSupported = nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
        MethodCollector.m26664o(13730);
        return nativeIsSupported;
    }

    public Anchor resolveCloudAnchor(String str) {
        MethodCollector.m26663i(6251);
        Anchor anchor = new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
        MethodCollector.m26664o(6251);
        return anchor;
    }

    public void setCameraTextureNames(int[] iArr) {
        MethodCollector.m26663i(13727);
        if (iArr == null || iArr.length == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
            MethodCollector.m26664o(13727);
            throw illegalArgumentException;
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
        MethodCollector.m26664o(13727);
    }

    public void startRecording(RecordingConfig recordingConfig) {
        MethodCollector.m26663i(7443);
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            MethodCollector.m26664o(7443);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        MethodCollector.m26664o(7443);
        throw illegalArgumentException;
    }

    Session(long j) {
        MethodCollector.m26663i(13229);
        this.faceCache = new C27080ac();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
        MethodCollector.m26664o(13229);
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        MethodCollector.m26663i(13732);
        EnumC27099h a = EnumC27099h.m53865a(cls);
        if (a == EnumC27099h.UNKNOWN_TO_JAVA) {
            List emptyList = Collections.emptyList();
            MethodCollector.m26664o(13732);
            return emptyList;
        }
        Collection<T> convertNativeTrackablesToCollection = convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a.f64162i));
        MethodCollector.m26664o(13732);
        return convertNativeTrackablesToCollection;
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        MethodCollector.m26663i(6556);
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            int length = nativeGetSupportedCameraConfigsWithFilter.length;
            ArrayList arrayList = new ArrayList(length);
            for (long j : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j));
            }
            List<CameraConfig> unmodifiableList = Collections.unmodifiableList(arrayList);
            MethodCollector.m26664o(6556);
            return unmodifiableList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        MethodCollector.m26664o(6556);
        throw illegalArgumentException;
    }

    public void requestModuleInstallDeferred(List<Module> list) {
        MethodCollector.m26663i(13605);
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Module module : list) {
            iArr[i] = module.nativeCode;
            i++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
        MethodCollector.m26664o(13605);
    }

    public void requestModuleInstallImmediate(List<Module> list) {
        MethodCollector.m26663i(13554);
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Module module : list) {
            iArr[i] = module.nativeCode;
            i++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
        MethodCollector.m26664o(13554);
    }

    /* access modifiers changed from: package-private */
    public Trackable createTrackable(long j) {
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        EnumC27099h[] values = EnumC27099h.values();
        for (EnumC27099h hVar : values) {
            if (hVar.f64162i == internalGetType) {
                switch (hVar.ordinal()) {
                    case 0:
                    case 1:
                        return null;
                    case 2:
                        return new Plane(j, this);
                    case 3:
                        return new Point(j, this);
                    case 4:
                        return new AugmentedImage(j, this);
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        return this.faceCache.mo45118a(j, this);
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        return new DepthPoint(j, this);
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        return new InstantPlacementPoint(j, this);
                    default:
                        throw null;
                }
            }
        }
        TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
        return null;
    }

    /* access modifiers changed from: package-private */
    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            Trackable createTrackable = createTrackable(j);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        MethodCollector.m26663i(6100);
        Anchor anchor2 = new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
        MethodCollector.m26664o(6100);
        return anchor2;
    }

    public Session(Context context, Set<Feature> set) {
        MethodCollector.m26663i(13228);
        this.faceCache = new C27080ac();
        this.sharedCamera = null;
        m53843x50de3703("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        int i = 0;
        for (Feature feature : set) {
            iArr[i] = feature.nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
        MethodCollector.m26664o(13228);
    }

    public void recordExternalDataTrackSample(UUID uuid, ByteBuffer byteBuffer) {
        MethodCollector.m26663i(7771);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            nativeRecordExternalDataTrackSample(this.nativeWrapperHandle, wrap.array(), bArr);
            MethodCollector.m26664o(7771);
            return;
        }
        nativeRecordExternalDataTrackSample(this.nativeWrapperHandle, wrap.array(), byteBuffer.array());
        MethodCollector.m26664o(7771);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        MethodCollector.m26663i(13729);
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
        MethodCollector.m26664o(13729);
    }

    static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        int i2;
        EnumC27098g[] values = EnumC27098g.values();
        for (EnumC27098g gVar : values) {
            if (gVar.f64150G == i) {
                Class<? extends Exception> cls = gVar.f64151H;
                if (cls != null) {
                    if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                        i2 = 0;
                    }
                    String str2 = gVar.f64152I;
                    if (str2 == null) {
                        if (str == null) {
                            throw ((Throwable) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                        }
                    } else if (str == null) {
                        str = str2;
                    } else {
                        String valueOf = String.valueOf(str2);
                        String valueOf2 = String.valueOf(str);
                        if (valueOf2.length() != 0) {
                            str = valueOf.concat(valueOf2);
                        } else {
                            str = new String(valueOf);
                        }
                    }
                    Exception exc = (Exception) gVar.f64151H.getConstructor(String.class).newInstance(str);
                    StackTraceElement[] stackTrace = exc.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[(stackTrace.length + i2)];
                    int i3 = 0;
                    while (i3 < i2) {
                        stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                        i3++;
                    }
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stackTraceElementArr[i3] = stackTraceElement;
                        i3++;
                    }
                    exc.setStackTrace(stackTraceElementArr);
                    throw exc;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected error code: ");
        sb.append(i);
        throw new FatalException(sb.toString());
    }
}
