package com.p2082ss.android.ugc.aweme.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.power.C63304d;
import com.p2082ss.p4398b.C86059c;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.util.b */
public final class C80123b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Context f179529a;

    /* renamed from: b */
    public int f179530b;

    /* renamed from: c */
    public boolean f179531c;

    static {
        Covode.recordClassIndex(93367);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1731i.m5640b(new CallableC80126d(activity), C39162r.m79452a());
            this.f179531c = false;
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1731i.m5640b(new CallableC80125c(activity), C39162r.m79452a());
            this.f179531c = true;
            Context applicationContext = activity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (this.f179529a == null && applicationContext != null) {
                this.f179529a = applicationContext;
                C40780g.m82247d().scheduleAtFixedRate(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.util.C80123b.RunnableC801241 */

                    static {
                        Covode.recordClassIndex(93368);
                    }

                    public final void run() {
                        boolean z;
                        String str;
                        int intExtra;
                        if (C80123b.this.f179531c || Build.VERSION.SDK_INT >= 21) {
                            int d = (int) C86059c.m147823d(C80123b.this.f179529a);
                            Intent a = C80123b.m138891a(C80123b.this.f179529a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            if (a == null || (intExtra = a.getIntExtra("status", -1)) == 2 || intExtra == 5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d >= 0 && d <= 100) {
                                C39163s a2 = new C39163s().mo67941a("capacity", String.valueOf(d)).mo67941a("ischarging", String.valueOf(z));
                                C80123b bVar = C80123b.this;
                                int i = bVar.f179530b + 1;
                                bVar.f179530b = i;
                                JSONObject a3 = a2.mo67941a("reportindex", String.valueOf(i)).mo67942a();
                                try {
                                    if (C63304d.m114803a().f143686a) {
                                        str = "1";
                                    } else {
                                        str = "0";
                                    }
                                    a3.put("is_battery_saver", str);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                if (C39223a.m79597k().mo68722f()) {
                                    C39162r.m79461a("battery_capacity", a3);
                                }
                            }
                        }
                    }
                }, 300, 300, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: b */
    private static Intent m138892b(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Intent m138891a(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m138892b(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
