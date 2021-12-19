package com.p2082ss.android.ugc.aweme.kids.profile.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.profile.base.NoticeView;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget */
public class MyProfileReportWidget extends Widget implements AbstractC33974au {

    /* renamed from: i */
    public static final C57779a f131795i = new C57779a((byte) 0);

    /* renamed from: g */
    public View f131796g;

    /* renamed from: h */
    public AnimatorSet f131797h;

    static {
        Covode.recordClassIndex(67766);
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget$a */
    public static final class C57779a {
        static {
            Covode.recordClassIndex(67767);
        }

        private C57779a() {
        }

        public /* synthetic */ C57779a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget$b */
    public static final class C57780b implements NoticeView.AbstractC57758a {

        /* renamed from: a */
        final /* synthetic */ NoticeView f131798a;

        static {
            Covode.recordClassIndex(67768);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.profile.base.NoticeView.AbstractC57758a
        /* renamed from: b */
        public final void mo95083b() {
            this.f131798a.setVisibility(8);
            Keva.getRepo("ftc_report").storeLong("ftc_report_last_show_time", System.currentTimeMillis());
            if (Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0) == 0) {
                Keva.getRepo("ftc_report").storeLong("ftc_report_first_show_time", System.currentTimeMillis());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.profile.base.NoticeView.AbstractC57758a
        /* renamed from: a */
        public final void mo95082a() {
            this.f131798a.setVisibility(8);
            IBulletService f = BulletService.m71938f();
            Context a = C17867d.m33078a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("hide_nav_bar", true);
            f.mo61853a(a, "https://www.tiktok.com/aweme/inapp/v2/c_feedback", bundle);
            Keva.getRepo("ftc_report").storeLong("ftc_report_last_show_time", System.currentTimeMillis());
            if (Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0) == 0) {
                Keva.getRepo("ftc_report").storeLong("ftc_report_first_show_time", System.currentTimeMillis());
            }
        }

        C57780b(NoticeView noticeView) {
            this.f131798a = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget$c */
    static final class RunnableC57781c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MyProfileReportWidget f131799a;

        /* renamed from: b */
        final /* synthetic */ View f131800b;

        static {
            Covode.recordClassIndex(67769);
        }

        RunnableC57781c(MyProfileReportWidget myProfileReportWidget, View view) {
            this.f131799a = myProfileReportWidget;
            this.f131800b = view;
        }

        public final void run() {
            this.f131799a.f131797h = new AnimatorSet();
            View view = this.f131799a.f131796g;
            if (view == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = this.f131799a.f131797h;
            if (animatorSet != null) {
                animatorSet.playTogether(ofFloat);
            }
            AnimatorSet animatorSet2 = this.f131799a.f131797h;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(200L);
            }
            AnimatorSet animatorSet3 = this.f131799a.f131797h;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            this.f131800b.setVisibility(0);
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        Integer userPeriod;
        super.mo39080c();
        AbstractC57153a b = KidsAccountServiceImpl.m104406h().mo94318b();
        if (b != null && (userPeriod = b.getUserPeriod()) != null && userPeriod.intValue() == 1) {
            long j = Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0);
            if (j != 0 && System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(30)) {
                return;
            }
            if (System.currentTimeMillis() - Keva.getRepo("ftc_report").getLong("ftc_report_last_show_time", 0) > TimeUnit.DAYS.toMillis(1)) {
                View view = this.f56005e;
                if (view == null) {
                    C89219l.m154715b();
                }
                NoticeView noticeView = (NoticeView) view.findViewById(R.id.ffg);
                if (noticeView == null) {
                    C89219l.m154715b();
                }
                noticeView.setTitleText(R.string.d7c);
                noticeView.setOnInternalClickListener(new C57780b(noticeView));
                this.f131796g = noticeView;
                noticeView.post(new RunnableC57781c(this, noticeView));
            }
        }
    }

    public MyProfileReportWidget(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f56005e = viewGroup;
    }
}
