package com.lynx.tasm.p2043a.p2044a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.p2043a.C28407b;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.a.a.a */
public class C28394a {

    /* renamed from: a */
    public C28407b[] f66718a;

    /* renamed from: b */
    public HashMap<String, C28397c> f66719b = new HashMap<>();

    /* renamed from: c */
    private WeakReference<LynxUI> f66720c;

    static {
        Covode.recordClassIndex(34384);
    }

    /* renamed from: c */
    private LynxUI m56778c() {
        return this.f66720c.get();
    }

    /* renamed from: b */
    public final void mo48818b() {
        HashMap<String, C28397c> hashMap = this.f66719b;
        if (hashMap != null) {
            for (C28397c cVar : hashMap.values()) {
                cVar.mo48819a();
            }
            this.f66719b = null;
            this.f66718a = null;
        }
    }

    /* renamed from: a */
    public final void mo48816a() {
        C28397c cVar;
        if (this.f66718a == null) {
            return;
        }
        if (!(m56778c().getHeight() == 0 && m56778c().getWidth() == 0)) {
            HashMap<String, C28397c> hashMap = new HashMap<>();
            C28407b[] bVarArr = this.f66718a;
            for (C28407b bVar : bVarArr) {
                if (bVar != null && !TextUtils.isEmpty(bVar.f66756a)) {
                    HashMap<String, C28397c> hashMap2 = this.f66719b;
                    if (hashMap2 == null || (cVar = hashMap2.get(bVar.f66756a)) == null) {
                        cVar = new C28397c(m56778c().mView, m56778c());
                    } else {
                        this.f66719b.remove(bVar.f66756a);
                    }
                    hashMap.put(bVar.f66756a, cVar);
                }
            }
            HashMap<String, C28397c> hashMap3 = this.f66719b;
            if (hashMap3 != null) {
                for (C28397c cVar2 : hashMap3.values()) {
                    cVar2.mo48819a();
                }
            }
            C28407b[] bVarArr2 = this.f66718a;
            for (C28407b bVar2 : bVarArr2) {
                if (bVar2 != null && !TextUtils.isEmpty(bVar2.f66756a)) {
                    hashMap.get(bVar2.f66756a).mo48820a(bVar2);
                }
            }
            this.f66719b = hashMap;
        }
    }

    public C28394a(LynxUI lynxUI) {
        this.f66720c = new WeakReference<>(lynxUI);
    }

    /* renamed from: a */
    public final void mo48817a(String str, Object obj) {
        HashMap<String, C28397c> hashMap = this.f66719b;
        if (hashMap != null) {
            for (C28397c cVar : hashMap.values()) {
                if (cVar.f66725b.containsKey(str)) {
                    cVar.f66725b.put(str, obj);
                }
                if (str.equals("BackgroundColor") && cVar.f66725b.containsKey("Color")) {
                    cVar.f66725b.put("Color", obj);
                }
            }
        }
    }
}
