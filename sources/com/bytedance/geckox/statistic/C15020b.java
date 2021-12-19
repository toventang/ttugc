package com.bytedance.geckox.statistic;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.C14948g;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1012b.C14884b;
import com.bytedance.geckox.p1015c.C14899d;
import com.bytedance.geckox.p1015c.C14900e;
import com.bytedance.geckox.p1017e.C14912c;
import com.bytedance.geckox.p1017e.C14913d;
import com.bytedance.geckox.p1017e.C14927o;
import com.bytedance.geckox.p1017e.C14928p;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1019f.C14935c;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.model.C15042d;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.bytedance.p1603q.p1604a.C21930e;
import com.bytedance.p1603q.p1605b.AbstractC21932a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.statistic.b */
public final class C15020b {

    /* renamed from: a */
    public static boolean f36693a;

    /* renamed from: b */
    static C14905e f36694b;

    static {
        Covode.recordClassIndex(17183);
    }

    /* renamed from: a */
    public static AbstractC21932a m27640a(final AbstractC14933a aVar) {
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C1502513 */

            static {
                Covode.recordClassIndex(17188);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: a */
            public final <T> void mo24305a(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
                super.mo24305a(bVar, dVar, th);
                mo24307b(bVar, dVar, th);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: b */
            public final <T> void mo24307b(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
                super.mo24307b(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.mo35695b(C14912c.class);
                C14957a.m27543a("onUpdateFailed", updatePackage.toString(), th.getMessage());
                if (!updatePackage.getIsZstd() || updatePackage.getUpdateWithPatch() || !updatePackage.hasFallback()) {
                    String channel = updatePackage.getChannel();
                    AbstractC14933a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24051a(channel, th);
                        aVar.mo24057c(updatePackage, th);
                    }
                    List<AbstractC14933a> b = C14935c.m27507a().mo24059b(updatePackage.getAccessKey(), channel);
                    if (!(b == null || b.isEmpty())) {
                        for (AbstractC14933a aVar2 : b) {
                            aVar2.mo24051a(channel, th);
                            aVar2.mo24057c(updatePackage, th);
                        }
                        return;
                    }
                    return;
                }
                AbstractC14933a aVar3 = aVar;
                C14957a.m27543a("update failed with zstd, now use zip!", updatePackage.toString());
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(2);
                optionCheckUpdateParams.setListener(aVar3);
                GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
                if (d != null && C15020b.f36694b == null) {
                    C14905e.C14906a a = new C14905e.C14906a(d.getContext()).mo24005a(d.getAppId());
                    a.f36428j = d.getDeviceId();
                    a.f36419a = d.getNetWork();
                    a.f36424f = d.getStatisticMonitor();
                    a.f36429k = d.getHost();
                    C15020b.f36694b = a.mo24014b("gecko").mo24012a("gecko").mo24015b();
                }
                try {
                    C14948g.m27522a(C15020b.f36694b, optionCheckUpdateParams).mo35692a(Arrays.asList(updatePackage.fallbackInstance()));
                } catch (Exception e) {
                    C14957a.m27543a("update failed with zstd and zip!", e.getMessage());
                }
            }
        };
    }

    /* renamed from: b */
    public static AbstractC21932a m27643b(final AbstractC14933a aVar) {
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C1502614 */

            static {
                Covode.recordClassIndex(17189);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: c */
            public final <T> void mo24308c(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
                super.mo24308c(bVar, dVar);
                Pair pair = (Pair) bVar.mo35691a(C14928p.class);
                UpdatePackage updatePackage = (UpdatePackage) pair.first;
                String channel = updatePackage.getChannel();
                AbstractC14933a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24050a(channel, ((Long) pair.second).longValue());
                    aVar.mo24046a(updatePackage, ((Long) pair.second).longValue());
                }
                List<AbstractC14933a> b = C14935c.m27507a().mo24059b(updatePackage.getAccessKey(), channel);
                if (!(b == null || b.isEmpty())) {
                    for (AbstractC14933a aVar2 : b) {
                        aVar2.mo24050a(channel, ((Long) pair.second).longValue());
                        aVar2.mo24046a(updatePackage, ((Long) pair.second).longValue());
                    }
                }
            }
        };
    }

    /* renamed from: c */
    public static AbstractC21932a m27644c(final AbstractC14933a aVar) {
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C150272 */

            static {
                Covode.recordClassIndex(17190);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: b */
            public final <T> void mo24306b(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
                super.mo24306b(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.mo35695b(C14913d.class);
                AbstractC14933a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24054b(updatePackage);
                }
                C14935c.m27507a();
                List<AbstractC14933a> a = C14935c.m27508a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14933a aVar2 : a) {
                        aVar2.mo24054b(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: a */
            public final <T> void mo24305a(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
                super.mo24305a(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.mo35695b(C14913d.class);
                AbstractC14933a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24048a(updatePackage, th);
                }
                C14935c.m27507a();
                List<AbstractC14933a> a = C14935c.m27508a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14933a aVar2 : a) {
                        aVar2.mo24048a(updatePackage, th);
                    }
                }
            }
        };
    }

