package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84600h;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84523o;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84526r;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.g */
public final class C84594g implements AbstractC84600h {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f189062a;

    /* renamed from: b */
    private final AbstractC89171a<String> f189063b;

    /* renamed from: c */
    private final int f189064c;

    /* renamed from: d */
    private final int f189065d;

    static {
        Covode.recordClassIndex(98559);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84600h
    /* renamed from: a */
    public final AbstractC84451j<InfoStickerEffect, InfoStickerListModel> mo129524a(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new C84526r(this.f189062a, i, str, str2, this.f189064c);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84600h
    /* renamed from: a */
    public final AbstractC84451j<InfoStickerEffect, InfoStickerListModel> mo129525a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new C84523o(this.f189062a, str, str2, str3, this.f189065d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84594g(AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2, int i, int i2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f189062a = aVar;
        this.f189063b = aVar2;
        this.f189064c = i;
        this.f189065d = i2;
    }
}
