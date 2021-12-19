package com.bytedance.helios.sdk.p1097d;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.C15370b;
import com.bytedance.helios.sdk.C15372c;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.w */
public final class C15425w extends AbstractC15412n {

    /* renamed from: b */
    public static final List<Integer> f37662b = C89070n.m154522b(2002, 2006, 2003);

    /* renamed from: f */
    public static final C15426a f37663f = new C15426a((byte) 0);

    /* renamed from: g */
    private final List<AbstractC15419r> f37664g;

    /* renamed from: com.bytedance.helios.sdk.d.w$a */
    public static final class C15426a {
        static {
            Covode.recordClassIndex(17678);
        }

        private C15426a() {
        }

        public /* synthetic */ C15426a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final int[] mo25138a() {
        return C15424v.f37656a;
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final String mo25146b() {
        return C15424v.f37657b;
    }

    public C15425w() {
        ArrayList arrayList = new ArrayList();
        this.f37664g = arrayList;
        mo25154a(C15424v.f37658c);
        C15298b a = C15298b.C15299a.m28208a();
        if (a instanceof AbstractC15419r) {
            C89219l.m154719c(a, "");
            arrayList.add(a);
        }
    }

    static {
        Covode.recordClassIndex(17677);
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final List<Integer> mo25147b(int i) {
        if (i != 102801) {
            return C89086z.INSTANCE;
        }
        return C89070n.m154516a((Object) 102800);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final void mo25135a(C15397d dVar, Throwable th) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(th, "");
        C15400e eVar = (C15400e) this.f37577a.get(dVar.f37587d);
        C89219l.m154709a((Object) eVar, "");
        mo25152a(eVar, dVar, th);
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: c */
    public final void mo25157c(C15400e eVar, C15397d dVar, Throwable th) {
        Object obj;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        try {
            Object[] objArr = dVar.f37586c;
            if (objArr == null || (obj = objArr[0]) == null) {
                throw new C89388w("null cannot be cast to non-null type");
            }
            View view = (View) obj;
            List<C15318n> list = this.f37631c;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                Object obj2 = t2.f37368n.get("key_view_id");
                Object obj3 = t2.f37368n.get("key_view_hash_code");
                if (C89219l.m154714a(obj2, Integer.valueOf(view.getId())) && C89219l.m154714a(obj3, Integer.valueOf(view.hashCode()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            this.f37631c.removeAll(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator<T> it = this.f37664g.iterator();
                while (it.hasNext()) {
                    it.next().onWindowViewAction(dVar.f37587d, arrayList2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final void mo25156b(C15400e eVar, C15397d dVar, Throwable th) {
        WindowManager.LayoutParams layoutParams;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        try {
            Object[] objArr = dVar.f37586c;
            if (objArr != null) {
                layoutParams = objArr[1];
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                WindowManager.LayoutParams layoutParams2 = layoutParams;
                if ((Build.VERSION.SDK_INT >= 26 && layoutParams2.type == 2038) || (Build.VERSION.SDK_INT < 26 && f37662b.contains(Integer.valueOf(layoutParams2.type)))) {
                    C15434f a = C15434f.m28386a();
                    C89219l.m154709a((Object) a, "");
                    String e = a.mo25171e();
                    List<AnchorInfoModel> anchorConfigList = HeliosEnvImpl.INSTANCE.getAnchorConfigList();
                    ArrayList arrayList = new ArrayList();
                    for (T t : anchorConfigList) {
                        if (t.getSkipAnchorActions().contains("floating_window_view")) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AnchorInfoModel> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                    for (AnchorInfoModel anchorInfoModel : arrayList2) {
                        arrayList3.add(anchorInfoModel.getDetectionPage());
                    }
                    ArrayList arrayList4 = arrayList3;
                    C15434f a2 = C15434f.m28386a();
                    C89219l.m154709a((Object) a2, "");
                    C15370b bVar = a2.f37674c;
                    C89219l.m154709a((Object) bVar, "");
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : bVar) {
                        if (arrayList4.contains(((C15372c) obj).f37498c)) {
                            arrayList5.add(obj);
                        }
                    }
                    ArrayList arrayList6 = arrayList5;
                    if (true ^ arrayList6.isEmpty()) {
                        Object obj2 = dVar.f37586c[0];
                        if (obj2 != null) {
                            View view = (View) obj2;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("key_view_id", Integer.valueOf(view.getId()));
                            linkedHashMap.put("key_view_hash_code", Integer.valueOf(view.hashCode()));
                            C89219l.m154709a((Object) e, "");
                            C15434f a3 = C15434f.m28386a();
                            C89219l.m154709a((Object) a3, "");
                            C15318n nVar = new C15318n(null, 102800, null, null, null, null, null, e, a3.mo25172f(), dVar.f37588e, linkedHashMap, null, null, null, 0, null, null, null, null, null, -11779);
                            nVar.f37368n.put("floating_view_activities", arrayList6);
                            this.f37631c.add(nVar);
                            Iterator<T> it = this.f37664g.iterator();
                            while (it.hasNext()) {
                                it.next().onWindowViewAction(dVar.f37587d, C89070n.m154516a(nVar));
                            }
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
        }
    }
}
