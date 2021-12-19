package com.bytedance.p802b.p827g;

import android.os.Debug;
import com.C1764a;
import com.bytedance.apm.p775g.AbstractC12475c;
import com.bytedance.apm.p776h.C12482a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p827g.C13089c;
import com.bytedance.p802b.p827g.p828a.AbstractC13083b;
import com.bytedance.p802b.p827g.p828a.C13082a;
import com.bytedance.p802b.p827g.p829b.C13088a;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p838d.C13107b;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.b.g.b */
public class C13084b {

    /* renamed from: e */
    private static final String f31894e = C13084b.class.getSimpleName();

    /* renamed from: a */
    public volatile AbstractC12475c f31895a;

    /* renamed from: b */
    C13082a f31896b;

    /* renamed from: c */
    Map<Object, Object> f31897c;

    /* renamed from: d */
    List<Object> f31898d;

    /* renamed from: f */
    private volatile boolean f31899f;

    /* renamed from: g */
    private AbstractRunnableC13123a f31900g;

    /* renamed from: h */
    private volatile boolean f31901h;

    /* renamed from: i */
    private long f31902i;

    /* renamed from: j */
    private C13087b f31903j;

    /* renamed from: com.bytedance.b.g.b$a */
    public static class C13086a {

        /* renamed from: a */
        public static final C13084b f31905a = new C13084b((byte) 0);

        static {
            Covode.recordClassIndex(14922);
        }
    }

    static {
        Covode.recordClassIndex(14920);
    }

    /* renamed from: d */
    public final boolean mo20929d() {
        C13082a aVar = this.f31896b;
        if (aVar == null || !aVar.f31889b) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.g.b$b */
    public class C13087b extends C13107b {
        static {
            Covode.recordClassIndex(14923);
        }

        @Override // com.bytedance.p802b.p834j.p838d.C13107b, com.bytedance.p802b.p834j.p838d.AbstractC13108c
        /* renamed from: a */
        public final void mo20838a() {
            if (C13037a.m23579r()) {
                C13084b.this.mo20929d();
            }
            if (C13084b.this.mo20929d()) {
                C13084b.this.mo20927b();
            }
        }

        @Override // com.bytedance.p802b.p834j.p838d.C13107b, com.bytedance.p802b.p834j.p838d.AbstractC13108c
        /* renamed from: b */
        public final void mo20839b() {
            if (C13037a.m23579r()) {
                C13084b.this.mo20929d();
            }
            if (C13084b.this.mo20929d()) {
                C13084b.this.mo20928c();
            }
        }

        private C13087b() {
        }

        /* synthetic */ C13087b(C13084b bVar, byte b) {
            this();
        }
    }

    private C13084b() {
        this.f31903j = new C13087b(this, (byte) 0);
        this.f31898d = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public final synchronized void mo20925a() {
        if (!this.f31899f) {
            this.f31899f = true;
            mo20926a(((AbstractC13083b) C13104c.m23566a(AbstractC13083b.class)).mo20831a());
        }
    }

    /* renamed from: c */
    public final synchronized void mo20928c() {
        if (this.f31901h) {
            this.f31901h = false;
            if (this.f31900g != null) {
                C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20944b(this.f31900g);
                this.f31900g = null;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20927b() {
        if (!this.f31901h) {
            this.f31901h = true;
            if (this.f31900g == null) {
                this.f31900g = new AbstractRunnableC13123a(this.f31902i) {
                    /* class com.bytedance.p802b.p827g.C13084b.C130851 */

                    static {
                        Covode.recordClassIndex(14921);
                    }

                    public final void run() {
                        double d;
                        boolean z;
                        C13084b bVar = C13084b.this;
                        long currentTimeMillis = System.currentTimeMillis();
                        C13089c cVar = C13089c.C13090a.f31926a;
                        C13082a aVar = bVar.f31896b;
                        Debug.MemoryInfo e = C13089c.m23535e();
                        if (e != null) {
                            long j = ((long) e.dalvikPss) * 1024;
                            if (j >= 0) {
                                AbstractC13106a aVar2 = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
                                long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                                if (freeMemory > 0) {
                                    d = new BigDecimal(freeMemory).divide(new BigDecimal(Runtime.getRuntime().maxMemory()), 4, 4).doubleValue();
                                } else {
                                    d = -1.0d;
                                }
                                long a = cVar.mo20932a();
                                long b = cVar.mo20933b();
                                long c = cVar.mo20934c();
                                long d2 = cVar.mo20935d();
                                boolean z2 = !aVar2.mo20901a();
                                long j2 = ((long) e.nativePss) * 1024;
                                long totalPss = ((long) e.getTotalPss()) * 1024;
                                long a2 = C13089c.m23533a(e);
                                long a3 = C13091d.m23540a() * 1024;
                                if (a3 <= 0) {
                                    a3 = -1;
                                }
                                if (d > aVar.mo20923a()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C13088a aVar3 = new C13088a(a, b, c, d2, z2, j2, totalPss, freeMemory, j, a2, a3, d, z, aVar.f31890c);
                                aVar3.f31920n = bVar.f31897c;
                                bVar.f31897c = null;
                                if (C13037a.m23579r()) {
                                    C1764a.m5928a("collect[isUploadEnable=%s cost=%s]: %s", new Object[]{Boolean.valueOf(bVar.f31896b.f31891d), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), aVar3.mo20772c().toString()});
                                }
                                if (bVar.f31896b.f31891d) {
                                    C13092a.m23544a(aVar3);
                                } else if (C12482a.f30319b) {
                                    aVar3.mo20772c();
                                }
                                if (aVar3.f31918l > bVar.f31896b.mo20923a() && bVar.f31895a != null) {
                                    AbstractC12475c cVar2 = bVar.f31895a;
                                }
                                if (bVar.f31898d != null && bVar.f31898d.size() > 0) {
                                    try {
                                        Iterator<Object> it = bVar.f31898d.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                };
                C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(this.f31900g);
            }
        }
    }

    /* synthetic */ C13084b(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo20926a(C13082a aVar) {
        if (aVar != null) {
            this.f31896b = aVar;
            if (!aVar.f31892e) {
                mo20928c();
                AbstractC13106a aVar2 = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
                if (aVar2 != null) {
                    aVar2.mo20903b(this.f31903j);
                }
                return;
            }
            AbstractC13106a aVar3 = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
            if (aVar3 != null) {
                if (aVar.f31889b) {
                    aVar3.mo20903b(this.f31903j);
                    aVar3.mo20900a(this.f31903j);
                } else {
                    aVar3.mo20903b(this.f31903j);
                }
            }
            long j = aVar.f31888a * 1000;
            this.f31902i = j;
            if (j < 30000) {
                this.f31902i = 30000;
            }
            AbstractRunnableC13123a aVar4 = this.f31900g;
            if (!(aVar4 == null || aVar4.f31963g == this.f31902i)) {
                mo20928c();
            }
            mo20927b();
            AbstractC13081a aVar5 = (AbstractC13081a) C13104c.m23566a(AbstractC13081a.class);
            if (aVar5 != null) {
                aVar5.mo20776a();
            }
        }
    }
}
