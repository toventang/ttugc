package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct */
public abstract class ImShareContactStruct implements Serializable {
    private UrlModel avatar = new UrlModel();
    private String conversationId = "";

    static {
        Covode.recordClassIndex(84593);
    }

    public abstract String getDisplayName();

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final void setAvatar(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        this.avatar = urlModel;
    }

    public final void setConversationId(String str) {
        C89219l.m154721d(str, "");
        this.conversationId = str;
    }
}
