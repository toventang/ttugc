package com.bytedance.geckox;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1017e.C14911b;
import com.bytedance.geckox.p1017e.C14912c;
import com.bytedance.geckox.p1017e.C14913d;
import com.bytedance.geckox.p1017e.C14916f;
import com.bytedance.geckox.p1017e.C14918g;
import com.bytedance.geckox.p1017e.C14919h;
import com.bytedance.geckox.p1017e.C14920i;
import com.bytedance.geckox.p1017e.C14921j;
import com.bytedance.geckox.p1017e.C14922k;
import com.bytedance.geckox.p1017e.C14923l;
import com.bytedance.geckox.p1017e.C14925m;
import com.bytedance.geckox.p1017e.C14926n;
import com.bytedance.geckox.p1017e.C14927o;
import com.bytedance.geckox.p1017e.C14928p;
import com.bytedance.geckox.p1017e.C14929q;
import com.bytedance.geckox.p1017e.p1018a.C14909a;
import com.bytedance.geckox.p1017e.p1018a.C14910b;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1019f.C14934b;
import com.bytedance.geckox.policy.p1032v4.model.V4DeploymentModel;
import com.bytedance.geckox.policy.p1032v4.model.V4RequestModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.statistic.C15020b;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21936e;
import com.bytedance.p1603q.AbstractC21946l;
import com.bytedance.p1603q.C21934c;
import com.bytedance.p1603q.C21939g;
import com.bytedance.p1603q.C21940h;
import com.bytedance.p1603q.p1605b.C21933b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.g */
public final class C14948g {
    static {
        Covode.recordClassIndex(17061);
    }

