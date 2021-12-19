package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.AbstractC1600g;
import androidx.work.impl.AbstractC1607a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.b */
public final class C1664b implements AbstractC1607a {

    /* renamed from: d */
    private static final String f5365d = AbstractC1600g.m5318a("CommandHandler");

    /* renamed from: a */
    final Context f5366a;

    /* renamed from: b */
    final Map<String, AbstractC1607a> f5367b = new HashMap();

    /* renamed from: c */
    final Object f5368c = new Object();

    static {
        Covode.recordClassIndex(1828);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo5449a() {
        boolean z;
        synchronized (this.f5368c) {
            if (!this.f5367b.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    static Bundle m5495a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Intent m5493a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    C1664b(Context context) {
        this.f5366a = context;
    }

    /* renamed from: a */
    static Intent m5494a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    static Intent m5498b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m5499c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: a */
    private static Object m5496a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m5497a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        int i = 0;
        while (m5496a(bundle, strArr[0]) != null) {
            i++;
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.work.impl.AbstractC1607a
    /* renamed from: a */
    public final void mo5376a(String str, boolean z) {
        synchronized (this.f5368c) {
            AbstractC1607a remove = this.f5367b.remove(str);
            if (remove != null) {
                remove.mo5376a(str, z);
            }
        }
    }
}
