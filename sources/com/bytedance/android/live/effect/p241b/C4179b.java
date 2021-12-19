package com.bytedance.android.live.effect.p241b;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4150c;
import com.bytedance.android.live.effect.api.p240a.AbstractC4151d;
import com.bytedance.android.live.effect.api.p240a.AbstractC4155h;
import com.bytedance.android.live.effect.api.p240a.C4148a;
import com.bytedance.android.live.effect.api.p240a.C4163l;
import com.bytedance.android.live.effect.p245f.C4277a;
import com.bytedance.android.live.effect.p245f.C4282d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableEffectNewEngineSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.effect.b.b */
public class C4179b implements AbstractC4155h {

    /* renamed from: o */
    private static volatile C4179b f11615o;

    /* renamed from: a */
    private C4163l f11616a;

    /* renamed from: b */
    private boolean f11617b;

    /* renamed from: c */
    private String f11618c;

    /* renamed from: d */
    private String f11619d;

    /* renamed from: e */
    private final Map<String, Map<String, C11672a>> f11620e = new HashMap();

    /* renamed from: f */
    private final Map<C11672a, Map<String, Float>> f11621f = new HashMap();

    /* renamed from: g */
    private final List<C11672a> f11622g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC4151d> f11623h = new ArrayList();

    /* renamed from: i */
    private final List<AbstractC4150c> f11624i = new ArrayList();

    /* renamed from: j */
    private final Map<String, List<String>> f11625j = new HashMap();

    /* renamed from: k */
    private final Map<String, List<String>> f11626k = AbstractC6804a.f16942ar.mo13066a();

    /* renamed from: l */
    private final Map<String, Map<String, Float>> f11627l = new HashMap();

    /* renamed from: m */
    private final Map<String, Map<String, Float>> f11628m = AbstractC6804a.f16943as.mo13066a();

    /* renamed from: n */
    private final Map<String, Integer> f11629n = new HashMap();

