package com.bytedance.common.wschannel.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.AbstractC13726j;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.client.k */
public final class C13728k implements AbstractC13726j {

    /* renamed from: a */
    public long f33360a = 0;

    /* renamed from: b */
    public long f33361b = 0;

    /* renamed from: c */
    public WeakReference<Context> f33362c;

    /* renamed from: d */
    Messenger f33363d;

    /* renamed from: e */
    ServiceConnection f33364e;

    /* renamed from: f */
    public final LinkedBlockingDeque<AbstractC13726j.C13727a> f33365f = new LinkedBlockingDeque<>();

    /* renamed from: g */
    private final Runnable f33366g = new Runnable() {
        /* class com.bytedance.common.wschannel.client.C13728k.RunnableC137291 */

        static {
            Covode.recordClassIndex(15764);
        }

        public final void run() {
            if (C13728k.this.f33363d == null) {
                SystemClock.uptimeMillis();
                WsConstants.getBindWsChannelServiceListener();
            }
        }
    };

    static {
        Covode.recordClassIndex(15763);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.client.k$a */
    public class ServiceConnectionC13732a implements ServiceConnection {
        static {
            Covode.recordClassIndex(15767);
        }

        ServiceConnectionC13732a() {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (componentName != null) {
                Logger.debug();
                try {
                    C13728k.this.f33363d = null;
                    C13728k.this.f33365f.clear();
                } catch (Throwable unused) {
                }
                SystemClock.uptimeMillis();
                WsConstants.getBindWsChannelServiceListener();
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (componentName != null && iBinder != null) {
                Logger.debug();
                try {
                    C13728k.this.f33363d = new Messenger(iBinder);
                    C13728k.this.mo22087a(componentName);
                } catch (Throwable unused) {
                }
                C13728k.this.f33361b = SystemClock.uptimeMillis();
                SystemClock.uptimeMillis();
                WsConstants.getBindWsChannelServiceListener();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22080a(Context context) {
        m24745b(context, 1);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: b */
    public final void mo22085b(Context context) {
        m24745b(context, 2);
    }

    /* renamed from: c */
    private static Context m24746c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|(3:18|7|13)(5:8|9|10|(2:12|21)(1:20)|17)|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r5.f33363d = null;
        r5.f33365f.offerFirst(r4);
        android.os.SystemClock.uptimeMillis();
        com.bytedance.common.wschannel.WsConstants.getBindWsChannelServiceListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:17:0x0003, LOOP_START, SYNTHETIC, Splitter:B:2:0x0003] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24744b(android.content.ComponentName r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.j$a> r0 = r5.f33365f     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0044
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.j$a> r0 = r5.f33365f     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r0.poll()     // Catch:{ all -> 0x0044 }
            com.bytedance.common.wschannel.client.j$a r4 = (com.bytedance.common.wschannel.client.AbstractC13726j.C13727a) r4     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            android.os.Message r3 = new android.os.Message     // Catch:{ all -> 0x0044 }
            r3.<init>()     // Catch:{ all -> 0x0044 }
            int r0 = r4.f33359c     // Catch:{ all -> 0x0044 }
            r3.what = r0     // Catch:{ all -> 0x0044 }
            android.os.Bundle r2 = r3.getData()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.f33357a     // Catch:{ all -> 0x0044 }
            android.os.Parcelable r0 = r4.f33358b     // Catch:{ all -> 0x0044 }
            r2.putParcelable(r1, r0)     // Catch:{ all -> 0x0044 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ DeadObjectException -> 0x0036, all -> 0x0003 }
            android.os.Messenger r0 = r5.f33363d     // Catch:{ DeadObjectException -> 0x0036, all -> 0x0003 }
            if (r0 == 0) goto L_0x0003
            r0.send(r3)     // Catch:{ DeadObjectException -> 0x0036, all -> 0x0003 }
            goto L_0x0003
        L_0x0035:
            return
        L_0x0036:
            r0 = 0
            r5.f33363d = r0
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.j$a> r0 = r5.f33365f
            r0.offerFirst(r4)
            android.os.SystemClock.uptimeMillis()
            com.bytedance.common.wschannel.WsConstants.getBindWsChannelServiceListener()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.C13728k.m24744b(android.content.ComponentName):void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[Catch:{ all -> 0x0089 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo22087a(android.content.ComponentName r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.C13728k.mo22087a(android.content.ComponentName):void");
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22084a(final Context context, boolean z) {
        if (z) {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.common.wschannel.client.C13728k.RunnableC137313 */

                /* renamed from: b */
                final /* synthetic */ boolean f33371b = true;

                static {
                    Covode.recordClassIndex(15766);
                }

                public final void run() {
                    int i;
                    if (context != null) {
                        if (C13728k.this.f33362c == null || C13728k.this.f33362c.get() == null) {
                            C13728k kVar = C13728k.this;
                            Context applicationContext = context.getApplicationContext();
                            if (C58003a.f132201c && applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                            kVar.f33362c = new WeakReference<>(applicationContext);
                        }
                        try {
                            ComponentName componentName = new ComponentName(context, WsChannelService.class);
                            AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
                            if (this.f33371b) {
                                i = 9;
                            } else {
                                i = 11;
                            }
                            aVar.f33359c = i;
                            C13728k.this.f33365f.offer(aVar);
                            C13728k.this.mo22087a(componentName);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        } else {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.common.wschannel.client.C13728k.RunnableC137302 */

                static {
                    Covode.recordClassIndex(15765);
                }

                public final void run() {
                    try {
                        m24755a(context, new Intent(context, WsChannelService.class));
                    } catch (Throwable unused) {
                    }
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private static android.content.ComponentName m24755a(android.content.Context r9, android.content.Intent r10) {
                    /*
                    // Method dump skipped, instructions count: 114
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.C13728k.RunnableC137302.m24755a(android.content.Context, android.content.Intent):android.content.ComponentName");
                }
            });
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m24743a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.C13728k.m24743a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: b */
    private void m24745b(Context context, int i) {
        if (context != null && i > 0 && i <= 3) {
            WeakReference<Context> weakReference = this.f33362c;
            if (weakReference == null || weakReference.get() == null) {
                this.f33362c = new WeakReference<>(m24746c(context));
            }
            Logger.debug();
            if (C13758l.m24811a(context).mo22109a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
                    intent.setComponent(componentName);
                    intent.putExtra("app_state", i);
                    m24743a(context, intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22081a(Context context, int i) {
        if (context != null) {
            Logger.debug();
            WeakReference<Context> weakReference = this.f33362c;
            if (weakReference == null || weakReference.get() == null) {
                this.f33362c = new WeakReference<>(m24746c(context));
            }
            Logger.debug();
            try {
                ComponentName componentName = new ComponentName(context, WsChannelService.class);
                AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
                aVar.f33357a = "ws_app";
                aVar.f33358b = new IntegerParcelable(i);
                aVar.f33359c = 1;
                this.f33365f.offer(aVar);
                mo22087a(componentName);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: b */
    public final void mo22086b(Context context, SsWsApp ssWsApp) {
        if (context != null && ssWsApp != null) {
            WeakReference<Context> weakReference = this.f33362c;
            if (weakReference == null || weakReference.get() == null) {
                this.f33362c = new WeakReference<>(m24746c(context));
            }
            Logger.debug();
            if (C13758l.m24811a(context).mo22109a()) {
                WeakReference<Context> weakReference2 = this.f33362c;
                if (weakReference2 == null || weakReference2.get() == null) {
                    this.f33362c = new WeakReference<>(m24746c(context));
                }
                Logger.debug();
                if (C13758l.m24811a(context).mo22109a()) {
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
                        aVar.f33357a = "ws_app";
                        aVar.f33358b = ssWsApp;
                        aVar.f33359c = 4;
                        this.f33365f.offer(aVar);
                        mo22087a(componentName);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22082a(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            WeakReference<Context> weakReference = this.f33362c;
            if (weakReference == null || weakReference.get() == null) {
                this.f33362c = new WeakReference<>(m24746c(context));
            }
            if (!C13758l.m24811a(context).mo22109a()) {
                if (WsConstants.getLinkProgressChangeListener() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lp_status", 1);
                        WsConstants.getLinkProgressChangeListener().mo21943a("WCMP_REGISTERAPP_SETTING_DISABLE", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } else if (ssWsApp != null) {
                WeakReference<Context> weakReference2 = this.f33362c;
                if (weakReference2 == null || weakReference2.get() == null) {
                    this.f33362c = new WeakReference<>(m24746c(context));
                }
                Logger.debug();
                if (C13758l.m24811a(context).mo22109a()) {
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
                        aVar.f33357a = "ws_app";
                        aVar.f33358b = ssWsApp;
                        aVar.f33359c = 0;
                        this.f33365f.offer(aVar);
                        mo22087a(componentName);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22083a(Context context, WsChannelMsg wsChannelMsg) {
        if (context != null && wsChannelMsg != null) {
            WeakReference<Context> weakReference = this.f33362c;
            if (weakReference == null || weakReference.get() == null) {
                this.f33362c = new WeakReference<>(m24746c(context));
            }
            Logger.debug();
            if (C13758l.m24811a(context).mo22109a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
                    aVar.f33357a = "payload";
                    aVar.f33358b = wsChannelMsg;
                    aVar.f33359c = 5;
                    this.f33365f.offer(aVar);
                    mo22087a(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
