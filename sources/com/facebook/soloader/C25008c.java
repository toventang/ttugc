package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.c */
public class C25008c extends AbstractC25017i {

    /* renamed from: b */
    protected final File f59339b;

    /* renamed from: c */
    protected final int f59340c;

    static {
        Covode.recordClassIndex(30339);
    }

    @Override // com.facebook.soloader.AbstractC25017i
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f59339b.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f59339b.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.f59340c + ']';
    }

    /* renamed from: a */
    private static String[] m47947a(File file) {
        if (SoLoader.f59315a) {
            Trace.beginSection("SoLoader.getElfDependencies[" + file.getName() + "]");
        }
        try {
            return C25014g.m47959a(file);
        } finally {
            if (SoLoader.f59315a) {
                Trace.endSection();
            }
        }
    }

    public C25008c(File file, int i) {
        this.f59339b = file;
        this.f59340c = i;
    }

    @Override // com.facebook.soloader.AbstractC25017i
    /* renamed from: a */
    public int mo40899a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return mo40903a(str, i, this.f59339b, threadPolicy);
    }

    /* renamed from: a */
    private static void m47946a(File file, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] a = m47947a(file);
        Arrays.toString(a);
        for (String str : a) {
            if (!str.startsWith("/")) {
                SoLoader.m47933a(str, null, i | 1, threadPolicy);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40903a(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file.getCanonicalPath();
            return 0;
        }
        file.getCanonicalPath();
        if ((i & 1) != 0 && (this.f59340c & 2) != 0) {
            return 2;
        }
        if ((this.f59340c & 1) != 0) {
            m47946a(file2, i, threadPolicy);
        }
        try {
            SoLoader.f59316b.mo40895a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (e.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e;
        }
    }
}
