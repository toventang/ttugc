package com.p2082ss.android.ugc.aweme.p2316ap;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.ap.a */
public final class C33521a {
    static {
        Covode.recordClassIndex(40384);
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.a$a */
    static final class C33522a extends AbstractC89220m implements AbstractC89172b<Context, Context> {

        /* renamed from: a */
        public static final C33522a f79622a = new C33522a();

        static {
            Covode.recordClassIndex(40385);
        }

        C33522a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Context invoke(Context context) {
            Context context2 = context;
            C89219l.m154721d(context2, "");
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final ActivityC0945e m68685a(Context context) {
        ActivityC0945e eVar;
        Object obj;
        C89219l.m154721d(context, "");
        Iterator a = C89309k.m154794a(context, C33522a.f79622a).mo2926a();
        while (true) {
            eVar = null;
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (obj instanceof ActivityC0945e) {
                break;
            }
        }
        if (obj instanceof ActivityC0945e) {
            eVar = obj;
        }
        return eVar;
    }
}
