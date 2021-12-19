package com.squareup.p2081b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.squareup.p2081b.C29296r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.i */
public final class C29280i {

    /* renamed from: a */
    final HandlerThreadC29283b f69460a;

    /* renamed from: b */
    final Context f69461b;

    /* renamed from: c */
    final ExecutorService f69462c;

    /* renamed from: d */
    final AbstractC29285j f69463d;

    /* renamed from: e */
    final Map<String, RunnableC29267c> f69464e = new LinkedHashMap();

    /* renamed from: f */
    final Map<Object, AbstractC29253a> f69465f = new WeakHashMap();

    /* renamed from: g */
    final Map<Object, AbstractC29253a> f69466g = new WeakHashMap();

    /* renamed from: h */
    final Set<Object> f69467h = new HashSet();

    /* renamed from: i */
    final Handler f69468i;

    /* renamed from: j */
    final Handler f69469j;

    /* renamed from: k */
    final AbstractC29274d f69470k;

    /* renamed from: l */
    final C29255aa f69471l;

    /* renamed from: m */
    final List<RunnableC29267c> f69472m;

    /* renamed from: n */
    final C29284c f69473n;

    /* renamed from: o */
    final boolean f69474o;

    /* renamed from: p */
    public boolean f69475p;

    static {
        Covode.recordClassIndex(35629);
    }

    /* renamed from: com.squareup.b.i$b */
    static class HandlerThreadC29283b extends HandlerThread {
        static {
            Covode.recordClassIndex(35632);
        }

        HandlerThreadC29283b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.b.i$c */
    static class C29284c extends BroadcastReceiver {

        /* renamed from: a */
        final C29280i f69479a;

        static {
            Covode.recordClassIndex(35633);
        }

        C29284c(C29280i iVar) {
            this.f69479a = iVar;
        }

        /* renamed from: a */
        private static NetworkInfo m58663a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        C29280i iVar = this.f69479a;
                        iVar.f69468i.sendMessage(iVar.f69468i.obtainMessage(10, intent.getBooleanExtra("state", false) ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    C29280i iVar2 = this.f69479a;
                    iVar2.f69468i.sendMessage(iVar2.f69468i.obtainMessage(9, m58663a((ConnectivityManager) C29262ae.m58604a(context, "connectivity"))));
                }
            }
        }

        /* renamed from: b */
        private static Intent m58664b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent m58662a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m58664b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.C29280i.C29284c.m58662a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    /* renamed from: a */
    private static NetworkInfo m58649a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    private void m58651b(AbstractC29253a aVar) {
        Object c = aVar.mo51049c();
        if (c != null) {
            aVar.f69384k = true;
            this.f69465f.put(c, aVar);
        }
    }

