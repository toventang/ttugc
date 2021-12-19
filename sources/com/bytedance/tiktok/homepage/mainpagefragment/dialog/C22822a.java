package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59044b;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.a */
public final class C22822a {

    /* renamed from: a */
    public C59044b f53891a;

    /* renamed from: b */
    public boolean f53892b;

    /* renamed from: c */
    public boolean f53893c;

    /* renamed from: d */
    public HomePageDataViewModel f53894d;

    /* renamed from: e */
    public boolean f53895e;

    static {
        Covode.recordClassIndex(26720);
    }

    /* renamed from: b */
    public final void mo37142b() {
        C59044b bVar = this.f53891a;
        if (bVar != null) {
            this.f53892b = false;
            bVar.mo96570a();
        }
    }

    /* renamed from: a */
    public final void mo37141a() {
        MethodCollector.m26663i(6538);
        C59044b bVar = this.f53891a;
        if (bVar != null) {
            if (bVar.f134415a == null) {
                bVar.f134415a = bVar.f134416b.inflate();
            }
            bVar.f134417c = new Handler(Looper.getMainLooper());
            C39162r.onEvent(MobClick.obtain().setEventName("photo_notice").setLabelName("shoot_bottom_tab"));
            EventBus.m156966a(EventBus.m156962a(), bVar);
            bVar.f134415a.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.main.p3428b.C59044b.View$OnClickListenerC590451 */

                static {
                    Covode.recordClassIndex(69390);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C59044b.this.mo96570a();
                    C39162r.onEvent(MobClick.obtain().setEventName("photo_notice_click").setLabelName("shoot_bottom_tab"));
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f134415a, "scaleX", 0.0f, 1.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.f134415a, "scaleY", 0.0f, 1.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(800L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.main.p3428b.C59044b.C590462 */

                static {
                    Covode.recordClassIndex(69391);
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    C59044b.this.f134415a.setVisibility(0);
                }
            });
            animatorSet.play(ofFloat).with(ofFloat2);
            bVar.f134417c.post(new Runnable(animatorSet) {
                /* class com.p2082ss.android.ugc.aweme.main.p3428b.C59044b.RunnableC590473 */

                /* renamed from: a */
                final /* synthetic */ AnimatorSet f134421a;

                static {
                    Covode.recordClassIndex(69392);
                }

                public final void run() {
                    this.f134421a.start();
                }

                {
                    this.f134421a = r2;
                }
            });
            bVar.f134417c.postDelayed(bVar.f134418d, 6000);
            MethodCollector.m26664o(6538);
            return;
        }
        MethodCollector.m26664o(6538);
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.a$a */
    public static final class C22823a implements AwemeChangeCallBack.AbstractC59111a {

        /* renamed from: a */
        final /* synthetic */ Keva f53896a;

        /* renamed from: b */
        final /* synthetic */ C22822a f53897b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f53898c;

        /* renamed from: d */
        final /* synthetic */ boolean f53899d;

        /* renamed from: e */
        final /* synthetic */ AbstractC23317a f53900e;

        static {
            Covode.recordClassIndex(26721);
        }

        public C22823a(Keva keva, C22822a aVar, ActivityC0945e eVar, boolean z, AbstractC23317a aVar2) {
            this.f53896a = keva;
            this.f53897b = aVar;
            this.f53898c = eVar;
            this.f53899d = z;
            this.f53900e = aVar2;
        }

        @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
        /* renamed from: a */
        public final void mo37101a(Aweme aweme) {
            String c;
            String c2;
            if (aweme != null && this.f53897b.f53895e && !this.f53897b.f53893c && !aweme.isAd() && !CommentServiceImpl.m73664e().mo63297a((Context) this.f53898c)) {
                String str = "";
                if (this.f53899d) {
                    AbstractC23317a aVar = this.f53900e;
                    if (aVar != null) {
                        aVar.mo38001a();
                    }
                    this.f53896a.storeLong("key_tutorial_last_time", System.currentTimeMillis());
                    this.f53896a.storeBoolean("key_bubble_has_shown", true);
                    HomePageDataViewModel homePageDataViewModel = this.f53897b.f53894d;
                    if (!(homePageDataViewModel == null || (c2 = homePageDataViewModel.mo89328c()) == null)) {
                        str = c2;
                    }
                    C76598h.m134183a(str, "bubble", "auto", "show");
                } else if (this.f53896a.getBoolean("key_bubble_has_shown", false)) {
                    C77260g gVar = C77260g.f173332a;
                    ActivityC0945e eVar = this.f53898c;
                    HomePageDataViewModel homePageDataViewModel2 = this.f53897b.f53894d;
                    if (!(homePageDataViewModel2 == null || (c = homePageDataViewModel2.mo89328c()) == null)) {
                        str = c;
                    }
                    gVar.mo120142a(eVar, str);
                }
                this.f53897b.f53893c = true;
            }
        }
    }
}
