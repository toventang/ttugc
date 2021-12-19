package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.aj */
public final class C38164aj {

    /* renamed from: a */
    public static final C38164aj f90141a = new C38164aj();

    private C38164aj() {
    }

    static {
        Covode.recordClassIndex(45643);
    }

    /* renamed from: a */
    private static boolean m77373a() {
        return C16048b.m29633a().mo25421a(true, "enable_tracker_sdk", false);
    }

    /* renamed from: a */
    private static Boolean m77368a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.aj$a */
    public static final class C38165a implements AbstractC38162ah {

        /* renamed from: a */
        final /* synthetic */ String f90142a;

        /* renamed from: b */
        final /* synthetic */ Long f90143b;

        /* renamed from: c */
        final /* synthetic */ String f90144c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f90145d;

        static {
            Covode.recordClassIndex(45644);
        }

        C38165a(String str, Long l, String str2, AbstractC89183m mVar) {
            this.f90142a = str;
            this.f90143b = l;
            this.f90144c = str2;
            this.f90145d = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38162ah
        /* renamed from: a */
        public final void mo66465a(String str, String str2, long j) {
            C38182f.C38184b a = C38182f.m77419a(str, str2, j);
            a.f90216f = "track_url";
            a.f90211a = "track_ad";
            C38182f.C38184b a2 = a.mo66505d(this.f90142a).mo66490a(this.f90143b);
            String str3 = this.f90144c;
            if (str3 == null) {
                str3 = "";
            }
            C38182f.C38184b e = a2.mo66506e(str3);
            AbstractC89183m mVar = this.f90145d;
            if (mVar != null) {
                C89219l.m154716b(e, "");
                mVar.invoke(e, true);
            }
            e.mo66502b();
        }
    }

    /* renamed from: a */
    public static void m77369a(String str, UrlModel urlModel, Long l, String str2, AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b> mVar) {
        List<String> list;
        C89219l.m154721d(str, "");
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        m77371a(str, list, l, str2, null, mVar);
    }

    /* renamed from: a */
    public static void m77370a(String str, List<String> list, Long l, String str2, AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b> mVar) {
        C89219l.m154721d(str, "");
        m77371a(str, list, l, str2, null, mVar);
    }

    /* renamed from: a */
    private static void m77372a(List<String> list, String str, Long l, String str2, AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b> mVar) {
        C38185g.m77450a((AbstractC38162ah) new C38165a(str, l, str2, mVar), (Collection<String>) list, true);
    }

    /* renamed from: a */
    public static void m77371a(String str, List<String> list, Long l, String str2, JSONObject jSONObject, AbstractC89183m<? super C38182f.C38184b, ? super Boolean, ? extends C38182f.C38184b> mVar) {
        long j;
        C89219l.m154721d(str, "");
        Boolean a = m77368a(list);
        if (a != null) {
            a.booleanValue();
            if (m77373a()) {
                C2626b.C2627a aVar = new C2626b.C2627a();
                aVar.f7898f = str;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                aVar.f7893a = j;
                C2626b.C2627a a2 = aVar.mo7145a(list);
                a2.f7896d = str2;
                a2.f7894b = true;
                a2.f7897e = jSONObject;
                a2.f7900h = true;
                C38168am.f90152b.mo66468a().mo7147a(a2.mo7146a());
                return;
            }
            if (list == null) {
                C89219l.m154715b();
            }
            m77372a(list, str, l, str2, mVar);
        }
    }
}
