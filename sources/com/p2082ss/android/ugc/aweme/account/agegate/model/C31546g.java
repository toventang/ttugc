package com.p2082ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.g */
public final class C31546g {

    /* renamed from: c */
    public static final C31546g f75446c = new C31546g("^.{0,24}$", R.string.adn);

    /* renamed from: d */
    public static final C31546g f75447d = new C31546g("^\\S*$", R.string.adq);

    /* renamed from: e */
    public static final C31546g f75448e = new C31546g("^[\\w.]*$", R.string.adr);

    /* renamed from: f */
    public static final C31547a f75449f = new C31547a((byte) 0);

    /* renamed from: a */
    public final String f75450a;

    /* renamed from: b */
    public final int f75451b;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.model.g$a */
    public static final class C31547a {
        static {
            Covode.recordClassIndex(38265);
        }

        private C31547a() {
        }

        public /* synthetic */ C31547a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38264);
    }

    private C31546g(String str, int i) {
        C89219l.m154721d(str, "");
        this.f75450a = str;
        this.f75451b = i;
    }
}