    /* renamed from: d */
    public static AbstractC21932a m27645d(final AbstractC14933a aVar) {
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C150283 */

            static {
                Covode.recordClassIndex(17191);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: a */
            public final <T> void mo24305a(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
                super.mo24305a(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.mo35695b(C14913d.class);
                AbstractC14933a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24048a(updatePackage, th);
                }
                C14935c.m27507a();
                List<AbstractC14933a> a = C14935c.m27508a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14933a aVar2 : a) {
                        aVar2.mo24048a(updatePackage, th);
                    }
                }
            }
        };
    }

    /* renamed from: e */
    public static AbstractC21932a m27646e(final AbstractC14933a aVar) {
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C150294 */

            static {
                Covode.recordClassIndex(17192);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: a */
            public final <T> void mo24304a(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
                super.mo24304a(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.mo35691a(C14913d.class);
                C14957a.m27543a("getRetryDownloadListener onStart", updatePackage.toString());
                AbstractC14933a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24045a(updatePackage);
                }
                C14935c.m27507a();
                List<AbstractC14933a> a = C14935c.m27508a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14933a aVar2 : a) {
                        aVar2.mo24045a(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: a */
            public final <T> void mo24305a(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
                if ((th instanceof C14899d) || (th instanceof C14900e)) {
                    super.mo24305a(bVar, dVar, th);
                    UpdatePackage updatePackage = (UpdatePackage) bVar.mo35691a(C14913d.class);
                    C14957a.m27543a("getRetryDownloadListener onException", updatePackage.toString(), th.getMessage());
                    AbstractC14933a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24055b(updatePackage, th);
                    }
                    if (!(updatePackage.getContent() == null || updatePackage.getContent().getStrategy() == null || updatePackage.getContent().getStrategy().getDeleteIfFail() != 1)) {
                        C14957a.m27543a("del_if_download_failed");
                        String accessKey = updatePackage.getAccessKey();
                        String channel = updatePackage.getChannel();
                        String str = C14930f.m27473a().f36475a.get(accessKey);
                        if (str != null) {
                            C14884b.m27326a(new File(new File(str, accessKey), channel));
                        }
                    }
                    C14935c.m27507a();
                    List<AbstractC14933a> a = C14935c.m27508a(updatePackage.getAccessKey(), updatePackage.getChannel());
                    if (!(a == null || a.isEmpty())) {
                        for (AbstractC14933a aVar2 : a) {
                            aVar2.mo24055b(updatePackage, th);
                        }
                    }
                }
            }
        };
    }

    /* renamed from: f */
    public static AbstractC21932a m27647f(final AbstractC14933a aVar) {
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C150305 */

            static {
                Covode.recordClassIndex(17193);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: b */
            public final <T> void mo24306b(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
                super.mo24306b(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.mo35691a(C14913d.class);
                C14957a.m27543a("downloadListener onEnd", updatePackage.toString());
                AbstractC14933a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24056c(updatePackage);
                }
                C14935c.m27507a();
                List<AbstractC14933a> a = C14935c.m27508a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14933a aVar2 : a) {
                        aVar2.mo24056c(updatePackage);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC21932a m27641a(final Class<? extends AbstractC21935d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>>> cls, final AbstractC14933a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC21932a() {
            /* class com.bytedance.geckox.statistic.C15020b.C150316 */

            static {
                Covode.recordClassIndex(17194);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: b */
            public final <T> void mo24306b(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
                super.mo24306b(bVar, dVar);
                Map<String, List<Pair<String, Long>>> map = (Map) bVar.mo35691a(cls);
                HashMap hashMap = new HashMap();
                for (UpdatePackage updatePackage : (List) bVar.mo35695b(cls)) {
                    String accessKey = updatePackage.getAccessKey();
                    List list = (List) hashMap.get(accessKey);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(updatePackage);
                    hashMap.put(accessKey, list);
                }
                aVar.mo24053a(map, hashMap);
            }

            @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
            /* renamed from: a */
            public final <T> void mo24305a(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
                super.mo24305a(bVar, dVar, th);
                Map<String, List<Pair<String, Long>>> map = (Map) bVar.mo35691a(cls);
                if (th instanceof C21930e) {
                    aVar.mo24043a(((C21930e) th).getCode(), map, th);
                } else {
                    aVar.mo24052a(map, th);
                }
            }
        };
    }

    /* renamed from: a */
    public static <T> C15042d m27639a(AbstractC21931b<T> bVar, boolean z) {
        UpdatePackage updatePackage = (UpdatePackage) bVar.mo35691a(C14927o.class);
        C15042d statisticModel = updatePackage.getStatisticModel();
        if (statisticModel == null) {
            statisticModel = new C15042d();
            statisticModel.f36744b = ((Integer) bVar.mo35693a("req_type")).intValue();
            statisticModel.f36745c = ((Integer) bVar.mo35693a("sync_task_id")).intValue();
            statisticModel.f36743a = ((Integer) bVar.mo35693a("update_priority")).intValue();
            statisticModel.f36757o = SystemClock.uptimeMillis();
            updatePackage.setStatisticModel(statisticModel);
            if (!z) {
                statisticModel.f36747e = true;
                C14957a.m27544b();
            }
        }
        return statisticModel;
    }

    /* renamed from: a */
    public static <T> void m27642a(AbstractC21931b<T> bVar, int i, Throwable th) {
        UpdatePackage updatePackage = (UpdatePackage) bVar.mo35691a(C14927o.class);
        C15042d a = m27639a((AbstractC21931b) bVar, false);
        a.f36750h = 0;
        a.f36752j = 0;
        a.f36753k = 0;
        a.f36754l = 0;
        a.f36755m = 0;
        a.f36756n = 0;
        C15042d.C15043a a2 = a.mo24324a(updatePackage, false);
        a2.f36765b = false;
        a2.f36766c = i;
        a2.f36767d = th.getMessage();
        if (updatePackage.isLastStep()) {
            a.f36746d = false;
            a.f36748f = SystemClock.uptimeMillis() - a.f36757o;
            C15035c.m27679a(updatePackage);
        }
    }
}
