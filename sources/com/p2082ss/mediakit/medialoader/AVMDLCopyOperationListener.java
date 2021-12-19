package com.p2082ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.medialoader.AVMDLCopyOperationListener */
public interface AVMDLCopyOperationListener {
    static {
        Covode.recordClassIndex(101204);
    }

    void onCopyComplete(boolean z, int i, String str);
}
