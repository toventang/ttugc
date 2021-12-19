package com.p2082ss.android.ugc.aweme.photo;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photo.c */
public final class C62859c implements AbstractC62884s {

    /* renamed from: a */
    public final String f142553a;

    /* renamed from: b */
    public final String f142554b;

    /* renamed from: c */
    public final String f142555c;

    static {
        Covode.recordClassIndex(73690);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62859c)) {
            return false;
        }
        C62859c cVar = (C62859c) obj;
        return C89219l.m154714a(this.f142553a, cVar.f142553a) && C89219l.m154714a(this.f142554b, cVar.f142554b) && C89219l.m154714a(this.f142555c, cVar.f142555c);
    }

    public final int hashCode() {
        String str = this.f142553a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142554b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f142555c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EffectCapturedPhotoPathGenerator(videoDir=" + this.f142553a + ", segmentDir=" + this.f142554b + ", imageFilePath=" + this.f142555c + ")";
    }

    private /* synthetic */ C62859c() {
        this(null, null, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.photo.AbstractC62884s
    /* renamed from: a */
    public final String mo100820a() {
        String str;
        if (TextUtils.isEmpty(this.f142553a)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f142554b)) {
            str = this.f142553a + File.separator + this.f142554b;
        } else {
            str = this.f142553a;
        }
        C84902i.m145900c(new File(str));
        String a = C1764a.m5929a(Locale.getDefault(), "%s/IMG_%s.png", Arrays.copyOf(new Object[]{str, this.f142555c}, 2));
        C89219l.m154716b(a, "");
        return a;
    }

    public C62859c(String str, String str2, String str3) {
        this.f142553a = str;
        this.f142554b = str2;
        this.f142555c = str3;
    }
}
