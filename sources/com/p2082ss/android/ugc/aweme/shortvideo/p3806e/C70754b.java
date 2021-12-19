package com.p2082ss.android.ugc.aweme.shortvideo.p3806e;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.experiment.C46876ef;
import com.p2082ss.android.ugc.aweme.experiment.C46877eg;
import com.p2082ss.android.ugc.aweme.experiment.C46879eh;
import com.p2082ss.android.ugc.aweme.experiment.C46880ei;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.p2082ss.android.ugc.aweme.shortvideo.p3796b.C69850a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.IFetchResourceListener;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.LoudnessDetectResult;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b */
public final class C70754b extends AbstractC2562j<AbstractC70753a> implements AbstractC21566a, AbstractC70753a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f158376a = {new C89232y(C70754b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C70754b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C70754b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: b */
    public final ASCameraView f158377b;

    /* renamed from: c */
    public String f158378c;

    /* renamed from: d */
    public int f158379d;

    /* renamed from: e */
    public int f158380e;

    /* renamed from: f */
    public boolean f158381f;

    /* renamed from: g */
    public final AbstractC89188r<Integer, Integer, String, C85346av, C89391z> f158382g;

    /* renamed from: h */
    public final AbstractC70753a f158383h;

    /* renamed from: i */
    private final AbstractC89248d f158384i = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: j */
    private final AbstractC89248d f158385j = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: k */
    private final AbstractC89248d f158386k;

    /* renamed from: l */
    private int f158387l;

    /* renamed from: m */
    private final C21582f f158388m;

    static {
        Covode.recordClassIndex(83225);
    }

    /* renamed from: a */
    public final ShortVideoContext mo111543a() {
        return (ShortVideoContext) this.f158384i.mo23374a(this, f158376a[0]);
    }

    /* renamed from: b */
    public final AbstractC14193m mo111544b() {
        return (AbstractC14193m) this.f158385j.mo23374a(this, f158376a[1]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC70753a getApiComponent() {
        return this.f158383h;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158388m;
    }

    /* renamed from: c */
    public final void mo111545c() {
        if (this.f158379d != -1) {
            this.f158377b.mo56928b(this.f158382g);
            int b = this.f158377b.getAudioController().mo56574b(this.f158379d);
            this.f158379d = -1;
            C73991bj.m130128a("zyc audio removeTrackAlgorithm ret=".concat(String.valueOf(b)));
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        mo111545c();
        if (this.f158380e != -1) {
            int a = this.f158377b.getAudioController().mo56569a(this.f158380e);
            this.f158380e = -1;
            C73991bj.m130128a("zyc audio removeTrackFilter ret=".concat(String.valueOf(a)));
        }
    }

    /* renamed from: d */
    public final boolean mo111546d() {
        boolean z;
        boolean z2 = !mo111543a().f155817b.mo109888a();
        if (!mo111543a().f155817b.mo109889b() || mo111543a().f155817b.f155656l) {
            z = false;
        } else {
            z = true;
        }
        C73991bj.m130128a("zyc audio enableLoudnessBalance, noMusic=" + z2 + ", duetMic=" + z);
        if (z2 || z) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$g */
    static final class CallableC70761g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70754b f158397a;

        static {
            Covode.recordClassIndex(83232);
        }

        CallableC70761g(C70754b bVar) {
            this.f158397a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            LoudnessDetectResult[] detectAudioLoudness = TEInterface.detectAudioLoudness(new String[]{this.f158397a.mo111543a().f155817b.f155659o.f155682d}, new int[]{0}, new int[]{(int) this.f158397a.mo111543a().f155817b.f155646b});
            if (!(detectAudioLoudness == null || detectAudioLoudness.length == 0 || detectAudioLoudness[0] == null || detectAudioLoudness[0].result != 0)) {
                this.f158397a.mo111543a().f155807aq.setPeakLoudness(detectAudioLoudness[0].peakLoudness);
                this.f158397a.mo111543a().f155807aq.setAvgLoudness(detectAudioLoudness[0].avgLoudness);
            }
            C73991bj.m130128a("zyc loudness detect success! peakLoudness = " + this.f158397a.mo111543a().f155807aq.getPeakLoudness() + ", avgLoudness = " + this.f158397a.mo111543a().f155807aq.getAvgLoudness());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (!C80720e.m139927b(this.f158378c)) {
            C70757c cVar = new C70757c(this);
            C70758d dVar = C70758d.f158394a;
            Map<String, List<String>> b = C89041ag.m154427b(new C89378p("AudioTimeAlignModel", C89070n.m154524c("time_align_44k.model")));
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioTimeAlignModel"}, b, new C70756b("time_align_44k.model", cVar, dVar));
        }
        mo111544b().mo22900g().mo6997a(this, new C70759e(this));
        mo111544b().mo22906m().mo6997a(this, new C70760f(this));
        if (mo111543a().f155817b.mo109889b() && mo111543a().f155807aq != null && mo111543a().f155807aq.getPeakLoudness() == 0.0d && mo111543a().f155807aq.getAvgLoudness() == 0.0d && mo111546d()) {
            C1731i.m5640b(new CallableC70761g(this), C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$b */
    public static final class C70756b implements IFetchResourceListener {

        /* renamed from: a */
        final /* synthetic */ String f158390a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f158391b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f158392c;

        static {
            Covode.recordClassIndex(83227);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f158392c.invoke(exc);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j) {
            String realFindResourceUri = C86709e.C86710a.m150208a().mo139947a().realFindResourceUri(0, null, this.f158390a);
            if (TextUtils.isEmpty(realFindResourceUri)) {
                this.f158391b.invoke("");
                return;
            }
            URI create = URI.create(realFindResourceUri);
            C89219l.m154716b(create, "");
            String path = create.getPath();
            AbstractC89172b bVar = this.f158391b;
            C89219l.m154716b(path, "");
            bVar.invoke(path);
        }

        C70756b(String str, AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f158390a = str;
            this.f158391b = bVar;
            this.f158392c = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$c */
    static final class C70757c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70754b f158393a;

        static {
            Covode.recordClassIndex(83228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70757c(C70754b bVar) {
            super(1);
            this.f158393a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f158393a.f158378c = str2;
            C73991bj.m130128a("zyc downloadAudioTimeAlignModel success, path=".concat(String.valueOf(str2)));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$d */
    static final class C70758d extends AbstractC89220m implements AbstractC89172b<Exception, C89391z> {

        /* renamed from: a */
        public static final C70758d f158394a = new C70758d();

        static {
            Covode.recordClassIndex(83229);
        }

        C70758d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Exception exc) {
            Exception exc2 = exc;
            C89219l.m154721d(exc2, "");
            C73991bj.m130131b("zyc downloadAudioTimeAlignModel failed, error=" + exc2.getMessage());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$f */
    static final class C70760f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70754b f158396a;

        static {
            Covode.recordClassIndex(83231);
        }

        C70760f(C70754b bVar) {
            this.f158396a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14207x xVar = (C14207x) obj;
            if (this.f158396a.mo111543a().f155817b.mo109898j().size() == 1) {
                this.f158396a.mo111545c();
            }
            C89219l.m154716b(xVar, "");
            if (xVar.f34485a != 1) {
                int i = this.f158396a.mo111543a().f155774aH;
                SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
                edit.putInt("record_bgm_delay", i);
                C13611a.m24460a(edit);
                if (this.f158396a.mo111543a().f155807aq != null) {
                    LoudnessBalanceParam loudnessBalanceParam = this.f158396a.mo111543a().f155807aq;
                    SharedPreferences.Editor edit2 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
                    edit2.putFloat("edit_peak_loudness", (float) loudnessBalanceParam.getPeakLoudness());
                    edit2.putFloat("edit_avg_loudness", (float) loudnessBalanceParam.getAvgLoudness());
                    edit2.putFloat("edit_bgm_loudness", (float) loudnessBalanceParam.getBgmLoudness());
                    C13611a.m24460a(edit2);
                }
            }
        }
    }

    public C70754b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f158388m = fVar;
        AbstractC89248d a = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f158386k = a;
        this.f158377b = ((AbstractC14177d) a.mo23374a(this, f158376a[2])).mo22747A();
        this.f158379d = -1;
        this.f158380e = -1;
        this.f158387l = -1;
        this.f158382g = new C70755a(this);
        this.f158383h = this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$e */
    static final class C70759e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70754b f158395a;

        static {
            Covode.recordClassIndex(83230);
        }

        C70759e(C70754b bVar) {
            this.f158395a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            double d;
            double d2;
            if (!this.f158395a.mo111544b().mo22896e().f7727a.getValue().booleanValue()) {
                C70754b bVar = this.f158395a;
                boolean z2 = C69850a.f156093a;
                boolean z3 = true;
                if (!bVar.mo111543a().f155817b.mo109889b() || bVar.mo111543a().f155817b.f155656l) {
                    z = false;
                } else {
                    z = true;
                }
                C73991bj.m130128a("zyc audio enableAudioAlignModel, isPlugged=" + z2 + ", duetMic=" + z);
                if (z2 || !z) {
                    z3 = false;
                }
                if (z3 && this.f158395a.f158379d == -1) {
                    this.f158395a.f158377b.mo56916a(this.f158395a.f158382g);
                    String str = this.f158395a.f158378c;
                    if (str != null) {
                        C70754b bVar2 = this.f158395a;
                        bVar2.f158379d = bVar2.f158377b.getAudioController().mo56575b(str);
                        C73991bj.m130128a("zyc audio addTrackAlgorithm path=" + str + ", index=" + this.f158395a.f158379d);
                    } else {
                        C73991bj.m130131b("zyc audio addTrackAlgorithm failed, path == null");
                    }
                }
                if (this.f158395a.mo111546d() && this.f158395a.f158380e == -1) {
                    boolean b = this.f158395a.mo111543a().f155817b.mo109889b();
                    if (b) {
                        C46876ef a = C46877eg.m90190a();
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        d = a.f109241a;
                    } else {
                        C46879eh a2 = C46880ei.m90191a();
                        if (a2 == null) {
                            C89219l.m154715b();
                        }
                        d = a2.f109247a;
                    }
                    C70754b bVar3 = this.f158395a;
                    bVar3.f158380e = bVar3.f158377b.getAudioController().mo56568a(d);
                    if (b) {
                        C46876ef a3 = C46877eg.m90190a();
                        if (a3 == null) {
                            C89219l.m154715b();
                        }
                        d2 = a3.f109242b;
                    } else if (!this.f158395a.mo111543a().f155817b.mo109888a()) {
                        C46879eh a4 = C46880ei.m90191a();
                        if (a4 == null) {
                            C89219l.m154715b();
                        }
                        d2 = a4.f109248b;
                    } else {
                        d2 = -18.0d;
                    }
                    C70754b bVar4 = this.f158395a;
                    if (bVar4.mo111543a().f155807aq != null) {
                        bVar4.mo111543a().f155807aq.setBgmLoudness(d2);
                    }
                    C73991bj.m130128a("zyc audio addTrackFilter index=" + this.f158395a.f158380e + ", isDuet = " + this.f158395a.mo111543a().f155817b.mo109889b() + ", filterValue = " + d);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$a */
    static final class C70755a extends AbstractC89220m implements AbstractC89188r<Integer, Integer, String, C85346av, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70754b f158389a;

        static {
            Covode.recordClassIndex(83226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70755a(C70754b bVar) {
            super(4);
            this.f158389a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, String str, C85346av avVar) {
            boolean z;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (intValue == C85310ah.f190914B) {
                C70754b bVar = this.f158389a;
                if (intValue2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.f158381f = z;
                C73991bj.m130128a("zyc audio set delay ret=".concat(String.valueOf(intValue2)));
            }
            if (this.f158389a.f158381f && intValue == C85310ah.f190913A) {
                this.f158389a.mo111543a().f155774aH = intValue2;
                C73991bj.m130128a("zyc audio set delay=" + intValue2 + " ms");
                this.f158389a.f158381f = false;
            }
            return C89391z.f203057a;
        }
    }
}
