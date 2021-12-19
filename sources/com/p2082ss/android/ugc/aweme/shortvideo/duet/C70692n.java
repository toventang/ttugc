package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.creativex.recorder.sticker.panel.AbstractC14394f;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ttve.nativePort.TEEffectUtils;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46955fu;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C71971m;
import com.p2082ss.android.ugc.aweme.shortvideo.DuetContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74322m;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n */
public final class C70692n implements AbstractC21566a {

    /* renamed from: k */
    public static final C70693a f158234k = new C70693a((byte) 0);

    /* renamed from: a */
    public boolean f158235a;

    /* renamed from: b */
    public Effect f158236b;

    /* renamed from: c */
    public int f158237c;

    /* renamed from: d */
    public final AbstractC14177d f158238d = ((AbstractC14177d) getDiContainer().mo35248a(AbstractC14177d.class, (String) null));

    /* renamed from: e */
    public final C70698e f158239e;

    /* renamed from: f */
    public final ActivityC0945e f158240f;

    /* renamed from: g */
    public final ASCameraView f158241g;

    /* renamed from: h */
    public final AbstractC84089j f158242h;

    /* renamed from: i */
    public final C74322m f158243i;

    /* renamed from: j */
    final AbstractC70734y f158244j;

    /* renamed from: l */
    private final C21582f f158245l;

