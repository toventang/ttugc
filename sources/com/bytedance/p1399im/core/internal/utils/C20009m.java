package com.bytedance.p1399im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.m */
public final class C20009m extends ArrayList<C19538ai> {
    static {
        Covode.recordClassIndex(22854);
    }

    public C20009m() {
    }

    public C20009m(Collection<? extends C19538ai> collection) {
        super(collection);
    }

    public final boolean update(C19538ai aiVar) {
        int indexOf = indexOf(aiVar);
        if (indexOf < 0) {
            return false;
        }
        set(indexOf, aiVar);
        return true;
    }

    /* renamed from: a */
    private static boolean m37803a(C19538ai aiVar) {
        if (aiVar == null || aiVar.isDeleted() || aiVar.getSvrStatus() != 0) {
            return false;
        }
        return true;
    }

    public final boolean add(C19538ai aiVar) {
        int indexOf = indexOf(aiVar);
        if (indexOf < 0) {
            super.add((-indexOf) - 1, aiVar);
        } else {
            set(indexOf, aiVar);
        }
        return true;
    }

    public final void addList(List<C19538ai> list) {
        if (!(list == null || list.isEmpty())) {
            for (C19538ai aiVar : list) {
                if (m37803a(aiVar)) {
                    add(aiVar);
                }
            }
        }
    }

    public final void appendList(List<C19538ai> list) {
        if (!(list == null || list.isEmpty())) {
            for (C19538ai aiVar : list) {
                if (m37803a(aiVar)) {
                    int indexOf = indexOf(aiVar);
                    if (indexOf < 0) {
                        super.add((Object) aiVar);
                    } else {
                        set(indexOf, aiVar);
                    }
                }
            }
        }
    }

    public final void updateList(List<C19538ai> list) {
        if (!(list == null || list.isEmpty())) {
            for (C19538ai aiVar : list) {
                if (m37803a(aiVar)) {
                    update(aiVar);
                }
            }
        }
    }
}
