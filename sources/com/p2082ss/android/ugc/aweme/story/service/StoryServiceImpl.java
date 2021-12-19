package com.p2082ss.android.ugc.aweme.story.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1183ag;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.tux.p1722h.C23159f;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC34835bi;
import com.p2082ss.android.ugc.aweme.AbstractC35440cd;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36389e;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.story.AbstractC76590b;
import com.p2082ss.android.ugc.aweme.story.IStoryService;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b;
import com.p2082ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.api.StoryApi;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.avatar.C76494a;
import com.p2082ss.android.ugc.aweme.story.feed.common.C77203d;
import com.p2082ss.android.ugc.aweme.story.feed.common.StoryFeedUploadingViewHolder;
import com.p2082ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder;
import com.p2082ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import com.p2082ss.android.ugc.aweme.story.feed.detail.C77238a;
import com.p2082ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.p2082ss.android.ugc.aweme.story.interaction.p4056a.C77284a;
import com.p2082ss.android.ugc.aweme.story.interaction.p4056a.C77289b;
import com.p2082ss.android.ugc.aweme.story.interaction.p4059vm.StoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.p4017a.C76430a;
import com.p2082ss.android.ugc.aweme.story.p4017a.C76438b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76681f;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4043f.C77161c;
import com.p2082ss.android.ugc.aweme.story.p4043f.C77163d;
import com.p2082ss.android.ugc.aweme.story.p4054h.C77272b;
import com.p2082ss.android.ugc.aweme.story.p4054h.C77278d;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a;
import com.p2082ss.android.ugc.aweme.story.publish.C77429f;
import com.p2082ss.android.ugc.aweme.story.publish.C77444g;
import com.p2082ss.android.ugc.aweme.story.publish.C77445h;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.service.StoryServiceImpl */
public final class StoryServiceImpl implements IStoryService {

    /* renamed from: a */
    private int[] f174250a;

    /* renamed from: b */
    private int f174251b;

