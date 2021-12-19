package com.p2082ss.android.vesdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.medialib.presenter.IStickerRequestCallback;
import com.p2082ss.android.ttve.model.C30673a;
import com.p2082ss.android.ttve.model.C30674b;
import com.p2082ss.android.ttve.model.C30675c;
import com.p2082ss.android.ttve.model.C30676d;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ttve.model.VETrackParams;
import com.p2082ss.android.ttvecamera.p2202k.C30929b;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.p2082ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.p2082ss.android.vesdk.model.VEPrePlayParams;
import com.p2082ss.android.vesdk.p4386b.AbstractC85381a;
import com.p2082ss.android.vesdk.p4386b.AbstractC85382b;
import com.p2082ss.android.vesdk.p4387c.AbstractC85401a;
import com.p2082ss.android.vesdk.p4392h.C85513a;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;

/* renamed from: com.ss.android.vesdk.g */
public abstract class AbstractC85508g {

    /* renamed from: S */
    Context f191461S;

    /* renamed from: T */
    public C85513a f191462T;

    /* renamed from: U */
    public C85519k f191463U;

    /* renamed from: V */
    AbstractC85556e f191464V;

    /* renamed from: W */
    public VEListener.AbstractC85230ai f191465W;

    /* renamed from: X */
    VEListener.AbstractC85242k f191466X;

    /* renamed from: Y */
    public VEListener.AbstractC85239h f191467Y;

    /* renamed from: Z */
    C85346av.AbstractC85366k f191468Z;

    /* renamed from: aA */
    String f191469aA;

    /* renamed from: aB */
    long f191470aB;

    /* renamed from: aC */
    long f191471aC;

    /* renamed from: aD */
    int f191472aD;

    /* renamed from: aE */
    int f191473aE = EnumC85321aq.RADIO_FULL.ordinal();

    /* renamed from: aF */
    VESize f191474aF = null;

    /* renamed from: aG */
    boolean f191475aG = false;

    /* renamed from: aH */
    C30673a f191476aH = new C30673a();

    /* renamed from: aI */
    VEEffectFilterParam f191477aI = new VEEffectFilterParam();

    /* renamed from: aJ */
    C30675c f191478aJ = new C30675c();

    /* renamed from: aK */
    C30676d f191479aK = new C30676d();

    /* renamed from: aL */
    C30674b f191480aL = new C30674b();

    /* renamed from: aM */
    VEVolumeParam f191481aM = new VEVolumeParam();

    /* renamed from: aN */
    public boolean f191482aN;

    /* renamed from: aO */
    VESize f191483aO = new VESize(0, 0);

    /* renamed from: aP */
    float f191484aP = 0.125f;

    /* renamed from: aQ */
    float f191485aQ = 0.125f;

    /* renamed from: aR */
    public boolean f191486aR = false;

    /* renamed from: aS */
    boolean f191487aS;

    /* renamed from: aT */
    VEWatermarkParam f191488aT;

    /* renamed from: aU */
    boolean f191489aU = false;

    /* renamed from: aV */
    boolean f191490aV = false;

    /* renamed from: aW */
    String f191491aW = null;

    /* renamed from: aX */
    public boolean f191492aX = false;

    /* renamed from: aY */
    protected AssetManager f191493aY = null;

    /* renamed from: aZ */
    protected boolean f191494aZ = false;

    /* renamed from: aa */
    public VEListener.AbstractC85228ag f191495aa;

    /* renamed from: ab */
    C85346av.AbstractC85369n f191496ab;

    /* renamed from: ac */
    C85346av.AbstractC85368m f191497ac;

    /* renamed from: ad */
    C85346av.AbstractC85370o f191498ad;

    /* renamed from: ae */
    MessageCenter.Listener f191499ae;

    /* renamed from: af */
    C85346av.AbstractC85356b f191500af;

    /* renamed from: ag */
    C85346av.AbstractC85367l f191501ag;

    /* renamed from: ah */
    C85346av.AbstractC85363i f191502ah;

    /* renamed from: ai */
    C85346av.AbstractC85374s f191503ai;

    /* renamed from: aj */
    C85297a<Object> f191504aj = new C85297a<>();

    /* renamed from: ak */
    C85346av.AbstractC85371p f191505ak;

    /* renamed from: al */
    VEListener.AbstractC85237f f191506al;

    /* renamed from: am */
    public VEListener.AbstractC85238g f191507am;

    /* renamed from: an */
    C85346av.AbstractC85355a f191508an = null;

    /* renamed from: ao */
    C85346av.AbstractC85372q f191509ao;

    /* renamed from: ap */
    public VEListener.AbstractC85232ak f191510ap;

    /* renamed from: aq */
    long f191511aq = -1;

    /* renamed from: ar */
    IStickerRequestCallback f191512ar;

