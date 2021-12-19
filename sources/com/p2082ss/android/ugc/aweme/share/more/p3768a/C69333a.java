package com.p2082ss.android.ugc.aweme.share.more.p3768a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C26614b;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.share.more.p3769b.AbstractC69340b;
import com.p2082ss.android.ugc.aweme.share.more.p3770ui.ShareActionVerticalList;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareActionBar;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.more.a.a */
public final class C69333a extends C26614b implements AbstractC69675c {

    /* renamed from: b */
    public static final C69334a f154903b = new C69334a((byte) 0);

    /* renamed from: a */
    public final C69684e f154904a;

    /* renamed from: c */
    private SparseArray f154905c;

    static {
        Covode.recordClassIndex(81664);
    }

    /* renamed from: a */
    private View m122522a(int i) {
        if (this.f154905c == null) {
            this.f154905c = new SparseArray();
        }
        View view = (View) this.f154905c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f154905c.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$a */
    public static final class C69334a {
        static {
            Covode.recordClassIndex(81665);
        }

        private C69334a() {
        }

        public /* synthetic */ C69334a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$c */
    static final class C69337c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69333a f154910a;

        static {
            Covode.recordClassIndex(81668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69337c(C69333a aVar) {
            super(0);
            this.f154910a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f154910a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f154905c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (isVisible()) {
            dismissAllowingStateLoss();
        }
        super.onPause();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$b */
    static final class RunnableC69335b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f154906a;

        /* renamed from: b */
        final /* synthetic */ C69333a f154907b;

        static {
            Covode.recordClassIndex(81666);
        }

        RunnableC69335b(View view, C69333a aVar) {
            this.f154906a = view;
            this.f154907b = aVar;
        }

        public final void run() {
            ViewParent parent = this.f154906a.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) layoutParams).f2416a;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View!>");
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
            bottomSheetBehavior.mo43976b((int) (((float) C13628n.m24521b(this.f154906a.getContext())) * this.f154907b.f154904a.f155564p));
            bottomSheetBehavior.f62901o = new BottomSheetBehavior.AbstractC26607a(this) {
                /* class com.p2082ss.android.ugc.aweme.share.more.p3768a.C69333a.RunnableC69335b.C693361 */

                /* renamed from: a */
                final /* synthetic */ RunnableC69335b f154908a;

                /* renamed from: b */
                private int f154909b = -1;

                static {
                    Covode.recordClassIndex(81667);
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
                /* renamed from: a */
                public final void mo37774a(View view, float f) {
                    C89219l.m154721d(view, "");
                }

                {
                    this.f154908a = r2;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
                /* renamed from: a */
                public final void mo37775a(View view, int i) {
                    C89219l.m154721d(view, "");
                    if (i != 3) {
                        if (i == 5) {
                            this.f154908a.f154907b.dismiss();
                        }
                    } else if (this.f154909b == 2) {
                        C39162r.m79460a("slide_up_full_screen_show", AbstractC27349ab.m54639of("action_on", "more_board"));
                    }
                    this.f154909b = i;
                }
            };
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new RunnableC69335b(view, this));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (findViewById = dialog.findViewById(R.id.ajx)) != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$d */
    static final class View$OnClickListenerC69338d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69333a f154911a;

        static {
            Covode.recordClassIndex(81669);
        }

        View$OnClickListenerC69338d(C69333a aVar) {
            this.f154911a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f154911a.dismiss();
        }
    }

    public C69333a(C69684e eVar) {
        C89219l.m154721d(eVar, "");
        this.f154904a = eVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        super.onActivityCreated(bundle);
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        View view3 = view2;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.google.android.material.bottomsheet.C26614b, androidx.appcompat.app.C0242i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.c9);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        AbstractC69690f fVar;
        Context context = getContext();
        if (!(context == null || (fVar = this.f154904a.f155560l) == null)) {
            SharePackage sharePackage = this.f154904a.f155557i;
            C89219l.m154716b(context, "");
            fVar.mo60845a(sharePackage, context);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c
    /* renamed from: a */
    public final void mo109614a(AbstractC69693h hVar) {
        C89219l.m154721d(hVar, "");
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            if (!this.f154904a.f155557i.mo109574a(hVar, context)) {
                Context requireContext = requireContext();
                C89219l.m154716b(requireContext, "");
                hVar.mo61915a(requireContext, this.f154904a.f155557i);
            }
            AbstractC69690f fVar = this.f154904a.f155560l;
            if (fVar != null) {
                SharePackage sharePackage = this.f154904a.f155557i;
                Context requireContext2 = requireContext();
                C89219l.m154716b(requireContext2, "");
                fVar.mo60846a(hVar, sharePackage, requireContext2);
            }
            if (hVar.mo61923f()) {
                dismiss();
            } else if (hVar.mo61922e()) {
                dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC69340b bVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C80420fc.m139413a(activity);
        }
        TuxTextView tuxTextView = (TuxTextView) m122522a(R.id.cli);
        Context context = tuxTextView.getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setText(context.getResources().getText(R.string.d4h));
        tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), this.f154904a.f155554f));
        tuxTextView.setAlpha(this.f154904a.f155555g);
        tuxTextView.setVisibility(0);
        if (C56216k.m102134d()) {
            bVar = AbstractC69340b.C69342b.f154914a;
        } else {
            bVar = AbstractC69340b.C69341a.f154912a;
        }
        List<AbstractC69693h> a = bVar.mo109617a(this.f154904a.f155550b);
        if ((!a.isEmpty()) && a != null) {
            View a2 = m122522a(R.id.cls);
            C89219l.m154716b(a2, "");
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            layoutParams.height = (int) C13628n.m24520b(requireContext(), 8.0f);
            View a3 = m122522a(R.id.cls);
            C89219l.m154716b(a3, "");
            a3.setLayoutParams(layoutParams);
            ShareActionBar shareActionBar = (ShareActionBar) m122522a(R.id.cm4);
            C89219l.m154716b(shareActionBar, "");
            shareActionBar.setVisibility(0);
            ((ShareActionBar) m122522a(R.id.cm4)).mo109814a(a);
            ((ShareActionBar) m122522a(R.id.cm4)).mo109813a(this);
        }
        ((ShareActionVerticalList) m122522a(R.id.cm7)).mo109621a(bVar.mo109618b(this.f154904a.f155550b));
        C69684e eVar = this.f154904a;
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        ((ShareActionVerticalList) m122522a(R.id.cm7)).mo109620a(eVar, requireContext, new C69337c(this));
        ((TuxIconView) m122522a(R.id.clr)).setOnClickListener(new View$OnClickListenerC69338d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(7046);
        C89219l.m154721d(layoutInflater, "");
        View inflate = View.inflate(getContext(), R.layout.ayr, viewGroup);
        MethodCollector.m26664o(7046);
        return inflate;
    }
}
