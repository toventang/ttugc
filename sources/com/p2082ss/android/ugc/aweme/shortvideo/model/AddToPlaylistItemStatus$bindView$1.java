package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus$bindView$1 */
final class AddToPlaylistItemStatus$bindView$1<T> implements AbstractC1214u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84545);
    }

    AddToPlaylistItemStatus$bindView$1(View view) {
        this.$view = view;
    }

    public final void onChanged(String str) {
        View findViewById = this.$view.findViewById(R.id.ezj);
        C89219l.m154716b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }
}
