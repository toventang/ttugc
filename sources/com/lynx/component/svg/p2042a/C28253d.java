package com.lynx.component.svg.p2042a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.component.svg.a.d */
public final class C28253d {

    /* renamed from: c */
    public static final C28253d f66226c = new C28253d(null, null);

    /* renamed from: d */
    public static final C28253d f66227d = new C28253d(EnumC28254a.none, null);

    /* renamed from: e */
    public static final C28253d f66228e = new C28253d(EnumC28254a.xMidYMid, EnumC28255b.meet);

    /* renamed from: f */
    public static final C28253d f66229f = new C28253d(EnumC28254a.xMinYMin, EnumC28255b.meet);

    /* renamed from: g */
    public static final C28253d f66230g = new C28253d(EnumC28254a.xMaxYMax, EnumC28255b.meet);

    /* renamed from: h */
    public static final C28253d f66231h = new C28253d(EnumC28254a.xMidYMin, EnumC28255b.meet);

    /* renamed from: i */
    public static final C28253d f66232i = new C28253d(EnumC28254a.xMidYMax, EnumC28255b.meet);

    /* renamed from: j */
    public static final C28253d f66233j = new C28253d(EnumC28254a.xMidYMid, EnumC28255b.slice);

    /* renamed from: k */
    public static final C28253d f66234k = new C28253d(EnumC28254a.xMinYMin, EnumC28255b.slice);

    /* renamed from: a */
    public EnumC28254a f66235a;

    /* renamed from: b */
    public EnumC28255b f66236b;

    public final String toString() {
        return this.f66235a + " " + this.f66236b;
    }

    /* renamed from: com.lynx.component.svg.a.d$b */
    public enum EnumC28255b {
        meet,
        slice;

        static {
            Covode.recordClassIndex(34213);
        }
    }

    static {
        Covode.recordClassIndex(34211);
    }

    /* renamed from: com.lynx.component.svg.a.d$a */
    public enum EnumC28254a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax;

        static {
            Covode.recordClassIndex(34212);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28253d dVar = (C28253d) obj;
        if (this.f66235a == dVar.f66235a && this.f66236b == dVar.f66236b) {
            return true;
        }
        return false;
    }

    C28253d(EnumC28254a aVar, EnumC28255b bVar) {
        this.f66235a = aVar;
        this.f66236b = bVar;
    }
}
