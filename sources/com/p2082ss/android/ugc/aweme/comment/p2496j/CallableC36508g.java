package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.j.g */
final /* synthetic */ class CallableC36508g implements Callable {

    /* renamed from: a */
    private final C36507f f86440a;

    /* renamed from: b */
    private final Object[] f86441b;

    static {
        Covode.recordClassIndex(43811);
    }

    CallableC36508g(C36507f fVar, Object[] objArr) {
        this.f86440a = fVar;
        this.f86441b = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C36507f fVar = this.f86440a;
        Object[] objArr = this.f86441b;
        fVar.f86436b = (String) objArr[0];
        fVar.f86437c = (String) objArr[1];
        fVar.f86438d = (String) objArr[2];
        return CommentApi.m73897a((String) objArr[0], (String) objArr[1], (String) objArr[2], C33721c.m69041a((String) objArr[3]));
    }
}
