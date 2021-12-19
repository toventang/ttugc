package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50597i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.k */
public final class C50618k extends AbstractC50597i {

    /* renamed from: b */
    public static final C50619a f116929b = new C50619a((byte) 0);

    static {
        Covode.recordClassIndex(59774);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_publish";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.k$a */
    public static final class C50619a {
        static {
            Covode.recordClassIndex(59775);
        }

        private C50619a() {
        }

        public /* synthetic */ C50619a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        String str;
        String str2;
        List<List<AbstractC50597i.C50600c>> a = m94862a(C89070n.m154553a((Iterable) mo85933e(), (Comparator) new C50620b()));
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        Iterator<T> it = a.iterator();
        while (true) {
            String str3 = "";
            if (it.hasNext()) {
                T<AbstractC50597i.C50600c> next = it.next();
                if (((AbstractC50597i.C50600c) next.get(0)).f116909f instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) next, 10));
                    for (AbstractC50597i.C50600c cVar : next) {
                        AbstractC50597i.C50600c.AbstractC50601a aVar = cVar.f116909f;
                        if (aVar instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50604a) {
                            str2 = ((AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50604a) cVar.f116909f).f116914c + ':' + ((AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50604a) cVar.f116909f).f116913b;
                        } else if (aVar instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50606c) {
                            str2 = ((AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50606c) cVar.f116909f).f116916b + ":Lost";
                        } else if (aVar instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50605b) {
                            str2 = ((AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50605b) cVar.f116909f).f116915b;
                        } else {
                            str2 = str3;
                        }
                        arrayList2.add(str2);
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        while (it2.hasNext()) {
                            next2 = ((String) next2) + ';' + ((String) it2.next());
                        }
                        str = (String) next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    str = str3;
                }
                StringBuilder append = new StringBuilder().append(next.size()).append(((AbstractC50597i.C50600c) next.get(0)).f116909f.f116911a);
                if (str.length() > 0) {
                    str3 = "(" + str + ')';
                }
                arrayList.add(append.append(str3).toString());
            } else {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    str3 = str3 + '|' + ((String) it3.next());
                }
                return str3;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.k$b */
    public static final class C50620b<T> implements Comparator {
        static {
            Covode.recordClassIndex(59776);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t2.f116907d), Long.valueOf(t.f116907d));
        }
    }
}
