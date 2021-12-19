package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63035e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63053n;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63054o;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63055a;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.player.sdk.util.C63095f;
import com.p2082ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84200d;
import com.p2082ss.android.ugc.playerkit.model.C84202f;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84204h;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.ttffmpeg.FFmpegLibLoaderWrapper;
import com.p2082ss.ttm.player.C86275p;
import com.p2082ss.ttm.player.C86277r;
import com.p2082ss.ttm.player.SubInfo;
import com.p2082ss.ttvideoengine.AbstractC86355au;
import com.p2082ss.ttvideoengine.AbstractC86362aw;
import com.p2082ss.ttvideoengine.AbstractC86364ay;
import com.p2082ss.ttvideoengine.AbstractC86369ba;
import com.p2082ss.ttvideoengine.AbstractC86376be;
import com.p2082ss.ttvideoengine.AbstractC86651x;
import com.p2082ss.ttvideoengine.AbstractC86652y;
import com.p2082ss.ttvideoengine.C86304ac;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.C86365az;
import com.p2082ss.ttvideoengine.C86370bb;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.C86593o;
import com.p2082ss.ttvideoengine.C86653z;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86463g;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86480q;
import com.p2082ss.ttvideoengine.p4415h.EnumC86487t;
import com.p2082ss.ttvideoengine.p4416i.AbstractC86508b;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4421n.p4424c.AbstractC86592c;
import com.p2082ss.ttvideoengine.p4428q.C86617e;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.m */
public final class C63012m extends AbstractC62962a implements AbstractC63054o, AbstractC86651x {

    /* renamed from: D */
    public static WeakReference<AbstractC84177b> f143105D;

    /* renamed from: I */
    private static boolean f143106I = true;

