package com.bytedance.android.livesdk.dialogv2.p516b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.b.e */
public final class C8349e extends AbstractC8812b<C9904t> {
    static {
        Covode.recordClassIndex(9187);
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: a */
    public final String mo14673a() {
        T t = this.f21695b;
        C89219l.m154716b(t, "");
        String str = ((C9904t) t).f23996a;
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: b */
    public final String mo14674b() {
        T t = this.f21695b;
        C89219l.m154716b(t, "");
        String str = ((C9904t) t).f23998c;
        if (str == null) {
            return "red envelope";
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: c */
    public final ImageModel mo14675c() {
        T t = this.f21695b;
        C89219l.m154716b(t, "");
        ImageModel imageModel = ((C9904t) t).f23997b;
        C89219l.m154716b(imageModel, "");
        return imageModel;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: d */
    public final long mo14676d() {
        T t = this.f21695b;
        C89219l.m154716b(t, "");
        return ((C9904t) t).f23999d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8349e(C9904t tVar) {
        super(10, tVar);
        C89219l.m154721d(tVar, "");
    }
}
