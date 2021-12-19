package com.bytedance.jedi.arch.ext.list.p1464a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20516j;
import java.util.concurrent.Executor;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.c */
public final class C20435c<T> {

    /* renamed from: a */
    public final Executor f48370a;

    /* renamed from: b */
    public final C1445j.AbstractC1451e<T> f48371b;

    /* renamed from: c */
    public final Executor f48372c;

    static {
        Covode.recordClassIndex(23956);
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.c$a */
    public static final class C20436a<T> {

        /* renamed from: a */
        Executor f48373a;

        /* renamed from: b */
        private final C1445j.AbstractC1451e<T> f48374b;

        static {
            Covode.recordClassIndex(23957);
        }

        /* renamed from: a */
        public final C20435c<T> mo33770a() {
            return new C20435c<>(this.f48374b, this.f48373a, (byte) 0);
        }

        public C20436a(C1445j.AbstractC1451e<T> eVar) {
            C89219l.m154719c(eVar, "");
            this.f48374b = eVar;
        }
    }

    private C20435c(C1445j.AbstractC1451e<T> eVar, Executor executor) {
        this.f48371b = eVar;
        this.f48372c = executor;
        this.f48370a = C20516j.f48592d.invoke();
    }

    public /* synthetic */ C20435c(C1445j.AbstractC1451e eVar, Executor executor, byte b) {
        this(eVar, executor);
    }
}
