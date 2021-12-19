package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.i */
final /* synthetic */ class C74111i implements AbstractC31071f.AbstractC31073b {

    /* renamed from: a */
    private final ChooseCoverActivity f166403a;

    /* renamed from: b */
    private final TextView f166404b;

    static {
        Covode.recordClassIndex(86864);
    }

    C74111i(ChooseCoverActivity chooseCoverActivity, TextView textView) {
        this.f166403a = chooseCoverActivity;
        this.f166404b = textView;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f.AbstractC31073b
    /* renamed from: a */
    public final void mo56404a(int i) {
        ChooseCoverActivity chooseCoverActivity = this.f166403a;
        TextView textView = this.f166404b;
        String a = chooseCoverActivity.f166354i.mo118854a(i);
        if (TextUtils.isEmpty(a)) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        textView.setText(a);
    }
}
