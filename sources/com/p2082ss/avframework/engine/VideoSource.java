package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.statics.StaticsReport;

/* renamed from: com.ss.avframework.engine.VideoSource */
public abstract class VideoSource extends MediaSource {
    static {
        Covode.recordClassIndex(99991);
    }

    private native VideoFrame.I420Buffer nativeGetBlackFrameBuffer(int i, int i2);

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean isScreenCast();

    public native void nativeAdaptedOutputFormat(int i, int i2, int i3, boolean z);

    /* access modifiers changed from: protected */
    public native int nativeOnFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j);

    public VideoFrame.I420Buffer GetBlackFrameBuffer(int i, int i2) {
        return nativeGetBlackFrameBuffer(i, i2);
    }

    public void adaptOutputFormat(int i, int i2, int i3, boolean z) {
        nativeAdaptedOutputFormat(i, i2, i3, z);
    }
}
