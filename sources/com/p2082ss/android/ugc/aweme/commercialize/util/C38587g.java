package com.p2082ss.android.ugc.aweme.commercialize.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38531f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49520l;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.g */
public final class C38587g {

    /* renamed from: a */
    public static final C38587g f91183a = new C38587g();

    /* renamed from: b */
    private static final AbstractC89244h f91184b = C89250i.m154773a((AbstractC89171a) C38588a.f91185a);

    /* renamed from: a */
    public static Map<Aweme, Integer> m78295a() {
        return (Map) f91184b.getValue();
    }

    private C38587g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.g$a */
    static final class C38588a extends AbstractC89220m implements AbstractC89171a<Map<Aweme, Integer>> {

        /* renamed from: a */
        public static final C38588a f91185a = new C38588a();

        static {
            Covode.recordClassIndex(46120);
        }

        C38588a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Aweme, Integer> invoke() {
            if (C49520l.m92755a()) {
                return Collections.synchronizedMap(new WeakHashMap());
            }
            return new WeakHashMap();
        }
    }

    static {
        Covode.recordClassIndex(46119);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.g$d */
    public static final class C38591d extends AbstractC89220m implements AbstractC89172b<Map.Entry<? extends Aweme, ? extends Integer>, Aweme> {

        /* renamed from: a */
        public static final C38591d f91188a = new C38591d();

        static {
            Covode.recordClassIndex(46123);
        }

        C38591d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Aweme invoke(Map.Entry<? extends Aweme, ? extends Integer> entry) {
            Map.Entry<? extends Aweme, ? extends Integer> entry2 = entry;
            C89219l.m154721d(entry2, "");
            return entry2.getKey();
        }
    }

    /* renamed from: d */
    public static final boolean m78301d(Aweme aweme) {
        if (aweme == null || !f91183a.m78304g(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private final boolean m78304g(Aweme aweme) {
        if ((m78306i(aweme) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo67170b(Aweme aweme) {
        if ((m78306i(aweme) & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m78296a(Aweme aweme) {
        if (aweme != null && C37699a.m76314s(aweme)) {
            m78303f(aweme);
            Map<Aweme, Integer> a = m78295a();
            C89219l.m154716b(a, "");
            a.put(aweme, 0);
        }
    }

    /* renamed from: e */
    public static final boolean m78302e(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!C37699a.m76314s(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.useEffectivePlayAction()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final long m78303f(Aweme aweme) {
        float f;
        AwemeRawAd awemeRawAd;
        Float effectivePlayTime;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (effectivePlayTime = awemeRawAd.getEffectivePlayTime()) == null) {
            f = 3.0f;
        } else {
            f = effectivePlayTime.floatValue();
        }
        return C89241a.m154731b((double) (f * 1000.0f));
    }

    /* renamed from: h */
    private final void m78305h(Aweme aweme) {
        Map<Aweme, Integer> a = m78295a();
        C89219l.m154716b(a, "");
        a.put(aweme, Integer.valueOf(m78306i(aweme) | 1));
    }

    /* renamed from: i */
    private static int m78306i(Aweme aweme) {
        Integer num;
        if (aweme == null || (num = m78295a().get(aweme)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final void mo67171c(Aweme aweme) {
        Map<Aweme, Integer> a = m78295a();
        C89219l.m154716b(a, "");
        a.put(aweme, Integer.valueOf(m78306i(aweme) | 2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.g$e */
    public static final class C38592e extends AbstractC89220m implements AbstractC89172b<Aweme, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f91189a;

        static {
            Covode.recordClassIndex(46124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38592e(String str) {
            super(1);
            this.f91189a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Aweme aweme) {
            String str;
            boolean z;
            Aweme aweme2 = aweme;
            C89219l.m154716b(aweme2, "");
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getCreativeIdStr();
            } else {
                str = null;
            }
            if (!C89219l.m154714a((Object) str, (Object) this.f91189a) || C38587g.f91183a.mo67170b(aweme2)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final void m78300a(String str) {
        C89219l.m154721d(str, "");
        Map<Aweme, Integer> a = m78295a();
        C89219l.m154716b(a, "");
        for (Aweme aweme : C89309k.m154813g(C89309k.m154799a(C89309k.m154810e(C89041ag.m154433f(a), C38591d.f91188a), (AbstractC89172b) new C38592e(str)))) {
            C89219l.m154716b(aweme, "");
            aweme.getDesc();
            if (m78302e(aweme)) {
                m78298a(aweme, "click");
                f91183a.mo67171c(aweme);
            }
            f91183a.m78305h(aweme);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.g$c */
    public static final class C38590c extends AbstractC89220m implements AbstractC89183m<C38151a.C38153b, Boolean, C38151a.C38153b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f91187a;

        static {
            Covode.recordClassIndex(46122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38590c(AwemeRawAd awemeRawAd) {
            super(2);
            this.f91187a = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38151a.C38153b invoke(C38151a.C38153b bVar, Boolean bool) {
            C38151a.C38153b a;
            C38151a.C38153b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66451b(this.f91187a);
            } else {
                a = bVar2.mo66445a(this.f91187a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.g$f */
    public static final class C38593f extends AbstractC89220m implements AbstractC89183m<C38151a.C38153b, Boolean, C38151a.C38153b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f91190a;

        static {
            Covode.recordClassIndex(46125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38593f(AwemeRawAd awemeRawAd) {
            super(2);
            this.f91190a = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38151a.C38153b invoke(C38151a.C38153b bVar, Boolean bool) {
            C38151a.C38153b a;
            C38151a.C38153b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66451b(this.f91190a);
            } else {
                a = bVar2.mo66445a(this.f91190a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.g$b */
    public static final class C38589b extends AbstractC89220m implements AbstractC89183m<C38151a.C38153b, Boolean, C38151a.C38153b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f91186a;

        static {
            Covode.recordClassIndex(46121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38589b(Aweme aweme) {
            super(2);
            this.f91186a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38151a.C38153b invoke(C38151a.C38153b bVar, Boolean bool) {
            C38151a.C38153b a;
            C38151a.C38153b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66451b(this.f91186a.getAwemeRawAd());
            } else {
                a = bVar2.mo66445a(this.f91186a.getAwemeRawAd());
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: a */
    private static void m78299a(AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            C38585e.m78291a("draw_ad", "trueview_play", jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    public static final void m78297a(Aweme aweme, long j) {
        if (aweme != null && C37699a.m76314s(aweme)) {
            long f = m78303f(aweme);
            aweme.getDesc();
            if (j >= f && !f91183a.mo67170b(aweme)) {
                if (m78302e(aweme)) {
                    m78298a(aweme, "play");
                } else {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C38531f.m78149a("play_valid", awemeRawAd.getEffectivePlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38590c(awemeRawAd));
                    }
                }
            }
            m78295a().remove(aweme);
        }
    }

    /* renamed from: a */
    public static void m78298a(Aweme aweme, String str) {
        if (m78302e(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("trueview_play_type", str);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38187i.C38188a aVar = new C38187i.C38188a();
            aVar.f90222a = aweme.getAwemeRawAd();
            aVar.f90226e = hashMap;
            JSONObject a = aVar.mo66507a();
            C89219l.m154716b(a, "");
            m78299a(awemeRawAd, a);
        } else {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            C38187i.C38188a aVar2 = new C38187i.C38188a();
            aVar2.f90222a = aweme.getAwemeRawAd();
            JSONObject a2 = aVar2.mo66507a();
            C89219l.m154716b(a2, "");
            m78299a(awemeRawAd2, a2);
        }
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                C89219l.m154715b();
            }
            C38531f.m78149a("play_valid", awemeRawAd3.getEffectivePlayTrackUrlList(), awemeRawAd3.getCreativeId(), awemeRawAd3.getLogExtra(), new C38589b(aweme));
            C18129a.C18130a a3 = C18129a.m33746a("draw_ad", "trueview_play", awemeRawAd3);
            if (!m78302e(aweme)) {
                str = null;
            }
            a3.mo28897a("trueview_play_type", str).mo28902c();
        }
    }
}
