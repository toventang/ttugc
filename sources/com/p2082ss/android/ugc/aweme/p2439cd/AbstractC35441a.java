package com.p2082ss.android.ugc.aweme.p2439cd;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.cd.a */
public abstract class AbstractC35441a<PARAM_TYPE, SUB> {

    /* renamed from: b */
    protected WeakHashMap<View, WeakReference<PARAM_TYPE>> f83610b = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(42617);
    }

    /* renamed from: a */
    public final void mo62338a(View view) {
        this.f83610b.remove(view);
    }

    /* renamed from: c */
    private PARAM_TYPE m72468c(View view) {
        WeakReference<PARAM_TYPE> weakReference = this.f83610b.get(view);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final PARAM_TYPE mo62339b(View view) {
        PARAM_TYPE c = m72468c(view);
        int i = 0;
        while (view.getId() != 16908290) {
            if (i <= 30) {
                c = m72468c(view);
                if (c != null) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
                i++;
            } else {
                return null;
            }
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.cd.a<PARAM_TYPE, SUB> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final SUB mo62337a(View view, PARAM_TYPE param_type) {
        this.f83610b.put(view, new WeakReference<>(param_type));
        return this;
    }
}
