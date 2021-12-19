package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.C0595i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25609k;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.messaging.C27857a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.c */
public final class C27861c {

    /* renamed from: a */
    private final Executor f65440a;

    /* renamed from: b */
    private final Context f65441b;

    /* renamed from: c */
    private final C27877o f65442c;

    static {
        Covode.recordClassIndex(33454);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo46559a() {
        Uri defaultUri;
        Intent launchIntentForPackage;
        Uri parse;
        PendingIntent activity;
        PendingIntent a;
        if (this.f65442c.mo46574b("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) m55775a(this.f65441b, "keyguard")).inKeyguardRestrictedInputMode()) {
            if (!C25609k.m49421c()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) m55775a(this.f65441b, "activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        C27874l a2 = C27874l.m55785a(this.f65442c.mo46572a("gcm.n.image"));
        if (a2 != null) {
            a2.f65457b = C25635k.m49513a(this.f65440a, new CallableC27875m(a2));
        }
        Context context = this.f65441b;
        C27877o oVar = this.f65442c;
        Bundle a3 = C27857a.m55770a(context.getPackageManager(), context.getPackageName());
        String packageName = context.getPackageName();
        String b = C27857a.m55773b(context, oVar.mo46572a("gcm.n.android_channel_id"), a3);
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        C0595i.C0600e eVar = new C0595i.C0600e(context, b);
        String a4 = oVar.mo46571a(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(a4)) {
            eVar.mo2613a((CharSequence) a4);
        }
        String a5 = oVar.mo46571a(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(a5)) {
            eVar.mo2621b(a5);
            eVar.mo2612a(new C0595i.C0598c().mo2603c(a5));
        }
        eVar.mo2605a(C27857a.m55767a(packageManager, resources, packageName, oVar.mo46572a("gcm.n.icon"), a3));
        String a6 = oVar.mo46572a("gcm.n.sound2");
        if (TextUtils.isEmpty(a6)) {
            a6 = oVar.mo46572a("gcm.n.sound");
        }
        if (!TextUtils.isEmpty(a6)) {
            if ("default".equals(a6) || resources.getIdentifier(a6, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse(new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(a6).length()).append("android.resource://").append(packageName).append("/raw/").append(a6).toString());
            }
            if (defaultUri != null) {
                eVar.mo2611a(defaultUri);
            }
        }
        String a7 = oVar.mo46572a("gcm.n.click_action");
        if (!TextUtils.isEmpty(a7)) {
            launchIntentForPackage = new Intent(a7);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            String a8 = oVar.mo46572a("gcm.n.link_android");
            if (TextUtils.isEmpty(a8)) {
                a8 = oVar.mo46572a("gcm.n.link");
            }
            if (TextUtils.isEmpty(a8) || (parse = Uri.parse(a8)) == null) {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            } else {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(parse);
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            launchIntentForPackage.putExtras(oVar.mo46576c());
            activity = PendingIntent.getActivity(context, C27857a.f65435a.incrementAndGet(), launchIntentForPackage, 1073741824);
            if (oVar.mo46574b("google.c.a.e")) {
                activity = C27857a.m55768a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(oVar.mo46578d()).putExtra("pending_intent", activity));
            }
        }
        eVar.f2523f = activity;
        if (oVar.mo46574b("google.c.a.e") && (a = C27857a.m55768a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(oVar.mo46578d()))) != null) {
            eVar.mo2620b(a);
        }
        Integer a9 = C27857a.m55771a(context, oVar.mo46572a("gcm.n.color"), a3);
        if (a9 != null) {
            eVar.f2502D = a9.intValue();
        }
        eVar.mo2622b(!oVar.mo46574b("gcm.n.sticky"));
        eVar.f2542y = oVar.mo46574b("gcm.n.local_only");
        String a10 = oVar.mo46572a("gcm.n.ticker");
        if (a10 != null) {
            eVar.mo2627d(a10);
        }
        Integer c = oVar.mo46577c("gcm.n.notification_priority");
        if (c != null) {
            if (c.intValue() < -2 || c.intValue() > 2) {
                String.valueOf(String.valueOf(c)).length();
            } else {
                eVar.f2529l = c.intValue();
            }
        }
        Integer c2 = oVar.mo46577c("gcm.n.visibility");
        if (c2 != null) {
            if (c2.intValue() < -1 || c2.intValue() > 1) {
                String.valueOf(String.valueOf(c2)).length();
            } else {
                eVar.f2503E = c2.intValue();
            }
        }
        Integer c3 = oVar.mo46577c("gcm.n.notification_count");
        if (c3 != null) {
            if (c3.intValue() < 0) {
                String.valueOf(String.valueOf(c3)).length();
            } else {
                eVar.f2528k = c3.intValue();
            }
        }
        Long d = oVar.mo46579d("gcm.n.event_time");
        if (d != null) {
            eVar.f2530m = true;
            eVar.mo2608a(d.longValue());
        }
        long[] a11 = oVar.mo46573a();
        if (a11 != null) {
            eVar.mo2616a(a11);
        }
        int[] b2 = oVar.mo46575b();
        if (b2 != null) {
            eVar.mo2606a(b2[0], b2[1], b2[2]);
        }
        boolean b3 = oVar.mo46574b("gcm.n.default_sound");
        if (oVar.mo46574b("gcm.n.default_vibrate_timings")) {
            b3 |= true;
        }
        if (oVar.mo46574b("gcm.n.default_light_settings")) {
            boolean z = b3 ? 1 : 0;
            char c4 = b3 ? 1 : 0;
            char c5 = b3 ? 1 : 0;
            b3 = z | true;
        }
        int i = b3 ? 1 : 0;
        int i2 = b3 ? 1 : 0;
        int i3 = b3 ? 1 : 0;
        int i4 = b3 ? 1 : 0;
        eVar.mo2624c(i);
        String a12 = oVar.mo46572a("gcm.n.tag");
        if (TextUtils.isEmpty(a12)) {
            a12 = new StringBuilder(37).append("FCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        C27857a.C27858a aVar = new C27857a.C27858a(eVar, a12);
        C0595i.C0600e eVar2 = aVar.f65436a;
        if (a2 != null) {
            try {
                Bitmap bitmap = (Bitmap) C25635k.m49515a((AbstractC25631h) C25565r.m49314a(a2.f65457b), 5, TimeUnit.SECONDS);
                eVar2.mo2610a(bitmap);
                C0595i.C0597b bVar = new C0595i.C0597b();
                bVar.f2489a = bitmap;
                eVar2.mo2612a(bVar.mo2597a((Bitmap) null));
            } catch (ExecutionException e) {
                String.valueOf(String.valueOf(e.getCause())).length();
            } catch (InterruptedException unused) {
                a2.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                a2.close();
            }
        }
        ((NotificationManager) m55775a(this.f65441b, "notification")).notify(aVar.f65437b, aVar.f65438c, aVar.f65436a.mo2626d());
        return true;
    }

    /* renamed from: a */
    private static Object m55775a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12185);
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
                    MethodCollector.m26664o(12185);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C27861c(Context context, C27877o oVar, Executor executor) {
        this.f65440a = executor;
        this.f65441b = context;
        this.f65442c = oVar;
    }
}
