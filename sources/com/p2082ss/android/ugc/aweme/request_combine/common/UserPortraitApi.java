package com.p2082ss.android.ugc.aweme.request_combine.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.request_combine.common.UserPortraitApi */
public final class UserPortraitApi {

    /* renamed from: a */
    private static final IRetrofit f150538a = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.common.UserPortraitApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(78715);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/efficiency_portrait/")
        AbstractFutureC27655q<C28022o> fetchPortraits(@AbstractC89736t(mo144292a = "group_list") String str);
    }

    static {
        Covode.recordClassIndex(78714);
    }

    /* renamed from: a */
    public static C28022o m118788a(String str) {
        int errorCode;
        try {
            return ((RealApi) f150538a.create(RealApi.class)).fetchPortraits(str).get();
        } catch (ExecutionException e) {
            if ((e.getCause() instanceof C34485a) && ((errorCode = ((C34480a) e.getCause()).getErrorCode()) == 9 || errorCode == 14)) {
                return null;
            }
            throw e;
        } catch (IncompatibleClassChangeError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
