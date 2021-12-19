package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a */
public final class C54839a implements Serializable {
    public static final C54840a Companion = new C54840a((byte) 0);
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    private final String f125609a;
    @AbstractC27891c(mo46611a = "idempotent_id")

    /* renamed from: b */
    private final String f125610b;
    @AbstractC27891c(mo46611a = "create_at")

    /* renamed from: c */
    private final Long f125611c;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: d */
    private final String f125612d;
    @AbstractC27891c(mo46611a = "sender_uid")

    /* renamed from: e */
    private final String f125613e;
    @AbstractC27891c(mo46611a = "sender_sec_uid")

    /* renamed from: f */
    private final String f125614f;
    @AbstractC27891c(mo46611a = "message_id")

    /* renamed from: g */
    private final String f125615g;
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: h */
    private final C19538ai f125616h;
    @AbstractC27891c(mo46611a = "mark_read")

    /* renamed from: i */
    private Integer f125617i;

    static {
        Covode.recordClassIndex(64558);
    }

    public C54839a() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a$a */
    public static final class C54840a {
        static {
            Covode.recordClassIndex(64559);
        }

        private C54840a() {
        }

        public /* synthetic */ C54840a(byte b) {
            this();
        }
    }

    public final Long getCreate_at() {
        return this.f125611c;
    }

    public final String getIdempotent_id() {
        return this.f125610b;
    }

    public final String getKey() {
        return this.f125609a;
    }

    public final Integer getMark_read() {
        return this.f125617i;
    }

    public final C19538ai getMessage() {
        return this.f125616h;
    }

    public final String getMessage_id() {
        return this.f125615g;
    }

    public final String getSender_sec_uid() {
        return this.f125614f;
    }

    public final String getSender_uid() {
        return this.f125613e;
    }

    public final String getValue() {
        return this.f125612d;
    }

    public final void setMark_read(Integer num) {
        this.f125617i = num;
    }

    public C54839a(String str, String str2, Long l, String str3, String str4, String str5, String str6, C19538ai aiVar, Integer num) {
        this.f125609a = str;
        this.f125610b = str2;
        this.f125611c = l;
        this.f125612d = str3;
        this.f125613e = str4;
        this.f125614f = str5;
        this.f125615g = str6;
        this.f125616h = aiVar;
        this.f125617i = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54839a(String str, String str2, Long l, String str3, String str4, String str5, String str6, C19538ai aiVar, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : aiVar, (i & 256) == 0 ? num : null);
    }
}
