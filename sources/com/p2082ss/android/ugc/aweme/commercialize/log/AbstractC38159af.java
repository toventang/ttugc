package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.af */
public abstract class AbstractC38159af {

    /* renamed from: a */
    public boolean f90132a;

    static {
        Covode.recordClassIndex(45638);
    }

    /* renamed from: a */
    public abstract boolean mo66462a();

    /* renamed from: b */
    public abstract boolean mo66464b();

    /* renamed from: a */
    public final boolean mo66463a(C38160a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f90132a || !mo66462a() || !mo66464b()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.af$a */
    public static final class C38160a {

        /* renamed from: a */
        public Context f90133a;

        /* renamed from: b */
        public String f90134b;

        /* renamed from: c */
        public String f90135c;

        /* renamed from: d */
        public String f90136d;

        /* renamed from: e */
        public long f90137e;

        /* renamed from: f */
        public JSONObject f90138f;

        static {
            Covode.recordClassIndex(45639);
        }

        public C38160a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
            this.f90133a = context;
            this.f90134b = str;
            this.f90135c = str2;
            this.f90136d = str3;
            this.f90137e = j;
            this.f90138f = jSONObject;
        }
    }
}
