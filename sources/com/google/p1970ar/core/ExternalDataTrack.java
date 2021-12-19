package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.google.ar.core.ExternalDataTrack */
public class ExternalDataTrack {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32593);
    }

    protected ExternalDataTrack() {
    }

    private static native long nativeCreateExternalDataTrack(long j);

    private static native void nativeDestroyExternalDataTrack(long j, long j2);

    private native void nativeSetMimeType(long j, long j2, String str);

    private native void nativeSetTrackId(long j, long j2, byte[] bArr);

    private native void nativeSetTrackMetadata(long j, long j2, byte[] bArr);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(8455);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyExternalDataTrack(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(8455);
    }

    public ExternalDataTrack setMimeType(String str) {
        MethodCollector.m26663i(8895);
        nativeSetMimeType(this.session.nativeWrapperHandle, this.nativeHandle, str);
        MethodCollector.m26664o(8895);
        return this;
    }

    public ExternalDataTrack setTrackMetadata(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(8759);
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeSetTrackMetadata(this.session.nativeWrapperHandle, this.nativeHandle, bArr);
        MethodCollector.m26664o(8759);
        return this;
    }

    public ExternalDataTrack(Session session2, UUID uuid) {
        MethodCollector.m26663i(8303);
        this.session = session2;
        this.nativeHandle = nativeCreateExternalDataTrack(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        nativeSetTrackId(session2.nativeWrapperHandle, this.nativeHandle, wrap.array());
        MethodCollector.m26664o(8303);
    }
}
