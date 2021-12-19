package com.p2082ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SharedViewModelProvider;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.api.AbstractC36272e;
import com.p2082ss.android.ugc.aweme.comment.api.C36267a;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import com.p2082ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.C36379b;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.p2082ss.android.ugc.aweme.comment.p2485b.C36294a;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36491b;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37048bj;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36895l;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36897m;
import com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.comment.util.C37190d;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.comment.util.C37197g;
import com.p2082ss.android.ugc.aweme.comment.util.C37206l;
import com.p2082ss.android.ugc.aweme.comment.util.C37215r;
import com.p2082ss.android.ugc.aweme.comment.util.C37218u;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.feed.widget.C50509c;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61479e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl */
public final class CommentServiceImpl implements CommentService {

    /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$c */
    static final class DialogInterface$OnDismissListenerC36160c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC36160c f85420a = new DialogInterface$OnDismissListenerC36160c();

        static {
            Covode.recordClassIndex(43415);
        }

        DialogInterface$OnDismissListenerC36160c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    static {
        Covode.recordClassIndex(43412);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$a */
    public static final class C36158a implements C1175ad.AbstractC1177b {
        static {
            Covode.recordClassIndex(43413);
        }

        C36158a() {
        }

        @Override // androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            C89219l.m154721d(cls, "");
            return new CommentViewModelImpl();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63295a(String str, Integer num, int i, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int intValue = num != null ? num.intValue() : -1;
        if (C61479e.m111326b()) {
            C17796c.m32993a(new C36267a(str2, i, str, str3, intValue));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63293a(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_id", str);
        PowerPreloadServiceImpl.m111300a().mo28815a("/aweme/v2/comment/list/", linkedHashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63285a() {
        PowerPreloadServiceImpl.m111300a().mo28815a("/aweme/v2/comment/list/", null);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63288a(Context context, QaStruct qaStruct, String str, String str2, String str3) {
        C89219l.m154721d(context, "");
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        C37218u.m75213a(context, qaStruct, str, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63289a(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        ArrayList arrayList;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(onActivityResultCallback, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//social/taglist");
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(IMUser.fromInteractionTagUser(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = C89086z.INSTANCE;
        }
        buildRoute.withParam("init_config", new VideoTagPage.C36641b(str, aweme, i, arrayList)).open(111, onActivityResultCallback);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63290a(ActivityC0945e eVar, Aweme aweme, String str, String str2) {
        List<InteractionTagUserInfo> taggedUsers;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str2, "");
        float b = ((float) C13628n.m24521b(eVar)) * 0.5f;
        Bundle bundle = new Bundle();
        bundle.putSerializable("aweme", aweme);
        int i = (!C36410g.m74112c() || !C80580in.m139681a(aweme.getAuthorUid())) ? 0 : 1;
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (!(interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null || !(!taggedUsers.isEmpty()))) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) taggedUsers, 10));
            Iterator<T> it = taggedUsers.iterator();
            while (it.hasNext()) {
                arrayList.add(InteractionTagInfoKt.toUser(it.next()));
            }
            bundle.putSerializable("tagged_users", arrayList);
            i += taggedUsers.size();
        }
        if (str == null) {
            str = "";
        }
        bundle.putString("enter_from", str);
        bundle.putString("anchor_type", str2);
        float b2 = C13628n.m24520b(eVar, (((float) i) * 64.0f) + 60.0f);
        if (b2 <= b) {
            b = b2;
        }
        C36864d dVar = new C36864d();
        dVar.setArguments(bundle);
        C36159b bVar = new C36159b(dVar);
        C89219l.m154721d(bVar, "");
        dVar.f86852g = bVar;
        new C23226a.C23227a().mo37812a(1).mo37821b((int) b).mo37822b(false).mo37817a(dVar).mo37815a(DialogInterface$OnDismissListenerC36160c.f85420a).f55057a.show(eVar.getSupportFragmentManager(), "FeedTaggedListFragment");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63286a(Activity activity, String str, String str2, String str3, int i) {
        C89219l.m154721d(activity, "");
        C37206l.C37207a.m75196a(activity, str, str2, str3, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63292a(AbstractC0952i iVar, CommentRethinkPopup commentRethinkPopup, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(commentRethinkPopup, "");
        C37057br a = C37057br.C37062c.m74750a(commentRethinkPopup);
        a.f87312a = new C36161d(aVar, aVar2, aVar3);
        a.show(iVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63296a(String str, String str2) {
        CommentApi.m73893a(str, 0, 20, null, null, C33721c.m69041a(str2));
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final boolean mo63297a(Context context) {
        C37048bj a = C37048bj.m74703a(context);
        return a != null && a.mo63708a();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63294a(String str, Aweme aweme, JSONObject jSONObject, String str2) {
        String str3 = str;
        if (str3.equals("opus")) {
            str3 = "others_homepage";
        }
        JSONObject a = ForwardStatisticsServiceImpl.m95759b().mo86845a(jSONObject, aweme, str2);
        C17867d.m33078a();
        C39162r.m79456a(UGCMonitor.EVENT_COMMENT, str3, aweme.getAid(), 0, a);
        User author = aweme.getAuthor();
        C39162r.m79460a(UGCMonitor.EVENT_COMMENT, new C33744d().mo59983a("enter_from", str3).mo59983a("group_id", aweme.getAid()).mo59980a("follow_status", author != null ? author.getFollowStatus() : 0).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
    /* renamed from: a */
    public final void mo63287a(Context context, int i, String str) {
        if (context != null) {
            C17197a.C17200a aVar = new C17197a.C17200a(context);
            aVar.mo27189a(i);
            aVar.f41071b = str;
            aVar.mo27190a(R.string.a7h, (DialogInterface.OnClickListener) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE  
                  (r3v0 'aVar' com.bytedance.ies.dmt.ui.dialog.a$a)
                  (wrap: int : ?: SGET   com.ss.android.ugc.trill.R.string.a7h int)
                  (wrap: android.content.DialogInterface$OnClickListener : ?: CAST (android.content.DialogInterface$OnClickListener) (wrap: com.ss.android.ugc.aweme.comment.l.a$1 : 0x000e: CONSTRUCTOR  (r2v0 com.ss.android.ugc.aweme.comment.l.a$1) =  call: com.ss.android.ugc.aweme.comment.l.a.1.<init>():void type: CONSTRUCTOR))
                  false
                 type: VIRTUAL call: com.bytedance.ies.dmt.ui.dialog.a.a.a(int, android.content.DialogInterface$OnClickListener, boolean):com.bytedance.ies.dmt.ui.dialog.a$a in method: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (android.content.DialogInterface$OnClickListener) (wrap: com.ss.android.ugc.aweme.comment.l.a$1 : 0x000e: CONSTRUCTOR  (r2v0 com.ss.android.ugc.aweme.comment.l.a$1) =  call: com.ss.android.ugc.aweme.comment.l.a.1.<init>():void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r2v0 com.ss.android.ugc.aweme.comment.l.a$1) =  call: com.ss.android.ugc.aweme.comment.l.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.comment.l.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 31 more
                */
            /*
                this = this;
                if (r5 == 0) goto L_0x0023
                com.bytedance.ies.dmt.ui.dialog.a$a r3 = new com.bytedance.ies.dmt.ui.dialog.a$a
                r3.<init>(r5)
                r3.mo27189a(r6)
                r3.f41071b = r7
                com.ss.android.ugc.aweme.comment.l.a$1 r2 = new com.ss.android.ugc.aweme.comment.l.a$1
                r2.<init>()
                r0 = 2131821880(0x7f110538, float:1.9276516E38)
                r1 = 0
                r3.mo27190a(r0, r2, r1)
                com.bytedance.ies.dmt.ui.dialog.a r0 = r3.mo27193a()
                android.app.Dialog r0 = r0.mo27184b()
                r0.setCancelable(r1)
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl.mo63287a(android.content.Context, int, java.lang.String):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final void mo63291a(ActivityC0945e eVar, boolean z, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(aVar, "");
            if (eVar != null) {
                Keva repo = Keva.getRepo("repo_video_tag");
                int a = C36410g.m74110a();
                if (a != 0 && !repo.getBoolean("key_intro_has_shown", false)) {
                    if ((C89070n.m154525d(1, 2, 5).contains(Integer.valueOf(C36410g.m74110a())) && z) || (a == 3 && !z)) {
                        repo.storeBoolean("key_intro_has_shown", true);
                        C36895l lVar = new C36895l(eVar, (byte) 0);
                        C36162e eVar2 = new C36162e(lVar);
                        C89219l.m154721d(lVar, "");
                        C89219l.m154721d(eVar2, "");
                        ((TuxIconView) lVar.mo9603b(R.id.fds)).setOnClickListener(new C36897m.View$OnClickListenerC36898a(lVar, eVar2));
                        ((TuxButton) lVar.mo9603b(R.id.fdt)).setOnClickListener(new C36897m.View$OnClickListenerC36899b(lVar, eVar2));
                        new C23226a.C23227a().mo37812a(0).mo37816a(lVar).mo37815a(new DialogInterface$OnDismissListenerC36163f(aVar, z, lVar)).f55057a.show(eVar.getSupportFragmentManager(), "VideoTagIntroView");
                        C39162r.m79460a("show_tag_introduce_bottom_sheet", new C33744d().mo59983a("page_name", z ? "tag_people_page" : "video_post_page").f79943a);
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$b */
        static final class C36159b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C36864d f85419a;

            static {
                Covode.recordClassIndex(43414);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36159b(C36864d dVar) {
                super(0);
                this.f85419a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C23226a.C23228b.m43788a(this.f85419a);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$d */
        public static final class C36161d implements C37057br.AbstractC37063d {

            /* renamed from: a */
            final /* synthetic */ AbstractC89171a f85421a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89171a f85422b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89171a f85423c;

            static {
                Covode.recordClassIndex(43416);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br.AbstractC37063d
            /* renamed from: a */
            public final void mo63310a() {
                AbstractC89171a aVar = this.f85421a;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br.AbstractC37063d
            /* renamed from: b */
            public final void mo63311b() {
                AbstractC89171a aVar = this.f85422b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br.AbstractC37063d
            /* renamed from: c */
            public final void mo63312c() {
                AbstractC89171a aVar = this.f85423c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            C36161d(AbstractC89171a aVar, AbstractC89171a aVar2, AbstractC89171a aVar3) {
                this.f85421a = aVar;
                this.f85422b = aVar2;
                this.f85423c = aVar3;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$e */
        static final class C36162e extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C36895l f85424a;

            static {
                Covode.recordClassIndex(43417);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36162e(C36895l lVar) {
                super(0);
                this.f85424a = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C23226a.C23228b.m43787a(this.f85424a);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        public final void mo63302b() {
            C37157k.f87558D = SystemClock.uptimeMillis();
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: c */
        public final AbstractC58264w mo63305c() {
            if (SettingsManager.m29616a().mo25394a("comment_preload_instance_setting_new", 1) == 1) {
                return new CommentPreloadInstanceTask();
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: d */
        public final boolean mo63308d() {
            return C33842s.C33843a.f80132a.mo60073q().mo59941c().booleanValue();
        }

        /* renamed from: e */
        public static CommentService m73664e() {
            MethodCollector.m26663i(11424);
            Object a = C81908b.m141854a(CommentService.class, false);
            if (a != null) {
                CommentService commentService = (CommentService) a;
                MethodCollector.m26664o(11424);
                return commentService;
            }
            if (C81908b.f183172ab == null) {
                synchronized (CommentService.class) {
                    try {
                        if (C81908b.f183172ab == null) {
                            C81908b.f183172ab = new CommentServiceImpl();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(11424);
                        throw th;
                    }
                }
            }
            CommentServiceImpl commentServiceImpl = (CommentServiceImpl) C81908b.f183172ab;
            MethodCollector.m26664o(11424);
            return commentServiceImpl;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        public final AbstractC36272e mo63298b(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            return LikeListVM.C37250a.m75257a(eVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: c */
        public final void mo63306c(Context context) {
            C37048bj a = C37048bj.m74703a(context);
            if (a != null) {
                a.mo63711a(a.mo63708a());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final CommentViewModel mo63277a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C36158a()).mo3983a(CommentViewModelImpl.class);
            C89219l.m154716b(a, "");
            return (CommentViewModel) a;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        public final String mo63301b(String str) {
            C89219l.m154721d(str, "");
            String b = C37215r.m75208b(str);
            C89219l.m154716b(b, "");
            return b;
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$f */
        static final class DialogInterface$OnDismissListenerC36163f implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC89171a f85425a;

            /* renamed from: b */
            final /* synthetic */ boolean f85426b;

            /* renamed from: c */
            final /* synthetic */ C36895l f85427c;

            static {
                Covode.recordClassIndex(43418);
            }

            DialogInterface$OnDismissListenerC36163f(AbstractC89171a aVar, boolean z, C36895l lVar) {
                this.f85425a = aVar;
                this.f85426b = z;
                this.f85427c = lVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                this.f85425a.invoke();
                C33744d dVar = new C33744d();
                if (this.f85426b) {
                    str = "tag_people_page";
                } else {
                    str = "video_post_page";
                }
                C39162r.m79460a("close_tag_introduce_bottom_sheet", dVar.mo59983a("page_name", str).mo59983a("close_type", this.f85427c.getCloseType()).f79943a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final LiveData<Aweme> mo63276a(AbstractC1196i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.INITIALIZED) > 0) {
                return ((SocialVideoTagShareVM) new SharedViewModelProvider().mo3981a(iVar, SocialVideoTagShareVM.class)).f86909a;
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        public final String mo63300b(C38255s sVar) {
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(sVar, "");
            StringBuilder sb = new StringBuilder(sVar.getCommentInfo());
            sb.append(" [label]");
            sb.append(" ").append(C37194f.m75164a(sVar));
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            return sb2;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: c */
        public final boolean mo63307c(Aweme aweme) {
            if (aweme == null || aweme.getAuthor() == null) {
                return false;
            }
            if (aweme.getAuthor().getCommentSetting() == C36294a.f85805d || aweme.getCommentSetting() == C36294a.f85805d) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final C38255s mo63280a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            return C37197g.m75170a(aweme);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        public final void mo63303b(Context context) {
            C37048bj a = C37048bj.m74703a(context);
            if (a != null) {
                a.mo63713b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final AbstractC62694c mo63281a(C36491b bVar) {
            C89219l.m154721d(bVar, "");
            return new C36379b(bVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        public final boolean mo63304b(Aweme aweme) {
            if (aweme == null || aweme.getAuthor() == null) {
                return true;
            }
            User author = aweme.getAuthor();
            int commentSetting = author.getCommentSetting();
            if (AccountService.m65215a().mo57069e().isMe(author.getUid())) {
                if (AccountService.m65215a().mo57069e().getCurUser().getCommentSetting() == C36294a.f85805d || aweme.getCommentSetting() == C36294a.f85805d) {
                    return false;
                }
                return true;
            } else if (commentSetting == C36294a.f85802a) {
                return true;
            } else {
                if (commentSetting == C36294a.f85803b && C80636z.m139820e(aweme)) {
                    return true;
                }
                if (commentSetting != C36294a.f85804c || !C80636z.m139821f(aweme)) {
                    return false;
                }
                return true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final List<TextExtraStruct> mo63283a(C38255s sVar) {
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(sVar, "");
            ArrayList arrayList = new ArrayList();
            int length = sVar.getCommentInfo().length() + 1;
            int i = length + 7;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            textExtraStruct.setCustomSpan(new C50509c(C17867d.m33078a(), C17867d.m33078a().getString(R.string.b66), "#FFFFFFFF", 2131233172, "#80FFFFFF", "#58161823", 10, 17));
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(i);
            arrayList.add(textExtraStruct);
            int i2 = i + 1;
            int length2 = i + C37194f.m75164a(sVar).length();
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(new C37190d.C37191a(C34728n.m70946a(13.0d), C17867d.m33078a().getResources().getColor(R.color.c2)));
            textExtraStruct2.setStart(i2);
            textExtraStruct2.setEnd(length2);
            arrayList.add(textExtraStruct2);
            return arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final AbstractC36418d mo63279a(Activity activity, Aweme aweme, C36500h hVar) {
            C89219l.m154721d(hVar, "");
            return C37048bj.m74702a(activity, aweme, hVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final List<TextExtraStruct> mo63282a(Context context, Aweme aweme, C38255s sVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(aweme, "");
            ArrayList arrayList = new ArrayList();
            int length = sVar.getCommentInfo().length() + 1;
            int i = length + 7;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            textExtraStruct.setCustomSpan(null);
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(i);
            arrayList.add(textExtraStruct);
            int i2 = i + 1;
            int length2 = i + C37194f.m75164a(sVar).length();
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(new C37190d.C37191a(C34728n.m70946a(13.0d), C0643b.m2378c(C17867d.m33078a(), R.color.c2)));
            textExtraStruct2.setStart(i2);
            textExtraStruct2.setEnd(length2);
            arrayList.add(textExtraStruct2);
            return arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        public final List<TextExtraStruct> mo63284a(C38255s sVar, AwemeRawAd awemeRawAd, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(aVar, "");
            ArrayList arrayList = new ArrayList();
            int length = sVar.getCommentInfo().length() + 1;
            int i = length + 7;
            C37194f.C37196b bVar = new C37194f.C37196b(aVar);
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            textExtraStruct.setCustomSpan(bVar);
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(i);
            if (!(awemeRawAd == null || awemeRawAd.getButtonText() == null)) {
                TextExtraStruct textExtraStruct2 = new TextExtraStruct();
                textExtraStruct2.setType(65281);
                C50509c cVar = new C50509c(C17867d.m33078a(), awemeRawAd.getButtonText(), "#80161823", 2131231210, "#80161823", "#0F161823", C34728n.m70948b((double) C34728n.m70949c(12.0d)), 15);
                cVar.f116731a = C13628n.m24520b(C17867d.m33078a(), -2.38f);
                textExtraStruct2.setCustomSpan(cVar);
                textExtraStruct2.setStart(length);
                textExtraStruct2.setEnd(i);
                arrayList.add(textExtraStruct2);
            }
            arrayList.add(textExtraStruct);
            int i2 = i + 1;
            int length2 = i + C37194f.m75164a(sVar).length();
            TextExtraStruct textExtraStruct3 = new TextExtraStruct();
            textExtraStruct3.setType(65281);
            textExtraStruct3.setCustomSpan(new C37190d.C37191a(C34728n.m70946a(13.0d), C17867d.m33078a().getResources().getColor(R.color.c5)));
            textExtraStruct3.setStart(i2);
            textExtraStruct3.setEnd(length2);
            arrayList.add(textExtraStruct3);
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            if (r1 != null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r0 == null) goto L_0x003a;
         */
        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a mo63278a(android.view.View r7, androidx.fragment.app.AbstractC0952i r8, java.lang.String r9, com.p2082ss.android.ugc.aweme.comment.services.AbstractC36952a r10, com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c r11) {
            /*
                r6 = this;
                r5 = 11110(0x2b66, float:1.5568E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
                if (r7 == 0) goto L_0x0009
                if (r8 != 0) goto L_0x000e
            L_0x0009:
                r1 = 0
            L_0x000a:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                return r1
            L_0x000e:
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                r4 = 2131367757(0x7f0a174d, float:1.8355445E38)
                android.view.View r0 = r7.findViewById(r4)
                java.lang.String r3 = "comment_input_tag"
                androidx.fragment.app.Fragment r1 = r8.mo3551a(r3)
                if (r1 == 0) goto L_0x002c
                if (r0 == 0) goto L_0x002f
                com.ss.android.ugc.aweme.comment.ui.b r1 = (com.p2082ss.android.ugc.aweme.comment.p2503ui.C37035b) r1
                if (r1 == 0) goto L_0x000a
            L_0x0025:
                r1.f87247v = r9
                r1.f87244s = r10
                r1.f87246u = r11
                goto L_0x000a
            L_0x002c:
                if (r0 != 0) goto L_0x004f
                goto L_0x003a
            L_0x002f:
                androidx.fragment.app.n r0 = r8.mo3552a()
                androidx.fragment.app.n r0 = r0.mo3455a(r1)
                r0.mo3473c()
            L_0x003a:
                android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
                android.content.Context r0 = r7.getContext()
                r2.<init>(r0)
                r2.setId(r4)
                android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
                r0 = -1
                r1.<init>(r0, r0)
                r7.addView(r2, r1)
            L_0x004f:
                com.ss.android.ugc.aweme.comment.ui.b r1 = new com.ss.android.ugc.aweme.comment.ui.b
                r1.<init>()
                androidx.fragment.app.n r0 = r8.mo3552a()
                androidx.fragment.app.n r0 = r0.mo3454a(r4, r1, r3)
                r0.mo3473c()
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl.mo63278a(android.view.View, androidx.fragment.app.i, java.lang.String, com.ss.android.ugc.aweme.comment.services.a, com.ss.android.ugc.aweme.comment.g.c):com.ss.android.ugc.aweme.comment.e.a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r0 == null) goto L_0x003a;
         */
        @Override // com.p2082ss.android.ugc.aweme.comment.services.CommentService
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a mo63299b(android.view.View r7, androidx.fragment.app.AbstractC0952i r8, java.lang.String r9, com.p2082ss.android.ugc.aweme.comment.services.AbstractC36952a r10, com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c r11) {
            /*
                r6 = this;
                r5 = 11267(0x2c03, float:1.5788E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
                if (r7 == 0) goto L_0x0009
                if (r8 != 0) goto L_0x000e
            L_0x0009:
                r1 = 0
            L_0x000a:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                return r1
            L_0x000e:
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                r4 = 2131367757(0x7f0a174d, float:1.8355445E38)
                android.view.View r0 = r7.findViewById(r4)
                java.lang.String r3 = "story_comment_input_tag"
                androidx.fragment.app.Fragment r1 = r8.mo3551a(r3)
                if (r1 == 0) goto L_0x002c
                if (r0 == 0) goto L_0x002f
                com.ss.android.ugc.aweme.comment.ui.df r1 = (com.p2082ss.android.ugc.aweme.comment.p2503ui.C37141df) r1
            L_0x0023:
                if (r1 == 0) goto L_0x000a
                r1.f87523d = r9
                r1.f87520a = r10
                r1.f87522c = r11
                goto L_0x000a
            L_0x002c:
                if (r0 != 0) goto L_0x004f
                goto L_0x003a
            L_0x002f:
                androidx.fragment.app.n r0 = r8.mo3552a()
                androidx.fragment.app.n r0 = r0.mo3455a(r1)
                r0.mo3473c()
            L_0x003a:
                android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
                android.content.Context r0 = r7.getContext()
                r2.<init>(r0)
                r2.setId(r4)
                android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
                r0 = -1
                r1.<init>(r0, r0)
                r7.addView(r2, r1)
            L_0x004f:
                com.ss.android.ugc.aweme.comment.ui.df r1 = new com.ss.android.ugc.aweme.comment.ui.df
                r1.<init>()
                androidx.fragment.app.n r0 = r8.mo3552a()
                androidx.fragment.app.n r0 = r0.mo3454a(r4, r1, r3)
                r0.mo3473c()
                com.ss.android.ugc.aweme.comment.ui.df r1 = (com.p2082ss.android.ugc.aweme.comment.p2503ui.C37141df) r1
                goto L_0x0023
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl.mo63299b(android.view.View, androidx.fragment.app.i, java.lang.String, com.ss.android.ugc.aweme.comment.services.a, com.ss.android.ugc.aweme.comment.g.c):com.ss.android.ugc.aweme.comment.e.a");
        }
    }
