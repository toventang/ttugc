package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import p4600h.C89376n;

/* renamed from: com.ss.android.ugc.aweme.services.PreloadVESoStatus */
public enum PreloadVESoStatus {
    DECOMPRESSING,
    DECOMPRESS_ERROR,
    UNLOAD,
    LOADING,
    LOADED;

    /* renamed from: com.ss.android.ugc.aweme.services.PreloadVESoStatus$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(79708);
            int[] iArr = new int[PreloadVESoStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PreloadVESoStatus.DECOMPRESS_ERROR.ordinal()] = 1;
            iArr[PreloadVESoStatus.DECOMPRESSING.ordinal()] = 2;
            iArr[PreloadVESoStatus.UNLOAD.ordinal()] = 3;
            iArr[PreloadVESoStatus.LOADING.ordinal()] = 4;
            iArr[PreloadVESoStatus.LOADED.ordinal()] = 5;
        }
    }

    static {
        Covode.recordClassIndex(79707);
    }

    public final int toStatusCode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return -3;
        }
        if (i == 2) {
            return -2;
        }
        if (i == 3) {
            return -1;
        }
        if (i == 4) {
            return 0;
        }
        if (i == 5) {
            return 1;
        }
        throw new C89376n();
    }
}
