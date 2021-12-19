package com.bytedance.crash.runtime.p934b;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.Header;

/* renamed from: com.bytedance.crash.runtime.b.b */
public class C13997b {

    /* renamed from: b */
    private static final C13997b f34124b = new C13997b() {
        /* class com.bytedance.crash.runtime.p934b.C13997b.C139981 */

        /* renamed from: a */
        Header f34126a;

        static {
            Covode.recordClassIndex(16063);
        }

        @Override // com.bytedance.crash.runtime.p934b.C13997b
        /* renamed from: b */
        public final Object mo22514b(String str) {
            if (this.f34126a == null) {
                this.f34126a = Header.m25041b(C13933m.f33936a);
            }
            return this.f34126a.f33753a.opt(str);
        }
    };

    /* renamed from: a */
    private C13997b f34125a;

    public C13997b() {
        this(f34124b);
    }

    static {
        Covode.recordClassIndex(16062);
    }

    private C13997b(C13997b bVar) {
        this.f34125a = bVar;
    }

    /* renamed from: a */
    public Object mo22489a(String str) {
        C13997b bVar = this.f34125a;
        if (bVar != null) {
            return bVar.mo22489a(str);
        }
        return null;
    }

    /* renamed from: b */
    public Object mo22514b(String str) {
        C13997b bVar = this.f34125a;
        if (bVar != null) {
            return bVar.mo22514b(str);
        }
        return null;
    }
}
