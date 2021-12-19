package com.facebook.imagepipeline.p1871a.p1873b;

import android.graphics.Bitmap;
import android.os.Build;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;
import com.facebook.imagepipeline.p1871a.p1872a.C24326f;
import com.facebook.imagepipeline.p1871a.p1874c.AbstractC24337b;
import com.facebook.imagepipeline.p1871a.p1874c.C24336a;
import com.facebook.imagepipeline.p1871a.p1874c.C24342d;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24452a;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1885j.C24458g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.a.b.e */
public final class C24331e implements AbstractC24330d {

    /* renamed from: a */
    static AbstractC24329c f57691a = m46304a("com.facebook.animated.gif.GifImage");

    /* renamed from: b */
    static AbstractC24329c f57692b = m46304a("com.facebook.animated.webp.WebPImage");

    /* renamed from: c */
    private final AbstractC24337b f57693c;

    /* renamed from: d */
    private final AbstractC24357f f57694d;

    static {
        Covode.recordClassIndex(28473);
    }

    /* renamed from: a */
    private static AbstractC24329c m46304a(String str) {
        try {
            return (AbstractC24329c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C24331e(AbstractC24337b bVar, AbstractC24357f fVar) {
        this.f57693c = bVar;
        this.f57694d = fVar;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24330d
    /* renamed from: a */
    public final AbstractC24454c mo40131a(C24456e eVar, C24361b bVar) {
        AbstractC24323c decode;
        if (f57691a != null) {
            C24117a b = C24117a.m45711b(eVar.f58094a);
            C24091i.m45617a(b);
            try {
                AbstractC24111h hVar = (AbstractC24111h) b.mo39695a();
                if (hVar.mo39676c() != null) {
                    decode = f57691a.decode(hVar.mo39676c());
                } else {
                    decode = f57691a.decode(hVar.mo39675b(), hVar.mo39673a());
                }
                return m46305a(bVar, decode);
            } finally {
                C24117a.m45712c(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    /* renamed from: a */
    private AbstractC24454c m46305a(C24361b bVar, AbstractC24323c cVar) {
        final List<C24117a<Bitmap>> list;
        Throwable th;
        C24117a<Bitmap> aVar = null;
        try {
            int frameCount = bVar.f57770e ? cVar.getFrameCount() - 1 : 0;
            if (bVar.f57772g) {
                C24455d dVar = new C24455d(m46303a(cVar, bVar.f57774i, frameCount), C24458g.f58105a);
                C24117a.m45712c(null);
                C24117a.m45709a((Iterable<? extends C24117a<?>>) null);
                return dVar;
            }
            if (bVar.f57771f) {
                Bitmap.Config config = bVar.f57774i;
                AbstractC24319a a = this.f57693c.mo40091a(C24325e.m46291a(cVar), null);
                list = new ArrayList<>(a.mo40114a());
                C24342d dVar2 = new C24342d(a, new C24342d.AbstractC24344a() {
                    /* class com.facebook.imagepipeline.p1871a.p1873b.C24331e.C243332 */

                    static {
                        Covode.recordClassIndex(28475);
                    }

                    @Override // com.facebook.imagepipeline.p1871a.p1874c.C24342d.AbstractC24344a
                    /* renamed from: a */
                    public final C24117a<Bitmap> mo40067a(int i) {
                        return C24117a.m45711b((C24117a) list.get(i));
                    }
                });
                for (int i = 0; i < a.mo40114a(); i++) {
                    C24117a<Bitmap> a2 = m46302a(a.mo40120c(), a.mo40121d(), config);
                    dVar2.mo40141a(i, a2.mo39695a());
                    list.add(a2);
                }
                try {
                    if (list.size() > frameCount) {
                        aVar = C24117a.m45711b(list.get(frameCount));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C24117a.m45712c(null);
                    C24117a.m45709a((Iterable<? extends C24117a<?>>) list);
                    throw th;
                }
            } else if (bVar.f57769d > 0) {
                list = m46306b(cVar, bVar.f57774i, bVar.f57769d);
                try {
                    if (list.size() > frameCount) {
                        aVar = C24117a.m45711b(list.get(frameCount));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C24117a.m45712c(null);
                    C24117a.m45709a((Iterable<? extends C24117a<?>>) list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (bVar.f57768c && aVar == null) {
                aVar = m46303a(cVar, bVar.f57774i, frameCount);
            }
            C24326f fVar = new C24326f(cVar);
            fVar.f57686b = C24117a.m45711b(aVar);
            fVar.f57688d = frameCount;
            C24452a aVar2 = new C24452a(fVar.mo40130a(list).mo40129a(), bVar);
            C24117a.m45712c(aVar);
            C24117a.m45709a((Iterable<? extends C24117a<?>>) list);
            return aVar2;
        } catch (Throwable th4) {
            th = th4;
            list = null;
            C24117a.m45712c(null);
            C24117a.m45709a((Iterable<? extends C24117a<?>>) list);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24330d
    /* renamed from: b */
    public final AbstractC24454c mo40132b(C24456e eVar, C24361b bVar) {
        AbstractC24323c decode;
        if (f57692b != null) {
            C24117a b = C24117a.m45711b(eVar.f58094a);
            C24091i.m45617a(b);
            try {
                AbstractC24111h hVar = (AbstractC24111h) b.mo39695a();
                if (hVar.mo39676c() != null) {
                    decode = f57692b.decode(hVar.mo39676c());
                } else {
                    decode = f57692b.decode(hVar.mo39675b(), hVar.mo39673a());
                }
                return m46305a(bVar, decode);
            } finally {
                C24117a.m45712c(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    /* renamed from: a */
    private C24117a<Bitmap> m46302a(int i, int i2, Bitmap.Config config) {
        C24117a<Bitmap> a = this.f57694d.mo40148a(i, i2, config);
        a.mo39695a().eraseColor(0);
        int i3 = Build.VERSION.SDK_INT;
        a.mo39695a().setHasAlpha(true);
        return a;
    }

    /* renamed from: a */
    private C24117a<Bitmap> m46303a(AbstractC24323c cVar, Bitmap.Config config, int i) {
        C24117a<Bitmap> a = m46302a(cVar.getWidth(), cVar.getHeight(), config);
        new C24342d(this.f57693c.mo40091a(C24325e.m46291a(cVar), null), new C24342d.AbstractC24344a() {
            /* class com.facebook.imagepipeline.p1871a.p1873b.C24331e.C243321 */

            static {
                Covode.recordClassIndex(28474);
            }

            @Override // com.facebook.imagepipeline.p1871a.p1874c.C24342d.AbstractC24344a
            /* renamed from: a */
            public final C24117a<Bitmap> mo40067a(int i) {
                return null;
            }
        }).mo40141a(i, a.mo39695a());
        return a;
    }

    /* renamed from: b */
    private List<C24117a<Bitmap>> m46306b(AbstractC24323c cVar, Bitmap.Config config, int i) {
        AbstractC24319a a = this.f57693c.mo40091a(C24325e.m46291a(cVar), null);
        int a2 = a.mo40114a();
        if (i > a2) {
            i = a2;
        }
        ((C24336a) a).f57700a = 1;
        final ArrayList arrayList = new ArrayList(i);
        C24342d dVar = new C24342d(a, new C24342d.AbstractC24344a() {
            /* class com.facebook.imagepipeline.p1871a.p1873b.C24331e.C243343 */

            static {
                Covode.recordClassIndex(28476);
            }

            @Override // com.facebook.imagepipeline.p1871a.p1874c.C24342d.AbstractC24344a
            /* renamed from: a */
            public final C24117a<Bitmap> mo40067a(int i) {
                return C24117a.m45711b((C24117a) arrayList.get(i));
            }
        });
        for (int i2 = 0; i2 < i; i2++) {
            C24117a<Bitmap> a3 = m46302a(a.mo40120c(), a.mo40121d(), config);
            try {
                dVar.mo40141a(i2, a3.mo39695a());
                arrayList.add(a3);
            } catch (IllegalStateException e) {
                Object[] objArr = new Object[0];
                if (C24099a.f57025a.mo39656b(5)) {
                    C24099a.f57025a.mo39655b("AnimatedImageFactoryImp", C1764a.m5929a(null, "preview decode failed", objArr), e);
                }
            }
        }
        return arrayList;
    }
}
