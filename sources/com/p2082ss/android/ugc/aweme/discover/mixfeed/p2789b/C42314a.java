package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.a */
public final class C42314a implements Serializable {
    public static final C42316b Companion = new C42316b((byte) 0);

    /* renamed from: a */
    private String f98551a = "";

    /* renamed from: b */
    private boolean f98552b = true;

    /* renamed from: c */
    private int f98553c = -1;

    /* renamed from: d */
    private String f98554d = "";

    /* renamed from: e */
    private String f98555e = "";

    /* renamed from: f */
    private User f98556f;

    static {
        Covode.recordClassIndex(50257);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.a$b */
    public static final class C42316b {
        static {
            Covode.recordClassIndex(50259);
        }

        private C42316b() {
        }

        public /* synthetic */ C42316b(byte b) {
            this();
        }
    }

    public final int getRank() {
        return this.f98553c;
    }

    public final String getSearchKeyWord() {
        return this.f98555e;
    }

    public final String getSearchResultId() {
        return this.f98551a;
    }

    public final String getTokenType() {
        return this.f98554d;
    }

    public final User getUser() {
        return this.f98556f;
    }

    public final boolean isAladdin() {
        return this.f98552b;
    }

    public static final C42315a newBuilder() {
        return new C42315a();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.a$a */
    public static final class C42315a {

        /* renamed from: a */
        public String f98557a = "";

        /* renamed from: b */
        public int f98558b = -1;

        /* renamed from: c */
        public String f98559c = "";

        /* renamed from: d */
        public String f98560d = "";

        /* renamed from: e */
        private boolean f98561e = true;

        /* renamed from: f */
        private User f98562f;

        static {
            Covode.recordClassIndex(50258);
        }

        /* renamed from: a */
        public final C42314a mo71503a() {
            C42314a aVar = new C42314a();
            aVar.setSearchResultId(this.f98557a);
            aVar.setAladdin(this.f98561e);
            aVar.setRank(this.f98558b);
            aVar.setTokenType(this.f98559c);
            aVar.setSearchKeyWord(this.f98560d);
            aVar.setUser(this.f98562f);
            return aVar;
        }
    }

    public final void setAladdin(boolean z) {
        this.f98552b = z;
    }

    public final void setRank(int i) {
        this.f98553c = i;
    }

    public final void setSearchKeyWord(String str) {
        this.f98555e = str;
    }

    public final void setSearchResultId(String str) {
        this.f98551a = str;
    }

    public final void setTokenType(String str) {
        this.f98554d = str;
    }

    public final void setUser(User user) {
        this.f98556f = user;
    }
}
