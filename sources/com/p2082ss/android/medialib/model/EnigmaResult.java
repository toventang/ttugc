package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.EnigmaResult */
public class EnigmaResult {
    Enigma[] result;
    public float zoomFactor;

    static {
        Covode.recordClassIndex(36480);
    }

    public Enigma[] getResult() {
        return this.result;
    }

    public void setResult(Enigma[] enigmaArr) {
        this.result = enigmaArr;
    }
}
