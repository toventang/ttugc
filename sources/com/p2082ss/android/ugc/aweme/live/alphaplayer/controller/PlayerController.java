package com.p2082ss.android.ugc.aweme.live.alphaplayer.controller;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.C58514b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.C58521c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58512c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58529d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.C58570b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58572a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58574c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController */
public class PlayerController implements Handler.Callback, AbstractC33974au, AbstractC58539a {

    /* renamed from: a */
    public List<C58527b> f133277a = new ArrayList();

    /* renamed from: b */
    public EnumC58566d f133278b = EnumC58566d.NOT_PREPARED;

    /* renamed from: c */
    public AbstractC58510a f133279c;

    /* renamed from: d */
    public AbstractC58567e f133280d;

    /* renamed from: e */
    public int f133281e = 0;

    /* renamed from: f */
    public int f133282f = 0;

    /* renamed from: g */
    public volatile boolean f133283g = false;

    /* renamed from: h */
    public boolean f133284h = true;

    /* renamed from: i */
    public boolean f133285i;

    /* renamed from: j */
    private long f133286j;

    /* renamed from: k */
    private boolean f133287k;

    /* renamed from: l */
    private boolean f133288l;

    /* renamed from: m */
    private Context f133289m;

    /* renamed from: n */
    private AbstractC58511b f133290n;

    /* renamed from: o */
    private AbstractC58561c<C58555a<C58555a>> f133291o;

    /* renamed from: p */
    private Handler f133292p;

    /* renamed from: q */
    private Handler f133293q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    private HandlerThread f133294r;

    /* renamed from: s */
    private int f133295s = 0;

    /* renamed from: t */
    private int f133296t = 0;

    /* renamed from: u */
    private final C58574c f133297u;

    /* renamed from: v */
    private AbstractC1204m f133298v;

    /* renamed from: w */
    private AbstractC58512c f133299w;

    /* renamed from: x */
    private AbstractC58561c.AbstractC58565d<C58555a<C58555a>> f133300x;

    /* renamed from: y */
    private AbstractC58561c.AbstractC58563b<C58555a<C58555a>> f133301y;

