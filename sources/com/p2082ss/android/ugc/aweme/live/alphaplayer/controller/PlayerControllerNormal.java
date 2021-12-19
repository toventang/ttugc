package com.p2082ss.android.ugc.aweme.live.alphaplayer.controller;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal */
public class PlayerControllerNormal implements AbstractC33974au, AbstractC58539a {

    /* renamed from: a */
    public EnumC58566d f133311a;

    /* renamed from: b */
    public C58504a f133312b;

    /* renamed from: c */
    private long f133313c;

    /* renamed from: d */
    private boolean f133314d;

    /* renamed from: e */
    private Context f133315e;

    /* renamed from: f */
    private AbstractC58511b f133316f;

    /* renamed from: g */
    private AbstractC58510a f133317g;

    /* renamed from: h */
    private AbstractC58561c<C58555a<C58555a>> f133318h;

    /* renamed from: i */
    private boolean f133319i;

    /* renamed from: j */
    private int f133320j;

    /* renamed from: k */
    private int f133321k;

    /* renamed from: l */
    private int f133322l;

    /* renamed from: m */
    private AbstractC58561c.AbstractC58565d<C58555a<C58555a>> f133323m;

    /* renamed from: n */
    private AbstractC58561c.AbstractC58563b<C58555a<C58555a>> f133324n;

