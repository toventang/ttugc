package com.bytedance.tux.p1708b;

import android.view.View;
import android.widget.Checkable;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.b */
public final class C22978b {

    /* renamed from: a */
    public final Map<Integer, Object> f54330a;

    /* renamed from: b */
    private final Map<C22981e, Map<Integer, Object>> f54331b;

    static {
        Covode.recordClassIndex(26895);
    }

    /* renamed from: a */
    public final Map<Integer, Object> mo37292a(View view) {
        C89219l.m154719c(view, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C89041ag.m154420a(this.f54330a, linkedHashMap);
        if (!this.f54331b.isEmpty()) {
            for (Map.Entry<C22981e, Map<Integer, Object>> entry : this.f54331b.entrySet()) {
                C22981e key = entry.getKey();
                C89219l.m154719c(view, "");
                if ((key.f54334a == null || !(!C89219l.m154714a(key.f54334a, Boolean.valueOf(view.isPressed())))) && ((key.f54335b == null || !(!C89219l.m154714a(key.f54335b, Boolean.valueOf(view.isFocused())))) && ((key.f54336c == null || !(!C89219l.m154714a(key.f54336c, Boolean.valueOf(view.isSelected())))) && ((key.f54337d == null || !(!C89219l.m154714a(key.f54337d, Boolean.valueOf(view.isEnabled())))) && ((key.f54338e == null || !(!C89219l.m154714a(key.f54338e, Boolean.valueOf(view.isActivated())))) && (key.f54339f == null || !(view instanceof Checkable) || !(!C89219l.m154714a(key.f54339f, Boolean.valueOf(((Checkable) view).isChecked()))))))))) {
                    linkedHashMap.putAll(entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final Map<Integer, Object> mo37293a(C22981e eVar) {
        C89219l.m154719c(eVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C89041ag.m154420a(this.f54330a, linkedHashMap);
        if (!this.f54331b.isEmpty()) {
            for (Map.Entry<C22981e, Map<Integer, Object>> entry : this.f54331b.entrySet()) {
                C22981e key = entry.getKey();
                C89219l.m154719c(eVar, "");
                if ((key.f54334a == null || !(!C89219l.m154714a(key.f54334a, eVar.f54334a))) && ((key.f54335b == null || !(!C89219l.m154714a(key.f54335b, eVar.f54335b))) && ((key.f54336c == null || !(!C89219l.m154714a(key.f54336c, eVar.f54336c))) && ((key.f54337d == null || !(!C89219l.m154714a(key.f54337d, eVar.f54337d))) && ((key.f54338e == null || !(!C89219l.m154714a(key.f54338e, eVar.f54338e))) && (key.f54339f == null || !(!C89219l.m154714a(key.f54339f, eVar.f54339f)))))))) {
                    linkedHashMap.putAll(entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    public C22978b(Map<Integer, Object> map, Map<C22981e, Map<Integer, Object>> map2) {
        C89219l.m154719c(map, "");
        C89219l.m154719c(map2, "");
        this.f54330a = map;
        this.f54331b = map2;
    }
}
