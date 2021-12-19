package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.h */
public final class C48254h {

    /* renamed from: a */
    final SparseArray<LinkedList<View>> f111784a = new SparseArray<>();

    /* renamed from: b */
    final HashMap<Aweme, C48255a> f111785b = new HashMap<>();

    static {
        Covode.recordClassIndex(56996);
    }

    /* renamed from: a */
    public final void mo80376a() {
        for (C48255a aVar : this.f111785b.values()) {
            if (!(aVar == null || aVar.f111786a == null)) {
                m91655a(aVar.f111786a);
            }
        }
        this.f111785b.clear();
    }

    /* renamed from: a */
    static boolean m91655a(View view) {
        AbstractC48149ai aiVar;
        if (view == null || (aiVar = (AbstractC48149ai) view.getTag(R.id.b0u)) == null) {
            return false;
        }
        aiVar.mo80080c();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.h$a */
    protected static class C48255a {

        /* renamed from: a */
        View f111786a;

        /* renamed from: b */
        int f111787b;

        static {
            Covode.recordClassIndex(56997);
        }

        C48255a(View view, int i) {
            this.f111786a = view;
            this.f111787b = i;
        }
    }

    /* renamed from: a */
    public final void mo80377a(int i, View view) {
        if (i == 0) {
            LinkedList<View> linkedList = this.f111784a.get(i);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.f111784a.put(i, linkedList);
            }
            if (linkedList.size() <= 0) {
                linkedList.push(view);
            }
        }
    }
}
