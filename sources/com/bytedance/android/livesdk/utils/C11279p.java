package com.bytedance.android.livesdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.p561j.C9139u;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.p */
public final class C11279p {

    /* renamed from: a */
    static long f26982a;

    static {
        Covode.recordClassIndex(12911);
    }

    /* renamed from: a */
    public static final boolean m20012a(Boolean bool) {
        return C89219l.m154714a((Object) bool, (Object) true);
    }

    /* renamed from: a */
    public static final void m20008a(View view, boolean z) {
        if (z) {
            m20017b(view);
        } else {
            m20006a(view);
        }
    }

    /* renamed from: a */
    public static final boolean m20013a(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    /* renamed from: a */
    public static final boolean m20011a(Activity activity) {
        return m20019b(activity != null ? Boolean.valueOf(activity.isFinishing()) : null);
    }

    /* renamed from: a */
    public static final void m20009a(ConstraintLayout constraintLayout, int i, int i2) {
        if (constraintLayout != null) {
            C0550b bVar = new C0550b();
            bVar.mo2451a(constraintLayout);
            bVar.mo2453b(i, i2);
            bVar.mo2454b(constraintLayout);
        }
    }

    /* renamed from: a */
    public static final void m20007a(View view, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        view.setOnClickListener(new View$OnClickListenerC11281b(bVar));
    }

    /* renamed from: a */
    public static final void m20005a() {
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gj8);
    }

    /* renamed from: a */
    public static final void m20010a(String str) {
        C89219l.m154721d(str, "");
        C11226ao.m19883a(C3966y.m9669e(), str, 0);
    }

    /* renamed from: b */
    public static final boolean m20018b() {
        return C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: f */
    public static final boolean m20029f() {
        if (!m20028e()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m20028e() {
        Boolean bool;
        EnumC9592k kVar = (EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class);
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.isAudience());
        } else {
            bool = null;
        }
        return m20012a(bool);
    }

    /* renamed from: c */
    public static final boolean m20022c() {
        Boolean bool;
        EnumC9592k kVar = (EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class);
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.isPreviewPage());
        } else {
            bool = null;
        }
        return m20012a(bool);
    }

    /* renamed from: d */
    public static final boolean m20026d() {
        Boolean bool;
        EnumC9592k kVar = (EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class);
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.isVideoPage());
        } else {
            bool = null;
        }
        return m20012a(bool);
    }

    /* renamed from: com.bytedance.android.livesdk.utils.p$a */
    public static final class C11280a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f26983a;

        static {
            Covode.recordClassIndex(12912);
        }

        C11280a(View view) {
            this.f26983a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C11279p.m20006a(this.f26983a);
        }
    }

    /* renamed from: a */
    public static final void m20006a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static final void m20017b(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: c */
    public static final void m20021c(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: c */
    public static final boolean m20023c(Boolean bool) {
        return !C89219l.m154714a((Object) bool, (Object) true);
    }

    /* renamed from: d */
    public static final boolean m20027d(Boolean bool) {
        return !C89219l.m154714a((Object) bool, (Object) false);
    }

    /* renamed from: com.bytedance.android.livesdk.utils.p$b */
    static final class View$OnClickListenerC11281b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f26984a;

        static {
            Covode.recordClassIndex(12913);
        }

        View$OnClickListenerC11281b(AbstractC89172b bVar) {
            this.f26984a = bVar;
        }

        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C11279p.f26982a >= 500) {
                C11279p.f26982a = currentTimeMillis;
                AbstractC89172b bVar = this.f26984a;
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: a */
    public static final Dialog m19997a(Dialog dialog) {
        if (dialog == null) {
            return null;
        }
        if (m20011a((Activity) m20001a(dialog.getContext())) && !dialog.isShowing()) {
            dialog.show();
        }
        return dialog;
    }

    /* renamed from: b */
    public static final Dialog m20014b(Dialog dialog) {
        if (dialog == null) {
            return null;
        }
        if (m20011a((Activity) m20001a(dialog.getContext())) && dialog.isShowing()) {
            dialog.dismiss();
        }
        return dialog;
    }

    /* renamed from: d */
    public static final View m20024d(View view) {
        if (view == null) {
            return null;
        }
        view.animate().alpha(0.0f).setDuration(150).setListener(new C11280a(view));
        return view;
    }

    /* renamed from: b */
    public static final Boolean m20016b(EditText editText) {
        Object obj;
        C89219l.m154721d(editText, "");
        Context context = editText.getContext();
        if (context != null) {
            obj = m20004a(context, "input_method");
        } else {
            obj = null;
        }
        if (!(obj instanceof InputMethodManager)) {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            return Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0));
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m20019b(Boolean bool) {
        return C89219l.m154714a((Object) bool, (Object) false);
    }

    /* renamed from: a */
    public static final ActivityC0945e m20001a(Context context) {
        while (!(context instanceof ActivityC0945e)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ActivityC0945e) context;
    }

    /* renamed from: a */
    public static final Boolean m20003a(EditText editText) {
        Object obj;
        C89219l.m154721d(editText, "");
        Context context = editText.getContext();
        if (context != null) {
            obj = m20004a(context, "input_method");
        } else {
            obj = null;
        }
        if (!(obj instanceof InputMethodManager)) {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            return Boolean.valueOf(inputMethodManager.showSoftInput(editText, 1));
        }
        return null;
    }

    /* renamed from: a */
    public static final C89391z m20002a(TextView textView, int i) {
        if (textView == null) {
            return null;
        }
        textView.setTextColor(C3966y.m9663b(i));
        return C89391z.f203057a;
    }

    /* renamed from: c */
    public static final View m20020c(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = i;
        }
        view.requestLayout();
        return view;
    }

    /* renamed from: b */
    public static final View m20015b(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = i;
        }
        view.requestLayout();
        return view;
    }

    /* renamed from: d */
    public static final View m20025d(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = i;
        }
        view.requestLayout();
        return view;
    }

    /* renamed from: a */
    public static final View m19999a(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = i;
        }
        view.requestLayout();
        return view;
    }

    /* renamed from: a */
    private static Object m20004a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8771);
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
                    MethodCollector.m26664o(8771);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static final Uri m19998a(Uri uri, String str, String str2) {
        String queryParameter;
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            if (C89219l.m154714a((Object) str3, (Object) str)) {
                queryParameter = str2;
            } else {
                queryParameter = uri.getQueryParameter(str3);
            }
            clearQuery.appendQueryParameter(str3, queryParameter);
        }
        Uri build = clearQuery.build();
        C89219l.m154716b(build, "");
        return build;
    }

    /* renamed from: a */
    public static final View m20000a(ViewGroup viewGroup, int i, boolean z) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, z);
        C89219l.m154716b(a, "");
        return a;
    }
}