    /* renamed from: e */
    private void m58652e(RunnableC29267c cVar) {
        AbstractC29253a aVar = cVar.f69439k;
        if (aVar != null) {
            m58651b(aVar);
        }
        List<AbstractC29253a> list = cVar.f69440l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m58651b(list.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51082a(AbstractC29253a aVar) {
        Handler handler = this.f69468i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo51087b(RunnableC29267c cVar) {
        Handler handler = this.f69468i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo51089d(RunnableC29267c cVar) {
        if (!cVar.mo51067b()) {
            this.f69472m.add(cVar);
            if (!this.f69468i.hasMessages(7)) {
                this.f69468i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51084a(RunnableC29267c cVar) {
        Handler handler = this.f69468i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* renamed from: a */
    static void m58650a(List<RunnableC29267c> list) {
        if (!list.isEmpty() && list.get(0).f69430b.f69526m) {
            StringBuilder sb = new StringBuilder();
            for (RunnableC29267c cVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C29262ae.m58606a(cVar));
            }
            C29262ae.m58613a("Dispatcher", "delivered", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51081a(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f69462c;
        if (executorService instanceof C29310v) {
            C29310v vVar = (C29310v) executorService;
            if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
                vVar.mo51121a(3);
            } else {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            vVar.mo51121a(1);
                            break;
                        default:
                            switch (subtype) {
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                case ABRConfig.ABR_SELECT_SCENE:
                                case 15:
                                    vVar.mo51121a(3);
                                    break;
                                default:
                                    vVar.mo51121a(3);
                                    break;
                            }
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            vVar.mo51121a(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    vVar.mo51121a(4);
                } else {
                    vVar.mo51121a(3);
                }
                if (networkInfo.isConnected() && !this.f69465f.isEmpty()) {
                    Iterator<AbstractC29253a> it = this.f69465f.values().iterator();
                    while (it.hasNext()) {
                        AbstractC29253a next = it.next();
                        it.remove();
                        if (next.f69374a.f69526m) {
                            C29262ae.m58613a("Dispatcher", "replaying", next.f69375b.mo51124a());
                        }
                        mo51083a(next, false);
                    }
                    return;
                }
            }
        }
        if (networkInfo == null) {
            return;
        }
        if (networkInfo.isConnected()) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo51088c(RunnableC29267c cVar) {
        boolean z;
        boolean z2;
        if (!cVar.mo51067b()) {
            boolean z3 = false;
            if (this.f69462c.isShutdown()) {
                mo51085a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f69474o) {
                networkInfo = m58649a((ConnectivityManager) C29262ae.m58604a(this.f69461b, "connectivity"));
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            if (cVar.f69446r > 0) {
                cVar.f69446r--;
                z2 = cVar.f69438j.mo51105a(networkInfo);
            } else {
                z2 = false;
            }
            boolean b = cVar.f69438j.mo51106b();
            if (!z2) {
                if (this.f69474o && b) {
                    z3 = true;
                }
                mo51085a(cVar, z3);
                if (z3) {
                    m58652e(cVar);
                }
            } else if (!this.f69474o || z) {
                if (cVar.f69430b.f69526m) {
                    C29262ae.m58613a("Dispatcher", "retrying", C29262ae.m58607a(cVar, ""));
                }
                if (cVar.f69444p instanceof C29296r.C29297a) {
                    cVar.f69437i |= EnumC29295q.NO_CACHE.f69510a;
                }
                cVar.f69442n = this.f69462c.submit(cVar);
            } else {
                mo51085a(cVar, b);
                if (b) {
                    m58652e(cVar);
                }
            }
        }
    }

    /* renamed from: com.squareup.b.i$a */
    static class HandlerC29281a extends Handler {

        /* renamed from: a */
        private final C29280i f69476a;

        static {
            Covode.recordClassIndex(35630);
        }

        public final void handleMessage(final Message message) {
            boolean z;
            boolean z2;
            switch (message.what) {
                case 1:
                    this.f69476a.mo51083a((AbstractC29253a) message.obj, true);
                    return;
                case 2:
                    AbstractC29253a aVar = (AbstractC29253a) message.obj;
                    C29280i iVar = this.f69476a;
                    String str = aVar.f69382i;
                    RunnableC29267c cVar = iVar.f69464e.get(str);
                    if (cVar != null) {
                        cVar.mo51066b(aVar);
                        if (cVar.mo51065a()) {
                            iVar.f69464e.remove(str);
                            if (aVar.f69374a.f69526m) {
                                C29262ae.m58613a("Dispatcher", "canceled", aVar.f69375b.mo51124a());
                            }
                        }
                    }
                    if (iVar.f69467h.contains(aVar.f69383j)) {
                        iVar.f69466g.remove(aVar.mo51049c());
                        if (aVar.f69374a.f69526m) {
                            C29262ae.m58614a("Dispatcher", "canceled", aVar.f69375b.mo51124a(), "because paused request got canceled");
                        }
                    }
                    AbstractC29253a remove = iVar.f69465f.remove(aVar.mo51049c());
                    if (remove != null && remove.f69374a.f69526m) {
                        C29262ae.m58614a("Dispatcher", "canceled", remove.f69375b.mo51124a(), "from replaying");
                        return;
                    }
                    return;
                case 3:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                default:
                    C29299t.f69514a.post(new Runnable() {
                        /* class com.squareup.p2081b.C29280i.HandlerC29281a.RunnableC292821 */

                        static {
                            Covode.recordClassIndex(35631);
                        }

                        public final void run() {
                            throw new AssertionError("Unknown handler message received: " + message.what);
                        }
                    });
                    return;
                case 4:
                    RunnableC29267c cVar2 = (RunnableC29267c) message.obj;
                    C29280i iVar2 = this.f69476a;
                    if ((cVar2.f69436h & EnumC29294p.NO_STORE.f69508a) == 0) {
                        iVar2.f69470k.mo51076a(cVar2.f69434f, cVar2.f69441m);
                    }
                    iVar2.f69464e.remove(cVar2.f69434f);
                    iVar2.mo51089d(cVar2);
                    if (cVar2.f69430b.f69526m) {
                        C29262ae.m58614a("Dispatcher", "batched", C29262ae.m58606a(cVar2), "for completion");
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f69476a.mo51088c((RunnableC29267c) message.obj);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f69476a.mo51085a((RunnableC29267c) message.obj, false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    C29280i iVar3 = this.f69476a;
                    ArrayList arrayList = new ArrayList(iVar3.f69472m);
                    iVar3.f69472m.clear();
                    iVar3.f69469j.sendMessage(iVar3.f69469j.obtainMessage(8, arrayList));
                    C29280i.m58650a((List<RunnableC29267c>) arrayList);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    this.f69476a.mo51081a((NetworkInfo) message.obj);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    C29280i iVar4 = this.f69476a;
                    if (message.arg1 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVar4.f69475p = z;
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    Object obj = message.obj;
                    C29280i iVar5 = this.f69476a;
                    if (iVar5.f69467h.add(obj)) {
                        Iterator<RunnableC29267c> it = iVar5.f69464e.values().iterator();
                        while (it.hasNext()) {
                            RunnableC29267c next = it.next();
                            boolean z3 = next.f69430b.f69526m;
                            AbstractC29253a aVar2 = next.f69439k;
                            List<AbstractC29253a> list = next.f69440l;
                            if (list == null || list.isEmpty()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (aVar2 != null || z2) {
                                if (aVar2 != null && aVar2.f69383j.equals(obj)) {
                                    next.mo51066b(aVar2);
                                    iVar5.f69466g.put(aVar2.mo51049c(), aVar2);
                                    if (z3) {
                                        C29262ae.m58614a("Dispatcher", "paused", aVar2.f69375b.mo51124a(), "because tag '" + obj + "' was paused");
                                    }
                                }
                                if (z2) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        AbstractC29253a aVar3 = list.get(size);
                                        if (aVar3.f69383j.equals(obj)) {
                                            next.mo51066b(aVar3);
                                            iVar5.f69466g.put(aVar3.mo51049c(), aVar3);
                                            if (z3) {
                                                C29262ae.m58614a("Dispatcher", "paused", aVar3.f69375b.mo51124a(), "because tag '" + obj + "' was paused");
                                            }
                                        }
                                    }
                                }
                                if (next.mo51065a()) {
                                    it.remove();
                                    if (z3) {
                                        C29262ae.m58614a("Dispatcher", "canceled", C29262ae.m58606a(next), "all actions paused");
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    this.f69476a.mo51086a(message.obj);
                    return;
            }
        }

        public HandlerC29281a(Looper looper, C29280i iVar) {
            super(looper);
            this.f69476a = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51086a(Object obj) {
        if (this.f69467h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<AbstractC29253a> it = this.f69466g.values().iterator();
            while (it.hasNext()) {
                AbstractC29253a next = it.next();
                if (next.f69383j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f69469j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51083a(AbstractC29253a aVar, boolean z) {
        if (this.f69467h.contains(aVar.f69383j)) {
            this.f69466g.put(aVar.mo51049c(), aVar);
            if (aVar.f69374a.f69526m) {
                C29262ae.m58614a("Dispatcher", "paused", aVar.f69375b.mo51124a(), "because tag '" + aVar.f69383j + "' is paused");
                return;
            }
            return;
        }
        RunnableC29267c cVar = this.f69464e.get(aVar.f69382i);
        if (cVar != null) {
            cVar.mo51064a(aVar);
        } else if (!this.f69462c.isShutdown()) {
            RunnableC29267c a = RunnableC29267c.m58625a(aVar.f69374a, this, this.f69470k, this.f69471l, aVar);
            a.f69442n = this.f69462c.submit(a);
            this.f69464e.put(aVar.f69382i, a);
            if (z) {
                this.f69465f.remove(aVar.mo51049c());
            }
            if (aVar.f69374a.f69526m) {
                C29262ae.m58613a("Dispatcher", "enqueued", aVar.f69375b.mo51124a());
            }
        } else if (aVar.f69374a.f69526m) {
            C29262ae.m58614a("Dispatcher", "ignored", aVar.f69375b.mo51124a(), "because shut down");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51085a(RunnableC29267c cVar, boolean z) {
        if (cVar.f69430b.f69526m) {
            String str = "";
            String a = C29262ae.m58607a(cVar, str);
            StringBuilder sb = new StringBuilder("for error");
            if (z) {
                str = " (will replay)";
            }
            C29262ae.m58614a("Dispatcher", "batched", a, sb.append(str).toString());
        }
        this.f69464e.remove(cVar.f69434f);
        mo51089d(cVar);
    }

    C29280i(Context context, ExecutorService executorService, Handler handler, AbstractC29285j jVar, AbstractC29274d dVar, C29255aa aaVar) {
        boolean z;
        HandlerThreadC29283b bVar = new HandlerThreadC29283b();
        this.f69460a = bVar;
        bVar.start();
        C29262ae.m58611a(bVar.getLooper());
        this.f69461b = context;
        this.f69462c = executorService;
        this.f69468i = new HandlerC29281a(bVar.getLooper(), this);
        this.f69463d = jVar;
        this.f69469j = handler;
        this.f69470k = dVar;
        this.f69471l = aaVar;
        this.f69472m = new ArrayList(4);
        this.f69475p = C29262ae.m58619c(context);
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f69474o = z;
        C29284c cVar = new C29284c(this);
        this.f69473n = cVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.f69479a.f69474o) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        C29284c.m58662a(cVar.f69479a.f69461b, cVar, intentFilter);
    }
}
