package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.t */
public final class C35990t extends LinearLayout {

    /* renamed from: a */
    public ArrayList<C36050s> f84978a = new ArrayList<>(3);

    /* renamed from: b */
    public AbstractC35989s f84979b;

    /* renamed from: c */
    public AbstractC60731k<C35757c> f84980c;

    /* renamed from: d */
    private int f84981d;

    static {
        Covode.recordClassIndex(43236);
    }

    public final ArrayList<C36050s> getMusicItemViews() {
        return this.f84978a;
    }

    /* renamed from: a */
    private void m73404a() {
        setOrientation(1);
        int i = 0;
        do {
            C36050s sVar = new C36050s(C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a_t, null, false), this.f84981d);
            sVar.f85019o.setPadding(sVar.f85019o.getPaddingLeft(), 0, 0, 0);
            this.f84978a.add(sVar);
            sVar.mo63153a(this.f84979b, this.f84980c);
            addView(sVar.itemView);
            i++;
        } while (i < 3);
    }

    public C35990t(Context context, int i) {
        super(context);
        MethodCollector.m26663i(881);
        this.f84981d = i;
        m73404a();
        MethodCollector.m26664o(881);
    }
}
