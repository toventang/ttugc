package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.p3996a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a */
public final class C75858a implements AbstractC75861c {

    /* renamed from: a */
    public C88958b<CategoryEffectModel> f170399a;

    /* renamed from: b */
    private AbstractC88412b f170400b;

    /* renamed from: c */
    private final AbstractC1214u<C35324a<FetchFavoriteListResponse>> f170401c = new C75859a(this);

    /* renamed from: d */
    private final AbstractC89244h<AbstractC75701h> f170402d;

    static {
        Covode.recordClassIndex(88792);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.p3996a.AbstractC75861c
    /* renamed from: a */
    public final void mo119532a() {
        AbstractC88412b bVar = this.f170400b;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f170402d.isInitialized()) {
            this.f170402d.getValue().mo119423a().mo119428b().removeObserver(this.f170401c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75858a(AbstractC89244h<? extends AbstractC75701h> hVar) {
        C89219l.m154721d(hVar, "");
        this.f170402d = hVar;
        C88958b<CategoryEffectModel> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f170399a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a$a */
    static final class C75859a<T> implements AbstractC1214u<C35324a<FetchFavoriteListResponse>> {

        /* renamed from: a */
        final /* synthetic */ C75858a f170403a;

        static {
            Covode.recordClassIndex(88793);
        }

        C75859a(C75858a aVar) {
            this.f170403a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C35324a<FetchFavoriteListResponse> aVar) {
            C35324a.EnumC35325a aVar2;
            C35324a<FetchFavoriteListResponse> aVar3 = aVar;
            if (aVar3 != null && (aVar2 = aVar3.f83351b) != null) {
                int i = C75860b.f170404a[aVar2.ordinal()];
                if (i == 1) {
                    this.f170403a.f170399a.onError(aVar3.f83352c);
                    C75858a aVar4 = this.f170403a;
                    C88958b<CategoryEffectModel> bVar = new C88958b<>();
                    C89219l.m154716b(bVar, "");
                    aVar4.f170399a = bVar;
                } else if (i == 2) {
                    M m = aVar3.f83350a;
                    if (m != null) {
                        C88958b<CategoryEffectModel> bVar2 = this.f170403a.f170399a;
                        CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
                        categoryEffectModel.setCategoryKey("sticker_category:favorite");
                        categoryEffectModel.setEffects(m.getEffects());
                        categoryEffectModel.setCollectEffects(m.getCollectEffects());
                        categoryEffectModel.setBindEffects(m.getBindEffects());
                        bVar2.onNext(categoryEffectModel);
                        return;
                    }
                    this.f170403a.f170399a.onError(new IllegalStateException("data invalid"));
                    C75858a aVar5 = this.f170403a;
                    C88958b<CategoryEffectModel> bVar3 = new C88958b<>();
                    C89219l.m154716b(bVar3, "");
                    aVar5.f170399a = bVar3;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r1 == com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.EnumC35325a.ERROR) goto L_0x0032;
     */
    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75695d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4560f.p4561a.AbstractC88979t<com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> mo119415a(com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a r5) {
        /*
            r4 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r2)
            h.h<com.ss.android.ugc.aweme.sticker.repository.a.h> r0 = r4.f170402d
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.sticker.repository.a.h r3 = (com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h) r3
            com.ss.android.ugc.aweme.sticker.repository.a.i r0 = r3.mo119423a()
            androidx.lifecycle.LiveData r1 = r0.mo119428b()
            androidx.lifecycle.u<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse>> r0 = r4.f170401c
            r1.observeForever(r0)
            boolean r0 = r5.f170136f
            if (r0 != 0) goto L_0x0032
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.bw.b.a r0 = (com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a) r0
            if (r0 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.bw.b.a$a r1 = r0.f83351b
        L_0x002e:
            com.ss.android.ugc.aweme.bw.b.a$a r0 = com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.EnumC35325a.ERROR
            if (r1 != r0) goto L_0x0047
        L_0x0032:
            f.a.b.b r0 = r4.f170400b
            if (r0 == 0) goto L_0x0039
            r0.dispose()
        L_0x0039:
            boolean r0 = r5.f170136f
            f.a.ab r1 = r3.mo119425a(r0)
            f.a.d.f<java.lang.Object> r0 = p4560f.p4561a.p4568e.p4570b.C88446a.f200698d
            f.a.b.b r0 = r1.mo142915a(r0, r0)
            r4.f170400b = r0
        L_0x0047:
            f.a.l.b<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> r0 = r4.f170399a
            f.a.t r0 = r0.mo143283c()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
            return r0
        L_0x0051:
            r1 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.p3996a.C75858a.mo119415a(com.ss.android.ugc.aweme.sticker.repository.c.a):f.a.t");
    }
}
