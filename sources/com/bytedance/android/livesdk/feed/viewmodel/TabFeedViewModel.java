package com.bytedance.android.livesdk.feed.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8596i;
import com.bytedance.android.livesdk.feed.AbstractC8639l;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.AbstractC8655q;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.feed.AbstractC8586e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p531g.AbstractC8592a;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.other.LiveSquareInboxRefreshIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;

public class TabFeedViewModel extends BaseFeedDataViewModel {

    /* renamed from: A */
    public AbstractC8593h.AbstractC8594a f21506A;

    /* renamed from: B */
    public boolean f21507B;

    /* renamed from: C */
    public String f21508C;

    /* renamed from: D */
    public boolean f21509D;

    /* renamed from: F */
    private long f21510F;

    /* renamed from: G */
    private AbstractC8655q f21511G;

    /* renamed from: H */
    private boolean f21512H;

    /* renamed from: I */
    private long f21513I = -1;

    /* renamed from: w */
    protected AbstractC8643m f21514w;

    /* renamed from: x */
    public int f21515x;

    /* renamed from: y */
    public int f21516y;

    /* renamed from: z */
    public AbstractC8586e f21517z;

    static {
        Covode.recordClassIndex(9584);
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    /* renamed from: g */
    public final boolean mo14996g() {
        mo14994e();
        return false;
    }

    /* renamed from: i */
    private void m17025i() {
        if (this.f21509D && this.f21481a != null) {
            this.f21481a.mo14941c();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    /* renamed from: c */
    public final void mo14992c() {
        if (this.f21512H && !this.f21509D) {
            super.mo14992c();
            this.f21509D = true;
        }
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.RxViewModel, androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        this.f21481a.mo14942d().mo14837b(this.f21517z);
        this.f21481a.mo14942d().mo14838b(this.f21506A);
        this.f21517z = null;
        super.onCleared();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    /* renamed from: f */
    public final FeedDataKey mo14995f() {
        if (TextUtils.isEmpty(this.f21493t) && this.f21514w.mo14949a(this.f21510F) != null) {
            this.f21493t = this.f21514w.mo14949a(this.f21510F).getEvent();
        }
        if (TextUtils.isEmpty(this.f21493t)) {
            this.f21493t = "video";
        }
        return FeedDataKey.m16810a(this.f21493t, mo14993d(), this.f21510F);
    }

    /* renamed from: h */
    public final boolean mo14998h() {
        if (this.f21513I == -1) {
            this.f21513I = SystemClock.elapsedRealtime();
            return false;
        } else if (SystemClock.elapsedRealtime() - this.f21513I <= ((long) (LiveSquareInboxRefreshIntervalSetting.INSTANCE.getValue() * 1000))) {
            return false;
        } else {
            this.f21481a.mo14958g();
            this.f21513I = SystemClock.elapsedRealtime();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    /* renamed from: d */
    public final String mo14993d() {
        if (!C13627m.m24498a(this.f21490q) || this.f21514w.mo14949a(this.f21510F) == null) {
            this.f21490q = m17024c(this.f21490q);
            return this.f21490q;
        }
        String url = this.f21514w.mo14949a(this.f21510F).getUrl();
        if (C7411d.m15284a() != null) {
            if (C13627m.m24499a("referral_task", C7411d.m15284a().mo13611b())) {
                url = m17023a(url, "channel_id", LiveFeedDraw.getChannelId("referral_task", "H5"));
            }
            if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                url = m17023a(url, "channel_id", "96");
            }
        }
        return m17024c(url);
    }

    /* renamed from: a */
    public final void mo14997a(boolean z) {
        this.f21512H = z;
        if (!z) {
            m17025i();
        } else {
            mo14998h();
        }
        mo14992c();
    }

    /* renamed from: c */
    private static String m17024c(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/webcast/feed/")) {
            return str;
        }
        if (C11725f.f28051c == null) {
            C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
        }
        if (!C11725f.f28051c.booleanValue() || str.contains("&debug=true")) {
            return str;
        }
        return str + "&debug=true";
    }

    /* renamed from: a */
    public static String m17023a(String str, String str2, String str3) {
        if (C13627m.m24498a(str) || C13627m.m24498a(str3)) {
            return str;
        }
        return str.replaceAll("&" + str2 + "=[^&]*", "&" + str2 + "=" + str3);
    }

    public TabFeedViewModel(AbstractC8639l lVar, AbstractC8596i iVar, AbstractC8643m mVar, AbstractC8592a aVar, AbstractC8655q qVar, long j) {
        super(lVar, iVar, aVar);
        this.f21514w = mVar;
        this.f21510F = j;
        this.f21511G = qVar;
    }
}
