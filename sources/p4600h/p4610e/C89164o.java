package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4621l.AbstractC89306h;

/* access modifiers changed from: package-private */
/* renamed from: h.e.o */
public final class C89164o implements AbstractC89306h<String> {

    /* renamed from: a */
    public final BufferedReader f202878a;

    static {
        Covode.recordClassIndex(105248);
    }

    @Override // p4600h.p4621l.AbstractC89306h
    /* renamed from: a */
    public final Iterator<String> mo2926a() {
        return new C89165a(this);
    }

    /* renamed from: h.e.o$a */
    public static final class C89165a implements AbstractC89196a, Iterator<String> {

        /* renamed from: a */
        final /* synthetic */ C89164o f202879a;

        /* renamed from: b */
        private String f202880b;

        /* renamed from: c */
        private boolean f202881c;

        static {
            Covode.recordClassIndex(105249);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f202880b == null && !this.f202881c) {
                String readLine = this.f202879a.f202878a.readLine();
                this.f202880b = readLine;
                if (readLine == null) {
                    this.f202881c = true;
                }
            }
            if (this.f202880b != null) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ String next() {
            if (hasNext()) {
                String str = this.f202880b;
                this.f202880b = null;
                if (str == null) {
                    C89219l.m154715b();
                }
                return str;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89165a(C89164o oVar) {
            this.f202879a = oVar;
        }
    }

    public C89164o(BufferedReader bufferedReader) {
        C89219l.m154721d(bufferedReader, "");
        this.f202878a = bufferedReader;
    }
}
