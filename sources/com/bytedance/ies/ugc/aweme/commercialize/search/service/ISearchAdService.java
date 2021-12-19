package com.bytedance.ies.ugc.aweme.commercialize.search.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;

public interface ISearchAdService {
    static {
        Covode.recordClassIndex(20541);
    }

    /* renamed from: a */
    ViewGroup mo28574a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd);

    /* renamed from: a */
    ViewGroup mo28575a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd, View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo28576a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo28577a(AwemeRawAd awemeRawAd, ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    /* renamed from: b */
    void mo28578b(ViewGroup viewGroup);

    /* renamed from: c */
    void mo28579c(ViewGroup viewGroup);

    /* renamed from: d */
    void mo28580d(ViewGroup viewGroup);

    /* renamed from: e */
    void mo28581e(ViewGroup viewGroup);

    /* renamed from: f */
    void mo28582f(ViewGroup viewGroup);
}
