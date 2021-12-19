package com.p2082ss.android.ugc.aweme.mvtemplate.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61247c;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61248d;
import java.util.Map;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi */
public final class MovieDetailAPi {

    /* renamed from: a */
    public static final int f139096a = 1;

    /* renamed from: b */
    public static final String f139097b = "template_id";

    /* renamed from: c */
    public static final String f139098c = "template_type";

    /* renamed from: d */
    public static final String f139099d = "operate_type";

    /* renamed from: e */
    public static final String f139100e = Api.f79771d;

    /* renamed from: f */
    public static final C61251a f139101f = new C61251a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi$MvDetail */
    public interface MvDetail {
        static {
            Covode.recordClassIndex(71865);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/ulike/collect/template/")
        @AbstractC89721e
        AbstractFutureC27655q<Object> collectTemplate(@AbstractC89720d Map<String, Object> map);

        @AbstractC89722f(mo144276a = "/aweme/v1/mv/detail/")
        AbstractFutureC27655q<C61248d> getMvDetail(@AbstractC89736t(mo144292a = "mv_id") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/mv/aweme/")
        AbstractFutureC27655q<C61247c> getMvDetailList(@AbstractC89736t(mo144292a = "mv_id") String str, @AbstractC89736t(mo144292a = "cursor") long j);
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi$a */
    public static final class C61251a {
        static {
            Covode.recordClassIndex(71866);
        }

        private C61251a() {
        }

        public /* synthetic */ C61251a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71864);
    }
}
