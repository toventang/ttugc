package com.p2082ss.ugc.live.sdk.msg.p4471b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87107d;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.msg.b.e */
public final class C87081e {

    /* renamed from: a */
    public EnumC87080d f196301a;

    /* renamed from: b */
    public String f196302b;

    /* renamed from: c */
    public Map<String, String> f196303c;

    /* renamed from: d */
    public Map<String, String> f196304d;

    /* renamed from: e */
    public byte[] f196305e;

    /* renamed from: f */
    public AbstractC87077a f196306f;

    /* renamed from: g */
    public String f196307g;

    /* renamed from: h */
    public Map<String, String> f196308h;

    /* renamed from: i */
    public long f196309i;

    /* renamed from: j */
    public AbstractC87086h f196310j;

    static {
        Covode.recordClassIndex(102877);
    }

    private C87081e() {
        this.f196301a = EnumC87080d.POST;
    }

    /* renamed from: a */
    public final byte[] mo140790a() {
        return C87107d.m150856a(this);
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.b.e$a */
    public static class C87082a {

        /* renamed from: a */
        public final C87081e f196311a = new C87081e((byte) 0);

        static {
            Covode.recordClassIndex(102878);
        }

        /* renamed from: a */
        public final C87081e mo140793a() {
            if (this.f196311a.f196308h == null) {
                this.f196311a.f196308h = Collections.emptyMap();
            }
            return this.f196311a;
        }

        /* renamed from: a */
        public final C87082a mo140791a(String str) {
            this.f196311a.f196302b = str;
            return this;
        }

        /* renamed from: b */
        public final C87082a mo140794b(String str) {
            this.f196311a.f196307g = str;
            return this;
        }

        /* renamed from: a */
        public final C87082a mo140792a(byte[] bArr) {
            this.f196311a.f196305e = bArr;
            return this;
        }
    }

    /* synthetic */ C87081e(byte b) {
        this();
    }
}
