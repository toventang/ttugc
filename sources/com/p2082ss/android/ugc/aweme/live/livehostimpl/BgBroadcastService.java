package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.C0595i;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.livehost_impl.R$drawable;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService */
public class BgBroadcastService extends Service {
    private NotificationManager mNotificationManager;
    private AbstractBinderC11605a mService;

    static {
        Covode.recordClassIndex(68951);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
        this.mService.onDestroy();
        this.mService.unBindService(this);
    }

    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) m107784x69c16dc0(this, "notification");
        startForeground(R.id.cu4, buildNotification(this));
        AbstractBinderC11605a aVar = (AbstractBinderC11605a) C13635a.m24537a("com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl", new Object[0]);
        this.mService = aVar;
        aVar.bindService(this);
        this.mService.onCreate();
    }

    public IBinder onBind(Intent intent) {
        return this.mService;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mService.onConfigurationChanged(configuration);
    }

    private Notification buildNotification(Context context) {
        C0595i.C0600e eVar;
        if (Build.VERSION.SDK_INT >= 26 && this.mNotificationManager.getNotificationChannel("BgBroadcastService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("BgBroadcastService.notification", getString(R.string.cwj), 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClassName("com.ss.android.ugc.aweme.live", "LiveBgBroadcastActivity");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        if (Build.VERSION.SDK_INT >= 26) {
            eVar = new C0595i.C0600e(context, "BgBroadcastService.notification");
        } else {
            eVar = new C0595i.C0600e(context);
        }
        C0595i.C0600e a = eVar.mo2613a((CharSequence) getString(R.string.cwr)).mo2605a(R$drawable.icon);
        a.mo2617a(2, true);
        C0595i.C0600e a2 = a.mo2608a(System.currentTimeMillis());
        a2.f2523f = activity;
        a2.f2500B = "service";
        a2.mo2617a(8, true);
        a2.mo2622b(true).mo2617a(2, true);
        if (Build.VERSION.SDK_INT >= 21) {
            eVar.f2503E = 1;
        }
        return eVar.mo2626d();
    }

    /* renamed from: com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m107784x69c16dc0(BgBroadcastService bgBroadcastService, String str) {
        Object obj;
        MethodCollector.m26663i(10761);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = bgBroadcastService.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = bgBroadcastService.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = bgBroadcastService.getSystemService(str);
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
                    MethodCollector.m26664o(10761);
                }
            }
        } else {
            obj = bgBroadcastService.getSystemService(str);
        }
        return obj;
    }
}
