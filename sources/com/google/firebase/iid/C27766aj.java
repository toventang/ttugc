package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1947f.HandlerC25738d;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25622ac;
import com.google.android.gms.p1940d.C25632i;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.iid.FirebaseIidMessengerCompat;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.aj */
public final class C27766aj {

    /* renamed from: d */
    private static int f65235d;

    /* renamed from: e */
    private static PendingIntent f65236e;

    /* renamed from: a */
    final C0497g<String, C25632i<Bundle>> f65237a = new C0497g<>();

    /* renamed from: b */
    Messenger f65238b;

    /* renamed from: c */
    FirebaseIidMessengerCompat f65239c;

    /* renamed from: f */
    private final Context f65240f;

    /* renamed from: g */
    private final C27760ae f65241g;

    /* renamed from: h */
    private final ScheduledExecutorService f65242h;

    /* renamed from: i */
    private Messenger f65243i;

    static {
        Covode.recordClassIndex(33354);
    }

    /* renamed from: a */
    private static synchronized String m55519a() {
        String num;
        synchronized (C27766aj.class) {
            MethodCollector.m26663i(10769);
            int i = f65235d;
            f65235d = i + 1;
            num = Integer.toString(i);
            MethodCollector.m26664o(10769);
        }
        return num;
    }

    /* renamed from: a */
    public static Bundle m55518a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m55523b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private AbstractC25631h<Bundle> m55524d(Bundle bundle) {
        if (!this.f65241g.mo46411a()) {
            return C25635k.m49511a((Exception) new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return mo46422c(bundle).mo41881b(C27791g.f65294a, new C27769al(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC25631h<Bundle> mo46419a(Bundle bundle) {
        if (this.f65241g.mo46415e() >= 12000000) {
            return C27809x.m55595a(this.f65240f).mo46455a(bundle).mo41871a(C27791g.f65294a, C27768ak.f65245a);
        }
        return m55524d(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo46421b(Intent intent) {
        MethodCollector.m26663i(10463);
        String a = m55520a(intent, "error");
        if (a == null) {
            String.valueOf(String.valueOf(m55518a(intent))).length();
            MethodCollector.m26664o(10463);
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                "Received InstanceID error ".concat(valueOf);
            } else {
                new String("Received InstanceID error ");
            }
        }
        if (a.startsWith("|")) {
            String[] split = a.split("\\|");
            if (split.length <= 2 || !"ID".equals(split[1])) {
                String valueOf2 = String.valueOf(a);
                if (valueOf2.length() != 0) {
                    "Unexpected structured response ".concat(valueOf2);
                    MethodCollector.m26664o(10463);
                    return;
                }
                new String("Unexpected structured response ");
                MethodCollector.m26664o(10463);
                return;
            }
            String str = split[2];
            String str2 = split[3];
            if (str2.startsWith(":")) {
                str2 = str2.substring(1);
            }
            mo46420a(str, m55518a(intent.putExtra("error", str2)));
            MethodCollector.m26664o(10463);
            return;
        }
        synchronized (this.f65237a) {
            for (int i = 0; i < this.f65237a.size(); i++) {
                try {
                    mo46420a(this.f65237a.mo2162b(i), m55518a(intent));
                } finally {
                    MethodCollector.m26664o(10463);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC25631h<Bundle> mo46422c(Bundle bundle) {
        MethodCollector.m26663i(10771);
        String a = m55519a();
        C25632i<Bundle> iVar = new C25632i<>();
        synchronized (this.f65237a) {
            try {
                this.f65237a.put(a, iVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(10771);
                throw th;
            }
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f65241g.mo46412b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m55521a(this.f65240f, intent);
        intent.putExtra("kid", new StringBuilder(String.valueOf(a).length() + 5).append("|ID|").append(a).append("|").toString());
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(m55518a(intent))).length();
        }
        intent.putExtra("google.messenger", this.f65243i);
        if (!(this.f65238b == null && this.f65239c == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f65238b;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f65239c.mo46383a(obtain);
                }
            } catch (RemoteException unused) {
            }
            iVar.f60753a.mo41873a(C27791g.f65294a, new C27771an(this, a, this.f65242h.schedule(new RunnableC27770am(iVar), 30, TimeUnit.SECONDS)));
            C25622ac<TResult> acVar = iVar.f60753a;
            MethodCollector.m26664o(10771);
            return acVar;
        }
        if (this.f65241g.mo46412b() == 2) {
            this.f65240f.sendBroadcast(intent);
        } else {
            m55522b(this.f65240f, intent);
        }
        iVar.f60753a.mo41873a(C27791g.f65294a, new C27771an(this, a, this.f65242h.schedule(new RunnableC27770am(iVar), 30, TimeUnit.SECONDS)));
        C25622ac<TResult> acVar2 = iVar.f60753a;
        MethodCollector.m26664o(10771);
        return acVar2;
    }

    /* renamed from: a */
    public static String m55520a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public C27766aj(Context context, C27760ae aeVar) {
        MethodCollector.m26663i(10309);
        this.f65240f = context;
        this.f65241g = aeVar;
        this.f65243i = new Messenger(new HandlerC25738d(Looper.getMainLooper()) {
            /* class com.google.firebase.iid.C27766aj.HandlerC277671 */

            static {
                Covode.recordClassIndex(33355);
            }

            public final void handleMessage(Message message) {
                C27766aj ajVar = C27766aj.this;
                if (message != null && (message.obj instanceof Intent)) {
                    Intent intent = (Intent) message.obj;
                    intent.setExtrasClassLoader(new FirebaseIidMessengerCompat.C27751a());
                    if (intent.hasExtra("google.messenger")) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                        if (parcelableExtra instanceof FirebaseIidMessengerCompat) {
                            ajVar.f65239c = (FirebaseIidMessengerCompat) parcelableExtra;
                        }
                        if (parcelableExtra instanceof Messenger) {
                            ajVar.f65238b = (Messenger) parcelableExtra;
                        }
                    }
                    Intent intent2 = (Intent) message.obj;
                    String action = intent2.getAction();
                    if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                        String a = C27766aj.m55520a(intent2, "registration_id");
                        if (a == null && (a = C27766aj.m55520a(intent2, "unregistered")) == null) {
                            ajVar.mo46421b(intent2);
                            return;
                        }
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(a);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle a2 = C27766aj.m55518a(intent2);
                            a2.putString("registration_id", group2);
                            ajVar.mo46420a(group, a2);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf = String.valueOf(a);
                            if (valueOf.length() != 0) {
                                "Unexpected response string: ".concat(valueOf);
                            } else {
                                new String("Unexpected response string: ");
                            }
                        }
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf2 = String.valueOf(action);
                        if (valueOf2.length() != 0) {
                            "Unexpected response action: ".concat(valueOf2);
                        } else {
                            new String("Unexpected response action: ");
                        }
                    }
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f65242h = scheduledThreadPoolExecutor;
        MethodCollector.m26664o(10309);
    }

    /* renamed from: a */
    private static synchronized void m55521a(Context context, Intent intent) {
        synchronized (C27766aj.class) {
            MethodCollector.m26663i(10461);
            if (f65236e == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f65236e = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f65236e);
            MethodCollector.m26664o(10461);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m55522b(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C27766aj.m55522b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46420a(String str, Bundle bundle) {
        MethodCollector.m26663i(10628);
        synchronized (this.f65237a) {
            try {
                C25632i<Bundle> remove = this.f65237a.remove(str);
                if (remove == null) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Missing callback for ".concat(valueOf);
                    } else {
                        new String("Missing callback for ");
                    }
                    return;
                }
                remove.mo41894a(bundle);
                MethodCollector.m26664o(10628);
            } finally {
                MethodCollector.m26664o(10628);
            }
        }
    }
}
