package com.p2082ss.ugc.effectplatform.p4454k;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.k.a */
public final class C86821a implements AbstractC86823c {

    /* renamed from: a */
    private final SharedPreferences f195739a;

    /* renamed from: b */
    private final Context f195740b;

    /* renamed from: c */
    private final String f195741c;

    static {
        Covode.recordClassIndex(102520);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4454k.AbstractC86823c
    /* renamed from: a */
    public final void mo140055a() {
        SharedPreferences.Editor edit = this.f195739a.edit();
        if (edit != null) {
            for (String str : this.f195739a.getAll().keySet()) {
                edit.remove(str);
            }
            edit.apply();
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4454k.AbstractC86823c
    /* renamed from: a */
    public final void mo140056a(String str, String str2) {
        SharedPreferences.Editor putString;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        SharedPreferences.Editor edit = this.f195739a.edit();
        if (edit != null && (putString = edit.putString(str, str2)) != null) {
            putString.apply();
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4454k.AbstractC86823c
    /* renamed from: b */
    public final String mo140057b(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String string = this.f195739a.getString(str, str2);
        return string == null ? str2 : string;
    }

    public C86821a(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        this.f195740b = context;
        this.f195741c = str;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        SharedPreferences a = C34822d.m71158a(applicationContext, str, 0);
        C89219l.m154709a((Object) a, "");
        this.f195739a = a;
    }
}
