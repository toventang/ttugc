package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.common.p1835g.C24108e;
import com.facebook.imagepipeline.p1891p.C24644b;

/* renamed from: com.facebook.imagepipeline.memory.ab */
public final class C24477ab {

    /* renamed from: a */
    public final C24480ad f58137a;

    /* renamed from: b */
    public final AbstractC24481ae f58138b;

    /* renamed from: c */
    public final C24480ad f58139c;

    /* renamed from: d */
    public final AbstractC24107d f58140d;

    /* renamed from: e */
    public final C24480ad f58141e;

    /* renamed from: f */
    public final AbstractC24481ae f58142f;

    /* renamed from: g */
    public final C24480ad f58143g;

    /* renamed from: h */
    public final AbstractC24481ae f58144h;

    /* renamed from: i */
    public final String f58145i;

    /* renamed from: j */
    public final int f58146j;

    /* renamed from: k */
    public final int f58147k;

    static {
        Covode.recordClassIndex(28621);
    }

    /* renamed from: com.facebook.imagepipeline.memory.ab$a */
    public static class C24478a {

        /* renamed from: a */
        public C24480ad f58148a;

        /* renamed from: b */
        public AbstractC24481ae f58149b;

        /* renamed from: c */
        public C24480ad f58150c;

        /* renamed from: d */
        public AbstractC24107d f58151d;

        /* renamed from: e */
        public C24480ad f58152e;

        /* renamed from: f */
        public AbstractC24481ae f58153f;

        /* renamed from: g */
        public C24480ad f58154g;

        /* renamed from: h */
        public AbstractC24481ae f58155h;

        /* renamed from: i */
        public String f58156i;

        /* renamed from: j */
        public int f58157j;

        /* renamed from: k */
        public int f58158k;

        static {
            Covode.recordClassIndex(28622);
        }

        private C24478a() {
        }

        /* renamed from: a */
        public final C24477ab mo40352a() {
            return new C24477ab(this, (byte) 0);
        }

        /* synthetic */ C24478a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C24478a m46748a() {
        return new C24478a((byte) 0);
    }

    private C24477ab(C24478a aVar) {
        C24480ad adVar;
        AbstractC24481ae aeVar;
        C24480ad adVar2;
        AbstractC24107d dVar;
        C24480ad adVar3;
        AbstractC24481ae aeVar2;
        C24480ad adVar4;
        AbstractC24481ae aeVar3;
        String str;
        int i;
        int i2;
        C24644b.m47156a();
        if (aVar.f58148a == null) {
            adVar = C24493k.m46791a();
        } else {
            adVar = aVar.f58148a;
        }
        this.f58137a = adVar;
        if (aVar.f58149b == null) {
            aeVar = C24510y.m46846a();
        } else {
            aeVar = aVar.f58149b;
        }
        this.f58138b = aeVar;
        int i3 = 4194304;
        if (aVar.f58150c == null) {
            adVar2 = new C24480ad(4194304, C24494l.f58200a * 4194304, C24494l.m46792a(C24494l.f58200a), 131072, 4194304, C24494l.f58200a);
        } else {
            adVar2 = aVar.f58150c;
        }
        this.f58139c = adVar2;
        if (aVar.f58151d == null) {
            dVar = C24108e.m45686a();
        } else {
            dVar = aVar.f58151d;
        }
        this.f58140d = dVar;
        if (aVar.f58152e == null) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(1024, 5);
            sparseIntArray.put(2048, 5);
            sparseIntArray.put(4096, 5);
            sparseIntArray.put(8192, 5);
            sparseIntArray.put(16384, 5);
            sparseIntArray.put(32768, 5);
            sparseIntArray.put(65536, 5);
            sparseIntArray.put(131072, 5);
            sparseIntArray.put(262144, 2);
            sparseIntArray.put(524288, 2);
            sparseIntArray.put(1048576, 2);
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < 16777216) {
                i = 3145728;
            } else if (min < 33554432) {
                i = 6291456;
            } else {
                i = 12582912;
            }
            int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min2 < 16777216) {
                i2 = min2 / 2;
            } else {
                i2 = (min2 / 4) * 3;
            }
            adVar3 = new C24480ad(i, i2, sparseIntArray);
        } else {
            adVar3 = aVar.f58152e;
        }
        this.f58141e = adVar3;
        if (aVar.f58153f == null) {
            aeVar2 = C24510y.m46846a();
        } else {
            aeVar2 = aVar.f58153f;
        }
        this.f58142f = aeVar2;
        if (aVar.f58154g == null) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.put(16384, 5);
            adVar4 = new C24480ad(81920, 1048576, sparseIntArray2);
        } else {
            adVar4 = aVar.f58154g;
        }
        this.f58143g = adVar4;
        if (aVar.f58155h == null) {
            aeVar3 = C24510y.m46846a();
        } else {
            aeVar3 = aVar.f58155h;
        }
        this.f58144h = aeVar3;
        if (aVar.f58156i == null) {
            str = "legacy";
        } else {
            str = aVar.f58156i;
        }
        this.f58145i = str;
        this.f58146j = aVar.f58157j;
        this.f58147k = aVar.f58158k > 0 ? aVar.f58158k : i3;
        C24644b.m47156a();
    }

    /* synthetic */ C24477ab(C24478a aVar, byte b) {
        this(aVar);
    }
}
