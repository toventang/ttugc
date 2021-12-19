package com.p2082ss.android.ugc.aweme.port.p3561in;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C71832f;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.ak */
public interface AbstractC63178ak extends AbstractC63173ag {

    /* renamed from: a */
    public static final String f143521a = (AbstractC63173ag.class.getCanonicalName() + ":on_recommend_hash_get");

    /* renamed from: com.ss.android.ugc.aweme.port.in.ak$a */
    public interface AbstractC63179a<T> {
        static {
            Covode.recordClassIndex(74452);
        }

        /* renamed from: a */
        void mo101620a();

        /* renamed from: a */
        void mo101621a(List<T> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ak$b */
    public interface AbstractC63180b {
        static {
            Covode.recordClassIndex(74453);
        }

        /* renamed from: a */
        boolean mo93916a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ak$c */
    public interface AbstractC63181c {
        static {
            Covode.recordClassIndex(74454);
        }

        /* renamed from: a */
        boolean mo93915a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ak$d */
    public interface AbstractC63182d {
        static {
            Covode.recordClassIndex(74455);
        }

        /* renamed from: a */
        C71832f mo93809a();

        /* renamed from: a */
        void mo93810a(C63184f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ak$e */
    public interface AbstractC63183e {
        static {
            Covode.recordClassIndex(74456);
        }

        /* renamed from: a */
        void mo101622a(AVSearchChallengeList aVSearchChallengeList);

        /* renamed from: b */
        void mo101623b();

        /* renamed from: c */
        void mo101624c();
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ak$f */
    public static class C63184f {

        /* renamed from: a */
        public String f143522a;

        /* renamed from: b */
        public String f143523b;

        /* renamed from: c */
        public String f143524c;

        /* renamed from: d */
        public String f143525d;

        /* renamed from: e */
        public String f143526e;

        /* renamed from: f */
        public int f143527f;

        /* renamed from: g */
        public String f143528g;

        static {
            Covode.recordClassIndex(74457);
        }
    }

    /* renamed from: a */
    AbstractC63180b mo93803a(AbstractC63179a<AVChallenge> aVar);

    /* renamed from: a */
    AbstractC63181c mo93804a(AbstractC63183e eVar);

    /* renamed from: a */
    AbstractC63182d mo93805a(Fragment fragment);

    /* renamed from: a */
    AbstractC63182d mo93806a(ActivityC0945e eVar);

    static {
        Covode.recordClassIndex(74451);
    }
}
