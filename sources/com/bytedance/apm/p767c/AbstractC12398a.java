package com.bytedance.apm.p767c;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.C12478h;
import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p767c.p770c.C12414a;
import com.bytedance.apm.p771d.C12441a;
import com.bytedance.apm.p771d.C12442b;
import com.bytedance.apm.p775g.AbstractC12473a;
import com.bytedance.apm.p778j.C12511a;
import com.bytedance.apm.p787o.C12558a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12584g;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.p1748w.p1749a.C23546c;
import com.bytedance.p802b.p803a.C12918a;
import com.bytedance.p802b.p803a.p805b.C12924c;
import com.bytedance.p802b.p803a.p805b.C12925d;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.p2082ss.android.ugc.aweme.net.model.C61422b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.a */
public abstract class AbstractC12398a<T extends AbstractC12406b> implements AbstractC22715a {

    /* renamed from: a */
    public static int f29957a = 1000;

    /* renamed from: b */
    public final LinkedList<T> f29958b = new LinkedList<>();

    /* renamed from: c */
    private volatile boolean f29959c;

    /* renamed from: d */
    private volatile boolean f29960d;

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: a */
    public void mo20180a(JSONObject jSONObject, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo20182c(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20183d(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo20184e(T t);

    static {
        Covode.recordClassIndex(14205);
    }

    /* renamed from: a */
    public final void mo20178a() {
        ((IConfigManager) C21520c.m40424a(IConfigManager.class)).registerConfigListener(this);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
        this.f29959c = true;
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.p767c.AbstractC12398a.RunnableC124002 */

            static {
                Covode.recordClassIndex(14207);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: com.bytedance.apm.c.a */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                LinkedList linkedList;
                synchronized (AbstractC12398a.this.f29958b) {
                    linkedList = new LinkedList(AbstractC12398a.this.f29958b);
                    AbstractC12398a.this.f29958b.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    AbstractC12398a.this.mo20184e((AbstractC12406b) it.next());
                }
            }
        });
        if (C12397c.m22288e()) {
            C12442b.C12445a.f30223a.mo20275a("APM_SETTING_READY", (String) null);
        }
    }

    /* renamed from: a */
    public final void mo20179a(final T t) {
        if (!C12560b.C12564a.f30567a.mo20389a()) {
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.p767c.AbstractC12398a.RunnableC123991 */

                static {
                    Covode.recordClassIndex(14206);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.apm.c.a */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    AbstractC12398a.this.mo20181b(t);
                }
            });
        } else {
            mo20181b(t);
        }
    }

    /* renamed from: b */
    public final void mo20181b(T t) {
        if (mo20182c(t)) {
            mo20183d(t);
            if (this.f29959c) {
                mo20184e(t);
            } else {
                m22294f(t);
            }
        }
    }

    /* renamed from: f */
    private void m22294f(T t) {
        if (t != null) {
            synchronized (this.f29958b) {
                if (this.f29958b.size() > f29957a) {
                    T poll = this.f29958b.poll();
                    if (!this.f29960d) {
                        C12478h.C12481b.f30317a.mo20295a("apm_cache_buffer_full");
                        this.f29960d = true;
                    }
                    try {
                        poll.mo20188a();
                    } catch (Exception unused) {
                    }
                }
                this.f29958b.add(t);
            }
        }
    }

    /* renamed from: a */
    protected static void m22293a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        JSONArray optJSONArray;
        if (jSONObject != null) {
            C61425e<C61422b, Boolean> eVar = new C61425e<>();
            eVar.f139468a = (Q) new C61422b(str, str2, jSONObject);
            C61439n.f139485e.mo68816b_(eVar);
            if (eVar.f139473f == EnumC61424d.INTERCEPT) {
                return;
            }
        }
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str3 = "type:" + str + " isSaveUnSampleLog:" + z2 + "isSampled:" + z + " log:" + jSONObject;
            C12441a.m22401a(str, jSONObject, z);
        }
        if (z) {
            JSONObject c = C12584g.m22677c(jSONObject);
            if (TextUtils.equals(str, "tracing")) {
                C23546c cVar = new C23546c(c, str2);
                if ("batch_tracing".equals(cVar.f55772a)) {
                    JSONObject a = cVar.mo20188a();
                    JSONArray jSONArray = null;
                    if (!(a == null || (optJSONArray = a.optJSONArray("wrapper_array_data")) == null)) {
                        jSONArray = optJSONArray;
                    }
                    C12918a.m23184a(new C12925d(jSONArray));
                } else {
                    C12918a.m23184a(new C12925d(cVar.mo20188a()));
                }
            } else if (TextUtils.equals(str, "common_log")) {
                C13092a.m23544a(new C12924c(str2, c));
            } else {
                C13092a.m23544a(new C12924c(str, c));
            }
        }
        C12511a a2 = C12511a.m22484a();
        if (a2.f30381a.size() != 0) {
            C12560b.C12564a.f30567a.mo20391b(new Runnable(str, str2, jSONObject) {
                /* class com.bytedance.apm.p778j.C12511a.RunnableC125121 */

                /* renamed from: a */
                final /* synthetic */ String f30382a;

                /* renamed from: b */
                final /* synthetic */ String f30383b;

                /* renamed from: c */
                final /* synthetic */ JSONObject f30384c;

                static {
                    Covode.recordClassIndex(14328);
                }

                public final void run() {
                    Iterator<AbstractC12473a> it = C12511a.this.f30381a.iterator();
                    while (it.hasNext()) {
                        it.next().mo20293a(this.f30383b, this.f30384c);
                    }
                }

                {
                    this.f30382a = r2;
                    this.f30383b = r3;
                    this.f30384c = r4;
                }
            });
        }
        if (TextUtils.equals(str, "ui_action")) {
            C12558a<JSONObject> aVar = C12414a.m22354a().f30022a;
            if (aVar.f30551a.size() > aVar.f30552b) {
                aVar.f30551a.removeFirst();
            }
            aVar.f30551a.addLast(jSONObject);
        }
    }
}