    /* renamed from: a */
    static void m27529a(Map<String, V4RequestModel> map, Map<String, CheckRequestParamModel> map2, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (!map2.isEmpty()) {
            Map<String, Map<String, Object>> customParam = optionCheckUpdateParams.getCustomParam();
            if (customParam == null) {
                customParam = new HashMap<>();
            }
            for (Map.Entry<String, CheckRequestParamModel> entry : map2.entrySet()) {
                String key = entry.getKey();
                CheckRequestParamModel value = entry.getValue();
                Map<String, Object> map3 = customParam.get(key);
                V4RequestModel v4RequestModel = new V4RequestModel(new HashMap(), new V4DeploymentModel());
                if (map3 != null) {
                    v4RequestModel.getCustom().putAll(map3);
                }
                map.put(key, v4RequestModel);
                List<CheckRequestBodyModel.TargetChannel> targetChannels = value.getTargetChannels();
                List<CheckRequestBodyModel.TargetChannel> targetChannels2 = v4RequestModel.getDeployment().getTargetChannels();
                if (targetChannels != null && !targetChannels.isEmpty()) {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : targetChannels) {
                        Iterator<CheckRequestBodyModel.TargetChannel> it = targetChannels2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().channelName.equals(targetChannel.channelName)) {
                                    break;
                                }
                            } else {
                                targetChannels2.add(targetChannel);
                                break;
                            }
                        }
                    }
                }
                List<V4DeploymentModel.C15005a> groupName = v4RequestModel.getDeployment().getGroupName();
                if (targetChannels2.isEmpty()) {
                    String group = value.getGroup();
                    if (!TextUtils.isEmpty(group) && !"default".equals(group)) {
                        Iterator<V4DeploymentModel.C15005a> it2 = groupName.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().f36665a.equals(group)) {
                                    break;
                                }
                            } else {
                                groupName.add(new V4DeploymentModel.C15005a(group));
                                break;
                            }
                        }
                    }
                    if (groupName.isEmpty()) {
                        throw new RuntimeException("group can not be default or empty!");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static List<C21940h> m27526a() {
        ArrayList arrayList = new ArrayList();
        C21940h.C21941a a = new C21940h.C21941a().mo35698a(C14918g.class);
        a.f51928b = C14934b.m27505a(C14918g.class);
        arrayList.add(a.mo35699a());
        return arrayList;
    }

    /* renamed from: a */
    public static AbstractC21931b<List<UpdatePackage>> m27522a(C14905e eVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        List<C21940h> a = m27526a();
        a.addAll(m27530b(eVar, optionCheckUpdateParams));
        return C21934c.m41249a(a);
    }

    /* renamed from: c */
    private static C21940h m27531c(C14905e eVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        AbstractC21946l.C21948b bVar = new AbstractC21946l.C21948b();
        bVar.mo35703a("patch").mo35701a(m27528a(eVar, optionCheckUpdateParams, true));
        bVar.mo35703a("full").mo35701a(m27528a(eVar, optionCheckUpdateParams, false));
        return bVar.mo35702a(C14913d.class);
    }

    /* renamed from: b */
    public static List<C21940h> m27530b(C14905e eVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        AbstractC14933a listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        C21940h.C21941a a = new C21940h.C21941a().mo35698a(C14923l.class);
        a.f51929c = new Object[]{eVar.f36403b, optionCheckUpdateParams};
        arrayList.add(a.mo35699a());
        C21940h.C21941a a2 = new C21940h.C21941a().mo35698a(C14925m.class);
        a2.f51929c = new Object[]{listener};
        arrayList.add(a2.mo35699a());
        AbstractC21946l.C21948b bVar = new AbstractC21946l.C21948b();
        bVar.f51940a = new C21933b(C15020b.m27640a(listener), C14934b.m27505a(C14912c.class));
        bVar.mo35703a("branch_zip").mo35700a(m27525a(eVar, optionCheckUpdateParams, 0)).mo35700a(new C21940h.C21941a().mo35698a(C21939g.class).mo35699a());
        bVar.mo35703a("branch_single_file").mo35700a(m27525a(eVar, optionCheckUpdateParams, 1)).mo35700a(new C21940h.C21941a().mo35698a(C21939g.class).mo35699a());
        bVar.mo35703a("branch_zstd").mo35700a(m27531c(eVar, optionCheckUpdateParams)).mo35700a(new C21940h.C21941a().mo35698a(C21939g.class).mo35699a());
        arrayList.add(bVar.mo35702a(C14912c.class));
        C21940h.C21941a a3 = new C21940h.C21941a().mo35698a(C14928p.class);
        a3.f51928b = new C21933b(C15020b.m27643b(listener), C14934b.m27505a(C14928p.class));
        arrayList.add(a3.mo35699a());
        return arrayList;
    }

    /* renamed from: a */
    private static C21940h m27525a(C14905e eVar, OptionCheckUpdateParams optionCheckUpdateParams, int i) {
        AbstractC21946l.C21948b bVar = new AbstractC21946l.C21948b();
        bVar.mo35703a("patch").mo35701a(m27527a(eVar, i, optionCheckUpdateParams, true));
        bVar.mo35703a("full").mo35701a(m27527a(eVar, i, optionCheckUpdateParams, false));
        return bVar.mo35702a(C14913d.class);
    }

    /* renamed from: a */
    private static List<C21940h> m27528a(C14905e eVar, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        AbstractC14933a listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        C21940h.C21941a a = new C21940h.C21941a().mo35698a(C14927o.class);
        a.f51929c = new Object[]{Boolean.valueOf(optionCheckUpdateParams.isEnableDownloadAutoRetry())};
        a.f51928b = new C21933b(C15020b.m27646e(listener), C14934b.m27505a(C14927o.class));
        arrayList.add(a.mo35699a());
        C21940h.C21941a a2 = new C21940h.C21941a().mo35698a(C14911b.class);
        a2.f51929c = new Object[]{eVar, listener};
        a2.f51928b = new C21933b(C15020b.m27647f(listener), C14934b.m27505a(C14911b.class));
        arrayList.add(a2.mo35699a());
        C21940h.C21941a a3 = new C21940h.C21941a().mo35698a(C14909a.class);
        a3.f51929c = new Object[]{eVar};
        a3.f51928b = new C21933b(C15020b.m27645d(listener), C14934b.m27505a(C14909a.class));
        arrayList.add(a3.mo35699a());
        if (z) {
            C21940h.C21941a a4 = new C21940h.C21941a().mo35698a(C14910b.class);
            a4.f51929c = new Object[0];
            a4.f51928b = new C21933b(C15020b.m27645d(listener), C14934b.m27505a(C14910b.class));
            arrayList.add(a4.mo35699a());
        } else {
            C21940h.C21941a a5 = new C21940h.C21941a().mo35698a(C14929q.class);
            a5.f51928b = new C21933b(C15020b.m27645d(listener), C14934b.m27505a(C14929q.class));
            arrayList.add(a5.mo35699a());
        }
        C21940h.C21941a a6 = new C21940h.C21941a().mo35698a(C14926n.class);
        a6.f51928b = new C21933b(C15020b.m27644c(listener), C14934b.m27505a(C14926n.class));
        arrayList.add(a6.mo35699a());
        return arrayList;
    }

    /* renamed from: a */
    public static AbstractC21931b<Object> m27523a(C14905e eVar, List<GlobalConfigSettings.SyncItem> list, OptionCheckUpdateParams optionCheckUpdateParams, AbstractC21936e eVar2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (GlobalConfigSettings.SyncItem syncItem : list) {
            String accessKey = syncItem.getAccessKey();
            ArrayList arrayList = new ArrayList();
            if (syncItem.getGroup() != null) {
                for (String str : syncItem.getGroup()) {
                    arrayList.add(new V4DeploymentModel.C15005a(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            if (syncItem.getTarget() != null) {
                for (String str2 : syncItem.getTarget()) {
                    arrayList2.add(new CheckRequestBodyModel.TargetChannel(str2));
                }
            }
            V4RequestModel v4RequestModel = new V4RequestModel(new HashMap(), new V4DeploymentModel(arrayList, arrayList2));
            concurrentHashMap.put(accessKey, v4RequestModel);
            Map<String, OptionCheckUpdateParams.CustomValue> map = C14930f.m27473a().f36476b.get(accessKey);
            if (map != null && !map.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, OptionCheckUpdateParams.CustomValue> entry : map.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue().getValue());
                }
                v4RequestModel.getCustom().putAll(hashMap);
            }
        }
        return m27524a(eVar, concurrentHashMap, optionCheckUpdateParams, eVar2);
    }

    /* renamed from: a */
    public static AbstractC21931b<Object> m27524a(C14905e eVar, Map<String, V4RequestModel> map, OptionCheckUpdateParams optionCheckUpdateParams, AbstractC21936e eVar2) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        AbstractC14933a listener = optionCheckUpdateParams.getListener();
        List<C21940h> a = m27526a();
        C21940h.C21941a a2 = new C21940h.C21941a().mo35698a(C14920i.class);
        a2.f51929c = new Object[]{Boolean.valueOf(optionCheckUpdateParams.getInnerRequestByUser())};
        a.add(a2.mo35699a());
        C21940h.C21941a a3 = new C21940h.C21941a().mo35698a(C14916f.class);
        a3.f51929c = new Object[]{eVar, map, listener, optionCheckUpdateParams, eVar2};
        a3.f51928b = new C21933b(C15020b.m27641a(C14916f.class, listener), C14934b.m27505a(C14916f.class));
        a.add(a3.mo35699a());
        if (!optionCheckUpdateParams.getInnerRequestByUser()) {
            a.add(new C21940h.C21941a().mo35698a(C14919h.class).mo35699a());
        }
        a.add(new C21940h.C21941a().mo35698a(C14922k.class).mo35699a());
        a.addAll(m27530b(eVar, optionCheckUpdateParams));
        return C21934c.m41249a(a);
    }

    /* renamed from: a */
    private static List<C21940h> m27527a(C14905e eVar, int i, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        AbstractC14933a listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        C21940h.C21941a a = new C21940h.C21941a().mo35698a(C14927o.class);
        a.f51929c = new Object[]{Boolean.valueOf(optionCheckUpdateParams.isEnableDownloadAutoRetry())};
        a.f51928b = new C21933b(C15020b.m27646e(listener), C14934b.m27505a(C14927o.class));
        arrayList.add(a.mo35699a());
        C21940h.C21941a a2 = new C21940h.C21941a().mo35698a(C14911b.class);
        a2.f51929c = new Object[]{eVar, listener};
        a2.f51928b = new C21933b(C15020b.m27647f(listener), C14934b.m27505a(C14911b.class));
        arrayList.add(a2.mo35699a());
        if (z) {
            C21940h.C21941a a3 = new C21940h.C21941a().mo35698a(C14921j.class);
            a3.f51929c = new Object[]{eVar};
            a3.f51928b = new C21933b(C15020b.m27645d(listener), C14934b.m27505a(C14921j.class));
            arrayList.add(a3.mo35699a());
        }
        if (i == 0) {
            C21940h.C21941a a4 = new C21940h.C21941a().mo35698a(C14929q.class);
            a4.f51928b = new C21933b(C15020b.m27645d(listener), C14934b.m27505a(C14929q.class));
            arrayList.add(a4.mo35699a());
        }
        C21940h.C21941a a5 = new C21940h.C21941a().mo35698a(C14926n.class);
        a5.f51928b = new C21933b(C15020b.m27644c(listener), C14934b.m27505a(C14926n.class));
        arrayList.add(a5.mo35699a());
        return arrayList;
    }
}
