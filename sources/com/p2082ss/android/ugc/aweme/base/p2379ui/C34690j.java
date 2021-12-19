package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.ui.j */
public final class C34690j {

    /* renamed from: a */
    public Class<? extends C34685e> f81947a;

    /* renamed from: b */
    public String f81948b;

    /* renamed from: c */
    public Bundle f81949c;

    /* renamed from: d */
    public float f81950d = 1.0f;

    /* renamed from: e */
    public int f81951e;

    static {
        Covode.recordClassIndex(41677);
    }

    public final int hashCode() {
        return (this.f81948b.hashCode() * 31) + this.f81951e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34690j)) {
            return false;
        }
        C34690j jVar = (C34690j) obj;
        if (!this.f81948b.equals(jVar.f81948b) || this.f81951e != jVar.f81951e) {
            return false;
        }
        return true;
    }

    public C34690j(Class<? extends C34685e> cls, String str, int i, float f, Bundle bundle) {
        this.f81947a = cls;
        this.f81948b = str;
        this.f81949c = bundle;
        this.f81951e = i;
    }
}
