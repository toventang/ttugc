package com.p2082ss.android.ugc.aweme.bullet.p2418f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.bullet.f.c */
public final class C35151c implements AbstractC35150b {

    /* renamed from: a */
    public static final C35152a f82945a = new C35152a((byte) 0);

    /* renamed from: b */
    private final Collection<String> f82946b;

    static {
        Covode.recordClassIndex(42306);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.c$a */
    public static final class C35152a {
        static {
            Covode.recordClassIndex(42307);
        }

        private C35152a() {
        }

        public /* synthetic */ C35152a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2418f.AbstractC35150b
    /* renamed from: a */
    public final List<String> mo61994a() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f82946b.iterator();
        while (it.hasNext()) {
            long nanoTime = System.nanoTime();
            String a = m71923a(it.next());
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public C35151c(Collection<String> collection) {
        C89219l.m154721d(collection, "");
        this.f82946b = collection;
    }

    /* renamed from: a */
    private static String m71923a(String str) {
        boolean z;
        MethodCollector.m26663i(4421);
        try {
            String b = C80333dc.m139277b(C81631k.f182525a.mo125297c(), str);
            if (TextUtils.isEmpty(b)) {
                MethodCollector.m26664o(4421);
                return null;
            }
            File file = new File(b);
            if (file.exists() && file.listFiles() != null) {
                File[] listFiles = file.listFiles();
                C89219l.m154716b(listFiles, "");
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    File file2 = new File(file, "prefetch.json");
                    if (!file2.exists()) {
                        MethodCollector.m26664o(4421);
                        return null;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), C89338d.f202990a), 8192);
                        try {
                            String a = C89167q.m154662a((Reader) bufferedReader);
                            C89146c.m154636a(bufferedReader, null);
                            MethodCollector.m26664o(4421);
                            return a;
                        } catch (Throwable th) {
                            C89146c.m154636a(bufferedReader, th);
                            MethodCollector.m26664o(4421);
                            throw th;
                        }
                    } catch (Exception e) {
                        C51423a.m95790a((Throwable) e);
                        MethodCollector.m26664o(4421);
                        return null;
                    }
                }
            }
            MethodCollector.m26664o(4421);
            return null;
        } catch (Throwable unused) {
            MethodCollector.m26664o(4421);
            return null;
        }
    }
}
