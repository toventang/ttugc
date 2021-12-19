package com.airbnb.epoxy;

import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.airbnb.epoxy.e */
public final class C1933e implements Iterable<C1974u> {

    /* renamed from: a */
    public final C0489d<C1974u> f5799a = new C0489d<>();

    static {
        Covode.recordClassIndex(2124);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.e$a */
    public class C1934a implements Iterator<C1974u> {

        /* renamed from: b */
        private int f5801b;

        static {
            Covode.recordClassIndex(2125);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            if (this.f5801b < C1933e.this.f5799a.mo2080b()) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ C1974u next() {
            if (hasNext()) {
                C0489d<C1974u> dVar = C1933e.this.f5799a;
                int i = this.f5801b;
                this.f5801b = i + 1;
                return dVar.mo2085c(i);
            }
            throw new NoSuchElementException();
        }

        private C1934a() {
        }

        /* synthetic */ C1934a(C1933e eVar, byte b) {
            this();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<C1974u> iterator() {
        return new C1934a(this, (byte) 0);
    }
}
