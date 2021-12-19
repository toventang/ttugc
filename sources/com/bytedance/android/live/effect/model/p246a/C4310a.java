package com.bytedance.android.live.effect.model.p246a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.model.a.a */
public final class C4310a {

    /* renamed from: a */
    public final String f11847a;

    /* renamed from: b */
    public final String f11848b;

    /* renamed from: c */
    public final String f11849c;

    /* renamed from: d */
    public final boolean f11850d;

    /* renamed from: e */
    public long f11851e;

    /* renamed from: f */
    public final List<Integer> f11852f;

    /* renamed from: g */
    public final List<C4311b> f11853g;

    /* renamed from: h */
    public boolean f11854h;

    static {
        Covode.recordClassIndex(4882);
    }

    public final String toString() {
        return "LiveComposerNode(panel='" + this.f11847a + "', effectId='" + this.f11848b + "', path='" + this.f11849c + "', isWithoutFace=" + this.f11850d + ", updateTime=" + this.f11851e + ", coexistGroup=" + this.f11852f + ", tagList=" + this.f11853g + ", use=" + this.f11854h + ')';
    }

    public C4310a(C4310a aVar) {
        C89219l.m154721d(aVar, "");
        ArrayList arrayList = new ArrayList();
        this.f11852f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f11853g = arrayList2;
        this.f11847a = aVar.f11847a;
        this.f11848b = aVar.f11848b;
        this.f11849c = aVar.f11849c;
        this.f11850d = aVar.f11850d;
        this.f11851e = aVar.f11851e;
        this.f11854h = aVar.f11854h;
        arrayList.addAll(aVar.f11852f);
        arrayList2.addAll(aVar.f11853g);
    }

    public C4310a(String str, String str2, String str3, boolean z, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f11852f = new ArrayList();
        this.f11853g = new ArrayList();
        this.f11847a = str;
        this.f11848b = str2;
        this.f11849c = str3;
        this.f11850d = z;
        this.f11851e = j;
    }
}
