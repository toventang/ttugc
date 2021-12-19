package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23161h;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67521be;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67523bf;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67526bh;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.e */
public final class C42352e {
    static {
        Covode.recordClassIndex(50297);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.e$c */
    static final class DialogInterface$OnCancelListenerC42355c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Word f98674a;

        /* renamed from: b */
        final /* synthetic */ C67568r f98675b;

        /* renamed from: c */
        final /* synthetic */ String f98676c;

        static {
            Covode.recordClassIndex(50300);
        }

        DialogInterface$OnCancelListenerC42355c(Word word, C67568r rVar, String str) {
            this.f98674a = word;
            this.f98675b = rVar;
            this.f98676c = str;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C42352e.m84718a(this.f98674a, this.f98675b, "cancel", this.f98676c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.e$b */
    static final class C42354b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Word f98670a;

        /* renamed from: b */
        final /* synthetic */ C67568r f98671b;

        /* renamed from: c */
        final /* synthetic */ String f98672c;

        /* renamed from: d */
        final /* synthetic */ Context f98673d;

        static {
            Covode.recordClassIndex(50299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42354b(Word word, C67568r rVar, String str, Context context) {
            super(1);
            this.f98670a = word;
            this.f98671b = rVar;
            this.f98672c = str;
            this.f98673d = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            C42352e.m84718a(this.f98670a, this.f98671b, "not_relevant", this.f98672c);
            Activity a = C34470e.m70451a(this.f98673d);
            if (a != null) {
                new C23144b(a).mo37640e(R.string.fgn).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final boolean m84720a(C42411h hVar) {
        List<C42365g> list;
        if (hVar == null || (list = hVar.f98796f) == null || list.size() < 4) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f98700a.length() <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.e$a */
    static final class C42353a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Word f98666a;

        /* renamed from: b */
        final /* synthetic */ C67568r f98667b;

        /* renamed from: c */
        final /* synthetic */ String f98668c;

        /* renamed from: d */
        final /* synthetic */ Context f98669d;

        static {
            Covode.recordClassIndex(50298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42353a(Word word, C67568r rVar, String str, Context context) {
            super(1);
            this.f98666a = word;
            this.f98667b = rVar;
            this.f98668c = str;
            this.f98669d = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            String str5;
            String str6 = "";
            C89219l.m154721d(view, str6);
            C42352e.m84718a(this.f98666a, this.f98667b, "confirm", this.f98668c);
            Context context = this.f98669d;
            Word word = this.f98666a;
            C67568r rVar = this.f98667b;
            String str7 = this.f98668c;
            C89219l.m154721d(context, str6);
            C89219l.m154721d(str7, str6);
            if (C34470e.m70451a(context) != null) {
                Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "sug_recommend");
                String str8 = null;
                if (word != null) {
                    str = word.getId();
                } else {
                    str = null;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("object_id", str);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, str6);
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("owner_id", g.getCurUserId());
                if (word != null) {
                    str2 = word.getWord();
                } else {
                    str2 = null;
                }
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("sug_content", str2);
                C28022o oVar = new C28022o();
                if (rVar != null) {
                    try {
                        str3 = rVar.f151311f;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    str3 = null;
                }
                oVar.mo46801a("raw_query", str3);
                if (word != null) {
                    str4 = word.getWord();
                } else {
                    str4 = null;
                }
                oVar.mo46801a("words_content", str4);
                if (word != null) {
                    num = Integer.valueOf(word.getWordPosition());
                } else {
                    num = null;
                }
                oVar.mo46800a("words_position", num);
                if (rVar != null) {
                    str5 = rVar.f151315j;
                } else {
                    str5 = null;
                }
                oVar.mo46801a("impr_id", str5);
                if (word != null) {
                    str8 = word.getId();
                }
                oVar.mo46801a("group_id", str8);
                oVar.mo46801a("words_source", str7);
                str6 = C80342dg.m139300a().mo46674b(oVar);
                appendQueryParameter4.appendQueryParameter("extra", str6);
                C39223a.m79587a().mo68688a(C34470e.m70451a(context), appendQueryParameter4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m84717a(Word word, C67568r rVar, String str) {
        String str2;
        String str3;
        Integer num;
        String str4;
        C89219l.m154721d(str, "");
        C67523bf bfVar = new C67523bf();
        String str5 = null;
        if (rVar != null) {
            str2 = rVar.f151311f;
        } else {
            str2 = null;
        }
        C67530bj x = bfVar.mo106476x(str2);
        if (word != null) {
            str3 = word.getWord();
        } else {
            str3 = null;
        }
        C67530bj w = x.mo106475w(str3);
        if (word != null) {
            num = Integer.valueOf(word.getWordPosition());
        } else {
            num = null;
        }
        C67530bj d = w.mo106471d(num);
        if (rVar != null) {
            str4 = rVar.f151315j;
        } else {
            str4 = null;
        }
        C67540c d2 = d.mo106484d(str4);
        if (word != null) {
            str5 = word.getId();
        }
        ((C67523bf) d2.mo106453i(str5)).mo106463r(str).mo96792f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$d[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m84716a(Context context, C67568r rVar, Word word, String str) {
        AbstractC0952i supportFragmentManager;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        m84717a(word, rVar, str);
        new C23161h(context).mo37654a();
        C23208a b = new C23208a.C23211b().mo37796a(new C23208a.C23213d().mo37801c(R.raw.icon_flag).mo37785a(R.string.g87).mo37787a(new C42353a(word, rVar, str, context)), new C23208a.C23213d().mo37801c(R.raw.icon_heart_broken).mo37785a(R.string.fgk).mo37787a(new C42354b(word, rVar, str, context))).mo37793a(new DialogInterface$OnCancelListenerC42355c(word, rVar, str)).mo37800b();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null && (supportFragmentManager = eVar.getSupportFragmentManager()) != null) {
            b.show(supportFragmentManager, "recommend report");
        }
    }

    /* renamed from: a */
    public static final void m84718a(Word word, C67568r rVar, String str, String str2) {
        String str3;
        String str4;
        Integer num;
        String str5;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C67521be beVar = new C67521be();
        String str6 = null;
        if (rVar != null) {
            str3 = rVar.f151311f;
        } else {
            str3 = null;
        }
        C67530bj x = beVar.mo106476x(str3);
        if (word != null) {
            str4 = word.getWord();
        } else {
            str4 = null;
        }
        C67530bj w = x.mo106475w(str4);
        if (word != null) {
            num = Integer.valueOf(word.getWordPosition());
        } else {
            num = null;
        }
        C67530bj d = w.mo106471d(num);
        if (rVar != null) {
            str5 = rVar.f151315j;
        } else {
            str5 = null;
        }
        C67540c d2 = d.mo106484d(str5);
        if (word != null) {
            str6 = word.getId();
        }
        ((C67521be) d2.mo106453i(str6)).mo106461r(str).mo106462s(str2).mo96792f();
    }

    /* renamed from: a */
    public static final void m84719a(String str, int i, String str2, String str3, C67568r rVar) {
        String str4;
        C89219l.m154721d(str, "");
        C67530bj c = new C67526bh().mo106474v(str).mo106470c(Integer.valueOf(i));
        String str5 = null;
        if (rVar != null) {
            str4 = rVar.f151314i;
        } else {
            str4 = null;
        }
        C67540c a = c.mo106480a(str4);
        if (rVar != null) {
            str5 = rVar.f151315j;
        }
        ((C67530bj) a.mo106484d(str5)).mo106476x(str2).mo106477y("general").mo96788a(new C33744d().mo59983a("enter_group_id", str3).f79943a).mo96792f();
    }
}
