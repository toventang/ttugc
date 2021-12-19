package com.p2082ss.android.ugc.asve.recorder.p2221c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p2082ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85388bc;
import com.p2082ss.android.vesdk.C85390bd;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.model.VEPrePlayParams;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import org.libsdl.app.AudioRecorderInterface;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.c.b */
public final class C31134b implements AbstractC31133a {

    /* renamed from: a */
    public AbstractC31014b f74591a;

    /* renamed from: b */
    public boolean f74592b;

    /* renamed from: c */
    public final C85346av f74593c;

    /* renamed from: d */
    public final AbstractC31040h f74594d;

    /* renamed from: e */
    private boolean f74595e = true;

    /* renamed from: f */
    private boolean f74596f;

    /* renamed from: g */
    private final C1213t<Boolean> f74597g = new C1213t<>();

    /* renamed from: h */
    private final VECameraSettings f74598h;

    static {
        Covode.recordClassIndex(37777);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final int mo56584a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final int mo56585a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C89219l.m154721d(context, "");
        return 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final int mo56609b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C89219l.m154721d(context, "");
        return 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: h */
    public final LiveData<Boolean> mo56621h() {
        return this.f74597g;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final boolean mo56606a() {
        return this.f74592b;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56601a(String str, String str2, boolean z, String str3, String str4, AbstractC89172b<? super RecorderConcatResult, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        if (z) {
            this.f74593c.mo130740a(new C31135a(bVar));
        } else {
            this.f74593c.mo130758a(str3, str4, new C31136b(bVar));
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56602a(List<ASMediaSegment> list, String str, String str2, int i, VEListener.AbstractC85241j jVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(jVar, "");
        C85346av avVar = this.f74593c;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            C89219l.m154721d(t, "");
            arrayList.add(new C85390bd(t.f74531a, t.f74532b));
        }
        avVar.mo130760a(arrayList, str2, i, jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56600a(String str, long j, long j2, boolean z) {
        C31012a.m63724a().mo56187a().mo56122c("syz setRecordBGM");
        this.f74593c.mo130707a(str, (int) j, z ? 1 : 2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56604a(boolean z, PrivacyCert privacyCert) {
        this.f74595e = z;
        this.f74593c.mo130763a(z, privacyCert);
        if (!z) {
            AbstractC31014b bVar = this.f74591a;
            if (bVar != null) {
                bVar.mo56113m();
            }
            AbstractC31014b bVar2 = this.f74591a;
            if (bVar2 != null) {
                bVar2.mo56114n();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56603a(boolean z) {
        this.f74593c.mo130790c(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56599a(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, AbstractC89172b<? super Integer, C89391z> bVar, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(compressFormat, "");
        C89219l.m154721d(bVar, "");
        this.f74593c.mo130750a(new C85388bc.C85389a().mo130879a(str).mo130877a(new VESize(i, i2)).mo130880a(z).mo130876a(compressFormat).mo130878a(new C31144d(bVar)).mo130881b(z2).f191147a);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56596a(AbstractC89172b<? super Integer, C89391z> bVar) {
        this.f74593c.mo130738a(new C31142h(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.asve.recorder.c.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56605a(boolean r3, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Integer, p4600h.C89391z> r4) {
        /*
            r2 = this;
            com.ss.android.vesdk.av r1 = r2.f74593c
            if (r4 == 0) goto L_0x000a
            com.ss.android.ugc.asve.recorder.c.c r0 = new com.ss.android.ugc.asve.recorder.c.c
            r0.<init>(r4)
            r4 = r0
        L_0x000a:
            com.ss.android.vesdk.VEListener$j r4 = (com.p2082ss.android.vesdk.VEListener.AbstractC85241j) r4
            r1.mo130739a(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.recorder.p2221c.C31134b.mo56605a(boolean, h.f.a.b):void");
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56598a(String str, double d, AbstractC89172b<? super Integer, C89391z> bVar) {
        AbstractC31014b bVar2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        boolean z = this.f74595e && !this.f74596f;
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C31140f(this, str, d, bVar, z, null), 2);
        if (z && (bVar2 = this.f74591a) != null) {
            bVar2.mo56111k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.asve.recorder.c.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56597a(p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Integer, p4600h.C89391z> r4, p4600h.p4611f.p4612a.AbstractC89171a<p4600h.C89391z> r5) {
        /*
            r3 = this;
            com.ss.android.vesdk.av r0 = r3.f74593c
            int r1 = r0.mo130801e()
            r0 = 3
            if (r1 != r0) goto L_0x0011
            com.ss.android.ugc.asve.recorder.c.b$c r0 = new com.ss.android.ugc.asve.recorder.c.b$c
            r0.<init>(r5)
            r3.mo56596a(r0)
        L_0x0011:
            com.ss.android.ugc.asve.context.e r0 = com.p2082ss.android.ugc.asve.C31012a.m63724a()
            com.ss.android.ugc.asve.d r2 = r0.mo56187a()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r2.mo56122c(r1)
            com.ss.android.vesdk.av r1 = r3.f74593c
            if (r4 == 0) goto L_0x0034
            com.ss.android.ugc.asve.recorder.c.c r0 = new com.ss.android.ugc.asve.recorder.c.c
            r0.<init>(r4)
            r4 = r0
        L_0x0034:
            com.ss.android.vesdk.VEListener$j r4 = (com.p2082ss.android.vesdk.VEListener.AbstractC85241j) r4
            r1.mo130779b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.recorder.p2221c.C31134b.mo56597a(h.f.a.b, h.f.a.a):void");
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final boolean mo56607a(boolean z, String str) {
        C89219l.m154721d(str, "");
        return this.f74593c.mo130710a(z, str) == 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56595a(C85346av.AbstractC85362h hVar) {
        C89219l.m154721d(hVar, "");
        this.f74593c.mo130772b(hVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final int mo56608b() {
        return this.f74593c.mo130811i();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: c */
    public final void mo56613c() {
        this.f74593c.mo130817l();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: d */
    public final long mo56616d() {
        return this.f74593c.mo130814j();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: f */
    public final long mo56619f() {
        return this.f74593c.mo130809h();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: i */
    public final int mo56622i() {
        return this.f74593c.mo130830s();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: j */
    public final int mo56623j() {
        return this.f74593c.mo130831t();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: k */
    public final int mo56624k() {
        return this.f74593c.mo130832u();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: l */
    public final float mo56625l() {
        return this.f74593c.mo130833v();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: m */
    public final int mo56626m() {
        return this.f74593c.mo130836y();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: n */
    public final int mo56627n() {
        return this.f74593c.mo130837z();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: o */
    public final int mo56628o() {
        return this.f74593c.mo130677A();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: p */
    public final float mo56629p() {
        return this.f74593c.mo130678B();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: q */
    public final float mo56630q() {
        return this.f74593c.mo130835x();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: r */
    public final int mo56631r() {
        return this.f74593c.mo130834w();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: t */
    public final String[] mo56633t() {
        return this.f74593c.mo130807f();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: u */
    public final void mo56634u() {
        this.f74593c.mo130686J();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: v */
    public final VEMapBufferInfo mo56635v() {
        return this.f74593c.mo130821n();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: e */
    public final boolean mo56618e() {
        if (this.f74593c.mo130801e() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: s */
    public final float[] mo56632s() {
        float[] G = this.f74593c.mo130683G();
        C89219l.m154716b(G, "");
        return G;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: g */
    public final void mo56620g() {
        VEPrePlayParams vEPrePlayParams = new VEPrePlayParams();
        vEPrePlayParams.f191588b = true;
        C31012a.m63724a().mo56187a().mo56122c("syz music beat sticker startPrePlay oldPrePlayStatus:" + this.f74592b);
        this.f74592b = true;
        mo56636e(false);
        this.f74593c.mo130702a(vEPrePlayParams);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56593a(AbstractC31014b bVar) {
        this.f74591a = bVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b
    /* renamed from: d */
    public final void mo56579d(PrivacyCert privacyCert) {
        mo56592a(privacyCert);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$c */
    static final class C31137c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f74601a;

        static {
            Covode.recordClassIndex(37780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31137c(AbstractC89171a aVar) {
            super(1);
            this.f74601a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            AbstractC89171a aVar = this.f74601a;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$d */
    public static final class C31138d implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f74602a;

        static {
            Covode.recordClassIndex(37781);
        }

        C31138d(AbstractC89172b bVar) {
            this.f74602a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        public final void mo56563a(int i) {
            AbstractC89172b bVar = this.f74602a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$h */
    public static final class C31142h implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f74614a;

        static {
            Covode.recordClassIndex(37785);
        }

        C31142h(AbstractC89172b bVar) {
            this.f74614a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        public final void mo56563a(int i) {
            AbstractC89172b bVar = this.f74614a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: c */
    public final void mo56614c(VEListener.AbstractC85241j jVar) {
        C89219l.m154721d(jVar, "");
        this.f74593c.mo130803e(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: d */
    public final void mo56617d(boolean z) {
        this.f74593c.mo130782b(z);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$e */
    static final class C31139e implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ C31134b f74603a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f74604b;

        /* renamed from: c */
        final /* synthetic */ boolean f74605c;

        static {
            Covode.recordClassIndex(37782);
        }

        C31139e(C31134b bVar, AbstractC89172b bVar2, boolean z) {
            this.f74603a = bVar;
            this.f74604b = bVar2;
            this.f74605c = z;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        public final void mo56563a(int i) {
            AbstractC31014b bVar;
            this.f74604b.invoke(Integer.valueOf(i));
            if (this.f74605c && (bVar = this.f74603a.f74591a) != null) {
                bVar.mo56112l();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: c */
    public final void mo56615c(boolean z) {
        this.f74593c.mo130808g(z);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$f */
    static final class C31140f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f74606a;

        /* renamed from: b */
        final /* synthetic */ C31134b f74607b;

        /* renamed from: c */
        final /* synthetic */ String f74608c;

        /* renamed from: d */
        final /* synthetic */ double f74609d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f74610e;

        /* renamed from: f */
        final /* synthetic */ boolean f74611f;

        static {
            Covode.recordClassIndex(37783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31140f(C31134b bVar, String str, double d, AbstractC89172b bVar2, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f74607b = bVar;
            this.f74608c = str;
            this.f74609d = d;
            this.f74610e = bVar2;
            this.f74611f = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C31140f(this.f74607b, this.f74608c, this.f74609d, this.f74610e, this.f74611f, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C31140f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f74606a == 0) {
                C89382r.m154942a(obj);
                int g = C85346av.m146678g();
                this.f74610e.invoke(C89108b.m154610a(g));
                if (this.f74611f) {
                    if (g == 0) {
                        AbstractC31014b bVar = this.f74607b.f74591a;
                        if (bVar != null) {
                            bVar.mo56112l();
                        }
                    } else {
                        AbstractC31014b bVar2 = this.f74607b.f74591a;
                        if (bVar2 != null) {
                            bVar2.mo56100b(g, "");
                        }
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$g */
    static final class C31141g implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ C31134b f74612a;

        /* renamed from: b */
        final /* synthetic */ VEListener.AbstractC85241j f74613b;

        static {
            Covode.recordClassIndex(37784);
        }

        C31141g(C31134b bVar, VEListener.AbstractC85241j jVar) {
            this.f74612a = bVar;
            this.f74613b = jVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        public final void mo56563a(int i) {
            C31012a.m63724a().mo56187a().mo56122c("syz music beat sticker stopPrePlay ret=".concat(String.valueOf(i)));
            this.f74612a.f74592b = false;
            VEListener.AbstractC85241j jVar = this.f74613b;
            if (jVar != null) {
                jVar.mo56563a(i);
            }
            this.f74612a.mo56636e(true);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final void mo56611b(VEListener.AbstractC85241j jVar) {
        C31012a.m63724a().mo56187a().mo56122c("syz music beat sticker stopPrePlay oldPrePlayStatus:" + this.f74592b);
        this.f74593c.mo130797d(new C31141g(this, jVar));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b
    /* renamed from: c */
    public final void mo56578c(PrivacyCert privacyCert) {
        this.f74593c.mo130734a(privacyCert);
        this.f74596f = true;
        AbstractC31014b bVar = this.f74591a;
        if (bVar != null) {
            bVar.mo56111k();
        }
        AbstractC31014b bVar2 = this.f74591a;
        if (bVar2 != null) {
            bVar2.mo56112l();
        }
        this.f74596f = true;
        AbstractC31014b bVar3 = this.f74591a;
        if (bVar3 != null) {
            bVar3.mo56111k();
        }
        AbstractC31014b bVar4 = this.f74591a;
        if (bVar4 != null) {
            bVar4.mo56112l();
        }
    }

    /* renamed from: e */
    public final void mo56636e(boolean z) {
        if (!C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            this.f74597g.postValue(Boolean.valueOf(z));
        } else {
            this.f74597g.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final boolean mo56612b(boolean z) {
        return this.f74593c.mo130800d(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56589a(long j) {
        this.f74593c.mo130730a(j);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56590a(Surface surface) {
        this.f74593c.mo130731a(surface);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56592a(PrivacyCert privacyCert) {
        this.f74593c.mo130778b(privacyCert);
        this.f74596f = false;
        AbstractC31014b bVar = this.f74591a;
        if (bVar != null) {
            bVar.mo56113m();
        }
        AbstractC31014b bVar2 = this.f74591a;
        if (bVar2 != null) {
            bVar2.mo56114n();
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56594a(VEListener.AbstractC85241j jVar) {
        this.f74593c.mo130789c(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56588a(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        if (vESafeAreaParamsArr != null) {
            for (VESafeAreaParams vESafeAreaParams : vESafeAreaParamsArr) {
                C31012a.m63724a().mo56187a().mo56123d("VEMediaController: setSafeArea type " + i + " safeType " + vESafeAreaParams.safeType + " left " + vESafeAreaParams.left + ' ' + "top " + vESafeAreaParams.top + " right " + vESafeAreaParams.right + " bottom " + vESafeAreaParams.bottom);
            }
        }
        this.f74593c.mo130729a(i, vESafeAreaParamsArr);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$a */
    static final class C31135a implements VEListener.AbstractC85246o {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f74599a;

        static {
            Covode.recordClassIndex(37778);
        }

        C31135a(AbstractC89172b bVar) {
            this.f74599a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85246o
        /* renamed from: a */
        public final void mo56637a(int i, String str, String str2) {
            AbstractC89172b bVar = this.f74599a;
            if (bVar != null) {
                C89219l.m154716b(str, "");
                C89219l.m154716b(str2, "");
                bVar.invoke(new RecorderConcatResult(i, str, str2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$b */
    static final class C31136b implements VEListener.AbstractC85246o {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f74600a;

        static {
            Covode.recordClassIndex(37779);
        }

        C31136b(AbstractC89172b bVar) {
            this.f74600a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85246o
        /* renamed from: a */
        public final void mo56637a(int i, String str, String str2) {
            AbstractC89172b bVar = this.f74600a;
            if (bVar != null) {
                C89219l.m154716b(str, "");
                C89219l.m154716b(str2, "");
                bVar.invoke(new RecorderConcatResult(i, str, str2));
            }
        }
    }

    public C31134b(C85346av avVar, AbstractC31040h hVar, VECameraSettings vECameraSettings) {
        C89219l.m154721d(avVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(vECameraSettings, "");
        this.f74593c = avVar;
        this.f74594d = hVar;
        this.f74598h = vECameraSettings;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: b */
    public final void mo56610b(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(surface, "");
        C89219l.m154721d(str, "");
        mo56591a(surface, str, bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56591a(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(surface, "");
        C89219l.m154721d(str, "");
        this.f74593c.mo130735a(this.f74598h);
        this.f74593c.mo130732a(surface, new C31138d(bVar));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final int mo56586a(String str, int i, int i2, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f74593c.mo130755a(str, i, i2, Bitmap.CompressFormat.PNG, new C31144d(bVar));
        return 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a
    /* renamed from: a */
    public final void mo56587a(double d, boolean z, float f, int i, int i2, boolean z2, AbstractC89172b<? super Integer, C89391z> bVar) {
        boolean z3;
        AbstractC31014b bVar2;
        C89219l.m154721d(bVar, "");
        if (!this.f74595e || this.f74596f) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f74593c.mo130724a((float) d, new C31139e(this, bVar, z3));
        if (z3 && (bVar2 = this.f74591a) != null) {
            bVar2.mo56111k();
        }
    }
}
