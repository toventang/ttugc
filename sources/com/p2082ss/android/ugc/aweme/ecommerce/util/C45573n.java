package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.n */
public final class C45573n {
    static {
        Covode.recordClassIndex(54066);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.n$a */
    public static final class C45574a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f106127a;

        /* renamed from: b */
        final /* synthetic */ int f106128b;

        static {
            Covode.recordClassIndex(54067);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            AbstractC89171a aVar = this.f106127a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0643b.m2378c(C17879g.m33104a(), this.f106128b));
        }

        C45574a(AbstractC89171a aVar, int i) {
            this.f106127a = aVar;
            this.f106128b = i;
        }
    }

    /* renamed from: a */
    public static final View m88119a(View view) {
        C89219l.m154721d(view, "");
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof CoordinatorLayout)) {
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return (View) parent;
            }
        } while (view != null);
        return null;
    }

    /* renamed from: a */
    public static final void m88122a(Activity activity) {
        C89219l.m154721d(activity, "");
        Object a = m88121a(activity.getApplication(), "input_method");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) a;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }

    /* renamed from: a */
    public static final void m88123a(View view, int i) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m88118a(CharSequence charSequence, String... strArr) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(strArr, "");
        try {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            for (int i = 0; i <= 0; i++) {
                String str = strArr[0];
                int a = C89361p.m154888a(charSequence, str, 0, false, 6);
                if (a != -1) {
                    valueOf.setSpan(new C23126b(52, true), a, str.length() + a, 18);
                }
            }
            C89219l.m154716b(valueOf, "");
            return valueOf;
        } catch (Exception e) {
            C22708a.m42803a((Throwable) e, "bold failed " + charSequence + ' ' + C89064i.m154484a(strArr, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
            return new SpannableStringBuilder(charSequence);
        }
    }

    /* renamed from: a */
    public static final CharSequence m88120a(CharSequence charSequence, C45560e... eVarArr) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(eVarArr, "");
        try {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            for (int i = 0; i < 2; i++) {
                C45560e eVar = eVarArr[i];
                String str = eVar.f106100a;
                AbstractC89171a<Object> aVar = eVar.f106101b;
                int i2 = eVar.f106102c;
                C89219l.m154716b(valueOf, "");
                int a = C89361p.m154888a((CharSequence) valueOf, str, 0, false, 6);
                if (a != -1) {
                    valueOf.setSpan(new C45574a(aVar, i2), a, str.length() + a, 18);
                }
            }
            C89219l.m154716b(valueOf, "");
            return valueOf;
        } catch (Exception unused) {
            return charSequence;
        }
    }

    /* renamed from: a */
    private static Object m88121a(Application application, String str) {
        Object obj;
        MethodCollector.m26663i(9159);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
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
                    MethodCollector.m26664o(9159);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m88117a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, Object obj) {
        C89219l.m154721d(spannableStringBuilder, "");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
