package com.bytedance.tux.sheet.sheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.sheet.AbstractC23218b;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.C23203a;
import com.bytedance.tux.sheet.TuxSheetContainer;
import com.bytedance.tux.sheet.TuxSheetNavBarContainer;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.sheet.sheet.a */
public final class C23226a extends C23203a {

    /* renamed from: y */
    public static final C23228b f55036y = new C23228b((byte) 0);

    /* renamed from: A */
    private HashMap f55037A;

    /* renamed from: g */
    public View f55038g;

    /* renamed from: h */
    public Fragment f55039h;

    /* renamed from: i */
    public boolean f55040i = true;

    /* renamed from: j */
    public TuxNavBar.C23179a f55041j;

    /* renamed from: k */
    public int f55042k;

    /* renamed from: l */
    public int f55043l = -1;

    /* renamed from: m */
    public int f55044m = -1;

    /* renamed from: n */
    public int f55045n = -1;

    /* renamed from: o */
    public boolean f55046o = true;

    /* renamed from: p */
    public boolean f55047p;

    /* renamed from: q */
    public boolean f55048q = true;

    /* renamed from: r */
    public boolean f55049r = true;

    /* renamed from: s */
    public TuxSheetNavBarContainer f55050s;

    /* renamed from: t */
    RadiusLayout f55051t;

    /* renamed from: u */
    public TuxSheetContainer f55052u;

    /* renamed from: v */
    public Integer f55053v;

    /* renamed from: w */
    public BottomSheetBehavior<?> f55054w;

    /* renamed from: x */
    boolean f55055x = true;

    /* renamed from: z */
    private final C23230d f55056z = new C23230d(this);

    static {
        Covode.recordClassIndex(27167);
    }

