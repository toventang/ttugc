package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.hw */
final class C26026hw<T> implements AbstractC26041ik<T> {

    /* renamed from: a */
    private final AbstractC26020hq f61316a;

    /* renamed from: b */
    private final AbstractC26059jb<?, ?> f61317b;

    /* renamed from: c */
    private final boolean f61318c;

    /* renamed from: d */
    private final AbstractC25968fx<?> f61319d;

    static {
        Covode.recordClassIndex(31441);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final T mo42694a() {
        return (T) this.f61316a.mo42623o().mo42628v();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: c */
    public final void mo42701c(T t) {
        this.f61317b.mo42772d(t);
        this.f61319d.mo42587c(t);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: d */
    public final boolean mo42702d(T t) {
        return this.f61319d.mo42579a((Object) t).mo42591c();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final int mo42692a(T t) {
        int hashCode = this.f61317b.mo42766b(t).hashCode();
        if (this.f61318c) {
            return (hashCode * 53) + this.f61319d.mo42579a((Object) t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: b */
    public final int mo42699b(T t) {
        AbstractC26059jb<?, ?> jbVar = this.f61317b;
        int e = jbVar.mo42773e(jbVar.mo42766b(t)) + 0;
        if (!this.f61318c) {
            return e;
        }
        C25969fy<?> a = this.f61319d.mo42579a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a.f61159a.mo42711b(); i2++) {
            i += C25969fy.m50525a((Map.Entry) a.f61159a.mo42712b(i2));
        }
        for (Map.Entry<T, Object> entry : a.f61159a.mo42713c()) {
            i += C25969fy.m50525a((Map.Entry) entry);
        }
        return e + i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: b */
    public final void mo42700b(T t, T t2) {
        C26043im.m50851a(this.f61317b, t, t2);
        if (this.f61318c) {
            C26043im.m50850a(this.f61319d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final boolean mo42698a(T t, T t2) {
        if (!this.f61317b.mo42766b(t).equals(this.f61317b.mo42766b(t2))) {
            return false;
        }
        if (this.f61318c) {
            return this.f61319d.mo42579a((Object) t).equals(this.f61319d.mo42579a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final void mo42696a(T t, AbstractC26081jt jtVar) {
        Iterator<Map.Entry<?, Object>> b = this.f61319d.mo42579a((Object) t).mo42590b();
        while (b.hasNext()) {
            Map.Entry<?, Object> next = b.next();
            AbstractC25972ga gaVar = (AbstractC25972ga) next.getKey();
            if (gaVar.mo42599c() != EnumC26082ju.MESSAGE || gaVar.mo42600d() || gaVar.mo42601e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C26000gx) {
                jtVar.mo42536a(gaVar.mo42597a(), (Object) ((C26000gx) next).f61270a.getValue().mo42658b());
            } else {
                jtVar.mo42536a(gaVar.mo42597a(), next.getValue());
            }
        }
        AbstractC26059jb<?, ?> jbVar = this.f61317b;
        jbVar.mo42768b(jbVar.mo42766b(t), jtVar);
    }

    /* renamed from: a */
    static <T> C26026hw<T> m50750a(AbstractC26059jb<?, ?> jbVar, AbstractC25968fx<?> fxVar, AbstractC26020hq hqVar) {
        return new C26026hw<>(jbVar, fxVar, hqVar);
    }

    private C26026hw(AbstractC26059jb<?, ?> jbVar, AbstractC25968fx<?> fxVar, AbstractC26020hq hqVar) {
        this.f61317b = jbVar;
        this.f61318c = fxVar.mo42582a(hqVar);
        this.f61319d = fxVar;
        this.f61316a = hqVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final void mo42695a(T t, AbstractC26037ig igVar, C25965fv fvVar) {
        boolean z;
        AbstractC26059jb<?, ?> jbVar = this.f61317b;
        AbstractC25968fx<?> fxVar = this.f61319d;
        Object c = jbVar.mo42770c(t);
        fxVar.mo42583b((Object) t);
        while (igVar.mo42452a() != Integer.MAX_VALUE) {
            try {
                int b = igVar.mo42457b();
                if (b != 11) {
                    if ((b & 7) != 2) {
                        z = igVar.mo42462c();
                    } else if (fxVar.mo42581a(fvVar, this.f61316a, b >>> 3) != null) {
                        fxVar.mo42584b();
                    } else {
                        z = jbVar.mo42765a(c, igVar);
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj = null;
                    AbstractC25943fb fbVar = null;
                    while (igVar.mo42452a() != Integer.MAX_VALUE) {
                        int b2 = igVar.mo42457b();
                        if (b2 == 16) {
                            i = igVar.mo42485o();
                            obj = fxVar.mo42581a(fvVar, this.f61316a, i);
                        } else if (b2 == 26) {
                            if (obj != null) {
                                fxVar.mo42584b();
                            } else {
                                fbVar = igVar.mo42483n();
                            }
                        } else if (!igVar.mo42462c()) {
                            break;
                        }
                    }
                    if (igVar.mo42457b() != 12) {
                        throw C25994gr.m50611e();
                    } else if (fbVar != null) {
                        if (obj != null) {
                            fxVar.mo42586c();
                        } else {
                            jbVar.mo42761a(c, i, fbVar);
                        }
                    }
                }
            } finally {
                jbVar.mo42769b(t, c);
            }
        }
        jbVar.mo42769b(t, c);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final void mo42697a(T t, byte[] bArr, int i, int i2, C25935ew ewVar) {
        int i3 = i;
        T t2 = t;
        C26058ja jaVar = t2.zzb;
        if (jaVar == C26058ja.f61368a) {
            jaVar = new C26058ja();
            t2.zzb = jaVar;
        }
        t.mo42630a();
        Object obj = null;
        while (i3 < i2) {
            i3 = C25936ex.m50197a(bArr, i3, ewVar);
            int i4 = ewVar.f61086a;
            if (i4 == 11) {
                int i5 = 0;
                Object obj2 = null;
                while (i3 < i2) {
                    i3 = C25936ex.m50197a(bArr, i3, ewVar);
                    int i6 = ewVar.f61086a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                throw new NoSuchMethodError();
                            } else if (i8 == 2) {
                                i3 = C25936ex.m50205e(bArr, i3, ewVar);
                                obj2 = ewVar.f61088c;
                            }
                        }
                    } else if (i8 == 0) {
                        i3 = C25936ex.m50197a(bArr, i3, ewVar);
                        i5 = ewVar.f61086a;
                        obj = this.f61319d.mo42581a(ewVar.f61089d, this.f61316a, i5);
                    }
                    if (i6 == 12) {
                        break;
                    }
                    i3 = C25936ex.m50189a(i6, bArr, i3, i2, ewVar);
                }
                if (obj2 != null) {
                    jaVar.mo42752a((i5 << 3) | 2, obj2);
                }
            } else if ((i4 & 7) == 2) {
                obj = this.f61319d.mo42581a(ewVar.f61089d, this.f61316a, i4 >>> 3);
                if (obj == null) {
                    i3 = C25936ex.m50191a(i4, bArr, i3, i2, jaVar, ewVar);
                } else {
                    throw new NoSuchMethodError();
                }
            } else {
                i3 = C25936ex.m50189a(i4, bArr, i3, i2, ewVar);
            }
        }
        if (i3 != i2) {
            throw C25994gr.m50613g();
        }
    }
}
