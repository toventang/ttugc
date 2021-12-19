package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.f */
public final /* synthetic */ class C69987f implements AbstractC89171a {

    /* renamed from: a */
    private final C69980b f156435a;

    /* renamed from: b */
    private final EffectTextModel f156436b;

    /* renamed from: c */
    private final AbstractC89172b f156437c;

    static {
        Covode.recordClassIndex(82401);
    }

    C69987f(C69980b bVar, EffectTextModel effectTextModel, AbstractC89172b bVar2) {
        this.f156435a = bVar;
        this.f156436b = effectTextModel;
        this.f156437c = bVar2;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        C69980b bVar = this.f156435a;
        EffectTextModel effectTextModel = this.f156436b;
        AbstractC89172b bVar2 = this.f156437c;
        boolean z = false;
        if (effectTextModel.getTextSticker() == null || !effectTextModel.getHasCoverText()) {
            bVar.f156418p.put(0, new EffectTextModel());
        } else {
            bVar.f156418p.put(0, effectTextModel);
        }
        bVar.f156417o.put(0, Float.valueOf(bVar.f156403a.getVideoCoverViewX()));
        if (!bVar.mo110434b()) {
            int i = 0;
            while (true) {
                if (!C69980b.m123583a(bVar.f156414l.mo110438c().getCoverPublishModel().getEffectTextModel(), bVar.f156418p.get(0))) {
                    i++;
                    if (i > 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            bVar.mo110434b();
            C63244g.m114602a().mo73265K().mo101707b(valueOf.booleanValue(), new C69986e(bVar, bVar2));
            return C89391z.f203057a;
        }
        z = true;
        Boolean valueOf2 = Boolean.valueOf(z);
        bVar.mo110434b();
        C63244g.m114602a().mo73265K().mo101707b(valueOf2.booleanValue(), new C69986e(bVar, bVar2));
        return C89391z.f203057a;
    }
}