    @Override // com.bytedance.tux.sheet.C23203a
    /* renamed from: a */
    public final void mo37780a() {
        HashMap hashMap = this.f55037A;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.tux.sheet.C23203a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37780a();
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$b */
    public static final class C23228b {
        static {
            Covode.recordClassIndex(27169);
        }

        private C23228b() {
        }

        public /* synthetic */ C23228b(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC23219c m43785a(DialogInterface dialogInterface) {
            C89219l.m154719c(dialogInterface, "");
            if (dialogInterface instanceof C23203a.DialogC23205b) {
                return ((C23203a.DialogC23205b) dialogInterface).f54978c;
            }
            return AbstractC23219c.C23222c.f55027a;
        }

        /* renamed from: b */
        public static void m43791b(Fragment fragment) {
            C89219l.m154719c(fragment, "");
            C23226a c = m43792c(fragment);
            if (c != null) {
                c.mo37810b();
            }
        }

        /* renamed from: c */
        public static C23226a m43792c(Fragment fragment) {
            C23226a aVar = (C23226a) fragment.getParentFragment();
            if (aVar == null || !aVar.isAdded()) {
                return null;
            }
            return aVar;
        }

        /* renamed from: a */
        public static /* synthetic */ void m43787a(View view) {
            AbstractC23219c.C23222c cVar = AbstractC23219c.C23222c.f55027a;
            C89219l.m154719c(view, "");
            C89219l.m154719c(cVar, "");
            DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) view.getTag(R.id.ah7);
            if (dVar != null) {
                m43790b(dVar.getDialog(), cVar);
                dVar.dismissAllowingStateLoss();
            }
        }

        /* renamed from: a */
        public static void m43786a(Dialog dialog, AbstractC23219c cVar) {
            if (dialog instanceof C23203a.DialogC23205b) {
                C23203a.DialogC23205b bVar = (C23203a.DialogC23205b) dialog;
                bVar.mo37781a(cVar);
                bVar.mo37783b(cVar);
            }
        }

        /* renamed from: b */
        private static void m43790b(Dialog dialog, AbstractC23219c cVar) {
            if (dialog instanceof C23203a.DialogC23205b) {
                ((C23203a.DialogC23205b) dialog).mo37783b(cVar);
            }
        }

        /* renamed from: a */
        public static void m43789a(Fragment fragment, AbstractC23219c cVar) {
            Dialog dialog;
            C89219l.m154719c(fragment, "");
            C89219l.m154719c(cVar, "");
            C23226a c = m43792c(fragment);
            if (c != null) {
                dialog = c.getDialog();
            } else {
                dialog = null;
            }
            m43790b(dialog, cVar);
            if (c != null) {
                c.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$a */
    public static final class C23227a {

        /* renamed from: a */
        public final C23226a f55057a = new C23226a();

        static {
            Covode.recordClassIndex(27168);
        }

        /* renamed from: a */
        public final C23227a mo37811a() {
            this.f55057a.f55048q = false;
            return this;
        }

        /* renamed from: b */
        public final C23227a mo37820b() {
            this.f55057a.f55049r = false;
            return this;
        }

        /* renamed from: c */
        public final C23227a mo37823c() {
            this.f55057a.f55047p = true;
            return this;
        }

        /* renamed from: b */
        public final C23227a mo37821b(int i) {
            this.f55057a.f55043l = i;
            return this;
        }

        /* renamed from: c */
        public final C23227a mo37824c(boolean z) {
            this.f55057a.f54972c = z;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37812a(int i) {
            boolean z;
            this.f55057a.f55042k = i;
            C23226a aVar = this.f55057a;
            if (i == 3 || i == 4) {
                z = true;
            } else {
                z = false;
            }
            aVar.f54973d = z;
            return this;
        }

        /* renamed from: b */
        public final C23227a mo37822b(boolean z) {
            this.f55057a.f55046o = z;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37814a(DialogInterface.OnCancelListener onCancelListener) {
            C89219l.m154719c(onCancelListener, "");
            this.f55057a.f54970a = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37815a(DialogInterface.OnDismissListener onDismissListener) {
            C89219l.m154719c(onDismissListener, "");
            this.f55057a.f54971b = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37816a(View view) {
            C89219l.m154719c(view, "");
            this.f55057a.f55038g = view;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37817a(Fragment fragment) {
            C89219l.m154719c(fragment, "");
            this.f55057a.f55039h = fragment;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37818a(TuxNavBar.C23179a aVar) {
            this.f55057a.f55041j = aVar;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37819a(boolean z) {
            this.f55057a.f55040i = z;
            return this;
        }

        /* renamed from: a */
        public final C23227a mo37813a(int i, int i2) {
            this.f55057a.f55044m = i;
            this.f55057a.f55045n = i2;
            return this;
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$f */
    static final class C23232f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23226a f55062a;

        static {
            Covode.recordClassIndex(27173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23232f(C23226a aVar) {
            super(0);
            this.f55062a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f55062a.mo37810b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$g */
    static final class C23233g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23226a f55063a;

        static {
            Covode.recordClassIndex(27174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23233g(C23226a aVar) {
            super(0);
            this.f55063a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f55063a.dismissAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo37810b() {
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154709a((Object) childFragmentManager, "");
        if (childFragmentManager.mo3564e() > 0) {
            getChildFragmentManager().mo3563d();
        } else if (this.f55048q) {
            C23228b.m43786a(getDialog(), AbstractC23219c.C23220a.f55026a);
            onCancel(getDialog());
            dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$d */
    public static final class C23230d extends BottomSheetBehavior.AbstractC26607a {

        /* renamed from: a */
        final /* synthetic */ C23226a f55060a;

        static {
            Covode.recordClassIndex(27171);
        }

        C23230d(C23226a aVar) {
            this.f55060a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37774a(View view, float f) {
            Dialog dialog;
            Window window;
            C89219l.m154719c(view, "");
            Object obj = this.f55060a.f55038g;
            if (obj == null) {
                obj = this.f55060a.f55039h;
            }
            if (obj instanceof AbstractC23218b) {
                ((AbstractC23218b) obj).mo37805a(this.f55060a, f);
            }
            if (this.f55060a.f55040i && f <= 0.0f && (dialog = this.f55060a.getDialog()) != null && (window = dialog.getWindow()) != null) {
                window.setDimAmount((f + 1.0f) * 0.5f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37775a(View view, int i) {
            boolean z;
            C89219l.m154719c(view, "");
            Object obj = this.f55060a.f55038g;
            if (obj == null) {
                obj = this.f55060a.f55039h;
            }
            if (obj instanceof AbstractC23218b) {
                ((AbstractC23218b) obj).mo37806a(this.f55060a, i);
            }
            if (this.f55060a.f55042k == 3) {
                C23226a aVar = this.f55060a;
                if (i != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!aVar.f55055x) {
                        RadiusLayout radiusLayout = aVar.f55051t;
                        if (radiusLayout != null) {
                            Resources system = Resources.getSystem();
                            C89219l.m154709a((Object) system, "");
                            float applyDimension = TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics());
                            Resources system2 = Resources.getSystem();
                            C89219l.m154709a((Object) system2, "");
                            radiusLayout.mo38108a(applyDimension, TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()), 0.0f, 0.0f);
                        }
                        Dialog dialog = aVar.getDialog();
                        if (dialog != null) {
                            ((C23203a.DialogC23205b) dialog).mo37782a(true);
                            aVar.f55055x = true;
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (aVar.f55055x) {
                    RadiusLayout radiusLayout2 = aVar.f55051t;
                    if (radiusLayout2 != null) {
                        radiusLayout2.setRadius(0.0f);
                    }
                    Dialog dialog2 = aVar.getDialog();
                    if (dialog2 != null) {
                        ((C23203a.DialogC23205b) dialog2).mo37782a(false);
                        aVar.f55055x = false;
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$e */
    public static final class C23231e extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ C23226a f55061a;

        static {
            Covode.recordClassIndex(27172);
        }

        C23231e(C23226a aVar) {
            this.f55061a = aVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentActivityCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            super.onFragmentActivityCreated(iVar, fragment, bundle);
            Context context = this.f55061a.getContext();
            if (!(fragment instanceof AbstractC23185a) || context == null) {
                TuxSheetNavBarContainer tuxSheetNavBarContainer = this.f55061a.f55050s;
                if (tuxSheetNavBarContainer != null) {
                    tuxSheetNavBarContainer.setNavActions(null);
                    return;
                }
                return;
            }
            TuxSheetNavBarContainer tuxSheetNavBarContainer2 = this.f55061a.f55050s;
            if (tuxSheetNavBarContainer2 != null) {
                tuxSheetNavBarContainer2.setNavActions(((AbstractC23185a) fragment).mo37737a());
            }
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$c */
    static final class DialogInterface$OnKeyListenerC23229c implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        public final AbstractC89171a<C89391z> f55058a;

        /* renamed from: b */
        private int f55059b;

        static {
            Covode.recordClassIndex(27170);
        }

        public DialogInterface$OnKeyListenerC23229c(AbstractC89171a<C89391z> aVar) {
            C89219l.m154719c(aVar, "");
            this.f55058a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            Integer valueOf;
            if (i != 4 || keyEvent == null || (valueOf = Integer.valueOf(keyEvent.getAction())) == null) {
                return false;
            }
            if (valueOf.intValue() == 1) {
                int i2 = this.f55059b - 1;
                this.f55059b = i2;
                if (i2 >= 0) {
                    this.f55058a.invoke();
                    return true;
                }
                this.f55059b = 0;
                return false;
            } else if (valueOf.intValue() != 0) {
                return false;
            } else {
                this.f55059b++;
                return false;
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getChildFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new C23231e(this), false);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.tux.sheet.C23203a, androidx.appcompat.app.C0242i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterface$OnKeyListenerC23229c(new C23232f(this)));
        Integer num = this.f55053v;
        if (num != null) {
            int intValue = num.intValue();
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setSoftInputMode(intValue);
            }
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo37809a(Fragment fragment) {
        C89219l.m154719c(fragment, "");
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154709a((Object) childFragmentManager, "");
        String concat = "sheet_content_fragment".concat(String.valueOf(childFragmentManager.mo3564e() + 1));
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        C89219l.m154709a((Object) a, "");
        Context context = getContext();
        if (context == null || !C23163i.m43663a(context)) {
            a.mo3452a(R.anim.dj, R.anim.dk, R.anim.di, R.anim.dl);
        } else {
            a.mo3452a(R.anim.di, R.anim.dl, R.anim.dj, R.anim.dk);
        }
        a.mo3470b(R.id.dzg, fragment, concat);
        a.mo3457a(concat);
        a.mo3473c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        MethodCollector.m26663i(9804);
        C89219l.m154719c(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.q, viewGroup, false);
        this.f55051t = (RadiusLayout) a.findViewById(R.id.ddw);
        TuxSheetContainer tuxSheetContainer = (TuxSheetContainer) a.findViewById(R.id.dzf);
        this.f55052u = tuxSheetContainer;
        tuxSheetContainer.setFixedHeightPx(this.f55043l);
        tuxSheetContainer.setDynamicPeekHeightPx(this.f55044m);
        tuxSheetContainer.setDynamicMaxHeightPx(this.f55045n);
        tuxSheetContainer.setVariant(this.f55042k);
        tuxSheetContainer.setHideable(this.f55049r);
        tuxSheetContainer.setDismissFunc(new C23233g(this));
        tuxSheetContainer.setBehavior(this.f55054w);
        tuxSheetContainer.setBottomSheetCallback(this.f55056z);
        ViewStub viewStub = (ViewStub) a.findViewById(R.id.dzh);
        C89219l.m154709a((Object) viewStub, "");
        if (this.f55046o) {
            i = R.layout.s;
        } else {
            i = R.layout.t;
        }
        viewStub.setLayoutResource(i);
        viewStub.inflate();
        if (this.f55047p) {
            ViewGroup viewGroup2 = (ViewGroup) a.findViewById(R.id.dzg);
            C89219l.m154709a((Object) viewGroup2, "");
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = -1;
            viewGroup2.setLayoutParams(layoutParams);
        }
        View view = this.f55038g;
        if (view != null) {
            view.setTag(R.id.ah7, this);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            ((ViewGroup) a.findViewById(R.id.dzg)).addView(view);
        }
        Fragment fragment = this.f55039h;
        if (fragment != null) {
            getChildFragmentManager().mo3552a().mo3470b(R.id.dzg, fragment, "sheet_content_fragment").mo3473c();
        }
        TuxSheetNavBarContainer tuxSheetNavBarContainer = (TuxSheetNavBarContainer) a.findViewById(R.id.dzq);
        this.f55050s = tuxSheetNavBarContainer;
        if (tuxSheetNavBarContainer != null) {
            tuxSheetNavBarContainer.setNavActions(this.f55041j);
        }
        if (this.f55040i) {
            Dialog dialog = getDialog();
            C89219l.m154709a((Object) dialog, "");
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(2);
            }
            Dialog dialog2 = getDialog();
            C89219l.m154709a((Object) dialog2, "");
            Window window2 = dialog2.getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.5f);
            }
        } else {
            Dialog dialog3 = getDialog();
            C89219l.m154709a((Object) dialog3, "");
            Window window3 = dialog3.getWindow();
            if (window3 != null) {
                window3.clearFlags(2);
            }
        }
        MethodCollector.m26664o(9804);
        return a;
    }
}
