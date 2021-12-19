package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.context.AbstractC31034c;
import com.p2082ss.android.ugc.asve.context.AbstractC31035d;
import com.p2082ss.android.ugc.asve.context.AbstractC31038f;
import com.p2082ss.android.ugc.asve.context.AbstractC31039g;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.context.C31032a;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31192e;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.av */
public final class C72776av implements AbstractC31040h {

    /* renamed from: A */
    public final CameraComponentModel f163166A;

    /* renamed from: B */
    public final AbstractC89171a<Workspace> f163167B;

    /* renamed from: C */
    private AbstractC31192e f163168C;

    /* renamed from: D */
    private C89378p<Integer, Integer> f163169D;

    /* renamed from: E */
    private AbstractC89171a<Boolean> f163170E;

    /* renamed from: a */
    public boolean f163171a;

    /* renamed from: b */
    public long f163172b;

    /* renamed from: c */
    public C31032a f163173c = new C31032a();

    /* renamed from: d */
    public boolean f163174d;

    /* renamed from: e */
    public boolean f163175e;

    /* renamed from: f */
    public final C72774at f163176f;

    /* renamed from: g */
    public final Void f163177g;

    /* renamed from: h */
    public final C72768ap f163178h;

    /* renamed from: i */
    public final C72808s f163179i;

    /* renamed from: j */
    public boolean f163180j;

    /* renamed from: k */
    public boolean f163181k;

    /* renamed from: l */
    public boolean f163182l;

    /* renamed from: m */
    public boolean f163183m;

    /* renamed from: n */
    public boolean f163184n;

    /* renamed from: o */
    public boolean f163185o;

    /* renamed from: p */
    public boolean f163186p;

    /* renamed from: q */
    public boolean f163187q;

    /* renamed from: r */
    public int f163188r;

    /* renamed from: s */
    public boolean f163189s;

    /* renamed from: t */
    public boolean f163190t;

    /* renamed from: u */
    public boolean f163191u;

    /* renamed from: v */
    public boolean f163192v;

    /* renamed from: w */
    public boolean f163193w;

    /* renamed from: x */
    public boolean f163194x;

    /* renamed from: y */
    public boolean f163195y;

    /* renamed from: z */
    public final Context f163196z;

    static {
        Covode.recordClassIndex(85462);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: c */
    public final boolean mo56156c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72776av)) {
            return false;
        }
        C72776av avVar = (C72776av) obj;
        return C89219l.m154714a(this.f163196z, avVar.f163196z) && C89219l.m154714a(this.f163166A, avVar.f163166A) && C89219l.m154714a(this.f163167B, avVar.f163167B);
    }

    public final int hashCode() {
        Context context = this.f163196z;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        CameraComponentModel cameraComponentModel = this.f163166A;
        int hashCode2 = (hashCode + (cameraComponentModel != null ? cameraComponentModel.hashCode() : 0)) * 31;
        AbstractC89171a<Workspace> aVar = this.f163167B;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: q */
    public final boolean mo56170q() {
        return false;
    }

    public final String toString() {
        return "RecorderContext(context=" + this.f163196z + ", cameraComponentModel=" + this.f163166A + ", workspaceAllocator=" + this.f163167B + ")";
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: A */
    public final boolean mo56152A() {
        return this.f163194x;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: B */
    public final boolean mo56153B() {
        return this.f163195y;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: a */
    public final boolean mo56154a() {
        return this.f163174d;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: b */
    public final boolean mo56155b() {
        return this.f163175e;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: e */
    public final AbstractC31192e mo56158e() {
        return this.f163168C;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: f */
    public final C89378p<Integer, Integer> mo56159f() {
        return this.f163169D;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: g */
    public final boolean mo56160g() {
        return this.f163181k;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: h */
    public final boolean mo56161h() {
        return this.f163184n;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: i */
    public final boolean mo56162i() {
        return this.f163183m;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: j */
    public final boolean mo56163j() {
        return this.f163180j;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: k */
    public final AbstractC89171a<Boolean> mo56164k() {
        return this.f163170E;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC31038f mo56165l() {
        return this.f163178h;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ AbstractC31039g mo56166m() {
        return this.f163176f;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ AbstractC31035d mo56167n() {
        return this.f163179i;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ AbstractC31034c mo56168o() {
        return this.f163173c;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: p */
    public final boolean mo56169p() {
        return this.f163185o;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: r */
    public final boolean mo56171r() {
        return this.f163171a;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: s */
    public final long mo56172s() {
        return this.f163172b;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: t */
    public final boolean mo56173t() {
        return this.f163187q;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: u */
    public final int mo56174u() {
        return this.f163188r;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: v */
    public final boolean mo56175v() {
        return this.f163190t;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: w */
    public final boolean mo56176w() {
        return this.f163186p;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: x */
    public final boolean mo56177x() {
        return this.f163191u;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: y */
    public final boolean mo56178y() {
        return this.f163192v;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: z */
    public final boolean mo56179z() {
        return this.f163193w;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.av$a */
    static final class C72777a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C72777a f163197a = new C72777a();

        static {
            Covode.recordClassIndex(85463);
        }

        C72777a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ SurfaceHolder mo56157d() {
        return (SurfaceHolder) this.f163177g;
    }

    /* renamed from: a */
    public final void mo115060a(C31032a aVar) {
        C89219l.m154721d(aVar, "");
        this.f163173c = aVar;
    }

    /* renamed from: a */
    public final void mo115061a(AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f163170E = aVar;
    }

    public C72776av(Context context, CameraComponentModel cameraComponentModel, AbstractC89171a<Workspace> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cameraComponentModel, "");
        C89219l.m154721d(aVar, "");
        this.f163196z = context;
        this.f163166A = cameraComponentModel;
        this.f163167B = aVar;
        Workspace workspace = cameraComponentModel.f155652h;
        this.f163168C = new C72783c(workspace == null ? aVar.invoke() : workspace);
        this.f163176f = new C72774at(cameraComponentModel);
        this.f163178h = new C72768ap(cameraComponentModel);
        this.f163179i = new C72808s(cameraComponentModel);
        this.f163169D = new C89378p<>(Integer.valueOf(cameraComponentModel.f155647c), Integer.valueOf(cameraComponentModel.f155648d));
        this.f163180j = cameraComponentModel.mo109888a();
        this.f163182l = true;
        this.f163170E = C72777a.f163197a;
        this.f163187q = cameraComponentModel.mo109900l();
        this.f163194x = cameraComponentModel.f155641F;
    }
}
