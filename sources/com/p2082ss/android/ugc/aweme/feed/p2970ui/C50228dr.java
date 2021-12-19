package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.experiment.C46759bu;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50467x;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50531ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dr */
public final class C50228dr extends AbstractC49544a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C50229a f115986b = new C50229a((byte) 0);

    /* renamed from: a */
    public C50467x f115987a;

    static {
        Covode.recordClassIndex(59354);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(67, new RunnableC90250g(C50228dr.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.dr$a */
    public static final class C50229a {
        static {
            Covode.recordClassIndex(59355);
        }

        private C50229a() {
        }

        public /* synthetic */ C50229a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.dr$c */
    static final class RunnableC50231c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50228dr f115989a;

        static {
            Covode.recordClassIndex(59357);
        }

        RunnableC50231c(C50228dr drVar) {
            this.f115989a = drVar;
        }

        public final void run() {
            DataCenter dataCenter;
            C50467x xVar = this.f115989a.f115987a;
            if (xVar != null && (dataCenter = this.f115989a.f113958Q) != null) {
                xVar.f116568d = dataCenter;
            }
        }
    }

    public C50228dr(View view) {
        super(view, ((Boolean) C46759bu.f108958d.getValue()).booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, C50230b.f115988a);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        this.f113958Q.mo60189a("follow_button_interaction", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("show_expose_sharer_info_view", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("follow_success", (AbstractC1214u<C33942b>) this.f113951J);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        Context context = this.f113959R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f113961T = C1870c.m6045a((Activity) context, (int) R.layout.t3);
        this.f115987a = new C50467x(this.f113961T, this.f113959R);
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50231c(this)));
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.dr$b */
    static final class C50230b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C50230b f115988a = new C50230b();

        static {
            Covode.recordClassIndex(59356);
        }

        C50230b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AwemeRelationRecommendModel relationRecommendInfo;
            User author;
            List<AwemeHybridLabelModel> hybridLabels;
            Aweme aweme = (Aweme) obj;
            C89219l.m154721d(aweme, "");
            if (C47008he.m90283b() || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((aweme.getMutualRelation() == null && ((hybridLabels = aweme.getHybridLabels()) == null || hybridLabels.size() <= 0)) || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 0 || C50531ag.m94723d(aweme.getAid()))) {
                return false;
            }
            return true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        C50467x xVar;
        C89219l.m154721d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (TextUtils.equals(C59208ac.m108758a(this.f113953L), followStatus.userId) && (xVar = this.f115987a) != null && xVar.f116566b != null && xVar.f116567c != null && xVar.f116565a != null) {
            if (followStatus.followFrom != 13) {
                xVar.mo85713b();
            }
            C50467x.RunnableC50473d dVar = new C50467x.RunnableC50473d(xVar, followStatus);
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                dVar.run();
                return;
            }
            View view = xVar.f116565a;
            if (view != null) {
                view.post(dVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        String str;
        C50467x xVar;
        String str2;
        String aid;
        C50467x xVar2;
        super.mo80938c(bVar);
        String str3 = null;
        if (bVar != null && (str = bVar.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 827882451) {
                if (hashCode == 1245120163 && str.equals("show_expose_sharer_info_view") && (xVar2 = this.f115987a) != null) {
                    xVar2.mo85713b();
                }
            } else if (!str.equals("follow_button_interaction")) {
            } else {
                if (bVar.mo60212a() instanceof C50323k.EnumC50325b) {
                    C50467x xVar3 = this.f115987a;
                    if (xVar3 != null) {
                        Object a = bVar.mo60212a();
                        C89219l.m154716b(a, "");
                        C50323k.EnumC50325b bVar2 = (C50323k.EnumC50325b) a;
                        C89219l.m154721d(bVar2, "");
                        if (xVar3.f116569e != null && xVar3.f116566b != null && C47008he.m90282a() == 3) {
                            Aweme aweme = xVar3.f116569e;
                            if (aweme != null) {
                                str2 = aweme.getAid();
                            } else {
                                str2 = null;
                            }
                            if (!C50531ag.m94720a(str2)) {
                                if (xVar3.f116570f) {
                                    xVar3.f116570f = false;
                                    return;
                                }
                                C49559p.f113984a.mo81305a(new RunnableC49561r(false, new C50467x.RunnableC50474e(xVar3)));
                                Aweme aweme2 = xVar3.f116569e;
                                if (!(aweme2 == null || (aid = aweme2.getAid()) == null)) {
                                    C50531ag.f116795a.put(aid, true);
                                }
                                Aweme aweme3 = xVar3.f116569e;
                                if (aweme3 != null) {
                                    str3 = aweme3.getAid();
                                }
                                C89219l.m154721d(bVar2, "");
                                if (str3 != null) {
                                    C50531ag.f116796b.put(str3, bVar2);
                                }
                                C50476y.m94635a(xVar3.f116569e, C50323k.EnumC50324a.SHOW, bVar2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                Integer num = (Integer) bVar.mo60212a();
                if (num != null && num.intValue() == 0 && (xVar = this.f115987a) != null) {
                    xVar.f116570f = true;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        User user;
        Aweme aweme;
        User user2;
        Aweme aweme2;
        AwemeRelationRecommendModel relationRecommendInfo;
        Aweme aweme3;
        Aweme aweme4;
        List<AwemeHybridLabelModel> hybridLabels;
        String str = null;
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!TextUtils.equals(bVar.f80277a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aweme_state", this.f113953L);
        Aweme aweme5 = this.f113953L;
        if (aweme5 != null) {
            user = aweme5.getAuthor();
        } else {
            user = null;
        }
        hashMap.put("author_state", user);
        C50467x xVar = this.f115987a;
        if (xVar != null) {
            VideoItemParams videoItemParams = (VideoItemParams) bVar.mo60212a();
            C89219l.m154721d(hashMap, "");
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            xVar.f116569e = aweme;
            Aweme aweme6 = xVar.f116569e;
            if (aweme6 != null) {
                user2 = aweme6.getAuthor();
            } else {
                user2 = null;
            }
            boolean z = false;
            if (!(C47008he.m90283b() || (aweme2 = xVar.f116569e) == null || (relationRecommendInfo = aweme2.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((((aweme3 = xVar.f116569e) == null || aweme3.getMutualRelation() == null) && ((aweme4 = xVar.f116569e) == null || (hybridLabels = aweme4.getHybridLabels()) == null || hybridLabels.size() <= 0)) || user2 == null || user2.getFollowStatus() != 0))) {
                Aweme aweme7 = xVar.f116569e;
                if (aweme7 != null) {
                    str = aweme7.getAid();
                }
                if (!C50531ag.m94723d(str)) {
                    z = true;
                }
            }
            hashMap.put("need show follow button", Boolean.valueOf(z));
        }
        return new C33942b("ui_state", hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        String str;
        int i;
        float f;
        MethodCollector.m26663i(5090);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(5090);
            return;
        }
        C50467x xVar = this.f115987a;
        if (xVar != null) {
            Object a = bVar.mo60212a();
            C89219l.m154716b(a, "");
            HashMap hashMap = (HashMap) a;
            C89219l.m154721d(hashMap, "");
            if (xVar.f116569e != null) {
                Object obj = hashMap.get("need show follow button");
                if (obj == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    MethodCollector.m26664o(5090);
                    throw nullPointerException;
                } else if (((Boolean) obj).booleanValue()) {
                    User user = (User) hashMap.get("author_state");
                    if (user == null) {
                        MethodCollector.m26664o(5090);
                        return;
                    }
                    Aweme aweme = xVar.f116569e;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (C50531ag.m94720a(str)) {
                        i = 8;
                        f = 270.0f;
                    } else {
                        i = 0;
                        f = 131.0f;
                    }
                    NewFollowButton newFollowButton = xVar.f116566b;
                    if (newFollowButton != null) {
                        ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                        Resources system2 = Resources.getSystem();
                        C89219l.m154709a((Object) system2, "");
                        layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, f, system2.getDisplayMetrics()));
                        newFollowButton.setLayoutParams(layoutParams);
                        newFollowButton.setAlpha(1.0f);
                        newFollowButton.setVisibility(0);
                        newFollowButton.mo73175a(user.getFollowStatus(), user.getFollowerStatus());
                    }
                    TuxButton tuxButton = xVar.f116567c;
                    if (tuxButton != null) {
                        ViewGroup.LayoutParams layoutParams2 = tuxButton.getLayoutParams();
                        Resources system3 = Resources.getSystem();
                        C89219l.m154709a((Object) system3, "");
                        layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
                        Resources system4 = Resources.getSystem();
                        C89219l.m154709a((Object) system4, "");
                        layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, 131.0f, system4.getDisplayMetrics()));
                        tuxButton.setLayoutParams(layoutParams2);
                        tuxButton.setAlpha(1.0f);
                        tuxButton.setVisibility(i);
                        tuxButton.mo37349a(true);
                        tuxButton.setText(tuxButton.getResources().getText(R.string.dg1));
                    }
                    View view = xVar.f116565a;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        Resources system5 = Resources.getSystem();
                        C89219l.m154709a((Object) system5, "");
                        layoutParams3.height = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system5.getDisplayMetrics()));
                        Resources system6 = Resources.getSystem();
                        C89219l.m154709a((Object) system6, "");
                        layoutParams3.width = C89241a.m154730a(TypedValue.applyDimension(1, 270.0f, system6.getDisplayMetrics()));
                        view.setLayoutParams(layoutParams3);
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                        MethodCollector.m26664o(5090);
                        return;
                    }
                    MethodCollector.m26664o(5090);
                    return;
                } else {
                    xVar.mo85713b();
                }
            }
            MethodCollector.m26664o(5090);
            return;
        }
        MethodCollector.m26664o(5090);
    }
}
