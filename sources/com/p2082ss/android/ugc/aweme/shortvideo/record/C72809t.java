package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.p036g.AbstractC0688a;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p943b.C14224b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.creativex.recorder.p940b.p941a.C14172ad;
import com.bytedance.creativex.recorder.p940b.p941a.C14178e;
import com.bytedance.creativex.recorder.p940b.p941a.C14188h;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
import com.bytedance.creativex.recorder.p940b.p941a.C14208y;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.keva.Keva;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.p2217f.C31092a;
import com.p2082ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31211g;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.VERecorderImpl;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.asve.recorder.camera.p2222a.C31163b;
import com.p2082ss.android.ugc.asve.recorder.camera.p2223b.C31169b;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31184c;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.shortvideo.C71816et;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.DuetContext;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71881g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71976a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73818w;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73375b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73355b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72784d;
import com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.tools.C78608j;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78555p;
import com.p2082ss.android.ugc.aweme.tools.extract.C78539i;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85302aa;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.lens.VELumaDetectParams;
import com.p2082ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.libsdl.app.AudioRecorderInterface;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.t */
public class C72809t<T extends AbstractC14179f> extends AbstractC2562j<T> implements AbstractC14179f, AbstractC21566a {

    /* renamed from: A */
    protected int f163300A;

    /* renamed from: B */
    protected int f163301B;

    /* renamed from: C */
    protected boolean f163302C;

    /* renamed from: D */
    protected final AbstractC73355b f163303D;

    /* renamed from: E */
    long f163304E;

    /* renamed from: F */
    long f163305F;

    /* renamed from: G */
    public boolean f163306G;

    /* renamed from: H */
    public boolean f163307H;

    /* renamed from: I */
    protected boolean f163308I;

    /* renamed from: J */
    protected boolean f163309J;

    /* renamed from: K */
    protected C72802q f163310K;

    /* renamed from: L */
    protected final AbstractC72790g f163311L;

    /* renamed from: M */
    protected boolean f163312M;

    /* renamed from: N */
    public Toast f163313N;

    /* renamed from: O */
    protected AbstractC31211g f163314O;

    /* renamed from: P */
    public boolean f163315P;

    /* renamed from: Q */
    public boolean f163316Q;

    /* renamed from: R */
    public boolean f163317R;

    /* renamed from: S */
    protected float f163318S;

    /* renamed from: T */
    protected FrameLayout f163319T;

    /* renamed from: U */
    protected boolean f163320U;

    /* renamed from: V */
    protected AbstractC30012b f163321V;

    /* renamed from: W */
    private final C2563k<C89391z> f163322W = new C2563k<>();

    /* renamed from: X */
    private final C2563k<Integer> f163323X = new C2563k<>();

    /* renamed from: Y */
    private final C2563k<Boolean> f163324Y = new C2563k<>();

    /* renamed from: Z */
    private final C2563k<Boolean> f163325Z = new C2563k<>();

    /* renamed from: aA */
    private boolean f163326aA;

    /* renamed from: aB */
    private boolean f163327aB;

    /* renamed from: aC */
    private boolean f163328aC;

    /* renamed from: aD */
    private long f163329aD;

    /* renamed from: aE */
    private ImageView f163330aE;

    /* renamed from: aF */
    private Bitmap f163331aF;

    /* renamed from: aG */
    private int f163332aG;

    /* renamed from: aH */
    private boolean f163333aH;

    /* renamed from: aI */
    private boolean f163334aI;

    /* renamed from: aJ */
    private boolean f163335aJ;

    /* renamed from: aK */
    private CameraModule.AbstractC72741a f163336aK;

    /* renamed from: aL */
    private List<String> f163337aL;

    /* renamed from: aM */
    private String f163338aM;

    /* renamed from: aN */
    private String f163339aN;

    /* renamed from: aO */
    private List<String> f163340aO;

    /* renamed from: aP */
    private final Handler f163341aP;

    /* renamed from: aa */
    private final C2563k<C89391z> f163342aa = new C2563k<>();

    /* renamed from: ab */
    private final C2563k<Integer> f163343ab = new C2563k<>();

    /* renamed from: ac */
    private final C2563k<C78599g> f163344ac = new C2563k<>();

    /* renamed from: ad */
    private final C2563k<Integer> f163345ad;

    /* renamed from: ae */
    private final C2563k<Integer> f163346ae;

    /* renamed from: af */
    private final C2563k<C14192l> f163347af;

    /* renamed from: ag */
    private final C2563k<C89391z> f163348ag;

    /* renamed from: ah */
    private final C2563k<C0692e<Boolean, PrivacyCert>> f163349ah;

    /* renamed from: ai */
    private EnumC78601i f163350ai;

    /* renamed from: aj */
    private final C2564l<Double> f163351aj;

    /* renamed from: ak */
    private final C2563k<C89391z> f163352ak;

    /* renamed from: al */
    private final C2563k<C89378p<Integer, Integer>> f163353al;

    /* renamed from: am */
    private final C1213t<Float> f163354am;

    /* renamed from: an */
    private final C2563k<C89391z> f163355an;

    /* renamed from: ao */
    private final C2563k<Boolean> f163356ao;

    /* renamed from: ap */
    private TextureView f163357ap;

    /* renamed from: aq */
    private int f163358aq;

    /* renamed from: ar */
    private C74305a f163359ar;

    /* renamed from: as */
    private C72784d f163360as;

    /* renamed from: at */
    private volatile boolean f163361at;

    /* renamed from: au */
    private boolean f163362au;

    /* renamed from: av */
    private final AbstractC72769aq f163363av;

    /* renamed from: aw */
    private final AbstractC73354a f163364aw;

    /* renamed from: ax */
    private boolean f163365ax;

    /* renamed from: ay */
    private boolean f163366ay;

    /* renamed from: az */
    private boolean f163367az;

    /* renamed from: b */
    private final C21582f f163368b;

    /* renamed from: c */
    private final C2564l<Boolean> f163369c = new C2564l<>(false);

    /* renamed from: d */
    final C2564l<Boolean> f163370d = new C2564l<>(false);

    /* renamed from: e */
    public final C2564l<Boolean> f163371e = new C2564l<>(false);

    /* renamed from: f */
    public final C2563k<C14178e> f163372f = new C2563k<>();

    /* renamed from: g */
    final C2563k<C14188h> f163373g = new C2563k<>();

    /* renamed from: h */
    protected final C2563k<C89378p<Integer, Float>> f163374h = new C2563k<>();

    /* renamed from: i */
    public final C2564l<AbstractC14318d> f163375i;

    /* renamed from: j */
    protected final C2563k<C78608j> f163376j;

    /* renamed from: k */
    public final C2563k<C14191k> f163377k;

    /* renamed from: l */
    protected final C2563k<C89391z> f163378l;

    /* renamed from: m */
    protected final C2563k<C20375am<Integer, Integer, String>> f163379m;

    /* renamed from: n */
    protected final C2563k<Boolean> f163380n;

    /* renamed from: o */
    protected final C2563k<C89391z> f163381o;

    /* renamed from: p */
    protected final ActivityC0218d f163382p;

    /* renamed from: q */
    protected SurfaceView f163383q;

    /* renamed from: r */
    protected Surface f163384r;

    /* renamed from: s */
    public ASCameraView f163385s;

    /* renamed from: t */
    public VERecorderImpl f163386t;

    /* renamed from: u */
    public C85346av f163387u;

