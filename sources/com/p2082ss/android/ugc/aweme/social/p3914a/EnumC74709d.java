package com.p2082ss.android.ugc.aweme.social.p3914a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* JADX WARN: Init of enum GROUP_1 can be incorrect */
/* JADX WARN: Init of enum GROUP_2 can be incorrect */
/* renamed from: com.ss.android.ugc.aweme.social.a.d */
public enum EnumC74709d {
    GROUP_1(R.string.bnj, r6, 0, R.string.bne, 0, false, 20),
    GROUP_2(R.string.bnj, r6, 0, R.string.bnf, 0, true, 20),
    GROUP_3(R.string.bnk, null, 0, R.string.bng, 0, false, 22),
    GROUP_4(R.string.bnk, null, 0, R.string.bnh, 0, true, 22);
    

    /* renamed from: b */
    private final int f167921b;

    /* renamed from: c */
    private final Integer f167922c;

    /* renamed from: d */
    private final int f167923d;

    /* renamed from: e */
    private final int f167924e;

    /* renamed from: f */
    private final int f167925f;

    /* renamed from: g */
    private final boolean f167926g;

    public final boolean getBtnForceVertical() {
        return this.f167926g;
    }

    public final int getDesc() {
        return this.f167923d;
    }

    public final Integer getMultiTitle() {
        return this.f167922c;
    }

    public final int getPrimary() {
        return this.f167924e;
    }

    public final int getSecondary() {
        return this.f167925f;
    }

    public final int getTitle() {
        return this.f167921b;
    }

    static {
        Covode.recordClassIndex(87544);
        Integer.valueOf((int) R.string.bni);
    }

    private EnumC74709d(int i, Integer num, int i2, int i3, int i4, boolean z) {
        this.f167921b = i;
        this.f167922c = num;
        this.f167923d = i2;
        this.f167924e = i3;
        this.f167925f = i4;
        this.f167926g = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ EnumC74709d(int i, Integer num, int i2, int i3, int i4, boolean z, int i5) {
        this(i, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? R.string.bnd : i2, i3, (i5 & 16) != 0 ? R.string.a98 : i4, z);
    }
}
