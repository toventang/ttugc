package com.bytedance.ies.p1208im.core.api.p1211b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17455a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.MessageBody;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.ies.im.core.api.b.c */
public interface AbstractC17429c {
    static {
        Covode.recordClassIndex(19916);
    }

    /* renamed from: a */
    int mo27802a(C17457c cVar);

    /* renamed from: a */
    C17455a mo27803a();

    /* renamed from: a */
    MessageBody mo27804a(MessageBody messageBody);

    /* renamed from: a */
    void mo27805a(int i, int i2);

    /* renamed from: a */
    void mo27806a(C19538ai aiVar);

    /* renamed from: a */
    void mo27807a(C19638h hVar, C19538ai aiVar, C17457c cVar);

    /* renamed from: a */
    void mo27808a(AbstractC89172b<? super AbstractC17429c, C89391z> bVar);

    /* renamed from: b */
    void mo27809b();

    /* renamed from: b */
    void mo27810b(int i, int i2);

    /* renamed from: c */
    void mo27811c();

    /* renamed from: com.bytedance.ies.im.core.api.b.c$a */
    public static final class C17430a {
        static {
            Covode.recordClassIndex(19917);
        }

        /* renamed from: com.bytedance.ies.im.core.api.b.c$a$a */
        public static final class RunnableC17431a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AbstractC89172b f41780a;

            static {
                Covode.recordClassIndex(19918);
            }

            public RunnableC17431a(AbstractC89172b bVar) {
                this.f41780a = bVar;
            }

            public final void run() {
                this.f41780a.invoke(C17415a.m32259f());
            }
        }
    }
}
