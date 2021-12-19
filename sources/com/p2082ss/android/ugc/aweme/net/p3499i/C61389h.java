package com.p2082ss.android.ugc.aweme.net.p3499i;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.bytedance.ies.ugc.network.partner.p1276b.C18201g;
import com.bytedance.ies.ugc.network.partner.p1276b.C18202h;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.net.preload.C61454a;
import com.p2082ss.android.ugc.aweme.net.preload.C61458b;
import com.p2082ss.android.ugc.aweme.net.preload.C61460d;
import com.p2082ss.android.ugc.aweme.net.preload.C61461e;
import com.p2082ss.android.ugc.aweme.net.preload.C61462f;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61479e;
import com.p2082ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.i.h */
public final class C61389h implements AbstractC18185b.AbstractC18186a, AbstractC18185b.AbstractC18189d, AbstractC18185b.AbstractC18192f {

    /* renamed from: a */
    public static final Map<String, List<String>> f139378a = new LinkedHashMap();

    /* renamed from: b */
    public static final Map<String, PreloadExtraInfo> f139379b = new LinkedHashMap();

    /* renamed from: c */
    public static final C61390a f139380c = new C61390a((byte) 0);

    /* renamed from: d */
    private final Object f139381d;

    /* renamed from: com.ss.android.ugc.aweme.net.i.h$a */
    public static final class C61390a {
        static {
            Covode.recordClassIndex(72023);
        }

        private C61390a() {
        }

        public /* synthetic */ C61390a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    static {
        Covode.recordClassIndex(72022);
    }

    public C61389h(Object obj) {
        this.f139381d = obj;
    }

    /* renamed from: a */
    private Object m111129a(C18182a aVar) {
        C89219l.m154721d(aVar, "");
        return AbstractC18185b.AbstractC18192f.C18193a.m33842a(this, aVar);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18186a
    /* renamed from: b */
    public final C22099u<?> mo29036b(C18199f fVar, C18182a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.net.i.h$b */
    public static final class C61391b {

        /* renamed from: a */
        public C61458b f139382a;

        /* renamed from: b */
        public C61462f f139383b = null;

        /* renamed from: c */
        public PreloadExtraInfo f139384c = null;

        /* renamed from: d */
        public String f139385d;

        static {
            Covode.recordClassIndex(72024);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61391b)) {
                return false;
            }
            C61391b bVar = (C61391b) obj;
            return C89219l.m154714a(this.f139382a, bVar.f139382a) && C89219l.m154714a(this.f139383b, bVar.f139383b) && C89219l.m154714a(this.f139384c, bVar.f139384c) && C89219l.m154714a(this.f139385d, bVar.f139385d);
        }

        public final int hashCode() {
            C61458b bVar = this.f139382a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C61462f fVar = this.f139383b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            PreloadExtraInfo preloadExtraInfo = this.f139384c;
            int hashCode3 = (hashCode2 + (preloadExtraInfo != null ? preloadExtraInfo.hashCode() : 0)) * 31;
            String str = this.f139385d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "PreloadInfoExt(preloadKey=" + this.f139382a + ", preloadContext=" + this.f139383b + ", preloadExtraInfo=" + this.f139384c + ", simpleUrl=" + this.f139385d + ")";
        }

        public C61391b(C61458b bVar, String str) {
            C89219l.m154721d(bVar, "");
            this.f139382a = bVar;
            this.f139385d = str;
        }
    }

