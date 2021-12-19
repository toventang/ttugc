package com.p2082ss.avframework.livestreamv2.core.audiorecord;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.audiorecord.AudioRecordManager$$Lambda$0 */
final /* synthetic */ class AudioRecordManager$$Lambda$0 implements Runnable {
    private final AudioRecordManager arg$1;

    static {
        Covode.recordClassIndex(100278);
    }

    AudioRecordManager$$Lambda$0(AudioRecordManager audioRecordManager) {
        this.arg$1 = audioRecordManager;
    }

    public final void run() {
        this.arg$1.lambda$onMessageReceived$0$AudioRecordManager();
    }
}
