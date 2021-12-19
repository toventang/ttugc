package com.squareup.p2081b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.squareup.p2081b.AbstractC29253a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.b.t */
public class C29299t {

    /* renamed from: a */
    static final Handler f69514a = new Handler(Looper.getMainLooper()) {
        /* class com.squareup.p2081b.C29299t.HandlerC293001 */

        static {
            Covode.recordClassIndex(35649);
        }

        public final void handleMessage(Message message) {
            boolean z;
            Bitmap a;
            int i = message.what;
            if (i != 3) {
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        RunnableC29267c cVar = (RunnableC29267c) list.get(i2);
                        C29299t tVar = cVar.f69430b;
                        AbstractC29253a aVar = cVar.f69439k;
                        List<AbstractC29253a> list2 = cVar.f69440l;
                        if (list2 == null || list2.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (aVar != null || z) {
                            Bitmap bitmap = cVar.f69441m;
                            EnumC29305d dVar = cVar.f69443o;
                            if (aVar != null) {
                                tVar.mo51109a(bitmap, dVar, aVar);
                            }
                            if (z) {
                                int size2 = list2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    tVar.mo51109a(bitmap, dVar, list2.get(i3));
                                }
                            }
                        }
                    }
                } else if (i == 13) {
                    List list3 = (List) message.obj;
                    int size3 = list3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        AbstractC29253a aVar2 = (AbstractC29253a) list3.get(i4);
                        C29299t tVar2 = aVar2.f69374a;
                        if (!EnumC29294p.m58683a(aVar2.f69378e) || (a = tVar2.mo51107a(aVar2.f69382i)) == null) {
                            tVar2.mo51111a(aVar2);
                            if (tVar2.f69526m) {
                                C29262ae.m58613a("Main", "resumed", aVar2.f69375b.mo51124a());
                            }
                        } else {
                            tVar2.mo51109a(a, EnumC29305d.MEMORY, aVar2);
                            if (tVar2.f69526m) {
                                C29262ae.m58614a("Main", "completed", aVar2.f69375b.mo51124a(), "from " + EnumC29305d.MEMORY);
                            }
                        }
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                AbstractC29253a aVar3 = (AbstractC29253a) message.obj;
                if (aVar3.f69374a.f69526m) {
                    C29262ae.m58614a("Main", "canceled", aVar3.f69375b.mo51124a(), "target got garbage collected");
                }
                aVar3.f69374a.mo51112a(aVar3.mo51049c());
            }
        }
    };

    /* renamed from: b */
    static volatile C29299t f69515b = null;

    /* renamed from: c */
    public final List<AbstractC29315y> f69516c;

    /* renamed from: d */
    final Context f69517d;

    /* renamed from: e */
    final C29280i f69518e;

    /* renamed from: f */
    final AbstractC29274d f69519f;

    /* renamed from: g */
    final C29255aa f69520g;

    /* renamed from: h */
    final Map<Object, AbstractC29253a> f69521h;

    /* renamed from: i */
    final Map<ImageView, ViewTreeObserver$OnPreDrawListenerC29279h> f69522i;

    /* renamed from: j */
    final ReferenceQueue<Object> f69523j;

    /* renamed from: k */
    final Bitmap.Config f69524k;

    /* renamed from: l */
    public boolean f69525l;

    /* renamed from: m */
    public volatile boolean f69526m;

    /* renamed from: n */
    boolean f69527n;

    /* renamed from: o */
    private final AbstractC29304c f69528o;

    /* renamed from: p */
    private final AbstractC29307f f69529p;

    /* renamed from: q */
    private final C29302b f69530q;

    /* renamed from: com.squareup.b.t$c */
    public interface AbstractC29304c {
        static {
            Covode.recordClassIndex(35653);
        }
    }

    /* renamed from: com.squareup.b.t$f */
    public interface AbstractC29307f {

        /* renamed from: a */
        public static final AbstractC29307f f69548a = new AbstractC29307f() {
            /* class com.squareup.p2081b.C29299t.AbstractC29307f.C293081 */

            static {
                Covode.recordClassIndex(35657);
            }

            @Override // com.squareup.p2081b.C29299t.AbstractC29307f
            /* renamed from: a */
            public final C29312w mo51116a(C29312w wVar) {
                return wVar;
            }
        };

        /* renamed from: a */
        C29312w mo51116a(C29312w wVar);

        static {
            Covode.recordClassIndex(35656);
        }
    }

    static {
        Covode.recordClassIndex(35648);
    }

    /* renamed from: com.squareup.b.t$b */
    static class C29302b extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<Object> f69541a;

        /* renamed from: b */
        private final Handler f69542b;

        static {
            Covode.recordClassIndex(35651);
        }

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC29253a.C29254a aVar = (AbstractC29253a.C29254a) this.f69541a.remove(1000);
                    Message obtainMessage = this.f69542b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f69386a;
                        this.f69542b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f69542b.post(new Runnable() {
                        /* class com.squareup.p2081b.C29299t.C29302b.RunnableC293031 */

                        static {
                            Covode.recordClassIndex(35652);
                        }

                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }

        C29302b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f69541a = referenceQueue;
            this.f69542b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    /* renamed from: com.squareup.b.t$d */
    public enum EnumC29305d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: a */
        final int f69546a;

        static {
            Covode.recordClassIndex(35654);
        }

        private EnumC29305d(int i) {
            this.f69546a = i;
        }
    }

    /* renamed from: com.squareup.b.t$e */
    public enum EnumC29306e {
        LOW,
        NORMAL,
        HIGH;

        static {
            Covode.recordClassIndex(35655);
        }
    }

    /* renamed from: com.squareup.b.t$a */
    public static class C29301a {

        /* renamed from: a */
        final Context f69531a;

        /* renamed from: b */
        AbstractC29285j f69532b;

        /* renamed from: c */
        ExecutorService f69533c;

        /* renamed from: d */
        AbstractC29274d f69534d;

        /* renamed from: e */
        AbstractC29304c f69535e;

        /* renamed from: f */
        AbstractC29307f f69536f;

        /* renamed from: g */
        List<AbstractC29315y> f69537g;

        /* renamed from: h */
        Bitmap.Config f69538h;

        /* renamed from: i */
        boolean f69539i;

        /* renamed from: j */
        boolean f69540j;

        static {
            Covode.recordClassIndex(35650);
        }

        public C29301a(Context context) {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                this.f69531a = applicationContext;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bitmap mo51107a(String str) {
        Bitmap a = this.f69519f.mo51075a(str);
        if (a != null) {
            this.f69520g.mo51050a();
        } else {
            this.f69520g.f69389c.sendEmptyMessage(1);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C29312w mo51108a(C29312w wVar) {
        C29312w a = this.f69529p.mo51116a(wVar);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Request transformer " + this.f69529p.getClass().getCanonicalName() + " returned null for " + wVar);
    }

    /* renamed from: a */
    public static C29299t m58690a(Context context) {
        MethodCollector.m26663i(9690);
        if (f69515b == null) {
            synchronized (C29299t.class) {
                try {
                    if (f69515b == null) {
                        C29301a aVar = new C29301a(context);
                        Context context2 = aVar.f69531a;
                        if (aVar.f69532b == null) {
                            aVar.f69532b = C29262ae.m58603a(context2);
                        }
                        if (aVar.f69534d == null) {
                            aVar.f69534d = new C29290m(context2);
                        }
                        if (aVar.f69533c == null) {
                            aVar.f69533c = new C29310v();
                        }
                        if (aVar.f69536f == null) {
                            aVar.f69536f = AbstractC29307f.f69548a;
                        }
                        C29255aa aaVar = new C29255aa(aVar.f69534d);
                        f69515b = new C29299t(context2, new C29280i(context2, aVar.f69533c, f69514a, aVar.f69532b, aVar.f69534d, aaVar), aVar.f69534d, aVar.f69535e, aVar.f69536f, aVar.f69537g, aaVar, aVar.f69538h, aVar.f69539i, aVar.f69540j);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9690);
                    throw th;
                }
            }
        }
        C29299t tVar = f69515b;
        MethodCollector.m26664o(9690);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51111a(AbstractC29253a aVar) {
        Object c = aVar.mo51049c();
        if (!(c == null || this.f69521h.get(c) == aVar)) {
            mo51112a(c);
            this.f69521h.put(c, aVar);
        }
        C29280i iVar = this.f69518e;
        iVar.f69468i.sendMessage(iVar.f69468i.obtainMessage(1, aVar));
    }

    /* renamed from: a */
    public final void mo51112a(Object obj) {
        ViewTreeObserver$OnPreDrawListenerC29279h remove;
        C29262ae.m58610a();
        AbstractC29253a remove2 = this.f69521h.remove(obj);
        if (remove2 != null) {
            remove2.mo51048b();
            this.f69518e.mo51082a(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f69522i.remove(obj)) != null) {
            remove.mo51079a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51110a(ImageView imageView, ViewTreeObserver$OnPreDrawListenerC29279h hVar) {
        this.f69522i.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51109a(Bitmap bitmap, EnumC29305d dVar, AbstractC29253a aVar) {
        if (!aVar.f69385l) {
            if (!aVar.f69384k) {
                this.f69521h.remove(aVar.mo51049c());
            }
            if (bitmap == null) {
                aVar.mo51046a();
                if (this.f69526m) {
                    C29262ae.m58613a("Main", "errored", aVar.f69375b.mo51124a());
                }
            } else if (dVar != null) {
                aVar.mo51047a(bitmap, dVar);
                if (this.f69526m) {
                    C29262ae.m58614a("Main", "completed", aVar.f69375b.mo51124a(), "from ".concat(String.valueOf(dVar)));
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    private C29299t(Context context, C29280i iVar, AbstractC29274d dVar, AbstractC29304c cVar, AbstractC29307f fVar, List<AbstractC29315y> list, C29255aa aaVar, Bitmap.Config config, boolean z, boolean z2) {
        int i;
        this.f69517d = context;
        this.f69518e = iVar;
        this.f69519f = dVar;
        this.f69528o = cVar;
        this.f69529p = fVar;
        this.f69524k = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C29317z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C29277f(context));
        arrayList.add(new C29292o(context));
        arrayList.add(new C29278g(context));
        arrayList.add(new C29266b(context));
        arrayList.add(new C29288k(context));
        arrayList.add(new C29296r(iVar.f69463d, aaVar));
        this.f69516c = Collections.unmodifiableList(arrayList);
        this.f69520g = aaVar;
        this.f69521h = new WeakHashMap();
        this.f69522i = new WeakHashMap();
        this.f69525l = z;
        this.f69526m = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f69523j = referenceQueue;
        C29302b bVar = new C29302b(referenceQueue, f69514a);
        this.f69530q = bVar;
        bVar.start();
    }
}
