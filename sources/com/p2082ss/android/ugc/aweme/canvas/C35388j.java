package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.canvas.j */
public final class C35388j implements Serializable {
    public static final C35389a Companion = new C35389a((byte) 0);

    /* renamed from: a */
    private final int f83486a;

    /* renamed from: b */
    private final int f83487b;

    /* renamed from: c */
    private final int f83488c;

    /* renamed from: d */
    private final int f83489d;

    /* renamed from: e */
    private final boolean f83490e;

    /* renamed from: f */
    private final float f83491f;

    /* renamed from: g */
    private final float f83492g;

    static {
        Covode.recordClassIndex(42562);
    }

    public C35388j() {
        this(0, 0, 0, 0, false, 0.0f, 0.0f, 127, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m72415xe91529e0(int i) {
        return i;
    }

    public static /* synthetic */ C35388j copy$default(C35388j jVar, int i, int i2, int i3, int i4, boolean z, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = jVar.f83486a;
        }
        if ((i5 & 2) != 0) {
            i2 = jVar.f83487b;
        }
        if ((i5 & 4) != 0) {
            i3 = jVar.f83488c;
        }
        if ((i5 & 8) != 0) {
            i4 = jVar.f83489d;
        }
        if ((i5 & 16) != 0) {
            z = jVar.f83490e;
        }
        if ((i5 & 32) != 0) {
            f = jVar.f83491f;
        }
        if ((i5 & 64) != 0) {
            f2 = jVar.f83492g;
        }
        return jVar.copy(i, i2, i3, i4, z, f, f2);
    }

    public final int component1() {
        return this.f83486a;
    }

    public final int component2() {
        return this.f83487b;
    }

    public final int component3() {
        return this.f83488c;
    }

    public final int component4() {
        return this.f83489d;
    }

    public final boolean component5() {
        return this.f83490e;
    }

    public final float component6() {
        return this.f83491f;
    }

    public final float component7() {
        return this.f83492g;
    }

    public final C35388j copy(int i, int i2, int i3, int i4, boolean z, float f, float f2) {
        return new C35388j(i, i2, i3, i4, z, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35388j)) {
            return false;
        }
        C35388j jVar = (C35388j) obj;
        return this.f83486a == jVar.f83486a && this.f83487b == jVar.f83487b && this.f83488c == jVar.f83488c && this.f83489d == jVar.f83489d && this.f83490e == jVar.f83490e && Float.compare(this.f83491f, jVar.f83491f) == 0 && Float.compare(this.f83492g, jVar.f83492g) == 0;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((m72415xe91529e0(this.f83486a) * 31) + m72415xe91529e0(this.f83487b)) * 31) + m72415xe91529e0(this.f83488c)) * 31) + m72415xe91529e0(this.f83489d)) * 31;
        boolean z = this.f83490e;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((((com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i) * 31) + m72414xe91529e0(this.f83491f)) * 31) + m72414xe91529e0(this.f83492g);
    }

    public final String toString() {
        return "CanvasExtra(type=" + this.f83486a + ", width=" + this.f83487b + ", height=" + this.f83488c + ", duration=" + this.f83489d + ", enableGesture=" + this.f83490e + ", scaleMinLimit=" + this.f83491f + ", scaleMaxLimit=" + this.f83492g + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.j$a */
    public static final class C35389a {
        static {
            Covode.recordClassIndex(42563);
        }

        private C35389a() {
        }

        public /* synthetic */ C35389a(byte b) {
            this();
        }
    }

    public final int getDuration() {
        return this.f83489d;
    }

    public final boolean getEnableGesture() {
        return this.f83490e;
    }

    public final int getHeight() {
        return this.f83488c;
    }

    public final float getScaleMaxLimit() {
        return this.f83492g;
    }

    public final float getScaleMinLimit() {
        return this.f83491f;
    }

    public final int getType() {
        return this.f83486a;
    }

    public final int getWidth() {
        return this.f83487b;
    }

    /* renamed from: com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m72414xe91529e0(float f) {
        return Float.floatToIntBits(f);
    }

    public C35388j(int i, int i2, int i3, int i4, boolean z, float f, float f2) {
        this.f83486a = i;
        this.f83487b = i2;
        this.f83488c = i3;
        this.f83489d = i4;
        this.f83490e = z;
        this.f83491f = f;
        this.f83492g = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35388j(int i, int i2, int i3, int i4, boolean z, float f, float f2, int i5, C89214g gVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? 0.25f : f, (i5 & 64) != 0 ? 1.0f : f2);
    }
}
