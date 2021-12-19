package com.p2082ss.android.ugc.aweme.social.widget.card.view;

import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.a */
public abstract class AbstractC74890a extends RelativeLayout {

    /* renamed from: a */
    public TuxTextView f168358a;

    /* renamed from: b */
    public TuxIconView f168359b;

    static {
        Covode.recordClassIndex(87753);
    }

    public final TuxIconView getInfoIconView() {
        TuxIconView tuxIconView = this.f168359b;
        if (tuxIconView == null) {
            C89219l.m154710a("infoIconView");
        }
        return tuxIconView;
    }

    public final TuxTextView getTitleTextView() {
        TuxTextView tuxTextView = this.f168358a;
        if (tuxTextView == null) {
            C89219l.m154710a("titleTextView");
        }
        return tuxTextView;
    }

    private AbstractC74890a(Context context) {
        super(context, null, 0);
    }

    public final void setInfoIconView(TuxIconView tuxIconView) {
        C89219l.m154721d(tuxIconView, "");
        this.f168359b = tuxIconView;
    }

    public final void setTitleTextView(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f168358a = tuxTextView;
    }

    public /* synthetic */ AbstractC74890a(Context context, byte b) {
        this(context);
    }
}
