package com.p2082ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.p2170b.C30179a;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.b */
public class C30173b implements WeakHandler.IHandler {

    /* renamed from: g */
    private static volatile C30173b f71933g;

    /* renamed from: a */
    public Context f71934a;

    /* renamed from: b */
    public WeakHandler f71935b;

    /* renamed from: c */
    public boolean f71936c;

    /* renamed from: d */
    public volatile boolean f71937d;

    /* renamed from: e */
    public boolean f71938e;

    /* renamed from: f */
    public Runnable f71939f = new Runnable() {
        /* class com.p2082ss.android.newmedia.redbadge.C30173b.RunnableC301752 */

        static {
            Covode.recordClassIndex(36677);
        }

        public final void run() {
            if (C30173b.this.f71934a != null) {
                Logger.debug();
                if (C30173b.this.f71938e) {
                    C30173b.this.f71938e = false;
                    C30173b.this.f71935b.sendEmptyMessage(1);
                }
            }
        }
    };

    /* renamed from: h */
    private int f71940h;

    /* renamed from: i */
    private int f71941i;

    /* renamed from: j */
    private C30178a f71942j;

    /* renamed from: k */
    private C30178a f71943k;

    /* renamed from: l */
    private ContentObserver f71944l = new ContentObserver(this.f71935b) {
        /* class com.p2082ss.android.newmedia.redbadge.C30173b.C301763 */

        static {
            Covode.recordClassIndex(36678);
        }

        public final void onChange(boolean z) {
            Logger.debug();
            C30173b.this.mo53571a();
        }
    };

    /* renamed from: m */
    private ContentObserver f71945m = new ContentObserver(this.f71935b) {
        /* class com.p2082ss.android.newmedia.redbadge.C30173b.C301774 */

        static {
            Covode.recordClassIndex(36679);
        }

        public final void onChange(boolean z) {
            Logger.debug();
            C30173b.this.mo53571a();
        }
    };

    static {
        Covode.recordClassIndex(36675);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.newmedia.redbadge.b$a */
    public static class C30178a {

        /* renamed from: a */
        long f71950a;

        /* renamed from: b */
        long f71951b;

        /* renamed from: c */
        long f71952c;

        static {
            Covode.recordClassIndex(36680);
        }

        private C30178a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo53580a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch", this.f71950a);
                jSONObject.put("leave", this.f71951b);
                jSONObject.put("badge", this.f71952c);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }

        /* synthetic */ C30178a(byte b) {
            this();
        }

        /* renamed from: a */
        static C30178a m61022a(String str) {
            C30178a aVar = new C30178a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f71950a = jSONObject.optLong("launch", 0);
                aVar.f71951b = jSONObject.optLong("leave", 0);
                aVar.f71952c = jSONObject.optLong("badge", 0);
            } catch (Throwable unused) {
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo53571a() {
        this.f71936c = C30179a.m61024a(this.f71934a).mo53585a();
    }

    /* renamed from: b */
    public final void mo53574b() {
        if (this.f71934a != null) {
            if (this.f71938e) {
                this.f71935b.postDelayed(this.f71939f, 30000);
                this.f71935b.sendEmptyMessage(2);
            }
            Logger.debug();
        }
    }

    /* renamed from: c */
    private void m61016c() {
        String str;
        try {
            C30179a.m61024a(this.f71934a).mo53587b(this.f71940h);
            C30179a.m61024a(this.f71934a).mo53590c(this.f71941i);
            C30179a a = C30179a.m61024a(this.f71934a);
            C30178a aVar = this.f71942j;
            String str2 = "";
            if (aVar == null) {
                str = str2;
            } else {
                str = aVar.mo53580a().toString();
            }
            a.mo53583a(str);
            C30179a a2 = C30179a.m61024a(this.f71934a);
            C30178a aVar2 = this.f71943k;
            if (aVar2 != null) {
                str2 = aVar2.mo53580a().toString();
            }
            a2.mo53588b(str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static long m61013a(String str) {
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
    public static C30173b m61015a(Context context) {
        MethodCollector.m26663i(12330);
        if (f71933g == null) {
            synchronized (C30173b.class) {
                try {
                    if (f71933g == null) {
                        f71933g = new C30173b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12330);
                    throw th;
                }
            }
        }
        C30173b bVar = f71933g;
        MethodCollector.m26664o(12330);
        return bVar;
    }

    /* renamed from: b */
    public final void mo53575b(String str) {
        try {
            C30179a.m61024a(this.f71934a).mo53591c(str);
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.p2082ss.android.newmedia.redbadge.C30173b.RunnableC301741 */

                static {
                    Covode.recordClassIndex(36676);
                }

                public final void run() {
                    C30209b.AbstractC30211b a = C30209b.m61099a();
                    if (a != null) {
                        C30179a.m61024a(C30173b.this.f71934a).mo53593d(a.mo35471d());
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                int i = message.what;
                if (i == 0) {
                    mo53572a(0);
                    C30189e.m61060a().mo53608a(this.f71934a, 0);
                    this.f71937d = false;
                    Logger.debug();
                    if (this.f71936c) {
                        Intent intent = new Intent(this.f71934a, RedBadgePushProcessService.class);
                        intent.putExtra("app_entrance", true);
                        m61014a(this.f71934a, intent);
                    }
                } else if (i == 1) {
                    mo53572a(1);
                    Logger.debug();
                    if (this.f71936c) {
                        Intent intent2 = new Intent(this.f71934a, RedBadgePushProcessService.class);
                        intent2.putExtra("app_exit", true);
                        m61014a(this.f71934a, intent2);
                    }
                } else if (i == 2) {
                    mo53572a(1);
                } else if (i == 3) {
                    C30189e.m61060a().mo53608a(this.f71934a, 0);
                    this.f71937d = false;
                    Logger.debug();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C30173b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.redbadge.C30173b.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53572a(int i) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f71942j == null) {
                this.f71942j = new C30178a((byte) 0);
            }
            if (this.f71943k == null) {
                this.f71943k = new C30178a((byte) 0);
            }
            if (!DateUtils.isToday(this.f71942j.f71950a)) {
                this.f71940h = 0;
            }
            if (!DateUtils.isToday(this.f71942j.f71952c)) {
                this.f71941i = 0;
            }
            if (i == 0) {
                this.f71943k.f71950a = this.f71942j.f71950a;
                this.f71943k.f71951b = this.f71942j.f71951b;
                this.f71942j.f71950a = currentTimeMillis;
                this.f71942j.f71951b = currentTimeMillis + 900000;
                this.f71940h++;
            } else if (i == 1) {
                this.f71942j.f71951b = currentTimeMillis;
            } else if (i == 2) {
                this.f71943k.f71952c = this.f71942j.f71952c;
                this.f71942j.f71952c = currentTimeMillis;
                this.f71941i++;
            }
            m61016c();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName m61014a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.redbadge.C30173b.m61014a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53573a(String str, long j, JSONObject jSONObject) {
        C30209b.AbstractC30211b a = C30209b.m61099a();
        if (a != null) {
            a.mo35467a(this.f71934a, "event_v1", "red_badge", str, j, 0, jSONObject);
        }
    }
}
