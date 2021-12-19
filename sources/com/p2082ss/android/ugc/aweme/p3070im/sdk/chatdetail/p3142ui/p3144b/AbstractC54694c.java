package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import com.airbnb.epoxy.AbstractC1954q;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c */
public abstract class AbstractC54694c extends AbstractC1954q {

    /* renamed from: g */
    public View f125343g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c$a */
    static final class C54695a<V> implements AbstractC89248d<AbstractC54694c, V> {

        /* renamed from: a */
        private Object f125344a = C54696a.f125346a;

        /* renamed from: b */
        private final AbstractC89183m<AbstractC54694c, AbstractC89286i<?>, V> f125345b;

        static {
            Covode.recordClassIndex(64410);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c$a$a */
        static final class C54696a {

            /* renamed from: a */
            public static final C54696a f125346a = new C54696a();

            private C54696a() {
            }

            static {
                Covode.recordClassIndex(64411);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c, ? super h.k.i<?>, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public C54695a(AbstractC89183m<? super AbstractC54694c, ? super AbstractC89286i<?>, ? extends V> mVar) {
            C89219l.m154721d(mVar, "");
            this.f125345b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.k.i] */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ Object mo23374a(AbstractC54694c cVar, AbstractC89286i iVar) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(iVar, "");
            if (C89219l.m154714a(this.f125344a, C54696a.f125346a)) {
                this.f125344a = this.f125345b.invoke(cVar, iVar);
            }
            return this.f125344a;
        }
    }

    static {
        Covode.recordClassIndex(64409);
    }

    /* renamed from: a */
    public final View mo91720a() {
        View view = this.f125343g;
        if (view == null) {
            C89219l.m154710a("view");
        }
        return view;
    }

    @Override // com.airbnb.epoxy.AbstractC1954q
    /* renamed from: a */
    public void mo5782a(View view) {
        C89219l.m154721d(view, "");
        this.f125343g = view;
    }

    /* renamed from: a */
    protected static <V extends View> AbstractC89248d<AbstractC54694c, V> m100198a(int i) {
        return new C54695a(new C54697b(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c$b */
    static final class C54697b extends AbstractC89220m implements AbstractC89183m<AbstractC54694c, AbstractC89286i<?>, V> {

        /* renamed from: a */
        final /* synthetic */ int f125347a;

        static {
            Covode.recordClassIndex(64412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54697b(int i) {
            super(2);
            this.f125347a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(AbstractC54694c cVar, AbstractC89286i<?> iVar) {
            AbstractC54694c cVar2 = cVar;
            AbstractC89286i<?> iVar2 = iVar;
            C89219l.m154721d(cVar2, "");
            C89219l.m154721d(iVar2, "");
            View view = cVar2.f125343g;
            if (view == null) {
                C89219l.m154710a("view");
            }
            View findViewById = view.findViewById(this.f125347a);
            if (findViewById != null) {
                return findViewById;
            }
            throw new IllegalStateException("View ID " + this.f125347a + " for '" + iVar2.getName() + "' not found.");
        }
    }
}
