package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55372b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel */
public final class GroupShareViewModel extends AbstractC1174ac implements AbstractC33974au {

    /* renamed from: f */
    public static final C55384b f126629f = new C55384b((byte) 0);

    /* renamed from: a */
    public final C19638h f126630a;

    /* renamed from: b */
    public final C1213t<C55372b> f126631b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<C69684e> f126632c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Boolean> f126633d = new C1213t<>();

    /* renamed from: e */
    public final String f126634e;

    /* renamed from: g */
    private final AbstractC89516am f126635g = C89517an.m155448a(new C55383a(CoroutineExceptionHandler.f203145c));

    static {
        Covode.recordClassIndex(65153);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel$b */
    public static final class C55384b {
        static {
            Covode.recordClassIndex(65155);
        }

        private C55384b() {
        }

        public /* synthetic */ C55384b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo92455a() {
        AbstractC89568bz unused = C89624i.m155555a(this.f126635g, C89546bf.f203267b, null, new C55386d(this, null), 2);
    }

    /* renamed from: b */
    public final void mo92456b() {
        this.f126633d.postValue(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel$a */
    public static final class C55383a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65154);
        }

        public C55383a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102188a(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel$c */
    public static final class C55385c extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f126636a;

        static {
            Covode.recordClassIndex(65156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55385c(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f126636a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return Boolean.valueOf(!bVar2.mo109557b(this.f126636a));
        }
    }

    public GroupShareViewModel(String str) {
        C89219l.m154721d(str, "");
        this.f126634e = str;
        this.f126630a = AbstractC17420a.C17421a.m32276a().mo27720a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel$d */
    static final class C55386d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126637a;

        /* renamed from: b */
        final /* synthetic */ GroupShareViewModel f126638b;

        static {
            Covode.recordClassIndex(65157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55386d(GroupShareViewModel groupShareViewModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126638b = groupShareViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55386d(this.f126638b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55386d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C55372b bVar;
            String str;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f126637a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    String str2 = this.f126638b.f126634e;
                    this.f126637a = 1;
                    obj = C55262b.m101019a().getGroupInviteInfo(str2).mo144106a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e) {
                    C56244a.m102188a(e);
                    bVar = null;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (C55372b) obj;
            this.f126638b.f126631b.postValue(bVar);
            C56244a.m102191c("GroupShareViewModel", "response: ".concat(String.valueOf(bVar)));
            if (bVar != null && bVar.f126607e == null) {
                GroupShareViewModel groupShareViewModel = this.f126638b;
                Activity a = C55075a.m100721a();
                if (!(a instanceof GroupChatDetailActivity)) {
                    a = null;
                }
                GroupChatDetailActivity groupChatDetailActivity = (GroupChatDetailActivity) a;
                if (groupChatDetailActivity != null) {
                    SharePackage.C69654a aVar2 = new SharePackage.C69654a();
                    String str3 = bVar.f126604b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    GroupSharePackage groupSharePackage = new GroupSharePackage(aVar2.mo109809e(str3).mo109803a("group"));
                    UrlModel urlModel = new UrlModel();
                    String[] strArr = new String[1];
                    C55371a aVar3 = bVar.f126606d;
                    if (aVar3 != null) {
                        str = aVar3.getAvatarUrl();
                    } else {
                        str = null;
                    }
                    strArr[0] = str;
                    urlModel.setUrlList(C89070n.m154524c(strArr));
                    groupSharePackage.f155492i.putSerializable("video_cover", urlModel);
                    C69684e.C69686b bVar2 = new C69684e.C69686b();
                    Bundle bundle = groupSharePackage.f155492i;
                    bundle.putString("invite_id", bVar.f126603a);
                    Long l = bVar.f126605c;
                    if (l != null) {
                        bundle.putLong("expired_at", l.longValue());
                    }
                    bundle.putSerializable("group", bVar.f126606d);
                    AbstractC69581b a2 = ShareDependService.C68823b.m121325a(ShareDependService.C68822a.m121324a(), groupSharePackage, null, 6);
                    if (a2 != null) {
                        bVar2.f155570a.add(a2);
                    }
                    C68863ah.f154027a.mo109409a(bVar2, (Activity) groupChatDetailActivity, true);
                    bVar2.mo109823a(new C69109b());
                    bVar2.f155583n = groupSharePackage;
                    C69684e a3 = bVar2.mo109831a();
                    if (a3.f155552d) {
                        C89070n.m154537a((List) a3.f155549a, (AbstractC89172b) new C55385c(groupChatDetailActivity));
                    }
                    groupShareViewModel.f126632c.postValue(a3);
                }
            }
            return C89391z.f203057a;
        }
    }
}
