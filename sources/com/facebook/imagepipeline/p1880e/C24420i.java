package com.facebook.imagepipeline.p1880e;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.common.p1835g.C24108e;
import com.facebook.common.p1840l.AbstractC24135a;
import com.facebook.common.p1840l.AbstractC24136b;
import com.facebook.common.p1840l.C24138c;
import com.facebook.imagepipeline.memory.C24477ab;
import com.facebook.imagepipeline.memory.C24479ac;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1878c.C24355d;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.AbstractC24395n;
import com.facebook.imagepipeline.p1879d.C24371d;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1879d.C24388i;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1879d.C24390k;
import com.facebook.imagepipeline.p1879d.C24398q;
import com.facebook.imagepipeline.p1879d.C24402t;
import com.facebook.imagepipeline.p1880e.C24424j;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1882g.AbstractC24445e;
import com.facebook.imagepipeline.p1882g.C24443d;
import com.facebook.imagepipeline.p1882g.C24447g;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import com.facebook.imagepipeline.p1889n.C24615u;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.imagepipeline.p1892q.AbstractC24650c;
import com.facebook.p1826c.p1828b.C24042c;
import com.p2082ss.android.ugc.aweme.experiment.C46726bb;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2433ca.C35349f;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.e.i */
public class C24420i {

    /* renamed from: B */
    public static C24423b f57892B = new C24423b((byte) 0);

    /* renamed from: A */
    public final boolean f57893A;

    /* renamed from: C */
    private final int f57894C;

    /* renamed from: a */
    public final Bitmap.Config f57895a;

    /* renamed from: b */
    public final AbstractC24093k<C24398q> f57896b;

    /* renamed from: c */
    public final C24382h.AbstractC24385a f57897c;

    /* renamed from: d */
    public final AbstractC24380f f57898d;

    /* renamed from: e */
    public final Context f57899e;

    /* renamed from: f */
    public final boolean f57900f;

    /* renamed from: g */
    public final AbstractC24411f f57901g;

    /* renamed from: h */
    public final AbstractC24093k<C24398q> f57902h;

    /* renamed from: i */
    public final AbstractC24410e f57903i;

    /* renamed from: j */
    public final AbstractC24395n f57904j;

    /* renamed from: k */
    public final AbstractC24442c f57905k;

    /* renamed from: l */
    public final AbstractC24650c f57906l;

    /* renamed from: m */
    public final Integer f57907m;

    /* renamed from: n */
    public final AbstractC24093k<Boolean> f57908n;

    /* renamed from: o */
    public final C24042c f57909o;

    /* renamed from: p */
    public final AbstractC24107d f57910p;

    /* renamed from: q */
    public final int f57911q;

    /* renamed from: r */
    public final AbstractC24529ag f57912r;

    /* renamed from: s */
    public final AbstractC24357f f57913s;

    /* renamed from: t */
    public final C24479ac f57914t;

    /* renamed from: u */
    public final AbstractC24445e f57915u;

    /* renamed from: v */
    final Set<AbstractC24462c> f57916v;

    /* renamed from: w */
    public final boolean f57917w;

    /* renamed from: x */
    public final C24042c f57918x;

    /* renamed from: y */
    public final C24443d f57919y;

    /* renamed from: z */
    public final C24424j f57920z;

    /* renamed from: com.facebook.imagepipeline.e.i$b */
    public static class C24423b {

        /* renamed from: a */
        public boolean f57950a;

        static {
            Covode.recordClassIndex(28566);
        }

        private C24423b() {
        }

        /* synthetic */ C24423b(byte b) {
            this();
        }
    }

    /* renamed from: com.facebook.imagepipeline.e.i$a */
    public static class C24422a {

        /* renamed from: A */
        public final C24424j.C24425a f57922A;

        /* renamed from: B */
        public boolean f57923B;

        /* renamed from: a */
        public Bitmap.Config f57924a;

        /* renamed from: b */
        public AbstractC24093k<C24398q> f57925b;

        /* renamed from: c */
        public C24382h.AbstractC24385a f57926c;

        /* renamed from: d */
        public AbstractC24380f f57927d;

        /* renamed from: e */
        public final Context f57928e;

        /* renamed from: f */
        public boolean f57929f;

        /* renamed from: g */
        public AbstractC24093k<C24398q> f57930g;

