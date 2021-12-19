package com.squareup.p2081b;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.AbstractC29285j;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29296r;
import com.squareup.p2081b.C29299t;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.c */
public final class RunnableC29267c implements Runnable {

    /* renamed from: t */
    private static final Object f69425t = new Object();

    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f69426u = new ThreadLocal<StringBuilder>() {
        /* class com.squareup.p2081b.RunnableC29267c.C292681 */

        static {
            Covode.recordClassIndex(35617);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };

    /* renamed from: v */
    private static final AtomicInteger f69427v = new AtomicInteger();

    /* renamed from: w */
    private static final AbstractC29315y f69428w = new AbstractC29315y() {
        /* class com.squareup.p2081b.RunnableC29267c.C292692 */

        static {
            Covode.recordClassIndex(35618);
        }

        @Override // com.squareup.p2081b.AbstractC29315y
        /* renamed from: a */
        public final boolean mo51062a(C29312w wVar) {
            return true;
        }

        @Override // com.squareup.p2081b.AbstractC29315y
        /* renamed from: b */
        public final AbstractC29315y.C29316a mo51063b(C29312w wVar) {
            throw new IllegalStateException("Unrecognized type of request: ".concat(String.valueOf(wVar)));
        }
    };

    /* renamed from: a */
    final int f69429a = f69427v.incrementAndGet();

    /* renamed from: b */
    public final C29299t f69430b;

    /* renamed from: c */
    final C29280i f69431c;

    /* renamed from: d */
    final AbstractC29274d f69432d;

    /* renamed from: e */
    final C29255aa f69433e;

    /* renamed from: f */
    public final String f69434f;

    /* renamed from: g */
    public final C29312w f69435g;

    /* renamed from: h */
    public final int f69436h;

    /* renamed from: i */
    int f69437i;

    /* renamed from: j */
    final AbstractC29315y f69438j;

    /* renamed from: k */
    public AbstractC29253a f69439k;

    /* renamed from: l */
    public List<AbstractC29253a> f69440l;

    /* renamed from: m */
    public Bitmap f69441m;

    /* renamed from: n */
    Future<?> f69442n;

    /* renamed from: o */
    public C29299t.EnumC29305d f69443o;

    /* renamed from: p */
    public Exception f69444p;

    /* renamed from: q */
    int f69445q;

    /* renamed from: r */
    int f69446r;

    /* renamed from: s */
    public C29299t.EnumC29306e f69447s;

    /* renamed from: a */
    private static boolean m58626a(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo51067b() {
        Future<?> future = this.f69442n;
        if (future == null || !future.isCancelled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo51065a() {
        List<AbstractC29253a> list;
        Future<?> future;
        if (this.f69439k != null || (((list = this.f69440l) != null && !list.isEmpty()) || (future = this.f69442n) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(35616);
    }

    public final void run() {
        Throwable th;
        Thread thread;
        String hexString;
        try {
            C29312w wVar = this.f69435g;
            if (wVar.f69562d != null) {
                hexString = String.valueOf(wVar.f69562d.getPath());
            } else {
                hexString = Integer.toHexString(wVar.f69563e);
            }
            StringBuilder sb = f69426u.get();
            sb.ensureCapacity(hexString.length() + 8);
            sb.replace(8, sb.length(), hexString);
            Thread.currentThread().setName(sb.toString());
            if (this.f69430b.f69526m) {
                C29262ae.m58613a("Hunter", "executing", C29262ae.m58607a(this, ""));
            }
            Bitmap c = m58627c();
            this.f69441m = c;
            if (c == null) {
                this.f69431c.mo51087b(this);
            } else {
                C29280i iVar = this.f69431c;
                iVar.f69468i.sendMessage(iVar.f69468i.obtainMessage(4, this));
            }
        } catch (AbstractC29285j.C29287b e) {
            if (!e.f69484a || e.f69485b != 504) {
                this.f69444p = e;
            }
            this.f69431c.mo51087b(this);
        } catch (C29296r.C29297a e2) {
            this.f69444p = e2;
            this.f69431c.mo51084a(this);
        } catch (IOException e3) {
            this.f69444p = e3;
            this.f69431c.mo51084a(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            C29255aa aaVar = this.f69433e;
            C29258ab abVar = new C29258ab(aaVar.f69388b.mo51077b(), aaVar.f69388b.mo51074a(), aaVar.f69390d, aaVar.f69391e, aaVar.f69392f, aaVar.f69393g, aaVar.f69394h, aaVar.f69395i, aaVar.f69396j, aaVar.f69397k, aaVar.f69398l, aaVar.f69399m, aaVar.f69400n, System.currentTimeMillis());
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            printWriter.println(abVar.f69404a);
            printWriter.print("  Cache Size: ");
            printWriter.println(abVar.f69405b);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) abVar.f69405b) / ((float) abVar.f69404a)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(abVar.f69406c);
            printWriter.print("  Cache Misses: ");
            printWriter.println(abVar.f69407d);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(abVar.f69414k);
            printWriter.print("  Total Download Size: ");
            printWriter.println(abVar.f69408e);
            printWriter.print("  Average Download Size: ");
            printWriter.println(abVar.f69411h);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(abVar.f69415l);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(abVar.f69409f);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(abVar.f69416m);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(abVar.f69410g);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(abVar.f69412i);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(abVar.f69413j);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            this.f69444p = new RuntimeException(stringWriter.toString(), e4);
            this.f69431c.mo51087b(this);
            thread = Thread.currentThread();
        } catch (Exception e5) {
            this.f69444p = e5;
            this.f69431c.mo51087b(this);
        } catch (Throwable th2) {
            th = th2;
        }
        thread = Thread.currentThread();
        thread.setName("Picasso-Idle");
        return;
        Thread.currentThread().setName("Picasso-Idle");
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f0 A[Catch:{ all -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0204 A[Catch:{ all -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x020e A[Catch:{ all -> 0x0242 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m58627c() {
        /*
        // Method dump skipped, instructions count: 600
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.RunnableC29267c.m58627c():android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51064a(AbstractC29253a aVar) {
        boolean z = this.f69430b.f69526m;
        C29312w wVar = aVar.f69375b;
        if (this.f69439k == null) {
            this.f69439k = aVar;
            if (z) {
                List<AbstractC29253a> list = this.f69440l;
                if (list == null || list.isEmpty()) {
                    C29262ae.m58614a("Hunter", "joined", wVar.mo51124a(), "to empty hunter");
                } else {
                    C29262ae.m58614a("Hunter", "joined", wVar.mo51124a(), C29262ae.m58607a(this, "to "));
                }
            }
        } else {
            if (this.f69440l == null) {
                this.f69440l = new ArrayList(3);
            }
            this.f69440l.add(aVar);
            if (z) {
                C29262ae.m58614a("Hunter", "joined", wVar.mo51124a(), C29262ae.m58607a(this, "to "));
            }
            C29299t.EnumC29306e eVar = aVar.f69375b.f69576r;
            if (eVar.ordinal() > this.f69447s.ordinal()) {
                this.f69447s = eVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r0.remove(r7) != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51066b(com.squareup.p2081b.AbstractC29253a r7) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.RunnableC29267c.mo51066b(com.squareup.b.a):void");
    }

    /* renamed from: a */
    private static Bitmap m58624a(List<AbstractC29259ac> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final AbstractC29259ac acVar = list.get(i);
            try {
                Bitmap a = acVar.mo51055a();
                if (a == null) {
                    final StringBuilder append = new StringBuilder("Transformation ").append(acVar.mo51056b()).append(" returned null after ").append(i).append(" previous transformation(s).\n\nTransformation list:\n");
                    for (AbstractC29259ac acVar2 : list) {
                        append.append(acVar2.mo51056b()).append('\n');
                    }
                    C29299t.f69514a.post(new Runnable() {
                        /* class com.squareup.p2081b.RunnableC29267c.RunnableC292714 */

                        static {
                            Covode.recordClassIndex(35620);
                        }

                        public final void run() {
                            throw new NullPointerException(append.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C29299t.f69514a.post(new Runnable() {
                        /* class com.squareup.p2081b.RunnableC29267c.RunnableC292725 */

                        static {
                            Covode.recordClassIndex(35621);
                        }

                        public final void run() {
                            throw new IllegalStateException("Transformation " + acVar.mo51056b() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C29299t.f69514a.post(new Runnable() {
                        /* class com.squareup.p2081b.RunnableC29267c.RunnableC292736 */

                        static {
                            Covode.recordClassIndex(35622);
                        }

                        public final void run() {
                            throw new IllegalStateException("Transformation " + acVar.mo51056b() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                C29299t.f69514a.post(new Runnable() {
                    /* class com.squareup.p2081b.RunnableC29267c.RunnableC292703 */

                    static {
                        Covode.recordClassIndex(35619);
                    }

                    public final void run() {
                        throw new RuntimeException("Transformation " + acVar.mo51056b() + " crashed with exception.", e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    static RunnableC29267c m58625a(C29299t tVar, C29280i iVar, AbstractC29274d dVar, C29255aa aaVar, AbstractC29253a aVar) {
        C29312w wVar = aVar.f69375b;
        List<AbstractC29315y> list = tVar.f69516c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC29315y yVar = list.get(i);
            if (yVar.mo51062a(wVar)) {
                return new RunnableC29267c(tVar, iVar, dVar, aaVar, aVar, yVar);
            }
        }
        return new RunnableC29267c(tVar, iVar, dVar, aaVar, aVar, f69428w);
    }

    private RunnableC29267c(C29299t tVar, C29280i iVar, AbstractC29274d dVar, C29255aa aaVar, AbstractC29253a aVar, AbstractC29315y yVar) {
        this.f69430b = tVar;
        this.f69431c = iVar;
        this.f69432d = dVar;
        this.f69433e = aaVar;
        this.f69439k = aVar;
        this.f69434f = aVar.f69382i;
        this.f69435g = aVar.f69375b;
        this.f69447s = aVar.f69375b.f69576r;
        this.f69436h = aVar.f69378e;
        this.f69437i = aVar.f69379f;
        this.f69438j = yVar;
        this.f69446r = yVar.mo51104a();
    }
}
