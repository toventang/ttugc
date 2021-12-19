package com.bytedance.android.livesdk.utils;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.utils.d */
public final class C11260d {

    /* renamed from: a */
    public static final Set<AudioManager.OnAudioFocusChangeListener> f26950a = new HashSet();

    /* renamed from: b */
    private static ComponentName f26951b = new ComponentName(C3966y.m9669e().getPackageName(), C11262a.class.getName());

    /* renamed from: c */
    private static AudioManager f26952c = ((AudioManager) m19951a(C3966y.m9669e(), DataType.AUDIO));

    /* renamed from: d */
    private static AudioManager.OnAudioFocusChangeListener f26953d = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.bytedance.android.livesdk.utils.C11260d.C112611 */

        static {
            Covode.recordClassIndex(12893);
        }

        public final void onAudioFocusChange(int i) {
            for (AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener : new HashSet(C11260d.f26950a)) {
                onAudioFocusChangeListener.onAudioFocusChange(i);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.utils.d$a */
    static class C11262a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(12894);
        }

        public void onReceive(Context context, Intent intent) {
        }

        private C11262a() {
        }
    }

    /* renamed from: a */
    public static int m19950a() {
        int i;
        try {
            i = f26952c.requestAudioFocus(f26953d, 3, 2);
            if (i == 1) {
                try {
                    f26952c.registerMediaButtonEventReceiver(f26951b);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            i = 0;
            C3854a.m9453a(5, "AudioFocusUtil", "gainFocus error");
            return i;
        }
        return i;
    }

    /* renamed from: b */
    public static void m19953b() {
        try {
            f26952c.unregisterMediaButtonEventReceiver(f26951b);
            f26952c.abandonAudioFocus(f26953d);
        } catch (Exception unused) {
            C3854a.m9453a(5, "AudioFocusUtil", "returnFocus error");
        }
    }

    static {
        Covode.recordClassIndex(12892);
    }

    /* renamed from: a */
    public static void m19952a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        f26950a.add(onAudioFocusChangeListener);
    }

    /* renamed from: b */
    public static void m19954b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        Set<AudioManager.OnAudioFocusChangeListener> set = f26950a;
        set.remove(onAudioFocusChangeListener);
        if (set.isEmpty()) {
            m19953b();
        }
    }

    /* renamed from: a */
    private static Object m19951a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11071);
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
                    MethodCollector.m26664o(11071);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
