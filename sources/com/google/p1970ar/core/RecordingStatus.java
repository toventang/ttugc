package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.RecordingStatus */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(32615);
    }

    static RecordingStatus forNumber(int i) {
        RecordingStatus[] values = values();
        for (RecordingStatus recordingStatus : values) {
            if (recordingStatus.nativeCode == i) {
                return recordingStatus;
            }
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Unexpected value for native RecordingStatus, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    private RecordingStatus(int i) {
        this.nativeCode = i;
    }
}
