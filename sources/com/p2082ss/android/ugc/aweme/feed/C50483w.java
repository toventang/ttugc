package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.w */
public final class C50483w {

    /* renamed from: a */
    public static final C50483w f116600a = new C50483w();

    private C50483w() {
    }

    static {
        Covode.recordClassIndex(59620);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.w$b */
    public static final class CallableC50485b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f116608a;

        /* renamed from: b */
        final /* synthetic */ int f116609b;

        /* renamed from: c */
        final /* synthetic */ long f116610c;

        /* renamed from: d */
        final /* synthetic */ FeedAppLogParams f116611d;

        /* renamed from: e */
        final /* synthetic */ String f116612e;

        /* renamed from: f */
        final /* synthetic */ long f116613f;

        static {
            Covode.recordClassIndex(59622);
        }

        CallableC50485b(boolean z, int i, long j, FeedAppLogParams feedAppLogParams, String str, long j2) {
            this.f116608a = z;
            this.f116609b = i;
            this.f116610c = j;
            this.f116611d = feedAppLogParams;
            this.f116612e = str;
            this.f116613f = j2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2 = "";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_first", String.valueOf(this.f116608a));
                jSONObject.put("is_success", String.valueOf(this.f116609b));
                if (this.f116608a) {
                    jSONObject.put("app_to_success", String.valueOf(this.f116610c));
                }
                FeedAppLogParams feedAppLogParams = this.f116611d;
                if (feedAppLogParams == null || feedAppLogParams.mLastFeedItemList == null) {
                    jSONObject.put("cache_count", "null");
                    jSONObject.put("is_cache", "null");
                    jSONObject.put("cache_time", "null");
                } else {
                    FeedItemList feedItemList = this.f116611d.mLastFeedItemList;
                    C89219l.m154716b(feedItemList, str2);
                    boolean z = feedItemList.isFromLocalCache;
                    jSONObject.put("is_cache", String.valueOf(z));
                    if (z) {
                        FeedItemList feedItemList2 = this.f116611d.mLastFeedItemList;
                        C89219l.m154716b(feedItemList2, str2);
                        str = String.valueOf(feedItemList2.getItems().size());
                    } else {
                        str = "-1";
                    }
                    jSONObject.put("cache_count", str);
                    if (z) {
                        str2 = String.valueOf(C34597d.m70634a().mo61049a("key_feed_cache_time"));
                    }
                    jSONObject.put("cache_time", str2);
                    if (z) {
                        jSONObject.put("cache_aid", C49710k.m93117a(this.f116611d.mLastFeedItemList));
                    }
                }
                jSONObject.put("request_method", this.f116612e);
                jSONObject.put("duration", String.valueOf(this.f116613f));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C33830n.m70668a("feed_cache_response", jSONObject);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.w$a */
    public static final class CallableC50484a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f116601a;

        /* renamed from: b */
        final /* synthetic */ FeedAppLogParams f116602b;

        /* renamed from: c */
        final /* synthetic */ boolean f116603c;

        /* renamed from: d */
        final /* synthetic */ long f116604d;

        /* renamed from: e */
        final /* synthetic */ boolean f116605e;

        /* renamed from: f */
        final /* synthetic */ String f116606f;

        /* renamed from: g */
        final /* synthetic */ String f116607g;

        static {
            Covode.recordClassIndex(59621);
        }

        CallableC50484a(int i, FeedAppLogParams feedAppLogParams, boolean z, long j, boolean z2, String str, String str2) {
            this.f116601a = i;
            this.f116602b = feedAppLogParams;
            this.f116603c = z;
            this.f116604d = j;
            this.f116605e = z2;
            this.f116606f = str;
            this.f116607g = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.C50483w.CallableC50484a.call():java.lang.Object");
        }
    }
}
