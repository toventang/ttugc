package com.p2082ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.common.download.DownloadException */
public final class DownloadException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final int errorCode;

    static {
        Covode.recordClassIndex(95462);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.download.DownloadException$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(95463);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public DownloadException(int i) {
        this.errorCode = i;
    }
}