    /* renamed from: v */
    public CameraModule f163388v;

    /* renamed from: w */
    protected final CameraComponentModel f163389w;

    /* renamed from: x */
    protected AbstractC78554o f163390x;

    /* renamed from: y */
    protected SafeHandler f163391y;

    /* renamed from: z */
    protected SurfaceHolder f163392z;

    static {
        Covode.recordClassIndex(85495);
    }

    /* renamed from: a */
    public void mo115096a(int i, int i2, double d) {
    }

    /* renamed from: a */
    public void mo115099a(int i, boolean z, boolean z2, float f, List<Integer> list) {
    }

    /* renamed from: a */
    public void mo115100a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo115084a(SurfaceHolder surfaceHolder) {
    }

    /* renamed from: a */
    public void mo115109a(String[] strArr, double[] dArr, boolean[] zArr) {
    }

    /* renamed from: aA */
    public void mo115110aA() {
    }

    /* renamed from: aB */
    public void mo115111aB() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aC */
    public void mo115112aC() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public boolean mo115116aG() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public void mo115118aI() {
    }

    /* renamed from: aL */
    public void mo115121aL() {
    }

    /* renamed from: aM */
    public void mo115122aM() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public void mo115085ao() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public void mo115086ap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public void mo115087aq() {
    }

    /* renamed from: at */
    public void mo115132at() {
    }

    /* renamed from: au */
    public void mo115133au() {
    }

