package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeUrl */
public final class AwemeUrl implements Serializable {
    @AbstractC27891c(mo46611a = "uri")
    private final String uri;
    @AbstractC27891c(mo46611a = "url_list")
    private final List<String> urlList;

    static {
        Covode.recordClassIndex(58648);
    }

    public AwemeUrl() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.AwemeUrl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeUrl copy$default(AwemeUrl awemeUrl, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = awemeUrl.urlList;
        }
        if ((i & 2) != 0) {
            str = awemeUrl.uri;
        }
        return awemeUrl.copy(list, str);
    }

    public final List<String> component1() {
        return this.urlList;
    }

    public final String component2() {
        return this.uri;
    }

    public final AwemeUrl copy(List<String> list, String str) {
        C89219l.m154721d(list, "");
        return new AwemeUrl(list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeUrl)) {
            return false;
        }
        AwemeUrl awemeUrl = (AwemeUrl) obj;
        return C89219l.m154714a(this.urlList, awemeUrl.urlList) && C89219l.m154714a(this.uri, awemeUrl.uri);
    }

    public final int hashCode() {
        List<String> list = this.urlList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.uri;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AwemeUrl(urlList=" + this.urlList + ", uri=" + this.uri + ")";
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public AwemeUrl(List<String> list, String str) {
        C89219l.m154721d(list, "");
        this.urlList = list;
        this.uri = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeUrl(List list, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str);
    }
}
