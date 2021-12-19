package dmt.p4542av.video.p4545b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.AbstractC31074g;
import com.p2082ss.android.ugc.asve.editor.EnumC31070e;
import com.p2082ss.android.ugc.asve.editor.nle.C31085b;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.effect.ClipsModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.C46339b;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.C46340c;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.C46341d;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.C46342e;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70857g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.tools.view.widget.DialogC85061o;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85395bh;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.android.vesdk.LoudnessDetectResult;
import com.p2082ss.android.vesdk.VECurveSpeedUtils;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.p2082ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.p2082ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoLensOneKeyHdrParam;
import com.p2082ss.android.vesdk.utils.C85577a;
import dmt.p4542av.video.AbstractC88169b;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88294r;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88299v;
import dmt.p4542av.video.C88300w;
import dmt.p4542av.video.C88301x;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.p4545b.AbstractC88176f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.j */
public abstract class AbstractC88181j implements AbstractC88176f {

    /* renamed from: F */
    public static final String f200126F = AbstractC88181j.class.getSimpleName();

    /* renamed from: G */
    public static final C88182a f200127G = new C88182a((byte) 0);

    /* renamed from: A */
    public int f200128A;

    /* renamed from: B */
    public FilterBean f200129B;

    /* renamed from: C */
    public float f200130C = -1.0f;

    /* renamed from: D */
    public C1213t<C88296t> f200131D;

    /* renamed from: E */
    public C88238s f200132E;

    /* renamed from: H */
    private Executor f200133H;

    /* renamed from: I */
    private final AbstractC50703k f200134I = new C88217s(this);

    /* renamed from: J */
    private ExecutorService f200135J;

    /* renamed from: K */
    private int f200136K = -1;

    /* renamed from: L */
    private int f200137L = -1;

    /* renamed from: M */
    private C46339b f200138M;

    /* renamed from: N */
    private final ScheduledExecutorService f200139N;

    /* renamed from: a */
    public C1213t<Boolean> f200140a;

    /* renamed from: b */
    public C1213t<C88300w> f200141b;

    /* renamed from: c */
    public C1213t<IAudioEffectParam> f200142c;

    /* renamed from: d */
    public ArrayList<EffectPointModel> f200143d;

    /* renamed from: e */
    public VEEditorAutoStartStopArbiter f200144e;

    /* renamed from: f */
    public Context f200145f;

    /* renamed from: g */
    protected AbstractC31071f f200146g;

    /* renamed from: h */
    public AbstractC14088a f200147h;

    /* renamed from: i */
    public int f200148i = -1;

    /* renamed from: j */
    public int f200149j = -1;

    /* renamed from: k */
    public int f200150k = -1;

    /* renamed from: l */
    public List<Integer> f200151l = new ArrayList();

    /* renamed from: m */
    public List<Integer> f200152m = new ArrayList();

    /* renamed from: n */
    public C88288n f200153n;

    /* renamed from: o */
    public C88294r f200154o;

    /* renamed from: p */
    public AbstractC50706n f200155p;

    /* renamed from: q */
    public boolean f200156q = true;

    /* renamed from: r */
    public int f200157r;

    /* renamed from: s */
    public DialogC85061o f200158s;

    /* renamed from: t */
    public SafeHandler f200159t;

    /* renamed from: u */
    public AbstractC84903j f200160u = C84401c.f188722f;

    /* renamed from: v */
    public SurfaceView f200161v;

    /* renamed from: w */
    public AbstractC1204m f200162w;

    /* renamed from: x */
    public VEListener.AbstractC85253v f200163x;

    /* renamed from: y */
    public AbstractC88176f.AbstractC88177a f200164y;

    /* renamed from: z */
    public String f200165z;

    /* renamed from: a */
    public void mo142723a(SurfaceView surfaceView) {
    }

    /* renamed from: dmt.av.video.b.j$a */
    public static final class C88182a {
        static {
            Covode.recordClassIndex(104217);
        }

        private C88182a() {
        }

