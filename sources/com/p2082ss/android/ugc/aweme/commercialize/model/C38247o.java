package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.o */
public final class C38247o implements Serializable {
    public static final C38248a Companion = new C38248a((byte) 0);
    @AbstractC27891c(mo46611a = "aweme_id")

    /* renamed from: a */
    private final String f90373a;
    @AbstractC27891c(mo46611a = "item_type")

    /* renamed from: b */
    private final int f90374b;
    @AbstractC27891c(mo46611a = "creative_id")

    /* renamed from: c */
    private final String f90375c;
    @AbstractC27891c(mo46611a = "repack_aweme")

    /* renamed from: d */
    private final Aweme f90376d;

    static {
        Covode.recordClassIndex(45731);
    }

    public C38247o() {
        this(null, 0, null, null, 15, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.o$a */
    public static final class C38248a {
        static {
            Covode.recordClassIndex(45732);
        }

        private C38248a() {
        }

        public /* synthetic */ C38248a(byte b) {
            this();
        }
    }

    public final String getAwemeId() {
        return this.f90373a;
    }

    public final String getCreativeId() {
        return this.f90375c;
    }

    public final int getItemType() {
        return this.f90374b;
    }

    public final Aweme getRepackAweme() {
        return this.f90376d;
    }

    public C38247o(String str, int i, String str2, Aweme aweme) {
        this.f90373a = str;
        this.f90374b = i;
        this.f90375c = str2;
        this.f90376d = aweme;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38247o(String str, int i, String str2, Aweme aweme, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : aweme);
    }
}
