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

/* renamed from: com.ss.android.ugc.tools.h.b.b.r */
public final class C84526r extends C84508g implements AbstractC84451j<InfoStickerEffect, InfoStickerListModel> {

    /* renamed from: f */
    private final int f188921f;

    /* renamed from: g */
    private final String f188922g;

    /* renamed from: h */
    private final String f188923h;

    /* renamed from: m */
    private final int f188924m;

    static {
        Covode.recordClassIndex(98491);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: a */
    public final AbstractC88403ab<C89378p<List<InfoStickerEffect>, InfoStickerListModel>> mo129432a() {
        return mo129458a(this.f188924m);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: b */
    public final AbstractC88403ab<List<InfoStickerEffect>> mo129433b() {
        return AbstractC84451j.C84452a.m145274a(this);
    }

    public /* synthetic */ C84526r(AbstractC89171a aVar, int i, String str, String str2, int i2) {
        this(aVar, i, str, str2, i2, C84518j.f188903a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84526r(AbstractC89171a<? extends AbstractC84398d> aVar, int i, String str, String str2, int i2, C84521m mVar) {
        super(aVar, i, str, str2, mVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(mVar, "");
        this.f188921f = i;
        this.f188922g = str;
        this.f188923h = str2;
        this.f188924m = i2;
    }
}