    /* renamed from: b */
    public void mo115139b(int i, int i2, String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo115088c(int i) {
    }

    /* renamed from: e */
    public void mo115145e(int i, int i2) {
    }

    /* renamed from: f */
    public void mo115146f(int i) {
    }

    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: A */
    public final ASCameraView mo22747A() {
        return this.f163385s;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: B */
    public final VERecorderImpl mo22748B() {
        return this.f163386t;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: C */
    public final SurfaceView mo22749C() {
        return this.f163383q;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: E */
    public final AbstractC78554o mo22751E() {
        return this.f163390x;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: H */
    public final EnumC78601i mo22754H() {
        return this.f163350ai;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: I */
    public final C2560h<Double> mo22755I() {
        return this.f163351aj;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: J */
    public final C2559g<C89391z> mo22756J() {
        return this.f163352ak;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: Q */
    public final boolean mo22763Q() {
        return this.f163315P;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: S */
    public final boolean mo22765S() {
        return this.f163316Q;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: T */
    public final boolean mo22766T() {
        return this.f163317R;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: Z */
    public final C2559g<C89391z> mo22772Z() {
        return this.f163378l;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ae */
    public final C2559g<C89391z> mo22797ae() {
        return this.f163348ag;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: af */
    public final C2559g<C14192l> mo22798af() {
        return this.f163347af;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ag */
    public final /* bridge */ /* synthetic */ C2559g mo22799ag() {
        return this.f163377k;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ah */
    public final boolean mo22800ah() {
        return this.f163307H;
    }

    /* renamed from: ar */
    public final C74305a mo115130ar() {
        return this.f163359ar;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public final CameraComponentModel mo22803b() {
        return this.f163389w;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: c */
    public final CameraModule mo22810c() {
        return this.f163388v;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: d */
    public final C72784d mo22812d() {
        return this.f163360as;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: e */
    public final C2560h<Boolean> mo22814e() {
        return this.f163370d;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: f */
    public final C2560h<Boolean> mo22816f() {
        return this.f163369c;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: g */
    public final C2560h<Boolean> mo22818g() {
        return this.f163371e;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f163368b;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: h */
    public final C2559g<C89391z> mo22820h() {
        return this.f163322W;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: i */
    public final C2559g<Integer> mo22821i() {
        return this.f163323X;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: j */
    public final C2559g<C14178e> mo22822j() {
        return this.f163372f;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: k */
    public final C2559g<Boolean> mo22823k() {
        return this.f163324Y;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: l */
    public final C2559g<Boolean> mo22824l() {
        return this.f163325Z;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: m */
    public final LiveData<Float> mo22825m() {
        return this.f163354am;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: n */
    public final C2559g<C14188h> mo22826n() {
        return this.f163373g;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: o */
    public final C2559g<C89391z> mo22827o() {
        return this.f163342aa;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: p */
    public final C2559g<Integer> mo22828p() {
        return this.f163343ab;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: q */
    public final C2559g<Integer> mo22829q() {
        return this.f163346ae;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: r */
    public final C2559g<Integer> mo22830r() {
        return this.f163345ad;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: s */
    public final C2559g<C78608j> mo22831s() {
        return this.f163376j;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: t */
    public final C2559g<Boolean> mo22832t() {
        return this.f163380n;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: u */
    public final C2559g<C78599g> mo22833u() {
        return this.f163344ac;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: x */
    public final C2560h<AbstractC14318d> mo22836x() {
        return this.f163375i;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: y */
    public final C2559g<C89391z> mo22837y() {
        return this.f163381o;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22785a(String str) {
        this.f163359ar.mo116914a(str);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22786a(String str, float f) {
        this.f163359ar.mo116915a(str, f);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public void mo22780a(C14224b bVar, C14224b bVar2, float f) {
        throw new C73375b("setFilterScroll not support");
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22784a(C89378p<String, Float> pVar, C89378p<String, Float> pVar2, float f) {
        if (pVar != null && pVar2 != null) {
            this.f163359ar.f167093a.mo56786a(pVar.getFirst(), pVar2.getFirst(), f < 0.0f ? Math.abs(f) : 1.0f - f, pVar.getSecond().floatValue(), pVar2.getSecond().floatValue());
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22781a(EnumC78601i iVar) {
        this.f163350ai = iVar;
        this.f163351aj.mo7019b(Double.valueOf((double) iVar.value()));
        this.f163352ak.mo6999a(C89391z.f203057a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo115103a(C0692e eVar) {
        if (!this.f163310K.f163272k) {
            this.f163385s.mo56920a(eVar.f2750a.booleanValue(), (PrivacyCert) eVar.f2751b);
        } else if (Boolean.TRUE.equals(eVar.f2750a)) {
            C31117a aVar = this.f163385s.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56543b().mo56573a("record");
            C84401c.f188722f.mo123658a("CameraLogicComponent => initAudioCapture, mode = record");
        } else {
            C31117a aVar2 = this.f163385s.f74875d;
            if (aVar2 == null) {
                C89219l.m154710a("recorder");
            }
            aVar2.mo56543b().mo56576b();
            C84401c.f188722f.mo123658a("CameraLogicComponent => releaseAudioCapture");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo115101a(Bitmap bitmap, int i) {
        this.f163382p.runOnUiThread(new RunnableC72756ae(this, i, bitmap));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo115108a(boolean z, int i, String str) {
        this.f163364aw.mo116016b(this.f163382p);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22787a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            if (this.f163337aL == null) {
                this.f163337aL = new ArrayList();
            }
            this.f163337aL.add(str2);
            this.f163339aN = str;
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22778a(PrivacyCert privacyCert, String str) {
        int g = this.f163388v.mo115026g();
        if (g == 0) {
            C78599g a = C78599g.m137207a();
            a.f176644b = false;
            mo22773a(a, privacyCert, str);
        } else if (g == 1) {
            C78599g b = C78599g.m137208b();
            b.f176644b = false;
            mo22773a(b, privacyCert, str);
        }
    }

    /* renamed from: a */
    public void mo115106a(File file, int i) {
        mo115119aJ();
        if (this.f163389w.f155645a == 1) {
            Context applicationContext = this.f163382p.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C85052j.m146241a(applicationContext, (int) R.string.h7e).mo129996a();
            this.f163382p.finish();
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22788a(boolean z) {
        this.f163324Y.mo6999a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo115104a(C78599g gVar) {
        this.f163344ac.mo6999a(gVar);
        if (!gVar.f176643a) {
            mo22777a(0);
            mo22811c(false);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22789a(final boolean z, final C2563k<C14208y> kVar) {
        C728189 r2 = new C85346av.AbstractC85372q() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728189 */

            static {
                Covode.recordClassIndex(85504);
            }

            @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85372q
            /* renamed from: a */
            public final void mo56562a(int i, float f, int i2) {
                if (i == 27) {
                    C72809t.this.f163391y.post(new RunnableC72765an(this, f, z, kVar));
                }
            }
        };
        VELumaDetectParams vELumaDetectParams = new VELumaDetectParams();
        vELumaDetectParams.algorithmFlag = 27;
        vELumaDetectParams.detectFrames = 1;
        this.f163387u.mo130751a(vELumaDetectParams, r2);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public boolean mo22792a(boolean z, boolean z2) {
        C31163b bVar = this.f163388v.f163083e;
        return C31165b.f74716b ? !z && !z2 && bVar.mo56707a() : bVar.f74708e == 1 ? !z && !z2 : bVar.f74708e == 2 ? !z && bVar.f74710g.mo56705a(bVar.f74707d, bVar.f74709f, 0) : bVar.f74708e == 4 && !z && !z2;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final boolean mo22791a(ScaleGestureDetector scaleGestureDetector) {
        CameraModule cameraModule = this.f163388v;
        cameraModule.f163084f.getMaxCameraZoom();
        cameraModule.f163084f.getCameraZoomList();
        if (cameraModule.f163082d) {
            return true;
        }
        cameraModule.mo115023d();
        if (cameraModule.mo115024e()) {
            return true;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        ASCameraView aSCameraView = cameraModule.f163084f;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        C31117a aVar = aSCameraView.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56659a(currentSpan, scaleFactor);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        if (r4 != false) goto L_0x0021;
     */
    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22782a(com.p2082ss.android.ugc.aweme.tools.C78608j r8) {
        /*
            r7 = this;
            androidx.appcompat.app.d r6 = r7.f163382p
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r5 = r7.f163389w
            com.ss.android.ugc.aweme.shortvideo.record.q r0 = r7.f163310K
            boolean r4 = r0.f163270i
            com.ss.android.ugc.aweme.shortvideo.record.q r0 = r7.f163310K
            boolean r1 = r0.f163271j
            boolean r0 = r5.mo109890c()
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            boolean r0 = r5.mo109889b()
            if (r0 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
        L_0x0021:
            int r1 = r8.f176647a
            if (r1 == r2) goto L_0x0031
            r0 = 2
            if (r1 == r0) goto L_0x002e
        L_0x0028:
            com.bytedance.als.k<com.ss.android.ugc.aweme.tools.j> r0 = r7.f163376j
            r0.mo6999a(r8)
            return
        L_0x002e:
            r5.f155656l = r2
            goto L_0x0028
        L_0x0031:
            r5.f155656l = r3
            r0 = 2131828674(0x7f111fc2, float:1.9290296E38)
            com.ss.android.ugc.tools.view.widget.j r0 = com.p2082ss.android.ugc.tools.view.widget.C85052j.C85053a.m146247b(r6, r0, r2)
            r0.mo129996a()
            goto L_0x0028
        L_0x003e:
            if (r1 == 0) goto L_0x0028
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.mo22782a(com.ss.android.ugc.aweme.tools.j):void");
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22779a(C14171ac acVar) {
        C14192l lVar;
        C14191k kVar;
        C2563k<C14191k> kVar2 = this.f163377k;
        C2563k<C14192l> kVar3 = this.f163347af;
        C89219l.m154721d(acVar, "");
        C89219l.m154721d(kVar3, "");
        boolean z = acVar.f34443a;
        boolean z2 = acVar.f34444b;
        boolean z3 = acVar.f34445c;
        if (!z2) {
            if (!z) {
                lVar = new C14192l(z3, false);
            } else {
                lVar = new C14192l(z3, true);
            }
            kVar3.mo6999a(lVar);
        } else if (kVar2 != null) {
            if (!z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new C14172ad.animationAnimation$AnimationListenerC14173a(kVar3, z3));
                kVar = new C14191k(alphaAnimation, false);
            } else {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(150);
                alphaAnimation2.setAnimationListener(new C14172ad.animationAnimation$AnimationListenerC14174b(kVar3, z3));
                kVar = new C14191k(alphaAnimation2, true);
            }
            kVar2.mo6999a(kVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22783a(VEListener.AbstractC85241j jVar) {
        AbstractC89171a<Boolean> aVar = this.f163310K.f163285x;
        boolean z = aVar != null && aVar.invoke().booleanValue();
        if (this.f163310K.f163269h || z) {
            this.f163333aH = true;
            this.f163385s.getMediaController().mo56614c(new C72752aa(this, jVar));
            return;
        }
        jVar.mo56563a(-105);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo115105a(VEListener.AbstractC85241j jVar, int i) {
        this.f163391y.post(new RunnableC72753ab(jVar, i));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22790a(boolean z, C30933l.C30934a aVar, PrivacyCert privacyCert) {
        if (z) {
            this.f163346ae.mo6999a((Integer) 0);
            this.f163345ad.mo6999a((Integer) 0);
            this.f163343ab.mo6999a((Integer) 5);
            this.f163385s.getCameraController().mo56646a(aVar, privacyCert);
            return;
        }
        int i = 3;
        this.f163346ae.mo6999a(Integer.valueOf(this.f163388v.mo115016a().mo56743a() ? 3 : 2));
        C2563k<Integer> kVar = this.f163345ad;
        if (!C31163b.m64575a(this.f163382p)) {
            i = 2;
        }
        kVar.mo6999a(Integer.valueOf(i));
        this.f163346ae.mo6999a((Integer) 1);
        this.f163345ad.mo6999a((Integer) 1);
        this.f163343ab.mo6999a((Integer) 6);
        this.f163385s.getCameraController().mo56673c(privacyCert);
    }

    /* renamed from: a */
    public void mo115102a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        C84401c.f188722f.mo123658a("CameraLogicComponent => OnFrameAvailable");
        this.f163304E = System.currentTimeMillis();
        this.f163385s.mo56911a(this.f163314O);
        this.f163380n.mo7000b((Boolean) true);
        if (this.f163361at) {
            this.f163361at = false;
            C84401c.f188722f.mo123658a("CameraLogicComponent => addFragment Open Camera Frame Optimize");
            this.f163391y.post(new RunnableC72762ak(this));
            C71976a.f161292a = false;
            C71976a.f161293b = false;
            if (this.f163310K.f163287z > 0) {
                VETaintSceneDetectParams vETaintSceneDetectParams = new VETaintSceneDetectParams();
                vETaintSceneDetectParams.detectFrequency = 1;
                vETaintSceneDetectParams.algorithmFlag = 21;
                this.f163387u.mo130751a(vETaintSceneDetectParams, new C85346av.AbstractC85372q() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728112 */

                    static {
                        Covode.recordClassIndex(85497);
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: a */
                    public final /* synthetic */ void mo115148a(int i) {
                        int i2;
                        String str;
                        if (C72809t.this.f163313N != null) {
                            C72809t.this.f163313N.cancel();
                        }
                        C72809t tVar = C72809t.this;
                        Context applicationContext = tVar.f163382p.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                        if (C71976a.m127069a(i)) {
                            i2 = C71977b.f161295a;
                        } else {
                            i2 = C71977b.f161296b;
                        }
                        tVar.f163313N = Toast.makeText(applicationContext, i2, 1);
                        C72809t.this.f163313N.setGravity(17, 0, 0);
                        Toast toast = C72809t.this.f163313N;
                        if (Build.VERSION.SDK_INT == 25) {
                            C80567ic.m139657a(toast);
                        }
                        toast.show();
                        if (C71976a.m127069a(i)) {
                            C71976a.f161293b = true;
                        } else {
                            C71976a.f161292a = true;
                        }
                        Keva.getRepo("tools_dirty_lens_detect").storeLong("dirty_lens_detect_last_time_" + C71976a.m127069a(i), System.currentTimeMillis());
                        if (C71976a.m127069a(i)) {
                            str = "front";
                        } else {
                            str = "rear";
                        }
                        C89219l.m154721d(str, "");
                        C84401c.f188720d.mo73300a("dirty_camera_toast_show", new C84425b().mo129406a("camera_type", str).f188764a);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
                        if ((java.lang.System.currentTimeMillis() - com.bytedance.keva.Keva.getRepo("tools_dirty_lens_detect").getLong("dirty_lens_detect_last_time_" + com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71976a.m127069a(r9), 0)) > 86400000) goto L_0x0088;
                     */
                    @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85372q
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo56562a(int r7, float r8, int r9) {
                        /*
                        // Method dump skipped, instructions count: 154
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728112.mo56562a(int, float, int):void");
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo115107a(List list, File file, int i) {
        C84401c.f188722f.mo123658a("Restore the segments" + list.size() + " dir: " + file.getPath() + "  res: " + i);
        if (i != 0) {
            this.f163382p.runOnUiThread(new RunnableC72754ac(this, file, i));
            C31012a.m63724a().mo56187a().mo56122c("tryRestoreAsync -> VECallListener.onDone:".concat(String.valueOf(i)));
            C31012a.m63724a().mo56187a().mo56122c(Log.getStackTraceString(new Throwable()));
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: D */
    public final View mo22750D() {
        SurfaceView surfaceView = this.f163383q;
        if (surfaceView == null) {
            return this.f163357ap;
        }
        return surfaceView;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: G */
    public final void mo22753G() {
        this.f163367az = false;
        this.f163326aA = true;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: K */
    public final int mo22757K() {
        return this.f163388v.mo115026g();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: L */
    public final boolean mo22758L() {
        return this.f163388v.mo115021b();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: Y */
    public final void mo22771Y() {
        this.f163388v.mo115022c();
    }

    /* renamed from: aE */
    public final void mo115114aE() {
        this.f163382p.finish();
    }

    /* renamed from: aO */
    public final void mo115124aO() {
        this.f163388v.f163082d = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aS */
    public final /* synthetic */ Workspace mo115128aS() {
        return this.f163389w.f155652h;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ai */
    public final int mo22801ai() {
        return this.f163388v.f163086h;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: w */
    public final AbstractC31193a mo22835w() {
        return this.f163359ar.f167093a;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: z */
    public final void mo22838z() {
        this.f163322W.mo6999a(C89391z.f203057a);
    }

    /* renamed from: ak */
    private boolean mo22938ak() {
        Bitmap bitmap = this.f163331aF;
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: F */
    public final void mo22752F() {
        this.f163365ax = false;
        this.f163385s.setExposureCompensationEnable(false);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: M */
    public final boolean mo22759M() {
        return this.f163388v.mo115016a().mo56749e();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: N */
    public final int mo22760N() {
        return this.f163388v.f163084f.getFlashMode();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: O */
    public final int mo22761O() {
        return this.f163388v.f163084f.getNextFlashMode();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: P */
    public final int mo22762P() {
        return this.f163388v.f163084f.getLastFlashMode();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: W */
    public final boolean mo22769W() {
        return this.f163388v.mo115016a().mo56750f();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: X */
    public final boolean mo22770X() {
        return this.f163388v.mo115016a().mo56743a();
    }

    /* renamed from: aD */
    public void mo115113aD() {
        C31117a aVar = this.f163385s.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f();
    }

    /* renamed from: aQ */
    public final Surface mo115126aQ() {
        SurfaceHolder surfaceHolder = this.f163392z;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurface();
        }
        return this.f163384r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aR */
    public final /* synthetic */ void mo115127aR() {
        this.f163330aE.setVisibility(8);
        mo22738a();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ab */
    public final void mo22794ab() {
        List<String> list = this.f163337aL;
        if (list != null) {
            list.clear();
            this.f163337aL = null;
        }
        this.f163339aN = null;
        this.f163338aM = null;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: aj */
    public final long mo22802aj() {
        C85346av avVar = this.f163387u;
        if (avVar == null) {
            return -1;
        }
        return avVar.mo130819m();
    }

    /* renamed from: a */
    private void mo22738a() {
        if (this.f163310K.f163281t) {
            if (mo22938ak()) {
                this.f163330aE.setImageResource(17170445);
                this.f163331aF.recycle();
            }
            this.f163331aF = null;
        }
    }

    /* renamed from: al */
    private boolean mo22939al() {
        if (this.f163332aG != 0 || this.f163389w.mo109889b() || this.f163389w.mo109890c()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: U */
    public final boolean mo22767U() {
        C31117a aVar = this.f163388v.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56678f().mo56746c();
    }

    /* renamed from: aN */
    public final void mo115123aN() {
        if (this.f163388v.mo115026g() == 1) {
            mo22764R();
        } else {
            mo22777a(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public final void mo115125aP() {
        if (this.f163310K.f163281t) {
            this.f163391y.post(new RunnableC72759ah(this));
        }
        this.f163391y.post(new RunnableC72825z(this, System.currentTimeMillis()));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ac */
    public final SavePhotoStickerInfo mo22795ac() {
        if (C84904k.m145909a(this.f163337aL)) {
            return null;
        }
        return new SavePhotoStickerInfo(new ArrayList(this.f163337aL), this.f163338aM, this.f163339aN);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: ad */
    public final void mo22796ad() {
        if (this.f163333aH) {
            this.f163333aH = false;
            this.f163385s.getMediaController().mo56634u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final void mo115131as() {
        this.f163360as = new C72784d(this.f163382p, this.f163364aw, new C72784d.AbstractC72786b() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728123 */

            static {
                Covode.recordClassIndex(85498);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72784d.AbstractC72786b
            /* renamed from: a */
            public final void mo115068a() {
                C72809t.this.mo115132at();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72784d.AbstractC72786b
            /* renamed from: b */
            public final void mo115070b() {
                C72809t.this.mo115133au();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72784d.AbstractC72786b
            /* renamed from: a */
            public final void mo115069a(int i, int i2, double d) {
                C72809t.this.mo115096a(i, i2, d);
            }
        });
        this.f163349ah.mo6997a(this, new C72755ad(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: aw */
    public final void mo115135aw() {
        SurfaceView surfaceView = this.f163383q;
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.SurfaceHolder$CallbackC728134 */

                static {
                    Covode.recordClassIndex(85499);
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    C72809t.this.f163312M = false;
                    C72809t.this.mo115084a(surfaceHolder);
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    C72809t.this.f163312M = true;
                    C72809t.this.mo115086ap();
                }

                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    C72809t tVar = C72809t.this;
                    C84401c.f188722f.mo123658a("CameraLogicComponent => surfaceChanged format:" + i + " width:" + i2 + " height:" + i3);
                    tVar.f163385s.mo56905a(surfaceHolder.getSurface());
                }
            });
        }
        TextureView textureView = this.f163357ap;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.TextureView$SurfaceTextureListenerC728145 */

                static {
                    Covode.recordClassIndex(85500);
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    C72809t.this.f163312M = true;
                    C72809t.this.mo115137ay();
                    C72809t.this.f163384r.release();
                    return true;
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    C72809t.this.mo115143d(i, i2);
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    C72809t.this.f163312M = false;
                    if (C72809t.this.f163384r == null) {
                        C72809t.this.f163384r = new Surface(surfaceTexture);
                    }
                    C72809t.this.mo115087aq();
                }
            });
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        if (this.f163310K.f163265d == EnumC72773as.STAGE_ON_CREATE) {
            mo115085ao();
        }
        this.f163322W.mo6997a(this, new C72820u(this));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: R */
    public final void mo22764R() {
        Window window = this.f163382p.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.f163318S = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f163319T, "alpha", 0.0f, 0.5f);
        ofFloat.setDuration(25L);
        ofFloat.start();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: V */
    public final boolean mo22768V() {
        C31117a aVar = this.f163388v.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        if (!aVar.mo56545c().mo56678f().mo56748d() || this.f163328aC) {
            return false;
        }
        return true;
    }

    /* renamed from: aH */
    public void mo115117aH() {
        if (this.f163389w.mo109889b()) {
            DuetContext duetContext = this.f163389w.f155659o;
            int i = this.f163389w.f155659o.f155686h;
            int i2 = this.f163389w.f155659o.f155687i;
            EmbaddedWindowInfo embaddedWindowInfo = new EmbaddedWindowInfo();
            embaddedWindowInfo.f164626c = 0;
            embaddedWindowInfo.f164627d = 0;
            embaddedWindowInfo.f164624a = i;
            embaddedWindowInfo.f164625b = i2;
            embaddedWindowInfo.f164628e = 0;
            embaddedWindowInfo.f164629f = Integer.MAX_VALUE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(embaddedWindowInfo);
            duetContext.f155690l = arrayList;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final void mo115137ay() {
        this.f163388v.mo115019a(this.f163308I, this.f163303D.mo116019c().mo56126b());
        this.f163378l.mo6999a(C89391z.f203057a);
        C84401c.f188722f.mo123662d("CameraLogicComponent => surfaceDestroyed");
        C84401c.f188722f.mo123660b("stopPreviewAsync called()");
        this.f163385s.mo56921a(this.f163308I, C72761aj.f163141a);
        mo115138az();
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public final void mo115138az() {
        this.f163385s.mo56924b(this.f163303D.mo116019c().mo56127c());
        this.f163385s.mo56985j();
        this.f163385s.mo56923b();
        this.f163385s.mo56925b(this.f163321V);
        this.f163302C = false;
        this.f163371e.mo7019b(false);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        super.onDestroy();
        this.f163385s.mo56911a(this.f163314O);
        this.f163385s.setDataSourceVideoCompleteListener(null);
        this.f163385s.setSATZoomListener(null);
        this.f163385s.mo56923b();
        this.f163385s.mo56925b(this.f163321V);
        C71816et.f160954a = null;
        this.f163367az = false;
        this.f163326aA = true;
        mo22738a();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onResume() {
        super.onResume();
        this.f163305F = System.currentTimeMillis();
        this.f163367az = true;
        if (this.f163310K.f163281t && !mo22939al() && this.f163312M && mo22938ak()) {
            this.f163330aE.setVisibility(0);
        }
        this.f163387u.f191061c = new C72821v(this);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: v */
    public final Point mo22834v() {
        Point point = new Point();
        View D = mo22750D();
        if (mo22750D().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) D.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    /* access modifiers changed from: private */
    /* renamed from: am */
    public void mo115129aT() {
        String f;
        if (!this.f163389w.mo109891d().isEmpty()) {
            File e = this.f163389w.f155652h.mo110096e();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f163389w.mo109891d().iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                arrayList.add(new ASMediaSegment((long) timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()));
            }
            AbstractC31133a mediaController = this.f163385s.getMediaController();
            String path = e.getPath();
            if (mo115116aG()) {
                f = null;
            } else {
                f = this.f163389w.mo109894f();
            }
            mediaController.mo56602a(arrayList, path, f, this.f163389w.f155661q, new C72822w(this, arrayList, e));
        }
    }

    /* renamed from: aJ */
    public void mo115119aJ() {
        this.f163342aa.mo6999a(C89391z.f203057a);
        this.f163389w.f155652h.mo110094d();
        this.f163389w.f155652h.mo110097f();
        for (int i = 0; i < this.f163389w.mo109891d().size(); i++) {
            this.f163385s.mo56915a(C72824y.f163412a, (AbstractC89171a<C89391z>) null);
            C31012a.m63724a().mo56187a().mo56122c(Log.getStackTraceString(new Throwable()));
        }
        this.f163389w.mo109891d().clear();
        this.f163389w.mo109887a(0);
    }

    /* renamed from: aK */
    public void mo115120aK() {
        C78539i iVar = new C78539i(this.f163382p.getApplication(), this.f163310K.f163279r, this.f163385s.getMediaController(), this.f163303D.mo116017a(), this.f163303D.mo116018b(), this.f163310K.f163277p, this.f163310K.f163278q, this.f163310K.f163247B, this);
        this.f163390x = iVar;
        CameraComponentModel cameraComponentModel = this.f163389w;
        if (cameraComponentModel != null) {
            iVar.f176501h = cameraComponentModel.f155639D;
        }
        this.f163390x.mo122465a(new AbstractC78555p() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728178 */

            static {
                Covode.recordClassIndex(85503);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78555p
            /* renamed from: a */
            public final void mo115156a() {
                C72809t.this.mo115121aL();
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78555p
            /* renamed from: b */
            public final void mo115158b() {
                C72809t.this.mo115122aM();
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78555p
            /* renamed from: a */
            public final void mo115157a(long j) {
                C72809t.this.mo115100a(j);
            }
        });
        CameraComponentModel cameraComponentModel2 = this.f163389w;
        if (cameraComponentModel2 != null) {
            this.f163390x.mo122464a(cameraComponentModel2.f155667w);
        }
        this.f163390x.mo122473d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ax */
    public final void mo115136ax() {
        if (this.f163310K.f163281t && !mo22939al()) {
            ViewGroup.LayoutParams layoutParams = this.f163330aE.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.f163383q.getLayoutParams();
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.leftMargin = layoutParams4.leftMargin;
                layoutParams3.topMargin = layoutParams4.topMargin;
                layoutParams3.rightMargin = layoutParams4.rightMargin;
                layoutParams3.bottomMargin = layoutParams4.bottomMargin;
            }
            this.f163330aE.setLayoutParams(layoutParams);
            SurfaceView surfaceView = this.f163383q;
            int width = surfaceView.getWidth() / 2;
            int height = surfaceView.getHeight() / 2;
            ASCameraView aSCameraView = this.f163385s;
            C72760ai aiVar = new C72760ai(this);
            C31117a aVar = aSCameraView.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56547e().mo56768a(width, height, aiVar);
        }
    }

    /* renamed from: aF */
    public void mo115115aF() {
        C31117a aVar = this.f163385s.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56564a();
        ASCameraView aSCameraView = this.f163385s;
        C72823x xVar = new C72823x(this);
        C89219l.m154721d(xVar, "");
        C31117a aVar2 = aSCameraView.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56547e().mo56777a(xVar);
        if (this.f163389w.f155658n != null) {
            ASCameraView aSCameraView2 = this.f163385s;
            String[] matrix = this.f163389w.f155658n.getMatrix();
            double[] duration = this.f163389w.f155658n.getDuration();
            boolean[] segUseCher = this.f163389w.f155658n.getSegUseCher();
            C31117a aVar3 = aSCameraView2.f74875d;
            if (aVar3 == null) {
                C89219l.m154710a("recorder");
            }
            aVar3.mo56547e().mo56790a(matrix, duration, segUseCher);
        }
        mo115117aH();
        mo115118aI();
        if (!this.f163334aI) {
            return;
        }
        if ((this.f163389w.f155645a == 2 || this.f163389w.f155645a == 1) && !this.f163389w.mo109891d().isEmpty()) {
            this.f163334aI = false;
            mo115129aT();
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: aa */
    public final String mo22793aa() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!mo22813d(this.f163388v.mo115021b()) || !C31184c.m64611a(this.f163382p)) {
            z = false;
        } else {
            z = true;
        }
        if (!mo22792a(this.f163388v.mo115021b(), false) || !C31163b.m64576b(this.f163382p)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f163374h.mo6996a() != null && this.f163374h.mo6996a().getFirst().intValue() == VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(1);
        }
        if (z2) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(2);
        }
        if (z3) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public final void mo115134av() {
        C84401c.f188722f.mo123658a("CameraLogicComponent => previewCamera");
        if (this.f163389w.mo109888a()) {
            this.f163389w.mo109895g();
            this.f163385s.setMusicPath(this.f163389w.f155652h.mo110093c());
            this.f163385s.mo56918a(this.f163389w.f155652h.mo110093c(), this.f163389w.mo109895g(), this.f163389w.mo109896h(), this.f163389w.f155670z);
            if (Boolean.TRUE.equals(this.f163310K.f163256K.invoke())) {
                this.f163385s.mo56940g();
                this.f163389w.f155657m = true;
            }
        }
        ASCameraView aSCameraView = this.f163385s;
        ActivityC0218d dVar = this.f163382p;
        AudioRecorderInterface a = this.f163360as.mo115067a();
        C89219l.m154721d(dVar, "");
        C31117a aVar = aSCameraView.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56585a(dVar, a);
        this.f163385s.setDetectionMode(this.f163310K.f163273l);
        ASCameraView aSCameraView2 = this.f163385s;
        Surface aQ = mo115126aQ();
        String str = Build.DEVICE;
        AbstractC89172b<? super Integer, C89391z> bVar = C72758ag.f163138a;
        C89219l.m154721d(aQ, "");
        C89219l.m154721d(str, "");
        C31117a aVar2 = aSCameraView2.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56548f().mo56591a(aQ, str, bVar);
        this.f163369c.mo7019b(true);
        this.f163362au = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.t$a */
    class C72819a implements AbstractC31211g {
        static {
            Covode.recordClassIndex(85505);
        }

        C72819a() {
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85365j
        /* renamed from: a */
        public final void mo56846a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, long j2) {
            C72809t.this.mo115102a(eGLContext, i, i2, i3, i4, j);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public final void mo22804b(float f) {
        this.f163359ar.f167093a.mo56763a(f);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: g */
    public final void mo22819g(boolean z) {
        this.f163307H = z;
    }

    /* renamed from: g */
    private void m128412g(int i) {
        this.f163388v.mo115020b(i);
        this.f163343ab.mo6999a(Integer.valueOf(i));
    }

    /* renamed from: d */
    public void mo115142d(int i) {
        this.f163388v.mo115022c();
        this.f163323X.mo6999a(Integer.valueOf(i));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public final void mo22806b(int i) {
        this.f163343ab.mo6999a(Integer.valueOf(i));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: d */
    public final boolean mo22813d(boolean z) {
        C31117a aVar = this.f163388v.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56678f().mo56747c(z);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: f */
    public final void mo22817f(boolean z) {
        this.f163306G = z;
    }

    /* renamed from: c */
    public final void mo115141c(float f) {
        CameraModule cameraModule = this.f163388v;
        cameraModule.f163082d = true;
        cameraModule.mo115023d();
        if (!cameraModule.mo115024e()) {
            C31117a aVar = cameraModule.f163084f.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56545c().mo56670b(f);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: e */
    public final void mo22815e(boolean z) {
        int i;
        C31163b bVar = this.f163388v.f163083e;
        C31163b.f74705c = z;
        C31092a a = C31092a.C31093a.m64295a(bVar.f74707d);
        int i2 = 2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo56518b(i);
        bVar.mo56706a(z);
        if (mo22768V()) {
            this.f163346ae.mo6999a(Integer.valueOf(!z ? 1 : 0));
        }
        if (mo22760N() != 0) {
            mo22777a(0);
        }
        C2563k<Integer> kVar = this.f163345ad;
        if (z) {
            i2 = 3;
        }
        kVar.mo6999a(Integer.valueOf(i2));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22775a(float f) {
        if (this.f163385s.getExposureCompensationEnable() && this.f163385s.getIsExposureSeekBarShowing()) {
            this.f163385s.setExposureSeekBarProgress(f);
            if (this.f163367az && this.f163326aA) {
                this.f163355an.mo6999a(C89391z.f203057a);
            }
            this.f163326aA = false;
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public final void mo22807b(PrivacyCert privacyCert) {
        int i;
        int i2;
        int i3 = !mo22770X() ? 1 : 0;
        C31117a aVar = this.f163388v.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56678f().mo56741a(privacyCert);
        C2563k<Integer> kVar = this.f163346ae;
        if (i3 != 0) {
            i = 3;
        } else {
            i = 2;
        }
        kVar.mo6999a(Integer.valueOf(i));
        if (mo22768V()) {
            this.f163345ad.mo6999a(Integer.valueOf(i3 ^ 1));
        }
        if (mo22767U()) {
            if (i3 != 0) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            mo22806b(i2);
        }
        mo22777a(0);
        if (this.f163317R) {
            C31117a aVar2 = this.f163388v.f163084f.f74875d;
            if (aVar2 == null) {
                C89219l.m154710a("recorder");
            }
            aVar2.mo56545c().mo56675d(0);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: c */
    public final void mo22811c(boolean z) {
        if (this.f163318S != -1.0f) {
            Window window = this.f163382p.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.f163318S;
            window.setAttributes(attributes);
        }
        if (!z || this.f163319T.getAlpha() != 0.5f) {
            this.f163319T.setAlpha(0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f163319T, "alpha", 0.5f, 0.0f);
        ofFloat.setDuration(25L);
        ofFloat.start();
    }

    /* renamed from: e */
    public void mo115144e(int i) {
        this.f163371e.mo7019b(true);
        this.f163348ag.mo6999a(C89391z.f203057a);
        this.f163359ar.mo116913a();
        try {
            this.f163385s.setPreviewSizeRatio((((float) this.f163388v.f163084f.getCameraPreviewWidth()) * 1.0f) / ((float) this.f163388v.f163084f.getCameraPreviewHeight()));
        } catch (Exception e) {
            C84401c.f188722f.mo123660b(e.getMessage());
        }
        ASCameraView aSCameraView = this.f163385s;
        boolean z = this.f163310K.f163275n;
        C31117a aVar = aSCameraView.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56818g(z);
        this.f163385s.setHandDetectLowpower(true ^ this.f163310K.f163276o);
        CameraComponentModel cameraComponentModel = this.f163389w;
        if (cameraComponentModel != null) {
            this.f163385s.mo56941g(cameraComponentModel.mo109888a());
        }
        if (this.f163310K.f163261P) {
            C80558hx.m139643a(new C72763al(this));
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public final void mo22808b(String str) {
        this.f163338aM = str;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22777a(int i) {
        int N = mo22760N();
        this.f163388v.mo115017a(i);
        this.f163343ab.mo6999a(Integer.valueOf(i));
        if (this.f163317R) {
            m128412g(N);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public final void mo22809b(boolean z) {
        this.f163325Z.mo6999a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: b */
    public void mo22805b(float f, float f2) {
        throw new C73375b("scaleRatioChange not support");
    }

    /* renamed from: f */
    public void mo115147f(int i, int i2) {
        if (!this.f163302C) {
            this.f163300A = i;
            this.f163301B = i2;
            this.f163302C = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo115143d(int i, int i2) {
        C84401c.f188722f.mo123658a("CameraLogicComponent => surfaceChanged,width: " + i + ", height: " + i2);
        this.f163385s.mo56905a(this.f163384r);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final void mo22776a(float f, float f2) {
        C72793i iVar = new C72793i(new WeakReference(this.f163391y), this.f163353al);
        long nanoTime = System.nanoTime();
        boolean z = false;
        if (this.f163329aD <= 0) {
            this.f163329aD = nanoTime;
        } else {
            if (TimeUnit.NANOSECONDS.toMillis(nanoTime - this.f163329aD) > this.f163310K.f163282u) {
                this.f163329aD = nanoTime;
            }
            this.f163356ao.mo6999a(Boolean.valueOf(z));
        }
        CameraModule cameraModule = this.f163388v;
        View D = mo22750D();
        C85302aa aaVar = new C85302aa((int) f, (int) f2, D.getWidth(), D.getHeight(), cameraModule.f163079a.getResources().getDisplayMetrics().density, iVar);
        ASCameraView aSCameraView = cameraModule.f163084f;
        C89219l.m154721d(aaVar, "");
        C31117a aVar = aSCameraView.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        if (aVar.mo56545c().mo56661a(aaVar)) {
            z = true;
            C31169b cameraViewHelper$lib_asve_release = this.f163385s.getCameraViewHelper$lib_asve_release();
            if (cameraViewHelper$lib_asve_release.f74726a) {
                if (cameraViewHelper$lib_asve_release.f74730e) {
                    cameraViewHelper$lib_asve_release.mo56718a().end();
                } else {
                    cameraViewHelper$lib_asve_release.mo56723c().end();
                }
            }
            this.f163385s.getCameraViewHelper$lib_asve_release().mo56721a((int) f, (int) f2);
            if (this.f163385s.getExposureCompensationEnable()) {
                this.f163385s.mo56901a(f, f2);
            }
        }
        this.f163356ao.mo6999a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo115098a(int i, Bitmap bitmap) {
        mo22738a();
        if (i == 0) {
            this.f163331aF = bitmap;
            if (mo22938ak()) {
                this.f163330aE.setImageBitmap(this.f163331aF);
            }
        }
    }

    /* renamed from: a */
    public void mo115097a(int i, int i2, String str) {
        mo115108a(this.f163362au, i2, str);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public int mo22773a(C78599g gVar, PrivacyCert privacyCert, String str) {
        int a = this.f163388v.mo115015a(privacyCert, str);
        mo115104a(gVar);
        return a;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f
    /* renamed from: a */
    public final int mo22774a(boolean z, PrivacyCert privacyCert, String str) {
        C78599g a;
        if (this.f163388v.mo115026g() == 1) {
            a = C78599g.m137208b();
        } else {
            a = C78599g.m137207a();
        }
        a.f176644b = z;
        return mo22773a(a, privacyCert, str);
    }

    /* renamed from: a */
    public void mo115095a(int i, float f, boolean z) {
        this.f163354am.postValue(Float.valueOf(f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo115140b(String[] strArr, double[] dArr, boolean[] zArr) {
        if (strArr == null) {
            this.f163389w.f155658n = null;
        } else {
            this.f163389w.f155658n = new ClientCherEffectParam(strArr, dArr, zArr);
        }
        mo115109a(strArr, dArr, zArr);
    }

    public C72809t(C21582f fVar, CameraComponentModel cameraComponentModel, AbstractC72769aq aqVar, AbstractC73355b bVar, AbstractC73354a aVar, AbstractC0688a<C72802q> aVar2, AbstractC72790g gVar) {
        C31182a aVar3;
        AbstractC71881g gVar2;
        AbstractC72769aq aqVar2 = aqVar;
        MethodCollector.m26663i(1352);
        TextureView.SurfaceTextureListener surfaceTextureListener = null;
        this.f163375i = new C2564l<>(null);
        this.f163345ad = new C2563k<>();
        this.f163346ae = new C2563k<>();
        this.f163376j = new C2563k<>();
        this.f163347af = new C2563k<>();
        this.f163377k = new C2563k<>();
        this.f163348ag = new C2563k<>();
        this.f163378l = new C2563k<>();
        this.f163349ah = new C2563k<>();
        this.f163350ai = EnumC78601i.NORMAL;
        this.f163351aj = new C2564l<>(Double.valueOf((double) this.f163350ai.value()));
        this.f163352ak = new C2563k<>();
        this.f163379m = new C2563k<>();
        this.f163353al = new C2563k<>();
        this.f163354am = new C1213t<>();
        this.f163380n = new C2563k<>();
        this.f163355an = new C2563k<>();
        this.f163356ao = new C2563k<>();
        this.f163381o = new C2563k<>();
        this.f163391y = new SafeHandler(this);
        this.f163361at = true;
        this.f163362au = false;
        this.f163300A = 1280;
        this.f163301B = 720;
        this.f163306G = true;
        this.f163307H = false;
        this.f163308I = false;
        this.f163309J = false;
        this.f163365ax = false;
        this.f163366ay = true;
        this.f163367az = false;
        this.f163326aA = true;
        this.f163327aB = false;
        this.f163310K = new C72802q();
        this.f163328aC = false;
        this.f163312M = false;
        this.f163332aG = 0;
        this.f163333aH = false;
        this.f163314O = new C72819a();
        this.f163334aI = true;
        this.f163335aJ = false;
        this.f163318S = -1.0f;
        this.f163320U = true;
        this.f163321V = new C73818w(this.f163391y, new AbstractC30012b() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728156 */

            static {
                Covode.recordClassIndex(85501);
            }

            @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
            /* renamed from: a */
            public final void mo52865a(int i) {
                if (i < 0) {
                    C85052j.m146242a(C72809t.this.f163382p, C72809t.this.f163382p.getResources().getString(R.string.dce, Integer.valueOf(i))).mo129996a();
                    C72809t.this.mo115146f(i);
                    C72809t.this.mo115114aE();
                    return;
                }
                C72809t.this.mo115144e(i);
            }

            @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
            /* renamed from: a */
            public final void mo52866a(int i, int i2) {
                if (C72809t.this.f163389w.f155645a == 0) {
                    C72809t.this.f163389w.f155649e = i ^ 1;
                }
                C72809t.this.mo115145e(i, i2);
            }
        });
        this.f163336aK = new CameraModule.AbstractC72741a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728167 */

            static {
                Covode.recordClassIndex(85502);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115030a() {
                C72809t.this.mo115110aA();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: b */
            public final void mo115037b() {
                C72809t.this.mo115111aB();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115031a(int i) {
                C72809t.this.mo115088c(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: b */
            public final void mo115038b(int i) {
                C72809t.this.mo115142d(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115033a(int i, int i2) {
                C72809t.this.mo115147f(i, i2);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115032a(int i, float f, boolean z) {
                C72809t.this.mo115095a(i, f, z);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: b */
            public final void mo115039b(int i, int i2, String str) {
                C72809t.this.mo115139b(i, i2, str);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115034a(int i, int i2, String str) {
                C72809t.this.mo115097a(i, i2, str);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115036a(long j, String str, String str2, String str3) {
                C72809t.this.f163372f.mo6999a(new C14178e(j, str, str2, str3));
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.AbstractC72741a
            /* renamed from: a */
            public final void mo115035a(int i, boolean z, boolean z2, float f, List<Integer> list) {
                C72809t.this.mo115099a(i, z, z2, f, list);
            }
        };
        this.f163337aL = null;
        this.f163340aO = null;
        this.f163341aP = new Handler(Looper.getMainLooper());
        this.f163368b = fVar;
        ActivityC0218d dVar = (ActivityC0218d) fVar.mo35247a(ActivityC0218d.class);
        this.f163382p = dVar;
        this.f163389w = cameraComponentModel;
        aqVar2 = aqVar2 == null ? new C72766ao() : aqVar2;
        this.f163363av = aqVar2;
        this.f163303D = bVar;
        this.f163364aw = aVar;
        if (aVar2 != null) {
            aVar2.mo2720a(this.f163310K);
        }
        this.f163358aq = this.f163310K.f163284w;
        this.f163311L = gVar;
        this.f163385s = new ASCameraView(dVar);
        int i = this.f163358aq;
        if (i == 0) {
            SurfaceView surfaceView = new SurfaceView(dVar);
            this.f163383q = surfaceView;
            this.f163385s.addView(surfaceView);
        } else if (i == 1) {
            TextureView textureView = new TextureView(dVar);
            this.f163357ap = textureView;
            this.f163385s.addView(textureView);
        }
        FrameLayout frameLayout = new FrameLayout(dVar);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(0.0f);
        this.f163319T = frameLayout;
        this.f163385s.addView(frameLayout);
        this.f163319T.bringToFront();
        ImageView imageView = new ImageView(dVar);
        this.f163330aE = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f163330aE.setVisibility(8);
        this.f163385s.addView(this.f163330aE);
        AbstractC89171a<C89391z> aVar4 = this.f163310K.f163262a.f163198a;
        if (aVar4 != null) {
            aVar4.invoke();
        }
        this.f163385s.f74872a = this;
        C72776av avVar = new C72776av(dVar, cameraComponentModel, new C72757af(this));
        avVar.f163174d = this.f163310K.f163280s;
        avVar.f163175e = this.f163310K.f163283v;
        avVar.f163190t = this.f163310K.f163248C;
        avVar.f163188r = this.f163310K.f163287z;
        avVar.f163191u = this.f163310K.f163250E;
        avVar.f163189s = this.f163310K.f163251F;
        avVar.f163186p = this.f163310K.f163274m;
        avVar.f163184n = this.f163310K.f163272k;
        avVar.f163192v = this.f163310K.f163255J;
        avVar.f163195y = this.f163310K.f163261P;
        AbstractC89172b<? super C72776av, C89391z> bVar2 = this.f163310K.f163262a.f163199b;
        if (bVar2 != null) {
            bVar2.invoke(avVar);
        }
        if (gVar != null) {
            aVar3 = gVar.mo115073a();
        } else {
            aVar3 = null;
        }
        ASCameraView aSCameraView = this.f163385s;
        C89219l.m154721d(avVar, "");
        if (aSCameraView.f74872a != null) {
            ASCameraView.C31248n nVar = new ASCameraView.C31248n(aSCameraView, avVar);
            if (nVar.mo56164k().invoke().booleanValue()) {
                VERuntime.EnumC85549a.INSTANCE.f191667b.f191650i = true;
                if (!nVar.mo56161h()) {
                    VERuntime.EnumC85549a.INSTANCE.f191667b.f191651j = true;
                }
            }
            AbstractC1204m mVar = aSCameraView.f74872a;
            if (mVar == null) {
                C89219l.m154710a("lifecycleOwner");
            }
            C31117a a = C31117a.C31118a.m64349a(mVar, nVar, aVar3);
            aSCameraView.f74875d = a;
            TextureView textureView2 = aSCameraView.f74873b;
            surfaceTextureListener = textureView2 != null ? textureView2.getSurfaceTextureListener() : surfaceTextureListener;
            TextureView textureView3 = aSCameraView.f74873b;
            if (textureView3 != null) {
                textureView3.setSurfaceTextureListener(new ASCameraView.TextureView$SurfaceTextureListenerC31239g(surfaceTextureListener, a, nVar));
            }
            C31117a aVar5 = aSCameraView.f74875d;
            if (aVar5 == null) {
                C89219l.m154710a("recorder");
            }
            aVar5.mo56542a(aSCameraView.f74877f);
            this.f163386t = (VERecorderImpl) this.f163385s.mo56898a().f74568c;
            this.f163387u = ((VERecorderImpl) this.f163385s.mo56898a().f74568c).mo56552j();
            this.f163308I = avVar.f163173c.mo56143f();
            this.f163309J = avVar.f163173c.mo56144g();
            AbstractC89172b<? super ASCameraView, C89391z> bVar3 = this.f163310K.f163263b;
            if (bVar3 != null) {
                bVar3.invoke(this.f163385s);
            }
            if (this.f163310K.f163274m) {
                this.f163385s.mo56909a(this.f163321V);
            }
            ActivityC0218d dVar2 = (ActivityC0218d) fVar.mo35247a(ActivityC0218d.class);
            if (this.f163310K.f163257L == null) {
                gVar2 = new C72806r(aqVar2);
            } else {
                gVar2 = this.f163310K.f163257L;
            }
            this.f163388v = new CameraModule(dVar2, gVar2, this.f163336aK, this.f163385s, this, this.f163310K.f163266e, this.f163310K.f163267f, this.f163310K.f163268g, this.f163310K.f163286y, this.f163310K.f163254I, this.f163310K.f163260O);
            this.f163359ar = new C74305a(this.f163385s.getEffectController());
            C72795j jVar = this.f163310K.f163259N;
            if (!(jVar.f163234a == 7 && jVar.f163235b == 30)) {
                this.f163385s.getCameraController().mo56656a(new int[]{jVar.f163234a, jVar.f163235b});
            }
            if (this.f163310K.f163265d == EnumC72773as.STAGE_CONSTRUCT) {
                mo115085ao();
            }
            MethodCollector.m26664o(1352);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("must set lifecycleOwner before start".toString());
        MethodCollector.m26664o(1352);
        throw illegalStateException;
    }
}
