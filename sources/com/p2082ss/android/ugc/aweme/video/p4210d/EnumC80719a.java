package com.p2082ss.android.ugc.aweme.video.p4210d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;

/* renamed from: com.ss.android.ugc.aweme.video.d.a */
public enum EnumC80719a {
    Undefine(EnumC63056b.Undefine),
    Standard(EnumC63056b.Standard),
    High(EnumC63056b.High),
    SuperHigh(EnumC63056b.SuperHigh),
    ExtremelyHigh(EnumC63056b.ExtremelyHigh),
    FourK(EnumC63056b.FourK),
    HDR(EnumC63056b.HDR),
    Auto(EnumC63056b.Auto),
    L_Standard(EnumC63056b.L_Standard),
    H_High(EnumC63056b.H_High),
    TwoK(EnumC63056b.TwoK),
    ExtremelyHigh_50F(EnumC63056b.ExtremelyHigh_50F),
    TwoK_50F(EnumC63056b.TwoK_50F),
    FourK_50F(EnumC63056b.FourK_50F),
    ExtremelyHigh_60F(EnumC63056b.ExtremelyHigh_60F),
    TwoK_60F(EnumC63056b.TwoK_60F),
    FourK_60F(EnumC63056b.FourK_60F),
    ExtremelyHigh_120F(EnumC63056b.ExtremelyHigh_120F),
    TwoK_120F(EnumC63056b.TwoK_120F),
    FourK_120F(EnumC63056b.FourK_120F);
    

    /* renamed from: a */
    private final EnumC63056b f180464a;

    public final EnumC63056b getResolution() {
        return this.f180464a;
    }

    public final int getIndex() {
        return ordinal();
    }

    public static EnumC80719a[] getAllResolution() {
        try {
            return new EnumC80719a[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F};
        } catch (Exception unused) {
            return new EnumC80719a[0];
        }
    }

    static {
        Covode.recordClassIndex(94006);
    }

    public static EnumC80719a valueOf(int i) {
        EnumC80719a aVar = Undefine;
        if (i < aVar.ordinal() || i > FourK_120F.ordinal()) {
            return aVar;
        }
        return values()[i];
    }

    private EnumC80719a(EnumC63056b bVar) {
        this.f180464a = bVar;
    }
}
