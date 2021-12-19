package com.p2082ss.android.ugc.aweme.share.improve.p3761f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.share.C68862ag;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69112c;
import com.p2082ss.android.ugc.aweme.share.p3748f.C68925b;
import com.p2082ss.android.ugc.aweme.share.qrcode.p3772a.C69389a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.trill.share.data.C85184a;
import com.p2082ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.f.d */
public final class C69200d implements Comparator<AbstractC69581b> {

    /* renamed from: d */
    public static final Keva f154689d;

    /* renamed from: e */
    public static boolean f154690e = true;

    /* renamed from: f */
    public static final C69201a f154691f = new C69201a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f154692a = C89250i.m154773a((AbstractC89171a) C69203c.f154698a);

    /* renamed from: b */
    public int f154693b = -1;

    /* renamed from: c */
    public final int f154694c = 0;

    /* renamed from: g */
    private final AbstractC89244h f154695g = C89250i.m154773a((AbstractC89171a) new C69204d(this));

    /* renamed from: h */
    private final AbstractC89244h f154696h = C89250i.m154773a((AbstractC89171a) new C69202b(this));

    /* renamed from: b */
    private final Map<String, Integer> m122301b() {
        return (Map) this.f154696h.getValue();
    }

    /* renamed from: a */
    public final List<C68862ag> mo109566a() {
        return (List) this.f154695g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$a */
    public static final class C69201a {
        static {
            Covode.recordClassIndex(81515);
        }

        private C69201a() {
        }

        /* renamed from: a */
        public static void m122303a() {
            boolean z = C69200d.f154689d.getBoolean("isFirstLocatedFront", true);
            C69200d.f154690e = z;
            if (z && C68925b.m121623e()) {
                C69200d.f154689d.storeBoolean("isFirstLocatedFront", false);
            }
        }

        public /* synthetic */ C69201a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$c */
    static final class C69203c extends AbstractC89220m implements AbstractC89171a<ShareDatabase> {

        /* renamed from: a */
        public static final C69203c f154698a = new C69203c();

        static {
            Covode.recordClassIndex(81517);
        }

        C69203c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShareDatabase invoke() {
            return ShareDatabase.m146473a(C17867d.m33078a());
        }
    }

    static {
        Covode.recordClassIndex(81514);
        Keva repo = Keva.getRepo("locate_whatsapp_front");
        C89219l.m154716b(repo, "");
        f154689d = repo;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$b */
    static final class C69202b extends AbstractC89220m implements AbstractC89171a<Map<String, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C69200d f154697a;

        static {
            Covode.recordClassIndex(81516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69202b(C69200d dVar) {
            super(0);
            this.f154697a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<String, Integer> invoke() {
            int i;
            try {
                HashMap hashMap = new HashMap();
                for (C68862ag agVar : this.f154697a.mo109566a()) {
                    String str = agVar.f154008a;
                    C89219l.m154716b(str, "");
                    hashMap.put(str, 0);
                }
                ShareDatabase shareDatabase = (ShareDatabase) this.f154697a.f154692a.getValue();
                if (shareDatabase == null) {
                    C89219l.m154715b();
                }
                List<C85184a> a = shareDatabase.mo130107i().mo130108a(Integer.valueOf(this.f154697a.f154694c));
                if (a.size() >= 10) {
                    this.f154697a.f154693b = a.get(a.size() - 1).f190606a;
                }
                for (C85184a aVar : a) {
                    C89219l.m154716b(aVar, "");
                    Integer num = (Integer) hashMap.get(aVar.f190608c);
                    String str2 = aVar.f190608c;
                    C89219l.m154716b(str2, "");
                    if (num == null) {
                        i = 1;
                    } else {
                        i = num.intValue() + 1;
                    }
                    hashMap.put(str2, Integer.valueOf(i));
                }
                return hashMap;
            } catch (Exception unused) {
                return C89041ag.m154415a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$d */
    static final class C69204d extends AbstractC89220m implements AbstractC89171a<List<C68862ag>> {

        /* renamed from: a */
        final /* synthetic */ C69200d f154699a;

        static {
            Covode.recordClassIndex(81518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69204d(C69200d dVar) {
            super(0);
            this.f154699a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.util.List<com.p2082ss.android.ugc.aweme.share.C68862ag> invoke() {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69200d.C69204d.invoke():java.lang.Object");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$d$a */
        public static final class C69205a<T> implements Comparator {

            /* renamed from: a */
            final /* synthetic */ C69204d f154700a;

            /* renamed from: b */
            final /* synthetic */ List f154701b;

            static {
                Covode.recordClassIndex(81519);
            }

            public C69205a(C69204d dVar, List list) {
                this.f154700a = dVar;
                this.f154701b = list;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String str = t.f154008a;
                C89219l.m154716b(str, "");
                Integer valueOf = Integer.valueOf(C69200d.m122300a(str, this.f154701b));
                String str2 = t2.f154008a;
                C89219l.m154716b(str2, "");
                return C89090a.m154604a(valueOf, Integer.valueOf(C69200d.m122300a(str2, this.f154701b)));
            }
        }
    }

    /* renamed from: a */
    private final int m122299a(AbstractC69581b bVar) {
        for (C68862ag agVar : mo109566a()) {
            if (C89219l.m154714a((Object) agVar.f154008a, (Object) bVar.mo109548a())) {
                return mo109566a().indexOf(agVar);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static int m122300a(String str, List<String> list) {
        for (String str2 : list) {
            if (C89219l.m154714a((Object) str2, (Object) str)) {
                return list.indexOf(str2);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC69581b bVar, AbstractC69581b bVar2) {
        boolean z;
        int i;
        AbstractC69581b bVar3 = bVar;
        AbstractC69581b bVar4 = bVar2;
        C89219l.m154721d(bVar3, "");
        C89219l.m154721d(bVar4, "");
        int i2 = 0;
        if (!C68925b.m121623e()) {
            z = false;
        } else {
            z = f154690e;
        }
        if (z) {
            if (C89219l.m154714a((Object) bVar3.mo109548a(), (Object) "whatsapp")) {
                return -1;
            }
            if (C89219l.m154714a((Object) bVar4.mo109548a(), (Object) "whatsapp")) {
                return 1;
            }
            if (C89219l.m154714a((Object) bVar3.mo109548a(), (Object) "whatsapp_status")) {
                return -1;
            }
            if (C89219l.m154714a((Object) bVar4.mo109548a(), (Object) "whatsapp_status")) {
                return 1;
            }
        }
        if (bVar3.mo109548a().equals("more")) {
            return 1;
        }
        if (bVar4.mo109548a().equals("more") || (bVar3 instanceof C69112c) || (bVar3 instanceof C69389a)) {
            return -1;
        }
        if ((bVar4 instanceof C69112c) || (bVar4 instanceof C69389a)) {
            return 1;
        }
        Integer num = m122301b().get(bVar3.mo109548a());
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = m122301b().get(bVar4.mo109548a());
        if (num2 != null) {
            i2 = num2.intValue();
        }
        int i3 = i - i2;
        if (i3 != 0) {
            return -i3;
        }
        return m122299a(bVar3) - m122299a(bVar4);
    }
}
