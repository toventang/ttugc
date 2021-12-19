package com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f;

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

/* renamed from: com.ss.android.ugc.aweme.kids.a.f.d */
public final class C57116d implements AbstractC57115c {
    static {
        Covode.recordClassIndex(67010);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.f.d$a */
    static final class RunnableC57117a implements Runnable {

        /* renamed from: a */
        public static final RunnableC57117a f130040a = new RunnableC57117a();

        static {
            Covode.recordClassIndex(67011);
        }

        RunnableC57117a() {
        }

        public final void run() {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.h2n).mo123053a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57115c
    /* renamed from: a */
    public final void mo94263a(AbstractC57122f fVar, EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap, JSONObject jSONObject) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(jSONObject, "");
        if (bVar == EnumC81991b.NO_NETWORK && fVar.mo94265b()) {
            C34727m.m70944a(RunnableC57117a.f130040a);
        }
        try {
            C34611o.m70668a("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
