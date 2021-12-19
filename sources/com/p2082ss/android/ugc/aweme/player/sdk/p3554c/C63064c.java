package com.p2082ss.android.ugc.aweme.player.sdk.p3554c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63035e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.HandlerC63062b;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84206j;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.c */
public class C63064c {

    /* renamed from: a */
    private C84209m.EnumC84214e f143282a;

    /* renamed from: b */
    private boolean f143283b;

    /* renamed from: c */
    public String f143284c;

    /* renamed from: d */
    public HandlerThread f143285d;

    /* renamed from: e */
    HandlerC63062b f143286e;

    /* renamed from: f */
    C63081i f143287f;

    /* renamed from: g */
    public Handler f143288g;

    /* renamed from: h */
    C84217p f143289h;

    /* renamed from: i */
    public boolean f143290i;

    /* renamed from: j */
    public boolean f143291j;

    /* renamed from: k */
    public OnUIPlayListener f143292k;

    /* renamed from: l */
    public volatile int f143293l;

    /* renamed from: m */
    public volatile boolean f143294m = true;

    /* renamed from: n */
    public int f143295n;

    /* renamed from: o */
    public int f143296o;

    /* renamed from: p */
    public boolean f143297p;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.c.c$b */
    interface AbstractC63070b {
        static {
            Covode.recordClassIndex(73909);
        }

        /* renamed from: a */
        void mo101225a(C63064c cVar, HandlerThread handlerThread);
    }

    static {
        Covode.recordClassIndex(73903);
    }

    /* renamed from: b */
    public boolean mo101201b() {
        return false;
    }

