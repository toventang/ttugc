package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.c */
public final class C83408c {

    /* renamed from: a */
    public boolean f186275a;

    /* renamed from: b */
    public final Object f186276b;

    /* renamed from: c */
    public final Object f186277c;

    /* renamed from: d */
    public int f186278d;

    /* renamed from: e */
    public final boolean f186279e;

    /* renamed from: f */
    public final boolean f186280f;

    static {
        Covode.recordClassIndex(97294);
    }

    public final String toString() {
        return "BottomTabIndexChangeEvent{fromTag=" + this.f186276b + ", toTag=" + this.f186277c + '}';
    }

    public C83408c(Object obj, Object obj2, int i, boolean z, boolean z2) {
        C89219l.m154721d(obj2, "");
        this.f186276b = obj;
        this.f186277c = obj2;
        this.f186278d = i;
        this.f186279e = z;
        this.f186280f = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C83408c(Object obj, Object obj2, int i, boolean z, boolean z2, int i2) {
        this(obj, obj2, i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2);
    }
}
