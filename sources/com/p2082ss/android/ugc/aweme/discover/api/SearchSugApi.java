package com.p2082ss.android.ugc.aweme.discover.api;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi */
public final class SearchSugApi {

    /* renamed from: a */
    public static final SearchSugApi f97622a = new SearchSugApi();

    /* renamed from: b */
    private static final AbstractC89244h f97623b = C89250i.m154773a((AbstractC89171a) C41850b.f97633a);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi$Api */
    public interface Api {

        /* renamed from: a */
        public static final /* synthetic */ C41848a f97624a = C41848a.f97625a;

        static {
            Covode.recordClassIndex(49771);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/search/sug/")
        AbstractFutureC27655q<SearchSugResponse> fetchSug(@AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "source") String str2, @AbstractC89736t(mo144292a = "history_list") String str3, @AbstractC89736t(mo144292a = "from_group_id") String str4, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "sug_signal") String str5, @AbstractC89736t(mo144292a = "rich_sug_count") Integer num2);

        @AbstractC89722f(mo144276a = "/aweme/v1/search/user/sug/")
        AbstractC21983b<C67683h> fetchUserSug(@AbstractC89736t(mo144292a = "mention_type") long j, @AbstractC89736t(mo144292a = "aweme_id") Long l, @AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "source") String str2, @AbstractC89736t(mo144292a = "count") long j2, @AbstractC89736t(mo144292a = "uid_filter_list") String str3);

        @AbstractC89722f(mo144276a = "/aweme/v1/search/user/sug/")
        C1731i<C67683h> fetchUserSugAsync(@AbstractC89736t(mo144292a = "mention_type") long j, @AbstractC89736t(mo144292a = "aweme_id") Long l, @AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "source") String str2, @AbstractC89736t(mo144292a = "count") long j2, @AbstractC89736t(mo144292a = "uid_filter_list") String str3);

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi$Api$a */
        public static final class C41848a {

            /* renamed from: a */
            static final /* synthetic */ C41848a f97625a = new C41848a();

            private C41848a() {
            }

            static {
                Covode.recordClassIndex(49772);
            }
        }
    }

    /* renamed from: a */
    public static Api m83829a() {
        return (Api) f97623b.getValue();
    }

    private SearchSugApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi$b */
    static final class C41850b extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C41850b f97633a = new C41850b();

        static {
            Covode.recordClassIndex(49774);
        }

        C41850b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.m33635a().mo28817b(C29736b.f70921b).mo28832d().mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(49770);
    }

    /* renamed from: a */
    public static String m83830a(List<String> list) {
        List d;
        if (list == null || !(!list.isEmpty()) || (d = C89070n.m154571d((Iterable) list, 100)) == null) {
            return "";
        }
        String encode = Uri.encode(new JSONArray((Collection) d).toString());
        C89219l.m154716b(encode, "");
        return encode;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi$a */
    public static final class C41849a {

        /* renamed from: a */
        public final String f97626a;

        /* renamed from: b */
        public final String f97627b;

        /* renamed from: c */
        public final String f97628c;

        /* renamed from: d */
        public final String f97629d;

        /* renamed from: e */
        public final Integer f97630e;

        /* renamed from: f */
        public final String f97631f;

        /* renamed from: g */
        public final Integer f97632g;

        static {
            Covode.recordClassIndex(49773);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41849a)) {
                return false;
            }
            C41849a aVar = (C41849a) obj;
            return C89219l.m154714a(this.f97626a, aVar.f97626a) && C89219l.m154714a(this.f97627b, aVar.f97627b) && C89219l.m154714a(this.f97628c, aVar.f97628c) && C89219l.m154714a(this.f97629d, aVar.f97629d) && C89219l.m154714a(this.f97630e, aVar.f97630e) && C89219l.m154714a(this.f97631f, aVar.f97631f) && C89219l.m154714a(this.f97632g, aVar.f97632g);
        }

        public final int hashCode() {
            String str = this.f97626a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f97627b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f97628c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f97629d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Integer num = this.f97630e;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            String str5 = this.f97631f;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Integer num2 = this.f97632g;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode6 + i;
        }

        public final String toString() {
            return "Param(keywords=" + this.f97626a + ", source=" + this.f97627b + ", gid=" + this.f97628c + ", historyJson=" + this.f97629d + ", totalCount=" + this.f97630e + ", signal=" + this.f97631f + ", richSugCount=" + this.f97632g + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C41849a(String str, String str2, String str3, String str4, Integer num, Integer num2, int i) {
            this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : num, (String) null, (i & 64) == 0 ? num2 : null);
        }

        public C41849a(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            this.f97626a = str;
            this.f97627b = str2;
            this.f97628c = str3;
            this.f97629d = str4;
            this.f97630e = num;
            this.f97631f = str5;
            this.f97632g = num2;
        }
    }
}
