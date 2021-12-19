package com.bytedance.android.livesdk.dialogv2.p516b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.dialogv2.b.b */
public final class C8346b extends AbstractC8811a<C9904t> {
    static {
        Covode.recordClassIndex(9184);
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: a */
    public final String mo14673a() {
        return ((C9904t) this.f21695b).f23996a;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: b */
    public final String mo14674b() {
        return ((C9904t) this.f21695b).f23998c;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: c */
    public final ImageModel mo14675c() {
        return ((C9904t) this.f21695b).f23997b;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: d */
    public final long mo14676d() {
        return ((C9904t) this.f21695b).f23999d;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a
    /* renamed from: e */
    public final int mo14677e() {
        return ((C9904t) this.f21695b).f24001f;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: f */
    public final ImageModel mo14678f() {
        return ((C9904t) this.f21695b).f24007l;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: g */
    public final boolean mo14679g() {
        if (((C9904t) this.f21695b).f24000e == 1 || ((C9904t) this.f21695b).f24000e == 5 || ((C9904t) this.f21695b).f24000e == 10) {
            return false;
        }
        return true;
    }

    public C8346b(C9904t tVar) {
        super(9, tVar);
    }
}
