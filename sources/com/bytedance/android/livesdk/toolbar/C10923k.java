package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.p385p.AbstractC5842g;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p385p.EnumC5852o;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.k */
public final class C10923k implements AbstractC5842g {

    /* renamed from: a */
    public static final C10923k f26245a = new C10923k();

    /* renamed from: b */
    private static final HashMap<DataChannel, ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f>> f26246b = new HashMap<>(8);

    /* renamed from: c */
    private static final HashMap<DataChannel, Map<EnumC5852o, C10921j>> f26247c = new HashMap<>(3);

    private C10923k() {
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11615a(DataChannel dataChannel) {
        Collection<C10921j> values;
        if (dataChannel != null) {
            Map<EnumC5852o, C10921j> map = f26247c.get(dataChannel);
            if (!(map == null || (values = map.values()) == null)) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    it.next().mo17780b();
                }
            }
            f26247c.remove(dataChannel);
            f26246b.remove(dataChannel);
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11616a(DataChannel dataChannel, LinearLayout linearLayout, List<? extends EnumC5847l> list, EnumC5854q qVar, EnumC5852o oVar) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(oVar, "");
        C10921j jVar = new C10921j(dataChannel, linearLayout, list, qVar, f26246b.get(dataChannel));
        HashMap<DataChannel, Map<EnumC5852o, C10921j>> hashMap = f26247c;
        if (hashMap.get(dataChannel) == null) {
            if (dataChannel == null) {
                C89219l.m154715b();
            }
            hashMap.put(dataChannel, new HashMap(3));
        }
        Map<EnumC5852o, C10921j> map = hashMap.get(dataChannel);
        if (map != null) {
            map.put(oVar, jVar);
        }
        jVar.mo17775a();
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11617a(DataChannel dataChannel, List<EnumC5847l> list, EnumC5854q qVar, EnumC5852o oVar) {
        Map<EnumC5852o, C10921j> map;
        C10921j jVar;
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(oVar, "");
        if (!(dataChannel == null || (map = f26247c.get(dataChannel)) == null || (jVar = map.get(oVar)) == null || jVar.f26240f == null)) {
            for (Map.Entry<EnumC5847l, AbstractView$OnClickListenerC5841f> entry : jVar.f26240f.entrySet()) {
                EnumC5847l key = entry.getKey();
                entry.getValue();
                jVar.f26236b.contains(key);
            }
        }
    }

    static {
        Covode.recordClassIndex(12531);
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11609a() {
        Collection<Map<EnumC5852o, C10921j>> values = f26247c.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            for (C10921j jVar : it.next().values()) {
                jVar.mo17780b();
            }
        }
        f26246b.clear();
        f26247c.clear();
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final View mo11608a(EnumC5847l lVar) {
        C89219l.m154721d(lVar, "");
        Collection<Map<EnumC5852o, C10921j>> values = f26247c.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            Iterator it2 = it.next().values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    C89219l.m154721d(lVar, "");
                    View view = ((C10921j) it2.next()).f26235a.get(lVar);
                    if (view != null) {
                        return view;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11610a(EnumC5847l lVar, int i) {
        ImageView imageView;
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(lVar, "");
        View a = mo11608a(lVar);
        if (a != null && (imageView = (ImageView) a.findViewById(R.id.ek8)) != null) {
            imageView.setBackgroundResource(i);
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: b */
    public final void mo11618b(EnumC5847l lVar, DataChannel dataChannel) {
        Map<EnumC5852o, C10921j> map;
        Collection<C10921j> values;
        C89219l.m154721d(lVar, "");
        if (dataChannel != null && (map = f26247c.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                C89219l.m154721d(lVar, "");
                Iterator<Map.Entry<EnumC5847l, View>> it2 = it.next().f26235a.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry<EnumC5847l, View> next = it2.next();
                        EnumC5847l key = next.getKey();
                        View value = next.getValue();
                        if (lVar == key) {
                            value.setVisibility(0);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: c */
    public final void mo11621c(EnumC5847l lVar, DataChannel dataChannel) {
        Map<EnumC5852o, C10921j> map;
        Collection<C10921j> values;
        C89219l.m154721d(lVar, "");
        if (dataChannel != null && (map = f26247c.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                C89219l.m154721d(lVar, "");
                Iterator<Map.Entry<EnumC5847l, View>> it2 = it.next().f26235a.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<EnumC5847l, View> next = it2.next();
                    EnumC5847l key = next.getKey();
                    View value = next.getValue();
                    if (lVar == key) {
                        value.setVisibility(8);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: d */
    public final boolean mo11622d(EnumC5847l lVar, DataChannel dataChannel) {
        Map<EnumC5852o, C10921j> map;
        Collection<C10921j> values;
        View findViewById;
        C89219l.m154721d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC5852o, C10921j>> hashMap = f26247c;
            if (!(hashMap.get(dataChannel) == null || (map = hashMap.get(dataChannel)) == null || (values = map.values()) == null)) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    C89219l.m154721d(lVar, "");
                    View view = it.next().f26235a.get(lVar);
                    if (view != null && (findViewById = view.findViewById(R.id.eki)) != null && findViewById.getVisibility() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11611a(EnumC5847l lVar, DataChannel dataChannel) {
        Map<EnumC5852o, C10921j> map;
        Collection<C10921j> values;
        ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap;
        C89219l.m154721d(lVar, "");
        if (dataChannel != null && (map = f26247c.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                it.next().mo17776a(lVar);
                HashMap<DataChannel, ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f>> hashMap = f26246b;
                if (!(hashMap == null || (concurrentHashMap = hashMap.get(dataChannel)) == null)) {
                    concurrentHashMap.remove(lVar);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11614a(EnumC5852o oVar, DataChannel dataChannel) {
        C10921j jVar;
        C89219l.m154721d(oVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC5852o, C10921j>> hashMap = f26247c;
            Map<EnumC5852o, C10921j> map = hashMap.get(dataChannel);
            if (!(map == null || (jVar = map.get(oVar)) == null)) {
                jVar.mo17780b();
            }
            Map<EnumC5852o, C10921j> map2 = hashMap.get(dataChannel);
            if (map2 != null) {
                map2.remove(oVar);
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: b */
    public final void mo11619b(EnumC5847l lVar, DataChannel dataChannel, boolean z) {
        Collection<C10921j> values;
        C89219l.m154721d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC5852o, C10921j>> hashMap = f26247c;
            if (hashMap.get(dataChannel) != null) {
                Map<EnumC5852o, C10921j> map = hashMap.get(dataChannel);
                if (!(map == null || (values = map.values()) == null)) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        C89219l.m154721d(lVar, "");
                        for (Map.Entry<EnumC5847l, View> entry : it.next().f26235a.entrySet()) {
                            EnumC5847l key = entry.getKey();
                            View value = entry.getValue();
                            if (lVar == key) {
                                value.setClickable(z);
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        lVar.isEnableClick = z;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11612a(EnumC5847l lVar, DataChannel dataChannel, AbstractView$OnClickListenerC5841f fVar) {
        Collection<C10921j> values;
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(fVar, "");
        if (dataChannel != null) {
            Map<EnumC5852o, C10921j> map = f26247c.get(dataChannel);
            if (!(map == null || (values = map.values()) == null)) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    it.next().mo17777a(lVar, fVar);
                }
            }
            HashMap<DataChannel, ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f>> hashMap = f26246b;
            if (hashMap.get(dataChannel) == null) {
                hashMap.put(dataChannel, new ConcurrentHashMap<>(8));
            }
            ConcurrentHashMap<EnumC5847l, AbstractView$OnClickListenerC5841f> concurrentHashMap = hashMap.get(dataChannel);
            if (concurrentHashMap != null) {
                concurrentHashMap.put(lVar, fVar);
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: a */
    public final void mo11613a(EnumC5847l lVar, DataChannel dataChannel, boolean z) {
        Collection<C10921j> values;
        C89219l.m154721d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC5852o, C10921j>> hashMap = f26247c;
            if (hashMap.get(dataChannel) != null) {
                Map<EnumC5852o, C10921j> map = hashMap.get(dataChannel);
                if (map != null && (values = map.values()) != null) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        it.next().mo17779a(lVar, z);
                    }
                    return;
                }
                return;
            }
        }
        lVar.isRedDotVisible = z;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5842g
    /* renamed from: b */
    public final void mo11620b(DataChannel dataChannel, LinearLayout linearLayout, List<EnumC5847l> list, EnumC5854q qVar, EnumC5852o oVar) {
        Map<EnumC5852o, C10921j> map;
        Collection<C10921j> values;
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(oVar, "");
        if (!(dataChannel == null || (map = f26247c.get(dataChannel)) == null || (values = map.values()) == null)) {
            for (T t : values) {
                C89219l.m154721d(list, "");
                for (EnumC5847l lVar : C89070n.m154577e(t.f26238d, list)) {
                    t.mo17776a(lVar);
                }
                t.f26238d = list;
                if (t.f26240f != null) {
                    for (Map.Entry<EnumC5847l, AbstractView$OnClickListenerC5841f> entry : t.f26240f.entrySet()) {
                        t.mo17778a(entry.getKey(), entry.getValue(), false);
                    }
                }
            }
        }
    }
}
