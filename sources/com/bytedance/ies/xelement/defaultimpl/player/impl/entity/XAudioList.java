package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;

public final class XAudioList {
    @AbstractC27891c(mo46611a = "list")
    private List<XAudioSrc> mDataSet;
    @AbstractC27891c(mo46611a = "id")
    private String mId = "";
    @AbstractC27891c(mo46611a = "position")
    private Integer mPosition = 0;

    static {
        Covode.recordClassIndex(21970);
    }

    public final AbstractC19188h toPlaylist() {
        int i;
        String str = this.mId;
        if (str == null) {
            str = "";
        }
        List list = this.mDataSet;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        Integer num = this.mPosition;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return new C19206a(str, list, i);
    }
}
