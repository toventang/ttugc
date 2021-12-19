package com.p2082ss.ugc.aweme.performance.core.monitor.p4435d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86659a;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86664b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86662a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86663b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86665a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86666b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86667c;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4436e.C86677b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4437f.C86679b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a */
public abstract class AbstractC86669a {

    /* renamed from: e */
    public static final int f195367e = 50;

    /* renamed from: f */
    public static final int f195368f = 200;

    /* renamed from: g */
    public static final C86670a f195369g = new C86670a((byte) 0);

    /* renamed from: a */
    public final ConcurrentHashMap<String, C86666b> f195370a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public boolean f195371b;

    /* renamed from: c */
    public boolean f195372c;

    /* renamed from: d */
    public boolean f195373d;

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$a */
    public static final class C86670a {
        static {
            Covode.recordClassIndex(101898);
        }

        private C86670a() {
        }

        public /* synthetic */ C86670a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(101897);
    }

    public AbstractC86669a() {
        boolean z;
        AbstractC86662a aVar = C86659a.C86660a.m150136a().f195328b;
        boolean z2 = false;
        if (aVar != null) {
            z = aVar.mo137927c();
        } else {
            z = false;
        }
        this.f195371b = z;
        AbstractC86662a aVar2 = C86659a.C86660a.m150136a().f195328b;
        this.f195372c = aVar2 != null ? aVar2.mo137928d() : z2;
        this.f195373d = C86659a.C86660a.m150136a().f195327a;
    }

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$b */
    static final class RunnableC86671b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC86669a f195374a;

        static {
            Covode.recordClassIndex(101899);
        }

        RunnableC86671b(AbstractC86669a aVar) {
            this.f195374a = aVar;
        }

        public final void run() {
            synchronized (C86664b.f195336d) {
                this.f195374a.f195370a.size();
                Set<Map.Entry<String, C86667c>> entrySet = C86664b.f195333a.entrySet();
                C89219l.m154709a((Object) entrySet, "");
                ArrayList arrayList = new ArrayList(entrySet);
                C89070n.m154530a((List) arrayList, (Comparator) C86672a.f195375a);
                if (arrayList.size() > 0) {
                    for (Map.Entry<String, C86666b> entry : this.f195374a.f195370a.entrySet()) {
                        if (entry.getValue().f195352e < ((C86667c) ((Map.Entry) arrayList.get(0)).getValue()).f195359a) {
                            this.f195374a.f195370a.remove(entry.getKey());
                        }
                    }
                    this.f195374a.f195370a.size();
                }
            }
        }

        /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$b$a */
        static final class C86672a<T> implements Comparator<Map.Entry<String, C86667c>> {

            /* renamed from: a */
            public static final C86672a f195375a = new C86672a();

            static {
                Covode.recordClassIndex(101900);
            }

            C86672a() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Map.Entry<String, C86667c> entry, Map.Entry<String, C86667c> entry2) {
                long j;
                C86667c value;
                C86667c value2;
                Map.Entry<String, C86667c> entry3 = entry;
                Map.Entry<String, C86667c> entry4 = entry2;
                long j2 = 0;
                if (entry3 == null || (value2 = entry3.getValue()) == null) {
                    j = 0;
                } else {
                    j = value2.f195359a;
                }
                if (!(entry4 == null || (value = entry4.getValue()) == null)) {
                    j2 = value.f195359a;
                }
                if (j > j2) {
                    return 1;
                }
                return -1;
            }
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$c */
    public static final class RunnableC86673c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC86669a f195376a;

        /* renamed from: b */
        final /* synthetic */ C86667c f195377b;

        static {
            Covode.recordClassIndex(101901);
        }

        public RunnableC86673c(AbstractC86669a aVar, C86667c cVar) {
            this.f195376a = aVar;
            this.f195377b = cVar;
        }

        public final void run() {
            ArrayList arrayList;
            C86666b bVar;
            long j;
            AbstractC86663b bVar2;
            Map<String, Object> a;
            Set<String> keySet;
            synchronized (this.f195376a.f195370a) {
                arrayList = new ArrayList(this.f195376a.f195370a.entrySet());
                if (this.f195377b == null) {
                    this.f195376a.f195370a.clear();
                }
            }
            C89070n.m154530a((List) arrayList, (Comparator) C866741.f195378a);
            Iterator it = arrayList.iterator();
            long j2 = 0;
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null && (bVar = (C86666b) entry.getValue()) != null && bVar.f195353f != 0) {
                    if (this.f195376a.f195371b) {
                        if (this.f195376a.f195373d && (bVar2 = C86659a.C86660a.m150136a().f195330d) != null && (a = bVar2.mo137930a()) != null && (keySet = a.keySet()) != null) {
                            Iterator<T> it2 = keySet.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (C89361p.m154929e((CharSequence) bVar.f195349b, (CharSequence) it2.next())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        C86665a aVar = new C86665a(bVar.f195349b, 2, (byte) 0);
                        aVar.f195344h = bVar.f195350c;
                        aVar.f195345i = bVar.f195351d;
                        aVar.f195338b = 1;
                        aVar.f195339c = bVar.f195348a;
                        aVar.mo137935e(C86679b.m150154a(C86679b.m150155b(bVar.f195358k)) + "\n" + bVar.f195356i);
                        aVar.mo137933c(bVar.f195355h);
                        aVar.mo137931a(bVar.f195357j);
                        C86667c cVar = this.f195377b;
                        if (cVar == null) {
                            aVar.mo137932b("applicaiton");
                        } else if (cVar.f195359a < bVar.f195352e && this.f195377b.f195360b > bVar.f195353f) {
                            aVar.mo137932b(this.f195377b.f195362d);
                            C86667c cVar2 = this.f195377b;
                            C89219l.m154719c(bVar, "");
                            C89219l.m154719c(cVar2, "");
                        }
                        C86659a.C86660a.m150136a();
                    }
                    C86667c cVar3 = this.f195377b;
                    if (cVar3 == null) {
                        i++;
                        bVar.f195348a = (bVar.f195353f - bVar.f195352e) / 1000000;
                        j = bVar.f195348a;
                    } else if (cVar3.f195359a < bVar.f195352e && this.f195377b.f195360b > bVar.f195353f) {
                        i++;
                        bVar.f195348a = (bVar.f195353f - bVar.f195352e) / 1000000;
                        j = bVar.f195348a;
                    }
                    j2 += j;
                }
            }
            C86665a aVar2 = new C86665a("phase", 1);
            aVar2.f195338b = i;
            aVar2.f195339c = j2;
            C86667c cVar4 = this.f195377b;
            if (cVar4 != null) {
                aVar2.mo137932b(cVar4.f195362d);
            }
            C86659a.C86660a.m150136a();
            if (this.f195376a.f195370a.size() > AbstractC86669a.f195368f) {
                C86677b.f195379a.mo137953a(new RunnableC86671b(this.f195376a));
            }
        }
    }
}
