package com.p2082ss.android.ugc.trill.abtest.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.C0595i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.abtest.AbstractC85070a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.b */
public final class C85076b extends AbstractC85070a<Boolean> {
    static {
        Covode.recordClassIndex(99098);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.trill.abtest.AbstractC85070a
    /* renamed from: a */
    public final /* synthetic */ Boolean mo130009a() {
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.trill.abtest.AbstractC85070a
    /* renamed from: a */
    public final /* synthetic */ boolean mo130010a(Boolean bool) {
        Boolean bool2 = bool;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) m146278a(C17867d.m33078a(), "notification");
            if (notificationManager.getNotificationChannel("AttractUserWithoutLoginHome") != null) {
                notificationManager.deleteNotificationChannel("AttractUserWithoutLoginHome");
            }
        }
        if (C31575b.m65865g().isLogin() || C33842s.C33843a.f80132a.mo60069m().mo59941c().booleanValue() || !bool2.booleanValue()) {
            return false;
        }
        NotificationManager notificationManager2 = (NotificationManager) m146278a(C17867d.m33078a(), "notification");
        Intent intent = new Intent(C17867d.m33078a(), NotificationBroadcastReceiver.class);
        intent.setAction("notification_clicked");
        intent.putExtra(StringSet.type, 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(C17867d.m33078a(), 0, intent, 1073741824);
        if (Build.VERSION.SDK_INT >= 26) {
            String string = C17867d.m33078a().getString(R.string.foo);
            if (Build.VERSION.SDK_INT >= 26 && notificationManager2 != null && notificationManager2.getNotificationChannel("other_channel") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("other_channel", string, 4);
                notificationChannel.enableLights(true);
                notificationChannel.enableVibration(true);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(true);
                notificationChannel.setLightColor(-16711936);
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
        C0595i.C0600e eVar = new C0595i.C0600e(C17867d.m33078a(), "other_channel");
        if (Build.VERSION.SDK_INT > 20) {
            eVar.mo2605a(2131233907);
        } else {
            eVar.mo2605a(R.drawable.status_icon);
        }
        Drawable drawable = C17867d.m33078a().getResources().getDrawable(R.drawable.bmx);
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        eVar.mo2610a(bitmap).mo2613a((CharSequence) C17867d.m33078a().getString(R.string.ua)).mo2621b(C17867d.m33078a().getString(R.string.vi));
        eVar.f2523f = broadcast;
        if (notificationManager2 != null) {
            notificationManager2.notify(1, eVar.mo2626d());
        }
        C33842s.C33843a.f80132a.mo60069m().mo59940b(true);
        C39162r.onEvent(MobClick.obtain().setLabelName("show").setEventName("recall_push"));
        return true;
    }

    /* renamed from: a */
    private static Object m146278a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2025);
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
                    MethodCollector.m26664o(2025);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
