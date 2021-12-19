package com.p2082ss.android.ugc.aweme.sticker.types.lock;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.d */
public final class C76089d {

    /* renamed from: a */
    Context f170952a;

    /* renamed from: b */
    public String f170953b;

    /* renamed from: c */
    SharedPreferences f170954c;

    /* renamed from: d */
    SharedPreferences.Editor f170955d;

    /* renamed from: e */
    Set<String> f170956e = this.f170954c.getStringSet("remindedIds", new HashSet());

    static {
        Covode.recordClassIndex(89035);
    }

    /* renamed from: a */
    public final List<String> mo119823a() {
        return new ArrayList(this.f170956e);
    }

    /* renamed from: a */
    public final void mo119824a(String str) {
        if (this.f170956e.add(str)) {
            this.f170955d.putStringSet("remindedIds", this.f170956e);
            this.f170955d.apply();
        }
    }

    public C76089d(Context context, String str) {
        this.f170952a = context;
        this.f170953b = str;
        SharedPreferences a = C34822d.m71158a(context, str + "STICKER_RELATED", 0);
        this.f170954c = a;
        this.f170955d = a.edit();
    }
}
