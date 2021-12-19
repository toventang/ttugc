package com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.cr.d.b.a.a */
public final class C40348a implements AbstractC40350b {

    /* renamed from: b */
    public static final C40349a f94520b = new C40349a((byte) 0);

    /* renamed from: a */
    public long f94521a;

    /* renamed from: c */
    private final Set<String> f94522c;

    /* renamed from: d */
    private final Set<String> f94523d;

    static {
        Covode.recordClassIndex(48149);
    }

    public C40348a() {
        this(null, null, 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.d.b.a.a$a */
    public static final class C40349a {
        static {
            Covode.recordClassIndex(48150);
        }

        private C40349a() {
        }

        public /* synthetic */ C40349a(byte b) {
            this();
        }
    }

    private C40348a(Set<String> set, Set<String> set2) {
        C89219l.m154721d(set, "");
        C89219l.m154721d(set2, "");
        this.f94522c = set;
        this.f94523d = set2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.AbstractC40350b
    /* renamed from: a */
    public final void mo69494a(File file, boolean z) {
        C89219l.m154721d(file, "");
        if (file.isFile()) {
            Iterator<T> it = this.f94522c.iterator();
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
            Iterator<T> it2 = this.f94523d.iterator();
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
            this.f94521a += file.length();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40348a(Set set, Set set2, int i) {
        this((i & 1) != 0 ? C89036ab.INSTANCE : set, (i & 2) != 0 ? C89036ab.INSTANCE : set2);
    }
}
