package com.bytedance.geckox.policy.p1032v4;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.C14948g;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1026m.AbstractC14969a;
import com.bytedance.geckox.p1026m.C14972c;
import com.bytedance.geckox.policy.loop.C14993a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.utils.C15068o;
import com.bytedance.p1603q.AbstractC21931b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.v4.a */
public final class C15001a {

    /* renamed from: b */
    public static Map<String, Map<String, UpdateModel>> f36646b;

    /* renamed from: a */
    public C14905e f36647a;

    /* renamed from: c */
    public Map<String, List<GlobalConfigSettings.SyncItem>> f36648c;

    /* renamed from: d */
    private AtomicBoolean f36649d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17143);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.policy.v4.a$a */
    public class C15003a extends AbstractC14969a<List<GlobalConfigSettings.SyncItem>> {
        static {
            Covode.recordClassIndex(17145);
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: a */
        public final int mo24079a() {
            return 4;
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: b */
        public final void mo24080b() {
            Map<String, Object> map = this.f36562d;
            C15001a.this.mo24235a(6, (List) this.f36561c, map);
        }

        private C15003a() {
        }

        /* synthetic */ C15003a(C15001a aVar, byte b) {
            this();
        }
    }

    public C15001a(GeckoGlobalConfig geckoGlobalConfig) {
        C14905e.C14906a a = new C14905e.C14906a(geckoGlobalConfig.getContext()).mo24005a(geckoGlobalConfig.getAppId());
        a.f36428j = geckoGlobalConfig.getDeviceId();
        a.f36419a = geckoGlobalConfig.getNetWork();
        a.f36427i = geckoGlobalConfig.getAppVersion();
        a.f36424f = geckoGlobalConfig.getStatisticMonitor();
        a.f36429k = geckoGlobalConfig.getHost();
        this.f36647a = a.mo24014b("gecko").mo24012a("gecko").mo24015b();
    }

    /* renamed from: a */
    private void m27613a(List<GlobalConfigSettings.RequestConfig> list) {
        Map<String, Map<String, UpdateModel>> map;
        if (!(list == null || list.isEmpty() || (map = f36646b) == null)) {
            for (Map.Entry<String, Map<String, UpdateModel>> entry : map.entrySet()) {
                HashMap hashMap = new HashMap();
                Map<String, UpdateModel> value = entry.getValue();
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<GlobalConfigSettings.SyncItem> sync = list.get(size).getSync();
                    for (int size2 = sync.size() - 1; size2 >= 0; size2--) {
                        GlobalConfigSettings.SyncItem syncItem = sync.get(size2);
                        String accessKey = syncItem.getAccessKey();
                        UpdateModel updateModel = value.get(accessKey);
                        if (updateModel != null) {
                            if (updateModel.getGroups() == null && updateModel.getChannels() == null) {
                                GlobalConfigSettings.SyncItem syncItem2 = (GlobalConfigSettings.SyncItem) hashMap.get(accessKey);
                                if (syncItem2 == null) {
                                    hashMap.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, new ArrayList(syncItem.getGroup()), new ArrayList(syncItem.getTarget())));
                                } else {
                                    syncItem2.getTarget().addAll(syncItem.getTarget());
                                    syncItem2.getGroup().addAll(syncItem.getGroup());
                                }
                                sync.remove(size2);
                            } else {
                                List<String> group = syncItem.getGroup();
                                List<String> target = syncItem.getTarget();
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                if (updateModel.getGroups() != null && !updateModel.getGroups().isEmpty()) {
                                    for (String str : updateModel.getGroups()) {
                                        if (group.contains(str)) {
                                            arrayList.add(str);
                                            group.remove(str);
                                        }
                                    }
                                }
                                if (updateModel.getChannels() != null && !updateModel.getChannels().isEmpty()) {
                                    for (String str2 : updateModel.getChannels()) {
                                        if (target.contains(str2)) {
                                            arrayList2.add(str2);
                                            target.remove(str2);
                                        }
                                    }
                                }
                                if ((group == null || group.isEmpty()) && (target == null || target.isEmpty())) {
                                    sync.remove(size2);
                                }
                                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                                    GlobalConfigSettings.SyncItem syncItem3 = (GlobalConfigSettings.SyncItem) hashMap.get(accessKey);
                                    if (syncItem3 == null) {
                                        hashMap.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, arrayList, arrayList2));
                                    } else {
                                        syncItem3.getTarget().addAll(arrayList2);
                                        syncItem3.getGroup().addAll(arrayList);
                                    }
                                }
                            }
                        }
                    }
                    if (sync.isEmpty()) {
                        list.remove(size);
                    }
                }
                if (!hashMap.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        arrayList3.add(entry2.getValue());
                    }
                    if (this.f36648c == null) {
                        this.f36648c = new HashMap();
                    }
                    List<GlobalConfigSettings.SyncItem> list2 = this.f36648c.get(entry.getKey());
                    if (list2 != null) {
                        list2.addAll(arrayList3);
                        arrayList3 = list2;
                    }
                    this.f36648c.put(entry.getKey(), arrayList3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24236a(long j, GlobalConfigSettings.ReqMeta reqMeta) {
        boolean z;
        if (this.f36647a != null) {
            Object[] objArr = new Object[2];
            objArr[0] = "sync queue enable";
            if (reqMeta.getEnable() == 1) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            C14957a.m27543a(objArr);
            if (reqMeta.getEnable() != 0 && reqMeta.getQueue() != null && !reqMeta.getQueue().isEmpty() && !this.f36649d.get()) {
                List<GlobalConfigSettings.RequestConfig> queue = reqMeta.getQueue();
                this.f36649d.set(true);
                m27613a(queue);
                C14957a.m27543a("sync queue filter registered occasion", this.f36648c);
                C14957a.m27543a("sync queue after filter", queue);
                ArrayList arrayList = new ArrayList();
                long j2 = 1000;
                long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                int i = 0;
                int i2 = -1;
                while (i < queue.size()) {
                    GlobalConfigSettings.RequestConfig requestConfig = queue.get(i);
                    long delay = requestConfig.getDelay();
                    if (delay <= currentTimeMillis) {
                        arrayList.addAll(requestConfig.getSync());
                        i2 = i;
                        i = i2;
                    } else {
                        m27612a(0, (delay - currentTimeMillis) * j2, delay, delay, requestConfig.getSync());
                    }
                    i++;
                    j2 = 1000;
                }
                if (!arrayList.isEmpty()) {
                    m27612a(1, 0, currentTimeMillis, queue.get(i2).getDelay(), arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24235a(int i, List<GlobalConfigSettings.SyncItem> list, Map<String, Object> map) {
        long j;
        int i2;
        long j2 = -1;
        if (map != null) {
            if (map.get("bundle_launch_delay") != null) {
                j = ((Long) map.get("bundle_launch_delay")).longValue();
            } else {
                j = -1;
            }
            if (map.get("bundle_delay_in_queue") != null) {
                j2 = ((Long) map.get("bundle_delay_in_queue")).longValue();
            }
            if (map.get("bundle_is_merged") != null) {
                i2 = ((Integer) map.get("bundle_is_merged")).intValue();
            }
            i2 = 0;
        } else {
            j = -1;
            j2 = -1;
            i2 = 0;
        }
        C15068o.m27745a().mo24343b().execute(new Runnable(list, 1, i, j, j2, i2) {
            /* class com.bytedance.geckox.policy.p1032v4.C15001a.RunnableC150021 */

            /* renamed from: a */
            final /* synthetic */ List f36650a;

            /* renamed from: b */
            final /* synthetic */ int f36651b = 1;

            /* renamed from: c */
            final /* synthetic */ int f36652c;

            /* renamed from: d */
            final /* synthetic */ long f36653d;

            /* renamed from: e */
            final /* synthetic */ long f36654e;

            /* renamed from: f */
            final /* synthetic */ int f36655f;

            static {
                Covode.recordClassIndex(17144);
            }

            public final void run() {
                try {
                    C15001a aVar = C15001a.this;
                    List list = this.f36650a;
                    for (int size = list.size() - 1; size >= 0; size--) {
                        GlobalConfigSettings.SyncItem syncItem = (GlobalConfigSettings.SyncItem) list.get(size);
                        String accessKey = syncItem.getAccessKey();
                        if ((syncItem.getGroup() == null || !syncItem.getGroup().contains("on_demand")) && !C14930f.m27473a().f36475a.containsKey(accessKey) && !C14930f.m27473a().f36476b.containsKey(accessKey)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(syncItem);
                            if (aVar.f36648c == null) {
                                aVar.f36648c = new HashMap();
                            }
                            aVar.f36648c.put("occasion_gecko_register-".concat(String.valueOf(accessKey)), arrayList);
                            list.remove(size);
                        }
                    }
                    C14957a.m27543a("sync queue filter unregistered gecko", C15001a.this.f36648c);
                    AbstractC21931b<Object> a = C14948g.m27523a(C15001a.this.f36647a, this.f36650a, new OptionCheckUpdateParams().setChannelUpdatePriority(this.f36651b), new C14993a());
                    a.mo35694a("req_type", Integer.valueOf(this.f36652c));
                    a.mo35694a("delay_from_launch", Long.valueOf(this.f36653d));
                    a.mo35694a("delay_in_queue", Long.valueOf(this.f36654e));
                    a.mo35694a("is_merged", Integer.valueOf(this.f36655f));
                    C14957a.m27543a("sync queue execute check update,req type:" + this.f36652c, this.f36650a);
                    a.mo35692a((Object) null);
                } catch (Exception e) {
                    C14957a.m27543a("sync queue check update failed", e);
                } finally {
                    C15035c.m27677a();
                }
            }

            {
                this.f36650a = r3;
                this.f36652c = r5;
                this.f36653d = r6;
                this.f36654e = r8;
                this.f36655f = r10;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<com.bytedance.geckox.settings.model.GlobalConfigSettings$SyncItem> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m27612a(int i, long j, long j2, long j3, List<GlobalConfigSettings.SyncItem> list) {
        C15003a aVar = new C15003a(this, (byte) 0);
        aVar.f36561c = list;
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_is_merged", Integer.valueOf(i));
        hashMap.put("bundle_launch_delay", Long.valueOf(j2));
        hashMap.put("bundle_delay_in_queue", Long.valueOf(j3));
        aVar.f36562d = hashMap;
        C14972c.m27567a().mo24089a(aVar, j);
    }
}
