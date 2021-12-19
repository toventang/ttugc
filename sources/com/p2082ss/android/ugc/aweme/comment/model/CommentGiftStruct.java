package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentGiftStruct */
public final class CommentGiftStruct implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private final long f86529id;
    @AbstractC27891c(mo46611a = "image")
    private final UrlModel image;

    static {
        Covode.recordClassIndex(43856);
    }

    public final long getId() {
        return this.f86529id;
    }

    public final UrlModel getImage() {
        return this.image;
    }
}
