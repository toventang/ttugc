package com.bytedance.ies.xbridge.p1317i.p1319b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c;
import com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18441c;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18442d;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18445e;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18446f;
import com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18593c;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18619e;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18623g;
import com.bytedance.ies.xbridge.p1317i.p1321d.C18625a;
import com.bytedance.ies.xbridge.p1317i.p1321d.C18626b;
import com.bytedance.ies.xbridge.p1317i.p1321d.C18629e;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.b.c */
public final class C18606c extends AbstractC18593c {

    /* renamed from: a */
    public final String f44309a = "XUploadImageMethod";

    static {
        Covode.recordClassIndex(21300);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.b.c$a */
    public static final class C18607a implements OnPermissionGrantCallback {

        /* renamed from: a */
        final /* synthetic */ C18606c f44310a;

        /* renamed from: b */
        final /* synthetic */ Context f44311b;

        /* renamed from: c */
        final /* synthetic */ C18619e f44312c;

        /* renamed from: d */
        final /* synthetic */ AbstractC18593c.AbstractC18594a f44313d;

        static {
            Covode.recordClassIndex(21301);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
        public final void onAllGranted() {
            this.f44310a.mo29684a(this.f44311b, this.f44312c, this.f44313d);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
        public final void onNotGranted() {
            this.f44313d.mo29676a(0, "request permission denied");
        }

        C18607a(C18606c cVar, Context context, C18619e eVar, AbstractC18593c.AbstractC18594a aVar) {
            this.f44310a = cVar;
            this.f44311b = context;
            this.f44312c = eVar;
            this.f44313d = aVar;
        }
    }

    /* renamed from: g */
    private final IHostPermissionDepend m34581g() {
        IHostPermissionDepend iHostPermissionDepend;
        C18465b bVar = (C18465b) mo29616a(C18465b.class);
        if (bVar != null && (iHostPermissionDepend = bVar.f44107j) != null) {
            return iHostPermissionDepend;
        }
        C18465b bVar2 = C18465b.f44096l;
        if (bVar2 != null) {
            return bVar2.f44107j;
        }
        return null;
    }

    /* renamed from: a */
    private final ExecutorService m34579a() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C18465b bVar;
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (((bVar2 != null && (iHostThreadPoolExecutorDepend = bVar2.f44108k) != null) || ((bVar = C18465b.f44096l) != null && (iHostThreadPoolExecutorDepend = bVar.f44108k) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService a = C13590c.m24421a();
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.i.b.c$b */
    public static final class RunnableC18608b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C18606c f44314a;

        /* renamed from: b */
        final /* synthetic */ C18619e f44315b;

        /* renamed from: c */
        final /* synthetic */ AbstractC18593c.AbstractC18594a f44316c;

        /* renamed from: d */
        final /* synthetic */ LinkedHashMap f44317d;

        static {
            Covode.recordClassIndex(21302);
        }

        RunnableC18608b(C18606c cVar, C18619e eVar, AbstractC18593c.AbstractC18594a aVar, LinkedHashMap linkedHashMap) {
            this.f44314a = cVar;
            this.f44315b = eVar;
            this.f44316c = aVar;
            this.f44317d = linkedHashMap;
        }

        public final void run() {
            IHostNetworkDepend iHostNetworkDepend;
            C18465b bVar;
            LinkedHashMap<String, String> a = C18442d.m34305a(this.f44315b.f44353d);
            AbstractC18754n nVar = this.f44315b.f44352c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (nVar != null) {
                AbstractC18687l a2 = nVar.mo29756a();
                while (a2.mo29723a()) {
                    String b = a2.mo29724b();
                    AbstractC18659k i = nVar.mo29766i(b);
                    int i2 = C18445e.f44071a[i.mo29707a().ordinal()];
                    if (i2 == 1) {
                        linkedHashMap.put(b, String.valueOf(i.mo29710d()));
                    } else if (i2 == 2) {
                        linkedHashMap.put(b, String.valueOf(i.mo29708b()));
                    } else if (i2 == 3) {
                        linkedHashMap.put(b, String.valueOf(i.mo29709c()));
                    } else if (i2 == 4) {
                        linkedHashMap.put(b, i.mo29711e());
                    }
                }
            }
            C18609a aVar = new C18609a(this);
            String str = this.f44315b.f44350a;
            if (str == null) {
                C89219l.m154710a("url");
            }
            LinkedHashMap<String, File> linkedHashMap2 = this.f44317d;
            C18465b bVar2 = (C18465b) this.f44314a.mo29616a(C18465b.class);
            if ((bVar2 == null || (iHostNetworkDepend = bVar2.f44106i) == null) && ((bVar = C18465b.f44096l) == null || (iHostNetworkDepend = bVar.f44106i) == null)) {
                iHostNetworkDepend = new C18446f();
            }
            C89219l.m154719c(str, "");
            C89219l.m154719c(a, "");
            C89219l.m154719c(linkedHashMap2, "");
            C89219l.m154719c(linkedHashMap, "");
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(iHostNetworkDepend, "");
            C18429c a3 = new C18429c(str).mo29466a(a);
            C89219l.m154719c(linkedHashMap2, "");
            a3.f44048j = linkedHashMap2;
            C18429c a4 = a3.mo29467a((Map<String, String>) linkedHashMap);
            a4.f44040b = true;
            C18442d.m34306a(a4.mo29464a(iHostNetworkDepend), aVar);
        }

        /* renamed from: com.bytedance.ies.xbridge.i.b.c$b$a */
        public static final class C18609a implements AbstractC18439a {

            /* renamed from: a */
            final /* synthetic */ RunnableC18608b f44318a;

            static {
                Covode.recordClassIndex(21303);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C18609a(RunnableC18608b bVar) {
                this.f44318a = bVar;
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a
            /* renamed from: a */
            public final void mo29472a(Integer num, Throwable th) {
                String str = "";
                C89219l.m154719c(th, str);
                AbstractC18593c.AbstractC18594a aVar = this.f44318a.f44316c;
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                aVar.mo29676a(0, str);
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a
            /* renamed from: a */
            public final void mo29473a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, Integer num) {
                String str;
                List<String> list;
                C89219l.m154719c(jSONObject, "");
                C89219l.m154719c(linkedHashMap, "");
                try {
                    String jSONObject2 = jSONObject.toString();
                    C89219l.m154709a((Object) jSONObject2, "");
                    C18626b bVar = ((C18629e) C18441c.m34302a(jSONObject2, C18629e.class)).f44368a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> keys = jSONObject.keys();
                    C89219l.m154709a((Object) keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C89219l.m154709a((Object) next, "");
                        Object obj = jSONObject.get(next);
                        C89219l.m154709a(obj, "");
                        linkedHashMap2.put(next, obj);
                    }
                    String str2 = null;
                    if (bVar == null || (list = bVar.f44365b) == null || !(!list.isEmpty())) {
                        str = null;
                    } else {
                        str = (String) C89070n.m154583g((List) list);
                    }
                    AbstractC18593c.AbstractC18594a aVar = this.f44318a.f44316c;
                    C18623g gVar = new C18623g();
                    gVar.f44359a = str;
                    if (bVar != null) {
                        str2 = bVar.f44364a;
                    }
                    gVar.f44360b = str2;
                    gVar.f44361c = linkedHashMap2;
                    aVar.mo29677a(gVar, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a
            /* renamed from: a */
            public final C89391z mo29471a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, String str, Throwable th, Integer num) {
                C89219l.m154719c(jSONObject, "");
                C89219l.m154719c(linkedHashMap, "");
                C89219l.m154719c(str, "");
                C89219l.m154719c(th, "");
                C89219l.m154719c(jSONObject, "");
                C89219l.m154719c(linkedHashMap, "");
                C89219l.m154719c(str, "");
                C89219l.m154719c(th, "");
                return null;
            }
        }
    }

    /* renamed from: a */
    public final void mo29684a(Context context, C18619e eVar, AbstractC18593c.AbstractC18594a aVar) {
        LinkedHashMap<String, File> b = m34580b(context, eVar, aVar);
        if (b != null) {
            m34579a().execute(new RunnableC18608b(this, eVar, aVar, b));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.LinkedHashMap<java.lang.String, java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static LinkedHashMap<String, File> m34580b(Context context, C18619e eVar, AbstractC18593c.AbstractC18594a aVar) {
        if (eVar.f44354e != null) {
            List<C18619e.C18621b> list = eVar.f44354e;
            if (list == null) {
                C89219l.m154707a();
            }
            ArrayList<C89378p> arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                File a = m34578a(context, t.f44356b, aVar, t.f44355a);
                if (a == null) {
                    return null;
                }
                arrayList.add(new C89378p(t.f44355a, a));
            }
            LinkedHashMap<String, File> linkedHashMap = new LinkedHashMap<>();
            for (C89378p pVar : arrayList) {
                linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
            }
            return linkedHashMap;
        } else if (eVar.mo29688a().length() > 0) {
            File a2 = m34578a(context, eVar.mo29688a(), aVar, "filePath");
            if (a2 == null) {
                return null;
            }
            return C89041ag.m154430d(C89387v.m154943a("file", a2));
        } else {
            aVar.mo29676a(-3, "filePath or formDataBody can not be null.");
            return null;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18593c
    /* renamed from: a */
    public final void mo29675a(C18619e eVar, AbstractC18593c.AbstractC18594a aVar, EnumC18483e eVar2) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar2, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29676a(0, "Context not provided in host");
            return;
        }
        Activity a = C18806a.m34902a(context);
        if (a == null) {
            aVar.mo29676a(0, "context can not convert to activity");
            return;
        }
        IHostPermissionDepend g = m34581g();
        if (g == null || !g.hasPermission(a, "android.permission.READ_EXTERNAL_STORAGE")) {
            IHostPermissionDepend g2 = m34581g();
            if (g2 != null) {
                g2.requestPermission(a, new C18607a(this, context, eVar, aVar), "android.permission.READ_EXTERNAL_STORAGE");
            } else {
                aVar.mo29676a(0, "uploadImageDepend is null");
            }
        } else {
            mo29684a(context, eVar, aVar);
        }
    }

    /* renamed from: a */
    private static File m34578a(Context context, String str, AbstractC18593c.AbstractC18594a aVar, String str2) {
        boolean z;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.mo29676a(-3, "The file path should not be empty.The key is ".concat(String.valueOf(str2)));
            return null;
        }
        String a = C18625a.m34594a(context, str);
        if (a == null || a.length() == 0) {
            z2 = true;
        }
        if (z2) {
            aVar.mo29676a(-9, "File is not exist.The key is ".concat(String.valueOf(str2)));
            return null;
        }
        File file = new File(a);
        if (!file.exists()) {
            aVar.mo29676a(-9, "File is not exist.The key is ".concat(String.valueOf(str2)));
            return null;
        } else if (file.isFile()) {
            return file;
        } else {
            aVar.mo29676a(-9, "File is not file.The key is ".concat(String.valueOf(str2)));
            return null;
        }
    }
}
