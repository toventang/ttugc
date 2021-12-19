package com.p2082ss.android.ugc.aweme.preload.p3563a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preload.a.b */
public class C63316b<T> extends AbstractC88922b<T> {

    /* renamed from: c */
    public static final C63317a f143709c = new C63317a((byte) 0);

    /* renamed from: a */
    private C63329e f143710a;

    static {
        Covode.recordClassIndex(74599);
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.b$a */
    public static final class C63317a {
        static {
            Covode.recordClassIndex(74600);
        }

        private C63317a() {
        }

        public /* synthetic */ C63317a(byte b) {
            this();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onComplete() {
        dispose();
    }

    public String toString() {
        return "RxDisposableObserver{taskInfo='" + this.f143710a + "}";
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onNext(T t) {
        m114813a(t);
    }

    public C63316b(C63329e eVar) {
        this.f143710a = eVar;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onError(Throwable th) {
        C89219l.m154721d(th, "");
        m114813a(null);
    }

    /* renamed from: a */
    private final String m114813a(T t) {
        String obj;
        C63329e eVar = this.f143710a;
        if (eVar != null) {
            return String.valueOf(eVar);
        }
        if (t == null || (obj = t.toString()) == null) {
            return "missing name";
        }
        return obj;
    }
}
