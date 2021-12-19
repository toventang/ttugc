package com.facebook.soloader;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.soloader.AbstractC25021l;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.e */
public class C25009e extends AbstractC25021l {

    /* renamed from: d */
    protected final File f59341d;

    /* renamed from: e */
    protected final String f59342e;

    static {
        Covode.recordClassIndex(30341);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.e$b */
    public class C25011b extends AbstractC25021l.AbstractC25027e {

        /* renamed from: a */
        private final AbstractC25021l f59345a;

        /* renamed from: b */
        public C25010a[] f59346b;

        /* renamed from: c */
        public final ZipFile f59347c;

        static {
            Covode.recordClassIndex(30343);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40898a(ZipEntry zipEntry, String str) {
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.soloader.AbstractC25021l.AbstractC25027e
        /* renamed from: c */
        public final AbstractC25021l.AbstractC25026d mo40907c() {
            return new C25012a(this, (byte) 0);
        }

        @Override // java.io.Closeable, com.facebook.soloader.AbstractC25021l.AbstractC25027e, java.lang.AutoCloseable
        public void close() {
            this.f59347c.close();
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.soloader.AbstractC25021l.AbstractC25027e
        /* renamed from: b */
        public final AbstractC25021l.C25024b mo40906b() {
            return new AbstractC25021l.C25024b(mo40905a());
        }

        /* renamed from: com.facebook.soloader.e$b$a */
        final class C25012a extends AbstractC25021l.AbstractC25026d {

            /* renamed from: b */
            private int f59350b;

            static {
                Covode.recordClassIndex(30344);
            }

            @Override // com.facebook.soloader.AbstractC25021l.AbstractC25026d
            /* renamed from: a */
            public final boolean mo40909a() {
                C25011b.this.mo40905a();
                if (this.f59350b < C25011b.this.f59346b.length) {
                    return true;
                }
                return false;
            }

            @Override // com.facebook.soloader.AbstractC25021l.AbstractC25026d
            /* renamed from: b */
            public final AbstractC25021l.C25025c mo40910b() {
                MethodCollector.m26663i(6283);
                C25011b.this.mo40905a();
                C25010a[] aVarArr = C25011b.this.f59346b;
                int i = this.f59350b;
                this.f59350b = i + 1;
                C25010a aVar = aVarArr[i];
                InputStream inputStream = C25011b.this.f59347c.getInputStream(aVar.f59343a);
                try {
                    AbstractC25021l.C25025c cVar = new AbstractC25021l.C25025c(aVar, inputStream);
                    MethodCollector.m26664o(6283);
                    return cVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    MethodCollector.m26664o(6283);
                    throw th;
                }
            }

            private C25012a() {
            }

            /* synthetic */ C25012a(C25011b bVar, byte b) {
                this();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C25010a[] mo40905a() {
            if (this.f59346b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C25009e.this.f59342e);
                String[] a = C25018j.m47971a();
                Enumeration<? extends ZipEntry> entries = this.f59347c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a2 = C25018j.m47969a(a, group);
                        if (a2 >= 0) {
                            linkedHashSet.add(group);
                            C25010a aVar = (C25010a) hashMap.get(group2);
                            if (aVar == null || a2 < aVar.f59344b) {
                                hashMap.put(group2, new C25010a(group2, zipEntry, a2));
                            }
                        }
                    }
                }
                this.f59345a.f59356h = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                C25010a[] aVarArr = (C25010a[]) hashMap.values().toArray(new C25010a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    C25010a aVar2 = aVarArr[i2];
                    if (mo40898a(aVar2.f59343a, aVar2.f59363c)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                C25010a[] aVarArr2 = new C25010a[i];
                int i3 = 0;
                for (C25010a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        aVarArr2[i3] = aVar3;
                        i3++;
                    }
                }
                this.f59346b = aVarArr2;
            }
            return this.f59346b;
        }

        C25011b(AbstractC25021l lVar) {
            MethodCollector.m26663i(9364);
            this.f59347c = new ZipFile(C25009e.this.f59341d);
            this.f59345a = lVar;
            MethodCollector.m26664o(9364);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC25021l
    /* renamed from: a */
    public AbstractC25021l.AbstractC25027e mo40896a() {
        return new C25011b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.soloader.e$a */
    public static final class C25010a extends AbstractC25021l.C25023a implements Comparable {

        /* renamed from: a */
        final ZipEntry f59343a;

        /* renamed from: b */
        final int f59344b;

        static {
            Covode.recordClassIndex(30342);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f59363c.compareTo(((C25010a) obj).f59363c);
        }

        C25010a(String str, ZipEntry zipEntry, int i) {
            super(str, C1764a.m5928a("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
            this.f59343a = zipEntry;
            this.f59344b = i;
        }
    }

    public C25009e(Context context, String str, File file, String str2) {
        super(context, str);
        this.f59341d = file;
        this.f59342e = str2;
    }
}