    /* renamed from: a */
    public final void mo101213a(C84217p pVar) {
        C84217p pVar2 = this.f143289h;
        final boolean z = pVar2 != null && pVar2.f188206t && pVar != null && !pVar.f188206t && TextUtils.equals(pVar.f188196j, this.f143289h.f188196j);
        this.f143289h = pVar;
        pVar.f188158aC = this.f143283b;
        this.f143284c = pVar.f188196j;
        if (!this.f143297p || !this.f143289h.f188201o) {
            this.f143293l = this.f143289h.f188200n ? 1 : 0;
            this.f143295n = this.f143289h.f188147S;
            this.f143296o = this.f143289h.f188148T;
        }
        SystemClock.elapsedRealtime();
        C84217p pVar3 = this.f143289h;
        if (pVar3 != null && !this.f143290i && !this.f143291j) {
            int i = 2;
            if (!pVar3.f188206t || !this.f143289h.f188156aA) {
                mo101205a(1, 0, null);
            } else {
                mo101205a(2, 10, null);
            }
            this.f143286e.removeCallbacks(null);
            if (this.f143289h.f188130B && !C84206j.m144803a(this.f143289h)) {
                if (this.f143289h.f188175an) {
                    OnUIPlayListener onUIPlayListener = this.f143292k;
                    if (onUIPlayListener != null) {
                        onUIPlayListener.onPreparePlay(this.f143284c);
                        C84215n nVar = new C84215n(this.f143284c);
                        if (!z) {
                            i = 3;
                        }
                        nVar.f188115e = i;
                        this.f143292k.onPreParePlay(this.f143284c, nVar);
                    }
                } else if (this.f143292k != null) {
                    this.f143288g.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c.RunnableC630683 */

                        static {
                            Covode.recordClassIndex(73907);
                        }

                        public final void run() {
                            int i;
                            if (C63064c.this.f143292k != null) {
                                C63064c.this.f143292k.onPreparePlay(C63064c.this.f143284c);
                                C84215n nVar = new C84215n(C63064c.this.f143284c);
                                if (z) {
                                    i = 2;
                                } else {
                                    i = 3;
                                }
                                nVar.f188115e = i;
                                C63064c.this.f143292k.onPreParePlay(C63064c.this.f143284c, nVar);
                            }
                        }
                    });
                }
            }
            this.f143286e.obtainMessage(1, this.f143289h).sendToTarget();
        }
    }

    /* renamed from: a */
    public void mo101200a() {
        this.f143286e.sendEmptyMessage(16);
    }

    /* renamed from: c */
    public final boolean mo101215c() {
        if (this.f143289h == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo101216d() {
        this.f143286e.sendEmptyMessage(20);
    }

    /* renamed from: e */
    public final void mo101217e() {
        this.f143286e.removeMessages(12);
    }

    /* renamed from: f */
    public final void mo101218f() {
        this.f143286e.sendEmptyMessage(6);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.c.c$a */
    static class C63069a {

        /* renamed from: a */
        int f143304a = -1;

        /* renamed from: b */
        int f143305b = -1;

        /* renamed from: c */
        int f143306c = -1;

        /* renamed from: d */
        long f143307d;

        /* renamed from: e */
        long f143308e;

        /* renamed from: f */
        long f143309f;

        /* renamed from: g */
        long f143310g;

        /* renamed from: h */
        String f143311h;

        /* renamed from: i */
        String f143312i;

        /* renamed from: j */
        String f143313j;

        /* renamed from: k */
        int f143314k = -1;

        static {
            Covode.recordClassIndex(73908);
        }

        C63069a() {
        }

        public final String toString() {
            return "DebugInfo{path=" + this.f143304a + ", itc=" + this.f143305b + ", wtc=" + this.f143306c + ", it=" + this.f143307d + ", et=" + this.f143308e + ", rt=" + this.f143309f + ", qt=" + this.f143310g + ", qtd='" + this.f143311h + '\'' + ", srtd='" + this.f143312i + '\'' + ", rtd='" + this.f143313j + '\'' + ", qr='" + this.f143314k + '\'' + '}';
        }
    }

    /* renamed from: g */
    public final void mo101219g() {
        mo101218f();
        mo101217e();
        this.f143286e.sendEmptyMessage(17);
    }

    /* renamed from: h */
    public final void mo101220h() {
        Message obtainMessage = this.f143286e.obtainMessage(7);
        mo101205a(3, 10, obtainMessage);
        this.f143286e.removeCallbacksAndMessages(null);
        obtainMessage.sendToTarget();
        this.f143290i = true;
    }

    public String toString() {
        return C1764a.m5928a("PlaySession{this=%s, key=%s, mIsReleasing=%s, mIsReleased=%s}", new Object[]{super.toString(), this.f143284c, Boolean.valueOf(this.f143290i), Boolean.valueOf(this.f143291j)});
    }

    /* renamed from: a */
    public final void mo101207a(OnUIPlayListener onUIPlayListener) {
        this.f143292k = onUIPlayListener;
        this.f143287f.f142981v = onUIPlayListener;
    }

    /* renamed from: a */
    public final void mo101206a(Surface surface) {
        if (((Boolean) C84191b.f187898b.getValue()).booleanValue()) {
            this.f143286e.obtainMessage(21, surface).sendToTarget();
        } else {
            this.f143287f.mo100980a(surface);
        }
    }

    /* renamed from: b */
    public final void mo101214b(Surface surface) {
        this.f143287f.mo101002b(surface);
        this.f143286e.obtainMessage(15, surface).sendToTarget();
    }

    /* renamed from: a */
    public final void mo101208a(AbstractC63032b bVar) {
        this.f143287f.mo100984a(bVar);
    }

    /* renamed from: a */
    public final void mo101209a(AbstractC63035e eVar) {
        this.f143287f.f142979t = eVar;
    }

    /* renamed from: a */
    public final void mo101210a(AbstractC63040h hVar) {
        this.f143287f.mo100986a(hVar);
    }

    /* renamed from: a */
    public final void mo101211a(AbstractC63050k kVar) {
        this.f143287f.mo100989a(kVar);
    }

    /* renamed from: a */
    public final void mo101212a(AbstractC84177b bVar) {
        this.f143287f.mo100991a(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo101205a(int i, int i2, Message message) {
        HandlerThread handlerThread = this.f143285d;
        if (handlerThread != null && handlerThread.getLooper() != null && this.f143285d.getLooper() != Looper.getMainLooper()) {
            int threadId = this.f143285d.getThreadId();
            if (this.f143283b && threadId > 0) {
                Process.setThreadPriority(threadId, i2);
                if ((i == 4 || i == 3) && message != null) {
                    message.obj = true;
                }
            }
        }
    }

    public C63064c(C84209m.EnumC84214e eVar, HandlerThread handlerThread, C84217p pVar, final AbstractC63070b bVar, AbstractC63041i iVar, C63069a aVar, boolean z) {
        Looper looper;
        this.f143282a = eVar;
        C630651 r0 = new C63081i(eVar) {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c.C630651 */

            static {
                Covode.recordClassIndex(73904);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i
            /* renamed from: b */
            public final void mo101041b(boolean z) {
                super.mo101041b(z);
                C63064c.this.f143294m = z;
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i
            /* renamed from: e */
            public final void mo101042e(int i) {
                super.mo101042e(i);
                if (((Boolean) C84191b.f187908l.getValue()).booleanValue()) {
                    int i2 = C63064c.this.f143293l;
                    C63064c.this.f143293l = i;
                }
            }
        };
        this.f143287f = r0;
        r0.f142983x = iVar;
        this.f143285d = handlerThread;
        this.f143289h = pVar;
        this.f143283b = z;
        if (pVar != null) {
            this.f143284c = pVar.f188196j;
            this.f143293l = this.f143289h.f188200n ? 1 : 0;
            this.f143295n = pVar.f188147S;
            this.f143296o = pVar.f188148T;
        }
        this.f143288g = new Handler(Looper.getMainLooper());
        if (handlerThread == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handlerThread.getLooper();
        }
        if (handlerThread == null && C62960a.f142907a) {
            C62960a.m113385a("PlaySession", "PlaySession create play thread null, looper:" + looper + ", di:" + aVar);
        }
        if (looper == null && C62960a.f142907a) {
            C62960a.m113385a("PlaySession", "PlaySession create with looper null, playThread:" + handlerThread + ", di:" + aVar);
        }
        this.f143286e = new HandlerC63062b(new HandlerC63062b.AbstractC63063a() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c.C630662 */

            static {
                Covode.recordClassIndex(73905);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3554c.HandlerC63062b.AbstractC63063a
            /* renamed from: a */
            public final void mo101204a() {
                C63064c.this.f143288g.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63064c.C630662.RunnableC630671 */

                    static {
                        Covode.recordClassIndex(73906);
                    }

                    public final void run() {
                        C63064c.this.f143290i = false;
                        C63064c.this.f143291j = true;
                        if (C63064c.this.f143292k != null) {
                            C63064c.this.f143292k.onPlayRelease(C63064c.this.f143284c);
                        }
                        C63064c.this.f143292k = null;
                        if (bVar != null) {
                            bVar.mo101225a(C63064c.this, C63064c.this.f143285d);
                        }
                    }
                });
            }
        }, looper, this.f143287f);
    }
}
