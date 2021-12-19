package com.p2082ss.android.ugc.aweme.utils;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.C33492am;
import com.p2082ss.android.ugc.aweme.api.C33532b;
import com.p2082ss.android.ugc.aweme.api.IAppWidgetApi;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.model.AppWidgetStruct;
import com.p2082ss.android.ugc.aweme.model.ChallengeStruct;
import com.p2082ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.o */
public final class C80604o {

    /* renamed from: a */
    static final long f180233a = TimeUnit.HOURS.toMillis(3);

    /* renamed from: b */
    static final long f180234b = TimeUnit.DAYS.toMillis(2);

    /* renamed from: c */
    public static final C80604o f180235c = new C80604o();

    private C80604o() {
    }

    static {
        Covode.recordClassIndex(93877);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.o$b */
    public static final class CallableC80606b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f180240a;

        /* renamed from: b */
        final /* synthetic */ Integer f180241b;

        /* renamed from: c */
        final /* synthetic */ String f180242c;

        /* renamed from: d */
        final /* synthetic */ Integer f180243d;

        /* renamed from: e */
        final /* synthetic */ int[] f180244e;

        /* renamed from: f */
        final /* synthetic */ int[] f180245f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89171a f180246g;

        /* renamed from: h */
        final /* synthetic */ Float f180247h;

        /* renamed from: i */
        final /* synthetic */ int[] f180248i;

        /* renamed from: j */
        final /* synthetic */ int[] f180249j;

        static {
            Covode.recordClassIndex(93879);
        }

        CallableC80606b(Context context, Integer num, String str, Integer num2, int[] iArr, int[] iArr2, AbstractC89171a aVar, Float f, int[] iArr3, int[] iArr4) {
            this.f180240a = context;
            this.f180241b = num;
            this.f180242c = str;
            this.f180243d = num2;
            this.f180244e = iArr;
            this.f180245f = iArr2;
            this.f180246g = aVar;
            this.f180247h = f;
            this.f180248i = iArr3;
            this.f180249j = iArr4;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AppWidgetStruct b;
            AppWidgetStruct b2;
            Bitmap bitmap = null;
            if (C80580in.m139689d()) {
                C89219l.m154721d("is kids mode", "");
                Context context = this.f180240a;
                Integer num = this.f180241b;
                String str = this.f180242c;
                Integer num2 = this.f180243d;
                int[] iArr = this.f180244e;
                int[] iArr2 = this.f180245f;
                if (!(num == null || num2 == null || iArr2 == null)) {
                    int length = iArr2.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = iArr2[i];
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), num2.intValue());
                        remoteViews.setImageViewResource(R.id.c0p, R.drawable.ao0);
                        remoteViews.setTextViewText(R.id.f6d, context.getResources().getString(R.string.ud));
                        remoteViews.setTextViewText(R.id.f6g, context.getResources().getString(R.string.u8));
                        remoteViews.setTextViewText(R.id.f71, "");
                        if (iArr != null) {
                            for (int i3 : iArr) {
                                remoteViews.setImageViewBitmap(i3, bitmap);
                            }
                        }
                        Intent a = AppWidgetLinkProxyActivity.C80171a.m138931a(context, str);
                        a.putExtra("extra_jump_type", 3);
                        PendingIntent activity = PendingIntent.getActivity(context, 0, a, 134217728);
                        C89219l.m154716b(activity, "");
                        remoteViews.setOnClickPendingIntent(R.id.dnb, activity);
                        remoteViews.setOnClickPendingIntent(R.id.c0r, activity);
                        if (num.intValue() != C33492am.f79562b) {
                            remoteViews.setOnClickPendingIntent(R.id.c0p, activity);
                            remoteViews.setOnClickPendingIntent(R.id.f6g, activity);
                            remoteViews.setOnClickPendingIntent(R.id.f6d, activity);
                            if (iArr != null) {
                                for (int i4 : iArr) {
                                    remoteViews.setOnClickPendingIntent(i4, activity);
                                }
                            }
                        }
                        AppWidgetManager.getInstance(context).updateAppWidget(i2, remoteViews);
                        i++;
                        bitmap = null;
                    }
                }
                AbstractC89171a aVar = this.f180246g;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                C89219l.m154721d("not kids mode", "");
                long currentTimeMillis = System.currentTimeMillis();
                long j = C80602n.m139746a().getLong("keva_key_last_cache_time", 0);
                long j2 = currentTimeMillis - j;
                C89219l.m154721d("curTime: " + currentTimeMillis + ", lastCacheTime: " + j + ", deltaTime: " + j2, "");
                if (j2 <= 0 || j2 >= C80604o.f180233a || (b2 = C80602n.f180230b.mo123801b()) == null) {
                    try {
                        String str2 = this.f180242c;
                        C89219l.m154721d("hashtag", "");
                        C89219l.m154721d(str2, "");
                        C39162r.m79460a("widget_request", new C33744d().mo59983a("request_type", "hashtag").mo59983a("widget_type", str2).f79943a);
                        T t = ((IAppWidgetApi) C33532b.f79643a.getValue()).fetchChallenge(1, C80602n.m139746a().getLong("keva_key_request_cursor", 0), 4).execute().f52262b;
                        C89219l.m154716b(t, "");
                        T t2 = t;
                        C80602n.m139746a().storeLong("keva_key_last_cache_time", System.currentTimeMillis());
                        C80602n.f180229a = t2;
                        C80602n.m139746a().storeString("keva_key_cache_data", new C27910f().mo46674b(t2));
                        C80602n.m139746a().storeLong("keva_key_request_cursor", t2.getCursor());
                        for (int i5 : this.f180245f) {
                            C80604o.m139750a(this.f180240a, this.f180241b.intValue(), this.f180242c, i5, this.f180243d.intValue(), this.f180244e, this.f180247h, this.f180248i, this.f180249j, t2);
                        }
                        C80608p.m139764a("hashtag", this.f180242c, 1, 0, "");
                        AbstractC89171a aVar2 = this.f180246g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                    } catch (Exception e) {
                        String str3 = this.f180242c;
                        int a2 = C16105a.m29903a(e, (String[]) null);
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        C80608p.m139764a("hashtag", str3, 0, a2, message);
                        if (j2 > 0 && j2 < C80604o.f180234b && (b = C80602n.f180230b.mo123801b()) != null) {
                            C89219l.m154721d("long expired cache is valid, use it directly", "");
                            for (int i6 : this.f180245f) {
                                C80604o.m139750a(this.f180240a, this.f180241b.intValue(), this.f180242c, i6, this.f180243d.intValue(), this.f180244e, this.f180247h, this.f180248i, this.f180249j, b);
                            }
                        }
                        AbstractC89171a aVar3 = this.f180246g;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                    }
                } else {
                    C89219l.m154721d("cache is valid, use it directly", "");
                    for (int i7 : this.f180245f) {
                        C80604o.m139750a(this.f180240a, this.f180241b.intValue(), this.f180242c, i7, this.f180243d.intValue(), this.f180244e, this.f180247h, this.f180248i, this.f180249j, b2);
                    }
                    AbstractC89171a aVar4 = this.f180246g;
                    if (aVar4 != null) {
                        aVar4.invoke();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.o$a */
    public static final class C80605a extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ RemoteViews f180236a;

        /* renamed from: b */
        final /* synthetic */ int[] f180237b;

        /* renamed from: c */
        final /* synthetic */ Context f180238c;

        /* renamed from: d */
        final /* synthetic */ int f180239d;

        static {
            Covode.recordClassIndex(93878);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            Bitmap bitmap2;
            if (bitmap != null) {
                RemoteViews remoteViews = this.f180236a;
                int[] iArr = this.f180237b;
                if (iArr != null) {
                    bitmap2 = C80608p.m139758a(iArr, bitmap);
                } else {
                    bitmap2 = null;
                }
                remoteViews.setImageViewBitmap(R.id.c0p, bitmap2);
                AppWidgetManager.getInstance(this.f180238c).updateAppWidget(this.f180239d, this.f180236a);
            }
        }

        C80605a(RemoteViews remoteViews, int[] iArr, Context context, int i) {
            this.f180236a = remoteViews;
            this.f180237b = iArr;
            this.f180238c = context;
            this.f180239d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.o$c */
    public static final class C80607c extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ Float f180250a;

        /* renamed from: b */
        final /* synthetic */ RemoteViews f180251b;

        /* renamed from: c */
        final /* synthetic */ int f180252c;

        /* renamed from: d */
        final /* synthetic */ int[] f180253d;

        /* renamed from: e */
        final /* synthetic */ Context f180254e;

        /* renamed from: f */
        final /* synthetic */ int f180255f;

        static {
            Covode.recordClassIndex(93880);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            float f;
            int width;
            int i;
            int height;
            MethodCollector.m26663i(2322);
            if (bitmap != null) {
                Float f2 = this.f180250a;
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = 1.0f;
                }
                C89219l.m154721d(bitmap, "");
                int i2 = 0;
                if ((((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth()) < f) {
                    i = bitmap.getHeight();
                    width = (int) (((float) i) / f);
                    i2 = (bitmap.getWidth() - width) / 2;
                    height = 0;
                } else {
                    width = bitmap.getWidth();
                    i = (int) (((float) width) * f);
                    height = (bitmap.getHeight() - i) / 2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, i2, height, width, i);
                C89219l.m154716b(createBitmap, "");
                this.f180251b.setImageViewBitmap(this.f180252c, C80608p.m139758a(this.f180253d, createBitmap));
                AppWidgetManager.getInstance(this.f180254e).updateAppWidget(this.f180255f, this.f180251b);
                MethodCollector.m26664o(2322);
                return;
            }
            MethodCollector.m26664o(2322);
        }

        C80607c(Float f, RemoteViews remoteViews, int i, int[] iArr, Context context, int i2) {
            this.f180250a = f;
            this.f180251b = remoteViews;
            this.f180252c = i;
            this.f180253d = iArr;
            this.f180254e = context;
            this.f180255f = i2;
        }
    }

    /* renamed from: a */
    private static PendingIntent m139748a(Context context, String str, ChallengeStruct challengeStruct) {
        String str2;
        Intent a = AppWidgetLinkProxyActivity.C80171a.m138931a(context, str);
        a.putExtra("extra_jump_type", 1);
        Challenge challenge = challengeStruct.getChallenge();
        if (challenge == null || (str2 = challenge.getCid()) == null) {
            str2 = "";
        }
        a.putExtra("extra_challenge_id", str2);
        PendingIntent activity = PendingIntent.getActivity(context, 0, a, 134217728);
        C89219l.m154716b(activity, "");
        return activity;
    }

    /* renamed from: a */
    private static void m139751a(Context context, int i, String str, RemoteViews remoteViews, int[] iArr, ChallengeStruct challengeStruct) {
        String str2;
        Aweme aweme;
        if (i == C33492am.f79562b) {
            remoteViews.setOnClickPendingIntent(R.id.dnb, m139748a(context, str, challengeStruct));
            return;
        }
        PendingIntent a = m139748a(context, str, challengeStruct);
        remoteViews.setOnClickPendingIntent(R.id.c0r, a);
        remoteViews.setOnClickPendingIntent(R.id.c0p, a);
        remoteViews.setOnClickPendingIntent(R.id.f6g, a);
        remoteViews.setOnClickPendingIntent(R.id.f6d, a);
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                int i5 = i3 + 1;
                Intent a2 = AppWidgetLinkProxyActivity.C80171a.m138931a(context, str);
                a2.putExtra("extra_jump_type", 2);
                Challenge challenge = challengeStruct.getChallenge();
                if (challenge == null || (str2 = challenge.getCid()) == null) {
                    str2 = "";
                }
                a2.putExtra("extra_challenge_id", str2);
                List<Aweme> awemeList = challengeStruct.getAwemeList();
                if (awemeList != null) {
                    aweme = awemeList.get(i3);
                } else {
                    aweme = null;
                }
                a2.putExtra("extra_aweme", aweme);
                PendingIntent activity = PendingIntent.getActivity(context, i4, a2, 134217728);
                C89219l.m154716b(activity, "");
                remoteViews.setOnClickPendingIntent(i4, activity);
                i2++;
                i3 = i5;
            }
        }
    }

    /* renamed from: a */
    private static void m139749a(Context context, int i, int i2, RemoteViews remoteViews, int[] iArr, Float f, ChallengeStruct challengeStruct, int[] iArr2) {
        List<Aweme> awemeList;
        Aweme aweme;
        Video video;
        UrlModel cover;
        List<String> urlList;
        if (i != C33492am.f79562b && (awemeList = challengeStruct.getAwemeList()) != null && !awemeList.isEmpty() && iArr != null) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr[i3];
                int i6 = i4 + 1;
                if (i4 < awemeList.size() && (aweme = awemeList.get(i4)) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && !urlList.isEmpty()) {
                    if (iArr2 != null) {
                        String str = urlList.get(0);
                        C89219l.m154716b(str, "");
                        context = context;
                        C80608p.m139762a(context, str, new C80607c(f, remoteViews, i5, iArr2, context, i2));
                    }
                    i3++;
                    i4 = i6;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m139752a(Context context, Integer num, Integer num2, int[] iArr, Float f, int[] iArr2, String str, int[] iArr3, int[] iArr4) {
        m139753a(context, num, num2, iArr, f, iArr2, str, iArr3, iArr4, (AbstractC89171a<C89391z>) null);
    }

    /* renamed from: a */
    public static void m139750a(Context context, int i, String str, int i2, int i3, int[] iArr, Float f, int[] iArr2, int[] iArr3, AppWidgetStruct appWidgetStruct) {
        long j;
        String str2;
        String str3 = "";
        C89219l.m154721d("AppWidgetId: " + i2 + ", bindData", str3);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i3);
        List<ChallengeStruct> challengeStructList = appWidgetStruct.getChallengeStructList();
        if (challengeStructList != null && !challengeStructList.isEmpty()) {
            List<ChallengeStruct> challengeStructList2 = appWidgetStruct.getChallengeStructList();
            if (challengeStructList2 == null) {
                C89219l.m154715b();
            }
            ChallengeStruct challengeStruct = challengeStructList2.get(0);
            List<String> coverUrlList = challengeStruct.getCoverUrlList();
            if (coverUrlList != null && !coverUrlList.isEmpty()) {
                C80608p.m139762a(context, coverUrlList.get(0), new C80605a(remoteViews, iArr2, context, i2));
            }
            Challenge challenge = challengeStruct.getChallenge();
            if (challenge != null) {
                j = challenge.getDisplayCount();
            } else {
                j = 0;
            }
            String a = C53437b.m98615a(j);
            C17191a.C17192a aVar = new C17191a.C17192a();
            Resources resources = context.getResources();
            C89219l.m154716b(resources, str3);
            C17191a aVar2 = aVar.mo27176a(resources, R.string.aac, a.toString()).f40973a;
            StringBuilder sb = new StringBuilder("#");
            Challenge challenge2 = challengeStruct.getChallenge();
            if (challenge2 == null || (str2 = challenge2.getChallengeName()) == null) {
                str2 = str3;
            }
            remoteViews.setTextViewText(R.id.f6d, sb.append(str2).toString());
            String desc = challengeStruct.getDesc();
            if (desc != null) {
                str3 = desc;
            }
            remoteViews.setTextViewText(R.id.f6g, str3);
            remoteViews.setTextViewText(R.id.f71, aVar2);
            m139749a(context, i, i2, remoteViews, iArr, f, challengeStruct, iArr3);
            m139751a(context, i, str, remoteViews, iArr, challengeStruct);
            AppWidgetManager.getInstance(context).updateAppWidget(i2, remoteViews);
        }
    }

    /* renamed from: a */
    public static void m139753a(Context context, Integer num, Integer num2, int[] iArr, Float f, int[] iArr2, String str, int[] iArr3, int[] iArr4, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (num != null && num2 != null && iArr2 != null && iArr2.length != 0) {
            C1731i.m5640b(new CallableC80606b(context, num, str, num2, iArr, iArr2, aVar, f, iArr3, iArr4), C1731i.f5562a);
        }
    }
}
