package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.C69797ae;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bh */
public final class C73989bh {

    /* renamed from: a */
    public static final C73989bh f166082a = new C73989bh();

    private C73989bh() {
    }

    static {
        Covode.recordClassIndex(86739);
    }

    /* renamed from: a */
    public static final String m130122a(Object obj) {
        if (C89219l.m154714a(obj, (Object) C69797ae.f155980a)) {
            return "video_15";
        }
        if (C89219l.m154714a(obj, (Object) C69797ae.f155981b)) {
            return "video_60";
        }
        if (C89219l.m154714a(obj, (Object) C69797ae.f155982c)) {
            return "video_180";
        }
        if (C89219l.m154714a(obj, (Object) "by_default")) {
            return "by_default";
        }
        return "-1";
    }

    /* renamed from: a */
    public static final Set<String> m130123a(int i) {
        String a = C80573ig.m139668a(R.string.f7k);
        String a2 = C80573ig.m139668a(R.string.f7m);
        String a3 = C80573ig.m139668a(R.string.f7l);
        if (i == 10) {
            return C89047am.m154438a((Object[]) new String[]{a, a2, a3});
        } else if (i == 11) {
            return C89047am.m154438a((Object[]) new String[]{a2, a3});
        } else if (i != 14) {
            return null;
        } else {
            return C89047am.m154436a(a3);
        }
    }

    /* renamed from: a */
    public static final View m130121a(ScrollableLinearLayout scrollableLinearLayout, Set<String> set) {
        String str;
        C89219l.m154721d(scrollableLinearLayout, "");
        C89219l.m154721d(set, "");
        if (set.contains(C69797ae.f155982c)) {
            str = C69797ae.f155982c;
        } else {
            if (set.contains(C69797ae.f155981b)) {
                str = C69797ae.f155981b;
            }
            return null;
        }
        if (str != null) {
            int childCount = scrollableLinearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = scrollableLinearLayout.getChildAt(i);
                C89219l.m154716b(childAt, "");
                Object tag = childAt.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                if (C89219l.m154714a(tag, (Object) str)) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    private static void m130125a(Map<Integer, View> map, Set<Integer> set) {
        Iterator<Map.Entry<Integer, View>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (set.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m130124a(TabHost tabHost, Set<String> set, Map<Integer, View> map) {
        C89219l.m154721d(tabHost, "");
        C89219l.m154721d(set, "");
        C89219l.m154721d(map, "");
        SortedMap a = C89041ag.m154413a(map);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : a.entrySet()) {
            Integer num = (Integer) entry.getKey();
            View view = (View) entry.getValue();
            C89219l.m154716b(view, "");
            Object tag = view.getTag();
            if ((tag instanceof String) && tag != null && !set.contains(tag)) {
                C89219l.m154716b(num, "");
                tabHost.mo116833a(view, num.intValue());
                set.add(tag);
                linkedHashSet.add(num);
            }
        }
        m130125a(map, linkedHashSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m130126a(Set<String> set, TabHost tabHost, ScrollableLinearLayout scrollableLinearLayout, Set<String> set2, Map<Integer, View> map) {
        View childAt;
        MethodCollector.m26663i(9368);
        C89219l.m154721d(tabHost, "");
        C89219l.m154721d(scrollableLinearLayout, "");
        C89219l.m154721d(set2, "");
        C89219l.m154721d(map, "");
        if (set == null) {
            MethodCollector.m26664o(9368);
        } else if (set.size() != set2.size() || !set2.containsAll(set)) {
            int childCount = scrollableLinearLayout.getChildCount();
            for (Map.Entry entry : C89041ag.m154413a(map).entrySet()) {
                View view = (View) entry.getValue();
                C89219l.m154716b(view, "");
                Object tag = view.getTag();
                if ((tag instanceof String) && tag != null && set.contains(tag)) {
                    childCount++;
                }
            }
            int childCount2 = scrollableLinearLayout.getChildCount();
            while (true) {
                childCount2--;
                if (childCount2 < 0) {
                    break;
                }
                View childAt2 = scrollableLinearLayout.getChildAt(childCount2);
                C89219l.m154716b(childAt2, "");
                Object tag2 = childAt2.getTag();
                if ((tag2 instanceof String) && tag2 != null && !set.contains(tag2)) {
                    childCount--;
                }
            }
            if (childCount <= 0) {
                tabHost.setVisibility(8);
                MethodCollector.m26664o(9368);
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry entry2 : C89041ag.m154413a(map).entrySet()) {
                Integer num = (Integer) entry2.getKey();
                View view2 = (View) entry2.getValue();
                C89219l.m154716b(view2, "");
                Object tag3 = view2.getTag();
                if ((tag3 instanceof String) && tag3 != null && set.contains(tag3)) {
                    C89219l.m154716b(num, "");
                    tabHost.mo116833a(view2, num.intValue());
                    set2.add(tag3);
                    linkedHashSet.add(num);
                }
            }
            m130125a(map, linkedHashSet);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (int childCount3 = scrollableLinearLayout.getChildCount() - 1; childCount3 >= 0; childCount3--) {
                View childAt3 = scrollableLinearLayout.getChildAt(childCount3);
                C89219l.m154716b(childAt3, "");
                Object tag4 = childAt3.getTag();
                if ((tag4 instanceof String) && tag4 != null && !set.contains(tag4)) {
                    C40970e.m82485a("remove tab the index is " + tabHost.f166964b + " index: " + childCount3);
                    if (!(tabHost.f166969g == null || (childAt = tabHost.f166969g.getChildAt(childCount3)) == null)) {
                        Object b = tabHost.mo116835b(tabHost.f166964b);
                        tabHost.f166969g.removeView(childAt);
                        if (tabHost.f166964b >= tabHost.f166969g.getChildCount()) {
                            tabHost.f166964b = Math.max(tabHost.f166969g.getChildCount() - 1, 0);
                            Object b2 = tabHost.mo116835b(tabHost.f166964b);
                            C40970e.m82485a("remove tab the current index is " + tabHost.f166964b);
                            if (!b.equals(b2) && tabHost.f166970h != null) {
                                tabHost.f166970h.mo116853a(b, tabHost.f166964b, 0, false, true);
                            }
                        }
                        tabHost.f166972j = Math.min(Math.max(tabHost.f166969g.getChildCount() - 1, 0), tabHost.f166972j);
                        tabHost.requestLayout();
                    }
                    linkedHashSet2.add(tag4);
                    map.put(Integer.valueOf(childCount3), childAt3);
                }
            }
            set2.removeAll(linkedHashSet2);
            MethodCollector.m26664o(9368);
        } else {
            MethodCollector.m26664o(9368);
        }
    }
}
