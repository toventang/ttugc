package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import p001a.p002a.AbstractC0001a;

/* renamed from: com.google.ar.core.aa */
final class C27078aa extends AbstractC0001a {

    /* renamed from: a */
    final /* synthetic */ ArImage f64071a;

    /* renamed from: b */
    private final long f64072b;

    /* renamed from: c */
    private final int f64073c;

    static {
        Covode.recordClassIndex(32627);
    }

    public final ByteBuffer getBuffer() {
        MethodCollector.m26663i(11736);
        ArImage arImage = this.f64071a;
        ByteBuffer asReadOnlyBuffer = arImage.nativeGetBuffer(arImage.session.nativeWrapperHandle, this.f64072b, this.f64073c).asReadOnlyBuffer();
        MethodCollector.m26664o(11736);
        return asReadOnlyBuffer;
    }

    public final int getPixelStride() {
        MethodCollector.m26663i(11735);
        ArImage arImage = this.f64071a;
        int nativeGetPixelStride = arImage.nativeGetPixelStride(arImage.session.nativeWrapperHandle, this.f64072b, this.f64073c);
        if (nativeGetPixelStride != -1) {
            MethodCollector.m26664o(11735);
            return nativeGetPixelStride;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
        MethodCollector.m26664o(11735);
        throw fatalException;
    }

    public final int getRowStride() {
        MethodCollector.m26663i(10051);
        ArImage arImage = this.f64071a;
        int nativeGetRowStride = arImage.nativeGetRowStride(arImage.session.nativeWrapperHandle, this.f64072b, this.f64073c);
        if (nativeGetRowStride != -1) {
            MethodCollector.m26664o(10051);
            return nativeGetRowStride;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.Plane.getRowStride().");
        MethodCollector.m26664o(10051);
        throw fatalException;
    }

    public C27078aa(ArImage arImage, long j, int i) {
        this.f64071a = arImage;
        this.f64072b = j;
        this.f64073c = i;
    }
}
