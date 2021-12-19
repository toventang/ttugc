package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a */
public final class C46486a extends AbstractC46518o {
    static {
        Covode.recordClassIndex(55071);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46518o
    /* renamed from: a */
    public final View mo79002a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.yv, viewGroup, false);
        a.findViewById(R.id.go).setOnClickListener(new View$OnClickListenerC46491b(context));
        return a;
    }
}
