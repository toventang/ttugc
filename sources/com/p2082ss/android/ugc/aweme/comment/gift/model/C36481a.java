package com.p2082ss.android.ugc.aweme.comment.gift.model;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87013b;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.C87034e;
import com.p2082ss.ugc.live.p4460a.p4461a.C87045k;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87027a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87036a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87037b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.model.a */
public final class C36481a implements AbstractC87010a<String> {

    /* renamed from: a */
    static final Map<String, C87045k> f86252a = new HashMap();

    /* renamed from: b */
    static final List<AbstractC87013b> f86253b = new ArrayList();

    /* renamed from: c */
    static final Handler f86254c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    static int f86255d;

    /* renamed from: e */
    static int f86256e;

    /* renamed from: f */
    public static C87034e f86257f;

    /* renamed from: g */
    public static final C36481a f86258g = new C36481a();

    /* renamed from: h */
    private static final Deque<C87020c> f86259h = new ArrayDeque();

    private C36481a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.a$d */
    static final class RunnableC36485d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C87020c f86265a;

        static {
            Covode.recordClassIndex(43788);
        }

        RunnableC36485d(C87020c cVar) {
            this.f86265a = cVar;
        }

        public final void run() {
            this.f86265a.mo140631b();
            C36481a.f86258g.mo63846a(this.f86265a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.a$b */
    static final class RunnableC36483b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C87020c f86262a;

        /* renamed from: b */
        final /* synthetic */ int f86263b;

        static {
            Covode.recordClassIndex(43786);
        }

        RunnableC36483b(C87020c cVar, int i) {
            this.f86262a = cVar;
            this.f86263b = i;
        }

        public final void run() {
            C87045k kVar = C36481a.f86252a.get(this.f86262a.f196189a);
            if (kVar != null) {
                Iterator<AbstractC87026d> it = kVar.f196250b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(43784);
    }

    /* renamed from: a */
    public final void mo63845a() {
        int i;
        int i2;
        int i3 = f86255d;
        C87034e eVar = f86257f;
        if (eVar != null) {
            i = eVar.f196217d;
        } else {
            i = 0;
        }
        if (i3 < i) {
            Deque<C87020c> deque = f86259h;
            if (!deque.isEmpty()) {
                int i4 = f86256e;
                C87034e eVar2 = f86257f;
                if (eVar2 != null) {
                    i2 = eVar2.f196218e;
                } else {
                    i2 = 0;
                }
                if (1 <= i2 && i4 >= i2) {
                    m74270c();
                    f86256e = 0;
                    return;
                }
                f86255d++;
                mo63846a(deque.poll());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.a$c */
    static final class RunnableC36484c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C87020c f86264a;

        static {
            Covode.recordClassIndex(43787);
        }

        RunnableC36484c(C87020c cVar) {
            this.f86264a = cVar;
        }

        public final void run() {
            C36481a aVar = C36481a.f86258g;
            C87020c cVar = this.f86264a;
            String str = cVar.f196189a;
            String b = C36481a.m74268b(cVar);
            C87045k kVar = C36481a.f86252a.get(str);
            if (kVar != null) {
                for (AbstractC87026d dVar : kVar.f196250b) {
                    dVar.mo16290a(b);
                }
            }
            C36481a.f86252a.remove(str);
            for (AbstractC87013b bVar : C36481a.f86253b) {
                bVar.mo16292a(cVar.f196190b, cVar);
            }
            C36481a.f86255d--;
            C36481a.f86256e = 0;
            aVar.mo63845a();
        }
    }

    /* renamed from: b */
    private static void m74269b() {
        C87034e eVar = f86257f;
        if (eVar == null) {
            throw new IllegalStateException("Gift Resource config has to be initialized");
        } else if (eVar.f196214a != null) {
            C87034e eVar2 = f86257f;
            if (eVar2 == null || eVar2.f196215b == null) {
                throw new IllegalStateException("Producer Factory has to be initialized");
            }
        } else {
            throw new IllegalStateException("File Cache Factory has to be initialized");
        }
    }

    /* renamed from: c */
    private static void m74270c() {
        f86259h.iterator();
        while (true) {
            Deque<C87020c> deque = f86259h;
            if (deque.peek() != null) {
                C87020c poll = deque.poll();
                Map<String, C87045k> map = f86252a;
                if (poll == null) {
                    C89219l.m154715b();
                }
                C87045k kVar = map.get(poll.f196189a);
                if (kVar != null) {
                    for (AbstractC87026d dVar : kVar.f196250b) {
                        dVar.mo16289a();
                    }
                    f86252a.remove(poll.f196189a);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.a$a */
    static final class RunnableC36482a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C87020c f86260a;

        /* renamed from: b */
        final /* synthetic */ C87021a f86261b;

        static {
            Covode.recordClassIndex(43785);
        }

        RunnableC36482a(C87020c cVar, C87021a aVar) {
            this.f86260a = cVar;
            this.f86261b = aVar;
        }

        public final void run() {
            int i;
            C87045k kVar = C36481a.f86252a.get(this.f86260a.f196189a);
            if (kVar != null) {
                int length = this.f86260a.f196191c.length;
                C87034e eVar = C36481a.f86257f;
                int i2 = 0;
                if (eVar != null) {
                    i = eVar.f196216c;
                } else {
                    i = 0;
                }
                if (this.f86260a.f196196h < C89271h.m154769b(length, i) - 1) {
                    C87020c cVar = this.f86260a;
                    Handler handler = C36481a.f86254c;
                    RunnableC36485d dVar = new RunnableC36485d(cVar);
                    C87034e eVar2 = C36481a.f86257f;
                    if (eVar2 != null) {
                        i2 = eVar2.mo140638a();
                    }
                    handler.postDelayed(dVar, (long) i2);
                    return;
                }
                for (AbstractC87026d dVar2 : kVar.f196250b) {
                    dVar2.mo16291a(this.f86261b);
                }
            }
            C36481a.f86252a.remove(this.f86260a.f196189a);
            for (AbstractC87013b bVar : C36481a.f86253b) {
                bVar.mo16293a(this.f86261b);
            }
            C36481a.f86255d--;
            C36481a.f86256e++;
            C36481a.f86258g.mo63845a();
        }
    }

    /* renamed from: a */
    public final void mo63846a(C87020c cVar) {
        AbstractC87031d dVar;
        AbstractC87027a aVar;
        C87034e eVar = f86257f;
        if (eVar == null || (aVar = eVar.f196215b) == null) {
            dVar = null;
        } else {
            dVar = aVar.mo16298a(cVar, f86257f);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.ugc.live.gift.resource.producer.Producer<kotlin.String>");
        dVar.mo16296a(cVar, this);
    }

    /* renamed from: b */
    static String m74268b(C87020c cVar) {
        String str;
        AbstractC87012b bVar;
        C87034e eVar = f86257f;
        if (eVar == null || (bVar = eVar.f196214a) == null) {
            str = null;
        } else {
            str = bVar.mo16301a(cVar);
        }
        String a = C87037b.m150745a(str);
        if (!cVar.f196194f) {
            try {
                a = a + C87036a.m150742a(cVar.f196191c[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63847a(C87020c cVar, int i) {
        C89219l.m154721d(cVar, "");
        f86254c.post(new RunnableC36483b(cVar, i));
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63848a(C87020c cVar, C87021a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        f86254c.post(new RunnableC36482a(cVar, aVar));
    }

    /* renamed from: a */
    public final void mo63849a(C87020c cVar, AbstractC87026d dVar) {
        C87034e eVar;
        String str;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        m74269b();
        if (!(cVar == null || (eVar = f86257f) == null)) {
            AbstractC87012b bVar = eVar.f196214a;
            if (bVar != null) {
                str = bVar.mo16301a(cVar);
            } else {
                str = null;
            }
            if (new File(C87037b.m150745a(str) + ".fetched").exists()) {
                dVar.mo16290a(m74268b(cVar));
                return;
            }
        }
        String str2 = cVar.f196189a;
        Map<String, C87045k> map = f86252a;
        if (map.containsKey(str2)) {
            if (cVar.f196195g) {
                C87045k kVar = map.get(str2);
                if (kVar == null) {
                    C89219l.m154715b();
                }
                C87020c cVar2 = kVar.f196249a;
                if (cVar2 != null) {
                    Deque<C87020c> deque = f86259h;
                    if (deque.contains(cVar2)) {
                        deque.remove(cVar2);
                    }
                }
                cVar.mo140631b();
                f86259h.addFirst(cVar);
            }
            C87045k kVar2 = map.get(str2);
            if (kVar2 == null) {
                C89219l.m154715b();
            }
            kVar2.mo140650a(dVar);
            return;
        }
        C87045k kVar3 = new C87045k(cVar);
        kVar3.mo140650a(dVar);
        C89219l.m154716b(str2, "");
        map.put(str2, kVar3);
        cVar.mo140631b();
        if (cVar.f196195g) {
            f86259h.addFirst(cVar);
        } else {
            f86259h.add(cVar);
        }
        mo63845a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final /* synthetic */ void mo63850a(C87020c cVar, String str) {
        String str2;
        AbstractC87012b bVar;
        C89219l.m154721d(cVar, "");
        m74269b();
        C87034e eVar = f86257f;
        if (eVar == null || (bVar = eVar.f196214a) == null) {
            str2 = null;
        } else {
            str2 = bVar.mo16301a(cVar);
        }
        try {
            new File(C87037b.m150745a(str2) + ".fetched").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        f86254c.post(new RunnableC36484c(cVar));
    }
}
