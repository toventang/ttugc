package com.p2082ss.android.ugc.aweme.benchmark;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.benchmark.C2410a;
import com.benchmark.bytemonitor.C2431a;
import com.benchmark.collection.AbstractC2460f;
import com.benchmark.collection.C2439b;
import com.benchmark.collection.C2457e;
import com.benchmark.netUtils.C2496a;
import com.benchmark.p117a.C2413a;
import com.benchmark.p117a.C2415c;
import com.benchmark.p119c.C2435a;
import com.benchmark.p119c.C2436b;
import com.benchmark.p121d.C2472b;
import com.benchmark.port.AbstractC2500c;
import com.benchmark.port.C2499b;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.benchmark.settings.C2505a;
import com.benchmark.strategy.C2507a;
import com.benchmark.tools.C2517e;
import com.benchmark.tools.C2521f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14719l;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.property.C65356az;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.benchmark.BenchmarkInitRequest */
public final class BenchmarkInitRequest implements AbstractC58084a, AbstractC58264w {
    static {
        Covode.recordClassIndex(41819);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.IO;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.benchmark.BenchmarkInitRequest$b */
    static final class C34815b implements C2517e.AbstractC2520c {

        /* renamed from: a */
        public static final C34815b f82243a = new C34815b();

        static {
            Covode.recordClassIndex(41821);
        }

        C34815b() {
        }

        @Override // com.benchmark.tools.C2517e.AbstractC2520c
        /* renamed from: a */
        public final void mo6979a(Throwable th) {
            C89219l.m154721d(th, "");
            C13468b.m24211a(th, "benchmark test");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        String serverDeviceId;
        File file;
        MethodCollector.m26663i(4283);
        C2413a.m7257a(C34814a.f82242a);
        C2415c.m7260a(C34815b.f82243a);
        C2410a.C2411a aVar = new C2410a.C2411a();
        aVar.f7236a = C17867d.m33078a();
        AVApi b = AVApiImpl.m123134b();
        C89219l.m154716b(b, "");
        aVar.f7238c = b.mo109850a();
        aVar.f7239d = Build.MODEL;
        aVar.f7241f = C17867d.f42590n;
        aVar.f7242g = C17867d.m33081b();
        aVar.f7243h = C17867d.m33088i();
        aVar.f7244i = C17867d.m33087h();
        aVar.f7246k = String.valueOf(C13037a.m23448p());
        if (AppLog.getServerDeviceId() == null) {
            serverDeviceId = "0";
        } else {
            serverDeviceId = AppLog.getServerDeviceId();
        }
        aVar.f7245j = serverDeviceId;
        aVar.f7248m = C16048b.m29633a().mo25421a(true, "enable_benchmark_open_runtime_decision", true);
        String str = null;
        if (C65356az.m117041a()) {
            Context a = C17867d.m33078a();
            if (!TextUtils.isEmpty(null)) {
                file = a.getExternalFilesDir(null);
            } else {
                if (C58016d.f132223d == null || !C58016d.f132224e) {
                    C58016d.f132223d = a.getExternalFilesDir(null);
                }
                file = C58016d.f132223d;
            }
            if (file != null) {
                str = file.getPath();
            }
        } else {
            str = C70638dj.f158101d;
        }
        String absolutePath = new File(str, "bytebench").getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        aVar.f7237b = absolutePath;
        C2410a aVar2 = new C2410a(aVar);
        long currentTimeMillis = System.currentTimeMillis();
        KevaBuilder.getInstance().setContext(aVar2.f7223a);
        Keva.forceInit();
        C2436b bVar = C2436b.f7319m;
        bVar.f7320a = aVar2.f7223a;
        bVar.f7321b = aVar2.f7225c;
        bVar.f7322c = aVar2.f7226d;
        bVar.f7323d = aVar2.f7227e;
        bVar.f7324e = aVar2.f7228f;
        bVar.f7325f = aVar2.f7229g;
        bVar.f7326g = aVar2.f7230h;
        bVar.f7327h = aVar2.f7231i;
        bVar.f7328i = aVar2.f7232j;
        bVar.f7330k = aVar2.f7233k;
        bVar.f7329j = aVar2.f7234l;
        bVar.f7331l = aVar2.f7235m;
        C2496a a2 = C2496a.m7360a();
        a2.f7567b = aVar2.f7224b;
        a2.f7566a = RetrofitUtils.m43288b(a2.f7567b);
        C90208y.C90210a aVar3 = new C90208y.C90210a();
        aVar3.mo145088a(60000, TimeUnit.MILLISECONDS);
        aVar3.mo145098b(60000, TimeUnit.MILLISECONDS);
        aVar3.f204953w = true;
        aVar3.mo145100b(new C14719l());
        aVar3.mo145089a(Collections.singletonList(EnumC90211z.HTTP_1_1));
        a2.f7568c = aVar3.mo145103d();
        byte b2 = aVar2.f7233k;
        C2436b.f7319m.f7330k = b2;
        C2521f.m7395a("ByteBench", b2);
        LogcatInvoker.m7366a(b2);
        ApplogUtilsInvoker.Init();
        C2507a aVar4 = C2507a.f7604b;
        String str2 = aVar2.f7235m;
        C2431a.m7268a(aVar2.f7223a);
        C2431a.m7267a();
        aVar4.f7605a.init(str2);
        C2507a aVar5 = C2507a.f7604b;
        aVar5.f7605a.isOpenRuntimeDecision(aVar2.f7234l);
        C2472b bVar2 = C2472b.f7412a;
        synchronized (bVar2.f7415d) {
            try {
                bVar2.f7413b.set(false);
                bVar2.f7415d.notifyAll();
            } catch (Throwable th) {
                MethodCollector.m26664o(4283);
                throw th;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            C2413a.m7259a("bytebench_init", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2499b.f7582a.set(true);
        AbstractC2500c a3 = C2435a.m7273a().mo6803a(C17867d.f42590n);
        C2505a.C2506a aVar6 = new C2505a.C2506a();
        aVar6.f7602d = "4f74f70v5410c01400qzbwg0irxc02003c9";
        aVar6.f7603e = "00qzdim2ws00w4mxvv2i4xhp4r3l7e6p";
        a3.mo6919a(new C2505a(aVar6, (byte) 0));
        C2439b bVar3 = C2439b.f7341a;
        C89219l.m154716b(bVar3, "");
        AbstractC2460f a4 = bVar3.mo6804a();
        C2457e.C2458a aVar7 = new C2457e.C2458a();
        if (C34816a.m71144a() > 0) {
            int a5 = C34816a.m71144a();
            if (a5 <= 0) {
                aVar7.f7376a = false;
            } else {
                aVar7.f7376a = true;
                aVar7.f7377b = a5;
            }
        }
        a4.mo6808a(new C2457e(aVar7));
        C2439b bVar4 = C2439b.f7341a;
        C89219l.m154716b(bVar4, "");
        bVar4.mo6804a().mo6809a();
        MethodCollector.m26664o(4283);
    }

    /* renamed from: com.ss.android.ugc.aweme.benchmark.BenchmarkInitRequest$a */
    static final class C34814a implements C2517e.AbstractC2518a {

        /* renamed from: a */
        public static final C34814a f82242a = new C34814a();

        static {
            Covode.recordClassIndex(41820);
        }

        C34814a() {
        }

        @Override // com.benchmark.tools.C2517e.AbstractC2518a
        /* renamed from: a */
        public final void mo6840a(String str, JSONObject jSONObject) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(jSONObject, "");
            C39162r.m79461a(str, jSONObject);
        }
    }
}
