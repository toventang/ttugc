package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38667b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.y */
public final class C38769y implements AbstractC37873az {
    static {
        Covode.recordClassIndex(46310);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final boolean mo65921a(Uri uri) {
        return C38767w.m78644a(uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final void mo65916a(Context context, String str) {
        C38767w.m78629a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final void mo65914a(Context context, Aweme aweme) {
        AbstractC38757n.m78635a(context, aweme, (String) null, (String) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: b */
    public final boolean mo65922b(Context context, Aweme aweme) {
        return AbstractC38757n.m78633a(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: c */
    public final boolean mo65924c(Context context, Aweme aweme) {
        return C38767w.m78671d(context, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: b */
    public final boolean mo65923b(Context context, String str) {
        return C38767w.m78670c(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final void mo65915a(Context context, Aweme aweme, AbstractC38694bo boVar) {
        C38695bp.m78506a(context, aweme, 43, boVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final boolean mo65917a(Activity activity, Aweme aweme, int i) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return C38667b.m78457a(activity, aweme.getAwemeRawAd().getFormUrl(), aweme, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final boolean mo65919a(Context context, String str, String str2) {
        return C38767w.m78639a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final boolean mo65920a(Context context, String str, boolean z) {
        return C38767w.m78643a(context, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az
    /* renamed from: a */
    public final boolean mo65918a(Context context, Aweme aweme, int i, AbstractC38029b bVar) {
        return C38767w.m78666a(context, aweme, i, bVar);
    }
}
