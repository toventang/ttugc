package com.p2082ss.android.ugc.aweme.discover.lynx.p2779a;

import android.content.Context;
import android.content.MutableContextWrapper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42289d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41543o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.b */
public final class C42186b {

    /* renamed from: a */
    public ActivityC0945e f98319a;

    /* renamed from: b */
    public AbstractC16208i f98320b;

    /* renamed from: c */
    public String f98321c;

    /* renamed from: d */
    public LynxView f98322d;

    /* renamed from: e */
    public boolean f98323e;

    /* renamed from: f */
    public boolean f98324f;

    /* renamed from: g */
    public Integer f98325g;

    /* renamed from: h */
    public C42345d f98326h;

    /* renamed from: i */
    public Map<String, ? extends Object> f98327i;

    /* renamed from: j */
    public boolean f98328j;

    /* renamed from: k */
    public boolean f98329k;

    /* renamed from: l */
    public boolean f98330l;

    /* renamed from: m */
    public final AbstractC89244h f98331m;

    /* renamed from: n */
    public AbstractC42199a f98332n;

    /* renamed from: o */
    public Object f98333o;

    /* renamed from: p */
    public int f98334p;

    /* renamed from: q */
    public C42289d f98335q;

    /* renamed from: r */
    public final C42261b f98336r;

    /* renamed from: s */
    private List<AbstractC16191p> f98337s;

    /* renamed from: t */
    private final AbstractC89244h f98338t;

    static {
        Covode.recordClassIndex(50125);
    }

    /* renamed from: a */
    public final C42192d mo71385a() {
        return (C42192d) this.f98338t.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.b$b */
    public static final class C42188b implements AbstractC16191p {

        /* renamed from: a */
        final /* synthetic */ AbstractC16191p f98340a;

        /* renamed from: b */
        final /* synthetic */ C42186b f98341b;

        /* renamed from: c */
        private final String f98342c;

        /* renamed from: d */
        private final Object f98343d;

        static {
            Covode.recordClassIndex(50127);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f98342c;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f98343d;
        }

        C42188b(AbstractC16191p pVar, C42186b bVar) {
            JSONObject jSONObject;
            this.f98340a = pVar;
            this.f98341b = bVar;
            this.f98342c = pVar.mo25699a();
            if (bVar.f98324f) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", pVar.mo25700b());
                jSONObject2.put("code", 1);
                jSONObject2.put("reactId", bVar.f98321c);
                jSONObject = jSONObject2;
            } else {
                jSONObject = pVar.mo25700b();
            }
            this.f98343d = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.b$d */
    public static final class C42190d implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f98345a;

        /* renamed from: b */
        final /* synthetic */ String f98346b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f98347c;

        /* renamed from: d */
        private final String f98348d;

        static {
            Covode.recordClassIndex(50129);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f98348d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f98345a;
        }

        C42190d(String str, JSONObject jSONObject) {
            this.f98346b = str;
            this.f98347c = jSONObject;
            this.f98348d = str;
            this.f98345a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.b$a */
    static final class C42187a extends AbstractC89220m implements AbstractC89171a<C42185a> {

        /* renamed from: a */
        public static final C42187a f98339a = new C42187a();

        static {
            Covode.recordClassIndex(50126);
        }

        C42187a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42185a invoke() {
            return new C42185a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.b$c */
    static final class C42189c extends AbstractC89220m implements AbstractC89171a<C42192d> {

        /* renamed from: a */
        public static final C42189c f98344a = new C42189c();

        static {
            Covode.recordClassIndex(50128);
        }

        C42189c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42192d invoke() {
            return new C42192d();
        }
    }

    /* renamed from: b */
    public final void mo71387b() {
        this.f98320b = null;
        this.f98321c = null;
        this.f98335q = null;
    }

    /* renamed from: c */
    public final void mo71388c() {
        if (this.f98320b != null && this.f98321c != null) {
            Iterator<T> it = this.f98337s.iterator();
            while (it.hasNext()) {
                C42188b bVar = new C42188b(it.next(), this);
                AbstractC16208i iVar = this.f98320b;
                if (iVar != null) {
                    iVar.onEvent(bVar);
                }
            }
            this.f98337s.clear();
        }
    }

    public C42186b(C42261b bVar) {
        Context context;
        C89219l.m154721d(bVar, "");
        this.f98336r = bVar;
        Context context2 = bVar.getContext();
        ActivityC0945e eVar = null;
        ActivityC0945e eVar2 = (ActivityC0945e) (!(context2 instanceof ActivityC0945e) ? null : context2);
        if (eVar2 == null) {
            Context context3 = bVar.getContext();
            MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) (!(context3 instanceof MutableContextWrapper) ? null : context3);
            if (mutableContextWrapper != null) {
                context = mutableContextWrapper.getBaseContext();
            } else {
                context = null;
            }
            eVar2 = context instanceof ActivityC0945e ? context : eVar;
        }
        this.f98319a = eVar2;
        this.f98323e = true;
        this.f98337s = new ArrayList();
        this.f98328j = C41543o.m83481a();
        this.f98331m = C89250i.m154773a((AbstractC89171a) C42187a.f98339a);
        this.f98338t = C89250i.m154773a((AbstractC89171a) C42189c.f98344a);
    }

    /* renamed from: a */
    public final void mo71386a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (this.f98336r.mo71458b()) {
            C42289d dVar = this.f98335q;
            if (dVar != null) {
                dVar.mo71478a(str, jSONObject);
                return;
            }
            return;
        }
        this.f98337s.add(new C42190d(str, jSONObject));
        mo71388c();
    }
}
