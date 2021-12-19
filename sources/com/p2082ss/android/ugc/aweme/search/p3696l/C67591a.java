package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a */
public final class C67591a extends LayoutInflater {
    static {
        Covode.recordClassIndex(79230);
    }

    public C67591a(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return LayoutInflater.from(getContext()).cloneInContext(context);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        Context context = getContext();
        C89219l.m154721d(context, "");
        if (C67644n.m119788a(context) != null) {
            AbstractC40912d a = C67644n.m119788a(context);
            if (a == null) {
                C89219l.m154715b();
            }
            View a2 = a.getInflater().mo70113a(i);
            if (a2 != null) {
                return a2;
            }
        }
        return C1764a.m5927a(LayoutInflater.from(context), i, viewGroup, z);
    }
}
