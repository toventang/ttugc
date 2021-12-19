package com.p2082ss.avframework.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.strategy.LiveStreamBaseStrategy */
public class LiveStreamBaseStrategy extends LiveAbstractStrategy {
    protected IStrategyNotify mIStrategyNotify;

    /* renamed from: com.ss.avframework.strategy.LiveStreamBaseStrategy$IStrategyNotify */
    public interface IStrategyNotify {
        static {
            Covode.recordClassIndex(100702);
        }

        void onLiveOptionChanged(TEBundle tEBundle, TEBundle tEBundle2);
    }

    static {
        Covode.recordClassIndex(100701);
    }

    @Override // com.p2082ss.avframework.strategy.LiveAbstractStrategy
    public void onInfo(int i, int i2, int i3) {
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(1483);
        super.release();
        MethodCollector.m26664o(1483);
    }

    public LiveStreamBaseStrategy(IStrategyNotify iStrategyNotify) {
        this.mIStrategyNotify = iStrategyNotify;
    }
}
