package com.bytedance.jedi.ext.adapter;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.widget.Widget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.b */
public final class C20624b {
    static {
        Covode.recordClassIndex(24156);
    }

    /* renamed from: a */
    public static final Object m38845a(Object obj) {
        while (true) {
            C89219l.m154719c(obj, "");
            if ((obj instanceof Fragment) || (obj instanceof ActivityC0945e)) {
                return obj;
            }
            if (obj instanceof Widget) {
                return ((Widget) obj).mo39088j().mo39098b();
            }
            if (obj instanceof JediViewHolder) {
                obj = ((JediViewHolder) obj).mo33833k();
            } else {
                throw new IllegalStateException();
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static final ActivityC0945e m38846b(Object obj) {
        while (true) {
            C89219l.m154719c(obj, "");
            if (obj instanceof Fragment) {
                ActivityC0945e requireActivity = ((Fragment) obj).requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return requireActivity;
            } else if (obj instanceof ActivityC0945e) {
                return (ActivityC0945e) obj;
            } else {
                if (obj instanceof Widget) {
                    obj = ((Widget) obj).mo39088j().mo39098b();
                } else if (obj instanceof JediViewHolder) {
                    obj = ((JediViewHolder) obj).mo33833k();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
