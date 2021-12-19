package com.google.p1970ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import p001a.p002a.AbstractC0002b;

/* renamed from: com.google.ar.core.ArImage */
public class ArImage extends AbstractC0002b {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    public final Session session;

    static {
        Covode.recordClassIndex(32566);
    }

    private native void nativeClose(long j, long j2);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    static native void nativeLoadSymbols();

    public native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    public native int nativeGetPixelStride(long j, long j2, int i);

    public native int nativeGetRowStride(long j, long j2, int i);

    public Rect getCropRect() {
        throw new UnsupportedOperationException("Crop rect is unknown in this image.");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        MethodCollector.m26663i(11573);
        nativeClose(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0;
        MethodCollector.m26664o(11573);
    }

    public int getFormat() {
        MethodCollector.m26663i(11574);
        int nativeGetFormat = nativeGetFormat(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetFormat != -1) {
            MethodCollector.m26664o(11574);
            return nativeGetFormat;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getFormat().");
        MethodCollector.m26664o(11574);
        throw fatalException;
    }

    public int getHeight() {
        MethodCollector.m26663i(11577);
        int nativeGetHeight = nativeGetHeight(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetHeight != -1) {
            MethodCollector.m26664o(11577);
            return nativeGetHeight;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getHeight().");
        MethodCollector.m26664o(11577);
        throw fatalException;
    }

    public Image.Plane[] getPlanes() {
        MethodCollector.m26663i(11578);
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetNumberOfPlanes != -1) {
            C27078aa[] aaVarArr = new C27078aa[nativeGetNumberOfPlanes];
            for (int i = 0; i < nativeGetNumberOfPlanes; i++) {
                aaVarArr[i] = new C27078aa(this, this.nativeHandle, i);
            }
            MethodCollector.m26664o(11578);
            return aaVarArr;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getPlanes().");
        MethodCollector.m26664o(11578);
        throw fatalException;
    }

    public long getTimestamp() {
        MethodCollector.m26663i(11575);
        long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetTimestamp != -1) {
            MethodCollector.m26664o(11575);
            return nativeGetTimestamp;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getTimestamp().");
        MethodCollector.m26664o(11575);
        throw fatalException;
    }

    public int getWidth() {
        MethodCollector.m26663i(11576);
        int nativeGetWidth = nativeGetWidth(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetWidth != -1) {
            MethodCollector.m26664o(11576);
            return nativeGetWidth;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getWidth().");
        MethodCollector.m26664o(11576);
        throw fatalException;
    }

    public void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    public void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    ArImage(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
