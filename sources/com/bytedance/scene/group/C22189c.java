package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22284y;
import com.bytedance.scene.EnumC22282w;
import com.bytedance.scene.p1617a.AbstractC22128c;
import com.bytedance.scene.p1620b.C22146a;
import com.bytedance.scene.p1622d.C22160b;
import com.bytedance.scene.p1622d.C22168h;
import com.bytedance.scene.p1622d.C22171k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.scene.group.c */
public final class C22189c {

    /* renamed from: d */
    public static final HashMap<AbstractC22219j, C22160b> f52455d = new HashMap<>();

    /* renamed from: e */
    static final Runnable f52456e = new Runnable() {
        /* class com.bytedance.scene.group.C22189c.RunnableC221901 */

        static {
            Covode.recordClassIndex(25996);
        }

        public final void run() {
        }
    };

    /* renamed from: a */
    public final AbstractC22186b f52457a;

    /* renamed from: b */
    public ViewGroup f52458b;

    /* renamed from: c */
    public final C22185a f52459c = new C22185a();

    /* renamed from: f */
    boolean f52460f = false;

    /* renamed from: g */
    List<AbstractC22203d> f52461g = new ArrayList();

    /* renamed from: h */
    private final Handler f52462h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private final Set<C0692e<AbstractC22219j, String>> f52463i = new HashSet();

    /* renamed from: a */
    private List<AbstractC22219j> m41717a() {
        return this.f52459c.mo36383a();
    }

    /* renamed from: b */
    private List<GroupRecord> m41720b() {
        return Collections.unmodifiableList(this.f52459c.f52446a);
    }

