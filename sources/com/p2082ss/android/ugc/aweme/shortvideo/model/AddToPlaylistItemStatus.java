package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus */
public final class AddToPlaylistItemStatus extends CommonViewStatus {
    public final C1213t<String> _nameText = new C1213t<>();

    static {
        Covode.recordClassIndex(84544);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public final void bindView(View view, AbstractC1204m mVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(mVar, "");
        super.bindView(view, mVar);
        this._nameText.removeObservers(mVar);
        this._nameText.observe(mVar, new AddToPlaylistItemStatus$bindView$1(view));
    }
}
