package com.p2082ss.android.ugc.aweme.feed.p2970ui.foryoutab;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.foryoutab.a */
public final class C50303a {

    /* renamed from: a */
    public static final C50303a f116149a = new C50303a();

    private C50303a() {
    }

    static {
        Covode.recordClassIndex(59430);
    }

    /* renamed from: a */
    public static C43044dj m94396a(Context context) {
        String string;
        C89219l.m154721d(context, "");
        if (C16048b.m29633a().mo25421a(true, "for_you_new_translations", false)) {
            string = context.getResources().getString(R.string.ggy);
        } else {
            string = context.getResources().getString(R.string.bzq);
        }
        C89219l.m154716b(string, "");
        return new C43044dj(context, "For You", string);
    }
}
