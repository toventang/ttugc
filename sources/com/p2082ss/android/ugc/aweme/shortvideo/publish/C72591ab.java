package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70010ct;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ab */
public final class C72591ab {
    static {
        Covode.recordClassIndex(85274);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ab$a */
    public static final class C72592a implements AbstractC27645k<C70010ct> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f162744a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f162745b;

        /* renamed from: c */
        final /* synthetic */ Context f162746c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f162747d;

        /* renamed from: e */
        final /* synthetic */ int f162748e;

        /* renamed from: f */
        final /* synthetic */ int f162749f;

        /* renamed from: g */
        final /* synthetic */ C72640l f162750g;

        static {
            Covode.recordClassIndex(85275);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C72591ab.m128074a("request Failed");
            this.f162744a.invoke();
            this.f162745b.invoke();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C70010ct ctVar) {
            C70010ct ctVar2 = ctVar;
            this.f162744a.invoke();
            if (ctVar2 == null) {
                C72591ab.m128074a("null result");
                this.f162745b.invoke();
                return;
            }
            C72591ab.m128074a("Success isPass:" + ctVar2.isPassed() + " status_code:" + ctVar2.status_code);
            if (ctVar2.status_code != 0 || !C89219l.m154714a((Object) ctVar2.isPassed(), (Object) false)) {
                this.f162745b.invoke();
                return;
            }
            String a = C72591ab.m128072a(this.f162746c, ctVar2.getReasonBody(), R.string.eq2);
            String a2 = C72591ab.m128072a(this.f162746c, ctVar2.getReasonTitle(), R.string.eq3);
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
                this.f162745b.invoke();
                return;
            }
            C17197a.C17200a aVar = new C17197a.C17200a(this.f162746c);
            aVar.f41071b = a;
            aVar.f41070a = a2;
            aVar.mo27190a(R.string.eq0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC72593a(this), false).mo27195b(R.string.eq1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC72594b(this), false);
            Dialog c = aVar.mo27193a().mo27185c();
            c.setCancelable(true);
            c.setCanceledOnTouchOutside(false);
            C72640l.f162828a = EnumC72643m.POST_FREQUENCY_LIMIT_DIALOG;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ab$a$a */
        static final class DialogInterface$OnClickListenerC72593a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C72592a f162751a;

            static {
                Covode.recordClassIndex(85276);
            }

            DialogInterface$OnClickListenerC72593a(C72592a aVar) {
                this.f162751a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C72591ab.m128074a("UserSaveDraft");
                C43213k.m86181a("couldn't upload video click to save draft");
                this.f162751a.f162747d.invoke();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ab$a$b */
        static final class DialogInterface$OnClickListenerC72594b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C72592a f162752a;

            static {
                Covode.recordClassIndex(85277);
            }

            DialogInterface$OnClickListenerC72594b(C72592a aVar) {
                this.f162752a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C80510gr.m139542c("SC T:" + this.f162752a.f162748e + " L:" + this.f162752a.f162749f);
            }
        }

        C72592a(AbstractC89171a aVar, AbstractC89171a aVar2, Context context, AbstractC89171a aVar3, int i, int i2, C72640l lVar) {
            this.f162744a = aVar;
            this.f162745b = aVar2;
            this.f162746c = context;
            this.f162747d = aVar3;
            this.f162748e = i;
            this.f162749f = i2;
            this.f162750g = lVar;
        }
    }

    /* renamed from: a */
    public static final void m128074a(String str) {
        C84911q.m145921a("CheckServerPrePost ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static final String m128072a(Context context, String str, int i) {
        if (str != null && str.length() != 0) {
            return str;
        }
        String string = context.getString(i);
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: a */
    public static final void m128073a(Context context, C72640l lVar, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3, AbstractC89171a<C89391z> aVar4) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        if (context == null) {
            m128074a("null context");
            aVar.invoke();
            return;
        }
        int a = SettingsManager.m29616a().mo25394a("pre_post_check_type", 0);
        int a2 = SettingsManager.m29616a().mo25394a("pre_post_check_freq_limit", -1);
        m128074a("Setting prePostCheckType:" + a + " prePostCheckFreqLimit:" + a2);
        if (a == 0) {
            aVar.invoke();
            return;
        }
        aVar2.invoke();
        C27646l.m55298a(((TTUploaderService.RetrofitService) C63244g.m114602a().mo73257C().retrofitCreate(AVApiImpl.m123134b().mo109850a(), TTUploaderService.RetrofitService.class)).getServerPrePostResult(a, a2), new C72592a(aVar3, aVar, context, aVar4, a, a2, lVar), C1731i.f5564c);
    }
}
