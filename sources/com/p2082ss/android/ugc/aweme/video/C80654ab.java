package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80708z;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.Comparator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.ab */
public final class C80654ab {

    /* renamed from: a */
    public static final C80654ab f180338a = new C80654ab();

    /* renamed from: b */
    private static final AbstractC89244h f180339b = C89250i.m154773a((AbstractC89171a) C80657c.f180344a);

    /* renamed from: c */
    private static final AbstractC89244h f180340c = C89250i.m154773a((AbstractC89171a) C80658d.f180345a);

    /* renamed from: d */
    private static final AbstractC89244h f180341d = C89250i.m154773a((AbstractC89171a) C80655a.f180342a);

    /* renamed from: a */
    public static final int m139874a() {
        return ((Number) f180339b.getValue()).intValue();
    }

    /* renamed from: b */
    public static final int m139878b() {
        return ((Number) f180340c.getValue()).intValue();
    }

    private C80654ab() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.ab$a */
    static final class C80655a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C80655a f180342a = new C80655a();

        static {
            Covode.recordClassIndex(93934);
        }

        C80655a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "profile_video_preload_concurrent_experiment_2103_tt", 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.ab$c */
    static final class C80657c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C80657c f180344a = new C80657c();

        static {
            Covode.recordClassIndex(93936);
        }

        C80657c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "profile_video_preload_experiment_2103_tt", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.ab$d */
    static final class C80658d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C80658d f180345a = new C80658d();

        static {
            Covode.recordClassIndex(93937);
        }

        C80658d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "profile_video_preload_size_experiment_2103_tt", 409600));
        }
    }

    static {
        Covode.recordClassIndex(93933);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.ab$f */
    public static final class RunnableC80660f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f180347a;

        static {
            Covode.recordClassIndex(93939);
        }

        RunnableC80660f(AbstractC89171a aVar) {
            this.f180347a = aVar;
        }

        public final void run() {
            C89219l.m154721d("others profile idle preload [start] add ------------", "");
            List<Aweme> list = (List) this.f180347a.invoke();
            if (C80708z.f180437a) {
                C89219l.m154721d("start sort", "");
                if (list != null) {
                    list = C89070n.m154553a((Iterable) list, (Comparator) new C80661a());
                }
                C89219l.m154721d("others profile idle preload [end] add ------------\n", "");
            }
            if (list != null) {
                for (Aweme aweme : list) {
                    C80662ac.m139882a(aweme, C80654ab.m139878b());
                }
            }
            C89219l.m154721d("others profile idle preload [end] add ------------\n", "");
        }

        /* renamed from: com.ss.android.ugc.aweme.video.ab$f$a */
        public static final class C80661a<T> implements Comparator {
            static {
                Covode.recordClassIndex(93940);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l;
                AwemeStatistics statistics;
                AwemeStatistics statistics2;
                T t3 = t2;
                Long l2 = null;
                if (t3 == null || (statistics2 = t3.getStatistics()) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(statistics2.getDiggCount());
                }
                T t4 = t;
                if (!(t4 == null || (statistics = t4.getStatistics()) == null)) {
                    l2 = Long.valueOf(statistics.getDiggCount());
                }
                return C89090a.m154604a(l, l2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.ab$b */
    public static final class C80656b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C80656b f180343a = new C80656b();

        static {
            Covode.recordClassIndex(93935);
        }

        C80656b() {
            super(1);
        }

        /* renamed from: a */
        public static boolean m139879a(int i) {
            if ((i & C80654ab.m139874a()) > 0) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(m139879a(num.intValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.ab$e */
    public static final class C80659e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C80659e f180346a = new C80659e();

        static {
            Covode.recordClassIndex(93938);
        }

        C80659e() {
            super(1);
        }

        /* renamed from: a */
        public static boolean m139880a(int i) {
            if ((i & C80654ab.m139874a()) > 0) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(m139880a(num.intValue()));
        }
    }

    /* renamed from: a */
    private static boolean m139877a(int i) {
        C89219l.m154721d("current scope is [" + m139874a() + ']', "");
        if (i == 0) {
            C89219l.m154721d("current scene is [OthersPublish]", "");
            return C80656b.m139879a(1);
        } else if (i != 1) {
            return false;
        } else {
            C89219l.m154721d("current scene is [OthersFavorite]", "");
            return C80656b.m139879a(2);
        }
    }

    /* renamed from: a */
    public static final void m139875a(int i, AbstractC89171a<? extends List<? extends Aweme>> aVar) {
        C89219l.m154721d(aVar, "");
        if (!m139877a(i)) {
            C89219l.m154721d("this scene is not in scope", "");
        } else if (m139878b() > 0) {
            ExecutorC34605m.f81660a.execute(new RunnableC80660f(aVar));
        }
    }

    /* renamed from: a */
    public static final void m139876a(C84241i iVar, boolean z, int i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("[");
        if (iVar != null) {
            str = iVar.getSourceId();
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append("] add preload task into engine [");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        C89219l.m154721d(append.append(str2).append("], size : ").append(i).toString(), "");
    }
}
