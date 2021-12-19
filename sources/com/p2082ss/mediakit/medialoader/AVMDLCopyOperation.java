package com.p2082ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.medialoader.AVMDLCopyOperation */
public class AVMDLCopyOperation {
    String mDestPath;
    String mFileKey;
    public final AVMDLCopyOperationListener mListener;
    boolean mWaitIfCaching;

    static {
        Covode.recordClassIndex(101203);
    }

    public AVMDLCopyOperation(String str, String str2, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
    }

    public AVMDLCopyOperation(String str, String str2, boolean z, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
        this.mWaitIfCaching = z;
    }
}
