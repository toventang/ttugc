package com.p2082ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2179b.C30291e;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.C30523g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.ss.android.socialbase.downloader.notification.DownloadNotificationService */
public class DownloadNotificationService extends Service {

    /* renamed from: a */
    public static volatile long f73002a;

    /* renamed from: b */
    public static boolean f73003b;

    /* renamed from: c */
    public static long f73004c = 900;

    /* renamed from: f */
    private static final String f73005f = DownloadNotificationService.class.getSimpleName();

    /* renamed from: g */
    private static int f73006g = -1;

    /* renamed from: h */
    private static int f73007h = -1;

    /* renamed from: i */
    private static boolean f73008i = true;

    /* renamed from: j */
    private static boolean f73009j = false;

    /* renamed from: k */
    private static volatile long f73010k;

    /* renamed from: d */
    public C30523g f73011d;

    /* renamed from: e */
    final SparseArray<Notification> f73012e = new SparseArray<>(2);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        C30523g gVar = this.f73011d;
        if (gVar != null) {
            try {
                gVar.f72821c.quit();
            } catch (Throwable unused) {
            }
            this.f73011d = null;
        }
    }

    static {
        Covode.recordClassIndex(37126);
    }

    public void onCreate() {
        super.onCreate();
        if (this.f73011d == null) {
            C30523g gVar = new C30523g("DownloaderNotifyThread");
            this.f73011d = gVar;
            gVar.f72821c.start();
        }
        C30399c.m61688a(this);
        C30472a aVar = C30472a.f72639a;
        int a = aVar.mo54258a("download_service_foreground", 0);
        if ((a == 1 || a == 3) && f73006g == -1) {
            f73006g = 0;
        }
        if ((a == 2 || a == 3) && f73007h == -1) {
            f73007h = 0;
        }
        f73009j = aVar.mo54262a("non_going_notification_foreground", false);
        f73003b = aVar.mo54262a("notify_too_fast", false);
        long a2 = aVar.mo54259a("notification_time_window", 900L);
        f73004c = a2;
        if (a2 < 0 || a2 > 1200) {
            f73004c = 900;
        }
    }

    /* renamed from: a */
    private static boolean m62767a(int i, Notification notification) {
        int i2;
        int i3;
        if (!f73008i || (i2 = f73006g) == i || (i3 = f73007h) == i) {
            return false;
        }
        if (i2 != 0 && i3 != 0) {
            return false;
        }
        if (f73009j && (notification.flags & 2) == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54809a(android.app.NotificationManager r8, int r9) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.mo54809a(android.app.NotificationManager, int):void");
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        C30523g gVar;
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        if (intent == null) {
            return 2;
        }
        final String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (gVar = this.f73011d) == null) {
            return 2;
        }
        gVar.mo54361a(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.RunnableC305941 */

            static {
                Covode.recordClassIndex(37127);
            }

            public final void run() {
                ConnectivityManager connectivityManager;
                NetworkInfo a;
                long j;
                final NotificationManager notificationManager = (NotificationManager) m62772a(DownloadNotificationService.this, "notification");
                final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                    final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                    int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                    if (intExtra != 0 && notification != null && notificationManager != null) {
                        if (intExtra2 == 4) {
                            if (Downloader.getInstance(C30399c.m61674B()).isDownloading(intExtra)) {
                                DownloadInfo downloadInfo = Downloader.getInstance(C30399c.m61674B()).getDownloadInfo(intExtra);
                                if (DownloadNotificationService.f73003b) {
                                    if (downloadInfo != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.f73002a > DownloadNotificationService.f73004c) {
                                        DownloadNotificationService.this.mo54811b(notificationManager, intExtra, notification);
                                        downloadInfo.setLastNotifyProgressTime();
                                    }
                                } else if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                                    DownloadNotificationService.this.mo54811b(notificationManager, intExtra, notification);
                                    downloadInfo.setLastNotifyProgressTime();
                                }
                            }
                        } else if (intExtra2 == -2 || intExtra2 == -3) {
                            if (DownloadNotificationService.f73003b) {
                                DownloadNotificationService.this.mo54810a(notificationManager, intExtra, notification);
                            } else if (DownloadNotificationService.this.f73011d != null) {
                                C30523g gVar = DownloadNotificationService.this.f73011d;
                                RunnableC305951 r2 = new Runnable() {
                                    /* class com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.RunnableC305941.RunnableC305951 */

                                    static {
                                        Covode.recordClassIndex(37128);
                                    }

                                    public final void run() {
                                        DownloadNotificationService.this.mo54811b(notificationManager, intExtra, notification);
                                    }
                                };
                                if (intExtra2 == -2) {
                                    j = 50;
                                } else {
                                    j = 200;
                                }
                                gVar.mo54361a(r2, j);
                            }
                        } else if (DownloadNotificationService.f73003b) {
                            DownloadNotificationService.this.mo54810a(notificationManager, intExtra, notification);
                        } else {
                            DownloadNotificationService.this.mo54811b(notificationManager, intExtra, notification);
                        }
                    }
                } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                    if (intExtra != 0) {
                        DownloadNotificationService.this.mo54809a(notificationManager, intExtra);
                    }
                } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        if (C30535g.m62562a(DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) m62772a(DownloadNotificationService.this, "connectivity")) != null && (a = m62771a(connectivityManager)) != null) {
                            if (a.isConnected()) {
                                ArrayList arrayList = new ArrayList();
                                if (!TextUtils.isEmpty(C30291e.f72261a)) {
                                    arrayList.add(C30291e.f72261a);
                                }
                                arrayList.add("mime_type_plg");
                                Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                                if (C58003a.f132201c) {
                                    if (applicationContext != null) {
                                        Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                        Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                                    }
                                    applicationContext = C58003a.f132199a;
                                }
                                if (applicationContext == null) {
                                    return;
                                }
                                Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }

            /* renamed from: a */
            private static NetworkInfo m62771a(ConnectivityManager connectivityManager) {
                try {
                    return connectivityManager.getActiveNetworkInfo();
                } catch (Exception e) {
                    C51423a.m95790a((Throwable) e);
                    return C61338a.m111034a();
                }
            }

            /* renamed from: a */
            private static Object m62772a(DownloadNotificationService downloadNotificationService, String str) {
                Object obj;
                MethodCollector.m26663i(8279);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!C58027i.f132247b && "connectivity".equals(str)) {
                        try {
                            new C21708b().mo35361a();
                            C58027i.f132247b = true;
                            obj = downloadNotificationService.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = downloadNotificationService.getSystemService(str);
                } else if (C58027i.f132246a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = downloadNotificationService.getSystemService(str);
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
                            MethodCollector.m26664o(8279);
                        }
                    }
                } else {
                    obj = downloadNotificationService.getSystemService(str);
                }
                return obj;
            }
        }, 0);
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0 = com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.f73004c - (java.lang.System.currentTimeMillis() - com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.f73010k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r2 = java.lang.System.currentTimeMillis() + r0;
        com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.f73002a = r2;
        com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.f73010k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0 > 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        mo54811b(r9, r10, r11);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8442);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0 <= 20000) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = 20000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r8.f73011d == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r3 = r8.f73012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r8.f73012e.put(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8442);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r8.f73011d.mo54361a(new com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.RunnableC305962(r8), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54810a(final android.app.NotificationManager r9, final int r10, android.app.Notification r11) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.mo54810a(android.app.NotificationManager, int, android.app.Notification):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(5:2|3|(2:14|(1:16))(1:7)|9|(1:21)(3:13|(1:18)(1:19)|20))(2:22|(1:30))|31|32|(1:34)|35|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.f73007h == 0) goto L_0x001d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[Catch:{ all -> 0x0095 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54811b(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.notification.DownloadNotificationService.mo54811b(android.app.NotificationManager, int, android.app.Notification):void");
    }
}
