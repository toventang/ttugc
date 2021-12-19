package com.facebook.imagepipeline.p1880e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1882g.AbstractC24445e;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.AbstractC24544ak;
import com.facebook.imagepipeline.p1889n.AbstractC24580bc;
import com.facebook.imagepipeline.p1889n.C24512a;
import com.facebook.imagepipeline.p1889n.C24517ab;
import com.facebook.imagepipeline.p1889n.C24531ah;
import com.facebook.imagepipeline.p1889n.C24551aq;
import com.facebook.imagepipeline.p1889n.C24557at;
import com.facebook.imagepipeline.p1889n.C24563aw;
import com.facebook.imagepipeline.p1889n.C24570ay;
import com.facebook.imagepipeline.p1889n.C24573az;
import com.facebook.imagepipeline.p1889n.C24575ba;
import com.facebook.imagepipeline.p1889n.C24578bb;
import com.facebook.imagepipeline.p1889n.C24582be;
import com.facebook.imagepipeline.p1889n.C24588f;
import com.facebook.imagepipeline.p1889n.C24589g;
import com.facebook.imagepipeline.p1889n.C24590h;
import com.facebook.imagepipeline.p1889n.C24594j;
import com.facebook.imagepipeline.p1889n.C24598m;
import com.facebook.imagepipeline.p1889n.C24605o;
import com.facebook.imagepipeline.p1889n.C24608p;
import com.facebook.imagepipeline.p1889n.C24611r;
import com.facebook.imagepipeline.p1889n.C24612s;
import com.facebook.imagepipeline.p1889n.C24628z;
import com.facebook.imagepipeline.p1892q.AbstractC24650c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.facebook.imagepipeline.e.m */
public final class C24431m {

    /* renamed from: a */
    ContentResolver f58012a;

    /* renamed from: b */
    Resources f58013b;

    /* renamed from: c */
    AssetManager f58014c;

    /* renamed from: d */
    final AbstractC24104a f58015d;

    /* renamed from: e */
    final AbstractC24410e f58016e;

    /* renamed from: f */
    final AbstractC24113i f58017f;

    /* renamed from: g */
    final C24373e f58018g;

    /* renamed from: h */
    final C24373e f58019h;

    /* renamed from: i */
    final AbstractC24397p<AbstractC24026e, AbstractC24454c> f58020i;

    /* renamed from: j */
    final AbstractC24380f f58021j;

    /* renamed from: k */
    final AbstractC24357f f58022k;

    /* renamed from: l */
    final int f58023l;

    /* renamed from: m */
    final int f58024m;

    /* renamed from: n */
    boolean f58025n;

    /* renamed from: o */
    private final AbstractC24442c f58026o;

    /* renamed from: p */
    private final AbstractC24445e f58027p;

    /* renamed from: q */
    private final boolean f58028q;

    /* renamed from: r */
    private final boolean f58029r;

    /* renamed from: s */
    private final boolean f58030s;

    /* renamed from: t */
    private final AbstractC24397p<AbstractC24026e, AbstractC24111h> f58031t;

    /* renamed from: u */
    private final int f58032u;

    static {
        Covode.recordClassIndex(28574);
    }

    /* renamed from: b */
    public final C24517ab mo40256b() {
        return new C24517ab(this.f58016e.mo40216a(), this.f58017f);
    }

    /* renamed from: a */
    public final C24628z mo40255a() {
        return new C24628z(this.f58016e.mo40216a(), this.f58017f, this.f58012a);
    }

    /* renamed from: a */
    public static C24512a m46576a(AbstractC24544ak<C24456e> akVar) {
        return new C24512a(akVar);
    }

    /* renamed from: k */
    public static <T> C24563aw<T> m46580k(AbstractC24544ak<T> akVar) {
        return new C24563aw<>(akVar);
    }

    /* renamed from: c */
    public final C24589g mo40258c(AbstractC24544ak<C24117a<AbstractC24454c>> akVar) {
        return new C24589g(this.f58021j, akVar);
    }

    /* renamed from: i */
    public final C24611r mo40264i(AbstractC24544ak<C24456e> akVar) {
        return new C24611r(this.f58021j, akVar);
    }

