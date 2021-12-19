package com.p4501vk.api.sdk.p4502a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.a.d */
public final class C87827d {

    /* renamed from: d */
    public static final C87828a f199507d = new C87828a((byte) 0);

    /* renamed from: a */
    public final Set<EnumC87830f> f199508a;

    /* renamed from: b */
    public final int f199509b;

    /* renamed from: c */
    public final String f199510c;

    static {
        Covode.recordClassIndex(103837);
    }

    /* renamed from: com.vk.api.sdk.a.d$a */
    public static final class C87828a {
        static {
            Covode.recordClassIndex(103838);
        }

        private C87828a() {
        }

        public /* synthetic */ C87828a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final Bundle mo142300a() {
        Bundle bundle = new Bundle();
        bundle.putInt("vk_app_id", this.f199509b);
        Set<EnumC87830f> set = this.f199508a;
        ArrayList arrayList = new ArrayList(C89070n.m154526a(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().name());
        }
        bundle.putStringArrayList("vk_app_scope", new ArrayList<>(arrayList));
        bundle.putString("vk_app_redirect_url", this.f199510c);
        return bundle;
    }

    public /* synthetic */ C87827d(int i, Collection collection) {
        this(i, "https://oauth.vk.com/blank.html", collection);
    }

    public C87827d(int i, String str, Collection<? extends EnumC87830f> collection) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(collection, "");
        this.f199509b = i;
        this.f199510c = str;
        if (i != 0) {
            this.f199508a = new HashSet(collection);
            return;
        }
        throw new IllegalStateException("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
    }
}
