package com.p2082ss.android.ugc.aweme.commercialize.track;

import com.bytedance.android.p126a.p127a.p135h.C2642c;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.C2658b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b;
import com.bytedance.ies.android.base.runtime.p1119a.C16094c;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.i */
public final class C38540i extends C2658b {
    static {
        Covode.recordClassIndex(46070);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.i$a */
    static final class C38541a extends AbstractC89220m implements AbstractC89172b<Map.Entry<? extends String, ? extends List<? extends String>>, Boolean> {

        /* renamed from: a */
        public static final C38541a f91059a = new C38541a();

        static {
            Covode.recordClassIndex(46071);
        }

        C38541a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
            boolean z;
            Map.Entry<? extends String, ? extends List<? extends String>> entry2 = entry;
            C89219l.m154721d(entry2, "");
            CharSequence charSequence = (CharSequence) entry2.getKey();
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.i$b */
    static final class C38542b extends AbstractC89220m implements AbstractC89172b<Map.Entry<? extends String, ? extends List<? extends String>>, Boolean> {

        /* renamed from: a */
        public static final C38542b f91060a = new C38542b();

        static {
            Covode.recordClassIndex(46072);
        }

        C38542b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
            boolean z;
            Map.Entry<? extends String, ? extends List<? extends String>> entry2 = entry;
            C89219l.m154721d(entry2, "");
            Collection collection = (Collection) entry2.getValue();
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.i$d */
    static final class C38544d extends AbstractC89220m implements AbstractC89172b<Map.Entry<? extends String, ? extends String>, C89378p<? extends String, ? extends List<? extends String>>> {

        /* renamed from: a */
        public static final C38544d f91062a = new C38544d();

        static {
            Covode.recordClassIndex(46074);
        }

        C38544d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89378p<? extends String, ? extends List<? extends String>> invoke(Map.Entry<? extends String, ? extends String> entry) {
            Map.Entry<? extends String, ? extends String> entry2 = entry;
            C89219l.m154721d(entry2, "");
            return C89387v.m154943a(entry2.getKey(), C89070n.m154516a(entry2.getValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.i$c */
    static final class C38543c extends AbstractC89220m implements AbstractC89172b<Map.Entry<? extends String, ? extends List<? extends String>>, C89378p<? extends String, ? extends String>> {

        /* renamed from: a */
        public static final C38543c f91061a = new C38543c();

        static {
            Covode.recordClassIndex(46073);
        }

        C38543c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89378p<? extends String, ? extends String> invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
            Object g;
            Map.Entry<? extends String, ? extends List<? extends String>> entry2 = entry;
            String str = "";
            C89219l.m154721d(entry2, str);
            Object key = entry2.getKey();
            if (key == null) {
                key = str;
            }
            List list = (List) entry2.getValue();
            if (!(list == null || (g = C89070n.m154583g(list)) == 0)) {
                str = g;
            }
            return C89387v.m154943a(key, str);
        }
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.C2658b
    /* renamed from: a */
    public final C2667c mo7180a(C2665b bVar, int i, boolean z) {
        int i2;
        LinkedHashMap<String, String> linkedHashMap = null;
        if (bVar == null) {
            try {
                C2667c a = C2667c.m7705a(C2642c.m7647a("request is null"), null);
                C89219l.m154716b(a, "");
                return a;
            } catch (Throwable th) {
                C2667c a2 = C2667c.m7705a(th, bVar);
                C89219l.m154716b(a2, "");
                return a2;
            }
        } else {
            String str = bVar.f7957b;
            if (str == null || str.length() == 0) {
                C2667c a3 = C2667c.m7705a(C2642c.m7647a("empty url"), null);
                C89219l.m154716b(a3, "");
                return a3;
            }
            Map<String, List<String>> map = bVar.f7959d;
            if (!(map == null || map.isEmpty() || (linkedHashMap = (LinkedHashMap) C89041ag.m154416a(C89309k.m154810e(C89309k.m154804b(C89309k.m154804b(C89041ag.m154433f(map), C38541a.f91059a), C38542b.f91060a), C38543c.f91061a), new LinkedHashMap())) == null)) {
                linkedHashMap.put("x-metasec-bypass-ttnet-features", "1");
            }
            String str2 = bVar.f7957b;
            C89219l.m154716b(str2, "");
            C16094c cVar = new C16094c(str2);
            cVar.f38756b = false;
            long j = (long) i;
            cVar.f38761g = j;
            cVar.f38762h = j;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                C89219l.m154719c(linkedHashMap, "");
                cVar.f38755a = linkedHashMap;
            }
            AbstractC16093b a4 = cVar.mo25547a();
            if (a4 == null) {
                C2667c a5 = C2667c.m7705a(C2642c.m7647a("Response is null"), bVar);
                C89219l.m154716b(a5, "");
                return a5;
            }
            Integer b = a4.mo25544b();
            if (b != null) {
                i2 = b.intValue();
            } else {
                i2 = -1;
            }
            return new C2667c(i2, a4.mo25545c(), C89041ag.m154416a(C89309k.m154810e(C89041ag.m154433f(a4.mo25543a()), C38544d.f91062a), new LinkedHashMap()), bVar, a4.mo25546d());
        }
    }
}
