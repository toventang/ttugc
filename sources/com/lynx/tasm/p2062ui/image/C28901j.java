package com.lynx.tasm.p2062ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1851c.C24205f;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.C24261b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1888m.C24471b;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.C28454c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.p2062ui.image.p2063a.C28872a;
import com.lynx.tasm.p2062ui.image.p2063a.C28873b;
import com.lynx.tasm.p2062ui.image.p2063a.C28874c;
import com.lynx.tasm.p2062ui.image.p2063a.C28875d;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;
import com.lynx.tasm.p2062ui.image.p2064b.C28885c;
import com.lynx.tasm.p2062ui.image.p2064b.C28886d;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.lynx.tasm.ui.image.j */
public class C28901j {

    /* renamed from: t */
    public static Handler f68276t = new Handler(Looper.getMainLooper());

    /* renamed from: A */
    int f68277A;

    /* renamed from: B */
    public boolean f68278B;

    /* renamed from: C */
    String f68279C;

    /* renamed from: D */
    String f68280D;

    /* renamed from: E */
    public int f68281E;

    /* renamed from: F */
    public boolean f68282F;

    /* renamed from: G */
    private EnumC28893f f68283G;

    /* renamed from: H */
    private final List<C28885c> f68284H;

    /* renamed from: I */
    private C28885c f68285I;

    /* renamed from: J */
    private Bitmap.Config f68286J;

    /* renamed from: a */
    public final Context f68287a;

    /* renamed from: b */
    public C28885c f68288b;

    /* renamed from: c */
    C28885c f68289c;

    /* renamed from: d */
    public final AbstractC24198b f68290d;

    /* renamed from: e */
    C24471b f68291e;

    /* renamed from: f */
    public AbstractC24203d f68292f;

    /* renamed from: g */
    public AbstractC24203d f68293g;

    /* renamed from: h */
    public final Object f68294h;

    /* renamed from: i */
    int f68295i;

    /* renamed from: j */
    int f68296j;

    /* renamed from: k */
    public boolean f68297k;

    /* renamed from: l */
    public ReadableMap f68298l;

    /* renamed from: m */
    public C24229q.AbstractC24231b f68299m;

    /* renamed from: n */
    public boolean f68300n;

    /* renamed from: o */
    C28683b f68301o;

    /* renamed from: p */
    public boolean f68302p;

    /* renamed from: q */
    public C24261b<C24246a> f68303q;

    /* renamed from: r */
    public AbstractC28908a f68304r;

    /* renamed from: s */
    public C24636b f68305s;

    /* renamed from: u */
    C28890d f68306u;

    /* renamed from: v */
    String f68307v;

    /* renamed from: w */
    int f68308w;

    /* renamed from: x */
    int f68309x;

    /* renamed from: y */
    int f68310y;

    /* renamed from: z */
    int f68311z;

    /* renamed from: com.lynx.tasm.ui.image.j$a */
    public interface AbstractC28908a {
        static {
            Covode.recordClassIndex(35031);
        }

        /* renamed from: O_ */
        void mo49986O_();

        /* renamed from: a */
        void mo49987a(Drawable drawable);

        /* renamed from: a */
        void mo49988a(C24117a<?> aVar);
    }

