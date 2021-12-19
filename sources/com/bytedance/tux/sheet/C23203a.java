package com.bytedance.tux.sheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0242i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.widget.C23414d;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.sheet.a */
public class C23203a extends C0242i {

    /* renamed from: f */
    public static final C23204a f54969f = new C23204a((byte) 0);

    /* renamed from: a */
    public DialogInterface.OnCancelListener f54970a;

    /* renamed from: b */
    public DialogInterface.OnDismissListener f54971b;

    /* renamed from: c */
    public boolean f54972c = true;

    /* renamed from: d */
    public boolean f54973d;

    /* renamed from: e */
    public Integer f54974e;

    /* renamed from: g */
    private HashMap f54975g;

    static {
        Covode.recordClassIndex(27143);
    }

    /* renamed from: a */
    public void mo37780a() {
        HashMap hashMap = this.f54975g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37780a();
    }

    /* renamed from: com.bytedance.tux.sheet.a$a */
    public static final class C23204a {
        static {
            Covode.recordClassIndex(27144);
        }

        private C23204a() {
        }

        public /* synthetic */ C23204a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a$b */
    public static final class DialogC23205b extends DialogC26609a {

        /* renamed from: a */
        public final int f54976a;

        /* renamed from: b */
        public AbstractC23219c f54977b = AbstractC23219c.C23222c.f55027a;

        /* renamed from: c */
        public AbstractC23219c f54978c = AbstractC23219c.C23222c.f55027a;

        /* renamed from: d */
        public boolean f54979d;

        /* renamed from: e */
        public Drawable f54980e;

        /* renamed from: f */
        public ViewGroup f54981f;

        static {
            Covode.recordClassIndex(27145);
        }

        /* renamed from: b */
        private final void m43739b() {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ajx);
            if (viewGroup != null) {
                C89219l.m154709a((Object) viewGroup, "");
                viewGroup.setBackground(this.f54980e);
                this.f54981f = viewGroup;
            }
        }

