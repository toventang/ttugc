package com.p2082ss.android.socialbase.downloader.impls;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2178a.C30283a;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.impls.r */
public class C30506r implements Handler.Callback, C30283a.AbstractC30285a {

    /* renamed from: e */
    private static volatile C30506r f72730e;

    /* renamed from: i */
    private static AbstractC30512b f72731i;

    /* renamed from: a */
    public final Context f72732a = C30399c.m61674B();

    /* renamed from: b */
    public final SparseArray<C30511a> f72733b = new SparseArray<>();

    /* renamed from: c */
    public int f72734c = 0;

    /* renamed from: d */
    public ConnectivityManager f72735d;

    /* renamed from: f */
    private final Handler f72736f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g */
    private final boolean f72737g;

    /* renamed from: h */
    private long f72738h;

    /* renamed from: com.ss.android.socialbase.downloader.impls.r$b */
    public interface AbstractC30512b {
        static {
            Covode.recordClassIndex(37040);
        }
    }

    static {
        Covode.recordClassIndex(37034);
    }

    /* renamed from: a */
    public final void mo54317a(DownloadInfo downloadInfo, boolean z, int i) {
        MethodCollector.m26663i(9293);
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            MethodCollector.m26664o(9293);
            return;
        }
        C30511a a = m62436a(downloadInfo.getId());
        if (a.f72754i.get() > a.f72748c) {
            C30434a.m62029d("RetryScheduler", "tryStartScheduleRetry, id = " + a.f72746a + ", mRetryCount = " + a.f72754i + ", maxCount = " + a.f72748c);
            MethodCollector.m26664o(9293);
            return;
        }
        int errorCode = failedException.getErrorCode();
        if (!C30535g.m62596c(failedException) && !C30535g.m62601d(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
            if (!m62438a(a, errorCode)) {
                MethodCollector.m26664o(9293);
                return;
            }
            C30434a.m62028c("RetryScheduler", "allow error code, id = " + a.f72746a + ", error code = " + errorCode);
        }
        a.f72755j = z;
        synchronized (this.f72733b) {
            try {
                if (!a.f72757l) {
                    a.f72757l = true;
                    this.f72734c++;
                }
            } finally {
                MethodCollector.m26664o(9293);
            }
        }
        int i2 = a.f72753h.get();
        C30434a.m62028c("RetryScheduler", "tryStartScheduleRetry: id = " + a.f72746a + ", delayTimeMills = " + i2 + ", mWaitingRetryTasks = " + this.f72734c);
        if (a.f72751f) {
            if (i == 0) {
                a.mo54328c();
            }
            if (this.f72737g) {
                a.mo54326a(System.currentTimeMillis());
                a.mo54327b();
                a.mo54325a();
            }
        } else if (z) {
            MethodCollector.m26664o(9293);
        } else {
            this.f72736f.removeMessages(downloadInfo.getId());
            this.f72736f.sendEmptyMessageDelayed(downloadInfo.getId(), (long) i2);
            MethodCollector.m26664o(9293);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.impls.r$a */
    public static class C30511a {

        /* renamed from: a */
        final int f72746a;

        /* renamed from: b */
        final int f72747b;

        /* renamed from: c */
        final int f72748c;

        /* renamed from: d */
        final int f72749d;

        /* renamed from: e */
        final int f72750e;

        /* renamed from: f */
        final boolean f72751f;

        /* renamed from: g */
        final int[] f72752g;

        /* renamed from: h */
        AtomicInteger f72753h;

        /* renamed from: i */
        public AtomicInteger f72754i;

        /* renamed from: j */
        public boolean f72755j;

        /* renamed from: k */
        AtomicLong f72756k;

        /* renamed from: l */
        public boolean f72757l;

        static {
            Covode.recordClassIndex(37039);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo54325a() {
            this.f72753h.addAndGet(this.f72750e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo54327b() {
            this.f72754i.incrementAndGet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo54328c() {
            this.f72753h.set(this.f72749d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo54326a(long j) {
            this.f72756k.set(j);
        }

        C30511a(int i, int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
            i4 = i4 < 3000 ? 3000 : i4;
            i5 = i5 < 5000 ? 5000 : i5;
            this.f72746a = i;
            this.f72747b = i2;
            this.f72748c = i3;
            this.f72749d = i4;
            this.f72750e = i5;
            this.f72751f = z;
            this.f72752g = iArr;
            this.f72753h = new AtomicInteger(i4);
            this.f72756k = new AtomicLong(0);
            this.f72754i = new AtomicInteger(0);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2178a.C30283a.AbstractC30285a
    /* renamed from: a */
    public final void mo53753a() {
        mo54316a(4, false);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2178a.C30283a.AbstractC30285a
    /* renamed from: b */
    public final void mo53754b() {
        mo54316a(3, false);
    }

    /* renamed from: d */
    public final void mo54318d() {
        mo54316a(2, true);
    }

    /* renamed from: c */
    public static C30506r m62442c() {
        MethodCollector.m26663i(9148);
        if (f72730e == null) {
            synchronized (C30506r.class) {
                try {
                    if (f72730e == null) {
                        f72730e = new C30506r();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9148);
                    throw th;
                }
            }
        }
        C30506r rVar = f72730e;
        MethodCollector.m26664o(9148);
        return rVar;
    }

    /* renamed from: e */
    public final int mo54319e() {
        try {
            if (this.f72735d == null) {
                Context applicationContext = this.f72732a.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                this.f72735d = (ConnectivityManager) m62437a(applicationContext, "connectivity");
            }
            NetworkInfo a = m62435a(this.f72735d);
            if (a != null) {
                if (a.isConnected()) {
                    if (a.getType() == 1) {
                        return 2;
                    }
                    return 1;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    private C30506r() {
        MethodCollector.m26663i(9145);
        if (C30472a.f72639a.mo54258a("use_network_callback", 0) == 1) {
            C30399c.m61721g().execute(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.impls.C30506r.RunnableC305071 */

                static {
                    Covode.recordClassIndex(37035);
                }

                public final void run() {
                    try {
                        if (C30506r.this.f72732a != null && Build.VERSION.SDK_INT >= 21) {
                            C30506r rVar = C30506r.this;
                            Context applicationContext = rVar.f72732a.getApplicationContext();
                            if (C58003a.f132201c) {
                                if (applicationContext == null) {
                                    applicationContext = C58003a.f132199a;
                                }
                            }
                            rVar.f72735d = (ConnectivityManager) m62450a(applicationContext, "connectivity");
                            C30506r.this.f72735d.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() {
                                /* class com.p2082ss.android.socialbase.downloader.impls.C30506r.RunnableC305071.C305081 */

                                static {
                                    Covode.recordClassIndex(37036);
                                }

                                public final void onAvailable(Network network) {
                                    C30434a.m62027b("RetryScheduler", "network onAvailable: ");
                                    C30506r.this.mo54316a(1, true);
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                /* renamed from: a */
                private static Object m62450a(Context context, String str) {
                    Object obj;
                    MethodCollector.m26663i(7503);
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
                                MethodCollector.m26664o(7503);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }
            });
        }
        this.f72737g = C30535g.m62594c();
        C30283a aVar = C30283a.C30286b.f72251a;
        synchronized (aVar.f72244b) {
            try {
                if (!aVar.f72244b.contains(this)) {
                    aVar.f72244b.add(this);
                }
            } finally {
                MethodCollector.m26664o(9145);
            }
        }
    }

    /* renamed from: a */
    private static NetworkInfo m62435a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    private void m62441b(int i) {
        MethodCollector.m26663i(9756);
        synchronized (this.f72733b) {
            try {
                this.f72733b.remove(i);
            } finally {
                MethodCollector.m26664o(9756);
            }
        }
    }

    /* renamed from: a */
    private static int[] m62440a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean handleMessage(Message message) {
        final boolean z;
        if (message.what == 0) {
            final int i = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            } else {
                z = false;
            }
            C30399c.m61721g().execute(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.impls.C30506r.RunnableC305092 */

                static {
                    Covode.recordClassIndex(37037);
                }

                public final void run() {
                    MethodCollector.m26663i(9075);
                    try {
                        if (C30506r.this.f72734c <= 0) {
                            MethodCollector.m26664o(9075);
                            return;
                        }
                        int e = C30506r.this.mo54319e();
                        if (e == 0) {
                            MethodCollector.m26664o(9075);
                            return;
                        }
                        C30434a.m62028c("RetryScheduler", "doScheduleAllTaskRetry: mWaitingRetryTasksCount = " + C30506r.this.f72734c);
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList<C30511a> arrayList = new ArrayList();
                        synchronized (C30506r.this.f72733b) {
                            for (int i = 0; i < C30506r.this.f72733b.size(); i++) {
                                try {
                                    C30511a valueAt = C30506r.this.f72733b.valueAt(i);
                                    if (valueAt != null) {
                                        int i2 = i;
                                        boolean z = z;
                                        if (!valueAt.f72757l) {
                                            C30434a.m62028c("RetryScheduler", "canRetry: mIsWaitingRetry is false, return false!!!");
                                        } else if (valueAt.f72747b >= i2) {
                                            if (valueAt.f72754i.get() < valueAt.f72748c) {
                                                if (!valueAt.f72755j || e == 2) {
                                                    if (z || currentTimeMillis - valueAt.f72756k.get() >= ((long) valueAt.f72749d)) {
                                                        if (z) {
                                                            valueAt.mo54328c();
                                                        }
                                                        arrayList.add(valueAt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    MethodCollector.m26664o(9075);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            for (C30511a aVar : arrayList) {
                                C30506r.this.mo54315a(aVar.f72746a, e, false);
                            }
                        }
                    } catch (Exception unused) {
                        MethodCollector.m26664o(9075);
                    }
                }
            });
        } else {
            C30434a.m62028c("RetryScheduler", "handleMessage, doSchedulerRetry, id = " + message.what);
            final int i2 = message.what;
            C30399c.m61721g().execute(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.impls.C30506r.RunnableC305103 */

                static {
                    Covode.recordClassIndex(37038);
                }

                public final void run() {
                    try {
                        C30506r rVar = C30506r.this;
                        rVar.mo54315a(i2, rVar.mo54319e(), true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    private C30511a m62436a(int i) {
        int i2;
        int i3;
        MethodCollector.m26663i(9754);
        C30511a aVar = this.f72733b.get(i);
        if (aVar == null) {
            synchronized (this.f72733b) {
                try {
                    aVar = this.f72733b.get(i);
                    if (aVar == null) {
                        int[] iArr = null;
                        C30472a a = C30472a.m62087a(i, (DownloadInfo) null);
                        boolean z = false;
                        int a2 = a.mo54258a("retry_schedule", 0);
                        JSONObject a3 = a.mo54261a("retry_schedule_config");
                        int i4 = 60;
                        if (a3 != null) {
                            i2 = a3.optInt("max_count", 60);
                            int optInt = a3.optInt("interval_sec", 60);
                            i3 = a3.optInt("interval_sec_acceleration", 60);
                            if (Build.VERSION.SDK_INT >= 21 && f72731i != null && a3.optInt("use_job_scheduler", 0) == 1) {
                                z = true;
                            }
                            iArr = m62440a(a3.optString("allow_error_code"));
                            i4 = optInt;
                        } else {
                            i3 = 60;
                            i2 = 60;
                            z = false;
                        }
                        aVar = new C30511a(i, a2, i2, i4 * 1000, i3 * 1000, z, iArr);
                    }
                    this.f72733b.put(i, aVar);
                } finally {
                    MethodCollector.m26664o(9754);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static boolean m62438a(C30511a aVar, int i) {
        int[] iArr = aVar.f72752g;
        if (!(iArr == null || iArr.length == 0)) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Object m62437a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9760);
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
                    MethodCollector.m26664o(9760);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static boolean m62439a(DownloadInfo downloadInfo, BaseException baseException) {
        long j;
        long totalBytes;
        try {
            j = C30535g.m62571b(downloadInfo.getTempPath());
        } catch (BaseException e) {
            e.printStackTrace();
            j = 0;
        }
        if (baseException instanceof DownloadOutOfSpaceException) {
            totalBytes = ((DownloadOutOfSpaceException) baseException).getRequiredSpaceBytes();
        } else {
            totalBytes = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j < totalBytes) {
            C30472a a = C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null);
            if (a.mo54258a("space_fill_part_download", 0) == 1) {
                if (j > 0) {
                    int a2 = a.mo54258a("space_fill_min_keep_mb", 100);
                    if (a2 > 0) {
                        long j2 = j - (((long) a2) * 1048576);
                        StringBuilder sb = new StringBuilder("retry schedule: available = ");
                        double d = (double) j;
                        Double.isNaN(d);
                        StringBuilder append = sb.append(d / 1048576.0d).append("MB, minKeep = ").append(a2).append("MB, canDownload = ");
                        double d2 = (double) j2;
                        Double.isNaN(d2);
                        C30434a.m62028c("RetryScheduler", append.append(d2 / 1048576.0d).append("MB").toString());
                        if (j2 <= 0) {
                            C30434a.m62029d("RetryScheduler", "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                            return false;
                        }
                    }
                } else if (a.mo54258a("download_when_space_negative", 0) != 1) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62028c("RetryScheduler", "scheduleAllTaskRetry, level = [" + r9 + "], force = [" + r10 + "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r10 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r8.f72736f.removeMessages(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r3 = android.os.Message.obtain();
        r3.what = 0;
        r3.arg1 = r9;
        r3.arg2 = r10 ? 1 : 0;
        r8.f72736f.sendMessageDelayed(r3, com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9448);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54316a(int r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.impls.C30506r.mo54316a(int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62028c("RetryScheduler", "doSchedulerRetryInSubThread: downloadId = " + r10 + ", retryCount = " + r6.f72754i + ", mWaitingRetryTasksCount = " + r9.f72734c);
        r2 = com.p2082ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3).getDownloadInfo(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r2 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        m62441b(r10);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62030e("RetryScheduler", "doSchedulerRetryInSubThread，id:".concat(java.lang.String.valueOf(r10)));
        r5 = r2.getRealStatus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r5 == -3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r5 != -4) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        m62441b(r10);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r5 == -5) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r5 != -2) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r2.isPauseReserveOnWifi() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        com.p2082ss.android.socialbase.downloader.downloader.Downloader.getInstance(com.p2082ss.android.socialbase.downloader.downloader.C30399c.m61674B()).getReserveWifiStatusListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (com.p2082ss.android.socialbase.downloader.downloader.C30399c.m61732p() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        java.util.Collections.singletonList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        m62441b(r10);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (r5 == -1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r11 != 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        if (r6.f72751f == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        r1 = r2.getFailedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c7, code lost:
        if (r5 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62596c(r1) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        r5 = m62439a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        r6.mo54327b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        if (r5 == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62028c("RetryScheduler", "doSchedulerRetry: restart task, ****** id = " + r6.f72746a);
        r6.mo54326a(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r12 == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        r6.mo54325a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fa, code lost:
        r2.setRetryScheduleCount(r6.f72754i.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0107, code lost:
        if (r2.getStatus() != -1) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0109, code lost:
        com.p2082ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3).restart(r2.getId());
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0118, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011a, code lost:
        if (r12 == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        r6.mo54325a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0123, code lost:
        if (r2.isOnlyWifi() != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0129, code lost:
        if (r2.isPauseReserveOnWifi() == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        mo54317a(r2, r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0132, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0134, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9607);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0137, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54315a(int r10, int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.impls.C30506r.mo54315a(int, int, boolean):void");
    }
}
