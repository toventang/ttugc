package com.p2082ss.android.ugc.trill.share.base;

import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.C49925a;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69311e;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.share.base.a */
public final class C85160a {

    /* renamed from: f */
    public static final C85161a f190519f = new C85161a((byte) 0);

    /* renamed from: a */
    public UrlModel f190520a;

    /* renamed from: b */
    public String f190521b;

    /* renamed from: c */
    public boolean f190522c;

    /* renamed from: d */
    public boolean f190523d;

    /* renamed from: e */
    public String f190524e;

    static {
        Covode.recordClassIndex(99204);
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.a$a */
    public static final class C85161a {
        static {
            Covode.recordClassIndex(99205);
        }

        private C85161a() {
        }

        public /* synthetic */ C85161a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m146423a(Aweme aweme) {
        String str;
        String str2 = this.f190524e;
        String str3 = null;
        if (str2 != null) {
            Locale locale = Locale.US;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.toLowerCase(locale);
            C89219l.m154716b(str, "");
        } else {
            str = null;
        }
        VideoUrlModel a = C69311e.m122507a(aweme, str);
        this.f190520a = a;
        if (a == null) {
            VideoUrlModel a2 = C69311e.m122506a(aweme);
            this.f190520a = a2;
            if (a2 == null) {
                if (this.f190523d) {
                    m146424a(aweme, false);
                    this.f190522c = this.f190523d;
                } else {
                    Video video = aweme.getVideo();
                    C89219l.m154716b(video, "");
                    this.f190520a = video.getDownloadAddr();
                }
            }
        }
        UrlModel urlModel = this.f190520a;
        if (urlModel != null) {
            str3 = urlModel.getUri();
        }
        this.f190521b = C13607d.m24442b(str3);
    }

    /* renamed from: a */
    private final void m146424a(Aweme aweme, boolean z) {
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        this.f190520a = playAddrH264;
        if (playAddrH264 != null) {
            String b = C80580in.m139684b(aweme.getAuthor());
            String str = null;
            if (z) {
                this.f190522c = false;
                StringBuilder sb = new StringBuilder();
                UrlModel urlModel = this.f190520a;
                if (urlModel != null) {
                    str = urlModel.getUri();
                }
                this.f190521b = C13607d.m24442b(sb.append(str).append(b).append("tag_no_water").toString());
                return;
            }
            UrlModel urlModel2 = this.f190520a;
            if (urlModel2 != null) {
                str = urlModel2.getUri();
            }
            this.f190521b = C13607d.m24442b(C89219l.m154704a(str, (Object) b));
        }
    }

    /* renamed from: a */
    private final void m146425a(Aweme aweme, boolean z, boolean z2) {
        if (z || C49925a.m93734b(aweme) || z2) {
            m146424a(aweme, z2);
        } else {
            m146423a(aweme);
        }
    }

    /* renamed from: a */
    public final void mo130082a(Aweme aweme, boolean z, boolean z2, boolean z3, ACLCommonShare aCLCommonShare, boolean z4) {
        C89219l.m154721d(aweme, "");
        this.f190522c = z;
        this.f190523d = z2;
        if (z3) {
            C89219l.m154721d(aweme, "");
            if (aCLCommonShare == null) {
                m146425a(aweme, z, z4);
            } else if (z || z4) {
                m146424a(aweme, z4);
            } else {
                m146423a(aweme);
            }
        } else {
            m146425a(aweme, z, z4);
        }
    }
}
