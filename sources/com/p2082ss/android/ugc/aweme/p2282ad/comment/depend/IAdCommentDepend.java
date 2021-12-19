package com.p2082ss.android.ugc.aweme.p2282ad.comment.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend */
public interface IAdCommentDepend extends AbstractC39043a {
    static {
        Covode.recordClassIndex(39986);
    }

    /* renamed from: a */
    Widget mo59050a(AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    String mo59051a();

    /* renamed from: a */
    List<TextExtraStruct> mo59052a(Context context, Aweme aweme, C38255s sVar);

    /* renamed from: a */
    List<TextExtraStruct> mo59053a(C38255s sVar);

    /* renamed from: a */
    List<TextExtraStruct> mo59054a(C38255s sVar, AwemeRawAd awemeRawAd, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    void mo59055a(Context context, C38214ac acVar, Aweme aweme);

    /* renamed from: a */
    void mo59056a(Context context, Aweme aweme);

    /* renamed from: a */
    void mo59057a(Context context, Aweme aweme, String str);

    /* renamed from: a */
    void mo59058a(Context context, Aweme aweme, String str, String str2);

    /* renamed from: a */
    void mo59059a(Context context, User user);

    /* renamed from: a */
    void mo59060a(Context context, String str);

    /* renamed from: a */
    void mo59061a(Context context, String str, String str2);

    /* renamed from: a */
    void mo59062a(Context context, String str, String str2, String str3);

    /* renamed from: a */
    void mo59063a(AwemeRawAd awemeRawAd);

    /* renamed from: a */
    void mo59064a(String str, Context context, C38214ac acVar, Aweme aweme, String str2);

    /* renamed from: a */
    void mo59065a(String str, String str2, Aweme aweme, boolean z);

    /* renamed from: a */
    boolean mo59066a(Context context, Aweme aweme, int i, AbstractC38029b bVar);

    /* renamed from: a */
    boolean mo59067a(Aweme aweme);

    /* renamed from: a */
    boolean mo59068a(String str);

    /* renamed from: b */
    Widget mo59069b(AbstractC89171a<C89391z> aVar);

    /* renamed from: b */
    String mo59070b(C38255s sVar);
}
