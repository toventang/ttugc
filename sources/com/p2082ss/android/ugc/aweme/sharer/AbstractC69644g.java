package com.p2082ss.android.ugc.aweme.sharer;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.g */
public abstract class AbstractC69644g {

    /* renamed from: a */
    private final Bundle f155466a = new Bundle();

    static {
        Covode.recordClassIndex(82016);
    }

    /* renamed from: a */
    public final AbstractC69644g mo109799a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f155466a.putString(str, str2);
        return this;
    }

    /* renamed from: b */
    public final String mo109800b(String str, String str2) {
        C89219l.m154721d(str, "");
        String string = this.f155466a.getString(str, str2);
        C89219l.m154716b(string, "");
        return string;
    }
}
