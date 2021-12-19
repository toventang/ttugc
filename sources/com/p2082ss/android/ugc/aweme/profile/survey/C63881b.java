package com.p2082ss.android.ugc.aweme.profile.survey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.b */
public final class C63881b {
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: a */
    public int f144812a;
    @AbstractC27891c(mo46611a = "dialog_id")

    /* renamed from: b */
    public int f144813b;
    @AbstractC27891c(mo46611a = "original_id")

    /* renamed from: c */
    public int f144814c;

    static {
        Covode.recordClassIndex(75309);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63881b)) {
            return false;
        }
        C63881b bVar = (C63881b) obj;
        return this.f144812a == bVar.f144812a && this.f144813b == bVar.f144813b && this.f144814c == bVar.f144814c;
    }

    public final int hashCode() {
        return (((this.f144812a * 31) + this.f144813b) * 31) + this.f144814c;
    }

    public final String toString() {
        return "SurveyAnswer(actionType=" + this.f144812a + ", dialogId=" + this.f144813b + ", originalId=" + this.f144814c + ")";
    }

    public C63881b(int i, int i2, int i3) {
        this.f144812a = i;
        this.f144813b = i2;
        this.f144814c = i3;
    }
}
