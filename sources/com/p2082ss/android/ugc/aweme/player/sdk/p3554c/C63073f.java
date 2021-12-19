package com.p2082ss.android.ugc.aweme.player.sdk.p3554c;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63058d;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84200d;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.f */
public final class C63073f implements C63064c.AbstractC63070b {

    /* renamed from: i */
    public static volatile boolean f143332i;

    /* renamed from: a */
    public C84209m.EnumC84214e f143333a;

    /* renamed from: b */
    List<C63064c> f143334b;

    /* renamed from: c */
    public C63064c f143335c;

    /* renamed from: d */
    C63064c f143336d;

    /* renamed from: e */
    C63064c f143337e;

    /* renamed from: f */
    boolean f143338f;

    /* renamed from: g */
    public AbstractC63041i f143339g;

    /* renamed from: h */
    public C63071d f143340h;

    /* renamed from: j */
    public HandlerThread f143341j;

    /* renamed from: k */
    public HandlerC63074a f143342k;

    /* renamed from: l */
    public AbstractC63050k f143343l;

    /* renamed from: m */
    public final Object f143344m = new Object();

    /* renamed from: n */
    private List<HandlerThread> f143345n;

    /* renamed from: o */
    private List<HandlerThread> f143346o;

    /* renamed from: p */
    private List<C63064c> f143347p;

    /* renamed from: q */
    private boolean f143348q;

    /* renamed from: r */
    private boolean f143349r;

    /* renamed from: s */
    private long f143350s;

    /* renamed from: t */
    private long f143351t;

    /* renamed from: u */
    private long f143352u;

    /* renamed from: v */
    private long f143353v;

    /* renamed from: w */
    private String f143354w;

    /* renamed from: x */
    private String f143355x;

    /* renamed from: y */
    private String f143356y;

    /* renamed from: z */
    private int f143357z = -1;

