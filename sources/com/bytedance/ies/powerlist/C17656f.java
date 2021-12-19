package com.bytedance.ies.powerlist;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.f */
public final class C17656f<T extends AbstractC17641a> extends AbstractC17636a<T> {

    /* renamed from: b */
    private final List<T> f42222b = new ArrayList();

    /* renamed from: c */
    private final ReentrantLock f42223c = new ReentrantLock();

    static {
        Covode.recordClassIndex(20210);
    }

    /* renamed from: b */
    public final int mo28134b() {
        return this.f42222b.size();
    }

    /* renamed from: c */
    public final List<AbstractC17641a> mo28140c() {
        return new ArrayList(this.f42222b);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28128a() {
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.clear();
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final T mo28135b(int i) {
        return this.f42222b.get(i);
    }

    /* renamed from: c */
    public final int mo28139c(T t) {
        C89219l.m154719c(t, "");
        return this.f42222b.indexOf(t);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo28137b(T t) {
        C89219l.m154719c(t, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.remove(t);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo28141c(Collection<? extends T> collection) {
        C89219l.m154719c(collection, "");
        this.f42222b.clear();
        this.f42222b.addAll(collection);
        mo28104a((List) this.f42222b, true);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28129a(int i) {
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.remove(i);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo28138b(Collection<? extends T> collection) {
        C89219l.m154719c(collection, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.clear();
            this.f42222b.addAll(collection);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28132a(T t) {
        C89219l.m154719c(t, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.add(t);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28133a(Collection<? extends T> collection) {
        C89219l.m154719c(collection, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.addAll(collection);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo28136b(int i, T t) {
        C89219l.m154719c(t, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.remove(i);
            this.f42222b.add(i, t);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28130a(int i, T t) {
        C89219l.m154719c(t, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.add(i, t);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28131a(int i, Collection<? extends T> collection) {
        C89219l.m154719c(collection, "");
        ReentrantLock reentrantLock = this.f42223c;
        reentrantLock.lock();
        try {
            this.f42222b.addAll(i, collection);
            reentrantLock.unlock();
            AbstractC17636a.m32750a(this, this.f42222b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
