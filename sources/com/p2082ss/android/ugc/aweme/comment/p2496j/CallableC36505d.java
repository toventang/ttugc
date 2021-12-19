package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.j.d */
final /* synthetic */ class CallableC36505d implements Callable {

    /* renamed from: a */
    private final C36504c f86434a;

    /* renamed from: b */
    private final Object[] f86435b;

    static {
        Covode.recordClassIndex(43808);
    }

    CallableC36505d(C36504c cVar, Object[] objArr) {
        this.f86434a = cVar;
        this.f86435b = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C36504c cVar = this.f86434a;
        Object[] objArr = this.f86435b;
        cVar.f86431b = (String) objArr[0];
        if (objArr.length == 3) {
            return CommentApi.m73896a((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
        }
        return CommentApi.m73895a((String) objArr[0], ((Integer) objArr[1]).intValue());
    }
}
