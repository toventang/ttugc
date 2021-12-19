package com.p2082ss.android.ugc.asve.p2213b;

import com.bytedance.covode.number.Covode;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.b.g */
public enum EnumC31025g {
    AS_ENCODE_PROFILE_UNKNOWN,
    AS_ENCODE_PROFILE_BASELINE,
    AS_ENCODE_PROFILE_MAIN,
    AS_ENCODE_PROFILE_HIGH;
    
    public static final C31026a Companion = new C31026a((byte) 0);

    static {
        Covode.recordClassIndex(37654);
    }

    /* renamed from: com.ss.android.ugc.asve.b.g$a */
    public static final class C31026a {
        static {
            Covode.recordClassIndex(37655);
        }

        private C31026a() {
        }

        public /* synthetic */ C31026a(byte b) {
            this();
        }
    }

    public static final EnumC31025g fromOrdinal(int i) {
        if (i == 0) {
            return AS_ENCODE_PROFILE_UNKNOWN;
        }
        if (i == 1) {
            return AS_ENCODE_PROFILE_BASELINE;
        }
        if (i == 2) {
            return AS_ENCODE_PROFILE_MAIN;
        }
        if (i != 3) {
            return AS_ENCODE_PROFILE_UNKNOWN;
        }
        return AS_ENCODE_PROFILE_HIGH;
    }

    public static final int toIntValue(EnumC31025g gVar) {
        C89219l.m154721d(gVar, "");
        int i = C31027h.f74348a[gVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new C89376n();
    }
}
