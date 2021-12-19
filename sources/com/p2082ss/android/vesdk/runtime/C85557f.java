package com.p2082ss.android.vesdk.runtime;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;
import java.io.File;

/* renamed from: com.ss.android.vesdk.runtime.f */
public final class C85557f {

    /* renamed from: a */
    private String f191708a;

    static {
        Covode.recordClassIndex(99732);
    }

    /* renamed from: a */
    public final String mo131528a() {
        return m147457a(DataType.AUDIO) + File.separator + System.currentTimeMillis() + "_record.wav";
    }

    public C85557f(String str) {
        this.f191708a = str;
    }

    /* renamed from: a */
    private String m147457a(String str) {
        File file = new File(this.f191708a, str);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        C85315al.m146642d("VEResManager", "mkdirs failed, workspace path: " + this.f191708a);
        return "";
    }

    /* renamed from: a */
    public static String m147458a(String str, String str2) {
        File file = new File(str, str2);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        C85315al.m146642d("VEResManager", "mkdirs failed, workspace path: ".concat(String.valueOf(str)));
        return "";
    }
}
