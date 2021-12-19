package com.p2082ss.android.ugc.aweme.share;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1733u.C23431b;
import com.bytedance.p1733u.C23435d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.ShareFlavorService;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.ac */
public final class C68852ac {

    /* renamed from: a */
    public static final C68853a f153975a = new C68853a((byte) 0);

    static {
        Covode.recordClassIndex(81153);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ac$a */
    public static final class C68853a {
        static {
            Covode.recordClassIndex(81154);
        }

        private C68853a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.share.ac$a$c */
        public static final class CallableC68856c<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ String f153991a;

            /* renamed from: b */
            final /* synthetic */ String f153992b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f153993c;

            /* renamed from: d */
            final /* synthetic */ C89233z.C89238e f153994d;

            /* renamed from: e */
            final /* synthetic */ String f153995e;

            /* renamed from: f */
            final /* synthetic */ String f153996f;

            /* renamed from: g */
            final /* synthetic */ int f153997g;

            static {
                Covode.recordClassIndex(81157);
            }

            CallableC68856c(String str, String str2, C89233z.C89238e eVar, C89233z.C89238e eVar2, String str3, String str4, int i) {
                this.f153991a = str;
                this.f153992b = str2;
                this.f153993c = eVar;
                this.f153994d = eVar2;
                this.f153995e = str3;
                this.f153996f = str4;
                this.f153997g = i;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C39162r.m79460a("watermark_share_download", new C33744d().mo59983a("group_id", this.f153991a).mo59983a("enter_from", this.f153992b).mo59983a("action_type", (String) this.f153993c.element).mo59983a("platform", (String) this.f153994d.element).mo59983a("is_long", this.f153995e).mo59983a("logo_name", this.f153996f).mo59980a("watermark_type", this.f153997g).f79943a);
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ac$a$b */
        public static final class CallableC68855b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ String f153986a;

            /* renamed from: b */
            final /* synthetic */ Long f153987b;

            /* renamed from: c */
            final /* synthetic */ Integer f153988c;

            /* renamed from: d */
            final /* synthetic */ String f153989d;

            /* renamed from: e */
            final /* synthetic */ boolean f153990e;

            static {
                Covode.recordClassIndex(81156);
            }

            public CallableC68855b(String str, Long l, Integer num, String str2, boolean z) {
                this.f153986a = str;
                this.f153987b = l;
                this.f153988c = num;
                this.f153989d = str2;
                this.f153990e = z;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String d = C80313cs.m139235d(this.f153986a);
                long length = new File(this.f153986a).length();
                boolean equals = TextUtils.equals(d, "20");
                C33743c cVar = new C33743c();
                Long l = this.f153987b;
                long j = 0;
                if (!(l == null || l.longValue() == 0)) {
                    j = length / this.f153987b.longValue();
                }
                C33743c a = cVar.mo59975a("download_rate", Long.valueOf(j)).mo59975a("download_duration", this.f153987b).mo59975a("file_size", Long.valueOf(length)).mo59976a("errorDesc", "null").mo59974a("errorCode", this.f153988c).mo59976a("url", this.f153989d).mo59971a("muteAudio", (Boolean) true).mo59971a("needWaterMark", Boolean.valueOf(this.f153990e)).mo59976a("fileMagic", C80313cs.m139235d(this.f153986a)).mo59971a("isMp4", Boolean.valueOf(equals));
                C23431b a2 = C23431b.m44101a(C17867d.m33078a());
                if (a2 != null) {
                    a.mo59971a("has_remove_sd", (Boolean) true);
                    a.mo59971a("sd_state", Boolean.valueOf(a2.mo38203a()));
                    a.mo59975a("sd_available_size", Long.valueOf(a2.f55570a));
                    a.mo59976a("share_dir", C73955am.m130069d(C17867d.m33078a()));
                } else {
                    a.mo59971a("has_remove_sd", (Boolean) false);
                }
                C12290b.m22060a("save_video_success_rate", 3, a.mo59977a());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ac$a$a */
        static final class CallableC68854a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ String f153976a;

            /* renamed from: b */
            final /* synthetic */ Long f153977b;

            /* renamed from: c */
            final /* synthetic */ long f153978c;

            /* renamed from: d */
            final /* synthetic */ String f153979d;

            /* renamed from: e */
            final /* synthetic */ Boolean f153980e;

            /* renamed from: f */
            final /* synthetic */ UrlModel f153981f;

            /* renamed from: g */
            final /* synthetic */ boolean f153982g;

            /* renamed from: h */
            final /* synthetic */ String f153983h;

            /* renamed from: i */
            final /* synthetic */ Integer f153984i;

            /* renamed from: j */
            final /* synthetic */ boolean f153985j;

            static {
                Covode.recordClassIndex(81155);
            }

            CallableC68854a(String str, Long l, long j, String str2, Boolean bool, UrlModel urlModel, boolean z, String str3, Integer num, boolean z2) {
                this.f153976a = str;
                this.f153977b = l;
                this.f153978c = j;
                this.f153979d = str2;
                this.f153980e = bool;
                this.f153981f = urlModel;
                this.f153982g = z;
                this.f153983h = str3;
                this.f153984i = num;
                this.f153985j = z2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Integer num;
                List<String> urlList;
                Integer num2;
                List<String> urlList2;
                String str = this.f153976a;
                if (str != null) {
                    boolean equals = TextUtils.equals(C80313cs.m139235d(str), "20");
                    C33743c cVar = new C33743c();
                    Long l = this.f153977b;
                    long j = 0;
                    if (!(l == null || l.longValue() == 0)) {
                        j = this.f153978c / this.f153977b.longValue();
                    }
                    C33743c a = cVar.mo59975a("download_rate", Long.valueOf(j)).mo59975a("download_duration", this.f153977b).mo59975a("file_size", Long.valueOf(this.f153978c)).mo59976a("errorDesc", "null").mo59976a("errorCode", "null").mo59976a("url", this.f153979d).mo59971a("needWaterMark", (Boolean) false).mo59971a("muteAudio", this.f153980e).mo59976a("fileMagic", C80313cs.m139235d(this.f153976a)).mo59971a("isMp4", Boolean.valueOf(equals));
                    UrlModel urlModel = this.f153981f;
                    if (urlModel == null || (urlList2 = urlModel.getUrlList()) == null) {
                        num2 = null;
                    } else {
                        num2 = Integer.valueOf(urlList2.size());
                    }
                    C33743c a2 = a.mo59974a("urlNums", num2).mo59971a("isPrivateAweme", Boolean.valueOf(this.f153982g));
                    if (!equals) {
                        ShareFlavorService a3 = ShareFlavorService.C68825a.m121371a();
                        String str2 = this.f153976a;
                        long j2 = this.f153978c;
                        C89219l.m154716b(a2, "");
                        a3.mo109371a(str2, j2, a2);
                    }
                    C23431b a4 = C23431b.m44101a(C17867d.m33078a());
                    if (a4 != null) {
                        a2.mo59971a("has_remove_sd", (Boolean) true);
                        a2.mo59971a("sd_state", Boolean.valueOf(a4.mo38203a()));
                        a2.mo59975a("sd_available_size", Long.valueOf(a4.f55570a));
                        a2.mo59976a("share_dir", C73955am.m130069d(C17867d.m33078a()));
                    } else {
                        a2.mo59971a("has_remove_sd", (Boolean) false);
                    }
                    C12290b.m22060a("save_video_success_rate", 0, a2.mo59977a());
                } else {
                    C33743c a5 = new C33743c().mo59974a("download_rate", (Integer) 0).mo59975a("download_duration", this.f153977b).mo59974a("file_size", (Integer) -1).mo59976a("errorDesc", this.f153983h).mo59974a("errorCode", this.f153984i).mo59976a("url", this.f153979d).mo59971a("needWaterMark", Boolean.valueOf(this.f153985j)).mo59976a("fileMagic", "download_error").mo59971a("muteAudio", this.f153980e).mo59971a("strategy_enabled", Boolean.valueOf(C23435d.m44115a())).mo59976a("isMp4", "notSure");
                    UrlModel urlModel2 = this.f153981f;
                    if (urlModel2 == null || (urlList = urlModel2.getUrlList()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(urlList.size());
                    }
                    C33743c a6 = a5.mo59974a("urlNums", num).mo59971a("isPrivateAweme", Boolean.valueOf(this.f153982g));
                    C23431b a7 = C23431b.m44101a(C17867d.m33078a());
                    if (a7 != null) {
                        a6.mo59971a("has_remove_sd", (Boolean) true);
                        a6.mo59971a("sd_state", Boolean.valueOf(a7.mo38203a()));
                        a6.mo59975a("sd_available_size", Long.valueOf(a7.f55570a));
                        a6.mo59976a("share_dir", C73955am.m130069d(C17867d.m33078a()));
                    } else {
                        a6.mo59971a("has_remove_sd", (Boolean) false);
                    }
                    C12290b.m22060a("save_video_success_rate", 1, a6.mo59977a());
                }
                return null;
            }
        }

        public /* synthetic */ C68853a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m121523a(Aweme aweme) {
            if (aweme == null) {
                return false;
            }
            return aweme.isPrivate();
        }

        /* renamed from: a */
        public static String m121520a(UrlModel urlModel) {
            String str = null;
            if (urlModel != null && urlModel.getUrlList() != null) {
                for (String str2 : urlModel.getUrlList()) {
                    Uri parse = Uri.parse(str2);
                    C89219l.m154716b(parse, "");
                    if (!parse.isOpaque()) {
                        str = parse.getQueryParameter("logo_name");
                        if (!TextUtils.isEmpty(str)) {
                            break;
                        }
                    }
                }
            }
            return str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static void m121522a(String str, String str2, String str3, String str4, String str5, int i) {
            C89219l.m154721d(str4, "");
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = str3;
            if (C89219l.m154714a((Object) "download", (Object) str3)) {
                eVar.element = "download";
                eVar2.element = null;
            } else {
                eVar.element = "share";
            }
            C1731i.m5640b(new CallableC68856c(str, str2, eVar, eVar2, str4, str5, i), C1731i.f5562a);
        }

        /* renamed from: a */
        public static void m121521a(String str, long j, Long l, String str2, boolean z, Integer num, String str3, Boolean bool, UrlModel urlModel, boolean z2) {
            C1731i.m5640b(new CallableC68854a(str, l, j, str2, bool, urlModel, z2, str3, num, z), C1731i.f5562a);
        }
    }
}