    static {
        Covode.recordClassIndex(83163);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n$a */
    static final class C70693a {
        static {
            Covode.recordClassIndex(83164);
        }

        private C70693a() {
        }

        public /* synthetic */ C70693a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158245l;
    }

    /* renamed from: b */
    public final void mo111516b() {
        if (!this.f158235a) {
            this.f158241g.setDuetSupportChangeLayout(true);
            this.f158235a = true;
        }
    }

    /* renamed from: a */
    public final void mo111514a() {
        this.f158244j.mo111487a().mo7036a(this.f158240f, new C70694b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n$e */
    public static final class C70698e implements AbstractC14394f {

        /* renamed from: a */
        final /* synthetic */ C70692n f158250a;

        static {
            Covode.recordClassIndex(83169);
        }

        @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14394f
        /* renamed from: a */
        public final boolean mo23204a() {
            if (!C70692n.m124935a(this.f158250a.f158236b)) {
                return false;
            }
            new C79459a(this.f158250a.f158240f).mo123050a(R.string.bdg).mo123053a();
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70698e(C70692n nVar) {
            this.f158250a = nVar;
        }
    }

    /* renamed from: a */
    public static boolean m124935a(Effect effect) {
        boolean z = false;
        if (effect == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(effect.getSdkExtra());
            z = jSONObject.optBoolean("effect_exclusive", false);
            C70735z.f158332f = jSONObject.optInt("appearance_duration", 3000);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n$b */
    public static final class C70694b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70692n f158246a;

        static {
            Covode.recordClassIndex(83165);
        }

        C70694b(C70692n nVar) {
            this.f158246a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f158246a.f158235a = false;
                if (this.f158246a.f158236b != null) {
                    this.f158246a.mo111516b();
                }
                C70692n nVar = this.f158246a;
                if (C70681h.m124909b() || nVar.f158236b != null) {
                    ChangeDuetLayoutViewModel changeDuetLayoutViewModel = (ChangeDuetLayoutViewModel) C20531t.m38716a(nVar.f158240f).mo33800a(ChangeDuetLayoutViewModel.class);
                    Effect effect = nVar.f158236b;
                    if (effect == null) {
                        effect = new Effect(null, 1, null);
                        effect.setName("left-right");
                        effect.setUnzipPath(C70681h.m124910c());
                        effect.setExtra("{\"duet_layout_mode\": \"{\\\"name\\\":\\\"horizontal\\\",\\\"change_direction_mode\\\":0,\\\"safety_status\\\":[\\\"new_left\\\"]}\"}");
                        effect.setSdkExtra("");
                    }
                    changeDuetLayoutViewModel.mo111465a(effect);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n$d */
    static final class C70697d extends AbstractC89220m implements AbstractC89172b<C20391d<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70692n f158249a;

        static {
            Covode.recordClassIndex(83168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70697d(C70692n nVar) {
            super(1);
            this.f158249a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20391d<? extends Integer> dVar) {
            int i;
            C20391d<? extends Integer> dVar2 = dVar;
            String str = "";
            C89219l.m154721d(dVar2, str);
            if (this.f158249a.f158236b != null) {
                this.f158249a.f158237c = dVar2.f48283b.intValue();
                C74322m mVar = this.f158249a.f158243i;
                Effect effect = this.f158249a.f158236b;
                if (effect == null) {
                    C89219l.m154715b();
                }
                String unzipPath = effect.getUnzipPath();
                float f = (float) this.f158249a.f158237c;
                if (mVar.f167132a != null) {
                    AbstractC31208c e = mVar.f167132a.mo56826e();
                    e.mo56843b(unzipPath, "switchButton", f);
                    e.mo56842a();
                }
                C70692n nVar = this.f158249a;
                Effect effect2 = nVar.f158236b;
                if (effect2 == null) {
                    C89219l.m154715b();
                }
                int i2 = this.f158249a.f158237c;
                C89219l.m154721d(effect2, str);
                C70669e a = C70690l.m124930a(effect2);
                if (a != null) {
                    List<String> list = a.f158180c;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = -1;
                    }
                    if (i > i2) {
                        List<String> list2 = a.f158180c;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        str = list2.get(i2);
                    }
                }
                C39162r.m79460a("switch_duet_layout", new C84425b().mo129406a("creation_id", nVar.f158244j.mo111488b().f155830o).mo129406a("shoot_way", nVar.f158244j.mo111488b().f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_at", str).f188764a);
                Effect effect3 = this.f158249a.f158236b;
                if (effect3 != null) {
                    C70692n nVar2 = this.f158249a;
                    nVar2.mo111515a(effect3, nVar2.f158237c);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.n$c */
    static final class C70695c extends AbstractC89220m implements AbstractC89172b<C20391d<? extends Effect>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70692n f158247a;

        static {
            Covode.recordClassIndex(83166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70695c(C70692n nVar) {
            super(1);
            this.f158247a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20391d<? extends Effect> dVar) {
            MethodCollector.m26663i(9566);
            C20391d<? extends Effect> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f158247a.mo111516b();
            if (!C89219l.m154714a((Object) dVar2.f48283b, (Object) this.f158247a.f158236b)) {
                this.f158247a.f158237c = 0;
                if (C70692n.m124935a(dVar2.f48283b)) {
                    AbstractC84089j jVar = this.f158247a.f158242h;
                    if (!(jVar == null || C75346e.m132154a(jVar) == null)) {
                        new C79459a(this.f158247a.f158240f).mo123050a(R.string.bdg).mo123053a();
                    }
                    AbstractC84089j jVar2 = this.f158247a.f158242h;
                    if (jVar2 != null) {
                        C75346e.m132156a(jVar2, (Effect) null);
                    }
                    AbstractC14333c cVar = (AbstractC14333c) ApiCenter.C2545a.m7450a(this.f158247a.f158240f).mo7015b(AbstractC14333c.class);
                    if (cVar != null) {
                        cVar.mo23138a(this.f158247a.f158239e);
                    }
                }
                if (C75466g.m132347a("camera_front", (Effect) dVar2.f48283b) && this.f158247a.f158238d.mo22810c().mo115026g() != 1) {
                    AbstractC14177d dVar3 = this.f158247a.f158238d;
                    C78599g a = C78599g.m137207a();
                    C89219l.m154716b(a, "");
                    int unused = dVar3.mo22773a(a, new PrivacyCert(new C13349j("1037"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}), (String) null);
                }
                if (TextUtils.isEmpty(dVar2.f48283b.getHint())) {
                    AbstractC70668d dVar4 = (AbstractC70668d) ApiCenter.C2545a.m7450a(this.f158247a.f158240f).mo7015b(AbstractC70668d.class);
                    if (dVar4 != null) {
                        dVar4.mo111483a("");
                    }
                } else {
                    AbstractC70668d dVar5 = (AbstractC70668d) ApiCenter.C2545a.m7450a(this.f158247a.f158240f).mo7015b(AbstractC70668d.class);
                    if (dVar5 != null) {
                        dVar5.mo111483a(dVar2.f48283b.getHint());
                    }
                }
            }
            this.f158247a.f158236b = dVar2.f48283b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ComposerInfo(dVar2.f48283b.getUnzipPath() + ";switchButton;" + this.f158247a.f158237c, dVar2.f48283b.getSdkExtra()));
            C74322m mVar = this.f158247a.f158243i;
            if (mVar.f167132a != null) {
                mVar.f167132a.mo56823b(arrayList, 60000);
            }
            Effect effect = this.f158247a.f158236b;
            if (effect != null) {
                this.f158247a.mo111515a(effect, 0);
            }
            ASCameraView aSCameraView = this.f158247a.f158241g;
            C706961 r1 = new C71971m.AbstractC71973b(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70692n.C70695c.C706961 */

                /* renamed from: a */
                final /* synthetic */ C70695c f158248a;

                static {
                    Covode.recordClassIndex(83167);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f158248a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.C71971m.AbstractC71973b
                /* renamed from: a */
                public final void mo111517a(boolean z) {
                    AbstractC1174ac a = C1181ae.m3881a(this.f158248a.f158247a.f158240f, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
                    C89219l.m154716b(a, "");
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
                    C89219l.m154716b(shortVideoContext, "");
                    shortVideoContext.f155817b.f155659o.f155685g = z;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.C71971m.AbstractC71973b
                /* renamed from: a */
                public final void mo111518a(boolean z, int i, Exception exc) {
                    String c;
                    int i2 = !z ? 1 : 0;
                    C69840ar a = new C69840ar().mo110189a("error_code", String.valueOf(i));
                    if (exc == null) {
                        c = "";
                    } else {
                        c = C24098m.m45633c(exc);
                    }
                    C40982q.m82520a("download_aec_model", i2, a.mo110189a("exception", c).mo110191a());
                }
            };
            C89219l.m154721d(aSCameraView, "");
            if (C46955fu.m90243a() == 1) {
                C71971m.C71975d dVar6 = new C71971m.C71975d(aSCameraView, r1);
                C84911q.m145921a("start download aec model");
                String audioAECModelName = TEEffectUtils.getAudioAECModelName();
                Map<String, List<String>> b = C89041ag.m154427b(new C89378p("AudioAECModel", C89070n.m154524c(audioAECModelName)));
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioAECModel"}, b, new C71971m.C71974c(audioAECModelName, dVar6));
            } else {
                C84911q.m145921a("disable aec");
            }
            Effect effect2 = this.f158247a.f158236b;
            if (effect2 != null) {
                this.f158247a.mo111515a(effect2, 0);
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(9566);
            return zVar;
        }
    }

    /* renamed from: a */
    public final void mo111515a(Effect effect, int i) {
        Object a = getDiContainer().mo35249a(AbstractC14177d.class, (String) null);
        String str = "";
        C89219l.m154716b(a, str);
        if (((AbstractC14177d) a).mo22803b().f155650f.size() == 0) {
            AbstractC1174ac a2 = C1181ae.m3881a(this.f158240f, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a2, str);
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f155842a;
            C89219l.m154716b(shortVideoContext, str);
            DuetContext duetContext = shortVideoContext.f155817b.f155659o;
            C89219l.m154721d(effect, str);
            C70669e a3 = C70690l.m124930a(effect);
            if (a3 != null && a3.f158181d.size() > i) {
                str = a3.f158181d.get(i);
            }
            duetContext.f155688j = str;
            duetContext.f155693o = C70690l.m124932c(effect);
            duetContext.f155694p = i;
        }
    }

    public C70692n(ActivityC0945e eVar, ASCameraView aSCameraView, AbstractC84089j jVar, C74322m mVar, AbstractC70734y yVar, C21582f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aSCameraView, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(yVar, "");
        C89219l.m154721d(fVar, "");
        this.f158240f = eVar;
        this.f158241g = aSCameraView;
        this.f158242h = jVar;
        this.f158243i = mVar;
        this.f158244j = yVar;
        this.f158245l = fVar;
        AbstractC88412b unused = ((BaseJediViewModel) C20531t.m38716a(eVar).mo33800a(ChangeDuetLayoutViewModel.class)).mo33677a(eVar, C70699o.f158251a, new C20370ah(), new C70695c(this));
        AbstractC88412b unused2 = ((BaseJediViewModel) C20531t.m38716a(eVar).mo33800a(ChangeDuetLayoutViewModel.class)).mo33677a(eVar, C70700p.f158252a, new C20370ah(), new C70697d(this));
        this.f158239e = new C70698e(this);
    }
}
