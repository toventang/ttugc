package com.bytedance.android.livesdk.survey;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.b */
public final class C10795b {

    /* renamed from: a */
    public final String f25998a;

    /* renamed from: b */
    public final long f25999b;

    static {
        Covode.recordClassIndex(12397);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10795b)) {
            return false;
        }
        C10795b bVar = (C10795b) obj;
        return C89219l.m154714a(this.f25998a, bVar.f25998a) && this.f25999b == bVar.f25999b;
    }

    public final int hashCode() {
        String str = this.f25998a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f25999b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SurveyChooseClickData(questionId=" + this.f25998a + ", optionId=" + this.f25999b + ")";
    }

    public C10795b(String str, long j) {
        C89219l.m154721d(str, "");
        this.f25998a = str;
        this.f25999b = j;
    }
}
