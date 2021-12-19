package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.play.core.p1963b.C26909b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;

public class AssetPackExtractionService extends Service {

    /* renamed from: a */
    Context f63412a;

    /* renamed from: b */
    C26843cw f63413b;

    /* renamed from: c */
    C26769ac f63414c;

    /* renamed from: d */
    private final C26909b f63415d = new C26909b("AssetPackExtractionService");

    /* renamed from: e */
    private BinderC26767aa f63416e;

    /* renamed from: f */
    private NotificationManager f63417f;

    static {
        Covode.recordClassIndex(32237);
    }

    /* renamed from: b */
    private final synchronized void m53158b(Bundle bundle) {
        MethodCollector.m26663i(11323);
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f63412a, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f63412a).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f63415d.mo44598d("Starting foreground service.", new Object[0]);
        this.f63413b.mo44541a(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f63417f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
        MethodCollector.m26664o(11323);
    }

    /* renamed from: a */
    public final synchronized Bundle mo44424a(Bundle bundle) {
        Bundle bundle2;
        MethodCollector.m26663i(11321);
        int i = bundle.getInt("action_type");
        C26909b bVar = this.f63415d;
        Integer valueOf = Integer.valueOf(i);
        bVar.mo44595a("updateServiceState: %d", valueOf);
        if (i == 1) {
            m53158b(bundle);
        } else if (i == 2) {
            mo44425a();
        } else {
            this.f63415d.mo44596b("Unknown action type received: %d", valueOf);
        }
        bundle2 = new Bundle();
        MethodCollector.m26664o(11321);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo44425a() {
        MethodCollector.m26663i(11473);
        this.f63415d.mo44598d("Stopping service.", new Object[0]);
        this.f63413b.mo44541a(false);
        stopForeground(true);
        stopSelf();
        MethodCollector.m26664o(11473);
    }

    public final IBinder onBind(Intent intent) {
        return this.f63416e;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: a */
    private static Object m53157a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11174);
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
                    MethodCollector.m26664o(11174);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void onCreate() {
        super.onCreate();
        this.f63415d.mo44595a("onCreate", new Object[0]);
        Context applicationContext = getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C26816bw.m53265a(applicationContext).mo44483a(this);
        this.f63416e = new BinderC26767aa(this.f63412a, this, this.f63414c);
        this.f63417f = (NotificationManager) m53157a(this.f63412a, "notification");
    }
}
