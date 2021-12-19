package com.p2082ss.android.ugc.aweme.profile.edit.api;

import android.content.Context;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.trill.p4379h.C85089a;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi */
public final class YoutubeApi {

    /* renamed from: a */
    public static final YoutubeApi f144164a = new YoutubeApi();

    /* renamed from: b */
    private static final boolean f144165b = false;

    /* renamed from: c */
    private static final ServerApi f144166c;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$ServerApi */
    public interface ServerApi {
        static {
            Covode.recordClassIndex(74832);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/youtube/bind/")
        @AbstractC89721e
        AbstractFutureC27655q<C63518a> link(@AbstractC89719c(mo144273a = "yt_raw_token") String str, @AbstractC89719c(mo144273a = "google_account") String str2, @AbstractC89719c(mo144273a = "youtube_channel_id") String str3, @AbstractC89719c(mo144273a = "youtube_channel_title") String str4, @AbstractC89719c(mo144273a = "user_agent") String str5, @AbstractC89719c(mo144273a = "token_type") String str6, @AbstractC89719c(mo144273a = "access_token") String str7);

        @AbstractC89722f(mo144276a = "/aweme/v1/youtube/unbind/")
        AbstractFutureC27655q<C63518a> unlink();
    }

    private YoutubeApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a */
    public static final class C63518a {
        @AbstractC27891c(mo46611a = "status_code")

        /* renamed from: a */
        public final Integer f144167a;
        @AbstractC27891c(mo46611a = "error_msg")

        /* renamed from: b */
        public final String f144168b;
        @AbstractC27891c(mo46611a = "fail_reason")

        /* renamed from: c */
        public final C63519a f144169c;
        @AbstractC27891c(mo46611a = "bind_info")

        /* renamed from: d */
        public final C63520b f144170d;

        static {
            Covode.recordClassIndex(74833);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63518a)) {
                return false;
            }
            C63518a aVar = (C63518a) obj;
            return C89219l.m154714a(this.f144167a, aVar.f144167a) && C89219l.m154714a(this.f144168b, aVar.f144168b) && C89219l.m154714a(this.f144169c, aVar.f144169c) && C89219l.m154714a(this.f144170d, aVar.f144170d);
        }

        public final int hashCode() {
            Integer num = this.f144167a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.f144168b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C63519a aVar = this.f144169c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C63520b bVar = this.f144170d;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "YouTubeResponse(statusCode=" + this.f144167a + ", errorMessage=" + this.f144168b + ", errorStruct=" + this.f144169c + ", youtubeData=" + this.f144170d + ")";
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a */
        public static final class C63519a {
            @AbstractC27891c(mo46611a = "code")

            /* renamed from: a */
            public final Integer f144171a;
            @AbstractC27891c(mo46611a = "message")

            /* renamed from: b */
            public final String f144172b;

            static {
                Covode.recordClassIndex(74834);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C63519a)) {
                    return false;
                }
                C63519a aVar = (C63519a) obj;
                return C89219l.m154714a(this.f144171a, aVar.f144171a) && C89219l.m154714a(this.f144172b, aVar.f144172b);
            }

            public final int hashCode() {
                Integer num = this.f144171a;
                int i = 0;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                String str = this.f144172b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                return "YouTubeErrorStruct(code=" + this.f144171a + ", message=" + this.f144172b + ")";
            }

            private /* synthetic */ C63519a() {
                this(0, "");
            }

            private C63519a(Integer num, String str) {
                this.f144171a = num;
                this.f144172b = str;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b */
        public static final class C63520b {
            @AbstractC27891c(mo46611a = "google_account")

            /* renamed from: a */
            public final String f144173a = null;
            @AbstractC27891c(mo46611a = "channel_id")

            /* renamed from: b */
            public final String f144174b = null;
            @AbstractC27891c(mo46611a = "channel_title")

            /* renamed from: c */
            public final String f144175c = null;

            static {
                Covode.recordClassIndex(74835);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C63520b)) {
                    return false;
                }
                C63520b bVar = (C63520b) obj;
                return C89219l.m154714a(this.f144173a, bVar.f144173a) && C89219l.m154714a(this.f144174b, bVar.f144174b) && C89219l.m154714a(this.f144175c, bVar.f144175c);
            }

            public final int hashCode() {
                String str = this.f144173a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f144174b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f144175c;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode2 + i;
            }

            public final String toString() {
                return "YoutubeChannelStruct(googleAccount=" + this.f144173a + ", channelId=" + this.f144174b + ", channelTitle=" + this.f144175c + ")";
            }

            private C63520b() {
            }
        }

        private /* synthetic */ C63518a() {
            this(0, "");
        }

        private C63518a(Integer num, String str) {
            this.f144167a = num;
            this.f144168b = str;
            this.f144169c = null;
            this.f144170d = null;
        }
    }

    static {
        Covode.recordClassIndex(74831);
        Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ServerApi.class);
        C89219l.m154716b(a, "");
        f144166c = (ServerApi) a;
    }

    /* renamed from: a */
    public static final boolean m115113a() {
        try {
            C63518a aVar = f144166c.unlink().get();
            if (aVar == null) {
                return false;
            }
            Integer num = aVar.f144167a;
            if (num == null) {
                return false;
            }
            if (num.intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m115112a(Context context, Exception exc, Integer num, C63518a aVar) {
        String str;
        Integer num2;
        String str2;
        Integer num3;
        C63518a.C63519a aVar2;
        C63518a.C63519a aVar3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Exception: ");
        if (exc == null || (str = exc.getMessage()) == null) {
            str = Log.getStackTraceString(exc);
            C89219l.m154716b(str, "");
        }
        StringBuilder append = sb.append(sb2.append(str).toString()).append(", gms_code: ").append(C85089a.m146304b(context)).append(", oauth_code: ").append(num).append(", resp_code: ");
        String str3 = null;
        if (aVar != null) {
            num2 = aVar.f144167a;
        } else {
            num2 = null;
        }
        StringBuilder append2 = append.append(num2).append(", resp_msg: ");
        if (aVar != null) {
            str2 = aVar.f144168b;
        } else {
            str2 = null;
        }
        StringBuilder append3 = append2.append(str2).append(", yt_code: ");
        if (aVar == null || (aVar3 = aVar.f144169c) == null) {
            num3 = null;
        } else {
            num3 = aVar3.f144171a;
        }
        StringBuilder append4 = append3.append(num3).append(", yt_msg: ");
        if (!(aVar == null || (aVar2 = aVar.f144169c) == null)) {
            str3 = aVar2.f144172b;
        }
        String sb3 = append4.append(str3).toString();
        C89219l.m154716b(sb3, "");
        return sb3;
    }

    /* renamed from: a */
    public static final C63518a m115111a(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            return f144166c.link(str, null, str2, str3, str4, str6, str5).get();
        } catch (Exception unused) {
            return null;
        }
    }
}
