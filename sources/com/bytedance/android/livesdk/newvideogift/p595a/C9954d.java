package com.bytedance.android.livesdk.newvideogift.p595a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPlayerUserTypeNewSetting;
import com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11632d;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.C58521c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b;
import java.io.File;

/* renamed from: com.bytedance.android.livesdk.newvideogift.a.d */
public final class C9954d implements AbstractC11629a {

    /* renamed from: a */
    public AbstractC11631c f24118a;

    /* renamed from: b */
    public AbstractC11632d f24119b;

    /* renamed from: c */
    public final Object f24120c = new Object();

    /* renamed from: d */
    public AbstractC58539a f24121d;

    /* renamed from: e */
    private Context f24122e;

    /* renamed from: f */
    private AbstractC1204m f24123f;

    /* renamed from: g */
    private final IHostPlugin f24124g;

    /* renamed from: h */
    private AbstractC58561c f24125h;

    /* renamed from: i */
    private AbstractC58510a f24126i = new AbstractC58510a() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9954d.C99551 */

        static {
            Covode.recordClassIndex(11507);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: a */
        public final void mo16674a() {
            if (C9954d.this.f24118a != null) {
                C9954d.this.f24118a.mo16650a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: b */
        public final void mo16676b() {
            if (C9954d.this.f24118a != null) {
                C9954d.this.f24118a.mo16652b();
            }
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
            if (r9 > r8) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
            if (r9 > r8) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
            if (r9 > r8) goto L_0x0095;
         */
        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58510a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo16675a(int r11, int r12, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a.EnumC58526d r13) {
            /*
            // Method dump skipped, instructions count: 196
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.p595a.C9954d.C99551.mo16675a(int, int, com.ss.android.ugc.aweme.live.alphaplayer.c.a$d):void");
        }
    };

    /* renamed from: j */
    private AbstractC58511b f24127j = new AbstractC58511b() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9954d.C99562 */

        static {
            Covode.recordClassIndex(11508);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b
        /* renamed from: a */
        public final void mo16677a(String str, Exception exc) {
            C3854a.m9453a(4, "LiveGiftPlay", "create " + str + " failure, errorMsg: " + exc.toString());
            C3854a.m9455a(6, "LiveGiftPlay", exc.getStackTrace());
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58511b
        /* renamed from: a */
        public final void mo16678a(boolean z, String str, int i, int i2, String str2) {
            MethodCollector.m26663i(3389);
            synchronized (C9954d.this.f24120c) {
                try {
                    if (C9954d.this.f24119b != null) {
                        C9954d.this.f24119b.mo16761a(z, str, i, i2, str2);
                    }
                } finally {
                    MethodCollector.m26664o(3389);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(11506);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: d */
    public final void mo16672d() {
        this.f24118a = null;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: a */
    public final boolean mo16668a() {
        AbstractC58539a aVar = this.f24121d;
        if (aVar == null || !aVar.mo16773b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: e */
    public final void mo16673e() {
        MethodCollector.m26663i(3763);
        synchronized (this.f24120c) {
            try {
                this.f24119b = null;
            } finally {
                MethodCollector.m26664o(3763);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: b */
    public final void mo16669b() {
        if (this.f24121d != null) {
            C3854a.m9453a(3, "LiveGiftPlay", "stopWhenSlideSwitch() called with: playerController = [" + this.f24121d + "]");
            this.f24121d.mo16779h();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: c */
    public final void mo16671c() {
        MethodCollector.m26663i(3759);
        if (this.f24121d != null) {
            C3854a.m9453a(3, "LiveGiftPlay", "release() called with: playerController = [" + this.f24121d + "]");
            this.f24121d.mo16763a((AbstractC58510a) null);
            this.f24121d.mo16767a((AbstractC58511b) null);
            this.f24121d.mo16778g();
            this.f24121d = null;
        }
        this.f24123f = null;
        this.f24122e = null;
        this.f24118a = null;
        synchronized (this.f24120c) {
            try {
                this.f24119b = null;
            } finally {
                MethodCollector.m26664o(3759);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.newvideogift.a.d$3 */
    static /* synthetic */ class C99573 {

        /* renamed from: a */
        static final /* synthetic */ int[] f24130a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.p595a.C9954d.C99573.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: a */
    public final void mo16665a(AbstractC11631c cVar) {
        this.f24118a = cVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: a */
    public final void mo16666a(AbstractC11632d dVar) {
        MethodCollector.m26663i(3760);
        synchronized (this.f24120c) {
            try {
                this.f24119b = dVar;
            } finally {
                MethodCollector.m26664o(3760);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: a */
    public final void mo16663a(ViewGroup viewGroup) {
        if (this.f24121d != null) {
            C3854a.m9453a(3, "LiveGiftPlay", "attachAlphaView() called with: playerController = [" + this.f24121d + "]");
            this.f24121d.mo16766a(viewGroup);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: b */
    public final void mo16670b(ViewGroup viewGroup) {
        if (this.f24121d != null) {
            C3854a.m9453a(3, "LiveGiftPlay", "detachAlphaView() called with: playerController = [" + this.f24121d + "]");
            this.f24121d.mo16772b(viewGroup);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: a */
    public final void mo16664a(AbstractC1204m mVar) {
        AbstractC58561c hVar;
        this.f24123f = mVar;
        if (this.f24122e == null || mVar == null) {
            C3854a.m9453a(6, "LiveGiftPlay", "context or lifecycleOwner is null!");
            return;
        }
        AbstractC58539a aVar = this.f24121d;
        if (aVar != null) {
            aVar.mo16778g();
        }
        C58521c cVar = new C58521c();
        cVar.f133230a = this.f24122e;
        cVar.f133232c = 1;
        cVar.f133231b = this.f24123f;
        if (LiveGiftPlayerUserTypeNewSetting.INSTANCE.getValue() == 1 && !AbstractC6804a.f16998bu.mo13066a().booleanValue()) {
            hVar = new C58556b();
        } else if (LiveGiftPlayerUserTypeNewSetting.INSTANCE.getValue() == 4) {
            hVar = new C9960g(this.f24122e);
        } else {
            hVar = new C9962h(this.f24122e);
        }
        this.f24125h = hVar;
        C3854a.m9453a(4, "LiveGiftPlay", "use " + hVar.mo16744j());
        LocalPlayerController localPlayerController = new LocalPlayerController(cVar.f133230a, cVar.f133231b, hVar, cVar.f133232c);
        this.f24121d = localPlayerController;
        localPlayerController.mo16763a(this.f24126i);
        this.f24121d.mo16767a(this.f24127j);
    }

    public C9954d(Context context, IHostPlugin iHostPlugin) {
        this.f24122e = context;
        this.f24124g = iHostPlugin;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a
    /* renamed from: a */
    public final void mo16667a(String str, long j) {
        StringBuilder append;
        StringBuilder append2;
        MethodCollector.m26663i(3752);
        if (this.f24121d != null) {
            C3854a.m9453a(3, "LiveGiftPlay", "start() called with: playerController = [" + this.f24121d + "]");
            if (str.endsWith(File.separator)) {
                append = new StringBuilder().append(str);
            } else {
                append = new StringBuilder().append(str).append(File.separator);
            }
            String sb = append.append("config.json").toString();
            String a = C9949a.m18271a(sb);
            if (a == null || a.isEmpty()) {
                boolean exists = new File(sb).exists();
                synchronized (this.f24120c) {
                    try {
                        AbstractC11632d dVar = this.f24119b;
                        if (dVar != null) {
                            dVar.mo16761a(false, "", 0, 0, "configJson is null; exist:".concat(String.valueOf(exists)));
                        }
                    } finally {
                        MethodCollector.m26664o(3752);
                    }
                }
                return;
            }
            try {
                C9967i iVar = (C9967i) C4139e.C4140a.f11576c.mo46670a(a, C9967i.class);
                if (iVar == null) {
                    synchronized (this.f24120c) {
                        try {
                            AbstractC11632d dVar2 = this.f24119b;
                            if (dVar2 != null) {
                                dVar2.mo16761a(false, "", 0, 0, "Gson convert failed: " + a.replaceAll("\\s", ""));
                            }
                        } finally {
                            MethodCollector.m26664o(3752);
                        }
                    }
                    return;
                }
                C58522a aVar = new C58522a();
                aVar.f133236d = j;
                if (iVar.f24156b != null) {
                    if (str.endsWith(File.separator)) {
                        append2 = new StringBuilder().append(str);
                    } else {
                        append2 = new StringBuilder().append(str).append(File.separator);
                    }
                    C58522a.C58524b a2 = new C58522a.C58524b(append2.append(iVar.f24156b.f24161a).toString()).mo95935a(iVar.f24156b.f24162b);
                    a2.f133253j = iVar.f24156b.f24163c;
                    a2.f133246c = iVar.f24156b.f24164d;
                    a2.f133249f = iVar.f24156b.f24167g;
                    a2.f133250g = iVar.f24156b.f24168h;
                    a2.f133251h = iVar.f24156b.f24165e;
                    a2.f133252i = iVar.f24156b.f24166f;
                    C58522a.C58524b b = a2.mo95937a(iVar.f24156b.f24169i).mo95940b(iVar.f24156b.f24170j);
                    b.f133254k = iVar.f24156b.f24171k;
                    aVar.mo95921b(b);
                }
                if (iVar.f24155a != null) {
                    C58522a.C58524b a3 = new C58522a.C58524b(str + File.separator + iVar.f24155a.f24161a).mo95935a(iVar.f24155a.f24162b);
                    a3.f133253j = iVar.f24155a.f24163c;
                    a3.f133246c = iVar.f24155a.f24164d;
                    a3.f133249f = iVar.f24155a.f24167g;
                    a3.f133250g = iVar.f24155a.f24168h;
                    a3.f133251h = iVar.f24155a.f24165e;
                    a3.f133252i = iVar.f24155a.f24166f;
                    C58522a.C58524b b2 = a3.mo95937a(iVar.f24155a.f24169i).mo95940b(iVar.f24155a.f24170j);
                    b2.f133254k = iVar.f24155a.f24171k;
                    aVar.mo95919a(b2);
                    aVar.mo95921b(b2);
                }
                this.f24121d.mo16769a(aVar);
            } catch (C28027t e) {
                C3854a.m9458a("LiveGiftPlay", e);
            }
        }
        MethodCollector.m26664o(3752);
    }
}
