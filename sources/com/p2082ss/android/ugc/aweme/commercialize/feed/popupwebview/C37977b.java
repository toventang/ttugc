package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b */
public final class C37977b {

    /* renamed from: a */
    public final Context f89721a;

    /* renamed from: b */
    public final AwemeRawAd f89722b;

    /* renamed from: c */
    public final int f89723c;

    /* renamed from: d */
    public final int f89724d;

    /* renamed from: e */
    public final String f89725e;

    /* renamed from: f */
    public final String f89726f;

    /* renamed from: g */
    public final boolean f89727g;

    /* renamed from: h */
    public final String f89728h;

    /* renamed from: i */
    public final Aweme f89729i;

    /* renamed from: j */
    public final AnchorLynxModel f89730j;

    static {
        Covode.recordClassIndex(45437);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b$a */
    public static final class C37978a {

        /* renamed from: a */
        public Context f89731a;

        /* renamed from: b */
        public AwemeRawAd f89732b;

        /* renamed from: c */
        public int f89733c = 2;

        /* renamed from: d */
        public int f89734d;

        /* renamed from: e */
        public String f89735e;

        /* renamed from: f */
        public String f89736f;

        /* renamed from: g */
        public boolean f89737g;

        /* renamed from: h */
        public String f89738h = "";

        /* renamed from: i */
        public Aweme f89739i;

        /* renamed from: j */
        public AnchorLynxModel f89740j;

        static {
            Covode.recordClassIndex(45438);
        }

        /* renamed from: a */
        public final C37977b mo66203a() {
            return new C37977b(this.f89731a, this.f89732b, this.f89733c, this.f89734d, this.f89735e, this.f89736f, this.f89737g, this.f89738h, this.f89739i, this.f89740j);
        }

        /* renamed from: a */
        public final C37978a mo66198a(int i) {
            this.f89733c = i;
            return this;
        }

        /* renamed from: b */
        public final C37978a mo66204b(int i) {
            this.f89734d = i;
            return this;
        }

        /* renamed from: a */
        public final C37978a mo66199a(Context context) {
            this.f89731a = context;
            return this;
        }

        /* renamed from: c */
        public final C37978a mo66206c(String str) {
            if (str == null) {
                str = "";
            }
            this.f89738h = str;
            return this;
        }

        /* renamed from: a */
        public final C37978a mo66200a(Aweme aweme) {
            this.f89739i = aweme;
            return this;
        }

        /* renamed from: b */
        public final C37978a mo66205b(String str) {
            C89219l.m154721d(str, "");
            this.f89736f = str;
            return this;
        }

        /* renamed from: a */
        public final C37978a mo66201a(AwemeRawAd awemeRawAd) {
            this.f89732b = awemeRawAd;
            return this;
        }

        /* renamed from: a */
        public final C37978a mo66202a(String str) {
            C89219l.m154721d(str, "");
            this.f89735e = str;
            return this;
        }
    }

    public C37977b(Context context, AwemeRawAd awemeRawAd, int i, int i2, String str, String str2, boolean z, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel) {
        this.f89721a = context;
        this.f89722b = awemeRawAd;
        this.f89723c = i;
        this.f89724d = i2;
        this.f89725e = str;
        this.f89726f = str2;
        this.f89727g = z;
        this.f89728h = str3;
        this.f89729i = aweme;
        this.f89730j = anchorLynxModel;
    }
}
