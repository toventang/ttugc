package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75592f;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.AbstractC75912a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler */
public final class ARStickerHandler extends AbstractC75614b implements AbstractC33974au {

    /* renamed from: a */
    public final Context f169942a;

    /* renamed from: b */
    public final AbstractC1204m f169943b;

    /* renamed from: c */
    public final C2560h<Boolean> f169944c;

    /* renamed from: d */
    public final AbstractC75912a f169945d;

    /* renamed from: e */
    public final AbstractC75592f f169946e;

    /* renamed from: f */
    private final AbstractC89244h f169947f = C89250i.m154773a((AbstractC89171a) new C75595a(this));

    static {
        Covode.recordClassIndex(88520);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f169945d.mo119387a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler$a */
    static final class C75595a extends AbstractC89220m implements AbstractC89171a<ARSenorPresenter> {

        /* renamed from: a */
        final /* synthetic */ ARStickerHandler f169948a;

        static {
            Covode.recordClassIndex(88521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75595a(ARStickerHandler aRStickerHandler) {
            super(0);
            this.f169948a = aRStickerHandler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ARSenorPresenter invoke() {
            boolean z;
            Boolean a = this.f169948a.f169944c.mo7034a();
            if (a != null) {
                z = a.booleanValue();
            } else {
                z = false;
            }
            return new ARSenorPresenter(this.f169948a.f169942a, this.f169948a.f169943b, z, this.f169948a.f169945d.mo119386a(), this.f169948a.f169946e.mo23148c());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132359k(aVar.f170022a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: b */
    public final void mo119333b(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        this.f169945d.mo119387a(true);
        this.f169945d.mo119388b();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f169946e.mo23146a((ARSenorPresenter) this.f169947f.getValue(), false);
    }

    public ARStickerHandler(Context context, AbstractC1204m mVar, C2560h<Boolean> hVar, AbstractC75912a aVar, AbstractC75592f fVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f169942a = context;
        this.f169943b = mVar;
        this.f169944c = hVar;
        this.f169945d = aVar;
        this.f169946e = fVar;
    }
}
