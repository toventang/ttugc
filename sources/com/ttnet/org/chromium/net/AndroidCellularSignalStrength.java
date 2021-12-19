package com.ttnet.org.chromium.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.lang.reflect.Field;

public class AndroidCellularSignalStrength {

    /* renamed from: b */
    private static final AndroidCellularSignalStrength f198472b = new AndroidCellularSignalStrength();

    /* renamed from: a */
    public volatile int f198473a = Integer.MIN_VALUE;

    /* renamed from: com.ttnet.org.chromium.net.AndroidCellularSignalStrength$a */
    class C87498a extends PhoneStateListener implements ApplicationStatus.AbstractC87427b {

        /* renamed from: a */
        static final /* synthetic */ boolean f198475a = true;

        /* renamed from: c */
        private final TelephonyManager f198477c;

        /* renamed from: a */
        private void m151849a() {
            this.f198477c.listen(this, 256);
        }

        static {
            Covode.recordClassIndex(103445);
        }

        /* renamed from: b */
        private void m151850b() {
            AndroidCellularSignalStrength.this.f198473a = Integer.MIN_VALUE;
            this.f198477c.listen(this, 0);
        }

        @Override // com.ttnet.org.chromium.base.ApplicationStatus.AbstractC87427b
        /* renamed from: a */
        public final void mo141480a(int i) {
            if (i == 1) {
                m151849a();
            } else if (i == 2) {
                m151850b();
            }
        }

        C87498a() {
            if (ThreadUtils.f198316a || ThreadUtils.f198317b || !ThreadUtils.m151759b()) {
                TelephonyManager telephonyManager = (TelephonyManager) m151848a(C87445c.f198342a, "phone");
                this.f198477c = telephonyManager;
                if (telephonyManager.getSimState() == 5) {
                    ApplicationStatus.m151714a(this);
                    mo141480a(ApplicationStatus.getStateForApplication());
                    return;
                }
                return;
            }
            throw new AssertionError("Must be called on a thread other than UI.");
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (ApplicationStatus.getStateForApplication() == 1) {
                try {
                    AndroidCellularSignalStrength.this.f198473a = signalStrength.getLevel();
                } catch (SecurityException unused) {
                    AndroidCellularSignalStrength.this.f198473a = Integer.MIN_VALUE;
                    if (!f198475a) {
                        throw new AssertionError();
                    }
                }
            }
        }

        /* renamed from: a */
        private static Object m151848a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(5097);
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
                        MethodCollector.m26664o(5097);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    private static int getSignalStrengthLevel() {
        return f198472b.f198473a;
    }

    static {
        Covode.recordClassIndex(103443);
    }

    private AndroidCellularSignalStrength() {
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable() {
                /* class com.ttnet.org.chromium.net.AndroidCellularSignalStrength.RunnableC874971 */

                static {
                    Covode.recordClassIndex(103444);
                }

                public final void run() {
                    new C87498a();
                }
            });
        }
    }
}
