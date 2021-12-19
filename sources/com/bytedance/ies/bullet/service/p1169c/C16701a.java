package com.bytedance.ies.bullet.service.p1169c;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16647h;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16655p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.c.a */
public final class C16701a implements AbstractC16655p {

    /* renamed from: a */
    private final C16702a f39873a;

    static {
        Covode.recordClassIndex(19141);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16655p
    /* renamed from: a */
    public final Class<Activity> mo26416a() {
        return this.f39873a.f39874a;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16655p
    /* renamed from: b */
    public final FrameLayout.LayoutParams mo26417b() {
        return this.f39873a.f39877d;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16655p
    /* renamed from: c */
    public final FrameLayout.LayoutParams mo26419c() {
        return this.f39873a.f39878e;
    }

    /* renamed from: com.bytedance.ies.bullet.service.c.a$a */
    public static final class C16702a {

        /* renamed from: a */
        public Class<Activity> f39874a;

        /* renamed from: b */
        public AbstractC89172b<? super Context, ? extends AbstractC16650k> f39875b = C16704b.f39880a;

        /* renamed from: c */
        public AbstractC89172b<? super Context, ? extends AbstractC16647h> f39876c = C16703a.f39879a;

        /* renamed from: d */
        public FrameLayout.LayoutParams f39877d;

        /* renamed from: e */
        public FrameLayout.LayoutParams f39878e;

        static {
            Covode.recordClassIndex(19142);
        }

        /* renamed from: com.bytedance.ies.bullet.service.c.a$a$a */
        static final class C16703a extends AbstractC89220m implements AbstractC89172b {

            /* renamed from: a */
            public static final C16703a f39879a = new C16703a();

            static {
                Covode.recordClassIndex(19143);
            }

            C16703a() {
                super(1);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Object invoke(Object obj) {
                C89219l.m154719c(obj, "");
                return null;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.service.c.a$a$b */
        static final class C16704b extends AbstractC89220m implements AbstractC89172b {

            /* renamed from: a */
            public static final C16704b f39880a = new C16704b();

            static {
                Covode.recordClassIndex(19144);
            }

            C16704b() {
                super(1);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Object invoke(Object obj) {
                C89219l.m154719c(obj, "");
                return null;
            }
        }
    }

    private C16701a(C16702a aVar) {
        this.f39873a = aVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16655p
    /* renamed from: a */
    public final AbstractC16650k mo26415a(Context context) {
        C89219l.m154719c(context, "");
        return (AbstractC16650k) this.f39873a.f39875b.invoke(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16655p
    /* renamed from: b */
    public final AbstractC16647h mo26418b(Context context) {
        C89219l.m154719c(context, "");
        return (AbstractC16647h) this.f39873a.f39876c.invoke(context);
    }

    public /* synthetic */ C16701a(C16702a aVar, byte b) {
        this(aVar);
    }
}
