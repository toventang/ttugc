package com.p2082ss.android.ugc.aweme.commercialize.live.p2576b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.b.a */
public final class C38054a {

    /* renamed from: a */
    public static final C38055a f89919a = new C38055a();

    /* renamed from: b */
    public static final C38054a f89920b = new C38054a();

    /* renamed from: c */
    private static final AbstractC89244h f89921c = C89250i.m154773a((AbstractC89171a) C38057c.f89927a);

    /* renamed from: a */
    public static final C38055a m77134a() {
        return (C38055a) f89921c.getValue();
    }

    private C38054a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.b.a$a */
    public static final class C38055a {
        @AbstractC27891c(mo46611a = "live-link-list")

        /* renamed from: a */
        public final C38056b f89922a;
        @AbstractC27891c(mo46611a = "live-link-pin")

        /* renamed from: b */
        public final C38056b f89923b;
        @AbstractC27891c(mo46611a = "live-link-preview")

        /* renamed from: c */
        public final C38056b f89924c;

        static {
            Covode.recordClassIndex(45521);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38055a)) {
                return false;
            }
            C38055a aVar = (C38055a) obj;
            return C89219l.m154714a(this.f89922a, aVar.f89922a) && C89219l.m154714a(this.f89923b, aVar.f89923b) && C89219l.m154714a(this.f89924c, aVar.f89924c);
        }

        public final int hashCode() {
            C38056b bVar = this.f89922a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C38056b bVar2 = this.f89923b;
            int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
            C38056b bVar3 = this.f89924c;
            if (bVar3 != null) {
                i = bVar3.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "BASchemaConfigData(liveLinkList=" + this.f89922a + ", liveLinkPin=" + this.f89923b + ", liveLinkPreview=" + this.f89924c + ")";
        }

        public /* synthetic */ C38055a() {
            this(new C38056b(null, "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-list/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-list", 1), new C38056b(null, "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-pin/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-pin", 1), new C38056b(null, "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-preview/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-preview", 1));
        }

        private C38055a(C38056b bVar, C38056b bVar2, C38056b bVar3) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(bVar3, "");
            this.f89922a = bVar;
            this.f89923b = bVar2;
            this.f89924c = bVar3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.b.a$c */
    static final class C38057c extends AbstractC89220m implements AbstractC89171a<C38055a> {

        /* renamed from: a */
        public static final C38057c f89927a = new C38057c();

        static {
            Covode.recordClassIndex(45523);
        }

        C38057c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C38055a invoke() {
            Object a = SettingsManager.m29616a().mo25397a("ba_live_link_schema", C38055a.class, C38054a.f89919a);
            if (a == null) {
                a = C38054a.f89919a;
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(45520);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.b.a$b */
    public static final class C38056b {
        @AbstractC27891c(mo46611a = "fallback_url")

        /* renamed from: a */
        public final String f89925a;
        @AbstractC27891c(mo46611a = "schema")

        /* renamed from: b */
        public final String f89926b;

        static {
            Covode.recordClassIndex(45522);
        }

        public C38056b() {
            this(null, null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38056b)) {
                return false;
            }
            C38056b bVar = (C38056b) obj;
            return C89219l.m154714a(this.f89925a, bVar.f89925a) && C89219l.m154714a(this.f89926b, bVar.f89926b);
        }

        public final int hashCode() {
            String str = this.f89925a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f89926b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "LiveLinkData(fallback_url=" + this.f89925a + ", schema=" + this.f89926b + ")";
        }

        /* renamed from: a */
        public final String mo66342a() {
            Uri.Builder buildUpon = Uri.parse(this.f89926b).buildUpon();
            if (C80537hk.m139613a(this.f89925a)) {
                buildUpon.appendQueryParameter("fallback_url", this.f89925a);
            }
            String uri = buildUpon.build().toString();
            C89219l.m154716b(uri, "");
            return uri;
        }

        private C38056b(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f89925a = str;
            this.f89926b = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38056b(String str, String str2, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }
}
