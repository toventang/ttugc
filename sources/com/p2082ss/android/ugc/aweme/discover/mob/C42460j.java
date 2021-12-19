package com.p2082ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.j */
public final class C42460j {

    /* renamed from: a */
    public static WeakHashMap<Integer, C67568r> f98983a = new WeakHashMap<>();

    /* renamed from: b */
    public static final C42461a f98984b = new C42461a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.j$a */
    public static final class C42461a {
        static {
            Covode.recordClassIndex(50410);
        }

        private C42461a() {
        }

        public /* synthetic */ C42461a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C67568r m84864a(View view) {
            C89219l.m154721d(view, "");
            C67568r rVar = (C67568r) C42459i.f98982a.mo62339b(view);
            if (rVar == null) {
                return C67568r.C67569a.m119673a();
            }
            return rVar;
        }

        /* renamed from: b */
        public static void m84866b(View view) {
            C89219l.m154721d(view, "");
            C42459i.f98982a.mo62338a(view);
            C42460j.f98983a.remove(Integer.valueOf(view.hashCode()));
        }

        /* renamed from: a */
        public static void m84865a(View view, C67568r rVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(rVar, "");
            C42459i.f98982a.mo62337a(view, rVar);
            C42460j.f98983a.put(Integer.valueOf(view.hashCode()), rVar);
        }
    }

    static {
        Covode.recordClassIndex(50409);
    }
}