        public /* synthetic */ C88182a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        EnumC31070e eVar;
        C89219l.m154721d(aVar, "");
        this.f200145f = context;
        this.f200147h = aVar;
        this.f200161v = surfaceView;
        this.f200162w = mVar;
        if (this.f200132E.f200273a.invoke().booleanValue()) {
            eVar = EnumC31070e.NLEEditorType;
        } else {
            eVar = EnumC31070e.VEEditorTYPE;
        }
        C85395bh bhVar = null;
        if (aVar.getNeedVEUserConfig()) {
            bhVar = C31085b.m64286a();
        }
        this.f200146g = C31012a.m63724a().mo56205s().mo56402a(surfaceView, new AbstractC31074g.C31076b(eVar, aVar.getWorkspace(), aVar.getEditorHandler(), bhVar));
        if (this.f200161v != null) {
            if (aVar.getEditorHandler() > 0) {
                AbstractC31071f fVar = this.f200146g;
                if (fVar == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar.mo56334b(false);
                AbstractC31071f fVar2 = this.f200146g;
                if (fVar2 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar2.mo56342c(0);
            }
            Context context2 = this.f200145f;
            AbstractC1204m mVar2 = this.f200162w;
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            this.f200144e = new VEEditorAutoStartStopArbiter(context2, mVar2, fVar3, this.f200161v, aVar.getEnableAutoStart());
            SurfaceView surfaceView2 = this.f200161v;
            if (surfaceView2 == null) {
                C89219l.m154715b();
            }
            mo142723a(surfaceView2);
            if (this.f200163x != null) {
                AbstractC31071f fVar4 = this.f200146g;
                if (fVar4 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                VEListener.AbstractC85253v vVar = this.f200163x;
                if (vVar == null) {
                    C89219l.m154715b();
                }
                fVar4.mo56309a(vVar);
            }
        }
        this.f200160u.mo123658a("yarkey mVEEditor create");
        this.f200160u.mo123658a(Log.getStackTraceString(new Throwable()));
        AbstractC31071f fVar5 = this.f200146g;
        if (fVar5 == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar5.mo56376n();
        if (this.f200164y != null) {
            AbstractC31071f fVar6 = this.f200146g;
            if (fVar6 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar6.mo56344c(new C88216r(this));
        }
        AbstractC31071f fVar7 = this.f200146g;
        if (fVar7 == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar7.mo56366i(aVar.getFps());
        if (aVar.getPreviewHeight() <= 0 || aVar.getPreviewWidth() <= 0) {
            return -1;
        }
        AbstractC31071f fVar8 = this.f200146g;
        if (fVar8 == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar8.mo56348d(aVar.getPreviewWidth(), aVar.getPreviewHeight());
        return -1;
    }

    /* renamed from: a */
    public void mo142730a(boolean z) {
        AbstractC14088a aVar = this.f200147h;
        if (this.f200161v != null && aVar != null && aVar.getCanvasWidth() > 0 && aVar.getCanvasHeight() > 0 && !aVar.isCanvasVEEditorType()) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar2.mo56343c(aVar.getCanvasWidth(), aVar.getCanvasHeight());
            aVar.getCanvasWidth();
            aVar.getCanvasHeight();
        }
        AbstractC31071f fVar3 = this.f200146g;
        if (fVar3 == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar3.mo56311a(true);
        if (this.f200161v == null) {
            List<IAudioEffectParam> list = null;
            if (aVar != null) {
                if (aVar.getVeAudioEffectParam() == null) {
                    if (aVar != null) {
                        list = aVar.getVeAudioEffectParamList();
                    }
                }
            }
            if (C84892d.m145850a(list)) {
                return;
            }
        }
        if (!z) {
            return;
        }
        if (this.f200132E.f200277e) {
            ExecutorService executorService = this.f200135J;
            if (executorService == null) {
                executorService = m153275k();
                this.f200135J = executorService;
                C89219l.m154716b(executorService, "");
            }
            executorService.submit(new RunnableC88218t(this));
            return;
        }
        AbstractC31071f fVar4 = this.f200146g;
        if (fVar4 == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar4.mo56381p();
    }

    /* renamed from: a */
    public final boolean mo142736a(C88296t tVar) {
        C89219l.m154721d(tVar, "");
        if (this.f200132E.f200276d) {
            m153272c(tVar);
            return false;
        }
        m153273d(tVar);
        return false;
    }

    /* renamed from: a */
    public final void mo142729a(C88296t tVar, Runnable runnable) {
        C1743j jVar = new C1743j();
        AbstractC31071f fVar = this.f200146g;
        if (fVar == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar.mo56344c(new C88225z(this, jVar));
        AbstractC31071f fVar2 = this.f200146g;
        if (fVar2 == null) {
            C89219l.m154710a("mVEEditor");
        }
        int a = fVar2.mo56265a((int) tVar.f200367b, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
        if (a == 0) {
            try {
                jVar.f5610a.mo5547f();
            } catch (InterruptedException unused) {
            }
        } else {
            try {
                AbstractC31071f fVar3 = this.f200146g;
                if (fVar3 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                C85581w.EnumC85611j f = fVar3.mo56356f();
                this.f200160u.mo123658a("Seek failed. ret = " + a + " state = " + (f != null ? Integer.valueOf(f.ordinal()) : null));
            } catch (C85615x e) {
                this.f200160u.mo123659a(e);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public boolean mo142732a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        if (vEVolumeChangeOp.mType == 0) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            int y = fVar2.mo56394y();
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56313a(y, fVar3.mo56393x(), vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            AbstractC31071f fVar4 = this.f200146g;
            if (fVar4 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar4.mo56313a(this.f200148i, 1, vEVolumeChangeOp.mVolume);
        }
        if (this.f200146g != null) {
            return false;
        }
        C89219l.m154710a("mVEEditor");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0109, code lost:
        if (r8 != null) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142735a(dmt.p4542av.video.C88295s r25) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.AbstractC88181j.mo142735a(dmt.av.video.s):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0138  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142733a(dmt.p4542av.video.VEPreviewMusicParams r25) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.AbstractC88181j.mo142733a(dmt.av.video.VEPreviewMusicParams):boolean");
    }

    /* renamed from: a */
    public final void mo142722a(int i, double d, double d2, double d3) {
        if (d != 0.0d) {
            VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
            vEAudioLoudnessBalanceFilter.targetLoudness = d;
            vEAudioLoudnessBalanceFilter.avgLoudness = d3;
            vEAudioLoudnessBalanceFilter.peakLoudness = d2;
            vEAudioLoudnessBalanceFilter.enable = true;
            if (this.f200136K == -1) {
                AbstractC31071f fVar = this.f200146g;
                if (fVar == null) {
                    C89219l.m154710a("mVEEditor");
                }
                this.f200136K = fVar.mo56258a(1, i, vEAudioLoudnessBalanceFilter);
                return;
            }
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar2.mo56263a(this.f200136K, vEAudioLoudnessBalanceFilter);
        }
    }

    /* renamed from: a */
    public final void mo142726a(C70936b bVar, String str) {
        if (bVar != null) {
            int i = bVar.f158829b;
            if (i == 1) {
                m153264a(bVar.f158828a, bVar.f158830c);
            } else if (i != 2) {
                switch (i) {
                    case 20001:
                    case 20002:
                    case 20003:
                    case 20004:
                        m153266b(bVar, str);
                        return;
                    default:
                        C85315al.m146639b("HDREnhance", "Draw frame failed，current type = " + bVar.f158829b);
                        m153271c(bVar, str);
                        return;
                }
            } else {
                m153271c(bVar, str);
            }
        }
    }

    /* renamed from: a */
    private final void m153264a(boolean z, boolean z2) {
        if (z2) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56354e(z);
        } else {
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar2.mo56350d(z);
        }
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
    }

    /* renamed from: a */
    public final boolean mo142734a(C88292p pVar) {
        EffectPointModel effectPointModel;
        C89219l.m154721d(pVar, "");
        ArrayList<EffectPointModel> arrayList = this.f200143d;
        if (arrayList == null) {
            C89219l.m154715b();
        }
        if (pVar.f200341g == 0) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(pVar, "");
            pVar.f200335a = new int[]{fVar.mo56267a((int) pVar.f200337c, pVar.f200344j, pVar.f200349o)};
            EffectPointModel effectPointModel2 = new EffectPointModel();
            effectPointModel2.setType(1);
            effectPointModel2.setSelectedColor(pVar.f200343i);
            effectPointModel2.setIndex(pVar.f200335a[0]);
            effectPointModel2.setResDir(pVar.f200344j);
            effectPointModel2.setKey(pVar.f200345k);
            effectPointModel2.setFromEnd(pVar.f200342h);
            effectPointModel2.setStartPoint((int) pVar.f200337c);
            effectPointModel2.setUiStartPoint((int) pVar.f200339e);
            effectPointModel2.setUiEndPoint((int) pVar.f200340f);
            effectPointModel2.setName(pVar.f200346l);
            effectPointModel2.setDuration(pVar.f200347m);
            effectPointModel2.setCategory(pVar.f200348n);
            effectPointModel2.setExtra(pVar.f200349o);
            arrayList.add(effectPointModel2);
            return true;
        } else if (pVar.f200341g == 5) {
            m153261a(pVar, arrayList);
            return true;
        } else {
            if (pVar.f200341g == 6) {
                if (arrayList.isEmpty()) {
                    return false;
                }
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        effectPointModel = arrayList.get(size);
                        C89219l.m154716b(effectPointModel, "");
                    }
                } while (!C89219l.m154714a((Object) "sticker", (Object) effectPointModel.getCategory()));
                AbstractC31071f fVar2 = this.f200146g;
                if (fVar2 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                EffectPointModel effectPointModel3 = arrayList.get(size);
                C89219l.m154716b(effectPointModel3, "");
                fVar2.mo56328b(new int[]{effectPointModel3.getIndex()});
                EffectPointModel effectPointModel4 = arrayList.get(size);
                C89219l.m154716b(effectPointModel4, "");
                effectPointModel4.setFromEnd(pVar.f200342h);
                EffectPointModel effectPointModel5 = arrayList.get(size);
                C89219l.m154716b(effectPointModel5, "");
                effectPointModel5.setStartPoint((int) pVar.f200337c);
                EffectPointModel effectPointModel6 = arrayList.get(size);
                C89219l.m154716b(effectPointModel6, "");
                effectPointModel6.setEndPoint((int) pVar.f200338d);
                EffectPointModel effectPointModel7 = arrayList.get(size);
                C89219l.m154716b(effectPointModel7, "");
                effectPointModel7.setUiStartPoint((int) pVar.f200339e);
                EffectPointModel effectPointModel8 = arrayList.get(size);
                C89219l.m154716b(effectPointModel8, "");
                effectPointModel8.setUiEndPoint((int) pVar.f200340f);
                AbstractC31071f fVar3 = this.f200146g;
                if (fVar3 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                EffectPointModel effectPointModel9 = arrayList.get(size);
                C89219l.m154716b(effectPointModel9, "");
                EffectPointModel effectPointModel10 = effectPointModel9;
                C89219l.m154721d(fVar3, "");
                C89219l.m154721d(effectPointModel10, "");
                pVar.f200335a = fVar3.mo56319a(new int[]{effectPointModel10.getStartPoint()}, new int[]{effectPointModel10.getEndPoint()}, new String[]{effectPointModel10.getResDir()}, new int[]{0}, new int[]{0}, new String[]{effectPointModel10.getExtra()});
                EffectPointModel effectPointModel11 = arrayList.get(size);
                C89219l.m154716b(effectPointModel11, "");
                effectPointModel11.setIndex(pVar.f200335a[0]);
                return true;
            } else if (pVar.f200341g == 1) {
                EffectPointModel effectPointModel12 = arrayList.get(arrayList.size() - 1);
                C89219l.m154716b(effectPointModel12, "");
                EffectPointModel effectPointModel13 = effectPointModel12;
                AbstractC31071f fVar4 = this.f200146g;
                if (fVar4 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar4.mo56360g(effectPointModel13.getIndex(), (int) pVar.f200337c);
                effectPointModel13.setEndPoint((int) pVar.f200337c);
                effectPointModel13.setUiEndPoint((int) pVar.f200340f);
            } else if (pVar.f200341g == 2 || pVar.f200341g == 7) {
                m153255a(pVar.f200335a[0], arrayList);
            } else if (pVar.f200341g == 3) {
                AbstractC31071f fVar5 = this.f200146g;
                if (fVar5 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                int[] iArr = pVar.f200335a;
                C89219l.m154716b(iArr, "");
                fVar5.mo56328b(iArr);
                arrayList.clear();
            } else if (pVar.f200341g == 4) {
                AbstractC31071f fVar6 = this.f200146g;
                if (fVar6 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                int[] iArr2 = pVar.f200335a;
                C89219l.m154716b(iArr2, "");
                fVar6.mo56328b(iArr2);
                int[] iArr3 = pVar.f200335a;
                C89219l.m154716b(iArr3, "");
                int length = iArr3.length;
                for (int i = 0; i < length; i++) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else if (pVar.f200341g == 8) {
                m153255a(pVar.f200335a[0], arrayList);
                m153261a(pVar, arrayList);
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m153261a(C88292p pVar, ArrayList<EffectPointModel> arrayList) {
        EffectPointModel effectPointModel = new EffectPointModel();
        AbstractC31071f fVar = this.f200146g;
        if (fVar == null) {
            C89219l.m154710a("mVEEditor");
        }
        C88301x.m153459a(fVar, pVar);
        effectPointModel.setIndex(pVar.f200335a[0]);
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
        effectPointModel.setType(1);
        effectPointModel.setSelectedColor(pVar.f200343i);
        effectPointModel.setResDir(pVar.f200344j);
        effectPointModel.setKey(pVar.f200345k);
        effectPointModel.setFromEnd(pVar.f200342h);
        effectPointModel.setStartPoint((int) pVar.f200337c);
        effectPointModel.setEndPoint((int) pVar.f200338d);
        effectPointModel.setUiStartPoint((int) pVar.f200339e);
        effectPointModel.setUiEndPoint((int) pVar.f200340f);
        effectPointModel.setName(pVar.f200346l);
        effectPointModel.setCategory(pVar.f200348n);
        effectPointModel.setExtra(pVar.f200349o);
        arrayList.add(effectPointModel);
    }

    /* renamed from: a */
    public final int mo142720a(AudioRecorderParam audioRecorderParam, C70857g gVar) {
        C89219l.m154721d(audioRecorderParam, "");
        C89219l.m154721d(gVar, "");
        if (audioRecorderParam.getNeedDel()) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56351e(audioRecorderParam.getAudioRecordIndex());
            audioRecorderParam.setNeedDel(false);
            audioRecorderParam.setAudioRecordIndex(-2);
            this.f200150k = -1;
            return -2;
        } else if (!audioRecorderParam.hasRecord()) {
            return -1;
        } else {
            if (audioRecorderParam.getAudioRecordIndex() >= 0) {
                int audioRecordIndex = audioRecorderParam.getAudioRecordIndex();
                this.f200149j = audioRecordIndex;
                return audioRecordIndex;
            }
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            String audioUrl = audioRecorderParam.getAudioUrl();
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            this.f200149j = fVar2.mo56287a(audioUrl, 0, fVar3.mo56368j(), false);
            C88288n nVar = this.f200153n;
            if (C89219l.m154714a((Object) (nVar != null ? nVar.f200325d : null), (Object) "apply") && this.f200150k == -1) {
                mo142727a(nVar, nVar, gVar);
            }
            audioRecorderParam.setAudioRecordIndex(this.f200149j);
            return this.f200149j;
        }
    }

    /* renamed from: a */
    public final void mo142727a(C88288n nVar, C88288n nVar2, C70857g gVar) {
        C89219l.m154721d(nVar2, "");
        C89219l.m154721d(gVar, "");
        boolean z = nVar2.f200326e;
        String str = nVar2.f200325d;
        switch (str.hashCode()) {
            case -934343034:
                if (str.equals("revoke")) {
                    m153267b(nVar2);
                    return;
                }
                return;
            case -788452891:
                if (str.equals("stop_apply_segment")) {
                    m153258a(nVar2);
                    return;
                }
                return;
            case 93029230:
                if (str.equals("apply")) {
                    m153260a(nVar, nVar2, gVar, z);
                    return;
                }
                return;
            case 94746189:
                if (str.equals("clear")) {
                    m153268b(nVar, nVar2, z);
                    return;
                }
                return;
            case 116685666:
                if (str.equals("apply_segment")) {
                    m153259a(nVar2, gVar);
                    return;
                }
                return;
            case 1645967087:
                if (str.equals("add_effect")) {
                    List<IAudioEffectParam> list = nVar2.f200328g;
                    if (list == null) {
                        C89219l.m154715b();
                    }
                    m153263a(list, gVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m153260a(C88288n nVar, C88288n nVar2, C70857g gVar, boolean z) {
        this.f200153n = nVar2;
        if (nVar2.f200327f != null) {
            Callable<Boolean> a = m153253a(nVar, nVar2, z, gVar);
            AbstractC1729g<Boolean, C89391z> c = m153270c(nVar2);
            if (this.f200156q) {
                C1731i.m5636a(a, m153276l()).mo5533a(new C88201g(m153278n(), this, nVar2, nVar, z, gVar), m153276l()).mo5533a(c, C1731i.f5564c);
            } else {
                C1731i.m5639b((Callable) a).mo5533a(c, C1731i.f5564c);
            }
        }
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
    }

    /* renamed from: a */
    private void m153263a(List<? extends IAudioEffectParam> list, C70857g gVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(gVar, "");
        CallableC88192b bVar = new CallableC88192b(this, list, true, gVar);
        if (this.f200156q) {
            C1731i.m5636a(bVar, m153276l());
        } else {
            C1731i.m5639b((Callable) bVar);
        }
    }

    /* renamed from: a */
    public final void mo142728a(C88288n nVar, C88288n nVar2, boolean z) {
        int i;
        if (nVar != null) {
            if (z) {
                i = nVar.f200323b.get();
            } else {
                i = nVar.f200322a.get();
            }
            int[] iArr = nVar.f200324c.get() > 0 ? new int[]{i, nVar.f200324c.get()} : new int[]{i};
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56339c(iArr);
            if (z) {
                AtomicInteger atomicInteger = nVar.f200322a;
                C89219l.m154721d(atomicInteger, "");
                nVar2.f200322a = atomicInteger;
            } else {
                AtomicInteger atomicInteger2 = nVar.f200323b;
                C89219l.m154721d(atomicInteger2, "");
                nVar2.f200323b = atomicInteger2;
            }
        }
        if (z) {
            nVar2.f200323b.set(-1);
        } else {
            nVar2.f200322a.set(-1);
        }
    }

    /* renamed from: a */
    public final boolean mo142738a(C88300w wVar, C88300w wVar2) {
        C89219l.m154721d(wVar2, "");
        boolean n = m153278n();
        Iterator<T> it = m153277m().f108017a.iterator();
        while (it.hasNext()) {
            it.next().mo78833a(wVar == null ? C88300w.m153449a() : wVar);
        }
        if (wVar != null) {
            if (C88300w.m153452a(wVar)) {
                C1213t<Boolean> tVar = this.f200140a;
                if (tVar != null) {
                    tVar.setValue(false);
                }
            } else if (C88300w.m153455b(wVar)) {
                AbstractC31071f fVar = this.f200146g;
                if (fVar == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar.mo56389t(wVar.f200388e);
            } else if (C88300w.m153456c(wVar)) {
                AbstractC31071f fVar2 = this.f200146g;
                if (fVar2 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar2.mo56389t(wVar.f200388e);
            }
        }
        if (C88300w.m153452a(wVar2)) {
            C1213t<Boolean> tVar2 = this.f200140a;
            if (tVar2 != null) {
                tVar2.setValue(true);
            }
        } else if (C88300w.m153455b(wVar2)) {
            int i = (int) wVar2.f200385b;
            VERepeatFilterParam vERepeatFilterParam = new VERepeatFilterParam();
            vERepeatFilterParam.seqIn = i;
            vERepeatFilterParam.repeatTime = wVar2.f200387d;
            vERepeatFilterParam.repeatDuration = (int) (m153251a(wVar2.f200386c) - wVar2.f200385b);
            vERepeatFilterParam.timeMode = C85581w.EnumC85609h.EDITOR_SLOMO_MODE.ordinal();
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            m153262a(wVar2, fVar3.mo56279a(vERepeatFilterParam));
        } else if (C88300w.m153456c(wVar2)) {
            int i2 = (int) wVar2.f200385b;
            VESlowMotionFilterParam vESlowMotionFilterParam = new VESlowMotionFilterParam();
            vESlowMotionFilterParam.seqIn = i2;
            vESlowMotionFilterParam.slowMotionDuration = (int) (m153251a(wVar2.f200386c) - wVar2.f200385b);
            vESlowMotionFilterParam.slowMotionSpeed = 0.5f;
            vESlowMotionFilterParam.timeMode = C85581w.EnumC85609h.EDITOR_SLOMO_MODE.ordinal();
            AbstractC31071f fVar4 = this.f200146g;
            if (fVar4 == null) {
                C89219l.m154710a("mVEEditor");
            }
            m153262a(wVar2, fVar4.mo56279a(vESlowMotionFilterParam));
        }
        Iterator<T> it2 = m153277m().f108017a.iterator();
        while (it2.hasNext()) {
            it2.next().mo78836b(wVar2 == null ? C88300w.m153449a() : wVar2);
        }
        mo142742b(n);
        return false;
    }

    /* renamed from: a */
    private final void m153262a(C88300w wVar, int i) {
        if (i >= 0) {
            wVar.f200388e = i;
        }
        C1213t<C88300w> tVar = this.f200141b;
        if (tVar != null) {
            tVar.setValue(wVar);
        }
    }

    /* renamed from: a */
    public final boolean mo142731a(FilterBean filterBean, boolean z) {
        float f;
        if (filterBean == null) {
            return false;
        }
        if (z) {
            f = C50648c.m94909a(filterBean, mo142718a(), this.f200134I);
            if (f == -1.0f) {
                f = 0.8f;
            }
        } else {
            f = 1.0f;
        }
        m153257a(filterBean, f, z);
        return false;
    }

    /* renamed from: a */
    public final void mo142725a(FilterBean filterBean) {
        if (filterBean != null) {
            float a = C50648c.m94909a(filterBean, mo142718a(), this.f200134I);
            if (a == -1.0f) {
                a = 0.8f;
            }
            m153257a(filterBean, a, true);
        }
    }

    /* renamed from: a */
    public final String mo142721a(FilterBean filterBean, String str) {
        if (filterBean == null) {
            return null;
        }
        mo142750j();
        if (!TextUtils.isEmpty(this.f200165z)) {
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            vEComposerFilterParam.removeComposerNodes(new String[]{this.f200165z});
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56263a(this.f200137L, vEComposerFilterParam);
        }
        VEComposerFilterParam vEComposerFilterParam2 = new VEComposerFilterParam();
        vEComposerFilterParam2.autoDump = true;
        vEComposerFilterParam2.appendComposerNodesWithTag(new String[]{str}, new String[]{""});
        AbstractC31071f fVar2 = this.f200146g;
        if (fVar2 == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar2.mo56263a(this.f200137L, vEComposerFilterParam2);
        this.f200165z = str;
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
        return this.f200165z;
    }

    /* renamed from: a */
    public final float mo142719a(String str) {
        C89219l.m154721d(str, "");
        if (this.f200146g == null) {
            return 0.0f;
        }
        AbstractC31071f fVar = this.f200146g;
        if (fVar == null) {
            C89219l.m154710a("mVEEditor");
        }
        float c = fVar.mo56335c(str);
        if (this.f200146g != null) {
            return c;
        }
        C89219l.m154710a("mVEEditor");
        return c;
    }

    /* renamed from: a */
    public final void mo142724a(MultiSegmentPropExtra multiSegmentPropExtra) {
        if (!(multiSegmentPropExtra == null || multiSegmentPropExtra.getClips().isEmpty() || this.f200146g == null)) {
            List<ClipsModel> clips = multiSegmentPropExtra.getClips();
            int[] iArr = new int[clips.size()];
            int size = clips.size();
            VEClipTimelineParam[] vEClipTimelineParamArr = new VEClipTimelineParam[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = i;
                ClipsModel clipsModel = clips.get(i);
                float component3 = clipsModel.component3();
                List<Float> component4 = clipsModel.component4();
                List<Float> component5 = clipsModel.component5();
                float[] a = C85577a.m147482a(component4);
                float[] a2 = C85577a.m147482a(component5);
                float[] transferTrimPointXtoSeqPointX = VECurveSpeedUtils.transferTrimPointXtoSeqPointX(a, a2);
                double aveCurveSpeed = new VECurveSpeedUtils(transferTrimPointXtoSeqPointX, a2).getAveCurveSpeed();
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.curveSpeedPointX = transferTrimPointXtoSeqPointX;
                vEClipTimelineParam.curveSpeedPointY = a2;
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) (component3 * 1000.0f);
                vEClipTimelineParam.speed = aveCurveSpeed;
                vEClipTimelineParamArr[i] = vEClipTimelineParam;
            }
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56361g(false);
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar2.mo56249J();
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar3.mo56271a(0, iArr, vEClipTimelineParamArr);
            AbstractC31071f fVar4 = this.f200146g;
            if (fVar4 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar4.mo56271a(1, iArr, vEClipTimelineParamArr);
            AbstractC31071f fVar5 = this.f200146g;
            if (fVar5 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar5.mo56361g(true);
        }
    }

    /* renamed from: a */
    public final boolean mo142737a(C88299v vVar) {
        C88294r rVar;
        int a;
        C89219l.m154721d(vVar, "");
        if (this.f200148i != -1) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56351e(this.f200148i);
        }
        if (!TextUtils.isEmpty(vVar.f200382a) && (rVar = this.f200154o) != null) {
            if (rVar.f200353d != 0) {
                AbstractC31071f fVar2 = this.f200146g;
                if (fVar2 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                String str = vVar.f200382a;
                C89219l.m154716b(str, "");
                a = fVar2.mo56285a(str, rVar.f200351b, rVar.f200352c, rVar.f200353d, rVar.f200354e, vVar.f200383b);
            } else {
                AbstractC31071f fVar3 = this.f200146g;
                if (fVar3 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                String str2 = vVar.f200382a;
                C89219l.m154716b(str2, "");
                a = fVar3.mo56287a(str2, rVar.f200351b, rVar.f200352c, vVar.f200383b);
            }
            this.f200148i = a;
            this.f200136K = -1;
            if (rVar.f200357h != 0.0d) {
                if (rVar.f200359j) {
                    mo142722a(this.f200148i, rVar.f200357h, rVar.f200360k, rVar.f200361l);
                } else {
                    String str3 = vVar.f200382a;
                    C89219l.m154716b(str3, "");
                    m153269b(str3);
                }
            }
            rVar.f200350a = this.f200148i;
        }
        if (this.f200146g != null) {
            return false;
        }
        C89219l.m154710a("mVEEditor");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$ac */
    public static final class C88186ac extends AbstractC89220m implements AbstractC89171a<AbstractC31071f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200172a;

        static {
            Covode.recordClassIndex(104221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88186ac(AbstractC88181j jVar) {
            super(0);
            this.f200172a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC31071f invoke() {
            return this.f200172a.mo142743c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$ad */
    public static final class C88187ad extends AbstractC89220m implements AbstractC89171a<List<? extends EffectPointModel>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200173a;

        static {
            Covode.recordClassIndex(104222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88187ad(AbstractC88181j jVar) {
            super(0);
            this.f200173a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<? extends EffectPointModel> invoke() {
            return this.f200173a.f200143d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$ag */
    public static final class C88190ag extends AbstractC89220m implements AbstractC89171a<C88294r> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200176a;

        static {
            Covode.recordClassIndex(104225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88190ag(AbstractC88181j jVar) {
            super(0);
            this.f200176a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C88294r invoke() {
            return this.f200176a.f200154o;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$ah */
    public static final class C88191ah extends AbstractC89220m implements AbstractC89171a<C1213t<IAudioEffectParam>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200177a;

        static {
            Covode.recordClassIndex(104226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88191ah(AbstractC88181j jVar) {
            super(0);
            this.f200177a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C1213t<IAudioEffectParam> invoke() {
            return this.f200177a.f200142c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$l */
    public static final class RunnableC88208l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200216a;

        /* renamed from: b */
        final /* synthetic */ C88296t f200217b;

        static {
            Covode.recordClassIndex(104243);
        }

        RunnableC88208l(AbstractC88181j jVar, C88296t tVar) {
            this.f200216a = jVar;
            this.f200217b = tVar;
        }

        public final void run() {
            this.f200216a.mo142741b(this.f200217b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$aa */
    public static final class RunnableC88183aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200166a;

        /* renamed from: b */
        final /* synthetic */ C88296t f200167b;

        /* renamed from: c */
        final /* synthetic */ Runnable f200168c;

        static {
            Covode.recordClassIndex(104218);
        }

        RunnableC88183aa(AbstractC88181j jVar, C88296t tVar, Runnable runnable) {
            this.f200166a = jVar;
            this.f200167b = tVar;
            this.f200168c = runnable;
        }

        public final void run() {
            this.f200166a.mo142729a(this.f200167b, this.f200168c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$h */
    public static final class CallableC88202h<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200204a;

        /* renamed from: b */
        final /* synthetic */ C88288n f200205b;

        /* renamed from: c */
        final /* synthetic */ C88288n f200206c;

        /* renamed from: d */
        final /* synthetic */ boolean f200207d;

        static {
            Covode.recordClassIndex(104237);
        }

        CallableC88202h(AbstractC88181j jVar, C88288n nVar, C88288n nVar2, boolean z) {
            this.f200204a = jVar;
            this.f200205b = nVar;
            this.f200206c = nVar2;
            this.f200207d = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            this.f200204a.mo142728a(this.f200205b, this.f200206c, this.f200207d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$j */
    public static final class RunnableC88204j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200212a;

        static {
            Covode.recordClassIndex(104239);
        }

        RunnableC88204j(AbstractC88181j jVar) {
            this.f200212a = jVar;
        }

        public final void run() {
            SafeHandler safeHandler = this.f200212a.f200159t;
            if (safeHandler != null) {
                safeHandler.post(new Runnable(this) {
                    /* class dmt.p4542av.video.p4545b.AbstractC88181j.RunnableC88204j.RunnableC882051 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC88204j f200213a;

                    static {
                        Covode.recordClassIndex(104240);
                    }

                    {
                        this.f200213a = r1;
                    }

                    public final void run() {
                        this.f200213a.f200212a.mo142745e();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$k */
    public static final class RunnableC88206k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200214a;

        static {
            Covode.recordClassIndex(104241);
        }

        RunnableC88206k(AbstractC88181j jVar) {
            this.f200214a = jVar;
        }

        public final void run() {
            SafeHandler safeHandler = this.f200214a.f200159t;
            if (safeHandler != null) {
                safeHandler.post(new Runnable(this) {
                    /* class dmt.p4542av.video.p4545b.AbstractC88181j.RunnableC88206k.RunnableC882071 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC88206k f200215a;

                    static {
                        Covode.recordClassIndex(104242);
                    }

                    {
                        this.f200215a = r1;
                    }

                    public final void run() {
                        this.f200215a.f200214a.mo142746f();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$m */
    public static final class RunnableC88209m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200218a;

        /* renamed from: b */
        final /* synthetic */ C88296t f200219b;

        static {
            Covode.recordClassIndex(104244);
        }

        RunnableC88209m(AbstractC88181j jVar, C88296t tVar) {
            this.f200218a = jVar;
            this.f200219b = tVar;
        }

        public final void run() {
            this.f200218a.mo142729a(this.f200219b, (Runnable) null);
        }
    }

    /* renamed from: dmt.av.video.b.j$t */
    static final class RunnableC88218t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200234a;

        static {
            Covode.recordClassIndex(104253);
        }

        RunnableC88218t(AbstractC88181j jVar) {
            this.f200234a = jVar;
        }

        public final void run() {
            this.f200234a.mo142743c().mo56381p();
        }
    }

    /* renamed from: l */
    private final Executor m153276l() {
        Executor executor = this.f200133H;
        if (executor != null) {
            return executor;
        }
        ExecutorService k = m153275k();
        this.f200133H = k;
        C89219l.m154716b(k, "");
        return k;
    }

    /* renamed from: n */
    private final boolean m153278n() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f200144e;
        if (vEEditorAutoStartStopArbiter == null) {
            return false;
        }
        boolean z = vEEditorAutoStartStopArbiter.f200066a;
        if (z) {
            return z;
        }
        vEEditorAutoStartStopArbiter.mo142666a(true);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AbstractC31071f mo142743c() {
        AbstractC31071f fVar = this.f200146g;
        if (fVar == null) {
            C89219l.m154710a("mVEEditor");
        }
        return fVar;
    }

    /* renamed from: f */
    public final void mo142746f() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f200144e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.mo142666a(true);
        }
    }

    static {
        Covode.recordClassIndex(104216);
    }

    /* renamed from: a */
    private final AbstractC50706n mo142718a() {
        AbstractC50706n nVar = this.f200155p;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: k */
    private static ExecutorService m153275k() {
        return C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(1).mo70028a());
    }

    /* renamed from: d */
    public final int mo142744d() {
        if (this.f200146g == null) {
            return 0;
        }
        AbstractC31071f fVar = this.f200146g;
        if (fVar == null) {
            C89219l.m154710a("mVEEditor");
        }
        return fVar.mo56246G();
    }

    /* renamed from: e */
    public final void mo142745e() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f200144e;
        if (vEEditorAutoStartStopArbiter == null) {
            return;
        }
        if (vEEditorAutoStartStopArbiter.f200066a) {
            vEEditorAutoStartStopArbiter.mo142666a(false);
        } else {
            vEEditorAutoStartStopArbiter.mo142668b();
        }
    }

    /* renamed from: i */
    public final void mo142749i() {
        C88221w wVar = new C88221w(this);
        AbstractC31071f fVar = this.f200146g;
        if (fVar == null) {
            C89219l.m154710a("mVEEditor");
        }
        fVar.mo56344c(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$ab */
    public static final class RunnableC88184ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200169a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f200170b;

        static {
            Covode.recordClassIndex(104219);
        }

        RunnableC88184ab(AbstractC88181j jVar, CountDownLatch countDownLatch) {
            this.f200169a = jVar;
            this.f200170b = countDownLatch;
        }

        public final void run() {
            SafeHandler safeHandler;
            this.f200170b.countDown();
            if (this.f200169a.f200159t == null && (this.f200169a.f200145f instanceof AbstractC1204m)) {
                AbstractC88181j jVar = this.f200169a;
                Context context = this.f200169a.f200145f;
                Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                jVar.f200159t = new SafeHandler((AbstractC1204m) context);
            }
            if (this.f200169a.f200158s != null && (safeHandler = this.f200169a.f200159t) != null) {
                safeHandler.post(new Runnable(this) {
                    /* class dmt.p4542av.video.p4545b.AbstractC88181j.RunnableC88184ab.RunnableC881851 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC88184ab f200171a;

                    static {
                        Covode.recordClassIndex(104220);
                    }

                    {
                        this.f200171a = r1;
                    }

                    public final void run() {
                        C85056k.m146253b(this.f200171a.f200169a.f200158s);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$c */
    public static final class CallableC88195c<V> implements Callable<LoudnessDetectResult[]> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200185a;

        /* renamed from: b */
        final /* synthetic */ String f200186b;

        static {
            Covode.recordClassIndex(104230);
        }

        CallableC88195c(AbstractC88181j jVar, String str) {
            this.f200185a = jVar;
            this.f200186b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ LoudnessDetectResult[] call() {
            C88294r rVar = this.f200185a.f200154o;
            if (rVar == null) {
                C89219l.m154715b();
            }
            return C85581w.m147499a(new String[]{this.f200186b}, new int[]{rVar.f200351b}, new int[]{rVar.f200352c});
        }
    }

    /* renamed from: g */
    public final void mo142747g() {
        FilterBean filterBean = this.f200129B;
        if (filterBean != null && C50811a.m95159a(filterBean)) {
            mo142750j();
            if (this.f200137L != -1) {
                VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                vEComposerFilterParam.autoDump = true;
                vEComposerFilterParam.setComposerMode(1, 0);
                AbstractC31071f fVar = this.f200146g;
                if (fVar == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar.mo56263a(this.f200137L, vEComposerFilterParam);
                mo142725a(filterBean);
            }
            if (this.f200146g == null) {
                C89219l.m154710a("mVEEditor");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$x */
    public static final class CallableC88223x<V> implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200242a;

        /* renamed from: b */
        final /* synthetic */ int f200243b;

        static {
            Covode.recordClassIndex(104258);
        }

        CallableC88223x(AbstractC88181j jVar, int i) {
            this.f200242a = jVar;
            this.f200243b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            if (this.f200242a.f200152m.size() == 0) {
                return -1;
            }
            int i = 0;
            int h = this.f200242a.mo142743c().mo56363h(this.f200242a.f200152m.get(this.f200242a.f200152m.size() - 1).intValue(), this.f200243b);
            if (this.f200242a.f200149j >= 0) {
                i = this.f200242a.mo142743c().mo56363h(this.f200242a.f200151l.get(this.f200242a.f200151l.size() - 1).intValue(), this.f200243b);
            }
            return Integer.valueOf(i | h);
        }
    }

    /* renamed from: m */
    private final C46339b m153277m() {
        C46339b bVar = this.f200138M;
        if (bVar != null) {
            return bVar;
        }
        C46339b bVar2 = new C46339b();
        C88186ac acVar = new C88186ac(this);
        bVar2.mo78837a(new C46341d(acVar, new C88187ad(this), new C88188ae(this), new C88189af(this)));
        bVar2.mo78837a(new C46342e(acVar, new C88190ag(this)));
        bVar2.mo78837a(new C46340c(acVar, new C88191ah(this)));
        this.f200138M = bVar2;
        return bVar2;
    }

    /* renamed from: h */
    public final void mo142748h() {
        FilterBean filterBean = this.f200129B;
        if (filterBean != null && C50811a.m95159a(filterBean)) {
            mo142750j();
            C84401c.f188722f.mo123658a("append composer filter in composer callback, filter resId: " + filterBean.getResId());
            float f = this.f200130C;
            if (f == -1.0f) {
                f = C50648c.m94909a(filterBean, mo142718a(), this.f200134I);
            }
            if (f == -1.0f) {
                f = 0.8f;
            }
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            vEComposerFilterParam.appendComposerNodesWithTag(new String[]{C50811a.m95158a(filterBean, f)}, new String[]{""});
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56263a(this.f200137L, vEComposerFilterParam);
        }
    }

    /* renamed from: j */
    public final int mo142750j() {
        if (this.f200146g == null) {
            return -1;
        }
        if (this.f200137L == -1) {
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            this.f200137L = fVar.mo56258a(0, 0, vEComposerFilterParam);
            vEComposerFilterParam.setComposerMode(1, 0);
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar2.mo56263a(this.f200137L, vEComposerFilterParam);
        }
        this.f200160u.mo123662d(f200126F + "enableComposerFilter: mComposerFilterIndex = " + this.f200137L);
        return this.f200137L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$b */
    public static final class CallableC88192b<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200178a;

        /* renamed from: b */
        final /* synthetic */ List f200179b;

        /* renamed from: c */
        final /* synthetic */ boolean f200180c = true;

        /* renamed from: d */
        final /* synthetic */ C70857g f200181d;

        /* renamed from: e */
        final /* synthetic */ boolean f200182e;

        static {
            Covode.recordClassIndex(104227);
        }

        CallableC88192b(AbstractC88181j jVar, List list, boolean z, C70857g gVar) {
            this.f200178a = jVar;
            this.f200179b = list;
            this.f200181d = gVar;
            this.f200182e = true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            boolean z;
            Object[] objArr = new Object[3];
            objArr[0] = AbstractC88181j.f200126F;
            if (this.f200178a.f200149j >= 0) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            Object[] array = this.f200179b.toArray(new IAudioEffectParam[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String arrays = Arrays.toString(array);
            C89219l.m154716b(arrays, "");
            objArr[2] = arrays;
            C89219l.m154716b(C1764a.m5928a("%s hasRecord %b params %s", Arrays.copyOf(objArr, 3)), "");
            if (this.f200180c) {
                for (IAudioEffectParam iAudioEffectParam : this.f200179b) {
                    this.f200178a.f200152m.add(Integer.valueOf(this.f200178a.mo142743c().mo56260a(this.f200178a.mo142743c().mo56393x(), this.f200178a.mo142743c().mo56394y(), iAudioEffectParam.getEffectPath(), this.f200181d.mo112029a(iAudioEffectParam.getEffectPath()), iAudioEffectParam.getSeqIn(), iAudioEffectParam.getSeqOut(), new C88193a(this))));
                }
            }
            if (this.f200182e && this.f200178a.f200149j >= 0) {
                for (IAudioEffectParam iAudioEffectParam2 : this.f200179b) {
                    this.f200178a.f200151l.add(Integer.valueOf(this.f200178a.mo142743c().mo56260a(1, this.f200178a.f200149j, iAudioEffectParam2.getEffectPath(), this.f200181d.mo112029a(iAudioEffectParam2.getEffectPath()), iAudioEffectParam2.getSeqIn(), iAudioEffectParam2.getSeqOut(), new C88194b(this))));
                }
            }
            return C89391z.f203057a;
        }

        /* renamed from: dmt.av.video.b.j$b$a */
        static final class C88193a implements VEListener.AbstractC85221a {

            /* renamed from: a */
            final /* synthetic */ CallableC88192b f200183a;

            static {
                Covode.recordClassIndex(104228);
            }

            C88193a(CallableC88192b bVar) {
                this.f200183a = bVar;
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85221a
            /* renamed from: a */
            public final void mo130302a(String str, int i, byte[] bArr) {
                if (i >= 0) {
                    this.f200183a.f200181d.mo112028a(str, bArr);
                }
            }
        }

        /* renamed from: dmt.av.video.b.j$b$b */
        static final class C88194b implements VEListener.AbstractC85221a {

            /* renamed from: a */
            final /* synthetic */ CallableC88192b f200184a;

            static {
                Covode.recordClassIndex(104229);
            }

            C88194b(CallableC88192b bVar) {
                this.f200184a = bVar;
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85221a
            /* renamed from: a */
            public final void mo130302a(String str, int i, byte[] bArr) {
                if (i >= 0) {
                    this.f200184a.f200181d.mo112028a(str, bArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$e */
    public static final class CallableC88197e<V> implements Callable<List<Integer>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200188a;

        /* renamed from: b */
        final /* synthetic */ IAudioEffectParam f200189b;

        /* renamed from: c */
        final /* synthetic */ C70857g f200190c;

        /* renamed from: d */
        final /* synthetic */ AbstractC88169b f200191d;

        static {
            Covode.recordClassIndex(104232);
        }

        CallableC88197e(AbstractC88181j jVar, IAudioEffectParam iAudioEffectParam, C70857g gVar, AbstractC88169b bVar) {
            this.f200188a = jVar;
            this.f200189b = iAudioEffectParam;
            this.f200190c = gVar;
            this.f200191d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<Integer> call() {
            ArrayList arrayList = new ArrayList();
            int a = this.f200188a.mo142743c().mo56295a(new int[]{this.f200188a.mo142743c().mo56393x(), this.f200188a.mo142743c().mo56394y(), this.f200189b.getSeqIn()}, this.f200189b.getEffectPath(), this.f200190c.mo112029a(this.f200189b.getEffectPath()), new VEListener.AbstractC85221a(this) {
                /* class dmt.p4542av.video.p4545b.AbstractC88181j.CallableC88197e.C881981 */

                /* renamed from: a */
                final /* synthetic */ CallableC88197e f200192a;

                static {
                    Covode.recordClassIndex(104233);
                }

                {
                    this.f200192a = r1;
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85221a
                /* renamed from: a */
                public final void mo130302a(String str, int i, byte[] bArr) {
                    if (i >= 0) {
                        this.f200192a.f200190c.mo112028a(str, bArr);
                    }
                }
            });
            this.f200188a.f200152m.add(Integer.valueOf(a));
            arrayList.add(Integer.valueOf(a));
            if (this.f200188a.f200149j >= 0) {
                this.f200188a.f200151l.add(Integer.valueOf(this.f200188a.mo142743c().mo56295a(new int[]{1, this.f200188a.f200149j, this.f200189b.getSeqIn()}, this.f200189b.getEffectPath(), this.f200190c.mo112029a(this.f200189b.getEffectPath()), new VEListener.AbstractC85221a(this) {
                    /* class dmt.p4542av.video.p4545b.AbstractC88181j.CallableC88197e.C881992 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC88197e f200193a;

                    static {
                        Covode.recordClassIndex(104234);
                    }

                    {
                        this.f200193a = r1;
                    }

                    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85221a
                    /* renamed from: a */
                    public final void mo130302a(String str, int i, byte[] bArr) {
                        if (i >= 0) {
                            this.f200193a.f200190c.mo112028a(str, bArr);
                        }
                    }
                })));
                arrayList.add(Integer.valueOf(this.f200188a.f200149j));
            }
            C89219l.m154716b(C1764a.m5928a("%s apply audio effect path %s seqIn %d filter index %s", Arrays.copyOf(new Object[]{AbstractC88181j.f200126F, this.f200189b.getEffectPath(), Integer.valueOf(this.f200189b.getSeqIn()), arrayList.toString()}, 4)), "");
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$p */
    public static final class CallableC88212p<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200223a;

        /* renamed from: b */
        final /* synthetic */ C88288n f200224b;

        /* renamed from: c */
        final /* synthetic */ C88288n f200225c;

        /* renamed from: d */
        final /* synthetic */ boolean f200226d;

        /* renamed from: e */
        final /* synthetic */ C70857g f200227e;

        static {
            Covode.recordClassIndex(104247);
        }

        CallableC88212p(AbstractC88181j jVar, C88288n nVar, C88288n nVar2, boolean z, C70857g gVar) {
            this.f200223a = jVar;
            this.f200224b = nVar;
            this.f200225c = nVar2;
            this.f200226d = z;
            this.f200227e = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            int trackType;
            int trackIndex;
            this.f200223a.mo142728a(this.f200224b, this.f200225c, this.f200226d);
            IAudioEffectParam iAudioEffectParam = this.f200225c.f200327f;
            boolean z = false;
            if (iAudioEffectParam != null && C84902i.m145892a(iAudioEffectParam.getEffectPath())) {
                if (this.f200226d) {
                    trackType = this.f200223a.mo142743c().mo56393x();
                } else {
                    trackType = iAudioEffectParam.getTrackType();
                }
                if (this.f200226d) {
                    trackIndex = this.f200223a.mo142743c().mo56394y();
                } else {
                    trackIndex = iAudioEffectParam.getTrackIndex();
                }
                System.currentTimeMillis();
                int a = this.f200223a.mo142743c().mo56260a(trackType, trackIndex, iAudioEffectParam.getEffectPath(), this.f200227e.mo112029a(iAudioEffectParam.getEffectPath()), iAudioEffectParam.getSeqIn(), iAudioEffectParam.getSeqOut(), new VEListener.AbstractC85221a(this) {
                    /* class dmt.p4542av.video.p4545b.AbstractC88181j.CallableC88212p.C882131 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC88212p f200228a;

                    static {
                        Covode.recordClassIndex(104248);
                    }

                    {
                        this.f200228a = r1;
                    }

                    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85221a
                    /* renamed from: a */
                    public final void mo130302a(String str, int i, byte[] bArr) {
                        if (i >= 0) {
                            this.f200228a.f200227e.mo112028a(str, bArr);
                        }
                    }
                });
                System.currentTimeMillis();
                if (this.f200226d) {
                    this.f200225c.f200323b.set(a);
                } else {
                    this.f200225c.f200322a.set(a);
                }
                int i = -1;
                if (this.f200223a.f200149j >= 0) {
                    System.currentTimeMillis();
                    i = this.f200223a.mo142743c().mo56260a(1, this.f200223a.f200149j, iAudioEffectParam.getEffectPath(), this.f200227e.mo112029a(iAudioEffectParam.getEffectPath()), iAudioEffectParam.getSeqIn(), iAudioEffectParam.getSeqOut(), new VEListener.AbstractC85221a(this) {
                        /* class dmt.p4542av.video.p4545b.AbstractC88181j.CallableC88212p.C882142 */

                        /* renamed from: a */
                        final /* synthetic */ CallableC88212p f200229a;

                        static {
                            Covode.recordClassIndex(104249);
                        }

                        {
                            this.f200229a = r1;
                        }

                        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85221a
                        /* renamed from: a */
                        public final void mo130302a(String str, int i, byte[] bArr) {
                            if (i >= 0) {
                                this.f200229a.f200227e.mo112028a(str, bArr);
                            }
                        }
                    });
                    System.currentTimeMillis();
                    this.f200223a.f200150k = i;
                    this.f200225c.f200324c.set(i);
                }
                if (a >= 0 || (this.f200223a.f200149j >= 0 && i >= 0)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$u */
    public static final class CallableC88219u<V> implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200235a;

        /* renamed from: b */
        final /* synthetic */ boolean f200236b = true;

        /* renamed from: c */
        final /* synthetic */ int f200237c;

        /* renamed from: d */
        final /* synthetic */ boolean f200238d;

        static {
            Covode.recordClassIndex(104254);
        }

        CallableC88219u(AbstractC88181j jVar, boolean z, int i) {
            this.f200235a = jVar;
            this.f200237c = i;
            this.f200238d = true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            int size;
            int i;
            int size2;
            int i2;
            ArrayList arrayList = new ArrayList();
            if (this.f200236b && this.f200237c <= this.f200235a.f200152m.size() && this.f200235a.f200152m.size() - 1 >= (size2 = this.f200235a.f200152m.size() - this.f200237c)) {
                while (true) {
                    arrayList.add(this.f200235a.f200152m.get(i2));
                    if (i2 == size2) {
                        break;
                    }
                    i2--;
                }
            }
            if (this.f200238d && this.f200235a.f200149j >= 0 && this.f200237c <= this.f200235a.f200151l.size() && this.f200235a.f200151l.size() - 1 >= (size = this.f200235a.f200151l.size() - this.f200237c)) {
                while (true) {
                    arrayList.add(this.f200235a.f200151l.get(i));
                    if (i == size) {
                        break;
                    }
                    i--;
                }
            }
            if (arrayList.size() == 0) {
                return 0;
            }
            int size3 = arrayList.size();
            int[] iArr = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr[i3] = ((Number) arrayList.get(i3)).intValue();
            }
            int c = this.f200235a.mo142743c().mo56339c(iArr);
            if (c == 0) {
                if (this.f200237c <= this.f200235a.f200152m.size()) {
                    AbstractC88181j jVar = this.f200235a;
                    jVar.f200152m = jVar.f200152m.subList(0, this.f200235a.f200152m.size() - this.f200237c);
                }
                if (this.f200237c <= this.f200235a.f200151l.size()) {
                    AbstractC88181j jVar2 = this.f200235a;
                    jVar2.f200151l = jVar2.f200151l.subList(0, this.f200235a.f200151l.size() - this.f200237c);
                }
            }
            return Integer.valueOf(c);
        }
    }

    /* renamed from: b */
    public final AbstractC31071f mo142739b() {
        AbstractC31071f fVar = this.f200146g;
        if (fVar != null) {
            return fVar;
        }
        C89219l.m154710a("mVEEditor");
        throw new IllegalArgumentException("initVEEditor not called yet".toString());
    }

    /* renamed from: dmt.av.video.b.j$s */
    public static final class C88217s implements AbstractC50703k {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200233a;

        static {
            Covode.recordClassIndex(104252);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C88217s(AbstractC88181j jVar) {
            this.f200233a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
        /* renamed from: a */
        public final float mo23007a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            float c = C50811a.m95161c(filterBean);
            if (c != 0.0f || this.f200233a.f200146g == null) {
                return c;
            }
            AbstractC31071f c2 = this.f200233a.mo142743c();
            String filterFolder = filterBean.getFilterFolder();
            C89219l.m154716b(filterFolder, "");
            float c3 = c2.mo56335c(filterFolder);
            this.f200233a.mo142743c();
            return c3;
        }
    }

    /* renamed from: b */
    private final void m153267b(C88288n nVar) {
        m153265b(nVar.f200329h);
    }

    /* renamed from: c */
    private final AbstractC1729g<Boolean, C89391z> m153270c(C88288n nVar) {
        return new C88215q(this, nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$i */
    public static final class C88203i<TTaskResult, TContinuationResult> implements AbstractC1729g<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200208a;

        /* renamed from: b */
        final /* synthetic */ C88288n f200209b;

        /* renamed from: c */
        final /* synthetic */ C88288n f200210c;

        /* renamed from: d */
        final /* synthetic */ boolean f200211d;

        static {
            Covode.recordClassIndex(104238);
        }

        C88203i(AbstractC88181j jVar, C88288n nVar, C88288n nVar2, boolean z) {
            this.f200208a = jVar;
            this.f200209b = nVar;
            this.f200210c = nVar2;
            this.f200211d = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<C89391z> iVar) {
            C1213t<IAudioEffectParam> tVar = this.f200208a.f200142c;
            if (tVar == null) {
                return null;
            }
            tVar.setValue(null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final long m153251a(long j) {
        return Math.min((long) mo142744d(), j);
    }

    /* renamed from: b */
    public final void mo142742b(boolean z) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        if (!z && (vEEditorAutoStartStopArbiter = this.f200144e) != null) {
            vEEditorAutoStartStopArbiter.mo142666a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$ae */
    public static final class C88188ae extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200174a;

        static {
            Covode.recordClassIndex(104223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88188ae(AbstractC88181j jVar) {
            super(1);
            this.f200174a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            Integer num2 = num;
            AbstractC31071f c = this.f200174a.mo142743c();
            if (num2 == null) {
                C89219l.m154715b();
            }
            return Integer.valueOf(c.mo56384r(num2.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$af */
    public static final class C88189af extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200175a;

        static {
            Covode.recordClassIndex(104224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88189af(AbstractC88181j jVar) {
            super(1);
            this.f200175a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            Integer num2 = num;
            AbstractC31071f c = this.f200175a.mo142743c();
            if (num2 == null) {
                C89219l.m154715b();
            }
            return Integer.valueOf(c.mo56386s(num2.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$g */
    public static final class C88201g<TTaskResult, TContinuationResult> implements AbstractC1729g<Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f200198a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88181j f200199b;

        /* renamed from: c */
        final /* synthetic */ C88288n f200200c;

        /* renamed from: d */
        final /* synthetic */ C88288n f200201d;

        /* renamed from: e */
        final /* synthetic */ boolean f200202e;

        /* renamed from: f */
        final /* synthetic */ C70857g f200203f;

        static {
            Covode.recordClassIndex(104236);
        }

        C88201g(boolean z, AbstractC88181j jVar, C88288n nVar, C88288n nVar2, boolean z2, C70857g gVar) {
            this.f200198a = z;
            this.f200199b = jVar;
            this.f200200c = nVar;
            this.f200201d = nVar2;
            this.f200202e = z2;
            this.f200203f = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Boolean then(C1731i<Boolean> iVar) {
            C89219l.m154721d(iVar, "");
            this.f200199b.mo142742b(this.f200198a);
            return iVar.mo5545d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$v */
    public static final class C88220v<TTaskResult, TContinuationResult> implements AbstractC1729g<Integer, C89391z> {

        /* renamed from: a */
        public static final C88220v f200239a = new C88220v();

        static {
            Covode.recordClassIndex(104255);
        }

        C88220v() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<Integer> iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c()) {
                iVar.mo5546e().printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$y */
    public static final class C88224y<TTaskResult, TContinuationResult> implements AbstractC1729g<Integer, C89391z> {

        /* renamed from: a */
        public static final C88224y f200244a = new C88224y();

        static {
            Covode.recordClassIndex(104259);
        }

        C88224y() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<Integer> iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c()) {
                iVar.mo5546e().printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m153265b(int i) {
        C1731i.m5636a(new CallableC88219u(this, true, i), m153276l()).mo5532a((AbstractC1729g) C88220v.f200239a);
    }

    /* renamed from: c */
    private final void m153272c(C88296t tVar) {
        int i = tVar.f200366a;
        if (i == 0) {
            mo142745e();
        } else if (i == 1) {
            mo142746f();
        } else if (i == 2 || i == 3 || i == 4) {
            mo142741b(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$d */
    public static final class C88196d<TTaskResult, TContinuationResult> implements AbstractC1729g<LoudnessDetectResult[], C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200187a;

        static {
            Covode.recordClassIndex(104231);
        }

        C88196d(AbstractC88181j jVar) {
            this.f200187a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<LoudnessDetectResult[]> iVar) {
            LoudnessDetectResult loudnessDetectResult;
            C89219l.m154716b(iVar, "");
            LoudnessDetectResult[] d = iVar.mo5545d();
            if (!(d == null || d[0] == null || (loudnessDetectResult = d[0]) == null || loudnessDetectResult.result != 0)) {
                double d2 = d[0].peakLoudness;
                double d3 = d[0].avgLoudness;
                AbstractC88181j jVar = this.f200187a;
                int i = jVar.f200148i;
                C88294r rVar = this.f200187a.f200154o;
                if (rVar == null) {
                    C89219l.m154715b();
                }
                jVar.mo142722a(i, rVar.f200357h, d2, d3);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$f */
    public static final class C88200f<TTaskResult, TContinuationResult> implements AbstractC1729g<List<Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200194a;

        /* renamed from: b */
        final /* synthetic */ IAudioEffectParam f200195b;

        /* renamed from: c */
        final /* synthetic */ C70857g f200196c;

        /* renamed from: d */
        final /* synthetic */ AbstractC88169b f200197d;

        static {
            Covode.recordClassIndex(104235);
        }

        C88200f(AbstractC88181j jVar, IAudioEffectParam iAudioEffectParam, C70857g gVar, AbstractC88169b bVar) {
            this.f200194a = jVar;
            this.f200195b = iAudioEffectParam;
            this.f200196c = gVar;
            this.f200197d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<List<Integer>> iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c()) {
                iVar.mo5546e().printStackTrace();
            }
            if (iVar.mo5535a()) {
                Objects.requireNonNull(iVar.mo5545d(), "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                if (this.f200197d == null) {
                    C89219l.m154715b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$q */
    public static final class C88215q<TTaskResult, TContinuationResult> implements AbstractC1729g<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200230a;

        /* renamed from: b */
        final /* synthetic */ C88288n f200231b;

        static {
            Covode.recordClassIndex(104250);
        }

        C88215q(AbstractC88181j jVar, C88288n nVar) {
            this.f200230a = jVar;
            this.f200231b = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<Boolean> iVar) {
            Context context;
            C89219l.m154721d(iVar, "");
            if (!iVar.mo5545d().booleanValue()) {
                IAudioEffectParam iAudioEffectParam = this.f200231b.f200327f;
                if (!(iAudioEffectParam == null || !iAudioEffectParam.getShowErrorToast() || (context = this.f200230a.f200145f) == null)) {
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C85052j.C85053a.m146245a(applicationContext, (int) R.string.z8, 0).mo129996a();
                }
            } else {
                IAudioEffectParam iAudioEffectParam2 = this.f200231b.f200327f;
                if (iAudioEffectParam2 != null) {
                    iAudioEffectParam2.setPreprocessResult(null);
                    C1213t<IAudioEffectParam> tVar = this.f200230a.f200142c;
                    if (tVar != null) {
                        tVar.setValue(iAudioEffectParam2);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private void m153254a(int i) {
        C1731i.m5636a(new CallableC88223x(this, i), m153276l()).mo5532a((AbstractC1729g) C88224y.f200244a);
    }

    /* renamed from: b */
    private void m153269b(String str) {
        C89219l.m154721d(str, "");
        C1731i.m5635a((Callable) new CallableC88195c(this, str)).mo5532a((AbstractC1729g) new C88196d(this));
    }

    /* renamed from: e */
    private final void m153274e(C88296t tVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f200139N.execute(new RunnableC88183aa(this, tVar, new RunnableC88184ab(this, countDownLatch)));
        try {
            int i = this.f200132E.f200274b;
            if (i < 0) {
                i = 0;
            }
            if (!countDownLatch.await((long) i, TimeUnit.SECONDS)) {
                this.f200160u.mo123661c("syncVESeekTimeout max time ".concat(String.valueOf(i)));
                if (this.f200158s == null && (this.f200145f instanceof Activity)) {
                    Context context = this.f200145f;
                    if (context != null) {
                        this.f200158s = new DialogC85061o((Activity) context);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
                C85056k.m146252a(this.f200158s);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private final void m153273d(C88296t tVar) {
        if (this.f200159t == null && (this.f200145f instanceof AbstractC1204m)) {
            this.f200159t = new SafeHandler((AbstractC1204m) this.f200145f);
        }
        if (tVar.f200366a == 0) {
            if (this.f200132E.f200275c.invoke().booleanValue()) {
                this.f200139N.execute(new RunnableC88204j(this));
            } else {
                mo142745e();
            }
        }
        if (tVar.f200366a == 1) {
            if (this.f200132E.f200275c.invoke().booleanValue()) {
                this.f200139N.execute(new RunnableC88206k(this));
            } else {
                mo142746f();
            }
        }
        if (tVar.f200366a == 2) {
            if (this.f200132E.f200275c.invoke().booleanValue()) {
                this.f200139N.execute(new RunnableC88208l(this, tVar));
            } else {
                mo142741b(tVar);
            }
        }
        if (tVar.f200366a == 3) {
            if (this.f200132E.f200275c.invoke().booleanValue()) {
                m153274e(tVar);
            } else {
                mo142729a(tVar, (Runnable) null);
            }
        }
        if (tVar.f200366a == 4) {
            this.f200139N.execute(new RunnableC88209m(this, tVar));
        }
    }

    /* renamed from: a */
    private final void m153258a(C88288n nVar) {
        IAudioEffectParam iAudioEffectParam = nVar.f200327f;
        if (iAudioEffectParam == null) {
            C89219l.m154715b();
        }
        m153254a(iAudioEffectParam.getSeqOut());
    }

    /* renamed from: b */
    public final void mo142741b(C88296t tVar) {
        C85581w.EnumC85607f fVar;
        AbstractC31071f fVar2 = this.f200146g;
        if (fVar2 == null) {
            C89219l.m154710a("mVEEditor");
        }
        int i = (int) tVar.f200367b;
        if (tVar.f200366a == 2) {
            fVar = C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing;
        } else {
            fVar = C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek;
        }
        int a = fVar2.mo56265a(i, fVar);
        if (a != 0) {
            this.f200160u.mo123658a("Seek failed. ret = " + a + " See logs for more details.");
        }
    }

    /* renamed from: dmt.av.video.b.j$z */
    public static final class C88225z implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200245a;

        /* renamed from: b */
        final /* synthetic */ C1743j f200246b;

        static {
            Covode.recordClassIndex(104260);
        }

        C88225z(AbstractC88181j jVar, C1743j jVar2) {
            this.f200245a = jVar;
            this.f200246b = jVar2;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                this.f200246b.mo5555a((Object) null);
                this.f200245a.mo142743c().mo56349d(this);
            }
        }
    }

    public AbstractC88181j(C88238s sVar, ScheduledExecutorService scheduledExecutorService) {
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(scheduledExecutorService, "");
        this.f200132E = sVar;
        this.f200139N = scheduledExecutorService;
    }

    /* renamed from: c */
    private final void m153271c(C70936b bVar, String str) {
        String str2 = "";
        if (bVar.f158831d) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            if (bVar.f158828a) {
                str2 = bVar.f158832e;
            }
            fVar.mo56326b(str2);
        } else {
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            if (!bVar.f158828a) {
                str = str2;
            }
            fVar2.mo56281a(str);
        }
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
    }

    /* renamed from: a */
    private final void m153255a(int i, ArrayList<EffectPointModel> arrayList) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (arrayList == null) {
            C89219l.m154715b();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            EffectPointModel effectPointModel = arrayList.get(i2);
            C89219l.m154716b(effectPointModel, "");
            if (effectPointModel.getIndex() == i) {
                AbstractC31071f fVar = this.f200146g;
                if (fVar == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar.mo56328b(new int[]{i});
                arrayList.remove(i2);
                atomicBoolean.set(true);
            }
            if (this.f200146g == null) {
                C89219l.m154710a("mVEEditor");
            }
            if (atomicBoolean.get()) {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m153266b(C70936b bVar, String str) {
        C89219l.m154721d(bVar, "");
        if (!bVar.f158833f.f158841b || bVar.f158829b < 0) {
            C85315al.m146639b(f200126F, "Model acquisition error, not available");
            m153271c(bVar, str);
            return;
        }
        int i = 1;
        if (bVar.f158828a) {
            VEVideoLensOneKeyHdrParam vEVideoLensOneKeyHdrParam = new VEVideoLensOneKeyHdrParam();
            vEVideoLensOneKeyHdrParam.model_path = bVar.f158833f.f158840a;
            vEVideoLensOneKeyHdrParam.kernel_path = bVar.f158833f.f158842c;
            if (bVar.f158833f.f158843d && bVar.f158829b == 20004) {
                i = 0;
            }
            vEVideoLensOneKeyHdrParam.disable_denoise = i;
            vEVideoLensOneKeyHdrParam.scene_case = bVar.f158829b;
            vEVideoLensOneKeyHdrParam.power_level = 3;
            if (bVar.f158833f.f158844e) {
                vEVideoLensOneKeyHdrParam.asf_mode = bVar.f158833f.f158845f;
                vEVideoLensOneKeyHdrParam.hdr_mode = bVar.f158833f.f158846g;
            }
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            this.f200128A = fVar.mo56258a(0, 0, vEVideoLensOneKeyHdrParam);
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            C85315al.m146639b("SingleVideoHDREnhance", "useDenoise = " + vEVideoLensOneKeyHdrParam.disable_denoise + ",  asf_mode = " + vEVideoLensOneKeyHdrParam.asf_mode + ", hdr_mode = " + vEVideoLensOneKeyHdrParam.hdr_mode + ", ret = " + fVar2.mo56324b(0, this.f200128A, vEVideoLensOneKeyHdrParam) + ", lensOneKeyHdrFilterId = " + this.f200128A);
        } else {
            int[] iArr = {this.f200128A};
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar3.mo56293a(iArr);
        }
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
    }

    /* renamed from: b */
    public final void mo142740b(FilterBean filterBean, boolean z) {
        if (filterBean == null) {
            AbstractC31071f fVar = this.f200146g;
            if (fVar == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar.mo56337c("", 0.0f);
            AbstractC31071f fVar2 = this.f200146g;
            if (fVar2 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar2.mo56327b("", 0.0f);
        } else if (C50811a.m95159a(filterBean)) {
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            vEComposerFilterParam.removeComposerNodes(new String[]{filterBean.getFilterFolder()});
            AbstractC31071f fVar3 = this.f200146g;
            if (fVar3 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar3.mo56263a(this.f200137L, vEComposerFilterParam);
            this.f200129B = null;
        } else {
            AbstractC31071f fVar4 = this.f200146g;
            if (fVar4 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar4.mo56337c("", 0.0f);
            AbstractC31071f fVar5 = this.f200146g;
            if (fVar5 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar5.mo56327b("", 0.0f);
        }
        if (z && this.f200137L != -1) {
            AbstractC31071f fVar6 = this.f200146g;
            if (fVar6 == null) {
                C89219l.m154710a("mVEEditor");
            }
            fVar6.mo56293a(new int[]{this.f200137L});
            this.f200137L = -1;
        }
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
    }

    /* renamed from: a */
    private final void m153259a(C88288n nVar, C70857g gVar) {
        IAudioEffectParam iAudioEffectParam = nVar.f200327f;
        if (iAudioEffectParam == null) {
            C89219l.m154715b();
        }
        m153256a(iAudioEffectParam, nVar.f200330i, gVar);
    }

    /* renamed from: b */
    private final void m153268b(C88288n nVar, C88288n nVar2, boolean z) {
        this.f200153n = null;
        C1731i.m5636a(new CallableC88202h(this, nVar, nVar2, z), m153276l()).mo5533a(new C88203i(this, nVar, nVar2, z), C1731i.f5564c);
        if (this.f200146g == null) {
            C89219l.m154710a("mVEEditor");
        }
    }

    /* renamed from: a */
    private void m153256a(IAudioEffectParam iAudioEffectParam, AbstractC88169b bVar, C70857g gVar) {
        C89219l.m154721d(iAudioEffectParam, "");
        C89219l.m154721d(gVar, "");
        C1731i.m5636a(new CallableC88197e(this, iAudioEffectParam, gVar, bVar), m153276l()).mo5533a(new C88200f(this, iAudioEffectParam, gVar, bVar), C1731i.f5564c);
    }

    /* renamed from: a */
    private final void m153257a(FilterBean filterBean, float f, boolean z) {
        if (filterBean != null) {
            if (C50811a.m95159a(filterBean)) {
                mo142750j();
                if (this.f200129B != null) {
                    VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                    vEComposerFilterParam.autoDump = true;
                    String[] strArr = new String[1];
                    FilterBean filterBean2 = this.f200129B;
                    if (filterBean2 == null) {
                        C89219l.m154715b();
                    }
                    strArr[0] = filterBean2.getFilterFolder();
                    vEComposerFilterParam.replaceComposerNodesWithTag(strArr, new String[]{C50811a.m95158a(filterBean, f)}, new String[]{filterBean.getExtra()});
                    AbstractC31071f fVar = this.f200146g;
                    if (fVar == null) {
                        C89219l.m154710a("mVEEditor");
                    }
                    fVar.mo56263a(this.f200137L, vEComposerFilterParam);
                } else {
                    VEComposerFilterParam vEComposerFilterParam2 = new VEComposerFilterParam();
                    vEComposerFilterParam2.autoDump = true;
                    vEComposerFilterParam2.appendComposerNodesWithTag(new String[]{C50811a.m95158a(filterBean, f)}, new String[]{filterBean.getExtra()});
                    AbstractC31071f fVar2 = this.f200146g;
                    if (fVar2 == null) {
                        C89219l.m154710a("mVEEditor");
                    }
                    fVar2.mo56263a(this.f200137L, vEComposerFilterParam2);
                }
                if (this.f200146g == null) {
                    C89219l.m154710a("mVEEditor");
                }
                this.f200129B = filterBean;
                this.f200130C = f;
            } else if (z) {
                AbstractC31071f fVar3 = this.f200146g;
                if (fVar3 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar3.mo56337c(filterBean.getFilterFolder(), f);
            } else {
                AbstractC31071f fVar4 = this.f200146g;
                if (fVar4 == null) {
                    C89219l.m154710a("mVEEditor");
                }
                fVar4.mo56327b(filterBean.getFilterFolder(), 1.0f);
            }
        }
    }

    /* renamed from: dmt.av.video.b.j$r */
    static final class C88216r implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200232a;

        static {
            Covode.recordClassIndex(104251);
        }

        C88216r(AbstractC88181j jVar) {
            this.f200232a = jVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4116) {
                AbstractC88176f.AbstractC88177a aVar = this.f200232a.f200164y;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                aVar.mo114869a();
            }
        }
    }

    /* renamed from: dmt.av.video.b.j$n */
    static final class C88210n extends AbstractC89220m implements AbstractC89188r<Integer, Integer, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C88294r f200220a;

        /* renamed from: b */
        final /* synthetic */ VEPreviewMusicParams f200221b;

        static {
            Covode.recordClassIndex(104245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88210n(C88294r rVar, VEPreviewMusicParams vEPreviewMusicParams) {
            super(4);
            this.f200220a = rVar;
            this.f200221b = vEPreviewMusicParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, Integer num3, Integer num4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int intValue3 = num3.intValue();
            int intValue4 = num4.intValue();
            this.f200220a.f200351b = intValue;
            this.f200220a.f200352c = intValue2;
            this.f200220a.f200353d = intValue3;
            this.f200220a.f200354e = intValue4;
            this.f200220a.f200355f = this.f200221b.f200094n;
            return C89391z.f203057a;
        }
    }

    /* renamed from: dmt.av.video.b.j$o */
    static final class C88211o extends AbstractC89220m implements AbstractC89188r<Integer, Integer, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C88294r f200222a;

        static {
            Covode.recordClassIndex(104246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88211o(C88294r rVar) {
            super(4);
            this.f200222a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, Integer num3, Integer num4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int intValue3 = num3.intValue();
            int intValue4 = num4.intValue();
            this.f200222a.f200351b = intValue;
            this.f200222a.f200352c = intValue2;
            this.f200222a.f200353d = intValue3;
            this.f200222a.f200354e = intValue4;
            return C89391z.f203057a;
        }
    }

    /* renamed from: dmt.av.video.b.j$w */
    static final class C88221w implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ AbstractC88181j f200240a;

        static {
            Covode.recordClassIndex(104256);
        }

        C88221w(AbstractC88181j jVar) {
            this.f200240a = jVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            FilterBean filterBean;
            if (i == 4143 && (filterBean = this.f200240a.f200129B) != null && C50811a.m95159a(filterBean)) {
                if (this.f200240a.f200159t == null) {
                    this.f200240a.f200159t = new SafeHandler(this.f200240a.f200162w);
                }
                SafeHandler safeHandler = this.f200240a.f200159t;
                if (safeHandler != null) {
                    safeHandler.post(new Runnable(this) {
                        /* class dmt.p4542av.video.p4545b.AbstractC88181j.C88221w.RunnableC882221 */

                        /* renamed from: a */
                        final /* synthetic */ C88221w f200241a;

                        static {
                            Covode.recordClassIndex(104257);
                        }

                        {
                            this.f200241a = r1;
                        }

                        public final void run() {
                            this.f200241a.f200240a.mo142748h();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    private final Callable<Boolean> m153253a(C88288n nVar, C88288n nVar2, boolean z, C70857g gVar) {
        return new CallableC88212p(this, nVar, nVar2, z, gVar);
    }
}
