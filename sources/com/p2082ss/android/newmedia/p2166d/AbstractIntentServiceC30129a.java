package com.p2082ss.android.newmedia.p2166d;

import android.app.IntentService;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.newmedia.d.a */
public abstract class AbstractIntentServiceC30129a extends IntentService implements WeakHandler.IHandler {

    /* renamed from: a */
    private WeakHandler f71875a;

    /* renamed from: b */
    private Messenger f71876b;

    static {
        Covode.recordClassIndex(36628);
    }

    /* renamed from: a */
    public abstract void mo53503a(Context context, String str);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
    }

    public AbstractIntentServiceC30129a() {
        super("MessageReceiverService");
    }

    /* renamed from: a */
    private Handler m60948a() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public IBinder onBind(final Intent intent) {
        if (intent != null) {
            C30066d.m60817a().mo53432a(new Runnable() {
                /* class com.p2082ss.android.newmedia.p2166d.AbstractIntentServiceC30129a.RunnableC301312 */

                static {
                    Covode.recordClassIndex(36630);
                }

                public final void run() {
                    AbstractIntentServiceC30129a.this.onHandleIntent(intent);
                    AbstractIntentServiceC30129a.this.stopSelf();
                }
            }, 0);
        }
        if (this.f71876b == null) {
            this.f71875a = new WeakHandler(this);
            this.f71876b = new Messenger(this.f71875a);
        }
        return this.f71876b.getBinder();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        boolean z;
        if (intent != null) {
            try {
                String action = intent.getAction();
                C30221b.m61148b();
                if (C30221b.m61149c()) {
                    try {
                        if ("com.ss.android.message".equals(action)) {
                            String str = null;
                            if ("com.ss.android.message".equals(intent.getAction())) {
                                str = m60950a(intent, "message_data");
                            }
                            if (!C13627m.m24498a(str)) {
                                mo53503a((Context) this, str);
                                PowerManager powerManager = (PowerManager) m60949a(this, "power");
                                C30221b.m61148b();
                                if (C30221b.m61152f().mo35608f()) {
                                    if (Build.VERSION.SDK_INT >= 20) {
                                        z = powerManager.isInteractive();
                                    } else {
                                        z = powerManager.isScreenOn();
                                    }
                                    if (!z) {
                                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435462, "MessageReceiverService");
                                        C30221b.m61148b();
                                        newWakeLock.acquire((long) C30221b.m61152f().mo35609g());
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static String m60950a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m60949a(AbstractIntentServiceC30129a aVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return aVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return aVar.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return aVar.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = aVar.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    public int onStartCommand(final Intent intent, int i, final int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException e) {
            e.printStackTrace();
            if (m60948a() != null) {
                return 2;
            }
            C30066d.m60817a().mo53432a(new Runnable() {
                /* class com.p2082ss.android.newmedia.p2166d.AbstractIntentServiceC30129a.RunnableC301301 */

                static {
                    Covode.recordClassIndex(36629);
                }

                public final void run() {
                    try {
                        AbstractIntentServiceC30129a.this.onHandleIntent(intent);
                        AbstractIntentServiceC30129a.this.stopSelf(i2);
                    } catch (Throwable unused) {
                    }
                }
            }, 0);
            return 2;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
