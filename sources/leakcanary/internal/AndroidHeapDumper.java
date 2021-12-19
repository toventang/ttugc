package leakcanary.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.C89851k;
import leakcanary.internal.InternalLeakCanary;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4645m.C89863a;

public final class AndroidHeapDumper implements AbstractC89841h {
    public static final C89807a Companion = new C89807a((byte) 0);
    private final Context context;
    private final C89851k leakDirectoryProvider;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public Activity resumedActivity;

    static {
        Covode.recordClassIndex(105901);
    }

    /* renamed from: leakcanary.internal.AndroidHeapDumper$a */
    public static final class C89807a {
        static {
            Covode.recordClassIndex(105903);
        }

        private C89807a() {
        }

        public /* synthetic */ C89807a(byte b) {
            this();
        }
    }

    /* renamed from: leakcanary.internal.AndroidHeapDumper$c */
    public static final class C89809c implements AbstractC89842i {

        /* renamed from: a */
        final /* synthetic */ AndroidHeapDumper f203658a;

        /* renamed from: b */
        final /* synthetic */ File f203659b;

        /* renamed from: c */
        final /* synthetic */ Toast f203660c;

        /* renamed from: d */
        final /* synthetic */ NotificationManager f203661d;

        static {
            Covode.recordClassIndex(105905);
        }

        @Override // leakcanary.internal.AbstractC89842i
        /* renamed from: a */
        public final File mo144382a() {
            return this.f203659b;
        }

        @Override // leakcanary.internal.AbstractC89842i
        /* renamed from: b */
        public final void mo144383b() {
            this.f203658a.cancelToast(this.f203660c);
            this.f203661d.cancel(-1000000);
        }

