package com.p2082ss.android.ugc.aweme.comment.translatorinfo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi */
public interface CommentTranslatorInfoApi {

    /* renamed from: a */
    public static final C36992b f87120a = C36992b.f87125a;

    static {
        Covode.recordClassIndex(44339);
    }

    @AbstractC89722f(mo144276a = "/tiktok/cla/translation_like/get/v1/")
    AbstractC88403ab<C36991a> fetchTranslationLikeInfo(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "subtitle_id") String str2, @AbstractC89736t(mo144292a = "translator_id") String str3);

    @AbstractC89731o(mo144285a = "/tiktok/cla/translation_like/create/v1/")
    AbstractC88403ab<BaseResponse> updateTranslationLikeInfo(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "subtitle_id") String str2, @AbstractC89736t(mo144292a = "translator_id") String str3, @AbstractC89736t(mo144292a = "is_cancel") Boolean bool);

    /* renamed from: com.ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi$b */
    public static final class C36992b {

        /* renamed from: a */
        static final /* synthetic */ C36992b f87125a = new C36992b();

        /* renamed from: b */
        private static final AbstractC18099f f87126b;

        private C36992b() {
        }

        /* renamed from: a */
        public static CommentTranslatorInfoApi m74642a() {
            Object a = f87126b.mo28858a(CommentTranslatorInfoApi.class);
            C89219l.m154716b(a, "");
            return (CommentTranslatorInfoApi) a;
        }

        static {
            Covode.recordClassIndex(44341);
            String str = C29736b.f70924e;
            C89219l.m154716b(str, "");
            f87126b = C18097a.m33697a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi$a */
    public static final class C36991a extends BaseResponse {
        @AbstractC27891c(mo46611a = "translator_nickname")

        /* renamed from: a */
        public final String f87121a;
        @AbstractC27891c(mo46611a = "translator_id")

        /* renamed from: b */
        public final String f87122b;
        @AbstractC27891c(mo46611a = "is_liked")

        /* renamed from: c */
        public final boolean f87123c;
        @AbstractC27891c(mo46611a = "display_message")

        /* renamed from: d */
        public final String f87124d;

        static {
            Covode.recordClassIndex(44340);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36991a)) {
                return false;
            }
            C36991a aVar = (C36991a) obj;
            return C89219l.m154714a(this.f87121a, aVar.f87121a) && C89219l.m154714a(this.f87122b, aVar.f87122b) && this.f87123c == aVar.f87123c && C89219l.m154714a(this.f87124d, aVar.f87124d);
        }

        public final int hashCode() {
            String str = this.f87121a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87122b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.f87123c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode2 + i2) * 31;
            String str3 = this.f87124d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return i5 + i;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            return "CommentTranslatiorInfoResponse(translatorNickname=" + this.f87121a + ", translatorId=" + this.f87122b + ", isLiked=" + this.f87123c + ", displayMessage=" + this.f87124d + ")";
        }

        private /* synthetic */ C36991a() {
            this("", "", "");
        }

        private C36991a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f87121a = str;
            this.f87122b = str2;
            this.f87123c = false;
            this.f87124d = str3;
        }
    }
}
