package com.p2082ss.android.ugc.aweme.sticker.repository.internals;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14412a;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences_CukaieClosetAdapter */
public final class StickerPreferences_CukaieClosetAdapter extends AbstractC14412a implements StickerPreferences {
    static {
        Covode.recordClassIndex(88674);
    }

    public StickerPreferences_CukaieClosetAdapter(AbstractC14409e eVar) {
        super(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final long getAutoApplyStickerTime(long j) {
        return super.getStore().mo23221a("time_auto_apply_sticker", j);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final boolean getBubbleGuideShown(boolean z) {
        return super.getStore().mo23224a("setting_bubble_guide_shown", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final boolean getStickerFirst(boolean z) {
        return super.getStore().mo23224a("setting_sticker_first", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final void setAutoApplyStickerTime(long j) {
        super.getStore().mo23229b("time_auto_apply_sticker", j);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final void setBubbleGuideShown(boolean z) {
        super.getStore().mo23232b("setting_bubble_guide_shown", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final void setStickerFirst(boolean z) {
        super.getStore().mo23232b("setting_sticker_first", z);
    }
}
