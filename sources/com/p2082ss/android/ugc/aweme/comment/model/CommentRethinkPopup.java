package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup */
public final class CommentRethinkPopup implements Serializable {
    @AbstractC27891c(mo46611a = "body")
    private String body;
    @AbstractC27891c(mo46611a = "highlight")
    private String highlight;
    @AbstractC27891c(mo46611a = "link")
    private final String link;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(43865);
    }

    public CommentRethinkPopup() {
        this(null, null, null, null, 15, null);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHighlight() {
        return this.highlight;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        C89219l.m154721d(str, "");
        this.body = str;
    }

    public final void setHighlight(String str) {
        C89219l.m154721d(str, "");
        this.highlight = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }

    public CommentRethinkPopup(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.title = str;
        this.body = str2;
        this.highlight = str3;
        this.link = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentRethinkPopup(String str, String str2, String str3, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
