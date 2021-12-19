package com.p4501vk.api.sdk;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.p4504c.C87854b;
import java.util.concurrent.CountDownLatch;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.vk.api.sdk.f */
public interface AbstractC87878f {
    static {
        Covode.recordClassIndex(103888);
    }

    /* renamed from: a */
    void mo142358a(C87854b bVar, C87860d dVar);

    /* renamed from: a */
    void mo142359a(String str, C87879a<String> aVar);

    /* renamed from: b */
    void mo142360b(String str, C87879a<C87880b> aVar);

    /* renamed from: c */
    void mo142361c(String str, C87879a<Boolean> aVar);

    /* renamed from: com.vk.api.sdk.f$a */
    public static class C87879a<T> {

        /* renamed from: a */
        public volatile T f199606a;

        /* renamed from: b */
        public final CountDownLatch f199607b;

        static {
            Covode.recordClassIndex(103889);
        }

        /* renamed from: a */
        public final void mo142362a(T t) {
            this.f199606a = t;
            this.f199607b.countDown();
        }

        public C87879a(CountDownLatch countDownLatch) {
            C89219l.m154719c(countDownLatch, "");
            this.f199607b = countDownLatch;
        }
    }

    /* renamed from: com.vk.api.sdk.f$b */
    public static final class C87880b {

        /* renamed from: a */
        public final boolean f199608a;

        /* renamed from: b */
        public final String f199609b;

        /* renamed from: c */
        public final String f199610c;

        /* renamed from: d */
        public final Integer f199611d;

        static {
            Covode.recordClassIndex(103890);
        }

        public C87880b(String str, String str2, Integer num) {
            boolean z;
            this.f199609b = str;
            this.f199610c = str2;
            this.f199611d = num;
            if (str2 == null || C89361p.m154870a((CharSequence) str2)) {
                z = true;
            } else {
                z = false;
            }
            this.f199608a = true ^ z;
        }
    }
}
