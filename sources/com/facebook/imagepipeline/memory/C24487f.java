package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.util.LinkedList;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.imagepipeline.memory.f */
public class C24487f<V> {

    /* renamed from: a */
    public final int f58184a;

    /* renamed from: b */
    public final int f58185b;

    /* renamed from: c */
    final Queue f58186c;

    /* renamed from: d */
    final boolean f58187d;

    /* renamed from: e */
    public int f58188e;

    static {
        Covode.recordClassIndex(28631);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo40365a() {
        return this.f58186c.size();
    }

    /* renamed from: b */
    public V mo40367b() {
        return (V) this.f58186c.poll();
    }

    /* renamed from: c */
    public final void mo40368c() {
        boolean z;
        if (this.f58188e > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        this.f58188e--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40366a(V v) {
        this.f58186c.add(v);
    }

    public C24487f(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45622b(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C24091i.m45622b(z3);
        C24091i.m45622b(i3 < 0 ? false : z4);
        this.f58184a = i;
        this.f58185b = i2;
        this.f58186c = new LinkedList();
        this.f58188e = i3;
        this.f58187d = z;
    }
}
