package com.bytedance.scene.p1621c;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.p1617a.AbstractC22129d;
import com.bytedance.scene.p1622d.AbstractC22165f;

/* renamed from: com.bytedance.scene.c.f */
public final class C22154f {

    /* renamed from: a */
    public final AbstractC22129d f52380a;

    /* renamed from: b */
    public final AbstractC22156g f52381b;

    /* renamed from: c */
    public final boolean f52382c;

    /* renamed from: d */
    public final AbstractC22165f<AbstractC22219j> f52383d;

    static {
        Covode.recordClassIndex(25958);
    }

    /* renamed from: com.bytedance.scene.c.f$a */
    public static class C22155a {

        /* renamed from: a */
        public boolean f52384a;

        /* renamed from: b */
        public AbstractC22156g f52385b;

        /* renamed from: c */
        public AbstractC22129d f52386c;

        /* renamed from: d */
        private AbstractC22165f<AbstractC22219j> f52387d;

        static {
            Covode.recordClassIndex(25959);
        }

        /* renamed from: a */
        public final C22155a mo36336a() {
            this.f52384a = true;
            return this;
        }

        /* renamed from: b */
        public final C22154f mo36338b() {
            return new C22154f(this.f52387d, this.f52384a, this.f52385b, this.f52386c, (byte) 0);
        }

        /* renamed from: a */
        public final C22155a mo36337a(AbstractC22129d dVar) {
            this.f52386c = dVar;
            return this;
        }
    }

    private C22154f(AbstractC22165f<AbstractC22219j> fVar, boolean z, AbstractC22156g gVar, AbstractC22129d dVar) {
        this.f52383d = fVar;
        this.f52382c = z;
        this.f52381b = gVar;
        this.f52380a = dVar;
    }

    /* synthetic */ C22154f(AbstractC22165f fVar, boolean z, AbstractC22156g gVar, AbstractC22129d dVar, byte b) {
        this(fVar, z, gVar, dVar);
    }
}