    static {
        Covode.recordClassIndex(25995);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$5 */
    public static /* synthetic */ class C221945 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52470a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 26000(0x6590, float:3.6434E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.scene.w[] r0 = com.bytedance.scene.EnumC22282w.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.scene.group.C22189c.C221945.f52470a = r2
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.NONE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.scene.group.C22189c.C221945.f52470a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.VIEW_CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.scene.group.C22189c.C221945.f52470a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.ACTIVITY_CREATED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.scene.group.C22189c.C221945.f52470a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.STARTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.scene.group.C22189c.C221945.f52470a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.RESUMED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.C22189c.C221945.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final GroupRecord mo36434d(AbstractC22219j jVar) {
        return this.f52459c.mo36381a(jVar);
    }

    /* renamed from: h */
    private static AbstractC22284y m41721h(AbstractC22219j jVar) {
        while (jVar != null) {
            if (jVar instanceof AbstractC22284y) {
                return (AbstractC22284y) jVar;
            }
            jVar = jVar.f52551o;
            if (jVar == null) {
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo36435e(AbstractC22219j jVar) {
        return this.f52459c.mo36381a(jVar).f52438a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo36436f(AbstractC22219j jVar) {
        return this.f52459c.mo36381a(jVar).f52440c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$e */
    public final class C22204e extends AbstractC22201c {

        /* renamed from: a */
        public final View f52496a;

        /* renamed from: b */
        public final ViewGroup f52497b;

        /* renamed from: c */
        public int f52498c;

        /* renamed from: o */
        private final AbstractC22128c f52500o;

        /* renamed from: p */
        private final boolean f52501p;

        /* renamed from: q */
        private boolean f52502q;

        static {
            Covode.recordClassIndex(26010);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: a */
        public final void mo36442a(boolean z) {
            super.mo36442a(z);
            if (z && this.f52502q) {
                this.f52498c = this.f52496a.getVisibility();
                this.f52496a.setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            r3 = r4.f52500o.mo36321a();
         */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36446b(boolean r5) {
            /*
                r4 = this;
                super.mo36446b(r5)
                if (r5 != 0) goto L_0x0006
                return
            L_0x0006:
                boolean r0 = r4.f52501p
                if (r0 != 0) goto L_0x000b
                return
            L_0x000b:
                com.bytedance.scene.a.c r0 = r4.f52500o
                com.bytedance.scene.a.b r3 = r0.mo36321a()
                if (r3 != 0) goto L_0x0014
                return
            L_0x0014:
                android.view.ViewGroup r0 = r4.f52497b
                if (r0 == 0) goto L_0x0029
                android.view.View r0 = r4.f52496a
                int r0 = r0.getWidth()
                if (r0 == 0) goto L_0x0028
                android.view.View r0 = r4.f52496a
                int r0 = r0.getHeight()
                if (r0 != 0) goto L_0x0029
            L_0x0028:
                return
            L_0x0029:
                com.bytedance.scene.group.c$e$1 r0 = new com.bytedance.scene.group.c$e$1
                r0.<init>()
                r3.mo36315a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.C22189c.f52455d
                com.bytedance.scene.j r1 = r4.f52490i
                com.bytedance.scene.group.c$e$2 r0 = new com.bytedance.scene.group.c$e$2
                r0.<init>(r3)
                r2.put(r1, r0)
                android.view.ViewGroup r1 = r4.f52497b
                android.view.View r0 = r4.f52496a
                r1.startViewTransition(r0)
                android.view.View r0 = r4.f52496a
                r3.mo36314a(r0)
                r0 = 1
                r4.f52502q = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.C22189c.C22204e.mo36446b(boolean):void");
        }

        private C22204e(AbstractC22219j jVar, AbstractC22128c cVar) {
            super(jVar, -1, null, EnumC22282w.NONE, false, false, true);
            boolean z;
            this.f52500o = cVar;
            if (jVar.f52550n == null || jVar.f52550n.getParent() == null) {
                z = false;
            } else {
                z = true;
            }
            this.f52501p = z;
            if (z) {
                View view = jVar.f52550n;
                this.f52496a = view;
                this.f52497b = (ViewGroup) view.getParent();
                return;
            }
            this.f52496a = null;
            this.f52497b = null;
        }

        /* synthetic */ C22204e(C22189c cVar, AbstractC22219j jVar, AbstractC22128c cVar2, byte b) {
            this(jVar, cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$f */
    public final class C22207f extends AbstractC22201c {

        /* renamed from: b */
        private final AbstractC22128c f52507b;

        static {
            Covode.recordClassIndex(26013);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: b */
        public final void mo36446b(boolean z) {
            super.mo36446b(z);
            if (this.f52490i.f52550n != null) {
                C22189c.m41719a(this.f52490i, 0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            r3 = r5.f52507b.mo36321a();
         */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36442a(boolean r6) {
            /*
                r5 = this;
                super.mo36442a(r6)
                if (r6 != 0) goto L_0x0006
                return
            L_0x0006:
                com.bytedance.scene.j r0 = r5.f52490i
                android.view.View r4 = r0.f52550n
                if (r4 != 0) goto L_0x000d
                return
            L_0x000d:
                com.bytedance.scene.a.c r0 = r5.f52507b
                com.bytedance.scene.a.b r3 = r0.mo36321a()
                if (r3 != 0) goto L_0x0016
                return
            L_0x0016:
                com.bytedance.scene.group.c$f$1 r0 = new com.bytedance.scene.group.c$f$1
                r0.<init>()
                r3.mo36315a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.C22189c.f52455d
                com.bytedance.scene.j r1 = r5.f52490i
                com.bytedance.scene.group.c$f$2 r0 = new com.bytedance.scene.group.c$f$2
                r0.<init>(r3)
                r2.put(r1, r0)
                r3.mo36314a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.C22189c.C22207f.mo36442a(boolean):void");
        }

        private C22207f(AbstractC22219j jVar, AbstractC22128c cVar) {
            super(jVar, -1, null, C22189c.m41716a(EnumC22282w.RESUMED, C22189c.this.f52457a.f52553q), true, false, false);
            this.f52507b = cVar;
        }

        /* synthetic */ C22207f(C22189c cVar, AbstractC22219j jVar, AbstractC22128c cVar2, byte b) {
            this(jVar, cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$g */
    public final class C22210g extends AbstractC22201c {
        static {
            Covode.recordClassIndex(26016);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: a */
        public final void mo36442a(boolean z) {
            super.mo36442a(z);
            if (this.f52490i.f52550n != null && this.f52493l) {
                C22189c.m41719a(this.f52490i, 8);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: b */
        public final void mo36446b(boolean z) {
            super.mo36446b(z);
            if (this.f52490i.f52550n != null && this.f52492k) {
                C22189c.m41719a(this.f52490i, 0);
            }
        }

        C22210g(AbstractC22219j jVar, int i, String str, EnumC22282w wVar, boolean z, boolean z2, boolean z3) {
            super(jVar, i, str, wVar, z, z2, z3);
        }
    }

    /* renamed from: a */
    static C22195a m41715a(List<AbstractC22203d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC22203d dVar = list.get(size);
            if (dVar instanceof C22195a) {
                return (C22195a) dVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo36437g(AbstractC22219j jVar) {
        List<GroupRecord> b = m41720b();
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).f52439b == jVar) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$a */
    public final class C22195a extends AbstractC22201c {

        /* renamed from: a */
        final int f52471a;

        /* renamed from: b */
        final String f52472b;

        /* renamed from: c */
        final AbstractC22128c f52473c;

        static {
            Covode.recordClassIndex(26001);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = r5.f52473c.mo36321a();
         */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36442a(boolean r6) {
            /*
                r5 = this;
                super.mo36442a(r6)
                if (r6 != 0) goto L_0x0006
                return
            L_0x0006:
                com.bytedance.scene.a.c r0 = r5.f52473c
                com.bytedance.scene.a.b r4 = r0.mo36321a()
                if (r4 != 0) goto L_0x000f
                return
            L_0x000f:
                com.bytedance.scene.j r0 = r5.f52490i
                android.view.View r3 = r0.f52550n
                if (r3 != 0) goto L_0x0016
                return
            L_0x0016:
                com.bytedance.scene.group.c$a$1 r0 = new com.bytedance.scene.group.c$a$1
                r0.<init>()
                r4.mo36315a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.C22189c.f52455d
                com.bytedance.scene.j r1 = r5.f52490i
                com.bytedance.scene.group.c$a$2 r0 = new com.bytedance.scene.group.c$a$2
                r0.<init>(r4)
                r2.put(r1, r0)
                r4.mo36314a(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.C22189c.C22195a.mo36442a(boolean):void");
        }

        private C22195a(int i, AbstractC22219j jVar, String str, AbstractC22128c cVar) {
            super(jVar, i, str, C22189c.m41716a(EnumC22282w.RESUMED, C22189c.this.f52457a.f52553q), true, false, false);
            this.f52471a = i;
            this.f52472b = str;
            this.f52473c = cVar;
        }

        /* synthetic */ C22195a(C22189c cVar, int i, AbstractC22219j jVar, String str, AbstractC22128c cVar2, byte b) {
            this(i, jVar, str, cVar2);
        }
    }

    C22189c(AbstractC22186b bVar) {
        this.f52457a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36432b(EnumC22282w wVar) {
        List unmodifiableList = Collections.unmodifiableList(this.f52459c.f52446a);
        for (int i = 0; i <= unmodifiableList.size() - 1; i++) {
            GroupRecord groupRecord = (GroupRecord) unmodifiableList.get(i);
            if (!groupRecord.f52441d) {
                final AbstractC22219j jVar = groupRecord.f52439b;
                if (mo36437g(jVar)) {
                    mo36431b(jVar);
                    m41718a(this.f52457a, groupRecord.f52439b, wVar, false, new Runnable() {
                        /* class com.bytedance.scene.group.C22189c.RunnableC221923 */

                        static {
                            Covode.recordClassIndex(25998);
                        }

                        public final void run() {
                            C22189c.this.mo36433c(jVar);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$b */
    public final class C22198b extends AbstractC22201c {

        /* renamed from: b */
        private final AbstractC22128c f52479b;

        static {
            Covode.recordClassIndex(26004);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
            r3 = r4.f52479b.mo36321a();
         */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22201c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36442a(boolean r5) {
            /*
                r4 = this;
                super.mo36442a(r5)
                com.bytedance.scene.j r0 = r4.f52490i
                android.view.View r2 = r0.f52550n
                if (r2 != 0) goto L_0x000a
                return
            L_0x000a:
                com.bytedance.scene.j r1 = r4.f52490i
                r0 = 8
                com.bytedance.scene.group.C22189c.m41719a(r1, r0)
                if (r5 != 0) goto L_0x0014
                return
            L_0x0014:
                com.bytedance.scene.a.c r0 = r4.f52479b
                com.bytedance.scene.a.b r3 = r0.mo36321a()
                if (r3 != 0) goto L_0x001d
                return
            L_0x001d:
                int r1 = r2.getVisibility()
                r0 = 0
                r2.setVisibility(r0)
                com.bytedance.scene.group.c$b$1 r0 = new com.bytedance.scene.group.c$b$1
                r0.<init>(r2, r1)
                r3.mo36315a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.C22189c.f52455d
                com.bytedance.scene.j r1 = r4.f52490i
                com.bytedance.scene.group.c$b$2 r0 = new com.bytedance.scene.group.c$b$2
                r0.<init>(r3)
                r2.put(r1, r0)
                com.bytedance.scene.j r0 = r4.f52490i
                android.view.View r0 = r0.f52550n
                r3.mo36314a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.C22189c.C22198b.mo36442a(boolean):void");
        }

        private C22198b(AbstractC22219j jVar, AbstractC22128c cVar) {
            super(jVar, -1, null, C22189c.m41716a(EnumC22282w.ACTIVITY_CREATED, C22189c.this.f52457a.f52553q), false, true, false);
            this.f52479b = cVar;
        }

        /* synthetic */ C22198b(C22189c cVar, AbstractC22219j jVar, AbstractC22128c cVar2, byte b) {
            this(jVar, cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final GroupRecord mo36426a(String str) {
        return this.f52459c.mo36382a(str);
    }

    /* renamed from: b */
    public final void mo36431b(AbstractC22219j jVar) {
        String str;
        for (C0692e<AbstractC22219j, String> eVar : this.f52463i) {
            if (eVar.f2750a == jVar) {
                throw new C22168h("Target scene " + jVar.getClass().getCanonicalName() + " is already tracked");
            }
        }
        AbstractC22284y h = m41721h(this.f52457a.f52551o);
        if (h != null) {
            str = h.mo36526a(jVar.toString());
        } else {
            str = null;
        }
        this.f52463i.add(C0692e.m2449a(jVar, str));
    }

    /* renamed from: c */
    public final void mo36433c(AbstractC22219j jVar) {
        for (C0692e<AbstractC22219j, String> eVar : this.f52463i) {
            if (eVar.f2750a == jVar) {
                if (eVar.f2751b != null) {
                    m41721h(this.f52457a.f52551o).mo36538b(eVar.f2751b);
                }
                this.f52463i.remove(eVar);
                return;
            }
        }
        throw new C22168h("Target scene " + jVar.getClass().getCanonicalName() + " is not tracked");
    }

    /* renamed from: com.bytedance.scene.group.c$c */
    abstract class AbstractC22201c extends AbstractC22203d {

        /* renamed from: e */
        final int f52485e;

        /* renamed from: f */
        final String f52486f;

        /* renamed from: g */
        final EnumC22282w f52487g;

        static {
            Covode.recordClassIndex(26007);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36442a(boolean z) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo36446b(boolean z) {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.scene.group.C22189c.AbstractC22203d
        /* renamed from: a */
        public final void mo36445a(Runnable runnable) {
            C22160b bVar = C22189c.f52455d.get(this.f52490i);
            if (bVar != null) {
                bVar.mo36342a();
                if (C22189c.f52455d.get(this.f52490i) != null) {
                    throw new C22168h("CancellationSignal cancel callback should remove target Scene from CancellationSignal map");
                }
            }
            if (!C22189c.this.mo36437g(this.f52490i)) {
                if (this.f52490i.f52553q == EnumC22282w.NONE) {
                    C22171k.m41656a((Object) this.f52486f, "tag can't be null");
                    C22185a aVar = C22189c.this.f52459c;
                    int i = this.f52485e;
                    AbstractC22219j jVar = this.f52490i;
                    String str = this.f52486f;
                    GroupRecord groupRecord = new GroupRecord();
                    groupRecord.f52438a = i;
                    groupRecord.f52439b = (AbstractC22219j) C22171k.m41656a(jVar, "scene can't be null");
                    groupRecord.f52440c = (String) C22171k.m41656a((Object) str, "tag can't be null");
                    groupRecord.f52443f = (String) C22171k.m41656a((Object) jVar.getClass().getName(), "Scene class name is null");
                    aVar.f52446a.add(groupRecord);
                    aVar.f52447b.put(groupRecord.f52439b, groupRecord);
                    aVar.f52448c.put(groupRecord.f52440c, groupRecord);
                } else {
                    throw new C22168h("Scene state is " + this.f52490i.f52553q.name + " but it is not added to record list");
                }
            }
            boolean z = false;
            if (this.f52492k) {
                C22189c.this.f52459c.mo36381a(this.f52490i).f52441d = false;
            }
            if (this.f52493l) {
                C22189c.this.f52459c.mo36381a(this.f52490i).f52441d = true;
            }
            if (this.f52490i.f52553q != this.f52487g) {
                z = true;
            }
            mo36446b(z);
            C22189c.this.mo36431b(this.f52490i);
            C22189c.m41718a(C22189c.this.f52457a, this.f52490i, this.f52487g, this.f52494m, new Runnable() {
                /* class com.bytedance.scene.group.C22189c.AbstractC22201c.RunnableC222021 */

                static {
                    Covode.recordClassIndex(26008);
                }

                public final void run() {
                    C22189c.this.mo36433c(AbstractC22201c.this.f52490i);
                }
            });
            if (this.f52494m) {
                C22185a aVar2 = C22189c.this.f52459c;
                GroupRecord a = C22189c.this.f52459c.mo36381a(this.f52490i);
                aVar2.f52446a.remove(a);
                aVar2.f52447b.remove(a.f52439b);
                aVar2.f52448c.remove(a.f52440c);
            }
            mo36442a(z);
            runnable.run();
        }

        AbstractC22201c(AbstractC22219j jVar, int i, String str, EnumC22282w wVar, boolean z, boolean z2, boolean z3) {
            super(jVar, wVar, z, z2, z3);
            if (!z || !z2) {
                this.f52485e = i;
                this.f52486f = str;
                this.f52487g = wVar;
                return;
            }
            throw new IllegalArgumentException("cant forceShow with forceHide");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36428a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:group_stack", new ArrayList<>(this.f52459c.f52446a));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        List<AbstractC22219j> a = m41717a();
        for (int i = 0; i <= a.size() - 1; i++) {
            Bundle bundle2 = new Bundle();
            a.get(i).mo36412d(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:group_scene_manager", arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36429a(AbstractC22219j jVar) {
        for (C0692e<AbstractC22219j, String> eVar : this.f52463i) {
            if (eVar.f2750a == jVar) {
                throw new C22146a("Cant add/remove/show/hide " + jVar.getClass().getCanonicalName() + " before it finish previous add/remove/show/hide operation or in its lifecycle method");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36430a(EnumC22282w wVar) {
        List<AbstractC22219j> a = this.f52459c.mo36383a();
        for (int i = 0; i <= a.size() - 1; i++) {
            final AbstractC22219j jVar = a.get(i);
            if (mo36437g(jVar)) {
                mo36431b(jVar);
                m41718a(this.f52457a, jVar, wVar, false, new Runnable() {
                    /* class com.bytedance.scene.group.C22189c.RunnableC221912 */

                    static {
                        Covode.recordClassIndex(25997);
                    }

                    public final void run() {
                        C22189c.this.mo36433c(jVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static EnumC22282w m41716a(EnumC22282w wVar, EnumC22282w wVar2) {
        if (wVar.value < wVar2.value) {
            return wVar;
        }
        return wVar2;
    }

    /* renamed from: a */
    public static void m41719a(AbstractC22219j jVar, int i) {
        View view = jVar.f52550n;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo36427a(int i, AbstractC22219j jVar, String str, AbstractC22128c cVar) {
        mo36429a(jVar);
        C22195a aVar = new C22195a(this, i, jVar, str, cVar, (byte) 0);
        if (this.f52460f) {
            this.f52461g.add(aVar);
        } else {
            aVar.mo36445a(f52456e);
        }
    }

    /* renamed from: a */
    public static void m41718a(AbstractC22186b bVar, AbstractC22219j jVar, EnumC22282w wVar, boolean z, Runnable runnable) {
        MethodCollector.m26663i(10945);
        while (true) {
            EnumC22282w wVar2 = jVar.f52553q;
            if (wVar2 == wVar) {
                runnable.run();
                MethodCollector.m26664o(10945);
                return;
            } else if (wVar2.value < wVar.value) {
                int i = C221945.f52470a[wVar2.ordinal()];
                if (i == 1) {
                    jVar.mo36388a(bVar.mo36486t());
                    jVar.mo36390a(bVar);
                    GroupRecord d = bVar.f52450a.mo36434d(jVar);
                    Bundle bundle = d.f52444g;
                    jVar.mo36396b(bundle);
                    ViewGroup d2 = bVar.mo36411d(bVar.f52450a.mo36435e(jVar));
                    jVar.mo36389a(bundle, d2);
                    d2.addView(jVar.f52550n);
                    if (d.f52441d) {
                        m41719a(jVar, 8);
                    }
                } else if (i == 2) {
                    GroupRecord d3 = bVar.f52450a.mo36434d(jVar);
                    jVar.mo36399c(d3.f52444g);
                    d3.f52444g = null;
                } else if (i == 3) {
                    jVar.cs_();
                } else if (i == 4) {
                    jVar.ct_();
                } else {
                    C22168h hVar = new C22168h("unreachable state case " + wVar2.getName());
                    MethodCollector.m26664o(10945);
                    throw hVar;
                }
            } else {
                int i2 = C221945.f52470a[wVar2.ordinal()];
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            jVar.cv_();
                        } else if (i2 == 5) {
                            jVar.cu_();
                        } else {
                            C22168h hVar2 = new C22168h("unreachable state case " + wVar2.getName());
                            MethodCollector.m26664o(10945);
                            throw hVar2;
                        }
                    } else if (wVar == EnumC22282w.VIEW_CREATED) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                        MethodCollector.m26664o(10945);
                        throw illegalArgumentException;
                    }
                }
                View view = jVar.f52550n;
                jVar.cw_();
                if (z) {
                    C22171k.m41660a(view);
                }
                jVar.mo36423k();
                jVar.mo36424l();
                jVar.mo36425m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$d */
    public abstract class AbstractC22203d {

        /* renamed from: i */
        final AbstractC22219j f52490i;

        /* renamed from: j */
        final EnumC22282w f52491j;

        /* renamed from: k */
        final boolean f52492k;

        /* renamed from: l */
        final boolean f52493l;

        /* renamed from: m */
        final boolean f52494m;

        static {
            Covode.recordClassIndex(26009);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo36445a(Runnable runnable);

        AbstractC22203d(AbstractC22219j jVar, EnumC22282w wVar, boolean z, boolean z2, boolean z3) {
            this.f52490i = jVar;
            this.f52491j = wVar;
            this.f52492k = z;
            this.f52493l = z2;
            this.f52494m = z3;
        }
    }
}
