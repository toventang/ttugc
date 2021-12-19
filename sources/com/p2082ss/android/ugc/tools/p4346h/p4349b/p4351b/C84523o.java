package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.o */
public final class C84523o extends C84498d implements AbstractC84451j<InfoStickerEffect, InfoStickerListModel> {

    /* renamed from: m */
    private final int f188914m;

    /* renamed from: n */
    private final String f188915n;

    /* renamed from: o */
    private final String f188916o;

    /* renamed from: p */
    private final String f188917p;

    /* renamed from: q */
    private final int f188918q;

    static {
        Covode.recordClassIndex(98488);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: a */
    public final AbstractC88403ab<C89378p<List<InfoStickerEffect>, InfoStickerListModel>> mo129432a() {
        return mo129458a(this.f188918q);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: b */
    public final AbstractC88403ab<List<InfoStickerEffect>> mo129433b() {
        return AbstractC84451j.C84452a.m145274a(this);
    }

    public /* synthetic */ C84523o(AbstractC89171a aVar, String str, String str2, String str3, int i) {
        this(aVar, str, str2, str3, i, C84518j.f188903a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84523o(AbstractC89171a<? extends AbstractC84398d> aVar, String str, String str2, String str3, int i, C84521m mVar) {
        super(aVar, 2, str, str2, str3, mVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(mVar, "");
        this.f188914m = 2;
        this.f188915n = str;
        this.f188916o = str2;
        this.f188917p = str3;
        this.f188918q = i;
    }
}
