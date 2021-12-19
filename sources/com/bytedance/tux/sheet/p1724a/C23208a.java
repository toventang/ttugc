package com.bytedance.tux.sheet.p1724a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.C23203a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.tux.sheet.a.a */
public final class C23208a extends C23203a {

    /* renamed from: o */
    public static final C23212c f54985o = new C23212c((byte) 0);

    /* renamed from: g */
    public List<List<C23209a<?>>> f54986g = new ArrayList();

    /* renamed from: h */
    public String f54987h;

    /* renamed from: i */
    public Integer f54988i;

    /* renamed from: j */
    public int f54989j = -1;

    /* renamed from: k */
    public String f54990k;

    /* renamed from: l */
    public Integer f54991l;

    /* renamed from: m */
    public boolean f54992m;

    /* renamed from: n */
    public View f54993n;

    /* renamed from: p */
    private HashMap f54994p;

    /* renamed from: com.bytedance.tux.sheet.a.a$e */
    public static final class C23214e extends C23209a<C23214e> {

        /* renamed from: f */
        public String f55006f;

        /* renamed from: g */
        public Integer f55007g;

        static {
            Covode.recordClassIndex(27154);
        }
    }

    static {
        Covode.recordClassIndex(27148);
    }

    @Override // com.bytedance.tux.sheet.C23203a
    /* renamed from: a */
    public final void mo37780a() {
        HashMap hashMap = this.f54994p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.tux.sheet.C23203a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37780a();
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$c */
    public static final class C23212c {
        static {
            Covode.recordClassIndex(27152);
        }

        private C23212c() {
        }

        public /* synthetic */ C23212c(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$b */
    public static final class C23211b {

        /* renamed from: a */
        public final C23208a f55001a = new C23208a();

        /* renamed from: b */
        private boolean f55002b;

        static {
            Covode.recordClassIndex(27151);
        }

        /* renamed from: a */
        public final C23211b mo37791a() {
            this.f55001a.f54989j = 2;
            return this;
        }

        /* renamed from: b */
        public final C23208a mo37800b() {
            this.f55001a.f54992m = !this.f55002b;
            return this.f55001a;
        }

        /* renamed from: a */
        public final C23211b mo37792a(int i) {
            this.f55001a.f54991l = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public final C23211b mo37798b(String str) {
            C89219l.m154719c(str, "");
            this.f55001a.f54990k = str;
            return this;
        }

        /* renamed from: a */
        public final C23211b mo37793a(DialogInterface.OnCancelListener onCancelListener) {
            C89219l.m154719c(onCancelListener, "");
            this.f55001a.f54970a = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C23211b mo37799b(List<C23214e> list) {
            C89219l.m154719c(list, "");
            this.f55001a.f54986g.add(list);
            return this;
        }

        /* renamed from: a */
        public final C23211b mo37794a(String str) {
            C89219l.m154719c(str, "");
            this.f55001a.f54987h = str;
            return this;
        }

        /* renamed from: a */
        public final C23211b mo37795a(List<C23213d> list) {
            C89219l.m154719c(list, "");
            this.f55001a.f54986g.add(list);
            this.f55002b = true;
            return this;
        }

        /* renamed from: a */
        public final C23211b mo37796a(C23213d... dVarArr) {
            C89219l.m154719c(dVarArr, "");
            this.f55001a.f54986g.add(C89064i.m154508i(dVarArr));
            this.f55002b = true;
            return this;
        }

        /* renamed from: a */
        public final C23211b mo37797a(C23214e... eVarArr) {
            C89219l.m154719c(eVarArr, "");
            this.f55001a.f54986g.add(C89064i.m154508i(eVarArr));
            return this;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.tux.sheet.C23203a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new RunnableC23217h(this));
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$h */
    static final class RunnableC23217h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23208a f55025a;

        static {
            Covode.recordClassIndex(27157);
        }

        RunnableC23217h(C23208a aVar) {
            this.f55025a = aVar;
        }

        public final void run() {
            View view = this.f55025a.getView();
            if (view != null) {
                C89219l.m154709a((Object) view, "");
                View view2 = this.f55025a.getView();
                do {
                    ViewParent viewParent = null;
                    if (view2 != null) {
                        viewParent = view2.getParent();
                    }
                    if (viewParent instanceof CoordinatorLayout) {
                        if (view2 != null) {
                            BottomSheetBehavior a = BottomSheetBehavior.m52754a(view2);
                            Resources resources = this.f55025a.getResources();
                            C89219l.m154709a((Object) resources, "");
                            double d = (double) resources.getDisplayMetrics().heightPixels;
                            Double.isNaN(d);
                            int measuredHeight = view.getMeasuredHeight();
                            C89219l.m154709a((Object) a, "");
                            a.mo43976b(C89271h.m154772c(measuredHeight, (int) (d * 0.73d)));
                            return;
                        }
                        return;
                    } else if (viewParent instanceof View) {
                        view2 = (View) viewParent;
                    } else {
                        return;
                    }
                } while (view2 != null);
            }
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$a */
    public static class C23209a<T extends C23209a<T>> {

        /* renamed from: a */
        public String f54995a;

        /* renamed from: b */
        public Integer f54996b;

        /* renamed from: c */
        public int f54997c;

        /* renamed from: d */
        public boolean f54998d = true;

        /* renamed from: e */
        public View.OnClickListener f54999e;

        static {
            Covode.recordClassIndex(27149);
        }

        /* renamed from: b */
        public final T mo37789b(int i) {
            this.f54997c = i;
            return this;
        }

        /* renamed from: a */
        public final T mo37785a(int i) {
            this.f54996b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: com.bytedance.tux.sheet.a.a$a$a */
        static final class View$OnClickListenerC23210a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC89172b f55000a;

            static {
                Covode.recordClassIndex(27150);
            }

            View$OnClickListenerC23210a(AbstractC89172b bVar) {
                this.f55000a = bVar;
            }

            public final void onClick(View view) {
                AbstractC89172b bVar = this.f55000a;
                C89219l.m154709a((Object) view, "");
                bVar.invoke(view);
            }
        }

        /* renamed from: a */
        public final T mo37786a(View.OnClickListener onClickListener) {
            C89219l.m154719c(onClickListener, "");
            this.f54999e = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final T mo37787a(AbstractC89172b<? super View, C89391z> bVar) {
            C89219l.m154719c(bVar, "");
            this.f54999e = new View$OnClickListenerC23210a(bVar);
            return this;
        }

        /* renamed from: a */
        public final T mo37788a(String str) {
            C89219l.m154719c(str, "");
            this.f54995a = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$d */
    public static final class C23213d extends C23209a<C23213d> {

        /* renamed from: f */
        public Integer f55003f;

        /* renamed from: g */
        public AbstractC89172b<? super TuxIconView, C89391z> f55004g;

        /* renamed from: h */
        public View f55005h;

        static {
            Covode.recordClassIndex(27153);
        }

        /* renamed from: c */
        public final C23213d mo37801c(int i) {
            this.f55003f = Integer.valueOf(i);
            return this;
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$f */
    static final class View$OnClickListenerC23215f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23209a f55008a;

        /* renamed from: b */
        final /* synthetic */ int f55009b;

        /* renamed from: c */
        final /* synthetic */ C23208a f55010c;

        /* renamed from: d */
        final /* synthetic */ Context f55011d;

        /* renamed from: e */
        final /* synthetic */ LinearLayout f55012e;

        /* renamed from: f */
        final /* synthetic */ int f55013f;

        /* renamed from: g */
        final /* synthetic */ int f55014g;

        /* renamed from: h */
        final /* synthetic */ int f55015h;

        /* renamed from: i */
        final /* synthetic */ int f55016i;

        /* renamed from: j */
        final /* synthetic */ int f55017j;

        /* renamed from: k */
        final /* synthetic */ int f55018k;

        /* renamed from: l */
        final /* synthetic */ int f55019l;

        /* renamed from: m */
        final /* synthetic */ int f55020m;

        /* renamed from: n */
        final /* synthetic */ int f55021n;

        /* renamed from: o */
        final /* synthetic */ float f55022o;

        /* renamed from: p */
        final /* synthetic */ int f55023p;

        static {
            Covode.recordClassIndex(27155);
        }

        View$OnClickListenerC23215f(C23209a aVar, int i, C23208a aVar2, Context context, LinearLayout linearLayout, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11) {
            this.f55008a = aVar;
            this.f55009b = i;
            this.f55010c = aVar2;
            this.f55011d = context;
            this.f55012e = linearLayout;
            this.f55013f = i2;
            this.f55014g = i3;
            this.f55015h = i4;
            this.f55016i = i5;
            this.f55017j = i6;
            this.f55018k = i7;
            this.f55019l = i8;
            this.f55020m = i9;
            this.f55021n = i10;
            this.f55022o = f;
            this.f55023p = i11;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f55008a.f54999e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.f55010c.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$g */
    static final class View$OnClickListenerC23216g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23208a f55024a;

        static {
            Covode.recordClassIndex(27156);
        }

        View$OnClickListenerC23216g(C23208a aVar) {
            this.f55024a = aVar;
        }

        public final void onClick(View view) {
            C23208a aVar = this.f55024a;
            aVar.onCancel(aVar.getDialog());
            this.f55024a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: a */
    private static String m43744a(Context context, String str, Integer num) {
        if (str != null) {
            return str;
        }
        if (num == null) {
            return "";
        }
        String string = context.getResources().getString(num.intValue());
        C89219l.m154709a((Object) string, "");
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02e5  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r52, android.view.ViewGroup r53, android.os.Bundle r54) {
        /*
        // Method dump skipped, instructions count: 1050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.p1724a.C23208a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: a */
    private static void m43745a(ViewGroup viewGroup, float f, int i, float f2) {
        MethodCollector.m26663i(10290);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) f);
        if (f2 > 0.0f) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            marginLayoutParams.leftMargin = C89241a.m154730a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            marginLayoutParams.rightMargin = C89241a.m154730a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
        }
        frameLayout.setBackgroundColor(i);
        viewGroup.addView(frameLayout, marginLayoutParams);
        MethodCollector.m26664o(10290);
    }
}
