package com.bytedance.ies.bullet.service.popup;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16647h;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16671v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.i */
public final class C16978i implements AbstractC16671v {

    /* renamed from: a */
    private final C16979a f40431a;

    static {
        Covode.recordClassIndex(19420);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16671v
    /* renamed from: a */
    public final FrameLayout.LayoutParams mo26459a() {
        return this.f40431a.f40434c;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16671v
    /* renamed from: b */
    public final FrameLayout.LayoutParams mo26461b() {
        return this.f40431a.f40435d;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.i$a */
    public static final class C16979a {

        /* renamed from: a */
        public AbstractC89172b<? super Context, ? extends AbstractC16650k> f40432a = C16981b.f40437a;

        /* renamed from: b */
        public AbstractC89172b<? super Context, ? extends AbstractC16647h> f40433b = C16980a.f40436a;

        /* renamed from: c */
        public FrameLayout.LayoutParams f40434c;

        /* renamed from: d */
        public FrameLayout.LayoutParams f40435d;

        static {
            Covode.recordClassIndex(19421);
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.i$a$a */
        static final class C16980a extends AbstractC89220m implements AbstractC89172b {

            /* renamed from: a */
            public static final C16980a f40436a = new C16980a();

            static {
                Covode.recordClassIndex(19422);
            }

            C16980a() {
                super(1);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Object invoke(Object obj) {
                C89219l.m154719c(obj, "");
                return null;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.i$a$b */
        static final class C16981b extends AbstractC89220m implements AbstractC89172b {

            /* renamed from: a */
            public static final C16981b f40437a = new C16981b();

            static {
                Covode.recordClassIndex(19423);
            }

            C16981b() {
                super(1);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Object invoke(Object obj) {
                C89219l.m154719c(obj, "");
                return null;
            }
        }
    }

    private C16978i(C16979a aVar) {
        this.f40431a = aVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16671v
    /* renamed from: a */
    public final AbstractC16650k mo26460a(Context context) {
        C89219l.m154719c(context, "");
        return (AbstractC16650k) this.f40431a.f40432a.invoke(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16671v
    /* renamed from: b */
    public final AbstractC16647h mo26462b(Context context) {
        C89219l.m154719c(context, "");
        return (AbstractC16647h) this.f40431a.f40433b.invoke(context);
    }

    public /* synthetic */ C16978i(C16979a aVar, byte b) {
        this(aVar);
    }
}
