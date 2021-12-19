package com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.AbstractC40350b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.d.b.a */
public final class C40347a {

    /* renamed from: a */
    private final AtomicBoolean f94518a = new AtomicBoolean(false);

    /* renamed from: b */
    private final List<AbstractC40350b> f94519b = new ArrayList();

    static {
        Covode.recordClassIndex(48148);
    }

    /* renamed from: a */
    private final void m81528a() {
        this.f94518a.set(true);
    }

    /* renamed from: b */
    private final void m81529b() {
        this.f94518a.set(false);
    }

    /* renamed from: a */
    public final void mo69491a(AbstractC40350b bVar) {
        C89219l.m154721d(bVar, "");
        if (!this.f94519b.contains(bVar)) {
            this.f94519b.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo69493a(String str) {
        if (str != null) {
            mo69492a(C63244g.m114602a().mo73279g().mo69470c().mo69481g(str));
        }
    }

    /* renamed from: a */
    public final void mo69492a(File file) {
        File[] listFiles;
        if (!this.f94518a.get() && file != null && file.exists()) {
            m81528a();
            Iterator<T> it = this.f94519b.iterator();
            while (it.hasNext()) {
                it.next().mo69494a(file, true);
            }
            if (!file.isDirectory()) {
                m81529b();
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty() && this.f94518a.get()) {
                File file2 = (File) linkedList.remove();
                if (!(!file2.exists() || (listFiles = file2.listFiles()) == null || listFiles.length == 0)) {
                    for (File file3 : listFiles) {
                        if (file3 != null && file3.exists()) {
                            Iterator<T> it2 = this.f94519b.iterator();
                            while (it2.hasNext()) {
                                it2.next().mo69494a(file3, false);
                            }
                            if (file3.isDirectory()) {
                                linkedList.add(file3);
                            }
                        }
                    }
                }
            }
            m81529b();
        }
    }
}
