package com.bytedance.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1590c.AbstractC21778i;
import com.bytedance.push.p1598i.C21843f;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.third.C21922f;
import com.bytedance.push.third.PushManager;
import com.p2082ss.android.message.NotifyService;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.g */
public final class C21820g implements AbstractC21778i {

    /* renamed from: a */
    public C21843f f51711a = new C21843f(this);

    /* renamed from: b */
    private Map<Integer, Boolean> f51712b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25472);
    }

    C21820g() {
    }

    @Override // com.bytedance.push.p1590c.AbstractC21778i
    /* renamed from: a */
    public final void mo35438a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(new Runnable(false) {
                /* class com.bytedance.push.C21820g.RunnableC218211 */

                /* renamed from: a */
                final /* synthetic */ boolean f51713a = false;

                static {
                    Covode.recordClassIndex(25473);
                }

                public final void run() {
                    C21820g.this.f51711a.mo35519a(this.f51713a);
                }
            });
        } else {
            this.f51711a.mo35519a(false);
        }
    }

    /* renamed from: c */
    private static Context m40871c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: d */
    private void m40872d(Context context) {
        for (Integer num : C21922f.m41214a(context).mo35674b()) {
            int intValue = num.intValue();
            if (context != null) {
                PushManager.inst().unregisterPush(m40871c(context), intValue);
            }
        }
        this.f51712b.clear();
    }

    @Override // com.bytedance.push.p1590c.AbstractC21778i
    /* renamed from: b */
    public final boolean mo35441b(Context context) {
        if (!TextUtils.equals(C21922f.m41214a(context).mo35677c().toString(), ((LocalFrequencySettings) C21895h.m41120a(context, LocalFrequencySettings.class)).mo35588f())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21778i
    /* renamed from: a */
    public final boolean mo35440a(Context context) {
        C30221b.m61148b();
        boolean z = false;
        if (C30221b.m61149c()) {
            for (Integer num : C21922f.m41214a(context).mo35674b()) {
                z |= m40870a(context, num.intValue());
            }
            final Context c = m40871c(context);
            Intent intent = new Intent(c, NotifyService.class);
            try {
                C30209b.AbstractC30211b bVar = (C30209b.AbstractC30211b) C30980b.m63694a(C30209b.AbstractC30211b.class);
                if (bVar == null || bVar.mo35474g()) {
                    m40869a(c, intent);
                }
                ServiceConnectionC218222 r2 = new ServiceConnection() {
                    /* class com.bytedance.push.C21820g.ServiceConnectionC218222 */

                    static {
                        Covode.recordClassIndex(25474);
                    }

                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        try {
                            c.unbindService(this);
                        } catch (Throwable unused) {
                        }
                    }
                };
                if (c == null || !(c instanceof Context)) {
                    c.bindService(intent, r2, 1);
                } else if (!C65713d.m117625a(c, intent)) {
                    c.bindService(intent, r2, 1);
                }
            } catch (Throwable unused) {
            }
        } else {
            m40872d(context);
        }
        return z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m40869a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.C21820g.m40869a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (com.bytedance.push.third.C21922f.m41190c(r9) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6185);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r3 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6185);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        com.bytedance.push.third.PushManager.inst().registerPush(r3, r9);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6185);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m40870a(android.content.Context r8, int r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.C21820g.m40870a(android.content.Context, int):boolean");
    }

    @Override // com.bytedance.push.p1590c.AbstractC21778i
    /* renamed from: a */
    public final void mo35439a(Context context, String str, int i) {
        PushManager.inst().setAlias(context, str, i);
    }
}
