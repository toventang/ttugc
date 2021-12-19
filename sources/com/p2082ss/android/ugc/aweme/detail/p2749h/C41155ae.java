package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3262l.AbstractC56243a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.ae */
public final class C41155ae extends AbstractC41164af {

    /* renamed from: H */
    public static final C41156a f96173H = new C41156a((byte) 0);

    /* renamed from: F */
    public final C88411a f96174F = new C88411a();

    /* renamed from: G */
    public Map<String, Boolean> f96175G = new LinkedHashMap();

    /* renamed from: a */
    public MentionEditText f96176a;

    /* renamed from: bA */
    private View f96177bA;

    /* renamed from: bB */
    private View f96178bB;

    /* renamed from: bC */
    private View f96179bC;

    /* renamed from: bD */
    private StoryEmojiReactionView f96180bD;

    /* renamed from: bx */
    private View f96181bx;

    /* renamed from: by */
    private View f96182by;

    /* renamed from: bz */
    private TuxTextView f96183bz;

    static {
        Covode.recordClassIndex(49038);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo70406b(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(214, new RunnableC90250g(C41155ae.class, "onCancelVideoCoverMaskEvent", C49674b.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: m */
    public final void mo70387m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$a */
    public static final class C41156a {
        static {
            Covode.recordClassIndex(49039);
        }

        private C41156a() {
        }

        public /* synthetic */ C41156a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: ac */
    public final boolean mo70411ac() {
        View view = this.f96179bC;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: r */
    public final void mo70413r() {
        super.mo70413r();
        this.f96174F.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$b */
    static final class View$OnClickListenerC41157b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41155ae f96184a;

        static {
            Covode.recordClassIndex(49040);
        }

        View$OnClickListenerC41157b(C41155ae aeVar) {
            this.f96184a = aeVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$b$a */
        public static final class C41158a implements AbstractC56243a {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC41157b f96185a;

            static {
                Covode.recordClassIndex(49041);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3262l.AbstractC56243a
            /* renamed from: a */
            public final void mo70415a() {
                AbstractC48136a P;
                AbstractC48149ai bg = this.f96185a.f96184a.mo84754bg();
                if (bg != null && (P = bg.mo80101P()) != null) {
                    P.mo80269a(EnumC76739a.LOOP_CURRENT_VIDEO);
                }
            }

            C41158a(View$OnClickListenerC41157b bVar) {
                this.f96185a = bVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3262l.AbstractC56243a
            /* renamed from: a */
            public final void mo70416a(String str) {
                AbstractC48136a P;
                C89219l.m154721d(str, "");
                MentionEditText mentionEditText = this.f96185a.f96184a.f96176a;
                if (mentionEditText != null) {
                    mentionEditText.setText(str);
                }
                AbstractC48149ai bg = this.f96185a.f96184a.mo84754bg();
                if (bg != null && (P = bg.mo80101P()) != null) {
                    C77260g gVar = C77260g.f173332a;
                    C49812b bVar = this.f96185a.f96184a.f114782aJ;
                    C89219l.m154716b(bVar, "");
                    String eventType = bVar.getEventType();
                    C89219l.m154716b(eventType, "");
                    C49812b bVar2 = this.f96185a.f96184a.f114782aJ;
                    C89219l.m154716b(bVar2, "");
                    P.mo80269a(gVar.mo120137a(eventType, bVar2.getFrom()));
                }
            }
        }

        public final void onClick(View view) {
            Aweme bM;
            String str;
            Editable text;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && !C76706a.m134285k(this.f96184a.mo84738bM()) && (bM = this.f96184a.mo84738bM()) != null) {
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Fragment fragment = this.f96184a.f183420bw;
                C89219l.m154716b(fragment, "");
                AbstractC0952i childFragmentManager = fragment.getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                String eventType = this.f96184a.f114782aJ.getEventType();
                C89219l.m154716b(eventType, "");
                MentionEditText mentionEditText = this.f96184a.f96176a;
                if (mentionEditText == null || (text = mentionEditText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                createIIMServicebyMonsterPlugin.showDmInputViewDialogFragment(childFragmentManager, eventType, bM, str, new C41158a(this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: H */
    public final void mo70402H() {
        super.mo70402H();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        mo70394ab();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    public final void aF_() {
        super.aF_();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        mo70394ab();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af
    /* renamed from: ab */
    public final void mo70394ab() {
        if (C59208ac.m108774h(mo84738bM()) || C76706a.m134282h(mo84738bM())) {
            m82876ca();
        } else {
            m82877cb();
        }
    }

    /* renamed from: bZ */
    private final void m82875bZ() {
        long j;
        ActivityC0945e activity;
        Map<String, C77386i> map;
        C77386i iVar;
        String aid;
        Story story;
        Aweme bM = mo84738bM();
        long j2 = 0;
        if (bM == null || (story = bM.getStory()) == null) {
            j = 0;
        } else {
            j = story.getViewerCount();
        }
        Fragment aH_ = aH_();
        if (!(aH_ == null || (activity = aH_.getActivity()) == null)) {
            C77260g gVar = C77260g.f173332a;
            String str = "";
            C89219l.m154716b(activity, str);
            IStoryViewerListViewModel a = gVar.mo120136a(activity, activity);
            Aweme bM2 = mo84738bM();
            if (!(bM2 == null || (aid = bM2.getAid()) == null)) {
                str = aid;
            }
            if (!(a == null || (map = a.f171710c) == null || (iVar = map.get(str)) == null)) {
                j = (long) iVar.getTotal();
            }
        }
        if (j >= 0) {
            j2 = j;
        }
        String a2 = m82894a(j2);
        TuxTextView tuxTextView = this.f96183bz;
        if (tuxTextView != null) {
            tuxTextView.setText(a2);
        }
    }

    /* renamed from: ca */
    private final void m82876ca() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (C80635y.m139811f(mo84738bM())) {
            View view = this.f96181bx;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            View view2 = this.f96178bB;
            if (view2 != null && view2.getVisibility() != 8) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        View view3 = this.f96181bx;
        if (!(view3 == null || view3.getVisibility() == 0)) {
            view3.setVisibility(0);
        }
        if (C76706a.m134282h(mo84738bM()) || mo70420ad() || (C76706a.m134284j(mo84738bM()) && !C76706a.m134285k(mo84738bM()))) {
            View view4 = this.f96182by;
            if (!(view4 == null || view4.getVisibility() == 4)) {
                view4.setVisibility(4);
            }
        } else {
            View view5 = this.f96182by;
            if (!(view5 == null || view5.getVisibility() == 0)) {
                view5.setVisibility(0);
            }
        }
        View view6 = this.f96178bB;
        if (!(view6 == null || view6.getVisibility() == 8)) {
            view6.setVisibility(8);
        }
        m82875bZ();
    }

    /* renamed from: cb */
    private final void m82877cb() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (C80635y.m139811f(mo84738bM())) {
            View view = this.f96181bx;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            View view2 = this.f96178bB;
            if (view2 != null && view2.getVisibility() != 8) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        View view3 = this.f96181bx;
        if (!(view3 == null || view3.getVisibility() == 8)) {
            view3.setVisibility(8);
        }
        View view4 = this.f96178bB;
        if (!(view4 == null || view4.getVisibility() == 0)) {
            view4.setVisibility(0);
        }
        if (C76706a.m134280f(mo84738bM())) {
            View view5 = this.f96179bC;
            if (!(view5 == null || view5.getVisibility() == 4)) {
                view5.setVisibility(4);
            }
            StoryEmojiReactionView storyEmojiReactionView = this.f96180bD;
            if (!(storyEmojiReactionView == null || storyEmojiReactionView.getVisibility() == 0)) {
                storyEmojiReactionView.setVisibility(0);
            }
        } else if (C76706a.m134279e(mo84738bM())) {
            View view6 = this.f96179bC;
            if (!(view6 == null || view6.getVisibility() == 4)) {
                view6.setVisibility(4);
            }
            StoryEmojiReactionView storyEmojiReactionView2 = this.f96180bD;
            if (!(storyEmojiReactionView2 == null || storyEmojiReactionView2.getVisibility() == 4)) {
                storyEmojiReactionView2.setVisibility(4);
            }
        } else if (m82878t(mo84738bM())) {
            View view7 = this.f96179bC;
            if (!(view7 == null || view7.getVisibility() == 4)) {
                view7.setVisibility(4);
            }
            StoryEmojiReactionView storyEmojiReactionView3 = this.f96180bD;
            if (!(storyEmojiReactionView3 == null || storyEmojiReactionView3.getVisibility() == 0)) {
                storyEmojiReactionView3.setVisibility(0);
            }
        } else {
            View view8 = this.f96179bC;
            if (!(view8 == null || view8.getVisibility() == 0)) {
                view8.setVisibility(0);
            }
            StoryEmojiReactionView storyEmojiReactionView4 = this.f96180bD;
            if (!(storyEmojiReactionView4 == null || storyEmojiReactionView4.getVisibility() == 0)) {
                storyEmojiReactionView4.setVisibility(0);
            }
        }
        MentionEditText mentionEditText = this.f96176a;
        if (mentionEditText != null) {
            mentionEditText.setText("");
        }
        StoryEmojiReactionView storyEmojiReactionView5 = this.f96180bD;
        if (storyEmojiReactionView5 != null) {
            storyEmojiReactionView5.mo79274a(mo84738bM());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public final void mo70407p() {
        Story story;
        View view;
        StoryEmojiReactionView storyEmojiReactionView;
        View view2;
        View view3;
        MethodCollector.m26663i(10267);
        super.mo70407p();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        Aweme bM3 = mo84738bM();
        if (bM3 != null) {
            bM3.getAid();
        }
        Aweme bM4 = mo84738bM();
        if (bM4 != null) {
            Integer.valueOf(bM4.getAwemeType());
        }
        if (this.f183419bv == null) {
            MethodCollector.m26664o(10267);
            return;
        }
        Activity activity = this.f183419bv;
        C89219l.m154716b(activity, "");
        if (!activity.isFinishing()) {
            if (aH_() == null) {
                MethodCollector.m26664o(10267);
                return;
            }
            View view4 = null;
            if (this.f96181bx == null) {
                Aweme bM5 = mo84738bM();
                if (bM5 != null) {
                    bM5.getAid();
                }
                Aweme bM6 = mo84738bM();
                if (bM6 != null) {
                    Integer.valueOf(bM6.getAwemeType());
                }
                Fragment aH_ = aH_();
                C89219l.m154716b(aH_, "");
                ViewGroup viewGroup = (ViewGroup) aH_.getView();
                if (viewGroup instanceof FrameLayout) {
                    view3 = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wv, viewGroup, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    View findViewById = view3.findViewById(R.id.cf0);
                    this.f96182by = findViewById;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new View$OnClickListenerC41162d(this));
                    }
                    this.f96183bz = (TuxTextView) view3.findViewById(R.id.eqn);
                    m82875bZ();
                    if (mo70420ad() || (C76706a.m134284j(mo84738bM()) && !C76706a.m134285k(mo84738bM()))) {
                        View view5 = this.f96182by;
                        if (!(view5 == null || view5.getVisibility() == 4)) {
                            view5.setVisibility(4);
                        }
                    } else {
                        View view6 = this.f96182by;
                        if (!(view6 == null || view6.getVisibility() == 0)) {
                            view6.setVisibility(0);
                        }
                    }
                    if (C76706a.m134282h(mo84738bM())) {
                        View view7 = this.f96182by;
                        if (!(view7 == null || view7.getVisibility() == 4)) {
                            view7.setVisibility(4);
                        }
                    } else {
                        View view8 = this.f96182by;
                        if (!(view8 == null || view8.getVisibility() == 0)) {
                            view8.setVisibility(0);
                        }
                    }
                    View findViewById2 = view3.findViewById(R.id.eju);
                    this.f96177bA = findViewById2;
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new View$OnClickListenerC41163e(this));
                    }
                    view3.setVisibility(8);
                    viewGroup.addView(view3, layoutParams);
                } else {
                    view3 = null;
                }
                this.f96181bx = view3;
            }
            if (mo70420ad()) {
                Aweme bM7 = mo84738bM();
                if (bM7 != null) {
                    bM7.getAid();
                }
                Aweme bM8 = mo84738bM();
                if (bM8 != null) {
                    Integer.valueOf(bM8.getAwemeType());
                    MethodCollector.m26664o(10267);
                    return;
                }
                MethodCollector.m26664o(10267);
                return;
            }
            if (this.f96178bB == null) {
                Aweme bM9 = mo84738bM();
                if (bM9 != null) {
                    bM9.getAid();
                }
                Aweme bM10 = mo84738bM();
                if (bM10 != null) {
                    Integer.valueOf(bM10.getAwemeType());
                }
                Fragment aH_2 = aH_();
                C89219l.m154716b(aH_2, "");
                ViewGroup viewGroup2 = (ViewGroup) aH_2.getView();
                if (viewGroup2 instanceof FrameLayout) {
                    view4 = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wu, viewGroup2, false);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 80;
                    this.f96179bC = view4.findViewById(R.id.cd1);
                    if (!(!C76706a.m134280f(mo84738bM()) || (view2 = this.f96179bC) == null || view2.getVisibility() == 4)) {
                        view2.setVisibility(4);
                    }
                    if (!(!C76706a.m134279e(mo84738bM()) || (storyEmojiReactionView = this.f96180bD) == null || storyEmojiReactionView.getVisibility() == 8)) {
                        storyEmojiReactionView.setVisibility(8);
                    }
                    Aweme bM11 = mo84738bM();
                    if (!(bM11 == null || (story = bM11.getStory()) == null || !story.getChatDisable() || (view = this.f96179bC) == null || view.getVisibility() == 4)) {
                        view.setVisibility(4);
                    }
                    MentionEditText mentionEditText = (MentionEditText) view4.findViewById(R.id.cjr);
                    this.f96176a = mentionEditText;
                    if (mentionEditText != null) {
                        mentionEditText.setCursorVisible(false);
                        mentionEditText.setTextAlignment(5);
                    }
                    MentionEditText mentionEditText2 = this.f96176a;
                    if (mentionEditText2 != null) {
                        mentionEditText2.setOnClickListener(new View$OnClickListenerC41157b(this));
                    }
                    StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) view4.findViewById(R.id.aug);
                    this.f96180bD = storyEmojiReactionView2;
                    if (storyEmojiReactionView2 != null) {
                        storyEmojiReactionView2.f108786b = mo84738bM();
                    }
                    StoryEmojiReactionView storyEmojiReactionView3 = this.f96180bD;
                    if (storyEmojiReactionView3 != null) {
                        storyEmojiReactionView3.setStoryEmojiReactionListener(new C41159c(this));
                    }
                    C89219l.m154716b(view4, "");
                    view4.setVisibility(8);
                    viewGroup2.addView(view4, layoutParams2);
                }
                this.f96178bB = view4;
            }
            if (mo84738bM() == null || C80635y.m139811f(mo84738bM())) {
                View view9 = this.f96181bx;
                if (view9 != null) {
                    view9.setVisibility(8);
                }
                View view10 = this.f96178bB;
                if (view10 != null) {
                    view10.setVisibility(8);
                    MethodCollector.m26664o(10267);
                    return;
                }
                MethodCollector.m26664o(10267);
                return;
            } else if (C59208ac.m108774h(mo84738bM()) || C76706a.m134282h(mo84738bM())) {
                View view11 = this.f96181bx;
                if (view11 != null) {
                    view11.setVisibility(0);
                }
                View view12 = this.f96178bB;
                if (view12 != null) {
                    view12.setVisibility(8);
                    MethodCollector.m26664o(10267);
                    return;
                }
                MethodCollector.m26664o(10267);
                return;
            } else {
                View view13 = this.f96181bx;
                if (view13 != null) {
                    view13.setVisibility(8);
                }
                View view14 = this.f96178bB;
                if (view14 != null) {
                    view14.setVisibility(0);
                    MethodCollector.m26664o(10267);
                    return;
                }
            }
        }
        MethodCollector.m26664o(10267);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$c */
    public static final class C41159c implements StoryEmojiReactionView.AbstractC46662d {

        /* renamed from: a */
        final /* synthetic */ C41155ae f96186a;

        /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$c$a */
        static final class C41160a<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C41160a f96187a = new C41160a();

            static {
                Covode.recordClassIndex(49043);
            }

            C41160a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(49042);
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$c$b */
        static final class C41161b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C41161b f96188a = new C41161b();

            static {
                Covode.recordClassIndex(49044);
            }

            C41161b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C51423a.m95790a((Throwable) obj);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41159c(C41155ae aeVar) {
            this.f96186a = aeVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.AbstractC46662d
        /* renamed from: a */
        public final void mo64674a(StoryEmojiReactionView.C46661c cVar, Aweme aweme) {
            C89219l.m154721d(cVar, "");
            if (aweme != null) {
                aweme.getAid();
            }
            C41155ae aeVar = this.f96186a;
            String str = cVar.f108800b;
            C89219l.m154721d(str, "");
            if (!(aweme == null || aweme.getAid() == null || aweme.getAuthor() == null)) {
                C33744d dVar = new C33744d();
                C49812b bVar = aeVar.f114782aJ;
                C89219l.m154716b(bVar, "");
                C33744d a = dVar.mo59983a("enter_from", bVar.getEventType());
                User author = aweme.getAuthor();
                if (author == null) {
                    C89219l.m154715b();
                }
                C33744d a2 = a.mo59980a("follow_status", C76598h.m134176a(author)).mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("prompt", str);
                C89219l.m154716b(a2, "");
                C76598h.m134177a(a2, aweme);
                C39162r.m79460a("emoji_react", a2.f79943a);
            }
            if (!C76706a.m134280f(aweme) && !C76706a.m134285k(aweme) && aweme != null && aweme.getAid() != null) {
                String str2 = "aweme.aid" + cVar.f108799a;
                Boolean bool = this.f96186a.f96175G.get(str2);
                if (bool == null || !bool.booleanValue()) {
                    this.f96186a.f96175G.put(str2, true);
                    C77260g gVar = C77260g.f173332a;
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    AbstractC88412b a3 = gVar.mo120138a(aid, cVar.f108799a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C41160a.f96187a, C41161b.f96188a);
                    C89219l.m154716b(a3, "");
                    C88934a.m154195a(a3, this.f96186a.f96174F);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
    /* renamed from: a */
    public final void mo61907a(Aweme aweme) {
        super.mo61907a(aweme);
        if (aweme != null) {
            aweme.getAid();
            Integer.valueOf(aweme.getAwemeType());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCancelVideoCoverMaskEvent(C49674b bVar) {
        C89219l.m154721d(bVar, "");
        mo70394ab();
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$e */
    static final class View$OnClickListenerC41163e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41155ae f96190a;

        static {
            Covode.recordClassIndex(49046);
        }

        View$OnClickListenerC41163e(C41155ae aeVar) {
            this.f96190a = aeVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                this.f96190a.mo70421ae();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41155ae(C49812b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: t */
    private static boolean m82878t(Aweme aweme) {
        boolean z;
        Story story;
        if (aweme == null || (story = aweme.getStory()) == null) {
            z = false;
        } else {
            z = story.getChatDisable();
        }
        boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
        if (z || d) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
    /* renamed from: b_ */
    public final void mo61908b_(Exception exc) {
        super.mo61908b_(exc);
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ae$d */
    static final class View$OnClickListenerC41162d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41155ae f96189a;

        static {
            Covode.recordClassIndex(49045);
        }

        View$OnClickListenerC41162d(C41155ae aeVar) {
            this.f96189a = aeVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && !C76706a.m134285k(this.f96189a.mo84738bM())) {
                this.f96189a.mo70423j("click_icon");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af
    /* renamed from: a */
    public final void mo70404a(C33942b bVar) {
        C89378p pVar;
        String str;
        if (mo84730bE() && bVar != null && (pVar = (C89378p) bVar.mo60212a()) != null) {
            Aweme bM = mo84738bM();
            if (bM != null) {
                str = bM.getAid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, pVar.getFirst())) {
                long total = (long) ((C77386i) pVar.getSecond()).getTotal();
                if (total < 0) {
                    total = 0;
                }
                String a = m82894a(total);
                TuxTextView tuxTextView = this.f96183bz;
                if (tuxTextView != null) {
                    tuxTextView.setText(a);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
        super.mo59512a(list, z);
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        mo70394ab();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo59517b(List<Aweme> list, boolean z) {
        super.mo59517b(list, z);
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        mo70394ab();
    }
}
