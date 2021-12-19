package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p250i.p251a.AbstractC4356c;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p250i.p252b.C4360b;
import com.bytedance.android.live.p250i.p252b.C4365d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.detail.C7428a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableReusePlayerWithoutFirstFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFirstFrameCallbackInsertMqHeadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPlayerInvokeStopBeforePlaySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6552h;
import com.bytedance.android.livesdk.p425aa.p429d.AbstractC6540b;
import com.bytedance.android.livesdk.p442ai.AbstractC6724g;
import com.bytedance.android.livesdk.p442ai.C6741n;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9084cw;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.livesdkapi.view.SurfaceRenderView;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.i */
public final class C6730i implements AbstractC5777j, AbstractC6540b, AbstractC6724g.AbstractC6725a, AbstractC6724g.AbstractC6726b, HandlerC11626a.AbstractC11627a {

    /* renamed from: l */
    private static final AbstractC11643g.C11647d f16670l = new AbstractC11643g.C11647d.C11648a().mo18426a();

    /* renamed from: A */
    private final Context f16671A;

    /* renamed from: B */
    private final IHostPlugin f16672B;

    /* renamed from: C */
    private final AbstractC6723f f16673C;

    /* renamed from: D */
    private String f16674D = "";

    /* renamed from: E */
    private boolean f16675E = true;

    /* renamed from: F */
    private boolean f16676F;

    /* renamed from: G */
    private boolean f16677G;

    /* renamed from: H */
    private boolean f16678H = true;

    /* renamed from: I */
    private boolean f16679I;

    /* renamed from: J */
    private final TextureView.SurfaceTextureListener f16680J = new TextureView.SurfaceTextureListener() {
        /* class com.bytedance.android.livesdk.p442ai.C6730i.TextureView$SurfaceTextureListenerC67311 */

        static {
            Covode.recordClassIndex(7469);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C7572d.m15561a("LivePlayController", "onSurfaceTextureDestroyed");
            if (C6730i.this.f16685a != null && C6730i.this.f16692h) {
                C6730i.this.f16685a.mo12880a((SurfaceHolder) null);
            }
            return C6730i.this.f16692h;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C7572d.m15562b("LivePlayController", "onSurfaceTextureSizeChanged -> width: " + i + ",height: " + i2 + ",");
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C7572d.m15561a("LivePlayController", "onSurfaceTextureAvailable");
            if (C6730i.this.f16689e != null) {
                C6730i.this.f16689e.setSurfaceTextureListener(null);
            }
            C6730i.this.mo12932p();
            if (((C6730i.this.f16686b instanceof TextureRenderView) || (C6730i.this.f16686b instanceof TextureViewWrapper)) && C6730i.this.f16692h) {
                if (C6730i.this.f16687c != null) {
                    C6730i.this.f16687c.release();
                }
                C6730i.this.f16687c = new Surface(surfaceTexture);
                C6730i.this.mo12923g(true);
            }
        }
    };

    /* renamed from: K */
    private final SurfaceHolder.Callback f16681K = new SurfaceHolder.Callback() {
        /* class com.bytedance.android.livesdk.p442ai.C6730i.SurfaceHolder$CallbackC67322 */

        static {
            Covode.recordClassIndex(7470);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C7572d.m15562b("LivePlayController", "surfaceDestroyed");
            if (C6730i.this.f16685a != null) {
                C6730i.this.f16685a.mo12880a((SurfaceHolder) null);
            }
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C7572d.m15562b("LivePlayController", "surfaceCreated");
            if (C6730i.this.f16687c != null) {
                C6730i.this.f16687c.release();
                C6730i.this.f16687c = null;
            }
            C6730i.this.f16688d = surfaceHolder;
            C6730i.this.mo12923g(true);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C7572d.m15562b("LivePlayController", "surfaceChanged -> width: " + i2 + ",height: " + i3 + ",");
        }
    };

    /* renamed from: L */
    private long f16682L;

    /* renamed from: M */
    private String f16683M = "";

    /* renamed from: N */
    private C11690a f16684N = null;

    /* renamed from: a */
    public AbstractC6724g f16685a;

    /* renamed from: b */
    public AbstractC11876d f16686b;

    /* renamed from: c */
    public Surface f16687c;

    /* renamed from: d */
    public SurfaceHolder f16688d;

    /* renamed from: e */
    public TextureView f16689e;

    /* renamed from: f */
    final C6741n f16690f;

    /* renamed from: g */
    SoftReference<AbstractC4356c> f16691g;

    /* renamed from: h */
    public boolean f16692h = true;

    /* renamed from: i */
    boolean f16693i = LiveMultiPlayerEnableSetting.INSTANCE.getValue();

    /* renamed from: j */
    AbstractC11656k f16694j;

    /* renamed from: k */
    final Map<String, String> f16695k = new ConcurrentHashMap();

    /* renamed from: m */
    private boolean f16696m;

    /* renamed from: n */
    private int f16697n;

    /* renamed from: o */
    private TextureView.SurfaceTextureListener f16698o;

    /* renamed from: p */
    private String f16699p = "";

    /* renamed from: q */
    private String f16700q = "";

    /* renamed from: r */
    private String f16701r = "";

    /* renamed from: s */
    private String f16702s;

    /* renamed from: t */
    private AbstractC11643g.C11647d f16703t = f16670l;

    /* renamed from: u */
    private boolean f16704u;

    /* renamed from: v */
    private final HandlerC11626a f16705v;

