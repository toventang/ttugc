package com.p2082ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AbstractC17881i;
import com.bytedance.ies.ugc.appcontext.C17873f;

/* renamed from: com.ss.android.ugc.aweme.app.host.b */
public final class C33760b implements AbstractC17881i {

    /* renamed from: a */
    private AwemeHostApplication f79972a;

    static {
        Covode.recordClassIndex(40657);
    }

    @Override // com.bytedance.ies.ugc.appcontext.AbstractC17881i
    /* renamed from: a */
    public final Application mo28460a() {
        return this.f79972a;
    }

    @Override // com.bytedance.ies.ugc.appcontext.AbstractC17881i
    /* renamed from: b */
    public final Activity mo28461b() {
        return C17873f.m33102j();
    }

    @Override // com.bytedance.ies.ugc.appcontext.AbstractC17881i
    /* renamed from: c */
    public final Resources mo28462c() {
        return this.f79972a.getResources();
    }

    public C33760b(AwemeHostApplication awemeHostApplication) {
        this.f79972a = awemeHostApplication;
    }
}
