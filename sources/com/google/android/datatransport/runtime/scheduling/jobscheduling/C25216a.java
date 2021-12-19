package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1924a.C25118a;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public final class C25216a implements AbstractC25239s {

    /* renamed from: a */
    private final Context f59704a;

    /* renamed from: b */
    private final AbstractC25182c f59705b;

    /* renamed from: c */
    private AlarmManager f59706c;

    /* renamed from: d */
    private final AbstractC25223g f59707d;

    /* renamed from: e */
    private final AbstractC25148a f59708e;

    static {
        Covode.recordClassIndex(30584);
    }

    /* renamed from: a */
    private static Object m48360a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3301);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3301);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25239s
    /* renamed from: a */
    public final void mo41192a(AbstractC25162k kVar, int i) {
        boolean z;
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", kVar.mo41119a());
        builder.appendQueryParameter("priority", String.valueOf(C25154a.m48224a(kVar.mo41121c())));
        if (kVar.mo41120b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(kVar.mo41120b(), 0));
        }
        Intent intent = new Intent(this.f59704a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (PendingIntent.getBroadcast(this.f59704a, 0, intent, 536870912) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C25118a.m48159a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", kVar);
            return;
        }
        long a = this.f59705b.mo41174a(kVar);
        long a2 = this.f59707d.mo41210a(kVar.mo41121c(), a, i);
        C25118a.m48160a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", kVar, Long.valueOf(a2), Long.valueOf(a), Integer.valueOf(i));
        this.f59706c.set(3, this.f59708e.mo41134a() + a2, PendingIntent.getBroadcast(this.f59704a, 0, intent, 0));
    }

    public C25216a(Context context, AbstractC25182c cVar, AbstractC25148a aVar, AbstractC25223g gVar) {
        this(context, cVar, (AlarmManager) m48360a(context, "alarm"), aVar, gVar);
    }

    private C25216a(Context context, AbstractC25182c cVar, AlarmManager alarmManager, AbstractC25148a aVar, AbstractC25223g gVar) {
        this.f59704a = context;
        this.f59705b = cVar;
        this.f59706c = alarmManager;
        this.f59708e = aVar;
        this.f59707d = gVar;
    }
}
