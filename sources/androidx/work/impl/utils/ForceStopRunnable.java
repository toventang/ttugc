package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.AbstractC1600g;
import androidx.work.impl.C1681d;
import androidx.work.impl.C1687f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p073b.AbstractC1645h;
import androidx.work.impl.p073b.C1642g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.C34397az;
import com.p2082ss.android.ugc.aweme.C34769bb;
import com.p2082ss.android.ugc.aweme.C40930db;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: a */
    private static final String f5473a = AbstractC1600g.m5318a("ForceStopRunnable");

    /* renamed from: b */
    private static final long f5474b = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c */
    private final Context f5475c;

    /* renamed from: d */
    private final C1687f f5476d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f5477a = AbstractC1600g.m5318a("ForceStopRunnable$Rcvr");

        static {
            Covode.recordClassIndex(1859);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                AbstractC1600g.m5317a();
                ForceStopRunnable.m5554a(context);
            }
        }
    }

    /* renamed from: c */
    private boolean m5557c() {
        return this.f5476d.f5436g.mo5509a();
    }

    static {
        Covode.recordClassIndex(1858);
    }

    /* renamed from: b */
    private boolean m5556b() {
        if (m5551a(this.f5475c, 536870912) != null) {
            return false;
        }
        m5554a(this.f5475c);
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m5553a() {
        if (m5557c()) {
            AbstractC1600g.m5317a();
            this.f5476d.mo5470c();
            this.f5476d.f5436g.mo5508a(false);
        } else if (m5556b()) {
            AbstractC1600g.m5317a();
            this.f5476d.mo5470c();
        } else {
            WorkDatabase workDatabase = this.f5476d.f5432c;
            AbstractC1645h i = workDatabase.mo5366i();
            try {
                workDatabase.mo5091e();
                List<C1642g> d = i.mo5440d();
                if (!d.isEmpty()) {
                    AbstractC1600g.m5317a();
                    for (C1642g gVar : d) {
                        i.mo5436b(gVar.f5306a, -1);
                    }
                    C1681d.m5529a(this.f5476d.f5431b, workDatabase, this.f5476d.f5434e);
                }
                workDatabase.mo5093g();
                workDatabase.mo5092f();
                AbstractC1600g.m5317a();
            } catch (Throwable th) {
                workDatabase.mo5092f();
                throw th;
            }
        }
        this.f5476d.mo5471d();
    }

    public final void run() {
        File file;
        File file2;
        try {
            m5553a();
            return;
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteFullException e) {
            if (C40930db.f95760a) {
                C40930db.f95760a = false;
                Context a = C17867d.m33078a();
                if (SettingsManager.m29616a().mo25400a("tt_disk_usage_monitor", true)) {
                    if (C58016d.f132222c == null || !C58016d.f132224e) {
                        C58016d.f132222c = a.getFilesDir();
                    }
                    File file3 = C58016d.f132222c;
                    if (file3 == null) {
                        file = null;
                    } else {
                        file = file3.getParentFile();
                    }
                    C34769bb.m71011a(file, "internal");
                    if (!TextUtils.isEmpty("")) {
                        file2 = a.getExternalFilesDir("");
                    } else {
                        if (C58016d.f132223d == null || !C58016d.f132224e) {
                            C58016d.f132223d = a.getExternalFilesDir("");
                        }
                        file2 = C58016d.f132223d;
                    }
                    C34769bb.m71011a(file2, "outside");
                }
            }
        } catch (Throwable unused) {
        }
        if (C34397az.m70389b()) {
            m5553a();
            return;
        }
        throw e;
    }

    /* renamed from: b */
    private static Intent m5555b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: a */
    static void m5554a(Context context) {
        AlarmManager alarmManager = (AlarmManager) m5552a(context, "alarm");
        PendingIntent a = m5551a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5474b;
        if (alarmManager != null) {
            int i = Build.VERSION.SDK_INT;
            alarmManager.setExact(0, currentTimeMillis, a);
        }
    }

    /* renamed from: a */
    private static PendingIntent m5551a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m5555b(context), i);
    }

    public ForceStopRunnable(Context context, C1687f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5475c = applicationContext;
        this.f5476d = fVar;
    }

    /* renamed from: a */
    private static Object m5552a(Context context, String str) {
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
}
