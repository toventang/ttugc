package com.p2082ss.android.ugc.aweme.multi;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27258s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.l */
public final class C60212l {

    /* renamed from: a */
    private static final Set<String> f137254a = C89047am.m154438a((Object[]) new String[]{"enter_from", "enter_from_info", "source_page_type"});

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.l$a */
    public static final class C60213a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C60213a f137255a = new C60213a();

        static {
            Covode.recordClassIndex(70742);
        }

        C60213a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C81079v.m140776O().mo123950y();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.l$b */
    public static final class C60214b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C60214b f137256a = new C60214b();

        static {
            Covode.recordClassIndex(70743);
        }

        C60214b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C81079v.m140776O().mo123908B();
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(70741);
    }

    /* renamed from: a */
    private static final boolean m109768a(String str) {
        return f137254a.contains(str);
    }

    /* renamed from: a */
    public static final String m109763a(Aweme aweme, boolean z) {
        AnchorCustomData anchorCustomData;
        Map<String, String> trackingData;
        String str;
        C89219l.m154721d(aweme, "");
        if (z || (anchorCustomData = aweme.getAnchorCustomData()) == null || (trackingData = anchorCustomData.getTrackingData()) == null || (str = trackingData.get("entrance_form")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static final Map<String, String> m109766a(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        AnchorCustomData anchorCustomData = aweme.getAnchorCustomData();
        LinkedHashMap linkedHashMap = null;
        Map<String, String> trackingData = anchorCustomData != null ? anchorCustomData.getTrackingData() : null;
        Map<String, String> a = C80632w.m139800a(aweme, str, str2);
        if (!(!a.isEmpty())) {
            a = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Map<String, String> a2 = C67690d.C67691a.m119847a(str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            String key = entry.getKey();
            if (C89219l.m154714a((Object) key, (Object) "search_id") || C89219l.m154714a((Object) key, (Object) "search_result_id")) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap = linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (trackingData != null) {
            linkedHashMap3.putAll(trackingData);
        }
        if (a != null) {
            linkedHashMap3.putAll(a);
        }
        if (linkedHashMap != null) {
            linkedHashMap3.putAll(linkedHashMap);
        }
        linkedHashMap3.remove("enter_from_info");
        linkedHashMap3.remove("source_page_type");
        return linkedHashMap3;
    }

    /* renamed from: b */
    private static String m109769b(C60211k kVar, Aweme aweme, String str, String str2, boolean z) {
        C89219l.m154721d(kVar, "");
        Integer num = kVar.f137247b.f137265i;
        if (num == null || num.intValue() != 100) {
            return kVar.f137247b.f137266j;
        }
        try {
            return Uri.parse(kVar.f137247b.f137266j).buildUpon().appendQueryParameter("trackParams", m109765a(kVar, Uri.parse(kVar.f137247b.f137266j).getQueryParameter("trackParams"), aweme, str, str2, z)).build().toString();
        } catch (Exception unused) {
            return kVar.f137247b.f137266j;
        }
    }

    /* renamed from: a */
    public static final String m109764a(C60211k kVar, Aweme aweme, String str, String str2, boolean z) {
        boolean z2;
        Integer num;
        C89219l.m154721d(kVar, "");
        Integer num2 = kVar.f137247b.f137265i;
        if ((num2 == null || num2.intValue() != 5) && ((num = kVar.f137247b.f137265i) == null || num.intValue() != 6)) {
            return kVar.f137247b.f137266j;
        }
        try {
            Uri parse = Uri.parse(kVar.f137247b.f137266j);
            Uri.Builder builder = new Uri.Builder();
            C89219l.m154716b(parse, "");
            builder.scheme(parse.getScheme());
            builder.authority(parse.getHost());
            builder.path(parse.getPath());
            for (String str3 : parse.getQueryParameterNames()) {
                if (C89219l.m154714a((Object) str3, (Object) "requestParams")) {
                    JSONObject jSONObject = new JSONObject(parse.getQueryParameter(str3));
                    if (aweme != null) {
                        z2 = aweme.isAd();
                    } else {
                        z2 = false;
                    }
                    jSONObject.put("is_ad", z2);
                    builder.appendQueryParameter(str3, jSONObject.toString());
                } else if (!C89219l.m154714a((Object) str3, (Object) "trackParams")) {
                    if (C89219l.m154714a((Object) str3, (Object) "fullScreen")) {
                        builder.appendQueryParameter(str3, "false");
                    } else {
                        builder.appendQueryParameter(str3, parse.getQueryParameter(str3));
                    }
                }
            }
            builder.appendQueryParameter("trackParams", m109765a(kVar, parse.getQueryParameter("trackParams"), aweme, str, str2, z));
            if (!parse.getQueryParameterNames().contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", "false");
            }
            return builder.build().toString();
        } catch (Exception e) {
            C39162r.m79460a("rd_tiktokec_shop_anchor_exception", new C33744d().mo59983a("e_stack_trace", C27258s.m54268b(e)).mo59983a("extra_data", "ShopWindowAnchorModel : ".concat(String.valueOf(kVar))).mo59983a("where", "ShopWindowAnchorModel").f79943a);
            return kVar.f137247b.f137266j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (r4 != null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0227  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m109765a(com.p2082ss.android.ugc.aweme.multi.C60211k r10, java.lang.String r11, com.p2082ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 753
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.C60212l.m109765a(com.ss.android.ugc.aweme.multi.k, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r9 == null) goto L_0x0045;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109767a(android.app.Activity r7, com.p2082ss.android.ugc.aweme.multi.C60211k r8, com.p2082ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.C60212l.m109767a(android.app.Activity, com.ss.android.ugc.aweme.multi.k, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):void");
    }
}
