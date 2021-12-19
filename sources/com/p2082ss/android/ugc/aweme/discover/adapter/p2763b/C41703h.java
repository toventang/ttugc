package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1722h.C23159f;
import com.p2082ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.h */
public final class C41703h extends RecyclerView.ViewHolder {

    /* renamed from: n */
    private static final int f97287n = C23159f.m43650b(48);

    /* renamed from: a */
    public long f97288a;

    /* renamed from: b */
    TextView f97289b;

    /* renamed from: c */
    SugCompletionView f97290c;

    /* renamed from: d */
    TuxIconView f97291d;

    /* renamed from: e */
    View f97292e;

    /* renamed from: f */
    View f97293f;

    /* renamed from: g */
    View f97294g;

    /* renamed from: h */
    public AbstractC41953a f97295h;

    /* renamed from: i */
    public SugCompletionView.AbstractC43029a f97296i;

    /* renamed from: j */
    public C67679e f97297j;

    /* renamed from: k */
    String f97298k;

    /* renamed from: l */
    public int f97299l;

    /* renamed from: m */
    SearchSugMobHelper f97300m;

    /* renamed from: o */
    private int f97301o;

    static {
        Covode.recordClassIndex(49616);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70900a(int i) {
        if (i <= 0) {
            i = f97287n;
        }
        if (this.f97301o != i) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = i;
            this.f97301o = i;
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    public C41703h(View view, int i, String str, AbstractC41953a aVar, SugCompletionView.AbstractC43029a aVar2) {
        super(view);
        this.f97295h = aVar;
        this.f97298k = str;
        this.f97296i = aVar2;
        this.f97289b = (TextView) view.findViewById(R.id.f4z);
        this.f97290c = (SugCompletionView) view.findViewById(R.id.c06);
        this.f97291d = (TuxIconView) view.findViewById(R.id.bzj);
        this.f97292e = view.findViewById(R.id.un);
        this.f97293f = view.findViewById(R.id.bwd);
        this.f97294g = view.findViewById(R.id.acq);
        this.f97290c.setImageDrawable(C23005c.m43393a(C41705i.f97307a).mo37368a(view.getContext()));
        this.f97290c.setOnClickListener(new View$OnClickListenerC41706j(this));
        this.f97290c.setKeyboardDismissHandler(this.f97296i);
        mo70900a(i);
        Context context = this.itemView.getContext();
        if (context instanceof ActivityC0945e) {
            this.f97300m = (SearchSugMobHelper) C1181ae.m3881a((ActivityC0945e) context, (C1175ad.AbstractC1177b) null).mo3983a(SearchSugMobHelper.class);
        }
    }
}