    /* renamed from: as */
    public VECameraSettings f191513as;

    /* renamed from: at */
    VEVideoEncodeSettings f191514at;

    /* renamed from: au */
    VEAudioEncodeSettings f191515au;

    /* renamed from: av */
    String f191516av;

    /* renamed from: aw */
    public boolean f191517aw;

    /* renamed from: ax */
    C85579v f191518ax;

    /* renamed from: ay */
    C85328at f191519ay;

    /* renamed from: az */
    public EnumC85329au f191520az = EnumC85329au.DEFAULT;

    /* renamed from: ba */
    public int f191521ba = 0;

    /* renamed from: bb */
    public int f191522bb = 0;

    /* renamed from: bc */
    public int f191523bc = 0;

    /* renamed from: bd */
    public float f191524bd = 0.0f;

    /* renamed from: be */
    public float f191525be = 0.0f;

    /* renamed from: bf */
    public int f191526bf = 0;

    /* renamed from: bg */
    public float f191527bg = 0.0f;

    /* renamed from: bh */
    public int f191528bh = 0;

    /* renamed from: bi */
    public int f191529bi = 0;

    /* renamed from: bj */
    public int f191530bj = 0;

    /* renamed from: bk */
    public float f191531bk = 0.0f;

    /* renamed from: bl */
    public float f191532bl = 0.0f;

    /* renamed from: bm */
    public double f191533bm = 0.0d;

    /* renamed from: bn */
    public double f191534bn = 0.0d;

    /* renamed from: bo */
    public double f191535bo = 0.0d;

    /* renamed from: bp */
    public double f191536bp = 0.0d;

    /* renamed from: bq */
    protected boolean f191537bq = false;

    /* renamed from: br */
    protected boolean f191538br = false;

    /* renamed from: bs */
    protected boolean f191539bs = false;

    /* renamed from: bt */
    protected C30929b f191540bt;

    /* renamed from: bu */
    boolean f191541bu = false;

    /* renamed from: bv */
    boolean f191542bv = false;

    static {
        Covode.recordClassIndex(99664);
    }

    /* renamed from: A */
    public void mo130926A() {
    }

    /* renamed from: a */
    public abstract float mo130927a(String str);

    /* renamed from: a */
    public abstract int mo130928a(double d, double d2, double d3, double d4);

    /* renamed from: a */
    public abstract int mo130930a(float f, float f2);

    /* renamed from: a */
    public abstract int mo130931a(float f, float f2, float f3, float f4, float f5);

    /* renamed from: a */
    public abstract int mo130932a(int i, float f);

    /* renamed from: a */
    public abstract int mo130933a(int i, float f, float f2, int i2);

    /* renamed from: a */
    public abstract int mo130935a(int i, int i2, C85346av.AbstractC85358d dVar);

    /* renamed from: a */
    public abstract int mo130938a(int i, String str);

