package com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b;

import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.discover.lynx.C42184a;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42246j;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.EnumC42198c;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42269b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.c */
public final class C42276c {

    /* renamed from: a */
    public static final ArrayMap<C15593c, AbstractC15507c> f98491a = new ArrayMap<>();

    /* renamed from: b */
    public static final C42276c f98492b = new C42276c();

    /* renamed from: c */
    private static final AbstractC89244h f98493c = C89250i.m154773a((AbstractC89171a) C42277a.f98495a);

    /* renamed from: d */
    private static final AbstractC89244h f98494d = C89250i.m154773a((AbstractC89171a) C42279c.f98500a);

    /* renamed from: a */
    public static ArrayMap<String, C42275b> m84629a() {
        return (ArrayMap) f98493c.getValue();
    }

    /* renamed from: b */
    public static ArrayMap<String, C42275b> m84632b() {
        return (ArrayMap) f98494d.getValue();
    }

    private C42276c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.c$a */
    static final class C42277a extends AbstractC89220m implements AbstractC89171a<ArrayMap<String, C42275b>> {

        /* renamed from: a */
        public static final C42277a f98495a = new C42277a();

        static {
            Covode.recordClassIndex(50219);
        }

        C42277a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayMap<String, C42275b> invoke() {
            return new ArrayMap(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.c$c */
    static final class C42279c extends AbstractC89220m implements AbstractC89171a<ArrayMap<String, C42275b>> {

        /* renamed from: a */
        public static final C42279c f98500a = new C42279c();

        static {
            Covode.recordClassIndex(50221);
        }

        C42279c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayMap<String, C42275b> invoke() {
            return new ArrayMap(4);
        }
    }

    static {
        Covode.recordClassIndex(50218);
    }

    /* renamed from: a */
    public static C42275b m84630a(String str) {
        C89219l.m154721d(str, "");
        String a = C42246j.C42247a.m84556a(str);
        C42275b bVar = m84632b().get(a);
        if (bVar == null) {
            return m84629a().get(a);
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.c$b */
    public static final class C42278b extends AbstractC15507c {

        /* renamed from: a */
        final /* synthetic */ String f98496a;

        /* renamed from: b */
        final /* synthetic */ C42275b f98497b;

        /* renamed from: c */
        final /* synthetic */ boolean f98498c = false;

        /* renamed from: d */
        final /* synthetic */ String f98499d;

        static {
            Covode.recordClassIndex(50220);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            C89219l.m154721d(hVar, "");
            C2688c.m7778a(1, "SparkPreloadHelper", "tryPreload by spark succeed:" + this.f98496a);
            this.f98497b.mo71467a(EnumC42198c.SUCCEED);
            if (!C42274a.m84627a()) {
                C42276c.m84631a(this.f98498c, this.f98499d, this.f98497b);
                return;
            }
            AbstractC15507c remove = C42276c.f98491a.remove(this.f98497b.f98489b);
            if (remove != null) {
                remove.mo25381a(hVar);
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo34719a(AbstractC21154h hVar, String str, String str2) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            super.mo34719a(hVar, str, str2);
            C2688c.m7778a(1, "SparkPreloadHelper", "tryPreload by spark failed:" + this.f98496a);
            if (C42274a.m84627a()) {
                this.f98497b.mo71467a(EnumC42198c.FAILED);
                AbstractC15507c remove = C42276c.f98491a.remove(this.f98497b.f98489b);
                if (remove != null) {
                    remove.mo34719a(hVar, str, str2);
                }
            }
        }

        C42278b(String str, C42275b bVar, boolean z, String str2) {
            this.f98496a = str;
            this.f98497b = bVar;
            this.f98499d = str2;
        }
    }

    /* renamed from: a */
    public static void m84631a(boolean z, String str, C42275b bVar) {
        C2688c.m7778a(1, "SparkPreloadHelper", "cacheSparkView:".concat(String.valueOf(str)));
        if (z) {
            m84632b().put(str, bVar);
        } else {
            m84629a().put(str, bVar);
        }
    }

    /* renamed from: a */
    public void mo71471a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C2688c.m7778a(1, "SparkPreloadHelper", "tryPreload by spark:".concat(String.valueOf(str)));
        String a = C42246j.C42247a.m84556a(str);
        C15593c b = C42184a.m84438b(context);
        if (str2 == null) {
            str2 = "";
        }
        TemplateData a2 = TemplateData.m56771a(str2);
        a2.mo48812a("isPreload", true);
        C89219l.m154716b(a2, "");
        C42275b bVar = new C42275b(a, b, EnumC42198c.LOADING);
        if (C42274a.m84627a()) {
            m84631a(false, a, bVar);
        }
        C42269b.m84618a(b, str, a2, new C42278b(str, bVar, false, a));
    }
}
