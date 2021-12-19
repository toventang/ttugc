package com.p2082ss.android.ugc.asve.p2213b;

import com.bytedance.covode.number.Covode;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.b.c */
public enum EnumC31020c {
    AS_CAMERA_LENS_BACK,
    AS_CAMERA_LENS_FRONT,
    AS_CAMERA_LENS_WIDE;
    
    public static final C31021a Companion = new C31021a((byte) 0);

    static {
        Covode.recordClassIndex(37649);
    }

    /* renamed from: com.ss.android.ugc.asve.b.c$a */
    public static final class C31021a {
        static {
            Covode.recordClassIndex(37650);
        }

        private C31021a() {
        }

        public /* synthetic */ C31021a(byte b) {
            this();
        }
    }

    public static final EnumC31020c fromOrdinal(int i) {
        if (i == 0) {
            return AS_CAMERA_LENS_BACK;
        }
        if (i == 1) {
            return AS_CAMERA_LENS_FRONT;
        }
        if (i != 2) {
            return AS_CAMERA_LENS_BACK;
        }
        return AS_CAMERA_LENS_WIDE;
    }

    public static final int toIntValue(EnumC31020c cVar) {
        C89219l.m154721d(cVar, "");
        int i = C31022d.f74343a[cVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C89376n();
    }
}