    /* renamed from: w */
    private AbstractC11643g.AbstractC11646c f16706w;

    /* renamed from: x */
    private volatile int f16707x;

    /* renamed from: y */
    private int f16708y;

    /* renamed from: z */
    private EnumC11728i f16709z;

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: b */
    public final String mo11533b() {
        return this.f16674D;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: k */
    public final int mo12927k() {
        return this.f16707x;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: m */
    public final String mo12929m() {
        return this.f16699p;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: n */
    public final String mo12930n() {
        return this.f16700q;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: a */
    public final void mo12912a(String str, String str2, AbstractC11876d dVar, int i, AbstractC11643g.C11647d dVar2, AbstractC11643g.AbstractC11646c cVar) {
        mo11527a(str, str2, dVar, i, dVar2, cVar, (String) null);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11527a(String str, String str2, AbstractC11876d dVar, int i, AbstractC11643g.C11647d dVar2, AbstractC11643g.AbstractC11646c cVar, String str3) {
        if (str == null) {
            m14311r();
            if (this.f16685a != null) {
                C7572d.m15561a("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                this.f16685a.mo12877a();
                return;
            }
            return;
        }
        this.f16683M = "";
        this.f16699p = "";
        if (this.f16692h) {
            C7572d.m15561a("LivePlayController", "start player -> reset controller`s pullStreamData");
            this.f16700q = "";
        }
        this.f16709z = EnumC11728i.valueOf(i);
        if (dVar != null) {
            m14307b(dVar);
        }
        if (str3 != null) {
            this.f16674D = str3;
        }
        this.f16706w = cVar;
        this.f16704u = true;
        boolean z = !C13627m.m24499a(this.f16700q, str);
        this.f16700q = str;
        this.f16701r = str2;
        if (dVar2 == null) {
            dVar2 = f16670l;
        }
        this.f16703t = dVar2;
        if (this.f16685a == null) {
            m14312s();
        } else if (this.f16696m) {
            m14312s();
        }
        if (this.f16677G) {
            this.f16685a.mo12878a(1);
        } else {
            this.f16685a.mo12878a(0);
        }
        this.f16685a.mo12881a(this, this);
        this.f16685a.mo12882a(this.f16684N);
        m14304C();
        C7572d.m15561a("LivePlayController", "start player -> playerTag: " + str3 + " ,mPlayContextTag: " + this.f16674D);
        if (z || !m14302A()) {
            if (this.f16692h || !EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue()) {
                if (z) {
                    this.f16708y = 0;
                }
                m14314u();
            }
        } else if (m14319z()) {
            C7572d.m15561a("LivePlayController", "start player -> share player reuse stream");
            AbstractC11876d dVar3 = this.f16686b;
            if (dVar3 instanceof SurfaceRenderView) {
                this.f16685a.mo12880a(this.f16688d);
            } else if ((dVar3 instanceof TextureRenderView) || (dVar3 instanceof TextureViewWrapper)) {
                this.f16685a.mo12879a(this.f16687c);
            }
            if (!this.f16685a.mo12900g()) {
                C7572d.m15561a("LivePlayController", "start player -> fallback: live player start pulling");
                this.f16685a.mo12892c();
            }
            if (m14303B()) {
                this.f16705v.obtainMessage(AbstractC11643g.EnumC11645b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: a */
    public final void mo12911a(String str, AbstractC11876d dVar, int i, AbstractC11643g.C11647d dVar2, AbstractC11643g.AbstractC11646c cVar, String str2) {
        mo11526a(str, dVar, i, dVar2, cVar, str2, (String) null);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11526a(String str, AbstractC11876d dVar, int i, AbstractC11643g.C11647d dVar2, AbstractC11643g.AbstractC11646c cVar, String str2, String str3) {
        if (str == null) {
            m14311r();
            if (this.f16685a != null) {
                C7572d.m15561a("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                this.f16685a.mo12877a();
                return;
            }
            return;
        }
        this.f16683M = "";
        this.f16699p = "";
        this.f16700q = "";
        this.f16709z = EnumC11728i.valueOf(i);
        if (dVar != null) {
            m14307b(dVar);
        }
        if (str3 != null) {
            this.f16674D = str3;
        }
        AbstractC11643g.AbstractC11646c cVar2 = this.f16706w;
        if (cVar2 != null) {
            cVar2.mo12871a(AbstractC11643g.EnumC11645b.PLAYER_DETACHED, null);
        }
        this.f16706w = cVar;
        this.f16704u = true;
        boolean h = m14308h(str);
        this.f16699p = str;
        this.f16702s = str2;
        if (dVar2 == null) {
            dVar2 = f16670l;
        }
        this.f16703t = dVar2;
        if (this.f16685a == null) {
            m14312s();
        } else if (this.f16696m) {
            m14312s();
        }
        if (this.f16677G) {
            this.f16685a.mo12878a(1);
        } else {
            this.f16685a.mo12878a(0);
        }
        this.f16685a.mo12881a(this, this);
        this.f16685a.mo12882a(this.f16684N);
        m14304C();
        C7572d.m15561a("LivePlayController", "start player -> playerTag: " + str3 + " ,mPlayContextTag: " + this.f16674D);
        if (h || !m14302A()) {
            if (this.f16692h || !EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue()) {
                if (h) {
                    this.f16708y = 0;
                }
                m14314u();
            }
        } else if (m14319z()) {
            AbstractC11876d dVar3 = this.f16686b;
            if (dVar3 instanceof SurfaceRenderView) {
                this.f16685a.mo12880a(this.f16688d);
            } else if ((dVar3 instanceof TextureRenderView) || (dVar3 instanceof TextureViewWrapper)) {
                this.f16685a.mo12879a(this.f16687c);
            }
            C7572d.m15561a("LivePlayController", "start player -> share player or reuse stream");
            if (!this.f16685a.mo12900g()) {
                C7572d.m15561a("LivePlayController", "start player -> fallback: live player start pulling");
                this.f16685a.mo12892c();
            }
            if (m14303B()) {
                this.f16705v.obtainMessage(AbstractC11643g.EnumC11645b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11528a(Map<String, String> map) {
        this.f16695k.clear();
        this.f16695k.putAll(map);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: a */
    public final void mo12914a(boolean z, Context context) {
        mo11531a(z, AbstractC11643g.C11644a.m20504a(context));
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11531a(boolean z, String str) {
        AbstractC6724g gVar;
        C7572d.m15561a("LivePlayController", "setMute " + z + "-> playerTag: " + str + " ,mPlayContextTag" + this.f16674D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.f16674D) && (gVar = this.f16685a) != null) {
            gVar.mo12887a(z);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final boolean mo11532a() {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            Point i = gVar.mo12902i();
            if (i.x > i.y) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11530a(boolean z) {
        this.f16676F = z;
        m14318y();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11529a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            if (jSONObject.has("player_type")) {
                if (this.f16685a instanceof C6751u) {
                    try {
                        jSONObject.put("new_sdk", true);
                    } catch (JSONException e) {
                        C3854a.m9458a("LivePlayController", e);
                    }
                } else {
                    try {
                        jSONObject.put("new_sdk", false);
                    } catch (JSONException e2) {
                        C3854a.m9458a("LivePlayController", e2);
                    }
                }
            }
            try {
                for (Map.Entry<String, String> entry : this.f16695k.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        mo12913a(jSONObject);
        C6741n nVar = this.f16690f;
        C6552h.m14010a().mo12689a(new C6741n.CallableC6743b(nVar.f16731c, nVar.f16732d, nVar.f16730b, nVar.f16733e, nVar.f16734f, jSONObject, str, (byte) 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12913a(JSONObject jSONObject) {
        String optString = jSONObject.optString("cdn_play_url");
        if (!TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "none")) {
            if (TextUtils.isEmpty(this.f16683M)) {
                this.f16683M = optString;
            } else if (!TextUtils.equals(this.f16683M, optString)) {
                C6749s.m14407a(jSONObject, this.f16683M, this.f16699p, this.f16700q, this.f16701r, this.f16702s);
            }
        }
    }

    /* renamed from: A */
    private boolean m14302A() {
        if ((this.f16697n & 1) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m14303B() {
        if ((this.f16697n & 4) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m14319z() {
        if ((this.f16697n & 2) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: d */
    public final void mo11540d() {
        C6741n nVar = this.f16690f;
        nVar.f16729a = false;
        nVar.f16730b = 0.0f;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j, com.bytedance.android.livesdk.p425aa.p429d.AbstractC6540b
    /* renamed from: e */
    public final JSONObject mo11543e() {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            return gVar.mo12903j();
        }
        return new JSONObject();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: g */
    public final String mo11547g() {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            return gVar.mo12904k();
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: o */
    public final View mo12931o() {
        AbstractC11876d dVar = this.f16686b;
        if (dVar instanceof View) {
            return (View) dVar;
        }
        return null;
    }

    static {
        Covode.recordClassIndex(7468);
    }

    /* renamed from: v */
    private void m14315v() {
        if (!ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
            return;
        }
        if (this.f16709z == EnumC11728i.THIRD_PARTY || this.f16709z == EnumC11728i.SCREEN_RECORD) {
            this.f16685a.mo12898e(!this.f16679I);
        }
    }

    /* renamed from: y */
    private void m14318y() {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            if (!this.f16675E) {
                gVar.mo12878a(0);
            } else if (this.f16676F) {
                gVar.mo12878a(3);
            } else {
                gVar.mo12878a(2);
            }
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: c */
    public final void mo11537c() {
        C6741n nVar = this.f16690f;
        nVar.f16729a = true;
        nVar.f16731c = C3966y.m9662b();
        nVar.f16732d = C3966y.m9664c();
        C6552h.m14010a().mo12689a(new CallableC6747q(nVar));
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g.AbstractC6726b
    /* renamed from: h */
    public final void mo12906h() {
        C7572d.m15561a("LivePlayController", "player callback onStartPulling()");
        AbstractC11643g.AbstractC11646c cVar = this.f16706w;
        if (cVar instanceof AbstractC11643g.AbstractC11649e) {
            try {
                ((AbstractC11643g.AbstractC11649e) cVar).mo13641a();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g.AbstractC6726b
    /* renamed from: i */
    public final void mo12907i() {
        C7572d.m15562b("LivePlayController", "player callback onFirstFrame()");
        AbstractC11656k kVar = this.f16694j;
        if (kVar != null) {
            kVar.mo18433e();
        }
        AbstractC11643g.AbstractC11646c cVar = this.f16706w;
        if (cVar instanceof AbstractC11643g.AbstractC11649e) {
            try {
                ((AbstractC11643g.AbstractC11649e) cVar).mo13642b();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: q */
    public final int mo12933q() {
        if (C13627m.m24498a(this.f16699p) && C13627m.m24498a(this.f16700q)) {
            return 0;
        }
        if (!C13627m.m24498a(this.f16699p)) {
            return 1;
        }
        return 2;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: f */
    public final boolean mo11546f() {
        if (this.f16697n == 7) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: j */
    public final void mo12926j() {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12881a((AbstractC6724g.AbstractC6725a) null, (AbstractC6724g.AbstractC6726b) null);
            this.f16685a.mo12897e();
            this.f16685a = null;
        }
        m14311r();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: l */
    public final boolean mo12928l() {
        boolean z;
        AbstractC6724g gVar = this.f16685a;
        if (gVar == null || !gVar.mo12900g()) {
            z = false;
        } else {
            z = true;
        }
        C7572d.m15561a("LivePlayController", "playing -> controller" + hashCode() + " status: " + z);
        return z;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: p */
    public final void mo12932p() {
        MethodCollector.m26663i(12078);
        TextureView textureView = this.f16689e;
        if (textureView == null) {
            MethodCollector.m26664o(12078);
            return;
        }
        ViewParent parent = textureView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f16689e);
        }
        C7572d.m15561a("LivePlayController", "remove one px texture view");
        this.f16689e.setSurfaceTextureListener(null);
        this.f16689e = null;
        this.f16698o = null;
        MethodCollector.m26664o(12078);
    }

    /* renamed from: C */
    private void m14304C() {
        if (this.f16709z == EnumC11728i.SCREEN_RECORD || this.f16709z == EnumC11728i.THIRD_PARTY || this.f16709z == EnumC11728i.OFFICIAL_ACTIVITY) {
            if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
                this.f16685a.mo12890b("musically_game_live");
            } else {
                this.f16685a.mo12890b("tiktok_game_live");
            }
        } else if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
            this.f16685a.mo12890b("musically_live");
        } else {
            this.f16685a.mo12890b("tiktok_live");
        }
    }

    /* renamed from: r */
    private void m14311r() {
        this.f16706w = null;
        this.f16704u = false;
        this.f16699p = "";
        this.f16700q = "";
        this.f16703t = f16670l;
        AbstractC11876d dVar = this.f16686b;
        if (dVar instanceof TextureRenderView) {
            ((TextureRenderView) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof TextureViewWrapper) {
            ((TextureViewWrapper) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof SurfaceRenderView) {
            ((SurfaceRenderView) dVar).getHolder().removeCallback(this.f16681K);
        }
        this.f16686b = null;
        if (this.f16688d != null) {
            this.f16688d = null;
        }
        Surface surface = this.f16687c;
        if (surface != null) {
            surface.release();
            this.f16687c = null;
        }
        this.f16707x = 0;
        this.f16708y = 0;
        this.f16695k.clear();
        m14310j(false);
        m14309i(false);
        mo12923g(false);
        this.f16692h = true;
    }

    /* renamed from: s */
    private void m14312s() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12899f();
            this.f16685a.mo12881a((AbstractC6724g.AbstractC6725a) null, (AbstractC6724g.AbstractC6726b) null);
            m14309i(false);
            m14310j(false);
        }
        this.f16685a = this.f16673C.mo12876a(this.f16671A, new C6736j(this));
        C7572d.m15561a("LivePlayController", "create TTPlayer2 -> controller: " + hashCode());
        this.f16696m = this.f16685a.mo12901h();
        this.f16685a.mo12881a(this, this);
        this.f16685a.mo12894c(this.f16677G);
        m14304C();
        long currentTimeMillis2 = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("player_create_start", String.valueOf(currentTimeMillis));
        hashMap.put("player_create_end", String.valueOf(currentTimeMillis2));
        this.f16695k.putAll(hashMap);
    }

    /* renamed from: t */
    private void m14313t() {
        AbstractC6724g gVar;
        if (m14319z() && (gVar = this.f16685a) != null) {
            AbstractC11876d dVar = this.f16686b;
            if (dVar instanceof SurfaceRenderView) {
                gVar.mo12880a(this.f16688d);
            } else if ((dVar instanceof TextureRenderView) || (dVar instanceof TextureViewWrapper)) {
                gVar.mo12879a(this.f16687c);
            }
            if (m14302A() && this.f16704u && !this.f16685a.mo12900g()) {
                C7572d.m15561a("LivePlayController", " Start Player! -> has surface and player, but not playing ");
                this.f16685a.mo12892c();
            }
        }
        if (this.f16697n == 7 && this.f16704u) {
            C7572d.m15561a("LivePlayController", "first frame -> send first frame message");
            if (LiveFirstFrameCallbackInsertMqHeadSetting.INSTANCE.getValue()) {
                AbstractC11643g.AbstractC11646c cVar = this.f16706w;
                if (cVar != null) {
                    cVar.mo12871a(AbstractC11643g.EnumC11645b.DISPLAYED_PLAY, null);
                    return;
                }
                return;
            }
            this.f16705v.obtainMessage(AbstractC11643g.EnumC11645b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
        }
    }

    /* renamed from: x */
    private void m14317x() {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12879a((Surface) null);
            this.f16685a.mo12880a((SurfaceHolder) null);
            this.f16685a.mo12887a(true);
        }
        AbstractC11876d dVar = this.f16686b;
        if (dVar instanceof TextureRenderView) {
            ((TextureRenderView) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof TextureViewWrapper) {
            ((TextureViewWrapper) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof SurfaceRenderView) {
            ((SurfaceRenderView) dVar).getHolder().removeCallback(this.f16681K);
        }
        this.f16686b = null;
        Surface surface = this.f16687c;
        if (surface != null) {
            surface.release();
            this.f16687c = null;
        }
        if (this.f16688d != null) {
            this.f16688d = null;
        }
        mo12923g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ai.i$4 */
    public static /* synthetic */ class C67344 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16713a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16714b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        static {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p442ai.C6730i.C67344.<clinit>():void");
        }
    }

    /* renamed from: u */
    private void m14314u() {
        AbstractC6724g.EnumC6728d dVar;
        if (this.f16685a != null) {
            if (this.f16696m) {
                m14312s();
            }
            if (this.f16685a.mo12900g() && MtPlayerInvokeStopBeforePlaySetting.INSTANCE.getValue()) {
                C7572d.m15561a("LivePlayController", "start player -> controller: " + hashCode() + " is playing. invoke stop");
                this.f16685a.mo12895d();
            }
            m14304C();
            this.f16707x = 0;
            m14309i(false);
            m14310j(false);
            C7572d.m15561a("LivePlayController", "start player -> controller: " + hashCode() + " setDataSource()");
            if (!C13627m.m24498a(this.f16700q)) {
                m14316w();
            } else {
                int i = C67344.f16713a[this.f16709z.ordinal()];
                if (i == 1) {
                    dVar = AbstractC6724g.EnumC6728d.AUDIO;
                } else if (i == 2) {
                    dVar = AbstractC6724g.EnumC6728d.OBS;
                } else if (i != 3) {
                    dVar = AbstractC6724g.EnumC6728d.VIDEO;
                } else {
                    dVar = AbstractC6724g.EnumC6728d.SCREENSHOT;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_params", this.f16702s);
                this.f16685a.mo12886a(this.f16699p, hashMap, dVar);
                this.f16685a.mo12888a(this.f16703t.f27783a, this.f16703t.f27784b, this.f16703t.f27785c);
            }
            this.f16682L = SystemClock.currentThreadTimeMillis();
            this.f16685a.mo12891b(this.f16678H);
            this.f16685a.mo12889b();
            m14315v();
        }
    }

    /* renamed from: w */
    private void m14316w() {
        this.f16679I = false;
        if (ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable() && (this.f16709z == EnumC11728i.THIRD_PARTY || this.f16709z == EnumC11728i.SCREEN_RECORD)) {
            boolean b = C13624l.m24486b(this.f16671A);
            C3854a.m9453a(4, "LivePlayController", "setDataSource(). third party or screen live strategy. isWifiEnv=".concat(String.valueOf(b)));
            if (b) {
                Map<String, String> a = AbstractC6804a.f17020cP.mo13066a();
                if (a != null) {
                    String str = a.get("sdk_key");
                    if (m14306a(str, this.f16700q)) {
                        this.f16679I = true;
                        this.f16701r = str;
                    }
                }
            } else {
                C6806c.m14603a(AbstractC6804a.f17020cP, (Object) null);
                if (!"sd".equals(this.f16701r) && !"ld".equals(this.f16701r)) {
                    this.f16701r = "sd";
                }
            }
        }
        C3854a.m9453a(4, "LivePlayController", "setDataSource(). mDefaultResolution=" + this.f16701r + "; mStreamType=" + this.f16709z);
        this.f16685a.mo12885a(this.f16700q, this.f16701r);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: a */
    public final void mo12908a(AbstractC11656k kVar) {
        this.f16694j = kVar;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: c */
    public final void mo11539c(boolean z) {
        this.f16678H = z;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: h */
    public final void mo12925h(boolean z) {
        this.f16692h = z;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11522a(Context context) {
        mo11541d(AbstractC11643g.C11644a.m20504a(context));
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: b */
    public final void mo11534b(Context context) {
        mo11544e(AbstractC11643g.C11644a.m20504a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: d */
    public final void mo12917d(Context context) {
        mo11525a(AbstractC11643g.C11644a.m20504a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: e */
    public final void mo12918e(Context context) {
        mo11535b(AbstractC11643g.C11644a.m20504a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: f */
    public final void mo12919f(Context context) {
        mo11538c(AbstractC11643g.C11644a.m20504a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: g */
    public final void mo12922g(String str) {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12893c(str);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11523a(AbstractC4356c cVar) {
        this.f16691g = new SoftReference<>(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: f */
    public final void mo12921f(boolean z) {
        this.f16677G = z;
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12894c(z);
        }
    }

    /* renamed from: b */
    private void m14307b(AbstractC11876d dVar) {
        String str;
        if (dVar instanceof View) {
            str = AbstractC11643g.C11644a.m20504a(((View) dVar).getContext());
        } else {
            str = null;
        }
        this.f16674D = str;
        mo11524a(dVar);
    }

    /* renamed from: j */
    private void m14310j(boolean z) {
        if (z) {
            this.f16697n |= 4;
        } else {
            this.f16697n &= -5;
        }
        m14313t();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: d */
    public final void mo11542d(boolean z) {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12896d(z);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: e */
    public final void mo11544e(String str) {
        if (TextUtils.equals(str, this.f16674D)) {
            AbstractC11643g.AbstractC11646c cVar = this.f16706w;
            if (cVar != null) {
                cVar.mo12871a(AbstractC11643g.EnumC11645b.STOP_WHEN_JOIN_INTERACT, null);
            }
            mo11535b(str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: f */
    public final void mo12920f(String str) {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12883a(str);
            AbstractC11643g.AbstractC11646c cVar = this.f16706w;
            if (cVar != null) {
                cVar.mo12871a(AbstractC11643g.EnumC11645b.START_SWITCH_RESOLUTION, null);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ai.i$a */
    public static final class C6735a implements C4360b.AbstractC4362b<AbstractC5777j> {
        static {
            Covode.recordClassIndex(7473);
        }

        @Override // com.bytedance.android.live.p250i.p252b.C4360b.AbstractC4362b
        /* renamed from: a */
        public final C4360b.AbstractC4362b.C4363a<AbstractC5777j> mo10117a(C4360b.AbstractC4362b.C4363a<AbstractC5777j> aVar) {
            aVar.f11884a = (R) new C6730i(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), (IHostPlugin) C6193a.m13435a(IHostPlugin.class), new C6740m());
            aVar.f11885b = true;
            return aVar;
        }
    }

    /* renamed from: i */
    private void m14309i(boolean z) {
        if (z) {
            this.f16697n |= 1;
            if (this.f16709z == EnumC11728i.AUDIO) {
                int i = this.f16697n | 2;
                this.f16697n = i;
                this.f16697n = i | 4;
            }
        } else {
            this.f16697n &= -2;
        }
        m14313t();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: b */
    public final void mo11536b(boolean z) {
        this.f16675E = z;
        m14318y();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: c */
    public final void mo11538c(String str) {
        if (TextUtils.equals(str, this.f16674D)) {
            AbstractC11643g.AbstractC11646c cVar = this.f16706w;
            if (cVar != null) {
                cVar.mo12871a(AbstractC11643g.EnumC11645b.STOP_WHEN_PLAYING_OTHER, null);
            }
            mo11535b(str);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: e */
    public final void mo11545e(boolean z) {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12898e(z);
        }
    }

    /* renamed from: g */
    public final void mo12923g(boolean z) {
        if (z) {
            this.f16697n |= 2;
        } else {
            this.f16697n &= -3;
        }
        C7572d.m15561a("LivePlayController", "isReady = " + z + ", mDisplayState = " + this.f16697n);
        m14313t();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        AbstractC11643g.AbstractC11646c cVar;
        if (message.what == 9) {
            C7572d.m15561a("LivePlayController", "restart play -> receive try again msg");
            try {
                m14314u();
            } catch (Exception e) {
                C7572d.m15561a("LivePlayController", e.getMessage());
            }
        } else {
            AbstractC11643g.EnumC11645b valueOf = AbstractC11643g.EnumC11645b.valueOf(message.what);
            if (valueOf != AbstractC11643g.EnumC11645b.UNKNOWN && (cVar = this.f16706w) != null) {
                cVar.mo12871a(valueOf, message.obj);
            }
        }
    }

    /* renamed from: h */
    private boolean m14308h(String str) {
        try {
            Uri parse = Uri.parse(this.f16699p);
            Uri parse2 = Uri.parse(str);
            if (!C13627m.m24499a(parse.getHost() + parse.getPath(), parse2.getHost() + parse2.getPath())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: a */
    public final void mo12909a(C11690a aVar) {
        this.f16684N = aVar;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: b */
    public final void mo11535b(String str) {
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11555d(str);
        C7572d.m15561a("LivePlayController", "destroy player -> tag " + str + " ,mPlayContextTag: " + this.f16674D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.f16674D)) {
            AbstractC6724g gVar = this.f16685a;
            if (gVar != null) {
                gVar.mo12881a((AbstractC6724g.AbstractC6725a) null, (AbstractC6724g.AbstractC6726b) null);
                this.f16685a.mo12897e();
                this.f16685a = null;
            }
            m14311r();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: c */
    public final boolean mo12916c(Context context) {
        String a = AbstractC11643g.C11644a.m20504a(context);
        if (!TextUtils.equals(a, this.f16674D)) {
            return false;
        }
        new C7428a(this).mo13647b(null, a);
        mo11525a(a);
        mo11535b(a);
        return true;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: d */
    public final void mo11541d(String str) {
        C7572d.m15561a("LivePlayController", "stopWhenSlideSwitch -> playerTag: " + str + " ,mPlayContextTag" + this.f16674D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.f16674D)) {
            this.f16704u = false;
            AbstractC6724g gVar = this.f16685a;
            if (gVar != null) {
                gVar.mo12895d();
            }
            this.f16706w = null;
            m14317x();
            this.f16692h = true;
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11525a(String str) {
        C7572d.m15562b("LivePlayController", "stop -> playerTag: " + str + " ,mPlayContextTag" + this.f16674D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.f16674D)) {
            this.f16704u = false;
            AbstractC6724g gVar = this.f16685a;
            if (gVar != null) {
                gVar.mo12895d();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: g */
    public final boolean mo12924g(Context context) {
        MethodCollector.m26663i(12077);
        if (this.f16684N == null) {
            MethodCollector.m26664o(12077);
            return false;
        } else if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            MethodCollector.m26664o(12077);
            return false;
        } else if (this.f16689e != null) {
            MethodCollector.m26664o(12077);
            return false;
        } else {
            ActivityC0945e a = C11279p.m20001a(context);
            if (a == null) {
                MethodCollector.m26664o(12077);
                return false;
            } else if (a.isFinishing() || a.getWindow() == null) {
                MethodCollector.m26664o(12077);
                return false;
            } else {
                int i = Build.VERSION.SDK_INT;
                if (a.isDestroyed()) {
                    MethodCollector.m26664o(12077);
                    return false;
                }
                this.f16689e = new TextureView(a);
                TextureView$SurfaceTextureListenerC67333 r1 = new TextureView.SurfaceTextureListener() {
                    /* class com.bytedance.android.livesdk.p442ai.C6730i.TextureView$SurfaceTextureListenerC67333 */

                    static {
                        Covode.recordClassIndex(7471);
                    }

                    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                        return false;
                    }

                    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    }

                    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                        if (C6730i.this.f16689e != null && C6730i.this.f16687c == null) {
                            C7572d.m15561a("PreCreateSurface", "one px surface available, create one px surface");
                            C6730i.this.f16687c = new Surface(surfaceTexture);
                            C6730i.this.mo12923g(true);
                        }
                    }
                };
                this.f16698o = r1;
                this.f16689e.setSurfaceTextureListener(r1);
                ((ViewGroup) a.getWindow().getDecorView().findViewById(16908290)).addView(this.f16689e, new ViewGroup.LayoutParams(1, 1));
                C7572d.m15561a("PreCreateSurface", "add one px texture view into main activity");
                MethodCollector.m26664o(12077);
                return true;
            }
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5777j
    /* renamed from: a */
    public final void mo11524a(AbstractC11876d dVar) {
        if (dVar == null) {
            C7572d.m15561a("LivePlayController", "bindSurface -> textureView == null, stop player and release surface");
            AbstractC6724g gVar = this.f16685a;
            if (gVar != null) {
                gVar.mo12895d();
            }
            AbstractC11876d dVar2 = this.f16686b;
            if (dVar2 instanceof SurfaceRenderView) {
                ((SurfaceRenderView) dVar2).getHolder().removeCallback(this.f16681K);
            } else if (dVar2 instanceof TextureRenderView) {
                ((TextureRenderView) dVar2).setSurfaceTextureListener(null);
            } else if (dVar2 instanceof TextureViewWrapper) {
                ((TextureViewWrapper) dVar2).setSurfaceTextureListener(null);
            }
            this.f16686b = null;
            Surface surface = this.f16687c;
            if (surface != null) {
                surface.release();
                this.f16687c = null;
            }
            this.f16688d = null;
            if (m14319z()) {
                mo12923g(false);
                return;
            }
            return;
        }
        AbstractC11876d dVar3 = this.f16686b;
        if (dVar3 != dVar) {
            if (dVar3 instanceof SurfaceRenderView) {
                ((SurfaceRenderView) dVar3).getHolder().removeCallback(this.f16681K);
            } else if (dVar3 instanceof TextureRenderView) {
                ((TextureRenderView) dVar3).setSurfaceTextureListener(null);
            } else if (dVar3 instanceof TextureViewWrapper) {
                ((TextureViewWrapper) dVar3).setSurfaceTextureListener(null);
            }
            this.f16686b = null;
            Surface surface2 = this.f16687c;
            if (surface2 != null) {
                surface2.release();
                this.f16687c = null;
            }
            this.f16686b = dVar;
            if (dVar instanceof SurfaceRenderView) {
                ((SurfaceRenderView) dVar).getHolder().addCallback(this.f16681K);
            } else if (dVar instanceof TextureRenderView) {
                ((TextureRenderView) dVar).setSurfaceTextureListener(this.f16680J);
            } else if (dVar instanceof TextureViewWrapper) {
                ((TextureViewWrapper) dVar).setSurfaceTextureListener(this.f16680J);
            }
            if (this.f16689e != null && m14319z()) {
                C7572d.m15561a("PreCreateSurface", "set one px surface into real textureView to replace surface");
                AbstractC11876d dVar4 = this.f16686b;
                if (!(dVar4 instanceof TextureRenderView) || ((TextureRenderView) dVar4).getSurfaceTexture() == this.f16689e.getSurfaceTexture()) {
                    AbstractC11876d dVar5 = this.f16686b;
                    if ((dVar5 instanceof TextureViewWrapper) && ((TextureViewWrapper) dVar5).getSurfaceTexture() != this.f16689e.getSurfaceTexture()) {
                        ((TextureViewWrapper) this.f16686b).setSurfaceTexture(this.f16689e.getSurfaceTexture());
                    }
                } else {
                    ((TextureRenderView) this.f16686b).setSurfaceTexture(this.f16689e.getSurfaceTexture());
                }
            }
            AbstractC11876d dVar6 = this.f16686b;
            if (dVar6 instanceof TextureRenderView) {
                if (((TextureRenderView) dVar6).getSurfaceTexture() != null) {
                    this.f16687c = new Surface(((TextureRenderView) this.f16686b).getSurfaceTexture());
                    mo12923g(true);
                    return;
                }
                mo12923g(false);
            } else if (dVar6 instanceof TextureViewWrapper) {
                if (((TextureViewWrapper) dVar6).getSurfaceTexture() != null) {
                    this.f16687c = new Surface(((TextureViewWrapper) this.f16686b).getSurfaceTexture());
                    mo12923g(true);
                    return;
                }
                mo12923g(false);
            } else if (!(dVar6 instanceof SurfaceRenderView)) {
                mo12923g(false);
            } else if (((SurfaceRenderView) dVar6).getHolder() != null) {
                this.f16688d = ((SurfaceRenderView) this.f16686b).getHolder();
                mo12923g(true);
            } else {
                mo12923g(false);
            }
        }
    }

    /* renamed from: a */
    private void m14305a(AbstractC11643g.EnumC11645b bVar, Object obj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            AbstractC11643g.AbstractC11646c cVar = this.f16706w;
            if (cVar != null) {
                cVar.mo12871a(bVar, obj);
                return;
            }
            return;
        }
        this.f16705v.obtainMessage(bVar.ordinal(), obj).sendToTarget();
    }

    /* renamed from: a */
    private static boolean m14306a(String str, String str2) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new JSONObject(str2).getJSONObject("data").getJSONObject(str);
            z = true;
            return true;
        } catch (JSONException e) {
            C3854a.m9453a(6, "LivePlayController", "coldStart(). catch exception. e=".concat(String.valueOf(e)));
            return z;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: a */
    public final void mo12910a(String str, AbstractC11663q qVar) {
        AbstractC6724g gVar = this.f16685a;
        if (gVar != null) {
            gVar.mo12884a(str, qVar);
            AbstractC11643g.AbstractC11646c cVar = this.f16706w;
            if (cVar != null) {
                cVar.mo12871a(AbstractC11643g.EnumC11645b.START_SWITCH_RESOLUTION, null);
            }
        }
    }

    public C6730i(Context context, IHostPlugin iHostPlugin, AbstractC6723f fVar) {
        this.f16671A = context;
        this.f16672B = iHostPlugin;
        this.f16673C = fVar;
        this.f16705v = new HandlerC11626a(Looper.getMainLooper(), this);
        C6741n b = C4365d.m10462g().mo10111b();
        this.f16690f = b;
        String a = C4365d.m10462g().mo10114e().mo10104a(context);
        if (a != null) {
            b.f16734f = a;
        }
        m14311r();
        DataChannelGlobal.f42558d.mo28321a(C9084cw.class, this);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6724g.AbstractC6725a
    /* renamed from: a */
    public final void mo12905a(AbstractC6724g.EnumC6727c cVar, int i, String str) {
        Object obj;
        switch (C67344.f16714b[cVar.ordinal()]) {
            case 1:
                JSONObject e = mo11543e();
                if (e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("video_codec", e.optString("Codec_Type:"));
                    hashMap.put("video_codec_name", e.optString("Codec_Name:"));
                    if (e.optBoolean("HardDecode:")) {
                        obj = "1";
                    } else {
                        obj = "0";
                    }
                    hashMap.put("hardware", obj);
                    LivePerformanceManager.getInstance().onModuleStart("stream", hashMap);
                }
                m14310j(true);
                break;
            case 2:
            case 3:
                m14309i(false);
                m14310j(false);
                if (cVar != AbstractC6724g.EnumC6727c.MEDIA_ERROR) {
                    m14305a(AbstractC11643g.EnumC11645b.COMPLETE_PLAY, str);
                    break;
                } else {
                    m14305a(AbstractC11643g.EnumC11645b.MEDIA_ERROR, str);
                    break;
                }
            case 4:
                AbstractC6724g gVar = this.f16685a;
                if (gVar != null) {
                    Point i2 = gVar.mo12902i();
                    this.f16707x = (i2.y << 16) | i2.x;
                }
                this.f16708y = 0;
                m14309i(true);
                m14305a(AbstractC11643g.EnumC11645b.PLAYER_PREPARED, str);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                this.f16707x = i;
                m14318y();
                m14305a(AbstractC11643g.EnumC11645b.VIDEO_SIZE_CHANGED, String.valueOf(i));
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                m14305a(AbstractC11643g.EnumC11645b.INTERACT_SEI, str);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                m14305a(AbstractC11643g.EnumC11645b.BUFFERING_START, str);
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                m14305a(AbstractC11643g.EnumC11645b.BUFFERING_END, str);
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                m14305a(AbstractC11643g.EnumC11645b.RESOLUTION_DEGRADE, str);
                break;
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event_page", "live_detail");
            hashMap2.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - this.f16682L));
            hashMap2.put("url", this.f16699p);
            hashMap2.put("pull_stream_data", this.f16700q);
            hashMap2.put("default_resolution", this.f16701r);
            int i3 = C67344.f16714b[cVar.ordinal()];
            if (i3 == 1) {
                hashMap2.put("is_success", "1");
                C6501b.C6502a.m13948a("live_first_play").mo12652a((Map<String, String>) hashMap2).mo12639a().mo12655b();
            } else if (i3 == 2) {
                hashMap2.put("is_success", "0");
                C6501b.C6502a.m13948a("live_first_play").mo12652a((Map<String, String>) hashMap2).mo12639a().mo12655b();
            } else if (i3 == 7) {
                C6501b.C6502a.m13948a("live_block_start").mo12652a((Map<String, String>) hashMap2).mo12639a().mo12655b();
            } else if (i3 == 8) {
                C6501b.C6502a.m13948a("live_block_end").mo12652a((Map<String, String>) hashMap2).mo12639a().mo12655b();
            }
        } catch (Throwable th) {
            C3854a.m9458a("LivePlayController", th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g
    /* renamed from: b */
    public final void mo12915b(String str, String str2, AbstractC11876d dVar, int i, AbstractC11643g.C11647d dVar2, AbstractC11643g.AbstractC11646c cVar, String str3) {
        mo11527a(str, str2, dVar, i, dVar2, cVar, str3);
    }
}
