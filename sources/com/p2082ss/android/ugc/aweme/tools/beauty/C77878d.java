package com.p2082ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.EnumC77907c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.d */
public final class C77878d {
    static {
        Covode.recordClassIndex(90965);
    }

    /* renamed from: a */
    public static final int m135993a(String str) {
        Integer e;
        if (str == null || (e = C89361p.m154863e(str)) == null) {
            return -1;
        }
        return e.intValue();
    }

    /* renamed from: a */
    public static final boolean m135997a(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        return composerBeauty.isBeautyMode();
    }

    /* renamed from: b */
    public static final boolean m135999b(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        String parentId = composerBeauty.getParentId();
        if (parentId == null || parentId.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m136001c(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (1 == composerBeauty.getEffect().getEffectType()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m136002d(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (m135999b(composerBeauty) || !composerBeauty.getCategoryExclusive()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m136003e(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (m135999b(composerBeauty) || m136002d(composerBeauty) || m135997a(composerBeauty)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m136005g(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (m135999b(composerBeauty) || composerBeauty.getCategoryExclusive() || !composerBeauty.getExtra().isNone()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m136004f(ComposerBeauty composerBeauty) {
        String unzipPath;
        C89219l.m154721d(composerBeauty, "");
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (((items == null || items.isEmpty()) && !composerBeauty.getExtra().isNone()) || (unzipPath = composerBeauty.getEffect().getUnzipPath()) == null || unzipPath.length() == 0 || !composerBeauty.getEnable()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final List<ComposerBeauty> m135994a(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        C89219l.m154721d(composerBeauty, "");
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (T t : list) {
            Iterator<T> it = t.getBeautyList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next, (Object) composerBeauty)) {
                    if (next != null) {
                        arrayList.addAll(t.getBeautyList());
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<ComposerBeauty> m135995a(List<BeautyCategory> list, AbstractC89172b<? super ComposerBeauty, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                for (T t : it.next().getBeautyList()) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null && !childList.isEmpty()) {
                            arrayList.addAll(childList);
                        }
                    } else {
                        arrayList.add(t);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (bVar.invoke(obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static final List<ComposerBeauty> m136000c(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        T t;
        C89219l.m154721d(composerBeauty, "");
        ArrayList arrayList = new ArrayList();
        if (!m136002d(composerBeauty) || list == null) {
            return arrayList;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.getCategoryResponse().getId(), (Object) composerBeauty.getCategoryId())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            arrayList.addAll(t2.getBeautyList());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final ComposerBeauty m135998b(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        String parentId;
        List<ComposerBeauty> childList;
        C89219l.m154721d(composerBeauty, "");
        if (!(list == null || (parentId = composerBeauty.getParentId()) == null || parentId.length() == 0)) {
            for (T t : list) {
                List<ComposerBeauty> beautyList = t.getBeautyList();
                ArrayList<ComposerBeauty> arrayList = new ArrayList();
                for (T t2 : beautyList) {
                    if (t2.isCollectionType()) {
                        arrayList.add(t2);
                    }
                }
                for (ComposerBeauty composerBeauty2 : arrayList) {
                    List<ComposerBeauty> childList2 = composerBeauty2.getChildList();
                    if (childList2 != null) {
                        Iterator<T> it = childList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                continue;
                                break;
                            }
                            T next = it.next();
                            if (C89219l.m154714a((Object) next, (Object) composerBeauty)) {
                                if (next != null) {
                                    return composerBeauty2;
                                }
                            }
                        }
                    }
                }
                List<ComposerBeauty> beautyList2 = t.getBeautyList();
                ArrayList arrayList2 = new ArrayList();
                for (T t3 : beautyList2) {
                    if (t3.isBeautyMode()) {
                        arrayList2.add(t3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        List<ComposerBeauty> childList3 = ((ComposerBeauty) it2.next()).getChildList();
                        if (childList3 != null) {
                            for (T t4 : childList3) {
                                if (t4.isCollectionType() && (childList = t4.getChildList()) != null) {
                                    Iterator<T> it3 = childList.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            continue;
                                            break;
                                        }
                                        T next2 = it3.next();
                                        if (C89219l.m154714a((Object) next2, (Object) composerBeauty)) {
                                            if (next2 != null) {
                                                return t4;
                                            }
                                        }
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m135996a(ComposerBeauty composerBeauty, AbstractC89172b<? super ComposerBeauty, Boolean> bVar, AbstractC89183m<? super String, ? super String, int[]> mVar) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        if (bVar.invoke(composerBeauty).booleanValue() && m136004f(composerBeauty)) {
            if (composerBeauty.getExtra().isNone()) {
                int[] invoke = mVar.invoke(composerBeauty.getEffect().getUnzipPath(), "");
                if (invoke != null && invoke.length == 2 && invoke[0] == 0 && invoke[1] == EnumC77907c.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    int[] invoke2 = mVar.invoke(composerBeauty.getEffect().getUnzipPath(), it.next().getTag());
                    if (invoke2 != null && invoke2.length == 2 && invoke2[0] == 0 && invoke2[1] == EnumC77907c.EXCLUDE.getFlag()) {
                        composerBeauty.setEnable(false);
                    }
                }
            }
        }
    }
}
