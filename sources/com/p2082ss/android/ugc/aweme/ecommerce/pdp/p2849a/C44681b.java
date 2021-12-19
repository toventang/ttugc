package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44772b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44777f;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44778g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44784m;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44785n;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44786o;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44954h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpHeadViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpInfoViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewHeadViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpSelectViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.ShopProfileVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.SpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescImageViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescTextViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescVideoViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b */
public final class C44681b extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final Fragment f104261d;

    static {
        Covode.recordClassIndex(53067);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$d */
    static final class C44685d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44685d f104265a = new C44685d();

        static {
            Covode.recordClassIndex(53071);
        }

        C44685d() {
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$f */
    static final class C44687f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44687f f104267a = new C44687f();

        static {
            Covode.recordClassIndex(53073);
        }

        C44687f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ShopProfileVH(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$m */
    static final class C44695m extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44695m f104275a = new C44695m();

        static {
            Covode.recordClassIndex(53081);
        }

        C44695m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ProductDescImageViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$o */
    static final class C44697o extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44697o f104277a = new C44697o();

        static {
            Covode.recordClassIndex(53083);
        }

        C44697o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PdpInfoViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$q */
    static final class C44699q extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44699q f104279a = new C44699q();

        static {
            Covode.recordClassIndex(53085);
        }

        C44699q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PdpReviewHeadViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$s */
    static final class C44701s extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44701s f104281a = new C44701s();

        static {
            Covode.recordClassIndex(53087);
        }

        C44701s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PdpReviewViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$a */
    static final class C44682a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104262a;

        static {
            Covode.recordClassIndex(53068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44682a(C44681b bVar) {
            super(1);
            this.f104262a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104262a.mo33762a(num.intValue()) instanceof C44772b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$b */
    static final class C44683b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104263a;

        static {
            Covode.recordClassIndex(53069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44683b(C44681b bVar) {
            super(1);
            this.f104263a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PdpSelectViewHolder(viewGroup2, this.f104263a.f104261d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$c */
    static final class C44684c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104264a;

        static {
            Covode.recordClassIndex(53070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44684c(C44681b bVar) {
            super(1);
            this.f104264a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104264a.mo33762a(num.intValue()) instanceof C44954h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$e */
    static final class C44686e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104266a;

        static {
            Covode.recordClassIndex(53072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44686e(C44681b bVar) {
            super(1);
            this.f104266a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104266a.mo33762a(num.intValue()) instanceof C44786o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$g */
    static final class C44688g extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104268a;

        static {
            Covode.recordClassIndex(53074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44688g(C44681b bVar) {
            super(1);
            this.f104268a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104268a.mo33762a(num.intValue()) instanceof C44784m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$h */
    static final class C44689h extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104269a;

        static {
            Covode.recordClassIndex(53075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44689h(C44681b bVar) {
            super(1);
            this.f104269a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ProductDescTextViewHolder(viewGroup2, new AbstractC89172b<Integer, Object>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a.C44681b.C44689h.C446901 */

                /* renamed from: a */
                final /* synthetic */ C44689h f104270a;

                static {
                    Covode.recordClassIndex(53076);
                }

                {
                    this.f104270a = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Object invoke(Integer num) {
                    return this.f104270a.f104269a.mo33762a(num.intValue());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$i */
    static final class C44691i extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104271a;

        static {
            Covode.recordClassIndex(53077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44691i(C44681b bVar) {
            super(1);
            this.f104271a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104271a.mo33762a(num.intValue()) instanceof C44785n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$j */
    static final class C44692j extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104272a;

        static {
            Covode.recordClassIndex(53078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44692j(C44681b bVar) {
            super(1);
            this.f104272a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ProductDescVideoViewHolder(viewGroup2, this.f104272a.f104261d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$k */
    static final class C44693k extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104273a;

        static {
            Covode.recordClassIndex(53079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44693k(C44681b bVar) {
            super(1);
            this.f104273a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104273a.mo33762a(num.intValue()) instanceof C44777f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$l */
    static final class C44694l extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104274a;

        static {
            Covode.recordClassIndex(53080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44694l(C44681b bVar) {
            super(1);
            this.f104274a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PdpHeadViewHolder(viewGroup2, this.f104274a.f104261d.getFragmentManager());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$n */
    static final class C44696n extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104276a;

        static {
            Covode.recordClassIndex(53082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44696n(C44681b bVar) {
            super(1);
            this.f104276a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104276a.mo33762a(num.intValue()) instanceof C44778g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$p */
    static final class C44698p extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104278a;

        static {
            Covode.recordClassIndex(53084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44698p(C44681b bVar) {
            super(1);
            this.f104278a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104278a.mo33762a(num.intValue()) instanceof ProductDetailReview);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$r */
    static final class C44700r extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104280a;

        static {
            Covode.recordClassIndex(53086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44700r(C44681b bVar) {
            super(1);
            this.f104280a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104280a.mo33762a(num.intValue()) instanceof ReviewItemStruct);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$t */
    static final class C44702t extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44681b f104282a;

        static {
            Covode.recordClassIndex(53088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44702t(C44681b bVar) {
            super(1);
            this.f104282a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f104282a.mo33762a(num.intValue()) instanceof AbstractC44779h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44681b(Fragment fragment) {
        super(fragment, new C44703c(), 4);
        C89219l.m154721d(fragment, "");
        this.f104261d = fragment;
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
        AbstractC20638g unused = gVar.mo33893a(new C44682a(this), null, new C44694l(this));
        AbstractC20638g unused2 = gVar.mo33893a(new C44696n(this), null, C44697o.f104277a);
        AbstractC20638g unused3 = gVar.mo33893a(new C44698p(this), null, C44699q.f104279a);
        AbstractC20638g unused4 = gVar.mo33893a(new C44700r(this), null, C44701s.f104281a);
        AbstractC20638g unused5 = gVar.mo33893a(new C44702t(this), null, new C44683b(this));
        AbstractC20638g unused6 = gVar.mo33893a(new C44684c(this), null, C44685d.f104265a);
        AbstractC20638g unused7 = gVar.mo33893a(new C44686e(this), null, C44687f.f104267a);
        AbstractC20638g unused8 = gVar.mo33893a(new C44688g(this), null, new C44689h(this));
        AbstractC20638g unused9 = gVar.mo33893a(new C44691i(this), null, new C44692j(this));
        AbstractC20638g unused10 = gVar.mo33893a(new C44693k(this), null, C44695m.f104275a);
    }
}
