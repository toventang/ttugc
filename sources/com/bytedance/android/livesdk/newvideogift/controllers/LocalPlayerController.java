package com.bytedance.android.livesdk.newvideogift.controllers;

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
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
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
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58572a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58574c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LocalPlayerController implements Handler.Callback, AbstractC33974au, AbstractC58539a {

    /* renamed from: a */
    public List<C58527b> f24180a = new ArrayList();

    /* renamed from: b */
    public EnumC58566d f24181b = EnumC58566d.NOT_PREPARED;

    /* renamed from: c */
    public AbstractC58510a f24182c;

    /* renamed from: d */
    public AbstractC58567e f24183d;

    /* renamed from: e */
    public int f24184e = 0;

    /* renamed from: f */
    public int f24185f = 0;

    /* renamed from: g */
    public volatile boolean f24186g = false;

    /* renamed from: h */
    public boolean f24187h = true;

    /* renamed from: i */
    public boolean f24188i;

    /* renamed from: j */
    private long f24189j;

    /* renamed from: k */
    private boolean f24190k;

    /* renamed from: l */
    private boolean f24191l;

    /* renamed from: m */
    private Context f24192m;

    /* renamed from: n */
    private AbstractC58511b f24193n;

    /* renamed from: o */
    private AbstractC58561c<C58555a<C58555a>> f24194o;

    /* renamed from: p */
    private Handler f24195p;

    /* renamed from: q */
    private Handler f24196q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    private HandlerThread f24197r;

    /* renamed from: s */
    private int f24198s = 0;

    /* renamed from: t */
    private int f24199t = 0;

    /* renamed from: u */
    private final C58574c f24200u;

    /* renamed from: v */
    private AbstractC1204m f24201v;

    /* renamed from: w */
    private AbstractC58512c f24202w;

    /* renamed from: x */
    private AbstractC58561c.AbstractC58565d<C58555a<C58555a>> f24203x;

    /* renamed from: y */
    private AbstractC58561c.AbstractC58563b<C58555a<C58555a>> f24204y;

    static {
        Covode.recordClassIndex(11526);
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

    /* renamed from: a */
    public final void mo16771a(boolean z, String str) {
        mo16770a(z, 0, 0, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: c */
    public final int mo16774c() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f24194o;
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
        mo16764a(m18397a(3, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: e */
    public final void mo16776e() {
        mo16764a(m18397a(4, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: f */
    public final void mo16777f() {
        mo16764a(m18397a(5, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: h */
    public final void mo16779h() {
        mo16764a(m18397a(9, (Object) null));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo16764a(m18397a(6, (Object) null));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final View mo16762a() {
        AbstractC58567e eVar = this.f24183d;
        if (eVar != null) {
            return eVar.getView();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final boolean mo16773b() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f24194o;
        if (cVar == null || !cVar.mo16756k()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: g */
    public final void mo16778g() {
        mo16764a(m18397a(6, (Object) null));
        AbstractC1204m mVar = this.f24201v;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
            this.f24201v = null;
        }
    }

    /* renamed from: i */
    public final void mo16781i() {
        this.f24190k = false;
        this.f24189j = 0;
        this.f24196q.post(new Runnable() {
            /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.RunnableC99741 */

            static {
                Covode.recordClassIndex(11527);
            }

            public final void run() {
                if (LocalPlayerController.this.f24182c != null) {
                    LocalPlayerController.this.f24182c.mo16676b();
                }
            }
        });
        this.f24200u.mo96037b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController$8 */
    public static /* synthetic */ class C99818 {

        /* renamed from: a */
        static final /* synthetic */ int[] f24213a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 11534(0x2d0e, float:1.6163E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99818.f24213a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99818.f24213a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99818.f24213a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99818.f24213a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99818.<clinit>():void");
        }
    }

    /* renamed from: k */
    private void m18398k() {
        if (this.f24194o != null) {
            if (this.f24181b == EnumC58566d.NOT_PREPARED || this.f24181b == EnumC58566d.STOPPED) {
                this.f24194o.mo96020a(this.f24203x);
                this.f24194o.mo96018a(this.f24204y);
                this.f24194o.mo16735b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: j */
    public final int mo16782j() {
        if (this.f24194o == null || this.f24199t == 0) {
            return -1;
        }
        float c = (float) mo16774c();
        if (c <= 0.0f) {
            return -1;
        }
        float i = ((float) this.f24194o.mo16743i()) / c;
        if (i > 1.0f) {
            return -1;
        }
        return (int) Math.ceil((double) (i * ((float) this.f24199t)));
    }

    /* renamed from: l */
    private void m18399l() {
        if (this.f24194o != null) {
            int i = C99818.f24213a[this.f24181b.ordinal()];
            if (i == 1) {
                this.f24194o.mo16737c();
                this.f24190k = true;
                this.f24181b = EnumC58566d.STARTED;
                this.f24196q.post(new Runnable() {
                    /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.RunnableC99807 */

                    static {
                        Covode.recordClassIndex(11533);
                    }

                    public final void run() {
                        if (LocalPlayerController.this.f24182c != null) {
                            LocalPlayerController.this.f24182c.mo16674a();
                        }
                    }
                });
                this.f24200u.mo96035a();
            } else if (i == 2) {
                this.f24194o.mo16737c();
                this.f24181b = EnumC58566d.STARTED;
                this.f24200u.mo96035a();
            } else if (i == 3 || i == 4) {
                try {
                    m18398k();
                } catch (Exception e) {
                    e.printStackTrace();
                    mo16771a(false, "prepare and start MediaPlayer failure.");
                    mo16781i();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final AbstractC58539a mo16763a(AbstractC58510a aVar) {
        this.f24182c = aVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16767a(AbstractC58511b bVar) {
        this.f24193n = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final void mo16772b(ViewGroup viewGroup) {
        AbstractC58567e eVar = this.f24183d;
        if (eVar != null && eVar.mo95888b(viewGroup)) {
            this.f24186g = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16764a(Message message) {
        HandlerThread handlerThread = this.f24197r;
        if (handlerThread != null && handlerThread.isAlive() && !this.f24197r.isInterrupted()) {
            if (this.f24195p == null) {
                this.f24195p = new Handler(this.f24197r.getLooper(), this);
            }
            this.f24195p.sendMessageDelayed(message, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16765a(Surface surface) {
        mo16764a(m18397a(7, surface));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16766a(ViewGroup viewGroup) {
        AbstractC58567e eVar = this.f24183d;
        if (eVar != null && eVar.mo95886a(viewGroup)) {
            this.f24186g = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16768a(AbstractC58513d dVar) {
        this.f24200u.mo96036a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16769a(C58522a aVar) {
        this.f24189j = aVar.f133236d;
        if (aVar.f133233a) {
            this.f24183d.setVisibility(0);
            this.f24183d.bringToFront();
            mo16764a(m18397a(1, aVar));
            return;
        }
        mo16781i();
        mo16771a(false, "dataSource is invalid. ErrorInfo: " + aVar.f133235c);
    }

    public boolean handleMessage(Message message) {
        String str;
        String str2;
        switch (message.what) {
            case 1:
                if (message.obj instanceof C58522a) {
                    Handler handler = this.f24195p;
                    if (handler != null) {
                        handler.removeMessages(8);
                    }
                    C58522a aVar = (C58522a) message.obj;
                    try {
                        if (this.f24186g) {
                            this.f24194o.mo16740f();
                            this.f24181b = EnumC58566d.NOT_PREPARED;
                            int i = this.f24192m.getResources().getConfiguration().orientation;
                            C58522a.C58524b a = aVar.mo95918a(i);
                            if (a != null && !TextUtils.isEmpty(a.f133244a)) {
                                if (new File(a.f133244a).exists()) {
                                    this.f24183d.setConfigParams(a);
                                    this.f24183d.mo95885a(this.f24180a);
                                    this.f24194o.mo16733a(a.f133244a);
                                    boolean z = aVar.f133234b;
                                    this.f24188i = z;
                                    this.f24194o.mo16734a(z);
                                    this.f24199t = a.f133246c;
                                    this.f24184e = a.f133251h;
                                    this.f24185f = a.f133252i;
                                    this.f24198s = a.f133253j;
                                    this.f24187h = aVar.f133237e;
                                    if (!this.f24183d.mo95889c()) {
                                        this.f24191l = true;
                                        break;
                                    } else {
                                        m18398k();
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
                                mo16771a(false, sb.append(str2).toString());
                            }
                            mo16781i();
                            break;
                        } else {
                            mo16771a(false, "alphaVideoView is not attach");
                            mo16781i();
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        mo16781i();
                        mo16771a(false, "alphaVideoView set dataSource failure:" + Log.getStackTraceString(e));
                        break;
                    }
                }
                break;
            case 2:
                try {
                    if (this.f24198s <= 0) {
                        C58529d h = this.f24194o.mo16742h();
                        this.f24184e = h.f133274a / 2;
                        this.f24185f = h.f133275b;
                    }
                    this.f24183d.mo95884a((float) this.f24184e, (float) this.f24185f);
                    final C58522a.EnumC58526d scaleType = this.f24183d.getScaleType();
                    this.f24196q.post(new Runnable() {
                        /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.RunnableC99774 */

                        static {
                            Covode.recordClassIndex(11530);
                        }

                        public final void run() {
                            if (LocalPlayerController.this.f24182c != null) {
                                LocalPlayerController.this.f24182c.mo16675a(LocalPlayerController.this.f24184e, LocalPlayerController.this.f24185f, scaleType);
                            }
                        }
                    });
                    this.f24181b = EnumC58566d.PREPARED;
                    AbstractC58512c cVar = this.f24202w;
                    if (cVar == null || !cVar.mo95905a()) {
                        m18399l();
                        break;
                    }
                } catch (Exception e2) {
                    mo16781i();
                    mo16771a(false, "start video failure:" + Log.getStackTraceString(e2));
                    break;
                }
            case 3:
                if (this.f24194o != null && this.f24181b == EnumC58566d.STARTED) {
                    this.f24194o.mo16738d();
                    this.f24200u.mo96037b();
                    this.f24181b = EnumC58566d.PAUSED;
                    break;
                }
            case 4:
                if (!this.f24190k) {
                    if (this.f24191l) {
                        this.f24191l = false;
                        m18398k();
                        break;
                    }
                } else {
                    m18399l();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (this.f24194o != null && (this.f24181b == EnumC58566d.STARTED || this.f24181b == EnumC58566d.PAUSED)) {
                    this.f24194o.mo16738d();
                    this.f24200u.mo96037b();
                    this.f24181b = EnumC58566d.PAUSED;
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                this.f24183d.onPause();
                this.f24200u.mo96037b();
                this.f24200u.mo96038c();
                if (this.f24194o != null) {
                    if (this.f24181b == EnumC58566d.STARTED) {
                        this.f24194o.mo16738d();
                        this.f24181b = EnumC58566d.PAUSED;
                    }
                    if (this.f24181b == EnumC58566d.PAUSED) {
                        this.f24194o.mo16739e();
                        this.f24181b = EnumC58566d.STOPPED;
                    }
                    this.f24194o.mo16741g();
                    this.f24183d.mo95890d();
                    this.f24181b = EnumC58566d.RELEASE;
                    HandlerThread handlerThread = this.f24197r;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        this.f24197r.interrupt();
                        break;
                    }
                } else {
                    this.f24181b = EnumC58566d.NOT_PREPARED;
                    return true;
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                try {
                    this.f24194o.mo16732a((Surface) message.obj);
                    break;
                } catch (Exception unused) {
                    mo16781i();
                    mo16771a(false, "surface has been released");
                    break;
                }
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                AbstractC58561c<C58555a<C58555a>> cVar2 = this.f24194o;
                if (cVar2 != null) {
                    cVar2.mo16740f();
                    this.f24200u.mo96037b();
                    this.f24181b = EnumC58566d.NOT_PREPARED;
                    this.f24190k = false;
                    break;
                }
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                try {
                    this.f24194o.mo16731a();
                } catch (Exception e3) {
                    AbstractC58511b bVar = this.f24193n;
                    if (bVar != null) {
                        AbstractC58561c<C58555a<C58555a>> cVar3 = this.f24194o;
                        if (cVar3 != null) {
                            str = cVar3.mo16744j();
                        } else {
                            str = "unknown";
                        }
                        bVar.mo16677a(str, e3);
                    }
                    C58556b bVar2 = new C58556b();
                    bVar2.mo16731a();
                    this.f24194o = bVar2;
                }
                this.f24194o.mo16736b(true);
                this.f24194o.mo16734a(this.f24188i);
                this.f24194o.mo96019a(new AbstractC58561c.AbstractC58564c<C58555a<C58555a>>() {
                    /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99752 */

                    static {
                        Covode.recordClassIndex(11528);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58564c
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo16788a() {
                        LocalPlayerController.this.f24183d.mo95883a();
                    }
                });
                this.f24194o.mo96017a(new AbstractC58561c.AbstractC58562a<C58555a<C58555a>>() {
                    /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99763 */

                    static {
                        Covode.recordClassIndex(11529);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58562a
                    /* renamed from: a */
                    public final /* synthetic */ void mo16789a() {
                        if (!LocalPlayerController.this.f24186g || !LocalPlayerController.this.f24188i) {
                            if (LocalPlayerController.this.f24187h) {
                                LocalPlayerController.this.f24183d.mo95887b();
                                LocalPlayerController.this.f24180a.clear();
                            }
                            LocalPlayerController.this.f24181b = EnumC58566d.PAUSED;
                            LocalPlayerController.this.mo16771a(true, (String) null);
                            LocalPlayerController.this.mo16781i();
                        }
                    }
                });
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
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
                        this.f24180a.add(bVar3);
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                AbstractC58561c<C58555a<C58555a>> cVar4 = this.f24194o;
                if (cVar4 != null) {
                    cVar4.mo16739e();
                    this.f24181b = EnumC58566d.STOPPED;
                    this.f24190k = false;
                    AbstractC58567e eVar = this.f24183d;
                    if (eVar != null) {
                        eVar.mo95887b();
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public static Message m18397a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    public LocalPlayerController(Context context, AbstractC1204m mVar, AbstractC58561c<C58555a<C58555a>> cVar, int i) {
        C58574c cVar2 = new C58574c();
        this.f24200u = cVar2;
        this.f24201v = null;
        this.f24203x = new AbstractC58561c.AbstractC58565d<C58555a<C58555a>>() {
            /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99785 */

            static {
                Covode.recordClassIndex(11531);
            }

            @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58565d
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo16791a() {
                LocalPlayerController.this.mo16764a(LocalPlayerController.m18397a(2, (Object) null));
            }
        };
        this.f24204y = new AbstractC58561c.AbstractC58563b<C58555a<C58555a>>() {
            /* class com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController.C99796 */

            static {
                Covode.recordClassIndex(11532);
            }

            @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c.AbstractC58563b
            /* renamed from: a */
            public final /* synthetic */ void mo16792a(int i, int i2, String str) {
                LocalPlayerController.this.mo16770a(false, i, i2, "mediaPlayer error, info:".concat(String.valueOf(str)));
                LocalPlayerController.this.mo16781i();
            }
        };
        this.f24192m = context;
        this.f24201v = mVar;
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
        }
        HandlerThread handlerThread = new HandlerThread("alpha-play-thread", 10);
        this.f24197r = handlerThread;
        handlerThread.start();
        this.f24195p = new Handler(this.f24197r.getLooper(), this);
        if (i == 1) {
            this.f24183d = new C58514b(this.f24192m);
        } else {
            this.f24183d = new C58504a(this.f24192m);
        }
        this.f24183d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f24183d.setPlayerController(this);
        this.f24183d.setVideoRenderer(new C9983a(this.f24183d));
        this.f24194o = cVar;
        cVar2.f133436a = cVar;
        mo16764a(m18397a(10, (Object) null));
    }

    /* renamed from: a */
    public final void mo16770a(boolean z, int i, int i2, String str) {
        String str2;
        AbstractC58511b bVar = this.f24193n;
        if (bVar != null) {
            AbstractC58561c<C58555a<C58555a>> cVar = this.f24194o;
            if (cVar != null) {
                str2 = cVar.mo16744j();
            } else {
                str2 = "unknown";
            }
            bVar.mo16678a(z, str2, i, i2, str + ", messageId: " + this.f24189j);
        }
    }
}