    /* renamed from: av */
    private static AbstractC86480q f143107av = new AbstractC86480q() {
        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C6301410 */

        static {
            Covode.recordClassIndex(73851);
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86480q
        /* renamed from: a */
        public final void mo101145a() {
            AbstractC84177b bVar;
            if (C63012m.f143105D != null && (bVar = C63012m.f143105D.get()) != null) {
                bVar.onEvent(EnumC86487t.instance.popAllEvents());
            } else if (C62960a.f142907a) {
                C62960a.m113385a("video_playq", "eventListener null");
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86480q
        public final void onEventV2(String str) {
            JSONArray popAllEventsV2;
            AbstractC84177b bVar;
            if (!TextUtils.isEmpty(str) && C84199c.f187979a.isEnablePlayerLogV2() && (popAllEventsV2 = EnumC86487t.instance.popAllEventsV2()) != null && popAllEventsV2.length() > 0) {
                for (int i = 0; i < popAllEventsV2.length(); i++) {
                    try {
                        JSONObject jSONObject = popAllEventsV2.getJSONObject(i);
                        if (jSONObject != null) {
                            jSONObject.put("params_for_special", "videoplayer_monitor");
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                if (!(C63012m.f143105D == null || (bVar = C63012m.f143105D.get()) == null)) {
                    bVar.mo124440a(popAllEventsV2, str);
                }
            }
        }
    };

    /* renamed from: k */
    public static boolean f143108k = true;

    /* renamed from: A */
    public int f143109A;

    /* renamed from: B */
    public AbstractC63042j.AbstractC63045c f143110B;

    /* renamed from: C */
    public AbstractC63035e f143111C;

    /* renamed from: E */
    public AbstractC63050k f143112E;

    /* renamed from: F */
    public AbstractC63040h f143113F;

    /* renamed from: G */
    public AbstractC63052m f143114G;

    /* renamed from: H */
    public AbstractC63031a f143115H;

    /* renamed from: J */
    private Context f143116J;

    /* renamed from: K */
    private long f143117K;

    /* renamed from: L */
    private AtomicReference<C86313ai> f143118L;

    /* renamed from: M */
    private boolean f143119M;

    /* renamed from: N */
    private boolean f143120N;

    /* renamed from: O */
    private boolean f143121O;

    /* renamed from: P */
    private SparseIntArray f143122P;

    /* renamed from: Q */
    private AbstractC86463g f143123Q;

    /* renamed from: R */
    private boolean f143124R;

    /* renamed from: S */
    private AbstractC63042j.AbstractC63044b f143125S;

    /* renamed from: T */
    private boolean f143126T;

    /* renamed from: U */
    private C62965d f143127U;

    /* renamed from: V */
    private AbstractC86508b f143128V;

    /* renamed from: W */
    private long f143129W;

    /* renamed from: X */
    private long f143130X;

    /* renamed from: Y */
    private long f143131Y;

    /* renamed from: Z */
    private long f143132Z;

    /* renamed from: aa */
    private float f143133aa;

    /* renamed from: ab */
    private C86275p f143134ab;

    /* renamed from: ac */
    private long f143135ac;

    /* renamed from: ad */
    private long f143136ad;

    /* renamed from: ae */
    private long f143137ae;

    /* renamed from: af */
    private C62964c f143138af;

    /* renamed from: ag */
    private boolean f143139ag;

    /* renamed from: ah */
    private int f143140ah;

    /* renamed from: ai */
    private int f143141ai;

    /* renamed from: aj */
    private int f143142aj;

    /* renamed from: ak */
    private boolean f143143ak;

    /* renamed from: al */
    private C86593o f143144al;

    /* renamed from: am */
    private C86370bb f143145am;

    /* renamed from: an */
    private AbstractC86369ba f143146an;

    /* renamed from: ao */
    private AudioManager f143147ao;

    /* renamed from: ap */
    private AudioManager.OnAudioFocusChangeListener f143148ap;

    /* renamed from: aq */
    private boolean f143149aq;

    /* renamed from: ar */
    private Bundle f143150ar;

    /* renamed from: as */
    private int f143151as;

    /* renamed from: at */
    private Bundle f143152at;

    /* renamed from: au */
    private AbstractC84177b f143153au;

    /* renamed from: aw */
    private C63025a f143154aw;

    /* renamed from: ax */
    private C63026b f143155ax;

    /* renamed from: b */
    public C86313ai f143156b;

    /* renamed from: c */
    public SparseArray f143157c;

    /* renamed from: d */
    public boolean f143158d;

    /* renamed from: e */
    public volatile String f143159e;

    /* renamed from: f */
    public AbstractC63053n f143160f;

    /* renamed from: g */
    public C84209m f143161g;

    /* renamed from: h */
    public volatile C86535p f143162h;

    /* renamed from: i */
    public boolean f143163i;

    /* renamed from: j */
    public long f143164j;

    /* renamed from: l */
    public long f143165l;

    /* renamed from: m */
    public int f143166m;

    /* renamed from: n */
    public String f143167n;

    /* renamed from: o */
    public String f143168o;

    /* renamed from: p */
    public Map<String, Object> f143169p;

    /* renamed from: q */
    public boolean f143170q;

    /* renamed from: r */
    public long f143171r;

    /* renamed from: s */
    boolean f143172s;

    /* renamed from: t */
    public long f143173t;

    /* renamed from: u */
    public List<C63055a> f143174u;

    /* renamed from: v */
    public boolean f143175v;

    /* renamed from: w */
    public boolean f143176w;

    /* renamed from: x */
    public long f143177x;

    /* renamed from: y */
    public long f143178y;

    /* renamed from: z */
    public long f143179z;

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: k */
    public final boolean mo101127k() {
        return this.f143119M;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: s */
    public final String mo101133s() {
        return this.f143159e;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101106a(Surface surface) {
        try {
            AbstractC63042j.AbstractC63044b bVar = this.f143125S;
            if ((bVar == null || !bVar.mo101181a()) && this.f143156b != null) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "setSurface surface = " + surface + ", this = " + this);
                }
                C84209m mVar = this.f143161g;
                if (mVar != null && mVar.f188046G && (surface instanceof SurfaceWrapper)) {
                    ((SurfaceWrapper) surface).f143377a = new WeakReference<>(this);
                }
                if (this.f143163i) {
                    this.f143136ad = SystemClock.elapsedRealtime() - this.f143164j;
                    AbstractC63050k kVar = this.f143112E;
                    if (kVar != null) {
                        kVar.mo101190d();
                    }
                }
                C63095f.f143401a.put(surface, new WeakReference<>(this));
                this.f143156b.mo137167a(surface);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101116a(List<Surface> list) {
        try {
            if (!(this.f143156b == null || list == null || list.size() <= 0)) {
                this.f143156b.mo137168a((Surface) null, 3);
                for (Surface surface : list) {
                    if (surface != null && surface.isValid()) {
                        if (C62960a.f142907a) {
                            C62960a.m113385a("TTPlayer", "setExtraSurfaces extraSurface = " + surface + ", this = " + this);
                        }
                        this.f143156b.mo137168a(surface, 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100952a(String str) {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            aiVar.mo137198b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101107a(SurfaceHolder surfaceHolder) {
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar != null) {
                C86641i.m150110a("TTVideoEngine", "setSurfaceHolder = " + surfaceHolder + ",this:" + aiVar);
                if (aiVar.f193015ch.mo137317a(false)) {
                    aiVar.f193015ch.mo137312a(55, 0, 0, surfaceHolder);
                } else {
                    aiVar.mo137169a(surfaceHolder);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100954a(boolean z, Bundle bundle) {
        this.f143149aq = z;
        this.f143150ar = bundle;
        m113595D();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100945a(int i, Bundle bundle) {
        this.f143151as = i;
        this.f143152at = bundle;
        if (C84191b.m144774a()) {
            this.f143156b.mo137230f(4, this.f143151as);
            Bundle bundle2 = this.f143152at;
            if (bundle2 != null && bundle2.containsKey("float_value")) {
                int i2 = this.f143151as;
                if (i2 == 0 || i2 == 2) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("action", 27);
                    bundle3.putInt("effect_type", 11);
                    bundle3.putFloat("float_value", this.f143152at.getFloat("float_value"));
                    this.f143156b.mo137166a(bundle3);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100951a(C84203g gVar) {
        String str;
        if (gVar == null) {
            m113596E();
            return;
        }
        int i = gVar.f188012a;
        if (i == 1 || m113608d(23) != 1) {
            StringBuilder append = new StringBuilder("setEffect ttplayer = ").append(this).append(" The lut filter is not initialized!!! Coming soon");
            if (i == 1) {
                str = "Active initialization";
            } else {
                str = "Passive initialization";
            }
            append.append(str);
            if (gVar.f188015d == null) {
                m113596E();
            } else if (this.f143141ai == 1 || m113608d(23) == 1) {
                m113606b(gVar);
            } else if (!this.f143143ak || Build.VERSION.SDK_INT > 23) {
                this.f143156b.mo137230f(199, 1);
                m113606b(gVar);
            }
        } else {
            new StringBuilder("setEffect ttplayer = ").append(this).append(m113608d(19) != 1 ? "The lut filter is not being used!!!" : "Lut filter is in use!!!effectInfo = " + gVar.toString());
            Bundle bundle = new Bundle();
            if (i == 2) {
                bundle.putInt("action", 19);
                bundle.putInt("int_value", gVar.f188016e ? 1 : 0);
            } else if (i == 3) {
                List<Float> list = gVar.f188014c;
                if (list != null && !list.isEmpty()) {
                    int i2 = gVar.f188017f;
                    if (i2 < 0 || i2 >= list.size()) {
                        bundle.putFloat("float_value", list.get(0).floatValue());
                    } else {
                        bundle.putFloat("float_value", list.get(i2).floatValue());
                        bundle.putInt("index", i2);
                    }
                    bundle.putInt("action", 20);
                } else {
                    return;
                }
            } else if (i == 4) {
                List<Bitmap> list2 = gVar.f188015d;
                if (list2 == null) {
                    throw new NullPointerException("isEmpty");
                }
                bundle.putInt("action", 22);
                bundle.putParcelable("lut_bitmap", list2.get(0));
            }
            if (gVar.f188013b == 1) {
                bundle.putInt("effect_type", 2);
            }
            this.f143156b.mo137166a(bundle);
        }
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86651x
    /* renamed from: a */
    public final void mo30452a(boolean z) {
        AbstractC63042j.AbstractC63045c cVar = this.f143110B;
        if (cVar != null) {
            cVar.mo101056b(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100950a(final C63059e eVar, final AbstractC63032b bVar) {
        bVar.mo101044a(2, 1, eVar);
        this.f143156b.mo137175a(C63028o.m113707a(eVar));
        this.f143156b.mo137230f(583, 1);
        C86313ai aiVar = this.f143156b;
        C630227 r2 = new AbstractC86592c() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630227 */

            static {
                Covode.recordClassIndex(73859);
            }

            @Override // com.p2082ss.ttvideoengine.p4421n.p4424c.AbstractC86592c
            /* renamed from: a */
            public final void mo101152a(AbstractC86517e eVar, Map<String, String> map, int i, Object obj) {
                C63059e a;
                new StringBuilder("onAfterSelect iVideoModel ").append(eVar).append("map ").append(map).append("timing ").append(i);
                if (!(bVar == null || i != 1 || (a = C63028o.m113705a(map, eVar)) == null)) {
                    bVar.mo101045b(2, i, a);
                    bVar.mo101043a(2, i, a.f143244i);
                    map.put("video_bitrarte", String.valueOf(a.f143244i.f143252a));
                    List<C86534o> b = eVar.mo137745b();
                    if (b != null && b.size() > 0) {
                        for (C86534o oVar : b) {
                            if (oVar.mo137724a(3) == a.f143244i.f143252a) {
                                oVar.f194852w = a.f143244i.f143274w;
                                return;
                            }
                        }
                    }
                }
            }
        };
        C86641i.m150110a("TTVideoEngine", "[GearStrategy]setGearStrategyListener listener=" + r2 + " userData=" + eVar);
        aiVar.f192959bT.f195101a = r2;
        aiVar.f192959bT.f195102b = eVar;
        this.f143156b.mo137251k();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100953a(Map<String, Object> map) {
        m113603a(null, null, map, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101115a(String str, Map<String, Object> map) {
        m113603a(null, str, map, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v48, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v79, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v87, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v90, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v113, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v116, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v127, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v54, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v149, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v160, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v67, resolved type: android.os.Bundle */
    /* JADX DEBUG: Multi-variable search result rejected for r1v240, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v91, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r3v92, resolved type: com.ss.ttvideoengine.ai */
    /* JADX DEBUG: Multi-variable search result rejected for r1v250, resolved type: com.ss.ttvideoengine.ai */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0b6f, code lost:
        if (r14 == false) goto L_0x0b71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0bd9, code lost:
        if (r35 != null) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0be4, code lost:
        if (r35 != null) goto L_0x09df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x07f2  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07ff  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0bf6  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0bfa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0c1a  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0c28  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0c3c  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0c52  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0c57  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m113603a(final com.p2082ss.android.ugc.playerkit.model.C84200d r33, java.lang.String r34, java.util.Map<java.lang.String, java.lang.Object> r35, boolean r36) {
        /*
        // Method dump skipped, instructions count: 3200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.m113603a(com.ss.android.ugc.playerkit.model.d, java.lang.String, java.util.Map, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101109a(AbstractC63042j.AbstractC63045c cVar) {
        if (cVar == null) {
            cVar = new AbstractC63042j.C63043a();
        }
        this.f143110B = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101114a(String str, AbstractC63035e eVar) {
        try {
            this.f143111C = eVar;
            C86313ai aiVar = this.f143156b;
            if (this.f143123Q == null) {
                this.f143123Q = new AbstractC86463g() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C6301511 */

                    static {
                        Covode.recordClassIndex(73852);
                    }
                };
            }
            aiVar.f192882S = this.f143123Q;
            aiVar.f192889Z = str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101110a(AbstractC63050k kVar) {
        if (kVar != this.f143112E) {
            this.f143112E = kVar;
            C62960a.m113385a("TTPlayer", "setPrePrepareEventTimeListener listener  = ".concat(String.valueOf(kVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101108a(AbstractC63040h hVar) {
        if (hVar != this.f143113F) {
            this.f143113F = hVar;
            C62960a.m113385a("TTPlayer", "setNorPrepareEventTimeListener listener  = ".concat(String.valueOf(hVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101112a(AbstractC84177b bVar) {
        if (bVar != this.f143153au && bVar != null) {
            this.f143153au = bVar;
            f143105D = new WeakReference<>(this.f143153au);
            EnumC86487t.instance.setListener(f143107av);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100946a(int i, String str) {
        C62960a.m113385a("TTPlayer", "Enter setSubtitlesDefaultLanguage");
        if (this.f143156b != null) {
            try {
                C62960a.m113385a("TTPlayer", "setSubtitlesDefaultLanguage languageId:".concat(String.valueOf(i)));
                this.f143109A = i;
                this.f143156b.mo137230f(530, i);
                if (str != null) {
                    this.f143175v = true;
                    JSONObject jSONObject = new JSONObject(str);
                    C62960a.m113385a("TTPlayer", "Ryan setSubtitlesDefaultLanguage subtitleDesInfoModel:".concat(String.valueOf(str)));
                    C86313ai aiVar = this.f143156b;
                    C86653z zVar = new C86653z(jSONObject);
                    C86641i.m150113b("TTVideoEngine", "subtitle: set subtitle description info: " + zVar.toString());
                    aiVar.f192872I = zVar;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100949a(AbstractC63052m mVar) {
        C62960a.m113385a("TTPlayer", "Enter updateSubInfoListener");
        if (mVar != this.f143114G) {
            this.f143114G = mVar;
            C62960a.m113385a("TTPlayer", "updateSubInfoListener listener  = ".concat(String.valueOf(mVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100947a(AbstractC63031a aVar) {
        C62960a.m113385a("TTPlayer", "Enter updateAudioInfoListener");
        if (aVar != this.f143115H) {
            this.f143115H = aVar;
            C62960a.m113385a("TTPlayer", "updateAudioInfoListener listener  = ".concat(String.valueOf(aVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100948a(AbstractC63042j.EnumC63047e eVar) {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            aiVar.mo137230f(562, 1);
            if (eVar.ordinal() == AbstractC63042j.EnumC63047e.LOW.ordinal()) {
                this.f143156b.mo137230f(570, 286331153);
            } else if (eVar.ordinal() == AbstractC63042j.EnumC63047e.NORMAL.ordinal()) {
                this.f143156b.mo137230f(570, 572662306);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: b */
    public final boolean mo100957b() {
        return C86385d.C86400h.f193679a.mo137380c() && C86313ai.f192840bS != null && C86617e.C86621c.f195187a.mo137879b().isRunning();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: A */
    public final void mo100943A() {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            aiVar.mo137192b(0);
        }
    }

    /* renamed from: B */
    public final int mo101102B() {
        if (this.f143141ai == 1 || m113608d(23) == 1) {
            return 1;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: g */
    public final void mo101124g() {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            aiVar.mo137242h(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: h */
    public final float mo100961h() {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            return C86640h.m150088b(aiVar.f192916aa);
        }
        return -1.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: i */
    public final void mo101125i() {
        if (mo101126j()) {
            this.f143158d = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: j */
    public final boolean mo101126j() {
        if (Build.VERSION.SDK_INT >= 26 || !this.f143119M) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: m */
    public final boolean mo101129m() {
        C86313ai aiVar = this.f143156b;
        if (aiVar == null || aiVar.f193374v != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: n */
    public final boolean mo100962n() {
        C84209m mVar = this.f143161g;
        if (mVar == null || !mVar.f188047H) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: r */
    public final long mo101132r() {
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar != null) {
                return (long) aiVar.f193376x;
            }
            return 1073741823;
        } catch (Exception e) {
            e.printStackTrace();
            return 1073741823;
        }
    }

    static {
        Covode.recordClassIndex(73849);
    }

    /* renamed from: G */
    private static boolean m113598G() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("sony")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: q */
    public final long mo101131q() {
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar == null) {
                return 0;
            }
            if (this.f143142aj <= 0 || this.f143172s) {
                return (long) aiVar.mo137267s();
            }
            return (long) aiVar.mo137268t();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: t */
    public final String mo101134t() {
        C86313ai aiVar = this.f143118L.get();
        if (aiVar != null) {
            return aiVar.mo137262o(82);
        }
        return "";
    }

    public final String toString() {
        return "TTPlayer{mPlayer=" + this.f143156b + '}';
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: u */
    public final boolean mo101136u() {
        C86313ai aiVar = this.f143118L.get();
        if (aiVar == null || !aiVar.mo137264p()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: v */
    public final AbstractC63042j.C63049g mo101137v() {
        String str;
        AbstractC63042j.C63049g gVar = new AbstractC63042j.C63049g();
        C86313ai aiVar = this.f143118L.get();
        if (aiVar != null) {
            str = aiVar.mo137262o(80);
        } else {
            str = null;
        }
        gVar.f143222a = str;
        return gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: x */
    public final boolean mo101138x() {
        C86313ai aiVar = this.f143118L.get();
        if (aiVar == null || !aiVar.mo137203b()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private void m113594C() {
        if (C84191b.m144778e()) {
            if (this.f143147ao == null) {
                this.f143147ao = (AudioManager) m113601a(m113600a(this.f143116J), DataType.AUDIO);
                this.f143148ap = C63027n.f143197a;
            }
            this.f143147ao.requestAudioFocus(this.f143148ap, 3, 1);
        }
    }

    /* renamed from: E */
    private void m113596E() {
        if (m113608d(19) == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 19);
            bundle.putInt("int_value", 0);
            bundle.putInt("effect_type", 2);
            this.f143156b.mo137166a(bundle);
        } else if (this.f143141ai != 1) {
            if (Build.VERSION.SDK_INT >= 24 || !this.f143143ak) {
                this.f143156b.mo137230f(199, 0);
            }
        }
    }

    /* renamed from: H */
    private static void m113599H() {
        int t = C84191b.m144793t();
        if (t > 0) {
            try {
                C86277r.class.getDeclaredMethod("b", Integer.TYPE, Integer.TYPE).invoke(null, 25, Integer.valueOf(t));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: a */
    public final void mo100944a() {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null && this.f143161g != null) {
            aiVar.mo137271w();
            this.f143126T = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: f */
    public final void mo101123f() {
        if (C62960a.f142907a) {
            C62960a.m113385a("TTPlayer", "release  mPlayer = " + this.f143156b);
        }
        try {
            this.f143156b.mo137173a((AbstractC86369ba) null);
            this.f143156b.mo137261n();
            this.f143126T = false;
            this.f143163i = false;
            f143108k = false;
            this.f143170q = false;
            this.f143143ak = false;
            this.f143141ai = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: l */
    public final boolean mo101128l() {
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar != null) {
                if (!aiVar.f193015ch.mo137317a(true)) {
                    return aiVar.mo137153Q();
                }
                aiVar.f193015ch.mo137316a(156, -1, (Object) null);
                aiVar.f193015ch.f193431d.setDataPosition(0);
                if (aiVar.f193015ch.f193431d.readInt() == 1) {
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: o */
    public final void mo100963o() {
        if (C62960a.f142907a) {
            C62960a.m113385a("TTPlayer", "sleep  mPlayer = " + this.f143156b);
        }
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            aiVar.mo137230f(27, 1);
            mo101122e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: p */
    public final boolean mo101130p() {
        C86313ai aiVar = this.f143156b;
        if (aiVar.f192864A != 3 || (!aiVar.f192911aV && aiVar.f193374v != 2)) {
            return aiVar.f192895aF;
        }
        if (!aiVar.f193015ch.mo137317a(true)) {
            return aiVar.mo137237g();
        }
        aiVar.f193015ch.mo137316a(155, -1, (Object) null);
        aiVar.f193015ch.f193431d.setDataPosition(0);
        if (aiVar.f193015ch.f193431d.readInt() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: y */
    public final void mo100965y() {
        C62960a.m113385a("TTPlayer", "Enter setSubInfoListener");
        if (this.f143156b != null) {
            C62960a.m113385a("TTPlayer", "setSubInfoListener do:" + this.f143154aw);
            C86313ai aiVar = this.f143156b;
            aiVar.f192876M = this.f143154aw;
            if (aiVar.f192948bH == null) {
                aiVar.f192948bH = new SubInfo() {
                    /* class com.p2082ss.ttvideoengine.C86313ai.C863152 */

                    static {
                        Covode.recordClassIndex(101543);
                    }

                    @Override // com.p2082ss.ttm.player.SubInfo
                    public final void onSubLoadFinished(int i) {
                        int i2;
                        if (C86313ai.this.f192876M == null || C86313ai.this.f193020cn <= 0) {
                            C86641i.m150117e("TTVideoEngine", "mSubInfoCallBack is null");
                            return;
                        }
                        C86641i.m150113b("TTVideoEngine", "subtitle call back: finished old did call back");
                        if (i >= 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C86313ai.this.f192876M.mo101154a(i2);
                    }

                    @Override // com.p2082ss.ttm.player.SubInfo
                    public final void onSubInfoCallback2(int i, String str) {
                        if (C86313ai.this.f192876M == null || C86313ai.this.f193020cn <= 0) {
                            C86641i.m150117e("TTVideoEngine", "mSubInfoCallBack is null");
                        } else {
                            C86313ai.this.f192876M.mo101156a(i, str);
                        }
                    }

                    @Override // com.p2082ss.ttm.player.SubInfo
                    public final void onSubSwitchCompleted(int i, int i2) {
                        if (C86313ai.this.f192876M == null || C86313ai.this.f193020cn <= 0) {
                            C86641i.m150117e("TTVideoEngine", "mSubInfoCallBack is null");
                        } else {
                            C86313ai.this.f192876M.mo101155a(i, i2);
                        }
                    }

                    @Override // com.p2082ss.ttm.player.SubInfo
                    public final void onSubLoadFinished2(int i, String str) {
                        int i2;
                        if (C86313ai.this.f192876M == null || C86313ai.this.f193020cn <= 0) {
                            C86641i.m150117e("TTVideoEngine", "mSubInfoCallBack is null");
                            return;
                        }
                        C86641i.m150113b("TTVideoEngine", "subtitle call back: finished did call back");
                        if (i >= 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C86313ai.this.f192876M.mo101158b(i2, str);
                    }

                    @Override // com.p2082ss.ttm.player.SubInfo
                    public final void onSubInfoCallback(int i, int i2, String str) {
                        if (C86313ai.this.f192876M == null || C86313ai.this.f193020cn <= 0) {
                            C86641i.m150117e("TTVideoEngine", "mSubInfoCallBack is null");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("info", str);
                            jSONObject.put("pts", i2);
                            C86313ai.this.f192876M.mo101156a(i, jSONObject.toString());
                        } catch (JSONException unused) {
                            C86641i.m150117e("TTVideoEngine", "put content field failed");
                        }
                    }
                };
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: z */
    public final void mo100966z() {
        C62960a.m113385a("TTPlayer", "Enter setAudioInfoListener");
        if (this.f143156b != null) {
            C62960a.m113385a("TTPlayer", "setAudioInfoListener do:" + this.f143155ax);
            this.f143156b.mo137172a(this.f143155ax);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: c */
    public final void mo101120c() {
        SparseIntArray sparseIntArray = this.f143122P;
        if (sparseIntArray != null && sparseIntArray.indexOfKey(7) >= 0) {
            if (this.f143124R) {
                this.f143156b.mo137230f(210, 1);
                this.f143156b.mo137230f(211, this.f143122P.get(9));
                this.f143156b.mo137230f(212, this.f143122P.get(8));
            } else {
                this.f143156b.mo137230f(210, 0);
            }
        }
        if (C62960a.f142907a) {
            C62960a.m113384a("TTPlayer, start mPlayer = " + this.f143156b);
        }
        m113594C();
        this.f143156b.mo137251k();
        if (this.f143163i) {
            this.f143137ae = SystemClock.elapsedRealtime() - this.f143164j;
            AbstractC63050k kVar = this.f143112E;
            if (kVar != null) {
                kVar.mo101187b(this.f143136ad);
                this.f143112E.mo101189c(this.f143137ae);
                this.f143112E.mo101188c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: d */
    public final void mo101121d() {
        if (C62960a.f142907a) {
            C62960a.m113385a("TTPlayer", "pause  mPlayer = " + this.f143156b);
        }
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar != null) {
                aiVar.mo137255l();
            }
            if (this.f143163i && this.f143135ac == 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f143164j;
                this.f143135ac = elapsedRealtime;
                AbstractC63050k kVar = this.f143112E;
                if (kVar != null) {
                    kVar.mo101184a(elapsedRealtime);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f143158d = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: e */
    public final void mo101122e() {
        this.f143131Y = SystemClock.elapsedRealtime();
        if (C62960a.f142907a) {
            C62960a.m113385a("TTPlayer", "stop  mPlayer = " + this.f143156b);
        }
        try {
            C86313ai aiVar = this.f143118L.get();
            if (aiVar != null) {
                this.f143128V = aiVar.mo137214d();
            }
            C86313ai aiVar2 = this.f143156b;
            if (aiVar2 != null) {
                aiVar2.mo137168a((Surface) null, 3);
                this.f142909a.f143214g = this.f143156b.mo137257m(315);
                this.f143156b.mo137258m();
                this.f143166m = 1;
                SparseIntArray sparseIntArray = this.f143122P;
                if (sparseIntArray != null && sparseIntArray.get(51, 0) > 0) {
                    this.f143166m = 2;
                }
                this.f143132Z = SystemClock.elapsedRealtime();
            }
            this.f143170q = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: w */
    public final AbstractC63042j.C63048f mo100964w() {
        AbstractC86508b bVar;
        C86313ai aiVar = this.f143118L.get();
        if (!(aiVar == null || ((bVar = this.f143128V) == null && (bVar = aiVar.mo137214d()) == null))) {
            AbstractC63042j.C63046d dVar = new AbstractC63042j.C63046d();
            dVar.f143199a = this.f143129W;
            dVar.f143200b = this.f143130X;
            dVar.f143201c = bVar.mo137721a("ffr_read_head_duration");
            dVar.f143202d = bVar.mo137721a("ffr_read_first_data_duration");
            dVar.f143203e = bVar.mo137721a("ffr_decode_duration");
            dVar.f143204f = bVar.mo137721a("ffr_render_duration");
            dVar.f143205g = bVar.mo137721a("ffr_playback_buffering_duration");
            dVar.f143206h = bVar.mo137721a("ffr_prender_duration");
            this.f142909a.f143215h = dVar;
        }
        return super.mo100964w();
    }

    /* renamed from: D */
    private void m113595D() {
        Bundle bundle;
        if (C84191b.m144774a()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("action", 21);
            bundle2.putInt("effect_type", 11);
            if (!this.f143149aq || (bundle = this.f143150ar) == null || !bundle.containsKey("width") || !this.f143150ar.containsKey("height") || !this.f143150ar.containsKey("x") || !this.f143150ar.containsKey("y")) {
                bundle2.putInt("int_value", 0);
            } else {
                bundle2.putFloat("width", this.f143150ar.getFloat("width"));
                bundle2.putFloat("height", this.f143150ar.getFloat("height"));
                bundle2.putFloat("x", this.f143150ar.getFloat("x"));
                bundle2.putFloat("y", this.f143150ar.getFloat("y"));
                bundle2.putInt("use_effect", 1);
                bundle2.putInt("int_value", 1);
                this.f143141ai = 1;
                this.f143156b.mo137230f(199, 1);
            }
            this.f143156b.mo137166a(bundle2);
        }
    }

    /* renamed from: F */
    private void m113597F() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z4;
        boolean z5;
        int i32;
        int i33;
        int i34;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z6;
        boolean z7;
        boolean z8;
        C62960a.m113384a("ensurePlayer");
        if (this.f143156b == null) {
            SparseIntArray sparseIntArray = this.f143122P;
            if (sparseIntArray != null) {
                if (sparseIntArray.get(1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                i7 = this.f143122P.get(0);
                i13 = this.f143122P.get(2);
                i4 = this.f143122P.get(3);
                i8 = this.f143122P.get(4);
                i10 = this.f143122P.get(5);
                i19 = this.f143122P.get(6);
                i20 = this.f143122P.get(80);
                if (this.f143122P.get(18) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i11 = this.f143122P.get(28);
                i31 = this.f143122P.get(23);
                i32 = this.f143122P.get(26);
                i33 = this.f143122P.get(27);
                if (this.f143122P.get(42) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f143122P.indexOfKey(62) < 0 || this.f143122P.get(62) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f143122P.get(66) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                i6 = this.f143122P.get(43);
                i3 = this.f143122P.get(44);
                this.f143140ah = this.f143122P.get(45);
                i = this.f143122P.get(47);
                i2 = this.f143122P.get(55);
                i25 = this.f143122P.get(57);
                i24 = this.f143122P.get(58);
                i23 = this.f143122P.get(82);
                i22 = this.f143122P.get(83);
                i9 = this.f143122P.get(51, 0);
                i12 = this.f143122P.get(52, 0);
                i5 = this.f143122P.get(59, 0);
                i21 = this.f143122P.get(60);
                i18 = this.f143122P.get(84);
                i34 = this.f143122P.get(85);
                i17 = this.f143122P.get(86);
                this.f143142aj = this.f143122P.get(61);
                i16 = this.f143122P.get(68);
                i15 = this.f143122P.get(63);
                i26 = this.f143122P.get(64);
                i27 = this.f143122P.get(65);
                i28 = this.f143122P.get(69);
                i29 = this.f143122P.get(70);
                i30 = this.f143122P.get(71);
                i14 = this.f143122P.get(81);
            } else {
                z = false;
                i = 0;
                i2 = 0;
                i3 = 1;
                i4 = 1000;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 5000;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 1;
                i14 = 0;
                z2 = false;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i20 = 0;
                z3 = false;
                i21 = 0;
                i22 = 90;
                i23 = 0;
                i24 = 0;
                i25 = 0;
                i26 = 0;
                i27 = 0;
                i28 = 0;
                i29 = 0;
                i30 = 0;
                i31 = 0;
                z4 = true;
                z5 = true;
                i32 = 0;
                i33 = 0;
                i34 = 1;
            }
            SparseArray sparseArray = this.f143157c;
            if (sparseArray == null || sparseArray.size() <= 0) {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
            } else {
                if (this.f143157c.get(29) != null) {
                    f2 = ((Float) this.f143157c.get(29)).floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (this.f143157c.get(30) != null) {
                    f3 = ((Float) this.f143157c.get(30)).floatValue();
                } else {
                    f3 = 0.0f;
                }
                if (this.f143157c.get(31) != null) {
                    f4 = ((Float) this.f143157c.get(31)).floatValue();
                } else {
                    f4 = 0.0f;
                }
                if (this.f143157c.get(32) != null) {
                    f5 = ((Float) this.f143157c.get(32)).floatValue();
                } else {
                    f5 = 0.0f;
                }
                if (this.f143157c.get(67) != null) {
                    f = ((Float) this.f143157c.get(67)).floatValue();
                } else {
                    f = 0.0f;
                }
            }
            C86641i.m150109a(i19);
            if (i19 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            f143106I = z6;
            if (C84191b.m144789p()) {
                C86641i.m150112b(i20);
            }
            if (1 == this.f143161g.f188080v) {
                m113599H();
            }
            C86313ai aiVar = new C86313ai(this.f143116J, i7);
            this.f143156b = aiVar;
            this.f143166m = 0;
            this.f143118L.set(aiVar);
            if (i7 == 1) {
                this.f143156b.mo137230f(117, 1);
            }
            if (z3) {
                this.f143156b.mo137230f(216, 1);
            }
            this.f143156b.mo137230f(415, 1);
            this.f143156b.mo137230f(4, i13);
            this.f143156b.mo137230f(550, i12);
            this.f143156b.mo137230f(27, i9);
            if (i9 > 0) {
                this.f143156b.mo137230f(550, 1);
            }
            if (m113598G()) {
                this.f143156b.mo137188a(new int[]{44100});
            }
            this.f143156b.mo137230f(664, i5);
            this.f143156b.mo137172a(this.f143145am);
            this.f143156b.mo137173a(this.f143146an);
            if (1 == i5) {
                this.f143156b.f192887X = this.f143144al;
            }
            this.f143156b.f192881R = new AbstractC86652y() {
                /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C6301612 */

                static {
                    Covode.recordClassIndex(73853);
                }

                @Override // com.p2082ss.ttvideoengine.AbstractC86652y
                /* renamed from: a */
                public final void mo101147a(EnumC86649v vVar, int i) {
                    C63012m.this.f143110B.mo101053a(C62968f.m113420a(vVar), i);
                }
            };
            this.f143156b.mo137174a(new AbstractC86376be() {
                /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630172 */

                static {
                    Covode.recordClassIndex(73854);
                }

                @Override // com.p2082ss.ttvideoengine.AbstractC86376be
                /* renamed from: a */
                public final boolean mo51861a(C86535p pVar) {
                    C63012m.this.f143162h = pVar;
                    C63012m.this.f142909a.f143216i = new C63029p(pVar);
                    return false;
                }
            });
            if (!z) {
                if (this.f143119M) {
                    this.f143156b.mo137230f(7, 1);
                }
                this.f143156b.mo137230f(118, i4);
                this.f143156b.mo137230f(202, i8);
                this.f143156b.mo137230f(206, i10);
                this.f143156b.mo137230f(11, 0);
                this.f143156b.mo137230f(204, 1);
                this.f143156b.mo137230f(12, 0);
                this.f143156b.mo137230f(213, 1);
                this.f143156b.mo137230f(329, i11);
                this.f143156b.mo137230f(498, i6);
                this.f143156b.mo137230f(509, i3);
                this.f143156b.mo137230f(198, i);
                this.f143156b.mo137230f(543, i2);
                this.f143156b.mo137230f(551, i25);
                this.f143156b.mo137230f(552, i24);
                this.f143156b.mo137230f(575, i23);
                if (i23 == 1) {
                    this.f143156b.mo137230f(576, i22);
                }
                this.f143156b.mo137230f(557, i21);
                this.f143156b.mo137230f(577, i18);
                this.f143156b.mo137230f(578, i34);
                this.f143156b.mo137230f(580, i17);
                this.f143156b.mo137161a(535, f);
                this.f143156b.mo137230f(525, i16);
                int i35 = this.f143142aj;
                if (i35 > 0) {
                    this.f143156b.mo137230f(602, i35);
                }
                this.f143156b.mo137230f(371, i15);
                this.f143156b.mo137230f(560, i26);
                this.f143156b.mo137230f(561, i27);
                this.f143156b.mo137230f(564, i28);
                this.f143156b.mo137230f(565, i29);
                this.f143156b.mo137230f(669, i30);
                this.f143156b.mo137230f(800, i14);
                if (i11 == 1) {
                    this.f143156b.mo137161a(325, f2);
                    this.f143156b.mo137161a(326, f3);
                    this.f143156b.mo137161a(327, f4);
                    this.f143156b.mo137161a(328, f5);
                }
                this.f143156b.mo137230f(322, i31);
                C86313ai aiVar2 = this.f143156b;
                if (i32 == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                aiVar2.mo137187a(z7, i33);
                if (z2 && this.f143116J != null) {
                    String str = m113605b(this.f143116J).getPath() + "/player/";
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    this.f143156b.mo137200b(z4);
                    this.f143156b.mo137213c(z5);
                    this.f143156b.mo137193b(this.f143161g.f188044E, this.f143161g.f188045F);
                    this.f143156b.mo137220d(this.f143161g.f188048I);
                    this.f143156b.mo137164a(this.f143140ah, str, "strKernelBinPath", "strOclModuleName");
                    if (C84191b.m144777d()) {
                        Bundle bundle = new Bundle();
                        z8 = false;
                        bundle.putBoolean("srIsMaliSync", false);
                        this.f143156b.f192983bt = bundle;
                    } else {
                        z8 = false;
                    }
                    this.f143156b.mo137186a(z8);
                    this.f143139ag = true;
                }
                this.f143156b.mo137171a(new AbstractC86355au() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630183 */

                    static {
                        Covode.recordClassIndex(73855);
                    }

                    @Override // com.p2082ss.ttvideoengine.AbstractC86355au
                    /* renamed from: a */
                    public final void mo101148a(int i) {
                        if (C63012m.this.f143160f != null && i == 1) {
                            C63012m.this.f143160f.mo101089a();
                        } else if (C63012m.this.f143161g != null && C63012m.this.f143161g.f188070l && C63012m.this.f143110B != null && i == 0) {
                            C63012m.this.f143110B.mo101054a(true);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.AbstractC86355au
                    /* renamed from: b */
                    public final void mo101149b(int i) {
                        if (C63012m.this.f143160f != null && i == 1) {
                            C63012m.this.f143160f.mo101090b();
                        } else if (C63012m.this.f143161g != null && C63012m.this.f143161g.f188070l && C63012m.this.f143110B != null && i == 0) {
                            C63012m.this.f143110B.mo101054a(false);
                        }
                    }
                });
                this.f143156b.f192878O = new AbstractC86364ay() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630194 */

                    static {
                        Covode.recordClassIndex(73856);
                    }

                    @Override // com.p2082ss.ttvideoengine.AbstractC86364ay
                    /* renamed from: a */
                    public final void mo101150a(C86365az azVar) {
                        long j;
                        if (!(azVar == null || !TextUtils.equals(azVar.f193468a, "mdlcacheend") || C63012m.this.f143110B == null)) {
                            C63012m.this.f143110B.mo101061g();
                        }
                        if (!(C63012m.this.f143113F == null || azVar == null || !"firstframe_split".equals(azVar.f193468a))) {
                            String str = azVar.f193474g;
                            if (azVar.f193470c != null && (azVar.f193470c instanceof JSONObject)) {
                                C63012m.this.f143113F.mo101175a(str, (JSONObject) azVar.f193470c);
                            }
                        }
                        if (C63012m.this.f143113F != null && azVar != null && !TextUtils.isEmpty(C63012m.this.f143167n)) {
                            if (("outsyncStartInfos".equals(azVar.f193468a) || "outsyncEndInfos".equals(azVar.f193468a)) && C63012m.this.f143170q) {
                                if (!TextUtils.equals(C63012m.this.f143168o, C63012m.this.f143167n)) {
                                    C63012m mVar = C63012m.this;
                                    mVar.f143168o = mVar.f143167n;
                                    C63012m.this.f143169p = new HashMap();
                                }
                                if (C63012m.this.f143169p != null) {
                                    if ("outsyncStartInfos".equals(azVar.f193468a)) {
                                        if (azVar.f193470c != null && (azVar.f193470c instanceof Map)) {
                                            C63012m.this.f143171r = System.currentTimeMillis();
                                        }
                                    } else if ("outsyncEndInfos".equals(azVar.f193468a) && azVar.f193470c != null && (azVar.f193470c instanceof Map)) {
                                        Map map = (Map) azVar.f193470c;
                                        if (C63012m.this.f143169p.isEmpty()) {
                                            C63012m.this.f143169p.put("min_out_sync_begin_pos", map.get("begin_pos"));
                                        }
                                        if (C63012m.this.f143169p.get("min_out_sync_end_pos") == null) {
                                            C63012m.this.f143169p.put("min_out_sync_end_pos", map.get("end_pos"));
                                        }
                                        if (C63012m.this.f143169p.get("out_sync_video_origin_fps") == null) {
                                            C63012m.this.f143169p.put("out_sync_video_origin_fps", map.get("container_fps"));
                                        }
                                        if (C63012m.this.f143169p.get("out_sync_video_render_fps") == null) {
                                            C63012m.this.f143169p.put("out_sync_video_render_fps", map.get("video_out_fps"));
                                        }
                                        int i = 0;
                                        if (C63012m.this.f143169p.get("out_sync_total_count") instanceof Integer) {
                                            i = ((Integer) C63012m.this.f143169p.get("out_sync_total_count")).intValue();
                                        }
                                        C63012m.this.f143169p.put("out_sync_total_count", Integer.valueOf(i + 1));
                                        if (C63012m.this.f143171r >= 0) {
                                            if (C63012m.this.f143169p.get("out_sync_total_duration") instanceof Long) {
                                                j = ((Long) C63012m.this.f143169p.get("out_sync_total_duration")).longValue();
                                            } else {
                                                j = 0;
                                            }
                                            long currentTimeMillis = System.currentTimeMillis() - C63012m.this.f143171r;
                                            C63012m.this.f143171r = -1;
                                            if (currentTimeMillis > 0) {
                                                C63012m.this.f143169p.put("out_sync_total_duration", Long.valueOf(j + currentTimeMillis));
                                            }
                                        }
                                        if (C63012m.this.f143169p.get("out_sync_max_decode_time") == null && (map.get("decode_time") instanceof Long)) {
                                            C63012m.this.f143169p.put("out_sync_max_decode_time", map.get("decode_time"));
                                        } else if (C63012m.this.f143169p.get("out_sync_max_decode_time") instanceof Long) {
                                            long longValue = ((Long) C63012m.this.f143169p.get("out_sync_max_decode_time")).longValue();
                                            if ((map.get("decode_time") instanceof Long) && ((Long) map.get("decode_time")).longValue() > longValue) {
                                                C63012m.this.f143169p.put("out_sync_max_decode_time", map.get("decode_time"));
                                            }
                                        }
                                        if (C63012m.this.f143169p.get("out_sync_clock_diff") == null && (map.get("clock_diff") instanceof Long)) {
                                            C63012m.this.f143169p.put("out_sync_clock_diff", map.get("clock_diff"));
                                        } else if (C63012m.this.f143169p.get("out_sync_clock_diff") instanceof Long) {
                                            long longValue2 = ((Long) C63012m.this.f143169p.get("out_sync_clock_diff")).longValue();
                                            if ((map.get("clock_diff") instanceof Long) && ((Long) map.get("clock_diff")).longValue() < longValue2) {
                                                C63012m.this.f143169p.put("out_sync_clock_diff", map.get("clock_diff"));
                                            }
                                        }
                                        if (C63012m.this.f143169p.get("out_sync_video_total_drop_count") == null && (map.get("render_drop_cnt") instanceof Integer)) {
                                            C63012m.this.f143169p.put("out_sync_video_total_drop_count", map.get("render_drop_cnt"));
                                        } else if (C63012m.this.f143169p.get("out_sync_video_total_drop_count") instanceof Integer) {
                                            int intValue = ((Integer) C63012m.this.f143169p.get("out_sync_video_total_drop_count")).intValue();
                                            if (map.get("render_drop_cnt") instanceof Integer) {
                                                C63012m.this.f143169p.put("out_sync_video_total_drop_count", Integer.valueOf(intValue + ((Integer) map.get("render_drop_cnt")).intValue()));
                                            }
                                        }
                                        C63012m.this.f143113F.mo101174a(C63012m.this.f143167n, C63012m.this.f143169p);
                                    }
                                }
                            }
                        }
                    }
                };
                m113609e(2);
                FFmpegLibLoaderWrapper.m148179b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101111a(AbstractC63053n nVar) {
        this.f143160f = nVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.m$a */
    class C63025a extends C86304ac {
        static {
            Covode.recordClassIndex(73862);
        }

        private C63025a() {
        }

        @Override // com.p2082ss.ttvideoengine.C86304ac
        /* renamed from: a */
        public final void mo101154a(int i) {
            C62960a.m113385a("TTPlayer", "Enter onSubLoadFinished: success=".concat(String.valueOf(i)));
        }

        @Override // com.p2082ss.ttvideoengine.C86304ac
        /* renamed from: a */
        public final void mo101157a(C86633c cVar) {
            C62960a.m113385a("TTPlayer", "Enter onSubPathInfo: error = [" + cVar + "]");
            if (C63012m.this.f143114G != null && C62960a.f142907a) {
                C62960a.m113385a("TTPlayer", "onSubPathInfo: error = [" + cVar + "]");
            }
        }

        /* synthetic */ C63025a(C63012m mVar, byte b) {
            this();
        }

        @Override // com.p2082ss.ttvideoengine.C86304ac
        /* renamed from: a */
        public final void mo101155a(int i, int i2) {
            C63012m.this.f143176w = true;
            C63012m.this.f143178y = SystemClock.elapsedRealtime();
            C62960a.m113385a("TTPlayer", "Enter onSubSwitchCompleted: success=" + i + " subId=" + i2);
            if (C63012m.this.f143114G != null && C62960a.f142907a) {
                C62960a.m113385a("TTPlayer", "onSubSwitchCompleted: success=" + i + " subId=" + i2);
            }
        }

        @Override // com.p2082ss.ttvideoengine.C86304ac
        /* renamed from: b */
        public final void mo101158b(int i, String str) {
            C63012m.this.f143178y = SystemClock.elapsedRealtime();
            C62960a.m113385a("TTPlayer", "Enter onSubLoadFinished2: success=" + i + ", info=" + str);
            if (C63012m.this.f143114G != null) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onSubLoadFinished2: success=" + i + ", info=" + str);
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        C63012m.this.f143179z = (long) jSONObject.getInt("first_pts");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
        @Override // com.p2082ss.ttvideoengine.C86304ac
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo101156a(int r19, java.lang.String r20) {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C63025a.mo101156a(int, java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.m$b */
    class C63026b implements AbstractC86362aw {
        static {
            Covode.recordClassIndex(73863);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86362aw
        /* renamed from: a */
        public final void mo101151a(C86313ai aiVar) {
        }

        private C63026b() {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86362aw
        /* renamed from: a */
        public final void mo101159a(int i) {
            C62960a.m113385a("TTPlayer", "Enter onInfoIdChanged: infoId=".concat(String.valueOf(i)));
            if (C63012m.this.f143115H != null) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "Enter onInfoIdChanged: infoId=".concat(String.valueOf(i)));
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = 300;
                String str = "";
                List<C63055a> list = C63012m.this.f143174u;
                if (list == null || list.isEmpty()) {
                    i2 = 300;
                } else {
                    for (C63055a aVar : list) {
                        if (!(aVar == null || aVar.f143226c == null || i != aVar.f143227d)) {
                            i2 = aVar.f143226c.intValue();
                            str = aVar.f143230g;
                        }
                    }
                }
                C63012m.this.f143115H.mo81244a(C63012m.this.f143167n, currentTimeMillis - C63012m.this.f143173t, i2, str);
            }
        }

        /* synthetic */ C63026b(C63012m mVar, byte b) {
            this();
        }
    }

    public C63012m(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    private static Context m113600a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: d */
    private int m113608d(int i) {
        VideoSurface videoSurface;
        C86313ai aiVar = this.f143156b;
        if (aiVar == null || (videoSurface = aiVar.f192977bn) == null) {
            return 0;
        }
        return videoSurface.mo136459c(i, 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: b */
    public final void mo101117b(float f) {
        this.f143133aa = f;
        this.f143134ab.f192718d = f;
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            aiVar.mo137170a(this.f143134ab);
        }
    }

    /* renamed from: b */
    private static File m113605b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: c */
    public final void mo100959c(boolean z) {
        C62960a.m113385a("TTPlayer", "Enter setSubtitlesEnable");
        if (this.f143156b != null) {
            C62960a.m113385a("TTPlayer", "setSubtitlesEnable:".concat(String.valueOf(z)));
            this.f143156b.mo137230f(534, z ? 1 : 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: d */
    public final void mo100960d(boolean z) {
        C62960a.m113385a("TTPlayer", "Enter setSubCallbackEnable");
        if (this.f143156b != null) {
            C62960a.m113385a("TTPlayer", "setSubCallbackEnable callbackEnable:".concat(String.valueOf(z)));
            this.f143156b.mo137230f(533, z ? 1 : 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: b */
    public final void mo100955b(int i) {
        C62960a.m113385a("TTPlayer", "Enter switchSubtitlesLaunage");
        if (this.f143156b != null) {
            C62960a.m113385a("TTPlayer", "switchSubtitlesLaunage languageId:".concat(String.valueOf(i)));
            this.f143109A = i;
            this.f143156b.mo137230f(530, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: c */
    public final void mo100958c(int i) {
        C62960a.m113385a("TTPlayer", "Enter switchAudioLanguage");
        if (this.f143156b != null) {
            this.f143177x = SystemClock.elapsedRealtime();
            C62960a.m113385a("TTPlayer", "switchAudioLanguage languageId:".concat(String.valueOf(i)));
            this.f143173t = System.currentTimeMillis();
            this.f143156b.mo137230f(675, i);
        }
    }

    /* renamed from: b */
    private boolean m113607b(Map<String, Object> map) {
        boolean z;
        boolean z2;
        boolean z3;
        if (C62965d.m113419a(this.f143122P, map)) {
            return false;
        }
        if (map != null) {
            z = ((Boolean) map.get("bytevc1")).booleanValue();
        } else {
            z = false;
        }
        SparseIntArray sparseIntArray = this.f143122P;
        if (sparseIntArray == null || (sparseIntArray.indexOfKey(17) < 0 && this.f143122P.indexOfKey(16) < 0)) {
            return this.f143119M;
        }
        if (this.f143122P.get(17, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f143122P.get(16, 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C62960a.f142907a) {
            C62960a.m113385a("TTPlayer", "bytevc1:" + z + ", bytevc1DecodeHardare:" + z2 + ", h264DecodeHardare:" + z3);
        }
        if (z) {
            if (!z2) {
                return false;
            }
        } else if (z3) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m113602a(C84200d dVar) {
        this.f143156b.mo137230f(500, dVar.f187994m);
        this.f143156b.mo137230f(501, dVar.f187995n);
        this.f143156b.mo137230f(502, dVar.f187999r);
        this.f143156b.mo137230f(504, dVar.f187996o);
        this.f143156b.mo137230f(505, dVar.f187997p);
        this.f143156b.mo137230f(506, dVar.f187998q);
        this.f143156b.mo137161a(529, dVar.f188000s);
        this.f143156b.mo137161a(527, dVar.f188001t);
        this.f143156b.mo137161a(528, dVar.f188002u);
    }

    /* renamed from: b */
    private void m113606b(C84203g gVar) {
        if (!(gVar == null || gVar.f188015d == null)) {
            List<Bitmap> list = gVar.f188015d;
            List<Float> list2 = gVar.f188014c;
            Bundle bundle = new Bundle();
            bundle.putInt("action", 21);
            bundle.putInt("effect_type", 2);
            if (list.size() > 1) {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < list.size(); i++) {
                    hashMap.put(Integer.valueOf(i), list.get(i));
                }
                bundle.putSerializable("lut_bitmap_multi", hashMap);
            } else {
                bundle.putParcelable("lut_bitmap", list.get(0));
            }
            if (list2 != null && !list2.isEmpty()) {
                if (list2.size() > 1) {
                    HashMap hashMap2 = new HashMap();
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        hashMap2.put(Integer.valueOf(i2), list2.get(i2));
                    }
                    bundle.putSerializable("strength_multi", hashMap2);
                } else {
                    bundle.putFloat("strength", list2.get(0).floatValue());
                }
            }
            bundle.putInt("use_effect", gVar.f188016e ? 1 : 0);
            this.f143156b.mo137166a(bundle);
        }
    }

    /* renamed from: e */
    private void m113609e(int i) {
        List<C84202f> list = this.f143161g.f188058S;
        if (!(list == null || list.size() <= 0 || this.f143156b == null)) {
            for (C84202f fVar : list) {
                if (fVar.f188009b != null && fVar.f188011d == i) {
                    try {
                        if (fVar.f188010c == 1) {
                            this.f143156b.mo137230f(fVar.f188008a, ((Integer) fVar.f188009b).intValue());
                        } else if (fVar.f188010c == 2) {
                            this.f143156b.mo137207c(fVar.f188008a, ((Long) fVar.f188009b).longValue());
                        } else if (fVar.f188010c == 3) {
                            this.f143156b.mo137161a(fVar.f188008a, ((Float) fVar.f188009b).floatValue());
                        } else if (fVar.f188010c == 4) {
                            this.f143156b.mo137217d(fVar.f188008a, (String) fVar.f188009b);
                        } else if (fVar.f188010c == 5) {
                            this.f143156b.mo137217d(fVar.f188008a, ((JSONObject) fVar.f188009b).toString());
                        } else if (fVar.f188010c == 6) {
                            this.f143156b.mo137217d(fVar.f188008a, ((JSONArray) fVar.f188009b).toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final float mo101103a(int i) {
        int i2;
        long j;
        C86313ai aiVar = this.f143156b;
        if (aiVar == null) {
            return -1.0f;
        }
        switch (i) {
            case 0:
                if (this.f143142aj <= 0 || this.f143172s) {
                    i2 = aiVar.mo137267s();
                } else {
                    i2 = aiVar.mo137268t();
                }
                return (float) i2;
            case 1:
                i2 = aiVar.f193376x;
                return (float) i2;
            case 2:
                return aiVar.mo137204c(71);
            case 3:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            default:
                return -1.0f;
            case 4:
                j = aiVar.mo137257m(62);
                return (float) j;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                j = aiVar.mo137257m(61);
                return (float) j;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                j = aiVar.mo137257m(60);
                return (float) j;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i2 = aiVar.mo137254l(42);
                return (float) i2;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return aiVar.mo137204c(70);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                i2 = aiVar.mo137254l(660);
                return (float) i2;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                int i3 = this.f143140ah;
                if (i3 == 1) {
                    return 2.0f;
                }
                if (i3 == 4) {
                    return 1.5f;
                }
                return 1.0f;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                i2 = aiVar.mo137254l(59);
                return (float) i2;
            case ABRConfig.ABR_SELECT_SCENE:
                try {
                    j = aiVar.mo137257m(64);
                    return (float) j;
                } catch (Exception e) {
                    e.printStackTrace();
                    return -1.0f;
                }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63054o
    /* renamed from: b */
    public final void mo101118b(Surface surface) {
        C86313ai aiVar = this.f143156b;
        if (aiVar != null) {
            C86641i.m150110a("TTVideoEngine", "getSurface:" + aiVar.f192917ab + ", this:" + aiVar);
            if (surface == aiVar.f192917ab) {
                new StringBuilder("onSurfaceDestroyed sf: ").append(surface).append(", player: ").append(this).append(", engine: ").append(this.f143156b);
                this.f143156b.mo137167a((Surface) null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101104a(float f) {
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar != null) {
                double d = (double) f;
                Double.isNaN(d);
                double d2 = (double) aiVar.f193376x;
                Double.isNaN(d2);
                int i = (int) (d * 0.01d * d2);
                AbstractC63042j.AbstractC63045c cVar = this.f143110B;
                if (cVar != null) {
                    cVar.mo101048a(i, f);
                }
                this.f143156b.mo137163a(i, this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j, com.p2082ss.android.ugc.aweme.player.sdk.p3552a.AbstractC62962a
    /* renamed from: b */
    public final void mo100956b(String str) {
        C86313ai aiVar = this.f143118L.get();
        if (aiVar != null && aiVar.f192920ae != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 512) {
                str = str.substring(0, 512);
                C86641i.m150110a("TTVideoEngine", "customStr too long to be truncated!");
            }
            aiVar.f192920ae.mo137593d(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: b */
    public final void mo101119b(boolean z) {
        SparseIntArray sparseIntArray;
        if (C62960a.f142907a) {
            C62960a.m113385a("TTPlayer", "reset  mPlayer = " + this.f143156b);
        }
        this.f143134ab.f192718d = -1.0f;
        this.f143156b.mo137170a(this.f143134ab);
        boolean z2 = true;
        if (z || (((sparseIntArray = this.f143122P) == null || sparseIntArray.get(34) != 1) && !this.f143126T)) {
            z2 = false;
        }
        this.f143138af.mo100967a();
        if (!z2) {
            this.f143156b.mo137173a((AbstractC86369ba) null);
            this.f143118L.set(null);
            this.f143156b.mo137261n();
            this.f143156b.mo137167a((Surface) null);
            this.f143156b = null;
            this.f143143ak = false;
            this.f143141ai = 0;
            m113597F();
        } else {
            this.f143156b.mo137255l();
            this.f143156b.mo137167a((Surface) null);
        }
        this.f143159e = null;
        this.f143162h = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101113a(C84200d dVar, Map<String, Object> map) {
        m113603a(dVar, null, map, true);
    }

    private C63012m(Context context, byte b) {
        this(context, (char) 0);
    }

    private C63012m(Context context, char c) {
        this(context, false, null, null, null);
    }

    /* renamed from: a */
    private static void m113604a(C86313ai aiVar, boolean z) {
        if (z) {
            aiVar.mo137183a("X-Preload-Reuse", "1");
        }
    }

    /* renamed from: a */
    private static Object m113601a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12542);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12542);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j
    /* renamed from: a */
    public final void mo101105a(float f, float f2) {
        try {
            C86313ai aiVar = this.f143156b;
            if (aiVar != null) {
                aiVar.mo137159a(f, f2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C63012m(Context context, boolean z, SparseIntArray sparseIntArray, SparseArray sparseArray, C84209m mVar) {
        this.f143127U = new C62965d();
        this.f143133aa = -1.0f;
        this.f143140ah = 1;
        this.f143166m = -1;
        this.f143141ai = 0;
        this.f143142aj = 0;
        this.f143170q = false;
        this.f143171r = 0;
        this.f143172s = false;
        this.f143173t = 0;
        this.f143174u = null;
        this.f143175v = false;
        this.f143176w = false;
        this.f143177x = 0;
        this.f143178y = 0;
        this.f143179z = 0;
        this.f143109A = 0;
        this.f143144al = new C86593o() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630131 */

            static {
                Covode.recordClassIndex(73850);
            }

            @Override // com.p2082ss.ttvideoengine.C86593o
            /* renamed from: a */
            public final void mo101139a(long j) {
                C84204h hVar = new C84204h();
                hVar.f188019b = 5;
                hVar.f188020c = j;
                hVar.f188021d = j;
                C63012m.this.f143110B.mo101050a(5, C84204h.m144802a(hVar));
            }

            @Override // com.p2082ss.ttvideoengine.C86593o
            /* renamed from: b */
            public final void mo101141b(long j, long j2) {
                C84204h hVar = new C84204h();
                hVar.f188019b = 4;
                hVar.f188020c = j;
                hVar.f188021d = j2;
                C63012m.this.f143110B.mo101050a(4, C84204h.m144802a(hVar));
            }

            @Override // com.p2082ss.ttvideoengine.C86593o
            /* renamed from: c */
            public final void mo101142c(long j, long j2) {
                C84204h hVar = new C84204h();
                hVar.f188019b = 6;
                hVar.f188020c = j;
                hVar.f188021d = j2;
                C63012m.this.f143110B.mo101050a(6, C84204h.m144802a(hVar));
            }

            @Override // com.p2082ss.ttvideoengine.C86593o
            /* renamed from: d */
            public final void mo101143d(long j, long j2) {
                C84204h hVar = new C84204h();
                hVar.f188019b = 2;
                hVar.f188020c = j;
                hVar.f188021d = j2;
                C63012m.this.f143110B.mo101050a(2, C84204h.m144802a(hVar));
            }

            @Override // com.p2082ss.ttvideoengine.C86593o
            /* renamed from: e */
            public final void mo101144e(long j, long j2) {
                C84204h hVar = new C84204h();
                hVar.f188019b = 3;
                hVar.f188020c = j;
                hVar.f188021d = j2;
                C63012m.this.f143110B.mo101050a(3, C84204h.m144802a(hVar));
            }

            @Override // com.p2082ss.ttvideoengine.C86593o
            /* renamed from: a */
            public final void mo101140a(long j, long j2) {
                C84204h hVar = new C84204h();
                hVar.f188019b = 1;
                hVar.f188020c = j;
                hVar.f188021d = j2;
                C63012m.this.f143110B.mo101050a(1, C84204h.m144802a(hVar));
            }
        };
        this.f143145am = new C86370bb() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630205 */

            static {
                Covode.recordClassIndex(73857);
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86362aw, com.p2082ss.ttvideoengine.C86370bb
            /* renamed from: a */
            public final void mo101151a(C86313ai aiVar) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onReadyForDisplay() called with: engine = [" + aiVar + "]");
                }
                C63012m.this.f143110B.mo101055b();
            }
        };
        this.f143146an = new AbstractC86369ba() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630216 */

            static {
                Covode.recordClassIndex(73858);
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: a */
            public final void mo16746a(C86313ai aiVar) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onPrepare() called with: engine = [" + aiVar + "]");
                }
                SystemClock.elapsedRealtime();
                if (C63012m.this.f143110B != null) {
                    C63012m.this.f143110B.mo101059e();
                }
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: d */
            public final void mo16754d(C86313ai aiVar) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onCompletion() called with: engine = [" + aiVar + "]");
                }
                C63012m.this.f143110B.mo101058d();
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x001f  */
            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo16745a(int r4) {
                /*
                    r3 = this;
                    r0 = 3
                    if (r4 == r0) goto L_0x0045
                    r0 = 4
                    if (r4 == r0) goto L_0x0045
                    r0 = 20
                    if (r4 == r0) goto L_0x0045
                    r0 = 30
                    if (r4 == r0) goto L_0x0045
                    r0 = 40
                    if (r4 == r0) goto L_0x0042
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r4 == r0) goto L_0x0045
                    r0 = 1002(0x3ea, float:1.404E-42)
                    if (r4 == r0) goto L_0x0042
                    r2 = 0
                L_0x001b:
                    boolean r0 = com.p2082ss.android.ugc.aweme.player.sdk.C62960a.f142907a
                    if (r0 == 0) goto L_0x0039
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r0 = "onVideoStatusException() called with: status = ["
                    r1.<init>(r0)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r0 = "]"
                    java.lang.StringBuilder r0 = r1.append(r0)
                    java.lang.String r1 = r0.toString()
                    java.lang.String r0 = "TTPlayer"
                    com.p2082ss.android.ugc.aweme.player.sdk.C62960a.m113385a(r0, r1)
                L_0x0039:
                    com.ss.android.ugc.aweme.player.sdk.a.m r0 = com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.this
                    com.ss.android.ugc.aweme.player.sdk.api.j$c r1 = r0.f143110B
                    r0 = 0
                    r1.mo101049a(r0, r0, r2)
                    return
                L_0x0042:
                    java.lang.String r2 = "Video deleted, play failed."
                    goto L_0x001b
                L_0x0045:
                    java.lang.String r2 = "Transcoding, play failed."
                    goto L_0x001b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63012m.C630216.mo16745a(int):void");
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: b */
            public final void mo16750b(C86313ai aiVar) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onPrepared() called with: engine = [" + aiVar + "]");
                }
                SystemClock.elapsedRealtime();
                C63012m.this.f143177x = SystemClock.elapsedRealtime();
                C63012m.this.f143110B.mo101047a();
                if (TextUtils.isEmpty(C63012m.this.f143159e) && C63012m.this.f143156b != null) {
                    C63012m mVar = C63012m.this;
                    mVar.f143159e = mVar.f143156b.mo137266r();
                }
                if (C63012m.this.f143163i) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C63012m.this.f143164j;
                    if (C63012m.this.f143112E != null) {
                        C63012m.this.f143112E.mo101191d(elapsedRealtime);
                        C63012m.this.f143112E.mo101185b();
                    }
                } else if (C63012m.f143108k) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - C63012m.this.f143165l;
                    if (C63012m.this.f143113F != null) {
                        C63012m.this.f143113F.mo101173a(elapsedRealtime2);
                    }
                }
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: c */
            public final void mo16752c(C86313ai aiVar) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onRenderStart() called with: engine = [" + aiVar + "] mFromResume:" + C63012m.this.f143158d);
                }
                SystemClock.elapsedRealtime();
                if (C63012m.this.f143158d) {
                    C63012m.this.f143110B.mo101060f();
                    return;
                }
                if (C63012m.this.f143156b != null) {
                    C63012m.this.f142909a.f143208a = C63012m.this.f143156b.mo137254l(43);
                    C63012m.this.f142909a.f143210c = C63012m.this.f143156b.mo137254l(45);
                    C63012m.this.f142909a.f143211d = C63012m.this.f143156b.mo137254l(47);
                    C63012m.this.f142909a.f143218k = C63012m.this.f143156b.mo137254l(371);
                    C63012m.this.f142909a.f143217j = C63012m.this.mo101102B();
                    C63012m.this.f142909a.f143219l = C63012m.this.f143166m;
                    C63012m.this.f142909a.f143220m = C63012m.this.f143156b.mo137254l(667);
                    if (C63012m.this.f143156b.f192920ae != null) {
                        C63012m.this.f142909a.f143221n = C63012m.this.f143156b.f192920ae.mo137634o();
                    }
                }
                if (C63012m.this.f143163i) {
                    C63012m.this.f143163i = false;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C63012m.this.f143164j;
                    if (C63012m.this.f143112E != null) {
                        C63012m.this.f143112E.mo101193e(elapsedRealtime);
                        C63012m.this.f143112E.mo101192e();
                    }
                } else if (C63012m.f143108k) {
                    C63012m.f143108k = false;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - C63012m.this.f143165l;
                    if (C63012m.this.f143113F != null) {
                        C63012m.this.f143113F.mo101177b(elapsedRealtime2);
                    }
                }
                C63012m.this.f143170q = true;
                C63012m.this.f143110B.mo101057c();
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: a */
            public final void mo16749a(C86633c cVar) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onError() called with: error = [" + cVar + "]");
                }
                C63012m.this.f143110B.mo101049a(cVar.f195251a, cVar.f195252b, cVar);
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: d */
            public final void mo16755d(C86313ai aiVar, int i) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onStreamChanged() called with: type = [" + i + "]");
                }
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: b */
            public final void mo16751b(C86313ai aiVar, int i) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onLoadStateChanged() called with: engine = [" + aiVar + "], loadState = [" + i + "]");
                }
                if (C63012m.this.f143161g != null && !C63012m.this.f143161g.f188070l) {
                    if (i == 2) {
                        C63012m.this.f143110B.mo101054a(true);
                    } else if (i == 1) {
                        C63012m.this.f143110B.mo101054a(false);
                    }
                }
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: c */
            public final void mo16753c(C86313ai aiVar, int i) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onBufferingUpdate() called with: engine = [" + aiVar + "], percent = [" + i + "]");
                }
                long r = (long) (((float) C63012m.this.mo101132r()) * (((float) i) / 100.0f));
                C63012m.this.f143110B.mo101051a(r);
                C63012m.this.f143110B.mo101052a(r, i);
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: a */
            public final void mo16747a(C86313ai aiVar, int i) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onPlaybackStateChanged() called with: engine = [" + aiVar + "], playbackState = [" + i + "]");
                }
                if (C63012m.this.f143110B == null) {
                    return;
                }
                if (i == 1) {
                    C63012m.this.f143110B.mo101062h();
                } else if (i == 0) {
                    C63012m.this.f143110B.mo101064j();
                } else if (i == 2) {
                    C63012m.this.f143110B.mo101063i();
                }
            }

            @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
            /* renamed from: a */
            public final void mo16748a(C86313ai aiVar, int i, int i2) {
                if (C62960a.f142907a) {
                    C62960a.m113385a("TTPlayer", "onVideoSizeChanged() called with: engine = [" + aiVar + "], width = [" + i + "], height = [" + i2 + "]");
                }
                C63012m.this.f142909a.f143212e = i;
                C63012m.this.f142909a.f143213f = i2;
            }
        };
        this.f143110B = new AbstractC63042j.C63043a();
        this.f143149aq = false;
        this.f143151as = 0;
        this.f143114G = null;
        this.f143115H = null;
        this.f143154aw = new C63025a(this, (byte) 0);
        this.f143155ax = new C63026b(this, (byte) 0);
        this.f143116J = context;
        this.f143119M = z;
        this.f143122P = sparseIntArray;
        this.f143157c = sparseArray;
        this.f143117K = Thread.currentThread().getId();
        this.f143118L = new AtomicReference<>(null);
        this.f143161g = mVar;
        this.f143134ab = new C86275p();
        this.f143138af = new C62964c();
        m113597F();
    }
}
