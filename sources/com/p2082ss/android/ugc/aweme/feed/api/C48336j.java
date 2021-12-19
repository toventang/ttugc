package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.j */
public final class C48336j implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f112008a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private final String f112009b;
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: c */
    private final List<Aweme> f112010c;
    @AbstractC27891c(mo46611a = "next_cursor")

    /* renamed from: d */
    private final int f112011d;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: e */
    private final boolean f112012e;

    static {
        Covode.recordClassIndex(57108);
    }

    public C48336j() {
        this(0, null, null, 0, false, 31, null);
    }

    public final List<Aweme> getAwemeList() {
        return this.f112010c;
    }

    public final int getCode() {
        return this.f112008a;
    }

    public final boolean getHasMore() {
        return this.f112012e;
    }

    public final String getMsg() {
        return this.f112009b;
    }

    public final int getNextCursor() {
        return this.f112011d;
    }

    public C48336j(int i, String str, List<Aweme> list, int i2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f112008a = i;
        this.f112009b = str;
        this.f112010c = list;
        this.f112011d = i2;
        this.f112012e = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C48336j(int i, String str, List list, int i2, boolean z, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? new ArrayList() : list, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? true : z);
    }
}
