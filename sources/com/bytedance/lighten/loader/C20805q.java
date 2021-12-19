package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.C20778a;
import com.bytedance.lighten.loader.C20793k;
import com.bytedance.lighten.loader.C20796m;
import com.bytedance.lighten.loader.C20818s;
import com.bytedance.lighten.p1477a.AbstractC20723c;
import com.bytedance.lighten.p1477a.AbstractC20752i;
import com.bytedance.lighten.p1477a.C20713a;
import com.bytedance.lighten.p1477a.C20717b;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20765u;
import com.bytedance.lighten.p1477a.EnumC20739d;
import com.bytedance.lighten.p1477a.EnumC20760q;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20735l;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.bytedance.lighten.p1477a.p1481d.C20740a;
import com.bytedance.lighten.p1477a.p1481d.ExecutorC20742b;
import com.facebook.common.p1835g.EnumC24105b;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1854e.C24228p;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.p1857h.AbstractC24256b;
import com.facebook.drawee.view.C24261b;
import com.facebook.drawee.view.C24262c;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1888m.C24470a;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.C24161f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lighten.loader.q */
public final class C20805q implements AbstractC20752i {

    /* renamed from: a */
    public AbstractC20723c f49211a;

    /* renamed from: b */
    private ExecutorService f49212b;

    static {
        Covode.recordClassIndex(24381);
    }

