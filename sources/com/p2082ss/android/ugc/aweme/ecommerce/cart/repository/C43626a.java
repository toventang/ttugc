package com.p2082ss.android.ugc.aweme.ecommerce.cart.repository;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.api.C43644a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43641b;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43642c;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43321d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44867d;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88678au;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a */
public final class C43626a extends AbstractC20287b {

    /* renamed from: c */
    public static final C43626a f101693c = new C43626a();

    /* renamed from: d */
    public static final C43627a f101694d = new C43627a((byte) 0);

    /* renamed from: b */
    public final HashMap<String, C44867d> f101695b = new HashMap<>();

    /* renamed from: e */
    private final AbstractC89244h f101696e = C89250i.m154773a((AbstractC89171a) C43637e.f101715a);

    /* renamed from: f */
    private final AbstractC89244h f101697f = C89250i.m154773a((AbstractC89171a) C43638f.f101716a);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$a */
    public static final class C43627a {
        static {
            Covode.recordClassIndex(51885);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$a$a */
        public static final class C43628a extends C27895a<Map<String, Object>> {
            static {
                Covode.recordClassIndex(51886);
            }

            C43628a() {
            }
        }

        private C43627a() {
        }

        public /* synthetic */ C43627a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m86650a(HashMap<String, Object> hashMap) {
            Map map = null;
            try {
                C27910f fVar = new C27910f();
                Object obj = hashMap != null ? hashMap.get("entrance_info") : null;
                if (obj != null) {
                    map = (Map) fVar.mo46671a((String) obj, new C43628a().type);
                    if (map != null && map.containsKey("room_id")) {
                        Object obj2 = map.get("room_id");
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        map.put("source_content_id", obj2);
                    }
                    List<String> list = C43321d.m86440a().f101114b;
                    JSONObject jSONObject = new JSONObject();
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (list.contains(str)) {
                                jSONObject.put(str, value);
                            }
                        }
                    }
                    String jSONObject2 = jSONObject.toString();
                    C89219l.m154716b(jSONObject2, "");
                    return jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$d */
    static final class C43636d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C43636d f101714a = new C43636d();

        static {
            Covode.recordClassIndex(51894);
        }

        C43636d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$g */
    public final /* synthetic */ class RunnableC43639g implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f101717a;

        static {
            Covode.recordClassIndex(51897);
        }

        RunnableC43639g(AbstractC89171a aVar) {
            this.f101717a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f101717a.invoke(), "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$e */
    static final class C43637e extends AbstractC89220m implements AbstractC89171a<C43644a> {

        /* renamed from: a */
        public static final C43637e f101715a = new C43637e();

        static {
            Covode.recordClassIndex(51895);
        }

        C43637e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43644a invoke() {
            return new C43644a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$f */
    static final class C43638f extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C43638f f101716a = new C43638f();

        static {
            Covode.recordClassIndex(51896);
        }

        C43638f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(51884);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$c */
    static final class C43634c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C43626a f101710a;

        /* renamed from: b */
        final /* synthetic */ boolean f101711b = true;

        /* renamed from: c */
        final /* synthetic */ View f101712c;

        static {
            Covode.recordClassIndex(51892);
        }

        C43634c(C43626a aVar, View view) {
            this.f101710a = aVar;
            this.f101712c = view;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$c$a */
        static final class C43635a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ View f101713a;

            static {
                Covode.recordClassIndex(51893);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43635a(View view) {
                super(0);
                this.f101713a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String str;
                Resources resources;
                C23144b bVar = new C23144b(this.f101713a);
                Context context = this.f101713a.getContext();
                if (context == null || (resources = context.getResources()) == null) {
                    str = null;
                } else {
                    str = resources.getString(R.string.bip);
                }
                bVar.mo37635a(str).mo37637b();
                return C89391z.f203057a;
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            View view;
            if (this.f101711b && (view = this.f101712c) != null) {
                this.f101710a.mo74302a(new C43635a(view));
            }
        }
    }

    /* renamed from: a */
    public final void mo74302a(AbstractC89171a<C89391z> aVar) {
        ((Handler) this.f101697f.getValue()).post(new RunnableC43639g(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b */
    static final class C43629b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C43626a f101698a;

        /* renamed from: b */
        final /* synthetic */ View f101699b;

        /* renamed from: c */
        final /* synthetic */ View f101700c;

        /* renamed from: d */
        final /* synthetic */ boolean f101701d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f101702e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89183m f101703f;

        static {
            Covode.recordClassIndex(51887);
        }

        C43629b(C43626a aVar, View view, View view2, boolean z, AbstractC89172b bVar, AbstractC89183m mVar) {
            this.f101698a = aVar;
            this.f101699b = view;
            this.f101700c = view2;
            this.f101701d = z;
            this.f101702e = bVar;
            this.f101703f = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final View view;
            T t;
            final C43642c cVar = (C43642c) obj;
            C89219l.m154721d(cVar, "");
            if (cVar.isCodeOK()) {
                view = this.f101699b;
            } else {
                view = this.f101700c;
            }
            T t2 = cVar.data;
            if (!(t2 == null || t2.f101719b == null || view == null || (cVar.isCodeOK() && !this.f101701d))) {
                this.f101698a.mo74302a(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.C43626a.C43629b.C436301 */

                    /* renamed from: a */
                    final /* synthetic */ C43629b f101704a;

                    static {
                        Covode.recordClassIndex(51888);
                    }

                    {
                        this.f101704a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
                        if (((java.lang.Boolean) r2.invoke(r1)).booleanValue() != true) goto L_0x001a;
                     */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ p4600h.C89391z invoke() {
                        /*
                            r5 = this;
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b r0 = r5.f101704a
                            h.f.a.b r2 = r0.f101702e
                            if (r2 == 0) goto L_0x001a
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c r1 = r4
                            java.lang.String r0 = ""
                            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                            java.lang.Object r0 = r2.invoke(r1)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r1 = r0.booleanValue()
                            r0 = 1
                            if (r1 == r0) goto L_0x0030
                        L_0x001a:
                            android.view.View r4 = r2
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c r0 = r4
                            T r0 = r0.data
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.a r0 = (com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43640a) r0
                            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r3 = r0.f101719b
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$1 r2 = com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.C43626a.C43629b.C436301.C436311.f101707a
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$2 r1 = com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.C43626a.C43629b.C436301.C436322.f101708a
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$3 r0 = new com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$3
                            r0.<init>(r5)
                            com.p2082ss.android.ugc.aweme.ecommerce.common.C44316d.m87041a(r4, r3, r2, r1, r0)
                        L_0x0030:
                            h.z r0 = p4600h.C89391z.f203057a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.C43626a.C43629b.C436301.invoke():java.lang.Object");
                    }
                });
            }
            if (cVar.isCodeOK() || ((t = cVar.data) != null && t.f101719b != null)) {
                return cVar;
            }
            throw new RuntimeException("data error");
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<C43642c> mo74301a(C43641b bVar, View view, View view2, boolean z, AbstractC89183m<? super C43642c, ? super ButtonAction, Boolean> mVar, AbstractC89172b<? super C43642c, Boolean> bVar2) {
        C89219l.m154721d(bVar, "");
        AbstractC88979t<C43642c> a = C88678au.m153890a(((AbstractC20179a) this.f101696e.getValue()).mo33487c(bVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C43629b(this, view2, view, z, bVar2, mVar)).mo143264a(new C43634c(this, view)).mo143285c(C43636d.f101714a), C88678au.f201220e).mo143188f(C88446a.f200698d).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }
}
