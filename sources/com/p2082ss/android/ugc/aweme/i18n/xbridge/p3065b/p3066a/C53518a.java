package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.a */
public final class C53518a extends AbstractC14933a {

    /* renamed from: a */
    public final IHostOpenDepend.AbstractC18457d f122869a;

    /* renamed from: b */
    public final String f122870b;

    static {
        Covode.recordClassIndex(63094);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.a$a */
    static final class CallableC53519a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C53518a f122871a;

        static {
            Covode.recordClassIndex(63095);
        }

        CallableC53519a(C53518a aVar) {
            this.f122871a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f122871a.f122869a.mo29563c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.a$b */
    static final class CallableC53520b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C53518a f122872a;

        /* renamed from: b */
        final /* synthetic */ Map f122873b;

        static {
            Covode.recordClassIndex(63096);
        }

        CallableC53520b(C53518a aVar, Map map) {
            this.f122872a = aVar;
            this.f122873b = map;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f122873b == null) {
                this.f122872a.f122869a.mo29562b();
            } else {
                this.f122872a.f122869a.mo29561a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.a$c */
    static final class CallableC53521c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C53518a f122874a;

        /* renamed from: b */
        final /* synthetic */ UpdatePackage f122875b;

        /* renamed from: c */
        final /* synthetic */ long f122876c;

        /* renamed from: d */
        final /* synthetic */ long f122877d;

        static {
            Covode.recordClassIndex(63097);
        }

        CallableC53521c(C53518a aVar, UpdatePackage updatePackage, long j, long j2) {
            this.f122874a = aVar;
            this.f122875b = updatePackage;
            this.f122876c = j;
            this.f122877d = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            JSONObject jSONObject = new JSONObject();
            UpdatePackage updatePackage = this.f122875b;
            if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
                str = this.f122874a.f122870b;
            }
            jSONObject.put("channel", str);
            jSONObject.put("totalResources", this.f122876c);
            jSONObject.put("loadedResources", this.f122877d);
            C18494b.m34415a(new C18484a(this.f122874a.f122870b + "_getGeckoUpdateProgress", System.currentTimeMillis(), new C18738d(jSONObject)));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.a$d */
    public static final class CallableC53522d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C53518a f122878a;

        /* renamed from: b */
        final /* synthetic */ UpdatePackage f122879b;

        /* renamed from: c */
        final /* synthetic */ boolean f122880c;

        /* renamed from: d */
        final /* synthetic */ Throwable f122881d;

        static {
            Covode.recordClassIndex(63098);
        }

        CallableC53522d(C53518a aVar, UpdatePackage updatePackage, boolean z, Throwable th) {
            this.f122878a = aVar;
            this.f122879b = updatePackage;
            this.f122880c = z;
            this.f122881d = th;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            JSONObject jSONObject = new JSONObject();
            UpdatePackage updatePackage = this.f122879b;
            if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
                str = this.f122878a.f122870b;
            }
            jSONObject.put("channel", str);
            jSONObject.put("failed", this.f122880c);
            Throwable th = this.f122881d;
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            jSONObject.put("failedMsg", str2);
            C18494b.m34415a(new C18484a(this.f122878a.f122870b + "_getGeckoUpdateResult", System.currentTimeMillis(), new C18738d(jSONObject)));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: c */
    public final void mo24057c(UpdatePackage updatePackage, Throwable th) {
        super.mo24057c(updatePackage, th);
        m98738a(updatePackage, true, th);
    }

    public C53518a(IHostOpenDepend.AbstractC18457d dVar, String str) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        this.f122869a = dVar;
        this.f122870b = str;
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24046a(UpdatePackage updatePackage, long j) {
        super.mo24046a(updatePackage, j);
        m98738a(updatePackage, false, (Throwable) null);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24052a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
        super.mo24052a(map, th);
        C1731i.m5640b(new CallableC53519a(this), C1731i.f5564c);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24053a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        super.mo24053a(map, map2);
        C1731i.m5640b(new CallableC53520b(this, map2), C1731i.f5564c);
    }

    /* renamed from: a */
    private final void m98738a(UpdatePackage updatePackage, boolean z, Throwable th) {
        C1731i.m5640b(new CallableC53522d(this, updatePackage, z, th), C1731i.f5564c);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24047a(UpdatePackage updatePackage, long j, long j2) {
        super.mo24047a(updatePackage, j, j2);
        C1731i.m5640b(new CallableC53521c(this, updatePackage, j, j2), C1731i.f5564c);
    }
}