    static {
        Covode.recordClassIndex(68821);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        mo16775d();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        mo16776e();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        mo16777f();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16769a(C58522a aVar) {
        this.f133286j = aVar.f133236d;
        if (aVar.f133233a) {
            mo95953a(0);
            mo95954a(m107490a(1, aVar));
            return;
        }
        mo95958i();
        mo95956a(false, "dataSource is invalid. ErrorInfo: " + aVar.f133235c);
    }

    /* renamed from: a */
    public final void mo95956a(boolean z, String str) {
        mo95955a(z, 0, 0, str);
    }

    /* renamed from: a */
    public final void mo95955a(boolean z, int i, int i2, String str) {
        AbstractC58511b bVar = this.f133290n;
        if (bVar != null) {
            AbstractC58561c<C58555a<C58555a>> cVar = this.f133291o;
            bVar.mo16678a(z, cVar != null ? cVar.mo16744j() : "unknown", i, i2, str + ", messageId: " + this.f133286j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: c */
    public final int mo16774c() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f133291o;
        if (cVar == null) {
            return -1;
        }
        try {
            return cVar.mo16742h().f133276c;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: d */
    public final void mo16775d() {
        mo95954a(m107490a(3, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: e */
    public final void mo16776e() {
        mo95954a(m107490a(4, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: f */
    public final void mo16777f() {
        mo95954a(m107490a(5, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: h */
    public final void mo16779h() {
        mo95954a(m107490a(9, (Object) null));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo95954a(m107490a(6, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final boolean mo16773b() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f133291o;
        if (cVar == null || !cVar.mo16756k()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: g */
    public final void mo16778g() {
        mo95954a(m107490a(6, (Object) null));
        AbstractC1204m mVar = this.f133298v;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
            this.f133298v = null;
        }
    }

    /* renamed from: i */
    public final void mo95958i() {
        this.f133287k = false;
        this.f133286j = 0;
        this.f133293q.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.RunnableC585301 */

            static {
                Covode.recordClassIndex(68822);
            }

            public final void run() {
                if (PlayerController.this.f133279c != null) {
                    PlayerController.this.f133279c.mo16676b();
                }
            }
        });
        this.f133297u.mo96037b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController$8 */
    public static /* synthetic */ class C585378 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133310a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 68829(0x10cdd, float:9.645E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585378.f133310a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585378.f133310a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585378.f133310a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585378.f133310a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585378.<clinit>():void");
        }
    }

    /* renamed from: k */
    private void m107492k() {
        if (this.f133291o != null) {
            if (this.f133278b == EnumC58566d.NOT_PREPARED || this.f133278b == EnumC58566d.STOPPED) {
                this.f133291o.mo96020a(this.f133300x);
                this.f133291o.mo96018a(this.f133301y);
                this.f133291o.mo16735b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final View mo16762a() {
        AbstractC58567e eVar = this.f133280d;
        if (eVar != null) {
            return eVar.getView();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: j */
    public final int mo16782j() {
        if (this.f133291o == null || this.f133296t == 0) {
            return -1;
        }
        float c = (float) mo16774c();
        if (c <= 0.0f) {
            return -1;
        }
        float i = ((float) this.f133291o.mo16743i()) / c;
        if (i > 1.0f) {
            return -1;
        }
        return (int) Math.ceil((double) (i * ((float) this.f133296t)));
    }

    /* renamed from: l */
    private void m107493l() {
        if (this.f133291o != null) {
            int i = C585378.f133310a[this.f133278b.ordinal()];
            if (i == 1) {
                this.f133291o.mo16737c();
                this.f133287k = true;
                this.f133278b = EnumC58566d.STARTED;
                this.f133293q.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.RunnableC585367 */

                    static {
                        Covode.recordClassIndex(68828);
                    }

                    public final void run() {
                        if (PlayerController.this.f133279c != null) {
                            PlayerController.this.f133279c.mo16674a();
                        }
                    }
                });
                this.f133297u.mo96035a();
            } else if (i == 2) {
                this.f133291o.mo16737c();
                this.f133278b = EnumC58566d.STARTED;
                this.f133297u.mo96035a();
            } else if (i == 3 || i == 4) {
                try {
                    m107492k();
                } catch (Exception e) {
                    e.printStackTrace();
                    mo95956a(false, "prepare and start MediaPlayer failure.");
                    mo95958i();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final AbstractC58539a mo16763a(AbstractC58510a aVar) {
        this.f133279c = aVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16767a(AbstractC58511b bVar) {
        this.f133290n = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final void mo16772b(ViewGroup viewGroup) {
        AbstractC58567e eVar = this.f133280d;
        if (eVar != null && eVar.mo95888b(viewGroup)) {
            this.f133283g = false;
        }
    }

    /* renamed from: a */
    public final void mo95953a(int i) {
        this.f133280d.setVisibility(i);
        if (i == 0) {
            this.f133280d.bringToFront();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo95954a(Message message) {
        HandlerThread handlerThread = this.f133294r;
        if (handlerThread != null && handlerThread.isAlive() && !this.f133294r.isInterrupted()) {
            if (this.f133292p == null) {
                this.f133292p = new Handler(this.f133294r.getLooper(), this);
            }
            this.f133292p.sendMessageDelayed(message, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16765a(Surface surface) {
        mo95954a(m107490a(7, surface));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16766a(ViewGroup viewGroup) {
        AbstractC58567e eVar = this.f133280d;
        if (eVar != null && eVar.mo95886a(viewGroup)) {
            this.f133283g = true;
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        String str2;
        switch (message.what) {
            case 1:
                if (message.obj instanceof C58522a) {
                    Handler handler = this.f133292p;
                    if (handler != null) {
                        handler.removeMessages(8);
                    }
                    C58522a aVar = (C58522a) message.obj;
                    try {
                        if (this.f133283g) {
                            this.f133291o.mo16740f();
                            this.f133278b = EnumC58566d.NOT_PREPARED;
                            int i = this.f133289m.getResources().getConfiguration().orientation;
                            C58522a.C58524b a = aVar.mo95918a(i);
                            if (a != null && !TextUtils.isEmpty(a.f133244a)) {
                                if (new File(a.f133244a).exists()) {
                                    this.f133280d.setConfigParams(a);
                                    this.f133280d.mo95885a(this.f133277a);
                                    this.f133291o.mo16733a(a.f133244a);
                                    boolean z = aVar.f133234b;
                                    this.f133285i = z;
                                    this.f133291o.mo16734a(z);
                                    this.f133296t = a.f133246c;
                                    this.f133281e = a.f133251h;
                                    this.f133282f = a.f133252i;
                                    this.f133295s = a.f133253j;
                                    this.f133284h = aVar.f133237e;
                                    if (!this.f133280d.mo95889c()) {
                                        this.f133288l = true;
                                        break;
                                    } else {
                                        m107492k();
                                        break;
                                    }
                                }
                            }
                            if (1 == i) {
                                StringBuilder sb = new StringBuilder("dataPath is empty or File is not exists. path: ");
                                if (a == null) {
                                    str2 = "null";
                                } else {
                                    str2 = a.f133244a;
                                }
                                mo95956a(false, sb.append(str2).toString());
                            }
                            mo95958i();
                            break;
                        } else {
                            mo95956a(false, "alphaVideoView is not attach");
                            mo95958i();
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        mo95958i();
                        mo95956a(false, "alphaVideoView set dataSource failure:" + Log.getStackTraceString(e));
                        break;
                    }
                }
                break;
            case 2:
                try {
                    if (this.f133295s <= 0) {
                        C58529d h = this.f133291o.mo16742h();
                        this.f133281e = h.f133274a / 2;
                        this.f133282f = h.f133275b;
                    }
                    this.f133280d.mo95884a((float) this.f133281e, (float) this.f133282f);
                    final C58522a.EnumC58526d scaleType = this.f133280d.getScaleType();
                    this.f133293q.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.RunnableC585334 */

                        static {
                            Covode.recordClassIndex(68825);
                        }

                        public final void run() {
                            if (PlayerController.this.f133279c != null) {
                                PlayerController.this.f133279c.mo16675a(PlayerController.this.f133281e, PlayerController.this.f133282f, scaleType);
                            }
                        }
                    });
                    this.f133278b = EnumC58566d.PREPARED;
                    AbstractC58512c cVar = this.f133299w;
                    if (cVar == null || !cVar.mo95905a()) {
                        m107493l();
                        break;
                    }
                } catch (Exception e2) {
                    mo95958i();
                    mo95956a(false, "start video failure:" + Log.getStackTraceString(e2));
                    break;
                }
            case 3:
                if (this.f133291o != null && this.f133278b == EnumC58566d.STARTED) {
                    this.f133291o.mo16738d();
                    this.f133297u.mo96037b();
                    this.f133278b = EnumC58566d.PAUSED;
                    break;
                }
            case 4:
                if (!this.f133287k) {
                    if (this.f133288l) {
                        this.f133288l = false;
                        m107492k();
                        break;
                    }
                } else {
                    m107493l();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                if (this.f133291o != null && (this.f133278b == EnumC58566d.STARTED || this.f133278b == EnumC58566d.PAUSED)) {
                    this.f133291o.mo16738d();
                    this.f133297u.mo96037b();
                    this.f133278b = EnumC58566d.PAUSED;
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.f133280d.onPause();
                this.f133297u.mo96037b();
                this.f133297u.mo96038c();
                if (this.f133291o != null) {
                    if (this.f133278b == EnumC58566d.STARTED) {
                        this.f133291o.mo16738d();
                        this.f133278b = EnumC58566d.PAUSED;
                    }
                    if (this.f133278b == EnumC58566d.PAUSED) {
                        this.f133291o.mo16739e();
                        this.f133278b = EnumC58566d.STOPPED;
                    }
                    this.f133291o.mo16741g();
                    this.f133280d.mo95890d();
                    this.f133278b = EnumC58566d.RELEASE;
                    HandlerThread handlerThread = this.f133294r;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        this.f133294r.interrupt();
                        break;
                    }
                } else {
                    this.f133278b = EnumC58566d.NOT_PREPARED;
                    return true;
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                try {
                    this.f133291o.mo16732a((Surface) message.obj);
                    break;
                } catch (Exception unused) {
                    mo95958i();
                    mo95956a(false, "surface has been released");
                    break;
                }
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                AbstractC58561c<C58555a<C58555a>> cVar2 = this.f133291o;
                if (cVar2 != null) {
                    cVar2.mo16740f();
                    this.f133297u.mo96037b();
                    this.f133278b = EnumC58566d.NOT_PREPARED;
                    this.f133287k = false;
                    break;
                }
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                try {
                    this.f133291o.mo16731a();
                } catch (Exception e3) {
                    AbstractC58511b bVar = this.f133290n;
                    if (bVar != null) {
                        AbstractC58561c<C58555a<C58555a>> cVar3 = this.f133291o;
                        if (cVar3 != null) {
                            str = cVar3.mo16744j();
                        } else {
                            str = "unknown";
                        }
                        bVar.mo16677a(str, e3);
                    }
                    C58556b bVar2 = new C58556b();
                    bVar2.mo16731a();
                    this.f133291o = bVar2;
                }
                this.f133291o.mo16736b(true);
                this.f133291o.mo16734a(this.f133285i);
                this.f133291o.mo96019a(new AbstractC58561c.AbstractC58564c<C58555a<C58555a>>() {
                    /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585312 */

                    static {
                        Covode.recordClassIndex(68823);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58564c
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo16788a() {
                        PlayerController.this.f133280d.mo95883a();
                    }
                });
                this.f133291o.mo96017a(new AbstractC58561c.AbstractC58562a<C58555a<C58555a>>() {
                    /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585323 */

                    static {
                        Covode.recordClassIndex(68824);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58562a
                    /* renamed from: a */
                    public final /* synthetic */ void mo16789a() {
                        if (!PlayerController.this.f133283g || !PlayerController.this.f133285i) {
                            if (PlayerController.this.f133284h) {
                                PlayerController.this.f133280d.mo95887b();
                                PlayerController.this.f133277a.clear();
                            }
                            PlayerController.this.f133278b = EnumC58566d.PAUSED;
                            PlayerController.this.mo95956a(true, (String) null);
                            PlayerController.this.mo95958i();
                        }
                    }
                });
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (message.obj instanceof C58527b) {
                    C58527b bVar3 = (C58527b) message.obj;
                    if (bVar3.f133262b == 0) {
                        try {
                            bVar3.f133269i = C58572a.m107675a(bVar3);
                        } catch (OutOfMemoryError unused2) {
                        }
                    }
                    if (bVar3.f133269i != null) {
                        bVar3.f133263c = bVar3.f133269i.getWidth();
                        bVar3.f133264d = bVar3.f133269i.getHeight();
                        this.f133277a.add(bVar3);
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                AbstractC58561c<C58555a<C58555a>> cVar4 = this.f133291o;
                if (cVar4 != null) {
                    cVar4.mo16739e();
                    this.f133278b = EnumC58566d.STOPPED;
                    this.f133287k = false;
                    AbstractC58567e eVar = this.f133280d;
                    if (eVar != null) {
                        eVar.mo95887b();
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16768a(AbstractC58513d dVar) {
        this.f133297u.mo96036a(dVar);
    }

    /* renamed from: a */
    public static Message m107490a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: a */
    public static PlayerController m107491a(C58521c cVar, AbstractC58561c cVar2) {
        return new PlayerController(cVar.f133230a, cVar.f133231b, cVar2, cVar.f133232c);
    }

    private PlayerController(Context context, AbstractC1204m mVar, AbstractC58561c<C58555a<C58555a>> cVar, int i) {
        C58574c cVar2 = new C58574c();
        this.f133297u = cVar2;
        this.f133298v = null;
        this.f133300x = new AbstractC58561c.AbstractC58565d<C58555a<C58555a>>() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585345 */

            static {
                Covode.recordClassIndex(68826);
            }

            @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58565d
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo16791a() {
                PlayerController.this.mo95954a(PlayerController.m107490a(2, (Object) null));
            }
        };
        this.f133301y = new AbstractC58561c.AbstractC58563b<C58555a<C58555a>>() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.C585356 */

            static {
                Covode.recordClassIndex(68827);
            }

            @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58563b
            /* renamed from: a */
            public final /* synthetic */ void mo16792a(int i, int i2, String str) {
                PlayerController.this.mo95955a(false, i, i2, "mediaPlayer error, info:".concat(String.valueOf(str)));
                PlayerController.this.mo95958i();
            }
        };
        this.f133289m = context;
        this.f133298v = mVar;
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
        }
        HandlerThread handlerThread = new HandlerThread("alpha-play-thread", 10);
        this.f133294r = handlerThread;
        handlerThread.start();
        this.f133292p = new Handler(this.f133294r.getLooper(), this);
        if (i == 1) {
            this.f133280d = new C58514b(this.f133289m);
        } else {
            this.f133280d = new C58504a(this.f133289m);
        }
        this.f133280d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f133280d.setPlayerController(this);
        this.f133280d.setVideoRenderer(new C58570b(this.f133280d));
        if (cVar == null) {
            this.f133291o = new C58556b();
        } else {
            this.f133291o = cVar;
        }
        cVar2.f133436a = this.f133291o;
        mo95954a(m107490a(10, (Object) null));
    }
}
