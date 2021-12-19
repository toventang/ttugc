package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.share.business.tcm.C68899a;
import com.p2082ss.android.ugc.aweme.share.business.tcm.TCMOrderDeleteApi;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69318j;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.h */
public final class C69053h implements AbstractC69693h {

    /* renamed from: d */
    public static final C69054a f154457d = new C69054a((byte) 0);

    /* renamed from: a */
    public final TCMOrderDeleteApi f154458a;

    /* renamed from: b */
    public final WeakReference<AbstractC49691s<C49672ag>> f154459b;

    /* renamed from: c */
    public final String f154460c;

    /* renamed from: e */
    private final String f154461e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.h$c */
    static final class C69066c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C69066c f154476a = new C69066c();

        static {
            Covode.recordClassIndex(81380);
        }

        C69066c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(81367);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.b4w;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "delete";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_trash_bin;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_trash_bin;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.h$a */
    public static final class C69054a {
        static {
            Covode.recordClassIndex(81368);
        }

        private C69054a() {
        }

        public /* synthetic */ C69054a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.h$b */
    static final class C69055b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69053h f154462a;

        /* renamed from: b */
        final /* synthetic */ Aweme f154463b;

        /* renamed from: c */
        final /* synthetic */ Context f154464c;

        /* renamed from: d */
        final /* synthetic */ String f154465d;

        static {
            Covode.recordClassIndex(81369);
        }

