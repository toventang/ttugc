package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.navigation.C22258g;
import com.bytedance.scene.p1622d.C22166g;
import com.bytedance.scene.p1622d.C22170j;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.i */
public final class C22217i {
    static {
        Covode.recordClassIndex(26023);
    }

    /* renamed from: com.bytedance.scene.i$a */
    public static final class C22218a {

        /* renamed from: a */
        public Bundle f52529a;

        /* renamed from: b */
        public boolean f52530b;

        /* renamed from: c */
        public boolean f52531c;

        /* renamed from: d */
        public int f52532d;

        /* renamed from: e */
        public boolean f52533e;

        /* renamed from: f */
        public AbstractC22231l f52534f;

        /* renamed from: g */
        public boolean f52535g;

        /* renamed from: h */
        private final Activity f52536h;

        /* renamed from: i */
        private final Class<? extends AbstractC22219j> f52537i;

        /* renamed from: j */
        private int f52538j;

        /* renamed from: k */
        private String f52539k;

        static {
            Covode.recordClassIndex(26024);
        }

        /* renamed from: a */
        public final AbstractC22233n mo36469a() {
            C22258g gVar = new C22258g(this.f52537i, this.f52529a);
            gVar.f52653c = this.f52530b;
            gVar.f52654d = this.f52531c;
            gVar.f52655e = this.f52538j;
            return C22217i.m41762a(this.f52536h, this.f52532d, gVar, this.f52534f, this.f52533e, this.f52539k, this.f52535g);
        }

        /* renamed from: a */
        public final C22218a mo36468a(String str) {
            this.f52539k = (String) C22171k.m41656a((Object) str, "Tag can't be null");
            return this;
        }

        private C22218a(Activity activity, Class<? extends AbstractC22219j> cls) {
            this.f52530b = true;
            this.f52531c = true;
            this.f52532d = 16908290;
            this.f52539k = "LifeCycleFragment";
            this.f52535g = true;
            this.f52536h = (Activity) C22171k.m41656a(activity, "Activity can't be null");
            this.f52537i = (Class) C22171k.m41656a(cls, "Root Scene class can't be null");
        }

        /* synthetic */ C22218a(Activity activity, Class cls, byte b) {
            this(activity, cls);
        }
    }

    /* renamed from: a */
    public static C22218a m41761a(Activity activity, Class<? extends AbstractC22219j> cls) {
        return new C22218a(activity, cls, (byte) 0);
    }

    /* renamed from: a */
    public static AbstractC22233n m41763a(Activity activity, C22258g gVar) {
        return m41762a(activity, 16908290, gVar, null, false, "LifeCycleFragment", true);
    }

    /* renamed from: a */
    public static AbstractC22233n m41762a(Activity activity, int i, C22258g gVar, AbstractC22231l lVar, boolean z, String str, boolean z2) {
        FragmentC22272u a;
        C22170j.m41654a();
        if (str != null) {
            C22173e.m41662a(activity, str);
            C22239d dVar = (C22239d) C22166g.m41650a(C22239d.class, gVar.mo36561a());
            if (!C22171k.m41661a(activity)) {
                return new C22157d(dVar);
            }
            dVar.f52595a = lVar;
            FragmentManager fragmentManager = activity.getFragmentManager();
            FragmentC22180f fVar = (FragmentC22180f) fragmentManager.findFragmentByTag(str);
            if (fVar != null && !z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(fVar);
                C22171k.m41659a(fragmentManager, beginTransaction, z2);
                fVar = null;
            }
            C22145b bVar = new C22145b(activity);
            if (fVar != null) {
                a = FragmentC22272u.m41942a(activity, str, false, z2);
                fVar.f52429b = new C22263p(i, bVar, dVar, a, z);
            } else {
                fVar = new FragmentC22180f();
                FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.add(i, fVar, str);
                dVar = dVar;
                a = FragmentC22272u.m41942a(activity, str, !z, z2);
                fVar.f52429b = new C22263p(i, bVar, dVar, a, z);
                C22171k.m41659a(fragmentManager, beginTransaction2, z2);
            }
            return new C22182g(activity, dVar, fVar, a, z2);
        }
        throw new IllegalArgumentException("tag cant be null");
    }
}
