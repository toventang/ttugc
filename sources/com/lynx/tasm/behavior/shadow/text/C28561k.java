package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.C28601c;
import com.lynx.tasm.utils.C28926j;

/* renamed from: com.lynx.tasm.behavior.shadow.text.k */
public class C28561k {

    /* renamed from: a */
    public int f67191a = -1;

    /* renamed from: b */
    public int f67192b = -1;

    /* renamed from: c */
    public Integer f67193c;

    /* renamed from: d */
    public int f67194d = 3;

    /* renamed from: e */
    public int f67195e;

    /* renamed from: f */
    public int f67196f = -1;

    /* renamed from: g */
    public int f67197g;

    /* renamed from: h */
    public int f67198h;

    /* renamed from: i */
    public int f67199i;

    /* renamed from: j */
    public int f67200j;

    /* renamed from: k */
    public float f67201k = 1.0E21f;

    /* renamed from: l */
    public float f67202l = 1.0E21f;

    /* renamed from: m */
    public float f67203m;

    /* renamed from: n */
    public float f67204n = ((float) Math.round(C28926j.m57938a(14.0f)));

    /* renamed from: o */
    public boolean f67205o = false;

    /* renamed from: p */
    public boolean f67206p = false;

    /* renamed from: q */
    public String f67207q = null;

    /* renamed from: r */
    public C28601c f67208r;

    /* renamed from: s */
    public int f67209s;

    static {
        Covode.recordClassIndex(34577);
    }

    /* renamed from: c */
    public final TextDirectionHeuristic mo49180c() {
        int i = this.f67195e;
        if (i == 0) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return TextDirectionHeuristics.LTR;
        }
        return TextDirectionHeuristics.RTL;
    }

    /* renamed from: a */
    public final int mo49178a() {
        int i = this.f67197g;
        if (i == 1) {
            if (this.f67198h == 2) {
                return 3;
            }
            return i;
        } else if (i == 1) {
            return i;
        } else {
            int i2 = this.f67198h;
            if (i2 == 2) {
                return i2;
            }
            return 0;
        }
    }

    /* renamed from: b */
    public final Layout.Alignment mo49179b() {
        int i = this.f67194d;
        if (i == 0) {
            int i2 = this.f67195e;
            if (i2 == 3 || i2 == 0) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            int i3 = this.f67195e;
            if (i3 == 3 || i3 == 0) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        } else {
            return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2 = ((this.f67191a * 31) + this.f67192b) * 31;
        Integer num = this.f67193c;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -16777216;
        }
        int floatToIntBits = (((((((((((((((((((((((i2 + i) * 31) + this.f67194d) * 31) + this.f67196f) * 31) + this.f67197g) * 31) + this.f67199i) * 31) + this.f67200j) * 31) + Float.floatToIntBits(this.f67201k)) * 31) + Float.floatToIntBits(this.f67202l)) * 31) + Float.floatToIntBits(this.f67203m)) * 31) + Float.floatToIntBits(this.f67204n)) * 31) + (this.f67205o ? 1 : 0)) * 31) + (this.f67206p ? 1 : 0)) * 31;
        String str = this.f67207q;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (floatToIntBits + hashCode) * 31;
        C28601c cVar = this.f67208r;
        if (cVar != null) {
            i3 = cVar.hashCode();
        }
        return ((((i4 + i3) * 31) + this.f67209s) * 31) + this.f67195e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28561k)) {
            return false;
        }
        C28561k kVar = (C28561k) obj;
        if (this.f67191a == kVar.f67191a && this.f67192b == kVar.f67192b) {
            Integer num = kVar.f67193c;
            Integer num2 = this.f67193c;
            if (num2 == null ? num == null : !(num == null || !num2.equals(num))) {
                if (this.f67194d == kVar.f67194d && this.f67196f == kVar.f67196f && this.f67197g == kVar.f67197g && this.f67198h == kVar.f67198h && this.f67199i == kVar.f67199i && this.f67200j == kVar.f67200j && this.f67201k == kVar.f67201k && this.f67202l == kVar.f67202l && this.f67203m == kVar.f67203m && this.f67204n == kVar.f67204n && this.f67205o == kVar.f67205o && this.f67206p == kVar.f67206p && TextUtils.equals(this.f67207q, kVar.f67207q) && this.f67208r == kVar.f67208r && this.f67209s == kVar.f67209s && this.f67195e == kVar.f67195e) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
