package com.bytedance.geckox;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.loop.C14994b;
import com.bytedance.geckox.policy.p1028b.C14978a;
import com.bytedance.geckox.policy.p1031e.C14992a;
import com.bytedance.geckox.policy.p1032v4.C15004b;
import com.bytedance.geckox.statistic.AbstractC15017a;
import com.bytedance.geckox.utils.C15057h;
import java.io.File;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.geckox.c */
public final class C14894c {

    /* renamed from: a */
    public C14905e f36389a;

    /* renamed from: b */
    private File f36390b;

    /* renamed from: c */
    private C14978a f36391c;

    static {
        Covode.recordClassIndex(17007);
    }

    private C14894c(C14905e eVar) {
        this.f36389a = eVar;
        this.f36390b = eVar.f36416o;
        C14978a aVar = new C14978a();
        this.f36391c = aVar;
        aVar.f36589c = eVar;
    }

    /* renamed from: a */
    public final void mo23997a(String str) {
        if (this.f36389a != null && !TextUtils.isEmpty(str)) {
            this.f36389a.f36412k = str;
            if (C14930f.m27473a().mo24031b() != null) {
                C14930f.m27473a().mo24031b().deviceId = str;
            }
        }
    }

    /* renamed from: a */
    private boolean m27398a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> list = this.f36389a.f36407f;
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                boolean z = false;
                for (String str : list) {
                    if (TextUtils.equals(str, entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C14894c m27397a(C14905e eVar) {
        if (eVar != null) {
            List<String> list = eVar.f36407f;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("access key empty");
            }
            try {
                for (String str : eVar.f36407f) {
                    C14930f.m27473a().mo24028a(str, eVar.f36416o.getAbsolutePath());
                }
            } catch (IllegalArgumentException e) {
                C14957a.m27543a("gecko client register root dir failed", e.getMessage());
            }
            C15057h.m27721a(eVar.f36402a);
            C14894c cVar = new C14894c(eVar);
            String a = eVar.mo24003a();
            C89219l.m154719c(a, "");
            C89219l.m154719c(cVar, "");
            if (C14901d.f36397a.get(a) == null) {
                C14901d.f36397a.put(a, cVar);
            }
            C14992a a2 = C14992a.m27593a();
            if (a2.f36627c.compareAndSet(false, true)) {
                a2.f36626a = eVar;
                C14992a.f36624b = System.currentTimeMillis();
            }
            C15004b a3 = C15004b.m27618a();
            if (a3.f36660b == null) {
                a3.f36660b = eVar;
            }
            GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
            if (d != null) {
                a3.f36660b.f36410i = Long.valueOf(d.getAppId());
                a3.f36660b.f36406e = d.getNetWork();
            }
            C14930f a4 = C14930f.m27473a();
            AbstractC15017a aVar = eVar.f36405d;
            if (a4.f36483j == null) {
                a4.f36483j = aVar;
            }
            return cVar;
        }
        throw new IllegalArgumentException("config == null");
    }

    /* renamed from: a */
    public final void mo24000a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map, AbstractC14933a aVar) {
        mo23999a("default", map, aVar);
    }

    /* renamed from: a */
    public final void mo23999a(String str, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, AbstractC14933a aVar) {
        mo23998a(str, map, new OptionCheckUpdateParams().setListener(aVar));
    }

    /* renamed from: a */
    public final void mo23998a(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        boolean g = C14930f.m27473a().mo24036g();
        C14957a.m27543a("gecko update enable:", Boolean.valueOf(g));
        if (!g) {
            if (optionCheckUpdateParams != null && optionCheckUpdateParams.getListener() != null) {
                optionCheckUpdateParams.getListener().mo24052a((Map<String, List<Pair<String, Long>>>) null, new IllegalStateException("gecko is disabled"));
            }
        } else if (m27398a(map)) {
            if (TextUtils.isEmpty(str)) {
                str = "default";
            }
            if (optionCheckUpdateParams == null) {
                optionCheckUpdateParams = new OptionCheckUpdateParams();
            }
            if (optionCheckUpdateParams.isLazyUpdate()) {
                this.f36391c.mo24191a(str, map, optionCheckUpdateParams);
                return;
            }
            boolean a = C14930f.m27473a().mo24030a(optionCheckUpdateParams.isEnableThrottle());
            C14957a.m27543a("gecko update throttle enable:", Boolean.valueOf(a));
            optionCheckUpdateParams.setEnableThrottle(a);
            if (!optionCheckUpdateParams.isLazyUpdate() && this.f36389a.f36417p && optionCheckUpdateParams.getLoopLevel() != null) {
                C14994b.m27595a().mo24207a(str, this.f36389a.f36407f, map, optionCheckUpdateParams);
            }
            optionCheckUpdateParams.setInnerRequestByUser(true);
            this.f36389a.f36404c.execute(new Runnable() {
                /* class com.bytedance.geckox.C14894c.RunnableC148951 */

                static {
                    Covode.recordClassIndex(17008);
                }

                /* JADX INFO: finally extract failed */
                /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                    com.bytedance.geckox.p1022i.C14957a.m27542a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
                    r0 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
                    r9.getListener().mo24042a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e6, code lost:
                    if (r2 != null) goto L_0x00e8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
                    r2.mo23963a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
                    com.bytedance.geckox.p1022i.C14957a.m27543a("all channel update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
                    r0 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
                    r9.getListener().mo24042a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
                    if (r2 != null) goto L_0x0109;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
                    r2.mo23963a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
                    com.bytedance.geckox.p1022i.C14957a.m27543a("all channel update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00d0 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 276
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.C14894c.RunnableC148951.run():void");
                }
            });
        } else {
            throw new IllegalArgumentException("target keys are not in deployments keys");
        }
    }
}
