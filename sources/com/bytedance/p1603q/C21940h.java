package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.p1605b.AbstractC21932a;

/* renamed from: com.bytedance.q.h */
public final class C21940h {

    /* renamed from: a */
    public Class<? extends AbstractC21935d> f51924a;

    /* renamed from: b */
    public AbstractC21932a f51925b;

    /* renamed from: c */
    public Object[] f51926c;

    static {
        Covode.recordClassIndex(25606);
    }

    /* renamed from: com.bytedance.q.h$a */
    public static final class C21941a {

        /* renamed from: a */
        public Class<? extends AbstractC21935d> f51927a;

        /* renamed from: b */
        public AbstractC21932a f51928b;

        /* renamed from: c */
        public Object[] f51929c;

        static {
            Covode.recordClassIndex(25607);
        }

        /* renamed from: a */
        public final C21940h mo35699a() {
            return new C21940h(this, (byte) 0);
        }

        /* renamed from: a */
        public final C21941a mo35698a(Class<? extends AbstractC21935d> cls) {
            if (cls != null) {
                this.f51927a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }
    }

    private C21940h(C21941a aVar) {
        this.f51924a = aVar.f51927a;
        this.f51925b = aVar.f51928b;
        this.f51926c = aVar.f51929c;
        if (this.f51924a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    /* synthetic */ C21940h(C21941a aVar, byte b) {
        this(aVar);
    }
}
