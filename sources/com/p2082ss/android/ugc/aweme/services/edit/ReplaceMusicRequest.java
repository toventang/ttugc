package com.p2082ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest */
public final class ReplaceMusicRequest {
    @AbstractC27891c(mo46611a = "new_music_info")
    private EditMusicStruct editMusicStruct = new EditMusicStruct();
    @AbstractC27891c(mo46611a = "item_id")
    private String itemID = "";
    @AbstractC27891c(mo46611a = "original_vid")
    private String originalVid = "";

    static {
        Covode.recordClassIndex(79772);
    }

    public final EditMusicStruct getEditMusicStruct() {
        return this.editMusicStruct;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final String getOriginalVid() {
        return this.originalVid;
    }

    public final void setEditMusicStruct(EditMusicStruct editMusicStruct2) {
        C89219l.m154721d(editMusicStruct2, "");
        this.editMusicStruct = editMusicStruct2;
    }

    public final void setItemID(String str) {
        C89219l.m154721d(str, "");
        this.itemID = str;
    }

    public final void setOriginalVid(String str) {
        C89219l.m154721d(str, "");
        this.originalVid = str;
    }
}
