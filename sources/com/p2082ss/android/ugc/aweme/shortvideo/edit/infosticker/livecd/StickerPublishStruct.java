package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPublishStruct */
public final class StickerPublishStruct {
    @AbstractC27891c(mo46611a = "sticker_type")
    private final int stickerType;

    static {
        Covode.recordClassIndex(83899);
    }

    public StickerPublishStruct() {
        this(0, 1, null);
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public StickerPublishStruct(int i) {
        this.stickerType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerPublishStruct(int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
