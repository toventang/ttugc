package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.aa */
public final class C87755aa extends C87787v {
    @AbstractC27891c(mo46611a = "external_ids")

    /* renamed from: f */
    public final C87756a f199323f;
    @AbstractC27891c(mo46611a = "device_id_created_at")

    /* renamed from: g */
    public final long f199324g = 0;
    @AbstractC27891c(mo46611a = "language")

    /* renamed from: h */
    public final String f199325h;

    static {
        Covode.recordClassIndex(103753);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.aa$a */
    public class C87756a {
        @AbstractC27891c(mo46611a = "AD_ID")

        /* renamed from: a */
        public final String f199326a;

        static {
            Covode.recordClassIndex(103754);
        }

        public C87756a(String str) {
            this.f199326a = str;
        }
    }

    public C87755aa(C87764e eVar, long j, String str, String str2, List<Object> list) {
        super("syndicated_sdk_impression", eVar, j, list);
        this.f199325h = str;
        this.f199323f = new C87756a(str2);
    }
}
