package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.f */
public final class C33537f implements Serializable {
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: a */
    private final String f79649a;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: b */
    private final List<String> f79650b;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: c */
    private final Integer f79651c;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: d */
    private final Integer f79652d;

    static {
        Covode.recordClassIndex(40407);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.api.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C33537f copy$default(C33537f fVar, String str, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.f79649a;
        }
        if ((i & 2) != 0) {
            list = fVar.f79650b;
        }
        if ((i & 4) != 0) {
            num = fVar.f79651c;
        }
        if ((i & 8) != 0) {
            num2 = fVar.f79652d;
        }
        return fVar.copy(str, list, num, num2);
    }

    public final String component1() {
        return this.f79649a;
    }

    public final List<String> component2() {
        return this.f79650b;
    }

    public final Integer component3() {
        return this.f79651c;
    }

    public final Integer component4() {
        return this.f79652d;
    }

    public final C33537f copy(String str, List<String> list, Integer num, Integer num2) {
        return new C33537f(str, list, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33537f)) {
            return false;
        }
        C33537f fVar = (C33537f) obj;
        return C89219l.m154714a(this.f79649a, fVar.f79649a) && C89219l.m154714a(this.f79650b, fVar.f79650b) && C89219l.m154714a(this.f79651c, fVar.f79651c) && C89219l.m154714a(this.f79652d, fVar.f79652d);
    }

    public final int hashCode() {
        String str = this.f79649a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f79650b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.f79651c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f79652d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "UrlModel(uri=" + this.f79649a + ", urlList=" + this.f79650b + ", width=" + this.f79651c + ", height=" + this.f79652d + ")";
    }

    public final Integer getHeight() {
        return this.f79652d;
    }

    public final String getUri() {
        return this.f79649a;
    }

    public final List<String> getUrlList() {
        return this.f79650b;
    }

    public final Integer getWidth() {
        return this.f79651c;
    }

    public C33537f(String str, List<String> list, Integer num, Integer num2) {
        this.f79649a = str;
        this.f79650b = list;
        this.f79651c = num;
        this.f79652d = num2;
    }
}
