package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.j */
public final class C47464j extends RecyclerView.ViewHolder implements C47434a.AbstractC47435a {

    /* renamed from: a */
    public RemoteImageView f110258a;

    /* renamed from: b */
    public TuxTextView f110259b;

    /* renamed from: c */
    public TextView f110260c;

    /* renamed from: d */
    public TextView f110261d;

    /* renamed from: e */
    public TextView f110262e;

    /* renamed from: f */
    public AppCompatImageView f110263f;

    /* renamed from: g */
    public View f110264g;

    /* renamed from: h */
    public C75445g f110265h;

    static {
        Covode.recordClassIndex(56077);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a.AbstractC47435a
    /* renamed from: c */
    public final void mo79706c() {
        C75445g gVar = this.f110265h;
        if (gVar != null) {
            C47434a.m90445a(1, gVar.f169545id);
        }
    }

    public C47464j(View view) {
        super(view);
        this.f110264g = view;
        this.f110258a = (RemoteImageView) view.findViewById(R.id.dqg);
        this.f110259b = (TuxTextView) view.findViewById(R.id.f4l);
        this.f110260c = (TextView) view.findViewById(R.id.ev3);
        this.f110261d = (TextView) view.findViewById(R.id.ev4);
        this.f110262e = (TextView) view.findViewById(R.id.f6s);
        this.f110263f = (AppCompatImageView) view.findViewById(R.id.byw);
    }
}
