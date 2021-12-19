package com.p2082ss.android.ugc.aweme.account.p2253l;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.l.e */
public final class C31741e implements AbstractC31743f {

    /* renamed from: a */
    public static final C31742a f75900a = new C31742a((byte) 0);

    /* renamed from: b */
    private Pattern f75901b = Pattern.compile(".*[A-Za-z].*");

    /* renamed from: c */
    private Pattern f75902c = Pattern.compile(".*[\\d].*");

    /* renamed from: d */
    private Pattern f75903d = Pattern.compile(".*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*");

    static {
        Covode.recordClassIndex(38475);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.e$a */
    public static final class C31742a {
        static {
            Covode.recordClassIndex(38476);
        }

        private C31742a() {
        }

        public /* synthetic */ C31742a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2253l.AbstractC31743f
    /* renamed from: a */
    public final boolean mo57697a(String str) {
        C89219l.m154721d(str, "");
        if (!this.f75901b.matcher(str).matches() || !this.f75902c.matcher(str).matches() || !this.f75903d.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}
