package com.p2082ss.android.ugc.trill.share.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.share.base.c */
public final class C85173c {
    static {
        Covode.recordClassIndex(99217);
    }

    /* renamed from: a */
    public static final boolean m146457a(Context context, Aweme aweme, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        if (!C68909c.m121606b()) {
            return false;
        }
        if (!C68909c.m121605a() || !C68909c.m121607b(str)) {
            new C79459a(C17867d.m33078a()).mo123052a(context.getString(R.string.buk)).mo123053a();
            return true;
        }
        new C79459a(C17867d.m33078a()).mo123052a(context.getString(R.string.bul)).mo123053a();
        return true;
    }
}
