package com.p2082ss.android.ugc.aweme.sticker.p3947a.p3949b;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.poi.GuitarBundle;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import org.json.JSONObject;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.b.a */
public final class C75256a extends AbstractC75248a {

    /* renamed from: d */
    public static boolean f169203d;

    /* renamed from: e */
    public static final C75257a f169204e = new C75257a((byte) 0);

    /* renamed from: b */
    String f169205b = "GUITAR";

    /* renamed from: c */
    public final Context f169206c;

    /* renamed from: f */
    private boolean f169207f;

    static {
        Covode.recordClassIndex(88158);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.b.a$a */
    public static final class C75257a {
        static {
            Covode.recordClassIndex(88159);
        }

        private C75257a() {
        }

        public /* synthetic */ C75257a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final String mo118587a() {
        return this.f169205b;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: b */
    public final boolean mo118590b() {
        return this.f169207f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.a.b.a$d */
    public static final class C75260d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f169214a;

        static {
            Covode.recordClassIndex(88162);
        }

        C75260d(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C75260d(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C75260d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f169214a == 0) {
                C89382r.m154942a(obj);
                C63134c.m114157a().mo101453a(PrivacyCert.Builder.Companion.with("bpea-1079").usage("We plan to increase POI(point of interest) content creation and effect content diversity using AR technology, thus we need to apply GPS permission from users to get location information (GPS two decimal places, the user's true position deviation is 1 km) when  they use some POI-relevant AR effects. Common users also need to use the latitude and longitude information to experience the AR effect. ").tag("Init LocationSDK befotr get poi information").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.b.a$c */
    static final class C75259c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f169211a;

        /* renamed from: b */
        final /* synthetic */ C75256a f169212b;

        /* renamed from: c */
        final /* synthetic */ int f169213c;

        static {
            Covode.recordClassIndex(88161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75259c(C75256a aVar, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f169212b = aVar;
            this.f169213c = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C75259c(this.f169212b, this.f169213c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C75259c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f169211a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f169211a = 1;
                Object a = C89624i.m155554a(C89652o.f203399a, new C75260d(null), this);
                if (a != EnumC89098a.COROUTINE_SUSPENDED) {
                    a = C89391z.f203057a;
                }
                if (a == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else if (i == 2) {
                try {
                    C89382r.m154942a(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    C84911q.m145923a("EffectGuitarHandler", e);
                    C75256a aVar = this.f169212b;
                    String jSONObject = aVar.mo118600a(3, 0.0d, 0.0d).toString();
                    C89219l.m154716b(jSONObject, "");
                    aVar.mo118589a((long) this.f169213c, jSONObject);
                }
                return C89391z.f203057a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C75256a aVar2 = this.f169212b;
            int i2 = this.f169213c;
            this.f169211a = 2;
            Object a2 = C89624i.m155554a(C89546bf.f203267b, new C75258b(aVar2, i2, null), this);
            if (a2 != EnumC89098a.COROUTINE_SUSPENDED) {
                a2 = C89391z.f203057a;
            }
            if (a2 == obj2) {
                return obj2;
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.a.b.a$b */
    public static final class C75258b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f169208a;

        /* renamed from: b */
        final /* synthetic */ C75256a f169209b;

        /* renamed from: c */
        final /* synthetic */ int f169210c;

        static {
            Covode.recordClassIndex(88160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75258b(C75256a aVar, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f169209b = aVar;
            this.f169210c = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C75258b(this.f169209b, this.f169210c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C75258b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            long j;
            if (this.f169208a == 0) {
                C89382r.m154942a(obj);
                C84911q.m145928d("Effect interface: " + this.f169209b.f169205b + " fetchGuitar spi call");
                IPoiService a = C63134c.m114157a();
                Context context = this.f169209b.f169206c;
                if (C75256a.f169203d) {
                    j = 600000;
                } else {
                    j = 0;
                }
                GuitarBundle a2 = a.mo101447a(context, "EffectGuitar", j, PrivacyCert.Builder.Companion.with("bpea-1080").usage("We plan to increase POI(point of interest) content creation and effect content diversity using AR technology, thus we need to apply GPS permission from users to get location information (GPS two decimal places, the user's true position deviation is 1 km) when  they use some POI-relevant AR effects. Common users also need to use the latitude and longitude information to experience the AR effect. ").tag("").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                if (a2 != null) {
                    C75256a aVar = this.f169209b;
                    String jSONObject = aVar.mo118600a(0, a2.getLongitude(), a2.getLatitude()).toString();
                    C89219l.m154716b(jSONObject, "");
                    aVar.mo118589a((long) this.f169210c, jSONObject);
                    C75256a.f169203d = true;
                    return C89391z.f203057a;
                }
                throw new IllegalAccessException("IPoiService fetchGuitar return null");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    private static JSONObject m132048a(double d, double d2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("long_data", d);
        jSONObject.put("lati_data", d2);
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75256a(AbstractC14177d dVar, Context context) {
        super(dVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(context, "");
        this.f169206c = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final void mo118588a(int i, String str) {
        if (!C63134c.m114157a().mo101459b(this.f169206c)) {
            String jSONObject = mo118600a(1, 0.0d, 0.0d).toString();
            C89219l.m154716b(jSONObject, "");
            mo118589a((long) i, jSONObject);
        } else if (!C63134c.m114157a().mo101461c(this.f169206c)) {
            String jSONObject2 = mo118600a(2, 0.0d, 0.0d).toString();
            C89219l.m154716b(jSONObject2, "");
            mo118589a((long) i, jSONObject2);
        } else {
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C75259c(this, i, null), 3);
        }
    }

    /* renamed from: a */
    public final JSONObject mo118600a(int i, double d, double d2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", this.f169205b);
        jSONObject.put("permission", i);
        jSONObject.put("body", m132048a(d, d2));
        return jSONObject;
    }
}