    /* renamed from: d */
    private boolean m57893d() {
        if (this.f68284H.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo50106a() {
        this.f68302p = true;
        C24261b<C24246a> bVar = this.f68303q;
        if (bVar != null) {
            bVar.mo40003b();
        }
    }

    /* renamed from: b */
    public final void mo50111b() {
        this.f68302p = false;
        C24261b<C24246a> bVar = this.f68303q;
        if (bVar != null) {
            bVar.mo40005c();
        }
    }

    static {
        Covode.recordClassIndex(35024);
    }

    /* renamed from: c */
    public final String mo50112c() {
        List<C28885c> list = this.f68284H;
        if (list == null || list.size() <= 0 || this.f68284H.get(0) == null) {
            return null;
        }
        return this.f68284H.get(0).mo50100a().toString();
    }

    /* renamed from: a */
    public final void mo50108a(Bitmap.Config config) {
        this.f68286J = config;
        this.f68300n = true;
    }

    /* renamed from: b */
    static void m57892b(String str) {
        LLog.m56861c("Lynx", "Warning: Image source \"" + str + "\" doesn't exist");
    }

    /* renamed from: a */
    public final void mo50109a(String str) {
        this.f68307v = str;
        this.f68308w = 1;
        mo50110a(str, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50110a(String str, boolean z) {
        if (z) {
            str = C28621a.m57207a(this.f68287a, str);
        }
        if (this.f68284H.isEmpty() || !this.f68284H.get(0).f68251a.equals(str)) {
            this.f68284H.clear();
            if (str != null && !str.isEmpty()) {
                C28885c cVar = new C28885c(this.f68287a, str);
                this.f68284H.add(cVar);
                if (Uri.EMPTY.equals(cVar.mo50100a())) {
                    m57892b(str);
                }
            }
            this.f68300n = true;
        }
    }

    private C28901j(Context context, AbstractC24198b bVar, AbstractC28908a aVar) {
        this.f68283G = EnumC28893f.RESIZE;
        this.f68287a = context;
        this.f68299m = C24229q.AbstractC24231b.f57452b;
        this.f68290d = bVar;
        this.f68294h = null;
        this.f68284H = new LinkedList();
        this.f68304r = aVar;
    }

    public C28901j(Context context, AbstractC24198b bVar, AbstractC28908a aVar, boolean z) {
        this(context, bVar, aVar);
        this.f68278B = z;
    }

    /* renamed from: a */
    public final void mo50107a(int i, int i2, int i3, int i4, int i5, int i6) {
        float[] fArr;
        boolean z;
        C24117a<AbstractC24454c> a;
        if (!(this.f68295i == i && this.f68296j == i2)) {
            this.f68295i = i;
            this.f68296j = i2;
            this.f68300n = true;
        }
        this.f68309x = i3;
        this.f68310y = i5;
        this.f68311z = i4;
        this.f68277A = i6;
        if (this.f68300n && !m57893d() && i > 0 && i2 > 0) {
            this.f68288b = null;
            if (!this.f68284H.isEmpty()) {
                if (m57893d()) {
                    C28886d.C28887a a2 = C28886d.m57866a(i, i2, this.f68284H);
                    this.f68288b = a2.f68255a;
                    this.f68285I = a2.f68256b;
                } else {
                    this.f68288b = this.f68284H.get(0);
                }
            }
            if (this.f68288b != null || this.f68289c != null) {
                TraceEvent.m56864a(0, "LynxImageManager.maybeUpdateView");
                C28885c cVar = this.f68288b;
                if (!(cVar == null || cVar.f68251a == null || !this.f68282F || this.f68287a == null)) {
                    final String str = this.f68288b.f68251a;
                    C28621a.m57209a(this.f68287a, str, (float) i, (float) i2, new AbstractC28510f.AbstractC28511a() {
                        /* class com.lynx.tasm.p2062ui.image.C28901j.C289062 */

                        static {
                            Covode.recordClassIndex(35029);
                        }

                        @Override // com.lynx.tasm.behavior.AbstractC28510f.AbstractC28511a
                        /* renamed from: a */
                        public final void mo49016a(final Object obj, Throwable th) {
                            if (obj instanceof C24117a) {
                                try {
                                    Object a = ((C24117a) obj).mo39695a();
                                    if ((a instanceof Bitmap) || (a instanceof AbstractC24453b)) {
                                        RunnableC289071 r2 = new Runnable() {
                                            /* class com.lynx.tasm.p2062ui.image.C28901j.C289062.RunnableC289071 */

                                            static {
                                                Covode.recordClassIndex(35030);
                                            }

                                            public final void run() {
                                                if (C28901j.this.f68288b != null && str.equals(C28901j.this.f68288b.f68251a)) {
                                                    C28901j.this.f68304r.mo49988a(((C24117a) obj).clone());
                                                }
                                            }
                                        };
                                        if (Looper.myLooper() == Looper.getMainLooper()) {
                                            r2.run();
                                        } else {
                                            new Handler(Looper.getMainLooper()).post(r2);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    });
                }
                final WeakReference weakReference = new WeakReference(this);
                C24229q.AbstractC24231b bVar = this.f68299m;
                final C24261b<C24246a> bVar2 = this.f68303q;
                if (bVar2 instanceof C28911l) {
                    bVar2 = null;
                }
                C28683b bVar3 = this.f68301o;
                if (bVar3 != null) {
                    bVar3.mo49768a((float) i, (float) i2);
                    fArr = this.f68301o.mo49770a();
                } else {
                    fArr = null;
                }
                final C24636b a3 = m57891a(this.f68288b, i, i2, i3, i4, i5, i6, fArr, bVar);
                this.f68305s = a3;
                if (a3 == null || (a = C24428k.m46551a().mo40247e().f57868a.mo40201a(C24428k.m46551a().mo40247e().f57871d.mo40190b(a3, null))) == null || a.mo39695a() == null || !(a.mo39695a() instanceof C24455d) || a.mo39695a() == null) {
                    final String str2 = this.f68307v;
                    final C24636b a4 = m57891a(this.f68285I, i, i2, i3, i4, i5, i6, fArr, bVar);
                    final C24636b a5 = m57891a(this.f68289c, i, i2, i3, i4, i5, i6, fArr, bVar);
                    HandlerThreadC28891e a6 = HandlerThreadC28891e.m57879a();
                    RunnableC289021 r11 = new Runnable() {
                        /* class com.lynx.tasm.p2062ui.image.C28901j.RunnableC289021 */

                        static {
                            Covode.recordClassIndex(35025);
                        }

                        public final void run() {
                            final C24261b bVar = bVar2;
                            if (bVar == null) {
                                C24247b bVar2 = new C24247b(C28901j.this.f68287a.getResources());
                                bVar2.f57495t = C24250e.m46055b(0.0f);
                                bVar = C24261b.m46095a(bVar2.mo39973a());
                            }
                            C28901j.this.f68290d.mo39825b();
                            REQUEST request = (REQUEST) a4;
                            if (request == null) {
                                request = (REQUEST) a5;
                            }
                            AbstractC24198b bVar3 = C28901j.this.f68290d;
                            bVar3.f57306j = true;
                            bVar3.f57298b = C28901j.this.f68294h;
                            bVar3.f57303g = new C24202c() {
                                /* class com.lynx.tasm.p2062ui.image.C28901j.RunnableC289021.C289031 */

                                static {
                                    Covode.recordClassIndex(35026);
                                }

                                @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                                public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                    if (weakReference.get() != null) {
                                        ((C28901j) weakReference.get()).f68304r.mo49986O_();
                                    }
                                    if (animatable instanceof C24290a) {
                                        C24290a aVar = (C24290a) animatable;
                                        aVar.mo40069a(new C28874c(aVar.f57588d, C28901j.this.f68281E));
                                        C28884b.m57862a(aVar);
                                    }
                                }
                            };
                            bVar3.f57299c = (REQUEST) a3;
                            bVar3.f57300d = request;
                            C28901j.this.f68292f = new C24202c<AbstractC24457f>() {
                                /* class com.lynx.tasm.p2062ui.image.C28901j.RunnableC289021.C289042 */

                                static {
                                    Covode.recordClassIndex(35027);
                                }

                                @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                                public final void onSubmit(String str, Object obj) {
                                }

                                @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                                public final void onFailure(String str, Throwable th) {
                                    C28901j jVar = C28901j.this;
                                    String str2 = str2;
                                    if (str2 != null && str2.equals(jVar.f68307v) && str2.startsWith("http")) {
                                        int i = jVar.f68308w;
                                        jVar.f68308w = i - 1;
                                        if (i > 0) {
                                            jVar.mo50110a(str2, false);
                                            jVar.f68300n = true;
                                            jVar.mo50107a(jVar.f68295i, jVar.f68296j, jVar.f68309x, jVar.f68311z, jVar.f68310y, jVar.f68277A);
                                            return;
                                        }
                                    }
                                    LLog.m56862d("FrescoImageView", "onFailed src:" + str2 + "with reason" + th.getMessage());
                                    if (C28901j.this.f68306u != null) {
                                        String message = th.getMessage();
                                        if (TextUtils.isEmpty(message) && (message = Log.getStackTraceString(th)) != null && message.length() > 200) {
                                            message = message.substring(0, 200);
                                        }
                                        C28901j.this.f68306u.mo50007a("Android LynxImageManager loading image failed, and the url is " + C28901j.this.mo50112c() + ". The Fresco throw error msg is " + message);
                                    }
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                                @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                                public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                                    AbstractC24457f fVar2 = fVar;
                                    if (C28901j.this.f68306u != null) {
                                        C28901j.this.f68306u.mo50006a(fVar2.getWidth(), fVar2.getHeight());
                                    }
                                    if (animatable instanceof C24290a) {
                                        C24290a aVar = (C24290a) animatable;
                                        aVar.mo40069a(new C28874c(aVar.f57588d, C28901j.this.f68281E));
                                        C28884b.m57862a(aVar);
                                    }
                                }
                            };
                            if (C28901j.this.f68293g == null) {
                                C28901j.this.f68290d.f57303g = C28901j.this.f68292f;
                            } else {
                                C24205f fVar = new C24205f();
                                fVar.mo39830a(C28901j.this.f68292f);
                                fVar.mo39830a(C28901j.this.f68293g);
                                C28901j.this.f68290d.f57303g = fVar;
                            }
                            bVar.mo40001a(C28901j.this.f68290d.mo39827e());
                            C28901j.this.f68290d.mo39825b();
                            if (C28901j.this.f68278B && bVar.mo40007e()) {
                                ((C24246a) bVar.mo40006d()).mo39958a(C24229q.AbstractC24231b.f57452b);
                            }
                            final Drawable f = bVar.mo40008f();
                            C28901j.f68276t.post(new Runnable() {
                                /* class com.lynx.tasm.p2062ui.image.C28901j.RunnableC289021.RunnableC289053 */

                                static {
                                    Covode.recordClassIndex(35028);
                                }

                                public final void run() {
                                    if (a3 == C28901j.this.f68305s) {
                                        if (C28901j.this.f68304r != null) {
                                            C28901j.this.f68304r.mo49987a(f);
                                        }
                                        if (C28901j.this.f68303q != bVar) {
                                            if (C28901j.this.f68303q != null) {
                                                C28901j.this.f68303q.mo40005c();
                                            }
                                            C28901j.this.f68303q = bVar;
                                            if (C28901j.this.f68302p) {
                                                C28901j.this.f68303q.mo40003b();
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    };
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C28454c.m56882a(z);
                    if (a6.f68269c == null) {
                        if (a6.f68267a == null) {
                            a6.f68267a = new LinkedList();
                        }
                        a6.f68267a.add(r11);
                    } else {
                        a6.f68269c.post(r11);
                    }
                    this.f68300n = false;
                    TraceEvent.m56869b(0, "LynxImageManager.maybeUpdateView");
                    return;
                }
                C24261b<C24246a> bVar4 = this.f68303q;
                if (bVar4 != null) {
                    bVar4.mo40005c();
                }
                C28911l lVar = new C28911l(a);
                this.f68303q = lVar;
                if (this.f68278B && lVar.mo40007e()) {
                    this.f68303q.mo40006d().mo39958a(C24229q.AbstractC24231b.f57452b);
                }
                if (this.f68306u != null) {
                    AbstractC24454c a7 = a.mo39695a();
                    this.f68306u.mo50006a(a7.getWidth(), a7.getHeight());
                }
                this.f68304r.mo49987a(this.f68303q.mo40008f());
                this.f68300n = false;
                TraceEvent.m56869b(0, "LynxImageManager.maybeUpdateView");
            }
        }
    }

    /* renamed from: a */
    private C24636b m57891a(C28885c cVar, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, C24229q.AbstractC24231b bVar) {
        C24363d dVar = null;
        if (cVar == null) {
            return null;
        }
        TraceEvent.m56864a(0, "LynxImageManager.createImageRequest");
        if (this.f68283G != EnumC28893f.AUTO ? this.f68283G == EnumC28893f.RESIZE : !(!C24134g.m45739d(cVar.mo50100a()) && !C24134g.m45738c(cVar.mo50100a()))) {
            dVar = new C24363d(i, i2);
        }
        LinkedList linkedList = new LinkedList();
        if (this.f68278B) {
            linkedList.add(new C28872a(cVar.mo50100a().toString(), i, i2, i3, i4, i5, i6, this.f68286J));
        } else {
            linkedList.add(new C28909b(cVar.mo50100a().toString(), i, i2, i3, i4, i5, i6, fArr, bVar, this.f68279C, this.f68280D, this.f68286J));
        }
        C24471b bVar2 = this.f68291e;
        if (bVar2 != null) {
            linkedList.add(bVar2);
        }
        AbstractC24641d a = C28910k.m57905a(linkedList);
        C24639c a2 = C24639c.m47149a(cVar.mo50100a());
        C28884b.m57860a(a2);
        a2.f58560k = a;
        a2.f58553d = dVar;
        a2.mo40486a(true).f58557h = this.f68297k;
        C28875d a3 = C28875d.m57840a(a2, this.f68298l);
        TraceEvent.m56869b(0, "LynxImageManager.createImageRequest");
        return a3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.ui.image.j$b */
    public static class C28909b extends C28873b {
        static {
            Covode.recordClassIndex(35032);
        }

        C28909b(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, C24229q.AbstractC24231b bVar, String str2, String str3, Bitmap.Config config) {
            super(str, i, i2, i3, i4, i5, i6, fArr, bVar, str2, str3, config);
        }
    }
}
