package com.bytedance.helios.sdk.anchor;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15372c;
import java.util.List;

/* renamed from: com.bytedance.helios.sdk.anchor.a */
public final class C15360a {

    /* renamed from: a */
    public String f37462a;

    /* renamed from: b */
    public int f37463b;

    /* renamed from: c */
    public List<C15372c> f37464c;

    static {
        Covode.recordClassIndex(17612);
    }

    public final String toString() {
        return this.f37462a + '@' + Integer.toHexString(this.f37463b);
    }

    public C15360a(Activity activity) {
        String str;
        int i;
        Class<?> cls;
        if (activity == null || (cls = activity.getClass()) == null) {
            str = null;
        } else {
            str = cls.getName();
        }
        this.f37462a = str;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        this.f37463b = i;
    }

    public C15360a(String str, int i, List<C15372c> list) {
        this.f37462a = str;
        this.f37463b = i;
        this.f37464c = list;
    }
}
