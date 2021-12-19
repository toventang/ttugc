package com.p2082ss.android.ugc.aweme.notificationlive;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.a */
public final class C62513a {

    /* renamed from: a */
    public final User f141783a;

    /* renamed from: b */
    public final Activity f141784b;

    /* renamed from: c */
    public final String f141785c;

    /* renamed from: d */
    public final String f141786d;

    /* renamed from: e */
    public final String f141787e;

    /* renamed from: f */
    public final C62577t.AbstractC62578a f141788f;

    /* renamed from: g */
    public final String f141789g;

    /* renamed from: h */
    public final AwemeRawAd f141790h;

    /* renamed from: i */
    public final boolean f141791i;

    /* renamed from: j */
    public final AbstractC63755f f141792j;

    static {
        Covode.recordClassIndex(73309);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62513a)) {
            return false;
        }
        C62513a aVar = (C62513a) obj;
        return C89219l.m154714a(this.f141783a, aVar.f141783a) && C89219l.m154714a(this.f141784b, aVar.f141784b) && C89219l.m154714a(this.f141785c, aVar.f141785c) && C89219l.m154714a(this.f141786d, aVar.f141786d) && C89219l.m154714a(this.f141787e, aVar.f141787e) && C89219l.m154714a(this.f141788f, aVar.f141788f) && C89219l.m154714a(this.f141789g, aVar.f141789g) && C89219l.m154714a(this.f141790h, aVar.f141790h) && this.f141791i == aVar.f141791i && C89219l.m154714a(this.f141792j, aVar.f141792j);
    }

    public final int hashCode() {
        User user = this.f141783a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Activity activity = this.f141784b;
        int hashCode2 = (hashCode + (activity != null ? activity.hashCode() : 0)) * 31;
        String str = this.f141785c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141786d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141787e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C62577t.AbstractC62578a aVar = this.f141788f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f141789g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AwemeRawAd awemeRawAd = this.f141790h;
        int hashCode8 = (hashCode7 + (awemeRawAd != null ? awemeRawAd.hashCode() : 0)) * 31;
        boolean z = this.f141791i;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode8 + i2) * 31;
        AbstractC63755f fVar = this.f141792j;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "BellClickParameter(user=" + this.f141783a + ", activity=" + this.f141784b + ", enterFrom=" + this.f141785c + ", previousPage=" + this.f141786d + ", previousPagePosition=" + this.f141787e + ", displayUI=" + this.f141788f + ", clickFrom=" + this.f141789g + ", awemeRawAd=" + this.f141790h + ", isVertical=" + this.f141791i + ", pushStatusCallback=" + this.f141792j + ")";
    }

    public /* synthetic */ C62513a(User user, Activity activity, String str, String str2) {
        this(user, activity, str, str2, "", null, "", null);
    }

    public C62513a(User user, Activity activity, String str, String str2, boolean z, AbstractC63755f fVar) {
        this(user, activity, str, str2, "", null, "", null, z, fVar);
    }

    public C62513a(User user, Activity activity, String str, String str2, String str3, C62577t.AbstractC62578a aVar, String str4, AwemeRawAd awemeRawAd) {
        this(user, activity, str, str2, str3, aVar, str4, awemeRawAd, true, null);
    }

    private C62513a(User user, Activity activity, String str, String str2, String str3, C62577t.AbstractC62578a aVar, String str4, AwemeRawAd awemeRawAd, boolean z, AbstractC63755f fVar) {
        this.f141783a = user;
        this.f141784b = activity;
        this.f141785c = str;
        this.f141786d = str2;
        this.f141787e = str3;
        this.f141788f = aVar;
        this.f141789g = str4;
        this.f141790h = awemeRawAd;
        this.f141791i = z;
        this.f141792j = fVar;
    }
}
