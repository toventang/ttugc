package com.bytedance.creativex.editor.preview;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public interface IAudioEffectParam extends Parcelable {
    static {
        Covode.recordClassIndex(16155);
    }

    String getEffectPath();

    int getSeqIn();

    int getSeqOut();

    boolean getShowErrorToast();

    int getTrackIndex();

    int getTrackType();

    void setPreprocessResult(byte[] bArr);

    void setSeqIn(int i);

    void setSeqOut(int i);
}
