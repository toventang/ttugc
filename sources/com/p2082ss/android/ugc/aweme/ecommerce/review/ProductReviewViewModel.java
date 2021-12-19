package com.p2082ss.android.ugc.aweme.ecommerce.review;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f;
import com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a.AbstractC45150a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.C45183b;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel */
public final class ProductReviewViewModel extends ListViewModel<AbstractC45150a, C20465o, ProductReviewState> {

    /* renamed from: a */
    public AbstractC88412b f105178a;

    /* renamed from: b */
    public C45157f f105179b;

    /* renamed from: c */
    public final C45155d f105180c = new C45155d();

    /* renamed from: d */
    private C45183b f105181d;

    /* renamed from: e */
    private final AbstractC89172b<ProductReviewState, AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>>> f105182e = new C45109b(this);

    /* renamed from: f */
    private final AbstractC89172b<ProductReviewState, AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>>> f105183f = new C45108a(this);

    static {
        Covode.recordClassIndex(53541);
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: g */
    public final AbstractC89172b<ProductReviewState, AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>>> mo33727g() {
        return this.f105182e;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: h */
    public final AbstractC89172b<ProductReviewState, AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>>> mo33728h() {
        return this.f105183f;
    }

    /* renamed from: a */
    public final boolean mo76216a() {
        C45183b bVar = this.f105181d;
        if (bVar == null || !bVar.f105324c) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        AbstractC88412b unused = mo33683a(C45156e.f105257a, new C20370ah(), new C45117h(this));
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        C45183b bVar = this.f105181d;
        if (bVar != null) {
            bVar.f105325d = null;
        }
        super.onCleared();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProductReviewState(0, null, 0.0f, "", null, new ListState(new C20465o(false, 3, (byte) 0), null, null, null, null, 30, null));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$h */
    static final class C45117h extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProductReviewViewModel f105193a;

        static {
            Covode.recordClassIndex(53551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45117h(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.f105193a = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            this.f105193a.mo33757k();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$i */
    public static final class DialogInterface$OnCancelListenerC45118i implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ ProductReviewViewModel f105194a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105195b;

        static {
            Covode.recordClassIndex(53552);
        }

        public DialogInterface$OnCancelListenerC45118i(ProductReviewViewModel productReviewViewModel, ReviewItemStruct reviewItemStruct) {
            this.f105194a = productReviewViewModel;
            this.f105195b = reviewItemStruct;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C45157f fVar = this.f105194a.f105179b;
            if (fVar != null) {
                fVar.mo76231a(this.f105195b, "cancel");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$g */
    public static final class C45115g extends AbstractC89220m implements AbstractC89172b<AbstractC45150a.C45152b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProductReviewViewModel f105191a;

        static {
            Covode.recordClassIndex(53549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45115g(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.f105191a = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC45150a.C45152b bVar) {
            final AbstractC45150a.C45152b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f105191a.mo33689c(new AbstractC89172b<ProductReviewState, ProductReviewState>() {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.C45115g.C451161 */

                static {
                    Covode.recordClassIndex(53550);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ ProductReviewState invoke(ProductReviewState productReviewState) {
                    ProductReviewState productReviewState2 = productReviewState;
                    C89219l.m154721d(productReviewState2, "");
                    return ProductReviewState.copy$default(productReviewState2, 0, null, 0.0f, null, bVar2, null, 47, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$a */
    static final class C45108a extends AbstractC89220m implements AbstractC89172b<ProductReviewState, AbstractC88979t<C89378p<? extends List<? extends AbstractC45150a>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ ProductReviewViewModel f105184a;

        static {
            Covode.recordClassIndex(53542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45108a(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.f105184a = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends AbstractC45150a>, ? extends C20465o>> invoke(ProductReviewState productReviewState) {
            ProductReviewState productReviewState2 = productReviewState;
            C89219l.m154721d(productReviewState2, "");
            return this.f105184a.mo76213a(productReviewState2.getProductId()).mo76242a(new ReviewApi.C45179c(productReviewState2.getProductId(), productReviewState2.getSelectFilterId(), productReviewState2.getSubstate().getPayload().f48407b, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$c */
    static final class C45111c extends AbstractC89220m implements AbstractC89172b<AbstractC45150a, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f105187a;

        static {
            Covode.recordClassIndex(53545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45111c(String str) {
            super(1);
            this.f105187a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC45150a aVar) {
            ReviewItemStruct reviewItemStruct;
            ReviewItemStruct.MainReview mainReview;
            AbstractC45150a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            String str = null;
            if (!(aVar2 instanceof AbstractC45150a.C45151a)) {
                aVar2 = null;
            }
            AbstractC45150a.C45151a aVar3 = (AbstractC45150a.C45151a) aVar2;
            if (!(aVar3 == null || (reviewItemStruct = aVar3.f105247a) == null || (mainReview = reviewItemStruct.f105340a) == null)) {
                str = mainReview.f105353a;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) str, (Object) this.f105187a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$e */
    static final class C45113e extends AbstractC89220m implements AbstractC89172b<AbstractC45150a, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f105189a;

        static {
            Covode.recordClassIndex(53547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45113e(String str) {
            super(1);
            this.f105189a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC45150a aVar) {
            ReviewItemStruct reviewItemStruct;
            ReviewItemStruct.MainReview mainReview;
            AbstractC45150a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            String str = null;
            if (!(aVar2 instanceof AbstractC45150a.C45151a)) {
                aVar2 = null;
            }
            AbstractC45150a.C45151a aVar3 = (AbstractC45150a.C45151a) aVar2;
            if (!(aVar3 == null || (reviewItemStruct = aVar3.f105247a) == null || (mainReview = reviewItemStruct.f105340a) == null)) {
                str = mainReview.f105353a;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) str, (Object) this.f105189a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$k */
    static final class C45120k extends AbstractC89220m implements AbstractC89172b<ProductReviewState, ProductReviewState> {

        /* renamed from: a */
        final /* synthetic */ ReviewFilterStruct f105201a;

        static {
            Covode.recordClassIndex(53554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45120k(ReviewFilterStruct reviewFilterStruct) {
            super(1);
            this.f105201a = reviewFilterStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProductReviewState invoke(ProductReviewState productReviewState) {
            String str;
            ProductReviewState productReviewState2 = productReviewState;
            C89219l.m154721d(productReviewState2, "");
            ReviewFilterStruct reviewFilterStruct = this.f105201a;
            if (reviewFilterStruct != null) {
                str = reviewFilterStruct.f105336a;
            } else {
                str = null;
            }
            return ProductReviewState.copy$default(productReviewState2, 0, str, 0.0f, null, null, ListState.copy$default(productReviewState2.getSubstate(), null, null, C20379aq.f48273a, C20379aq.f48273a, null, 19, null), 29, null);
        }
    }

    /* renamed from: a */
    public final C45183b mo76213a(String str) {
        C89219l.m154721d(str, "");
        Map<String, C45183b> map = C45183b.f105321e;
        C45183b bVar = map.get(str);
        if (bVar == null) {
            bVar = new C45183b();
            map.put(str, bVar);
        }
        C45183b bVar2 = bVar;
        bVar2.f105325d = new C45115g(this);
        if (this.f105181d == null) {
            this.f105181d = bVar2;
        }
        return bVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$b */
    static final class C45109b extends AbstractC89220m implements AbstractC89172b<ProductReviewState, AbstractC88979t<C89378p<? extends List<? extends AbstractC45150a>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ ProductReviewViewModel f105185a;

        static {
            Covode.recordClassIndex(53543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45109b(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.f105185a = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends AbstractC45150a>, ? extends C20465o>> invoke(ProductReviewState productReviewState) {
            ProductReviewState productReviewState2 = productReviewState;
            C89219l.m154721d(productReviewState2, "");
            boolean z = false;
            this.f105185a.f105180c.f105256a = false;
            AbstractC88412b bVar = this.f105185a.f105178a;
            if (bVar != null) {
                bVar.dispose();
            }
            C45183b a = this.f105185a.mo76213a(productReviewState2.getProductId());
            String productId = productReviewState2.getProductId();
            String selectFilterId = productReviewState2.getSelectFilterId();
            if (productReviewState2.getFilterData() == null) {
                z = true;
            }
            AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>> c = a.mo76242a(new ReviewApi.C45179c(productId, selectFilterId, 1, z)).mo143285c(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.C45109b.C451101 */

                /* renamed from: a */
                final /* synthetic */ C45109b f105186a;

                static {
                    Covode.recordClassIndex(53544);
                }

                {
                    this.f105186a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f105186a.f105185a.f105178a = (AbstractC88412b) obj;
                }
            });
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$d */
    static final class C45112d extends AbstractC89220m implements AbstractC89172b<AbstractC45150a, AbstractC45150a> {

        /* renamed from: a */
        final /* synthetic */ boolean f105188a;

        static {
            Covode.recordClassIndex(53546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45112d(boolean z) {
            super(1);
            this.f105188a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC45150a invoke(AbstractC45150a aVar) {
            int i;
            AbstractC45150a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            AbstractC45150a.C45151a aVar3 = (AbstractC45150a.C45151a) aVar2;
            ReviewItemStruct reviewItemStruct = aVar3.f105247a;
            int i2 = 0;
            if (this.f105188a) {
                Integer num = aVar3.f105247a.f105343d;
                if (num != null) {
                    i2 = num.intValue();
                }
                i = i2 + 1;
            } else {
                Integer num2 = aVar3.f105247a.f105343d;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                i = i2 - 1;
            }
            return AbstractC45150a.C45151a.m87780a(aVar3, ReviewItemStruct.m87799a(reviewItemStruct.f105340a, reviewItemStruct.f105341b, reviewItemStruct.f105342c, Integer.valueOf(i), Boolean.valueOf(this.f105188a), reviewItemStruct.f105345f, reviewItemStruct.f105346g, reviewItemStruct.f105347h, reviewItemStruct.f105348i), false, false, false, false, false, 62);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$f */
    static final class C45114f extends AbstractC89220m implements AbstractC89172b<AbstractC45150a, AbstractC45150a> {

        /* renamed from: a */
        final /* synthetic */ int f105190a;

        static {
            Covode.recordClassIndex(53548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45114f(int i) {
            super(1);
            this.f105190a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC45150a invoke(AbstractC45150a aVar) {
            AbstractC45150a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            int i = this.f105190a;
            if (i == 0) {
                AbstractC45150a.C45151a aVar3 = (AbstractC45150a.C45151a) aVar2;
                return AbstractC45150a.C45151a.m87780a(aVar3, aVar3.f105247a, true, false, false, false, false, 60);
            } else if (i == 1) {
                AbstractC45150a.C45151a aVar4 = (AbstractC45150a.C45151a) aVar2;
                return AbstractC45150a.C45151a.m87780a(aVar4, aVar4.f105247a, false, true, false, false, false, 58);
            } else if (i == 2) {
                AbstractC45150a.C45151a aVar5 = (AbstractC45150a.C45151a) aVar2;
                return AbstractC45150a.C45151a.m87780a(aVar5, aVar5.f105247a, false, false, true, false, false, 54);
            } else if (i != 3) {
                return aVar2;
            } else {
                AbstractC45150a.C45151a aVar6 = (AbstractC45150a.C45151a) aVar2;
                return AbstractC45150a.C45151a.m87780a(aVar6, aVar6.f105247a, false, false, false, true, false, 46);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$j */
    public static final class C45119j extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProductReviewViewModel f105196a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0952i f105197b;

        /* renamed from: c */
        final /* synthetic */ Context f105198c;

        /* renamed from: d */
        final /* synthetic */ ReviewItemStruct f105199d;

        /* renamed from: e */
        final /* synthetic */ String f105200e;

        static {
            Covode.recordClassIndex(53553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45119j(ProductReviewViewModel productReviewViewModel, AbstractC0952i iVar, Context context, ReviewItemStruct reviewItemStruct, String str) {
            super(1);
            this.f105196a = productReviewViewModel;
            this.f105197b = iVar;
            this.f105198c = context;
            this.f105199d = reviewItemStruct;
            this.f105200e = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e4, code lost:
            if (r0 != null) goto L_0x0028;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(android.view.View r10) {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.C45119j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo76214a(ReviewItemStruct reviewItemStruct) {
        boolean z;
        String str;
        C89219l.m154721d(reviewItemStruct, "");
        String str2 = reviewItemStruct.f105340a.f105353a;
        Boolean bool = reviewItemStruct.f105344e;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = !z;
        C45157f fVar = this.f105179b;
        if (fVar != null) {
            C89219l.m154721d(reviewItemStruct, "");
            if (z2) {
                str = "tiktokec_like_review";
            } else {
                str = "tiktokec_unlike_review";
            }
            C45544c.m88080a(fVar.f105268j, str, new C45157f.C45161d(fVar, reviewItemStruct));
        }
        if (z2) {
            C45183b bVar = this.f105181d;
            if (bVar != null) {
                C89219l.m154721d(str2, "");
                bVar.mo76243a(str2, true);
                C89219l.m154721d(str2, "");
                ((ReviewApi) ReviewApi.C45173a.f105307a.mo28858a(ReviewApi.class)).dig(new ReviewApi.C45178b(str2)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(ReviewApi.C45173a.C45174a.f105309a, ReviewApi.C45173a.C45175b.f105310a);
            }
        } else {
            C45183b bVar2 = this.f105181d;
            if (bVar2 != null) {
                C89219l.m154721d(str2, "");
                bVar2.mo76243a(str2, false);
                C89219l.m154721d(str2, "");
                ((ReviewApi) ReviewApi.C45173a.f105307a.mo28858a(ReviewApi.class)).unDig(new ReviewApi.C45178b(str2)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(ReviewApi.C45173a.C45176c.f105311a, ReviewApi.C45173a.C45177d.f105312a);
            }
        }
        mo33754a(new C45111c(str2), new C45112d(z2));
    }

    /* renamed from: a */
    public final void mo76215a(String str, int i) {
        C89219l.m154721d(str, "");
        mo33754a(new C45113e(str), new C45114f(i));
    }
}
