package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.support.p010v4.app.AbstractC0073a;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.l */
public final class C0607l {

    /* renamed from: a */
    private static final Object f2571a = new Object();

    /* renamed from: b */
    private static String f2572b;

    /* renamed from: c */
    private static Set<String> f2573c = new HashSet();

    /* renamed from: f */
    private static final Object f2574f = new Object();

    /* renamed from: g */
    private static ServiceConnectionC0611d f2575g;

    /* renamed from: d */
    private final Context f2576d;

    /* renamed from: e */
    private final NotificationManager f2577e;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.l$e */
    public interface AbstractC0613e {
        static {
            Covode.recordClassIndex(691);
        }

        /* renamed from: a */
        void mo2640a(AbstractC0073a aVar);
    }

    static {
        Covode.recordClassIndex(685);
    }

    /* renamed from: androidx.core.app.l$a */
    static class C0608a implements AbstractC0613e {

        /* renamed from: a */
        final String f2578a;

        /* renamed from: b */
        final int f2579b;

        /* renamed from: c */
        final String f2580c;

        /* renamed from: d */
        final boolean f2581d;

        static {
            Covode.recordClassIndex(686);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:").append(this.f2578a);
            sb.append(", id:").append(this.f2579b);
            sb.append(", tag:").append(this.f2580c);
            sb.append(", all:").append(this.f2581d);
            sb.append("]");
            return sb.toString();
        }

        @Override // androidx.core.app.C0607l.AbstractC0613e
        /* renamed from: a */
        public final void mo2640a(AbstractC0073a aVar) {
            if (this.f2581d) {
                aVar.mo64a(this.f2578a);
            } else {
                aVar.mo65a(this.f2578a, this.f2579b, this.f2580c);
            }
        }

        C0608a(String str, int i, String str2) {
            this.f2578a = str;
            this.f2579b = i;
            this.f2580c = str2;
        }
    }

    /* renamed from: androidx.core.app.l$b */
    static class C0609b implements AbstractC0613e {

        /* renamed from: a */
        final String f2582a;

        /* renamed from: b */
        final int f2583b;

        /* renamed from: c */
        final String f2584c = null;

        /* renamed from: d */
        final Notification f2585d;

        static {
            Covode.recordClassIndex(687);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:").append(this.f2582a);
            sb.append(", id:").append(this.f2583b);
            sb.append(", tag:").append(this.f2584c);
            sb.append("]");
            return sb.toString();
        }

        @Override // androidx.core.app.C0607l.AbstractC0613e
        /* renamed from: a */
        public final void mo2640a(AbstractC0073a aVar) {
            aVar.mo66a(this.f2582a, this.f2583b, this.f2584c, this.f2585d);
        }

        C0609b(String str, int i, Notification notification) {
            this.f2582a = str;
            this.f2583b = i;
            this.f2585d = notification;
        }
    }

