package com.p2082ss.android.ugc.aweme.video.hashtag;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.a */
public final class C80733a {

    /* renamed from: a */
    public int f180507a;

    /* renamed from: b */
    public int f180508b;

    /* renamed from: c */
    public String f180509c;

    static {
        Covode.recordClassIndex(94021);
    }

    public C80733a() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f180507a), Integer.valueOf(this.f180508b), this.f180509c});
    }

    public final String toString() {
        return "(" + this.f180509c + ": " + this.f180507a + ", " + this.f180508b + ")";
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C80733a aVar = (C80733a) obj;
            if (this.f180507a == aVar.f180507a && this.f180508b == aVar.f180508b && ((str = this.f180509c) == (str2 = aVar.f180509c) || (str != null && str.equals(str2)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.a$a */
    public static class C80734a implements Comparator<C80733a> {
        static {
            Covode.recordClassIndex(94022);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C80733a aVar, C80733a aVar2) {
            C80733a aVar3 = aVar;
            C80733a aVar4 = aVar2;
            if (aVar3.f180507a == aVar4.f180507a) {
                return 0;
            }
            if (aVar3.f180507a < aVar4.f180507a) {
                return -1;
            }
            return 1;
        }
    }

    public C80733a(String str, int i, int i2) {
        this.f180509c = str;
        this.f180507a = i;
        this.f180508b = i2;
    }
}
