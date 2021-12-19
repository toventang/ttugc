package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bj */
public final class C72175bj {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bj$a */
    public interface AbstractC72176a {
        static {
            Covode.recordClassIndex(84841);
        }

        /* renamed from: a */
        void mo114423a();

        /* renamed from: b */
        void mo114424b();
    }

    static {
        Covode.recordClassIndex(84840);
    }

    /* renamed from: a */
    private static boolean m127365a(Context context) {
        if (C63238c.f143566D.mo73307c().mo101757a(context) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m127364a(Context context, AbstractC72176a aVar) {
        if (!(context instanceof ActivityC0945e)) {
            C73991bj.m130131b("reuse mv is not fragment activity:".concat(String.valueOf(context)));
            aVar.mo114423a();
        } else if (m127365a(context)) {
            C73991bj.m130128a("reuse mv get permission succ");
            aVar.mo114423a();
        } else if (!C63238c.f143566D.mo73307c().mo101671a()) {
            aVar.mo114423a();
        } else {
            C73991bj.m130128a("reuse mv support runtime permission");
            C63238c.f143565C.mo73274b().mo101758a((ActivityC0945e) context, new C72177bk(aVar, context), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
