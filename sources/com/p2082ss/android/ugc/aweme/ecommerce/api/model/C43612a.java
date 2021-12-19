package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.a */
public class C43612a<T> {
    public static final C43613a Companion = new C43613a((byte) 0);
    @AbstractC27891c(mo46611a = "code")
    public final int code;
    @AbstractC27891c(mo46611a = "data")
    public final T data;
    @AbstractC27891c(mo46611a = "message")
    public final String message;

    static {
        Covode.recordClassIndex(51870);
    }

    public C43612a() {
        this(0, null, null, 7, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.a$a */
    public static final class C43613a {
        static {
            Covode.recordClassIndex(51871);
        }

        private C43613a() {
        }

        public /* synthetic */ C43613a(byte b) {
            this();
        }
    }

    public final boolean isCodeOK() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public C43612a(int i, String str, T t) {
        this.code = i;
        this.message = str;
        this.data = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C43612a(int i, String str, Object obj, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : obj);
    }
}