        C89809c(AndroidHeapDumper androidHeapDumper, File file, Toast toast, NotificationManager notificationManager) {
            this.f203658a = androidHeapDumper;
            this.f203659b = file;
            this.f203660c = toast;
            this.f203661d = notificationManager;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.AndroidHeapDumper$b */
    public static final class RunnableC89808b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Toast f203657a;

        static {
            Covode.recordClassIndex(105904);
        }

        RunnableC89808b(Toast toast) {
            this.f203657a = toast;
        }

        public final void run() {
            this.f203657a.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.AndroidHeapDumper$d */
    public static final class RunnableC89810d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AndroidHeapDumper f203662a;

        /* renamed from: b */
        final /* synthetic */ C89828e f203663b;

        static {
            Covode.recordClassIndex(105906);
        }

        RunnableC89810d(AndroidHeapDumper androidHeapDumper, C89828e eVar) {
            this.f203662a = androidHeapDumper;
            this.f203663b = eVar;
        }

        public final void run() {
            View view;
            MethodCollector.m26663i(4915);
            Activity activity = this.f203662a.resumedActivity;
            if (activity == null) {
                this.f203663b.mo144415a((Object) null);
                MethodCollector.m26664o(4915);
                return;
            }
            Context applicationContext = activity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            final Toast makeText = Toast.makeText(applicationContext, "LeakDetector is dumping the heap", 1);
            makeText.setGravity(16, 0, -128);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
            C89219l.m154709a((Object) makeText, "");
            if (Build.VERSION.SDK_INT >= 30) {
                view = new View(C17867d.m33078a());
            } else {
                view = makeText.getView();
            }
            C89219l.m154709a((Object) view, "");
            view.setTranslationY(-128.0f);
            view.animate().translationY(0.0f).setListener(new AnimatorListenerAdapter(this) {
                /* class leakcanary.internal.AndroidHeapDumper.RunnableC89810d.C898111 */

                /* renamed from: a */
                final /* synthetic */ RunnableC89810d f203664a;

                static {
                    Covode.recordClassIndex(105907);
                }

                public final void onAnimationEnd(Animator animator) {
                    C89219l.m154719c(animator, "");
                    this.f203664a.f203663b.mo144415a(makeText);
                }

                {
                    this.f203664a = r1;
                }
            });
            MethodCollector.m26664o(4915);
        }
    }

    @Override // leakcanary.internal.AbstractC89841h
    public final AbstractC89842i dumpHeap() {
        C89851k kVar = this.leakDirectoryProvider;
        C89851k.C89854c cVar = C89851k.C89854c.f203747a;
        C89219l.m154719c(cVar, "");
        if (!kVar.mo144434a()) {
            kVar.f203743b.invoke().booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = kVar.mo144435b().listFiles(cVar);
        if (listFiles != null) {
            C89070n.m154536a((Collection) arrayList, (Object[]) listFiles);
        }
        File[] listFiles2 = kVar.mo144436c().listFiles(cVar);
        if (listFiles2 != null) {
            C89070n.m154536a((Collection) arrayList, (Object[]) listFiles2);
        }
        int intValue = kVar.f203742a.invoke().intValue();
        if (intValue > 0) {
            int size = arrayList.size() - intValue;
            if (size <= 0) {
                File b = kVar.mo144435b();
            } else {
                C89863a.AbstractC89864a aVar = C89863a.f203762a;
                if (aVar != null) {
                    aVar.mo144406a("Removing " + size + " heap dumps");
                }
                C89070n.m154530a((List) arrayList, (Comparator) C89851k.C89853b.f203746a);
                int i = 0;
                do {
                    String absolutePath = ((File) arrayList.get(i)).getAbsolutePath();
                    if (C89851k.m155928a((File) arrayList.get(i))) {
                        C89851k.f203738c.add(absolutePath);
                    } else {
                        C89863a.AbstractC89864a aVar2 = C89863a.f203762a;
                        if (aVar2 != null) {
                            aVar2.mo144406a("Could not delete old hprof file " + ((File) arrayList.get(i)).getPath());
                        }
                    }
                    i++;
                } while (i < size);
            }
            File b2 = kVar.mo144435b();
            if (!C89851k.m155929b(b2)) {
                if (kVar.mo144434a()) {
                    String externalStorageState = Environment.getExternalStorageState();
                    if (!C89219l.m154714a((Object) "mounted", (Object) externalStorageState)) {
                        C89863a.AbstractC89864a aVar3 = C89863a.f203762a;
                        if (aVar3 != null) {
                            aVar3.mo144406a("External storage not mounted, state: ".concat(String.valueOf(externalStorageState)));
                        }
                    } else {
                        C89863a.AbstractC89864a aVar4 = C89863a.f203762a;
                        if (aVar4 != null) {
                            aVar4.mo144406a("Could not create heap dump directory in external storage: [" + b2.getAbsolutePath() + ']');
                        }
                    }
                } else if (kVar.f203743b.invoke().booleanValue()) {
                    C89863a.AbstractC89864a aVar5 = C89863a.f203762a;
                    if (aVar5 != null) {
                        aVar5.mo144406a("WRITE_EXTERNAL_STORAGE permission not granted, requesting");
                    }
                } else {
                    C89863a.AbstractC89864a aVar6 = C89863a.f203762a;
                    if (aVar6 != null) {
                        aVar6.mo144406a("WRITE_EXTERNAL_STORAGE permission not granted, ignoring");
                    }
                }
                b2 = kVar.mo144436c();
                if (!C89851k.m155929b(b2)) {
                    C89863a.AbstractC89864a aVar7 = C89863a.f203762a;
                    if (aVar7 != null) {
                        aVar7.mo144406a("Could not create heap dump directory in app storage: [" + b2.getAbsolutePath() + ']');
                    }
                    return null;
                }
            }
            File file = new File(b2, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
            C89828e<Toast> eVar = new C89828e<>();
            showToast(eVar);
            if (!eVar.mo144416a(TimeUnit.SECONDS)) {
                C89863a.AbstractC89864a aVar8 = C89863a.f203762a;
                if (aVar8 != null) {
                    aVar8.mo144406a("Did not dump heap, too much time waiting for Toast.");
                }
                return null;
            }
            Object leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService = m155905xf892f616(this.context, "notification");
            if (leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService != null) {
                NotificationManager notificationManager = (NotificationManager) leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService;
                if (eVar.f203689b.getCount() <= 0) {
                    return new C89809c(this, file, eVar.f203688a.get(), notificationManager);
                }
                throw new IllegalStateException("Call wait() and check its result");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new IllegalArgumentException("maxStoredHeapDumps must be at least 1");
    }

    /* renamed from: leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m155906xfb2a3d8a(Context context2) {
        Context applicationContext = context2.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    private final void showToast(C89828e<Toast> eVar) {
        this.mainHandler.post(new RunnableC89810d(this, eVar));
    }

    public final void cancelToast(Toast toast) {
        if (toast != null) {
            this.mainHandler.post(new RunnableC89808b(toast));
        }
    }

    public AndroidHeapDumper(Context context2, C89851k kVar) {
        C89219l.m154719c(context2, "");
        C89219l.m154719c(kVar, "");
        this.leakDirectoryProvider = kVar;
        Context leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m155906xfb2a3d8a(context2);
        C89219l.m154709a((Object) leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, "");
        this.context = leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        Context leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2 = m155906xfb2a3d8a(context2);
        if (leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2 != null) {
            ((Application) leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) {
                /* class leakcanary.internal.AndroidHeapDumper.C898061 */

                /* renamed from: a */
                final /* synthetic */ AndroidHeapDumper f203655a;

                /* renamed from: b */
                private final /* synthetic */ Application.ActivityLifecycleCallbacks f203656b;

                static {
                    Covode.recordClassIndex(105902);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    this.f203656b.onActivityCreated(activity, bundle);
                }

                public final void onActivityDestroyed(Activity activity) {
                    this.f203656b.onActivityDestroyed(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    this.f203656b.onActivitySaveInstanceState(activity, bundle);
                }

                public final void onActivityStarted(Activity activity) {
                    this.f203656b.onActivityStarted(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    this.f203656b.onActivityStopped(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    C89219l.m154719c(activity, "");
                    this.f203655a.resumedActivity = activity;
                }

                public final void onActivityPaused(Activity activity) {
                    C89219l.m154719c(activity, "");
                    if (this.f203655a.resumedActivity == activity) {
                        this.f203655a.resumedActivity = null;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f203655a = r6;
                    InternalLeakCanary.C89818e eVar = InternalLeakCanary.C89818e.f203672a;
                    Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, eVar);
                    if (newProxyInstance != null) {
                        this.f203656b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            });
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m155905xf892f616(Context context2, String str) {
        Object obj;
        MethodCollector.m26663i(2764);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
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
                    MethodCollector.m26664o(2764);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }
}
