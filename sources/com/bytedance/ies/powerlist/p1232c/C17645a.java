package com.bytedance.ies.powerlist.p1232c;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0803x;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.c.a */
public final class C17645a {
    static {
        Covode.recordClassIndex(20198);
    }

    /* renamed from: a */
    public static final List<Fragment> m32761a(AbstractC0952i iVar) {
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : iVar.mo3565f()) {
            C89219l.m154709a((Object) fragment, "");
            arrayList.add(fragment);
            try {
                AbstractC0952i childFragmentManager = fragment.getChildFragmentManager();
                C89219l.m154709a((Object) childFragmentManager, "");
                arrayList.addAll(m32761a(childFragmentManager));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final boolean m32762a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            return false;
        }
        Iterator<View> a = C0803x.m2810a(viewGroup).mo2926a();
        while (a.hasNext()) {
            View next = a.next();
            if (m32762a(next, view2)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
