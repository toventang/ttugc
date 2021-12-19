package com.bytedance.p1436j.p1437a.p1440c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.behavior.AbstractC28465b;
import com.lynx.tasm.p2062ui.image.C28896i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.j.a.c.f */
public final class C20084f {

    /* renamed from: a */
    public static final C20084f f47811a = new C20084f();

    private C20084f() {
    }

    static {
        Covode.recordClassIndex(23592);
    }

    /* renamed from: com.bytedance.j.a.c.f$b */
    public static final class C20086b implements AbstractC28465b {

        /* renamed from: a */
        final /* synthetic */ C20074b f47813a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f47814b;

        static {
            Covode.recordClassIndex(23594);
        }

        public C20086b(C20074b bVar, C89233z.C89234a aVar) {
            this.f47813a = bVar;
            this.f47814b = aVar;
        }

        @Override // com.lynx.tasm.behavior.AbstractC28465b
        /* renamed from: a */
        public final /* synthetic */ List mo33432a() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f47813a.f47783a.f47788e);
            if (this.f47814b.element) {
                arrayList.addAll(C28896i.m57883a().mo33432a());
            }
            return arrayList;
        }
    }

    /* renamed from: com.bytedance.j.a.c.f$a */
    public static final class C20085a implements AbstractC28773f {

        /* renamed from: a */
        public static final C20085a f47812a = new C20085a();

        static {
            Covode.recordClassIndex(23593);
        }

        C20085a() {
        }

        @Override // com.lynx.tasm.AbstractC28773f
        /* renamed from: a */
        public final void mo33431a(String str) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38962a(str);
                C58032m.m104852a(uptimeMillis, str);
            } catch (Throwable unused) {
            }
        }
    }
}
