package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa */
public final class C72053aa {
    static {
        Covode.recordClassIndex(84718);
    }

    /* renamed from: a */
    public static final void m127203a(Context context, int i, int i2) {
        Resources resources;
        String string;
        switch (i) {
            case -8:
                new C79459a(context).mo123050a(R.string.h3a).mo123053a();
                return;
            case -7:
                new C79459a(context).mo123050a(R.string.h3b).mo123053a();
                return;
            case -6:
                new C79459a(context).mo123050a(R.string.d52).mo123053a();
                return;
            case -5:
                new C79459a(context).mo123050a(R.string.h3c).mo123053a();
                return;
            case -4:
                new C79459a(context).mo123050a(R.string.cc7).mo123053a();
                return;
            case -3:
                new C79459a(context).mo123050a(R.string.h3l).mo123053a();
                return;
            case -2:
                new C79459a(context).mo123050a(R.string.h3k).mo123053a();
                return;
            case -1:
                if (i2 == -1) {
                    new C79459a(context).mo123050a(R.string.h3j).mo123053a();
                    return;
                } else if (context != null && (resources = context.getResources()) != null && (string = resources.getString(R.string.h3o, Integer.valueOf(i2 / 1000))) != null) {
                    new C79459a(context).mo123052a(string).mo123053a();
                    return;
                } else {
                    return;
                }
            default:
                new C79459a(context).mo123050a(R.string.h3m).mo123053a();
                return;
        }
    }
}
