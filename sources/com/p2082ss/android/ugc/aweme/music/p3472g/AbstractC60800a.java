package com.p2082ss.android.ugc.aweme.music.p3472g;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDetailActivity;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.g.a */
public abstract class AbstractC60800a implements AbstractC34466a {

    /* renamed from: a */
    public final Activity f138182a;

    static {
        Covode.recordClassIndex(71357);
    }

    public AbstractC60800a(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f138182a = activity;
    }

    /* renamed from: a */
    public final void mo98209a(boolean z) {
        if (z) {
            Activity activity = this.f138182a;
            if (activity instanceof MusicDetailActivity) {
                ((MusicDetailActivity) activity).registerActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        Activity activity2 = this.f138182a;
        if (activity2 instanceof MusicDetailActivity) {
            ((MusicDetailActivity) activity2).unRegisterActivityOnKeyDownListener(this);
        }
    }
}
