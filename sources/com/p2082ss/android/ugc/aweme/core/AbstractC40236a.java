package com.p2082ss.android.ugc.aweme.core;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.C33492am;
import com.p2082ss.android.ugc.aweme.experiment.C47024i;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80604o;
import com.p2082ss.android.ugc.aweme.utils.C80608p;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.core.a */
public abstract class AbstractC40236a extends AppWidgetProvider {

    /* renamed from: a */
    private final String f94443a = "AppWidgetDebugInfo";

    static {
        Covode.recordClassIndex(48037);
    }

    /* renamed from: a */
    public abstract int mo69440a();

    /* renamed from: b */
    public abstract int mo69441b();

    /* renamed from: c */
    public abstract int[] mo69442c();

    /* renamed from: d */
    public abstract float mo69443d();

    /* renamed from: e */
    public abstract String mo69444e();

    /* renamed from: f */
    public abstract int[] mo69445f();

    /* renamed from: g */
    public abstract int[] mo69446g();

    /* renamed from: com.ss.android.ugc.aweme.core.a$a */
    static final class RunnableC40237a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC40236a f94444a;

        /* renamed from: b */
        final /* synthetic */ Context f94445b;

        static {
            Covode.recordClassIndex(48038);
        }

        RunnableC40237a(AbstractC40236a aVar, Context context) {
            this.f94444a = aVar;
            this.f94445b = context;
        }

        public final void run() {
            AbstractC40236a aVar = this.f94444a;
            Context context = this.f94445b;
            aVar.mo69447a(context, aVar.mo69448a(context));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.core.a$b */
    static final class RunnableC40238b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC40236a f94446a;

        /* renamed from: b */
        final /* synthetic */ Context f94447b;

        /* renamed from: c */
        final /* synthetic */ int[] f94448c;

        static {
            Covode.recordClassIndex(48039);
        }

        RunnableC40238b(AbstractC40236a aVar, Context context, int[] iArr) {
            this.f94446a = aVar;
            this.f94447b = context;
            this.f94448c = iArr;
        }

        public final void run() {
            this.f94446a.mo69447a(this.f94447b, this.f94448c);
        }
    }

    /* renamed from: a */
    private void m81377a(String str) {
        C89219l.m154721d(str, "");
        mo69444e();
    }

    public void onDisabled(Context context) {
        C89219l.m154721d(context, "");
        super.onDisabled(context);
        C80608p.m139763a("disabled", mo69444e());
        m81377a("onDisabled");
    }

    public void onEnabled(Context context) {
        C89219l.m154721d(context, "");
        super.onEnabled(context);
        C80608p.m139763a("enable", mo69444e());
        m81377a("onEnabled");
    }

    /* renamed from: a */
    public final int[] mo69448a(Context context) {
        String name;
        int a = mo69440a();
        if (a == C33492am.f79562b) {
            name = SmallAppWidgetProvider.class.getName();
        } else if (a == C33492am.f79563c) {
            name = MediumAppWidgetProvider.class.getName();
        } else {
            name = LargeAppWidgetProvider.class.getName();
        }
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), name));
    }

    public void onDeleted(Context context, int[] iArr) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iArr, "");
        super.onDeleted(context, iArr);
        C80608p.m139763a("delete", mo69444e());
        m81377a("onDeleted -- " + iArr[0]);
    }

    public void onReceive(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        super.onReceive(context, intent);
        if (C89219l.m154714a((Object) intent.getAction(), (Object) C33492am.f79561a)) {
            m81377a("receieved check widgets state broadcast");
            if (C47024i.m90290c()) {
                mo69447a(context, mo69448a(context));
            } else {
                C40780g.m82246c().execute(new RunnableC40237a(this, context));
            }
        }
    }

    /* renamed from: a */
    private static Object m81376a(Context context, String str) {
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

    /* renamed from: a */
    public final void mo69447a(Context context, int[] iArr) {
        m81377a("try update");
        C80604o.m139752a(context, Integer.valueOf(mo69440a()), Integer.valueOf(mo69441b()), mo69442c(), Float.valueOf(mo69443d()), mo69448a(context), mo69444e(), mo69445f(), mo69446g());
        if (!C80580in.m139689d() && Build.VERSION.SDK_INT >= 21) {
            try {
                JobInfo.Builder builder = new JobInfo.Builder(11, new ComponentName(context, AppWidgetSchedulerService.class));
                builder.setMinimumLatency(3000);
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putInt("app_widget_action_type", 1);
                persistableBundle.putInt("app_widget_type", mo69440a());
                persistableBundle.putInt("app_widghet_layout_id", mo69441b());
                persistableBundle.putIntArray("app_widget_ids", iArr);
                persistableBundle.putIntArray("app_widget_video_cover_image_view_ids", mo69442c());
                persistableBundle.putIntArray("topic_cover_px_size", mo69445f());
                persistableBundle.putIntArray("video_cover_px_size", mo69446g());
                persistableBundle.putDouble("app_widget_video_cover_aspect_ratio", (double) mo69443d());
                persistableBundle.putString("app_log_desc", mo69444e());
                builder.setExtras(persistableBundle);
                JobInfo build = builder.build();
                Object a = m81376a(context, "jobscheduler");
                if (a != null) {
                    ((JobScheduler) a).schedule(build);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
            } catch (Throwable unused) {
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(appWidgetManager, "");
        C89219l.m154721d(iArr, "");
        m81377a("onUpdate");
        C80608p.m139763a("update", mo69444e());
        if (C47024i.m90290c()) {
            mo69447a(context, iArr);
        } else {
            C40780g.m82246c().execute(new RunnableC40238b(this, context, iArr));
        }
    }
}
