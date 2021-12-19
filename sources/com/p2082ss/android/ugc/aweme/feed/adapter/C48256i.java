package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.i */
public final class C48256i {

    /* renamed from: a */
    public final ArrayList<Aweme> f111788a = new ArrayList<>();

    static {
        Covode.recordClassIndex(56998);
    }

    /* renamed from: b */
    private static List<Aweme> m91658b(List<? extends Aweme> list) {
        if (list != null) {
            return C89070n.m154580f((Iterable) list);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo80379a(List<? extends Aweme> list) {
        this.f111788a.clear();
        C48257j.m91661a(this.f111788a, m91658b(list));
    }

    /* renamed from: a */
    public final Aweme mo80378a(int i) {
        if (i < 0 || i >= this.f111788a.size()) {
            return null;
        }
        return this.f111788a.get(i);
    }
}
