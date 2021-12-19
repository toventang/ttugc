package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36497f;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.j.m */
final /* synthetic */ class CallableC36516m implements Callable {

    /* renamed from: a */
    private final Object[] f86461a;

    static {
        Covode.recordClassIndex(43819);
    }

    CallableC36516m(Object[] objArr) {
        this.f86461a = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CommentApi.m73899a((C36497f) this.f86461a[0]);
    }
}
