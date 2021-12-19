package com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.tux.tag.TuxTag;
import com.bytedance.tux.widget.FlowLayout;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.C44482a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f;
import com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewState;
import com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a.AbstractC45150a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewTags;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder */
public final class ReviewCellViewHolder extends JediSimpleViewHolder<AbstractC45150a> implements AbstractC33974au {

    /* renamed from: k */
    public static final int f105407k;

    /* renamed from: l */
    public static final C45213b f105408l = new C45213b((byte) 0);

    /* renamed from: f */
    public View f105409f;

    /* renamed from: g */
    public AbstractC45150a.C45151a f105410g;

    /* renamed from: j */
    public final AbstractC0952i f105411j;

    /* renamed from: m */
    private final AbstractC89244h f105412m;

    /* renamed from: m */
    public final ProductReviewViewModel mo63351m() {
        return (ProductReviewViewModel) this.f105412m.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$b */
    public static final class C45213b {
        static {
            Covode.recordClassIndex(53660);
        }

        private C45213b() {
        }

        public /* synthetic */ C45213b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        super.mo33829g();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: f */
    public final void mo33828f() {
        super.mo33828f();
        this.itemView.post(new RunnableC45229n(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$h */
    public static final class C45221h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105439a = 700;

        /* renamed from: b */
        final /* synthetic */ ReviewCellViewHolder f105440b;

        /* renamed from: c */
        final /* synthetic */ ReviewItemStruct f105441c;

        static {
            Covode.recordClassIndex(53668);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$h$a */
        static final class C45222a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C45221h f105442a;

            static {
                Covode.recordClassIndex(53669);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45222a(C45221h hVar) {
                super(0);
                this.f105442a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f105442a.f105440b.mo63351m().mo76214a(this.f105442a.f105441c);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f105440b.mo76327a((AbstractC89171a<C89391z>) new C45222a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45221h(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(700);
            this.f105440b = reviewCellViewHolder;
            this.f105441c = reviewItemStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$i */
    public static final class C45223i extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105443a = 700;

        /* renamed from: b */
        final /* synthetic */ ReviewCellViewHolder f105444b;

        /* renamed from: c */
        final /* synthetic */ ReviewItemStruct f105445c;

        static {
            Covode.recordClassIndex(53670);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$i$a */
        static final class C45224a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C45223i f105446a;

            static {
                Covode.recordClassIndex(53671);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45224a(C45223i iVar) {
                super(0);
                this.f105446a = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f105446a.f105444b.mo63351m().mo76214a(this.f105446a.f105445c);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f105444b.mo76327a((AbstractC89171a<C89391z>) new C45224a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45223i(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(700);
            this.f105444b = reviewCellViewHolder;
            this.f105445c = reviewItemStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$d */
    static final class RunnableC45215d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f105421a;

        /* renamed from: b */
        final /* synthetic */ ReviewCellViewHolder f105422b;

        /* renamed from: c */
        final /* synthetic */ ReviewItemStruct.AppendReview f105423c;

        /* renamed from: d */
        final /* synthetic */ AbstractC45150a.C45151a f105424d;

        /* renamed from: e */
        final /* synthetic */ String f105425e;

        static {
            Covode.recordClassIndex(53662);
        }

        RunnableC45215d(View view, ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct.AppendReview appendReview, AbstractC45150a.C45151a aVar, String str) {
            this.f105421a = view;
            this.f105422b = reviewCellViewHolder;
            this.f105423c = appendReview;
            this.f105424d = aVar;
            this.f105425e = str;
        }

        public final void run() {
            ReviewCellViewHolder reviewCellViewHolder = this.f105422b;
            FlowLayout flowLayout = (FlowLayout) this.f105421a.findViewById(R.id.djq);
            C89219l.m154716b(flowLayout, "");
            reviewCellViewHolder.mo76326a(flowLayout, this.f105423c.f105350b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$e */
    public static final class C45216e extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ FlowLayout f105426a;

        /* renamed from: b */
        final /* synthetic */ int f105427b;

        static {
            Covode.recordClassIndex(53663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45216e(FlowLayout flowLayout, int i) {
            super(0);
            this.f105426a = flowLayout;
            this.f105427b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            SmartImageView smartImageView = new SmartImageView(this.f105426a.getContext());
            int i = this.f105427b;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
            int i2 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginEnd(C45563h.f106110f);
            marginLayoutParams.rightMargin = C45563h.f106110f;
            marginLayoutParams.bottomMargin = C45563h.f106110f;
            smartImageView.setLayoutParams(marginLayoutParams);
            return smartImageView;
        }
    }

    static {
        Covode.recordClassIndex(53658);
        int i = C45563h.f106105a;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f105407k = i - C89241a.m154730a(TypedValue.applyDimension(1, 76.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$a */
    public static final class C45212a extends AbstractC89220m implements AbstractC89171a<ProductReviewViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f105413a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105414b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105415c;

        static {
            Covode.recordClassIndex(53659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45212a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105413a = jediViewHolder;
            this.f105414b = cVar;
            this.f105415c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder.C45212a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_review_viewholder_ReviewCellViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87817x69dee4d9(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$k */
    static final class C45226k extends AbstractC89220m implements AbstractC89171a<TuxTag> {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f105449a;

        static {
            Covode.recordClassIndex(53673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45226k(LinearLayout linearLayout) {
            super(0);
            this.f105449a = linearLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTag invoke() {
            Context context = this.f105449a.getContext();
            C89219l.m154716b(context, "");
            TuxTag tuxTag = new TuxTag(context, null, 0, 6);
            tuxTag.setTagSize(0);
            tuxTag.setBackgroundColor(C0643b.m2378c(tuxTag.getContext(), R.color.g));
            tuxTag.setTextColor(C0643b.m2378c(tuxTag.getContext(), R.color.c5));
            tuxTag.setTuxFont(92);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd(C45563h.f106110f / 2);
            layoutParams.rightMargin = C45563h.f106110f / 2;
            layoutParams.gravity = 16;
            tuxTag.setLayoutParams(layoutParams);
            return tuxTag;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$n */
    static final class RunnableC45229n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReviewCellViewHolder f105452a;

        static {
            Covode.recordClassIndex(53676);
        }

        RunnableC45229n(ReviewCellViewHolder reviewCellViewHolder) {
            this.f105452a = reviewCellViewHolder;
        }

        public final void run() {
            List<Image> list;
            boolean z;
            boolean z2;
            View view = this.f105452a.itemView;
            C89219l.m154716b(view, "");
            if (view.getY() < ((float) C45563h.f106106b)) {
                AbstractC45150a aVar = (AbstractC45150a) this.f105452a.aQ_();
                if (!(aVar instanceof AbstractC45150a.C45151a)) {
                    aVar = null;
                }
                AbstractC45150a.C45151a aVar2 = (AbstractC45150a.C45151a) aVar;
                if (aVar2 != null) {
                    C45157f fVar = this.f105452a.mo63351m().f105179b;
                    if (fVar != null) {
                        ReviewItemStruct reviewItemStruct = aVar2.f105247a;
                        C89219l.m154721d(reviewItemStruct, "");
                        C45157f.C45166i iVar = new C45157f.C45166i(fVar, reviewItemStruct);
                        List<Image> list2 = reviewItemStruct.f105340a.f105356d;
                        if (list2 != null) {
                            int i = 0;
                            for (T t : list2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    C89070n.m154520a();
                                }
                                ReviewItemStruct.MainReview mainReview = reviewItemStruct.f105340a;
                                String valueOf = String.valueOf(t.getUri());
                                String valueOf2 = String.valueOf(i);
                                Boolean bool = reviewItemStruct.f105345f;
                                if (bool != null) {
                                    z2 = bool.booleanValue();
                                } else {
                                    z2 = false;
                                }
                                iVar.mo76232a(mainReview, valueOf, valueOf2, z2);
                                i = i2;
                            }
                        }
                        ReviewItemStruct.AppendReview appendReview = reviewItemStruct.f105340a.f105358f;
                        if (!(appendReview == null || (list = appendReview.f105350b) == null)) {
                            int i3 = 0;
                            for (T t2 : list) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    C89070n.m154520a();
                                }
                                ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.f105340a;
                                String valueOf3 = String.valueOf(t2.getUri());
                                String valueOf4 = String.valueOf(i3);
                                Boolean bool2 = reviewItemStruct.f105345f;
                                if (bool2 != null) {
                                    z = bool2.booleanValue();
                                } else {
                                    z = false;
                                }
                                iVar.mo76232a(mainReview2, valueOf3, valueOf4, z);
                                i3 = i4;
                            }
                        }
                    }
                    C45157f fVar2 = this.f105452a.mo63351m().f105179b;
                    if (fVar2 != null) {
                        ReviewItemStruct reviewItemStruct2 = aVar2.f105247a;
                        int i5 = this.f105452a.f48794i;
                        C89219l.m154721d(reviewItemStruct2, "");
                        if (!fVar2.f105264f.contains(reviewItemStruct2.f105340a.f105353a)) {
                            fVar2.f105264f.add(reviewItemStruct2.f105340a.f105353a);
                            C45544c.m88080a(fVar2.f105268j, "tiktokec_review_show", new C45157f.C45171m(fVar2, i5, reviewItemStruct2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$g */
    public static final class C45219g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105435a = 700;

        /* renamed from: b */
        final /* synthetic */ ReviewCellViewHolder f105436b;

        /* renamed from: c */
        final /* synthetic */ ReviewItemStruct f105437c;

        static {
            Covode.recordClassIndex(53666);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                ReviewCellViewHolder reviewCellViewHolder = this.f105436b;
                reviewCellViewHolder.withState(reviewCellViewHolder.mo63351m(), new C45220a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$g$a */
        static final class C45220a extends AbstractC89220m implements AbstractC89172b<ProductReviewState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C45219g f105438a;

            static {
                Covode.recordClassIndex(53667);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45220a(C45219g gVar) {
                super(1);
                this.f105438a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(ProductReviewState productReviewState) {
                ProductReviewState productReviewState2 = productReviewState;
                C89219l.m154721d(productReviewState2, "");
                ProductReviewViewModel m = this.f105438a.f105436b.mo63351m();
                View view = this.f105438a.f105436b.itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                AbstractC0952i iVar = this.f105438a.f105436b.f105411j;
                ReviewItemStruct reviewItemStruct = this.f105438a.f105437c;
                String productId = productReviewState2.getProductId();
                C89219l.m154721d(context, "");
                C89219l.m154721d(reviewItemStruct, "");
                C89219l.m154721d(productId, "");
                String str = reviewItemStruct.f105340a.f105353a;
                C45157f fVar = m.f105179b;
                if (fVar != null) {
                    C89219l.m154721d(reviewItemStruct, "");
                    C45544c.m88080a(fVar.f105268j, "tiktokec_report_entrance_show", new C45157f.C45170l(fVar, reviewItemStruct));
                }
                new C23208a.C23211b().mo37792a(R.string.a8y).mo37793a(new ProductReviewViewModel.DialogInterface$OnCancelListenerC45118i(m, reviewItemStruct)).mo37799b(C89070n.m154516a(new C23208a.C23214e().mo37785a(R.string.bhe).mo37787a(new ProductReviewViewModel.C45119j(m, iVar, context, reviewItemStruct, str)))).mo37800b().show(iVar, "review_more");
                return C89391z.f203057a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45219g(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(700);
            this.f105436b = reviewCellViewHolder;
            this.f105437c = reviewItemStruct;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$o */
    public static final class C45230o extends AbstractC89220m implements AbstractC89172b<CharSequence, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ String f105453a;

        static {
            Covode.recordClassIndex(53677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45230o(String str) {
            super(1);
            this.f105453a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            C89219l.m154721d(charSequence2, "");
            return C45573n.m88118a(charSequence2, this.f105453a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$p */
    public static final class C45231p extends AbstractC89220m implements AbstractC89172b<CharSequence, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ String f105454a;

        static {
            Covode.recordClassIndex(53678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45231p(String str) {
            super(1);
            this.f105454a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            C89219l.m154721d(charSequence2, "");
            return C45573n.m88118a(charSequence2, this.f105454a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$c */
    static final class C45214c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f105416a;

        /* renamed from: b */
        final /* synthetic */ ReviewCellViewHolder f105417b;

        /* renamed from: c */
        final /* synthetic */ ReviewItemStruct.AppendReview f105418c;

        /* renamed from: d */
        final /* synthetic */ AbstractC45150a.C45151a f105419d;

        /* renamed from: e */
        final /* synthetic */ String f105420e;

        static {
            Covode.recordClassIndex(53661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45214c(View view, ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct.AppendReview appendReview, AbstractC45150a.C45151a aVar, String str) {
            super(1);
            this.f105416a = view;
            this.f105417b = reviewCellViewHolder;
            this.f105418c = appendReview;
            this.f105419d = aVar;
            this.f105420e = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f105417b.mo63351m().mo76215a(this.f105420e, 1);
                ViewMoreText.m87804a((ViewMoreText) this.f105416a.findViewById(R.id.djk), this.f105418c.f105349a, 0, false, null, 14);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$j */
    public static final class C45225j extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ReviewCellViewHolder f105447a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105448b;

        static {
            Covode.recordClassIndex(53672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45225j(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.f105447a = reviewCellViewHolder;
            this.f105448b = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f105447a.mo63351m().mo76215a(this.f105448b.f105340a.f105353a, 0);
                View view = this.f105447a.itemView;
                C89219l.m154716b(view, "");
                ViewMoreText.m87804a((ViewMoreText) view.findViewById(R.id.djk), this.f105448b.f105340a.f105355c, 0, false, null, 14);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$q */
    public static final class C45232q extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ReviewCellViewHolder f105455a;

        /* renamed from: b */
        final /* synthetic */ boolean f105456b;

        /* renamed from: c */
        final /* synthetic */ String f105457c;

        /* renamed from: d */
        final /* synthetic */ ViewMoreText f105458d;

        /* renamed from: e */
        final /* synthetic */ String f105459e;

        /* renamed from: f */
        final /* synthetic */ String f105460f;

        static {
            Covode.recordClassIndex(53679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45232q(ReviewCellViewHolder reviewCellViewHolder, boolean z, String str, ViewMoreText viewMoreText, String str2, String str3) {
            super(1);
            this.f105455a = reviewCellViewHolder;
            this.f105456b = z;
            this.f105457c = str;
            this.f105458d = viewMoreText;
            this.f105459e = str2;
            this.f105460f = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                if (this.f105456b) {
                    this.f105455a.mo63351m().mo76215a(this.f105457c, 3);
                } else {
                    this.f105455a.mo63351m().mo76215a(this.f105457c, 2);
                }
                ViewMoreText.m87804a(this.f105458d, this.f105459e, 0, false, new AbstractC89172b<CharSequence, CharSequence>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder.C45232q.C452331 */

                    /* renamed from: a */
                    final /* synthetic */ C45232q f105461a;

                    static {
                        Covode.recordClassIndex(53680);
                    }

                    {
                        this.f105461a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ CharSequence invoke(CharSequence charSequence) {
                        CharSequence charSequence2 = charSequence;
                        C89219l.m154721d(charSequence2, "");
                        return C45573n.m88118a(charSequence2, this.f105461a.f105460f);
                    }
                }, 6);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo76327a(AbstractC89171a<C89391z> aVar) {
        IAccountService a = AccountService.m65215a();
        IAccountUserService e = a.mo57069e();
        C89219l.m154716b(e, "");
        if (!e.isLogin()) {
            AbstractC34892bo g = a.mo57071g();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = C20624b.m38846b(this);
            dVar.f74964e = new C45228m(aVar);
            g.showLoginAndRegisterView(dVar.mo57084a());
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$f */
    public static final class C45217f extends AbstractC89220m implements AbstractC89187q<SmartImageView, Image, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ReviewCellViewHolder f105428a;

        /* renamed from: b */
        final /* synthetic */ List f105429b;

        /* renamed from: c */
        final /* synthetic */ List f105430c;

        static {
            Covode.recordClassIndex(53664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45217f(ReviewCellViewHolder reviewCellViewHolder, List list, List list2) {
            super(3);
            this.f105428a = reviewCellViewHolder;
            this.f105429b = list;
            this.f105430c = list2;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$f$a */
        public static final class C45218a extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f105431a = 700;

            /* renamed from: b */
            final /* synthetic */ C45217f f105432b;

            /* renamed from: c */
            final /* synthetic */ int f105433c;

            /* renamed from: d */
            final /* synthetic */ Image f105434d;

            static {
                Covode.recordClassIndex(53665);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                String str;
                boolean z;
                String str2;
                ReviewItemStruct reviewItemStruct;
                ReviewItemStruct.User user;
                ReviewItemStruct reviewItemStruct2;
                ReviewItemStruct reviewItemStruct3;
                Boolean bool;
                ReviewItemStruct reviewItemStruct4;
                ReviewItemStruct.MainReview mainReview;
                if (view != null) {
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    C44482a.m87167a(context, this.f105433c, this.f105432b.f105429b.size(), this.f105432b.f105430c, null, null, null, null, null, null, 16368);
                    C45157f fVar = this.f105432b.f105428a.mo63351m().f105179b;
                    if (fVar != null) {
                        AbstractC45150a.C45151a aVar = this.f105432b.f105428a.f105410g;
                        if (aVar == null || (reviewItemStruct4 = aVar.f105247a) == null || (mainReview = reviewItemStruct4.f105340a) == null || (str = mainReview.f105353a) == null) {
                            str = "";
                        }
                        String valueOf = String.valueOf(this.f105434d.getUri());
                        String valueOf2 = String.valueOf(this.f105433c);
                        Object aQ_ = this.f105432b.f105428a.aQ_();
                        String str3 = null;
                        if (!(aQ_ instanceof AbstractC45150a.C45151a)) {
                            aQ_ = null;
                        }
                        AbstractC45150a.C45151a aVar2 = (AbstractC45150a.C45151a) aQ_;
                        if (aVar2 == null || (reviewItemStruct3 = aVar2.f105247a) == null || (bool = reviewItemStruct3.f105345f) == null) {
                            z = false;
                        } else {
                            z = bool.booleanValue();
                        }
                        AbstractC45150a.C45151a aVar3 = this.f105432b.f105428a.f105410g;
                        if (aVar3 == null || (reviewItemStruct2 = aVar3.f105247a) == null) {
                            str2 = null;
                        } else {
                            str2 = reviewItemStruct2.f105342c;
                        }
                        AbstractC45150a.C45151a aVar4 = this.f105432b.f105428a.f105410g;
                        if (!(aVar4 == null || (reviewItemStruct = aVar4.f105247a) == null || (user = reviewItemStruct.f105346g) == null)) {
                            str3 = user.f105361a;
                        }
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(valueOf, "");
                        C89219l.m154721d(valueOf2, "");
                        C45544c.m88080a(fVar.f105268j, "tiktokec_photo_click", new C45157f.C45165h(fVar, valueOf, valueOf2, str2, str3, str, z));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45218a(C45217f fVar, int i, Image image) {
                super(700);
                this.f105432b = fVar;
                this.f105433c = i;
                this.f105434d = image;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(SmartImageView smartImageView, Image image, Integer num) {
            SmartImageView smartImageView2 = smartImageView;
            Image image2 = image;
            int intValue = num.intValue();
            C89219l.m154721d(smartImageView2, "");
            C89219l.m154721d(image2, "");
            if ((intValue + 1) % 4 == 0) {
                C23163i.m43668b(smartImageView2, null, null, 0, null, false, 27);
            }
            C20766v a = C45562g.m88109a(image2.toThumbFirstImageUrlModel());
            a.f49125v = EnumC20767w.CENTER_CROP;
            a.f49126w = C45562g.f106103a;
            a.f49115l = R.color.j;
            a.f49092E = smartImageView2;
            a.mo34186c();
            smartImageView2.setOnClickListener(new C45218a(this, intValue, image2));
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(AbstractC45150a aVar) {
        MethodCollector.m26663i(8193);
        AbstractC45150a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC45150a.C45151a aVar3 = (AbstractC45150a.C45151a) aVar2;
        this.f105410g = aVar3;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, aVar3.f105252f);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        RatingStar ratingStar = (RatingStar) view2.findViewById(R.id.e6f);
        C89219l.m154716b(ratingStar, "");
        ratingStar.setVisibility(8);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        RatingStar ratingStar2 = (RatingStar) view3.findViewById(R.id.e6_);
        C89219l.m154716b(ratingStar2, "");
        ratingStar2.setVisibility(0);
        m87808a(aVar3);
        String str = aVar3.f105247a.f105340a.f105353a;
        ReviewItemStruct.AppendReview appendReview = aVar3.f105247a.f105340a.f105358f;
        if (appendReview == null) {
            View view4 = this.f105409f;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        } else {
            if (this.f105409f == null) {
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                this.f105409f = ((ViewStub) view5.findViewById(R.id.dji)).inflate();
            }
            View view6 = this.f105409f;
            if (view6 != null) {
                view6.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) view6.findViewById(R.id.djt);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = (TuxTextView) view6.findViewById(R.id.djt);
                C89219l.m154716b(tuxTextView2, "");
                Context context = view6.getContext();
                C89219l.m154716b(context, "");
                tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.b_, Integer.parseInt(appendReview.f105351c), Integer.valueOf(Integer.parseInt(appendReview.f105351c))));
                if (C80538hl.m139614a(appendReview.f105349a) || !(!appendReview.f105350b.isEmpty())) {
                    ViewMoreText viewMoreText = (ViewMoreText) view6.findViewById(R.id.djk);
                    C89219l.m154716b(viewMoreText, "");
                    viewMoreText.setVisibility(0);
                } else {
                    ViewMoreText viewMoreText2 = (ViewMoreText) view6.findViewById(R.id.djk);
                    C89219l.m154716b(viewMoreText2, "");
                    viewMoreText2.setVisibility(8);
                }
                if (aVar3.f105249c) {
                    ViewMoreText.m87804a((ViewMoreText) view6.findViewById(R.id.djk), appendReview.f105349a, 0, false, null, 14);
                } else {
                    ViewMoreText.m87804a((ViewMoreText) view6.findViewById(R.id.djk), appendReview.f105349a, 4, true, null, 8);
                    ((ViewMoreText) view6.findViewById(R.id.djk)).setExpandListener(new C45214c(view6, this, appendReview, aVar3, str));
                }
                ViewMoreText viewMoreText3 = (ViewMoreText) view6.findViewById(R.id.djr);
                C89219l.m154716b(viewMoreText3, "");
                m87809a(viewMoreText3, str, appendReview.f105352d, true, aVar3.f105251e);
                view6.post(new RunnableC45215d(view6, this, appendReview, aVar3, str));
            }
        }
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        LinearLayout linearLayout = (LinearLayout) view7.findViewById(R.id.faa);
        C89219l.m154716b(linearLayout, "");
        C45234a.m87822a(linearLayout, aVar3.f105247a.f105347h, new C45226k(linearLayout), C45227l.f105450a);
        MethodCollector.m26664o(8193);
    }

    /* renamed from: a */
    private final void m87808a(AbstractC45150a.C45151a aVar) {
        String str;
        long j;
        Image image;
        String str2;
        Integer num;
        ReviewItemStruct reviewItemStruct = aVar.f105247a;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fag);
        C89219l.m154716b(tuxTextView, "");
        ReviewItemStruct.User user = reviewItemStruct.f105346g;
        if (user == null || (str = user.f105362b) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.e1x);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(reviewItemStruct.f105341b);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        TuxTextView tuxTextView3 = (TuxTextView) view3.findViewById(R.id.djl);
        C89219l.m154716b(tuxTextView3, "");
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        Context context = view4.getContext();
        Long g = C89361p.m154865g(reviewItemStruct.f105340a.f105357e);
        if (g != null) {
            j = g.longValue();
        } else {
            j = 0;
        }
        tuxTextView3.setText(C80566ib.m139653c(context, j));
        if (!mo63351m().mo76216a()) {
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            TuxIconView tuxIconView = (TuxIconView) view5.findViewById(R.id.clv);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        } else {
            View view6 = this.itemView;
            C89219l.m154716b(view6, "");
            TuxIconView tuxIconView2 = (TuxIconView) view6.findViewById(R.id.clv);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
        }
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        TuxIconView tuxIconView3 = (TuxIconView) view7.findViewById(R.id.clv);
        C89219l.m154716b(tuxIconView3, "");
        tuxIconView3.setOnClickListener(new C45219g(this, reviewItemStruct));
        ReviewItemStruct.User user2 = reviewItemStruct.f105346g;
        if (user2 != null) {
            image = user2.f105363c;
        } else {
            image = null;
        }
        C20766v a = C45562g.m88108a(image);
        View view8 = this.itemView;
        C89219l.m154716b(view8, "");
        a.f49092E = (SmartImageView) view8.findViewById(R.id.nz);
        a.f49115l = R.drawable.ccg;
        a.mo34186c();
        if (C89219l.m154714a((Object) reviewItemStruct.f105344e, (Object) true)) {
            View view9 = this.itemView;
            C89219l.m154716b(view9, "");
            ((AppCompatImageView) view9.findViewById(R.id.c8l)).setImageResource(R.drawable.yy);
        } else {
            View view10 = this.itemView;
            C89219l.m154716b(view10, "");
            ((AppCompatImageView) view10.findViewById(R.id.c8l)).setImageResource(R.drawable.yx);
        }
        View view11 = this.itemView;
        C89219l.m154716b(view11, "");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view11.findViewById(R.id.c8l);
        C89219l.m154716b(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new C45221h(this, reviewItemStruct));
        View view12 = this.itemView;
        C89219l.m154716b(view12, "");
        TuxTextView tuxTextView4 = (TuxTextView) view12.findViewById(R.id.c8p);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setOnClickListener(new C45223i(this, reviewItemStruct));
        if (reviewItemStruct.f105343d == null || ((num = reviewItemStruct.f105343d) != null && num.intValue() == 0)) {
            View view13 = this.itemView;
            C89219l.m154716b(view13, "");
            TuxTextView tuxTextView5 = (TuxTextView) view13.findViewById(R.id.c8p);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText("");
        } else {
            View view14 = this.itemView;
            C89219l.m154716b(view14, "");
            TuxTextView tuxTextView6 = (TuxTextView) view14.findViewById(R.id.c8p);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setText(String.valueOf(reviewItemStruct.f105343d.intValue()));
        }
        if (!reviewItemStruct.f105340a.mo76271a()) {
            View view15 = this.itemView;
            C89219l.m154716b(view15, "");
            str2 = view15.getContext().getString(R.string.bh_);
        } else {
            str2 = reviewItemStruct.f105340a.f105355c;
        }
        if (C80538hl.m139614a(reviewItemStruct.f105340a.f105355c) || !reviewItemStruct.f105340a.mo76272b()) {
            View view16 = this.itemView;
            C89219l.m154716b(view16, "");
            ViewMoreText viewMoreText = (ViewMoreText) view16.findViewById(R.id.djk);
            C89219l.m154716b(viewMoreText, "");
            viewMoreText.setVisibility(0);
        } else {
            View view17 = this.itemView;
            C89219l.m154716b(view17, "");
            ViewMoreText viewMoreText2 = (ViewMoreText) view17.findViewById(R.id.djk);
            C89219l.m154716b(viewMoreText2, "");
            viewMoreText2.setVisibility(8);
        }
        if (aVar.f105248b) {
            View view18 = this.itemView;
            C89219l.m154716b(view18, "");
            ViewMoreText.m87804a((ViewMoreText) view18.findViewById(R.id.djk), str2, 0, false, null, 14);
        } else {
            View view19 = this.itemView;
            C89219l.m154716b(view19, "");
            ViewMoreText.m87804a((ViewMoreText) view19.findViewById(R.id.djk), str2, 4, true, null, 8);
            View view20 = this.itemView;
            C89219l.m154716b(view20, "");
            ((ViewMoreText) view20.findViewById(R.id.djk)).setExpandListener(new C45225j(this, reviewItemStruct));
        }
        View view21 = this.itemView;
        C89219l.m154716b(view21, "");
        FlowLayout flowLayout = (FlowLayout) view21.findViewById(R.id.djq);
        C89219l.m154716b(flowLayout, "");
        mo76326a(flowLayout, aVar.f105247a.f105340a.f105356d);
        View view22 = this.itemView;
        C89219l.m154716b(view22, "");
        ViewMoreText viewMoreText3 = (ViewMoreText) view22.findViewById(R.id.djr);
        C89219l.m154716b(viewMoreText3, "");
        m87809a(viewMoreText3, reviewItemStruct.f105340a.f105353a, reviewItemStruct.f105340a.f105359g, false, aVar.f105250d);
        View view23 = this.itemView;
        C89219l.m154716b(view23, "");
        ((RatingStar) view23.findViewById(R.id.e6f)).setRate(Float.parseFloat(reviewItemStruct.f105340a.f105354b));
        View view24 = this.itemView;
        C89219l.m154716b(view24, "");
        ((RatingStar) view24.findViewById(R.id.e6_)).setRate(Float.parseFloat(reviewItemStruct.f105340a.f105354b));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReviewCellViewHolder(androidx.fragment.app.AbstractC0952i r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559028(0x7f0d0274, float:1.8743388E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f105411j = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f105412m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder.<init>(androidx.fragment.app.i, android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public final void mo76326a(FlowLayout flowLayout, List<Image> list) {
        Object obj;
        List<String> thumbUrls;
        flowLayout.setGravity(-1);
        if (list == null || list.isEmpty()) {
            flowLayout.setVisibility(8);
            return;
        }
        flowLayout.setVisibility(0);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            List<String> urls = t.getUrls();
            if ((urls == null || (obj = C89070n.m154583g((List) urls)) == null) && ((thumbUrls = t.getThumbUrls()) == null || (obj = C89070n.m154583g((List) thumbUrls)) == null)) {
                obj = "";
            }
            arrayList.add(obj);
        }
        C45234a.m87822a(flowLayout, list, new C45216e(flowLayout, (f105407k - (C45563h.f106110f * 3)) / 4), new C45217f(this, list, arrayList));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$m */
    public static final class C45228m implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f105451a;

        static {
            Covode.recordClassIndex(53675);
        }

        C45228m(AbstractC89171a aVar) {
            this.f105451a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                this.f105451a.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$l */
    static final class C45227l extends AbstractC89220m implements AbstractC89187q<TuxTag, ReviewTags, Integer, C89391z> {

        /* renamed from: a */
        public static final C45227l f105450a = new C45227l();

        static {
            Covode.recordClassIndex(53674);
        }

        C45227l() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(TuxTag tuxTag, ReviewTags reviewTags, Integer num) {
            TuxTag tuxTag2 = tuxTag;
            ReviewTags reviewTags2 = reviewTags;
            num.intValue();
            C89219l.m154721d(tuxTag2, "");
            C89219l.m154721d(reviewTags2, "");
            tuxTag2.setText(reviewTags2.f105365a);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.util.List] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33818a(AbstractC45150a aVar, int i, List list) {
        AbstractC45150a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC45150a.C45151a aVar3 = (AbstractC45150a.C45151a) aVar2;
        this.f105410g = aVar3;
        if (list == null || list.isEmpty()) {
            super.mo33818a(aVar2, i, list);
        } else {
            m87808a(aVar3);
        }
    }

    /* renamed from: a */
    private final void m87809a(ViewMoreText viewMoreText, String str, String str2, boolean z, boolean z2) {
        if (str2 == null || C89361p.m154870a((CharSequence) str2)) {
            viewMoreText.setVisibility(8);
            return;
        }
        viewMoreText.setVisibility(0);
        viewMoreText.setContentTextColor(C0643b.m2378c(viewMoreText.getContext(), R.color.c5));
        Context context = viewMoreText.getContext();
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(R.string.bhf);
        C89219l.m154716b(string, "");
        String str3 = string + ' ' + str2;
        if (z2) {
            ViewMoreText.m87804a(viewMoreText, str3, 0, false, new C45230o(string), 6);
            return;
        }
        viewMoreText.mo76316a(str3, 2, true, new C45231p(string));
        viewMoreText.setExpandListener(new C45232q(this, z, str, viewMoreText, str3, string));
    }
}
