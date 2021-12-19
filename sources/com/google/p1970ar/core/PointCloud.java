package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.google.ar.core.PointCloud */
public class PointCloud implements Closeable {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32611);
    }

    protected PointCloud() {
    }

    private native ByteBuffer nativeGetData(long j, long j2);

    private native ByteBuffer nativeGetIds(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        MethodCollector.m26663i(9434);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleasePointCloud(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(9434);
    }

    public void release() {
        MethodCollector.m26663i(9279);
        nativeReleasePointCloud(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0;
        MethodCollector.m26664o(9279);
    }

    public IntBuffer getIds() {
        MethodCollector.m26663i(9587);
        long j = this.nativeHandle;
        if (j != 0) {
            IntBuffer asIntBuffer = Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j)).asIntBuffer();
            MethodCollector.m26664o(9587);
            return asIntBuffer;
        }
        DeadlineExceededException deadlineExceededException = new DeadlineExceededException();
        MethodCollector.m26664o(9587);
        throw deadlineExceededException;
    }

    public FloatBuffer getPoints() {
        MethodCollector.m26663i(9586);
        long j = this.nativeHandle;
        if (j != 0) {
            FloatBuffer asFloatBuffer = Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j)).asFloatBuffer();
            MethodCollector.m26664o(9586);
            return asFloatBuffer;
        }
        DeadlineExceededException deadlineExceededException = new DeadlineExceededException();
        MethodCollector.m26664o(9586);
        throw deadlineExceededException;
    }

    public long getTimestamp() {
        MethodCollector.m26663i(9738);
        long j = this.nativeHandle;
        if (j != 0) {
            long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, j);
            MethodCollector.m26664o(9738);
            return nativeGetTimestamp;
        }
        DeadlineExceededException deadlineExceededException = new DeadlineExceededException();
        MethodCollector.m26664o(9738);
        throw deadlineExceededException;
    }

    PointCloud(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