        /* renamed from: c */
        private final void m43740c() {
            MethodCollector.m26663i(9967);
            if (this.f54979d) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.acf);
                if (viewGroup == null) {
                    MethodCollector.m26664o(9967);
                    return;
                }
                C89219l.m154709a((Object) viewGroup, "");
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                C23414d dVar = new C23414d(context, (byte) 0);
                dVar.setLayoutParams(viewGroup.getLayoutParams());
                dVar.setFitsSystemWindows(true);
                dVar.setRemoveTopInsets(true);
                dVar.setId(viewGroup.getId());
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        viewGroup.removeView(childAt);
                        dVar.addView(childAt);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    viewGroup2.removeView(viewGroup);
                    viewGroup2.addView(dVar);
                }
            }
            MethodCollector.m26664o(9967);
        }

        /* renamed from: a */
        public final void mo37781a(AbstractC23219c cVar) {
            C89219l.m154719c(cVar, "");
            this.f54977b = cVar;
        }

        /* renamed from: b */
        public final void mo37783b(AbstractC23219c cVar) {
            C89219l.m154719c(cVar, "");
            this.f54978c = cVar;
        }

        @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h, android.app.Dialog
        public final void setContentView(int i) {
            super.setContentView(i);
            m43739b();
            m43740c();
        }

        /* renamed from: a */
        public final void mo37782a(boolean z) {
            if (z) {
                ViewGroup viewGroup = this.f54981f;
                if (viewGroup != null) {
                    viewGroup.setBackground(this.f54980e);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f54981f;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(this.f54976a);
            }
        }

        @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h, android.app.Dialog
        public final void setContentView(View view) {
            C89219l.m154719c(view, "");
            super.setContentView(view);
            m43739b();
            m43740c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DialogC23205b(Context context) {
            super(context, R.style.le);
            Window window;
            WindowManager.LayoutParams attributes;
            C89219l.m154719c(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.es, R.attr.et, R.attr.eu, R.attr.ev, R.attr.ew, R.attr.ex, R.attr.ey, R.attr.ez, R.attr.f0, R.attr.f1, R.attr.f2, R.attr.f3, R.attr.f4, R.attr.f5, R.attr.f6, R.attr.f7, R.attr.f8, R.attr.f9, R.attr.f_, R.attr.fa}, R.attr.c3, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            this.f54976a = obtainStyledAttributes.getColor(3, 1);
            obtainStyledAttributes.recycle();
            Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(256);
            }
            if (!(Build.VERSION.SDK_INT < 30 || (window = getWindow()) == null || (attributes = window.getAttributes()) == null)) {
                attributes.setFitInsetsSides(0);
            }
            this.f54980e = C23009f.m43397a(new AbstractC89172b<C23008e, C89391z>(this) {
                /* class com.bytedance.tux.sheet.C23203a.DialogC23205b.C232061 */

                /* renamed from: a */
                final /* synthetic */ DialogC23205b f54982a;

                static {
                    Covode.recordClassIndex(27146);
                }

                {
                    this.f54982a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23008e eVar) {
                    C23008e eVar2 = eVar;
                    C89219l.m154719c(eVar2, "");
                    eVar2.f54462a = Integer.valueOf(this.f54982a.f54976a);
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
                    return C89391z.f203057a;
                }
            }).mo37389a(context);
        }

        @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            C89219l.m154719c(view, "");
            super.setContentView(view, layoutParams);
            m43739b();
            m43740c();
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC23207c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C23203a f54983a;

        /* renamed from: b */
        final /* synthetic */ int f54984b;

        static {
            Covode.recordClassIndex(27147);
        }

        public final void onGlobalLayout() {
            ViewParent viewParent;
            Window window;
            View decorView;
            ViewTreeObserver viewTreeObserver;
            View view = this.f54983a.getView();
            do {
                if (view != null) {
                    viewParent = view.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent instanceof CoordinatorLayout) {
                    View view2 = (View) viewParent;
                    if (view2 != null) {
                        View view3 = this.f54983a.getView();
                        if (!(view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null)) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                        int[] iArr = new int[2];
                        view2.getLocationInWindow(iArr);
                        int measuredHeight = iArr[1] + view2.getMeasuredHeight();
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(0);
                        gradientDrawable2.setColor(this.f54984b);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                        layerDrawable.setLayerInset(1, 0, measuredHeight, 0, 0);
                        Dialog dialog = this.f54983a.getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            decorView.setBackground(layerDrawable);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (viewParent instanceof View) {
                    view = (View) viewParent;
                } else {
                    return;
                }
            } while (view != null);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC23207c(C23203a aVar, int i) {
            this.f54983a = aVar;
            this.f54984b = i;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onStart() {
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154709a((Object) activity, "");
            Dialog dialog = getDialog();
            if (dialog != null) {
                int i = ((DialogC23205b) dialog).f54976a;
                Dialog dialog2 = getDialog();
                C89219l.m154709a((Object) dialog2, "");
                C23073a.C23074a.m43509a(activity, dialog2).mo37493a().mo37504e(i).mo37495a(true).f54627a.mo33415d();
                View view = getView();
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC23207c(this, i));
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f54970a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f54971b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i
    public Dialog onCreateDialog(Bundle bundle) {
        Context context;
        if (this.f54974e != null) {
            Context context2 = getContext();
            if (context2 == null) {
                C89219l.m154707a();
            }
            Integer num = this.f54974e;
            if (num == null) {
                C89219l.m154707a();
            }
            context = new ContextThemeWrapper(context2, num.intValue());
        } else {
            context = getContext();
            if (context == null) {
                C89219l.m154707a();
            }
            C89219l.m154709a((Object) context, "");
        }
        DialogC23205b bVar = new DialogC23205b(context);
        bVar.setCanceledOnTouchOutside(this.f54972c);
        bVar.f54979d = this.f54973d;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void show(AbstractC0952i iVar, String str) {
        AbstractC0976n nVar;
        try {
            Field declaredField = DialogInterface$OnCancelListenerC0944d.class.getDeclaredField("mDismissed");
            C89219l.m154709a((Object) declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(this, false);
            Field declaredField2 = DialogInterface$OnCancelListenerC0944d.class.getDeclaredField("mShownByMe");
            C89219l.m154709a((Object) declaredField2, "");
            declaredField2.setAccessible(true);
            declaredField2.set(this, true);
        } catch (Exception unused) {
        }
        if (iVar != null) {
            nVar = iVar.mo3552a();
        } else {
            nVar = null;
        }
        if (isAdded()) {
            if (nVar != null) {
                nVar.mo3474c(this);
            } else {
                return;
            }
        } else if (nVar != null) {
            nVar.mo3456a(this, str);
        } else {
            return;
        }
        nVar.mo3473c();
    }
}
