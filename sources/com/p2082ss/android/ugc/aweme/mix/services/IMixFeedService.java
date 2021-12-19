package com.p2082ss.android.ugc.aweme.mix.services;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59388b;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59389c;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59390d;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;

/* renamed from: com.ss.android.ugc.aweme.mix.services.IMixFeedService */
public interface IMixFeedService {
    static {
        Covode.recordClassIndex(70336);
    }

    /* renamed from: a */
    RecyclerView.ViewHolder mo97305a(ViewGroup viewGroup, boolean z, boolean z2, String str, AbstractC59393g gVar);

    /* renamed from: a */
    C23226a mo97306a(Context context, String str, String str2, Aweme aweme, String str3, String str4, String str5);

    /* renamed from: a */
    void mo97307a(Activity activity, Aweme aweme, AbstractC59387a aVar, String str, String str2);

    /* renamed from: a */
    void mo97308a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo97309a(Activity activity, AbstractC59388b bVar, String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo97310a(Context context);

    /* renamed from: a */
    void mo97311a(Context context, Bundle bundle);

    /* renamed from: a */
    void mo97312a(Context context, Bundle bundle, int i, String str, String str2);

    /* renamed from: a */
    void mo97313a(Context context, Bundle bundle, String str, String str2, Long l, String str3);

    /* renamed from: a */
    void mo97314a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, C59538b bVar, Float f, String str6);

    /* renamed from: a */
    void mo97315a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, boolean z, C59538b bVar, String str6);

    /* renamed from: a */
    void mo97316a(AbstractC59390d dVar);

    /* renamed from: a */
    void mo97317a(String str, String str2, Context context);

    /* renamed from: a */
    void mo97318a(String str, String str2, AbstractC59389c cVar);

    /* renamed from: a */
    void mo97319a(String str, String str2, String str3, String str4, float f, C59538b bVar);

    /* renamed from: a */
    void mo97320a(String str, String str2, String str3, String str4, C59538b bVar);

    /* renamed from: a */
    void mo97321a(String str, String str2, String str3, String str4, String str5, C59538b bVar);

    /* renamed from: a */
    void mo97322a(boolean z);

    /* renamed from: a */
    boolean mo97323a();

    /* renamed from: a */
    boolean mo97324a(Aweme aweme);

    /* renamed from: b */
    boolean mo97325b();

    /* renamed from: b */
    boolean mo97326b(Aweme aweme);

    /* renamed from: c */
    boolean mo97327c();

    /* renamed from: d */
    int mo97328d();

    /* renamed from: e */
    void mo97329e();

    /* renamed from: f */
    boolean mo97330f();

    /* renamed from: g */
    void mo97331g();

    /* renamed from: h */
    int mo97332h();

    /* renamed from: i */
    boolean mo97333i();

    /* renamed from: j */
    boolean mo97334j();

    /* renamed from: com.ss.android.ugc.aweme.mix.services.IMixFeedService$a */
    public static final class C59922a {
        static {
            Covode.recordClassIndex(70337);
        }

        /* renamed from: a */
        public static /* synthetic */ void m109402a(IMixFeedService iMixFeedService, String str, String str2, String str3, String str4, float f, C59538b bVar, int i) {
            if ((i & 16) != 0) {
                f = 0.0f;
            }
            if ((i & 32) != 0) {
                bVar = null;
            }
            iMixFeedService.mo97319a(str, str2, str3, str4, f, bVar);
        }
    }
}
