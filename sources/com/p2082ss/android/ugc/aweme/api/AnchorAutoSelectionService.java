package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.api.AnchorAutoSelectionService */
public interface AnchorAutoSelectionService {

    /* renamed from: a */
    public static final C33529a f79632a = C33529a.f79633a;

    static {
        Covode.recordClassIndex(40394);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/anchor/auto/selection/")
    C1731i<C33531a> getAnchorAutoSelectionResponse(@AbstractC89736t(mo144292a = "open_platform_client_key") String str, @AbstractC89736t(mo144292a = "open_platform_extra") String str2, @AbstractC89736t(mo144292a = "anchor_source_type") String str3, @AbstractC89736t(mo144292a = "add_from") Integer num);

    /* renamed from: com.ss.android.ugc.aweme.api.AnchorAutoSelectionService$a */
    public static final class C33529a {

        /* renamed from: a */
        static final /* synthetic */ C33529a f79633a = new C33529a();

        /* renamed from: b */
        private static final String f79634b;

        /* renamed from: c */
        private static final AnchorAutoSelectionService f79635c;

        private C33529a() {
        }

        static {
            Covode.recordClassIndex(40395);
            String str = "https://" + C17867d.f42587k.f42569a;
            f79634b = str;
            f79635c = (AnchorAutoSelectionService) RetrofitFactory.m33635a().mo28817b(str).mo28832d().mo28858a(AnchorAutoSelectionService.class);
        }

        /* renamed from: a */
        public static C1731i<C33531a> m68692a(String str, String str2, String str3, Integer num) {
            return f79635c.getAnchorAutoSelectionResponse(str, str2, str3, num);
        }
    }
}
