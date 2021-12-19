package com.p2082ss.android.ugc.aweme.sticker.p3947a.p3950c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.poi.PokerBundle;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.c.a */
public final class C75261a extends AbstractC75248a {

    /* renamed from: d */
    public static final C75262a f169215d = new C75262a((byte) 0);

    /* renamed from: b */
    String f169216b = "POKER";

    /* renamed from: c */
    public final Context f169217c;

    /* renamed from: e */
    private boolean f169218e;

    static {
        Covode.recordClassIndex(88163);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.c.a$a */
    public static final class C75262a {
        static {
            Covode.recordClassIndex(88164);
        }

        private C75262a() {
        }

        public /* synthetic */ C75262a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final String mo118587a() {
        return this.f169216b;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: b */
    public final boolean mo118590b() {
        return this.f169218e;
    }

    /* renamed from: c */
    private static boolean m132054c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.a.c.a$d */
    public static final class C75265d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f169227a;

        static {
            Covode.recordClassIndex(88167);
        }

        C75265d(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C75265d(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C75265d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f169227a == 0) {
                C89382r.m154942a(obj);
                C63134c.m114157a().mo101453a(PrivacyCert.Builder.Companion.with("bpea-1082").usage("We plan to increase POI(point of interest) content creation and effect content diversity using AR technology, thus we need to apply GPS permission from users to get location information (GPS two decimal places, the user's true position deviation is 1 km) when  they use some POI-relevant AR effects. Common users also need to use the latitude and longitude information to experience the AR effect. ").tag("Init location sdk before geo").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    private static JSONObject m132053a(PokerBundle pokerBundle) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adcode", pokerBundle.getAdcode());
        jSONObject.put("district", pokerBundle.getDistrict());
        jSONObject.put("country", pokerBundle.getCountry());
        jSONObject.put("province", pokerBundle.getProvince());
        jSONObject.put("city", pokerBundle.getCity());
        return jSONObject;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.c.a$c */
    static final class C75264c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f169223a;

        /* renamed from: b */
        final /* synthetic */ C75261a f169224b;

        /* renamed from: c */
        final /* synthetic */ int f169225c;

        /* renamed from: d */
        final /* synthetic */ String f169226d;

        static {
            Covode.recordClassIndex(88166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75264c(C75261a aVar, int i, String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f169224b = aVar;
            this.f169225c = i;
            this.f169226d = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C75264c(this.f169224b, this.f169225c, this.f169226d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C75264c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f169223a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f169223a = 1;
                Object a = C89624i.m155554a(C89652o.f203399a, new C75265d(null), this);
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
                    C84911q.m145924a(e);
                    C75261a aVar = this.f169224b;
                    String jSONObject = aVar.mo118601a(1, new PokerBundle(null, null, null, null, null, 31, null)).toString();
                    C89219l.m154716b(jSONObject, "");
                    aVar.mo118589a((long) this.f169225c, jSONObject);
                }
                return C89391z.f203057a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C75261a aVar2 = this.f169224b;
            int i2 = this.f169225c;
            String str = this.f169226d;
            this.f169223a = 2;
            Object a2 = C89624i.m155554a(C89546bf.f203267b, new C75263b(aVar2, str, i2, null), this);
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
    /* renamed from: com.ss.android.ugc.aweme.sticker.a.c.a$b */
    public static final class C75263b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f169219a;

        /* renamed from: b */
        final /* synthetic */ C75261a f169220b;

        /* renamed from: c */
        final /* synthetic */ String f169221c;

        /* renamed from: d */
        final /* synthetic */ int f169222d;

        static {
            Covode.recordClassIndex(88165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75263b(C75261a aVar, String str, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f169220b = aVar;
            this.f169221c = str;
            this.f169222d = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C75263b(this.f169220b, this.f169221c, this.f169222d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C75263b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            if (this.f169219a == 0) {
                C89382r.m154942a(obj);
                String str = this.f169221c;
                if (str != null) {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("body");
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("long_data");
                        double optDouble2 = optJSONObject.optDouble("lati_data");
                        if (Double.isNaN(optDouble) || Double.isNaN(optDouble2)) {
                            throw new IllegalArgumentException("require long or lati is null");
                        }
                        C89378p pVar = new C89378p(Double.valueOf(optDouble), Double.valueOf(optDouble2));
                        C84911q.m145928d("Effect interface: " + this.f169220b.f169216b + " geocode spi call");
                        PokerBundle a = C63134c.m114157a().mo101449a("EffectPoker", ((Number) pVar.getSecond()).doubleValue(), ((Number) pVar.getFirst()).doubleValue());
                        if (a != null) {
                            C75261a aVar = this.f169220b;
                            long j = (long) this.f169222d;
                            if (TextUtils.isEmpty(a.getAdcode()) || TextUtils.isEmpty(a.getDistrict()) || TextUtils.isEmpty(a.getCountry()) || TextUtils.isEmpty(a.getProvince()) || TextUtils.isEmpty(a.getCity())) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            String jSONObject = aVar.mo118601a(i ^ 1, a).toString();
                            C89219l.m154716b(jSONObject, "");
                            aVar.mo118589a(j, jSONObject);
                            return C89391z.f203057a;
                        }
                        throw new IllegalAccessException("IPoiService geocode return null");
                    }
                    throw new IllegalArgumentException("require body is null");
                }
                throw new IllegalArgumentException("require arg3 is null");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75261a(AbstractC14177d dVar, Context context) {
        super(dVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(context, "");
        this.f169217c = context;
    }

    /* renamed from: a */
    public final JSONObject mo118601a(int i, PokerBundle pokerBundle) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", this.f169216b);
        jSONObject.put("status", i);
        jSONObject.put("body", m132053a(pokerBundle));
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final void mo118588a(int i, String str) {
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m132054c();
        }
        if (!C58029j.f132253e) {
            String jSONObject = mo118601a(2, new PokerBundle(null, null, null, null, null, 31, null)).toString();
            C89219l.m154716b(jSONObject, "");
            mo118589a((long) i, jSONObject);
            return;
        }
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C75264c(this, i, str, null), 3);
    }
}
