package com.p2082ss.android.ugc.aweme.commercialize.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.p1777x.p1779b.C23683b;
import com.bytedance.p1777x.p1779b.C23687f;
import com.bytedance.p1777x.p1779b.C23688g;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38222ai;
import com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89297c;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.h */
public final class C38594h {

    /* renamed from: a */
    public static final C38594h f91191a = new C38594h();

    private C38594h() {
    }

    static {
        Covode.recordClassIndex(46126);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.h$c */
    public static final class C38597c implements RawURLGetter.AbstractC38519a {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f91195a;

        static {
            Covode.recordClassIndex(46129);
        }

        public C38597c(AwemeRawAd awemeRawAd) {
            this.f91195a = awemeRawAd;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.AbstractC38519a
        /* renamed from: a */
        public final void mo67055a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C38151a.C38153b b = C38151a.m77332a().mo66451b(this.f91195a);
                b.f90122a = "draw_ad";
                b.f90123b = "load_failed";
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
                b.mo66447a(C89041ag.m154421a(pVarArr)).mo66455c();
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "load_failed", this.f91195a).mo28900b("ad_event_type", "debug").mo28897a("error_message", "vast_clickthru_bad_response").mo28897a("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a.mo28897a("error_detail", str2).mo28902c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.h$a */
    public static final class C38595a extends AbstractC89220m implements AbstractC89172b<C23683b, AbstractC89306h<? extends C23688g>> {
        static {
            Covode.recordClassIndex(46127);
        }

        public C38595a() {
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

    /* renamed from: c */
    private static C23688g m78313c(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        return m78311b(awemeRawAd);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.h$d */
    public static final class C38598d extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C38598d f91196a = new C38598d();

        static {
            Covode.recordClassIndex(46130);
        }

        C38598d() {
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
    public static final boolean m78310a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.providerType != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static C23688g m78311b(AwemeRawAd awemeRawAd) {
        AbstractC89306h hVar;
        C38222ai omVast;
        C23687f fVar;
        List<C23683b> list;
        if (awemeRawAd == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
            hVar = C89297c.f202938a;
        } else {
            hVar = C89309k.m154807d(C89070n.m154598r(list), new C38595a());
        }
        return (C23688g) C89309k.m154808d(hVar);
    }

    /* renamed from: a */
    public static final void m78309a(AwemeRawAd awemeRawAd) {
        C23688g b;
        boolean z;
        String str;
        if (awemeRawAd != null && (b = m78311b(awemeRawAd)) != null) {
            Set<String> set = b.clickTracking;
            if (set == null || set.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Set<String> set2 = b.clickTracking;
                C89219l.m154716b(set2, "");
                Iterator a = C89309k.m154799a(C89070n.m154598r(set2), (AbstractC89172b) C38598d.f91196a).mo2926a();
                while (a.hasNext()) {
                    String str2 = (String) a.next();
                    long currentTimeMillis = System.currentTimeMillis();
                    C89219l.m154716b(str2, "");
                    RawURLGetter.m78121a(str2, new C38596b(str2, currentTimeMillis, awemeRawAd));
                }
                return;
            }
            C38222ai omVast = awemeRawAd.getOmVast();
            if (omVast != null && omVast.providerType == 2 && (str = b.clickThrough) != null && str.length() != 0) {
                String str3 = b.clickThrough;
                C89219l.m154716b(str3, "");
                RawURLGetter.m78121a(str3, new C38597c(awemeRawAd));
            }
        }
    }

    /* renamed from: b */
    public static final String m78312b(Aweme aweme) {
        C23688g c;
        if (!(aweme == null || (c = m78313c(aweme)) == null)) {
            String str = c.clickThrough;
            if (str != null && str.length() != 0) {
                return c.clickThrough;
            }
            Set<String> set = c.clickTracking;
            if (set != null && !set.isEmpty()) {
                Set<String> set2 = c.clickTracking;
                C89219l.m154716b(set2, "");
                return (String) C89309k.m154808d(C89309k.m154809e(C89070n.m154598r(set2)));
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.h$b */
    public static final class C38596b implements RawURLGetter.AbstractC38519a {

        /* renamed from: a */
        final /* synthetic */ String f91192a;

        /* renamed from: b */
        final /* synthetic */ long f91193b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f91194c;

        static {
            Covode.recordClassIndex(46128);
        }

        public C38596b(String str, long j, AwemeRawAd awemeRawAd) {
            this.f91192a = str;
            this.f91193b = j;
            this.f91194c = awemeRawAd;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.AbstractC38519a
        /* renamed from: a */
        public final void mo67055a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C38151a.C38153b b = C38151a.m77332a().mo66451b(this.f91194c);
                b.f90122a = "draw_ad";
                b.f90123b = "load_failed";
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
                b.mo66447a(C89041ag.m154421a(pVarArr)).mo66455c();
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "load_failed", this.f91194c).mo28900b("ad_event_type", "debug").mo28897a("error_message", "vast_click_tracker_bad_response").mo28897a("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a.mo28897a("error_detail", str2).mo28902c();
            }
            String str3 = this.f91192a;
            String valueOf = String.valueOf(i);
            long j = this.f91193b;
            AwemeRawAd awemeRawAd = this.f91194c;
            C38151a.C38153b a2 = C38151a.m77333a(str3, valueOf, j);
            a2.f90127f = "track_url";
            a2.f90122a = "track_ad";
            a2.mo66453b("click").mo66451b(awemeRawAd).mo66456d();
        }
    }
}
