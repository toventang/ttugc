package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi */
public final class MediumApi {

    /* renamed from: a */
    public static final String f109827a;

    /* renamed from: b */
    public static MediumDataApi f109828b;

    /* renamed from: c */
    public static final C47186a f109829c = new C47186a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi$MediumDataApi */
    public interface MediumDataApi {
        static {
            Covode.recordClassIndex(55791);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/anchor/medium/collect/")
        AbstractFutureC27655q<Object> changeMediumState(@AbstractC89736t(mo144292a = "medium_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/anchor/medium/collection/")
        AbstractFutureC27655q<Object> getMediumList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi$a */
    public static final class C47186a {
        static {
            Covode.recordClassIndex(55792);
        }

        private C47186a() {
        }

        public /* synthetic */ C47186a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(55790);
        String str = Api.f79771d;
        f109827a = str;
        C89219l.m154716b(str, "");
        f109828b = (MediumDataApi) C18097a.m33696a().mo28816a(str).mo28858a(MediumDataApi.class);
    }
}
