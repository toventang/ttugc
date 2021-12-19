package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3183a;

import android.view.View;
import com.airbnb.epoxy.AbstractC1954q;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a */
public abstract class AbstractC55164a extends AbstractC1954q {

    /* renamed from: b */
    public View f126215b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a$a */
    public static final class C55165a<V> implements AbstractC89248d<AbstractC55164a, V> {

        /* renamed from: a */
        private Object f126216a = C55166a.f126218a;

        /* renamed from: b */
        private final AbstractC89183m<AbstractC55164a, AbstractC89286i<?>, V> f126217b;

        static {
            Covode.recordClassIndex(64910);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a$a$a */
        static final class C55166a {

            /* renamed from: a */
            public static final C55166a f126218a = new C55166a();

            private C55166a() {
            }

            static {
                Covode.recordClassIndex(64911);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a, ? super h.k.i<?>, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public C55165a(AbstractC89183m<? super AbstractC55164a, ? super AbstractC89286i<?>, ? extends V> mVar) {
            C89219l.m154721d(mVar, "");
            this.f126217b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.k.i] */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ Object mo23374a(AbstractC55164a aVar, AbstractC89286i iVar) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(iVar, "");
            if (C89219l.m154714a(this.f126216a, C55166a.f126218a)) {
                this.f126216a = this.f126217b.invoke(aVar, iVar);
            }
            return this.f126216a;
        }
    }

    static {
        Covode.recordClassIndex(64909);
    }

    @Override // com.airbnb.epoxy.AbstractC1954q
    /* renamed from: a */
    public final void mo5782a(View view) {
        C89219l.m154721d(view, "");
        this.f126215b = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a$b */
    public static final class C55167b extends AbstractC89220m implements AbstractC89183m<AbstractC55164a, AbstractC89286i<?>, V> {

        /* renamed from: a */
        final /* synthetic */ int f126219a = R.id.aua;

        static {
            Covode.recordClassIndex(64912);
        }

        public C55167b() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(AbstractC55164a aVar, AbstractC89286i<?> iVar) {
            AbstractC55164a aVar2 = aVar;
            AbstractC89286i<?> iVar2 = iVar;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(iVar2, "");
            View view = aVar2.f126215b;
            if (view == null) {
                C89219l.m154710a("view");
            }
            View findViewById = view.findViewById(this.f126219a);
            if (findViewById != null) {
                return findViewById;
            }
            throw new IllegalStateException("View ID " + this.f126219a + " for '" + iVar2.getName() + "' not found.");
        }
    }
}
