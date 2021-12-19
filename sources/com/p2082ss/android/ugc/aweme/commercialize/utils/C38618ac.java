package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ac */
public final class C38618ac {

    /* renamed from: a */
    public final String f91259a;

    /* renamed from: b */
    public final AbstractC1204m f91260b;

    /* renamed from: c */
    public final int f91261c;

    /* renamed from: d */
    public final String f91262d;

    /* renamed from: e */
    public final Bundle f91263e;

    /* renamed from: f */
    public final AwemeRawAd f91264f;

    /* renamed from: g */
    public final boolean f91265g;

    /* renamed from: h */
    public final AnchorLynxModel f91266h;

    static {
        Covode.recordClassIndex(46159);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ac$a */
    public static final class C38619a {

        /* renamed from: a */
        public String f91267a = "about:blank";

        /* renamed from: b */
        public int f91268b;

        /* renamed from: c */
        public String f91269c = "";

        /* renamed from: d */
        public Bundle f91270d;

        /* renamed from: e */
        public AwemeRawAd f91271e;

        /* renamed from: f */
        public AbstractC1204m f91272f;

        /* renamed from: g */
        public boolean f91273g;

        /* renamed from: h */
        public AnchorLynxModel f91274h;

        static {
            Covode.recordClassIndex(46160);
        }

        /* renamed from: a */
        public final C38618ac mo67200a() {
            return new C38618ac(this.f91267a, this.f91272f, this.f91268b, this.f91269c, this.f91270d, this.f91271e, this.f91273g, this.f91274h);
        }

        /* renamed from: a */
        public final C38619a mo67195a(int i) {
            this.f91268b = i;
            return this;
        }

        /* renamed from: a */
        public final C38619a mo67197a(AbstractC1204m mVar) {
            this.f91272f = mVar;
            return this;
        }

        /* renamed from: a */
        public final C38619a mo67196a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            this.f91270d = bundle;
            return this;
        }

        /* renamed from: b */
        public final C38619a mo67201b(String str) {
            C89219l.m154721d(str, "");
            this.f91269c = str;
            return this;
        }

        /* renamed from: a */
        public final C38619a mo67198a(AwemeRawAd awemeRawAd) {
            this.f91271e = awemeRawAd;
            return this;
        }

        /* renamed from: a */
        public final C38619a mo67199a(String str) {
            C89219l.m154721d(str, "");
            this.f91267a = str;
            return this;
        }
    }

    public C38618ac(String str, AbstractC1204m mVar, int i, String str2, Bundle bundle, AwemeRawAd awemeRawAd, boolean z, AnchorLynxModel anchorLynxModel) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f91259a = str;
        this.f91260b = mVar;
        this.f91261c = i;
        this.f91262d = str2;
        this.f91263e = bundle;
        this.f91264f = awemeRawAd;
        this.f91265g = z;
        this.f91266h = anchorLynxModel;
    }
}
