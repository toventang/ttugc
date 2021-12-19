package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38586f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.k */
public final class C38751k {

    /* renamed from: a */
    public long f91510a;

    /* renamed from: b */
    public String f91511b;

    /* renamed from: c */
    public long f91512c;

    /* renamed from: d */
    public String f91513d;

    /* renamed from: e */
    public String f91514e;

    /* renamed from: f */
    public String f91515f;

    /* renamed from: g */
    public String f91516g;

    /* renamed from: h */
    public String f91517h;

    /* renamed from: i */
    public String f91518i;

    /* renamed from: j */
    public String f91519j;

    /* renamed from: k */
    public int f91520k;

    /* renamed from: l */
    public List<String> f91521l;

    /* renamed from: m */
    public Aweme f91522m;

    static {
        Covode.recordClassIndex(46292);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.k$a */
    public static final class C38752a extends C38586f<C38751k> {
        static {
            Covode.recordClassIndex(46293);
        }

        public C38752a() {
            super(new C38751k((byte) 0));
        }

        /* renamed from: a */
        public final C38752a mo67290a(Aweme aweme) {
            mo67169a(new C38753a(aweme));
            return this;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.k$a$a */
        static final class C38753a extends AbstractC89220m implements AbstractC89172b<C38751k, C89391z> {

            /* renamed from: a */
            final /* synthetic */ Aweme f91523a;

            static {
                Covode.recordClassIndex(46294);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38753a(Aweme aweme) {
                super(1);
                this.f91523a = aweme;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C38751k kVar) {
                long j;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                int i;
                AwemeRawAd awemeRawAd;
                UrlModel clickTrackUrlList;
                AwemeRawAd awemeRawAd2;
                AwemeRawAd awemeRawAd3;
                AwemeRawAd awemeRawAd4;
                AwemeRawAd awemeRawAd5;
                AwemeRawAd awemeRawAd6;
                AwemeRawAd awemeRawAd7;
                AwemeRawAd awemeRawAd8;
                AwemeRawAd awemeRawAd9;
                AwemeRawAd awemeRawAd10;
                Long groupId;
                AwemeRawAd awemeRawAd11;
                AwemeRawAd awemeRawAd12;
                Long creativeId;
                C38751k kVar2 = kVar;
                C89219l.m154721d(kVar2, "");
                kVar2.f91522m = this.f91523a;
                Aweme aweme = this.f91523a;
                long j2 = 0;
                if (aweme == null || (awemeRawAd12 = aweme.getAwemeRawAd()) == null || (creativeId = awemeRawAd12.getCreativeId()) == null) {
                    j = 0;
                } else {
                    j = creativeId.longValue();
                }
                kVar2.f91510a = j;
                Aweme aweme2 = this.f91523a;
                List<String> list = null;
                if (aweme2 == null || (awemeRawAd11 = aweme2.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd11.getLogExtra();
                }
                kVar2.f91511b = str;
                Aweme aweme3 = this.f91523a;
                if (!(aweme3 == null || (awemeRawAd10 = aweme3.getAwemeRawAd()) == null || (groupId = awemeRawAd10.getGroupId()) == null)) {
                    j2 = groupId.longValue();
                }
                kVar2.f91512c = j2;
                Aweme aweme4 = this.f91523a;
                if (aweme4 == null || (awemeRawAd9 = aweme4.getAwemeRawAd()) == null) {
                    str2 = null;
                } else {
                    str2 = awemeRawAd9.getOpenUrl();
                }
                kVar2.f91513d = str2;
                Aweme aweme5 = this.f91523a;
                if (aweme5 == null || (awemeRawAd8 = aweme5.getAwemeRawAd()) == null) {
                    str3 = null;
                } else {
                    str3 = awemeRawAd8.getWebUrl();
                }
                kVar2.f91514e = str3;
                Aweme aweme6 = this.f91523a;
                if (aweme6 == null || (awemeRawAd7 = aweme6.getAwemeRawAd()) == null) {
                    str4 = null;
                } else {
                    str4 = awemeRawAd7.getWebTitle();
                }
                kVar2.f91515f = str4;
                Aweme aweme7 = this.f91523a;
                if (aweme7 == null || (awemeRawAd6 = aweme7.getAwemeRawAd()) == null) {
                    str5 = null;
                } else {
                    str5 = awemeRawAd6.getDownloadUrl();
                }
                kVar2.f91516g = str5;
                Aweme aweme8 = this.f91523a;
                if (aweme8 == null || (awemeRawAd5 = aweme8.getAwemeRawAd()) == null) {
                    str6 = null;
                } else {
                    str6 = awemeRawAd5.getPackageName();
                }
                kVar2.f91517h = str6;
                Aweme aweme9 = this.f91523a;
                if (aweme9 == null || (awemeRawAd4 = aweme9.getAwemeRawAd()) == null) {
                    str7 = null;
                } else {
                    str7 = awemeRawAd4.getAppName();
                }
                kVar2.f91518i = str7;
                Aweme aweme10 = this.f91523a;
                if (aweme10 == null || (awemeRawAd3 = aweme10.getAwemeRawAd()) == null) {
                    str8 = null;
                } else {
                    str8 = awemeRawAd3.getType();
                }
                kVar2.f91519j = str8;
                Aweme aweme11 = this.f91523a;
                if (aweme11 == null || (awemeRawAd2 = aweme11.getAwemeRawAd()) == null) {
                    i = 0;
                } else {
                    i = awemeRawAd2.getSystemOrigin();
                }
                kVar2.f91520k = i;
                Aweme aweme12 = this.f91523a;
                if (!(aweme12 == null || (awemeRawAd = aweme12.getAwemeRawAd()) == null || (clickTrackUrlList = awemeRawAd.getClickTrackUrlList()) == null)) {
                    list = clickTrackUrlList.getUrlList();
                }
                kVar2.f91521l = list;
                return C89391z.f203057a;
            }
        }
    }

    private C38751k() {
        this.f91510a = 0;
        this.f91511b = null;
        this.f91512c = 0;
        this.f91513d = null;
        this.f91514e = null;
        this.f91515f = null;
        this.f91516g = null;
        this.f91517h = null;
        this.f91518i = null;
        this.f91519j = null;
        this.f91520k = 0;
        this.f91521l = null;
        this.f91522m = null;
    }

    /* synthetic */ C38751k(byte b) {
        this();
    }
}