        /* renamed from: h */
        public AbstractC24410e f57931h;

        /* renamed from: i */
        public AbstractC24395n f57932i;

        /* renamed from: j */
        public AbstractC24442c f57933j;

        /* renamed from: k */
        public AbstractC24650c f57934k;

        /* renamed from: l */
        public Integer f57935l;

        /* renamed from: m */
        public AbstractC24093k<Boolean> f57936m;

        /* renamed from: n */
        public C24042c f57937n;

        /* renamed from: o */
        public AbstractC24107d f57938o;

        /* renamed from: p */
        public Integer f57939p;

        /* renamed from: q */
        public AbstractC24529ag f57940q;

        /* renamed from: r */
        public AbstractC24357f f57941r;

        /* renamed from: s */
        public C24479ac f57942s;

        /* renamed from: t */
        public AbstractC24445e f57943t;

        /* renamed from: u */
        public Set<AbstractC24462c> f57944u;

        /* renamed from: v */
        public boolean f57945v;

        /* renamed from: w */
        public C24042c f57946w;

        /* renamed from: x */
        public AbstractC24411f f57947x;

        /* renamed from: y */
        public C24443d f57948y;

        /* renamed from: z */
        public int f57949z;

        static {
            Covode.recordClassIndex(28565);
        }

        /* renamed from: a */
        public final C24420i mo40240a() {
            return new C24420i(this, (byte) 0);
        }

        /* renamed from: a */
        public final C24422a mo40239a(AbstractC24093k<C24398q> kVar) {
            this.f57925b = (AbstractC24093k) C24091i.m45617a(kVar);
            return this;
        }

        /* renamed from: b */
        public final C24422a mo40241b(AbstractC24093k<C24398q> kVar) {
            this.f57930g = (AbstractC24093k) C24091i.m45617a(kVar);
            return this;
        }

        private C24422a(Context context) {
            this.f57945v = true;
            this.f57949z = -1;
            this.f57922A = new C24424j.C24425a(this);
            this.f57923B = true;
            this.f57928e = (Context) C24091i.m45617a(context);
        }

        /* synthetic */ C24422a(Context context, byte b) {
            this(context);
        }
    }

    static {
        Covode.recordClassIndex(28563);
    }