    static {
        Covode.recordClassIndex(73912);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.c.f$a */
    public class HandlerC63074a extends Handler {

        /* renamed from: a */
        public volatile boolean f143358a;

        /* renamed from: b */
        volatile C63061a f143359b;

        /* renamed from: c */
        public volatile boolean f143360c;

        static {
            Covode.recordClassIndex(73913);
        }

        /* renamed from: a */
        public final void mo101234a() {
            if (!this.f143360c) {
                sendEmptyMessage(3);
            }
        }

        public final void handleMessage(Message message) {
            MethodCollector.m26663i(6382);
            int i = message.what;
            AbstractC63050k kVar = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.f143359b != null) {
                            this.f143359b.mo101219g();
                            this.f143359b.mo101220h();
                            this.f143359b = null;
                        } else {
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.HandlerC63074a.RunnableC630751 */

                                static {
                                    Covode.recordClassIndex(73914);
                                }

                                public final void run() {
                                    if (C63073f.this.f143341j != null) {
                                        int i = Build.VERSION.SDK_INT;
                                        C63073f.this.f143341j.quitSafely();
                                    }
                                }
                            });
                        }
                        this.f143360c = true;
                    }
                    MethodCollector.m26664o(6382);
                } else if (this.f143360c) {
                    MethodCollector.m26664o(6382);
                } else {
                    synchronized (C63073f.this.f143344m) {
                        try {
                            if (!this.f143358a && !C63073f.f143332i && (this.f143359b == null || !this.f143359b.f143276a)) {
                                if (this.f143359b == null) {
                                    m113951a(C63073f.this.f143343l, 2);
                                }
                                if (message.obj instanceof C63058d) {
                                    C63058d dVar = (C63058d) message.obj;
                                    C84217p pVar = dVar.f143234a;
                                    AbstractC63032b bVar = dVar.f143235b;
                                    if (C63073f.this.f143343l != null) {
                                        C63073f.this.f143343l.mo101182a();
                                    }
                                    if (this.f143359b != null && !this.f143359b.f143290i && !this.f143359b.f143291j && !this.f143359b.f143276a && !TextUtils.equals(pVar.f188196j, this.f143359b.f143284c)) {
                                        if (pVar.f188207u != null) {
                                            this.f143359b.mo101206a(pVar.f188207u);
                                        }
                                        pVar.f188206t = true;
                                        this.f143359b.mo101208a(bVar);
                                        this.f143359b.mo101213a(pVar);
                                        this.f143359b.f143276a = true;
                                    }
                                }
                                MethodCollector.m26664o(6382);
                            }
                        } finally {
                            MethodCollector.m26664o(6382);
                        }
                    }
                }
            } else if (this.f143360c) {
                MethodCollector.m26664o(6382);
            } else {
                synchronized (C63073f.this.f143344m) {
                    try {
                        if (!this.f143358a && !C63073f.f143332i && this.f143359b == null) {
                            if (message.obj instanceof AbstractC63050k) {
                                kVar = (AbstractC63050k) message.obj;
                            }
                            m113951a(kVar, 1);
                            MethodCollector.m26664o(6382);
                        }
                    } finally {
                        MethodCollector.m26664o(6382);
                    }
                }
            }
        }

        public HandlerC63074a(HandlerThread handlerThread) {
            super(handlerThread.getLooper());
        }

        /* renamed from: a */
        private void m113951a(AbstractC63050k kVar, int i) {
            boolean z;
            if (kVar != null) {
                kVar.mo101183a(i);
            }
            if (C63073f.this.f143340h == null || !C63073f.this.f143340h.f143331q) {
                z = false;
            } else {
                z = true;
            }
            this.f143359b = new C63061a(C63073f.this.f143333a, C63073f.this.f143341j, new C63064c.AbstractC63070b() {
                /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.HandlerC63074a.C630762 */

                static {
                    Covode.recordClassIndex(73915);
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c.AbstractC63070b
                /* renamed from: a */
                public final void mo101225a(final C63064c cVar, final HandlerThread handlerThread) {
                    if (handlerThread != null && handlerThread.getLooper() != Looper.getMainLooper()) {
                        C63073f.this.f143342k.post(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.HandlerC63074a.C630762.RunnableC630771 */

                            static {
                                Covode.recordClassIndex(73916);
                            }

                            public final void run() {
                                C63064c cVar = cVar;
                                if (cVar != null) {
                                    cVar.f143291j = true;
                                }
                                new Handler(Looper.getMainLooper()).post(new Runnable() {
                                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.HandlerC63074a.C630762.RunnableC630771.RunnableC630781 */

                                    static {
                                        Covode.recordClassIndex(73917);
                                    }

                                    public final void run() {
                                        int i = Build.VERSION.SDK_INT;
                                        handlerThread.quitSafely();
                                    }
                                });
                            }
                        });
                    }
                }
            }, C63073f.this.f143339g, z);
            this.f143359b.mo101211a(kVar);
            this.f143359b.mo101200a();
            if (C84191b.m144783j()) {
                this.f143359b.mo101216d();
            }
            if (kVar != null) {
                kVar.mo101186b(i);
            }
        }
    }

    /* renamed from: d */
    private boolean m113941d() {
        if (this.f143340h.f143321g - (this.f143345n.size() + this.f143346o.size()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo101231b() {
        if (this.f143341j == null || this.f143342k == null) {
            HandlerThread handlerThread = new HandlerThread("acceleratePlayHandlerThread");
            this.f143341j = handlerThread;
            handlerThread.start();
            this.f143342k = new HandlerC63074a(this.f143341j);
        }
    }

    /* renamed from: c */
    private void m113939c() {
        if (C62960a.f142907a) {
            C62960a.m113385a("PlaySessionManager", "initThreadPool max:" + this.f143340h.f143321g + ", core:" + this.f143340h.f143322h);
        }
        for (int i = 0; i < this.f143340h.f143322h; i++) {
            try {
                HandlerThread handlerThread = new HandlerThread("play_thread_".concat(String.valueOf(i)), 0);
                handlerThread.start();
                this.f143345n.add(handlerThread);
            } catch (Exception unused) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("PlaySessionManager", "create init thread fail, may use main looper");
                }
            }
        }
        this.f143350s = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo101228a() {
        if (C62960a.f142907a) {
            C62960a.m113385a("PlaySessionManager", "release mCurrentSession:" + this.f143335c);
        }
        C63064c cVar = this.f143335c;
        if (cVar != null) {
            cVar.mo101220h();
        }
        this.f143335c = null;
        C63064c cVar2 = this.f143336d;
        if (cVar2 != null) {
            cVar2.mo101220h();
        }
        this.f143336d = null;
        C63064c cVar3 = this.f143337e;
        if (cVar3 != null) {
            cVar3.mo101220h();
        }
        this.f143337e = null;
        HandlerC63074a aVar = this.f143342k;
        if (aVar != null) {
            aVar.mo101234a();
        }
        for (HandlerThread handlerThread : this.f143345n) {
            int i = Build.VERSION.SDK_INT;
            handlerThread.quitSafely();
        }
        if (this.f143347p != null) {
            if (C62960a.f142907a) {
                C62960a.m113385a("PlaySessionManager", "release session pool:" + this.f143347p.size());
            }
            if (this.f143347p.size() > 0) {
                for (C63064c cVar4 : this.f143347p) {
                    cVar4.mo101220h();
                }
            }
            this.f143347p.clear();
        }
        this.f143345n.clear();
        this.f143346o.clear();
        this.f143334b.clear();
        this.f143338f = true;
        this.f143352u = System.currentTimeMillis();
        this.f143356y = Thread.currentThread().getName();
    }

    /* renamed from: b */
    static boolean m113938b(C63064c cVar) {
        if (cVar == null || !cVar.mo101215c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m113937a(C63064c cVar) {
        Message obtainMessage = cVar.f143286e.obtainMessage(17);
        cVar.mo101205a(4, 10, obtainMessage);
        cVar.mo101218f();
        cVar.mo101217e();
        obtainMessage.sendToTarget();
    }

    /* renamed from: c */
    private static boolean m113940c(C84217p pVar) {
        C84200d dVar;
        if (pVar == null || (dVar = pVar.f188146R) == null) {
            return false;
        }
        if (dVar.f187982a == null && TextUtils.isEmpty(dVar.f187984c)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m113942e(C63064c cVar) {
        if (!C84191b.m144785l() || cVar.f143294m) {
            this.f143347p.add(cVar);
            return true;
        }
        cVar.mo101219g();
        cVar.mo101220h();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        if (r4 != null) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c mo101230b(com.p2082ss.android.ugc.playerkit.model.C84217p r6) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.mo101230b(com.ss.android.ugc.playerkit.model.p):com.ss.android.ugc.aweme.player.sdk.c.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo101232c(C63064c cVar) {
        if (cVar == null || cVar.f143290i || cVar.f143291j || !this.f143348q) {
            return false;
        }
        if (!this.f143340h.f143325k && m113940c(cVar.f143289h)) {
            return false;
        }
        boolean z = true;
        if (this.f143340h.f143328n ? this.f143347p == null : this.f143337e != null) {
            z = false;
        }
        if (this.f143340h.f143326l && this.f143347p != null && cVar.f143293l == 0 && !this.f143347p.isEmpty()) {
            z = false;
        }
        if (!C84191b.m144785l() || cVar.f143294m) {
            return z;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo101233d(C63064c cVar) {
        List<C63064c> list;
        if (cVar != null && (list = this.f143347p) != null && !list.contains(cVar)) {
            if (this.f143347p.size() < this.f143340h.f143323i) {
                this.f143347p.add(cVar);
                return;
            }
            ArrayList arrayList = new ArrayList(3);
            Iterator<C63064c> it = this.f143347p.iterator();
            while (true) {
                if (it.hasNext()) {
                    C63064c next = it.next();
                    if (next.f143293l == cVar.f143293l) {
                        break;
                    } else if (arrayList.contains(Integer.valueOf(next.f143293l))) {
                        this.f143347p.remove(next);
                        next.mo101220h();
                        this.f143347p.add(cVar);
                        return;
                    } else {
                        arrayList.add(Integer.valueOf(next.f143293l));
                    }
                } else if (1 == this.f143347p.size()) {
                    C63064c cVar2 = this.f143347p.get(0);
                    if (cVar2 != null) {
                        cVar2.mo101220h();
                    }
                    this.f143347p.remove(0);
                    this.f143347p.add(cVar);
                    return;
                }
            }
            cVar.mo101220h();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c mo101227a(com.p2082ss.android.ugc.playerkit.model.C84217p r14) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.mo101227a(com.ss.android.ugc.playerkit.model.p):com.ss.android.ugc.aweme.player.sdk.c.c");
    }

    public C63073f(C84209m.EnumC84214e eVar, C63071d dVar) {
        this.f143333a = eVar;
        this.f143334b = new ArrayList();
        this.f143340h = dVar;
        if (dVar == null) {
            this.f143340h = new C63071d();
        }
        if (this.f143340h.f143319e && this.f143340h.f143323i > 0) {
            this.f143347p = new ArrayList(this.f143340h.f143323i);
        }
        if (this.f143340h.f143318d) {
            this.f143340h.f143321g = 1;
            this.f143340h.f143322h = 1;
        }
        if (this.f143340h.f143321g == 1 && this.f143340h.f143322h == 1 && this.f143340h.f143319e) {
            this.f143340h.f143323i = 0;
        }
        if (dVar.f143321g <= 0) {
            dVar.f143321g = C63071d.f143315a;
        }
        if (dVar.f143322h > dVar.f143321g || dVar.f143322h <= 0) {
            dVar.f143322h = dVar.f143321g;
        }
        if (this.f143340h.f143319e && this.f143340h.f143323i > this.f143340h.f143322h) {
            C63071d dVar2 = this.f143340h;
            dVar2.f143323i = dVar2.f143322h;
        }
        this.f143348q = this.f143340h.f143324j;
        this.f143349r = this.f143340h.f143325k;
        this.f143345n = new ArrayList(dVar.f143321g);
        this.f143346o = new ArrayList(dVar.f143321g);
        m113939c();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c.AbstractC63070b
    /* renamed from: a */
    public final void mo101225a(C63064c cVar, HandlerThread handlerThread) {
        Object valueOf;
        this.f143334b.remove(cVar);
        this.f143355x = Thread.currentThread().getName();
        this.f143357z = 0;
        if (C62960a.f142907a) {
            StringBuilder append = new StringBuilder("onSessionRelease session:").append(cVar).append(", idle size:").append(this.f143345n.size()).append(", working size:").append(this.f143346o.size()).append(", session list size:").append(this.f143334b.size()).append(", session pool size:");
            List<C63064c> list = this.f143347p;
            if (list == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(list.size());
            }
            C62960a.m113385a("PlaySessionManager", append.append(valueOf).toString());
        }
        if (handlerThread.getLooper() == Looper.getMainLooper()) {
            this.f143346o.removeAll(Collections.singleton(handlerThread));
            this.f143345n.removeAll(Collections.singleton(handlerThread));
            this.f143354w = handlerThread.toString();
            this.f143353v = System.currentTimeMillis();
            this.f143357z = 1;
            if (C62960a.f142907a) {
                C62960a.m113389b("PlaySessionManager", "onSessionRelease main looper thread");
            }
        } else if (this.f143338f) {
            int i = Build.VERSION.SDK_INT;
            handlerThread.quitSafely();
            this.f143354w = handlerThread.toString();
            this.f143353v = System.currentTimeMillis();
            this.f143357z = 2;
            this.f143346o.clear();
            this.f143345n.clear();
        } else {
            for (C63064c cVar2 : this.f143334b) {
                if (cVar2.f143285d == handlerThread) {
                    return;
                }
            }
            if (this.f143345n.size() < this.f143340h.f143322h) {
                if (!this.f143345n.contains(handlerThread)) {
                    this.f143345n.add(handlerThread);
                }
                this.f143346o.removeAll(Collections.singleton(handlerThread));
                this.f143354w = handlerThread.toString();
                this.f143353v = System.currentTimeMillis();
                this.f143357z = 3;
                if (C62960a.f142907a) {
                    C62960a.m113385a("PlaySessionManager", "onSessionRelease recycle to idle pool");
                    return;
                }
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            handlerThread.quitSafely();
            this.f143354w = handlerThread.toString();
            this.f143353v = System.currentTimeMillis();
            this.f143357z = 4;
            this.f143346o.removeAll(Collections.singleton(handlerThread));
            this.f143345n.removeAll(Collections.singleton(handlerThread));
            if (C62960a.f142907a) {
                C62960a.m113385a("PlaySessionManager", "onSessionRelease quit thread");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0463, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101229a(com.p2082ss.android.ugc.playerkit.model.C84217p r13, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r14, com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b r15) {
        /*
        // Method dump skipped, instructions count: 1764
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63073f.mo101229a(com.ss.android.ugc.playerkit.model.p, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.player.sdk.api.b):void");
    }
}
