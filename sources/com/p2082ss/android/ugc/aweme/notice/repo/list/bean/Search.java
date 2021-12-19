package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.Search */
public final class Search {
    @AbstractC27891c(mo46611a = "display_keyword")
    private String displayKeyword;
    @AbstractC27891c(mo46611a = "keyword")
    private String keyword;

    static {
        Covode.recordClassIndex(72349);
    }

    public Search() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Search copy$default(Search search, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = search.keyword;
        }
        if ((i & 2) != 0) {
            str2 = search.displayKeyword;
        }
        return search.copy(str, str2);
    }

    public final String component1() {
        return this.keyword;
    }

    public final String component2() {
        return this.displayKeyword;
    }

    public final Search copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new Search(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Search)) {
            return false;
        }
        Search search = (Search) obj;
        return C89219l.m154714a(this.keyword, search.keyword) && C89219l.m154714a(this.displayKeyword, search.displayKeyword);
    }

    public final int hashCode() {
        String str = this.keyword;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.displayKeyword;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Search(keyword=" + this.keyword + ", displayKeyword=" + this.displayKeyword + ")";
    }

    public final String getDisplayKeyword() {
        return this.displayKeyword;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final void setDisplayKeyword(String str) {
        C89219l.m154721d(str, "");
        this.displayKeyword = str;
    }

    public final void setKeyword(String str) {
        C89219l.m154721d(str, "");
        this.keyword = str;
    }

    public Search(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.keyword = str;
        this.displayKeyword = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Search(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
