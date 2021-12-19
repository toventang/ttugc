package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48164as;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49668ac;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.e */
public final class C38673e {

    /* renamed from: a */
    public static final C38673e f91379a = new C38673e();

    private C38673e() {
    }

    static {
        Covode.recordClassIndex(46214);
    }

    /* renamed from: a */
    private static final void m78469a(Uri uri) {
        C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("scene_id", "1048").mo59983a("enter_from", "advertisement").mo59983a("to_user_id", uri.getLastPathSegment()).f79943a);
    }

    /* renamed from: a */
    public static final void m78470a(String str) {
        C89219l.m154721d(str, "");
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        String host = parse.getHost();
        String path = parse.getPath();
        if (host != null && host.length() != 0 && host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -309425751) {
                if (hashCode == 3599307 && host.equals("user") && path != null && C89361p.m154874b(path, "/profile", false)) {
                    m78469a(parse);
                }
            } else if (host.equals("profile")) {
                m78469a(parse);
            }
        }
    }

    /* renamed from: a */
    public static final void m78468a(Context context, String str) {
        C89219l.m154721d(context, "");
        C49669ad adVar = new C49669ad(context.hashCode());
        adVar.f114314c = str;
        C48164as.m91483a(new C49668ac("homepage_hot", context instanceof MainActivity), adVar);
    }
}
