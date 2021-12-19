package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.ftc.p3028c.C51915a;
import com.p2082ss.android.ugc.aweme.ftc.p3028c.C51916b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.C78135ak;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4106a.C78250a;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.AbstractC78258b;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c.C78259c;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.AbstractC78335e;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.AbstractC78339f;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78324a;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78325b;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78326c;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.FTCPreviewSurfaceView;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88303z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h */
public final class C78305h extends Fragment implements VideoDownloadStatusBar.AbstractC78367c, AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    public static C43223c f175883h;

    /* renamed from: i */
    public static final C78306a f175884i = new C78306a((byte) 0);

    /* renamed from: a */
    public VideoPublishEditModel f175885a;

    /* renamed from: b */
    public C43223c f175886b;

    /* renamed from: c */
    public int f175887c = 1;

    /* renamed from: d */
    public boolean f175888d = true;

    /* renamed from: e */
    public C78326c f175889e;

    /* renamed from: f */
    final AbstractC89244h f175890f = C89250i.m154773a((AbstractC89171a) C78322k.f175910a);

    /* renamed from: g */
    final AbstractC89244h f175891g = C89250i.m154773a((AbstractC89171a) new C78311d(this));

    /* renamed from: j */
    private final AbstractC89244h f175892j = C89250i.m154773a((AbstractC89171a) new C78313e(this));

    /* renamed from: k */
    private final AbstractC89244h f175893k = C89250i.m154773a((AbstractC89171a) new C78307b(this));

    /* renamed from: l */
    private final AbstractC89244h f175894l = C89250i.m154773a((AbstractC89171a) new C78309c(this));

    /* renamed from: m */
    private HashMap f175895m;

    static {
        Covode.recordClassIndex(91422);
    }

    /* renamed from: a */
    public final View mo122190a(int i) {
        if (this.f175895m == null) {
            this.f175895m = new HashMap();
        }
        View view = (View) this.f175895m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f175895m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C78250a mo122191a() {
        return (C78250a) this.f175892j.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final KidsDraftFeedViewModel mo122193b() {
        return (KidsDraftFeedViewModel) this.f175893k.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(289, new RunnableC90250g(C78305h.class, "handleDownloadVideoStatus", C78325b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$a */
    public static final class C78306a {
        static {
            Covode.recordClassIndex(91423);
        }

        private C78306a() {
        }

        public /* synthetic */ C78306a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$d */
    static final class C78311d extends AbstractC89220m implements AbstractC89171a<AbstractC89172b<? super AbstractC78339f, ? extends C89391z>> {

        /* renamed from: a */
        final /* synthetic */ C78305h f175899a;

        static {
            Covode.recordClassIndex(91428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78311d(C78305h hVar) {
            super(0);
            this.f175899a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89172b<? super AbstractC78339f, ? extends C89391z> invoke() {
            return new AbstractC89172b<AbstractC78339f, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h.C78311d.C783121 */

                /* renamed from: a */
                final /* synthetic */ C78311d f175900a;

                static {
                    Covode.recordClassIndex(91429);
                }

                {
                    this.f175900a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(AbstractC78339f fVar) {
                    String str;
                    AbstractC78339f fVar2 = fVar;
                    C89219l.m154721d(fVar2, "");
                    if (fVar2 instanceof AbstractC78339f.C78340a) {
                        C78305h hVar = this.f175900a.f175899a;
                        VideoPublishEditModel videoPublishEditModel = ((AbstractC78339f.C78340a) fVar2).f175936a;
                        C78273d dVar = new C78273d();
                        Bundle bundle = new Bundle();
                        List<VideoPublishEditModel> value = hVar.mo122193b().f176100c.getValue();
                        if (value == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(value, "");
                        bundle.putSerializable("draft_selected_video_index", Integer.valueOf(C78305h.m136784a(value, videoPublishEditModel)));
                        bundle.putSerializable("draft_current_video", videoPublishEditModel);
                        dVar.setArguments(bundle);
                        dVar.show(hVar.getFragmentManager(), "draft_selected_video_index");
                        C84425b a = new C84425b().mo129406a("enter_from", "personal_homepage");
                        C43223c cVar = this.f175900a.f175899a.f175886b;
                        String str2 = null;
                        if (cVar != null) {
                            str = cVar.mo73676f();
                        } else {
                            str = null;
                        }
                        C84425b a2 = a.mo129406a("group_id", str);
                        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
                        if (e != null) {
                            str2 = e.mo58660c();
                        }
                        C39162r.m79460a("click_more_button", a2.mo129406a("authro_id", str2).mo129403a("order", this.f175900a.f175899a.f175887c).f188764a);
                    }
                    return C89391z.f203057a;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$k */
    static final class C78322k extends AbstractC89220m implements AbstractC89171a<C78259c> {

        /* renamed from: a */
        public static final C78322k f175910a = new C78322k();

        static {
            Covode.recordClassIndex(91439);
        }

        C78322k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78259c invoke() {
            return new C78259c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar.AbstractC78367c
    /* renamed from: d */
    public final void mo122195d() {
        mo122192a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$b */
    static final class C78307b extends AbstractC89220m implements AbstractC89171a<KidsDraftFeedViewModel> {

        /* renamed from: a */
        final /* synthetic */ C78305h f175896a;

        static {
            Covode.recordClassIndex(91424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78307b(C78305h hVar) {
            super(0);
            this.f175896a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ KidsDraftFeedViewModel invoke() {
            AbstractC1174ac a = new C1175ad(this.f175896a, new C1175ad.AbstractC1177b(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h.C78307b.C783081 */

                /* renamed from: a */
                final /* synthetic */ C78307b f175897a;

                static {
                    Covode.recordClassIndex(91425);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f175897a = r1;
                }

                @Override // androidx.lifecycle.C1175ad.AbstractC1177b
                /* renamed from: a */
                public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                    C89219l.m154721d(cls, "");
                    return new KidsDraftFeedViewModel((AbstractC78258b) this.f175897a.f175896a.f175890f.getValue());
                }
            }).mo3983a(KidsDraftFeedViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$c */
    static final class C78309c extends AbstractC89220m implements AbstractC89171a<KidsDraftOptionViewModel> {

        /* renamed from: a */
        final /* synthetic */ C78305h f175898a;

        static {
            Covode.recordClassIndex(91426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78309c(C78305h hVar) {
            super(0);
            this.f175898a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ KidsDraftOptionViewModel invoke() {
            AbstractC1174ac a = new C1175ad(this.f175898a.requireActivity(), new C1175ad.AbstractC1177b() {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h.C78309c.C783101 */

                static {
                    Covode.recordClassIndex(91427);
                }

                @Override // androidx.lifecycle.C1175ad.AbstractC1177b
                /* renamed from: a */
                public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                    C89219l.m154721d(cls, "");
                    return new KidsDraftOptionViewModel();
                }
            }).mo3983a(KidsDraftOptionViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C78250a.C78251a a = mo122191a().mo122146a(this.f175887c - 1);
        if (a != null) {
            a.mo122148a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$e */
    static final class C78313e extends AbstractC89220m implements AbstractC89171a<C78250a> {

        /* renamed from: a */
        final /* synthetic */ C78305h f175901a;

        static {
            Covode.recordClassIndex(91430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78313e(C78305h hVar) {
            super(0);
            this.f175901a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78250a invoke() {
            Context context = this.f175901a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            AbstractC1204m viewLifecycleOwner = this.f175901a.getViewLifecycleOwner();
            C89219l.m154716b(viewLifecycleOwner, "");
            return new C78250a(context, viewLifecycleOwner, (AbstractC89172b) this.f175901a.f175891g.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VideoDownloadStatusBar.C78365a.m136865a();
        AbstractC81915c.m141874a(new C51916b());
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
        VideoDownloadStatusBar.f176080i.remove(this);
        C78326c.f175915d = true;
        HashMap hashMap = this.f175895m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar.AbstractC78367c
    /* renamed from: c */
    public final void mo122194c() {
        String str;
        C78326c cVar = this.f175889e;
        if (cVar == null) {
            C89219l.m154710a("downloadHelper");
        }
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        VideoPublishEditModel videoPublishEditModel = this.f175885a;
        AbstractC1204m viewLifecycleOwner = getViewLifecycleOwner();
        C89219l.m154716b(viewLifecycleOwner, "");
        FTCPreviewSurfaceView fTCPreviewSurfaceView = (FTCPreviewSurfaceView) mo122190a(R.id.d5p);
        C89219l.m154716b(fTCPreviewSurfaceView, "");
        cVar.mo122199a(activity, videoPublishEditModel, viewLifecycleOwner, fTCPreviewSurfaceView);
        C84425b bVar = new C84425b();
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        String str2 = null;
        if (e != null) {
            str = e.mo58660c();
        } else {
            str = null;
        }
        C84425b a = bVar.mo129406a("author_id", str);
        C43223c cVar2 = this.f175886b;
        if (cVar2 != null) {
            str2 = cVar2.mo73676f();
        }
        C39162r.m79460a("download_retry", a.mo129406a("group_id", str2).f188764a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C88303z a;
        super.onDestroy();
        C78250a a2 = mo122191a();
        for (Map.Entry<Integer, C78250a.C78251a> entry : a2.f175750c.entrySet()) {
            int intValue = entry.getKey().intValue();
            entry.getValue();
            C78250a.C78251a aVar = a2.f175750c.get(Integer.valueOf(intValue));
            if (!(aVar == null || (a = aVar.mo122147a()) == null)) {
                a.mo142796b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$j */
    public static final class C78321j implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C78305h f175909a;

        static {
            Covode.recordClassIndex(91438);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78321j(C78305h hVar) {
            this.f175909a = hVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            C43223c cVar;
            int count = this.f175909a.mo122191a().getCount();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= count) {
                    break;
                }
                C78250a.C78251a a = this.f175909a.mo122191a().mo122146a(i2);
                if (a != null) {
                    if (i2 != i) {
                        z = false;
                    }
                    a.mo122148a(z);
                }
                i2++;
            }
            C78305h hVar = this.f175909a;
            hVar.f175885a = hVar.mo122191a().f175749b.get(i);
            C78305h hVar2 = this.f175909a;
            VideoPublishEditModel videoPublishEditModel = hVar2.f175885a;
            if (videoPublishEditModel != null) {
                new C70974bn("VideoPublishFragment");
                cVar = C70974bn.m125291b(videoPublishEditModel);
            } else {
                cVar = null;
            }
            hVar2.f175886b = cVar;
            this.f175909a.f175887c = i + 1;
            C78305h hVar3 = this.f175909a;
            if (C78326c.f175914c) {
                hVar3.mo122192a(true);
                if (hVar3.mo122190a(R.id.aod) != null) {
                    ((VideoDownloadStatusBar) hVar3.mo122190a(R.id.aod)).mo122304a(VideoDownloadStatusBar.f176082k);
                }
            } else {
                if (hVar3.mo122190a(R.id.aod) != null) {
                    hVar3.mo122190a(R.id.aod);
                    if (VideoDownloadStatusBar.f176081j.hasMessages(1)) {
                        hVar3.mo122192a(true);
                        ((VideoDownloadStatusBar) hVar3.mo122190a(R.id.aod)).mo122305b();
                    }
                }
                if (hVar3.mo122190a(R.id.aod) != null) {
                    hVar3.mo122190a(R.id.aod);
                    if (VideoDownloadStatusBar.f176081j.hasMessages(2)) {
                        hVar3.mo122192a(true);
                        ((VideoDownloadStatusBar) hVar3.mo122190a(R.id.aod)).mo122306c();
                    }
                }
                hVar3.mo122192a(false);
            }
            if (i == this.f175909a.mo122191a().getCount() - 1) {
                LoadMoreFrameLayout loadMoreFrameLayout = (LoadMoreFrameLayout) this.f175909a.mo122190a(R.id.cg7);
                DmtStatusView a2 = loadMoreFrameLayout.mo122217a(true);
                if (a2 != null) {
                    a2.mo27385g();
                }
                loadMoreFrameLayout.f175941d = 1;
                if (loadMoreFrameLayout.f175938a != null) {
                    loadMoreFrameLayout.mo122218a();
                }
                if (loadMoreFrameLayout.f175943f != -1 && !TextUtils.isEmpty(loadMoreFrameLayout.f175944g)) {
                    loadMoreFrameLayout.f175943f = -1;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f175909a.f175888d && f == 0.0f && i2 == 0) {
                onPageSelected(i);
                this.f175909a.f175888d = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$i */
    static final class View$OnClickListenerC78320i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78305h f175908a;

        static {
            Covode.recordClassIndex(91437);
        }

        View$OnClickListenerC78320i(C78305h hVar) {
            this.f175908a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f175908a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$g */
    static final class C78318g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C78305h f175906a;

        static {
            Covode.recordClassIndex(91435);
        }

        C78318g(C78305h hVar) {
            this.f175906a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC32846a aVar = (AbstractC32846a) obj;
            C78250a a = this.f175906a.mo122191a();
            C89219l.m154716b(aVar, "");
            C89219l.m154721d(aVar, "");
            a.f175748a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$h */
    static final class C78319h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C78305h f175907a;

        static {
            Covode.recordClassIndex(91436);
        }

        C78319h(C78305h hVar) {
            this.f175907a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            VideoPublishEditModel videoPublishEditModel;
            List list = (List) obj;
            VerticalViewPager verticalViewPager = (VerticalViewPager) this.f175907a.mo122190a(R.id.b08);
            C89219l.m154716b(verticalViewPager, "");
            verticalViewPager.setVisibility(0);
            TuxStatusView tuxStatusView = (TuxStatusView) this.f175907a.mo122190a(R.id.cfe);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            C78250a a = this.f175907a.mo122191a();
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            a.f175749b.clear();
            a.f175749b.addAll(list);
            this.f175907a.mo122191a().notifyDataSetChanged();
            C43223c cVar = C78305h.f175883h;
            if (cVar != null) {
                new C70974bn("AwemeDraftViewHolder");
                videoPublishEditModel = C70974bn.m125289a(cVar);
            } else {
                videoPublishEditModel = null;
            }
            int a2 = C78305h.m136784a(list, videoPublishEditModel);
            if (a2 != 0) {
                ((VerticalViewPager) this.f175907a.mo122190a(R.id.b08)).mo122248a(a2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122192a(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (mo122190a(R.id.aod) == null) {
            return;
        }
        if (z) {
            VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) mo122190a(R.id.aod);
            C89219l.m154716b(videoDownloadStatusBar, "");
            videoDownloadStatusBar.setVisibility(0);
            if (mo122190a(R.id.b0b) != null) {
                FrameLayout frameLayout3 = (FrameLayout) mo122190a(R.id.b0b);
                C89219l.m154716b(frameLayout3, "");
                frameLayout3.setVisibility(0);
                C78250a.C78251a a = mo122191a().mo122146a(this.f175887c - 1);
                if (a != null && (frameLayout2 = a.f175765k) != null) {
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) C30745b.m63132b(getContext(), 37.0f);
                    }
                    if (frameLayout2 != null) {
                        frameLayout2.setLayoutParams(layoutParams);
                        frameLayout2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        VideoDownloadStatusBar videoDownloadStatusBar2 = (VideoDownloadStatusBar) mo122190a(R.id.aod);
        C89219l.m154716b(videoDownloadStatusBar2, "");
        videoDownloadStatusBar2.setVisibility(8);
        if (mo122190a(R.id.b0b) != null) {
            FrameLayout frameLayout4 = (FrameLayout) mo122190a(R.id.b0b);
            C89219l.m154716b(frameLayout4, "");
            frameLayout4.setVisibility(8);
            C78250a.C78251a a2 = mo122191a().mo122146a(this.f175887c - 1);
            if (a2 != null && (frameLayout = a2.f175765k) != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = 0;
                }
                if (frameLayout != null) {
                    frameLayout.setLayoutParams(layoutParams2);
                    frameLayout.requestLayout();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$f */
    static final class C78314f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C78305h f175902a;

        static {
            Covode.recordClassIndex(91431);
        }

        C78314f(C78305h hVar) {
            this.f175902a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            int i;
            AbstractC0952i supportFragmentManager;
            String str;
            C78324a aVar = (C78324a) obj;
            String str2 = null;
            if (aVar.f175911a) {
                t = null;
            } else {
                aVar.f175911a = true;
                t = aVar.f175912b;
            }
            T t2 = t;
            if (t2 != null) {
                i = t2.f175932a;
            } else {
                i = -1;
            }
            ((VerticalViewPager) this.f175902a.mo122190a(R.id.b08)).mo122248a(i, false);
            if (t2 instanceof AbstractC78335e.C78338c) {
                this.f175902a.f175889e = new C78326c();
                C78326c cVar = this.f175902a.f175889e;
                if (cVar == null) {
                    C89219l.m154710a("downloadHelper");
                }
                ActivityC0945e activity = this.f175902a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                VideoPublishEditModel videoPublishEditModel = this.f175902a.f175885a;
                AbstractC1204m viewLifecycleOwner = this.f175902a.getViewLifecycleOwner();
                C89219l.m154716b(viewLifecycleOwner, "");
                FTCPreviewSurfaceView fTCPreviewSurfaceView = (FTCPreviewSurfaceView) this.f175902a.mo122190a(R.id.d5p);
                C89219l.m154716b(fTCPreviewSurfaceView, "");
                cVar.mo122199a(activity, videoPublishEditModel, viewLifecycleOwner, fTCPreviewSurfaceView);
                C84425b a = new C84425b().mo129406a("enter_from", "personal_homepage");
                AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
                if (e != null) {
                    str = e.mo58660c();
                } else {
                    str = null;
                }
                C84425b a2 = a.mo129406a("author_id", str);
                C43223c cVar2 = this.f175902a.f175886b;
                if (cVar2 != null) {
                    str2 = cVar2.mo73676f();
                }
                C39162r.m79460a("download", a2.mo129406a("group_id", str2).mo129406a("download_method", "click_download_icon").f188764a);
            } else if (t2 instanceof AbstractC78335e.C78337b) {
                C78135ak.m136630a(this.f175902a.getActivity(), this.f175902a.f175886b, 0, System.currentTimeMillis(), null);
                ActivityC0945e activity2 = this.f175902a.getActivity();
                if (!(activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null)) {
                    supportFragmentManager.mo3552a().mo3455a(this.f175902a).mo3467b();
                }
                C84425b a3 = new C84425b().mo129406a("enter_from", "personal_homepage");
                C43223c cVar3 = this.f175902a.f175886b;
                if (cVar3 != null) {
                    str2 = cVar3.mo73676f();
                }
                C39162r.m79460a("click_edit_video", a3.mo129406a("group_id", str2).f188764a);
            } else if (t2 instanceof AbstractC78335e.C78336a) {
                C84425b a4 = new C84425b().mo129406a("enter_from", "personal_homepage");
                VideoPublishEditModel videoPublishEditModel2 = this.f175902a.f175885a;
                if (videoPublishEditModel2 != null) {
                    str2 = videoPublishEditModel2.creationId;
                }
                C39162r.m79460a("click_delete_video", a4.mo129406a("group_id", str2).f188764a);
                Context context = this.f175902a.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                C23028c.m43435a((C23023b) new C23023b(context).mo37483b(R.string.css), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h.C78314f.C783151 */

                    /* renamed from: a */
                    final /* synthetic */ C78314f f175903a;

                    static {
                        Covode.recordClassIndex(91432);
                    }

                    {
                        this.f175903a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        bVar2.mo37418b(R.string.csu, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h.C78314f.C783151.C783161 */

                            /* renamed from: a */
                            final /* synthetic */ C783151 f175904a;

                            static {
                                Covode.recordClassIndex(91433);
                            }

                            {
                                this.f175904a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                String str;
                                C89219l.m154721d(aVar, "");
                                C84425b a = new C84425b().mo129406a("enter_from", "personal_homepage");
                                VideoPublishEditModel videoPublishEditModel = this.f175904a.f175903a.f175902a.f175885a;
                                if (videoPublishEditModel != null) {
                                    str = videoPublishEditModel.creationId;
                                } else {
                                    str = null;
                                }
                                C39162r.m79460a("cancel_delete_video", a.mo129406a("group_id", str).f188764a);
                                return C89391z.f203057a;
                            }
                        });
                        bVar2.mo37420c(R.string.cst, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h.C78314f.C783151.C783172 */

                            /* renamed from: a */
                            final /* synthetic */ C783151 f175905a;

                            static {
                                Covode.recordClassIndex(91434);
                            }

                            {
                                this.f175905a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                String str;
                                AbstractC0952i supportFragmentManager;
                                C89219l.m154721d(aVar, "");
                                C84425b a = new C84425b().mo129406a("enter_from", "personal_homepage");
                                VideoPublishEditModel videoPublishEditModel = this.f175905a.f175903a.f175902a.f175885a;
                                if (videoPublishEditModel != null) {
                                    str = videoPublishEditModel.creationId;
                                } else {
                                    str = null;
                                }
                                C39162r.m79460a("confirm_delete_video", a.mo129406a("group_id", str).f188764a);
                                C43223c cVar = this.f175905a.f175903a.f175902a.f175886b;
                                AbstractC63171ae o = C63253l.f143623a.mo73319o();
                                if (cVar == null) {
                                    C89219l.m154715b();
                                }
                                String r = cVar.mo73726r();
                                C89219l.m154716b(r, "");
                                o.mo93758a(r);
                                C78133ai.m136600a().mo122073b(cVar, "user_click");
                                C43225d.m86337g(cVar);
                                C72867e.m128688b(cVar.mo73676f());
                                C43223c cVar2 = this.f175905a.f175903a.f175902a.f175886b;
                                if (cVar2 == null) {
                                    C89219l.m154715b();
                                }
                                AbstractC81915c.m141874a(new C51915a(cVar2));
                                new C79459a(this.f175905a.f175903a.f175902a.getActivity()).mo123050a(R.string.csv).mo123053a();
                                ActivityC0945e activity = this.f175905a.f175903a.f175902a.getActivity();
                                if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                                    supportFragmentManager.mo3552a().mo3455a(this.f175905a.f175903a.f175902a).mo3467b();
                                }
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }).mo37405a().mo37396b().show();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void handleDownloadVideoStatus(C78325b bVar) {
        boolean z;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C89219l.m154721d(bVar, "");
        C78271b bVar2 = bVar.f175913a;
        if (bVar2 == null || C78271b.f175819a != 3) {
            z = true;
        } else {
            z = false;
        }
        mo122192a(z);
        String str7 = null;
        if (bVar2 != null) {
            num = Integer.valueOf(C78271b.f175819a);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) mo122190a(R.id.aod);
                VideoDownloadStatusBar.m136859d();
                videoDownloadStatusBar.mo122303a();
                VideoDownloadStatusBar.f176082k = 0;
                ImageView imageView = videoDownloadStatusBar.f176085b;
                if (imageView == null) {
                    C89219l.m154710a("mDownloadSuccessImageView");
                }
                imageView.setVisibility(8);
                TextView textView = videoDownloadStatusBar.f176086c;
                if (textView == null) {
                    C89219l.m154710a("mDownloadSuccessTextView");
                }
                textView.setVisibility(8);
                TextView textView2 = videoDownloadStatusBar.f176089f;
                if (textView2 == null) {
                    C89219l.m154710a("mDownloadFailedTextView");
                }
                textView2.setVisibility(8);
                RelativeLayout relativeLayout = videoDownloadStatusBar.f176084a;
                if (relativeLayout == null) {
                    C89219l.m154710a("mDownloadProgressViewRoot");
                }
                relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
                RelativeLayout relativeLayout2 = videoDownloadStatusBar.f176084a;
                if (relativeLayout2 == null) {
                    C89219l.m154710a("mDownloadProgressViewRoot");
                }
                relativeLayout2.setVisibility(0);
                TextView textView3 = videoDownloadStatusBar.f176087d;
                if (textView3 == null) {
                    C89219l.m154710a("mDownloadProgressView");
                }
                textView3.setVisibility(0);
                TextView textView4 = videoDownloadStatusBar.f176088e;
                if (textView4 == null) {
                    C89219l.m154710a("mDownloadingStatusTextView");
                }
                textView4.setVisibility(0);
                TextView textView5 = videoDownloadStatusBar.f176090g;
                if (textView5 == null) {
                    C89219l.m154710a("mDownloadVideoCancelView");
                }
                textView5.setVisibility(0);
                RelativeLayout relativeLayout3 = videoDownloadStatusBar.f176084a;
                if (relativeLayout3 == null) {
                    C89219l.m154710a("mDownloadProgressViewRoot");
                }
                relativeLayout3.requestLayout();
                VideoPublishEditModel videoPublishEditModel = C78271b.f175821c;
                if (videoPublishEditModel != null) {
                    str2 = videoPublishEditModel.creationId;
                } else {
                    str2 = null;
                }
                VideoPublishEditModel videoPublishEditModel2 = this.f175885a;
                if (videoPublishEditModel2 != null) {
                    str7 = videoPublishEditModel2.creationId;
                }
                mo122192a(C89219l.m154714a((Object) str2, (Object) str7));
                C39162r.m79460a("download_start", new C84425b().mo129404a("start_download", System.currentTimeMillis()).f188764a);
                return;
            } else if (num.intValue() == 2) {
                VideoPublishEditModel videoPublishEditModel3 = C78271b.f175821c;
                if (videoPublishEditModel3 != null) {
                    str = videoPublishEditModel3.creationId;
                } else {
                    str = null;
                }
                VideoPublishEditModel videoPublishEditModel4 = this.f175885a;
                if (videoPublishEditModel4 != null) {
                    str7 = videoPublishEditModel4.creationId;
                }
                if (C89219l.m154714a((Object) str, (Object) str7)) {
                    ((VideoDownloadStatusBar) mo122190a(R.id.aod)).mo122304a(C78271b.f175820b);
                    return;
                } else {
                    mo122192a(false);
                    return;
                }
            } else if (num.intValue() == 3) {
                C78326c cVar = this.f175889e;
                if (cVar == null) {
                    C89219l.m154710a("downloadHelper");
                }
                cVar.f175917a = true;
                return;
            }
        }
        if (num != null) {
            if (num.intValue() == 4) {
                VideoPublishEditModel videoPublishEditModel5 = C78271b.f175821c;
                if (videoPublishEditModel5 != null) {
                    str4 = videoPublishEditModel5.creationId;
                } else {
                    str4 = null;
                }
                VideoPublishEditModel videoPublishEditModel6 = this.f175885a;
                if (videoPublishEditModel6 != null) {
                    str5 = videoPublishEditModel6.creationId;
                } else {
                    str5 = null;
                }
                if (C89219l.m154714a((Object) str4, (Object) str5)) {
                    ((VideoDownloadStatusBar) mo122190a(R.id.aod)).mo122305b();
                    mo122192a(true);
                } else {
                    mo122192a(false);
                    C79459a a = new C79459a(getContext()).mo123050a(R.string.cse);
                    C23144b bVar3 = a.f178374a;
                    if (bVar3 != null) {
                        bVar3.mo37636b(R.raw.icon_tick_fill_small);
                    }
                    C23144b bVar4 = a.f178374a;
                    if (bVar4 != null) {
                        bVar4.mo37639d(R.attr.aw);
                    }
                    a.mo123053a();
                }
                C84425b a2 = new C84425b().mo129404a("end_download", System.currentTimeMillis());
                AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
                if (e != null) {
                    str6 = e.mo58660c();
                } else {
                    str6 = null;
                }
                C84425b a3 = a2.mo129406a("author_id", str6);
                if (videoPublishEditModel5 != null) {
                    str7 = videoPublishEditModel5.creationId;
                }
                C39162r.m79460a("download_end", a3.mo129406a("group_id", str7).mo129403a("is_self_video", 1).f188764a);
            } else if (num.intValue() == 5) {
                ((VideoDownloadStatusBar) mo122190a(R.id.aod)).mo122306c();
                mo122192a(true);
                C84425b bVar5 = new C84425b();
                AbstractC32846a e2 = C63244g.m114602a().mo73255A().mo93906e();
                if (e2 != null) {
                    str3 = e2.mo58660c();
                } else {
                    str3 = null;
                }
                C84425b a4 = bVar5.mo129406a("author_id", str3);
                C43223c cVar2 = this.f175886b;
                if (cVar2 != null) {
                    str7 = cVar2.mo73676f();
                }
                C39162r.m79460a("download_fail", a4.mo129406a("group_id", str7).f188764a);
            }
        }
    }

    /* renamed from: a */
    public static int m136784a(List<? extends VideoPublishEditModel> list, VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) videoPublishEditModel.creationId, (Object) t.creationId)) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxStatusView) mo122190a(R.id.cfe)).setStatus(new TuxStatusView.C23263c());
        ((TuxStatusView) mo122190a(R.id.cfe)).mo37867a();
        ((AVAutoRTLImageView) mo122190a(R.id.pi)).setOnClickListener(new View$OnClickListenerC78320i(this));
        VideoDownloadStatusBar.f176080i.add(this);
        ((VideoDownloadStatusBar) mo122190a(R.id.aod)).setVideoDownloadClickListener(this);
        VerticalViewPager verticalViewPager = (VerticalViewPager) mo122190a(R.id.b08);
        C89219l.m154716b(verticalViewPager, "");
        verticalViewPager.setAdapter(mo122191a());
        VerticalViewPager verticalViewPager2 = (VerticalViewPager) mo122190a(R.id.b08);
        C89219l.m154716b(verticalViewPager2, "");
        verticalViewPager2.setVisibility(8);
        ((AbstractC39190b) mo122190a(R.id.b08)).mo67974a(new C78321j(this));
        LoadMoreFrameLayout loadMoreFrameLayout = (LoadMoreFrameLayout) mo122190a(R.id.cg7);
        loadMoreFrameLayout.f175938a = (AbstractC39191c) mo122190a(R.id.b08);
        loadMoreFrameLayout.f175939b = null;
        KidsDraftFeedViewModel b = mo122193b();
        b.f176098a = C89624i.m155555a(C89561bs.f203280a, null, null, new KidsDraftFeedViewModel.C78373a(b, null), 3);
        ((KidsDraftOptionViewModel) this.f175894l.getValue()).f176107a.observe(getViewLifecycleOwner(), new C78314f(this));
        mo122193b().f176099b.observe(getViewLifecycleOwner(), new C78318g(this));
        mo122193b().f176100c.observe(getViewLifecycleOwner(), new C78319h(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C23073a.C23074a.m43506a(this).mo37494a(R.color.a2).mo37499b(false).f54627a.mo33415d();
        if (!EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
        C78326c.f175915d = false;
        return C1764a.m5927a(layoutInflater, R.layout.adh, viewGroup, false);
    }
}
