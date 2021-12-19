package com.ttnet.org.chromium.base.library_loader;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public class LibraryPrefetcher {

    /* renamed from: a */
    private static final AtomicBoolean f198378a = new AtomicBoolean();

    private static native void nativeForkAndPrefetchNativeLibrary();

    private static native OrderedCodeInfo nativeGetOrderedCodeInfo();

    private static native int nativePercentageOfResidentNativeLibraryCode();

    private static native void nativePeriodicallyCollectResidency();

    static {
        Covode.recordClassIndex(103402);
    }

    static final class OrderedCodeInfo {

        /* renamed from: a */
        public final String f198379a;

        /* renamed from: b */
        public final long f198380b;

        /* renamed from: c */
        public final long f198381c;

        static {
            Covode.recordClassIndex(103403);
        }

        public final String toString() {
            return "filename = " + this.f198379a + " startOffset = " + this.f198380b + " length = " + this.f198381c;
        }

        public OrderedCodeInfo(String str, long j, long j2) {
            this.f198379a = str;
            this.f198380b = j;
            this.f198381c = j2;
        }
    }
}