    /* renamed from: e */
    private static C24363d m39148e(C20765u uVar) {
        return new C24363d(uVar.f49069i, uVar.f49070j);
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public final void trimDisk(final int i) {
        this.f49212b.submit(new Runnable() {
            /* class com.bytedance.lighten.loader.C20805q.RunnableC208083 */

            static {
                Covode.recordClassIndex(24384);
            }

            public final void run() {
                C1764a.m5928a("before trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(C24428k.m46551a().mo40246d().mo39577b()), Long.valueOf(C24428k.m46551a().mo40246d().mo39574a() / 1024), Long.valueOf(C24428k.m46551a().mo40250h().mo39577b()), Long.valueOf(C24428k.m46551a().mo40250h().mo39574a() / 1024)});
                int i = i;
                if (i == 1) {
                    C24428k.m46551a().mo40246d().mo39581d();
                    C24428k.m46551a().mo40250h().mo39581d();
                } else if (i == 2) {
                    C24428k.m46551a().mo40246d().mo39583e();
                    C24428k.m46551a().mo40250h().mo39583e();
                }
                C1764a.m5928a("after trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(C24428k.m46551a().mo40246d().mo39577b()), Long.valueOf(C24428k.m46551a().mo40246d().mo39574a() / 1024), Long.valueOf(C24428k.m46551a().mo40250h().mo39577b()), Long.valueOf(C24428k.m46551a().mo40250h().mo39574a() / 1024)});
            }
        });
    }

    /* renamed from: com.bytedance.lighten.loader.q$a */
    class C20815a implements C20796m.AbstractC20799b {

        /* renamed from: a */
        public AbstractC20735l f49234a;

        /* renamed from: c */
        private C20765u f49236c;

        static {
            Covode.recordClassIndex(24391);
        }

        @Override // com.bytedance.lighten.loader.C20796m.AbstractC20799b
        /* renamed from: a */
        public final void mo34231a(final File file) {
            C20765u uVar;
            if (this.f49234a != null && (uVar = this.f49236c) != null) {
                C20805q.m39139a(uVar).execute(new Runnable() {
                    /* class com.bytedance.lighten.loader.C20805q.C20815a.RunnableC208161 */

                    static {
                        Covode.recordClassIndex(24392);
                    }

                    public final void run() {
                        C20815a.this.f49234a.mo34160a();
                    }
                });
            }
        }

        public C20815a(C20765u uVar, AbstractC20735l lVar) {
            this.f49234a = lVar;
            this.f49236c = uVar;
        }
    }

    C20805q(AbstractC20723c cVar) {
        this.f49211a = cVar;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95504b = "fresco-loader-io";
        a.f95505c = 2;
        this.f49212b = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static Executor m39139a(C20765u uVar) {
        ExecutorC20742b bVar = ExecutorC20742b.C20743a.f48948a;
        if (uVar.f49047B != null) {
            return uVar.f49047B;
        }
        return bVar;
    }

    /* renamed from: h */
    private static EnumC24362c m39151h(C20765u uVar) {
        EnumC20760q qVar = uVar.f49086z;
        if (qVar == EnumC20760q.LOW) {
            return EnumC24362c.LOW;
        }
        if (qVar == EnumC20760q.HIGH) {
            return EnumC24362c.HIGH;
        }
        return EnumC24362c.MEDIUM;
    }

    /* renamed from: i */
    private static List<String> m39152i(C20765u uVar) {
        if (uVar.f49059N == null || uVar.f49059N.mo34125a()) {
            return Collections.emptyList();
        }
        return uVar.f49059N.f48941a;
    }

    /* renamed from: b */
    static C24636b[] m39144b(C20765u uVar) {
        List<String> i = m39152i(uVar);
        ArrayList arrayList = new ArrayList();
        for (String str : i) {
            arrayList.add(m39142b(uVar, Uri.parse(str)).mo40483a());
        }
        if (arrayList.size() == 0) {
            return new C24636b[0];
        }
        return (C24636b[]) arrayList.toArray(new C24636b[arrayList.size()]);
    }

    /* renamed from: c */
    private static void m39145c(C20765u uVar) {
        C24262c cVar;
        C24250e eVar;
        if (uVar.f49082v != null && (cVar = (C24262c) uVar.f49049D) != null) {
            C20745e eVar2 = uVar.f49082v;
            if (((C24246a) cVar.getHierarchy()).f57470a != null) {
                eVar = ((C24246a) cVar.getHierarchy()).f57470a;
            } else {
                eVar = new C24250e();
            }
            ((C24246a) cVar.getHierarchy()).mo39959a(m39137a(eVar, eVar2));
        }
    }

    /* renamed from: f */
    private static void m39149f(C20765u uVar) {
        C24262c cVar;
        if (!uVar.f49054I && (cVar = (C24262c) uVar.f49049D) != null) {
            Drawable drawable = uVar.f49079s;
            if (drawable == null) {
                ((C24246a) cVar.getHierarchy()).mo39953a(0, (Drawable) null);
            } else {
                ((C24246a) cVar.getHierarchy()).mo39953a(0, new C24228p(drawable, C24229q.AbstractC24231b.f57458h));
            }
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public final void trimMemory(int i) {
        if (i == 5) {
            C20818s.C20819a.f49249a.mo34254a(EnumC24105b.OnSystemLowMemoryWhileAppInForeground);
            C20778a.C20782a.f49171a.mo34212a();
        } else if (i == 10) {
            C20818s.C20819a.f49249a.mo34254a(EnumC24105b.OnCloseToDalvikHeapLimit);
            C20778a.C20782a.f49171a.mo34212a();
        } else if (i == 40) {
            C20818s.C20819a.f49249a.mo34254a(EnumC24105b.OnSystemLowMemoryWhileAppInBackground);
        }
    }

    /* renamed from: d */
    private static C24361b m39147d(C20765u uVar) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        if (uVar.f49080t != null) {
            imageDecodeOptionsBuilder.setBitmapConfig(uVar.f49080t);
        }
        imageDecodeOptionsBuilder.f57756e = uVar.f49066f;
        if (uVar.f49067g >= 0) {
            imageDecodeOptionsBuilder.mo40153a(uVar.f49067g);
        }
        if (uVar.f49064d != C20713a.f48937a.f48938b) {
            HashMap hashMap = new HashMap();
            hashMap.put("frame_scheduler_id", Integer.valueOf(uVar.f49064d));
            if (uVar.f49060O != null) {
                hashMap.put("frame_scheduler_listener", uVar.f49060O);
            }
            imageDecodeOptionsBuilder.f57762k = hashMap;
        }
        return imageDecodeOptionsBuilder.mo40154a();
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public final void download(final C20765u uVar) {
        final Uri parse;
        List<String> i = m39152i(uVar);
        if (i.isEmpty()) {
            parse = uVar.f49061a;
        } else {
            parse = Uri.parse(i.get(0));
        }
        final AbstractC20735l lVar = uVar.f49052G;
        if (!this.f49211a.mo34143c(parse)) {
            C24636b fromUri = C24636b.fromUri(parse);
            C24413h e = C24428k.m46551a().mo40247e();
            if (lVar == null) {
                e.mo40236d(fromUri, null);
            } else {
                e.mo40236d(fromUri, null).mo39739a(new AbstractC24156b<Void>() {
                    /* class com.bytedance.lighten.loader.C20805q.C208072 */

                    static {
                        Covode.recordClassIndex(24383);
                    }

                    @Override // com.facebook.p1844d.AbstractC24156b
                    public final void onFailureImpl(AbstractC24157c<Void> cVar) {
                        Thread.currentThread();
                        cVar.mo39748e();
                        AbstractC20735l lVar = lVar;
                        cVar.mo39748e();
                        lVar.mo34161b();
                    }

                    @Override // com.facebook.p1844d.AbstractC24156b
                    public final void onNewResultImpl(AbstractC24157c<Void> cVar) {
                        if (cVar.mo39745b()) {
                            File b = C20805q.this.f49211a.mo34142b(parse);
                            Thread.currentThread();
                            if (b != null) {
                                lVar.mo34160a();
                                return;
                            }
                            AbstractC24026e a = C24389j.m46446a().mo40187a(C24636b.fromUri(parse));
                            C20796m mVar = C20796m.C20798a.f49203a;
                            C20815a aVar = new C20815a(uVar, lVar);
                            List<SoftReference<C20796m.AbstractC20799b>> list = mVar.f49200a.get(a);
                            if (list == null) {
                                list = new LinkedList<>();
                                mVar.f49200a.put(a, list);
                            }
                            list.add(new SoftReference<>(aVar));
                        }
                    }
                }, m39139a(uVar));
            }
        } else if (lVar != null) {
            m39139a(uVar).execute(new Runnable() {
                /* class com.bytedance.lighten.loader.C20805q.RunnableC208061 */

                static {
                    Covode.recordClassIndex(24382);
                }

                public final void run() {
                    C20805q.this.f49211a.mo34142b(parse);
                    Thread.currentThread();
                    lVar.mo34160a();
                }
            });
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public final void loadBitmap(C20765u uVar) {
        if (uVar.f49059N == null || uVar.f49059N.mo34125a()) {
            m39140a(C24428k.m46551a().mo40247e().mo40224a(m39138a(uVar, uVar.f49061a), (Object) null), uVar);
            return;
        }
        C24636b[] b = m39144b(uVar);
        if (b.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C24636b bVar : b) {
                if (bVar != null) {
                    arrayList.add(C24428k.m46551a().mo40247e().mo40223a(bVar, C24636b.EnumC24638b.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty()) {
                m39140a(C24161f.m45794a(arrayList).mo34217b(), uVar);
            }
        }
    }

    /* renamed from: g */
    private static void m39150g(C20765u uVar) {
        C24262c cVar = (C24262c) uVar.f49049D;
        if (cVar != null) {
            if (uVar.f49074n > 0) {
                if (uVar.f49076p != null) {
                    ((C24246a) cVar.getHierarchy()).mo39954a(uVar.f49074n, C20828x.m39185a(uVar.f49076p));
                } else {
                    ((C24246a) cVar.getHierarchy()).mo39966c(uVar.f49074n);
                }
            } else if (uVar.f49075o != null) {
                ((C24246a) cVar.getHierarchy()).mo39953a(1, uVar.f49075o);
            }
            if (uVar.f49077q > 0) {
                if (uVar.f49078r != null) {
                    ((C24246a) cVar.getHierarchy()).mo39962b(uVar.f49077q, C20828x.m39185a(uVar.f49078r));
                } else {
                    ((C24246a) cVar.getHierarchy()).mo39970d(uVar.f49077q);
                }
            }
            if (uVar.f49081u != null) {
                ((C24246a) cVar.getHierarchy()).mo39958a(C20828x.m39185a(uVar.f49081u));
            }
            if (uVar.f49057L > 0) {
                if (uVar.f49058M != null) {
                    ((C24246a) cVar.getHierarchy()).mo39967c(uVar.f49057L, C20828x.m39185a(uVar.f49058M));
                } else {
                    ((C24246a) cVar.getHierarchy()).mo39972e(uVar.f49057L);
                }
            }
            if (uVar.f49073m >= 0) {
                ((C24246a) cVar.getHierarchy()).mo39961b(uVar.f49073m);
            }
        }
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20752i
    public final void display(C20765u uVar) {
        Object obj;
        C24261b bVar;
        C24636b[] bVarArr;
        C24636b[] bVarArr2;
        boolean z;
        if (uVar.f49049D instanceof SmartCircleImageView) {
            ((SmartImageView) uVar.f49049D).mo34193a(uVar);
        } else if (uVar.f49049D instanceof SmartImageView) {
            ((SmartImageView) uVar.f49049D).mo34193a(uVar);
        } else if (uVar.f49050E != null) {
            ImageView imageView = uVar.f49050E;
            if (imageView != null) {
                Object tag = imageView.getTag();
                if (!(tag instanceof C20740a.C20741a) || (obj = ((C20740a.C20741a) tag).get("DraweeHolder")) == null) {
                    obj = null;
                }
                if (obj instanceof C24261b) {
                    bVar = (C24261b) obj;
                } else {
                    bVar = null;
                }
                C20784c cVar = new C20784c();
                cVar.mo34218a(uVar);
                boolean z2 = true;
                if (bVar == null) {
                    imageView.getContext();
                    bVar = C24261b.m46095a((AbstractC24256b) null);
                    C20793k.View$OnAttachStateChangeListenerC20794a aVar = new C20793k.View$OnAttachStateChangeListenerC20794a(bVar);
                    bVar.mo40004b(C20793k.m39127a(imageView, uVar));
                    if (uVar.f49059N != null && !uVar.f49059N.mo34125a()) {
                        bVarArr2 = m39144b(uVar);
                        if (bVarArr2 == null) {
                            return;
                        }
                    } else if (uVar.f49061a != null) {
                        bVarArr2 = new C24636b[]{m39138a(uVar, uVar.f49061a)};
                    } else {
                        return;
                    }
                    if (bVarArr2.length != 0) {
                        C24185e b = C24182c.m45843b();
                        b.f57306j = uVar.f49063c;
                        b.f57303g = cVar;
                        b.f57309m = bVar.f57519b;
                        C24185e eVar = (C24185e) b.mo39823a(bVarArr2);
                        eVar.f57307k = false;
                        if (uVar.f49057L > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        eVar.f57305i = z;
                        bVar.mo40001a(eVar.mo39827e());
                        int i = Build.VERSION.SDK_INT;
                        if (imageView.isAttachedToWindow()) {
                            aVar.onViewAttachedToWindow(imageView);
                        }
                        imageView.addOnAttachStateChangeListener(aVar);
                        imageView.setOnTouchListener(aVar);
                        Object tag2 = imageView.getTag();
                        if (tag2 instanceof C20740a.C20741a) {
                            ((C20740a.C20741a) tag2).put("DraweeHolder", bVar);
                        } else {
                            imageView.setTag(new C20740a.C20741a("DraweeHolder", bVar, (byte) 0));
                        }
                    } else {
                        return;
                    }
                } else {
                    bVar.mo40005c();
                    bVar.mo40004b(C20793k.m39127a(imageView, uVar));
                    if (uVar.f49059N != null && !uVar.f49059N.mo34125a()) {
                        bVarArr = m39144b(uVar);
                        if (bVarArr == null) {
                            return;
                        }
                    } else if (uVar.f49061a != null) {
                        bVarArr = new C24636b[]{m39138a(uVar, uVar.f49061a)};
                    } else {
                        return;
                    }
                    if (bVarArr.length != 0) {
                        C24185e b2 = C24182c.m45843b();
                        b2.f57306j = uVar.f49063c;
                        b2.f57303g = cVar;
                        C24185e eVar2 = (C24185e) b2.mo39823a(bVarArr);
                        eVar2.f57309m = bVar.f57519b;
                        eVar2.f57307k = false;
                        if (uVar.f49057L <= 0) {
                            z2 = false;
                        }
                        eVar2.f57305i = z2;
                        bVar.mo40001a(eVar2.mo39827e());
                        bVar.mo40003b();
                    } else {
                        return;
                    }
                }
                imageView.setImageDrawable(bVar.mo40008f());
            }
        } else {
            throw new IllegalArgumentException("Lighten:needs SmartImageView or ImageView to display, use with(view)");
        }
    }

    /* renamed from: a */
    static C24636b m39138a(C20765u uVar, Uri uri) {
        return m39142b(uVar, uri).mo40483a();
    }

    /* renamed from: b */
    private static void m39143b(C24639c cVar, C20765u uVar) {
        if (uVar.f49084x != null) {
            cVar.f58560k = new C20785d(uVar.f49084x);
        }
    }

    /* renamed from: c */
    private static void m39146c(C24639c cVar, C20765u uVar) {
        C20717b bVar = uVar.f49083w;
        if (bVar != null) {
            cVar.f58560k = new C24470a(bVar.f48942a, uVar.f49062b, bVar.f48945d);
        }
    }

    /* renamed from: a */
    private void m39140a(final AbstractC24157c<C24117a<AbstractC24454c>> cVar, final C20765u uVar) {
        final AbstractC20737n nVar = uVar.f49053H;
        if (nVar != null) {
            cVar.mo39739a(new AbstractC24435b() {
                /* class com.bytedance.lighten.loader.C20805q.C208094 */

                static {
                    Covode.recordClassIndex(24385);
                }

                @Override // com.facebook.p1844d.AbstractC24160e, com.facebook.p1844d.AbstractC24156b
                public final void onCancellation(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    if (cVar != null) {
                        cVar.mo39750g();
                        C20805q.m39139a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.C20805q.C208094.RunnableC208145 */

                            static {
                                Covode.recordClassIndex(24390);
                            }

                            public final void run() {
                                Thread.currentThread();
                                nVar.mo34150a();
                            }
                        });
                    }
                }

                @Override // com.facebook.p1844d.AbstractC24156b
                public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    if (cVar != null) {
                        final Throwable e = cVar.mo39748e();
                        C20805q.m39139a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.C20805q.C208094.RunnableC208123 */

                            static {
                                Covode.recordClassIndex(24388);
                            }

                            public final void run() {
                                Thread.currentThread();
                                nVar.mo34166a(e);
                            }
                        });
                    }
                }

                @Override // com.facebook.p1844d.AbstractC24160e, com.facebook.p1844d.AbstractC24156b
                public final void onProgressUpdate(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    if (cVar != null) {
                        final float f = cVar.mo39749f();
                        C20805q.m39139a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.C20805q.C208094.RunnableC208134 */

                            static {
                                Covode.recordClassIndex(24389);
                            }

                            public final void run() {
                                Thread.currentThread();
                            }
                        });
                    }
                }

                @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
                /* renamed from: a */
                public final void mo9033a(Bitmap bitmap) {
                    MethodCollector.m26663i(8785);
                    if (!cVar.mo39745b() || bitmap == null) {
                        C20805q.m39139a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.C20805q.C208094.RunnableC208112 */

                            static {
                                Covode.recordClassIndex(24387);
                            }

                            public final void run() {
                                Thread.currentThread();
                                cVar.mo39748e();
                                nVar.mo34166a(cVar.mo39748e());
                            }
                        });
                        MethodCollector.m26664o(8785);
                        return;
                    }
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    final Bitmap copy = bitmap.copy(config, true);
                    cVar.mo39750g();
                    C20805q.m39139a(uVar).execute(new Runnable() {
                        /* class com.bytedance.lighten.loader.C20805q.C208094.RunnableC208101 */

                        static {
                            Covode.recordClassIndex(24386);
                        }

                        public final void run() {
                            Thread.currentThread();
                            nVar.mo34165a(copy);
                        }
                    });
                    MethodCollector.m26664o(8785);
                }
            }, this.f49212b);
        }
    }

    /* renamed from: a */
    static C24250e m39137a(C24250e eVar, C20745e eVar2) {
        if (eVar2 == null) {
            return eVar;
        }
        if (eVar == null) {
            eVar = new C24250e();
        }
        if (eVar2.f48955g != null) {
            C20745e.C20747b bVar = eVar2.f48955g;
            eVar.mo39979a(bVar.f48965a, bVar.f48966b, bVar.f48967c, bVar.f48968d);
        } else if (eVar2.f48953e > 0.0f) {
            eVar.mo39978a(eVar2.f48953e);
        }
        eVar.f57500b = eVar2.f48952d;
        eVar.mo39985c(eVar2.f48949a);
        eVar.f57504f = eVar2.f48950b;
        eVar.mo39980a(eVar2.f48951c);
        eVar.mo39986d(eVar2.f48954f);
        eVar.f57499a = C20831z.m39187a(eVar2.f48956h);
        return eVar;
    }

    /* renamed from: b */
    private static C24639c m39142b(C20765u uVar, Uri uri) {
        C24639c a = C24639c.m47149a(uri);
        a.f58557h = uVar.f49068h;
        C24639c a2 = a.mo40486a(uVar.f49065e);
        if (uVar.f49048C == EnumC20739d.SMALL) {
            a2.f58556g = C24636b.EnumC24637a.SMALL;
        }
        m39143b(a2, uVar);
        m39141a(a2, uVar);
        m39146c(a2, uVar);
        m39145c(uVar);
        EnumC24362c h = m39151h(uVar);
        a2.f58555f = m39147d(uVar);
        a2.f58559j = h;
        a2.mo40486a(uVar.f49065e);
        if (uVar.f49069i > 0 || uVar.f49070j > 0) {
            a2.f58553d = m39148e(uVar);
        }
        a2.f58562m = uVar.f49056K;
        m39149f(uVar);
        m39150g(uVar);
        return a2;
    }

    /* renamed from: a */
    private static void m39141a(C24639c cVar, C20765u uVar) {
        if (uVar.f49085y != null && uVar.f49085y.f49131a != null && !uVar.f49085y.f49131a.isEmpty()) {
            cVar.f58560k = new C20788g(uVar.f49085y.f49131a.get(0));
        }
    }
}
