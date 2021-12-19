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
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1012b.C14874a;
import com.bytedance.geckox.p1016d.C14904b;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1024k.AbstractC14964b;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14966d;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.policy.p1030d.C14986a;
import com.bytedance.geckox.policy.p1030d.C14987b;
import com.bytedance.geckox.policy.p1030d.C14988c;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.statistic.model.C15039a;
import com.bytedance.geckox.utils.C15045b;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.bytedance.p1603q.AbstractC21936e;
import com.bytedance.p1603q.p1604a.C21926a;
import com.bytedance.p1603q.p1604a.C21927b;
import com.bytedance.p1603q.p1604a.C21928c;
import com.google.gson.p2019b.C27895a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.geckox.e.e */
public class C14914e extends AbstractC21935d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: a */
    private C14905e f36441a;

    /* renamed from: b */
    private Map<String, LoopRequestModel> f36442b;

    /* renamed from: j */
    private LoopInterval.EnumC15000a f36443j;

    /* renamed from: k */
    private AbstractC14933a f36444k;

    /* renamed from: l */
    private AbstractC21936e f36445l;

    /* renamed from: m */
    private C15039a f36446m = new C15039a();

    /* renamed from: n */
    private Map<String, String> f36447n;

    /* renamed from: o */
    private C14987b f36448o;

    /* renamed from: p */
    private int f36449p;

    static {
        Covode.recordClassIndex(17027);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        boolean z = false;
        this.f36441a = (C14905e) objArr[0];
        Map<String, LoopRequestModel> map = (Map) objArr[1];
        this.f36442b = map;
        this.f36443j = (LoopInterval.EnumC15000a) objArr[2];
        this.f36444k = (AbstractC14933a) objArr[3];
        this.f36445l = (AbstractC21936e) objArr[4];
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* class com.bytedance.geckox.utils.C15045b.C150483 */

            static {
                Covode.recordClassIndex(17216);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        for (String str : map.keySet()) {
            LoopRequestModel loopRequestModel = map.get(str);
            treeMap.put(str, C15045b.m27707b(loopRequestModel.getDeployment().getGroupName()) + "-" + C15045b.m27706a(loopRequestModel.getDeployment().getTargetChannels()));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : treeMap.keySet()) {
            stringBuffer.append(str2).append("-").append((String) treeMap.get(str2));
        }
        String stringBuffer2 = stringBuffer.toString();
        this.f36449p = ((Integer) this.f51922h.mo35693a("req_type")).intValue();
        this.f36447n = C14930f.m27473a().f36475a;
        C14987b bVar = new C14987b();
        if (this.f36449p == 2) {
            z = true;
        }
        bVar.f36612c = new C14988c(z, true, stringBuffer2, new C14907a(this.f36441a.f36404c, this.f51922h));
        bVar.f36611b = new C14986a(this.f36449p, this.f36446m);
        this.f36448o = bVar;
    }

    /* renamed from: b */
    private String m27439b(Map<String, List<Pair<String, Long>>> map) {
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
        this.f36446m.f36717a = C14904b.f36400a.f36401b.mo46674b(hashMap);
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (String str : this.f36442b.keySet()) {
            hashMap3.put(str, this.f36442b.get(str).getDeployment());
            HashMap hashMap5 = new HashMap();
            if (map2 != null && map2.get(str) != null && map2.get(str).get("business_version") != null) {
                hashMap5.put("business_version", map2.get(str).get("business_version").getValue());
            } else if (C14930f.m27473a().mo24033d() != null) {
                hashMap5.put("business_version", C14930f.m27473a().mo24033d().getAppVersion());
            } else {
                hashMap5.put("business_version", this.f36441a.f36411j);
            }
            if (this.f36442b.get(str).getCustom() != null) {
                hashMap5.putAll(this.f36442b.get(str).getCustom());
            }
            hashMap4.put(str, hashMap5);
        }
        this.f36446m.f36719c = C14904b.f36400a.f36401b.mo46674b(hashMap4);
        checkRequestBodyModel.setCustom(hashMap4);
        this.f36446m.f36718b = C14904b.f36400a.f36401b.mo46674b(hashMap3);
        C14957a.m27543a("start get server channel version, deploymentsInfo:" + this.f36446m.f36718b);
        checkRequestBodyModel.setDeployments(hashMap3);
        CheckRequestBodyModel.RequestMeta requestMeta = new CheckRequestBodyModel.RequestMeta(this.f36449p);
        LoopInterval.EnumC15000a aVar = this.f36443j;
        if (aVar != null) {
            requestMeta.setCombineLevel(aVar.name());
        }
        checkRequestBodyModel.setRequestMeta(requestMeta);
        return C14904b.f36400a.f36401b.mo46674b(checkRequestBodyModel);
    }

    /* renamed from: a */
    private List<UpdatePackage> m27438a(Map<String, List<Pair<String, Long>>> map) {
        String str;
        String str2;
        C14966d dVar;
        T t;
        Pair<String, String> requestTagHeader;
        int i = C14871a.m27298a().f36328g;
        if (i > 0) {
            str = "/gecko/server/v2/combine/check";
        } else {
            str = "/gecko/server/combine/check";
        }
        String str3 = "https://" + this.f36441a.f36413l + str;
        try {
            this.f36446m.f36723g = this.f36449p;
            C15039a aVar = this.f36446m;
            if (i > 0) {
                str2 = "combine_v2";
            } else {
                str2 = "combine_v1";
            }
            aVar.f36727k = str2;
            String b = m27439b(map);
            this.f36448o.mo24199a();
            AbstractC14965c cVar = this.f36441a.f36406e;
            GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
            if (d != null) {
                AbstractC14965c netWork = d.getNetWork();
                if (netWork instanceof AbstractC14964b) {
                    AbstractC14964b bVar = (AbstractC14964b) netWork;
                    GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = d.getRequestTagHeaderProvider();
                    HashMap hashMap = new HashMap();
                    if (!(requestTagHeaderProvider == null || (requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(true)) == null)) {
                        hashMap.put(requestTagHeader.first, requestTagHeader.second);
                    }
                    dVar = bVar.mo24083a();
                } else {
                    dVar = netWork.mo24081a(str3, b);
                }
            } else {
                dVar = cVar.mo24081a(str3, b);
            }
            this.f36446m.f36722f = dVar.f36556c;
            this.f36446m.f36720d = dVar.f36557d;
            this.f36446m.f36721e = C15039a.m27689a(dVar.f36554a);
            if (dVar.f36556c == 200) {
                this.f36448o.mo24200b();
                String str4 = dVar.f36555b;
                C14957a.m27543a("response,logId:", this.f36446m.f36721e);
                try {
                    Response response = (Response) C14904b.f36400a.f36401b.mo46671a(str4, new C27895a<Response<CombineComponentModel>>() {
                        /* class com.bytedance.geckox.p1017e.C14914e.C149151 */

                        static {
                            Covode.recordClassIndex(17028);
                        }
                    }.type);
                    if (!(this.f36445l == null || (t = response.data) == null)) {
                        this.f36445l.mo24206a(t.getGlobalConfig().getCheckUpdate());
                    }
                    if (response.status == 0) {
                        if (response.data != null) {
                            C14874a.m27316a(this.f36449p, response.data.getUniversalStrategies(), this.f36447n, this.f36444k);
                            List<UpdatePackage> packages = response.data.getPackages();
                            if (packages == null || packages.isEmpty()) {
                                return new ArrayList();
                            }
                            for (UpdatePackage updatePackage : packages) {
                                updatePackage.setLocalVersion(m27436a(map.get(updatePackage.getAccessKey()), updatePackage.getChannel()));
                                updatePackage.setLogId(this.f36446m.f36721e);
                                updatePackage.setApiVersion(this.f36446m.f36727k);
                            }
                            return packages;
                        }
                        this.f36446m.f36720d = "check update error：response.data==null";
                        C15035c.m27681a(this.f36446m);
                        throw new C21926a("check update error：response.data==null");
                    } else if (response.status == 2000) {
                        return new ArrayList();
                    } else {
                        String str5 = "check update error，unknown status code，response.status：" + response.status;
                        this.f36446m.f36720d = str5;
                        C15035c.m27681a(this.f36446m);
                        throw new C21926a(str5);
                    }
                } catch (Exception e) {
                    this.f36446m.f36720d = "json parse failed：" + e.getMessage();
                    C15035c.m27681a(this.f36446m);
                    throw new C21927b("json parse failed：" + str4 + " caused by:" + e.getMessage(), e);
                }
            } else {
                this.f36448o.mo24201c();
                throw new NetworkErrorException("net work get failed, code: " + dVar.f36556c + ", url:" + str3);
            }
        } catch (IOException e2) {
            this.f36448o.mo24201c();
            this.f36446m.f36720d = e2.getMessage();
            C15035c.m27681a(this.f36446m);
            throw e2;
        } catch (Exception e3) {
            C15035c.m27681a(this.f36446m);
            throw new C21928c("request failed：url:" + str3 + ", caused by:" + e3.getMessage(), e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo24020a(AbstractC21931b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) {
        this.f36449p = ((Integer) bVar.mo35693a("req_type")).intValue();
        List<UpdatePackage> a = m27438a(map);
        if (a == null) {
            return null;
        }
        C15035c.m27681a(this.f36446m);
        return bVar.mo35692a(a);
    }

    /* renamed from: a */
    private static long m27436a(List<Pair<String, Long>> list, String str) {
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
}
