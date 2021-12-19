package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ab */
public final class C87757ab extends C87787v {
    @AbstractC27891c(mo46611a = "language")

    /* renamed from: f */
    public final String f199328f;
    @AbstractC27891c(mo46611a = "event_info")

    /* renamed from: g */
    public final String f199329g;
    @AbstractC27891c(mo46611a = "external_ids")

    /* renamed from: h */
    public final C87758a f199330h;

    static {
        Covode.recordClassIndex(103755);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ab$a */
    public class C87758a {
        @AbstractC27891c(mo46611a = "6")

        /* renamed from: a */
        public final String f199331a;

        static {
            Covode.recordClassIndex(103756);
        }

        public C87758a(String str) {
            this.f199331a = str;
        }
    }

    public C87757ab(C87764e eVar, String str, long j, String str2, String str3, List<Object> list) {
        super("tfw_client_event", eVar, j, list);
        this.f199328f = str2;
        this.f199329g = str;
        this.f199330h = new C87758a(str3);
    }
}
