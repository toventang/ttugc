package com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3977a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75464f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75653m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a.c */
public final class C75612c implements AbstractC75633m {

    /* renamed from: a */
    public static final C75613a f170012a = new C75613a((byte) 0);

    /* renamed from: b */
    private final AbstractC75653m f170013b;

    static {
        Covode.recordClassIndex(88543);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a.c$a */
    public static final class C75613a {
        static {
            Covode.recordClassIndex(88544);
        }

        private C75613a() {
        }

        public /* synthetic */ C75613a(byte b) {
            this();
        }
    }

    public C75612c(AbstractC75653m mVar) {
        this.f170013b = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C75619b a = aVar.mo119345a(cVar);
        if (this.f170013b != null && (cVar instanceof C75618a)) {
            FaceStickerBean a2 = C75464f.m132333a(((C75618a) cVar).f170022a);
            C89219l.m154716b(a2, "");
            if (!C75466g.m132344a(a2) && !a2.getTags().contains("transfer_touch")) {
                a2.getTypes().contains("FaceReplace3D");
            }
        }
        return a;
    }
}
