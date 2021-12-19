package com.p2082ss.android.ugc.p4314h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.h.g */
public class C84116g implements AbstractC84109c {

    /* renamed from: a */
    public static int f187707a = 10;

    /* renamed from: d */
    private static volatile C84116g f187708d;

    /* renamed from: b */
    public AbstractC84109c f187709b;

    /* renamed from: c */
    public AbstractC84109c f187710c;

    /* renamed from: com.ss.android.ugc.h.g$a */
    public interface AbstractC84117a {
        static {
            Covode.recordClassIndex(98013);
        }

        /* renamed from: a */
        double mo118414a(Queue<C84119i> queue, C84119i[] iVarArr);

        /* renamed from: b */
        double mo118415b(Queue<C84119i> queue, C84119i[] iVarArr);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final double mo124223a() {
        return this.f187710c.mo124223a();
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: b */
    public final C84119i[] mo124228b() {
        return this.f187710c.mo124228b();
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: c */
    public final void mo124229c() {
        this.f187710c.mo124229c();
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84110d
    /* renamed from: d */
    public final double mo124230d() {
        return this.f187710c.mo124230d();
    }

    static {
        Covode.recordClassIndex(98012);
    }

    private C84116g() {
        C84118h hVar = new C84118h();
        this.f187709b = hVar;
        this.f187710c = hVar;
    }

    /* renamed from: f */
    public static int m144637f() {
        double d = m144636e().mo124230d();
        if (d == -1.0d) {
            return -1;
        }
        return (int) ((d / 8.0d) / 1000.0d);
    }

    /* renamed from: e */
    public static C84116g m144636e() {
        MethodCollector.m26663i(8757);
        if (f187708d == null) {
            synchronized (C84116g.class) {
                try {
                    if (f187708d == null) {
                        f187708d = new C84116g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8757);
                    throw th;
                }
            }
        }
        C84116g gVar = f187708d;
        MethodCollector.m26664o(8757);
        return gVar;
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124224a(double d) {
        this.f187710c.mo124224a(d);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124226a(int i) {
        this.f187710c.mo124226a(i);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124227a(AbstractC84117a aVar) {
        this.f187710c.mo124227a(aVar);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124225a(double d, double d2, long j) {
        this.f187710c.mo124225a(d, d2, j);
    }
}
