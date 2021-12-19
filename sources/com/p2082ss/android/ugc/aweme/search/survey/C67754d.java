package com.p2082ss.android.ugc.aweme.search.survey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.survey.d */
public final class C67754d extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C67755a f151844a = null;

    static {
        Covode.recordClassIndex(79405);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C67754d) && C89219l.m154714a(this.f151844a, ((C67754d) obj).f151844a);
        }
        return true;
    }

    public final int hashCode() {
        C67755a aVar = this.f151844a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SurveyDetailResponse(data=" + this.f151844a + ")";
    }

    private C67754d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.d$a */
    public static final class C67755a {
        @AbstractC27891c(mo46611a = "survey_title")

        /* renamed from: a */
        public final String f151845a;
        @AbstractC27891c(mo46611a = "stars_title_array")

        /* renamed from: b */
        public List<String> f151846b;

        static {
            Covode.recordClassIndex(79406);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67755a)) {
                return false;
            }
            C67755a aVar = (C67755a) obj;
            return C89219l.m154714a(this.f151845a, aVar.f151845a) && C89219l.m154714a(this.f151846b, aVar.f151846b);
        }

        public final int hashCode() {
            String str = this.f151845a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.f151846b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "Data(title=" + this.f151845a + ", starsTitleList=" + this.f151846b + ")";
        }

        private C67755a() {
            this.f151845a = null;
            this.f151846b = null;
        }

        public /* synthetic */ C67755a(byte b) {
            this();
        }
    }
}
