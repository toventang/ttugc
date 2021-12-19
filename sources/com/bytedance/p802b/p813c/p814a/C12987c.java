package com.bytedance.p802b.p813c.p814a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p802b.p813c.p814a.C12981a;
import com.bytedance.p802b.p813c.p815b.C12999a;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.p802b.p834j.p838d.C13107b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.b.c.a.c */
public class C12987c extends C13107b {

    /* renamed from: a */
    public AtomicBoolean f31627a = new AtomicBoolean(false);

    /* renamed from: b */
    public C12999a f31628b;

    /* renamed from: c */
    public HashMap<String, C12981a> f31629c;

    /* renamed from: d */
    public HashMap<String, C12981a> f31630d;

    /* renamed from: e */
    public HashMap<String, C12981a> f31631e;

    /* renamed from: f */
    private AbstractC23724c f31632f;

    static {
        Covode.recordClassIndex(14823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.c.a.c$1 */
    public static /* synthetic */ class C129881 {

        /* renamed from: a */
        static final /* synthetic */ int[] f31633a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 14824(0x39e8, float:2.0773E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.b.c.a.a$a[] r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.p802b.p813c.p814a.C12987c.C129881.f31633a = r2
                com.bytedance.b.c.a.a$a r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.MIX     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.p802b.p813c.p814a.C12987c.C129881.f31633a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.BACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.p802b.p813c.p814a.C12987c.C129881.f31633a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.FRONT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p813c.p814a.C12987c.C129881.<clinit>():void");
        }
    }

    C12987c(AbstractC23724c cVar) {
        this.f31632f = cVar;
    }

    /* renamed from: a */
    public final void mo20842a(AbstractC23724c.C23725a aVar) {
        if (this.f31627a.get()) {
            synchronized (C12987c.class) {
                m23310a(C12981a.EnumC12982a.FRONT, aVar);
                m23310a(C12981a.EnumC12982a.BACK, aVar);
                m23310a(C12981a.EnumC12982a.MIX, aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C12981a mo20840a(C12981a.EnumC12982a aVar, String str) {
        int i = C129881.f31633a[aVar.ordinal()];
        if (i == 1) {
            return this.f31629c.get(str);
        }
        if (i == 2) {
            return this.f31631e.get(str);
        }
        if (i != 3) {
            return null;
        }
        return this.f31630d.get(str);
    }

    /* renamed from: a */
    private void m23310a(C12981a.EnumC12982a aVar, AbstractC23724c.C23725a aVar2) {
        Iterator<Map.Entry<String, C12981a>> it;
        long currentTimeMillis = System.currentTimeMillis();
        int i = C129881.f31633a[aVar.ordinal()];
        if (i == 1) {
            it = this.f31629c.entrySet().iterator();
        } else if (i == 2) {
            it = this.f31631e.entrySet().iterator();
        } else if (i == 3) {
            it = this.f31630d.entrySet().iterator();
        } else {
            return;
        }
        if (it != null) {
            while (it.hasNext()) {
                C12981a value = it.next().getValue();
                if (currentTimeMillis - value.f31614g > this.f31628b.mo20851a()) {
                    it.remove();
                    double d = value.f31609b;
                    double d2 = (double) value.f31615h;
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    double d4 = value.f31610c;
                    double d5 = value.f31611d;
                    double d6 = (double) value.f31615h;
                    Double.isNaN(d6);
                    m23311a(aVar, value.f31613f, d3, d4, d5 / d6, value.f31612e, aVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20841a(C12981a.EnumC12982a aVar, String str, C12981a aVar2) {
        int i = C129881.f31633a[aVar.ordinal()];
        if (i == 1) {
            this.f31629c.put(str, aVar2);
        } else if (i == 2) {
            this.f31631e.put(str, aVar2);
        } else if (i == 3) {
            this.f31630d.put(str, aVar2);
        }
    }

    /* renamed from: a */
    static C12981a m23309a(C12981a.EnumC12982a aVar, C12981a aVar2, double d, double d2) {
        if (aVar2 == null) {
            aVar2 = new C12981a(aVar, System.currentTimeMillis());
            aVar2.f31613f = C13099c.m23558a().mo20938b();
        }
        if (d >= 0.0d || d2 >= 0.0d) {
            aVar2.f31615h++;
        }
        if (d2 >= 0.0d) {
            aVar2.f31611d += d2;
        }
        if (d >= 0.0d) {
            aVar2.f31609b += d;
        }
        if (aVar2.f31610c < d) {
            aVar2.f31610c = d;
        }
        if (aVar2.f31612e < d2) {
            aVar2.f31612e = d2;
        }
        return aVar2;
    }

    /* renamed from: a */
    private void m23311a(C12981a.EnumC12982a aVar, String str, double d, double d2, double d3, double d4, AbstractC23724c.C23725a aVar2) {
        C12992e eVar = new C12992e(aVar, str, d, d2, d3, d4, aVar2);
        try {
            eVar.f31645b = this.f31632f.mo39172i();
        } catch (Throwable unused) {
        }
        C13092a.m23544a(eVar);
    }
}
