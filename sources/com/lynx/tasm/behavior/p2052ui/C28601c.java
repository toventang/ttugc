package com.lynx.tasm.behavior.p2052ui;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.c */
public final class C28601c {

    /* renamed from: a */
    public int f67342a;

    /* renamed from: b */
    public float f67343b;

    /* renamed from: c */
    public float f67344c;

    /* renamed from: d */
    public float f67345d;

    /* renamed from: e */
    public float f67346e;

    /* renamed from: f */
    public float f67347f;

    /* renamed from: g */
    public int f67348g;

    static {
        Covode.recordClassIndex(34636);
    }

    /* renamed from: a */
    public final boolean mo49432a() {
        if (this.f67348g == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = ((this.f67348g * 31) + this.f67342a) * 31;
        float f = this.f67343b;
        int i6 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        float f2 = this.f67344c;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        float f3 = this.f67345d;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        float f4 = this.f67346e;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        float f5 = this.f67347f;
        if (f5 != 0.0f) {
            i6 = Float.floatToIntBits(f5);
        }
        return i10 + i6;
    }

    public final String toString() {
        return "ShadowData: Color: red " + Color.red(this.f67342a) + " green: " + Color.green(this.f67342a) + " blue: " + Color.blue(Color.blue(this.f67342a)) + " OffsetX: " + this.f67343b + " offsetY: " + this.f67344c + " blurRadius: " + this.f67345d + " spreadRadius: " + this.f67346e + "option: " + this.f67348g;
    }

    /* renamed from: a */
    private static boolean m57198a(C28601c cVar) {
        if ((cVar.f67343b == 0.0f && cVar.f67344c == 0.0f && cVar.f67345d == 0.0f && cVar.f67346e == 0.0f) || Color.alpha(cVar.f67342a) == 0 || cVar.f67345d < 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<C28601c> m57197a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            C28601c cVar = new C28601c();
            cVar.f67343b = (float) array.getDouble(0);
            cVar.f67344c = (float) array.getDouble(1);
            float f = (float) array.getDouble(2);
            cVar.f67345d = f;
            cVar.f67347f = f * 1.25f;
            cVar.f67346e = (float) array.getDouble(3);
            cVar.f67348g = (int) array.getDouble(4);
            cVar.f67342a = (int) array.getLong(5);
            if (m57198a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C28601c cVar = (C28601c) obj;
            if (this.f67342a == cVar.f67342a && Float.compare(cVar.f67343b, this.f67343b) == 0 && Float.compare(cVar.f67344c, this.f67344c) == 0 && Float.compare(cVar.f67345d, this.f67345d) == 0 && Float.compare(cVar.f67346e, this.f67346e) == 0 && Float.compare(cVar.f67347f, this.f67347f) == 0 && this.f67348g == cVar.f67348g) {
                return true;
            }
        }
        return false;
    }
}
