package com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a */
public class C44294a extends C44310e {

    /* renamed from: l */
    public static final C44295a f103301l = new C44295a((byte) 0);

    /* renamed from: a */
    private Boolean f103302a;

    /* renamed from: b */
    private SparseArray f103303b;

    /* renamed from: f */
    public Boolean f103304f;

    /* renamed from: g */
    public KeyBoardVisibilityUtil f103305g;

    /* renamed from: h */
    public AbstractC89172b<? super Boolean, C89391z> f103306h;

    /* renamed from: i */
    public AbstractC89171a<C89391z> f103307i;

    /* renamed from: j */
    public long f103308j;

    /* renamed from: k */
    public final boolean f103309k;

    static {
        Covode.recordClassIndex(52608);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    /* renamed from: a */
    public View mo74087a(int i) {
        if (this.f103303b == null) {
            this.f103303b = new SparseArray();
        }
        View view = (View) this.f103303b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f103303b.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    /* renamed from: a */
    public void mo74088a() {
        SparseArray sparseArray = this.f103303b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$a */
    public static final class C44295a {
        static {
            Covode.recordClassIndex(52609);
        }

        private C44295a() {
        }

        public /* synthetic */ C44295a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$g */
    public static final class C44301g extends ViewOutlineProvider {
        static {
            Covode.recordClassIndex(52615);
        }

        C44301g() {
        }

        public final void getOutline(View view, Outline outline) {
            if (view != null && outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + C45563h.f106108d), C45563h.f106108d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$c */
    static final class C44297c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44294a f103311a;

        static {
            Covode.recordClassIndex(52611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44297c(C44294a aVar) {
            super(0);
            this.f103311a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo75212a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo75212a() {
            Object obj;
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f103311a.f103305g;
            if (keyBoardVisibilityUtil == null) {
                return;
            }
            if (keyBoardVisibilityUtil.f106081a) {
                Context context = this.f103311a.getContext();
                IBinder iBinder = null;
                if (context != null) {
                    obj = m87022a(context, "input_method");
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                View view = this.f103311a.getView();
                if (view != null) {
                    iBinder = view.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return;
            }
            this.f103311a.dismissAllowingStateLoss();
        }

        /* renamed from: a */
        private static Object m87022a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(7456);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(7456);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismiss() {
        if (this.mCancelable) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismissAllowingStateLoss() {
        if (this.mCancelable) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f103305g;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.mo76761a();
        }
        this.f103305g = null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onStart() {
        this.f103308j = SystemClock.elapsedRealtime();
        super.onStart();
    }

    private C44294a() {
        this.f103309k = true;
        setCancelable(false);
        this.f103308j = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public int getTheme() {
        if (C89219l.m154714a((Object) this.f103302a, (Object) false)) {
            return R.style.vn;
        }
        return R.style.vm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$f */
    public static final class RunnableC44300f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44294a f103315a;

        static {
            Covode.recordClassIndex(52614);
        }

        RunnableC44300f(C44294a aVar) {
            this.f103315a = aVar;
        }

        public final void run() {
            ViewParent viewParent;
            this.f103315a.setCancelable(true);
            Boolean bool = this.f103315a.f103304f;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C44294a aVar = this.f103315a;
                aVar.f103304f = Boolean.valueOf(booleanValue);
                View view = aVar.getView();
                View view2 = null;
                if (view != null) {
                    viewParent = view.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent instanceof View) {
                    view2 = viewParent;
                }
                try {
                    BottomSheetBehavior a = BottomSheetBehavior.m52754a(view2);
                    if (a != null) {
                        a.f62894h = booleanValue;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public /* synthetic */ C44294a(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$d */
    static final class View$OnClickListenerC44298d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44297c f103312a;

        static {
            Covode.recordClassIndex(52612);
        }

        View$OnClickListenerC44298d(C44297c cVar) {
            this.f103312a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103312a.mo75212a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        if (bundle != null) {
            setCancelable(true);
            dismissAllowingStateLoss();
        }
        if (this.f103309k) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC44300f(this), 450);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("needs_dim", true));
        } else {
            bool = null;
        }
        this.f103302a = bool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a.onActivityCreated(android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$b */
    static final class C44296b extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44294a f103310a;

        static {
            Covode.recordClassIndex(52610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44296b(C44294a aVar) {
            super(2);
            this.f103310a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f103310a.f103306h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(booleanValue));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$e */
    static final class DialogInterface$OnKeyListenerC44299e implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C44294a f103313a;

        /* renamed from: b */
        final /* synthetic */ C44297c f103314b;

        static {
            Covode.recordClassIndex(52613);
        }

        DialogInterface$OnKeyListenerC44299e(C44294a aVar, C44297c cVar) {
            this.f103313a = aVar;
            this.f103314b = cVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            AbstractC89171a<C89391z> aVar = this.f103313a.f103307i;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f103314b.mo75212a();
            return false;
        }
    }
}
