package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.a */
public final class C11672a {

    /* renamed from: H */
    public static final C11673a f27884H = new C11673a((byte) 0);
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: A */
    public String f27885A;

    /* renamed from: B */
    public String f27886B;

    /* renamed from: C */
    public boolean f27887C;

    /* renamed from: D */
    public boolean f27888D;

    /* renamed from: E */
    public String f27889E;

    /* renamed from: F */
    public C11676d f27890F;

    /* renamed from: G */
    public C11675c f27891G = new C11675c();

    /* renamed from: I */
    private String f27892I = "";
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public long f27893a;

    /* renamed from: b */
    public String f27894b = "";

    /* renamed from: c */
    public String f27895c = "";
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: d */
    public C2962b f27896d;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: e */
    public String f27897e;

    /* renamed from: f */
    public String f27898f;

    /* renamed from: g */
    public String f27899g = "";

    /* renamed from: h */
    public int f27900h;
    @AbstractC27891c(mo46611a = "tags")

    /* renamed from: i */
    public List<String> f27901i;
    @AbstractC27891c(mo46611a = "types")

    /* renamed from: j */
    public List<String> f27902j;

    /* renamed from: k */
    public String f27903k;

    /* renamed from: l */
    public boolean f27904l;

    /* renamed from: m */
    public boolean f27905m;

    /* renamed from: n */
    public List<C11674b> f27906n = new ArrayList();

    /* renamed from: o */
    public List<C11672a> f27907o;

    /* renamed from: p */
    public ArrayList<String> f27908p = new ArrayList<>();

    /* renamed from: q */
    public Effect f27909q;

    /* renamed from: r */
    public ArrayList<Integer> f27910r = new ArrayList<>();

    /* renamed from: s */
    public Boolean f27911s;

    /* renamed from: t */
    public boolean f27912t;

    /* renamed from: u */
    public boolean f27913u;

    /* renamed from: v */
    public boolean f27914v;

    /* renamed from: w */
    public boolean f27915w;

    /* renamed from: x */
    public String f27916x;

    /* renamed from: y */
    public String f27917y;

    /* renamed from: z */
    public Integer f27918z;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$b */
    public static final class C11674b {
        @AbstractC27891c(mo46611a = StringSet.name)

        /* renamed from: a */
        public String f27919a = "";
        @AbstractC27891c(mo46611a = "value")

        /* renamed from: b */
        public int f27920b;
        @AbstractC27891c(mo46611a = "tag")

        /* renamed from: c */
        public String f27921c = "";
        @AbstractC27891c(mo46611a = "max")

        /* renamed from: d */
        public int f27922d = 100;
        @AbstractC27891c(mo46611a = "min")

        /* renamed from: e */
        public int f27923e = 100;
        @AbstractC27891c(mo46611a = "doubleDirection")

        /* renamed from: f */
        public boolean f27924f;

        /* renamed from: g */
        public int f27925g;

        static {
            Covode.recordClassIndex(13342);
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$c */
    public static final class C11675c {

        /* renamed from: a */
        public String f27926a = "";

        /* renamed from: b */
        public String f27927b = "";

        /* renamed from: c */
        public String f27928c = "";

        static {
            Covode.recordClassIndex(13343);
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$d */
    public static final class C11676d {
        @AbstractC27891c(mo46611a = "audio_effect")

        /* renamed from: a */
        public boolean f27929a;

        static {
            Covode.recordClassIndex(13344);
        }
    }

    static {
        Covode.recordClassIndex(13340);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$a */
    public static final class C11673a {
        static {
            Covode.recordClassIndex(13341);
        }

        private C11673a() {
        }

        public /* synthetic */ C11673a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C11674b mo18439a() {
        return (C11674b) C89070n.m154583g((List) this.f27906n);
    }

    /* renamed from: b */
    public final boolean mo18443b() {
        if (this.f27916x != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27893a;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public final void mo18440a(String str) {
        C89219l.m154721d(str, "");
        this.f27894b = str;
    }

    /* renamed from: b */
    public final void mo18442b(String str) {
        C89219l.m154721d(str, "");
        this.f27895c = str;
    }

    /* renamed from: c */
    public final void mo18444c(String str) {
        C89219l.m154721d(str, "");
        this.f27899g = str;
    }

    /* renamed from: d */
    public final void mo18445d(String str) {
        C89219l.m154721d(str, "");
        this.f27892I = str;
    }

    /* renamed from: a */
    public final void mo18441a(List<C11674b> list) {
        C89219l.m154721d(list, "");
        this.f27906n = list;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.LiveEffect");
        if (this.f27893a != ((C11672a) obj).f27893a) {
            return false;
        }
        return true;
    }
}
