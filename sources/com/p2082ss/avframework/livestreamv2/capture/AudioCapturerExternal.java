package com.p2082ss.avframework.livestreamv2.capture;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.capture.AudioCapturerExternal */
public class AudioCapturerExternal extends AudioCapturer {

    /* renamed from: m */
    private int f191979m;
    private AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private int mBitwidth;
    private ByteBuffer mByteBuffer10ms;
    private int mChannel;
    private Handler mHandler;
    private int mSampleHZ;
    private int mSize;
    private boolean mStart;
    private long mStartTimestamp;
    private Object mStopFence = new Object();

    /* renamed from: com.ss.avframework.livestreamv2.capture.AudioCapturerExternal$AudioCaptureObserver */
    public interface AudioCaptureObserver {
        static {
            Covode.recordClassIndex(100107);
        }

        void onError(int i, Exception exc);

        void onStarted();

        void onStoped();
    }

    static {
        Covode.recordClassIndex(100105);
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void start() {
        MethodCollector.m26663i(652);
        nativeAdaptedOutputFormat(this.mSampleHZ, this.mChannel, this.mBitwidth);
        synchronized (this.mStopFence) {
            try {
                this.mStart = true;
            } finally {
                MethodCollector.m26664o(652);
            }
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.m26663i(657);
        synchronized (this.mStopFence) {
            try {
                this.mStart = false;
            } finally {
                MethodCollector.m26664o(657);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onData(final Buffer buffer, final int i, final int i2, final int i3, final long j) {
        Handler handler = this.mHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.capture.AudioCapturerExternal.RunnableC857441 */

                static {
                    Covode.recordClassIndex(100106);
                }

                public void run() {
                    AudioCapturerExternal.this.nativeOnData(buffer, i, i2, i3, j);
                }
            });
        } else {
            nativeOnData(buffer, i, i2, i3, j);
        }
    }

    public AudioCapturerExternal(int i, int i2, int i3, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAudioCaptureObserver = audioCaptureObserver;
        this.mSampleHZ = i;
        this.mChannel = i2;
        this.mBitwidth = i3;
        this.mHandler = handler;
        this.mStart = false;
        this.mSize = 0;
        this.mByteBuffer10ms = ByteBuffer.allocateDirect(4096);
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBuffer2;
        if (!this.mStart) {
            return -1;
        }
        if (!byteBuffer.isDirect()) {
            byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            byteBuffer2.put(byteBuffer);
            byteBuffer2.position(0);
        } else {
            byteBuffer2 = byteBuffer;
        }
        onData(byteBuffer2, i4 / i2, i, i2, j);
        return 0;
    }

    private void adjustBufferTo10MsAndSend(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        int i5 = ((i2 * i) / 100) * 2;
        byteBuffer.position(0);
        int i6 = i4 * 2;
        if (byteBuffer.capacity() >= i6) {
            if (i5 > this.mSize) {
                ByteBuffer byteBuffer2 = null;
                int position = this.mByteBuffer10ms.position();
                if (position > 0) {
                    byteBuffer2 = ByteBuffer.allocate(position);
                    this.mByteBuffer10ms.position(0);
                    this.mByteBuffer10ms.limit(position);
                    byteBuffer2.put(this.mByteBuffer10ms);
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5);
                this.mByteBuffer10ms = allocateDirect;
                allocateDirect.position(0);
                this.mSize = i5;
                if (byteBuffer2 != null) {
                    byteBuffer2.position(0);
                    this.mByteBuffer10ms.put(byteBuffer2);
                }
            }
            if (this.mByteBuffer10ms.position() + i6 >= i5) {
                this.mStartTimestamp = j / 1000;
                boolean z = true;
                int i7 = 0;
                do {
                    int position2 = this.mByteBuffer10ms.position();
                    byteBuffer.position(i7);
                    if (position2 > 0) {
                        int i8 = i5 - position2;
                        byteBuffer.limit(i8);
                        this.mByteBuffer10ms.put(byteBuffer.slice());
                        this.mByteBuffer10ms.position(0);
                        this.mByteBuffer10ms.limit(i5);
                        this.mByteBuffer10ms.limit(this.mSize);
                        this.mByteBuffer10ms.position(0);
                        onData(byteBuffer.slice(), i / 100, i, i2, this.mStartTimestamp * 1000);
                        i7 += i8;
                        byteBuffer.limit(i6);
                    } else if (i6 - i7 > i5) {
                        byteBuffer.limit(i5);
                        onData(byteBuffer.slice(), i / 100, i, i2, this.mStartTimestamp * 1000);
                        i7 += i5;
                    } else {
                        byteBuffer.limit(i6);
                        this.mByteBuffer10ms.put(byteBuffer.slice());
                        z = false;
                    }
                    this.mStartTimestamp += 10;
                } while (z);
            }
        }
    }
}