        C69055b(C69053h hVar, Aweme aweme, Context context, String str) {
            this.f154462a = hVar;
            this.f154463b = aweme;
            this.f154464c = context;
            this.f154465d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C68899a aVar = (C68899a) obj;
            int i = aVar.f154108a;
            if (i != 1) {
                if (i == 2) {
                    C17197a.C17200a aVar2 = new C17197a.C17200a(this.f154464c);
                    aVar2.f41059E = true;
                    aVar2.mo27194b(R.string.b5q);
                    aVar2.mo27195b(R.string.a8z, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC690583.f154468a, false).mo27190a(R.string.fba, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h.C69055b.DialogInterface$OnClickListenerC690594 */

                        /* renamed from: a */
                        final /* synthetic */ C69055b f154469a;

                        static {
                            Covode.recordClassIndex(81373);
                        }

                        {
                            this.f154469a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            AbstractC88979t<BaseResponse> a;
                            TCMOrderDeleteApi tCMOrderDeleteApi = this.f154469a.f154462a.f154458a;
                            String valueOf = String.valueOf(this.f154469a.f154463b.getStarAtlasOrderId());
                            String aid = this.f154469a.f154463b.getAid();
                            C89219l.m154716b(aid, "");
                            AbstractC88979t<BaseResponse> b = tCMOrderDeleteApi.applyDeleteTCMOrder(valueOf, aid).mo143278b(C88925a.m154180b(C88946a.f201991c));
                            if (!(b == null || (a = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) == null)) {
                                a.mo143254a(new AbstractC88433f(this) {
                                    /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h.C69055b.DialogInterface$OnClickListenerC690594.C690601 */

                                    /* renamed from: a */
                                    final /* synthetic */ DialogInterface$OnClickListenerC690594 f154470a;

                                    static {
                                        Covode.recordClassIndex(81374);
                                    }

                                    {
                                        this.f154470a = r1;
                                    }

                                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                    public final /* synthetic */ void accept(Object obj) {
                                        new C79459a(this.f154470a.f154469a.f154464c).mo123050a(R.string.gg0).mo123053a();
                                    }
                                }, new AbstractC88433f(this) {
                                    /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h.C69055b.DialogInterface$OnClickListenerC690594.C690612 */

                                    /* renamed from: a */
                                    final /* synthetic */ DialogInterface$OnClickListenerC690594 f154471a;

                                    static {
                                        Covode.recordClassIndex(81375);
                                    }

                                    {
                                        this.f154471a = r1;
                                    }

                                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                    public final /* synthetic */ void accept(Object obj) {
                                        new C79459a(this.f154471a.f154469a.f154464c).mo123050a(R.string.gfz).mo123053a();
                                    }
                                });
                            }
                            dialogInterface.dismiss();
                        }
                    }, false).mo27193a().mo27185c();
                } else if (i == 3) {
                    C17197a.C17200a aVar3 = new C17197a.C17200a(this.f154464c);
                    aVar3.f41059E = true;
                    aVar3.mo27194b(R.string.b5j);
                    aVar3.mo27195b(R.string.agk, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC690625.f154472a, false).mo27190a(R.string.h_9, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h.C69055b.DialogInterface$OnClickListenerC690636 */

                        static {
                            Covode.recordClassIndex(81377);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C36125t a = C36125t.m73591a();
                            if (a != null) {
                                C36125t.m73598a(a, aVar.f154109b);
                            }
                            dialogInterface.dismiss();
                        }
                    }, false).mo27193a().mo27185c();
                } else if (i == 4) {
                    C17197a.C17200a aVar4 = new C17197a.C17200a(this.f154464c);
                    aVar4.f41059E = true;
                    aVar4.mo27194b(R.string.b5p);
                    aVar4.mo27195b(R.string.agk, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC690647.f154474a, false).mo27190a(R.string.h_9, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h.C69055b.DialogInterface$OnClickListenerC690658 */

                        static {
                            Covode.recordClassIndex(81379);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C36125t a = C36125t.m73591a();
                            if (a != null) {
                                C36125t.m73598a(a, aVar.f154109b);
                            }
                            dialogInterface.dismiss();
                        }
                    }, false).mo27193a().mo27185c();
                }
            } else if (!C69318j.m122516a(this.f154463b) || !C50545m.m94762a(this.f154463b)) {
                C69011av.m121893a(this.f154463b);
            } else {
                C17197a.C17200a aVar5 = new C17197a.C17200a(this.f154464c);
                aVar5.f41059E = true;
                aVar5.mo27194b(R.string.b56);
                aVar5.mo27195b(R.string.a8z, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC690561.f154466a, false).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69053h.C69055b.DialogInterface$OnClickListenerC690572 */

                    /* renamed from: a */
                    final /* synthetic */ C69055b f154467a;

                    static {
                        Covode.recordClassIndex(81371);
                    }

                    {
                        this.f154467a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AbstractC49691s<C49672ag> sVar = this.f154467a.f154462a.f154459b.get();
                        if (sVar != null) {
                            sVar.mo63634a(new C49672ag(2, this.f154467a.f154463b));
                        }
                        C69011av.m121894a(true, this.f154467a.f154463b, this.f154467a.f154462a.f154460c, this.f154467a.f154465d, "");
                        dialogInterface.dismiss();
                    }
                }, false).mo27193a().mo27185c();
            }
        }
    }

    public C69053h(String str, AbstractC49691s<C49672ag> sVar) {
        TCMOrderDeleteApi tCMOrderDeleteApi;
        IRetrofit createNewRetrofit;
        C89219l.m154721d(str, "");
        C89219l.m154721d(sVar, "");
        this.f154460c = str;
        String str2 = Api.f79771d;
        this.f154461e = str2;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin == null || (createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str2)) == null) {
            tCMOrderDeleteApi = null;
        } else {
            tCMOrderDeleteApi = (TCMOrderDeleteApi) createNewRetrofit.create(TCMOrderDeleteApi.class);
        }
        this.f154458a = tCMOrderDeleteApi;
        this.f154459b = new WeakReference<>(sVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        Aweme a;
        String str;
        long j;
        AbstractC88979t<C68899a> b;
        AbstractC88979t<C68899a> a2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if ((sharePackage instanceof AwemeSharePackage) && sharePackage != null && (a = ((AwemeSharePackage) sharePackage).mo109569a()) != null) {
            String string = sharePackage.f155492i.getString("tab_name", "");
            String string2 = sharePackage.f155492i.getString("impr_id", "");
            C89219l.m154716b(string2, "");
            C89219l.m154716b(string, "");
            if (C76706a.m134278d(a)) {
                str = "story";
            } else {
                str = UGCMonitor.TYPE_POST;
            }
            Story story = a.getStory();
            if (story != null) {
                j = story.getViewerCount();
            } else {
                j = -1;
            }
            C33744d a3 = new C33744d().mo59983a("group_id", a.getAid()).mo59983a("enter_from", this.f154460c).mo59983a("impr_id", string2).mo59983a("story_type", str).mo59981a("item_vv", j);
            if (TextUtils.equals(this.f154460c, "personal_homepage")) {
                a3.mo59983a("tab_name", string);
            }
            C39162r.m79460a("click_delete_video", a3.f79943a);
            if (C50545m.m94762a(a) && a.getStarAtlasOrderId() > 0) {
                TCMOrderDeleteApi tCMOrderDeleteApi = this.f154458a;
                if (tCMOrderDeleteApi != null) {
                    String valueOf = String.valueOf(a.getStarAtlasOrderId());
                    String aid = a.getAid();
                    C89219l.m154716b(aid, "");
                    AbstractC88979t<C68899a> checkTCMOrderDeleteStatus = tCMOrderDeleteApi.checkTCMOrderDeleteStatus(valueOf, aid);
                    if (checkTCMOrderDeleteStatus != null && (b = checkTCMOrderDeleteStatus.mo143278b(C88925a.m154180b(C88946a.f201991c))) != null && (a2 = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null) {
                        a2.mo143254a(new C69055b(this, a, context, string), C69066c.f154476a);
                    }
                }
            } else if (!C69318j.m122516a(a) || !C50545m.m94762a(a)) {
                C69011av.m121893a(a);
            } else {
                C69011av.m121892a(context, a, this.f154459b.get(), string, this.f154460c, null, 32);
            }
        }
    }
}
