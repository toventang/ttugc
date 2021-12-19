package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36542d;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;

/* renamed from: com.ss.android.ugc.aweme.comment.j.a */
public abstract class AbstractC36502a<Item, Response> extends AbstractC39100a<Item, Response> {

    /* renamed from: a */
    public final C36542d f86429a = new C36542d();

    static {
        Covode.recordClassIndex(43805);
    }

    /* renamed from: a */
    public abstract void mo63976a(Response response);

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public boolean sendRequest(Object... objArr) {
        this.f86429a.mo64007a();
        return super.sendRequest(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public void handleData(Response response) {
        super.handleData(response);
        if (response instanceof BaseResponse) {
            this.f86429a.mo64008a(response);
        }
        mo63976a(response);
    }
}
