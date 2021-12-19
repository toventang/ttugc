package com.p2082ss.android.ugc.asve.editor;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.nle.C31085b;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85395bh;
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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.a */
public final class C31060a implements AbstractC31071f {

    /* renamed from: e */
    public static final C31061a f74400e = new C31061a((byte) 0);

    /* renamed from: a */
    public List<AbstractC31071f.AbstractC31073b> f74401a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<VEListener.AbstractC85253v> f74402b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<AbstractC85541q> f74403c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<AbstractC85541q> f74404d;

    /* renamed from: f */
    private final C31088q f74405f;

    /* renamed from: g */
    private final AbstractC89244h f74406g;

    /* renamed from: h */
    private final VEListener.AbstractC85253v f74407h;

    /* renamed from: i */
    private final AbstractC85541q f74408i;

    /* renamed from: j */
    private final AbstractC85541q f74409j;

    /* renamed from: k */
    private boolean f74410k;

    /* renamed from: l */
    private C31089r f74411l;

    /* renamed from: m */
    private final C85581w f74412m;

    static {
        Covode.recordClassIndex(37690);
    }

    /* renamed from: m */
    public final Handler mo56374m() {
        return (Handler) this.f74406g.getValue();
    }

    /* renamed from: com.ss.android.ugc.asve.editor.a$a */
    public static final class C31061a {
        static {
            Covode.recordClassIndex(37691);
        }

        private C31061a() {
        }

