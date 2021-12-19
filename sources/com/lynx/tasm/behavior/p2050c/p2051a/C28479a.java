package com.lynx.tasm.behavior.p2050c.p2051a;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2050c.AbstractC28493k;
import com.lynx.tasm.behavior.p2050c.C28484b;
import com.lynx.tasm.behavior.p2050c.C28485c;
import com.lynx.tasm.behavior.p2050c.C28486d;
import com.lynx.tasm.behavior.p2050c.C28487e;
import com.lynx.tasm.behavior.p2050c.C28489g;
import com.lynx.tasm.behavior.p2050c.C28491i;
import com.lynx.tasm.behavior.p2050c.C28492j;
import com.lynx.tasm.behavior.p2050c.C28496m;
import com.lynx.tasm.behavior.p2050c.C28497n;
import com.lynx.tasm.behavior.p2050c.C28498o;
import com.lynx.tasm.behavior.p2050c.C28499p;
import com.lynx.tasm.behavior.p2050c.C28500q;
import com.lynx.tasm.utils.C28929m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.lynx.tasm.behavior.c.a.a */
public class C28479a {

    /* renamed from: c */
    private static final Set<String> f66981c = new HashSet(Arrays.asList("x-overlay", "x-input", "input", "page"));

    /* renamed from: a */
    protected final C28529q f66982a;

    /* renamed from: b */
    public boolean f66983b;

    /* renamed from: d */
    private final boolean f66984d;

    /* renamed from: e */
    private final List<AbstractC28493k> f66985e = new ArrayList();

    /* renamed from: b */
    public void mo49003b() {
    }

    /* renamed from: a */
    public final void mo48999a(int i, boolean z, ReadableMap readableMap) {
        mo49002a(new C28498o(i, z, readableMap));
    }

    /* renamed from: a */
    public final void mo49001a(ReadableMap readableMap) {
        mo49002a(new C28492j(readableMap));
    }

    /* renamed from: a */
    public final void mo49000a(long j) {
        mo49002a(new C28486d(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49002a(AbstractC28493k kVar) {
        C28929m.m57951b();
        this.f66985e.add(kVar);
    }

    static {
        Covode.recordClassIndex(34477);
    }

    /* renamed from: a */
    public void mo48991a() {
        C28929m.m57951b();
        if (!this.f66983b) {
            TraceEvent.m56864a(0, "UIOperationQueue.flush");
            ArrayList<AbstractC28493k> arrayList = new ArrayList(this.f66985e);
            this.f66985e.clear();
            for (AbstractC28493k kVar : arrayList) {
                kVar.mo49013b(this.f66982a);
            }
            TraceEvent.m56869b(0, "UIOperationQueue.flush");
        }
    }

    /* renamed from: a */
    public final void mo48992a(int i) {
        mo49002a(new C28500q(i));
    }

    /* renamed from: b */
    public final void mo49004b(int i) {
        mo49002a(new C28489g(i));
    }

    /* renamed from: b */
    public final void mo49006b(long j) {
        mo49002a(new C28485c(j));
    }

    public C28479a(C28529q qVar, boolean z) {
        this.f66982a = qVar;
        this.f66984d = z;
    }

    /* renamed from: a */
    public final void mo48994a(int i, int i2) {
        mo49002a(new C28491i(i, i2));
    }

    /* renamed from: b */
    public final void mo49005b(int i, int i2) {
        mo49002a(new C28484b(i, i2));
    }

    /* renamed from: a */
    public final void mo48996a(int i, Object obj) {
        mo49002a(new C28499p(i, obj));
    }

    /* renamed from: a */
    public final void mo48998a(int i, boolean z) {
        mo49002a(new C28496m(i, z));
    }

    /* renamed from: a */
    public final void mo48995a(int i, int i2, int i3) {
        mo49002a(new C28487e(i, i2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0.f68115o == false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48997a(final int r19, final java.lang.String r20, final com.lynx.tasm.behavior.C28716v r21, final java.util.Map<java.lang.String, com.lynx.tasm.p2054c.C28723a> r22, final boolean r23) {
        /*
            r18 = this;
            r3 = r18
            r3 = r3
            boolean r0 = r3.f66984d
            r9 = r22
            r10 = r23
            r4 = r19
            r6 = r20
            r8 = r21
            if (r0 != 0) goto L_0x0032
            com.lynx.tasm.behavior.q r2 = r3.f66982a
            com.lynx.tasm.TemplateAssembler r1 = r2.f67117i
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0018:
            com.lynx.tasm.behavior.c.a r11 = new com.lynx.tasm.behavior.c.a
            r12 = r4
            r13 = r6
            r14 = r8
            r15 = r9
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r3.mo49002a(r11)
            return
        L_0x0027:
            com.lynx.tasm.TemplateAssembler r0 = r2.f67117i
            com.lynx.tasm.q r0 = r0.f66695j
            if (r0 != 0) goto L_0x002e
            goto L_0x0018
        L_0x002e:
            boolean r0 = r0.f68115o
            if (r0 == 0) goto L_0x0018
        L_0x0032:
            java.util.Set<java.lang.String> r0 = com.lynx.tasm.behavior.p2050c.p2051a.C28479a.f66981c
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x003b
            goto L_0x0018
        L_0x003b:
            com.lynx.tasm.behavior.q r12 = r3.f66982a
            java.util.concurrent.ExecutorService r0 = com.lynx.tasm.core.C28745a.m57566b()
            com.lynx.tasm.behavior.q$1 r11 = new com.lynx.tasm.behavior.q$1
            r13 = r6
            r14 = r4
            r15 = r9
            r16 = r10
            r17 = r8
            r11.<init>(r13, r14, r15, r16, r17)
            java.util.concurrent.Future r5 = r0.submit(r11)
            com.lynx.tasm.behavior.c.a.a$1 r2 = new com.lynx.tasm.behavior.c.a.a$1
            r3 = r3
            r7 = r4
            r2.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3.mo49002a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2050c.p2051a.C28479a.mo48997a(int, java.lang.String, com.lynx.tasm.behavior.v, java.util.Map, boolean):void");
    }

    /* renamed from: a */
    public final void mo48993a(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float[] fArr2, float f17) {
        Rect rect;
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = (int) f4;
        int i6 = (int) f5;
        int i7 = (int) f6;
        int i8 = (int) f7;
        int i9 = (int) f8;
        int i10 = (int) f9;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        int i14 = (int) f13;
        int i15 = (int) f14;
        int i16 = (int) f15;
        int i17 = (int) f16;
        if (fArr != null) {
            rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        } else {
            rect = null;
        }
        mo49002a(new C28497n(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect, fArr2, f17));
    }
}
