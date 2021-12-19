package com.bytedance.bridge.magpie.p879a.p882c;

import com.bytedance.bridge.magpie.p879a.AbstractC13408b;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.bridge.magpie.a.c.d */
public final class C13422d extends AbstractC13418a {

    /* renamed from: a */
    public static final List<Class<? extends AbstractC13418a>> f32720a = C89070n.m154524c(C13420c.class, C13419b.class);

    /* renamed from: b */
    public static final List<Class<? extends AbstractC13418a>> f32721b = C89070n.m154524c(C13426g.class, C13420c.class, C13419b.class);

    /* renamed from: c */
    public static final C13423a f32722c = new C13423a((byte) 0);

    /* renamed from: d */
    private final List<AbstractC13418a> f32723d;

    /* renamed from: e */
    private AbstractC13408b f32724e;

    /* renamed from: com.bytedance.bridge.magpie.a.c.d$a */
    public static final class C13423a {
        static {
            Covode.recordClassIndex(15423);
        }

        private C13423a() {
        }

        public /* synthetic */ C13423a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C13422d m24137a(boolean z, AbstractC13408b bVar) {
            List<Class<? extends AbstractC13418a>> list;
            C89219l.m154719c(bVar, "");
            C13424e.f32725a = bVar;
            if (z) {
                list = C13422d.f32721b;
            } else {
                list = C13422d.f32720a;
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC13418a aVar = (AbstractC13418a) it.next().newInstance();
                aVar.mo21644a(bVar);
                arrayList.add(aVar);
            }
            return new C13422d(arrayList, bVar, (byte) 0);
        }
    }

    @Override // com.bytedance.bridge.magpie.p879a.p882c.AbstractC13418a
    /* renamed from: a */
    public final AbstractC13408b mo21643a() {
        return this.f32724e;
    }

    static {
        Covode.recordClassIndex(15422);
    }

    @Override // com.bytedance.bridge.magpie.p879a.p882c.AbstractC13418a
    /* renamed from: b */
    public final JSONObject mo21645b() {
        String c;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject jSONObject;
        String str;
        Iterator<T> it = this.f32723d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            JSONObject b = next.mo21645b();
            if (b != null) {
                C13453e.m24179c("MagpiePermission", "fetch config success from ".concat(String.valueOf(next)));
                C13425f.f32727a = C13424e.f32725a;
                AbstractC13408b bVar = C13424e.f32725a;
                if (bVar != null && (c = bVar.mo21636c()) != null && (optJSONObject = b.optJSONObject("data")) != null && (optJSONObject2 = optJSONObject.optJSONObject("packages")) != null && (optJSONArray = optJSONObject2.optJSONArray(c)) != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (optJSONArray != null) {
                            jSONObject = optJSONArray.optJSONObject(i);
                            if (jSONObject != null) {
                                str = jSONObject.optString("channel");
                            }
                            str = null;
                        } else {
                            jSONObject = null;
                            str = null;
                        }
                        if (C89219l.m154714a((Object) str, (Object) "_jsb_auth")) {
                            C13453e.m24179c("MagpiePermission", "find host channel");
                            C13425f.m24138a("", jSONObject);
                        } else if (str == null || !C89361p.m154874b(str, "_jsb_auth.", false)) {
                            C13453e.m24177a("MagpiePermission", "find wrong channel: ".concat(String.valueOf(str)));
                        } else {
                            C13453e.m24179c("MagpiePermission", "find custom channel : " + C89361p.m154868a(str, "_jsb_auth.", ""));
                            C13425f.m24138a(C89361p.m154868a(str, "_jsb_auth.", ""), jSONObject);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.bridge.magpie.p879a.p882c.AbstractC13418a
    /* renamed from: a */
    public final void mo21644a(AbstractC13408b bVar) {
        this.f32724e = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.bytedance.bridge.magpie.a.c.a> */
    /* JADX WARN: Multi-variable type inference failed */
    private C13422d(List<? extends AbstractC13418a> list, AbstractC13408b bVar) {
        this.f32723d = list;
        this.f32724e = bVar;
    }

    public /* synthetic */ C13422d(List list, AbstractC13408b bVar, byte b) {
        this(list, bVar);
    }
}
