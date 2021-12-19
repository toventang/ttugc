package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bo */
public final class C69893bo implements AbstractC74304x<C69831ai> {

    /* renamed from: a */
    final AbstractC74304x<C69831ai> f156169a;

    /* renamed from: b */
    private final Handler f156170b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(82302);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishCancel() {
        this.f156170b.post(new RunnableC69900bv(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishPause() {
        this.f156170b.post(new RunnableC69898bt(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishResume() {
        this.f156170b.post(new RunnableC69899bu(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onError(C71818ev evVar) {
        this.f156170b.post(new RunnableC69896br(this, evVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSynthetiseSuccess(String str) {
        this.f156170b.post(new RunnableC69897bs(this, str));
    }

    public C69893bo(AbstractC74304x<C69831ai> xVar) {
        this.f156169a = xVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSuccess(C69831ai aiVar, boolean z) {
        this.f156170b.post(new RunnableC69895bq(this, aiVar, z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onProgressUpdate(int i, boolean z) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f156169a.onProgressUpdate(i, z);
        } else {
            this.f156170b.post(new RunnableC69894bp(this, i, z));
        }
    }
}
