package com.google.android.play.core.p1966e;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1966e.p1968b.C27018a;
import com.google.android.play.core.tasks.AbstractC27062d;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.play.core.e.ae */
final class C26999ae implements AbstractC27030c {

    /* renamed from: a */
    private final AbstractC26916bg<C27013as> f63896a;

    /* renamed from: b */
    private final AbstractC26916bg<C27018a> f63897b;

    /* renamed from: c */
    private final AbstractC26916bg<File> f63898c;

    static {
        Covode.recordClassIndex(32475);
    }

    C26999ae(AbstractC26916bg<C27013as> bgVar, AbstractC26916bg<C27018a> bgVar2, AbstractC26916bg<File> bgVar3) {
        this.f63896a = bgVar;
        this.f63897b = bgVar2;
        this.f63898c = bgVar3;
    }

    /* renamed from: c */
    private final AbstractC27030c m53638c() {
        return (AbstractC27030c) (this.f63898c.mo44603a() == null ? this.f63896a : this.f63897b).mo44603a();
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final AbstractC27062d<Void> mo44703a(int i) {
        return m53638c().mo44703a(i);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final AbstractC27062d<Integer> mo44704a(C27032e eVar) {
        return m53638c().mo44704a(eVar);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final Set<String> mo44705a() {
        return m53638c().mo44705a();
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final void mo44706a(AbstractC27035g gVar) {
        m53638c().mo44706a(gVar);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final boolean mo44707a(AbstractC27034f fVar, Activity activity, int i) {
        return m53638c().mo44707a(fVar, activity, i);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final AbstractC27062d<AbstractC27034f> mo44708b(int i) {
        return m53638c().mo44708b(i);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final Set<String> mo44709b() {
        return m53638c().mo44709b();
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final void mo44710b(AbstractC27035g gVar) {
        m53638c().mo44710b(gVar);
    }
}
