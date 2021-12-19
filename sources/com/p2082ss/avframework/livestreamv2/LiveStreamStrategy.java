package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.strategy.LiveStreamBaseStrategy;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamStrategy */
public class LiveStreamStrategy extends LiveStreamBaseStrategy {
    private WeakReference<TEBundle> mEncodeStreamOpt;
    private LiveStreamBuilder mLiveStreamBuilder;
    private WeakReference<TEBundle> mTransportOpt;

    static {
        Covode.recordClassIndex(100094);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.strategy.LiveStreamBaseStrategy
    public synchronized void release() {
        MethodCollector.m26663i(1335);
        super.release();
        MethodCollector.m26664o(1335);
    }

    public void setLiveStreamBuilder(LiveStreamBuilder liveStreamBuilder) {
        this.mLiveStreamBuilder = liveStreamBuilder;
    }

    public LiveStreamStrategy(TEBundle tEBundle, TEBundle tEBundle2, LiveStreamBaseStrategy.IStrategyNotify iStrategyNotify) {
        super(iStrategyNotify);
        this.mEncodeStreamOpt = new WeakReference<>(tEBundle);
        this.mTransportOpt = new WeakReference<>(tEBundle2);
    }

    @Override // com.p2082ss.avframework.strategy.LiveAbstractStrategy, com.p2082ss.avframework.strategy.LiveStreamBaseStrategy
    public void onInfo(int i, int i2, int i3) {
        TEBundle tEBundle;
        TEBundle tEBundle2;
        if (i != 1 || i2 != 1) {
            return;
        }
        if (i3 == 1) {
            AVLog.disableLogFile(false);
            AVLog.disableLogIODevice(false);
            WeakReference<TEBundle> weakReference = this.mEncodeStreamOpt;
            if (weakReference != null && this.mLiveStreamBuilder != null && (tEBundle = weakReference.get()) != null) {
                tEBundle.setBool("estream_psnr_enable", this.mLiveStreamBuilder.isEnablePSNR());
                tEBundle.setBool("estream_siti_enable", this.mLiveStreamBuilder.isEnableSITI());
                tEBundle.setBool("estream_transport_delay_enable", this.mLiveStreamBuilder.isEnableRenderStallStats());
                if (this.mIStrategyNotify != null) {
                    this.mIStrategyNotify.onLiveOptionChanged(tEBundle, null);
                }
            }
        } else if (i3 == 2 || i3 == 3) {
            AVLog.disableLogFile(true);
            AVLog.disableLogIODevice(true);
            WeakReference<TEBundle> weakReference2 = this.mEncodeStreamOpt;
            if (weakReference2 != null && (tEBundle2 = weakReference2.get()) != null) {
                tEBundle2.setBool("estream_psnr_enable", false);
                tEBundle2.setBool("estream_siti_enable", false);
                tEBundle2.setBool("estream_transport_delay_enable", false);
                if (this.mIStrategyNotify != null) {
                    this.mIStrategyNotify.onLiveOptionChanged(tEBundle2, null);
                }
            }
        }
    }
}
