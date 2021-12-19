package com.p2082ss.android.ugc.aweme.friends.p3016f;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.f.d */
public final /* synthetic */ class RunnableC51495d implements Runnable {

    /* renamed from: a */
    private final C51492c f118679a;

    /* renamed from: b */
    private final String f118680b;

    /* renamed from: c */
    private final C51492c.AbstractC51494b f118681c;

    static {
        Covode.recordClassIndex(60760);
    }

    RunnableC51495d(C51492c cVar, String str, C51492c.AbstractC51494b bVar) {
        this.f118679a = cVar;
        this.f118680b = str;
        this.f118681c = bVar;
    }

    public final void run() {
        String str;
        C51492c cVar = this.f118679a;
        String str2 = this.f118680b;
        C51492c.AbstractC51494b bVar = this.f118681c;
        try {
            str = cVar.f118676a.shortenUrl(str2).getUrl();
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (!C13627m.m24498a(str)) {
            str2 = str;
        }
        C29339a.m58754b(new RunnableC51496e(bVar, str2));
    }
}
