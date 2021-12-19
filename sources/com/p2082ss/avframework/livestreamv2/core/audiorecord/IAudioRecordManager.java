package com.p2082ss.avframework.livestreamv2.core.audiorecord;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager */
public interface IAudioRecordManager {

    /* renamed from: com.ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager$RecordStateCallback */
    public interface RecordStateCallback {
        static {
            Covode.recordClassIndex(100282);
        }

        void onError(int i, String str);
    }

    static {
        Covode.recordClassIndex(100281);
    }

    void release();

    void setRecordPath(String str);

    void startAudioRecord();
}
