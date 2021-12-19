package com.google.android.play.core.p1965d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.AbstractC26957q;
import com.google.android.play.core.p1963b.C26885ac;
import com.google.android.play.core.p1963b.C26886ad;
import com.google.android.play.core.p1963b.C26887ae;
import com.google.android.play.core.p1963b.C26890ah;
import com.google.android.play.core.p1963b.C26891ai;
import com.google.android.play.core.p1963b.C26893ak;
import com.google.android.play.core.p1963b.C26894al;
import com.google.android.play.core.p1963b.C26915bf;
import com.google.android.play.core.p1963b.C26955o;
import com.google.android.play.core.p1963b.C26956p;
import com.google.android.play.core.p1963b.C26958r;
import com.google.android.play.core.p1963b.C26964x;
import com.google.android.play.core.p1963b.C26965y;
import com.google.android.play.core.p1966e.C27005ak;
import com.google.android.play.core.p1966e.C27006al;
import com.google.android.play.core.p1966e.EnumC27002ah;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.d.a */
public final class C26975a {

    /* renamed from: a */
    public static final AtomicReference<C26975a> f63860a = new AtomicReference<>(null);

    /* renamed from: b */
    final C26978d f63861b;

    /* renamed from: c */
    private final Set<String> f63862c = new HashSet();

    /* renamed from: d */
    private final C26976b f63863d;

    static {
        Covode.recordClassIndex(32451);
    }

    private C26975a(Context context) {
        try {
            C26978d dVar = new C26978d(context);
            this.f63861b = dVar;
            this.f63863d = new C26976b(dVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C26894al(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<String> mo44674a() {
        HashSet hashSet;
        MethodCollector.m26663i(14043);
        synchronized (this.f63862c) {
            try {
                hashSet = new HashSet(this.f63862c);
            } finally {
                MethodCollector.m26664o(14043);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m53596a(Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        AtomicReference<C26975a> atomicReference = f63860a;
        boolean compareAndSet = atomicReference.compareAndSet(null, new C26975a(context));
        C26975a aVar = atomicReference.get();
        if (compareAndSet) {
            EnumC27002ah.f63903a.mo44711b(new C26955o(context, C26991q.m53632a(), new C26956p(context, aVar.f63861b, new C26958r()), aVar.f63861b, new C26991q()));
            C27005ak.f63905a.compareAndSet(null, new C26987m(aVar));
            C26991q.m53632a().execute(new RunnableC26988n(context));
        }
        try {
            aVar.m53597b(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private final synchronized void m53597b(Context context, boolean z) {
        AbstractC26957q xVar;
        IOException e;
        MethodCollector.m26663i(14073);
        if (z) {
            this.f63861b.mo44679a();
        } else {
            C26991q.m53632a().execute(new RunnableC26989o(this));
        }
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            List<String> arrayList = packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
            Set<C26992r> f = this.f63861b.mo44688f();
            HashSet hashSet = new HashSet();
            Iterator<C26992r> it = f.iterator();
            while (it.hasNext()) {
                String str = it.next().f63890b;
                if (arrayList.contains(str)) {
                    if (z) {
                        this.f63861b.mo44687e(str);
                    } else {
                        hashSet.add(str);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                C26991q.m53632a().execute(new RunnableC26990p(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            for (C26992r rVar : f) {
                String str2 = rVar.f63890b;
                if (!C27006al.m53656a(str2)) {
                    hashSet2.add(str2);
                }
            }
            for (String str3 : arrayList) {
                if (!C27006al.m53656a(str3)) {
                    hashSet2.add(str3);
                }
            }
            HashSet<C26992r> hashSet3 = new HashSet(f.size());
            for (C26992r rVar2 : f) {
                if (!rVar2.f63890b.startsWith("config.")) {
                    String str4 = rVar2.f63890b;
                    if (!hashSet2.contains(str4.startsWith("config.") ? "" : str4.split("\\.config\\.", 2)[0])) {
                    }
                }
                hashSet3.add(rVar2);
            }
            C26986l lVar = new C26986l(this.f63861b);
            if (Build.VERSION.SDK_INT >= 21) {
                switch (Build.VERSION.SDK_INT) {
                    case 21:
                        xVar = new C26964x();
                        break;
                    case 22:
                        xVar = new C26965y();
                        break;
                    case 23:
                        xVar = new C26885ac();
                        break;
                    case 24:
                        xVar = new C26886ad();
                        break;
                    case 25:
                        xVar = new C26887ae();
                        break;
                    case 26:
                        xVar = new C26890ah();
                        break;
                    case 27:
                        if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                            xVar = new C26891ai();
                            break;
                        }
                    default:
                        xVar = new C26893ak();
                        break;
                }
                ClassLoader classLoader = context.getClassLoader();
                if (z) {
                    xVar.mo44566a(classLoader, lVar.mo44691a());
                } else {
                    Iterator it2 = hashSet3.iterator();
                    while (it2.hasNext()) {
                        C26992r rVar3 = (C26992r) it2.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        C26986l.m53626a(rVar3, new C26980f(lVar, rVar3, hashSet4, atomicBoolean));
                        if (atomicBoolean.get()) {
                            xVar.mo44566a(classLoader, hashSet4);
                        } else {
                            it2.remove();
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                for (C26992r rVar4 : hashSet3) {
                    try {
                        ZipFile zipFile = new ZipFile(rVar4.f63889a);
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry != null) {
                                C26978d dVar = this.f63861b;
                                String str5 = rVar4.f63890b;
                                File file = new File(dVar.mo44685d(), "dex");
                                C26978d.m53602b(file);
                                File a = C26978d.m53601a(file, str5);
                                C26978d.m53602b(a);
                                if (!xVar.mo44567a(classLoader, a, rVar4.f63889a, z)) {
                                    String.valueOf(String.valueOf(rVar4.f63889a)).length();
                                }
                            }
                            hashSet5.add(rVar4.f63889a);
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                zipFile.close();
                            } catch (IOException e3) {
                                C26915bf.m53466a(e, e3);
                            }
                            MethodCollector.m26664o(14073);
                            throw e;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        MethodCollector.m26664o(14073);
                        throw e;
                    }
                }
                this.f63863d.mo44675a(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                for (C26992r rVar5 : hashSet3) {
                    if (hashSet5.contains(rVar5.f63889a)) {
                        rVar5.f63890b.length();
                        hashSet6.add(rVar5.f63890b);
                    } else {
                        rVar5.f63890b.length();
                    }
                }
                synchronized (this.f63862c) {
                    try {
                        this.f63862c.addAll(hashSet6);
                    } finally {
                        MethodCollector.m26664o(14073);
                    }
                }
            } else {
                AssertionError assertionError = new AssertionError("Unsupported Android Version");
                MethodCollector.m26664o(14073);
                throw assertionError;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            IOException iOException = new IOException(C1764a.m5928a("Cannot load data for application '%s'", new Object[]{packageName}), e5);
            MethodCollector.m26664o(14073);
            throw iOException;
        }
    }
}
