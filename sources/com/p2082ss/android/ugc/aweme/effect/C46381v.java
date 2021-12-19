package com.p2082ss.android.ugc.aweme.effect;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.IOException;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90029ac;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.v */
public final class C46381v {

    /* renamed from: com.ss.android.ugc.aweme.effect.v$a */
    public static final class C46382a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C46382a f108098a = new C46382a();

        static {
            Covode.recordClassIndex(54959);
        }

        C46382a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(54958);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.v$c */
    public static final class C46384c implements AbstractC88428a {

        /* renamed from: a */
        public static final C46384c f108100a = new C46384c();

        static {
            Covode.recordClassIndex(54961);
        }

        C46384c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            C40982q.m82520a("effect_provider_notify_dealer_error_rate", 0, (JSONObject) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.v$b */
    public static final class C46383b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C46383b f108099a = new C46383b();

        static {
            Covode.recordClassIndex(54960);
        }

        C46383b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C84911q.m145923a("ProviderEffect", th);
            C40982q.m82520a("effect_provider_notify_dealer_error_rate", 1, new C69840ar().mo110189a("errorMsg", Log.getStackTraceString(th)).mo110191a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.v$d */
    public static final class C46385d implements AbstractC90051f {
        static {
            Covode.recordClassIndex(54962);
        }

        @Override // okhttp3.AbstractC90051f
        public final void onFailure(AbstractC90049e eVar, IOException iOException) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(iOException, "");
            eVar.mo144710c();
        }

        @Override // okhttp3.AbstractC90051f
        public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(acVar, "");
            eVar.mo144710c();
        }
    }
}
