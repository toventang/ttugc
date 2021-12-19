package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.FetchTextAudioResponse */
public final class FetchTextAudioResponse extends BaseNetResponse {
    private final TextAudioData data;

    static {
        Covode.recordClassIndex(96869);
    }

    public final TextAudioData getData() {
        return this.data;
    }
}
