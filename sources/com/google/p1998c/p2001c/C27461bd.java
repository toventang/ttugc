package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27375ag;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.C27448ay;
import com.google.p1998c.p2004f.C27560a;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bd */
public final class C27461bd<E> extends AbstractC27375ag<E> {

    /* renamed from: a */
    static final C27461bd<Object> f64783a = new C27461bd<>(new C27448ay());

    /* renamed from: b */
    final transient C27448ay<E> f64784b;

    /* renamed from: c */
    private final transient int f64785c;

    /* renamed from: d */
    private transient AbstractC27381ai<E> f64786d;

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return false;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int size() {
        return this.f64785c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.bd$a */
    public final class C27462a extends AbstractC27381ai.AbstractC27383b<E> {
        static {
            Covode.recordClassIndex(33042);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        public final int size() {
            return C27461bd.this.f64784b.f64749c;
        }

        private C27462a() {
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            return C27461bd.this.contains(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.AbstractC27383b
        /* renamed from: a */
        public final E mo45585a(int i) {
            return C27461bd.this.f64784b.mo45809b(i);
        }

        /* synthetic */ C27462a(C27461bd bdVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27536x
    public final Object writeReplace() {
        return new C27463b(this);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27375ag, com.google.p1998c.p2001c.AbstractC27438au
    public final AbstractC27381ai<E> elementSet() {
        AbstractC27381ai<E> aiVar = this.f64786d;
        if (aiVar != null) {
            return aiVar;
        }
        C27462a aVar = new C27462a(this, (byte) 0);
        this.f64786d = aVar;
        return aVar;
    }

    /* renamed from: com.google.c.c.bd$b */
    static class C27463b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f64788a;

        /* renamed from: b */
        final int[] f64789b;

        static {
            Covode.recordClassIndex(33043);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.ag$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            AbstractC27375ag.C27377a aVar = new AbstractC27375ag.C27377a(this.f64788a.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f64788a;
                if (i >= objArr.length) {
                    return aVar.mo45646a();
                }
                aVar.mo45645a(objArr[i], this.f64789b[i]);
                i++;
            }
        }

        C27463b(AbstractC27438au<?> auVar) {
            int size = auVar.entrySet().size();
            this.f64788a = new Object[size];
            this.f64789b = new int[size];
            int i = 0;
            for (AbstractC27438au.AbstractC27439a<?> aVar : auVar.entrySet()) {
                this.f64788a[i] = aVar.mo45778a();
                this.f64789b[i] = aVar.mo45779b();
                i++;
            }
        }
    }

    static {
        Covode.recordClassIndex(33041);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int count(Object obj) {
        return this.f64784b.mo45807b(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27375ag
    /* renamed from: a */
    public final AbstractC27438au.AbstractC27439a<E> mo45628a(int i) {
        C27448ay<E> ayVar = this.f64784b;
        C27245k.m54228a(i, ayVar.f64749c);
        return new C27448ay.C27449a(i);
    }

    C27461bd(C27448ay<E> ayVar) {
        this.f64784b = ayVar;
        long j = 0;
        for (int i = 0; i < ayVar.f64749c; i++) {
            j += (long) ayVar.mo45810c(i);
        }
        this.f64785c = C27560a.m55098a(j);
    }
}