    /* renamed from: a */
    public int mo130939a(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo130940a(Bitmap bitmap) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo130941a(Surface surface);

    /* renamed from: a */
    public abstract int mo130942a(VEEffectParams vEEffectParams);

    /* renamed from: a */
    public abstract int mo130944a(C85346av.AbstractC85361g gVar);

    /* renamed from: a */
    public abstract int mo130945a(C85346av.AbstractC85362h hVar);

    /* renamed from: a */
    public abstract int mo130947a(C85388bc bcVar);

    /* renamed from: a */
    public abstract int mo130951a(String str, float f);

    /* renamed from: a */
    public abstract int mo130952a(String str, float f, float f2);

    /* renamed from: a */
    public abstract int mo130953a(String str, int i, int i2, Bitmap.CompressFormat compressFormat, C85346av.AbstractC85359e eVar);

    /* renamed from: a */
    public abstract int mo130954a(String str, int i, int i2, String str2);

    /* renamed from: a */
    public abstract int mo130956a(String str, String str2, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo130957a(boolean z, String str);

    /* renamed from: a */
    public abstract int mo130958a(boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    public abstract int mo130959a(double[] dArr, double d);

    /* renamed from: a */
    public abstract int mo130960a(String[] strArr);

    /* renamed from: a */
    public abstract int mo130961a(String[] strArr, int i);

    /* renamed from: a */
    public int mo130962a(String[] strArr, String[] strArr2, float[] fArr) {
        return 0;
    }

    /* renamed from: a */
    public abstract void mo130964a(double d);

    /* renamed from: a */
    public abstract void mo130965a(float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo130966a(float f, float f2, float f3, float f4);

    /* renamed from: a */
    public abstract void mo130969a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract void mo130970a(int i, long j, long j2, String str);

    /* renamed from: a */
    public abstract void mo130976a(VECherEffectParam vECherEffectParam);

    /* renamed from: a */
    public void mo130977a(VEListener.AbstractC85241j jVar) {
    }

    /* renamed from: a */
    public void mo130988a(VEBaseRecorderLensParams vEBaseRecorderLensParams, C85346av.AbstractC85372q qVar) {
    }

    /* renamed from: a */
    public abstract void mo130990a(Runnable runnable);

    /* renamed from: a */
    public void mo130991a(String str, String str2) {
    }

    /* renamed from: a */
    public abstract void mo130992a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo130994a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo130996a(boolean z);

    /* renamed from: a */
    public abstract void mo130997a(boolean z, long j);

    /* renamed from: a */
    public abstract void mo130999a(float[] fArr);

    /* renamed from: a */
    public abstract boolean mo131001a(C85392bf bfVar, int i);

    /* renamed from: a */
    public abstract int[] mo131002a(int i, int i2, int i3, int i4, float f);

    /* renamed from: b */
    public abstract int mo131003b(double d, double d2, double d3, double d4);

    /* renamed from: b */
    public abstract int mo131004b(float f, float f2);

    /* renamed from: b */
    public abstract int mo131006b(C85346av.AbstractC85362h hVar);

    /* renamed from: b */
    public abstract int mo131007b(String str);

    /* renamed from: b */
    public abstract int mo131008b(String str, float f);

    /* renamed from: b */
    public abstract int mo131009b(String str, float f, float f2);

    /* renamed from: b */
    public abstract int mo131010b(String[] strArr, int i);

    /* renamed from: b */
    public abstract void mo131012b(int i);

    /* renamed from: b */
    public abstract void mo131018b(String str, String str2);

    /* renamed from: b */
    public abstract void mo131019b(boolean z);

    /* renamed from: b */
    public abstract boolean mo131020b(int i, int i2);

    /* renamed from: c */
    public abstract int mo131021c(double d, double d2, double d3, double d4);

    /* renamed from: c */
    public abstract int mo131022c(float f, float f2);

    /* renamed from: c */
    public AbstractC85401a mo131025c() {
        return null;
    }

    /* renamed from: c */
    public void mo131028c(String str) {
    }

    /* renamed from: c */
    public abstract int[] mo131029c(String str, String str2);

    /* renamed from: d */
    public abstract int mo131030d(float f, float f2);

    /* renamed from: d */
    public abstract int mo131033d(String str, String str2);

    /* renamed from: d */
    public abstract void mo131034d();

    /* renamed from: d */
    public void mo131035d(int i) {
    }

    /* renamed from: d */
    public abstract void mo131036d(boolean z);

    /* renamed from: e */
    public abstract int mo131038e(float f, float f2);

    /* renamed from: e */
    public abstract int mo131039e(int i);

    /* renamed from: e */
    public void mo131040e(VEListener.AbstractC85241j jVar) {
    }

    /* renamed from: e */
    public abstract boolean mo131041e(boolean z);

    /* renamed from: e */
    public abstract int[] mo131042e();

    /* renamed from: f */
    public void mo131043f(int i) {
    }

    /* renamed from: f */
    public abstract void mo131044f(boolean z);

    /* renamed from: f */
    public abstract int[] mo131045f();

    /* renamed from: g */
    public abstract float mo131046g();

    /* renamed from: g */
    public abstract void mo131047g(boolean z);

    /* renamed from: h */
    public int mo131048h() {
        return 0;
    }

    /* renamed from: h */
    public void mo131049h(boolean z) {
    }

    /* renamed from: i */
    public abstract int mo131050i(boolean z);

    /* renamed from: i */
    public abstract void mo131051i();

    /* renamed from: j */
    public abstract void mo131052j(boolean z);

    /* renamed from: k */
    public abstract void mo131055k(boolean z);

    /* renamed from: l */
    public long mo131056l() {
        return 0;
    }

    /* renamed from: l */
    public void mo131057l(boolean z) {
    }

    /* renamed from: m */
    public long mo131058m() {
        return 0;
    }

    /* renamed from: m */
    public void mo131059m(boolean z) {
    }

    /* renamed from: n */
    public int mo131060n() {
        return 0;
    }

    /* renamed from: n */
    public void mo131061n(boolean z) {
    }

    /* renamed from: p */
    public abstract void mo131064p(boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract float[] mo131065p();

    /* renamed from: q */
    public void mo131067q(boolean z) {
    }

    /* renamed from: u */
    public void mo131071u() {
        this.f191503ai = null;
    }

    /* renamed from: v */
    public long mo131072v() {
        return 0;
    }

    /* renamed from: w */
    public VEMapBufferInfo mo131073w() {
        return null;
    }

    /* renamed from: y */
    public abstract EnigmaResult mo131075y();

    /* renamed from: z */
    public abstract AbstractC30029f mo131076z();

    /* renamed from: a */
    public int mo130946a(AbstractC85381a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C85322ar arVar, String str, String str2, boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: a */
    public int mo130950a(AbstractC85556e eVar) {
        this.f191464V = eVar;
        return 0;
    }

    /* renamed from: a */
    public void mo130982a(C85346av.AbstractC85363i iVar) {
        this.f191502ah = iVar;
    }

    /* renamed from: a */
    public int mo130955a(String str, long j, long j2, int i) {
        this.f191469aA = str;
        this.f191470aB = j;
        this.f191471aC = j2;
        this.f191472aD = i;
        return 0;
    }

    /* renamed from: a */
    public void mo130995a(List<C85390bd> list, String str, int i, VEListener.AbstractC85241j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130973a(Surface surface, VEListener.AbstractC85241j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130978a(VEListener.AbstractC85241j jVar, boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130967a(float f, VEListener.AbstractC85241j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: b */
    public void mo131014b(VEListener.AbstractC85241j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130993a(String str, String str2, int i, String str3, String str4, VEListener.AbstractC85241j jVar) {
        jVar.mo56563a(-1);
    }

    /* renamed from: a */
    public void mo130998a(boolean z, PrivacyCert privacyCert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130975a(PrivacyCert privacyCert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130979a(VEVolumeParam vEVolumeParam) {
        this.f191481aM = vEVolumeParam;
    }

    /* renamed from: a */
    public void mo130971a(long j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130989a(AbstractC85541q qVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public int mo130949a(VEPrePlayParams vEPrePlayParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    /* renamed from: a */
    public void mo130987a(AbstractC85382b bVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public VEFrame mo130963a(C85346av.C85357c cVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130985a(C85346av.AbstractC85371p pVar) {
        this.f191505ak = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo130948a(VEEffectFilterParam vEEffectFilterParam) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo130984a(C85346av.AbstractC85369n nVar) {
        this.f191496ab = nVar;
    }

    /* renamed from: b */
    public void mo131016b(C85346av.AbstractC85369n nVar) {
        this.f191496ab = null;
    }

    /* renamed from: a */
    public void mo130983a(C85346av.AbstractC85367l lVar) {
        this.f191501ag = lVar;
    }

    /* renamed from: a */
    public void mo130986a(C85346av.AbstractC85374s sVar) {
        this.f191503ai = sVar;
    }

    /* renamed from: a */
    public void mo130974a(MessageCenter.Listener listener) {
        this.f191499ae = listener;
    }

    /* renamed from: a */
    public void mo130981a(C85346av.AbstractC85356b bVar, int i) {
        this.f191500af = bVar;
    }

    /* renamed from: a */
    public void mo130980a(AbstractC85313aj ajVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: b */
    public void mo131015b(AbstractC85313aj ajVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: a */
    public void mo131000a(float[] fArr, double d) {
        mo130999a(fArr);
    }

    /* renamed from: j */
    public String[] mo131053j() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: q */
    public int mo131066q() {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    /* renamed from: t */
    public void mo131070t() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    /* renamed from: o */
    public void mo131062o() {
        this.f191466X = null;
        this.f191468Z = null;
        this.f191495aa = null;
        this.f191465W = null;
        this.f191467Y = null;
        this.f191502ah = null;
        this.f191496ab = null;
        this.f191497ac = null;
        this.f191498ad = null;
        this.f191500af = null;
        this.f191499ae = null;
        this.f191501ag = null;
        this.f191503ai = null;
        this.f191505ak = null;
        this.f191506al = null;
        this.f191507am = null;
        this.f191461S = null;
        this.f191462T = null;
    }

    /* renamed from: a */
    public int mo130929a(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: d */
    public int mo131032d(VEListener.AbstractC85241j jVar) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    /* renamed from: c */
    public void mo131027c(VEListener.AbstractC85241j jVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052 A[Catch:{ JSONException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131332b(com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.AbstractC85508g.mo131332b(com.ss.android.vesdk.filterparam.VEEffectFilterParam):int");
    }

    /* renamed from: b */
    public void mo131011b(float f) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    /* renamed from: b */
    public void mo131013b(PrivacyCert privacyCert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: d */
    public int mo131031d(int i, int i2) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    /* renamed from: c */
    public int mo131023c(int i, int i2) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    /* renamed from: a */
    public int mo130937a(int i, VETrackParams vETrackParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public AbstractC85508g(Context context, AbstractC85556e eVar, C85513a aVar) {
        this.f191461S = context;
        this.f191464V = eVar;
        this.f191462T = null;
    }

    /* renamed from: a */
    public int mo130934a(int i, int i2, long j) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    /* renamed from: a */
    public int mo130936a(int i, int i2, boolean z) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }
}
