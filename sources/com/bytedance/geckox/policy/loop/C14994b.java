package com.bytedance.geckox.policy.loop;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.loop.b */
public class C14994b {

    /* renamed from: d */
    private static C14994b f36628d;

    /* renamed from: a */
    public C14905e f36629a;

    /* renamed from: b */
    private Map<String, C14995c> f36630b = new ConcurrentHashMap();

    /* renamed from: c */
    private Map<String, Integer> f36631c = new ConcurrentHashMap();

    /* renamed from: e */
    private AtomicBoolean f36632e = new AtomicBoolean(true);

    static {
        Covode.recordClassIndex(17131);
    }

    /* renamed from: a */
    public static C14994b m27595a() {
        MethodCollector.m26663i(4285);
        if (f36628d == null) {
            synchronized (C14994b.class) {
                try {
                    if (f36628d == null) {
                        f36628d = new C14994b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4285);
                    throw th;
                }
            }
        }
        C14994b bVar = f36628d;
        MethodCollector.m26664o(4285);
        return bVar;
    }

    /* renamed from: b */
    public final void mo24210b() {
        C14957a.m27543a("loop stop");
        for (String str : this.f36630b.keySet()) {
            C14995c cVar = this.f36630b.get(str);
            if (cVar != null) {
                cVar.mo24216b();
            }
        }
    }

    private C14994b() {
        this.f36631c.put(LoopInterval.EnumC15000a.lv_1.name(), 600);
        this.f36631c.put(LoopInterval.EnumC15000a.lv_2.name(), 1200);
        this.f36631c.put(LoopInterval.EnumC15000a.lv_3.name(), 1800);
    }

    /* renamed from: a */
    private C14995c m27596a(OptionCheckUpdateParams optionCheckUpdateParams) {
        LoopInterval.EnumC15000a loopLevel = optionCheckUpdateParams.getLoopLevel();
        if (loopLevel == null) {
            return null;
        }
        String name = loopLevel.name();
        if (this.f36630b.get(name) != null) {
            return this.f36630b.get(name);
        }
        C14995c cVar = new C14995c(name, this.f36631c.get(name).intValue());
        cVar.f36635c = new C14998d(this.f36629a, loopLevel);
        this.f36630b.put(loopLevel.name(), cVar);
        return cVar;
    }

    /* renamed from: b */
    public final synchronized void mo24211b(Map<String, LoopInterval> map) {
        MethodCollector.m26663i(4406);
        if (map == null) {
            MethodCollector.m26664o(4406);
            return;
        }
        C14957a.m27543a("loop interval update", map);
        for (String str : map.keySet()) {
            C14995c cVar = this.f36630b.get(str);
            LoopInterval loopInterval = map.get(str);
            if (!(cVar == null || loopInterval == null)) {
                cVar.mo24213a(loopInterval.getInterval());
                this.f36631c.put(str, Integer.valueOf(loopInterval.getInterval()));
            }
        }
        MethodCollector.m26664o(4406);
    }

    /* renamed from: a */
    public final void mo24208a(Map<String, GlobalConfigSettings.GeckoPollingConfig> map) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, GlobalConfigSettings.GeckoPollingConfig> entry : map.entrySet()) {
                String key = entry.getKey();
                int interval = entry.getValue().getInterval();
                C14995c cVar = this.f36630b.get(key);
                if (cVar == null) {
                    cVar = new C14995c(key, this.f36631c.get(key).intValue());
                    cVar.f36635c = new C14998d(this.f36629a, LoopInterval.EnumC15000a.valueOf(key));
                    this.f36630b.put(key, cVar);
                }
                this.f36631c.put(key, Integer.valueOf(interval));
                cVar.mo24215a(entry.getValue().getCombine());
                if (this.f36632e.get()) {
                    cVar.mo24213a(interval);
                    cVar.mo24212a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24209a(boolean z) {
        C14957a.m27543a("loop enable update", Boolean.valueOf(z));
        this.f36632e.set(z);
        if (!z) {
            mo24210b();
        }
    }

    /* renamed from: a */
    public final void mo24207a(String str, List<String> list, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, OptionCheckUpdateParams optionCheckUpdateParams) {
        C14995c a = m27596a(optionCheckUpdateParams);
        if (a != null) {
            a.mo24214a(str, list, map, optionCheckUpdateParams.getCustomParam());
            if (this.f36632e.get()) {
                a.mo24212a();
            }
        }
    }
}
