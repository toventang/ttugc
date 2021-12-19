package com.bytedance.android.livesdk.newvideogift.controllers;

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
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d;
import java.io.File;

public class LocalPlayerControllerNormal implements AbstractC33974au, AbstractC58539a {

    /* renamed from: a */
    public EnumC58566d f24214a;

    /* renamed from: b */
    AbstractC58510a f24215b;

    /* renamed from: c */
    AbstractC58561c<C58555a<C58555a>> f24216c;

    /* renamed from: d */
    public C58504a f24217d;

    /* renamed from: e */
    int f24218e;

    /* renamed from: f */
    int f24219f;

    /* renamed from: g */
    int f24220g;

    /* renamed from: h */
    private long f24221h;

    /* renamed from: i */
    private boolean f24222i;

    /* renamed from: j */
    private Context f24223j;

    /* renamed from: k */
    private AbstractC58511b f24224k;

    /* renamed from: l */
    private boolean f24225l;

    /* renamed from: m */
    private AbstractC58561c.AbstractC58565d<C58555a<C58555a>> f24226m;

    /* renamed from: n */
    private AbstractC58561c.AbstractC58563b<C58555a<C58555a>> f24227n;

    static {
        Covode.recordClassIndex(11535);
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
        return this.f24217d;
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
    private void m18426i() {
        this.f24222i = false;
        this.f24221h = 0;
        AbstractC58510a aVar = this.f24215b;
        if (aVar != null) {
            aVar.mo16676b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final boolean mo16773b() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f24216c;
        if (cVar == null || !cVar.mo16756k()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: c */
    public final int mo16774c() {
        AbstractC58561c<C58555a<C58555a>> cVar = this.f24216c;
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
        AbstractC58561c<C58555a<C58555a>> cVar = this.f24216c;
        if (cVar != null) {
            cVar.mo16740f();
            this.f24214a = EnumC58566d.NOT_PREPARED;
            this.f24222i = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: d */
    public final void mo16775d() {
        if (this.f24216c != null && this.f24214a == EnumC58566d.STARTED) {
            this.f24216c.mo16738d();
            this.f24214a = EnumC58566d.PAUSED;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: e */
    public final void mo16776e() {
        if (this.f24222i) {
            m18428l();
        } else if (this.f24225l) {
            this.f24225l = false;
            m18427k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: f */
    public final void mo16777f() {
        if (this.f24216c == null) {
            return;
        }
        if (this.f24214a == EnumC58566d.STARTED || this.f24214a == EnumC58566d.PAUSED) {
            this.f24216c.mo16738d();
            this.f24214a = EnumC58566d.PAUSED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal$1 */
    public static /* synthetic */ class C99821 {

        /* renamed from: a */
        static final /* synthetic */ int[] f24228a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 11536(0x2d10, float:1.6165E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.C99821.f24228a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.C99821.f24228a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.C99821.f24228a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.C99821.f24228a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.EnumC58566d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.C99821.<clinit>():void");
        }
    }

    /* renamed from: k */
    private void m18427k() {
        if (this.f24216c != null) {
            if (this.f24214a == EnumC58566d.NOT_PREPARED || this.f24214a == EnumC58566d.STOPPED) {
                this.f24216c.mo96020a(this.f24226m);
                this.f24216c.mo96018a(this.f24227n);
                this.f24216c.mo16735b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: g */
    public final void mo16778g() {
        this.f24217d.onPause();
        if (this.f24216c == null) {
            this.f24214a = EnumC58566d.NOT_PREPARED;
            return;
        }
        if (this.f24214a == EnumC58566d.STARTED) {
            this.f24216c.mo16738d();
            this.f24214a = EnumC58566d.PAUSED;
        }
        if (this.f24214a == EnumC58566d.PAUSED) {
            this.f24216c.mo16739e();
            this.f24214a = EnumC58566d.STOPPED;
        }
        this.f24216c.mo16741g();
        this.f24217d.mo95890d();
        this.f24214a = EnumC58566d.RELEASE;
    }

    /* renamed from: l */
    private void m18428l() {
        if (this.f24216c != null) {
            int i = C99821.f24228a[this.f24214a.ordinal()];
            if (i == 1) {
                this.f24216c.mo16737c();
                this.f24222i = true;
                this.f24214a = EnumC58566d.STARTED;
                AbstractC58510a aVar = this.f24215b;
                if (aVar != null) {
                    aVar.mo16674a();
                }
            } else if (i == 2) {
                this.f24216c.mo16737c();
                this.f24214a = EnumC58566d.STARTED;
            } else if (i == 3 || i == 4) {
                try {
                    m18427k();
                } catch (Exception e) {
                    e.printStackTrace();
                    m18425a(false, "prepare and start MediaPlayer failure.");
                    m18426i();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final AbstractC58539a mo16763a(AbstractC58510a aVar) {
        this.f24215b = aVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16765a(Surface surface) {
        this.f24216c.mo16732a(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: b */
    public final void mo16772b(ViewGroup viewGroup) {
        MethodCollector.m26663i(3412);
        if (viewGroup == null) {
            MethodCollector.m26664o(3412);
            return;
        }
        viewGroup.removeView(this.f24217d);
        MethodCollector.m26664o(3412);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16766a(ViewGroup viewGroup) {
        MethodCollector.m26663i(3411);
        if (viewGroup == null) {
            MethodCollector.m26664o(3411);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f24217d.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f24217d);
        }
        if (viewGroup.indexOfChild(this.f24217d) == -1) {
            viewGroup.addView(this.f24217d);
        }
        MethodCollector.m26664o(3411);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16767a(AbstractC58511b bVar) {
        this.f24224k = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a
    /* renamed from: a */
    public final void mo16769a(C58522a aVar) {
        String str;
        this.f24221h = aVar.f133236d;
        if (aVar.f133233a) {
            this.f24217d.setVisibility(0);
            this.f24217d.bringToFront();
            try {
                this.f24216c.mo16740f();
                this.f24214a = EnumC58566d.NOT_PREPARED;
                int i = this.f24223j.getResources().getConfiguration().orientation;
                C58522a.C58524b a = aVar.mo95918a(i);
                if (a != null && !TextUtils.isEmpty(a.f133244a)) {
                    if (new File(a.f133244a).exists()) {
                        this.f24217d.setConfigParams(a);
                        this.f24216c.mo16733a(a.f133244a);
                        this.f24218e = a.f133251h;
                        this.f24219f = a.f133252i;
                        this.f24220g = a.f133253j;
                        if (this.f24217d.f133179a) {
                            m18427k();
                            return;
                        } else {
                            this.f24225l = true;
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
                    m18425a(false, sb.append(str).toString());
                }
                m18426i();
            } catch (Exception e) {
                e.printStackTrace();
                m18426i();
                m18425a(false, "alphaVideoView set dataSource failure:" + Log.getStackTraceString(e));
            }
        } else {
            m18426i();
            m18425a(false, "dataSource is invalid. ErrorInfo: " + aVar.f133235c);
        }
    }

    /* renamed from: a */
    private void m18425a(boolean z, String str) {
        m18424a(false, 0, 0, str);
    }

    /* renamed from: a */
    private void m18424a(boolean z, int i, int i2, String str) {
        String str2;
        AbstractC58511b bVar = this.f24224k;
        if (bVar != null) {
            AbstractC58561c<C58555a<C58555a>> cVar = this.f24216c;
            if (cVar != null) {
                str2 = cVar.mo16744j();
            } else {
                str2 = "unknown";
            }
            bVar.mo16678a(z, str2, 0, 0, str + ", messageId: " + this.f24221h);
        }
    }
}
