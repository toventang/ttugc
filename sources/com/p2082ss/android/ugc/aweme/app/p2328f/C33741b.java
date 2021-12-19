package com.p2082ss.android.ugc.aweme.app.p2328f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.f.b */
public final class C33741b {

    /* renamed from: a */
    static final String f79929a = "download_tns";

    /* renamed from: b */
    static final String f79930b = "is_author";

    /* renamed from: c */
    static final String f79931c = "is_friend";

    /* renamed from: d */
    static final String f79932d = "click_btn";

    /* renamed from: e */
    static final String f79933e = "gid";

    /* renamed from: f */
    static final String f79934f = "download_addr";

    /* renamed from: g */
    static final String f79935g = "monitor_type";

    /* renamed from: h */
    static final String f79936h = "server_ctx";

    /* renamed from: i */
    public static final C33741b f79937i = new C33741b();

    private C33741b() {
    }

    static {
        Covode.recordClassIndex(40636);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.f.b$a */
    static final class CallableC33742a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Aweme f79938a;

        /* renamed from: b */
        final /* synthetic */ String f79939b;

        /* renamed from: c */
        final /* synthetic */ String f79940c;

        static {
            Covode.recordClassIndex(40637);
        }

        CallableC33742a(Aweme aweme, String str, String str2) {
            this.f79938a = aweme;
            this.f79939b = str;
            this.f79940c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            User author;
            if (!C31575b.m65865g().isMe(this.f79938a.getAuthorUid())) {
                C33744d dVar = new C33744d();
                dVar.mo59982a(C33741b.f79930b, (Object) false);
                dVar.mo59982a(C33741b.f79931c, Boolean.valueOf(C33741b.m69071a(this.f79938a)));
                dVar.mo59983a(C33741b.f79932d, this.f79939b);
                dVar.mo59983a(C33741b.f79933e, this.f79938a.getAid());
                dVar.mo59983a(C33741b.f79934f, this.f79940c);
                String str = C33741b.f79935g;
                Aweme aweme = this.f79938a;
                C89219l.m154721d(aweme, "");
                StringBuilder sb = new StringBuilder();
                AwemeStatus status = aweme.getStatus();
                if (status != null && status.getReviewStatus() == 1) {
                    sb.append("1,");
                }
                if (aweme.getStatus() != null) {
                    AwemeStatus status2 = aweme.getStatus();
                    C89219l.m154716b(status2, "");
                    if (status2.isDelete()) {
                        sb.append("2,");
                    }
                }
                if (C80580in.m139685b(aweme.getAuthor(), C31575b.m65865g().isMe(aweme.getAuthorUid()))) {
                    sb.append("3,");
                }
                AwemeStatus status3 = aweme.getStatus();
                if (status3 != null && status3.getReviewStatus() == 2) {
                    sb.append("4,");
                }
                if (aweme.isPrivate()) {
                    sb.append("5,");
                }
                AwemeStatus status4 = aweme.getStatus();
                if (status4 != null && status4.getPrivateStatus() == 2 && !C33741b.m69071a(aweme)) {
                    sb.append("6,");
                }
                VideoControl videoControl = aweme.getVideoControl();
                if ((videoControl != null && videoControl.preventDownloadType == 3) || ((author = aweme.getAuthor()) != null && author.getDownloadSetting() == 3)) {
                    sb.append("7,");
                }
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                if (sb.length() > 0) {
                    sb2 = sb.substring(0, sb.length() - 1);
                    C89219l.m154716b(sb2, "");
                }
                dVar.mo59983a(str, sb2);
                dVar.mo59983a(C33741b.f79936h, C80342dg.m139300a().mo46674b(new AwemeACLStruct.ServerExtra().buildServerExtraJson(this.f79938a)));
                C39162r.m79460a(C33741b.f79929a, dVar.f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m69071a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        User author = aweme.getAuthor();
        C89219l.m154716b(author, "");
        if (author.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m69070a(Aweme aweme, String str, String str2) {
        if (aweme != null) {
            C1731i.m5640b(new CallableC33742a(aweme, str, str2), C1731i.f5562a);
        }
    }
}
