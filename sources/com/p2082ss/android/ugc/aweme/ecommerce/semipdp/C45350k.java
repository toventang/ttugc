package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a.C44703c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44772b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44784m;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44786o;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescTextViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2856b.C45341a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh.SemiPdpHeaderVH;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh.SemiPdpInfoVH;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh.SemiPdpProfileVH;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k */
public final class C45350k extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final Fragment f105684d;

    static {
        Covode.recordClassIndex(53809);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$a */
    static final class C45351a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45350k f105685a;

        static {
            Covode.recordClassIndex(53810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45351a(C45350k kVar) {
            super(1);
            this.f105685a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f105685a.mo33762a(num.intValue()) instanceof C44772b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$b */
    static final class C45352b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C45352b f105686a = new C45352b();

        static {
            Covode.recordClassIndex(53811);
        }

        C45352b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C44766a.m87492a(viewGroup2.getContext(), R.layout.pn, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new SemiPdpHeaderVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$c */
    static final class C45353c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45350k f105687a;

        static {
            Covode.recordClassIndex(53812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45353c(C45350k kVar) {
            super(1);
            this.f105687a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f105687a.mo33762a(num.intValue()) instanceof C45341a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$d */
    static final class C45354d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C45354d f105688a = new C45354d();

        static {
            Covode.recordClassIndex(53813);
        }

        C45354d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C44766a.m87492a(viewGroup2.getContext(), R.layout.qr, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new SemiPdpInfoVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$e */
    static final class C45355e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45350k f105689a;

        static {
            Covode.recordClassIndex(53814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45355e(C45350k kVar) {
            super(1);
            this.f105689a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f105689a.mo33762a(num.intValue()) instanceof C44786o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$f */
    static final class C45356f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C45356f f105690a = new C45356f();

        static {
            Covode.recordClassIndex(53815);
        }

        C45356f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C44766a.m87492a(viewGroup2.getContext(), R.layout.qs, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new SemiPdpProfileVH(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$g */
    static final class C45357g extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45350k f105691a;

        static {
            Covode.recordClassIndex(53816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45357g(C45350k kVar) {
            super(1);
            this.f105691a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f105691a.mo33762a(num.intValue()) instanceof C44784m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.k$h */
    static final class C45358h extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ C45350k f105692a;

        static {
            Covode.recordClassIndex(53817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45358h(C45350k kVar) {
            super(1);
            this.f105692a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ProductDescTextViewHolder(viewGroup2, new AbstractC89172b<Integer, Object>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.semipdp.C45350k.C45358h.C453591 */

                /* renamed from: a */
                final /* synthetic */ C45358h f105693a;

                static {
                    Covode.recordClassIndex(53818);
                }

                {
                    this.f105693a = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Object invoke(Integer num) {
                    return this.f105693a.f105692a.mo33762a(num.intValue());
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45350k(Fragment fragment) {
        super(fragment, new C44703c(), 4);
        C89219l.m154721d(fragment, "");
        this.f105684d = fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbsFullSpanVH) {
            ((AbsFullSpanVH) viewHolder).mo63351m();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C45351a(this), null, C45352b.f105686a);
        AbstractC20638g unused2 = gVar.mo33893a(new C45353c(this), null, C45354d.f105688a);
        AbstractC20638g unused3 = gVar.mo33893a(new C45355e(this), null, C45356f.f105690a);
        AbstractC20638g unused4 = gVar.mo33893a(new C45357g(this), null, new C45358h(this));
    }
}