    /* renamed from: a */
    private static Context m46575a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: d */
    public final C24590h mo40259d(AbstractC24544ak<C24117a<AbstractC24454c>> akVar) {
        return new C24590h(this.f58020i, this.f58021j, akVar);
    }

    /* renamed from: f */
    public final C24605o mo40261f(AbstractC24544ak<C24456e> akVar) {
        return new C24605o(this.f58018g, this.f58019h, this.f58021j, akVar);
    }

    /* renamed from: g */
    public final C24608p mo40262g(AbstractC24544ak<C24456e> akVar) {
        return new C24608p(this.f58018g, this.f58019h, this.f58021j, akVar);
    }

    /* renamed from: h */
    public final C24531ah mo40263h(AbstractC24544ak<C24456e> akVar) {
        return new C24531ah(this.f58018g, this.f58021j, this.f58017f, this.f58015d, akVar);
    }

    /* renamed from: j */
    public final C24612s mo40265j(AbstractC24544ak<C24456e> akVar) {
        return new C24612s(this.f58031t, this.f58021j, akVar);
    }

    /* renamed from: l */
    public final <T> C24575ba<T> mo40266l(AbstractC24544ak<T> akVar) {
        return new C24575ba<>(this.f58016e.mo40220e(), akVar);
    }

    /* renamed from: m */
    public final C24582be mo40267m(AbstractC24544ak<C24456e> akVar) {
        return new C24582be(this.f58016e.mo40219d(), this.f58017f, akVar);
    }

    /* renamed from: b */
    public final C24588f mo40257b(AbstractC24544ak<C24117a<AbstractC24454c>> akVar) {
        return new C24588f(this.f58020i, this.f58021j, akVar);
    }

    /* renamed from: e */
    public final C24598m mo40260e(AbstractC24544ak<C24456e> akVar) {
        return new C24598m(this.f58015d, this.f58016e.mo40218c(), this.f58026o, this.f58027p, this.f58028q, this.f58029r, this.f58030s, akVar, this.f58032u);
    }

    /* renamed from: a */
    public static C24578bb m46578a(AbstractC24580bc<C24456e>[] bcVarArr) {
        return new C24578bb(bcVarArr);
    }

    /* renamed from: a */
    public static <T> C24570ay<T> m46577a(AbstractC24544ak<T> akVar, C24573az azVar) {
        return new C24570ay<>(akVar, azVar);
    }

    /* renamed from: a */
    public static C24594j m46579a(AbstractC24544ak<C24456e> akVar, AbstractC24544ak<C24456e> akVar2) {
        return new C24594j(akVar, akVar2);
    }

    /* renamed from: a */
    public final C24557at mo40254a(AbstractC24544ak<C24456e> akVar, AbstractC24650c cVar) {
        return new C24557at(this.f58016e.mo40219d(), this.f58017f, akVar, cVar, this.f58018g, this.f58019h, this.f58021j);
    }

    /* renamed from: a */
    public final C24551aq mo40253a(AbstractC24544ak<C24456e> akVar, boolean z, AbstractC24650c cVar) {
        return new C24551aq(this.f58016e.mo40219d(), this.f58017f, akVar, z, cVar);
    }

    public C24431m(Context context, AbstractC24104a aVar, AbstractC24442c cVar, AbstractC24445e eVar, boolean z, boolean z2, boolean z3, AbstractC24410e eVar2, AbstractC24113i iVar, AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar, AbstractC24397p<AbstractC24026e, AbstractC24111h> pVar2, C24373e eVar3, C24373e eVar4, AbstractC24380f fVar, AbstractC24357f fVar2, int i, int i2, boolean z4, int i3) {
        this.f58012a = m46575a(context).getContentResolver();
        this.f58013b = m46575a(context).getResources();
        this.f58014c = m46575a(context).getAssets();
        this.f58015d = aVar;
        this.f58026o = cVar;
        this.f58027p = eVar;
        this.f58028q = z;
        this.f58029r = z2;
        this.f58030s = z3;
        this.f58016e = eVar2;
        this.f58017f = iVar;
        this.f58020i = pVar;
        this.f58031t = pVar2;
        this.f58018g = eVar3;
        this.f58019h = eVar4;
        this.f58021j = fVar;
        this.f58022k = fVar2;
        this.f58023l = i;
        this.f58024m = i2;
        this.f58025n = z4;
        this.f58032u = i3;
    }
}
