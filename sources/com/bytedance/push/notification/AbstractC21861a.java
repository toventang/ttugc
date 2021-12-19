package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.push.PushBody;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.push.notification.a */
public abstract class AbstractC21861a {

    /* renamed from: com.bytedance.push.notification.a$a */
    public interface AbstractC21863a {
        static {
            Covode.recordClassIndex(25516);
        }

        /* renamed from: a */
        void mo35550a();

        /* renamed from: a */
        void mo35551a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(25514);
    }

    /* renamed from: a */
    public abstract void mo35547a(String str, AbstractC21863a aVar);

    /* renamed from: b */
    public abstract Intent mo35549b(Context context, int i, PushBody pushBody);

    /* renamed from: a */
    private static void m40962a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static Object m40961a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo35545a(final Context context, final int i, final PushBody pushBody) {
        if (pushBody != null) {
            if (pushBody.f51555n == 0 || TextUtils.isEmpty(pushBody.f51554m)) {
                mo35546a(context, i, pushBody, (Bitmap) null);
            } else {
                mo35547a(pushBody.f51554m, new AbstractC21863a() {
                    /* class com.bytedance.push.notification.AbstractC21861a.C218621 */

                    static {
                        Covode.recordClassIndex(25515);
                    }

                    @Override // com.bytedance.push.notification.AbstractC21861a.AbstractC21863a
                    /* renamed from: a */
                    public final void mo35550a() {
                        AbstractC21861a.this.mo35546a(context, i, pushBody, (Bitmap) null);
                    }

                    @Override // com.bytedance.push.notification.AbstractC21861a.AbstractC21863a
                    /* renamed from: a */
                    public final void mo35551a(Bitmap bitmap) {
                        AbstractC21861a.this.mo35546a(context, i, pushBody, bitmap);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo35546a(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        try {
            NotificationManager notificationManager = (NotificationManager) m40961a(context, "notification");
            Intent b = mo35549b(context, i, pushBody);
            if (pushBody.f51550i) {
                Notification b2 = mo35548b(context, i, pushBody, bitmap);
                if (b2 != null) {
                    int i2 = (int) (pushBody.f51542a % 2147483647L);
                    b2.contentIntent = PendingIntent.getActivity(context, i2, b, 134217728);
                    notificationManager.notify("app_notify", i2, b2);
                    return;
                }
                return;
            }
            m40962a(context, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Notification m40959a(Notification.Builder builder, Context context, String str, String str2) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        int i = Build.VERSION.SDK_INT;
        contentText.setStyle(new Notification.BigTextStyle().bigText(str2));
        if (bitmap != null && !bitmap.isRecycled()) {
            contentText = contentText.setLargeIcon(bitmap);
        }
        return contentText.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Notification mo35548b(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        Notification.Builder builder;
        Notification notification;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (C13627m.m24498a(pushBody.f51553l)) {
                pushBody.f51553l = context.getString(packageInfo.applicationInfo.labelRes);
            }
            String str = pushBody.f51549h;
            if (!C21873f.m40993a(context, str)) {
                str = "push";
            }
            if (Build.VERSION.SDK_INT >= 26) {
                builder = new Notification.Builder(context, str);
            } else {
                builder = new Notification.Builder(context);
            }
            long currentTimeMillis = System.currentTimeMillis();
            builder.setTicker(pushBody.f51553l).setAutoCancel(true);
            builder.setWhen(currentTimeMillis);
            builder.setShowWhen(pushBody.f51545d);
            if (Build.VERSION.SDK_INT > 20) {
                builder.setSmallIcon(2131233907);
            } else {
                builder.setSmallIcon(R.drawable.status_icon);
            }
            if (pushBody.f51557p) {
                builder.setLights(-16711936, 1000, 2500);
            }
            if (Build.VERSION.SDK_INT > 20) {
                builder.setPriority(1);
                builder.setVibrate(new long[0]);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                pushBody.f51555n = 0;
            }
            int i2 = pushBody.f51555n;
            if (i2 == 0) {
                notification = m40959a(builder, context, pushBody.f51553l, pushBody.f51552k);
            } else if (i2 == 1) {
                notification = m40960a(builder, context, pushBody.f51553l, pushBody.f51552k, bitmap);
            } else if (i2 != 2) {
                notification = m40959a(builder, context, pushBody.f51553l, pushBody.f51552k);
            } else {
                builder.setContentTitle(pushBody.f51553l).setContentText(pushBody.f51552k).setLargeIcon(bitmap);
                notification = builder.build();
            }
            if (pushBody.f51558q) {
                notification.defaults |= 1;
            }
            if (pushBody.f51559r) {
                try {
                    int ringerMode = ((AudioManager) m40961a(context, DataType.AUDIO)).getRingerMode();
                    if (ringerMode == 1 || ringerMode == 2) {
                        notification.defaults |= 2;
                    }
                } catch (Throwable unused) {
                }
            }
            return notification;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static Notification m40960a(Notification.Builder builder, Context context, String str, String str2, Bitmap bitmap) {
        Bitmap bitmap2;
        try {
            bitmap2 = BitmapFactory.decodeResource(context.getResources(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap2 = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText(str2).setBigContentTitle(str);
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bigContentTitle = bigContentTitle.bigLargeIcon(bitmap2);
        }
        contentText.setStyle(bigContentTitle).setLargeIcon(bitmap);
        return contentText.build();
    }
}
