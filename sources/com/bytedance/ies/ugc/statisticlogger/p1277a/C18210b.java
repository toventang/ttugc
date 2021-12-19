package com.bytedance.ies.ugc.statisticlogger.p1277a;

import android.app.Activity;
import android.util.Base64;
import com.bytedance.analytics.C2576a;
import com.bytedance.analytics.page.AbstractC2598c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17370e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.a.b */
public final class C18210b {

    /* renamed from: a */
    public static final C18210b f43392a = new C18210b();

    private C18210b() {
    }

    static {
        Covode.recordClassIndex(20867);
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a.b$b */
    public static final class C18212b implements AbstractC2598c<Activity> {
        static {
            Covode.recordClassIndex(20869);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.analytics.page.AbstractC2598c
        /* renamed from: a */
        public final /* synthetic */ C2576a mo7086a(Activity activity) {
            String encodeToString;
            T t;
            T t2;
            Activity activity2 = activity;
            C89219l.m154721d(activity2, "");
            C2576a.C2577a aVar = new C2576a.C2577a();
            aVar.mo7057a(String.valueOf(activity2.hashCode()));
            aVar.mo7056a(C2576a.EnumC2579c.Activity);
            if (activity2 instanceof AbstractC17370e) {
                Iterator<T> it = ((AbstractC17370e) activity2).provideBaseViewModel().getConfiguration().mo27699b().iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (t2 instanceof C18209a) {
                        break;
                    }
                }
                if (t2 instanceof C18209a) {
                    t = t2;
                }
                T t3 = t;
                if (t3 == null || t3.f43391a.length() == 0) {
                    String name = activity2.getClass().getName();
                    C89219l.m154716b(name, "");
                    Charset charset = C89338d.f202990a;
                    Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = name.getBytes(charset);
                    C89219l.m154716b(bytes, "");
                    encodeToString = Base64.encodeToString(bytes, 0);
                } else {
                    encodeToString = t3.f43391a;
                }
                C89219l.m154716b(encodeToString, "");
            } else {
                String name2 = activity2.getClass().getName();
                C89219l.m154716b(name2, "");
                Charset charset2 = C89338d.f202990a;
                Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes2 = name2.getBytes(charset2);
                C89219l.m154716b(bytes2, "");
                encodeToString = Base64.encodeToString(bytes2, 0);
                C89219l.m154716b(encodeToString, "");
            }
            aVar.mo7058b(encodeToString);
            return aVar.mo7055a();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a.b$a */
    public static final class C18211a extends AbstractC89220m implements AbstractC89183m<String, Map<String, ? extends String>, C89391z> {

        /* renamed from: a */
        public static final C18211a f43393a = new C18211a();

        static {
            Covode.recordClassIndex(20868);
        }

        C18211a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, ? extends String> map) {
            String str2 = str;
            Map<String, ? extends String> map2 = map;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map2, "");
            if (str2.length() == 0) {
                C39162r.m79460a("btm_page_show", (Map<String, String>) map2);
            } else {
                C39162r.m79460a(str2, (Map<String, String>) map2);
            }
            return C89391z.f203057a;
        }
    }
}
