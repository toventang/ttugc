package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63035e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.h */
public final class C62970h implements AbstractC63051l {

    /* renamed from: a */
    public OnUIPlayListener f142932a;

    /* renamed from: b */
    public Handler f142933b;

    /* renamed from: c */
    public boolean f142934c;

    /* renamed from: d */
    private AbstractC63051l f142935d;

    /* renamed from: e */
    private HandlerThread f142936e;

    /* renamed from: f */
    private HandlerC62974a f142937f;

    /* renamed from: g */
    private String f142938g;

    static {
        Covode.recordClassIndex(73807);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: A */
    public final void mo100973A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100988a(AbstractC63042j.EnumC63047e eVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100994a(C84217p pVar, AbstractC63032b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101003b(AbstractC63050k kVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101008c(AbstractC63050k kVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: s */
    public final void mo101025s() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: m */
    public final void mo101019m() {
        mo101011e();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100993a(final C84217p pVar) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "prepare()" + (pVar != null ? pVar.f188196j : "null"));
        }
        if (pVar != null) {
            if (this.f142934c) {
                C62960a.m113389b("SimplifyAsyncPlayer", "mIsLastPlayThreadQuiting when prepare");
                return;
            }
            this.f142938g = pVar.f188196j;
            if (pVar.f188130B && this.f142932a != null) {
                this.f142933b.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h.RunnableC629732 */

                    static {
                        Covode.recordClassIndex(73810);
                    }

                    public final void run() {
                        if (C62970h.this.f142932a != null && pVar != null) {
                            C62970h.this.f142932a.onPreparePlay(pVar.f188196j);
                        }
                    }
                });
            }
            if (pVar.f188129A) {
                if (this.f142937f == null) {
                    m113422B();
                }
                this.f142937f.obtainMessage(1, pVar).sendToTarget();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100984a(AbstractC63032b bVar) {
        this.f142935d.mo100984a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100995a(String str) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "resume()" + this.f142938g);
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100989a(AbstractC63050k kVar) {
        this.f142935d.mo100989a(kVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100986a(AbstractC63040h hVar) {
        this.f142935d.mo100986a(hVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100991a(AbstractC84177b bVar) {
        this.f142935d.mo100991a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100985a(AbstractC63035e eVar) {
        this.f142935d.mo100985a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final boolean mo100998a(String str, String str2) {
        return TextUtils.equals(str, this.f142938g);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100987a(AbstractC63041i iVar) {
        this.f142935d.mo100987a(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100992a(C84203g gVar) {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(17, gVar).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100996a(boolean z) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo100996a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100990a(AbstractC63052m mVar) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo100990a(mVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100983a(AbstractC63031a aVar) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo100983a(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100997a(boolean z, Bundle bundle) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo100997a(z, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: i */
    public final boolean mo101015i() {
        return this.f142935d.mo101015i();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: j */
    public final long mo101016j() {
        return this.f142935d.mo101016j();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: k */
    public final long mo101017k() {
        return this.f142935d.mo101017k();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: l */
    public final boolean mo101018l() {
        return this.f142935d.mo101018l();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: n */
    public final String mo101020n() {
        return this.f142935d.mo101020n();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: o */
    public final int mo101021o() {
        return this.f142935d.mo101021o();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: p */
    public final void mo101022p() {
        this.f142935d.mo101022p();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: t */
    public final C84209m.EnumC84214e mo101026t() {
        return this.f142935d.mo101026t();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: x */
    public final boolean mo101030x() {
        return this.f142935d.mo101030x();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: y */
    public final boolean mo101031y() {
        return this.f142935d.mo101031y();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: z */
    public final boolean mo101032z() {
        return this.f142935d.mo101032z();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final int mo100975a() {
        return this.f142935d.mo100975a();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo100999b() {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.sendEmptyMessage(16);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: r */
    public final void mo101024r() {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.removeMessages(12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: u */
    public final AbstractC63042j.C63049g mo101027u() {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            return lVar.mo101027u();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: v */
    public final AbstractC63042j.C63048f mo101028v() {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            return lVar.mo101028v();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: w */
    public final String mo101029w() {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            return lVar.mo101029w();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: h */
    public final void mo101014h() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "resume()");
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(4).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: q */
    public final void mo101023q() {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.mo101036a(300);
            this.f142937f.sendEmptyMessage(12);
        }
    }

    /* renamed from: B */
    private void m113422B() {
        Looper looper;
        try {
            HandlerThread handlerThread = new HandlerThread("play_thread", 0);
            this.f142936e = handlerThread;
            handlerThread.start();
        } catch (Exception unused) {
            this.f142936e = null;
        }
        this.f142933b = new Handler(Looper.getMainLooper());
        C629711 r2 = new HandlerC62974a.AbstractC62975a() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h.C629711 */

            static {
                Covode.recordClassIndex(73808);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h.HandlerC62974a.AbstractC62975a
            /* renamed from: a */
            public final void mo101033a() {
                C62970h.this.f142933b.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h.C629711.RunnableC629721 */

                    static {
                        Covode.recordClassIndex(73809);
                    }

                    public final void run() {
                        C62970h.this.f142934c = false;
                    }
                });
            }
        };
        HandlerThread handlerThread2 = this.f142936e;
        if (handlerThread2 == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handlerThread2.getLooper();
        }
        this.f142937f = new HandlerC62974a(r2, looper, this.f142935d);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101006c() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "render()" + this.f142938g);
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.sendEmptyMessage(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: d */
    public final void mo101009d() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "start()" + this.f142938g);
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.sendEmptyMessage(3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: e */
    public final void mo101011e() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "stop()" + this.f142938g);
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.sendEmptyMessage(6);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: f */
    public final void mo101012f() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "pause()" + this.f142938g);
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.sendEmptyMessage(5);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: g */
    public final void mo101013g() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "release()" + this.f142938g);
        }
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f142937f.sendEmptyMessage(7);
            this.f142937f.sendEmptyMessage(10);
            this.f142934c = true;
            this.f142937f = null;
        }
        if (this.f142936e != null) {
            this.f142936e = null;
        }
        this.f142938g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.h$a */
    public static class HandlerC62974a extends Handler {

        /* renamed from: a */
        private AbstractC63051l f142943a;

        /* renamed from: b */
        private volatile int f142944b = 300;

        /* renamed from: c */
        private AbstractC62975a f142945c;

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.h$a$a */
        public interface AbstractC62975a {
            static {
                Covode.recordClassIndex(73812);
            }

            /* renamed from: a */
            void mo101033a();
        }

        static {
            Covode.recordClassIndex(73811);
        }

        /* renamed from: a */
        public final void mo101036a(int i) {
            if (i > 0) {
                this.f142944b = i;
            }
        }

        public final void handleMessage(Message message) {
            if (this.f142943a != null) {
                switch (message.what) {
                    case 1:
                        this.f142943a.mo100993a((C84217p) message.obj);
                        return;
                    case 2:
                    case 15:
                    default:
                        return;
                    case 3:
                        this.f142943a.mo101009d();
                        return;
                    case 4:
                        if (message.obj == null) {
                            this.f142943a.mo101014h();
                            return;
                        } else {
                            this.f142943a.mo100995a((String) message.obj);
                            return;
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        this.f142943a.mo101012f();
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        this.f142943a.mo101011e();
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        this.f142943a.mo101013g();
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        this.f142943a.mo101006c();
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        Pair pair = (Pair) message.obj;
                        if (pair != null) {
                            this.f142943a.mo100977a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                            return;
                        }
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        removeMessages(12);
                        Looper looper = getLooper();
                        if (!(looper == null || looper == Looper.getMainLooper())) {
                            looper.quit();
                        }
                        AbstractC62975a aVar = this.f142945c;
                        if (aVar != null) {
                            aVar.mo101033a();
                            return;
                        }
                        return;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        this.f142943a.mo100976a(((Float) message.obj).floatValue());
                        return;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        this.f142943a.mo101025s();
                        if (C84191b.m144788o()) {
                            removeMessages(12);
                        }
                        sendEmptyMessageDelayed(12, (long) this.f142944b);
                        return;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        Pair pair2 = (Pair) message.obj;
                        if (pair2 != null) {
                            this.f142943a.mo100978a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                            return;
                        }
                        return;
                    case ABRConfig.ABR_SELECT_SCENE:
                        this.f142943a.mo100981a((SurfaceHolder) message.obj);
                        return;
                    case 16:
                        this.f142943a.mo100999b();
                        return;
                    case 17:
                        C84203g gVar = (C84203g) message.obj;
                        if (gVar != null) {
                            this.f142943a.mo100992a(gVar);
                            return;
                        }
                        return;
                }
            }
        }

        public HandlerC62974a(AbstractC62975a aVar, Looper looper, AbstractC63051l lVar) {
            super(looper);
            this.f142943a = lVar;
            this.f142945c = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final float mo100974a(int i) {
        return this.f142935d.mo100974a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101000b(float f) {
        this.f142935d.mo101000b(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101007c(int i) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo101007c(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: d */
    public final void mo101010d(int i) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo101010d(i);
        }
    }

    public C62970h(AbstractC63051l lVar) {
        this.f142935d = lVar;
        m113422B();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100976a(float f) {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101001b(int i) {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.mo101036a(i);
            this.f142937f.sendEmptyMessage(12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101002b(Surface surface) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "setSurfaceDirectly(), surface = " + surface + ", mSimplifyPlayer = " + this.f142935d + ", " + this.f142938g);
        }
        this.f142935d.mo101002b(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101004b(String str) {
        this.f142935d.mo101004b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final boolean mo101005b(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.f142932a;
        if (onUIPlayListener2 == null || onUIPlayListener2.getWrapperedListener() == null || !this.f142932a.getWrapperedListener().equals(onUIPlayListener)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100980a(Surface surface) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayer", "setSurface(), surface = " + surface + ", mSimplifyPlayer = " + this.f142935d + ", " + this.f142938g);
        }
        this.f142935d.mo100980a(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100981a(SurfaceHolder surfaceHolder) {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100982a(OnUIPlayListener onUIPlayListener) {
        this.f142932a = onUIPlayListener;
        this.f142935d.mo100982a(onUIPlayListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100977a(float f, float f2) {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100978a(int i, int i2) {
        HandlerC62974a aVar = this.f142937f;
        if (aVar != null) {
            aVar.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100979a(int i, Bundle bundle) {
        AbstractC63051l lVar = this.f142935d;
        if (lVar != null) {
            lVar.mo100979a(i, bundle);
        }
    }
}
