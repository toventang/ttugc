package com.bytedance.helios.sdk;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.c */
public final class C15372c {

    /* renamed from: a */
    public final String f37496a;

    /* renamed from: b */
    public AbstractC1196i.EnumC1198a f37497b;

    /* renamed from: c */
    public String f37498c;

    /* renamed from: d */
    public int f37499d;

    static {
        Covode.recordClassIndex(17624);
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f37496a + '/' + this.f37497b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C15372c)) {
            return false;
        }
        C15372c cVar = (C15372c) obj;
        if (!TextUtils.equals(this.f37496a, cVar.f37496a) || this.f37497b != cVar.f37497b) {
            return false;
        }
        return true;
    }

    public C15372c(Activity activity, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(activity, "");
        C89219l.m154719c(aVar, "");
        this.f37496a = activity.toString();
        this.f37497b = aVar;
        String name = activity.getClass().getName();
        C89219l.m154709a((Object) name, "");
        this.f37498c = name;
        this.f37499d = activity.hashCode();
    }
}
