package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.setting.model.C68176f;
import com.p2082ss.android.ugc.aweme.setting.model.C68181k;
import com.p2082ss.android.ugc.aweme.setting.model.C68184m;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.RestrictApi */
public final class RestrictApi {

    /* renamed from: a */
    private static final RealApi f152338a = ((RealApi) C18097a.m33698a(C29736b.f70924e, RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.api.RestrictApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(80190);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/item/restrict/info/")
        AbstractFutureC27655q<C68184m> getRestrictInfo(@AbstractC89736t(mo144292a = "target_iid") String str);

        @AbstractC89731o(mo144285a = "/aweme/v1/item/restrict/")
        @AbstractC89721e
        AbstractFutureC27655q<C68176f> restrictAweme(@AbstractC89719c(mo144273a = "target_iid") String str);

        @AbstractC89731o(mo144285a = "/aweme/v1/user/restrict/")
        @AbstractC89721e
        AbstractFutureC27655q<C68176f> restrictUser(@AbstractC89719c(mo144273a = "target_uid") String str);
    }

    static {
        Covode.recordClassIndex(80189);
    }

    /* renamed from: a */
    public static C68181k m120305a(String str) {
        try {
            C68184m mVar = f152338a.getRestrictInfo(str).get();
            if (mVar == null) {
                return null;
            }
            mVar.f152664a.f152659a = str;
            return mVar.f152664a;
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static C68176f m120306b(String str) {
        try {
            return f152338a.restrictAweme(str).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: c */
    public static C68176f m120307c(String str) {
        try {
            return f152338a.restrictUser(str).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
