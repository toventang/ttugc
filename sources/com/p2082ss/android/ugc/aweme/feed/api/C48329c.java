package com.p2082ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import android.util.Log;
import beancopy.ConvertHelp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.C33620c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p4171u.C79489b;
import com.p2082ss.android.ugc.aweme.p4171u.C79494d;
import com.p2082ss.ugc.aweme.proto.aweme_v2_feed_response;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.c */
public final class C48329c {

    /* renamed from: a */
    private static final String f112001a = ("pb_convert_flag" + C17867d.m33087h());

    static {
        Covode.recordClassIndex(57101);
    }

    /* renamed from: a */
    static String m91789a() {
        if (C49653t.m93097a()) {
            return C49653t.m93098b();
        }
        return null;
    }

    /* renamed from: a */
    public static FeedItemList m91787a(C33620c<aweme_v2_feed_response, FeedItemList> cVar, C48341o oVar) {
        return cVar.mo59949a(new C48330d(oVar));
    }

    /* renamed from: a */
    static final /* synthetic */ FeedItemList m91788a(C48341o oVar, aweme_v2_feed_response aweme_v2_feed_response) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelp.m5852x2ccced6e(aweme_v2_feed_response, null);
            if (oVar.f112033g.intValue() == 8) {
                com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = aweme_v2_feed_response;
            }
            C48331e.f112003a = SystemClock.elapsedRealtime() - elapsedRealtime;
            return com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            C33830n.m69192a("service_monitor", "log_bean_copy_convert_error", new C33743c().mo59976a("errMsg", Log.getStackTraceString(th)).mo59977a());
            C48327a aVar = new C48327a(th);
            C51423a.m95790a((Throwable) aVar);
            C13468b.m24210a(aVar);
            String stackTraceString = Log.getStackTraceString(new C79494d("NOT A CRASH !!!", aVar));
            C89219l.m154716b(stackTraceString, "");
            C79489b.m138201a(stackTraceString);
            C34822d.m71158a(C51427a.f118503a, "pb_convert_flag", 0).edit().clear().putBoolean(f112001a, true).commit();
            return FeedApi.m91772a(oVar, false);
        }
    }
}
