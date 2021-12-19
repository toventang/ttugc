package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.p1777x.AbstractC23681b;
import com.bytedance.p1777x.AbstractC23689c;
import com.bytedance.p1777x.p1778a.C23679a;
import com.bytedance.p1777x.p1778a.C23680b;
import com.bytedance.p1777x.p1779b.C23682a;
import com.bytedance.p1777x.p1779b.C23683b;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.p1777x.p1779b.C23685d;
import com.bytedance.p1777x.p1779b.C23686e;
import com.bytedance.p1777x.p1779b.C23687f;
import com.bytedance.p1777x.p1779b.C23688g;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29931a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38162ah;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38185g;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38218af;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38222ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.BitRate;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89297c;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89342g;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs */
public final class C38703bs {

    /* renamed from: a */
    public static final C38703bs f91422a = new C38703bs();

    /* renamed from: b */
    private static final C89350l f91423b = new C89350l("(\\d+)%");

    /* renamed from: c */
    private static final C89350l f91424c = new C89350l("(\\d{2}):(\\d{2}):(\\d{2})");

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$a */
    public static final class C38704a implements AbstractC23681b {

        /* renamed from: a */
        public static final C38704a f91425a = new C38704a();

        private C38704a() {
        }

        static {
            Covode.recordClassIndex(46245);
        }

        @Override // com.bytedance.p1777x.AbstractC23681b
        /* renamed from: a */
        public final Document mo39104a(String str) {
            boolean z;
            MethodCollector.m26663i(2296);
            if (str != null) {
                try {
                    String a = RawURLGetter.m77316a("other");
                    if (a.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    List<AbstractC29926a> c = z ? null : C89070n.m154524c(new C29931a("User-Agent", a));
                    ArrayList arrayList = new ArrayList();
                    if (c != null) {
                        for (AbstractC29926a aVar : c) {
                            arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
                        }
                    }
                    String str2 = RawURLGetter.m77314a().doGet(str, arrayList).get();
                    if (str2 == null) {
                        C89219l.m154715b();
                    }
                    try {
                        Charset charset = C89338d.f202990a;
                        if (str2 != null) {
                            byte[] bytes = str2.getBytes(charset);
                            C89219l.m154716b(bytes, "");
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                            try {
                                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                                C89146c.m154636a(byteArrayInputStream, null);
                                C89219l.m154716b(parse, "");
                                MethodCollector.m26664o(2296);
                                return parse;
                            } catch (Throwable th) {
                                C89146c.m154636a(byteArrayInputStream, th);
                                MethodCollector.m26664o(2296);
                                throw th;
                            }
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            MethodCollector.m26664o(2296);
                            throw nullPointerException;
                        }
                    } catch (Throwable th2) {
                        C23680b bVar = new C23680b(th2);
                        MethodCollector.m26664o(2296);
                        throw bVar;
                    }
                } catch (Exception e) {
                    C23679a aVar2 = new C23679a(str, e);
                    MethodCollector.m26664o(2296);
                    throw aVar2;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("url is null");
                MethodCollector.m26664o(2296);
                throw nullPointerException2;
            }
        }
    }

    private C38703bs() {
    }

    /* renamed from: a */
    public static final void m78524a(AbstractC89306h<String> hVar, AbstractC38162ah ahVar) {
        C38185g.m77450a(ahVar, (Collection<String>) C89309k.m154814h(C89309k.m154810e(C89309k.m154809e(hVar), C38720n.f91458a)), false);
    }

    /* renamed from: a */
    public static final void m78527a(String str, Aweme aweme, String str2) {
        AbstractC89306h hVar;
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        C23687f fVar;
        List<C23683b> list;
        if (str != null && C38701br.m78512a(aweme, 3)) {
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
                hVar = C89297c.f202938a;
            } else {
                hVar = C89309k.m154807d(C89070n.m154598r(list), new C38724r());
            }
            m78525a(C89309k.m154810e(C89309k.m154799a(hVar, (AbstractC89172b) new C38725s(str)), C38726t.f91465a), str2, aweme);
        }
    }

    /* renamed from: a */
    private static boolean m78529a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean disableOmSdk = iESSettingsProxy.getDisableOmSdk();
            C89219l.m154716b(disableOmSdk, "");
            return disableOmSdk.booleanValue();
        } catch (C16041a unused) {
            return true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m78528a(String str, String str2, long j, String str3, Aweme aweme, AwemeRawAd awemeRawAd, int i) {
        if ((i & 16) != 0) {
            aweme = null;
        }
        if ((i & 32) != 0) {
            awemeRawAd = null;
        }
        if (str3 != null) {
            C38182f.C38184b a = C38182f.m77419a(str, str2, j);
            a.f90216f = "track_url";
            a.f90211a = "track_ad";
            a.mo66505d(str3).mo66497b(aweme).mo66498b(awemeRawAd).mo66502b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$b */
    public static final class C38707b implements AbstractC23689c {

        /* renamed from: a */
        public final Aweme f91431a;

        /* renamed from: b */
        private final long f91432b = System.currentTimeMillis();

        /* renamed from: c */
        private long f91433c;

        /* renamed from: d */
        private int f91434d;

        /* renamed from: e */
        private final C38678be f91435e = new C38678be();

        /* renamed from: f */
        private final C38678be f91436f = new C38678be();

        static {
            Covode.recordClassIndex(46248);
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: e */
        public final void mo39119e() {
            this.f91434d--;
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: b */
        public final void mo39116b() {
            this.f91434d++;
            this.f91433c = System.currentTimeMillis();
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: d */
        public final void mo39118d() {
            if (this.f91435e.mo67252a()) {
                C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91431a);
                b.f90211a = "draw_ad";
                b.f90212b = "show_fail";
                b.mo66491a(C89041ag.m154412a(C89387v.m154943a("error_message", "vast_wrapper_count_unmatch"))).mo66495a((Context) null);
                C18129a.m33746a("draw_ad", "show_fail", this.f91431a.getAwemeRawAd()).mo28897a("error_message", "vast_wrapper_count_unmatch").mo28902c();
            }
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: a */
        public final void mo39113a() {
            this.f91434d++;
            this.f91433c = System.currentTimeMillis();
            if (this.f91436f.mo67252a()) {
                C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91431a);
                b.f90211a = "draw_ad";
                b.f90212b = "query_wrapper";
                b.mo66491a(C89041ag.m154412a(C89387v.m154943a("duration", Long.valueOf(System.currentTimeMillis() - this.f91432b)))).mo66495a((Context) null);
                C18129a.m33746a("draw_ad", "query_wrapper", this.f91431a.getAwemeRawAd()).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - this.f91433c)).mo28902c();
            }
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: c */
        public final void mo39117c() {
            C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91431a);
            b.f90211a = "draw_ad";
            b.f90212b = "get_inline";
            b.mo66491a(C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(System.currentTimeMillis() - this.f91433c)), C89387v.m154943a("wrapper_count", Integer.valueOf(this.f91434d - 1)))).mo66495a((Context) null);
            C18129a.m33746a("draw_ad", "get_inline", this.f91431a.getAwemeRawAd()).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - this.f91433c)).mo28897a("wrapper_count", Integer.valueOf(this.f91434d - 1)).mo28902c();
        }

