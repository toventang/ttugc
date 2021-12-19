package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.DmViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.a */
public class C54946a extends AbstractC39060f<AbstractC56237a> {

    /* renamed from: a */
    private static final int f125775a = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: b */
    private final AbstractC54866a f125776b;

    static {
        Covode.recordClassIndex(64670);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91967b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91969c();
        }
    }

    public C54946a(ActivityC0218d dVar, AbstractC54866a aVar) {
        mo67814a("");
        DmViewModel a = DmViewModel.C54241a.m99497a(dVar);
        if (a != null) {
            a.mo91332a().observe(dVar, new C54947b(this));
        }
        this.f125776b = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C55012c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6n, viewGroup, false), this.f125776b);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        ((C55012c) viewHolder).mo91966a((AbstractC56237a) this.f92236l.get(i));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.itemView.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin;
        if (i == 0) {
            i2 = f125775a;
        } else {
            i2 = 0;
        }
        marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }
}
