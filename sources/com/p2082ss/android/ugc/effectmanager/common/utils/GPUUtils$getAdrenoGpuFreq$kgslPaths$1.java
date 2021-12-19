package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.common.utils.GPUUtils$getAdrenoGpuFreq$kgslPaths$1 */
public final class GPUUtils$getAdrenoGpuFreq$kgslPaths$1 implements FilenameFilter {
    public static final GPUUtils$getAdrenoGpuFreq$kgslPaths$1 INSTANCE = new GPUUtils$getAdrenoGpuFreq$kgslPaths$1();

    static {
        Covode.recordClassIndex(95518);
    }

    GPUUtils$getAdrenoGpuFreq$kgslPaths$1() {
    }

    public final boolean accept(File file, String str) {
        C89219l.m154709a((Object) file, "");
        if (file.isDirectory()) {
            C89219l.m154709a((Object) str, "");
            if (C89361p.m154908a((CharSequence) str, (CharSequence) "kgsl", false)) {
                return true;
            }
        }
        return false;
    }
}
