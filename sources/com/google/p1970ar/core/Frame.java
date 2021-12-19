package com.google.p1970ar.core;

import android.media.Image;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ar.core.Frame */
public class Frame {
    static final ArrayList<Anchor> ANCHORS_EMPTY_LIST = new ArrayList<>();
    static final ArrayList<Plane> PLANES_EMPTY_LIST = new ArrayList<>();
    private LightEstimate lightEstimate;
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    protected Frame() {
    }

    private native long nativeAcquireCameraImage(long j, long j2);

    private native long nativeAcquireDepthImage(long j, long j2);

    private native long nativeAcquireDepthImagePrivate(long j, long j2);

    private native long nativeAcquireImageMetadata(long j, long j2);

    private native long nativeAcquireRawDepthConfidenceImage(long j, long j2);

    private native long nativeAcquireRawDepthImage(long j, long j2);

    private native long nativeAcquireSegmentation(long j, long j2);

    private native long[] nativeAcquireUpdatedAnchors(long j, long j2);

    private static native long nativeCreateFrame(long j);

    private static native void nativeDestroyFrame(long j, long j2);

    private native long nativeGetAndroidCameraTimestamp(long j, long j2);

    private native Pose nativeGetAndroidSensorPose(long j, long j2);

    private native int nativeGetBackgroundSegmentationTextureName(long j, long j2);

    private native int nativeGetCameraTextureName(long j, long j2);

    private native void nativeGetLightEstimate(long j, long j2, long j3);

    private native long nativeGetTimestamp(long j, long j2);

    private native boolean nativeHasDisplayGeometryChanged(long j, long j2);

    private native void nativeTransformCoordinates2dFloatArrayOrBuffer(long j, long j2, int i, Object obj, int i2, Object obj2);

