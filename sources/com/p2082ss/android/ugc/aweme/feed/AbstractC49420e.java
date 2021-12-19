package com.p2082ss.android.ugc.aweme.feed;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d;
import com.p2082ss.android.ugc.aweme.share.AbstractC69360q;

/* renamed from: com.ss.android.ugc.aweme.feed.e */
public abstract class AbstractC49420e extends C49431d implements AbstractC69360q {
    static {
        Covode.recordClassIndex(58233);
    }

    /* renamed from: a */
    public abstract void mo81047a();

    /* renamed from: a */
    public abstract void mo81048a(String str);

    public AbstractC49420e(String str, int i) {
        super(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: a */
    public final void mo65520a(Activity activity, Fragment fragment) {
        if (activity == null) {
            C36179e.m73733b("ATTACH ACTIVITY == NULL");
        }
        this.f113599b = activity;
        this.f113600c = fragment;
    }
}
