package com.p2082ss.android.ugc.aweme.qainvitation.service;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65761a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3638c.C65821a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3639d.C65826a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65849f;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.p3641f.C65854a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService */
public final class QAInvitationService implements IQAInvitationService {
    static {
        Covode.recordClassIndex(77359);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService$a */
    static final class C65857a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65761a f148405a;

        static {
            Covode.recordClassIndex(77360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65857a(C65761a aVar) {
            super(0);
            this.f148405a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43787a(this.f148405a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService$b */
    static final class C65858b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65821a f148406a;

        static {
            Covode.recordClassIndex(77361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65858b(C65821a aVar) {
            super(0);
            this.f148406a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43787a(this.f148406a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService$c */
    static final class C65859c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65821a f148407a;

        static {
            Covode.recordClassIndex(77362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65859c(C65821a aVar) {
            super(0);
            this.f148407a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43787a(this.f148407a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService$e */
    static final class C65861e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65826a f148409a;

        static {
            Covode.recordClassIndex(77364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65861e(C65826a aVar) {
            super(0);
            this.f148409a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43787a(this.f148409a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    /* renamed from: a */
    public final C65849f mo105000a() {
        return C65854a.m117765a();
    }

    /* renamed from: b */
    public static IQAInvitationService m117786b() {
        MethodCollector.m26663i(5418);
        Object a = C81908b.m141854a(IQAInvitationService.class, false);
        if (a != null) {
            IQAInvitationService iQAInvitationService = (IQAInvitationService) a;
            MethodCollector.m26664o(5418);
            return iQAInvitationService;
        }
        if (C81908b.f183331db == null) {
            synchronized (IQAInvitationService.class) {
                try {
                    if (C81908b.f183331db == null) {
                        C81908b.f183331db = new QAInvitationService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5418);
                    throw th;
                }
            }
        }
        QAInvitationService qAInvitationService = (QAInvitationService) C81908b.f183331db;
        MethodCollector.m26664o(5418);
        return qAInvitationService;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService$d */
    static final class DialogInterface$OnDismissListenerC65860d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f148408a = null;

        static {
            Covode.recordClassIndex(77363);
        }

        DialogInterface$OnDismissListenerC65860d(AbstractC89171a aVar) {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC89171a aVar = this.f148408a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService$f */
    static final class DialogInterface$OnDismissListenerC65862f implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f148410a = null;

        static {
            Covode.recordClassIndex(77365);
        }

        DialogInterface$OnDismissListenerC65862f(AbstractC89171a aVar) {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC89171a aVar = this.f148410a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    /* renamed from: a */
    public final List<IMUser> mo105001a(List<? extends User> list) {
        C89219l.m154721d(list, "");
        return C65855a.m117768a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    /* renamed from: b */
    public final List<User> mo105005b(List<? extends IMUser> list) {
        C89219l.m154721d(list, "");
        return C65855a.m117773b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    /* renamed from: a */
    public final void mo105002a(Activity activity, String str, String str2, long j, long j2, List<? extends User> list) {
        List<? extends User> list2 = list;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (list2 == null) {
            list2 = C89086z.INSTANCE;
        }
        C65826a aVar = new C65826a(str, str2, j, j2, list2, activity, (byte) 0);
        C23226a.C23227a a = new C23226a.C23227a().mo37812a(2).mo37823c().mo37822b(false).mo37816a(aVar);
        TuxNavBar.C23179a aVar2 = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = activity.getString(R.string.f2c);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a2 = aVar2.mo37731a(gVar.mo37753a(string));
        C23187b a3 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a3.f54930b = true;
        C23226a.C23227a a4 = a.mo37818a(a2.mo37733b(a3.mo37741a((AbstractC89171a<C89391z>) new C65861e(aVar)))).mo37815a(new DialogInterface$OnDismissListenerC65862f(null));
        int a5 = (int) (((float) C65855a.m117766a(activity)) * 0.8f);
        a4.mo37813a(a5, a5);
        a4.f55057a.show(((ActivityC0945e) activity).getSupportFragmentManager(), "InvitedUsersView");
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    /* renamed from: a */
    public final void mo105004a(Activity activity, String str, String str2, Long l, Long l2, List<? extends User> list, Boolean bool) {
        int i;
        long j;
        List<? extends User> list2;
        Object obj;
        int a;
        Integer num;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C65849f a2 = C65854a.m117765a();
        if (a2 == null || (num = a2.f148395a) == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (l2 != null) {
            j2 = l2.longValue();
        }
        if (list == null) {
            list2 = C89086z.INSTANCE;
        } else {
            list2 = list;
        }
        C65821a aVar = new C65821a(str, str2, j, j2, list2, activity, (byte) 0);
        TuxNavBar.C23179a aVar2 = new TuxNavBar.C23179a();
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            C23187b a3 = new C23187b().mo37738a(R.raw.icon_arrow_left_ltr);
            a3.f54930b = true;
            aVar2.mo37732a(a3.mo37741a((AbstractC89171a<C89391z>) new C65858b(aVar)));
        }
        C23226a.C23227a a4 = new C23226a.C23227a().mo37812a(2).mo37823c().mo37822b(false).mo37816a(aVar);
        C23194g gVar = new C23194g();
        Object[] objArr = new Object[2];
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "0";
        }
        objArr[0] = obj;
        objArr[1] = String.valueOf(i);
        String string = activity.getString(R.string.f22, objArr);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a5 = aVar2.mo37731a(gVar.mo37753a(string));
        C23187b a6 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a6.f54930b = true;
        C23226a.C23227a a7 = a4.mo37818a(a5.mo37733b(a6.mo37741a((AbstractC89171a<C89391z>) new C65859c(aVar)))).mo37815a(new DialogInterface$OnDismissListenerC65860d(null));
        if (C89219l.m154714a((Object) str, (Object) "post_qa_video")) {
            a = C65855a.m117771b(activity);
        } else {
            a = C65855a.m117766a(activity);
        }
        a7.mo37813a(a, a);
        a7.f55057a.show(((ActivityC0945e) activity).getSupportFragmentManager(), "InvitedUsersView");
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    /* renamed from: a */
    public final void mo105003a(Activity activity, String str, String str2, EnumC65848e eVar, Long l, Long l2, List<? extends IMUser> list, AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar) {
        int a;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(eVar, "");
        C65761a aVar = new C65761a(activity, str, str2, eVar, l, l2, list, bVar, activity, (byte) 0);
        C23226a.C23227a a2 = new C23226a.C23227a().mo37812a(2).mo37823c().mo37822b(false).mo37816a(aVar);
        TuxNavBar.C23179a aVar2 = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = activity.getString(R.string.f2k);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a3 = aVar2.mo37731a(gVar.mo37753a(string));
        C23187b a4 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a4.f54930b = true;
        C23226a.C23227a a5 = a2.mo37818a(a3.mo37733b(a4.mo37741a((AbstractC89171a<C89391z>) new C65857a(aVar))));
        if (C89219l.m154714a((Object) str, (Object) "post_qa_video")) {
            a = C65855a.m117771b(activity);
        } else {
            a = C65855a.m117766a(activity);
        }
        a5.mo37813a(a, a);
        a5.f55057a.show(((ActivityC0945e) activity).getSupportFragmentManager(), "InvitedUsersView");
    }
}
