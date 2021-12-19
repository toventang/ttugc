package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.soloader.AbstractC25021l;
import com.facebook.soloader.C25009e;
import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
public final class C25005a extends C25009e {

    /* renamed from: a */
    public final int f59332a;

    static {
        Covode.recordClassIndex(30336);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC25021l, com.facebook.soloader.C25009e
    /* renamed from: a */
    public final AbstractC25021l.AbstractC25027e mo40896a() {
        return new C25006a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC25021l
    /* renamed from: b */
    public final byte[] mo40897b() {
        File canonicalFile = this.f59341d.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(C25018j.m47967a(this.f59354f));
            if ((this.f59332a & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f59354f.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: com.facebook.soloader.a$a */
    protected class C25006a extends C25009e.C25011b {

        /* renamed from: e */
        private File f59334e;

        /* renamed from: f */
        private final int f59335f;

        static {
            Covode.recordClassIndex(30337);
        }

        C25006a(C25009e eVar) {
            super(eVar);
            this.f59334e = new File(C25005a.this.f59354f.getApplicationInfo().nativeLibraryDir);
            this.f59335f = C25005a.this.f59332a;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.soloader.C25009e.C25011b
        /* renamed from: a */
        public final boolean mo40898a(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(C25005a.this.f59355g)) {
                C25005a.this.f59355g = null;
                C1764a.m5928a("allowing consideration of corrupted lib %s", new Object[]{str});
            } else if ((this.f59335f & 1) != 0) {
                File file = new File(this.f59334e, str);
                if (!file.isFile()) {
                    C1764a.m5928a("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length == size) {
                        return false;
                    }
                    C1764a.m5928a("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                }
            }
            return true;
        }
    }

    public C25005a(Context context, String str, int i) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
        this.f59332a = i;
    }
}
