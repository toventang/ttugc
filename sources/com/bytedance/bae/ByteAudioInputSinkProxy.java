package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class ByteAudioInputSinkProxy {
    private long nativeSinkPtr;
    private ByteBuffer pushDirectBuffer = ByteBuffer.allocateDirect(15360);
    private ByteAudioStreamBuffer pushStreamBuffer = new ByteAudioStreamBuffer(this.pushDirectBuffer.array(), 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    private ByteAudioSinkInterface.ByteAudioInputSink sink;
    private ByteAudioInputStream stream;

    static {
        Covode.recordClassIndex(14981);
    }

    public ByteBuffer getDirectBuffer() {
        return this.pushDirectBuffer;
    }

    public ByteAudioStreamBuffer getStreamBuffer() {
        return this.pushStreamBuffer;
    }

    public void setNativeSink(long j) {
        this.nativeSinkPtr = j;
    }

    public int onPushAudioBufferFromStream(long j) {
        if (this.sink == null) {
            return -1;
        }
        this.pushDirectBuffer.flip();
        byte[] bArr = new byte[this.pushStreamBuffer.getLength()];
        System.arraycopy(this.pushDirectBuffer.array(), this.pushDirectBuffer.arrayOffset(), bArr, 0, this.pushStreamBuffer.getLength());
        int onPushAudioBufferFromStream = this.sink.onPushAudioBufferFromStream(this.stream, new ByteAudioStreamBuffer(bArr, this.pushStreamBuffer.getLength(), this.pushStreamBuffer.getStreamFormat(), this.pushStreamBuffer.getTimestamp()));
        this.pushDirectBuffer.clear();
        return onPushAudioBufferFromStream;
    }

    public ByteAudioInputSinkProxy(ByteAudioSinkInterface.ByteAudioInputSink byteAudioInputSink, ByteAudioInputStream byteAudioInputStream) {
        this.sink = byteAudioInputSink;
        this.stream = byteAudioInputStream;
    }
}
