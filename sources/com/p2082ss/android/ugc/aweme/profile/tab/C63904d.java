package com.p2082ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.d */
public final class C63904d {
    static {
        Covode.recordClassIndex(75334);
    }

    /* renamed from: a */
    public static AbstractC63905e m115596a(Context context, ViewGroup viewGroup, int i) {
        AbstractC63905e eVar = (AbstractC63905e) C1764a.m5927a(LayoutInflater.from(context), R.layout.apw, viewGroup, false);
        ((MusProfileTabImageView) eVar).setImageResource(i);
        eVar.setAnimationEnabled(true);
        return eVar;
    }
}
