package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.bytertc.engine.livertc.RTCChannelState */
public class RTCChannelState {
    private ChannelState mChannelState = ChannelState.CHANNEL_STATE_NONE;

    static {
        Covode.recordClassIndex(101097);
    }

    public void joinChannel() {
        updateChannelState(ChannelState.CHANNEL_STATE_JOIN_CHANNEL);
    }

    public void joinChannelSuccess() {
        updateChannelState(ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS);
    }

    public void leaveChannel() {
        updateChannelState(ChannelState.CHANNEL_STATE_LEAVE_CHANNEL);
    }

    public void leaveChannelSuccess() {
        updateChannelState(ChannelState.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS);
    }

    public synchronized ChannelState getChannelState() {
        ChannelState channelState;
        MethodCollector.m26663i(1803);
        channelState = this.mChannelState;
        MethodCollector.m26664o(1803);
        return channelState;
    }

    public synchronized void reset() {
        MethodCollector.m26663i(1895);
        this.mChannelState = ChannelState.CHANNEL_STATE_NONE;
        MethodCollector.m26664o(1895);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.livertc.RTCChannelState$1 */
    public static /* synthetic */ class C860971 {

        /* renamed from: $SwitchMap$com$ss$bytertc$engine$livertc$RTCChannelState$ChannelState */
        static final /* synthetic */ int[] f192028x5304bc88;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 101098(0x18aea, float:1.41668E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState[] r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.bytertc.engine.livertc.RTCChannelState.C860971.f192028x5304bc88 = r2
                com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.C860971.f192028x5304bc88     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.C860971.f192028x5304bc88     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.C860971.f192028x5304bc88     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.livertc.RTCChannelState.C860971.<clinit>():void");
        }
    }

    /* renamed from: com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState */
    public enum ChannelState {
        CHANNEL_STATE_NONE,
        CHANNEL_STATE_JOIN_CHANNEL,
        CHANNEL_STATE_JOIN_CHANNEL_SUCCESS,
        CHANNEL_STATE_LEAVE_CHANNEL,
        CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS;

        static {
            Covode.recordClassIndex(101099);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        if (r3.mChannelState == com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void updateChannelState(com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r2 = 1799(0x707, float:2.521E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)     // Catch:{ all -> 0x004e }
            int[] r1 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.C860971.f192028x5304bc88     // Catch:{ all -> 0x004e }
            int r0 = r4.ordinal()     // Catch:{ all -> 0x004e }
            r1 = r1[r0]     // Catch:{ all -> 0x004e }
            r0 = 1
            if (r1 == r0) goto L_0x0028
            r0 = 2
            if (r1 == r0) goto L_0x0041
            r0 = 3
            if (r1 == r0) goto L_0x001b
            r0 = 4
            if (r1 == r0) goto L_0x001b
            goto L_0x0049
        L_0x001b:
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r1 = r3.mChannelState     // Catch:{ all -> 0x004e }
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL     // Catch:{ all -> 0x004e }
            if (r1 == r0) goto L_0x0047
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r1 = r3.mChannelState     // Catch:{ all -> 0x004e }
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS     // Catch:{ all -> 0x004e }
            if (r1 != r0) goto L_0x0049
            goto L_0x0047
        L_0x0028:
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r1 = r3.mChannelState     // Catch:{ all -> 0x004e }
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_NONE     // Catch:{ all -> 0x004e }
            if (r1 == r0) goto L_0x003a
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r1 = r3.mChannelState     // Catch:{ all -> 0x004e }
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL     // Catch:{ all -> 0x004e }
            if (r1 == r0) goto L_0x003a
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r1 = r3.mChannelState     // Catch:{ all -> 0x004e }
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS     // Catch:{ all -> 0x004e }
            if (r1 != r0) goto L_0x0049
        L_0x003a:
            r3.mChannelState = r4     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)
            return
        L_0x0041:
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r1 = r3.mChannelState
            com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState r0 = com.p2082ss.bytertc.engine.livertc.RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL
            if (r1 != r0) goto L_0x0049
        L_0x0047:
            r3.mChannelState = r4
        L_0x0049:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            monitor-exit(r3)
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.livertc.RTCChannelState.updateChannelState(com.ss.bytertc.engine.livertc.RTCChannelState$ChannelState):void");
    }
}
