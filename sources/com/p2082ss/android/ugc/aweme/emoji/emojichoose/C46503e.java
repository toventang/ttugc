package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.e */
public final class C46503e extends AbstractC46518o {

    /* renamed from: a */
    private String f108387a;

    static {
        Covode.recordClassIndex(55088);
    }

    public C46503e(String str) {
        this.f108387a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46518o
    /* renamed from: a */
    public final View mo79002a(ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yd, viewGroup, false);
        ((TextView) a.findViewById(R.id.evq)).setText(this.f108387a);
        return a;
    }
}
