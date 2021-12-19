package com.p2082ss.android.ugc.aweme.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.t */
public final class C80628t {

    /* renamed from: a */
    public AudioManager f180279a;

    /* renamed from: b */
    public AudioManager.OnAudioFocusChangeListener f180280b = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80628t.C806291 */

        static {
            Covode.recordClassIndex(93903);
        }

        public final void onAudioFocusChange(int i) {
        }
    };

    static {
        Covode.recordClassIndex(93902);
    }

    /* renamed from: a */
    public static Context m139795a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public C80628t(Context context) {
        this.f180279a = (AudioManager) m139796a(m139795a(context), DataType.AUDIO);
    }

    /* renamed from: a */
    public static Object m139796a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13255);
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
                    MethodCollector.m26664o(13255);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
