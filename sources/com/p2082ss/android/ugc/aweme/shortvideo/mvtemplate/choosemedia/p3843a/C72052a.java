package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3843a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72200bs;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a.a */
public final class C72052a {
    static {
        Covode.recordClassIndex(84717);
    }

    /* renamed from: a */
    public static final boolean m127202a(MediaModel mediaModel, Context context) {
        C89219l.m154721d(mediaModel, "");
        C89219l.m154721d(context, "");
        double d = (double) mediaModel.f134672l;
        double d2 = (double) mediaModel.f134673m;
        Double.isNaN(d2);
        if (d <= d2 * 2.4d) {
            double d3 = (double) mediaModel.f134673m;
            double d4 = (double) mediaModel.f134672l;
            Double.isNaN(d4);
            if (d3 <= d4 * 2.4d) {
                return true;
            }
        }
        C72200bs.m127398a(0, 1);
        new C79459a(context).mo123050a(R.string.fqm).mo123053a();
        C40982q.m82520a("aweme_movie_import_error_rate", 1, new C69840ar().mo110187a("errorCode", (Integer) -9).mo110189a("errorMsg", "").mo110191a());
        return false;
    }
}
