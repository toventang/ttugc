package com.p2082ss.android.ugc.aweme.account.p2253l;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.l.h */
public final class C31749h implements AbstractC31743f {

    /* renamed from: a */
    public static final C31750a f75911a = new C31750a((byte) 0);

    /* renamed from: b */
    private Pattern f75912b = Pattern.compile("^[\\w~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\]*$");

    static {
        Covode.recordClassIndex(38483);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.h$a */
    public static final class C31750a {
        static {
            Covode.recordClassIndex(38484);
        }

        private C31750a() {
        }

        public /* synthetic */ C31750a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2253l.AbstractC31743f
    /* renamed from: a */
    public final boolean mo57697a(String str) {
        C89219l.m154721d(str, "");
        return this.f75912b.matcher(str).matches();
    }
}
