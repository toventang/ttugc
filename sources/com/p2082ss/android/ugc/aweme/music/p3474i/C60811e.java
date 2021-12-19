package com.p2082ss.android.ugc.aweme.music.p3474i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.i.e */
public final class C60811e implements AbstractC60807c {
    static {
        Covode.recordClassIndex(71368);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.i.e$a */
    static final class RunnableC60812a implements Runnable {

        /* renamed from: a */
        public static final RunnableC60812a f138195a = new RunnableC60812a();

        static {
            Covode.recordClassIndex(71369);
        }

        RunnableC60812a() {
        }

        public final void run() {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.h2n).mo123053a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60807c
    /* renamed from: a */
    public final void mo98213a(AbstractC60817g gVar, EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap, JSONObject jSONObject) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(jSONObject, "");
        if (bVar == EnumC81991b.NO_NETWORK && gVar.mo98221b()) {
            C34727m.m70944a(RunnableC60812a.f138195a);
        }
        try {
            C34611o.m70668a("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
