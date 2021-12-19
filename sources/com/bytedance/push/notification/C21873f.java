package com.bytedance.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.push.C21767c;
import com.bytedance.push.p1590c.AbstractC21775f;
import com.bytedance.push.p1590c.AbstractC21780k;
import com.bytedance.push.p1593f.C21799a;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.push.notification.f */
public final class C21873f implements AbstractC21775f {

    /* renamed from: a */
    final AbstractC21780k f51804a;

    static {
        Covode.recordClassIndex(25526);
    }

    /* renamed from: a */
    public static boolean m40992a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public C21873f(AbstractC21780k kVar) {
        this.f51804a = kVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21775f
    /* renamed from: a */
    public final void mo35430a(final Context context) {
        C30221b.m61148b();
        RunnableC13596e.m24423a(new Runnable() {
            /* class com.bytedance.push.notification.C21873f.RunnableC218741 */

            static {
                Covode.recordClassIndex(25527);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
                if (com.bytedance.push.notification.C21869e.f51801a.mo35557a(r2, ((com.bytedance.push.settings.LocalFrequencySettings) com.bytedance.push.settings.C21895h.m41120a(r2, com.bytedance.push.settings.LocalFrequencySettings.class)).mo35591h()) != false) goto L_0x0032;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 195
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C21873f.RunnableC218741.run():void");
            }
        });
    }

    /* renamed from: a */
    static boolean m40993a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = (NotificationManager) m40994b(context, "notification");
            if (notificationManager != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static Object m40994b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4597);
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
                    MethodCollector.m26664o(4597);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21775f
    /* renamed from: a */
    public final void mo35431a(final Context context, final C21767c.C21769b bVar) {
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.push.notification.C21873f.RunnableC218752 */

                static {
                    Covode.recordClassIndex(25528);
                }

                public final void run() {
                    C21767c.C21769b bVar = bVar;
                    String string = context.getString(R.string.ezl);
                    if (bVar == null) {
                        bVar = new C21767c.C21769b("push", string);
                    } else if (TextUtils.isEmpty(bVar.f51631b) || TextUtils.isEmpty(bVar.f51630a)) {
                        if (TextUtils.isEmpty(bVar.f51631b)) {
                            bVar.f51631b = "push";
                        }
                        if (TextUtils.isEmpty(bVar.f51630a)) {
                            bVar.f51630a = string;
                        }
                    }
                    String str = bVar.f51631b;
                    String str2 = bVar.f51630a;
                    NotificationManager notificationManager = (NotificationManager) m40998a(context, "notification");
                    if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
                        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.enableVibration(true);
                        notificationChannel.enableLights(true);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }

                /* renamed from: a */
                private static Object m40998a(Context context, String str) {
                    Object obj;
                    MethodCollector.m26663i(4644);
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
                                MethodCollector.m26664o(4644);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }
            });
        }
    }

    @Override // com.bytedance.push.p1590c.AbstractC21775f
    /* renamed from: a */
    public final void mo35432a(Context context, List<C21799a> list) {
        if (!C13603b.m24435a((Collection) list)) {
            for (C21799a aVar : list) {
                if (aVar != null) {
                    try {
                        if (aVar.f51657b) {
                            C21869e.f51801a.mo35556a(context, aVar);
                        } else if (!TextUtils.equals(aVar.f51658c, "push")) {
                            C21869e.f51801a.mo35559b(context, aVar);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
