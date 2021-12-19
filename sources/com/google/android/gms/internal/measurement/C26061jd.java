package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.jd */
final class C26061jd extends AbstractC26059jb<C26058ja, C26058ja> {
    static {
        Covode.recordClassIndex(31476);
    }

    C26061jd() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ C26058ja mo42757a() {
        return new C26058ja();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: b */
    public final /* synthetic */ C26058ja mo42766b(Object obj) {
        return ((AbstractC25981gj) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: d */
    public final void mo42772d(Object obj) {
        ((AbstractC25981gj) obj).zzb.f61373f = false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: f */
    public final /* synthetic */ int mo42774f(C26058ja jaVar) {
        return jaVar.mo42751a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ C26058ja mo42758a(C26058ja jaVar) {
        C26058ja jaVar2 = jaVar;
        jaVar2.f61373f = false;
        return jaVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: c */
    public final /* synthetic */ C26058ja mo42770c(Object obj) {
        C26058ja jaVar = ((AbstractC25981gj) obj).zzb;
        if (jaVar != C26058ja.f61368a) {
            return jaVar;
        }
        C26058ja jaVar2 = new C26058ja();
        m50927a(obj, jaVar2);
        return jaVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: e */
    public final /* synthetic */ int mo42773e(C26058ja jaVar) {
        C26058ja jaVar2 = jaVar;
        int i = jaVar2.f61372e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < jaVar2.f61369b; i3++) {
            i2 += (AbstractC25958fq.m50394m(8) << 1) + AbstractC25958fq.m50386g(2, jaVar2.f61370c[i3] >>> 3) + AbstractC25958fq.m50374c(3, (AbstractC25943fb) jaVar2.f61371d[i3]);
        }
        jaVar2.f61372e = i2;
        return i2;
    }

    /* renamed from: a */
    private static void m50927a(Object obj, C26058ja jaVar) {
        ((AbstractC25981gj) obj).zzb = jaVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: b */
    public final /* synthetic */ void mo42769b(Object obj, C26058ja jaVar) {
        m50927a(obj, jaVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.measurement.jt] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: b */
    public final /* synthetic */ void mo42768b(C26058ja jaVar, AbstractC26081jt jtVar) {
        C26058ja jaVar2 = jaVar;
        if (jtVar.mo42528a() == AbstractC25981gj.C25986e.f61253k) {
            for (int i = jaVar2.f61369b - 1; i >= 0; i--) {
                jtVar.mo42536a(jaVar2.f61370c[i] >>> 3, jaVar2.f61371d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < jaVar2.f61369b; i2++) {
            jtVar.mo42536a(jaVar2.f61370c[i2] >>> 3, jaVar2.f61371d[i2]);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: c */
    public final /* synthetic */ C26058ja mo42771c(C26058ja jaVar, C26058ja jaVar2) {
        C26058ja jaVar3 = jaVar;
        C26058ja jaVar4 = jaVar2;
        if (jaVar4.equals(C26058ja.f61368a)) {
            return jaVar3;
        }
        int i = jaVar3.f61369b + jaVar4.f61369b;
        int[] copyOf = Arrays.copyOf(jaVar3.f61370c, i);
        System.arraycopy(jaVar4.f61370c, 0, copyOf, jaVar3.f61369b, jaVar4.f61369b);
        Object[] copyOf2 = Arrays.copyOf(jaVar3.f61371d, i);
        System.arraycopy(jaVar4.f61371d, 0, copyOf2, jaVar3.f61369b, jaVar4.f61369b);
        return new C26058ja(i, copyOf, copyOf2, true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.measurement.jt] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ void mo42763a(C26058ja jaVar, AbstractC26081jt jtVar) {
        jaVar.mo42753a(jtVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42764a(Object obj, C26058ja jaVar) {
        m50927a(obj, jaVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: b */
    public final /* synthetic */ void mo42767b(C26058ja jaVar, int i, long j) {
        jaVar.mo42752a((i << 3) | 1, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ void mo42759a(C26058ja jaVar, int i, int i2) {
        jaVar.mo42752a((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ void mo42760a(C26058ja jaVar, int i, long j) {
        jaVar.mo42752a(i << 3, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, com.google.android.gms.internal.measurement.fb] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ void mo42761a(C26058ja jaVar, int i, AbstractC25943fb fbVar) {
        jaVar.mo42752a((i << 3) | 2, fbVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26059jb
    /* renamed from: a */
    public final /* synthetic */ void mo42762a(C26058ja jaVar, int i, C26058ja jaVar2) {
        jaVar.mo42752a((i << 3) | 3, jaVar2);
    }
}
