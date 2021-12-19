package com.p2082ss.android.ugc.aweme.discover.lynx.spark.container;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.alog.C2688c;
import com.bytedance.bridge.magpie.C13427b;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.lynx.hybrid.C21218m;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.discover.lynx.C42184a;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42201a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42269b;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42289d;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.container.p2786a.AbstractC42287a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.container.a */
public final class C42284a implements AbstractC42208f {

    /* renamed from: i */
    public static final C42285a f98507i = new C42285a((byte) 0);

    /* renamed from: a */
    public C42289d f98508a;

    /* renamed from: b */
    public AbstractC15507c f98509b;

    /* renamed from: c */
    ArrayMap<String, JSONObject> f98510c;

    /* renamed from: d */
    ArrayList<Object> f98511d;

    /* renamed from: e */
    ArrayList<AbstractC42287a> f98512e;

    /* renamed from: f */
    public ArrayList<AbstractC42265a> f98513f;

    /* renamed from: g */
    public ArrayList<AbstractC88412b> f98514g;

    /* renamed from: h */
    public final AbstractC1204m f98515h;

    /* renamed from: j */
    private C15593c f98516j;

    static {
        Covode.recordClassIndex(50227);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.container.a$a */
    public static final class C42285a {
        static {
            Covode.recordClassIndex(50228);
        }

        private C42285a() {
        }

        public /* synthetic */ C42285a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    public final View getRealView() {
        return this.f98516j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo71473a() {
        if (this.f98508a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo71474b() {
        this.f98510c.clear();
        this.f98511d.clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.container.a$b */
    public static final class C42286b extends AbstractC15507c {

        /* renamed from: a */
        final /* synthetic */ C42284a f98517a;

        static {
            Covode.recordClassIndex(50229);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: c */
        public final void mo25385c() {
            C2688c.m7778a(1, "SparkViewContainer", "onDestroy");
            AbstractC15507c cVar = this.f98517a.f98509b;
            if (cVar != null) {
                cVar.mo25385c();
            }
            this.f98517a.mo71474b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42286b(C42284a aVar) {
            this.f98517a = aVar;
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            C21218m a;
            C89219l.m154721d(hVar, "");
            C2688c.m7778a(1, "SparkViewContainer", "onLoadFinish".concat(String.valueOf(hVar)));
            this.f98517a.f98508a = C42289d.C42290a.m84653a(hVar);
            C42284a aVar = this.f98517a;
            C2688c.m7778a(1, "SparkViewContainer", "handleAllPendingIfHave: events:" + aVar.f98510c + " and updates:" + aVar.f98511d);
            for (Map.Entry<String, JSONObject> entry : aVar.f98510c.entrySet()) {
                String key = entry.getKey();
                C89219l.m154716b(key, "");
                JSONObject value = entry.getValue();
                C89219l.m154716b(value, "");
                aVar.mo71404a(key, value);
            }
            for (T t : aVar.f98511d) {
                if (t instanceof TemplateData) {
                    T t2 = t;
                    C89219l.m154721d(t2, "");
                    if (aVar.mo71473a()) {
                        C42289d dVar = aVar.f98508a;
                        if (dVar == null) {
                            C89219l.m154715b();
                        }
                        dVar.mo71477a().updateData((TemplateData) t2);
                    } else {
                        aVar.f98511d.add(t2);
                        C42284a.m84638a("updateData:".concat(String.valueOf(t2)));
                    }
                }
                if (t instanceof String) {
                    aVar.mo71406b(t);
                }
            }
            aVar.mo71474b();
            for (T t3 : aVar.f98512e) {
                C42289d dVar2 = aVar.f98508a;
                if (dVar2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(dVar2, "");
                C42289d dVar3 = t3.f98518a;
                if (!(dVar3 == null || (a = dVar3.mo71477a()) == null)) {
                    a.removeOnAttachStateChangeListener(t3.f98519b);
                }
                dVar2.mo71477a().addOnAttachStateChangeListener(t3.f98519b);
                C89219l.m154721d(dVar2, "");
                t3.f98518a = dVar2;
            }
            C42289d dVar4 = aVar.f98508a;
            if (dVar4 == null) {
                C89219l.m154715b();
            }
            C13427b bVar = (C13427b) dVar4.mo71477a().getHybridContext().mo34746a(C13427b.class);
            if (bVar != null) {
                for (T t4 : aVar.f98513f) {
                    C13431b bVar2 = new C13431b();
                    bVar2.mo21654a(t4.mo71463a());
                    bVar2.mo21655b("");
                    bVar2.mo21653a(C13431b.EnumC13432a.PUBLIC);
                    bVar2.f32749e = false;
                    bVar2.f32748d = new AbstractC42265a.C42267b(t4);
                    bVar.mo21646a(bVar2);
                }
            }
            AbstractC15507c cVar = this.f98517a.f98509b;
            if (cVar != null) {
                cVar.mo25381a(hVar);
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25382a(AbstractC21154h hVar, String str) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            C2688c.m7778a(1, "SparkViewContainer", "onLoadStart:".concat(String.valueOf(str)));
            AbstractC15507c cVar = this.f98517a.f98509b;
            if (cVar != null) {
                cVar.mo25382a(hVar, str);
            }
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: b */
        public final void mo25384b(AbstractC21154h hVar, String str) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            C2688c.m7778a(1, "SparkViewContainer", "onLoadFailed".concat(String.valueOf(str)));
            AbstractC15507c cVar = this.f98517a.f98509b;
            if (cVar != null) {
                cVar.mo25384b(hVar, str);
            }
            this.f98517a.mo71474b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71402a(C42345d dVar) {
        C89219l.m154721d(dVar, "");
        mo71474b();
        this.f98508a = null;
        C15593c cVar = this.f98516j;
        String schema = dVar.getSchema();
        C89219l.m154716b(schema, "");
        C42269b.m84618a(cVar, schema, (TemplateData) null, new C42286b(this));
    }

    /* renamed from: a */
    static void m84638a(String str) {
        C2688c.m7778a(4, "SparkViewContainer", "lynx view is not already when " + str + ' ' + "\nyou can use setOnLoadListener and wait it load fished then continue your operate is recommended");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: b */
    public final void mo71406b(String str) {
        C89219l.m154721d(str, "");
        if (mo71473a()) {
            C42289d dVar = this.f98508a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.mo71477a().updateData(str);
            return;
        }
        this.f98511d.add(str);
        m84638a("updateData:".concat(String.valueOf(str)));
    }

    public C42284a(AbstractC1204m mVar) {
        Context context;
        C89219l.m154721d(mVar, "");
        this.f98515h = mVar;
        mVar.getLifecycle().mo4012a(new SingleSparkView$1(this));
        if (mVar instanceof Fragment) {
            context = ((Fragment) mVar).requireContext();
            C89219l.m154716b(context, "");
        } else {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type android.content.Context");
            context = (Context) mVar;
        }
        this.f98516j = C42184a.m84438b(context);
        this.f98510c = new ArrayMap<>();
        this.f98511d = new ArrayList<>();
        this.f98512e = new ArrayList<>();
        this.f98513f = new ArrayList<>();
        this.f98514g = new ArrayList<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71405a(List<C42201a> list) {
        C89219l.m154721d(list, "");
        mo71402a(list.get(0).f98365b);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71400a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(layoutParams, "");
        AbstractC42208f.C42209a.m84487a(this, viewGroup, 0, layoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f
    /* renamed from: a */
    public final void mo71404a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (mo71473a()) {
            C42289d dVar = this.f98508a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.mo71478a(str, jSONObject);
            return;
        }
        this.f98510c.put(str, jSONObject);
        m84638a("sendEvent:" + str + ' ' + jSONObject);
    }
}