    static {
        Covode.recordClassIndex(68830);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16768a(AbstractC58513d dVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: j */
    public final int mo16782j() {
        return 0;
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

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final View mo16762a() {
        return this.f133312b;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo16778g();
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

    /* renamed from: i */
    private void m107520i() {
        this.f133314d = false;
        this.f133313c = 0;
        AbstractC58510a aVar = this.f133317g;
        if (aVar != null) {
            aVar.mo16676b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final boolean mo16773b() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f133318h;
        if (cVar == null || !cVar.mo16756k()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: c */
    public final int mo16774c() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f133318h;
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
    /* renamed from: h */
    public final void mo16779h() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f133318h;
        if (cVar != null) {
            cVar.mo16740f();
            this.f133311a = EnumC58566d.NOT_PREPARED;
            this.f133314d = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: d */
    public final void mo16775d() {
        if (this.f133318h != null && this.f133311a == EnumC58566d.STARTED) {
            this.f133318h.mo16738d();
            this.f133311a = EnumC58566d.PAUSED;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: e */
    public final void mo16776e() {
        if (this.f133314d) {
            m107522l();
        } else if (this.f133319i) {
            this.f133319i = false;
            m107521k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: f */
    public final void mo16777f() {
        if (this.f133318h == null) {
            return;
        }
        if (this.f133311a == EnumC58566d.STARTED || this.f133311a == EnumC58566d.PAUSED) {
            this.f133318h.mo16738d();
            this.f133311a = EnumC58566d.PAUSED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal$1 */
    public static /* synthetic */ class C585381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133325a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 68831(0x10cdf, float:9.6453E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.C585381.f133325a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.C585381.f133325a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.C585381.f133325a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.C585381.f133325a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.C585381.<clinit>():void");
        }
    }

    /* renamed from: k */
    private void m107521k() {
        if (this.f133318h != null) {
            if (this.f133311a == EnumC58566d.NOT_PREPARED || this.f133311a == EnumC58566d.STOPPED) {
                this.f133318h.mo96020a(this.f133323m);
                this.f133318h.mo96018a(this.f133324n);
                this.f133318h.mo16735b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: g */
    public final void mo16778g() {
        this.f133312b.onPause();
        if (this.f133318h == null) {
            this.f133311a = EnumC58566d.NOT_PREPARED;
            return;
        }
        if (this.f133311a == EnumC58566d.STARTED) {
            this.f133318h.mo16738d();
            this.f133311a = EnumC58566d.PAUSED;
        }
        if (this.f133311a == EnumC58566d.PAUSED) {
            this.f133318h.mo16739e();
            this.f133311a = EnumC58566d.STOPPED;
        }
        this.f133318h.mo16741g();
        this.f133312b.mo95890d();
        this.f133311a = EnumC58566d.RELEASE;
    }

    /* renamed from: l */
    private void m107522l() {
        if (this.f133318h != null) {
            int i = C585381.f133325a[this.f133311a.ordinal()];
            if (i == 1) {
                this.f133318h.mo16737c();
                this.f133314d = true;
                this.f133311a = EnumC58566d.STARTED;
                AbstractC58510a aVar = this.f133317g;
                if (aVar != null) {
                    aVar.mo16674a();
                }
            } else if (i == 2) {
                this.f133318h.mo16737c();
                this.f133311a = EnumC58566d.STARTED;
            } else if (i == 3 || i == 4) {
                try {
                    m107521k();
                } catch (Exception e) {
                    e.printStackTrace();
                    m107519a("prepare and start MediaPlayer failure.");
                    m107520i();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final AbstractC58539a mo16763a(AbstractC58510a aVar) {
        this.f133317g = aVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16765a(Surface surface) {
        this.f133318h.mo16732a(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16767a(AbstractC58511b bVar) {
        this.f133316f = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final void mo16772b(ViewGroup viewGroup) {
        MethodCollector.m26663i(870);
        if (viewGroup == null) {
            MethodCollector.m26664o(870);
            return;
        }
        viewGroup.removeView(this.f133312b);
        MethodCollector.m26664o(870);
    }

    /* renamed from: a */
    private void m107519a(String str) {
        String str2;
        AbstractC58511b bVar = this.f133316f;
        if (bVar != null) {
            AbstractC58561c<C58555a<C58555a>> cVar = this.f133318h;
            if (cVar != null) {
                str2 = cVar.mo16744j();
            } else {
                str2 = "unknown";
            }
            bVar.mo16678a(false, str2, 0, 0, str + ", messageId: " + this.f133313c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16766a(ViewGroup viewGroup) {
        MethodCollector.m26663i(864);
        if (viewGroup == null) {
            MethodCollector.m26664o(864);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f133312b.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f133312b);
        }
        if (viewGroup.indexOfChild(this.f133312b) == -1) {
            viewGroup.addView(this.f133312b);
        }
        MethodCollector.m26664o(864);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16769a(C58522a aVar) {
        String str;
        this.f133313c = aVar.f133236d;
        if (aVar.f133233a) {
            this.f133312b.setVisibility(0);
            this.f133312b.bringToFront();
            try {
                this.f133318h.mo16740f();
                this.f133311a = EnumC58566d.NOT_PREPARED;
                int i = this.f133315e.getResources().getConfiguration().orientation;
                C58522a.C58524b a = aVar.mo95918a(i);
                if (a != null && !TextUtils.isEmpty(a.f133244a)) {
                    if (new File(a.f133244a).exists()) {
                        this.f133312b.setConfigParams(a);
                        this.f133318h.mo16733a(a.f133244a);
                        this.f133320j = a.f133251h;
                        this.f133321k = a.f133252i;
                        this.f133322l = a.f133253j;
                        if (this.f133312b.f133179a) {
                            m107521k();
                            return;
                        } else {
                            this.f133319i = true;
                            return;
                        }
                    }
                }
                if (1 == i) {
                    StringBuilder sb = new StringBuilder("dataPath is empty or File is not exists. path: ");
                    if (a == null) {
                        str = "null";
                    } else {
                        str = a.f133244a;
                    }
                    m107519a(sb.append(str).toString());
                }
                m107520i();
            } catch (Exception e) {
                e.printStackTrace();
                m107520i();
                m107519a("alphaVideoView set dataSource failure:" + Log.getStackTraceString(e));
            }
        } else {
            m107520i();
            m107519a("dataSource is invalid. ErrorInfo: " + aVar.f133235c);
        }
    }
}
