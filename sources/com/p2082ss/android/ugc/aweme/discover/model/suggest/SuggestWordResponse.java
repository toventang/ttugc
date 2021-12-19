package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse */
public final class SuggestWordResponse implements AbstractC33623d, AbstractC33631g {
    @AbstractC27891c(mo46611a = "data")
    public final List<TypeWords> data;
    @AbstractC27891c(mo46611a = "errno")
    public final int errno;
    @AbstractC27891c(mo46611a = "extra")
    public Extra extra;
    @AbstractC27891c(mo46611a = "log_id")
    public String logId;
    @AbstractC27891c(mo46611a = "msg")
    public final String msg;
    private String requestId = "";
    private C14612a<?> requestInfo;

    static {
        Covode.recordClassIndex(50543);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse$Extra */
    public static final class Extra implements Serializable {
        @AbstractC27891c(mo46611a = "call_per_refresh")
        private String callPerRefresh;

        static {
            Covode.recordClassIndex(50544);
        }

        public final String getCallPerRefresh() {
            return this.callPerRefresh;
        }

        public final void setCallPerRefresh(String str) {
            this.callPerRefresh = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C14612a<?> getRequestInfo() {
        return this.requestInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final void setRequestInfo(C14612a<?> aVar) {
        this.requestInfo = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SuggestWordResponse) && C89219l.m154714a(this.data, ((SuggestWordResponse) obj).data)) {
            return true;
        }
        return false;
    }
}
