package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.l */
public final class C57288l extends LinearLayout {

    /* renamed from: a */
    public ArrayList<C57320o> f130510a = new ArrayList<>(3);

    /* renamed from: b */
    public AbstractC57287k f130511b;

    /* renamed from: c */
    public AbstractC57080c<C57192b> f130512c;

    /* renamed from: d */
    private int f130513d;

    static {
        Covode.recordClassIndex(67193);
    }

    public final ArrayList<C57320o> getMusicItemViews() {
        return this.f130510a;
    }

    /* renamed from: a */
    private void m103867a() {
        setOrientation(1);
        int i = 0;
        do {
            C57320o oVar = new C57320o(C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ade, null, false), this.f130513d);
            oVar.f130547m.setPadding(oVar.f130547m.getPaddingLeft(), 0, 0, 0);
            this.f130510a.add(oVar);
            oVar.mo94501a(this.f130511b, this.f130512c);
            addView(oVar.itemView);
            i++;
        } while (i < 3);
    }

    public C57288l(Context context, int i) {
        super(context);
        MethodCollector.m26663i(6902);
        this.f130513d = i;
        m103867a();
        MethodCollector.m26664o(6902);
    }
}
