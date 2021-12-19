package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76086b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$$special$$inlined$singleton$6$lambda$1 */
public final class InternalRecordServiceImpl$$special$$inlined$singleton$6$lambda$1 implements AbstractC76085a {
    final /* synthetic */ C21582f $it;
    private final C75574j stickerViewConfigure;

    static {
        Covode.recordClassIndex(79662);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
    public final boolean isLockStickerEnable() {
        return this.stickerViewConfigure.f169847i;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
    public final boolean reallyLockedSticker(Effect effect) {
        return C76086b.m133425b(effect);
    }

    InternalRecordServiceImpl$$special$$inlined$singleton$6$lambda$1(C21582f fVar) {
        this.$it = fVar;
        this.stickerViewConfigure = (C75574j) fVar.mo35248a(C75574j.class, (String) null);
    }
}
