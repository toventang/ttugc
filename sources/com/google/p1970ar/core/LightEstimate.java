package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.LightEstimate */
public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32601);
    }

    protected LightEstimate() {
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j, long j2);

    private static native long nativeCreateLightEstimate(long j);

    private static native void nativeDestroyLightEstimate(long j, long j2);

    private native void nativeGetColorCorrection(long j, long j2, float[] fArr, int i);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j, long j2, float[] fArr);

    private native float nativeGetPixelIntensity(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    /* renamed from: com.google.ar.core.LightEstimate$State */
    public enum State {
        NOT_VALID(0),
        VALID(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32602);
        }

        static State forNumber(int i) {
            State[] values = values();
            for (State state : values) {
                if (state.nativeCode == i) {
                    return state;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimate.State, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private State(int i) {
            this.nativeCode = i;
        }
    }

    public ArImage[] acquireEnvironmentalHdrCubeMap() {
        MethodCollector.m26663i(8010);
        ArImage[] convertNativeArImageCubemapToArray = convertNativeArImageCubemapToArray(nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(8010);
        return convertNativeArImageCubemapToArray;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(7240);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(7240);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        MethodCollector.m26663i(8008);
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        MethodCollector.m26664o(8008);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        MethodCollector.m26663i(7865);
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        MethodCollector.m26664o(7865);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        MethodCollector.m26663i(7866);
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        MethodCollector.m26664o(7866);
        return fArr;
    }

    public float getPixelIntensity() {
        MethodCollector.m26663i(7391);
        float nativeGetPixelIntensity = nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(7391);
        return nativeGetPixelIntensity;
    }

    public State getState() {
        MethodCollector.m26663i(7241);
        State forNumber = State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(7241);
        return forNumber;
    }

    public long getTimestamp() {
        MethodCollector.m26663i(7542);
        long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(7542);
        return nativeGetTimestamp;
    }

    LightEstimate(Session session2) {
        MethodCollector.m26663i(7095);
        this.session = session2;
        this.nativeHandle = nativeCreateLightEstimate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.m26664o(7095);
    }

    private ArImage[] convertNativeArImageCubemapToArray(long[] jArr) {
        ArImage[] arImageArr = new ArImage[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            arImageArr[i] = new ArImage(this.session, jArr[i]);
        }
        return arImageArr;
    }

    public void getColorCorrection(float[] fArr, int i) {
        MethodCollector.m26663i(7393);
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
        MethodCollector.m26664o(7393);
    }
}
