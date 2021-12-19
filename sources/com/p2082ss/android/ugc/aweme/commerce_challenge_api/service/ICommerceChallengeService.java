package com.p2082ss.android.ugc.aweme.commerce_challenge_api.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService */
public interface ICommerceChallengeService {
    static {
        Covode.recordClassIndex(44936);
    }

    /* renamed from: a */
    UrlModel mo65376a(String str, boolean z, boolean z2);

    /* renamed from: a */
    AbstractC37540a mo65377a();

    /* renamed from: a */
    Aweme mo65378a(Aweme aweme);

    /* renamed from: a */
    void mo65379a(int i);

    /* renamed from: a */
    void mo65380a(Uri uri, String str);

    /* renamed from: a */
    void mo65381a(TextView textView, Aweme aweme, SpannableString spannableString, String str);

    /* renamed from: a */
    void mo65382a(AbstractC37537a aVar);

    /* renamed from: a */
    void mo65383a(Challenge challenge);

    /* renamed from: a */
    void mo65384a(TextExtraStruct textExtraStruct);

    /* renamed from: a */
    void mo65385a(MentionTextView mentionTextView, Aweme aweme, String str);

    /* renamed from: a */
    void mo65386a(String str);

    /* renamed from: a */
    void mo65387a(String str, String str2);

    /* renamed from: a */
    boolean mo65388a(Context context, String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2);

    /* renamed from: a */
    boolean mo65389a(Context context, String str, boolean z, TextView textView, boolean z2, String str2);

    /* renamed from: b */
    void mo65390b();

    /* renamed from: b */
    void mo65391b(String str, String str2);

    /* renamed from: b */
    boolean mo65392b(Challenge challenge);

    /* renamed from: b */
    boolean mo65393b(String str);

    /* renamed from: c */
    LinkedHashMap<String, Bitmap> mo65394c();

    /* renamed from: c */
    boolean mo65395c(Challenge challenge);

    /* renamed from: d */
    boolean mo65396d();
}
