package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.model.C9914v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.v */
public final class C10072v extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public C9914v f24481a;

    /* renamed from: b */
    public LiveTextView f24482b;

    static {
        Covode.recordClassIndex(11634);
    }

    public C10072v(View view) {
        super(view);
        LiveTextView liveTextView = (LiveTextView) view;
        this.f24482b = liveTextView;
        liveTextView.setAlpha(0.9f);
        this.f24482b.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
    }

    /* renamed from: a */
    public final void mo16890a(String str, C9914v vVar) {
        this.f24482b.setText(str);
        this.f24481a = vVar;
    }
}
