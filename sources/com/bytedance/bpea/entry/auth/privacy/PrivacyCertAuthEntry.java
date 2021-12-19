package com.bytedance.bpea.entry.auth.privacy;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.C13397a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class PrivacyCertAuthEntry {
    public static final C13395a Companion = new C13395a((byte) 0);

    static {
        Covode.recordClassIndex(15392);
    }

    /* renamed from: com.bytedance.bpea.entry.auth.privacy.PrivacyCertAuthEntry$a */
    public static final class C13395a {
        static {
            Covode.recordClassIndex(15393);
        }

        private C13395a() {
        }

        public /* synthetic */ C13395a(byte b) {
            this();
        }
    }

    public static final void checkSDKCert(PrivacyCert privacyCert, String[] strArr, String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C13397a.C13398a.m24083a(privacyCert, strArr, str, str2);
    }
}
