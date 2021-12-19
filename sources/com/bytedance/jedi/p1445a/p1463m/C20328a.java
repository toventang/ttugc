package com.bytedance.jedi.p1445a.p1463m;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* renamed from: com.bytedance.jedi.a.m.a */
final class C20328a {

    /* renamed from: a */
    public static final Comparator<C20328a> f48178a = new Comparator<C20328a>() {
        /* class com.bytedance.jedi.p1445a.p1463m.C20328a.C203291 */

        static {
            Covode.recordClassIndex(23837);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C20328a aVar, C20328a aVar2) {
            return (int) Math.abs(aVar.f48182e - aVar2.f48182e);
        }
    };

    /* renamed from: b */
    public static final Comparator<C20328a> f48179b = new Comparator<C20328a>() {
        /* class com.bytedance.jedi.p1445a.p1463m.C20328a.C203302 */

        static {
            Covode.recordClassIndex(23838);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C20328a aVar, C20328a aVar2) {
            return (int) Math.abs(aVar.f48183f - aVar2.f48183f);
        }
    };

    /* renamed from: c */
    public static final Comparator<C20328a> f48180c = new Comparator<C20328a>() {
        /* class com.bytedance.jedi.p1445a.p1463m.C20328a.C203313 */

        static {
            Covode.recordClassIndex(23839);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C20328a aVar, C20328a aVar2) {
            return aVar.f48181d.getCanonicalName().compareTo(aVar2.f48181d.getCanonicalName());
        }
    };

    /* renamed from: d */
    public final Class<?> f48181d;

    /* renamed from: e */
    public long f48182e;

    /* renamed from: f */
    public long f48183f;

    static {
        Covode.recordClassIndex(23836);
    }

    public final String toString() {
        return "ClassHistogramElement[class=" + this.f48181d.getCanonicalName() + ", instances=" + this.f48182e + ", bytes=" + this.f48183f + "]";
    }

    public C20328a(Class<?> cls) {
        this.f48181d = cls;
    }

    /* renamed from: a */
    public final void mo33659a(long j) {
        this.f48182e++;
        this.f48183f += j;
    }
}
