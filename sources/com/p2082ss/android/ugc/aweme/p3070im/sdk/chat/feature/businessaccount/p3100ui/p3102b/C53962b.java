package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.b */
public final class C53962b {

    /* renamed from: a */
    final Toast f123718a;

    /* renamed from: b */
    public final Context f123719b;

    /* renamed from: c */
    public final String f123720c;

    static {
        Covode.recordClassIndex(63629);
    }

    /* renamed from: a */
    private static Object m99177a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4201);
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
                    MethodCollector.m26664o(4201);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C53962b(Context context, String str, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(4194);
        this.f123719b = context;
        this.f123720c = str;
        Toast toast = new Toast(context);
        this.f123718a = toast;
        Object a = m99177a(context, "layout_inflater");
        if (a != null) {
            View inflate = ((LayoutInflater) a).inflate(R.layout.a8c, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            C89219l.m154721d(inflate, "");
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.cj9);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
            toast.setView(inflate);
            toast.setGravity(55, 0, 0);
            toast.setDuration(i);
            MethodCollector.m26664o(4194);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(4194);
        throw nullPointerException;
    }
}
