package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.tux.status.TuxStatusView;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89672n;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.a */
public final class C74809a extends RecyclerView.ViewHolder {

    /* renamed from: c */
    public static final C74810a f168133c = new C74810a((byte) 0);

    /* renamed from: a */
    final AbstractC89516am f168134a;

    /* renamed from: b */
    public final C74842i f168135b;

    /* renamed from: d */
    private final AbstractC89703z f168136d;

    static {
        Covode.recordClassIndex(87663);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.a$a */
    public static final class C74810a {
        static {
            Covode.recordClassIndex(87664);
        }

        private C74810a() {
        }

        public /* synthetic */ C74810a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TuxStatusView mo117866a() {
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return (TuxStatusView) view;
    }

    /* renamed from: b */
    public final void mo117867b() {
        TuxStatusView a = mo117866a();
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = 0;
        a.setLayoutParams(layoutParams);
        a.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.a$b */
    static final class C74811b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f168137a;

        /* renamed from: b */
        int f168138b;

        /* renamed from: c */
        final /* synthetic */ C74809a f168139c;

        static {
            Covode.recordClassIndex(87665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74811b(C74809a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f168139c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74811b(this.f168139c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74811b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f168138b;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    this.f168137a = this;
                    this.f168138b = 1;
                    C89672n nVar = new C89672n(C89099b.m154605a(this), 1);
                    this.f168139c.f168135b.mo117898b().mo23347b(nVar, C89108b.m154610a(-1));
                    obj = nVar.mo144218e();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                    this.f168139c.mo117867b();
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC17700f fVar = (AbstractC17700f) obj;
            if (fVar instanceof AbstractC17700f.C17702b) {
                this.f168139c.mo117867b();
            } else if (fVar instanceof AbstractC17700f.C17703c) {
                this.f168139c.mo117867b();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74809a(C74842i iVar, View view) {
        super(view);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        this.f168135b = iVar;
        AbstractC89703z a = C89599cu.m155531a();
        this.f168136d = a;
        this.f168134a = C89517an.m155448a(C89652o.f203399a.plus(a));
    }
}
