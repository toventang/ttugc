package com.lynx.tasm.p2055d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.d.a */
public final class C28751a {

    /* renamed from: a */
    public String f67801a;

    /* renamed from: b */
    public List<Pair<EnumC28752a, String>> f67802b = new ArrayList();

    /* renamed from: c */
    public C28766d f67803c;

    static {
        Covode.recordClassIndex(34850);
    }

    /* renamed from: com.lynx.tasm.d.a$a */
    public enum EnumC28752a {
        URL,
        LOCAL;

        static {
            Covode.recordClassIndex(34851);
        }
    }

    /* renamed from: a */
    public final void mo49868a(String str) {
        this.f67802b.add(new Pair<>(EnumC28752a.URL, str));
    }

    /* renamed from: b */
    public final void mo49869b(String str) {
        this.f67802b.add(new Pair<>(EnumC28752a.LOCAL, str));
    }
}
