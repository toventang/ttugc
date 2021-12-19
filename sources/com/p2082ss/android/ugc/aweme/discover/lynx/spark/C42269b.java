package com.p2082ss.android.ugc.aweme.discover.lynx.spark;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15506b;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.lynx.hybrid.AbstractC21195h;
import com.bytedance.lynx.hybrid.C21217l;
import com.bytedance.lynx.hybrid.C21218m;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42246j;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42213c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b.C42275b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41543o;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b */
public final class C42269b {

    /* renamed from: a */
    public static final C42269b f98476a = new C42269b();

    private C42269b() {
    }

    /* renamed from: a */
    public static boolean m84623a(View view) {
        if (view == null) {
            return true;
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
        }
        if (!(context instanceof AbstractC1204m)) {
            return false;
        }
        AbstractC1196i lifecycle = ((AbstractC1204m) context).getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(50211);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b$b */
    public static final class C42271b implements AbstractC15506b {

        /* renamed from: a */
        final /* synthetic */ TemplateData f98483a;

        static {
            Covode.recordClassIndex(50213);
        }

        C42271b(TemplateData templateData) {
            this.f98483a = templateData;
        }

        @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15506b
        /* renamed from: a */
        public final void mo25247a(AbstractC21195h hVar) {
            C89219l.m154721d(hVar, "");
            if (hVar instanceof C21217l) {
                C21217l lVar = (C21217l) hVar;
                lVar.f50351l = C41543o.m83481a();
                lVar.f50350k = this.f98483a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b$d */
    static final class C42273d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C21218m f98486a;

        static {
            Covode.recordClassIndex(50215);
        }

        C42273d(C21218m mVar) {
            this.f98486a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f98486a.updateData((TemplateData) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b$a */
    public static final class C42270a extends AbstractC15507c {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f98477a;

        /* renamed from: b */
        final /* synthetic */ C42246j f98478b;

        /* renamed from: c */
        final /* synthetic */ C42261b f98479c;

        /* renamed from: d */
        final /* synthetic */ AbstractC15507c f98480d;

        /* renamed from: e */
        final /* synthetic */ C42345d f98481e;

        /* renamed from: f */
        final /* synthetic */ Map f98482f;

        static {
            Covode.recordClassIndex(50212);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            C89219l.m154721d(hVar, "");
            super.mo25381a(hVar);
            T t = this.f98477a.element;
            if (t != null) {
                C2688c.m7778a(1, "SparkLoadHelper", "continue preload succeed:" + ((Object) this.f98477a.element));
                C42269b.m84621a(this.f98478b, t, this.f98479c, this.f98480d, this.f98481e, this.f98482f);
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo34719a(AbstractC21154h hVar, String str, String str2) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            super.mo34719a(hVar, str, str2);
            C2688c.m7778a(1, "SparkLoadHelper", "continue preload failed:" + ((Object) this.f98477a.element));
            C42269b.m84622a(this.f98479c, this.f98478b, this.f98481e, this.f98482f, this.f98480d);
        }

        public C42270a(C89233z.C89238e eVar, C42246j jVar, C42261b bVar, AbstractC15507c cVar, C42345d dVar, Map map) {
            this.f98477a = eVar;
            this.f98478b = jVar;
            this.f98479c = bVar;
            this.f98480d = cVar;
            this.f98481e = dVar;
            this.f98482f = map;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b$c */
    static final class C42272c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ Map f98484a = null;

        /* renamed from: b */
        final /* synthetic */ C42345d f98485b;

        static {
            Covode.recordClassIndex(50214);
        }

        C42272c(C42345d dVar) {
            this.f98485b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            if (this.f98484a != null) {
                TemplateData a = TemplateData.m56771a(this.f98485b.getRawData());
                C89219l.m154716b(a, "");
                return C42269b.m84616a(a, this.f98484a);
            }
            TemplateData a2 = TemplateData.m56771a(this.f98485b.getRawData());
            C89219l.m154716b(a2, "");
            return a2;
        }
    }

    /* renamed from: a */
    public static TemplateData m84616a(TemplateData templateData, Map<String, ? extends Object> map) {
        C89219l.m154721d(templateData, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            templateData.mo48812a(next, jSONObject.get(next));
        }
        return templateData;
    }

    /* renamed from: a */
    public static void m84619a(C21218m mVar, C42345d dVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        AbstractC88924h.m154135a(dVar.getRawData()).mo143205b(new C42272c(dVar)).mo143204b(C88925a.m154160a(C88946a.f201990b)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143202b(new C42273d(mVar));
    }

    /* renamed from: a */
    private static void m84620a(C21218m mVar, C42345d dVar, Map<String, ? extends Object> map) {
        TemplateData a;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        if (map != null) {
            TemplateData a2 = TemplateData.m56771a(dVar.getRawData());
            C89219l.m154716b(a2, "");
            a = m84616a(a2, map);
        } else {
            a = TemplateData.m56771a(dVar.getRawData());
            C89219l.m154716b(a, "");
        }
        mVar.updateData(a);
    }

    /* renamed from: a */
    private static void m84617a(C15593c cVar, C42345d dVar, Map<String, ? extends Object> map, AbstractC15507c cVar2) {
        TemplateData templateData;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar2, "");
        if (C80538hl.m139614a(dVar.getRawData())) {
            templateData = m84616a(TemplateData.m56771a(dVar.getRawData()), map);
        } else {
            templateData = null;
        }
        String schema = dVar.getSchema();
        C89219l.m154716b(schema, "");
        m84618a(cVar, schema, templateData, cVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if ((r1 instanceof com.lynx.tasm.LynxView) != false) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m84618a(com.bytedance.hybrid.spark.page.C15593c r4, java.lang.String r5, com.lynx.tasm.TemplateData r6, com.bytedance.hybrid.spark.p1107a.AbstractC15507c r7) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42269b.m84618a(com.bytedance.hybrid.spark.page.c, java.lang.String, com.lynx.tasm.TemplateData, com.bytedance.hybrid.spark.a.c):void");
    }

    /* renamed from: a */
    public static void m84622a(C42261b bVar, C42246j jVar, C42345d dVar, Map<String, ? extends Object> map, AbstractC15507c cVar) {
        C2688c.m7778a(1, "SparkLoadHelper", "normalLoad");
        if (m84623a(bVar)) {
            new C42213c().mo71412a("spark_container_destroyed").mo71415b(dVar.getSchema()).mo96792f();
        } else if (!bVar.mo71459c()) {
            new C42213c().mo71412a("spark_view_miss").mo71415b(dVar.getSchema()).mo96792f();
        } else {
            View hybirdContainerView = bVar.getHybirdContainerView();
            Objects.requireNonNull(hybirdContainerView, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkView");
            jVar.f98426a = false;
            m84617a((C15593c) hybirdContainerView, dVar, map, cVar);
        }
    }

    /* renamed from: a */
    public static void m84621a(C42246j jVar, C42275b bVar, C42261b bVar2, AbstractC15507c cVar, C42345d dVar, Map<String, ? extends Object> map) {
        jVar.f98426a = true;
        C15593c cVar2 = bVar.f98489b;
        try {
            bVar2.mo71456a(cVar2);
            View childAt = cVar2.getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            C21218m mVar = (C21218m) childAt;
            m84620a(mVar, dVar, map);
            cVar.mo25381a(mVar);
        } catch (Exception e) {
            new C42213c().mo71415b(dVar.getSchema()).mo71412a("spark_replace_error").mo71416c(e.getMessage()).mo96792f();
            C2688c.m7778a(4, "SparkLoadHelper", e.toString());
        }
    }
}
