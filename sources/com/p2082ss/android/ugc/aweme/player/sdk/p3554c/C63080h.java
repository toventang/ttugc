package com.p2082ss.android.ugc.aweme.player.sdk.p3554c;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63058d;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.h */
public class C63080h implements AbstractC63051l {

    /* renamed from: a */
    private C63073f f143368a;

    /* renamed from: b */
    private C63064c f143369b;

    /* renamed from: c */
    private Surface f143370c;

    /* renamed from: d */
    private WeakReference<OnUIPlayListener> f143371d;

    /* renamed from: e */
    private AbstractC84177b f143372e;

    /* renamed from: f */
    private AbstractC63035e f143373f;

    /* renamed from: g */
    private AbstractC63050k f143374g;

    /* renamed from: h */
    private AbstractC63040h f143375h;

    /* renamed from: i */
    private AbstractC63032b f143376i;

    static {
        Covode.recordClassIndex(73919);
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
    /* renamed from: s */
    public final void mo101025s() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100993a(C84217p pVar) {
        OnUIPlayListener onUIPlayListener;
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "prepare() " + (pVar != null ? pVar.f188196j : "null"));
        }
        if (pVar != null) {
            WeakReference<OnUIPlayListener> weakReference = this.f143371d;
            if (weakReference != null) {
                onUIPlayListener = weakReference.get();
            } else {
                onUIPlayListener = null;
            }
            if (C84199c.f187979a.isPrerenderSurfaceSlowSetFix() || pVar.f188139K) {
                C62960a.m113385a("SimplifyAsyncPlayerV3", "fix prerender surface slow : fill surface before startSession");
                pVar.f188207u = this.f143370c;
            }
            this.f143368a.mo101229a(pVar, onUIPlayListener, this.f143376i);
            C63064c cVar = this.f143368a.f143335c;
            this.f143369b = cVar;
            AbstractC63040h hVar = this.f143375h;
            if (hVar != null) {
                cVar.mo101210a(hVar);
            }
            if (this.f143370c != null) {
                if (!pVar.f188175an || !((Boolean) C84191b.f187911o.getValue()).booleanValue()) {
                    this.f143369b.mo101206a(this.f143370c);
                } else {
                    this.f143369b.mo101214b(this.f143370c);
                }
                this.f143370c = null;
            }
            AbstractC84177b bVar = this.f143372e;
            if (bVar != null) {
                this.f143369b.mo101212a(bVar);
            }
            AbstractC63035e eVar = this.f143373f;
            if (eVar != null) {
                this.f143369b.mo101209a(eVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100994a(C84217p pVar, AbstractC63032b bVar) {
        MethodCollector.m26663i(6360);
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "nextPrepare()" + (pVar != null ? pVar.f188196j : "null"));
        }
        if (pVar == null) {
            MethodCollector.m26664o(6360);
        } else if (pVar.f188176ao) {
            C63073f fVar = this.f143368a;
            synchronized (fVar.f143344m) {
                try {
                    if (!C63073f.f143332i) {
                        fVar.mo101231b();
                        if (!fVar.f143342k.f143360c) {
                            Message obtain = Message.obtain();
                            obtain.what = 2;
                            obtain.obj = new C63058d(pVar, bVar);
                            fVar.f143342k.sendMessage(obtain);
                        }
                        MethodCollector.m26664o(6360);
                    }
                } finally {
                    MethodCollector.m26664o(6360);
                }
            }
        } else {
            C63073f fVar2 = this.f143368a;
            if (!fVar2.f143338f) {
                if (fVar2.f143336d != null && !fVar2.f143336d.f143290i && !fVar2.f143336d.f143291j) {
                    if (TextUtils.equals(pVar.f188196j, fVar2.f143336d.f143284c) || (fVar2.f143335c != null && TextUtils.equals(pVar.f188196j, fVar2.f143335c.f143284c))) {
                        if (C62960a.f142907a) {
                            C62960a.m113385a("PlaySessionManager", "current or preparing, ignore id:" + pVar.f188196j);
                        }
                        MethodCollector.m26664o(6360);
                        return;
                    }
                    if (C62960a.f142907a) {
                        C62960a.m113385a("PlaySessionManager", "prepareSession drop missed mNextSession:" + fVar2.f143336d);
                    }
                    if (fVar2.mo101232c(fVar2.f143336d) && C63073f.m113938b(fVar2.f143336d)) {
                        C63073f.m113937a(fVar2.f143336d);
                        if (!fVar2.f143340h.f143328n) {
                            fVar2.f143337e = fVar2.f143336d;
                        } else {
                            fVar2.mo101233d(fVar2.f143336d);
                        }
                        fVar2.f143334b.remove(fVar2.f143336d);
                        fVar2.f143336d = null;
                    } else if (!fVar2.f143336d.mo101215c()) {
                        fVar2.f143336d.mo101219g();
                        fVar2.f143336d.mo101220h();
                        fVar2.f143336d = null;
                    }
                }
                if (C63073f.m113938b(fVar2.f143336d)) {
                    fVar2.f143336d = fVar2.mo101230b(pVar);
                }
                C63064c cVar = fVar2.f143336d;
                if (cVar != null && cVar.mo101215c() && !cVar.f143291j && !cVar.f143290i) {
                    C89219l.m154719c(pVar, "");
                    pVar.f188187az = 102;
                    C62960a.m113385a("AccelerateSessionMonitor", "updateStatus：render with rendered session");
                }
                if (fVar2.f143336d == null) {
                    fVar2.f143336d = fVar2.mo101227a(pVar);
                }
                if (pVar.f188207u != null) {
                    fVar2.f143336d.mo101206a(pVar.f188207u);
                }
                fVar2.f143336d.mo101208a(bVar);
                fVar2.f143336d.mo101213a(pVar);
                if (!fVar2.f143334b.contains(fVar2.f143336d)) {
                    fVar2.f143334b.add(fVar2.f143336d);
                }
                if (C62960a.f142907a) {
                    C62960a.m113385a("PlaySessionManager", "prepareSession mNextSession:" + fVar2.f143336d);
                }
            }
            MethodCollector.m26664o(6360);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100995a(String str) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "resume()".concat(String.valueOf(str)));
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100991a(AbstractC84177b bVar) {
        this.f143372e = bVar;
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101212a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100985a(AbstractC63035e eVar) {
        this.f143373f = eVar;
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101209a(eVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final boolean mo100998a(String str, String str2) {
        C63064c cVar = this.f143369b;
        return cVar != null && TextUtils.equals(str, cVar.f143284c);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100987a(AbstractC63041i iVar) {
        this.f143368a.f143339g = iVar;
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143287f.f142983x = iVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100992a(C84203g gVar) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(25, gVar).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100982a(OnUIPlayListener onUIPlayListener) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101207a(onUIPlayListener);
        }
        this.f143371d = new WeakReference<>(onUIPlayListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100989a(AbstractC63050k kVar) {
        this.f143374g = kVar;
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101211a(kVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100986a(AbstractC63040h hVar) {
        this.f143375h = hVar;
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101210a(hVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100996a(boolean z) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 1;
            message.arg2 = z ? 1 : 0;
            cVar.f143286e.sendMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100990a(AbstractC63052m mVar) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 2;
            message.obj = mVar;
            cVar.f143286e.sendMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100983a(AbstractC63031a aVar) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 2;
            message.obj = aVar;
            cVar.f143286e.sendMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100997a(boolean z, Bundle bundle) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 23;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("crop_param_open", z);
            message.obj = bundle;
            cVar.f143286e.sendMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: r */
    public final void mo101024r() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101217e();
        }
    }

    /* renamed from: B */
    private String m113954B() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143284c;
        }
        return "null";
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: i */
    public final boolean mo101015i() {
        C63064c cVar = this.f143369b;
        if (cVar == null || !cVar.f143287f.mo101015i()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: j */
    public final long mo101016j() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.mo101016j();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: k */
    public final long mo101017k() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.mo101017k();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: l */
    public final boolean mo101018l() {
        C63064c cVar = this.f143369b;
        if (cVar == null || !cVar.f143287f.mo101018l()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: n */
    public final String mo101020n() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.mo101020n();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: o */
    public final int mo101021o() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.f142973n;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: p */
    public final void mo101022p() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143287f.mo101022p();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: t */
    public final C84209m.EnumC84214e mo101026t() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.f142963d;
        }
        return C84209m.EnumC84214e.TT;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: x */
    public final boolean mo101030x() {
        C63064c cVar = this.f143369b;
        if (cVar == null || !cVar.f143287f.mo101030x()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: y */
    public final boolean mo101031y() {
        C63064c cVar = this.f143369b;
        if (cVar == null || !cVar.f143287f.mo101031y()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: z */
    public final boolean mo101032z() {
        C63064c cVar = this.f143369b;
        if (cVar == null || !cVar.f143287f.mo101032z()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final int mo100975a() {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.f142975p;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: h */
    public final void mo101014h() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "resume()");
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(4).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: q */
    public final void mo101023q() {
        C63064c cVar = this.f143369b;
        if (cVar != null && !cVar.f143291j && !cVar.f143290i) {
            cVar.f143286e.mo101202a(300);
            cVar.f143286e.sendEmptyMessage(12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: u */
    public final AbstractC63042j.C63049g mo101027u() {
        C63064c cVar = this.f143369b;
        if (cVar == null || cVar.f143287f == null) {
            return null;
        }
        return cVar.f143287f.mo101027u();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: v */
    public final AbstractC63042j.C63048f mo101028v() {
        C63064c cVar = this.f143369b;
        if (cVar == null || cVar.f143287f == null) {
            return null;
        }
        return cVar.f143287f.mo101028v();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: w */
    public final String mo101029w() {
        C63064c cVar = this.f143369b;
        if (cVar == null || cVar.f143287f == null) {
            return null;
        }
        return cVar.f143287f.mo101029w();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo100999b() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "init()");
        }
        if (this.f143369b == null) {
            C63073f fVar = this.f143368a;
            fVar.f143335c = fVar.mo101227a((C84217p) null);
            this.f143369b = fVar.f143335c;
        }
        AbstractC63050k kVar = this.f143374g;
        if (kVar != null) {
            this.f143369b.mo101211a(kVar);
        }
        AbstractC63040h hVar = this.f143375h;
        if (hVar != null) {
            this.f143369b.mo101210a(hVar);
        }
        this.f143369b.mo101200a();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101006c() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "render()" + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.sendEmptyMessage(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: d */
    public final void mo101009d() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "start() key:" + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.sendEmptyMessage(3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: e */
    public final void mo101011e() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "stop()" + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101219g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: f */
    public final void mo101012f() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "pause()" + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.sendEmptyMessage(5);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: g */
    public final void mo101013g() {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "release()" + m113954B());
        }
        this.f143368a.mo101228a();
        this.f143369b = null;
        this.f143370c = null;
        this.f143372e = null;
        this.f143373f = null;
        this.f143374g = null;
        this.f143375h = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: m */
    public final void mo101019m() {
        C62960a.m113385a("SimplifyAsyncPlayerV3", "sleep()" + m113954B());
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(19).sendToTarget();
        }
        if (((Boolean) C84191b.f187900d.getValue()).booleanValue()) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "sleep : release background session");
            C63073f fVar = this.f143368a;
            if (fVar.f143336d != null) {
                fVar.f143336d.mo101220h();
            }
            fVar.f143336d = null;
            if (fVar.f143337e != null) {
                fVar.f143337e.mo101220h();
            }
            fVar.f143337e = null;
            if (fVar.f143342k != null) {
                fVar.f143342k.mo101234a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100984a(AbstractC63032b bVar) {
        this.f143376i = bVar;
    }

    public C63080h(C84209m.EnumC84214e eVar) {
        this(eVar, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final float mo100974a(int i) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            return cVar.f143287f.mo100974a(i);
        }
        return 0.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101000b(float f) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143287f.mo101000b(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101001b(int i) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.mo101202a(i);
            cVar.f143286e.sendEmptyMessage(12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101007c(int i) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 0;
            message.arg2 = i;
            cVar.f143286e.sendMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: d */
    public final void mo101010d(int i) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 0;
            message.arg2 = i;
            cVar.f143286e.sendMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100976a(float f) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "seekTo() progress:" + f + ", key:" + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101002b(Surface surface) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "setSurfaceDirectly(), surface = " + surface + ", mCurrentPlaySession = " + this.f143369b + ", " + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101214b(surface);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101008c(AbstractC63050k kVar) {
        MethodCollector.m26663i(6197);
        C63073f fVar = this.f143368a;
        synchronized (fVar.f143344m) {
            try {
                if (!C63073f.f143332i) {
                    fVar.mo101231b();
                    if (!fVar.f143342k.f143360c) {
                        fVar.f143343l = kVar;
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = kVar;
                        fVar.f143342k.sendMessage(obtain);
                    }
                    MethodCollector.m26664o(6197);
                }
            } finally {
                MethodCollector.m26664o(6197);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101003b(AbstractC63050k kVar) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "initNextSession()");
        }
        C63073f fVar = this.f143368a;
        fVar.f143336d = fVar.mo101227a((C84217p) null);
        C63064c cVar = fVar.f143336d;
        if (cVar != null) {
            cVar.mo101211a(kVar);
            AbstractC63040h hVar = this.f143375h;
            if (hVar != null) {
                cVar.mo101210a(hVar);
            }
            cVar.mo101200a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101004b(String str) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143287f.mo101004b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100980a(Surface surface) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "setSurface(), surface = " + surface + ", mCurrentPlaySession = " + this.f143369b + ", " + m113954B());
        }
        this.f143370c = surface;
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.mo101206a(surface);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final boolean mo101005b(OnUIPlayListener onUIPlayListener) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143292k != null && this.f143369b.f143292k.getWrapperedListener() != null && this.f143369b.f143292k.getWrapperedListener().equals(onUIPlayListener)) {
            return true;
        }
        WeakReference<OnUIPlayListener> weakReference = this.f143371d;
        if (weakReference == null || weakReference.get() == null || this.f143371d.get().getWrapperedListener() == null || !this.f143371d.get().getWrapperedListener().equals(onUIPlayListener)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100981a(SurfaceHolder surfaceHolder) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    public C63080h(C84209m.EnumC84214e eVar, C63071d dVar) {
        this.f143368a = new C63073f(eVar, dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100977a(float f, float f2) {
        if (C62960a.f142907a) {
            C62960a.m113385a("SimplifyAsyncPlayerV3", "setVolume() leftVolume:" + f + ", rightVolume:" + f2 + ", key:" + m113954B());
        }
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100978a(int i, int i2) {
        C63064c cVar = this.f143369b;
        if (cVar != null) {
            cVar.f143286e.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100979a(int i, Bundle bundle) {
        C63064c cVar = this.f143369b;
        if (cVar != null && cVar.f143287f != null) {
            Message message = new Message();
            message.what = 24;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("texture_layout_param", i);
            message.obj = bundle;
            cVar.f143286e.sendMessage(message);
        }
    }
}
