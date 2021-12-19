package com.p2082ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.filter.KaraokeRegulator */
public class KaraokeRegulator {
    public long mCaptureDelayMs;
    private List<Frame> mFrames = new ArrayList();
    public long mPlayerDelayMs;

    static {
        Covode.recordClassIndex(100546);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.filter.KaraokeRegulator$Frame */
    public class Frame {
        private ByteBuffer buffer;
        private long elapseMs;
        private long timeMs = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(100547);
        }

        public ByteBuffer extract() {
            this.buffer.position(0);
            ByteBuffer byteBuffer = this.buffer;
            this.buffer = null;
            return byteBuffer;
        }

        public boolean elapseProfileDone() {
            if (System.currentTimeMillis() - this.timeMs >= (KaraokeRegulator.this.mPlayerDelayMs + KaraokeRegulator.this.mCaptureDelayMs) - 10) {
                return true;
            }
            return false;
        }

        protected Frame(ByteBuffer byteBuffer) {
            this.buffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            this.buffer.put(byteBuffer);
            this.elapseMs = KaraokeRegulator.this.mPlayerDelayMs + KaraokeRegulator.this.mCaptureDelayMs;
        }
    }

    public KaraokeRegulator() {
        AVLog.ioi("KaraokeRegulator", "Create regulator ".concat(String.valueOf(this)));
    }

    /* access modifiers changed from: package-private */
    public int size() {
        int size;
        MethodCollector.m26663i(1228);
        synchronized (this.mFrames) {
            try {
                size = this.mFrames.size();
            } finally {
                MethodCollector.m26664o(1228);
            }
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer popBackgroundMusicFrame() {
        MethodCollector.m26663i(1226);
        synchronized (this.mFrames) {
            try {
                if (this.mFrames.size() <= 0 || !this.mFrames.get(0).elapseProfileDone()) {
                    MethodCollector.m26664o(1226);
                    return null;
                }
                return this.mFrames.remove(0).extract();
            } finally {
                MethodCollector.m26664o(1226);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCaptureDelayMs(long j) {
        this.mCaptureDelayMs = j;
    }

    /* access modifiers changed from: package-private */
    public void updatePlayerDelayMs(long j) {
        this.mPlayerDelayMs = j;
    }

    /* access modifiers changed from: package-private */
    public void pushBackgroundMusicFrame(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(1224);
        synchronized (this.mFrames) {
            try {
                if (this.mFrames.size() > 100) {
                    AVLog.ioe("KaraokeRegulator", "Regulator exception with drop " + this.mFrames.size() + " frames and capture delay " + this.mCaptureDelayMs + " ms player delay " + this.mPlayerDelayMs);
                    this.mFrames.clear();
                }
                if (byteBuffer != null) {
                    this.mFrames.add(new Frame(byteBuffer));
                    MethodCollector.m26664o(1224);
                }
            } finally {
                MethodCollector.m26664o(1224);
            }
        }
    }
}
