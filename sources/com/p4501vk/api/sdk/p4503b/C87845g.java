package com.p4501vk.api.sdk.p4503b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.p4504c.C87852a;
import com.p4501vk.api.sdk.p4504c.C87854b;
import com.p4501vk.api.sdk.p4507f.C87886b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.b.g */
public final class C87845g<T> extends AbstractC87844f<T> {

    /* renamed from: b */
    public final AbstractC87840b<T> f199551b;

    static {
        Covode.recordClassIndex(103855);
    }

    /* renamed from: com.vk.api.sdk.b.g$a */
    static final class C87846a {

        /* renamed from: a */
        public static final C87846a f199552a = new C87846a();

        /* renamed from: b */
        private static final C87886b f199553b = new C87886b(1000, 8000, 1.2f, 0.0f, 8);

        private C87846a() {
        }

        static {
            Covode.recordClassIndex(103856);
        }

        /* renamed from: a */
        public final synchronized boolean mo142307a() {
            boolean a;
            MethodCollector.m26663i(11973);
            a = f199553b.mo142365a();
            MethodCollector.m26664o(11973);
            return a;
        }

        /* renamed from: b */
        public final synchronized void mo142308b() {
            MethodCollector.m26663i(11974);
            f199553b.mo142366b();
            MethodCollector.m26664o(11974);
        }

        /* renamed from: c */
        public final synchronized void mo142309c() {
            MethodCollector.m26663i(12115);
            C87886b bVar = f199553b;
            bVar.f199617a = bVar.f199619c;
            bVar.f199618b = 0;
            MethodCollector.m26664o(12115);
        }

        /* renamed from: d */
        public final synchronized long mo142310d() {
            long j;
            MethodCollector.m26663i(12116);
            j = f199553b.f199617a;
            MethodCollector.m26664o(12116);
            return j;
        }
    }

    @Override // com.p4501vk.api.sdk.p4503b.AbstractC87840b
    /* renamed from: a */
    public final T mo142304a(C87839a aVar) {
        MethodCollector.m26663i(13373);
        C89219l.m154719c(aVar, "");
        int i = this.f199550c;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                if (C87846a.f199552a.mo142307a()) {
                    Thread.sleep(C87846a.f199552a.mo142310d());
                }
                try {
                    T a = this.f199551b.mo142304a(aVar);
                    C87846a.f199552a.mo142309c();
                    MethodCollector.m26664o(13373);
                    return a;
                } catch (C87854b e) {
                    if (e.isTooManyRequestsError()) {
                        mo142305a("Too many requests", e);
                        C87846a.f199552a.mo142308b();
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    } else {
                        MethodCollector.m26664o(13373);
                        throw e;
                    }
                }
            }
        }
        C87852a aVar2 = new C87852a("Can't handle too many requests due to retry limit! (retryLimit=" + this.f199550c + ')');
        MethodCollector.m26664o(13373);
        throw aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87845g(C87860d dVar, int i, AbstractC87840b<? extends T> bVar) {
        super(dVar, i);
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        this.f199551b = bVar;
    }
}
