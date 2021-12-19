package com.p2082ss.android.ugc.asve.editor;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VECherEffectParam;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;
import com.p2082ss.android.vesdk.VEMVAudioInfo;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.runtime.C85553b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.asve.editor.f */
public interface AbstractC31071f {

    /* renamed from: com.ss.android.ugc.asve.editor.f$a */
    public static final class C31072a {
        static {
            Covode.recordClassIndex(37702);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.editor.f$b */
    public interface AbstractC31073b {
        static {
            Covode.recordClassIndex(37703);
        }

        /* renamed from: a */
        void mo56404a(int i);
    }

    static {
        Covode.recordClassIndex(37701);
    }

    /* renamed from: A */
    boolean mo56240A();

    /* renamed from: B */
    int mo56241B();

    /* renamed from: C */
    int mo56242C();

    /* renamed from: D */
    int mo56243D();

    /* renamed from: F */
    float mo56245F();

    /* renamed from: G */
    int mo56246G();

    /* renamed from: H */
    int mo56247H();

    /* renamed from: I */
    int mo56248I();

    /* renamed from: J */
    void mo56249J();

    /* renamed from: K */
    void mo56250K();

    /* renamed from: L */
    void mo56251L();

    /* renamed from: a */
    int mo56252a(float f);

    /* renamed from: a */
    int mo56253a(int i, float f);

    /* renamed from: a */
    int mo56254a(int i, float f, float f2);

    /* renamed from: a */
    int mo56255a(int i, int i2, int i3);

    /* renamed from: a */
    int mo56256a(int i, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: a */
    int mo56257a(int i, int i2, int i3, boolean z);

    /* renamed from: a */
    int mo56258a(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    int mo56259a(int i, int i2, C85581w.EnumC85608g gVar);

    /* renamed from: a */
    int mo56260a(int i, int i2, String str, byte[] bArr, int i3, int i4, VEListener.AbstractC85221a aVar);

    /* renamed from: a */
    int mo56261a(int i, ROTATE_DEGREE rotate_degree);

    /* renamed from: a */
    int mo56262a(int i, VEListener.AbstractC85240i iVar);

    /* renamed from: a */
    int mo56263a(int i, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    int mo56264a(int i, VEBaseFilterParam vEBaseFilterParam, int i2, int i3);

    /* renamed from: a */
    int mo56265a(int i, C85581w.EnumC85607f fVar);

    /* renamed from: a */
    int mo56266a(int i, C85581w.EnumC85607f fVar, VEListener.AbstractC85250s sVar);

    /* renamed from: a */
    int mo56267a(int i, String str, String str2);

    /* renamed from: a */
    int mo56268a(int i, ByteBuffer byteBuffer);

    /* renamed from: a */
    int mo56269a(int i, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2);

    /* renamed from: a */
    int mo56270a(int i, float[] fArr);

    /* renamed from: a */
    int mo56271a(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    /* renamed from: a */
    int mo56272a(int i, ByteBuffer[] byteBufferArr);

    /* renamed from: a */
    int mo56273a(C31067b bVar);

    /* renamed from: a */
    int mo56274a(AbstractC31077h hVar);

    /* renamed from: a */
    int mo56275a(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    /* renamed from: a */
    int mo56276a(VERecordData vERecordData, boolean z, boolean z2);

    /* renamed from: a */
    int mo56277a(C85391be beVar);

    /* renamed from: a */
    int mo56278a(C85391be beVar, int i, int i2);

    /* renamed from: a */
    int mo56279a(VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    int mo56280a(C85581w.EnumC85606e eVar);

    /* renamed from: a */
    int mo56281a(String str);

    /* renamed from: a */
    int mo56282a(String str, float f);

    /* renamed from: a */
    int mo56283a(String str, float f, float f2, float f3, float f4);

    /* renamed from: a */
    int mo56284a(String str, int i, int i2);

    /* renamed from: a */
    int mo56285a(String str, int i, int i2, int i3, int i4, boolean z);

    /* renamed from: a */
    int mo56286a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);

    /* renamed from: a */
    int mo56287a(String str, int i, int i2, boolean z);

    /* renamed from: a */
    int mo56288a(String str, String str2);

    /* renamed from: a */
    int mo56289a(String str, String str2, float f);

    /* renamed from: a */
    int mo56290a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    int mo56291a(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type);

    /* renamed from: a */
    int mo56292a(String str, String[] strArr);

    /* renamed from: a */
    int mo56293a(int[] iArr);

    /* renamed from: a */
    int mo56294a(int[] iArr, int i, int i2, C85581w.EnumC85602a aVar, VEListener.AbstractC85254w wVar);

    /* renamed from: a */
    int mo56295a(int[] iArr, String str, byte[] bArr, VEListener.AbstractC85221a aVar);

    /* renamed from: a */
    int mo56296a(String[] strArr, String[] strArr2);

    /* renamed from: a */
    int mo56297a(boolean[] zArr, C31067b bVar);

    /* renamed from: a */
    Bitmap mo56298a(int i);

    /* renamed from: a */
    VESize mo56299a(int i, int i2);

    /* renamed from: a */
    C85553b mo56300a();

    /* renamed from: a */
    String mo56301a(int i, int i2, int i3, String str);

    /* renamed from: a */
    void mo56302a(float f, float f2, float f3, int i, int i2);

    /* renamed from: a */
    void mo56303a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo56304a(Bitmap bitmap);

    /* renamed from: a */
    void mo56305a(AbstractC31073b bVar);

    /* renamed from: a */
    void mo56306a(VEListener.AbstractC85222aa aaVar);

    /* renamed from: a */
    void mo56307a(VEListener.AbstractC85247p pVar);

    /* renamed from: a */
    void mo56308a(VEListener.AbstractC85251t tVar);

    /* renamed from: a */
    void mo56309a(VEListener.AbstractC85253v vVar);

    /* renamed from: a */
    void mo56310a(AbstractC85541q qVar);

    /* renamed from: a */
    void mo56311a(boolean z);

    /* renamed from: a */
    void mo56312a(String[] strArr);

    /* renamed from: a */
    boolean mo56313a(int i, int i2, float f);

    /* renamed from: a */
    boolean mo56314a(VEVideoEncodeSettings vEVideoEncodeSettings);

    /* renamed from: a */
    boolean mo56315a(String str, VEVideoEncodeSettings vEVideoEncodeSettings);

    /* renamed from: a */
    boolean mo56316a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.AbstractC85248q qVar);

    /* renamed from: a */
    int[] mo56317a(VECherEffectParam vECherEffectParam);

    /* renamed from: a */
    int[] mo56318a(int[] iArr, int[] iArr2, String[] strArr);

    /* renamed from: a */
    int[] mo56319a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2);

    /* renamed from: b */
    int mo56320b(float f);

    /* renamed from: b */
    int mo56321b(int i, float f);

    /* renamed from: b */
    int mo56322b(int i, float f, float f2);

    /* renamed from: b */
    int mo56323b(int i, int i2);

    /* renamed from: b */
    int mo56324b(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: b */
    int mo56325b(int i, ROTATE_DEGREE rotate_degree);

    /* renamed from: b */
    int mo56326b(String str);

    /* renamed from: b */
    int mo56327b(String str, float f);

    /* renamed from: b */
    int mo56328b(int[] iArr);

    /* renamed from: b */
    int mo56329b(String[] strArr);

    /* renamed from: b */
    VESize mo56330b();

    /* renamed from: b */
    void mo56331b(int i);

    /* renamed from: b */
    void mo56332b(AbstractC31073b bVar);

    /* renamed from: b */
    void mo56333b(AbstractC85541q qVar);

    /* renamed from: b */
    void mo56334b(boolean z);

    /* renamed from: c */
    float mo56335c(String str);

    /* renamed from: c */
    int mo56336c(int i, float f);

    /* renamed from: c */
    int mo56337c(String str, float f);

    /* renamed from: c */
    int mo56338c(boolean z);

    /* renamed from: c */
    int mo56339c(int[] iArr);

    /* renamed from: c */
    Bitmap mo56340c();

    /* renamed from: c */
    void mo56341c(float f);

    /* renamed from: c */
    void mo56342c(int i);

    /* renamed from: c */
    void mo56343c(int i, int i2);

    /* renamed from: c */
    void mo56344c(AbstractC85541q qVar);

    /* renamed from: d */
    int mo56345d();

    /* renamed from: d */
    String mo56346d(String str);

    /* renamed from: d */
    void mo56347d(int i);

    /* renamed from: d */
    void mo56348d(int i, int i2);

    /* renamed from: d */
    void mo56349d(AbstractC85541q qVar);

    /* renamed from: d */
    void mo56350d(boolean z);

    /* renamed from: e */
    int mo56351e(int i);

    /* renamed from: e */
    int mo56352e(int i, int i2);

    /* renamed from: e */
    VEMVAudioInfo mo56353e();

    /* renamed from: e */
    void mo56354e(boolean z);

    /* renamed from: f */
    int mo56355f(int i, int i2);

    /* renamed from: f */
    C85581w.EnumC85611j mo56356f();

    /* renamed from: f */
    void mo56357f(boolean z);

    /* renamed from: f */
    boolean mo56358f(int i);

    /* renamed from: g */
    int mo56359g(int i);

    /* renamed from: g */
    int mo56360g(int i, int i2);

    /* renamed from: g */
    void mo56361g(boolean z);

    /* renamed from: g */
    String[] mo56362g();

    /* renamed from: h */
    int mo56363h(int i, int i2);

    /* renamed from: h */
    float[] mo56364h(int i);

    /* renamed from: h */
    String[] mo56365h();

    /* renamed from: i */
    int mo56366i(int i);

    /* renamed from: i */
    String[] mo56367i();

    /* renamed from: j */
    int mo56368j();

    /* renamed from: j */
    int mo56369j(int i);

    /* renamed from: k */
    int mo56370k();

    /* renamed from: k */
    int mo56371k(int i);

    /* renamed from: l */
    int mo56372l(int i);

    /* renamed from: l */
    List<VEClipAlgorithmParam> mo56373l();

    /* renamed from: m */
    void mo56375m(int i);

    /* renamed from: n */
    int mo56376n();

    /* renamed from: n */
    int mo56377n(int i);

    /* renamed from: o */
    float mo56378o(int i);

    /* renamed from: o */
    int mo56379o();

    /* renamed from: p */
    float mo56380p(int i);

    /* renamed from: p */
    int mo56381p();

    /* renamed from: q */
    int mo56382q();

    /* renamed from: q */
    boolean mo56383q(int i);

    /* renamed from: r */
    int mo56384r(int i);

    /* renamed from: r */
    void mo56385r();

    /* renamed from: s */
    int mo56386s(int i);

    /* renamed from: s */
    void mo56387s();

    /* renamed from: t */
    int mo56388t();

    /* renamed from: t */
    int mo56389t(int i);

    /* renamed from: u */
    int mo56390u();

    /* renamed from: v */
    int mo56391v();

    /* renamed from: w */
    int mo56392w();

    /* renamed from: x */
    int mo56393x();

    /* renamed from: y */
    int mo56394y();

    /* renamed from: z */
    int mo56395z();
}
