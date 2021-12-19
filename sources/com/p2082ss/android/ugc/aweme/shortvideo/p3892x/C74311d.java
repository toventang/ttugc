package com.p2082ss.android.ugc.aweme.shortvideo.p3892x;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.vesdk.VEListener;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.d */
public final /* synthetic */ class C74311d implements VEListener.AbstractC85241j {

    /* renamed from: a */
    private final C74305a.C74306a f167108a;

    /* renamed from: b */
    private final AbstractC74318j f167109b;

    /* renamed from: c */
    private final String f167110c;

    /* renamed from: d */
    private final String f167111d;

    /* renamed from: e */
    private final int f167112e;

    static {
        Covode.recordClassIndex(87083);
    }

    C74311d(C74305a.C74306a aVar, AbstractC74318j jVar, String str, String str2, int i) {
        this.f167108a = aVar;
        this.f167109b = jVar;
        this.f167110c = str;
        this.f167111d = str2;
        this.f167112e = i;
    }

    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
    /* renamed from: a */
    public final void mo56563a(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC74312e(this.f167108a, this.f167109b, this.f167110c, this.f167111d, this.f167112e));
    }
}
