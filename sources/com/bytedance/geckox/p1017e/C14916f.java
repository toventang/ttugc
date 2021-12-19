package com.bytedance.geckox.p1017e;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14871a;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CombineComponentModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1012b.C14874a;
import com.bytedance.geckox.p1016d.C14904b;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1024k.AbstractC14964b;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14966d;
import com.bytedance.geckox.policy.p1030d.C14986a;
import com.bytedance.geckox.policy.p1030d.C14987b;
import com.bytedance.geckox.policy.p1030d.C14988c;
import com.bytedance.geckox.policy.p1030d.C14991d;
import com.bytedance.geckox.policy.p1032v4.model.V4RequestModel;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.statistic.model.C15039a;
import com.bytedance.geckox.utils.C15044a;
import com.bytedance.geckox.utils.C15045b;
import com.bytedance.geckox.utils.C15062l;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.bytedance.p1603q.AbstractC21936e;
import com.bytedance.p1603q.p1604a.C21926a;
import com.bytedance.p1603q.p1604a.C21927b;
import com.bytedance.p1603q.p1604a.C21928c;
import com.bytedance.p1603q.p1604a.C21930e;
import com.google.gson.p2019b.C27895a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.geckox.e.f */
public class C14916f extends AbstractC21935d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: a */
    private C14905e f36451a;

    /* renamed from: b */
    private Map<String, V4RequestModel> f36452b;

    /* renamed from: j */
    private AbstractC14933a f36453j;

    /* renamed from: k */
    private OptionCheckUpdateParams f36454k;

    /* renamed from: l */
    private AbstractC21936e f36455l;

    /* renamed from: m */
    private C15039a f36456m = new C15039a();

    /* renamed from: n */
    private Map<String, String> f36457n;

    /* renamed from: o */
    private C14987b f36458o;

    /* renamed from: p */
    private int f36459p;

    static {
        Covode.recordClassIndex(17029);
    }

    /* renamed from: a */
    private void m27445a() {
        Map<String, V4RequestModel> map = this.f36452b;
        if (!(map == null || this.f36453j == null)) {
            for (Map.Entry<String, V4RequestModel> entry : map.entrySet()) {
                String key = entry.getKey();
                V4RequestModel value = entry.getValue();
                if (value.getDeployment() != null) {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : value.getDeployment().getTargetChannels()) {
                        String str = targetChannel.channelName;
                        Long b = C15062l.m27736b(this.f36451a.f36416o, key, str);
                        if (b != null) {
                            String a = C15062l.m27733a(this.f36451a.f36416o, key, str, b.longValue());
                            LocalPackageModel localPackageModel = new LocalPackageModel(key, str);
                            localPackageModel.setChannelPath(a);
                            localPackageModel.setLatestVersion(b.longValue());
                            this.f36453j.mo24044a(localPackageModel);
                        } else {
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }

    /* renamed from: b */
    private String m27446b(Map<String, List<Pair<String, Long>>> map) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        checkRequestBodyModel.setCommon(C14930f.m27473a().mo24032c());
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = C14930f.m27473a().f36476b;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        this.f36456m.f36717a = C14904b.f36400a.f36401b.mo46674b(hashMap);
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (String str : this.f36452b.keySet()) {
            hashMap3.put(str, this.f36452b.get(str).getDeployment());
            HashMap hashMap5 = new HashMap();
            if (map2 != null && map2.get(str) != null && map2.get(str).get("business_version") != null) {
                hashMap5.put("business_version", map2.get(str).get("business_version").getValue());
            } else if (C14930f.m27473a().mo24033d() != null) {
                hashMap5.put("business_version", C14930f.m27473a().mo24033d().getAppVersion());
            } else {
                hashMap5.put("business_version", this.f36451a.f36411j);
            }
            if (this.f36452b.get(str).getCustom() != null) {
                hashMap5.putAll(this.f36452b.get(str).getCustom());
            }
            hashMap4.put(str, hashMap5);
        }
        this.f36456m.f36718b = C14904b.f36400a.f36401b.mo46674b(hashMap3);
        C14957a.m27543a("start get server channel version, deploymentsInfo:" + this.f36456m.f36718b);
        checkRequestBodyModel.setDeployments(hashMap3);
        checkRequestBodyModel.setCustom(hashMap4);
        checkRequestBodyModel.setRequestMeta(new CheckRequestBodyModel.RequestMeta(this.f36459p));
        return C14904b.f36400a.f36401b.mo46674b(checkRequestBodyModel);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        boolean z = false;
        this.f36451a = (C14905e) objArr[0];
        this.f36452b = (Map) objArr[1];
        this.f36453j = (AbstractC14933a) objArr[2];
        this.f36454k = (OptionCheckUpdateParams) objArr[3];
        this.f36455l = (AbstractC21936e) objArr[4];
        this.f36459p = ((Integer) this.f51922h.mo35693a("req_type")).intValue();
        Map<String, V4RequestModel> map = this.f36452b;
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* class com.bytedance.geckox.utils.C15045b.C150494 */

            static {
                Covode.recordClassIndex(17217);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        for (String str : map.keySet()) {
            V4RequestModel v4RequestModel = map.get(str);
            treeMap.put(str, C15045b.m27708c(v4RequestModel.getDeployment().getGroupName()) + "-" + C15045b.m27706a(v4RequestModel.getDeployment().getTargetChannels()));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : treeMap.keySet()) {
            stringBuffer.append(str2).append("-").append((String) treeMap.get(str2));
        }
        String stringBuffer2 = stringBuffer.toString();
        this.f36457n = C14930f.m27473a().f36475a;
        C14987b bVar = new C14987b();
        bVar.f36611b = new C14986a(this.f36459p, this.f36456m);
        if (this.f36459p == 2) {
            z = true;
        }
        bVar.f36612c = new C14988c(z, this.f36454k.isEnableRetry(), stringBuffer2, new C14907a(this.f36451a.f36404c, this.f51922h));
        this.f36458o = bVar;
        if (this.f36454k.getInnerRequestByUser()) {
            this.f36458o.f36610a = new C14991d(this.f36454k.isEnableThrottle(), stringBuffer2, this.f36456m);
        }
    }

    /* renamed from: a */
    private List<UpdatePackage> m27444a(Map<String, List<Pair<String, Long>>> map) {
        String str;
        String str2;
        C14966d dVar;
        T t;
        boolean z;
        int i = C14871a.m27298a().f36328g;
        if (i > 0) {
            str = "/gecko/server/v5/package";
        } else {
            str = "/gecko/server/v4/package";
        }
        String str3 = "https://" + this.f36451a.f36413l + str;
        try {
            this.f36456m.f36723g = this.f36459p;
            C15039a aVar = this.f36456m;
            if (i > 0) {
                str2 = "update_v5";
            } else {
                str2 = "update_v4";
            }
            aVar.f36727k = str2;
            int i2 = C14871a.m27298a().f36327f;
            if (i2 <= 0 || ((float) i2) <= C15044a.m27702a()) {
                String b = m27446b(map);
                this.f36458o.mo24199a();
                AbstractC14965c cVar = this.f36451a.f36406e;
                GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
                if (d != null) {
                    AbstractC14965c netWork = d.getNetWork();
                    if (netWork instanceof AbstractC14964b) {
                        AbstractC14964b bVar = (AbstractC14964b) netWork;
                        GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = d.getRequestTagHeaderProvider();
                        HashMap hashMap = new HashMap();
                        if (requestTagHeaderProvider != null) {
                            if (!this.f36454k.getInnerRequestByUser()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Pair<String, String> requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(z);
                            if (requestTagHeader != null) {
                                hashMap.put(requestTagHeader.first, requestTagHeader.second);
                            }
                        }
                        dVar = bVar.mo24083a();
                    } else {
                        dVar = netWork.mo24081a(str3, b);
                    }
                } else {
                    dVar = cVar.mo24081a(str3, b);
                }
                this.f36456m.f36722f = dVar.f36556c;
                this.f36456m.f36720d = dVar.f36557d;
                this.f36456m.f36721e = C15039a.m27689a(dVar.f36554a);
                if (dVar.f36556c == 200) {
                    this.f36458o.mo24200b();
                    String str4 = dVar.f36555b;
                    C14957a.m27543a("response,logId:", this.f36456m.f36721e);
                    try {
                        Response response = (Response) C14904b.f36400a.f36401b.mo46671a(str4, new C27895a<Response<CombineComponentModel>>() {
                            /* class com.bytedance.geckox.p1017e.C14916f.C149171 */

                            static {
                                Covode.recordClassIndex(17030);
                            }
                        }.type);
                        if (!(this.f36455l == null || (t = response.data) == null)) {
                            this.f36455l.mo24206a(t.getGlobalConfig().getCheckUpdate());
                        }
                        if (response.status == 0) {
                            if (response.data != null) {
                                C14874a.m27316a(this.f36459p, response.data.getUniversalStrategies(), this.f36457n, this.f36453j);
                                List<UpdatePackage> packages = response.data.getPackages();
                                if (packages == null || packages.isEmpty()) {
                                    m27445a();
                                    return new ArrayList();
                                }
                                for (UpdatePackage updatePackage : packages) {
                                    updatePackage.setLocalVersion(m27442a(map.get(updatePackage.getAccessKey()), updatePackage.getChannel()));
                                    updatePackage.setLogId(this.f36456m.f36721e);
                                    updatePackage.setApiVersion(this.f36456m.f36727k);
                                }
                                return packages;
                            }
                            this.f36456m.f36720d = "check update error：response.data==null";
                            C15035c.m27681a(this.f36456m);
                            throw new C21926a("check update error：response.data==null");
                        } else if (response.status == 2000) {
                            m27445a();
                            return new ArrayList();
                        } else {
                            String str5 = "check update error，unknown status code，response.status：" + response.status;
                            this.f36456m.f36720d = str5;
                            C15035c.m27681a(this.f36456m);
                            throw new C21926a(str5);
                        }
                    } catch (Exception e) {
                        this.f36456m.f36720d = "json parse failed：" + e.getMessage();
                        C15035c.m27681a(this.f36456m);
                        throw new C21927b("json parse failed：" + str4 + " caused by:" + e.getMessage(), e);
                    }
                } else {
                    this.f36458o.mo24201c();
                    throw new NetworkErrorException("net work get failed, code: " + dVar.f36556c + ", url:" + str3);
                }
            } else {
                throw new C21930e(800, "cancel request, not available storage", new Throwable("cancel request, not available storage"));
            }
        } catch (IOException e2) {
            this.f36458o.mo24201c();
            this.f36456m.f36720d = e2.getMessage();
            C15035c.m27681a(this.f36456m);
            throw e2;
        } catch (C21930e e3) {
            C15035c.m27681a(this.f36456m);
            throw e3;
        } catch (C21928c e4) {
            C15035c.m27681a(this.f36456m);
            throw e4;
        } catch (Exception e5) {
            C15035c.m27681a(this.f36456m);
            throw new C21928c("request failed：url:" + str3 + ", caused by:" + e5.getMessage(), e5);
        }
    }

    /* renamed from: a */
    private static long m27442a(List<Pair<String, Long>> list, String str) {
        if (list == null) {
            return 0;
        }
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo24020a(AbstractC21931b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) {
        Object a = bVar.mo35693a("delay_from_launch");
        if (a != null) {
            long longValue = ((Long) a).longValue();
            if (longValue != -1) {
                this.f36456m.f36728l = longValue;
            }
        }
        Object a2 = bVar.mo35693a("delay_in_queue");
        if (a2 != null) {
            this.f36456m.f36729m = ((Long) a2).longValue();
        }
        Object a3 = bVar.mo35693a("is_merged");
        if (a3 != null) {
            this.f36456m.f36730n = ((Integer) a3).intValue();
        }
        List<UpdatePackage> a4 = m27444a(map);
        if (a4 == null) {
            return null;
        }
        C15035c.m27681a(this.f36456m);
        return bVar.mo35692a(a4);
    }
}
