package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43740a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43741b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43742c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43743d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43744e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43745f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AnnouncementVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.C43939d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44954h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.SpanVH;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h */
public final class C43759h extends AbstractC34489c<Object> {
    static {
        Covode.recordClassIndex(52024);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$f */
    static final class C43765f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43765f f102048a = new C43765f();

        static {
            Covode.recordClassIndex(52030);
        }

        C43765f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new SpanVH(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$h */
    static final class C43767h extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43767h f102050a = new C43767h();

        static {
            Covode.recordClassIndex(52032);
        }

        C43767h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new OrderSubmitSpanVH(viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43759h(Fragment fragment) {
        super(fragment, new C43776i(), 4);
        C89219l.m154721d(fragment, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$a */
    static final class C43760a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102043a;

        static {
            Covode.recordClassIndex(52025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43760a(C43759h hVar) {
            super(1);
            this.f102043a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102043a.mo33762a(num.intValue()) instanceof C43740a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$b */
    static final class C43761b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43761b f102044a = new C43761b();

        static {
            Covode.recordClassIndex(52026);
        }

        C43761b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.oz, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new AnnouncementVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$c */
    static final class C43762c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102045a;

        static {
            Covode.recordClassIndex(52027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43762c(C43759h hVar) {
            super(1);
            this.f102045a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102045a.mo33762a(num.intValue()) instanceof C43743d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$d */
    static final class C43763d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43763d f102046a = new C43763d();

        static {
            Covode.recordClassIndex(52028);
        }

        C43763d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.p1, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new PlatformCouponVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$e */
    static final class C43764e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102047a;

        static {
            Covode.recordClassIndex(52029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43764e(C43759h hVar) {
            super(1);
            this.f102047a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102047a.mo33762a(num.intValue()) instanceof C44954h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$g */
    static final class C43766g extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102049a;

        static {
            Covode.recordClassIndex(52031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43766g(C43759h hVar) {
            super(1);
            this.f102049a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102049a.mo33762a(num.intValue()) instanceof C43939d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$i */
    static final class C43768i extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43768i f102051a = new C43768i();

        static {
            Covode.recordClassIndex(52033);
        }

        C43768i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.rc, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new AddressVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$j */
    static final class C43769j extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102052a;

        static {
            Covode.recordClassIndex(52034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43769j(C43759h hVar) {
            super(1);
            this.f102052a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102052a.mo33762a(num.intValue()) instanceof C43745f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$k */
    static final class C43770k extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43770k f102053a = new C43770k();

        static {
            Covode.recordClassIndex(52035);
        }

        C43770k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.rj, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new ProductInfoVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$l */
    static final class C43771l extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102054a;

        static {
            Covode.recordClassIndex(52036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43771l(C43759h hVar) {
            super(1);
            this.f102054a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102054a.mo33762a(num.intValue()) instanceof C43742c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$m */
    static final class C43772m extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43772m f102055a = new C43772m();

        static {
            Covode.recordClassIndex(52037);
        }

        C43772m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.rh, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new PaymentInfoVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$n */
    static final class C43773n extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102056a;

        static {
            Covode.recordClassIndex(52038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43773n(C43759h hVar) {
            super(1);
            this.f102056a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102056a.mo33762a(num.intValue()) instanceof C43744e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$o */
    static final class C43774o extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43774o f102057a = new C43774o();

        static {
            Covode.recordClassIndex(52039);
        }

        C43774o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.p2, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new PolicyVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$p */
    static final class C43775p extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43759h f102058a;

        static {
            Covode.recordClassIndex(52040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43775p(C43759h hVar) {
            super(1);
            this.f102058a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f102058a.mo33762a(num.intValue()) instanceof C43741b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C43760a(this), null, C43768i.f102051a);
        AbstractC20638g unused2 = gVar.mo33893a(new C43769j(this), null, C43770k.f102053a);
        AbstractC20638g unused3 = gVar.mo33893a(new C43771l(this), null, C43772m.f102055a);
        AbstractC20638g unused4 = gVar.mo33893a(new C43773n(this), null, C43774o.f102057a);
        AbstractC20638g unused5 = gVar.mo33893a(new C43775p(this), null, C43761b.f102044a);
        AbstractC20638g unused6 = gVar.mo33893a(new C43762c(this), null, C43763d.f102046a);
        AbstractC20638g unused7 = gVar.mo33893a(new C43764e(this), null, C43765f.f102048a);
        AbstractC20638g unused8 = gVar.mo33893a(new C43766g(this), null, C43767h.f102050a);
    }
}
