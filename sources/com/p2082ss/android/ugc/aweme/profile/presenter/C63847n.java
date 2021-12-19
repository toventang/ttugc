package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.n */
public final class C63847n {

    /* renamed from: a */
    public String f144765a = "";

    /* renamed from: b */
    public String f144766b = "";

    /* renamed from: c */
    public int f144767c = -1;

    /* renamed from: d */
    public int f144768d;

    /* renamed from: e */
    public int f144769e = -1;

    /* renamed from: f */
    public String f144770f;

    /* renamed from: g */
    public String f144771g;

    /* renamed from: h */
    public Aweme f144772h;

    /* renamed from: i */
    public String f144773i;

    /* renamed from: j */
    public int f144774j = -1;

    /* renamed from: k */
    public int f144775k = -1;

    /* renamed from: l */
    public Map<String, String> f144776l;

    /* renamed from: m */
    public boolean f144777m;

    static {
        Covode.recordClassIndex(75271);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.n$a */
    public static final class C63848a {

        /* renamed from: a */
        public final C63847n f144778a = new C63847n();

        static {
            Covode.recordClassIndex(75272);
        }

        /* renamed from: a */
        public final C63847n mo103323a() {
            if (this.f144778a.f144767c != -1) {
                return this.f144778a;
            }
            throw new IllegalStateException("You must set an action.".toString());
        }

        /* renamed from: a */
        public final C63848a mo103318a(int i) {
            this.f144778a.f144767c = i;
            return this;
        }

        /* renamed from: b */
        public final C63848a mo103324b(int i) {
            this.f144778a.f144768d = i;
            return this;
        }

        /* renamed from: c */
        public final C63848a mo103326c(int i) {
            this.f144778a.f144769e = i;
            return this;
        }

        /* renamed from: d */
        public final C63848a mo103328d(int i) {
            this.f144778a.f144775k = i;
            return this;
        }

        /* renamed from: e */
        public final C63848a mo103330e(String str) {
            this.f144778a.f144773i = str;
            return this;
        }

        /* renamed from: a */
        public final C63848a mo103319a(Aweme aweme) {
            this.f144778a.f144772h = aweme;
            return this;
        }

        /* renamed from: b */
        public final C63848a mo103325b(String str) {
            C63847n nVar = this.f144778a;
            if (str == null) {
                str = "";
            }
            nVar.f144766b = str;
            return this;
        }

        /* renamed from: c */
        public final C63848a mo103327c(String str) {
            this.f144778a.f144770f = str;
            return this;
        }

        /* renamed from: d */
        public final C63848a mo103329d(String str) {
            this.f144778a.f144771g = str;
            return this;
        }

        /* renamed from: a */
        public final C63848a mo103320a(String str) {
            C63847n nVar = this.f144778a;
            if (str == null) {
                str = "";
            }
            nVar.f144765a = str;
            return this;
        }

        /* renamed from: a */
        public final C63848a mo103321a(Map<String, String> map) {
            this.f144778a.f144776l = map;
            return this;
        }

        /* renamed from: a */
        public final C63848a mo103322a(boolean z) {
            this.f144778a.f144777m = z;
            return this;
        }
    }
}
