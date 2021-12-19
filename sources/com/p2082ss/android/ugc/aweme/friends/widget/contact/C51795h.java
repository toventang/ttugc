package com.p2082ss.android.ugc.aweme.friends.widget.contact;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.h */
public final class C51795h extends AbstractC51770a {

    /* renamed from: b */
    public final int f119361b;

    static {
        Covode.recordClassIndex(61160);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C51795h) && this.f119361b == ((C51795h) obj).f119361b;
        }
        return true;
    }

    public final int hashCode() {
        return this.f119361b;
    }

    public final String toString() {
        return "TitleContactPod(title=" + this.f119361b + ")";
    }

    private /* synthetic */ C51795h() {
        this(-1);
    }

    public C51795h(int i) {
        super(2);
        this.f119361b = i;
    }
}
