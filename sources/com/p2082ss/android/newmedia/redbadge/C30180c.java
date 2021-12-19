package com.p2082ss.android.newmedia.redbadge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.message.log.C30070c;
import com.p2082ss.android.newmedia.redbadge.p2170b.C30179a;
import com.p2082ss.android.pushmanager.AbstractC30212b;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import com.p2082ss.android.pushmanager.setting.C30220a;
import com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.c */
public class C30180c implements WeakHandler.IHandler {

    /* renamed from: p */
    private static volatile C30180c f71956p;

    /* renamed from: a */
    public boolean f71957a;

    /* renamed from: b */
    public AbstractC30212b f71958b;

    /* renamed from: c */
    public Context f71959c;

    /* renamed from: d */
    public final WeakHandler f71960d;

    /* renamed from: e */
    public boolean f71961e;

    /* renamed from: f */
    public int f71962f;

    /* renamed from: g */
    public String f71963g;

    /* renamed from: h */
    public String f71964h;

    /* renamed from: i */
    public String f71965i;

    /* renamed from: j */
    public long f71966j;

    /* renamed from: k */
    public long f71967k;

    /* renamed from: l */
    public long f71968l;

    /* renamed from: m */
    public int f71969m;

    /* renamed from: n */
    final BroadcastReceiver f71970n = new BroadcastReceiver() {
        /* class com.p2082ss.android.newmedia.redbadge.C30180c.C301811 */

        static {
            Covode.recordClassIndex(36683);
        }

        /* renamed from: a */
        private static boolean m61055a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                try {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132253e = m61055a();
                        }
                        if (C58029j.f132253e && C30180c.this.f71957a) {
                            C30180c.this.f71960d.sendEmptyMessage(0);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: o */
    public AtomicBoolean f71971o = new AtomicBoolean(false);

    /* renamed from: q */
    private int f71972q;

    /* renamed from: r */
    private long f71973r;

    /* renamed from: s */
    private boolean f71974s = false;

    /* renamed from: t */
    private ContentObserver f71975t;

    /* renamed from: u */
    private ContentObserver f71976u;

    /* renamed from: v */
    private ContentObserver f71977v;

    static {
        Covode.recordClassIndex(36682);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53601a(String str, Bundle bundle) {
        if (!C13627m.m24498a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, m61046a(bundle, str2));
                }
            } catch (Throwable unused) {
            }
            C30070c.m60827a(this.f71959c, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo53599a() {
        String a = C30179a.m61024a(this.f71959c).f71954a.mo53661a("red_badge_last_valid_response", "");
        if (C30179a.m61024a(this.f71959c).f71954a.mo53662a("red_badge_is_use_last_valid_response", true) && !TextUtils.isEmpty(a)) {
            try {
                int h = C30179a.m61024a(this.f71959c).mo53598h();
                if (!DateUtils.isToday(this.f71967k) && h > 0) {
                    h = 0;
                }
                if (h >= this.f71962f) {
                    Logger.debug();
                    C30070c.m60826a(this.f71959c, "event_v1", "red_badge", "outdo_max_show_times", (long) h, (long) this.f71962f);
                    return;
                }
                JSONObject jSONObject = new JSONObject(a);
                if ("success".equals(jSONObject.getString("reason"))) {
                    jSONObject.put("content", jSONObject.optInt("content", 0) + 1);
                    C30070c.m60828a(this.f71959c, "red_badge", "use_last_valid_response", jSONObject);
                    this.f71968l = System.currentTimeMillis();
                    this.f71969m = jSONObject.optInt("next_query_interval", 0) + 600;
                    try {
                        C30179a.m61024a(this.f71959c).mo53595e(jSONObject.toString());
                        Intent intent = new Intent("com.ss.android.redbadge.message");
                        intent.putExtra("message_data", jSONObject.toString());
                        intent.setPackage(this.f71959c.getPackageName());
                        if (Build.VERSION.SDK_INT < 26 || C30061a.m60798a() < 26) {
                            m61043a(this.f71959c, intent);
                            C30179a.m61024a(this.f71959c).mo53582a(this.f71968l);
                            C30179a.m61024a(this.f71959c).mo53581a(this.f71969m);
                        } else {
                            Context context = this.f71959c;
                            ServiceConnectionC30193h hVar = new ServiceConnectionC30193h(intent, this.f71959c);
                            if (context == null || !(context instanceof Context)) {
                                context.bindService(intent, hVar, 1);
                                C30179a.m61024a(this.f71959c).mo53582a(this.f71968l);
                                C30179a.m61024a(this.f71959c).mo53581a(this.f71969m);
                            } else {
                                if (!C65713d.m117625a(context, intent)) {
                                    context.bindService(intent, hVar, 1);
                                }
                                C30179a.m61024a(this.f71959c).mo53582a(this.f71968l);
                                C30179a.m61024a(this.f71959c).mo53581a(this.f71969m);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                C30179a.m61024a(this.f71959c).mo53582a(this.f71968l);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static long m61049b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static C30180c m61045a(AbstractC30212b bVar) {
        MethodCollector.m26663i(13206);
        if (f71956p == null) {
            synchronized (C30180c.class) {
                try {
                    if (f71956p == null) {
                        f71956p = new C30180c(bVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13206);
                    throw th;
                }
            }
        }
        C30180c cVar = f71956p;
        MethodCollector.m26664o(13206);
        return cVar;
    }

    /* renamed from: b */
    public final void mo53602b(Context context) {
        if (context != null) {
            try {
                this.f71968l = C30179a.m61024a(this.f71959c).mo53589c();
                this.f71969m = C30179a.m61024a(this.f71959c).mo53592d();
                this.f71964h = C30179a.m61024a(this.f71959c).mo53594e();
                this.f71965i = C30179a.m61024a(this.f71959c).mo53596f();
                if (!C13627m.m24498a(this.f71964h)) {
                    JSONObject jSONObject = new JSONObject(this.f71964h);
                    this.f71966j = jSONObject.optLong("launch");
                    this.f71973r = jSONObject.optLong("leave");
                    this.f71967k = jSONObject.optLong("badge");
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C30180c(AbstractC30212b bVar) {
        C30066d.m60817a();
        WeakHandler weakHandler = new WeakHandler(C30066d.f71756b.getLooper(), this);
        this.f71960d = weakHandler;
        this.f71975t = new ContentObserver(weakHandler) {
            /* class com.p2082ss.android.newmedia.redbadge.C30180c.C301833 */

            static {
                Covode.recordClassIndex(36685);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                C30180c cVar = C30180c.this;
                cVar.mo53600a(cVar.f71959c);
            }
        };
        this.f71976u = new ContentObserver(weakHandler) {
            /* class com.p2082ss.android.newmedia.redbadge.C30180c.C301844 */

            static {
                Covode.recordClassIndex(36686);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                C30180c cVar = C30180c.this;
                cVar.mo53600a(cVar.f71959c);
            }
        };
        this.f71977v = new ContentObserver(weakHandler) {
            /* class com.p2082ss.android.newmedia.redbadge.C30180c.C301855 */

            static {
                Covode.recordClassIndex(36687);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                C30180c cVar = C30180c.this;
                cVar.mo53602b(cVar.f71959c);
            }
        };
        this.f71958b = bVar;
        Context applicationContext = bVar.mo35462a().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f71959c = applicationContext;
        mo53600a(applicationContext);
        Context context = this.f71959c;
        if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m61122a(context, "is_desktop_red_badge_show", "boolean"), true, this.f71975t);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m61122a(context, "desktop_red_badge_args", "string"), true, this.f71976u);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m61122a(context, "red_badge_last_time_paras", "string"), true, this.f71977v);
            } catch (Throwable unused) {
            }
        }
        if (this.f71961e) {
            m61050b(this.f71959c, this.f71970n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            mo53602b(this.f71959c);
            this.f71960d.sendEmptyMessageDelayed(0, 10000);
        }
        this.f71957a = true;
    }

    /* renamed from: a */
    public static JSONObject m61047a(String str) {
        JSONObject jSONObject = new JSONObject();
        if (C13627m.m24498a(str)) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                m61048a(jSONObject2, "launch");
                m61048a(jSONObject2, "leave");
                m61048a(jSONObject2, "badge");
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j;
        if (message != null) {
            try {
                int i = message.what;
                if (i == 0) {
                    Logger.debug();
                    if (this.f71961e) {
                        this.f71960d.removeMessages(0);
                        final long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis < this.f71968l) {
                            this.f71968l = currentTimeMillis - ((long) (this.f71969m * 1000));
                            C30179a.m61024a(this.f71959c).mo53582a(this.f71968l);
                        }
                        if (!C30220a.m61144a().f72080a.mo53663b() || !C30209b.m61099a().mo35472e()) {
                            Logger.debug();
                            Logger.debug();
                            long j2 = this.f71973r;
                            long j3 = this.f71966j;
                            if (j2 < j3) {
                                j = (currentTimeMillis - j3) - 900000;
                            } else {
                                j = currentTimeMillis - j2;
                            }
                            Logger.debug();
                            if (j < ((long) (this.f71972q * 1000)) || currentTimeMillis - this.f71968l < ((long) (this.f71969m * 1000))) {
                                WeakHandler weakHandler = this.f71960d;
                                weakHandler.sendMessage(weakHandler.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                                return;
                            }
                            Logger.debug();
                            if (!this.f71971o.get()) {
                                this.f71971o.getAndSet(true);
                                RunnableC13596e.m24423a(new Runnable() {
                                    /* class com.p2082ss.android.newmedia.redbadge.C30180c.RunnableC301822 */

                                    static {
                                        Covode.recordClassIndex(36684);
                                    }

                                    /* renamed from: a */
                                    private static boolean m61057a() {
                                        try {
                                            return C34719f.C34720a.f82009a.mo61395c();
                                        } catch (Exception unused) {
                                            return false;
                                        }
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:71:0x029f  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void run() {
                                        /*
                                        // Method dump skipped, instructions count: 811
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.redbadge.C30180c.RunnableC301822.run():void");
                                    }

                                    /* JADX WARNING: Failed to process nested try/catch */
                                    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    private static android.content.ComponentName m61056a(android.content.Context r9, android.content.Intent r10) {
                                        /*
                                        // Method dump skipped, instructions count: 114
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.redbadge.C30180c.RunnableC301822.m61056a(android.content.Context, android.content.Intent):android.content.ComponentName");
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        Logger.debug();
                        WeakHandler weakHandler2 = this.f71960d;
                        weakHandler2.sendMessage(weakHandler2.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                    }
                } else if (i == 1) {
                    Logger.debug();
                    if (this.f71961e) {
                        this.f71974s = true;
                        if (!this.f71960d.hasMessages(0)) {
                            this.f71960d.sendEmptyMessageDelayed(0, (long) (this.f71969m * 1000));
                        }
                    }
                } else if (i == 2) {
                    Logger.debug();
                    if (this.f71961e) {
                        this.f71974s = false;
                        this.f71960d.removeMessages(0);
                        this.f71960d.sendEmptyMessageDelayed(0, (long) (this.f71972q * 1000));
                    }
                } else if (i == 3) {
                    ((Long) message.obj).longValue();
                    long j4 = (long) (this.f71969m * 1000);
                    Logger.debug();
                    this.f71960d.sendEmptyMessageDelayed(0, j4);
                } else if (i == 4) {
                    long longValue = ((Long) message.obj).longValue();
                    int i2 = this.f71969m;
                    long j5 = (long) (i2 * 1000);
                    long j6 = this.f71968l + ((long) (i2 * 1000));
                    if (longValue <= j6) {
                        j5 = j6 - longValue;
                    }
                    Logger.debug();
                    this.f71960d.sendEmptyMessageDelayed(0, j5);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53600a(Context context) {
        if (context != null) {
            try {
                this.f71961e = C30179a.m61024a(this.f71959c).mo53585a();
                String b = C30179a.m61024a(this.f71959c).mo53586b();
                if (!C13627m.m24498a(b)) {
                    JSONObject jSONObject = new JSONObject(b);
                    this.f71962f = jSONObject.optInt("max_show_times", 5);
                    this.f71972q = jSONObject.optInt("query_waiting_duration", 30);
                    this.f71963g = jSONObject.optString("strategy");
                    if (!this.f71961e) {
                        this.f71960d.removeMessages(0);
                        this.f71960d.removeMessages(1);
                        this.f71960d.removeMessages(2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Object m61046a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m61043a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.redbadge.C30180c.m61043a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    private static void m61048a(JSONObject jSONObject, String str) {
        if (!C13627m.m24498a(str)) {
            try {
                jSONObject.put(str, jSONObject.optLong(str) / 1000);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Intent m61044a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m61050b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m61044a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.redbadge.C30180c.m61050b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
