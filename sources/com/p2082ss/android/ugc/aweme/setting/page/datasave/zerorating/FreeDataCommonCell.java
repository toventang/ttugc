package com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataCommonCell */
public abstract class FreeDataCommonCell<T extends AbstractC17641a> extends PowerCell<T> implements View.OnClickListener {
    static {
        Covode.recordClassIndex(80476);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public void mo23350a(T t) {
        C89219l.m154721d(t, "");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a1v, viewGroup, false);
        a.setOnClickListener(this);
        C89219l.m154716b(a, "");
        return a;
    }
}
