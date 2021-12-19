package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.m */
public final class C50623m extends AbstractC50584a {

    /* renamed from: a */
    public static final C50624a f116931a = new C50624a((byte) 0);

    static {
        Covode.recordClassIndex(59779);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "recharge";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.m$a */
    public static final class C50624a {
        static {
            Covode.recordClassIndex(59780);
        }

        private C50624a() {
        }

        public /* synthetic */ C50624a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        List<C67212c> a = C50580b.m94818a("recharge_fail", System.currentTimeMillis() - mo85930b());
        return "recharge_fail_list: [" + C89070n.m154551a(C89070n.m154553a((Iterable) C89070n.m154585g((Collection) a), (Comparator) new C50625b()).subList(0, Math.min(a.size(), 10)), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C50626c.f116932a, 31) + ']';
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.m$c */
    static final class C50626c extends AbstractC89220m implements AbstractC89172b<C67212c, CharSequence> {

        /* renamed from: a */
        public static final C50626c f116932a = new C50626c();

        static {
            Covode.recordClassIndex(59782);
        }

        C50626c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(C67212c cVar) {
            C67212c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return cVar2.f150639d;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        if (str.hashCode() == 2085626294 && str.equals("recharge_fail")) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.m$b */
    public static final class C50625b<T> implements Comparator {
        static {
            Covode.recordClassIndex(59781);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t2.f150638c), Long.valueOf(t.f150638c));
        }
    }
}
