package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0976n;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.EnumC44266l;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r */
public final class C44153r extends C44294a {

    /* renamed from: a */
    public C44108g f102938a;

    /* renamed from: b */
    public C44067c f102939b = new C44067c(null, null, null, null, null, false, null, null, null, null, 1023);

    /* renamed from: c */
    public AbstractC89172b<? super C44085n, C89391z> f102940c = C44154a.f102942a;

    /* renamed from: d */
    private SparseArray f102941d;

    static {
        Covode.recordClassIndex(52464);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f102941d == null) {
            this.f102941d = new SparseArray();
        }
        View view = (View) this.f102941d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102941d.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f102941d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r$d */
    static final class C44158d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44153r f102948a;

        /* renamed from: b */
        final /* synthetic */ View f102949b;

        static {
            Covode.recordClassIndex(52469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44158d(C44153r rVar, View view) {
            super(0);
            this.f102948a = rVar;
            this.f102949b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f102948a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r$e */
    static final class C44159e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44153r f102950a;

        /* renamed from: b */
        final /* synthetic */ View f102951b;

        static {
            Covode.recordClassIndex(52470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44159e(C44153r rVar, View view) {
            super(0);
            this.f102950a = rVar;
            this.f102951b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f102950a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final DialogC44106f getDialog() {
        Dialog dialog = super.getDialog();
        if (!(dialog instanceof DialogC44106f)) {
            dialog = null;
        }
        return (DialogC44106f) dialog;
    }

    public C44153r() {
        super((byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r$a */
    static final class C44154a extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        public static final C44154a f102942a = new C44154a();

        static {
            Covode.recordClassIndex(52465);
        }

        C44154a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C89219l.m154721d(nVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r$b */
    static final class C44155b extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44153r f102943a;

        /* renamed from: b */
        final /* synthetic */ View f102944b;

        static {
            Covode.recordClassIndex(52466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44155b(C44153r rVar, View view) {
            super(1);
            this.f102943a = rVar;
            this.f102944b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C89219l.m154721d(nVar, "");
            this.f102943a.f102940c.invoke(nVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo75000a(C44067c cVar) {
        C89219l.m154721d(cVar, "");
        this.f102939b = cVar;
    }

    /* renamed from: a */
    public final void mo75001a(AbstractC89172b<? super C44085n, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f102940c = bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i, com.google.android.material.bottomsheet.C26614b, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        DialogC44106f fVar = new DialogC44106f(context, getTheme());
        AbstractC45271m e = mo75221e();
        if (e != null) {
            fVar.mo75219a(e);
        }
        return fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r$c */
    static final class C44156c extends AbstractC89220m implements AbstractC89172b<EnumC44266l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44153r f102945a;

        /* renamed from: b */
        final /* synthetic */ View f102946b;

        static {
            Covode.recordClassIndex(52467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44156c(C44153r rVar, View view) {
            super(1);
            this.f102945a = rVar;
            this.f102946b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC44266l lVar) {
            DialogC44106f b;
            BottomSheetBehavior<View> b2;
            boolean z;
            EnumC44266l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            DialogC44106f b3 = this.f102945a.getDialog();
            if (b3 != null) {
                if (lVar2 == EnumC44266l.Close) {
                    z = true;
                } else {
                    z = false;
                }
                b3.f102863a = z;
            }
            int i = C44160s.f102952a[lVar2.ordinal()];
            if (i == 1) {
                this.f102946b.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44153r.C44156c.RunnableC441571 */

                    /* renamed from: a */
                    final /* synthetic */ C44156c f102947a;

                    static {
                        Covode.recordClassIndex(52468);
                    }

                    {
                        this.f102947a = r1;
                    }

                    public final void run() {
                        BottomSheetBehavior<View> b;
                        DialogC44106f b2 = this.f102947a.f102945a.getDialog();
                        if (b2 != null && (b = b2.mo9590b()) != null) {
                            b.mo43978c(5);
                        }
                    }
                });
            } else if (!(i != 2 || (b = this.f102945a.getDialog()) == null || (b2 = b.mo9590b()) == null)) {
                b2.mo43978c(3);
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C44108g gVar = new C44108g();
        gVar.mo74989a(new C44155b(this, view));
        C44067c cVar = this.f102939b;
        cVar.f102718f = true;
        gVar.mo74988a(cVar);
        C44156c cVar2 = new C44156c(this, view);
        C89219l.m154721d(cVar2, "");
        gVar.f102869d = cVar2;
        C44158d dVar = new C44158d(this, view);
        C89219l.m154721d(dVar, "");
        gVar.f102871j = dVar;
        C44159e eVar = new C44159e(this, view);
        C89219l.m154721d(eVar, "");
        gVar.f102872k = eVar;
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        FrameLayout frameLayout = (FrameLayout) mo74087a(R.id.b80);
        C89219l.m154716b(frameLayout, "");
        a.mo3453a(frameLayout.getId(), gVar).mo3473c();
        this.f102938a = gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.on, viewGroup, false);
    }
}