    static {
        Covode.recordClassIndex(90734);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final int mo120149b() {
        return R.layout.b1f;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: c */
    public final int mo120153c() {
        return R.layout.b1h;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: d */
    public final AbstractC76504c mo120156d() {
        return C76494a.f171782d;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: e */
    public final AbstractC76444b mo120157e() {
        return C77278d.f173366a;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: f */
    public final AbstractC77389a mo120158f() {
        return C77429f.f173733h;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: h */
    public final int[] mo120160h() {
        return this.f174250a;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: k */
    public final int mo120163k() {
        return this.f174251b;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final boolean mo120146a() {
        return C76660b.m134243c();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final boolean mo120148a(String str) {
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode == 1619864869 ? str.equals("chat_list") : !(hashCode != 1837742968 || !str.equals("story_archive"))) {
            return true;
        }
        if (!C76660b.m134242b()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final boolean mo120147a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (!C76706a.m134277c(aweme) || C50545m.m94762a(aweme)) {
            return false;
        }
        long j = C77163d.f173102a.getLong("STORY_GUIDE_START_SHOW_TIME", -1);
        if (j < 0) {
            C77163d.f173102a.storeLong("STORY_GUIDE_START_SHOW_TIME", System.currentTimeMillis());
            C77163d.f173102a.storeInt("STORY_GUIDE_SHOW_COUNT", 0);
        } else if (System.currentTimeMillis() - j > 86400000) {
            C77163d.f173102a.storeLong("STORY_GUIDE_START_SHOW_TIME", System.currentTimeMillis());
            C77163d.f173102a.storeInt("STORY_GUIDE_SHOW_COUNT", 0);
        }
        int i = C77163d.f173102a.getInt("STORY_GUIDE_SHOW_COUNT", 0);
        if (i >= C77161c.m134769a().f173097f) {
            return false;
        }
        C77163d.f173102a.storeInt("STORY_GUIDE_SHOW_COUNT", i + 1);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: g */
    public final void mo120159g() {
        C76430a.f171681a.storeInt("key_setting", C76660b.m134241a());
    }

    /* renamed from: l */
    public static IStoryService m135668l() {
        MethodCollector.m26663i(4476);
        Object a = C81908b.m141854a(IStoryService.class, false);
        if (a != null) {
            IStoryService iStoryService = (IStoryService) a;
            MethodCollector.m26664o(4476);
            return iStoryService;
        }
        if (C81908b.f183385eo == null) {
            synchronized (IStoryService.class) {
                try {
                    if (C81908b.f183385eo == null) {
                        C81908b.f183385eo = new StoryServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4476);
                    throw th;
                }
            }
        }
        StoryServiceImpl storyServiceImpl = (StoryServiceImpl) C81908b.f183385eo;
        MethodCollector.m26664o(4476);
        return storyServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: i */
    public final boolean mo120161i() {
        boolean z;
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        boolean isChildrenMode = e.isChildrenMode();
        if (!C76660b.m134243c() || C76660b.m134246f()) {
            z = false;
        } else {
            z = true;
        }
        if (isChildrenMode || !z) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: j */
    public final void mo120162j() {
        C77429f.f173727b.clear();
        List<C77444g> list = C77429f.f173731f;
        if (list != null) {
            for (T t : list) {
                AbstractC72639k kVar = t.f173767b.f173725e;
                if (kVar != null) {
                    C77445h.f173768a.removeCallback(t.f173766a.getScheduleId(), kVar);
                }
            }
        }
        List<C77444g> list2 = C77429f.f173731f;
        if (list2 != null) {
            list2.clear();
        }
        C77429f.f173730e = false;
        C77272b b = C77278d.m135096b();
        C77283a.m135111b(C77272b.f173357b, "clear");
        b.mo120873a().mo2093a();
        C76494a.f171779a.clear();
        C76494a.f171780b.clear();
        C76494a.f171781c.clear();
    }

    public StoryServiceImpl() {
        int[] iArr;
        int i;
        int i2 = 0;
        if (C76681f.m134256a()) {
            iArr = new int[2];
            Resources resources = C17867d.m33078a().getResources();
            C89219l.m154709a((Object) resources, "");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.widthPixels;
            } else {
                i = 0;
            }
            iArr[0] = i / 2;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            int a2 = a + C89241a.m154730a(TypedValue.applyDimension(1, 64.0f, system2.getDisplayMetrics()));
            Context a3 = C17867d.m33078a();
            int identifier = a3.getResources().getIdentifier("status_bar_height", "dimen", "android");
            iArr[1] = a2 + (identifier > 0 ? a3.getResources().getDimensionPixelSize(identifier) : i2);
        } else if (C23163i.m43663a(C17867d.m33078a())) {
            int a4 = C23159f.m43649a(C17867d.m33078a());
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            iArr = new int[]{a4 - C89241a.m154730a(TypedValue.applyDimension(1, 46.0f, system3.getDisplayMetrics())), C89241a.m154730a(TypedValue.applyDimension(1, 190.0f, system4.getDisplayMetrics()))};
        } else {
            Resources system5 = Resources.getSystem();
            C89219l.m154709a((Object) system5, "");
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            iArr = new int[]{C89241a.m154730a(TypedValue.applyDimension(1, 46.0f, system5.getDisplayMetrics())), C89241a.m154730a(TypedValue.applyDimension(1, 190.0f, system6.getDisplayMetrics()))};
        }
        this.f174250a = iArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120140a(int i) {
        this.f174251b = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120145a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        this.f174250a = iArr;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.service.StoryServiceImpl$a */
    static final class C77690a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f174252a;

        static {
            Covode.recordClassIndex(90735);
        }

        C77690a(String str) {
            this.f174252a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C77283a.m135107a("reportViewed", "succeeded for " + this.f174252a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.service.StoryServiceImpl$b */
    static final class C77691b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f174253a;

        static {
            Covode.recordClassIndex(90736);
        }

        C77691b(String str) {
            this.f174253a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C77283a.m135108a("reportViewed", "failed for " + this.f174253a, th);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final AbstractC76590b mo120150b(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C77284a aVar = new C77284a();
        Bundle bundle = new Bundle();
        bundle.putString("story_id", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: c */
    public final Object mo120154c(AbstractC35440cd cdVar) {
        C89219l.m154721d(cdVar, "");
        if (cdVar instanceof C48238ce) {
            return new StoryFeedUploadingViewHolder((C48238ce) cdVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: c */
    public final void mo120155c(String str) {
        C89219l.m154721d(str, "");
        StoryApi.f171712a.reportStoryViewed(str).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142915a(new C77690a(str), new C77691b(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final Object mo120139a(AbstractC35440cd cdVar) {
        C89219l.m154721d(cdVar, "");
        if (cdVar instanceof C48238ce) {
            return new StoryVideoViewHolder((C48238ce) cdVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final Object mo120152b(AbstractC35440cd cdVar) {
        C89219l.m154721d(cdVar, "");
        if (cdVar instanceof C48238ce) {
            return new StoryPlayerListViewHolder((C48238ce) cdVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120141a(ActivityC0945e eVar) {
        if (eVar != null) {
            C89219l.m154721d(eVar, "");
            if (C76430a.f171681a.getInt("key_setting", 0) != 5 || (!C76430a.f171681a.getBoolean("key_tutorial_1_has_shown", false) && C76430a.f171681a.getBoolean("key_new_version", false))) {
                C76438b bVar = new C76438b(eVar, (byte) 0);
                C76430a.View$OnClickListenerC76436f fVar = new C76430a.View$OnClickListenerC76436f(bVar);
                C76430a.View$OnClickListenerC76435e eVar2 = new C76430a.View$OnClickListenerC76435e(bVar);
                bVar.getCloseBtn().setOnClickListener(fVar);
                bVar.getCreateBtn().setOnClickListener(eVar2);
                bVar.getCreateBtn().setText(bVar.getCreateBtn().getContext().getString(R.string.bx));
                bVar.getTutorialView().setVisibility(0);
                C76598h.m134184a("shoot_page", "popup", "show", "camera", 24);
                C76430a.m134024a(eVar, (View) bVar, false);
                if (C76430a.f171681a.getInt("key_setting", 0) == 5) {
                    C76430a.f171681a.storeBoolean("key_tutorial_1_has_shown", true);
                    C76430a.f171681a.storeInt("key_tutorial_show_times", 1);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final IStoryViewerListViewModel mo120136a(ActivityC0945e eVar, AbstractC1183ag agVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(agVar, "");
        return StoryViewerListViewModel.C77345a.m135239a(eVar, agVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final AbstractC88979t<BaseResponse> mo120138a(String str, int i) {
        C89219l.m154721d(str, "");
        return StoryInteractionApi.f173406a.sendEmojiReaction(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final AbstractC76590b mo120151b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C77289b bVar = new C77289b();
        Bundle bundle = new Bundle();
        bundle.putString("story_id", str);
        bundle.putString("viewer_id", str2);
        bVar.setArguments(bundle);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2.equals("others_homepage") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2.equals("follow_request") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2.equals("personal_homepage") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (com.p2082ss.android.ugc.aweme.story.p4024c.C76660b.m134246f() == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        return com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a.LOOP_CURRENT_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r2.equals("homepage_follow") != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        return com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a.LOOP_CURRENT_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r2.equals("notification_page") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if ("STORY_ENTRANCE_AVATAR".equals(r3) != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        return com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a.LOOP_CURRENT_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        return com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a.QUIT_AFTER_FINISH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2.equals("homepage_hot") != false) goto L_0x0059;
     */
    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a mo120137a(java.lang.String r2, java.lang.String r3) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.service.StoryServiceImpl.mo120137a(java.lang.String, java.lang.String):com.ss.android.ugc.aweme.story.e.a");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120142a(ActivityC0945e eVar, String str) {
        UrlModel avatarThumb;
        C89219l.m154721d(str, "");
        if (eVar != null) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str, "");
            boolean z = C76430a.f171681a.getBoolean("key_tutorial_1_has_shown", false);
            int i = C76430a.f171681a.getInt("key_tutorial_show_times", 0);
            long j = C76430a.f171681a.getLong("key_tutorial_last_time", 0);
            if (C76430a.f171681a.getInt("key_setting", 0) == 5 && C76430a.f171681a.getBoolean("key_new_version", false)) {
                if (z) {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!g.isLogin() || i >= 7) {
                        return;
                    }
                }
                if (j == 0 || C80566ib.m139650a(Long.valueOf(j)) > 0) {
                    C76438b bVar = new C76438b(eVar, (byte) 0);
                    bVar.getCloseBtn().setOnClickListener(new C76430a.View$OnClickListenerC76434d(bVar));
                    bVar.getCreateBtn().setOnClickListener(new C76430a.View$OnClickListenerC76433c(bVar, str, eVar, z));
                    if (z) {
                        bVar.getTutorialV5View().setVisibility(0);
                        IAccountUserService g2 = C31575b.m65865g();
                        C89219l.m154716b(g2, "");
                        User curUser = g2.getCurUser();
                        if (!(curUser == null || (avatarThumb = curUser.getAvatarThumb()) == null)) {
                            C20766v b = C20761r.m39060a(C34735v.m70965a(avatarThumb)).mo34185b(C80397em.m139369a(100));
                            b.f49098K = true;
                            C20766v a = b.mo34179a("StoryEducationPanel");
                            a.f49125v = EnumC20767w.CENTER_CROP;
                            a.f49092E = bVar.getAvatarView();
                            a.mo34186c();
                        }
                    } else {
                        bVar.getTutorialView().setVisibility(0);
                        C76430a.f171681a.storeBoolean("key_tutorial_1_has_shown", true);
                    }
                    C76430a.f171681a.storeLong("key_tutorial_last_time", System.currentTimeMillis());
                    C76430a.f171681a.storeInt("key_tutorial_show_times", i + 1);
                    C76430a.m134024a(eVar, (View) bVar, false);
                    C76430a.m134026a(str, "show");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120144a(String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        ((Map) C77238a.f173256e.getValue()).put(str, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120143a(ActivityC0945e eVar, String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        if (eVar != null) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str, "");
            C76438b bVar = new C76438b(eVar, (byte) 0);
            bVar.getCloseBtn().setOnClickListener(new C76430a.View$OnClickListenerC76432b(bVar));
            bVar.getCreateBtn().setOnClickListener(new C76430a.View$OnClickListenerC76431a(bVar, str, aweme, eVar));
            bVar.getTutorialView().setVisibility(0);
            AbstractC81915c.m141874a(new C36389e(1, eVar.hashCode()));
            C76430a.m134024a(eVar, (View) bVar, true);
            C76430a.m134025a(str, aweme, "show");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final AbstractC34835bi mo120135a(ViewGroup viewGroup, AbstractC84295k kVar, AbstractC35440cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, AbstractC89172b<? super String, ? extends View> bVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(cdVar, "");
        C89219l.m154721d(viewGroup2, "");
        C89219l.m154721d(viewGroup3, "");
        C89219l.m154721d(viewGroup4, "");
        return new C77203d(viewGroup, kVar, (C48238ce) cdVar, viewGroup2, viewGroup3, viewGroup4, bVar);
    }
}
