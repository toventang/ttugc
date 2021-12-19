package p078c.p080b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import p078c.p079a.C1749a;
import p078c.p080b.p081a.C1753a;

/* renamed from: c.b.a */
public class C1752a extends File {

    /* renamed from: a */
    private static final C1749a f5622a = C1749a.C1750a.f5617a;

    static {
        Covode.recordClassIndex(1922);
    }

    public C1752a getAbsoluteFile() {
        try {
            return new C1752a(getAbsolutePath());
        } catch (C1753a unused) {
            return null;
        }
    }

    public C1752a getParentFile() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new C1752a(parent);
        } catch (C1753a unused) {
            return null;
        }
    }

    public String getParent() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new C1752a(parent).getPath();
        } catch (C1753a unused) {
            return null;
        }
    }

    public C1752a[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        C1752a[] aVarArr = new C1752a[length];
        for (int i = 0; i < length; i++) {
            try {
                aVarArr[i] = new C1752a(getPath(), list[i]);
            } catch (C1753a unused) {
            }
        }
        return aVarArr;
    }

    public C1752a(String str) {
        super(f5622a.mo5562a(str));
    }

    @Override // java.io.File
    public C1752a[] listFiles(FileFilter fileFilter) {
        C1752a aVar;
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                aVar = new C1752a(getPath(), str);
            } catch (C1753a unused) {
                aVar = null;
            }
            if (fileFilter == null || fileFilter.accept(aVar)) {
                arrayList.add(aVar);
            }
        }
        return (C1752a[]) arrayList.toArray(new C1752a[arrayList.size()]);
    }

    @Override // java.io.File
    public C1752a[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                try {
                    arrayList.add(new C1752a(getPath(), str));
                } catch (C1753a unused) {
                }
            }
        }
        return (C1752a[]) arrayList.toArray(new C1752a[arrayList.size()]);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1752a(java.net.URI r6) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: p078c.p080b.C1752a.<init>(java.net.URI):void");
    }

    public C1752a(String str, String str2) {
        super(f5622a.mo5563a(str, str2));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1752a(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            c.a.a r2 = p078c.p080b.C1752a.f5622a
            if (r5 != 0) goto L_0x0008
        L_0x0004:
            r3.<init>(r5)
            return
        L_0x0008:
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "/"
            java.lang.String r5 = r2.mo5563a(r0, r5)
            goto L_0x0004
        L_0x001d:
            java.lang.String r0 = r4.getPath()
            java.lang.String r5 = r2.mo5563a(r0, r5)
            goto L_0x0004
        L_0x0026:
            java.lang.String r5 = r2.mo5562a(r5)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: p078c.p080b.C1752a.<init>(java.io.File, java.lang.String):void");
    }
}
