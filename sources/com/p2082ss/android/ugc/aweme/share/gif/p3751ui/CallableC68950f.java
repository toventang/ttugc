package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.share.gif.p3751ui.VideoShare2GifEditActivity;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.f */
final /* synthetic */ class CallableC68950f implements Callable {

    /* renamed from: a */
    private final VideoShare2GifEditActivity.C689431 f154255a;

    /* renamed from: b */
    private final AsyncAVService f154256b;

    static {
        Covode.recordClassIndex(81262);
    }

    CallableC68950f(VideoShare2GifEditActivity.C689431 r1, AsyncAVService asyncAVService) {
        this.f154255a = r1;
        this.f154256b = asyncAVService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoShare2GifEditActivity.C689431 r3 = this.f154255a;
        VideoShare2GifEditActivity.this.getSupportFragmentManager().mo3552a().mo3453a(R.id.b40, this.f154256b.uiService().abilityUiService().video2GifFragment(VideoShare2GifEditActivity.this.f154241b)).mo3478e();
        return null;
    }
}
