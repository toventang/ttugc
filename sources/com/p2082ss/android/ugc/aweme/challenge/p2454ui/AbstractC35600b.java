package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41102a;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.b */
public abstract class AbstractC35600b extends AbstractC41102a implements WeakHandler.IHandler {

    /* renamed from: a */
    public List<Integer> f83959a;

    /* renamed from: b */
    protected WeakHandler f83960b = new WeakHandler(this);

    /* renamed from: c */
    protected ProgressDialogC74145d f83961c;

    static {
        Covode.recordClassIndex(42824);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public final void cb_() {
        if (this.f96079L != null) {
            this.f96079L.mo70355a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f83960b.removeCallbacksAndMessages(null);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ProgressDialogC74145d dVar = this.f83961c;
        if (dVar != null && dVar.isShowing()) {
            this.f83961c.dismiss();
        }
        this.f83961c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
