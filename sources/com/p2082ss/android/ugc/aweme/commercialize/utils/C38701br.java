package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.p1777x.p1779b.C23683b;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.p1777x.p1779b.C23687f;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38222ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89297c;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.br */
public final class C38701br {

    /* renamed from: a */
    public static final C38701br f91421a = new C38701br();

    private C38701br() {
    }

    static {
        Covode.recordClassIndex(46242);
    }

    /* renamed from: b */
    public static final C23684c m78515b(Aweme aweme) {
        return m78510a(aweme, "icon");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.br$a */
    public static final class C38702a extends AbstractC89220m implements AbstractC89172b<C23683b, AbstractC89306h<? extends C23684c>> {
        static {
            Covode.recordClassIndex(46243);
        }

        public C38702a() {
            super(1);
        }

        public final AbstractC89306h<C23684c> invoke(C23683b bVar) {
            List<C23684c> list;
            AbstractC89306h<C23684c> r;
            if (bVar == null || (list = bVar.iconList) == null || (r = C89070n.m154598r(list)) == null) {
                return C89297c.f202938a;
            }
            return r;
        }
    }

    /* renamed from: a */
    public static final boolean m78511a(Aweme aweme) {
        if (!m78514a(aweme, false) || !m78512a(aweme, 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m78512a(Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.providerType != i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final C23684c m78510a(Aweme aweme, String str) {
        AbstractC89306h hVar;
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        C23687f fVar;
        List<C23683b> list;
        C89219l.m154721d(str, "");
        Object obj = null;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
            hVar = C89297c.f202938a;
        } else {
            hVar = C89309k.m154807d(C89070n.m154598r(list), new C38702a());
        }
        Iterator a = hVar.mo2926a();
        while (true) {
            if (!a.hasNext()) {
                break;
            }
            Object next = a.next();
            if (C89219l.m154714a((Object) ((C23684c) next).program, (Object) str)) {
                obj = next;
                break;
            }
        }
        return (C23684c) obj;
    }

    /* renamed from: a */
    public static final boolean m78513a(Aweme aweme, SmartImageView smartImageView) {
        C23684c a;
        Set<String> set;
        T t;
        if (!(!m78512a(aweme, 3) || (a = m78510a(aweme, "icon")) == null || (set = a.staticResource) == null)) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (t2.length() > 0) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                C20766v a2 = C20761r.m39061a((String) t3);
                a2.f49092E = smartImageView;
                a2.mo34186c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m78514a(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.loaded != z) {
            return false;
        }
        return true;
    }
}
