package com.lynx.tasm.p2043a;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;

/* renamed from: com.lynx.tasm.a.b */
public class C28407b implements Cloneable {

    /* renamed from: a */
    public String f66756a;

    /* renamed from: b */
    public long f66757b;

    /* renamed from: c */
    public long f66758c;

    /* renamed from: d */
    public int f66759d;

    /* renamed from: e */
    public int f66760e;

    /* renamed from: f */
    public float f66761f;

    /* renamed from: g */
    public float f66762g;

    /* renamed from: h */
    public float f66763h;

    /* renamed from: i */
    public float f66764i;

    /* renamed from: j */
    public int f66765j;

    /* renamed from: k */
    public int f66766k;

    /* renamed from: l */
    public int f66767l = -1;

    /* renamed from: m */
    public int f66768m;

    /* renamed from: n */
    public int f66769n = -1;

    /* renamed from: o */
    public int f66770o;

    static {
        Covode.recordClassIndex(34397);
    }

    public C28407b() {
    }

    /* renamed from: a */
    public final boolean mo48836a(C28407b bVar) {
        if (!mo48837b(bVar) || this.f66769n != bVar.f66769n) {
            return false;
        }
        return true;
    }

    public C28407b(C28407b bVar) {
        this.f66756a = bVar.f66756a;
        this.f66757b = bVar.f66757b;
        this.f66758c = bVar.f66758c;
        this.f66759d = bVar.f66759d;
        this.f66760e = bVar.f66760e;
        this.f66761f = bVar.f66761f;
        this.f66762g = bVar.f66762g;
        this.f66763h = bVar.f66763h;
        this.f66764i = bVar.f66764i;
        this.f66765j = bVar.f66765j;
        this.f66766k = bVar.f66766k;
        this.f66767l = bVar.f66767l;
        this.f66768m = bVar.f66768m;
        this.f66769n = bVar.f66769n;
        this.f66770o = bVar.f66770o;
    }

    /* renamed from: a */
    public static C28407b m56802a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        readableArray.size();
        C28407b bVar = new C28407b();
        bVar.f66756a = readableArray.getString(0);
        bVar.f66757b = readableArray.getLong(1);
        int a = bVar.mo48834a(readableArray, 2);
        int i = a + 1;
        bVar.f66758c = readableArray.getLong(a);
        int i2 = i + 1;
        bVar.f66766k = readableArray.getInt(i) - 1;
        int i3 = i2 + 1;
        bVar.f66768m = readableArray.getInt(i2);
        bVar.f66767l = readableArray.getInt(i3);
        bVar.f66769n = readableArray.getInt(i3 + 1);
        return bVar;
    }

    /* renamed from: b */
    public final boolean mo48837b(C28407b bVar) {
        if (bVar != null && this.f66756a.equals(bVar.f66756a) && this.f66757b == bVar.f66757b && this.f66758c == bVar.f66758c && this.f66759d == bVar.f66759d && this.f66760e == bVar.f66760e && this.f66761f == bVar.f66761f && this.f66762g == bVar.f66762g && this.f66763h == bVar.f66763h && this.f66764i == bVar.f66764i && this.f66765j == bVar.f66765j && this.f66766k == bVar.f66766k && this.f66767l == bVar.f66767l && this.f66768m == bVar.f66768m && this.f66770o == bVar.f66770o) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo48834a(ReadableArray readableArray, int i) {
        if (readableArray == null || readableArray.size() < 6) {
            this.f66760e = 0;
            this.f66765j = 0;
            this.f66761f = 0.0f;
            this.f66762g = 0.0f;
            this.f66763h = 0.0f;
            this.f66764i = 0.0f;
            return i;
        }
        this.f66760e = readableArray.getInt(i);
        this.f66765j = readableArray.getInt(i + 1);
        this.f66761f = (float) readableArray.getDouble(i + 2);
        this.f66762g = (float) readableArray.getDouble(i + 3);
        this.f66763h = (float) readableArray.getDouble(i + 4);
        this.f66764i = (float) readableArray.getDouble(i + 5);
        return i + 6;
    }

    /* renamed from: a */
    public final void mo48835a(int i, float f, float f2, float f3, float f4, int i2) {
        this.f66760e = i;
        this.f66765j = i2;
        this.f66761f = f;
        this.f66762g = f2;
        this.f66763h = f3;
        this.f66764i = f4;
    }
}
