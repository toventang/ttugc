package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e;
import com.p2082ss.android.ugc.aweme.main.p3431e.p3432a.AbstractC59079a;
import com.p2082ss.android.ugc.aweme.p4171u.C79489b;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.d */
public final class C79648d extends AbstractC59079a {

    /* renamed from: m */
    public static final C79649a f178730m = new C79649a((byte) 0);

    /* renamed from: b */
    public final C69488a f178731b;

    /* renamed from: c */
    public final boolean f178732c;

    /* renamed from: d */
    public final String f178733d;

    /* renamed from: e */
    public View f178734e;

    /* renamed from: f */
    public AnimationImageView f178735f;

    /* renamed from: g */
    public GuideView f178736g;

    /* renamed from: h */
    public SwipeUpGuideStrengthenLayout f178737h;

    /* renamed from: i */
    public final ViewGroup f178738i;

    /* renamed from: j */
    public final AbstractC39193e f178739j;

    /* renamed from: k */
    public final String f178740k;

    /* renamed from: l */
    public final boolean f178741l;

    /* renamed from: n */
    private final boolean f178742n;

    static {
        Covode.recordClassIndex(92864);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$a */
    public static final class C79649a {
        static {
            Covode.recordClassIndex(92865);
        }

        private C79649a() {
        }

        public /* synthetic */ C79649a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$c */
    public static final class RunnableC79651c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79648d f178745a;

        static {
            Covode.recordClassIndex(92867);
        }

        public RunnableC79651c(C79648d dVar) {
            this.f178745a = dVar;
        }

        public final void run() {
            this.f178745a.mo123204a();
        }
    }

    /* renamed from: b */
    public final boolean mo123205b() {
        View view = this.f178734e;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$b */
    public static final class RunnableC79650b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f178743a;

        /* renamed from: b */
        final /* synthetic */ C79648d f178744b;

        static {
            Covode.recordClassIndex(92866);
        }

        RunnableC79650b(View view, C79648d dVar) {
            this.f178743a = view;
            this.f178744b = dVar;
        }

        public final void run() {
            this.f178743a.setVisibility(8);
            this.f178744b.f178735f = null;
            GuideView guideView = this.f178744b.f178736g;
            if (guideView != null) {
                guideView.f178681a.removeAllListeners();
                guideView.f178682b.removeAllListeners();
                guideView.f178681a.end();
                guideView.f178682b.end();
                PlayView playView = guideView.f178683c;
                playView.f178709m.removeAllUpdateListeners();
                playView.f178709m.end();
            }
            this.f178744b.f178736g = null;
            this.f178744b.f178731b.mo109736a("swipe_up_guide", false);
            SpecActServiceImpl.m131497i().mo118026a(false);
        }
    }

    /* renamed from: a */
    public final void mo123204a() {
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            View view = this.f178734e;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(300).withEndAction(new RunnableC79650b(view, this)).start();
                return;
            }
            return;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable("execute UI not in main Thread"));
        C89219l.m154716b(stackTraceString, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("error_type", "UI_not_in_main");
            C34611o.m70668a("aweme_error_find_bug", jSONObject);
        } catch (Exception unused) {
            C79489b.m138201a(stackTraceString);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$d */
    public static final class RunnableC79652d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f178746a;

        /* renamed from: b */
        final /* synthetic */ C79648d f178747b;

        static {
            Covode.recordClassIndex(92868);
        }

        public RunnableC79652d(View view, C79648d dVar) {
            this.f178746a = view;
            this.f178747b = dVar;
        }

        public final void run() {
            this.f178747b.f178735f = (AnimationImageView) this.f178746a.findViewById(R.id.bw0);
            this.f178747b.f178736g = (GuideView) this.f178746a.findViewById(R.id.bw1);
            if (this.f178747b.f178732c) {
                GuideView guideView = this.f178747b.f178736g;
                if (guideView != null) {
                    guideView.setVisibility(0);
                }
                AnimationImageView animationImageView = this.f178747b.f178735f;
                if (animationImageView != null) {
                    animationImageView.setVisibility(8);
                }
                GuideView guideView2 = this.f178747b.f178736g;
                if (guideView2 != null) {
                    guideView2.f178681a.start();
                    guideView2.f178683c.f178709m.start();
                }
            } else {
                AnimationImageView animationImageView2 = this.f178747b.f178735f;
                if (animationImageView2 != null) {
                    animationImageView2.mo5833b(true);
                }
                AnimationImageView animationImageView3 = this.f178747b.f178735f;
                if (animationImageView3 != null) {
                    animationImageView3.setAnimation(this.f178747b.f178740k);
                }
                AnimationImageView animationImageView4 = this.f178747b.f178735f;
                if (animationImageView4 != null) {
                    animationImageView4.mo5826a();
                }
            }
            if (this.f178747b.f178741l) {
                AbstractC88979t.m154307b(6000, TimeUnit.MILLISECONDS).mo143268a(new AbstractC88438k(this) {
                    /* class com.p2082ss.android.ugc.aweme.p4173ug.guide.C79648d.RunnableC79652d.C796531 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC79652d f178748a;

                    static {
                        Covode.recordClassIndex(92869);
                    }

                    {
                        this.f178748a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88438k
                    /* renamed from: a */
                    public final /* synthetic */ boolean mo7718a(Object obj) {
                        C89219l.m154721d(obj, "");
                        View view = this.f178748a.f178747b.f178734e;
                        if (view == null || view.getVisibility() != 0) {
                            return false;
                        }
                        return true;
                    }
                }).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.p4173ug.guide.C79648d.RunnableC79652d.C796542 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC79652d f178749a;

                    static {
                        Covode.recordClassIndex(92870);
                    }

                    {
                        this.f178749a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f178749a.f178747b.mo123204a();
                    }
                });
            }
            SpecActServiceImpl.m131497i().mo118026a(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79648d(ViewGroup viewGroup, AbstractC39193e eVar, String str, boolean z, boolean z2) {
        super(viewGroup);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f178738i = viewGroup;
        this.f178739j = eVar;
        this.f178740k = str;
        this.f178741l = z;
        this.f178742n = z2;
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        this.f178731b = C69488a.C69489a.m122709a(context);
        this.f178732c = C16048b.m29633a().mo25411a("launch_opt_swipeup", ClientExpManager.launch_opt_swipeup()) != 1 ? false : true;
        this.f178733d = "swipeStrengthLayout";
    }
}