    /* renamed from: a */
    public static C24422a m46539a(Context context) {
        C24422a aVar = new C24422a(context, (byte) 0);
        if (C46726bb.m90107b() || C46726bb.m90106a() == 2) {
            aVar.f57931h = new C35349f();
        }
        return aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static C24042c m46542b(Context context) {
        try {
            C24644b.m47156a();
            C24042c a = C24042c.m45500a(context).mo39573a();
            C24644b.m47156a();
            return a;
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    private C24420i(C24422a aVar) {
        AbstractC24093k<C24398q> kVar;
        C24382h.AbstractC24385a aVar2;
        Bitmap.Config config;
        AbstractC24380f fVar;
        AbstractC24411f fVar2;
        AbstractC24093k<C24398q> kVar2;
        AbstractC24395n nVar;
        AbstractC24650c cVar;
        AbstractC24093k<Boolean> kVar3;
        C24042c cVar2;
        AbstractC24107d dVar;
        int i;
        AbstractC24529ag agVar;
        C24479ac acVar;
        AbstractC24445e eVar;
        Set<AbstractC24462c> set;
        AbstractC24410e eVar2;
        AbstractC24136b a;
        C24644b.m47156a();
        int i2 = 0;
        C24424j jVar = new C24424j(aVar.f57922A, (byte) 0);
        this.f57920z = jVar;
        if (aVar.f57925b == null) {
            kVar = new C24388i((ActivityManager) m46540a(aVar.f57928e, "activity"));
        } else {
            kVar = aVar.f57925b;
        }
        this.f57896b = kVar;
        if (aVar.f57926c == null) {
            aVar2 = new C24371d();
        } else {
            aVar2 = aVar.f57926c;
        }
        this.f57897c = aVar2;
        if (aVar.f57924a == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = aVar.f57924a;
        }
        this.f57895a = config;
        if (aVar.f57927d == null) {
            fVar = C24389j.m46446a();
        } else {
            fVar = aVar.f57927d;
        }
        this.f57898d = fVar;
        this.f57899e = (Context) C24091i.m45617a(aVar.f57928e);
        if (aVar.f57947x == null) {
            fVar2 = new C24407b(new C24409d());
        } else {
            fVar2 = aVar.f57947x;
        }
        this.f57901g = fVar2;
        this.f57900f = aVar.f57929f;
        if (aVar.f57930g == null) {
            kVar2 = new C24390k();
        } else {
            kVar2 = aVar.f57930g;
        }
        this.f57902h = kVar2;
        if (aVar.f57932i == null) {
            nVar = C24402t.m46477a();
        } else {
            nVar = aVar.f57932i;
        }
        this.f57904j = nVar;
        this.f57905k = aVar.f57933j;
        if (aVar.f57934k == null || aVar.f57935l == null) {
            if (aVar.f57934k != null) {
                cVar = aVar.f57934k;
            } else {
                cVar = null;
            }
            this.f57906l = cVar;
            this.f57907m = aVar.f57935l;
            if (aVar.f57936m == null) {
                kVar3 = new AbstractC24093k<Boolean>() {
                    /* class com.facebook.imagepipeline.p1880e.C24420i.C244211 */

                    static {
                        Covode.recordClassIndex(28564);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.facebook.common.p1832d.AbstractC24093k
                    /* renamed from: b */
                    public final /* synthetic */ Boolean mo34217b() {
                        return true;
                    }
                };
            } else {
                kVar3 = aVar.f57936m;
            }
            this.f57908n = kVar3;
            if (aVar.f57937n == null) {
                cVar2 = m46542b(aVar.f57928e);
            } else {
                cVar2 = aVar.f57937n;
            }
            this.f57909o = cVar2;
            if (aVar.f57938o == null) {
                dVar = C24108e.m45686a();
            } else {
                dVar = aVar.f57938o;
            }
            this.f57910p = dVar;
            if (aVar.f57939p != null) {
                i2 = aVar.f57939p.intValue();
            } else if (jVar.f57961k) {
                i2 = 1;
            }
            this.f57911q = i2;
            if (aVar.f57949z < 0) {
                i = 30000;
            } else {
                i = aVar.f57949z;
            }
            this.f57894C = i;
            C24644b.m47156a();
            if (aVar.f57940q == null) {
                agVar = new C24615u(i);
            } else {
                agVar = aVar.f57940q;
            }
            this.f57912r = agVar;
            C24644b.m47156a();
            this.f57913s = aVar.f57941r;
            if (aVar.f57942s == null) {
                acVar = new C24479ac(C24477ab.m46748a().mo40352a());
            } else {
                acVar = aVar.f57942s;
            }
            this.f57914t = acVar;
            if (aVar.f57943t == null) {
                eVar = new C24447g();
            } else {
                eVar = aVar.f57943t;
            }
            this.f57915u = eVar;
            if (aVar.f57944u == null) {
                set = new HashSet<>();
            } else {
                set = aVar.f57944u;
            }
            this.f57916v = set;
            this.f57917w = aVar.f57945v;
            this.f57918x = aVar.f57946w != null ? aVar.f57946w : cVar2;
            this.f57919y = aVar.f57948y;
            int c = acVar.mo40356c();
            if (aVar.f57931h == null) {
                eVar2 = new C24406a(c);
            } else {
                eVar2 = aVar.f57931h;
            }
            this.f57903i = eVar2;
            this.f57893A = aVar.f57923B;
            AbstractC24136b bVar = jVar.f57954d;
            if (bVar != null) {
                m46541a(bVar, jVar, new C24355d(acVar));
            } else if (jVar.f57951a && C24138c.f57082a && (a = C24138c.m45745a()) != null) {
                m46541a(a, jVar, new C24355d(acVar));
            }
            C24644b.m47156a();
            return;
        }
        throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
    }

    /* synthetic */ C24420i(C24422a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    private static Object m46540a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5521);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5521);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static void m46541a(AbstractC24136b bVar, C24424j jVar, AbstractC24135a aVar) {
        C24138c.f57085d = bVar;
        AbstractC24136b.AbstractC24137a aVar2 = jVar.f57952b;
        if (aVar2 != null) {
            bVar.setWebpErrorLogger(aVar2);
        }
        bVar.setBitmapCreator(aVar);
    }
}
