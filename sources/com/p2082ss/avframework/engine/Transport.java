package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.statics.StaticsReport;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.engine.Transport */
public abstract class Transport extends NativeObject implements StaticsReport.StaticReportInterface {
    private EventObserver mObserver;

    /* renamed from: com.ss.avframework.engine.Transport$EventObserver */
    public interface EventObserver {
        static {
            Covode.recordClassIndex(99982);
        }

        void onTransportEvent(int i, int i2, long j, String str);
    }

    static {
        Covode.recordClassIndex(99981);
    }

    private static native void nativeEnableVideoFrameStatistics(boolean z);

    private native TEBundle nativeGetParameter();

    private static native void nativeResetSeiMgr();

    private native void nativeSetParameter(TEBundle tEBundle);

    private static native void nativeSetSeiSourceAble(boolean z);

    public int addSeiField(String str, Object obj, int i) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2) {
        return 0;
    }

    public void addUserMetaData(String str, String str2, int i) {
    }

    public String getDnsIP() {
        return null;
    }

    public long getInt64Value(int i) {
        return 0;
    }

    public String getLocalIP() {
        return null;
    }

    public String getRemoteIP() {
        return null;
    }

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public VsyncModule getVsyncModule() {
        return null;
    }

    public abstract void registerFeedbackObserber(FeedbackObserver feedbackObserver);

    public void sendPacket(MediaPacket mediaPacket) {
    }

    public void sendPacket(Buffer buffer, int i) {
    }

    public int sendSeiMsg(String str) {
        return 0;
    }

    public void setVysncModule(VsyncModule vsyncModule) {
    }

    public boolean setupUrl(String str) {
        return false;
    }

    public void startTransportInDebug() {
    }

    public void stopTransportInDebug() {
    }

    public abstract void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver);

    public static void ResetSeiMgr() {
        nativeResetSeiMgr();
    }

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public static void EnableVideoFrameStatistics(boolean z) {
        nativeEnableVideoFrameStatistics(z);
    }

    public static void SetSeiSourceAble(boolean z) {
        nativeSetSeiSourceAble(z);
    }

    public void setEventObserver(EventObserver eventObserver) {
        this.mObserver = eventObserver;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    /* renamed from: com.ss.avframework.engine.Transport$FeedbackObserver */
    public abstract class FeedbackObserver {
        static {
            Covode.recordClassIndex(99983);
        }

        /* access modifiers changed from: protected */
        public abstract void onFeedback(String str);

        public FeedbackObserver() {
        }
    }

    /* access modifiers changed from: protected */
    public void onEvent(int i, int i2, long j, String str) {
        EventObserver eventObserver = this.mObserver;
        if (eventObserver != null) {
            eventObserver.onTransportEvent(i, i2, j, str);
        }
    }

    /* renamed from: com.ss.avframework.engine.Transport$MediaPacket */
    public static class MediaPacket {
        public ByteBuffer buffer;
        public int flags;
        public boolean isVideo;
        public int offset;
        public long presentationTimeUs;
        public int size;

        static {
            Covode.recordClassIndex(99984);
        }

        public void set(ByteBuffer byteBuffer, boolean z, int i, int i2, long j, int i3) {
            this.buffer = byteBuffer;
            this.offset = i;
            this.size = i2;
            this.presentationTimeUs = j;
            this.flags = i3;
            this.isVideo = z;
        }
    }
}
