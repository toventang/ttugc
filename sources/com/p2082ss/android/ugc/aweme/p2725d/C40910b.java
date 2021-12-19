package com.p2082ss.android.ugc.aweme.p2725d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.d.b */
public final class C40910b {

    /* renamed from: a */
    public static final C40910b f95724a = new C40910b();

    private C40910b() {
    }

    static {
        Covode.recordClassIndex(48762);
    }

    /* renamed from: a */
    public static View m82399a(Activity activity, int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC40911c inflater;
        View a;
        C89219l.m154719c(layoutInflater, "");
        if (!(activity instanceof AbstractC40912d)) {
            activity = null;
        }
        AbstractC40912d dVar = (AbstractC40912d) activity;
        if (dVar != null && (inflater = dVar.getInflater()) != null && (a = inflater.mo70113a(i)) != null) {
            return a;
        }
        View a2 = C1764a.m5927a(layoutInflater, i, viewGroup, false);
        C89219l.m154709a((Object) a2, "");
        return a2;
    }
}
