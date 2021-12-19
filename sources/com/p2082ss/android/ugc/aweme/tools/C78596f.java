package com.p2082ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14175b;

/* renamed from: com.ss.android.ugc.aweme.tools.f */
public final class C78596f extends AbstractC14175b {

    /* renamed from: a */
    public final String f176639a;

    /* renamed from: b */
    public final String f176640b;

    /* renamed from: c */
    public final String f176641c;

    /* renamed from: d */
    public final int f176642d;

    static {
        Covode.recordClassIndex(91730);
    }

    public final String toString() {
        return "ConcatFinishedEvent{videoPath='" + this.f176639a + '\'' + ", audioPath='" + this.f176640b + '\'' + ", statusCode=" + this.f176642d + ", metadata= " + this.f176641c + '}';
    }

    public C78596f(String str, String str2, String str3, int i) {
        this.f176639a = str;
        this.f176640b = str2;
        this.f176642d = i;
        this.f176641c = str3;
    }
}
