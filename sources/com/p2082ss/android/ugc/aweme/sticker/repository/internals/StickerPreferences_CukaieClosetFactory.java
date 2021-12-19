package com.p2082ss.android.ugc.aweme.sticker.repository.internals;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14413b;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences_CukaieClosetFactory */
public final class StickerPreferences_CukaieClosetFactory implements AbstractC14413b {
    static {
        Covode.recordClassIndex(88675);
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final String closetName() {
        return "av_settings.xml";
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final Object createCloset(AbstractC14409e eVar) {
        return new StickerPreferences_CukaieClosetAdapter(eVar);
    }
}