    /* renamed from: a */
    private static String m111130a(String str, List<String> list) {
        Uri parse = Uri.parse(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                arrayList.add(((String) t) + '=' + parse.getQueryParameter(t));
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return C89070n.m154551a(arrayList2, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18192f
    /* renamed from: a */
    public final void mo29044a(C18201g<?> gVar, C18182a aVar) {
        Request request;
        C61458b bVar;
        String str;
        MethodCollector.m26663i(9324);
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        if (!C61479e.m111325a()) {
            MethodCollector.m26664o(9324);
            return;
        }
        AbstractC21983b<?> bVar2 = aVar.f43318a;
        if (bVar2 == null || (request = bVar2.request()) == null) {
            MethodCollector.m26664o(9324);
            return;
        }
        Object a = m111129a(aVar);
        C61462f fVar = null;
        if (!(a instanceof C61391b)) {
            a = null;
        }
        C61391b bVar3 = (C61391b) a;
        C22099u<?> a2 = gVar.mo29060a();
        if (bVar3 != null) {
            bVar = bVar3.f139382a;
            fVar = bVar3.f139383b;
        } else {
            bVar = null;
        }
        C89219l.m154721d(request, "");
        C89219l.m154721d(a2, "");
        if (C61460d.m111308a(request)) {
            C89219l.m154721d(a2, "");
            if (C61454a.f139507b == null || fVar == null) {
                MethodCollector.m26664o(9324);
                return;
            } else if (bVar == null || (str = bVar.f139518b) == null) {
                MethodCollector.m26664o(9324);
                return;
            } else if (str.length() != 0) {
                C61454a.C61455a aVar2 = C61454a.f139507b;
                if (aVar2 != null) {
                    C89219l.m154721d(a2, "");
                    if (a2.f52261a.mo35845a()) {
                        synchronized (aVar2.f139514a) {
                            try {
                                aVar2.f139514a.mo2092a(str, new C61461e(fVar, a2));
                            } catch (Throwable th) {
                                MethodCollector.m26664o(9324);
                                throw th;
                            }
                        }
                    }
                }
                C61454a.m111303a(str);
            }
        }
        MethodCollector.m26664o(9324);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18186a
    /* renamed from: a */
    public final C22099u<?> mo29035a(C18199f fVar, C18182a aVar) {
        String str;
        C61454a.C61455a aVar2;
        C22099u<?> uVar;
        String str2;
        List<String> list;
        List<String> list2;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        Integer num = null;
        if (!C61479e.m111325a()) {
            return null;
        }
        C18202h hVar = fVar.f43342b;
        String a = hVar.mo29061a();
        C89219l.m154716b(a, "");
        C61391b bVar = new C61391b(new C61458b(a, (byte) 0), fVar.f43342b.mo29061a());
        Object obj = this.f139381d;
        if (obj != null) {
            if (obj instanceof C17794i) {
                C61462f fVar2 = new C61462f((C17794i) this.f139381d);
                String a2 = hVar.mo29061a();
                C89219l.m154716b(a2, "");
                fVar2.mo99138a(a2);
                bVar.f139383b = fVar2;
            } else if (obj instanceof C61462f) {
                C61462f fVar3 = (C61462f) obj;
                String a3 = hVar.mo29061a();
                C89219l.m154716b(a3, "");
                fVar3.mo99138a(a3);
                bVar.f139383b = fVar3;
            }
        }
        String str3 = "1";
        if (fVar.f43349i == null || !(fVar.f43349i instanceof PreloadExtraInfo)) {
            String a4 = hVar.f43370e.mo29049a();
            Map<String, List<String>> map = f139378a;
            if (map.containsKey(a4)) {
                C61458b bVar2 = bVar.f139382a;
                String a5 = hVar.mo29061a();
                C89219l.m154716b(a5, "");
                bVar2.f139518b = m111130a(a5, map.get(a4));
            }
        } else {
            Object obj2 = fVar.f43349i;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.preload.PreloadExtraInfo");
            PreloadExtraInfo preloadExtraInfo = (PreloadExtraInfo) obj2;
            bVar.f139384c = preloadExtraInfo;
            f139379b.put(hVar.f43370e.mo29049a(), preloadExtraInfo);
            PreloadExtraInfo preloadExtraInfo2 = bVar.f139384c;
            if (!(preloadExtraInfo2 == null || (list2 = preloadExtraInfo2.f143700e) == null)) {
                f139378a.put(hVar.f43370e.mo29049a(), list2);
            }
            C61458b bVar3 = bVar.f139382a;
            String hVar2 = hVar.toString();
            C89219l.m154716b(hVar2, "");
            PreloadExtraInfo preloadExtraInfo3 = bVar.f139384c;
            if (preloadExtraInfo3 != null) {
                list = preloadExtraInfo3.f143700e;
            } else {
                list = null;
            }
            bVar3.f139518b = m111130a(hVar2, list);
            PreloadExtraInfo preloadExtraInfo4 = bVar.f139384c;
            if (preloadExtraInfo4 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str4 = preloadExtraInfo4.f143696a;
                C89219l.m154716b(str4, "");
                linkedHashMap.put("enter_from", str4);
                String str5 = preloadExtraInfo4.f143698c;
                C89219l.m154716b(str5, "");
                linkedHashMap.put("url", str5);
                linkedHashMap.put("strategy_id", String.valueOf(preloadExtraInfo4.f143699d));
                C39162r.m79460a("preload", linkedHashMap);
            }
            fVar.f43342b.f43371f.mo29056b("preload", str3);
        }
        Request b = fVar.mo29059b();
        C61458b bVar4 = bVar.f139382a;
        C61462f fVar4 = bVar.f139383b;
        C89219l.m154721d(b, "");
        if (!C61460d.m111308a(b) || C61454a.f139507b == null || bVar4 == null || (str = bVar4.f139518b) == null || C89361p.m154870a((CharSequence) str) || ((aVar2 = C61454a.f139507b) != null && aVar2.f139514a.mo2095b() == 0 && C61454a.f139506a.size() == 0 && fVar4 == null)) {
            uVar = null;
        } else {
            C61454a.C61455a aVar3 = C61454a.f139507b;
            if (aVar3 != null) {
                Integer.valueOf(aVar3.f139514a.mo2095b());
            }
            C61454a.f139506a.size();
            uVar = (C22099u) C61454a.m111302a(str, fVar4, new C61454a.C61457b(bVar4));
        }
        if (fVar.f43343c.mo29045a("check_preload") != null) {
            Map<String, PreloadExtraInfo> map2 = f139379b;
            if (map2.containsKey(fVar.f43342b.f43370e.mo29049a())) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                PreloadExtraInfo preloadExtraInfo5 = map2.get(fVar.f43342b.f43370e.mo29049a());
                if (preloadExtraInfo5 != null) {
                    str2 = preloadExtraInfo5.f143698c;
                } else {
                    str2 = null;
                }
                linkedHashMap2.put("url", String.valueOf(str2));
                if (preloadExtraInfo5 != null) {
                    num = Integer.valueOf(preloadExtraInfo5.f143699d);
                }
                linkedHashMap2.put("strategy_id", String.valueOf(num));
                if (uVar == null) {
                    str3 = "0";
                }
                linkedHashMap2.put("is_preload", str3);
                C39162r.m79460a("preload_network_result", linkedHashMap2);
            }
        }
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        AbstractC18185b.C18188c.m33837a(this, aVar, bVar);
        return uVar;
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18189d
    /* renamed from: a */
    public final boolean mo29042a(C18199f fVar, C18182a aVar, Throwable th, boolean z) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(th, "");
        Object a = m111129a(aVar);
        if (!(a instanceof C61391b)) {
            a = null;
        }
        C61391b bVar = (C61391b) a;
        if (bVar == null) {
            return false;
        }
        PreloadExtraInfo preloadExtraInfo = bVar.f139384c;
        if (preloadExtraInfo != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = preloadExtraInfo.f143696a;
            C89219l.m154716b(str2, "");
            linkedHashMap.put("enter_from", str2);
            String str3 = preloadExtraInfo.f143698c;
            C89219l.m154716b(str3, "");
            linkedHashMap.put("url", str3);
            linkedHashMap.put("strategy_id", String.valueOf(preloadExtraInfo.f143699d));
            C39162r.m79460a("preload_fail", linkedHashMap);
        }
        C61458b bVar2 = bVar.f139382a;
        if (bVar2 == null || (str = bVar2.f139518b) == null) {
            return false;
        }
        C61454a.m111303a(str);
        return false;
    }
}
