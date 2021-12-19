package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ttnet.org.chromium.base.h */
public class C87459h<E> implements Iterable<E> {

    /* renamed from: e */
    public static final /* synthetic */ boolean f198359e = true;

    /* renamed from: a */
    public final List<E> f198360a = new ArrayList();

    /* renamed from: b */
    public int f198361b;

    /* renamed from: c */
    public int f198362c;

    /* renamed from: d */
    public boolean f198363d;

    /* renamed from: com.ttnet.org.chromium.base.h$a */
    class C87460a implements AbstractC87461i<E> {

        /* renamed from: b */
        private int f198365b;

        /* renamed from: c */
        private int f198366c;

        /* renamed from: d */
        private boolean f198367d;

        static {
            Covode.recordClassIndex(103395);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        private void m151795a() {
            if (!this.f198367d) {
                this.f198367d = true;
                C87459h.this.mo141516a();
            }
        }

        public final boolean hasNext() {
            int i = this.f198366c;
            while (i < this.f198365b && C87459h.this.mo141515a(i) == null) {
                i++;
            }
            if (i < this.f198365b) {
                return true;
            }
            m151795a();
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            while (true) {
                int i = this.f198366c;
                if (i >= this.f198365b || C87459h.this.mo141515a(i) != null) {
                    int i2 = this.f198366c;
                } else {
                    this.f198366c++;
                }
            }
            int i22 = this.f198366c;
            if (i22 < this.f198365b) {
                C87459h hVar = C87459h.this;
                this.f198366c = i22 + 1;
                return (E) hVar.mo141515a(i22);
            }
            m151795a();
            throw new NoSuchElementException();
        }

        private C87460a() {
            C87459h.this.f198361b++;
            this.f198365b = C87459h.this.f198360a.size();
        }

        /* synthetic */ C87460a(C87459h hVar, byte b) {
            this();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new C87460a(this, (byte) 0);
    }

    static {
        Covode.recordClassIndex(103394);
    }

    /* renamed from: b */
    private void m151791b() {
        if (f198359e || this.f198361b == 0) {
            for (int size = this.f198360a.size() - 1; size >= 0; size--) {
                if (this.f198360a.get(size) == null) {
                    this.f198360a.remove(size);
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo141516a() {
        int i = this.f198361b - 1;
        this.f198361b = i;
        if (!f198359e && i < 0) {
            throw new AssertionError();
        } else if (i <= 0 && this.f198363d) {
            this.f198363d = false;
            m151791b();
        }
    }

    /* renamed from: a */
    public final E mo141515a(int i) {
        return this.f198360a.get(i);
    }

    /* renamed from: a */
    public final boolean mo141517a(E e) {
        if (e == null || this.f198360a.contains(e)) {
            return false;
        }
        boolean add = this.f198360a.add(e);
        if (f198359e || add) {
            this.f198362c++;
            return true;
        }
        throw new AssertionError();
    }
}