    /* renamed from: a */
    public final boolean mo2639a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f2577e.areNotificationsEnabled();
        }
        int i = Build.VERSION.SDK_INT;
        Object a = m2290a(this.f2576d, "appops");
        ApplicationInfo applicationInfo = this.f2576d.getApplicationInfo();
        String packageName = m2293c(this.f2576d).getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(a, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static C0607l m2289a(Context context) {
        return new C0607l(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.l$d */
    public static class ServiceConnectionC0611d implements ServiceConnection, Handler.Callback {

        /* renamed from: a */
        private final Context f2588a;

        /* renamed from: b */
        private final HandlerThread f2589b;

        /* renamed from: c */
        private final Handler f2590c;

        /* renamed from: d */
        private final Map<ComponentName, C0612a> f2591d = new HashMap();

        /* renamed from: e */
        private Set<String> f2592e = new HashSet();

        static {
            Covode.recordClassIndex(689);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.l$d$a */
        public static class C0612a {

            /* renamed from: a */
            final ComponentName f2593a;

            /* renamed from: b */
            boolean f2594b;

            /* renamed from: c */
            AbstractC0073a f2595c;

            /* renamed from: d */
            ArrayDeque<AbstractC0613e> f2596d = new ArrayDeque<>();

            /* renamed from: e */
            int f2597e = 0;

            static {
                Covode.recordClassIndex(690);
            }

            C0612a(ComponentName componentName) {
                this.f2593a = componentName;
            }
        }

        /* renamed from: a */
        private void m2299a(C0612a aVar) {
            if (aVar.f2594b) {
                this.f2588a.unbindService(this);
                aVar.f2594b = false;
            }
            aVar.f2595c = null;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f2590c.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        public final void mo2643a(AbstractC0613e eVar) {
            this.f2590c.obtainMessage(0, eVar).sendToTarget();
        }

        ServiceConnectionC0611d(Context context) {
            this.f2588a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2589b = handlerThread;
            handlerThread.start();
            this.f2590c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: b */
        private void m2300b(C0612a aVar) {
            if (!this.f2590c.hasMessages(3, aVar.f2593a)) {
                aVar.f2597e++;
                if (aVar.f2597e > 6) {
                    aVar.f2596d.size();
                    aVar.f2596d.clear();
                    return;
                }
                this.f2590c.sendMessageDelayed(this.f2590c.obtainMessage(3, aVar.f2593a), (long) ((1 << (aVar.f2597e - 1)) * 1000));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if (r6.f2594b != false) goto L_0x001c;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m2301c(androidx.core.app.C0607l.ServiceConnectionC0611d.C0612a r6) {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0607l.ServiceConnectionC0611d.m2301c(androidx.core.app.l$d$a):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.ArrayDeque<androidx.core.app.l$e> */
        /* JADX WARN: Multi-variable type inference failed */
        public final boolean handleMessage(Message message) {
            AbstractC0073a aVar;
            int i = message.what;
            if (i == 0) {
                Object obj = message.obj;
                Set<String> b = C0607l.m2292b(this.f2588a);
                if (!b.equals(this.f2592e)) {
                    this.f2592e = b;
                    List<ResolveInfo> queryIntentServices = this.f2588a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (b.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission == null) {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.f2591d.containsKey(componentName2)) {
                            this.f2591d.put(componentName2, new C0612a(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, C0612a>> it = this.f2591d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<ComponentName, C0612a> next = it.next();
                        if (!hashSet.contains(next.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                next.getKey();
                            }
                            m2299a(next.getValue());
                            it.remove();
                        }
                    }
                }
                for (C0612a aVar2 : this.f2591d.values()) {
                    aVar2.f2596d.add(obj);
                    m2301c(aVar2);
                }
                return true;
            } else if (i == 1) {
                C0610c cVar = (C0610c) message.obj;
                ComponentName componentName3 = cVar.f2586a;
                IBinder iBinder = cVar.f2587b;
                C0612a aVar3 = this.f2591d.get(componentName3);
                if (aVar3 != null) {
                    if (iBinder == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0073a)) {
                            aVar = new AbstractC0073a.AbstractBinderC0074a.C0075a(iBinder);
                        } else {
                            aVar = (AbstractC0073a) queryLocalInterface;
                        }
                    }
                    aVar3.f2595c = aVar;
                    aVar3.f2597e = 0;
                    m2301c(aVar3);
                }
                return true;
            } else if (i == 2) {
                C0612a aVar4 = this.f2591d.get(message.obj);
                if (aVar4 != null) {
                    m2299a(aVar4);
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                C0612a aVar5 = this.f2591d.get(message.obj);
                if (aVar5 != null) {
                    m2301c(aVar5);
                }
                return true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f2590c.obtainMessage(1, new C0610c(componentName, iBinder)).sendToTarget();
        }
    }

    private C0607l(Context context) {
        this.f2576d = context;
        this.f2577e = (NotificationManager) m2290a(context, "notification");
    }

    /* renamed from: c */
    private static Context m2293c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private void m2291a(AbstractC0613e eVar) {
        synchronized (f2574f) {
            if (f2575g == null) {
                f2575g = new ServiceConnectionC0611d(m2293c(this.f2576d));
            }
            f2575g.mo2643a(eVar);
        }
    }

    /* renamed from: b */
    public static Set<String> m2292b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2571a) {
            if (string != null) {
                if (!string.equals(f2572b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f2573c = hashSet;
                    f2572b = string;
                }
            }
            set = f2573c;
        }
        return set;
    }

    /* renamed from: androidx.core.app.l$c */
    static class C0610c {

        /* renamed from: a */
        final ComponentName f2586a;

        /* renamed from: b */
        final IBinder f2587b;

        static {
            Covode.recordClassIndex(688);
        }

        C0610c(ComponentName componentName, IBinder iBinder) {
            this.f2586a = componentName;
            this.f2587b = iBinder;
        }
    }

    /* renamed from: a */
    public final void mo2637a(int i, Notification notification) {
        boolean z;
        Bundle a = C0595i.m2230a(notification);
        if (a == null || !a.getBoolean("android.support.useSideChannel")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m2291a(new C0609b(this.f2576d.getPackageName(), i, notification));
            this.f2577e.cancel(null, i);
            return;
        }
        this.f2577e.notify(null, i, notification);
    }

    /* renamed from: a */
    private static Object m2290a(Context context, String str) {
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
    public final void mo2638a(String str, int i) {
        this.f2577e.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m2291a(new C0608a(this.f2576d.getPackageName(), i, str));
        }
    }
}
