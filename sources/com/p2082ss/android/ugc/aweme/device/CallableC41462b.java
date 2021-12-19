package com.p2082ss.android.ugc.aweme.device;

import android.content.Context;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.device.C41459a;
import com.p2082ss.android.ugc.aweme.utils.C80261bq;
import java.util.concurrent.Callable;
import p078c.p080b.C1756d;

/* renamed from: com.ss.android.ugc.aweme.device.b */
final /* synthetic */ class CallableC41462b implements Callable {

    /* renamed from: a */
    private final Context f96709a;

    static {
        Covode.recordClassIndex(49361);
    }

    CallableC41462b(Context context) {
        this.f96709a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        Context context = this.f96709a;
        C41459a.C41461a aVar = new C41459a.C41461a();
        C80261bq.C80263a aVar2 = new C80261bq.C80263a();
        aVar2.f179744a = C80261bq.m139126c();
        aVar2.f179745b = C80261bq.m139121b() * 1000;
        aVar2.f179746c = C80261bq.m139114a();
        aVar.f96705a = aVar2;
        C80261bq.C80265c cVar = new C80261bq.C80265c();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C80261bq.m139119a(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            cVar.f179749a = displayMetrics.densityDpi;
            cVar.f179750b = displayMetrics.widthPixels;
            cVar.f179751c = displayMetrics.heightPixels;
            cVar.f179752d = displayMetrics.xdpi;
            cVar.f179753e = displayMetrics.ydpi;
        }
        aVar.f96706b = cVar;
        C80261bq.C80266d dVar = new C80261bq.C80266d();
        dVar.f179758e = C80261bq.m139130e(context);
        dVar.f179754a = C80261bq.m139127d(context);
        long j2 = -1;
        if (Environment.getDataDirectory() != null) {
            j = C80261bq.m139118a(Environment.getDataDirectory().getPath());
        } else {
            j = -1;
        }
        dVar.f179756c = j;
        long c = C1756d.m5897c(context);
        if (c == -1) {
            c = -1;
        }
        dVar.f179755b = c;
        if (Environment.getDataDirectory() != null) {
            j2 = C80261bq.m139123b(Environment.getDataDirectory().getPath());
        }
        dVar.f179757d = j2;
        dVar.f179759f = C80261bq.m139124c(context);
        aVar.f96707c = dVar;
        C80261bq.C80264b bVar = new C80261bq.C80264b();
        bVar.f179747a = C80261bq.m139116a(context);
        bVar.f179748b = C80261bq.m139122b(context);
        aVar.f96708d = bVar;
        return aVar;
    }
}
