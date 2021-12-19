package com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.share.a.a.a */
public class C49926a implements AbstractC49927b {

    /* renamed from: a */
    private WeakReference<Context> f115080a;

    static {
        Covode.recordClassIndex(59037);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
    /* renamed from: a */
    public void mo84975a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
    /* renamed from: a */
    public void mo84976a(String str) {
    }

    /* renamed from: b */
    public final Context mo84977b() {
        return this.f115080a.get();
    }

    public C49926a(Context context) {
        this.f115080a = new WeakReference<>(context);
    }
}
