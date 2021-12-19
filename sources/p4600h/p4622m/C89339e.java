package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;

/* access modifiers changed from: package-private */
/* renamed from: h.m.e */
public final class C89339e implements AbstractC89306h<C89269g> {

    /* renamed from: a */
    public final CharSequence f202997a;

    /* renamed from: b */
    public final int f202998b = 0;

    /* renamed from: c */
    public final int f202999c;

    /* renamed from: d */
    public final AbstractC89183m<CharSequence, Integer, C89378p<Integer, Integer>> f203000d;

    static {
        Covode.recordClassIndex(105423);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<C89269g> mo2926a() {
        return new C89340a(this);
    }

    /* renamed from: h.m.e$a */
    public static final class C89340a implements AbstractC89196a, Iterator<C89269g> {

        /* renamed from: a */
        public int f203001a = -1;

        /* renamed from: b */
        public int f203002b;

        /* renamed from: c */
        public int f203003c;

        /* renamed from: d */
        public C89269g f203004d;

        /* renamed from: e */
        public int f203005e;

        /* renamed from: f */
        final /* synthetic */ C89339e f203006f;

        static {
            Covode.recordClassIndex(105424);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f203001a == -1) {
                m154833a();
            }
            if (this.f203001a == 1) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ C89269g next() {
            if (this.f203001a == -1) {
                m154833a();
            }
            if (this.f203001a != 0) {
                C89269g gVar = this.f203004d;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f203004d = null;
                this.f203001a = -1;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
            if (r1 < r6.f203006f.f202999c) goto L_0x001e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m154833a() {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89339e.C89340a.m154833a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89340a(C89339e eVar) {
            this.f203006f = eVar;
            int a = C89271h.m154762a(eVar.f202998b, 0, eVar.f202997a.length());
            this.f203002b = a;
            this.f203003c = a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.lang.CharSequence, ? super java.lang.Integer, h.p<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89339e(CharSequence charSequence, int i, AbstractC89183m<? super CharSequence, ? super Integer, C89378p<Integer, Integer>> mVar) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(mVar, "");
        this.f202997a = charSequence;
        this.f202999c = i;
        this.f203000d = mVar;
    }
}
