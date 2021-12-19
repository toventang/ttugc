package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.gms.common.internal.t */
public final class C25571t {

    /* renamed from: a */
    private final Resources f60637a;

    /* renamed from: b */
    private final String f60638b;

    static {
        Covode.recordClassIndex(30976);
    }

    public C25571t(Context context) {
        C25565r.m49314a(context);
        Resources resources = context.getResources();
        this.f60637a = resources;
        this.f60638b = resources.getResourcePackageName(R.string.ano);
    }

    /* renamed from: a */
    public final String mo41831a(String str) {
        int identifier = this.f60637a.getIdentifier(str, "string", this.f60638b);
        if (identifier == 0) {
            return null;
        }
        return this.f60637a.getString(identifier);
    }
}
