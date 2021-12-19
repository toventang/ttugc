package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.AbstractC53450j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.p */
public final class C34519p implements AbstractC53450j {

    /* renamed from: a */
    private Context f81511a;

    /* renamed from: b */
    private SharedPreferences f81512b;

    static {
        Covode.recordClassIndex(41477);
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.language.p3063a.AbstractC53450j
    /* renamed from: a */
    public final void mo60947a() {
        SharedPreferences.Editor edit = this.f81512b.edit();
        edit.putInt("languageDialogShowState", 3);
        edit.apply();
    }

    public C34519p(Context context) {
        this.f81511a = context;
        this.f81512b = C34822d.m71158a(context, "InitialChooseLanguagePreferences", 0);
    }
}
