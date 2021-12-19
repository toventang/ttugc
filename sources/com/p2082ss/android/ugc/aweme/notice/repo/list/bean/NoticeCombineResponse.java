package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse */
public final class NoticeCombineResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")
    private final NoticeCombineDatas data;

    static {
        Covode.recordClassIndex(72343);
    }

    public NoticeCombineResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ NoticeCombineResponse copy$default(NoticeCombineResponse noticeCombineResponse, NoticeCombineDatas noticeCombineDatas, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeCombineDatas = noticeCombineResponse.data;
        }
        return noticeCombineResponse.copy(noticeCombineDatas);
    }

    public final NoticeCombineDatas component1() {
        return this.data;
    }

    public final NoticeCombineResponse copy(NoticeCombineDatas noticeCombineDatas) {
        return new NoticeCombineResponse(noticeCombineDatas);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NoticeCombineResponse) && C89219l.m154714a(this.data, ((NoticeCombineResponse) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        NoticeCombineDatas noticeCombineDatas = this.data;
        if (noticeCombineDatas != null) {
            return noticeCombineDatas.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NoticeCombineResponse(data=" + this.data + ")";
    }

    public final NoticeCombineDatas getData() {
        return this.data;
    }

    public NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas) {
        this.data = noticeCombineDatas;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : noticeCombineDatas);
    }
}
