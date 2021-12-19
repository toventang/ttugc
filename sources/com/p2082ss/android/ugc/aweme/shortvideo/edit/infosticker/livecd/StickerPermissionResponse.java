package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionResponse */
public final class StickerPermissionResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "sticker_list")
    private final ArrayList<StickerPublishStruct> stickerList;

    static {
        Covode.recordClassIndex(83898);
    }

    public StickerPermissionResponse() {
        this(null, 1, null);
    }

    public final ArrayList<StickerPublishStruct> getStickerList() {
        return this.stickerList;
    }

    public StickerPermissionResponse(ArrayList<StickerPublishStruct> arrayList) {
        this.stickerList = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerPermissionResponse(ArrayList arrayList, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : arrayList);
    }
}
