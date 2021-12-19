package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.C75496d;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75480a;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75481b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.View$OnClickListenerC75483c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76235h;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.sticker.widget.C76412b;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b */
public class C76211b extends AbstractC76225f<Effect> {

    /* renamed from: a */
    public int f171210a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f171211b = -1;

    /* renamed from: c */
    public final AbstractC75655o f171212c;

    /* renamed from: d */
    public final AbstractC76151g f171213d;

    /* renamed from: e */
    final C75572h f171214e;

    /* renamed from: f */
    public final AbstractC75474b f171215f;

    /* renamed from: g */
    public final AbstractC76085a f171216g;

    /* renamed from: l */
    private final AbstractC76125l.C76126a f171217l;

    /* renamed from: m */
    private final String f171218m;

    /* renamed from: n */
    private final int f171219n;

    static {
        Covode.recordClassIndex(89161);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$g */
    static final class C76218g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171226a;

        /* renamed from: b */
        final /* synthetic */ List f171227b;

        static {
            Covode.recordClassIndex(89168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76218g(C76211b bVar, List list) {
            super(0);
            this.f171226a = bVar;
            this.f171227b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!this.f171227b.isEmpty()) {
                this.f171226a.f171234h.addAll(this.f171227b);
            }
            C76211b bVar = this.f171226a;
            C76211b.super.mo119952a((C76211b) bVar.f171234h);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$h */
    static final class C76219h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171228a;

        /* renamed from: b */
        final /* synthetic */ List f171229b;

        static {
            Covode.recordClassIndex(89169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76219h(C76211b bVar, List list) {
            super(0);
            this.f171228a = bVar;
            this.f171229b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            final C1445j.C1450d a = C1445j.m4922a(new C75496d(this.f171228a.f171212c.mo119294f(), new ArrayList(this.f171228a.f171234h), this.f171229b), false);
            C89219l.m154716b(a, "");
            C80558hx.m139642a(0, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76211b.C76219h.C762201 */

                /* renamed from: a */
                final /* synthetic */ C76219h f171230a;

                static {
                    Covode.recordClassIndex(89170);
                }

                {
                    this.f171230a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f171230a.f171228a.f171234h.clear();
                    if (!this.f171230a.f171229b.isEmpty()) {
                        this.f171230a.f171228a.f171234h.addAll(this.f171230a.f171229b);
                    }
                    this.f171230a.f171228a.mo119956b(this.f171230a.f171228a.f171234h);
                    a.mo4951a(this.f171230a.f171228a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$a */
    static final class C76212a extends AbstractC89220m implements AbstractC89172b<Integer, Effect> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171220a;

        static {
            Covode.recordClassIndex(89162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76212a(C76211b bVar) {
            super(1);
            this.f171220a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Effect invoke(Integer num) {
            return this.f171220a.mo119955a(num.intValue());
        }
    }

    /* renamed from: b */
    public void mo119953b(AbstractC76235h<Effect, C76210a<Effect>> hVar) {
        C89219l.m154721d(hVar, "");
        hVar.mo119957a(AbstractC76235h.C76236a.C76237a.f171252a, new C76213b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$c */
    static final class C76214c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171222a;

        static {
            Covode.recordClassIndex(89164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76214c(C76211b bVar) {
            super(1);
            this.f171222a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(C75466g.m132368t((Effect) this.f171222a.mo119955a(num.intValue())));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119948a(C76210a<Effect> aVar) {
        C89219l.m154721d(aVar, "");
        super.mo119948a((C76210a) aVar);
        aVar.mo119158a(this.f171214e.f169833g.f169868m);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$d */
    static final class C76215d extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171223a;

        static {
            Covode.recordClassIndex(89165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76215d(C76211b bVar) {
            super(1);
            this.f171223a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76210a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            C75575k kVar = this.f171223a.f171214e.f169833g;
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            C89378p<FrameLayout, C85037b> a = C76412b.m133923a(kVar, context);
            return new C75481b(a.component1(), a.component2(), this.f171223a.f171212c, this.f171223a.f171213d, this.f171223a.f171236j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$e */
    static final class C76216e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171224a;

        static {
            Covode.recordClassIndex(89166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76216e(C76211b bVar) {
            super(1);
            this.f171224a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            boolean z;
            Effect effect = (Effect) this.f171224a.mo119955a(num.intValue());
            if (this.f171224a.f171216g == null || !this.f171224a.f171216g.isLockStickerEnable() || !this.f171224a.f171216g.reallyLockedSticker(effect)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$f */
    static final class C76217f extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171225a;

        static {
            Covode.recordClassIndex(89167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76217f(C76211b bVar) {
            super(1);
            this.f171225a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76210a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.a_2, viewGroup2, false);
            C89219l.m154716b(a, "");
            View$OnClickListenerC75483c cVar = new View$OnClickListenerC75483c(a, this.f171225a.f171216g, this.f171225a.f171212c, this.f171225a.f171213d, this.f171225a.f171236j);
            cVar.f169615a = this.f171225a.f171215f;
            return cVar;
        }
    }

    /* renamed from: b */
    private final void m133649b(C76210a<Effect> aVar) {
        if (aVar instanceof View$OnClickListenerC75483c) {
            View$OnClickListenerC75483c cVar = (View$OnClickListenerC75483c) aVar;
            if (cVar.f169617c != this.f171236j) {
                cVar.mo119157a(this.f171236j);
            }
        }
        if (aVar instanceof AbstractView$OnClickListenerC75488e) {
            AbstractView$OnClickListenerC75488e eVar = (AbstractView$OnClickListenerC75488e) aVar;
            if (eVar.f169633d != this.f171236j) {
                eVar.mo119161a(this.f171236j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$b */
    public static final class C76213b extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171221a;

        static {
            Covode.recordClassIndex(89163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76213b(C76211b bVar) {
            super(1);
            this.f171221a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76210a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            C75575k kVar = this.f171221a.f171214e.f169833g;
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            C89378p<FrameLayout, C85037b> a = C76412b.m133923a(kVar, context);
            FrameLayout component1 = a.component1();
            C85037b component2 = a.component2();
            if (this.f171221a.f171214e.f169833g.f169875t) {
                C75480a aVar = new C75480a(component1, component2, this.f171221a.f171212c, this.f171221a.f171213d, this.f171221a.f171236j);
                aVar.f169630a = this.f171221a.f171215f;
                return aVar;
            }
            C75490g gVar = new C75490g(component1, component2, this.f171221a.f171212c, this.f171221a.f171213d, this.f171221a.f171236j);
            gVar.f169630a = this.f171221a.f171215f;
            return gVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public void mo119951a(AbstractC76235h<Effect, C76210a<Effect>> hVar) {
        C89219l.m154721d(hVar, "");
        super.mo119951a((AbstractC76235h) hVar);
        hVar.mo119957a(new C76214c(this), new C76215d(this));
        hVar.mo119957a(new C76216e(this), new C76217f(this));
        mo119953b(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC76122i iVar;
        C76210a aVar = (C76210a) viewHolder;
        C89219l.m154721d(aVar, "");
        super.onViewAttachedToWindow(aVar);
        Integer num = this.f171217l.f171022f;
        int i = this.f171219n;
        if (num != null && num.intValue() == i) {
            int adapterPosition = aVar.getAdapterPosition();
            if (adapterPosition < this.f171210a) {
                this.f171210a = adapterPosition;
            }
            if (adapterPosition > this.f171211b) {
                this.f171211b = adapterPosition;
            }
            if ((adapterPosition <= this.f171210a || adapterPosition >= this.f171211b) && (iVar = this.f171217l.f171017a) != null) {
                iVar.mo119862a(this.f171210a, this.f171211b, this.f171218m, new C76212a(this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119952a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        if (this.f171234h.isEmpty()) {
            C80558hx.m139642a(0, new C76218g(this, list));
        } else {
            C80558hx.m139643a(new C76219h(this, list));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C76210a) viewHolder, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119949a(C76210a<Effect> aVar, int i) {
        C89219l.m154721d(aVar, "");
        m133649b(aVar);
        super.onBindViewHolder(aVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((C76210a) viewHolder, i, list);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119950a(C76210a<Effect> aVar, int i, List<Object> list) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        m133649b(aVar);
        super.onBindViewHolder(aVar, i, list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76211b(AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar, C75572h hVar, AbstractC75474b bVar2, AbstractC76085a aVar, AbstractC76125l.C76126a aVar2, String str, int i) {
        super(bVar, hVar);
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar2, "");
        this.f171212c = oVar;
        this.f171213d = gVar;
        this.f171214e = hVar;
        this.f171215f = bVar2;
        this.f171216g = aVar;
        this.f171217l = aVar2;
        this.f171218m = str;
        this.f171219n = i;
    }
}
