package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.LoudnessDetectResult */
public class LoudnessDetectResult {
    public double avgLoudness;
    public double peakLoudness;
    public int result;

    static {
        Covode.recordClassIndex(99236);
    }

    public String toString() {
        return "LoudnessDetectResult{result=" + this.result + ", avgLoudness=" + this.avgLoudness + ", peakLoudness=" + this.peakLoudness + '}';
    }
}
