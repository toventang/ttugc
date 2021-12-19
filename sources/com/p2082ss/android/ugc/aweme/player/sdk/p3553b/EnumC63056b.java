package com.p2082ss.android.ugc.aweme.player.sdk.p3553b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.b */
public enum EnumC63056b {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", ""),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", ""),
    ExtremelyHigh_50F("1080p 50fps", ""),
    TwoK_50F("2k 50fps", ""),
    FourK_50F("4k 50fps", ""),
    ExtremelyHigh_60F("1080p 60fps", ""),
    TwoK_60F("2k 60fps", ""),
    FourK_60F("4k 60fps", ""),
    ExtremelyHigh_120F("1080p 120fps", ""),
    TwoK_120F("2k 120fps", ""),
    FourK_120F("4k 120fps", "");
    

    /* renamed from: a */
    private final String f143232a;

    /* renamed from: b */
    private final String f143233b;

    public final String toString() {
        return this.f143232a;
    }

    static {
        Covode.recordClassIndex(73895);
    }

    private EnumC63056b(String str, String str2) {
        this.f143232a = str;
        this.f143233b = str2;
    }
}
