package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.u.f */
public final /* synthetic */ class RunnableC49970f implements Runnable {

    /* renamed from: a */
    private final C49968d f115254a;

    /* renamed from: b */
    private final int f115255b;

    /* renamed from: c */
    private final int f115256c;

    /* renamed from: d */
    private final String f115257d;

    /* renamed from: e */
    private final long f115258e;

    /* renamed from: f */
    private final long f115259f;

    /* renamed from: g */
    private final int f115260g;

    /* renamed from: h */
    private final Integer f115261h;

    /* renamed from: i */
    private final String f115262i;

    /* renamed from: j */
    private final String f115263j;

    /* renamed from: k */
    private final String f115264k;

    /* renamed from: l */
    private final boolean f115265l;

    /* renamed from: m */
    private final boolean f115266m;

    /* renamed from: n */
    private final Lock f115267n;

    static {
        Covode.recordClassIndex(59082);
    }

    RunnableC49970f(C49968d dVar, int i, int i2, String str, long j, long j2, int i3, Integer num, String str2, String str3, String str4, boolean z, boolean z2, Lock lock) {
        this.f115254a = dVar;
        this.f115255b = i;
        this.f115256c = i2;
        this.f115257d = str;
        this.f115258e = j;
        this.f115259f = j2;
        this.f115260g = i3;
        this.f115261h = num;
        this.f115262i = str2;
        this.f115263j = str3;
        this.f115264k = str4;
        this.f115265l = z;
        this.f115266m = z2;
        this.f115267n = lock;
    }

    public final void run() {
        boolean z;
        C49968d dVar = this.f115254a;
        int i = this.f115255b;
        int i2 = this.f115256c;
        String str = this.f115257d;
        long j = this.f115258e;
        long j2 = this.f115259f;
        int i3 = this.f115260g;
        Integer num = this.f115261h;
        String str2 = this.f115262i;
        String str3 = this.f115263j;
        String str4 = this.f115264k;
        boolean z2 = this.f115265l;
        boolean z3 = this.f115266m;
        Lock lock = this.f115267n;
        WeakHandler weakHandler = dVar.mHandler;
        CallableC49974j jVar = new CallableC49974j(dVar, i, i2, str, j, j2, i3, num, str2, str3, str4, z2);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z3) {
            lock = null;
        }
        C49710k.m93118a(i, i2, weakHandler, jVar, 0, z, lock);
    }
}
