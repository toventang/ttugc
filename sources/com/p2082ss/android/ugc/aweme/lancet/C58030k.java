package com.p2082ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.lancet.k */
public class C58030k {

    /* renamed from: a */
    private static volatile Handler f132261a;

    static {
        Covode.recordClassIndex(68065);
    }

    /* renamed from: a */
    private static Handler m104849a() {
        MethodCollector.m26663i(12090);
        if (f132261a == null) {
            synchronized (C58030k.class) {
                try {
                    if (f132261a == null) {
                        f132261a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12090);
                    throw th;
                }
            }
        }
        Handler handler = f132261a;
        MethodCollector.m26664o(12090);
        return handler;
    }

    /* renamed from: a */
    private static Activity m104848a(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* renamed from: a */
    public static void m104850a(Object obj) {
        Activity a;
        ImageView imageView = (ImageView) obj;
        try {
            if (imageView.getDrawable() != null && (a = m104848a(imageView.getContext())) != null) {
                int i = Build.VERSION.SDK_INT;
                if (a.isDestroyed()) {
                    m104849a().postDelayed(new RunnableC58031l(new WeakReference(imageView), a, imageView), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
            }
        } catch (Exception unused) {
        }
    }
}