        public C38707b(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            this.f91431a = aweme;
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: a */
        public final void mo39114a(C23679a aVar) {
            String str;
            String str2;
            String str3 = null;
            if (aVar.getCause() instanceof C29929b) {
                C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91431a);
                b.f90211a = "draw_ad";
                b.f90212b = "show_fail";
                C89378p[] pVarArr = new C89378p[2];
                pVarArr[0] = C89387v.m154943a("error_message", "vast_mediafile_bad_response");
                Throwable cause = aVar.getCause();
                if (cause != null) {
                    str2 = cause.getMessage();
                } else {
                    str2 = null;
                }
                pVarArr[1] = C89387v.m154943a("error_detail", str2);
                b.mo66491a(C89041ag.m154421a(pVarArr)).mo66495a((Context) null);
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "show_fail", this.f91431a.getAwemeRawAd()).mo28897a("error_message", "vast_mediafile_bad_response");
                Throwable cause2 = aVar.getCause();
                if (cause2 != null) {
                    str3 = cause2.getMessage();
                }
                a.mo28897a("error_detail", str3).mo28902c();
                return;
            }
            C38182f.C38184b b2 = C38182f.m77418a().mo66497b(this.f91431a);
            b2.f90211a = "draw_ad";
            b2.f90212b = "show_fail";
            C89378p[] pVarArr2 = new C89378p[2];
            pVarArr2[0] = C89387v.m154943a("error_message", "vast_filtered_others");
            Throwable cause3 = aVar.getCause();
            if (cause3 != null) {
                str = cause3.getMessage();
            } else {
                str = null;
            }
            pVarArr2[1] = C89387v.m154943a("error_detail", str);
            b2.mo66491a(C89041ag.m154421a(pVarArr2)).mo66495a((Context) null);
            C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "show_fail", this.f91431a.getAwemeRawAd()).mo28897a("error_message", "vast_filtered_others");
            Throwable cause4 = aVar.getCause();
            if (cause4 != null) {
                str3 = cause4.getMessage();
            }
            a2.mo28897a("error_detail", str3).mo28902c();
        }

        @Override // com.bytedance.p1777x.AbstractC23689c
        /* renamed from: a */
        public final void mo39115a(C23680b bVar) {
            String str;
            C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91431a);
            b.f90211a = "draw_ad";
            b.f90212b = "show_fail";
            C89378p[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("error_message", "vast_xml_format_error");
            Throwable cause = bVar.getCause();
            String str2 = null;
            if (cause != null) {
                str = cause.getMessage();
            } else {
                str = null;
            }
            pVarArr[1] = C89387v.m154943a("error_detail", str);
            b.mo66491a(C89041ag.m154421a(pVarArr)).mo66495a((Context) null);
            C18129a.C18130a a = C18129a.m33746a("draw_ad", "show_fail", this.f91431a.getAwemeRawAd()).mo28897a("error_message", "vast_xml_format_error");
            Throwable cause2 = bVar.getCause();
            if (cause2 != null) {
                str2 = cause2.getMessage();
            }
            a.mo28897a("error_detail", str2).mo28902c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$h */
    public static final class RunnableC38714h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f91451a;

        /* renamed from: b */
        final /* synthetic */ Runnable f91452b = null;

        static {
            Covode.recordClassIndex(46255);
        }

        RunnableC38714h(Aweme aweme, Runnable runnable) {
            this.f91451a = aweme;
        }

        public final void run() {
            AwemeRawAd awemeRawAd;
            C38222ai omVast;
            Aweme aweme = this.f91451a;
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null)) {
                omVast.loading = false;
            }
            Runnable runnable = this.f91452b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static {
        Covode.recordClassIndex(46244);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$d */
    public static final class RunnableC38709d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f91437a;

        /* renamed from: b */
        final /* synthetic */ Aweme f91438b;

        /* renamed from: c */
        final /* synthetic */ long f91439c;

        /* renamed from: d */
        final /* synthetic */ C38222ai f91440d;

        /* renamed from: e */
        final /* synthetic */ int f91441e;

        static {
            Covode.recordClassIndex(46250);
        }

        public RunnableC38709d(Runnable runnable, Aweme aweme, long j, C38222ai aiVar, int i) {
            this.f91437a = runnable;
            this.f91438b = aweme;
            this.f91439c = j;
            this.f91440d = aiVar;
            this.f91441e = i;
        }

        public final void run() {
            try {
                C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91438b);
                b.f90211a = "draw_ad";
                b.f90212b = "parse_vast";
                b.mo66491a(C89041ag.m154412a(C89387v.m154943a("duration", Long.valueOf(System.currentTimeMillis() - this.f91439c)))).mo66495a((Context) null);
                C18129a.m33746a("draw_ad", "parse_vast", this.f91438b.getAwemeRawAd()).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - this.f91439c)).mo28902c();
                this.f91440d.loaded = true;
                this.f91440d.vast = new C23687f();
                String str = this.f91440d.vastUrl;
                if (str == null || str.length() == 0) {
                    String str2 = this.f91440d.vastContent;
                    if (str2 != null) {
                        if (str2.length() != 0) {
                            try {
                                this.f91440d.vast.parseContent(this.f91440d.vastContent, this.f91441e, C38704a.f91425a, new C38707b(this.f91438b));
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    this.f91440d.vast.parseUri(str, this.f91441e, C38704a.f91425a, new C38707b(this.f91438b));
                }
            } finally {
                Runnable runnable = this.f91437a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$e */
    public static final class RunnableC38710e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f91442a;

        /* renamed from: b */
        final /* synthetic */ Aweme f91443b;

        /* renamed from: c */
        final /* synthetic */ long f91444c;

        /* renamed from: d */
        final /* synthetic */ C23687f f91445d;

        /* renamed from: e */
        final /* synthetic */ C38222ai f91446e;

        /* renamed from: f */
        final /* synthetic */ int f91447f;

        static {
            Covode.recordClassIndex(46251);
        }

        public RunnableC38710e(Runnable runnable, Aweme aweme, long j, C23687f fVar, C38222ai aiVar, int i) {
            this.f91442a = runnable;
            this.f91443b = aweme;
            this.f91444c = j;
            this.f91445d = fVar;
            this.f91446e = aiVar;
            this.f91447f = i;
        }

        public final void run() {
            String str;
            T t;
            Set<String> set;
            Boolean bool;
            AbstractC89306h e;
            List<BitRate> g;
            UrlModel avatarThumb;
            List<String> urlList;
            String str2;
            try {
                C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91443b);
                b.f90211a = "draw_ad";
                b.f90212b = "parse_vast";
                C23684c cVar = null;
                b.mo66491a(C89041ag.m154412a(C89387v.m154943a("duration", Long.valueOf(System.currentTimeMillis() - this.f91444c)))).mo66495a((Context) null);
                C18129a.m33746a("draw_ad", "parse_vast", this.f91443b.getAwemeRawAd()).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - this.f91444c)).mo28902c();
                try {
                    this.f91445d.parseContent(this.f91446e.vastContent, this.f91447f, C38704a.f91425a, new C38707b(this.f91443b));
                    String str3 = this.f91445d.adTitle;
                    if (!(str3 == null || str3.length() == 0)) {
                        this.f91446e.vast = this.f91445d;
                        C23687f fVar = this.f91445d;
                        User author = this.f91443b.getAuthor();
                        if (author == null || (str = author.getNickname()) == null || C89361p.m154870a((CharSequence) str) || str == null) {
                            str = this.f91445d.adTitle;
                        }
                        fVar.adTitle = str;
                        Aweme aweme = this.f91443b;
                        String desc = aweme.getDesc();
                        if (desc == null || C89361p.m154870a((CharSequence) desc)) {
                            desc = null;
                        }
                        if (desc == null && (desc = this.f91446e.vast.description) == null) {
                            desc = "";
                        }
                        aweme.setDesc(desc);
                        AwemeRawAd awemeRawAd = this.f91443b.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            AwemeRawAd awemeRawAd2 = this.f91443b.getAwemeRawAd();
                            if (awemeRawAd2 == null || (str2 = awemeRawAd2.getWebUrl()) == null || C89361p.m154870a((CharSequence) str2) || str2 == null) {
                                C23688g g2 = C38703bs.m78539g(this.f91443b);
                                if (g2 != null) {
                                    str2 = g2.clickThrough;
                                } else {
                                    str2 = null;
                                }
                            }
                            awemeRawAd.setWebUrl(str2);
                        }
                        List<C23683b> list = this.f91445d.creativeList;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                T t2 = t;
                                if (t2 != null && !t2.byWrapper) {
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                User author2 = this.f91443b.getAuthor();
                                if (author2 == null || (avatarThumb = author2.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) {
                                    set = null;
                                } else {
                                    set = C89309k.m154812f(C89309k.m154804b(C89070n.m154598r(urlList), C38712f.f91449a));
                                }
                                try {
                                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                                    C89219l.m154716b(iESSettingsProxy, "");
                                    bool = iESSettingsProxy.getDisallowVastHasAuthor();
                                } catch (Throwable unused) {
                                    bool = false;
                                }
                                C89219l.m154716b(bool, "");
                                if (bool.booleanValue()) {
                                    this.f91443b.setAuthor(null);
                                }
                                C23684c a = C38701br.m78510a(this.f91443b, "icon");
                                if (a != null) {
                                    if (set == null || set.isEmpty() || set == null) {
                                        set = a.staticResource;
                                    }
                                    a.staticResource = set;
                                }
                                Aweme aweme2 = this.f91443b;
                                C38218af afVar = this.f91446e.adChoiceIcon;
                                if (afVar != null) {
                                    cVar = afVar.toIcon("AdChoices");
                                }
                                C38703bs.m78518a(t3, aweme2, cVar);
                                double durationInMs = (double) t3.getDurationInMs();
                                List<C23685d> list2 = t3.mediaFileList;
                                if (!(list2 == null || (e = C89309k.m154809e(C89309k.m154810e(C89070n.m154598r(list2), new C38711a(durationInMs)))) == null || (g = C89309k.m154813g(e)) == null || g.isEmpty())) {
                                    if (this.f91443b.getVideo() == null) {
                                        this.f91443b.setVideo(new Video());
                                    }
                                    UrlModel playAddr = g.get(0).getPlayAddr();
                                    Video video = this.f91443b.getVideo();
                                    C89219l.m154716b(video, "");
                                    C89219l.m154716b(playAddr, "");
                                    video.setWidth(playAddr.getWidth());
                                    Video video2 = this.f91443b.getVideo();
                                    C89219l.m154716b(video2, "");
                                    video2.setHeight(playAddr.getHeight());
                                    Video video3 = this.f91443b.getVideo();
                                    C89219l.m154716b(video3, "");
                                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                                    videoUrlModel.setWidth(playAddr.getWidth());
                                    videoUrlModel.setHeight(playAddr.getHeight());
                                    videoUrlModel.setUri(playAddr.getUri());
                                    videoUrlModel.setUrlKey(playAddr.getUrlKey());
                                    videoUrlModel.setUrlList(playAddr.getUrlList());
                                    videoUrlModel.setDuration((double) t3.getDurationInMs());
                                    video3.setPlayAddr(videoUrlModel);
                                    IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                                    C89219l.m154716b(iESSettingsProxy2, "");
                                    if (!iESSettingsProxy2.getDisableVastBitrate().booleanValue()) {
                                        Video video4 = this.f91443b.getVideo();
                                        C89219l.m154716b(video4, "");
                                        video4.setBitRate(g);
                                    }
                                    this.f91443b.setTitle(this.f91446e.vast.adTitle);
                                    this.f91446e.loaded = true;
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            } finally {
                Runnable runnable = this.f91442a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$e$a */
        static final class C38711a extends AbstractC89220m implements AbstractC89172b<C23685d, BitRate> {

            /* renamed from: a */
            final /* synthetic */ double f91448a;

            static {
                Covode.recordClassIndex(46252);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38711a(double d) {
                super(1);
                this.f91448a = d;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ BitRate invoke(C23685d dVar) {
                return C38703bs.m78517a(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$g */
    public static final class C38713g extends AbstractC89220m implements AbstractC89172b<C23685d, BitRate> {

        /* renamed from: a */
        final /* synthetic */ double f91450a;

        static {
            Covode.recordClassIndex(46254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38713g(double d) {
            super(1);
            this.f91450a = d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ BitRate invoke(C23685d dVar) {
            return C38703bs.m78517a(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$p */
    public static final class C38722p implements RawURLGetter.AbstractC38144a {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f91462a;

        static {
            Covode.recordClassIndex(46263);
        }

        public C38722p(AwemeRawAd awemeRawAd) {
            this.f91462a = awemeRawAd;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter.AbstractC38144a
        /* renamed from: a */
        public final void mo66440a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C38182f.C38184b b = C38182f.m77418a().mo66498b(this.f91462a);
                b.f90211a = "draw_ad";
                b.f90212b = "load_failed";
                C89378p[] pVarArr = new C89378p[3];
                pVarArr[0] = C89387v.m154943a("error_message", "vast_clickthru_bad_response");
                pVarArr[1] = C89387v.m154943a("error_code", Integer.valueOf(i));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = C89387v.m154943a("error_detail", str);
                b.mo66491a(C89041ag.m154421a(pVarArr)).mo66495a((Context) null);
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "load_failed", this.f91462a).mo28897a("error_message", "vast_clickthru_bad_response").mo28897a("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a.mo28897a("error_detail", str2).mo28902c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$t */
    public static final class C38726t extends AbstractC89220m implements AbstractC89172b<C23686e, String> {

        /* renamed from: a */
        public static final C38726t f91465a = new C38726t();

        static {
            Covode.recordClassIndex(46267);
        }

        C38726t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ String invoke(C23686e eVar) {
            return eVar.url;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$c */
    public static final class C38708c extends AbstractC89220m implements AbstractC89172b<C23683b, AbstractC89306h<? extends C23688g>> {
        static {
            Covode.recordClassIndex(46249);
        }

        public C38708c() {
            super(1);
        }

        public final AbstractC89306h<C23688g> invoke(C23683b bVar) {
            List<C23688g> list;
            AbstractC89306h<C23688g> r;
            if (bVar == null || (list = bVar.clickList) == null || (r = C89070n.m154598r(list)) == null) {
                return C89297c.f202938a;
            }
            return r;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$j */
    static final class C38716j extends AbstractC89220m implements AbstractC89172b<C23688g, String> {

        /* renamed from: a */
        public static final C38716j f91454a = new C38716j();

        static {
            Covode.recordClassIndex(46257);
        }

        C38716j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ String invoke(C23688g gVar) {
            C23688g gVar2 = gVar;
            if (gVar2 != null) {
                return gVar2.clickThrough;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$r */
    public static final class C38724r extends AbstractC89220m implements AbstractC89172b<C23683b, AbstractC89306h<? extends C23686e>> {
        static {
            Covode.recordClassIndex(46265);
        }

        public C38724r() {
            super(1);
        }

        public final AbstractC89306h<C23686e> invoke(C23683b bVar) {
            List<C23686e> list;
            AbstractC89306h<C23686e> r;
            if (bVar == null || (list = bVar.trackingEventList) == null || (r = C89070n.m154598r(list)) == null) {
                return C89297c.f202938a;
            }
            return r;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$u */
    public static final class C38727u extends AbstractC89220m implements AbstractC89172b<C23688g, AbstractC89306h<? extends String>> {

        /* renamed from: a */
        public static final C38727u f91466a = new C38727u();

        static {
            Covode.recordClassIndex(46268);
        }

        C38727u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89306h<? extends String> invoke(C23688g gVar) {
            Set<String> set = gVar.clickTracking;
            if (set != null) {
                return C89070n.m154598r(set);
            }
            return C89297c.f202938a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$z */
    public static final class C38732z extends AbstractC89220m implements AbstractC89172b<C23683b, AbstractC89306h<? extends C23686e>> {
        static {
            Covode.recordClassIndex(46273);
        }

        public C38732z() {
            super(1);
        }

        public final AbstractC89306h<C23686e> invoke(C23683b bVar) {
            List<C23686e> list;
            AbstractC89306h<C23686e> r;
            if (bVar == null || (list = bVar.trackingEventList) == null || (r = C89070n.m154598r(list)) == null) {
                return C89297c.f202938a;
            }
            return r;
        }
    }

    /* renamed from: g */
    public static C23688g m78539g(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        return m78537e(awemeRawAd);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$f */
    public static final class C38712f extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38712f f91449a = new C38712f();

        static {
            Covode.recordClassIndex(46253);
        }

        C38712f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$i */
    static final class C38715i extends AbstractC89220m implements AbstractC89172b<C23683b, AbstractC89306h<? extends C23688g>> {

        /* renamed from: a */
        public static final C38715i f91453a = new C38715i();

        static {
            Covode.recordClassIndex(46256);
        }

        C38715i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89306h<? extends C23688g> invoke(C23683b bVar) {
            C23683b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            List<C23688g> list = bVar2.clickList;
            if (list != null) {
                return C89070n.m154598r(list);
            }
            return C89297c.f202938a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$k */
    static final class C38717k extends AbstractC89220m implements AbstractC89172b<C23688g, AbstractC89306h<? extends String>> {

        /* renamed from: a */
        public static final C38717k f91455a = new C38717k();

        static {
            Covode.recordClassIndex(46258);
        }

        C38717k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89306h<? extends String> invoke(C23688g gVar) {
            C23688g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            Set<String> set = gVar2.clickTracking;
            if (set != null) {
                return C89070n.m154598r(set);
            }
            return C89297c.f202938a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$l */
    static final class C38718l extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38718l f91456a = new C38718l();

        static {
            Covode.recordClassIndex(46259);
        }

        C38718l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$m */
    static final class C38719m extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38719m f91457a = new C38719m();

        static {
            Covode.recordClassIndex(46260);
        }

        C38719m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$n */
    public static final class C38720n extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        public static final C38720n f91458a = new C38720n();

        static {
            Covode.recordClassIndex(46261);
        }

        C38720n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return C89361p.m154869a(str2, "[ERRORCODE]", "0", false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$q */
    public static final class C38723q extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38723q f91463a = new C38723q();

        static {
            Covode.recordClassIndex(46264);
        }

        C38723q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$s */
    public static final class C38725s extends AbstractC89220m implements AbstractC89172b<C23686e, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f91464a;

        static {
            Covode.recordClassIndex(46266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38725s(String str) {
            super(1);
            this.f91464a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C23686e eVar) {
            String str;
            C23686e eVar2 = eVar;
            if (eVar2 != null) {
                str = eVar2.name;
            } else {
                str = null;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) str, (Object) this.f91464a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$v */
    public static final class C38728v extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38728v f91467a = new C38728v();

        static {
            Covode.recordClassIndex(46269);
        }

        C38728v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$w */
    public static final class C38729w extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38729w f91468a = new C38729w();

        static {
            Covode.recordClassIndex(46270);
        }

        C38729w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$y */
    public static final class C38731y extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38731y f91472a = new C38731y();

        static {
            Covode.recordClassIndex(46272);
        }

        C38731y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: a */
    public static final void m78519a(C23684c cVar) {
        List<C23688g> list;
        if (cVar != null && (list = cVar.clickList) != null) {
            m78524a(C89309k.m154804b(C89309k.m154807d(C89070n.m154598r(list), C38727u.f91466a), C38728v.f91467a), (AbstractC38162ah) null);
        }
    }

    /* renamed from: b */
    public static final boolean m78530b(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !m78531b(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m78532c(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !m78533c(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final C23682a m78536e(Aweme aweme) {
        AwemeRawAd awemeRawAd = null;
        if (aweme != null) {
            if (!aweme.isAd()) {
                return null;
            }
            awemeRawAd = aweme.getAwemeRawAd();
        }
        return m78534d(awemeRawAd);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$aa */
    public static final class C38705aa extends AbstractC89220m implements AbstractC89172b<C23686e, Boolean> {

        /* renamed from: a */
        final /* synthetic */ long f91426a;

        /* renamed from: b */
        final /* synthetic */ long f91427b;

        /* renamed from: c */
        final /* synthetic */ long f91428c;

        static {
            Covode.recordClassIndex(46246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38705aa(long j, long j2, long j3) {
            super(1);
            this.f91426a = j;
            this.f91427b = j2;
            this.f91428c = j3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C23686e eVar) {
            C23686e eVar2 = eVar;
            String str = eVar2.offset;
            boolean z = false;
            if (!(str == null || str.length() == 0 || (!C89219l.m154714a((Object) eVar2.name, (Object) "progress")))) {
                long j = this.f91426a;
                String str2 = eVar2.offset;
                C89219l.m154716b(str2, "");
                long a = C38703bs.m78516a(j, str2);
                long j2 = this.f91427b;
                if (this.f91428c + 1 <= a && j2 >= a) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public static final boolean m78531b(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getOmVast() == null) {
            return false;
        }
        if (m78534d(awemeRawAd) == null || m78529a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m78533c(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getOmVast() == null || m78534d(awemeRawAd) == null || m78529a()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static C23688g m78537e(AwemeRawAd awemeRawAd) {
        AbstractC89306h hVar;
        C38222ai omVast;
        C23687f fVar;
        List<C23683b> list;
        if (awemeRawAd == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
            hVar = C89297c.f202938a;
        } else {
            hVar = C89309k.m154807d(C89070n.m154598r(list), new C38708c());
        }
        return (C23688g) C89309k.m154808d(hVar);
    }

    /* renamed from: f */
    public static final String m78538f(Aweme aweme) {
        C23688g g;
        if (!(aweme == null || (g = m78539g(aweme)) == null)) {
            String str = g.clickThrough;
            if (str != null && str.length() != 0) {
                return g.clickThrough;
            }
            Set<String> set = g.clickTracking;
            if (set != null && !set.isEmpty()) {
                Set<String> set2 = g.clickTracking;
                C89219l.m154716b(set2, "");
                return (String) C89309k.m154808d(C89309k.m154809e(C89070n.m154598r(set2)));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static C23682a m78534d(AwemeRawAd awemeRawAd) {
        List<C23682a> list;
        C23687f fVar;
        List<C23682a> list2;
        C23682a aVar;
        C23687f fVar2;
        List<C23682a> list3;
        if (awemeRawAd == null) {
            return null;
        }
        C38222ai omVast = awemeRawAd.getOmVast();
        if (omVast == null || omVast.providerType != 3) {
            C38222ai omVast2 = awemeRawAd.getOmVast();
            if (omVast2 != null && (fVar = omVast2.vast) != null && (list2 = fVar.adVerificationList) != null && (aVar = (C23682a) C89070n.m154583g((List) list2)) != null) {
                return aVar;
            }
            C38222ai omVast3 = awemeRawAd.getOmVast();
            if (omVast3 == null || (list = omVast3.adVerificationList) == null) {
                return null;
            }
            return (C23682a) C89070n.m154583g((List) list);
        }
        C38222ai omVast4 = awemeRawAd.getOmVast();
        if (omVast4 == null || (fVar2 = omVast4.vast) == null || (list3 = fVar2.adVerificationList) == null) {
            return null;
        }
        return (C23682a) C89070n.m154583g((List) list3);
    }

    /* renamed from: a */
    public static BitRate m78517a(C23685d dVar) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        if (dVar == null || (!C89219l.m154714a((Object) dVar.type, (Object) "video/mp4")) || dVar.width <= 0 || dVar.height <= 0 || (str = dVar.url) == null || str.length() == 0) {
            return null;
        }
        BitRate bitRate = new BitRate();
        bitRate.setBytevc1(0);
        int i4 = dVar.width;
        if (i4 >= 0) {
            if (540 > i4) {
                bitRate.setGearName("noraml_480");
                bitRate.setQualityType(301);
                if (dVar.bitRate > 0) {
                    i2 = dVar.bitRate * 1024;
                } else {
                    i2 = 600000;
                }
                bitRate.setBitRate(i2);
                str2 = "480p";
            } else if (540 <= i4 && 720 > i4) {
                bitRate.setGearName("normal_540");
                bitRate.setQualityType(201);
                if (dVar.bitRate > 0) {
                    i = dVar.bitRate * 1024;
                } else {
                    i = 1350000;
                }
                bitRate.setBitRate(i);
                str2 = "540p";
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setWidth(dVar.width);
            urlModel.setHeight(dVar.height);
            String str3 = dVar.url;
            C89219l.m154716b(str3, "");
            Charset charset = C89338d.f202990a;
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str3.getBytes(charset);
            C89219l.m154716b(bytes, "");
            urlModel.setUri(Base64.encodeToString(bytes, 2));
            urlModel.setUrlKey(urlModel.getUri() + "_h264_" + str2 + '_' + bitRate.getBitRate());
            urlModel.setUrlList(C89070n.m154524c(dVar.url));
            bitRate.setPlayAddr(urlModel);
            return bitRate;
        }
        bitRate.setGearName("normal_720");
        bitRate.setQualityType(101);
        if (dVar.bitRate > 0) {
            i3 = dVar.bitRate * 1024;
        } else {
            i3 = 2000000;
        }
        bitRate.setBitRate(i3);
        str2 = "720p";
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setWidth(dVar.width);
        urlModel2.setHeight(dVar.height);
        String str32 = dVar.url;
        C89219l.m154716b(str32, "");
        Charset charset2 = C89338d.f202990a;
        Objects.requireNonNull(str32, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = str32.getBytes(charset2);
        C89219l.m154716b(bytes2, "");
        urlModel2.setUri(Base64.encodeToString(bytes2, 2));
        urlModel2.setUrlKey(urlModel2.getUri() + "_h264_" + str2 + '_' + bitRate.getBitRate());
        urlModel2.setUrlList(C89070n.m154524c(dVar.url));
        bitRate.setPlayAddr(urlModel2);
        return bitRate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r9 != null) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m78535d(com.p2082ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs.m78535d(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public static final void m78520a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        C23687f fVar;
        Set<String> set;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (fVar = omVast.vast) != null && (set = fVar.impressionSet) != null) {
            Iterator a = C89309k.m154799a(C89070n.m154598r(set), (AbstractC89172b) C38731y.f91472a).mo2926a();
            while (a.hasNext()) {
                String str = (String) a.next();
                long currentTimeMillis = System.currentTimeMillis();
                C89219l.m154716b(str, "");
                RawURLGetter.m77318a(str, new C38730x(str, currentTimeMillis, aweme));
            }
        }
    }

    /* renamed from: a */
    public static final void m78523a(AwemeRawAd awemeRawAd) {
        C23688g e;
        boolean z;
        String str;
        if (awemeRawAd != null && (e = m78537e(awemeRawAd)) != null) {
            Set<String> set = e.clickTracking;
            if (set == null || set.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Set<String> set2 = e.clickTracking;
                C89219l.m154716b(set2, "");
                Iterator a = C89309k.m154799a(C89070n.m154598r(set2), (AbstractC89172b) C38723q.f91463a).mo2926a();
                while (a.hasNext()) {
                    String str2 = (String) a.next();
                    long currentTimeMillis = System.currentTimeMillis();
                    C89219l.m154716b(str2, "");
                    RawURLGetter.m77318a(str2, new C38721o(str2, currentTimeMillis, awemeRawAd));
                }
                return;
            }
            C38222ai omVast = awemeRawAd.getOmVast();
            if (omVast != null && omVast.providerType == 2 && (str = e.clickThrough) != null && str.length() != 0) {
                String str3 = e.clickThrough;
                C89219l.m154716b(str3, "");
                RawURLGetter.m77318a(str3, new C38722p(awemeRawAd));
            }
        }
    }

    /* renamed from: a */
    public static final void m78526a(String str, Aweme aweme) {
        m78527a(str, aweme, (String) null);
    }

    /* renamed from: a */
    public static long m78516a(long j, String str) {
        AbstractC89345j matchEntire = f91423b.matchEntire(str);
        if (matchEntire != null) {
            long j2 = j * 100;
            C89342g a = matchEntire.mo143721c().mo143718a(1);
            if (a == null) {
                C89219l.m154715b();
            }
            return j2 / ((long) Integer.parseInt(a.f203007a));
        }
        AbstractC89345j matchEntire2 = f91424c.matchEntire(str);
        if (matchEntire2 == null) {
            return -1;
        }
        TimeUnit timeUnit = TimeUnit.HOURS;
        C89342g a2 = matchEntire2.mo143721c().mo143718a(1);
        if (a2 == null) {
            C89219l.m154715b();
        }
        long millis = timeUnit.toMillis(Long.parseLong(a2.f203007a));
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        C89342g a3 = matchEntire2.mo143721c().mo143718a(2);
        if (a3 == null) {
            C89219l.m154715b();
        }
        long millis2 = millis + timeUnit2.toMillis(Long.parseLong(a3.f203007a));
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        C89342g a4 = matchEntire2.mo143721c().mo143718a(3);
        if (a4 == null) {
            C89219l.m154715b();
        }
        return millis2 + timeUnit3.toMillis(Long.parseLong(a4.f203007a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$ab */
    public static final class C38706ab implements AbstractC38162ah {

        /* renamed from: a */
        final /* synthetic */ String f91429a;

        /* renamed from: b */
        final /* synthetic */ Aweme f91430b;

        static {
            Covode.recordClassIndex(46247);
        }

        C38706ab(String str, Aweme aweme) {
            this.f91429a = str;
            this.f91430b = aweme;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38162ah
        /* renamed from: a */
        public final void mo66465a(String str, String str2, long j) {
            C38703bs.m78528a(str, str2, j, this.f91429a, this.f91430b, null, 32);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$o */
    public static final class C38721o implements RawURLGetter.AbstractC38144a {

        /* renamed from: a */
        final /* synthetic */ String f91459a;

        /* renamed from: b */
        final /* synthetic */ long f91460b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f91461c;

        static {
            Covode.recordClassIndex(46262);
        }

        public C38721o(String str, long j, AwemeRawAd awemeRawAd) {
            this.f91459a = str;
            this.f91460b = j;
            this.f91461c = awemeRawAd;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter.AbstractC38144a
        /* renamed from: a */
        public final void mo66440a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C38182f.C38184b b = C38182f.m77418a().mo66498b(this.f91461c);
                b.f90211a = "draw_ad";
                b.f90212b = "load_failed";
                C89378p[] pVarArr = new C89378p[3];
                pVarArr[0] = C89387v.m154943a("error_message", "vast_click_tracker_bad_response");
                pVarArr[1] = C89387v.m154943a("error_code", Integer.valueOf(i));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = C89387v.m154943a("error_detail", str);
                b.mo66491a(C89041ag.m154421a(pVarArr)).mo66495a((Context) null);
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "load_failed", this.f91461c).mo28897a("error_message", "vast_click_tracker_bad_response").mo28897a("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a.mo28897a("error_detail", str2).mo28902c();
            }
            C38703bs.m78528a(this.f91459a, String.valueOf(i), this.f91460b, "click", null, this.f91461c, 16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs$x */
    public static final class C38730x implements RawURLGetter.AbstractC38144a {

        /* renamed from: a */
        final /* synthetic */ String f91469a;

        /* renamed from: b */
        final /* synthetic */ long f91470b;

        /* renamed from: c */
        final /* synthetic */ Aweme f91471c;

        static {
            Covode.recordClassIndex(46271);
        }

        public C38730x(String str, long j, Aweme aweme) {
            this.f91469a = str;
            this.f91470b = j;
            this.f91471c = aweme;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter.AbstractC38144a
        /* renamed from: a */
        public final void mo66440a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C38182f.C38184b b = C38182f.m77418a().mo66497b(this.f91471c);
                b.f90211a = "draw_ad";
                b.f90212b = "load_failed";
                C89378p[] pVarArr = new C89378p[3];
                pVarArr[0] = C89387v.m154943a("error_message", "vast_imp_tracker_bad_response");
                pVarArr[1] = C89387v.m154943a("error_code", Integer.valueOf(i));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = C89387v.m154943a("error_detail", str);
                b.mo66491a(C89041ag.m154421a(pVarArr)).mo66495a((Context) null);
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "load_failed", this.f91471c.getAwemeRawAd()).mo28897a("error_message", "vast_imp_tracker_bad_response").mo28897a("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a.mo28897a("error_detail", str2).mo28902c();
            }
            C38703bs.m78528a(this.f91469a, String.valueOf(i), this.f91470b, "show", this.f91471c, null, 32);
        }
    }

    /* renamed from: a */
    public static final void m78525a(AbstractC89306h<String> hVar, String str, Aweme aweme) {
        C89219l.m154721d(hVar, "");
        m78524a(hVar, new C38706ab(str, aweme));
    }

    /* renamed from: a */
    public static final void m78522a(Aweme aweme, Executor executor, boolean z) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null)) {
            omVast.loading = true;
        }
        m78521a(aweme, executor, new RunnableC38714h(aweme, null), z);
    }

    /* renamed from: a */
    public static void m78518a(C23683b bVar, Aweme aweme, C23684c cVar) {
        if (cVar != null) {
            String str = cVar.program;
            C89219l.m154716b(str, "");
            C23684c a = C38701br.m78510a(aweme, str);
            if (a == null) {
                if (bVar.iconList == null) {
                    bVar.iconList = new LinkedList();
                }
                bVar.iconList.add(cVar);
                return;
            }
            Set<String> set = cVar.staticResource;
            if (set == null || set.isEmpty()) {
                set = a.staticResource;
            }
            a.staticResource = set;
            Set<String> set2 = cVar.viewTracking;
            if (set2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : set2) {
                    T t2 = t;
                    if (!(t2 == null || t2.length() == 0)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (a.viewTracking == null) {
                        a.viewTracking = new HashSet();
                    }
                    a.viewTracking.addAll(arrayList2);
                }
            }
            List<C23688g> list = cVar.clickList;
            if (!(list == null || list.isEmpty())) {
                if (a.clickList == null) {
                    a.clickList = new LinkedList();
                }
                List<C23688g> list2 = a.clickList;
                List<C23688g> list3 = cVar.clickList;
                C89219l.m154716b(list3, "");
                list2.addAll(0, list3);
            }
        }
    }

    /* renamed from: a */
    private static void m78521a(Aweme aweme, Executor executor, Runnable runnable, boolean z) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        int i;
        String str;
        String str2;
        T t;
        Set<String> set;
        Boolean bool;
        AbstractC89306h e;
        List<BitRate> g;
        UrlModel avatarThumb;
        List<String> urlList;
        String str3;
        String str4;
        String str5;
        C23684c cVar = null;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null) {
            runnable.run();
            return;
        }
        List<C23682a> list = omVast.adVerificationList;
        if ((list == null || list.isEmpty()) && (((str4 = omVast.vastContent) == null || str4.length() == 0) && ((str5 = omVast.vastUrl) == null || str5.length() == 0))) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                awemeRawAd2.setOmVast(null);
            }
            runnable.run();
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = omVast.vastWrapperCount;
        }
        long currentTimeMillis = System.currentTimeMillis();
        omVast.loaded = false;
        if (omVast.providerType == 2) {
            if (executor == null) {
                try {
                    C38182f.C38184b b = C38182f.m77418a().mo66497b(aweme);
                    b.f90211a = "draw_ad";
                    b.f90212b = "parse_vast";
                    b.mo66491a(C89041ag.m154412a(C89387v.m154943a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)))).mo66495a((Context) null);
                    C18129a.m33746a("draw_ad", "parse_vast", aweme.getAwemeRawAd()).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).mo28902c();
                    omVast.loaded = true;
                    omVast.vast = new C23687f();
                    String str6 = omVast.vastUrl;
                    if (str6 == null || str6.length() == 0) {
                        String str7 = omVast.vastContent;
                        if (str7 != null) {
                            if (str7.length() != 0) {
                                try {
                                    omVast.vast.parseContent(omVast.vastContent, i, C38704a.f91425a, new C38707b(aweme));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } else {
                        omVast.vast.parseUri(str6, i, C38704a.f91425a, new C38707b(aweme));
                    }
                } finally {
                    runnable.run();
                }
            } else {
                executor.execute(new RunnableC38709d(runnable, aweme, currentTimeMillis, omVast, i));
            }
        } else if (omVast.providerType != 3 || (str = omVast.vastContent) == null || str.length() == 0) {
            runnable.run();
        } else {
            C23687f fVar = new C23687f();
            if (executor == null) {
                try {
                    C38182f.C38184b b2 = C38182f.m77418a().mo66497b(aweme);
                    b2.f90211a = "draw_ad";
                    b2.f90212b = "parse_vast";
                    b2.mo66491a(C89041ag.m154412a(C89387v.m154943a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)))).mo66495a((Context) null);
                    C18129a.m33746a("draw_ad", "parse_vast", aweme.getAwemeRawAd()).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).mo28902c();
                    try {
                        fVar.parseContent(omVast.vastContent, i, C38704a.f91425a, new C38707b(aweme));
                        String str8 = fVar.adTitle;
                        if (!(str8 == null || str8.length() == 0)) {
                            omVast.vast = fVar;
                            User author = aweme.getAuthor();
                            if (author == null || (str2 = author.getNickname()) == null || C89361p.m154870a((CharSequence) str2) || str2 == null) {
                                str2 = fVar.adTitle;
                            }
                            fVar.adTitle = str2;
                            String desc = aweme.getDesc();
                            if (desc == null || C89361p.m154870a((CharSequence) desc)) {
                                desc = null;
                            }
                            if (desc == null && (desc = omVast.vast.description) == null) {
                                desc = "";
                            }
                            aweme.setDesc(desc);
                            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                            if (awemeRawAd3 != null) {
                                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                                if (awemeRawAd4 == null || (str3 = awemeRawAd4.getWebUrl()) == null || C89361p.m154870a((CharSequence) str3) || str3 == null) {
                                    C23688g g2 = m78539g(aweme);
                                    if (g2 != null) {
                                        str3 = g2.clickThrough;
                                    } else {
                                        str3 = null;
                                    }
                                }
                                awemeRawAd3.setWebUrl(str3);
                            }
                            List<C23683b> list2 = fVar.creativeList;
                            if (list2 != null) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it.next();
                                    T t2 = t;
                                    if (t2 != null && !t2.byWrapper) {
                                        break;
                                    }
                                }
                                T t3 = t;
                                if (t3 != null) {
                                    User author2 = aweme.getAuthor();
                                    if (author2 == null || (avatarThumb = author2.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) {
                                        set = null;
                                    } else {
                                        set = C89309k.m154812f(C89309k.m154804b(C89070n.m154598r(urlList), C38712f.f91449a));
                                    }
                                    try {
                                        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                                        C89219l.m154716b(iESSettingsProxy, "");
                                        bool = iESSettingsProxy.getDisallowVastHasAuthor();
                                    } catch (Throwable unused2) {
                                        bool = false;
                                    }
                                    C89219l.m154716b(bool, "");
                                    if (bool.booleanValue()) {
                                        aweme.setAuthor(null);
                                    }
                                    C23684c a = C38701br.m78510a(aweme, "icon");
                                    if (a != null) {
                                        if (set == null || set.isEmpty() || set == null) {
                                            set = a.staticResource;
                                        }
                                        a.staticResource = set;
                                    }
                                    C38218af afVar = omVast.adChoiceIcon;
                                    if (afVar != null) {
                                        cVar = afVar.toIcon("AdChoices");
                                    }
                                    m78518a(t3, aweme, cVar);
                                    double durationInMs = (double) t3.getDurationInMs();
                                    List<C23685d> list3 = t3.mediaFileList;
                                    if (!(list3 == null || (e = C89309k.m154809e(C89309k.m154810e(C89070n.m154598r(list3), new C38713g(durationInMs)))) == null || (g = C89309k.m154813g(e)) == null || g.isEmpty())) {
                                        if (aweme.getVideo() == null) {
                                            aweme.setVideo(new Video());
                                        }
                                        UrlModel playAddr = g.get(0).getPlayAddr();
                                        Video video = aweme.getVideo();
                                        C89219l.m154716b(video, "");
                                        C89219l.m154716b(playAddr, "");
                                        video.setWidth(playAddr.getWidth());
                                        Video video2 = aweme.getVideo();
                                        C89219l.m154716b(video2, "");
                                        video2.setHeight(playAddr.getHeight());
                                        Video video3 = aweme.getVideo();
                                        C89219l.m154716b(video3, "");
                                        VideoUrlModel videoUrlModel = new VideoUrlModel();
                                        videoUrlModel.setWidth(playAddr.getWidth());
                                        videoUrlModel.setHeight(playAddr.getHeight());
                                        videoUrlModel.setUri(playAddr.getUri());
                                        videoUrlModel.setUrlKey(playAddr.getUrlKey());
                                        videoUrlModel.setUrlList(playAddr.getUrlList());
                                        videoUrlModel.setDuration((double) t3.getDurationInMs());
                                        video3.setPlayAddr(videoUrlModel);
                                        IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                                        C89219l.m154716b(iESSettingsProxy2, "");
                                        if (!iESSettingsProxy2.getDisableVastBitrate().booleanValue()) {
                                            Video video4 = aweme.getVideo();
                                            C89219l.m154716b(video4, "");
                                            video4.setBitRate(g);
                                        }
                                        aweme.setTitle(omVast.vast.adTitle);
                                        omVast.loaded = true;
                                    }
                                }
                            }
                        }
                    } catch (Exception unused3) {
                    }
                } finally {
                    runnable.run();
                }
            } else {
                executor.execute(new RunnableC38710e(runnable, aweme, currentTimeMillis, fVar, omVast, i));
            }
        }
    }
}
