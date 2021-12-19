package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3625i.C65675d;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.y */
public final class C73925y extends RuntimeException {
    public static final C73926a Companion = new C73926a((byte) 0);
    public static final Integer[] USER_NETWORK_BAD_CODES = {-5, -110, 120000};

    /* renamed from: a */
    private final C65675d f165972a;

    public C73925y() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.y$a */
    public static final class C73926a {
        static {
            Covode.recordClassIndex(86673);
        }

        private C73926a() {
        }

        public /* synthetic */ C73926a(byte b) {
            this();
        }
    }

    public final long getErrorCode() {
        C65675d dVar = this.f165972a;
        if (dVar != null) {
            return dVar.f147999f;
        }
        return 0;
    }

    public final String toString() {
        return "UploadException(mInfo=" + this.f165972a + ')';
    }

    static {
        Covode.recordClassIndex(86672);
    }

    public C73925y(C65675d dVar) {
        this.f165972a = dVar;
    }

    public static final boolean isUserNetworkBad(int i) {
        return C89064i.m154489a(USER_NETWORK_BAD_CODES, Integer.valueOf(i));
    }

    public static final int resolveErrorCode(Throwable th) {
        C89219l.m154721d(th, "");
        if (th instanceof C73925y) {
            C73925y yVar = (C73925y) th;
            if (yVar.getErrorCode() != 0) {
                return (int) yVar.getErrorCode();
            }
        }
        return 12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C73925y(C65675d dVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : dVar);
    }
}
