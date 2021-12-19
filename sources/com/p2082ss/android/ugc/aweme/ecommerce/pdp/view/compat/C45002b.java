package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b */
public class C45002b extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: h */
    public static final C45003a f104988h = new C45003a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f104989a = C89250i.m154773a((AbstractC89171a) new C45004b(this));

    /* renamed from: b */
    private final AbstractC89244h f104990b = C89250i.m154773a((AbstractC89171a) new C45006d(this));

    /* renamed from: c */
    private final AbstractC89244h f104991c = C89250i.m154773a((AbstractC89171a) new C45005c(this));

    /* renamed from: d */
    public BottomSheetBehavior<View> f104992d;

    /* renamed from: e */
    public boolean f104993e = true;

    /* renamed from: f */
    public int f104994f = 4;

    /* renamed from: g */
    public boolean f104995g = true;

    /* renamed from: i */
    private boolean f104996i;

    /* renamed from: j */
    private float f104997j;

    /* renamed from: k */
    private float f104998k;

    /* renamed from: l */
    private SparseArray f104999l;

    static {
        Covode.recordClassIndex(53426);
    }

    /* renamed from: a */
    public void mo75927a(int i, int i2, boolean z) {
    }

    /* renamed from: c */
    public void mo75933c() {
    }

    /* renamed from: e */
    public void mo75934e() {
    }

    /* renamed from: f */
    public boolean mo75935f() {
        return false;
    }

    /* renamed from: i */
    public View mo75938i() {
        if (this.f104999l == null) {
            this.f104999l = new SparseArray();
        }
        View view = (View) this.f104999l.get(R.id.emn);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.emn);
        this.f104999l.put(R.id.emn, findViewById);
        return findViewById;
    }

    /* renamed from: j */
    public void mo75939j() {
        SparseArray sparseArray = this.f104999l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: k */
    public final ViewGroup mo76148k() {
        return (ViewGroup) this.f104989a.getValue();
    }

    /* renamed from: l */
    public final ViewGroup mo76149l() {
        return (ViewGroup) this.f104990b.getValue();
    }

    /* renamed from: m */
    public final ViewGroup mo76150m() {
        return (ViewGroup) this.f104991c.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo75939j();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$a */
    public static final class C45003a {
        static {
            Covode.recordClassIndex(53427);
        }

        private C45003a() {
        }

        public /* synthetic */ C45003a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f104996i = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$b */
    static final class C45004b extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C45002b f105000a;

        static {
            Covode.recordClassIndex(53428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45004b(C45002b bVar) {
            super(0);
            this.f105000a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.f105000a.getView();
            if (view != null) {
                return view.findViewById(R.id.uf);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$c */
    static final class C45005c extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C45002b f105001a;

        static {
            Covode.recordClassIndex(53429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45005c(C45002b bVar) {
            super(0);
            this.f105001a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.f105001a.getView();
            if (view != null) {
                return view.findViewById(R.id.aec);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$d */
    static final class C45006d extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C45002b f105002a;

        static {
            Covode.recordClassIndex(53430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45006d(C45002b bVar) {
            super(0);
            this.f105002a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.f105002a.getView();
            if (view != null) {
                return view.findViewById(R.id.vc);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$h */
    public static final class RunnableC45012h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45002b f105007a;

        static {
            Covode.recordClassIndex(53436);
        }

        RunnableC45012h(C45002b bVar) {
            this.f105007a = bVar;
        }

        public final void run() {
            Window window;
            Dialog dialog = this.f105007a.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(R.style.vl);
            }
        }
    }

    /* renamed from: b */
    public void mo75931b() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f104992d;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo43976b((int) C45563h.m88110a());
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.f104992d;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f62895i = false;
        }
        mo75937h();
    }

    /* renamed from: g */
    public void mo75936g() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        int i = this.f104994f;
        if (i != 3 && i != 2 && (bottomSheetBehavior = this.f104992d) != null) {
            bottomSheetBehavior.mo43978c(3);
        }
    }

    /* renamed from: h */
    public void mo75937h() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        int i = this.f104994f;
        if (i != 4 && i != 2 && (bottomSheetBehavior = this.f104992d) != null) {
            bottomSheetBehavior.mo43978c(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        int i;
        super.onResume();
        try {
            Dialog dialog = getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                if (this.f104996i) {
                    i = R.style.vp;
                } else {
                    i = R.style.vl;
                }
                window.setWindowAnimations(i);
            }
            View view = getView();
            if (view != null) {
                view.postDelayed(new RunnableC45012h(this), 100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$e */
    public static final class View$OnClickListenerC45007e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45002b f105003a;

        static {
            Covode.recordClassIndex(53431);
        }

        View$OnClickListenerC45007e(C45002b bVar) {
            this.f105003a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105003a.mo75934e();
            this.f105003a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC45013c(getActivity(), (byte) 0);
    }

    /* renamed from: a */
    public void mo75930a(boolean z) {
        int i = this.f104994f;
        if (i != 5 && i != 2) {
            this.f104993e = z;
            if (z) {
                dismissAllowingStateLoss();
                return;
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.f104992d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo43978c(5);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f104992d = BottomSheetBehavior.m52754a(mo76149l());
        View i = mo75938i();
        if (i != null) {
            i.setOnClickListener(new View$OnClickListenerC45007e(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface$OnShowListenerC45008f(this));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface$OnKeyListenerC45011g(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$f */
    public static final class DialogInterface$OnShowListenerC45008f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C45002b f105004a;

        static {
            Covode.recordClassIndex(53432);
        }

        DialogInterface$OnShowListenerC45008f(C45002b bVar) {
            this.f105004a = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            Dialog dialog;
            View findViewById;
            Window window;
            Window window2;
            Dialog dialog2 = this.f105004a.getDialog();
            if (!(dialog2 == null || (window2 = dialog2.getWindow()) == null)) {
                C80420fc.m139414a(window2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewGroup l = this.f105004a.mo76149l();
                if (l != null) {
                    l.setOutlineProvider(new ViewOutlineProvider() {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b.DialogInterface$OnShowListenerC45008f.C450091 */

                        static {
                            Covode.recordClassIndex(53433);
                        }

                        public final void getOutline(View view, Outline outline) {
                            if (view != null && outline != null) {
                                outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + C45563h.f106108d), C45563h.f106108d);
                            }
                        }
                    });
                }
                ViewGroup l2 = this.f105004a.mo76149l();
                if (l2 != null) {
                    l2.setClipToOutline(true);
                }
            }
            Dialog dialog3 = this.f105004a.getDialog();
            if (!(dialog3 == null || (window = dialog3.getWindow()) == null || Build.VERSION.SDK_INT < 28)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            if (!(Build.VERSION.SDK_INT < 21 || (dialog = this.f105004a.getDialog()) == null || (findViewById = dialog.findViewById(16908335)) == null)) {
                findViewById.setVisibility(8);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.f105004a.f104992d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f62894h = true;
            }
            C45002b bVar = this.f105004a;
            bVar.getDialog();
            bVar.mo75931b();
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.f105004a.f104992d;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.f62901o = new BottomSheetBehavior.AbstractC26607a(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b.DialogInterface$OnShowListenerC45008f.C450102 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnShowListenerC45008f f105005a;

                    static {
                        Covode.recordClassIndex(53434);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f105005a = r1;
                    }

                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
                    /* renamed from: a */
                    public final void mo37774a(View view, float f) {
                        C89219l.m154721d(view, "");
                        this.f105005a.f105004a.mo75928a(view, f);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
                        if (r8 != 3) goto L_0x005e;
                     */
                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo37775a(android.view.View r7, int r8) {
                        /*
                        // Method dump skipped, instructions count: 120
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b.DialogInterface$OnShowListenerC45008f.C450102.mo37775a(android.view.View, int):void");
                    }
                };
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        if (!iVar.mo3566g() && !iVar.mo3567h()) {
            super.show(iVar, str);
        }
    }

    /* renamed from: a */
    public void mo75928a(View view, float f) {
        int i;
        C89219l.m154721d(view, "");
        if (!Float.isNaN(f)) {
            float f2 = 0.0f;
            if (f <= 0.0f) {
                f2 = f;
            }
            if (this.f104998k != f2) {
                this.f104998k = f2;
                ViewGroup k = mo76148k();
                if (k != null) {
                    BottomSheetBehavior<View> bottomSheetBehavior = this.f104992d;
                    if (bottomSheetBehavior == null) {
                        i = 0;
                    } else if (bottomSheetBehavior.f62889c) {
                        i = -1;
                    } else {
                        i = bottomSheetBehavior.f62888b;
                    }
                    k.setTranslationY(((float) (-i)) * this.f104998k);
                }
            }
            if (this.f104995g) {
                if (this.f104997j < 0.5f && f >= 0.5f) {
                    mo75936g();
                    ViewGroup l = mo76149l();
                    if (l != null) {
                        l.dispatchTouchEvent(MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0));
                    }
                }
                if (this.f104997j >= 0.5f && f < 0.5f) {
                    mo75937h();
                    ViewGroup l2 = mo76149l();
                    if (l2 != null) {
                        l2.dispatchTouchEvent(MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0));
                    }
                }
            }
            this.f104997j = f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$g */
    public static final class DialogInterface$OnKeyListenerC45011g implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C45002b f105006a;

        static {
            Covode.recordClassIndex(53435);
        }

        DialogInterface$OnKeyListenerC45011g(C45002b bVar) {
            this.f105006a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() == 1) {
                return this.f105006a.mo75935f();
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.o7, viewGroup, false);
        C89219l.m154716b(a, "");
        a.findViewById(R.id.vc);
        C89219l.m154721d(layoutInflater, "");
        a.findViewById(R.id.be2);
        C89219l.m154721d(layoutInflater, "");
        a.findViewById(R.id.uf);
        C89219l.m154721d(layoutInflater, "");
        return a;
    }
}
