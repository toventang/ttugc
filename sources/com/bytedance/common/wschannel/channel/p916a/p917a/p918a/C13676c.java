package com.bytedance.common.wschannel.channel.p916a.p917a.p918a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a.c */
public final class C13676c extends C13674a {

    /* renamed from: a */
    private final int f33207a;

    /* renamed from: b */
    private int f33208b;

    static {
        Covode.recordClassIndex(15710);
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p918a.C13674a, com.bytedance.common.wschannel.channel.p916a.p917a.p918a.AbstractC13675b
    /* renamed from: c */
    public final void mo21992c() {
        super.mo21992c();
        this.f33208b = 0;
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p918a.C13674a
    /* renamed from: a */
    public final long mo21989a() {
        if (this.f33208b >= this.f33207a) {
            return -1;
        }
        long a = super.mo21989a();
        if (a == -1) {
            return a;
        }
        this.f33208b++;
        return a;
    }

    public final String toString() {
        return "RetryTimesPolicy{mMaxRetryTime=" + this.f33207a + ", mCurrRetryTime=" + this.f33208b + '}';
    }

    public C13676c(Context context) {
        this(context, (byte) 0);
    }

    private C13676c(Context context, byte b) {
        super(context);
        this.f33207a = 4;
    }
}
