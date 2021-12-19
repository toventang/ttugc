package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.EnumC22282w;
import com.bytedance.scene.p1617a.AbstractC22129d;
import com.bytedance.scene.p1617a.p1619b.AbstractC22126a;
import com.bytedance.scene.p1621c.C22152e;
import com.bytedance.scene.p1621c.C22154f;
import com.bytedance.scene.p1622d.AbstractC22165f;
import com.bytedance.scene.p1622d.C22160b;
import com.bytedance.scene.p1622d.C22162c;
import com.bytedance.scene.p1622d.C22164e;
import com.bytedance.scene.p1622d.C22168h;
import com.bytedance.scene.p1622d.C22171k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.bytedance.scene.navigation.f */
public final class C22243f {

    /* renamed from: j */
    public static final Runnable f52609j = new Runnable() {
        /* class com.bytedance.scene.navigation.C22243f.RunnableC222452 */

        static {
            Covode.recordClassIndex(26057);
        }

        public final void run() {
        }
    };

    /* renamed from: a */
    public C22239d f52610a;

    /* renamed from: b */
    public final C22260i f52611b = new C22260i();

    /* renamed from: c */
    public AbstractC22238c f52612c;

    /* renamed from: d */
    public final ArrayDeque<AbstractC22248b> f52613d = new ArrayDeque<>();

    /* renamed from: e */
    public long f52614e = -1;

    /* renamed from: f */
    public final C22247a f52615f = new C22247a((byte) 0);

    /* renamed from: g */
    final List<C22164e<AbstractC1204m, AbstractC22259h>> f52616g = new ArrayList();

    /* renamed from: h */
    public Set<String> f52617h = new HashSet();

    /* renamed from: i */
    public int f52618i = 0;

    /* renamed from: k */
    public boolean f52619k = false;

    /* renamed from: l */
    private final HandlerC22236a f52620l = new HandlerC22236a(Looper.getMainLooper());

    /* renamed from: m */
    private int f52621m = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$b */
    public interface AbstractC22248b {
        static {
            Covode.recordClassIndex(26060);
        }

        /* renamed from: a */
        void mo36558a(Runnable runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$a */
    public static class C22247a {

        /* renamed from: a */
        private final List<C22162c> f52625a;

        static {
            Covode.recordClassIndex(26059);
        }

        private C22247a() {
            this.f52625a = new ArrayList();
        }

        /* renamed from: a */
        public final void mo36555a() {
            if (this.f52625a.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f52625a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((C22160b) it.next()).mo36342a();
                }
                this.f52625a.removeAll(arrayList);
            }
        }

        /* synthetic */ C22247a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo36556a(C22162c cVar) {
            this.f52625a.add(cVar);
        }

        /* renamed from: b */
        public final void mo36557b(C22162c cVar) {
            this.f52625a.remove(cVar);
        }
    }

    static {
        Covode.recordClassIndex(26055);
    }

    /* renamed from: a */
    public final void mo36542a() {
        mo36545a(new C22251d(this, null, (byte) 0));
    }

