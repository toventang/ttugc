package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.statics.StaticsReport;
import com.p2082ss.avframework.utils.TEBundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.avframework.engine.MediaEncodeStream */
public class MediaEncodeStream extends MediaEditorStream implements StaticsReport.StaticReportInterface {
    private InternalObserver mInternalObserver;
    private long mNativeObj;
    private ArrayList<MediaTrack> mTracks = new ArrayList<>();
    private Transport mTransport;
    private VsyncModule mVsyncModule = new VsyncModule(nativeGetVsyncModule(this.mNativeObj));

    /* renamed from: com.ss.avframework.engine.MediaEncodeStream$Observer */
    public interface Observer {
        static {
            Covode.recordClassIndex(99970);
        }

        void onMediaEncodeStreamEvent(int i, int i2, long j, String str);
    }

    static {
        Covode.recordClassIndex(99968);
    }

    private native void nativeAddTrack(long j, MediaTrack mediaTrack);

    private native TEBundle nativeGetParameter(long j);

    private native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    private native void nativeRegisterObserver(long j, Object obj);

    private native void nativeRelease(long j);

    private native void nativeRemoveTrack(long j, MediaTrack mediaTrack);

    private native void nativeRequestIDRFrame(long j);

    private native void nativeSetEstimateTimeInterval(long j, int i);

    private native void nativeSetIsAddCropInfo(long j, boolean z);

    private native void nativeSetParameter(long j, TEBundle tEBundle);

    private native void nativeSetSITICaculator(long j, SITICalculator sITICalculator);

    private native void nativeSetVideoEncoderFactory(long j, VideoEncoderFactory videoEncoderFactory);

    private native void nativeStart(long j);

    private native void nativeStartRecord(long j, String str);

    private native void nativeStop(long j);

    private native void nativeStopRecord(long j);

    private static native long nativeToEditorStream(long j);

    private native void nativeUnRegisterObserver(long j, Object obj);

    /* access modifiers changed from: protected */
    public native long nativeGetVsyncModule(long j);

    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    public TEBundle getParameter() {
        MethodCollector.m26663i(7063);
        TEBundle nativeGetParameter = nativeGetParameter(this.mNativeObj);
        MethodCollector.m26664o(7063);
        return nativeGetParameter;
    }

    public void requestIDRFrame() {
        MethodCollector.m26663i(7205);
        nativeRequestIDRFrame(this.mNativeObj);
        MethodCollector.m26664o(7205);
    }

    public void start() {
        MethodCollector.m26663i(5092);
        nativeStart(this.mNativeObj);
        MethodCollector.m26664o(5092);
    }

    public void stop() {
        MethodCollector.m26663i(5094);
        nativeStop(this.mNativeObj);
        MethodCollector.m26664o(5094);
    }

    public void stopRecord() {
        MethodCollector.m26663i(5125);
        nativeStopRecord(this.mNativeObj);
        MethodCollector.m26664o(5125);
    }

    @Override // com.p2082ss.avframework.engine.MediaEditorStream
    public synchronized void release() {
        MethodCollector.m26663i(5063);
        if (this.mNativeObj == 0) {
            MethodCollector.m26664o(5063);
            return;
        }
        stop();
        Iterator<MediaTrack> it = this.mTracks.iterator();
        while (it.hasNext()) {
            MediaTrack next = it.next();
            nativeRemoveTrack(this.mNativeObj, next);
            next.release();
            it.remove();
        }
        nativeSetVideoEncoderFactory(this.mNativeObj, null);
        if (this.mTransport != null) {
            this.mTransport = null;
        }
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        nativeUnRegisterObserver(this.mNativeObj, this.mInternalObserver);
        this.mInternalObserver.release();
        this.mInternalObserver = null;
        super.release();
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0;
        MethodCollector.m26664o(5063);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.engine.MediaEncodeStream$InternalObserver */
    public class InternalObserver extends NativeObject implements Observer {
        private Observer mObserver;

        static {
            Covode.recordClassIndex(99969);
        }

        public void onChanged() {
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public InternalObserver() {
        }

        @Override // com.p2082ss.avframework.engine.MediaEncodeStream.Observer
        public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onMediaEncodeStreamEvent(i, i2, j, str);
            }
        }
    }

    public boolean containTrack(MediaTrack mediaTrack) {
        return this.mTracks.contains(mediaTrack);
    }

    public void registerObserver(Observer observer) {
        this.mInternalObserver.registerObserver(observer);
    }

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.m26663i(5387);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(this.mNativeObj, staticsReport);
        MethodCollector.m26664o(5387);
        return nativeGetStaticsReport;
    }

    public void setEstimateTimeInterval(int i) {
        MethodCollector.m26663i(5234);
        nativeSetEstimateTimeInterval(this.mNativeObj, i);
        MethodCollector.m26664o(5234);
    }

    public void setIsAddCropInfo(boolean z) {
        MethodCollector.m26663i(5078);
        nativeSetIsAddCropInfo(this.mNativeObj, z);
        MethodCollector.m26664o(5078);
    }

    public void setParameter(TEBundle tEBundle) {
        MethodCollector.m26663i(5127);
        nativeSetParameter(this.mNativeObj, tEBundle);
        MethodCollector.m26664o(5127);
    }

    public void setSITICaculator(SITICalculator sITICalculator) {
        MethodCollector.m26663i(5608);
        nativeSetSITICaculator(this.mNativeObj, sITICalculator);
        MethodCollector.m26664o(5608);
    }

    public void startRecord(String str) {
        MethodCollector.m26663i(5095);
        nativeStartRecord(this.mNativeObj, str);
        MethodCollector.m26664o(5095);
    }

    public void addTrack(MediaTrack mediaTrack) {
        MethodCollector.m26663i(5073);
        nativeAddTrack(this.mNativeObj, mediaTrack);
        this.mTracks.add(mediaTrack);
        MethodCollector.m26664o(5073);
    }

    public void removeTrack(MediaTrack mediaTrack) {
        MethodCollector.m26663i(5082);
        if (this.mTracks.remove(mediaTrack)) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
        }
        MethodCollector.m26664o(5082);
    }

    public MediaEncodeStream(long j, Transport transport) {
        super(nativeToEditorStream(j));
        MethodCollector.m26663i(5040);
        this.mNativeObj = j;
        this.mTransport = transport;
        InternalObserver internalObserver = new InternalObserver();
        this.mInternalObserver = internalObserver;
        nativeRegisterObserver(this.mNativeObj, internalObserver);
        MethodCollector.m26664o(5040);
    }
}