    static {
        Covode.recordClassIndex(4749);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final Map<String, Map<String, C11672a>> mo9841a() {
        return this.f11620e;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: d */
    public final String mo9853d() {
        return this.f11618c;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: e */
    public final String mo9855e() {
        return this.f11619d;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9843a(AbstractC4151d dVar) {
        if (dVar != null && !this.f11623h.contains(dVar)) {
            this.f11623h.add(dVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e, com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: a */
    public final void mo9846a(String str, C11672a aVar) {
        if (!(aVar == null || this.f11616a == null)) {
            if (!this.f11620e.containsKey(str)) {
                this.f11620e.put(str, new HashMap());
            }
            Map<String, C11672a> map = this.f11620e.get(str);
            if (map.containsKey(aVar.f27899g)) {
                map.get(aVar.f27899g).f27908p.addAll(aVar.f27908p);
                return;
            }
            map.put(aVar.f27899g, aVar);
            if (this.f11616a.f11594b.contains(str) && this.f11616a != null) {
                if (!this.f11625j.containsKey(str)) {
                    this.f11625j.put(str, new ArrayList());
                }
                if (!this.f11625j.get(str).contains(aVar.f27899g) && !C13627m.m24498a(aVar.f27899g) && this.f11616a.f11594b.contains(str)) {
                    this.f11625j.get(str).add(aVar.f27899g);
                }
            }
            m10201a(false);
            for (AbstractC4151d dVar : this.f11623h) {
                dVar.mo8787a(true, str, aVar);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e, com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: a */
    public final void mo9845a(String str) {
        if (this.f11620e.containsKey(str) && this.f11620e.get(str).size() > 0) {
            for (C11672a aVar : this.f11620e.get(str).values()) {
                if (this.f11625j.containsKey(str) && aVar != null && !C13627m.m24498a(aVar.f27899g)) {
                    this.f11625j.get(str).remove(aVar.f27899g);
                }
            }
            this.f11620e.remove(str);
            m10201a(false);
            for (AbstractC4151d dVar : this.f11623h) {
                dVar.mo8787a(false, str, null);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: a */
    public final void mo9856a(EffectChannelResponse effectChannelResponse) {
        Map<String, List<String>> map;
        if (this.f11616a != null) {
            String panel = effectChannelResponse.getPanel();
            if (this.f11616a.f11594b.contains(panel) && (map = this.f11626k) != null && !map.isEmpty() && this.f11626k.containsKey(panel)) {
                List<String> list = this.f11626k.get(panel);
                for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                    if (effect != null) {
                        if (effect.getEffectType() != 1 || C13603b.m24435a((Collection) effect.getChildEffects())) {
                            m10199a(effect, panel, list);
                        } else {
                            for (int i = 0; i < effect.getChildEffects().size(); i++) {
                                Effect effect2 = effect.getChildEffects().get(i);
                                if (!(list == null || effect2 == null || !list.contains(effect2.getUnzipPath()))) {
                                    this.f11629n.put(effect.getEffectId(), Integer.valueOf(i));
                                }
                                m10199a(effect2, panel, list);
                            }
                        }
                    }
                }
                this.f11626k.remove(panel);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: a */
    public final void mo9857a(String str, float f) {
        String str2;
        if (this.f11616a != null) {
            for (C11672a aVar : this.f11622g) {
                if (!C13617h.m24465a(aVar.f27908p) && aVar.f27908p.contains(str)) {
                    if (!this.f11621f.containsKey(aVar) || !this.f11621f.get(aVar).containsKey(str) || !this.f11621f.get(aVar).get(str).equals(Float.valueOf(f))) {
                        C3854a.m9453a(3, "LiveComposerManager", "updateTagValue path:" + aVar.f27899g + " tag:" + str + " value:" + f + " return:" + this.f11616a.f11595c.mo9079a(aVar.f27899g, str, f));
                        C11672a aVar2 = null;
                        Iterator<C11672a> it = this.f11621f.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C11672a next = it.next();
                                if (next.f27899g.equals(aVar.f27899g) && next.f27908p.contains(str)) {
                                    aVar2 = next;
                                    Map<String, Float> map = this.f11621f.get(aVar2);
                                    if (map != null) {
                                        map.put(str, Float.valueOf(f));
                                    }
                                }
                            } else {
                                this.f11621f.put(aVar, new HashMap());
                                Map<String, Float> map2 = this.f11621f.get(aVar);
                                if (map2 != null) {
                                    map2.put(str, Float.valueOf(f));
                                }
                            }
                        }
                        Iterator<String> it2 = this.f11620e.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                str2 = "";
                                break;
                            }
                            str2 = it2.next();
                            if (this.f11620e.get(str2).containsValue(aVar2 != null ? aVar2 : aVar)) {
                                break;
                            }
                        }
                        m10200a(str2, aVar, str, f);
                        if (!this.f11624i.isEmpty()) {
                            Iterator<AbstractC4150c> it3 = this.f11624i.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public static C4179b m10204f() {
        MethodCollector.m26663i(7258);
        if (f11615o == null) {
            synchronized (C4179b.class) {
                try {
                    if (f11615o == null) {
                        f11615o = new C4179b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7258);
                    throw th;
                }
            }
        }
        C4179b bVar = f11615o;
        MethodCollector.m26664o(7258);
        return bVar;
    }

    private C4179b() {
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final void mo9848b() {
        if (!this.f11626k.isEmpty()) {
            this.f11625j.putAll(this.f11626k);
        }
        this.f11617b = true;
        C6806c.m14603a(AbstractC6804a.f16942ar, this.f11625j);
        C6806c.m14603a(AbstractC6804a.f16943as, this.f11627l);
        C4163l lVar = this.f11616a;
        if (!(lVar == null || lVar.f11595c == null)) {
            try {
                this.f11616a.f11595c.mo9083a(new String[0]);
                this.f11616a.f11595c.mo9078a();
            } catch (Throwable th) {
                C3854a.m9458a("LiveComposerManager", th);
            }
        }
        this.f11626k.clear();
        this.f11626k.putAll(this.f11625j);
        this.f11628m.clear();
        this.f11628m.putAll(this.f11627l);
        this.f11620e.clear();
        this.f11623h.clear();
        this.f11624i.clear();
        this.f11625j.clear();
        this.f11622g.clear();
        this.f11621f.clear();
        this.f11627l.clear();
        this.f11616a = null;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: c */
    public final void mo9851c() {
        m10201a(true);
        for (Map map : new HashMap(this.f11621f).values()) {
            if (!(map == null || map.size() == 0)) {
                for (String str : map.keySet()) {
                    if (map.get(str) != null) {
                        float floatValue = ((Float) map.get(str)).floatValue();
                        for (C11672a aVar : this.f11622g) {
                            if (!C13617h.m24465a(aVar.f27908p) && aVar.f27908p.contains(str)) {
                                m10198a(aVar, str, floatValue);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: c */
    public final void mo9852c(String str) {
        this.f11618c = str;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e, com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: a */
    public final void mo9844a(C4163l lVar) {
        this.f11616a = lVar;
        this.f11617b = true;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: d */
    public final void mo9854d(String str) {
        this.f11619d = str;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final void mo9849b(AbstractC4150c cVar) {
        if (cVar != null) {
            this.f11624i.remove(cVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e, com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: b */
    public final List<C11672a> mo9847b(String str) {
        if (this.f11620e.containsKey(str)) {
            return new ArrayList(this.f11620e.get(str).values());
        }
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9842a(AbstractC4150c cVar) {
        if (cVar != null && !this.f11624i.contains(cVar)) {
            this.f11624i.add(cVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final void mo9850b(AbstractC4151d dVar) {
        if (dVar != null) {
            this.f11623h.remove(dVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4155h
    /* renamed from: e */
    public final Float mo9858e(String str) {
        for (Map<String, Float> map : this.f11621f.values()) {
            if (map != null && map.containsKey(str)) {
                return map.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m10201a(boolean z) {
        if (this.f11616a != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C4148a aVar : this.f11616a.f11593a) {
                if (m10202a(arrayList2, aVar) || (this.f11620e.containsKey(aVar.f11590b) && m10203a(arrayList2, aVar.f11589a))) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(aVar.f11589a);
                    } else {
                        arrayList2.retainAll(aVar.f11589a);
                    }
                    if (this.f11616a.f11596d.contains(aVar.f11590b)) {
                        z2 = true;
                    }
                    arrayList.addAll(this.f11620e.get(aVar.f11590b).values());
                }
            }
            if (z || !this.f11622g.containsAll(arrayList) || !arrayList.containsAll(this.f11622g)) {
                this.f11622g.clear();
                this.f11622g.addAll(arrayList);
                if (this.f11617b) {
                    C3854a.m9453a(3, "LiveComposerManager", "show sticker: " + ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getLiveComposerFilePath() + " return: " + this.f11616a.f11595c.mo9081a(((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getLiveComposerFilePath(), z2));
                    this.f11617b = false;
                }
                this.f11616a.f11595c.mo9082a(z2);
                String[] a = C4277a.m10375a(arrayList, this.f11621f);
                if (LiveEnableEffectNewEngineSetting.INSTANCE.getValue()) {
                    String[] a2 = C4277a.m10376a(arrayList, a);
                    C3854a.m9453a(3, "LiveComposerManager", "show sticker composer: " + Arrays.toString(a) + " extra:" + Arrays.toString(a2) + " return: " + this.f11616a.f11595c.mo9084a(a, a2));
                    return;
                }
                C3854a.m9453a(3, "LiveComposerManager", "show sticker composer: " + Arrays.toString(a) + " return: " + this.f11616a.f11595c.mo9083a(a));
            }
        }
    }

    /* renamed from: a */
    private static boolean m10203a(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (Integer num : list) {
            if (list2.contains(num)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m10202a(List<Integer> list, C4148a aVar) {
        if (!TextUtils.equals(aVar.f11590b, C4147a.f11584b) || !this.f11620e.containsKey(aVar.f11590b) || this.f11620e.get(aVar.f11590b).entrySet().size() <= 0) {
            return false;
        }
        C11672a value = this.f11620e.get(aVar.f11590b).entrySet().iterator().next().getValue();
        ArrayList arrayList = new ArrayList();
        if (value.f27910r.isEmpty()) {
            arrayList.addAll(aVar.f11589a);
        } else {
            arrayList.addAll(value.f27910r);
        }
        return m10203a(list, arrayList);
    }

    /* renamed from: a */
    private void m10198a(C11672a aVar, String str, float f) {
        String str2;
        C11672a aVar2;
        if (this.f11616a != null && !C13617h.m24465a(aVar.f27908p) && aVar.f27908p.contains(str)) {
            C3854a.m9453a(3, "LiveComposerManager", "updateTagValue path:" + aVar.f27899g + " tag:" + str + " value:" + f + " return:" + this.f11616a.f11595c.mo9079a(aVar.f27899g, str, f));
            C11672a aVar3 = null;
            Iterator<C11672a> it = this.f11621f.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    C11672a next = it.next();
                    if (next.f27899g.equals(aVar.f27899g) && next.f27908p.contains(str)) {
                        aVar3 = next;
                        Map<String, Float> map = this.f11621f.get(aVar3);
                        if (map != null) {
                            map.put(str, Float.valueOf(f));
                        }
                    }
                } else {
                    this.f11621f.put(aVar, new HashMap());
                    Map<String, Float> map2 = this.f11621f.get(aVar);
                    if (map2 != null) {
                        map2.put(str, Float.valueOf(f));
                    }
                }
            }
            Iterator<String> it2 = this.f11620e.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str2 = "";
                    break;
                }
                str2 = it2.next();
                Map<String, C11672a> map3 = this.f11620e.get(str2);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                } else {
                    aVar2 = aVar;
                }
                if (map3.containsValue(aVar2)) {
                    break;
                }
            }
            m10200a(str2, aVar, str, f);
            if (!this.f11624i.isEmpty()) {
                Iterator<AbstractC4150c> it3 = this.f11624i.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
            }
        }
    }

    /* renamed from: a */
    private void m10199a(Effect effect, String str, List<String> list) {
        Float f;
        if (effect != null && list.contains(effect.getUnzipPath())) {
            try {
                C28022o j = C28024q.m56139a(effect.getExtra()).mo46789j();
                if (j.mo46802b("ab_group") && LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue() != j.mo46803c("ab_group").mo46694g()) {
                    return;
                }
            } catch (Exception e) {
                C3854a.m9458a("LiveComposerManager", e);
            }
            if (this.f11628m.containsKey(effect.getUnzipPath())) {
                C11672a a = C4282d.m10385a(effect);
                Map<String, Float> map = this.f11628m.get(effect.getUnzipPath());
                a.f27908p.addAll(map.keySet());
                mo9846a(str, a);
                for (String str2 : map.keySet()) {
                    if (!this.f11627l.containsKey(effect.getUnzipPath()) || !this.f11627l.get(effect.getUnzipPath()).containsKey(str2)) {
                        String str3 = str2;
                        if (effect.getExtra().contains(str3)) {
                            a.f27908p.add(str3);
                            Float f2 = map.get(str2);
                            if (f2 instanceof Double) {
                                f = Float.valueOf(((Double) f2).floatValue());
                            } else {
                                f = f2;
                            }
                            mo9857a(str3, f.floatValue());
                        }
                    }
                }
                return;
            }
            mo9846a(str, C4282d.m10385a(effect));
        }
    }

    /* renamed from: a */
    private void m10200a(String str, C11672a aVar, String str2, float f) {
        if (this.f11625j.containsKey(str) && this.f11625j.get(str).contains(aVar.f27899g)) {
            if (!this.f11627l.containsKey(aVar.f27899g)) {
                this.f11627l.put(aVar.f27899g, new HashMap());
            }
            this.f11627l.get(aVar.f27899g).put(str2, Float.valueOf(f));
        }
    }
}
