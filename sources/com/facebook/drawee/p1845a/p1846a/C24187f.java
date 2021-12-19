package com.facebook.drawee.p1845a.p1846a;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1830b.C24074i;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24085e;
import com.facebook.drawee.p1850b.C24189a;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24327a;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.Set;

/* renamed from: com.facebook.drawee.a.a.f */
public final class C24187f implements AbstractC24093k<C24185e> {

    /* renamed from: a */
    private final Context f57246a;

    /* renamed from: b */
    private final C24413h f57247b;

    /* renamed from: c */
    private final C24188g f57248c;

    /* renamed from: d */
    private final Set<AbstractC24203d> f57249d;

    static {
        Covode.recordClassIndex(28318);
    }

    /* renamed from: a */
    public final C24185e mo34217b() {
        return new C24185e(this.f57246a, this.f57248c, this.f57247b, this.f57249d);
    }

    public C24187f(Context context, C24170b bVar) {
        this(context, C24428k.m46551a(), bVar);
    }

    private C24187f(Context context, C24428k kVar, C24170b bVar) {
        this(context, kVar, bVar, (byte) 0);
    }

    private C24187f(Context context, C24428k kVar, C24170b bVar, byte b) {
        AbstractC24450a animatedDrawableFactory;
        C24085e<AbstractC24450a> eVar;
        AbstractC24093k<Boolean> kVar2;
        this.f57246a = context;
        C24413h e = kVar.mo40247e();
        this.f57247b = e;
        if (bVar == null || bVar.f57158b == null) {
            this.f57248c = new C24188g();
        } else {
            this.f57248c = bVar.f57158b;
        }
        C24188g gVar = this.f57248c;
        Resources resources = context.getResources();
        C24189a a = C24189a.m45876a();
        AbstractC24327a b2 = kVar.mo40244b();
        if (b2 == null) {
            animatedDrawableFactory = null;
        } else {
            animatedDrawableFactory = b2.getAnimatedDrawableFactory(context);
        }
        C24074i b3 = C24074i.m45587b();
        AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar = e.f57868a;
        if (bVar != null) {
            eVar = bVar.f57157a;
            kVar2 = bVar.f57159c;
        } else {
            eVar = null;
            kVar2 = null;
        }
        gVar.f57250a = resources;
        gVar.f57251b = a;
        gVar.f57252c = animatedDrawableFactory;
        gVar.f57253d = b3;
        gVar.f57254e = pVar;
        gVar.f57255f = eVar;
        gVar.f57256g = kVar2;
        this.f57249d = null;
    }
}