    private native void nativeTransformDisplayUvCoords(long j, long j2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    /* access modifiers changed from: package-private */
    public native long nativeAcquirePointCloud(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireUpdatedTrackables(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native float nativeFrameGetDepthRegionConfidence(long j, long j2, int i, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTest(long j, long j2, float f, float f2);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTestInstantPlacement(long j, long j2, float f, float f2, float f3);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTestRay(long j, long j2, float[] fArr, int i, float[] fArr2, int i2);

    /* access modifiers changed from: package-private */
    public native long[] nativeInstantHitTest(long j, long j2, float f, float f2, float f3);

    public Camera getCamera() {
        return new Camera(this.session, this);
    }

    static {
        Covode.recordClassIndex(32594);
    }

    public Image acquireCameraImage() {
        MethodCollector.m26663i(13908);
        ArImage arImage = new ArImage(this.session, nativeAcquireCameraImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13908);
        return arImage;
    }

    public Image acquireDepthImage() {
        MethodCollector.m26663i(13909);
        ArImage arImage = new ArImage(this.session, nativeAcquireDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13909);
        return arImage;
    }

    public Image acquireDepthImagePrivate() {
        MethodCollector.m26663i(13910);
        ArImage arImage = new ArImage(this.session, nativeAcquireDepthImagePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13910);
        return arImage;
    }

    public PointCloud acquirePointCloud() {
        MethodCollector.m26663i(13221);
        PointCloud pointCloud = new PointCloud(this.session, nativeAcquirePointCloud(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13221);
        return pointCloud;
    }

    public Image acquireRawDepthConfidenceImage() {
        MethodCollector.m26663i(13946);
        ArImage arImage = new ArImage(this.session, nativeAcquireRawDepthConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13946);
        return arImage;
    }

    public Image acquireRawDepthImage() {
        MethodCollector.m26663i(13944);
        ArImage arImage = new ArImage(this.session, nativeAcquireRawDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13944);
        return arImage;
    }

    public Segmentation acquireSegmentation() {
        MethodCollector.m26663i(13940);
        Segmentation segmentation = new Segmentation(this.session, nativeAcquireSegmentation(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13940);
        return segmentation;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(12503);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyFrame(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(12503);
    }

    public long getAndroidCameraTimestamp() {
        MethodCollector.m26663i(12911);
        long nativeGetAndroidCameraTimestamp = nativeGetAndroidCameraTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(12911);
        return nativeGetAndroidCameraTimestamp;
    }

    public Pose getAndroidSensorPose() {
        MethodCollector.m26663i(12912);
        Pose nativeGetAndroidSensorPose = nativeGetAndroidSensorPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(12912);
        return nativeGetAndroidSensorPose;
    }

    public int getBackgroundSegmentationTextureName() {
        MethodCollector.m26663i(8069);
        int nativeGetBackgroundSegmentationTextureName = nativeGetBackgroundSegmentationTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(8069);
        return nativeGetBackgroundSegmentationTextureName;
    }

    public int getCameraTextureName() {
        MethodCollector.m26663i(13953);
        int nativeGetCameraTextureName = nativeGetCameraTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13953);
        return nativeGetCameraTextureName;
    }

    public ImageMetadata getImageMetadata() {
        MethodCollector.m26663i(13095);
        ImageMetadata imageMetadata = new ImageMetadata(nativeAcquireImageMetadata(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
        MethodCollector.m26664o(13095);
        return imageMetadata;
    }

    public long getTimestamp() {
        MethodCollector.m26663i(12823);
        long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(12823);
        return nativeGetTimestamp;
    }

    public Collection<Anchor> getUpdatedAnchors() {
        MethodCollector.m26663i(13906);
        Session session2 = this.session;
        Collection<Anchor> convertNativeAnchorsToCollection = session2.convertNativeAnchorsToCollection(nativeAcquireUpdatedAnchors(session2.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13906);
        return convertNativeAnchorsToCollection;
    }

    public boolean hasDisplayGeometryChanged() {
        MethodCollector.m26663i(12609);
        boolean nativeHasDisplayGeometryChanged = nativeHasDisplayGeometryChanged(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(12609);
        return nativeHasDisplayGeometryChanged;
    }

    public LightEstimate getLightEstimate() {
        MethodCollector.m26663i(13002);
        if (this.lightEstimate == null) {
            this.lightEstimate = new LightEstimate(this.session);
        }
        nativeGetLightEstimate(this.session.nativeWrapperHandle, this.nativeHandle, this.lightEstimate.nativeHandle);
        LightEstimate lightEstimate2 = this.lightEstimate;
        MethodCollector.m26664o(13002);
        return lightEstimate2;
    }

    public List<HitResult> hitTest(MotionEvent motionEvent) {
        return hitTest(motionEvent.getX(), motionEvent.getY());
    }

    Frame(Session session2) {
        this(session2, nativeCreateFrame(session2.nativeWrapperHandle));
        MethodCollector.m26663i(10601);
        MethodCollector.m26664o(10601);
    }

    private List<HitResult> convertNativeHitResultsToList(long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            HitResult hitResult = new HitResult(j, this.session);
            if (hitResult.getTrackable() != null) {
                arrayList.add(hitResult);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> getUpdatedTrackables(Class<T> cls) {
        MethodCollector.m26663i(13907);
        EnumC27099h a = EnumC27099h.m53865a(cls);
        if (a == EnumC27099h.UNKNOWN_TO_JAVA) {
            List emptyList = Collections.emptyList();
            MethodCollector.m26664o(13907);
            return emptyList;
        }
        Collection<T> convertNativeTrackablesToCollection = this.session.convertNativeTrackablesToCollection(cls, nativeAcquireUpdatedTrackables(this.session.nativeWrapperHandle, this.nativeHandle, a.f64162i));
        MethodCollector.m26664o(13907);
        return convertNativeTrackablesToCollection;
    }

    Frame(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public List<HitResult> hitTest(float f, float f2) {
        MethodCollector.m26663i(13222);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f, f2));
        MethodCollector.m26664o(13222);
        return convertNativeHitResultsToList;
    }

    public void transformDisplayUvCoords(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        MethodCollector.m26663i(12725);
        if (!floatBuffer.isDirect() || !floatBuffer2.isDirect()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("transformDisplayUvCoords currently requires direct buffers.");
            MethodCollector.m26664o(12725);
            throw illegalArgumentException;
        }
        nativeTransformDisplayUvCoords(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer, floatBuffer2);
        MethodCollector.m26664o(12725);
    }

    public List<HitResult> hitTestInstantPlacement(float f, float f2, float f3) {
        MethodCollector.m26663i(13225);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeHitTestInstantPlacement(this.session.nativeWrapperHandle, this.nativeHandle, f, f2, f3));
        MethodCollector.m26664o(13225);
        return convertNativeHitResultsToList;
    }

    public List<HitResult> hitTest(float f, float f2, float f3) {
        MethodCollector.m26663i(13224);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeInstantHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f, f2, f3));
        MethodCollector.m26664o(13224);
        return convertNativeHitResultsToList;
    }

    public float getDepthRegionConfidence(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(13951);
        float nativeFrameGetDepthRegionConfidence = nativeFrameGetDepthRegionConfidence(this.session.nativeWrapperHandle, this.nativeHandle, i, i2, i3, i4);
        MethodCollector.m26664o(13951);
        return nativeFrameGetDepthRegionConfidence;
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates2d coordinates2d2, FloatBuffer floatBuffer2) {
        MethodCollector.m26663i(13948);
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates2d2.nativeCode, floatBuffer2);
        MethodCollector.m26664o(13948);
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, float[] fArr, Coordinates2d coordinates2d2, float[] fArr2) {
        MethodCollector.m26663i(13949);
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates2d2.nativeCode, fArr2);
        MethodCollector.m26664o(13949);
    }

    public List<HitResult> hitTest(float[] fArr, int i, float[] fArr2, int i2) {
        MethodCollector.m26663i(13223);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeHitTestRay(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i, fArr2, i2));
        MethodCollector.m26664o(13223);
        return convertNativeHitResultsToList;
    }
}
