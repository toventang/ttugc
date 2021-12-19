package com.p2082ss.android.ugc.aweme.tools.music.p4123b;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.music.p4123b.C78730a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.b.b */
public final class C78733b extends Fragment {

    /* renamed from: a */
    public final HashMap<Integer, List<C78730a.AbstractC78731a>> f176925a = new HashMap<>();

    /* renamed from: b */
    private HashMap f176926b;

    static {
        Covode.recordClassIndex(91876);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f176926b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Set<Integer> keySet = this.f176925a.keySet();
        C89219l.m154716b(keySet, "");
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            this.f176925a.remove(it.next());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<C78730a.AbstractC78731a> list = this.f176925a.get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            this.f176925a.remove(Integer.valueOf(i));
            return;
        }
        C78730a.AbstractC78731a remove = list.remove(list.size() - 1);
        if (list.isEmpty()) {
            this.f176925a.remove(Integer.valueOf(i));
        }
        if (remove != null) {
            remove.mo122578a(i2, intent);
        }
    }
}
