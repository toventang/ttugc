package com.p2082ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.ContentLangDialogContent */
public final class ContentLangDialogContent {
    @AbstractC27891c(mo46611a = "text")
    private final String text;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(47968);
    }

    public ContentLangDialogContent() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ContentLangDialogContent copy$default(ContentLangDialogContent contentLangDialogContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentLangDialogContent.title;
        }
        if ((i & 2) != 0) {
            str2 = contentLangDialogContent.text;
        }
        return contentLangDialogContent.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final ContentLangDialogContent copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new ContentLangDialogContent(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentLangDialogContent)) {
            return false;
        }
        ContentLangDialogContent contentLangDialogContent = (ContentLangDialogContent) obj;
        return C89219l.m154714a(this.title, contentLangDialogContent.title) && C89219l.m154714a(this.text, contentLangDialogContent.text);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ContentLangDialogContent(title=" + this.title + ", text=" + this.text + ")";
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public ContentLangDialogContent(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.title = str;
        this.text = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentLangDialogContent(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
