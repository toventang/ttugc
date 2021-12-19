package com.google.android.play.core.p1965d;

import android.os.Build;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26915bf;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.d.l */
public final class C26986l {

    /* renamed from: a */
    private static final Pattern f63881a = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: b */
    private final C26978d f63882b;

    static {
        Covode.recordClassIndex(32462);
    }

    C26986l(C26978d dVar) {
        this.f63882b = dVar;
    }

    /* renamed from: a */
    static void m53626a(C26992r rVar, AbstractC26983i iVar) {
        IOException e;
        MethodCollector.m26663i(13614);
        try {
            ZipFile zipFile = new ZipFile(rVar.f63889a);
            try {
                String str = rVar.f63890b;
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = f63881a.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        C1764a.m5928a("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", new Object[]{str, group2, group});
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new C26985k(zipEntry, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                String[] strArr = Build.SUPPORTED_ABIS;
                for (String str2 : strArr) {
                    if (hashMap.containsKey(str2)) {
                        C1764a.m5928a("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", new Object[]{str2});
                        for (C26985k kVar : (Set) hashMap.get(str2)) {
                            if (hashMap2.containsKey(kVar.f63879a)) {
                                C1764a.m5928a("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", new Object[]{kVar.f63879a, str2});
                            } else {
                                hashMap2.put(kVar.f63879a, kVar);
                                C1764a.m5928a("NativeLibraryExtractor: using library %s for ABI %s", new Object[]{kVar.f63879a, str2});
                            }
                        }
                    } else {
                        C1764a.m5928a("NativeLibraryExtractor: there are no native libraries for supported ABI %s", new Object[]{str2});
                    }
                }
                iVar.mo44690a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
                MethodCollector.m26664o(13614);
            } catch (IOException e2) {
                e = e2;
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    C26915bf.m53466a(e, e3);
                }
                MethodCollector.m26664o(13614);
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            MethodCollector.m26664o(13614);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44692a(C26992r rVar, Set<C26985k> set, AbstractC26984j jVar) {
        for (C26985k kVar : set) {
            File a = this.f63882b.mo44678a(rVar.f63890b, kVar.f63879a);
            boolean z = false;
            if (a.exists() && a.length() == kVar.f63880b.getSize()) {
                z = true;
            }
            jVar.mo44689a(kVar, a, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<File> mo44691a() {
        Set<C26992r> f = this.f63882b.mo44688f();
        C26978d dVar = this.f63882b;
        ArrayList<String> arrayList = new ArrayList();
        File[] listFiles = dVar.mo44686e().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        for (String str : arrayList) {
            Iterator<C26992r> it = f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f63890b.equals(str)) {
                        break;
                    }
                } else {
                    C1764a.m5928a("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str});
                    this.f63882b.mo44682b(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (C26992r rVar : f) {
            HashSet hashSet2 = new HashSet();
            m53626a(rVar, new C26981g(this, hashSet2, rVar));
            for (File file2 : this.f63882b.mo44684c(rVar.f63890b)) {
                if (!hashSet2.contains(file2)) {
                    C1764a.m5928a("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file2.getAbsolutePath(), rVar.f63890b, rVar.f63889a.getAbsolutePath()});
                    this.f63882b.mo44680a(file2);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
