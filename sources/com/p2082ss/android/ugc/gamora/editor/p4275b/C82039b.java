package com.p2082ss.android.ugc.gamora.editor.p4275b;

import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70938c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70942f;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import dmt.p4542av.video.C88151a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.editor.b.b */
public final class C82039b extends AbstractC2562j<AbstractC82038a> implements AbstractC21566a, AbstractC82038a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183598a = {new C89232y(C82039b.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    public final AbstractC82038a f183599b = this;

    /* renamed from: c */
    private final AbstractC89248d f183600c = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d */
    private final AbstractC89244h f183601d = C89250i.m154774a(EnumC89331m.NONE, new C82040a(this));

    /* renamed from: e */
    private C70938c f183602e;

    /* renamed from: f */
    private final C21582f f183603f;

    static {
        Covode.recordClassIndex(95863);
    }

    /* renamed from: b */
    private final VideoPublishEditModel m142080b() {
        return (VideoPublishEditModel) this.f183600c.mo23374a(this, f183598a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC82038a getApiComponent() {
        return this.f183599b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183603f;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.b.b$a */
    public static final class C82040a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183604a;

        static {
            Covode.recordClassIndex(95864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82040a(AbstractC21566a aVar) {
            super(0);
            this.f183604a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f183604a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4275b.C82039b.C82040a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4275b.AbstractC82038a
    /* renamed from: a */
    public final void mo127284a() {
        m142080b().autoEnhanceType = 2;
        C70938c cVar = new C70938c(this, m142080b());
        this.f183602e = cVar;
        C1213t<C70936b> A = ((AbstractC72510a) this.f183601d.getValue()).mo114776A();
        C89219l.m154721d(A, "");
        cVar.f158834a = A;
        C1213t<C70936b> tVar = cVar.f158834a;
        if (tVar != null) {
            tVar.postValue(new C70936b(cVar.f158836c.autoEnhanceOn, cVar.f158836c.autoEnhanceType, false, C70942f.m125238a(), C70942f.m125239b(), null, 36));
        }
        mo127285a(m142080b().autoEnhanceOn);
    }

    public C82039b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f183603f = fVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4275b.AbstractC82038a
    /* renamed from: a */
    public final void mo127285a(boolean z) {
        C70938c cVar = this.f183602e;
        if (cVar != null) {
            cVar.f158836c.autoEnhanceOn = z;
            cVar.f158836c.autoEnhanceType = 2;
            C1213t<C70936b> tVar = cVar.f158834a;
            if (tVar != null) {
                tVar.postValue(new C70936b(cVar.f158836c.autoEnhanceOn, cVar.f158836c.autoEnhanceType, false, C70942f.m125238a(), C70942f.m125239b(), null, 36));
            }
            C88151a.m153230a("hdr_enabled", Boolean.valueOf(z));
        }
    }
}
