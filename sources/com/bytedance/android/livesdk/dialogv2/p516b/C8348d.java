package com.bytedance.android.livesdk.dialogv2.p516b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.dialogv2.b.d */
public final class C8348d extends AbstractC8811a<Prop> {
    static {
        Covode.recordClassIndex(9186);
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: a */
    public final String mo14673a() {
        return ((Prop) this.f21695b).name;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: b */
    public final String mo14674b() {
        return ((Prop) this.f21695b).description;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: c */
    public final ImageModel mo14675c() {
        return ((Prop) this.f21695b).icon;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: d */
    public final long mo14676d() {
        return ((Prop) this.f21695b).f21689id;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a
    /* renamed from: e */
    public final int mo14677e() {
        return ((Prop) this.f21695b).diamond;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: f */
    public final ImageModel mo14678f() {
        return ((Prop) this.f21695b).labelIcon;
    }

    @Override // com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b
    /* renamed from: g */
    public final boolean mo14679g() {
        if (((Prop) this.f21695b).gift == null || (((Prop) this.f21695b).gift.f24000e != 1 && ((Prop) this.f21695b).gift.f24000e != 5)) {
            return true;
        }
        return false;
    }

    public C8348d(Prop prop) {
        super(2, prop);
    }
}
