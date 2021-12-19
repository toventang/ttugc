package com.lynx.tasm.behavior.p2052ui.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.utils.i */
public final class C28695i {

    /* renamed from: a */
    public final int f67679a;

    /* renamed from: b */
    public final float f67680b;

    /* renamed from: c */
    public final float f67681c;

    /* renamed from: d */
    public final float f67682d;

    /* renamed from: e */
    private final int f67683e;

    /* renamed from: f */
    private final int f67684f;

    /* renamed from: g */
    private final int f67685g;

    static {
        Covode.recordClassIndex(34771);
    }

    /* renamed from: a */
    public final boolean mo49797a() {
        if (this.f67683e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo49798b() {
        if (this.f67684f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m57469c() {
        if (mo49797a() || mo49798b() || this.f67685g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m57468a(List<C28695i> list) {
        if (list != null && !list.isEmpty()) {
            for (C28695i iVar : list) {
                if (iVar.m57469c()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<C28695i> m57467a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array.size() < 7) {
                new IllegalArgumentException("transform params is error.");
            } else {
                arrayList.add(new C28695i(array.getInt(0), (float) array.getDouble(1), array.getInt(2), (float) array.getDouble(3), array.getInt(4), (float) array.getDouble(5), array.getInt(6)));
            }
        }
        return arrayList;
    }

    public C28695i(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.f67679a = i;
        this.f67680b = f;
        this.f67683e = i2;
        this.f67681c = f2;
        this.f67684f = i3;
        this.f67682d = f3;
        this.f67685g = i4;
    }
}
