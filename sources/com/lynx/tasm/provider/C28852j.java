package com.lynx.tasm.provider;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.provider.j */
public final class C28852j<T> {

    /* renamed from: a */
    public Throwable f68098a;

    /* renamed from: b */
    public int f68099b;

    /* renamed from: c */
    public T f68100c;

    static {
        Covode.recordClassIndex(34961);
    }

    /* renamed from: a */
    public final boolean mo49982a() {
        if (this.f68100c != null) {
            return true;
        }
        return false;
    }

    private C28852j(T t) {
        this.f68100c = t;
    }

    /* renamed from: a */
    public static C28852j m57792a(Throwable th) {
        return new C28852j(th);
    }

    private C28852j(Throwable th) {
        this.f68099b = -1;
        this.f68098a = th;
    }

    /* renamed from: a */
    public static <T> C28852j<T> m57791a(T t) {
        C28852j<T> jVar = new C28852j<>((Object) t);
        jVar.f68099b = 0;
        return jVar;
    }
}
