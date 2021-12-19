package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDuetWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoMoreWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoReportWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoSharerInfoWidget;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.c */
public final class C50162c {

    /* renamed from: a */
    public static final C50162c f115797a = new C50162c();

    private C50162c() {
    }

    /* renamed from: a */
    public static Widget m94136a() {
        return new VideoShareWidget();
    }

    /* renamed from: b */
    public static Widget m94140b() {
        return new VideoMoreWidget();
    }

    /* renamed from: c */
    public static Widget m94141c() {
        return new VideoReportWidget();
    }

    /* renamed from: d */
    public static Widget m94142d() {
        return new VideoAntiAddictionWidget();
    }

    /* renamed from: e */
    public static Widget m94143e() {
        return new VideoMusicTitleWidget();
    }

    /* renamed from: f */
    public static Widget m94144f() {
        return new VideoMusicCoverWidget();
    }

    /* renamed from: g */
    public static Widget m94145g() {
        return new VideoProgressBarWidget();
    }

    /* renamed from: h */
    public static Widget m94146h() {
        return new VideoCommentWidget();
    }

    /* renamed from: i */
    public static Widget m94147i() {
        return new VideoSharerInfoWidget();
    }

    /* renamed from: j */
    public static Widget m94148j() {
        return new FeedAvatarWidget();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.c$a */
    public static final class C50163a implements VideoDiggWidget.AbstractC49543a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f115798a;

        static {
            Covode.recordClassIndex(59289);
        }

        C50163a(AbstractC89171a aVar) {
            this.f115798a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.AbstractC49543a
        /* renamed from: a */
        public final long mo80546a() {
            return ((Number) this.f115798a.invoke()).longValue();
        }
    }

    static {
        Covode.recordClassIndex(59288);
    }

    /* renamed from: a */
    public static Widget m94137a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        return new VideoDuetWidget(bundle);
    }

    /* renamed from: a */
    public static Widget m94138a(Bundle bundle, AbstractC89171a<Long> aVar) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(aVar, "");
        return new VideoDiggWidget(bundle, new C50163a(aVar));
    }

    /* renamed from: a */
    public static Widget m94139a(View.OnTouchListener onTouchListener, String str) {
        return new VideoAuthorInfoWidget(onTouchListener, str);
    }
}
