package com.p4501vk.api.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.k */
public final class C87910k implements AbstractC87896h {

    /* renamed from: a */
    public static final C87911a f199653a = new C87911a((byte) 0);

    /* renamed from: b */
    private final SharedPreferences f199654b;

    static {
        Covode.recordClassIndex(103921);
    }

    /* renamed from: com.vk.api.sdk.k$a */
    public static final class C87911a {
        static {
            Covode.recordClassIndex(103922);
        }

        private C87911a() {
        }

        public /* synthetic */ C87911a(byte b) {
            this();
        }
    }

    public /* synthetic */ C87910k(Context context) {
        this(context, "com.vkontakte.android_pref_name");
    }

    @Override // com.p4501vk.api.sdk.AbstractC87896h
    /* renamed from: a */
    public final String mo142369a(String str) {
        C89219l.m154719c(str, "");
        return this.f199654b.getString(str, null);
    }

    @Override // com.p4501vk.api.sdk.AbstractC87896h
    /* renamed from: b */
    public final void mo142371b(String str) {
        C89219l.m154719c(str, "");
        this.f199654b.edit().remove(str).apply();
    }

    private C87910k(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        this.f199654b = C34822d.m71158a(context, str, 0);
    }

    @Override // com.p4501vk.api.sdk.AbstractC87896h
    /* renamed from: a */
    public final void mo142370a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f199654b.edit().putString(str, str2).apply();
    }

    @Override // com.p4501vk.api.sdk.AbstractC87896h
    /* renamed from: b */
    public final void mo142372b(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        if (str2 != null) {
            mo142370a(str, str2);
        } else {
            mo142371b(str);
        }
    }
}
