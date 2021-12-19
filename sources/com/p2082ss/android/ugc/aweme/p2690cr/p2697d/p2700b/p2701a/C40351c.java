package com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.cr.d.b.a.c */
public final class C40351c implements AbstractC40350b {

    /* renamed from: c */
    public static final C40352a f94524c = new C40352a((byte) 0);

    /* renamed from: a */
    public boolean f94525a;

    /* renamed from: b */
    public boolean f94526b;

    /* renamed from: d */
    private final List<File> f94527d;

    /* renamed from: e */
    private final Set<String> f94528e;

    /* renamed from: f */
    private final Set<String> f94529f;

    static {
        Covode.recordClassIndex(48152);
    }

    public C40351c() {
        this(null, null, 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.d.b.a.c$a */
    public static final class C40352a {
        static {
            Covode.recordClassIndex(48153);
        }

        private C40352a() {
        }

        public /* synthetic */ C40352a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo69495a() {
        for (T t : this.f94527d) {
            m81535a(t);
            C63244g.m114602a().mo73279g().mo69467a().mo69508a(t);
        }
        this.f94527d.clear();
    }

    /* renamed from: a */
    private static boolean m81535a(File file) {
        MethodCollector.m26663i(643);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(643);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(643);
        return delete;
    }

    public C40351c(Set<String> set, Set<String> set2) {
        C89219l.m154721d(set, "");
        C89219l.m154721d(set2, "");
        this.f94528e = set;
        this.f94529f = set2;
        this.f94526b = true;
        this.f94527d = new ArrayList();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.AbstractC40350b
    /* renamed from: a */
    public final void mo69494a(File file, boolean z) {
        C89219l.m154721d(file, "");
        if (this.f94526b && z && file.isDirectory()) {
            return;
        }
        if (this.f94525a || !file.isDirectory()) {
            Iterator<T> it = this.f94528e.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i < 0) {
                    C89070n.m154520a();
                }
                String path = file.getPath();
                C89219l.m154716b(path, "");
                if (!C89361p.m154874b(path, (String) next, false)) {
                    i++;
                } else if (i != -1) {
                    return;
                }
            }
            Iterator<T> it2 = this.f94529f.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                String path2 = file.getPath();
                C89219l.m154716b(path2, "");
                if (!C89361p.m154908a((CharSequence) path2, (CharSequence) next2, false)) {
                    i2++;
                } else if (i2 != -1) {
                    return;
                }
            }
            this.f94527d.add(0, file);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40351c(Set set, Set set2, int i) {
        this((i & 1) != 0 ? C89036ab.INSTANCE : set, (i & 2) != 0 ? C89036ab.INSTANCE : set2);
    }
}