        public /* synthetic */ C31061a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final C85553b mo56300a() {
        C85553b bVar = mo56244E().f191838e;
        C89219l.m154716b(bVar, "");
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final VESize mo56330b() {
        VESize c = mo56244E().mo131674c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56312a(String[] strArr) {
        mo56244E().mo131667b(strArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56309a(VEListener.AbstractC85253v vVar) {
        C89219l.m154721d(vVar, "");
        if (this.f74402b.isEmpty()) {
            mo56244E().f191844k = this.f74407h;
            C31089r rVar = this.f74411l;
            if (rVar != null) {
                VEListener.AbstractC85253v vVar2 = this.f74407h;
                C89219l.m154721d(vVar2, "");
                rVar.f74490d = vVar2;
            }
        }
        if (!m63961a(this.f74402b, vVar)) {
            this.f74402b.add(vVar);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56310a(AbstractC85541q qVar) {
        C89219l.m154721d(qVar, "");
        if (this.f74403c.isEmpty()) {
            mo56244E().mo131644a(this.f74408i);
            C31089r rVar = this.f74411l;
            if (rVar != null) {
                AbstractC85541q qVar2 = this.f74408i;
                C89219l.m154721d(qVar2, "");
                rVar.f74495i = qVar2;
                C85581w wVar = rVar.f74488b;
                if (wVar == null) {
                    C89219l.m154710a("veEditor");
                } else {
                    wVar.mo131644a(qVar2);
                }
            }
        }
        if (!m63961a(this.f74403c, qVar)) {
            this.f74403c.add(qVar);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final void mo56333b(AbstractC85541q qVar) {
        C89219l.m154721d(qVar, "");
        this.f74403c.remove(qVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final VESize mo56299a(int i, int i2) {
        VESize b = mo56244E().mo131662b(i, i2);
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56302a(float f, float f2, float f3, int i, int i2) {
        mo56244E().mo131635a(f, f2, f3, i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final Bitmap mo56298a(int i) {
        return mo56244E().mo131630a(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56274a(AbstractC31077h hVar) {
        C31089r rVar;
        C85581w wVar;
        C89219l.m154721d(hVar, "");
        if (this.f74410k && (hVar instanceof C31083n) && (rVar = this.f74411l) != null) {
            C85581w wVar2 = rVar.f74488b;
            if (wVar2 == null) {
                C89219l.m154710a("veEditor");
            } else {
                wVar2.mo131703j();
            }
            HandlerThread handlerThread = rVar.f74487a;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            Looper looper = null;
            rVar.f74487a = null;
            C85395bh a = C31085b.m64286a();
            if (rVar.f74506t == null) {
                wVar = new C85581w(rVar.f74505s, a);
            } else {
                wVar = new C85581w(rVar.f74505s, rVar.f74506t, a);
            }
            wVar.mo131680d(false);
            wVar.mo131686f(30);
            wVar.mo131684e(rVar.f74500n);
            wVar.mo131618a(rVar.f74497k);
            if (rVar.f74487a == null) {
                HandlerThread handlerThread2 = new HandlerThread("nle-ve-async");
                handlerThread2.start();
                rVar.f74487a = handlerThread2;
            }
            HandlerThread handlerThread3 = rVar.f74487a;
            if (handlerThread3 != null) {
                looper = handlerThread3.getLooper();
            }
            wVar.mo131639a(looper);
            wVar.mo131618a(rVar.f74497k);
            wVar.mo131686f(rVar.f74498l);
            wVar.mo131688f(rVar.f74499m);
            wVar.mo131678d(rVar.f74501o);
            wVar.mo131708l(rVar.f74502p);
            wVar.mo131707k(rVar.f74503q);
            wVar.mo131666b(rVar.f74504r);
            wVar.f191844k = rVar.f74491e;
            if (rVar.f74492f != null) {
                wVar.mo131642a(rVar.f74492f);
            }
            if (rVar.f74493g != null) {
                wVar.mo131643a(rVar.f74493g);
            }
            if (rVar.f74494h != null) {
                AbstractC85541q qVar = rVar.f74494h;
                if (qVar == null) {
                    C89219l.m154715b();
                }
                wVar.mo131665b(qVar);
            }
            if (rVar.f74495i != null) {
                AbstractC85541q qVar2 = rVar.f74495i;
                if (qVar2 == null) {
                    C89219l.m154715b();
                }
                wVar.mo131644a(qVar2);
            }
            if (rVar.f74496j != null) {
                VEListener.AbstractC85222aa aaVar = rVar.f74496j;
                if (aaVar == null) {
                    C89219l.m154715b();
                }
                wVar.mo131641a(aaVar);
            }
            rVar.f74488b = wVar;
        }
        int a2 = hVar.mo56408a(mo56244E(), this.f74410k);
        this.f74410k = true;
        return a2;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56276a(VERecordData vERecordData, boolean z, boolean z2) {
        return mo56244E().mo131600a(vERecordData, z, z2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56284a(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131607a(str, i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56277a(C85391be beVar) {
        C89219l.m154721d(beVar, "");
        return mo56244E().mo131601a(beVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56278a(C85391be beVar, int i, int i2) {
        C89219l.m154721d(beVar, "");
        return mo56244E().mo131602a(beVar, i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56261a(int i, ROTATE_DEGREE rotate_degree) {
        C89219l.m154721d(rotate_degree, "");
        return mo56244E().mo131586a(i, rotate_degree);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56269a(int i, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(arrayList2, "");
        return mo56244E().mo131593a(i, arrayList, arrayList2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56271a(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(vEClipTimelineParamArr, "");
        return mo56244E().mo131595a(i, iArr, vEClipTimelineParamArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56264a(int i, VEBaseFilterParam vEBaseFilterParam, int i2, int i3) {
        C89219l.m154721d(vEBaseFilterParam, "");
        return mo56244E().mo131582a(i, 0, vEBaseFilterParam, i2, i3);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56263a(int i, VEBaseFilterParam vEBaseFilterParam) {
        C89219l.m154721d(vEBaseFilterParam, "");
        return mo56244E().mo131588a(i, vEBaseFilterParam);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56293a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        return mo56244E().mo131661b(iArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56304a(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        mo56244E().mo131638a(bitmap);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56311a(boolean z) {
        mo56244E().mo131684e(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final void mo56334b(boolean z) {
        mo56244E().mo131688f(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56307a(VEListener.AbstractC85247p pVar) {
        C89219l.m154721d(pVar, "");
        mo56244E().mo131643a(pVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56329b(String[] strArr) {
        return mo56244E().mo131621a(strArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56296a(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            return -100;
        }
        return mo56244E().mo131626a(strArr, strArr2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56280a(C85581w.EnumC85606e eVar) {
        C89219l.m154721d(eVar, "");
        return mo56244E().mo131604a(eVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56265a(int i, C85581w.EnumC85607f fVar) {
        C89219l.m154721d(fVar, "");
        mo56374m().removeMessages(100);
        mo56374m().sendEmptyMessage(100);
        return mo56244E().mo131589a(i, fVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56266a(int i, C85581w.EnumC85607f fVar, VEListener.AbstractC85250s sVar) {
        C89219l.m154721d(fVar, "");
        return mo56244E().mo131590a(i, fVar, sVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56287a(String str, int i, int i2, boolean z) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131610a(str, i, i2, z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56285a(String str, int i, int i2, int i3, int i4, boolean z) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131608a(str, i, i2, i3, i4, z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final boolean mo56313a(int i, int i2, float f) {
        return mo56244E().mo131645a(i, i2, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56292a(String str, String[] strArr) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131615a(str, strArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56275a(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        return mo56244E().mo131598a(vEInfoStickerBufferListener);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56283a(String str, float f, float f2, float f3, float f4) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131606a(str, f, f2, f3, f4);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56282a(String str, float f) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131671c(str, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56289a(String str, String str2, float f) {
        return mo56244E().mo131612a(str, str2, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56290a(String str, String str2, float f, float f2, float f3) {
        return mo56244E().mo131613a(str, str2, f, f2, f3);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56281a(String str) {
        return mo56244E().mo131670c(str);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int[] mo56318a(int[] iArr, int[] iArr2, String[] strArr) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(iArr2, "");
        C89219l.m154721d(strArr, "");
        int[] a = mo56244E().mo131651a(iArr, iArr2, strArr);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int[] mo56317a(VECherEffectParam vECherEffectParam) {
        C89219l.m154721d(vECherEffectParam, "");
        int[] a = mo56244E().mo131650a(vECherEffectParam);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56260a(int i, int i2, String str, byte[] bArr, int i3, int i4, VEListener.AbstractC85221a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        return mo56244E().mo131584a(i, i2, str, bArr, i3, i4, aVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56295a(int[] iArr, String str, byte[] bArr, VEListener.AbstractC85221a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        return mo56244E().mo131585a(iArr[0], iArr[1], str, bArr, iArr[2], aVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56288a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return mo56244E().mo131611a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56308a(VEListener.AbstractC85251t tVar) {
        mo56244E().f191789Z = tVar;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56294a(int[] iArr, int i, int i2, C85581w.EnumC85602a aVar, VEListener.AbstractC85254w wVar) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(wVar, "");
        return mo56244E().mo131620a(iArr, i, i2, aVar, wVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final boolean mo56314a(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C89219l.m154721d(vEVideoEncodeSettings, "");
        return mo56244E().mo131646a(vEVideoEncodeSettings);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final boolean mo56316a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.AbstractC85248q qVar) {
        C89219l.m154721d(vEVideoEncodeSettings, "");
        return mo56244E().mo131649a(str, str2, vEVideoEncodeSettings, qVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final boolean mo56315a(String str, VEVideoEncodeSettings vEVideoEncodeSettings) {
        C89219l.m154721d(vEVideoEncodeSettings, "");
        return mo56244E().mo131648a(str, (String) null, vEVideoEncodeSettings);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56286a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(vEAlgorithmPath, "");
        return mo56244E().mo131609a(str, i, i2, vEAlgorithmPath);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56262a(int i, VEListener.AbstractC85240i iVar) {
        return mo56244E().mo131587a(i, iVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int[] mo56319a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(iArr2, "");
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr3, "");
        C89219l.m154721d(iArr4, "");
        C89219l.m154721d(strArr2, "");
        int[] a = mo56244E().mo131652a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56267a(int i, String str, String str2) {
        return mo56244E().mo131591a(i, str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56270a(int i, float[] fArr) {
        C89219l.m154721d(fArr, "");
        return mo56244E().mo131594a(i, fArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56272a(int i, ByteBuffer[] byteBufferArr) {
        C89219l.m154721d(byteBufferArr, "");
        return mo56244E().mo131596a(i, byteBufferArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56268a(int i, ByteBuffer byteBuffer) {
        return mo56244E().mo131592a(i, byteBuffer);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56291a(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(mv_reesult_in_type, "");
        return mo56244E().mo131614a(str, str2, str3, mv_reesult_in_type);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56306a(VEListener.AbstractC85222aa aaVar) {
        C89219l.m154721d(aaVar, "");
        mo56244E().mo131641a(aaVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56279a(VEBaseFilterParam vEBaseFilterParam) {
        return mo56244E().mo131603a(vEBaseFilterParam);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56273a(C31067b bVar) {
        C89219l.m154721d(bVar, "");
        return mo56244E().mo131627a(bVar.f74418a, bVar.f74419b, bVar.f74420c, bVar.f74421d, bVar.f74422e, bVar.f74423f, bVar.f74424g, bVar.f74425h, bVar.f74426i, bVar.f74427j, bVar.f74428k);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56297a(boolean[] zArr, C31067b bVar) {
        C89219l.m154721d(zArr, "");
        C89219l.m154721d(bVar, "");
        return mo56244E().mo131629a(zArr, bVar.f74418a, bVar.f74419b, bVar.f74420c, bVar.f74421d, bVar.f74422e, bVar.f74423f, bVar.f74424g, bVar.f74425h, bVar.f74426i, bVar.f74427j, bVar.f74428k);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final String mo56301a(int i, int i2, int i3, String str) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131631a(i, i2, i3, str);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56305a(AbstractC31071f.AbstractC31073b bVar) {
        if (bVar != null && !this.f74401a.contains(bVar)) {
            this.f74401a.add(bVar);
            mo56374m().removeMessages(100);
            mo56374m().sendEmptyMessageDelayed(100, 100);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final void mo56332b(AbstractC31071f.AbstractC31073b bVar) {
        if (bVar != null) {
            this.f74401a.remove(bVar);
            if (this.f74401a.isEmpty()) {
                mo56374m().removeMessages(100);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: F */
    public final float mo56245F() {
        return mo56244E().f191822ai;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: J */
    public final void mo56249J() {
        mo56244E().mo131681e();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: K */
    public final void mo56250K() {
        mo56244E().mo131570G();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: r */
    public final void mo56385r() {
        mo56244E().mo131699i();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: x */
    public final int mo56393x() {
        return mo56300a().f191690k;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: y */
    public final int mo56394y() {
        return mo56300a().f191689j;
    }

    /* renamed from: com.ss.android.ugc.asve.editor.a$c */
    static final class C31063c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        final /* synthetic */ C31060a f74414a;

        static {
            Covode.recordClassIndex(37693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31063c(C31060a aVar) {
            super(0);
            this.f74414a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper(), new Handler.Callback(this) {
                /* class com.p2082ss.android.ugc.asve.editor.C31060a.C31063c.C310641 */

                /* renamed from: a */
                final /* synthetic */ C31063c f74415a;

                static {
                    Covode.recordClassIndex(37694);
                }

                {
                    this.f74415a = r1;
                }

                public final boolean handleMessage(Message message) {
                    C89219l.m154721d(message, "");
                    if (message.what != 100) {
                        return true;
                    }
                    Iterator<T> it = this.f74415a.f74414a.f74401a.iterator();
                    while (it.hasNext()) {
                        it.next().mo56404a(this.f74415a.f74414a.mo56244E().mo131725t());
                    }
                    if (this.f74415a.f74414a.mo56244E().mo131706k() != C85581w.EnumC85611j.STARTED) {
                        return true;
                    }
                    this.f74415a.f74414a.mo56374m().sendEmptyMessageDelayed(100, 100);
                    return true;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: A */
    public final boolean mo56240A() {
        return mo56244E().mo131730v();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: B */
    public final int mo56241B() {
        return mo56244E().mo131566C();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: C */
    public final int mo56242C() {
        return mo56244E().mo131567D();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: D */
    public final int mo56243D() {
        return mo56244E().mo131569F();
    }

    /* renamed from: E */
    public final C85581w mo56244E() {
        C85581w a;
        C31089r rVar = this.f74411l;
        if (rVar == null || (a = rVar.mo56514a()) == null) {
            return this.f74412m;
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: H */
    public final int mo56247H() {
        return mo56244E().mo131564A();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: I */
    public final int mo56248I() {
        return mo56244E().mo131565B();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: L */
    public final void mo56251L() {
        this.f74401a.clear();
        mo56374m().removeMessages(100);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: d */
    public final int mo56345d() {
        return mo56244E().mo131571H();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: j */
    public final int mo56368j() {
        return mo56244E().mo131723s();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: k */
    public final int mo56370k() {
        return mo56244E().mo131725t();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: n */
    public final int mo56376n() {
        return mo56244E().mo131618a(true);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: q */
    public final int mo56382q() {
        return mo56244E().mo131737z();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: u */
    public final int mo56390u() {
        return mo56244E().mo131717p();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: v */
    public final int mo56391v() {
        return mo56244E().mo131719q();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: w */
    public final int mo56392w() {
        return mo56244E().mo131721r();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: z */
    public final int mo56395z() {
        return mo56244E().mo131728u();
    }

    /* renamed from: com.ss.android.ugc.asve.editor.a$b */
    static final class C31062b implements VEListener.AbstractC85253v {

        /* renamed from: a */
        final /* synthetic */ C31060a f74413a;

        static {
            Covode.recordClassIndex(37692);
        }

        C31062b(C31060a aVar) {
            this.f74413a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85253v
        /* renamed from: a */
        public final void mo56396a() {
            Iterator<T> it = this.f74413a.f74402b.iterator();
            while (it.hasNext()) {
                it.next().mo56396a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: G */
    public final int mo56246G() {
        return mo56244E().mo131718p(mo56244E().mo131723s());
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: f */
    public final C85581w.EnumC85611j mo56356f() {
        return mo56244E().mo131706k();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: i */
    public final String[] mo56367i() {
        return mo56244E().mo131713n();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: l */
    public final List<VEClipAlgorithmParam> mo56373l() {
        return mo56244E().mo131568E();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: o */
    public final int mo56379o() {
        return mo56244E().mo131735y();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: p */
    public final int mo56381p() {
        return mo56244E().mo131685f();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: s */
    public final void mo56387s() {
        mo56374m().removeMessages(100);
        mo56244E().mo131703j();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: t */
    public final int mo56388t() {
        mo56374m().removeMessages(100);
        mo56374m().sendEmptyMessageDelayed(100, 100);
        return mo56244E().mo131714o();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: e */
    public final VEMVAudioInfo mo56353e() {
        return mo56244E().mo131572I();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: g */
    public final String[] mo56362g() {
        return mo56244E().mo131709l();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: h */
    public final String[] mo56365h() {
        return mo56244E().mo131711m();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final Bitmap mo56340c() {
        return mo56244E().mo131677d();
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final void mo56331b(int i) {
        mo56244E().mo131664b(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final void mo56341c(float f) {
        mo56244E().mo131634a(f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: d */
    public final void mo56347d(int i) {
        mo56244E().mo131683e(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: e */
    public final void mo56354e(boolean z) {
        mo56244E().mo131704j(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: f */
    public final void mo56357f(boolean z) {
        mo56244E().mo131695h(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: g */
    public final void mo56361g(boolean z) {
        mo56244E().mo131680d(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: m */
    public final void mo56375m(int i) {
        mo56244E().mo131736y(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56252a(float f) {
        return mo56244E().mo131654b(f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56320b(float f) {
        return mo56244E().mo131668c(f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final float mo56335c(String str) {
        C89219l.m154721d(str, "");
        return mo56244E().mo131653b(str);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: e */
    public final int mo56351e(int i) {
        return mo56244E().mo131690g(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: g */
    public final int mo56359g(int i) {
        return mo56244E().mo131722r(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: i */
    public final int mo56366i(int i) {
        return mo56244E().mo131686f(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: l */
    public final int mo56372l(int i) {
        return mo56244E().mo131733x(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: o */
    public final float mo56378o(int i) {
        return mo56244E().mo131727u(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: p */
    public final float mo56380p(int i) {
        return mo56244E().mo131729v(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: r */
    public final int mo56384r(int i) {
        return mo56244E().mo131715o(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: s */
    public final int mo56386s(int i) {
        return mo56244E().mo131712n(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: t */
    public final int mo56389t(int i) {
        return mo56244E().mo131710m(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C31060a(String str) {
        this(new C85581w(str), new C31089r(str, null));
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: d */
    public final String mo56346d(String str) {
        C89219l.m154721d(str, "");
        String a = mo56244E().mo131632a(str);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: h */
    public final float[] mo56364h(int i) {
        float[] s = mo56244E().mo131724s(i);
        C89219l.m154716b(s, "");
        return s;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: j */
    public final int mo56369j(int i) {
        return mo56244E().mo131701j(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: k */
    public final int mo56371k(int i) {
        return mo56244E().mo131705k(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: n */
    public final int mo56377n(int i) {
        return mo56244E().mo131726t(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: q */
    public final boolean mo56383q(int i) {
        return mo56244E().mo131732w(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: f */
    public final boolean mo56358f(int i) {
        return mo56244E().mo131720q(i);
    }

    public C31060a(C85581w wVar) {
        C89219l.m154721d(wVar, "");
        this.f74405f = new C31088q();
        this.f74401a = new ArrayList();
        this.f74406g = C89250i.m154773a((AbstractC89171a) new C31063c(this));
        this.f74402b = new CopyOnWriteArrayList<>();
        this.f74407h = new C31062b(this);
        this.f74403c = new CopyOnWriteArrayList<>();
        this.f74408i = new C31065d(this);
        this.f74404d = new CopyOnWriteArrayList<>();
        this.f74409j = new C31066e(this);
        this.f74412m = wVar;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final int mo56338c(boolean z) {
        return mo56244E().mo131691g(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: d */
    public final void mo56349d(AbstractC85541q qVar) {
        C89219l.m154721d(qVar, "");
        this.f74404d.remove(qVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final int mo56339c(int[] iArr) {
        C89219l.m154721d(iArr, "");
        return mo56244E().mo131673c(iArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: d */
    public final void mo56350d(boolean z) {
        mo56244E().mo131700i(z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56326b(String str) {
        return mo56244E().mo131676d(str);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final void mo56342c(int i) {
        mo56244E().mo131678d(i);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56328b(int[] iArr) {
        C89219l.m154721d(iArr, "");
        return mo56244E().mo131619a(iArr);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final void mo56344c(AbstractC85541q qVar) {
        C89219l.m154721d(qVar, "");
        if (this.f74404d.isEmpty()) {
            mo56244E().mo131665b(this.f74409j);
            C31089r rVar = this.f74411l;
            if (rVar != null) {
                AbstractC85541q qVar2 = this.f74409j;
                C89219l.m154721d(qVar2, "");
                rVar.f74494h = qVar2;
                C85581w wVar = rVar.f74488b;
                if (wVar == null) {
                    C89219l.m154710a("veEditor");
                } else {
                    wVar.mo131665b(qVar2);
                }
            }
        }
        if (!m63961a(this.f74404d, qVar)) {
            this.f74404d.add(qVar);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: f */
    public final int mo56355f(int i, int i2) {
        return mo56244E().mo131702j(i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: h */
    public final int mo56363h(int i, int i2) {
        return mo56244E().mo131698i(i, i2);
    }

    /* renamed from: a */
    private static boolean m63961a(CopyOnWriteArrayList<?> copyOnWriteArrayList, Object obj) {
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56321b(int i, float f) {
        return mo56244E().mo131655b(i, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final int mo56336c(int i, float f) {
        return mo56244E().mo131669c(i, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: e */
    public final int mo56352e(int i, int i2) {
        return mo56244E().mo131687f(i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: g */
    public final int mo56360g(int i, int i2) {
        return mo56244E().mo131694h(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C31060a(String str, SurfaceView surfaceView) {
        this(new C85581w(str, surfaceView), new C31089r(str, surfaceView));
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56253a(int i, float f) {
        return mo56244E().mo131576a(i, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final int mo56337c(String str, float f) {
        return mo56244E().mo131660b(str, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: d */
    public final void mo56348d(int i, int i2) {
        mo56244E().mo131679d(i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56323b(int i, int i2) {
        return mo56244E().mo131682e(i, i2);
    }

    private C31060a(C85581w wVar, C31089r rVar) {
        C89219l.m154721d(wVar, "");
        C89219l.m154721d(rVar, "");
        this.f74405f = new C31088q();
        this.f74401a = new ArrayList();
        this.f74406g = C89250i.m154773a((AbstractC89171a) new C31063c(this));
        this.f74402b = new CopyOnWriteArrayList<>();
        this.f74407h = new C31062b(this);
        this.f74403c = new CopyOnWriteArrayList<>();
        this.f74408i = new C31065d(this);
        this.f74404d = new CopyOnWriteArrayList<>();
        this.f74409j = new C31066e(this);
        this.f74412m = wVar;
        this.f74411l = rVar;
        if (rVar != null) {
            C89219l.m154721d(wVar, "");
            rVar.f74488b = wVar;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56325b(int i, ROTATE_DEGREE rotate_degree) {
        C89219l.m154721d(rotate_degree, "");
        return mo56244E().mo131658b(i, rotate_degree);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C31060a(String str, TextureView textureView) {
        this(new C85581w(str, textureView), new C31089r(str, null));
        C89219l.m154721d(str, "");
        C89219l.m154721d(textureView, "");
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56327b(String str, float f) {
        return mo56244E().mo131605a(str, f);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: c */
    public final void mo56343c(int i, int i2) {
        mo56244E().mo131675c(i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56322b(int i, float f, float f2) {
        return mo56244E().mo131656b(i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56254a(int i, float f, float f2) {
        return mo56244E().mo131577a(i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56255a(int i, int i2, int i3) {
        return mo56244E().mo131578a(i, i2, i3);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: b */
    public final int mo56324b(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        C89219l.m154721d(vEBaseFilterParam, "");
        return mo56244E().mo131657b(i, i2, vEBaseFilterParam);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C31060a(String str, SurfaceView surfaceView, long j) {
        this(new C85581w(str, surfaceView, j), new C31089r(str, surfaceView));
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56258a(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        C89219l.m154721d(vEBaseFilterParam, "");
        return mo56244E().mo131581a(i, i2, vEBaseFilterParam);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56259a(int i, int i2, C85581w.EnumC85608g gVar) {
        C89219l.m154721d(gVar, "");
        return mo56244E().mo131583a(i, i2, gVar);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final void mo56303a(int i, int i2, int i3, int i4) {
        mo56244E().mo131637a(i, i2, i3, i4);
    }

    /* renamed from: com.ss.android.ugc.asve.editor.a$d */
    static final class C31065d implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C31060a f74416a;

        static {
            Covode.recordClassIndex(37695);
        }

        C31065d(C31060a aVar) {
            this.f74416a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final /* synthetic */ void onCallback(int i, int i2, float f, String str) {
            Iterator<T> it = this.f74416a.f74403c.iterator();
            while (it.hasNext()) {
                it.next().onCallback(i, i2, f, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.editor.a$e */
    static final class C31066e implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C31060a f74417a;

        static {
            Covode.recordClassIndex(37696);
        }

        C31066e(C31060a aVar) {
            this.f74417a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final /* synthetic */ void onCallback(int i, int i2, float f, String str) {
            Iterator<T> it = this.f74417a.f74404d.iterator();
            while (it.hasNext()) {
                it.next().onCallback(i, i2, f, str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56257a(int i, int i2, int i3, boolean z) {
        return mo56244E().mo131580a(i, i2, i3, z);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f
    /* renamed from: a */
    public final int mo56256a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return mo56244E().mo131579a(i, i2, i3, i4, i5, z);
    }
}