    /* renamed from: b */
    public final AbstractC22219j mo36548b() {
        Record a = this.f52611b.mo36562a();
        if (a != null) {
            return a.f52586a;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo36551d() {
        this.f52615f.mo36555a();
        AbstractC22126a.m41608a();
    }

    /* renamed from: e */
    public final boolean mo36552e() {
        if (this.f52610a.f52553q.value >= EnumC22282w.ACTIVITY_CREATED.value) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo36550c() {
        ArrayList arrayList = new ArrayList(this.f52616g);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C22164e eVar = (C22164e) arrayList.get(size);
            if (eVar.f52402a.getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED) && eVar.f52403b.mo36540a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$3 */
    public static /* synthetic */ class C222463 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52624a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 26058(0x65ca, float:3.6515E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.scene.w[] r0 = com.bytedance.scene.EnumC22282w.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.scene.navigation.C22243f.C222463.f52624a = r2
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.NONE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.scene.navigation.C22243f.C222463.f52624a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.VIEW_CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.scene.navigation.C22243f.C222463.f52624a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.ACTIVITY_CREATED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.scene.navigation.C22243f.C222463.f52624a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.STARTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.scene.navigation.C22243f.C222463.f52624a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.scene.w r0 = com.bytedance.scene.EnumC22282w.RESUMED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.C22243f.C222463.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$d */
    public class C22251d implements AbstractC22248b {

        /* renamed from: b */
        private final AbstractC22129d f52634b;

        static {
            Covode.recordClassIndex(26063);
        }

        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        public final void mo36558a(Runnable runnable) {
            new C22249c(C22243f.this, this.f52634b, 1, (byte) 0).mo36558a(runnable);
        }

        private C22251d(AbstractC22129d dVar) {
            this.f52634b = dVar;
        }

        /* synthetic */ C22251d(C22243f fVar, AbstractC22129d dVar, byte b) {
            this(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36549b(String str) {
        if (!this.f52617h.remove(str)) {
            throw new C22168h("suppressTag not found");
        } else if (this.f52617h.size() == 0) {
            this.f52621m = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo36541a(String str) {
        StringBuilder append = new StringBuilder().append(str).append("_");
        int i = this.f52621m;
        this.f52621m = i + 1;
        String sb = append.append(i).toString();
        if (this.f52617h.add(sb)) {
            return sb;
        }
        throw new C22168h("suppressTag already exists");
    }

    /* renamed from: com.bytedance.scene.navigation.f$e */
    public class C22252e implements AbstractC22248b {

        /* renamed from: b */
        private final C22152e f52636b;

        static {
            Covode.recordClassIndex(26064);
        }

        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        public final void mo36558a(Runnable runnable) {
            List<Record> c = C22243f.this.f52611b.mo36565c();
            AbstractC22165f<AbstractC22219j> fVar = this.f52636b.f52377b;
            if (fVar != null) {
                int i = 0;
                for (int size = c.size() - 1; size >= 0; size--) {
                    c.get(size);
                    if (fVar.mo36350a()) {
                        break;
                    }
                    i++;
                }
                new C22249c(C22243f.this, this.f52636b.f52376a, i, (byte) 0).mo36558a(runnable);
                return;
            }
            new C22251d(C22243f.this, this.f52636b.f52376a, (byte) 0).mo36558a(runnable);
        }

        private C22252e(C22152e eVar) {
            this.f52636b = eVar;
        }

        public /* synthetic */ C22252e(C22243f fVar, C22152e eVar, byte b) {
            this(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$g */
    public class C22255g implements AbstractC22248b {

        /* renamed from: b */
        private final AbstractC22219j f52645b;

        static {
            Covode.recordClassIndex(26067);
        }

        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        public final void mo36558a(Runnable runnable) {
            if (C22243f.this.mo36548b() == this.f52645b) {
                new C22251d(C22243f.this, null, (byte) 0).mo36558a(runnable);
                return;
            }
            List<Record> c = C22243f.this.f52611b.mo36565c();
            int size = c.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Record record = c.get(size);
                if (record.f52586a == this.f52645b) {
                    if (size == c.size() - 2) {
                        C22243f.this.mo36551d();
                    }
                    EnumC22282w wVar = this.f52645b.f52553q;
                    C22243f.m41889a(C22243f.this.f52610a, this.f52645b, EnumC22282w.NONE, null, false, null);
                    C22243f.this.f52611b.mo36563a(record);
                    if (size > 0) {
                        C22243f.m41889a(C22243f.this.f52610a, c.get(size - 1).f52586a, wVar, null, false, null);
                    }
                } else {
                    size--;
                }
            }
            runnable.run();
        }

        private C22255g(AbstractC22219j jVar) {
            this.f52645b = jVar;
        }

        /* synthetic */ C22255g(C22243f fVar, AbstractC22219j jVar, byte b) {
            this(jVar);
        }
    }

    /* renamed from: com.bytedance.scene.navigation.f$h */
    class C22256h implements AbstractC22248b {

        /* renamed from: b */
        private final EnumC22282w f52647b;

        /* renamed from: c */
        private final boolean f52648c;

        static {
            Covode.recordClassIndex(26068);
        }

        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        public final void mo36558a(Runnable runnable) {
            if (C22243f.this.f52611b.mo36562a() == null) {
                runnable.run();
                return;
            }
            List<Record> c = C22243f.this.f52611b.mo36565c();
            if (this.f52648c) {
                ArrayList arrayList = new ArrayList(c);
                Collections.reverse(arrayList);
                c = arrayList;
            }
            for (int i = 0; i < c.size(); i++) {
                C22243f.m41889a(C22243f.this.f52610a, c.get(i).f52586a, this.f52647b, null, true, null);
            }
            runnable.run();
        }

        /* synthetic */ C22256h(C22243f fVar, EnumC22282w wVar) {
            this(wVar, true);
        }

        private C22256h(EnumC22282w wVar, boolean z) {
            this.f52647b = wVar;
            this.f52648c = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$i */
    public class C22257i implements AbstractC22248b {

        /* renamed from: b */
        private final EnumC22282w f52650b;

        static {
            Covode.recordClassIndex(26069);
        }

        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        public final void mo36558a(Runnable runnable) {
            if (C22243f.this.f52611b.mo36562a() == null) {
                runnable.run();
                return;
            }
            List<Record> c = C22243f.this.f52611b.mo36565c();
            EnumC22282w wVar = this.f52650b;
            for (int size = c.size() - 1; size >= 0; size--) {
                Record record = c.get(size);
                if (size == c.size() - 1) {
                    C22243f.m41889a(C22243f.this.f52610a, record.f52586a, wVar, null, true, runnable);
                    if (!record.f52587b) {
                        break;
                    }
                } else {
                    EnumC22282w wVar2 = null;
                    if (wVar == EnumC22282w.RESUMED) {
                        wVar2 = EnumC22282w.STARTED;
                    } else if (wVar == EnumC22282w.STARTED) {
                        wVar2 = EnumC22282w.STARTED;
                    } else if (wVar == EnumC22282w.ACTIVITY_CREATED) {
                        wVar2 = EnumC22282w.ACTIVITY_CREATED;
                    } else if (wVar == EnumC22282w.VIEW_CREATED) {
                        wVar2 = EnumC22282w.VIEW_CREATED;
                    }
                    C22243f.m41889a(C22243f.this.f52610a, record.f52586a, wVar2, null, true, runnable);
                    if (!record.f52587b) {
                        break;
                    }
                }
            }
            runnable.run();
        }

        private C22257i(EnumC22282w wVar) {
            this.f52650b = wVar;
        }

        /* synthetic */ C22257i(C22243f fVar, EnumC22282w wVar, byte b) {
            this(wVar);
        }
    }

    C22243f(C22239d dVar) {
        this.f52610a = dVar;
        this.f52612c = dVar;
    }

    /* renamed from: a */
    public final void mo36543a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:record_stack", new ArrayList<>(this.f52611b.f52656a));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Record record : this.f52611b.mo36565c()) {
            Bundle bundle2 = new Bundle();
            record.f52586a.mo36412d(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:navigation_scene_manager", arrayList);
    }

    /* renamed from: a */
    public final void mo36545a(final AbstractC22248b bVar) {
        if (!mo36552e()) {
            this.f52613d.addLast(bVar);
            this.f52614e = System.currentTimeMillis();
        } else if (this.f52617h.size() > 0 || this.f52618i > 0) {
            RunnableC222441 r1 = new Runnable() {
                /* class com.bytedance.scene.navigation.C22243f.RunnableC222441 */

                static {
                    Covode.recordClassIndex(26056);
                }

                public final void run() {
                    C22243f fVar = C22243f.this;
                    fVar.f52618i--;
                    if (C22243f.this.f52617h.size() > 0) {
                        throw new C22168h("miss endSuppressStackOperation(), mIsNavigationStateChangeInProgress content ".concat(String.valueOf(TextUtils.join(",", C22243f.this.f52617h))));
                    } else if (C22243f.this.mo36552e()) {
                        String a = C22243f.this.mo36541a("NavigationManager execute operation by Handler.post()");
                        bVar.mo36558a(C22243f.f52609j);
                        C22243f.this.mo36549b(a);
                    } else {
                        C22243f.this.f52613d.addLast(bVar);
                        C22243f.this.f52614e = System.currentTimeMillis();
                    }
                }
            };
            this.f52618i++;
            this.f52620l.mo36520a(r1);
        } else {
            String a = mo36541a("NavigationManager execute operation directly");
            bVar.mo36558a(f52609j);
            mo36549b(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$c */
    public class C22249c implements AbstractC22248b {

        /* renamed from: b */
        private final AbstractC22129d f52627b;

        /* renamed from: c */
        private final int f52628c;

        static {
            Covode.recordClassIndex(26061);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a7, code lost:
            if (r10 == null) goto L_0x01a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b9, code lost:
            if (r10 == null) goto L_0x01bb;
         */
        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36558a(final java.lang.Runnable r22) {
            /*
            // Method dump skipped, instructions count: 746
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.C22243f.C22249c.mo36558a(java.lang.Runnable):void");
        }

        private C22249c(AbstractC22129d dVar, int i) {
            this.f52627b = dVar;
            this.f52628c = i;
        }

        /* synthetic */ C22249c(C22243f fVar, AbstractC22129d dVar, int i, byte b) {
            this(dVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$f */
    public class C22253f implements AbstractC22248b {

        /* renamed from: b */
        private final AbstractC22219j f52638b;

        /* renamed from: c */
        private final C22154f f52639c;

        /* renamed from: d */
        private final boolean f52640d;

        static {
            Covode.recordClassIndex(26065);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01da, code lost:
            if (r14 == null) goto L_0x01dc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0249  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x02a5  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x02ad  */
        @Override // com.bytedance.scene.navigation.C22243f.AbstractC22248b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36558a(final java.lang.Runnable r23) {
            /*
            // Method dump skipped, instructions count: 770
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.C22243f.C22253f.mo36558a(java.lang.Runnable):void");
        }

        private C22253f(AbstractC22219j jVar, C22154f fVar) {
            boolean z;
            this.f52638b = jVar;
            this.f52639c = fVar;
            if (fVar.f52382c || (jVar instanceof AbstractC22261j)) {
                z = true;
            } else {
                z = false;
            }
            this.f52640d = z;
        }

        /* synthetic */ C22253f(C22243f fVar, AbstractC22219j jVar, C22154f fVar2, byte b) {
            this(jVar, fVar2);
        }
    }

    /* renamed from: a */
    public final void mo36546a(AbstractC22259h hVar) {
        C22164e<AbstractC1204m, AbstractC22259h> eVar;
        int size = this.f52616g.size() - 1;
        while (true) {
            if (size < 0) {
                eVar = null;
                break;
            }
            eVar = this.f52616g.get(size);
            if (eVar.f52403b == hVar) {
                break;
            }
            size--;
        }
        this.f52616g.remove(eVar);
    }

    /* renamed from: a */
    public final void mo36547a(EnumC22282w wVar) {
        String a = mo36541a("NavigationManager dispatchCurrentChildState");
        new C22257i(this, wVar, (byte) 0).mo36558a(f52609j);
        mo36549b(a);
    }

    /* renamed from: a */
    public static EnumC22282w m41888a(EnumC22282w wVar, EnumC22282w wVar2) {
        if (wVar.value > wVar2.value) {
            return wVar2;
        }
        return wVar;
    }

    /* renamed from: a */
    public final void mo36544a(AbstractC22219j jVar, C22154f fVar) {
        Objects.requireNonNull(jVar, "scene can't be null");
        mo36545a(new C22253f(this, jVar, fVar, (byte) 0));
    }

    /* renamed from: a */
    public static void m41889a(C22239d dVar, AbstractC22219j jVar, EnumC22282w wVar, Bundle bundle, boolean z, Runnable runnable) {
        Record record;
        MethodCollector.m26663i(1004);
        while (true) {
            EnumC22282w wVar2 = jVar.f52553q;
            if (wVar2 == wVar) {
                if (runnable != null) {
                    runnable.run();
                }
                MethodCollector.m26664o(1004);
                return;
            } else if (wVar2.value < wVar.value) {
                int i = C222463.f52624a[wVar2.ordinal()];
                if (i == 1) {
                    jVar.mo36388a(dVar.mo36486t());
                    jVar.mo36390a(dVar);
                    jVar.mo36396b(bundle);
                    FrameLayout frameLayout = dVar.f52598d;
                    jVar.mo36389a(bundle, frameLayout);
                    if (!z) {
                        if (jVar.f52550n.getBackground() == null) {
                            Iterator<Record> it = dVar.f52597c.f52611b.f52656a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    record = null;
                                    break;
                                }
                                record = it.next();
                                if (record.f52586a == jVar) {
                                    break;
                                }
                            }
                            if (!record.f52587b && dVar.f52596b.f52654d) {
                                int i2 = dVar.f52596b.f52655e;
                                if (i2 > 0) {
                                    jVar.f52550n.setBackgroundDrawable(jVar.mo36485s().getResources().getDrawable(i2));
                                } else {
                                    jVar.f52550n.setBackgroundDrawable(C22171k.m41655a(jVar.mo36485s()));
                                }
                                record.f52591f = true;
                            }
                        }
                        frameLayout.addView(jVar.f52550n);
                    }
                    jVar.f52550n.setVisibility(8);
                } else if (i == 2) {
                    jVar.mo36399c(bundle);
                } else if (i == 3) {
                    jVar.f52550n.setVisibility(0);
                    jVar.cs_();
                } else if (i == 4) {
                    jVar.ct_();
                } else {
                    C22168h hVar = new C22168h("unreachable state case " + wVar2.getName());
                    MethodCollector.m26664o(1004);
                    throw hVar;
                }
            } else {
                int i3 = C222463.f52624a[wVar2.ordinal()];
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            jVar.cv_();
                            if (!z) {
                                jVar.f52550n.setVisibility(8);
                            }
                        } else if (i3 == 5) {
                            jVar.cu_();
                        } else {
                            C22168h hVar2 = new C22168h("unreachable state case " + wVar2.getName());
                            MethodCollector.m26664o(1004);
                            throw hVar2;
                        }
                    } else if (wVar == EnumC22282w.VIEW_CREATED) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                        MethodCollector.m26664o(1004);
                        throw illegalArgumentException;
                    }
                }
                View view = jVar.f52550n;
                jVar.cw_();
                if (!z) {
                    C22171k.m41660a(view);
                }
                jVar.mo36423k();
                jVar.mo36424l();
                jVar.mo36425m();
            }
        }
    }
}
