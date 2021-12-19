package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentPrompt */
public final class CommentPrompt implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    private final String content;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(43860);
    }

    public CommentPrompt() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74398xce3e47ce(int i) {
        return i;
    }

    public static /* synthetic */ CommentPrompt copy$default(CommentPrompt commentPrompt, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commentPrompt.type;
        }
        if ((i2 & 2) != 0) {
            str = commentPrompt.content;
        }
        return commentPrompt.copy(i, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.content;
    }

    public final CommentPrompt copy(int i, String str) {
        C89219l.m154721d(str, "");
        return new CommentPrompt(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPrompt)) {
            return false;
        }
        CommentPrompt commentPrompt = (CommentPrompt) obj;
        return this.type == commentPrompt.type && C89219l.m154714a(this.content, commentPrompt.content);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m74398xce3e47ce(this.type) * 31;
        String str = this.content;
        return com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CommentPrompt(type=" + this.type + ", content=" + this.content + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final int getType() {
        return this.type;
    }

    public CommentPrompt(int i, String str) {
        C89219l.m154721d(str, "");
        this.type = i;
        this.content = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentPrompt(int i, String str, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
