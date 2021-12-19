package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.ext.C74729a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ao */
public final class C50061ao extends C50053an {

    /* renamed from: A */
    private MutualRelationView f115572A;

    /* renamed from: p */
    public VideoTitleFollowBtn f115573p;

    /* renamed from: q */
    View f115574q;

    /* renamed from: r */
    String f115575r = "";

    /* renamed from: s */
    public int f115576s;

    /* renamed from: t */
    public int f115577t;

    /* renamed from: u */
    public int f115578u;

    /* renamed from: v */
    private View f115579v;

    /* renamed from: w */
    private TuxTextView f115580w;

    /* renamed from: x */
    private MutualRelationView f115581x;

    /* renamed from: y */
    private View f115582y;

    /* renamed from: z */
    private TuxTextView f115583z;

    static {
        Covode.recordClassIndex(59187);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$b */
    public static final class RunnableC50065b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50061ao f115588a;

        static {
            Covode.recordClassIndex(59191);
        }

        RunnableC50065b(C50061ao aoVar) {
            this.f115588a = aoVar;
        }

        public final void run() {
            int i;
            C50061ao aoVar = this.f115588a;
            View view = aoVar.f115541b;
            if (view != null) {
                i = view.getHeight();
            } else {
                i = 0;
            }
            aoVar.f115577t = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$c */
    public static final class RunnableC50066c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50061ao f115589a;

        static {
            Covode.recordClassIndex(59192);
        }

        RunnableC50066c(C50061ao aoVar) {
            this.f115589a = aoVar;
        }

        public final void run() {
            int i;
            C50061ao aoVar = this.f115589a;
            TextView textView = aoVar.f115540a;
            if (textView != null) {
                i = textView.getHeight();
            } else {
                i = 0;
            }
            aoVar.f115576s = i;
            C50061ao aoVar2 = this.f115589a;
            aoVar2.f115578u = aoVar2.f115577t - this.f115589a.f115576s;
        }
    }

    /* renamed from: d */
    private final void m93998d() {
        View view = this.f115541b;
        if (view != null) {
            view.post(new RunnableC50065b(this));
        }
        TextView textView = this.f115540a;
        if (textView != null) {
            textView.post(new RunnableC50066c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$e */
    static final class RunnableC50068e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50061ao f115591a;

        /* renamed from: b */
        final /* synthetic */ FollowStatus f115592b;

        static {
            Covode.recordClassIndex(59194);
        }

        RunnableC50068e(C50061ao aoVar, FollowStatus followStatus) {
            this.f115591a = aoVar;
            this.f115592b = followStatus;
        }

        public final void run() {
            if (!TextUtils.isEmpty(this.f115592b.userId) && TextUtils.equals(C59208ac.m108758a(this.f115591a.f115545f), this.f115592b.userId) && this.f115592b.followStatus == 1) {
                VideoTitleFollowBtn videoTitleFollowBtn = this.f115591a.f115573p;
                if (videoTitleFollowBtn != null) {
                    videoTitleFollowBtn.mo73175a(this.f115592b.followStatus, this.f115592b.followerStatus);
                }
                C50061ao aoVar = this.f115591a;
                String str = aoVar.f115575r;
                if (str != null) {
                    C50130bm.m94077a(str);
                }
                if (aoVar.f115578u > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setStartDelay(200);
                    ofFloat.setDuration(300L);
                    ofFloat.addUpdateListener(new C50067d(aoVar));
                    ofFloat.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$a */
    public static final class View$OnClickListenerC50064a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Object f115586a;

        /* renamed from: b */
        final /* synthetic */ C50061ao f115587b;

        static {
            Covode.recordClassIndex(59190);
        }

        View$OnClickListenerC50064a(Object obj, C50061ao aoVar) {
            this.f115586a = obj;
            this.f115587b = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115587b.mo85190c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ao$d */
    static final class C50067d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50061ao f115590a;

        static {
            Covode.recordClassIndex(59193);
        }

        C50067d(C50061ao aoVar) {
            this.f115590a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C50061ao aoVar = this.f115590a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int a = C89241a.m154730a(255.0f * floatValue);
            int i = (int) (((float) aoVar.f115577t) - ((1.0f - floatValue) * ((float) aoVar.f115578u)));
            View view = aoVar.f115541b;
            if (view != null) {
                Drawable background = view.getBackground();
                C89219l.m154716b(background, "");
                background.setAlpha(a);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
                if (floatValue == 0.0f) {
                    view.setBackground(new ColorDrawable(C0643b.m2378c(aoVar.f115552m, R.color.c9)));
                }
            }
            TextView textView = aoVar.f115540a;
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                int b = (int) (C13628n.m24520b(aoVar.f115552m, 8.0f) * floatValue);
                if (!C80471gb.m139483a(aoVar.f115552m)) {
                    layoutParams3.leftMargin = b;
                } else {
                    layoutParams3.rightMargin = b;
                }
                layoutParams3.topMargin = b;
                textView.setLayoutParams(layoutParams3);
            }
            VideoTitleFollowBtn videoTitleFollowBtn = aoVar.f115573p;
            if (videoTitleFollowBtn != null) {
                videoTitleFollowBtn.setAlpha(floatValue);
                if (floatValue == 0.0f) {
                    videoTitleFollowBtn.setVisibility(8);
                }
            }
            View view2 = aoVar.f115574q;
            if (view2 != null) {
                view2.setAlpha(floatValue);
            }
        }
    }

    /* renamed from: b */
    private final void m93997b(HashMap<String, Object> hashMap) {
        View view;
        float f;
        String str;
        int i;
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> taggedUsers;
        InteractionTagInfo interactionTagInfo2;
        float f2;
        TextPaint paint;
        Object obj = hashMap.get("social_video_tagged_state");
        if (obj != null && C36410g.m74111b()) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            if (!(TextUtils.isEmpty((String) obj) || 1 == 0 || (view = this.f115582y) == null)) {
                TuxTextView tuxTextView = this.f115583z;
                if (tuxTextView != null) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    tuxTextView.setText((String) obj);
                }
                TuxTextView tuxTextView2 = this.f115583z;
                float f3 = 0.0f;
                if (tuxTextView2 == null || (paint = tuxTextView2.getPaint()) == null) {
                    f = 0.0f;
                } else {
                    f = paint.measureText((String) obj);
                }
                Aweme aweme = this.f115545f;
                if (aweme == null || (interactionTagInfo2 = aweme.getInteractionTagInfo()) == null || interactionTagInfo2.getInterestLevel() != InteractionTagInterestLevel.HIGH.getLevel()) {
                    MutualRelationView mutualRelationView = this.f115572A;
                    if (mutualRelationView != null) {
                        mutualRelationView.setVisibility(8);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<InteractionTagUserInfo> taggedUsers2 = interactionTagInfo2.getTaggedUsers();
                    if (taggedUsers2 != null) {
                        ArrayList<InteractionTagUserInfo> arrayList2 = new ArrayList();
                        for (T t : taggedUsers2) {
                            if (t.getInterestLevel() == InteractionTagInterestLevel.HIGH.getLevel()) {
                                arrayList2.add(t);
                            }
                        }
                        for (InteractionTagUserInfo interactionTagUserInfo : arrayList2) {
                            arrayList.add(InteractionTagInfoKt.toMutualUser(interactionTagUserInfo));
                            if (arrayList.size() == 2) {
                                break;
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        Context context = this.f115552m;
                        if (arrayList.size() == 1) {
                            f2 = 18.0f;
                        } else {
                            f2 = 31.0f;
                        }
                        f3 = C13628n.m24520b(context, f2);
                        MutualRelationView mutualRelationView2 = this.f115572A;
                        if (mutualRelationView2 != null) {
                            mutualRelationView2.setVisibility(0);
                        }
                        MutualRelationView mutualRelationView3 = this.f115572A;
                        if (mutualRelationView3 != null) {
                            mutualRelationView3.mo125023a(new MutualStruct(0, arrayList.size(), arrayList), 4);
                        }
                        mo85185a("high_interest");
                    } else {
                        MutualRelationView mutualRelationView4 = this.f115572A;
                        if (mutualRelationView4 != null) {
                            mutualRelationView4.setVisibility(8);
                        }
                    }
                }
                float b = f + f3 + mo85188b();
                if (b > mo85180a()) {
                    mo85185a("low_interest");
                    MutualRelationView mutualRelationView5 = this.f115572A;
                    if (mutualRelationView5 != null) {
                        mutualRelationView5.setVisibility(8);
                    }
                    if (b - mo85180a() > f3) {
                        Aweme aweme2 = this.f115545f;
                        if (aweme2 == null || (interactionTagInfo = aweme2.getInteractionTagInfo()) == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null) {
                            i = 1;
                        } else {
                            i = taggedUsers.size();
                        }
                        TuxTextView tuxTextView3 = this.f115583z;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(String.valueOf(i));
                        }
                    }
                }
                view.setVisibility(0);
                view.setOnClickListener(new View$OnClickListenerC50064a(obj, this));
                HashMap<String, String> hashMap2 = this.f115553n;
                if (hashMap2 != null) {
                    Aweme aweme3 = this.f115545f;
                    if (aweme3 == null || (str = aweme3.getAid()) == null) {
                        str = "";
                    }
                    hashMap2.put(str, this.f115548i);
                }
                if (this.f115550k && !this.f115551l) {
                    this.f115551l = true;
                    mo85183a(this.f115545f);
                    return;
                }
                return;
            }
        }
        View view2 = this.f115582y;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50053an
    /* renamed from: a */
    public final void mo85186a(HashMap<String, Object> hashMap) {
        Aweme aweme;
        MatchedFriendStruct matchedFriendStruct;
        C89219l.m154721d(hashMap, "");
        super.mo85186a(hashMap);
        Object obj = hashMap.get("is_need_show_relation_view");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj).booleanValue()) {
            User user = (User) hashMap.get("author_state");
            if (user != null && (aweme = (Aweme) hashMap.get("aweme_state")) != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                Integer a = C23155d.m43641a(this.f115552m, R.attr.a4);
                if (a != null) {
                    gradientDrawable.setColor(a.intValue());
                }
                gradientDrawable.setCornerRadius(C13628n.m24520b(this.f115552m, 4.0f));
                View view = this.f115541b;
                if (view != null) {
                    view.setBackground(gradientDrawable);
                    view.getLayoutParams().height = -2;
                }
                TextView textView = this.f115540a;
                if (textView != null) {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    int b = (int) C13628n.m24520b(this.f115552m, 8.0f);
                    if (!C80471gb.m139483a(this.f115552m)) {
                        layoutParams2.leftMargin = b;
                    } else {
                        layoutParams2.rightMargin = b;
                    }
                    layoutParams2.topMargin = b;
                    textView.setLayoutParams(layoutParams2);
                }
                View view2 = this.f115574q;
                if (view2 != null) {
                    view2.setVisibility(0);
                    view2.setAlpha(1.0f);
                }
                if (aweme.getMutualRelation() != null) {
                    TuxTextView tuxTextView = this.f115580w;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                    }
                    MutualRelationView mutualRelationView = this.f115581x;
                    if (mutualRelationView != null) {
                        mutualRelationView.setTextColor(C0643b.m2378c(this.f115552m, R.color.a9));
                        mutualRelationView.setDarkMode(true);
                        mutualRelationView.setVisibility(0);
                        mutualRelationView.mo125023a(aweme.getMutualRelation(), C51487e.m95908e());
                    }
                } else {
                    User author = aweme.getAuthor();
                    if (author != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && matchedFriendStruct.getExternalRecommendReasonStruct() != null) {
                        TuxTextView tuxTextView2 = this.f115580w;
                        if (tuxTextView2 != null) {
                            C74729a.m131190a(tuxTextView2, null, aweme, Integer.valueOf(tuxTextView2.getMaxWidth()), 1);
                        }
                    } else if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
                        TuxTextView tuxTextView3 = this.f115580w;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(0);
                            tuxTextView3.setText(aweme.getHybridLabels().get(0).getText());
                        }
                        MutualRelationView mutualRelationView2 = this.f115581x;
                        if (mutualRelationView2 != null) {
                            mutualRelationView2.setVisibility(8);
                        }
                    }
                }
                VideoTitleFollowBtn videoTitleFollowBtn = this.f115573p;
                if (videoTitleFollowBtn != null) {
                    videoTitleFollowBtn.mo73175a(user.getFollowStatus(), user.getFollowerStatus());
                    videoTitleFollowBtn.setVisibility(0);
                    videoTitleFollowBtn.setAlpha(1.0f);
                }
                m93998d();
                C50130bm.m94078a(aweme.getAid(), true);
                m93997b(hashMap);
                return;
            }
            return;
        }
        View view3 = this.f115541b;
        if (view3 != null) {
            view3.setBackground(new ColorDrawable(C0643b.m2378c(this.f115552m, R.color.c9)));
        }
        TextView textView2 = this.f115540a;
        if (textView2 != null) {
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            int b2 = (int) C13628n.m24520b(this.f115552m, 0.0f);
            if (!C80471gb.m139483a(this.f115552m)) {
                layoutParams4.leftMargin = b2;
            } else {
                layoutParams4.rightMargin = b2;
            }
            layoutParams4.topMargin = b2;
            textView2.setLayoutParams(layoutParams4);
        }
        View view4 = this.f115574q;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        VideoTitleFollowBtn videoTitleFollowBtn2 = this.f115573p;
        if (videoTitleFollowBtn2 != null) {
            videoTitleFollowBtn2.setVisibility(8);
        }
        C50130bm.m94078a(this.f115575r, false);
        View view5 = this.f115582y;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        mo85187a(hashMap, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50053an
    /* renamed from: a */
    public final void mo85184a(VideoItemParams videoItemParams, HashMap<String, Object> hashMap) {
        Aweme aweme;
        AwemeRelationRecommendModel relationRecommendInfo;
        Aweme aweme2;
        Aweme aweme3;
        List<AwemeHybridLabelModel> hybridLabels;
        C89219l.m154721d(hashMap, "");
        super.mo85184a(videoItemParams, hashMap);
        Aweme aweme4 = this.f115545f;
        String str = null;
        if (aweme4 != null) {
            str = aweme4.getAid();
        }
        this.f115575r = str;
        User user = (User) hashMap.get("author_state");
        boolean z = false;
        if (!(C50130bm.m94079b(this.f115575r) || (aweme = this.f115545f) == null || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((((aweme2 = this.f115545f) == null || aweme2.getMutualRelation() == null) && ((aweme3 = this.f115545f) == null || (hybridLabels = aweme3.getHybridLabels()) == null || hybridLabels.size() <= 0)) || !C47008he.m90283b() || user == null || user.getFollowStatus() != 0))) {
            z = true;
        }
        hashMap.put("is_need_show_relation_view", Boolean.valueOf(z));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50061ao(View view, View.OnTouchListener onTouchListener, Context context, HashMap<String, String> hashMap) {
        super(view, onTouchListener, context, hashMap);
        View view2;
        View view3;
        View view4;
        MutualRelationView mutualRelationView;
        TuxTextView tuxTextView;
        VideoTitleFollowBtn videoTitleFollowBtn;
        TuxTextView tuxTextView2;
        MutualRelationView mutualRelationView2;
        View findViewById;
        C89219l.m154721d(context, "");
        View view5 = null;
        if (view != null) {
            view2 = view.findViewById(R.id.dlw);
        } else {
            view2 = null;
        }
        this.f115541b = view2;
        if (view != null) {
            view3 = view.findViewById(R.id.ces);
        } else {
            view3 = null;
        }
        this.f115579v = view3;
        if (view != null) {
            view4 = view.findViewById(R.id.ce9);
        } else {
            view4 = null;
        }
        this.f115574q = view4;
        if (view != null) {
            mutualRelationView = (MutualRelationView) view.findViewById(R.id.cp6);
        } else {
            mutualRelationView = null;
        }
        this.f115581x = mutualRelationView;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.f2b);
        } else {
            tuxTextView = null;
        }
        this.f115580w = tuxTextView;
        if (view != null) {
            videoTitleFollowBtn = (VideoTitleFollowBtn) view.findViewById(R.id.xm);
        } else {
            videoTitleFollowBtn = null;
        }
        this.f115573p = videoTitleFollowBtn;
        if (videoTitleFollowBtn != null) {
            videoTitleFollowBtn.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50061ao.View$OnClickListenerC500621 */

                /* renamed from: a */
                final /* synthetic */ C50061ao f115584a;

                static {
                    Covode.recordClassIndex(59188);
                }

                {
                    this.f115584a = r1;
                }

                public final void onClick(View view) {
                    Aweme aweme;
                    User author;
                    ClickAgent.onClick(view);
                    C50061ao aoVar = this.f115584a;
                    if (aoVar.f115545f != null && (aweme = aoVar.f115545f) != null) {
                        DataCenter dataCenter = aoVar.f115546g;
                        if (dataCenter != null) {
                            dataCenter.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                        }
                        if (view != null && view.getVisibility() == 0 && !C37699a.m76202E(aweme) && !aweme.isDelete() && (author = aweme.getAuthor()) != null) {
                            String uid = author.getUid();
                            IAccountUserService g = C31575b.m65865g();
                            C89219l.m154716b(g, "");
                            if (!TextUtils.equals(uid, g.getCurUserId())) {
                                if (C37699a.m76255aa(aweme) || C37699a.m76222Y(aweme)) {
                                    C38000g.m77050a().mo65880a(aoVar.f115552m, aweme, "plus_sign");
                                }
                                C34719f fVar = C34719f.C34720a.f82009a;
                                C89219l.m154716b(fVar, "");
                                if (!fVar.mo61395c()) {
                                    new C79459a(aoVar.f115552m).mo123050a(R.string.dcq).mo123053a();
                                } else if (aoVar.f115546g != null && author.getFollowStatus() == 0) {
                                    C49672ag agVar = new C49672ag(12, aweme);
                                    agVar.f114328n = "card_button";
                                    DataCenter dataCenter2 = aoVar.f115546g;
                                    if (dataCenter2 != null) {
                                        dataCenter2.mo60191a("feed_internal_event", agVar);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        View view6 = this.f115541b;
        if (view6 != null) {
            view6.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50061ao.View$OnClickListenerC500632 */

                /* renamed from: a */
                final /* synthetic */ C50061ao f115585a;

                static {
                    Covode.recordClassIndex(59189);
                }

                {
                    this.f115585a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    DataCenter dataCenter = this.f115585a.f115546g;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("title_view_click", (Object) null);
                    }
                }
            });
        }
        m93998d();
        if (view != null) {
            tuxTextView2 = (TuxTextView) view.findViewById(R.id.e41);
        } else {
            tuxTextView2 = null;
        }
        this.f115583z = tuxTextView2;
        if (view == null || (mutualRelationView2 = (MutualRelationView) view.findViewById(R.id.e40)) == null) {
            mutualRelationView2 = null;
        } else {
            mutualRelationView2.setSocialVideoTag(true);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            mutualRelationView2.mo125021a(a, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        }
        this.f115572A = mutualRelationView2;
        if (!(view == null || (findViewById = view.findViewById(R.id.e42)) == null)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C13628n.m24520b(context, 2.0f));
            Integer a2 = C23155d.m43641a(context, R.attr.a9);
            if (a2 != null) {
                gradientDrawable.setColor(a2.intValue());
            }
            findViewById.setBackground(gradientDrawable);
            view5 = findViewById;
        }
        this.f115582y = view5;
    }
}
