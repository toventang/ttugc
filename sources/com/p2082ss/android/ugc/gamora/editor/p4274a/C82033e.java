package com.p2082ss.android.ugc.gamora.editor.p4274a;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.property.C65424dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.a.e */
public final class C82033e extends AbstractC2562j<AbstractC82032d> implements AbstractC21566a, AbstractC82032d {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183589a = {new C89232y(C82033e.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82033e.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: b */
    public final AbstractC82032d f183590b = this;

    /* renamed from: c */
    private final AbstractC89248d f183591c = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d */
    private final AbstractC89248d f183592d = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: e */
    private final C1213t<Boolean> f183593e;

    /* renamed from: f */
    private final List<Integer> f183594f;

    /* renamed from: g */
    private final VEAudioSamiFilterParam f183595g;

    /* renamed from: h */
    private final C21582f f183596h;

    static {
        Covode.recordClassIndex(95857);
    }

    /* renamed from: d */
    private final VideoPublishEditModel m142041d() {
        return (VideoPublishEditModel) this.f183591c.mo23374a(this, f183589a[0]);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d
    /* renamed from: a */
    public final LiveData<Boolean> mo127252a() {
        return this.f183593e;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC82032d getApiComponent() {
        return this.f183590b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183596h;
    }

    /* renamed from: e */
    private final AbstractC31071f m142042e() {
        AbstractC31071f value = ((AbstractC72510a) this.f183592d.mo23374a(this, f183589a[1])).mo114778C().getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        return value;
    }

    /* renamed from: f */
    private final void m142043f() {
        if (!this.f183594f.isEmpty()) {
            m142042e().mo56339c(C89070n.m154578e((Collection<Integer>) this.f183594f));
            this.f183594f.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d
    /* renamed from: b */
    public final void mo127253b() {
        Boolean value = this.f183593e.getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(value, "");
        boolean booleanValue = value.booleanValue();
        m142041d().isAudioEnhance = !booleanValue;
        this.f183593e.setValue(Boolean.valueOf(!booleanValue));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d
    /* renamed from: c */
    public final void mo127254c() {
        C69905c cVar;
        if (C82030c.m142036c()) {
            if (this.f183595g.samiModelPath == null) {
                this.f183595g.samiModelPath = C82030c.m142034a();
            }
            VideoPublishEditModel d = m142041d();
            C89219l.m154721d(d, "");
            if ((d.realHasOriginalSound() || d.isFastImport || ((cVar = C70005cr.m123611a().f156482a) != null && !cVar.isPgc())) && m142041d().isAudioEnhance) {
                m142043f();
                if (m142041d().isFastImport) {
                    int a = m142042e().mo56258a(0, 0, this.f183595g);
                    m142042e().mo56263a(a, this.f183595g);
                    this.f183594f.add(Integer.valueOf(a));
                } else if (m142041d().realHasOriginalSound()) {
                    int a2 = m142042e().mo56258a(1, m142042e().mo56300a().f191689j, this.f183595g);
                    m142042e().mo56263a(a2, this.f183595g);
                    this.f183594f.add(Integer.valueOf(a2));
                } else {
                    C69905c cVar2 = C70005cr.m123611a().f156482a;
                    if (cVar2 != null && !cVar2.isPgc()) {
                        int a3 = m142042e().mo56258a(1, 0, this.f183595g);
                        m142042e().mo56263a(a3, this.f183595g);
                        this.f183594f.add(Integer.valueOf(a3));
                    }
                }
            } else {
                m142043f();
            }
        }
    }

    public C82033e(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f183596h = fVar;
        C1213t<Boolean> tVar = new C1213t<>();
        tVar.setValue(Boolean.valueOf(m142041d().isAudioEnhance));
        this.f183593e = tVar;
        this.f183594f = new ArrayList();
        VEAudioSamiFilterParam vEAudioSamiFilterParam = new VEAudioSamiFilterParam();
        vEAudioSamiFilterParam.samiType = 2;
        vEAudioSamiFilterParam.samiModelPath = null;
        vEAudioSamiFilterParam.samiParam = C89361p.m154854b("\n            {\n                \"name\":\"denoise_v2\",\n                \"version\":\"1.0\",\n                \"config\":{\n                    \"denoisemode\":" + C65424dg.m117143a() + ",\n                    \"denoiserate\":1.0\n                }\n            }\n        ");
        this.f183595g = vEAudioSamiFilterParam;
        C82030c.m142036c();
    }
}
