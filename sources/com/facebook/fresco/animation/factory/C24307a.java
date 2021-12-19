package com.facebook.fresco.animation.factory;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.time.AbstractC24140b;
import com.facebook.fresco.animation.p1862a.C24272c;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;
import com.facebook.fresco.animation.p1863b.C24276a;
import com.facebook.fresco.animation.p1863b.p1864a.C24277a;
import com.facebook.fresco.animation.p1863b.p1864a.C24278b;
import com.facebook.fresco.animation.p1863b.p1864a.C24279c;
import com.facebook.fresco.animation.p1863b.p1865b.C24283c;
import com.facebook.fresco.animation.p1863b.p1865b.C24285d;
import com.facebook.fresco.animation.p1863b.p1866c.C24287a;
import com.facebook.fresco.animation.p1863b.p1866c.C24288b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;
import com.facebook.imagepipeline.p1871a.p1874c.AbstractC24337b;
import com.facebook.imagepipeline.p1871a.p1874c.C24338c;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24452a;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.facebook.fresco.animation.factory.a */
public class C24307a implements AbstractC24450a {

    /* renamed from: a */
    private final AbstractC24337b f57620a;

    /* renamed from: b */
    private final ScheduledExecutorService f57621b;

    /* renamed from: c */
    private final ExecutorService f57622c;

    /* renamed from: d */
    private final AbstractC24140b f57623d;

    /* renamed from: e */
    private final AbstractC24357f f57624e;

    /* renamed from: f */
    private final C24382h<AbstractC24026e, AbstractC24454c> f57625f;

    /* renamed from: g */
    private final AbstractC24093k<Integer> f57626g;

    /* renamed from: h */
    private final AbstractC24093k<Integer> f57627h;

    static {
        Covode.recordClassIndex(28440);
    }

    /* renamed from: com.facebook.fresco.animation.factory.a$a */
    public static class C24308a implements AbstractC24026e {

        /* renamed from: a */
        private final String f57628a;

        static {
            Covode.recordClassIndex(28441);
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        /* renamed from: a */
        public final String mo39543a() {
            return this.f57628a;
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        public final String toString() {
            return this.f57628a;
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        public final int hashCode() {
            String str = this.f57628a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public C24308a(int i) {
            this.f57628a = "anim://".concat(String.valueOf(i));
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        /* renamed from: a */
        public final boolean mo39544a(Uri uri) {
            return uri.toString().startsWith(this.f57628a);
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                String str = this.f57628a;
                String str2 = ((C24308a) obj).f57628a;
                if (str != null) {
                    return str.equals(str2);
                }
                if (str2 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.facebook.imagepipeline.p1883h.AbstractC24450a
    /* renamed from: a */
    public final boolean mo39767a(AbstractC24454c cVar) {
        return cVar instanceof C24452a;
    }

    /* renamed from: a */
    private C24338c m46250a(C24325e eVar) {
        C24338c cVar = new C24338c(new C24308a(eVar.hashCode()), this.f57625f);
        int c = eVar.mo40128c();
        if (c > 0) {
            int i = 0;
            do {
                if (eVar.mo40127b(i)) {
                    C24117a<AbstractC24454c> aVar = null;
                    try {
                        aVar = C24117a.m45706a(new C24455d(eVar.mo40125a(i), C24458g.f58105a));
                        cVar.mo40135a(i, aVar);
                    } finally {
                        C24117a.m45712c(aVar);
                    }
                }
                i++;
            } while (i < c);
        }
        return cVar;
    }

    @Override // com.facebook.imagepipeline.p1883h.AbstractC24450a
    /* renamed from: b */
    public final /* synthetic */ Drawable mo39768b(AbstractC24454c cVar) {
        AbstractC24280b aVar;
        C24285d dVar;
        C24283c cVar2;
        C24452a aVar2 = (C24452a) cVar;
        C24325e d = aVar2.mo40293d();
        AbstractC24323c cVar3 = d.f57681a;
        AbstractC24319a a = this.f57620a.mo40091a(d, new Rect(0, 0, cVar3.getWidth(), cVar3.getHeight()));
        int intValue = this.f57626g.mo34217b().intValue();
        if (intValue == 1) {
            aVar = new C24277a(m46250a(d), true);
        } else if (intValue == 2) {
            aVar = new C24277a(m46250a(d), false);
        } else if (intValue != 3) {
            aVar = new C24279c();
        } else {
            aVar = new C24278b();
        }
        C24288b bVar = new C24288b(aVar, a);
        int i = aVar2.f58087a.f57769d;
        if (i <= 0) {
            i = this.f57627h.mo34217b().intValue();
            dVar = null;
            if (i <= 0) {
                cVar2 = null;
                C24276a aVar3 = new C24276a(this.f57624e, aVar, new C24287a(a), bVar, dVar, cVar2);
                aVar3.f57545b = aVar2.f58087a.f57774i;
                return new C24290a(new C24272c(aVar3, aVar3, this.f57623d, this.f57621b), aVar2.f58087a.f57777l);
            }
        }
        dVar = new C24285d(i);
        cVar2 = new C24283c(this.f57624e, bVar, aVar2.f58087a.f57774i, this.f57622c);
        C24276a aVar32 = new C24276a(this.f57624e, aVar, new C24287a(a), bVar, dVar, cVar2);
        aVar32.f57545b = aVar2.f58087a.f57774i;
        return new C24290a(new C24272c(aVar32, aVar32, this.f57623d, this.f57621b), aVar2.f58087a.f57777l);
    }

    public C24307a(AbstractC24337b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, AbstractC24140b bVar2, AbstractC24357f fVar, C24382h<AbstractC24026e, AbstractC24454c> hVar, AbstractC24093k<Integer> kVar, AbstractC24093k<Integer> kVar2) {
        this.f57620a = bVar;
        this.f57621b = scheduledExecutorService;
        this.f57622c = executorService;
        this.f57623d = bVar2;
        this.f57624e = fVar;
        this.f57625f = hVar;
        this.f57626g = kVar;
        this.f57627h = kVar2;
    }
}
