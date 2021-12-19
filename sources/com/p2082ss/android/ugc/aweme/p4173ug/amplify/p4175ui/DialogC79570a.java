package com.p2082ss.android.ugc.aweme.p4173ug.amplify.p4175ui;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p4173ug.amplify.C79565b;
import com.p2082ss.android.ugc.aweme.p4173ug.amplify.api.AmplifyApi;
import com.p2082ss.android.ugc.aweme.p4173ug.amplify.p4175ui.NotifyBottomButton;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68793c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a */
public final class DialogC79570a extends Dialog implements AbstractC34466a {

    /* renamed from: c */
    public static final C79571a f178557c = new C79571a((byte) 0);

    /* renamed from: a */
    final C88411a f178558a = new C88411a();

    /* renamed from: b */
    final C68793c f178559b;

    static {
        Covode.recordClassIndex(92778);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$a */
    public static final class C79571a {
        static {
            Covode.recordClassIndex(92779);
        }

        private C79571a() {
        }

        public /* synthetic */ C79571a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$h */
    static final class C79578h implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178569a;

        static {
            Covode.recordClassIndex(92786);
        }

        C79578h(DialogC79570a aVar) {
            this.f178569a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f178569a.mo123130c("next_time");
            this.f178569a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$j */
    static final class C79580j implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178571a;

        /* renamed from: b */
        final /* synthetic */ String f178572b;

        static {
            Covode.recordClassIndex(92788);
        }

        C79580j(DialogC79570a aVar, String str) {
            this.f178571a = aVar;
            this.f178572b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f178571a.mo123128a(this.f178572b);
            this.f178571a.dismiss();
        }
    }

    public final void dismiss() {
        super.dismiss();
        this.f178558a.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$i */
    static final class C79579i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178570a;

        static {
            Covode.recordClassIndex(92787);
        }

        C79579i(DialogC79570a aVar) {
            this.f178570a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f178570a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$k */
    static final class C79581k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178573a;

        static {
            Covode.recordClassIndex(92789);
        }

        C79581k(DialogC79570a aVar) {
            this.f178573a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f178573a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$g */
    static final class C79577g extends AbstractC89220m implements AbstractC89172b<AmplifyApi, AbstractC88410b> {

        /* renamed from: a */
        public static final C79577g f178568a = new C79577g();

        static {
            Covode.recordClassIndex(92785);
        }

        C79577g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88410b invoke(AmplifyApi amplifyApi) {
            AmplifyApi amplifyApi2 = amplifyApi;
            C89219l.m154721d(amplifyApi2, "");
            return amplifyApi2.refuseAction();
        }
    }

    /* renamed from: a */
    static boolean m138327a(C68793c.C68795b bVar) {
        C68793c.C68794a aVar;
        if (bVar == null || (aVar = bVar.f153861c) == null || aVar.f153857a != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static boolean m138328b(C68793c.C68795b bVar) {
        C68793c.C68794a aVar;
        if (bVar == null || (aVar = bVar.f153861c) == null || aVar.f153857a != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$b */
    static final class View$OnClickListenerC79572b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178560a;

        /* renamed from: b */
        final /* synthetic */ C68793c.C68795b f178561b;

        static {
            Covode.recordClassIndex(92780);
        }

        View$OnClickListenerC79572b(DialogC79570a aVar, C68793c.C68795b bVar) {
            this.f178560a = aVar;
            this.f178561b = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C68793c.C68794a aVar = this.f178561b.f153861c;
            if (aVar != null && (str = aVar.f153858b) != null) {
                this.f178560a.mo123129b(str);
                this.f178560a.dismiss();
                this.f178560a.mo123130c("make_selections");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$c */
    static final class C79573c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178562a;

        static {
            Covode.recordClassIndex(92781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79573c(DialogC79570a aVar) {
            super(1);
            this.f178562a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            if (str2 != null) {
                this.f178562a.mo123129b(str2);
                this.f178562a.mo123130c("more_item");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo123129b(String str) {
        SmartRouter.buildRoute(getContext(), "aweme://webview/").withParam(Uri.parse(str)).open();
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$d */
    static final class C79574d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178563a;

        static {
            Covode.recordClassIndex(92782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79574d(DialogC79570a aVar) {
            super(1);
            this.f178563a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            DialogC79570a aVar = this.f178563a;
            if (aVar.f178559b.f153853c == 2) {
                aVar.dismiss();
                aVar.mo123130c("next_time");
            } else {
                AbstractC88412b a = DialogC79570a.m138326a(C79577g.f178568a).mo142935a(new C79578h(aVar), new C79579i(aVar));
                C89219l.m154716b(a, "");
                aVar.f178558a.mo142945a(a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$f */
    static final class C79576f extends AbstractC89220m implements AbstractC89172b<AmplifyApi, AbstractC88410b> {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178566a;

        /* renamed from: b */
        final /* synthetic */ String f178567b;

        static {
            Covode.recordClassIndex(92784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79576f(DialogC79570a aVar, String str) {
            super(1);
            this.f178566a = aVar;
            this.f178567b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88410b invoke(AmplifyApi amplifyApi) {
            AmplifyApi amplifyApi2 = amplifyApi;
            C89219l.m154721d(amplifyApi2, "");
            if (C89219l.m154714a((Object) this.f178567b, (Object) "/aweme/v2/ug/ugc/permission/item/perm/submit")) {
                return amplifyApi2.confirmAction(this.f178567b, "select_period_all");
            }
            return amplifyApi2.confirmAction(this.f178567b, null);
        }
    }

    /* renamed from: a */
    static AbstractC88410b m138326a(AbstractC89172b<? super AmplifyApi, ? extends AbstractC88410b> bVar) {
        Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AmplifyApi.class);
        C89219l.m154716b(a, "");
        AbstractC88410b a2 = ((AbstractC88410b) bVar.invoke(a)).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142939a(C88446a.f200702h);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: c */
    public final void mo123130c(String str) {
        if (this.f178559b.f153853c == 2 && C89219l.m154714a((Object) str, (Object) "next_time")) {
            str = "NO";
        }
        C39162r.m79460a("toast_click", new C33744d().mo59983a("toast_type", "copyright_permission_introduction").mo59980a("toast_mode", this.f178559b.f153853c).mo59983a("click_position", str).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$e */
    static final class C79575e extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC79570a f178564a;

        /* renamed from: b */
        final /* synthetic */ C68793c.C68795b f178565b;

        static {
            Covode.recordClassIndex(92783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79575e(DialogC79570a aVar, C68793c.C68795b bVar) {
            super(1);
            this.f178564a = aVar;
            this.f178565b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C68793c.C68794a aVar;
            String str;
            C68793c.C68794a aVar2;
            String str2;
            C89219l.m154721d(view, "");
            DialogC79570a aVar3 = this.f178564a;
            C68793c.C68795b bVar = this.f178565b;
            if (DialogC79570a.m138327a(bVar)) {
                if (!(bVar == null || (aVar2 = bVar.f153861c) == null || (str2 = aVar2.f153858b) == null)) {
                    aVar3.mo123129b(str2);
                    aVar3.mo123128a(str2);
                    aVar3.dismiss();
                }
            } else if (!(!DialogC79570a.m138328b(bVar) || bVar == null || (aVar = bVar.f153861c) == null || (str = aVar.f153858b) == null)) {
                AbstractC88412b a = DialogC79570a.m138326a(new C79576f(aVar3, str)).mo142935a(new C79580j(aVar3, str), new C79581k(aVar3));
                C89219l.m154716b(a, "");
                aVar3.f178558a.mo142945a(a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo123128a(String str) {
        Boolean bool;
        String str2;
        List<C68793c.C68795b> list;
        boolean z;
        C68793c.C68796c cVar = this.f178559b.f153854d;
        if (cVar == null || (list = cVar.f153864c) == null) {
            bool = null;
        } else {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (m138327a((C68793c.C68795b) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bool = Boolean.valueOf(z);
            }
            z = false;
            bool = Boolean.valueOf(z);
        }
        boolean a = C89219l.m154714a((Object) str, (Object) "/aweme/v2/ug/ugc/permission/item/perm/submit");
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            str2 = "discover_tiktok_amplify";
        } else if (a) {
            str2 = "YES";
        } else {
            str2 = "join_project";
        }
        mo123130c(str2);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        T t;
        T t2;
        C68793c.C68795b bVar;
        C68793c.C68794a aVar;
        Spanned fromHtml;
        String[] strArr;
        String str2;
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (!(window == null || (attributes = window.getAttributes()) == null)) {
            attributes.gravity = 17;
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
        setContentView(R.layout.wz);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        C68793c.C68796c cVar = this.f178559b.f153854d;
        if (cVar == null) {
            dismiss();
        }
        C89219l.m154716b(cVar, "");
        C68793c.C68798e eVar = cVar.f153866e;
        if (!(eVar == null || (strArr = eVar.f153870b) == null || (str2 = strArr[0]) == null)) {
            C34577e.m70608b((RemoteImageView) findViewById(R.id.ii), str2, -1, -1);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.il);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(cVar.f153862a);
        TextView textView = (TextView) findViewById(R.id.ih);
        String str3 = cVar.f153863b;
        C79573c cVar2 = new C79573c(this);
        C89219l.m154721d(cVar2, "");
        if (!TextUtils.isEmpty(str3)) {
            if (Build.VERSION.SDK_INT < 24) {
                fromHtml = Html.fromHtml(str3);
            } else {
                fromHtml = Html.fromHtml(str3, 63);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    spannableStringBuilder.setSpan(new C79565b.C79566a(cVar2, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
            }
            if (textView != null) {
                textView.setHighlightColor(C0643b.m2378c(C17867d.m33078a(), R.color.c9));
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        List<C68793c.C68795b> list = cVar.f153864c;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t3 = t;
            if (!m138327a((C68793c.C68795b) t3)) {
                if (m138328b((C68793c.C68795b) t3)) {
                    break;
                }
            } else {
                break;
            }
        }
        T t4 = t;
        List<C68793c.C68795b> list2 = cVar.f153864c;
        C89219l.m154716b(list2, "");
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            T t5 = t2;
            if (!(t5 == null || (aVar = t5.f153861c) == null || aVar.f153857a != 4)) {
                break;
            }
        }
        T t6 = t2;
        List<C68793c.C68795b> list3 = cVar.f153865d;
        if (!(list3 == null || (bVar = (C68793c.C68795b) C89070n.m154583g((List) list3)) == null || bVar.f153859a == null)) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ij);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.ik);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(bVar.f153859a);
            ((LinearLayout) findViewById(R.id.ij)).setOnClickListener(new View$OnClickListenerC79572b(this, bVar));
        }
        NotifyBottomButton notifyBottomButton = (NotifyBottomButton) findViewById(R.id.ig);
        String valueOf = String.valueOf(t6 != null ? t6.f153859a : null);
        C79574d dVar = new C79574d(this);
        if (t4 != null) {
            str = t4.f153859a;
        }
        String valueOf2 = String.valueOf(str);
        C79575e eVar2 = new C79575e(this, t4);
        C89219l.m154721d(valueOf, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(valueOf2, "");
        C89219l.m154721d(eVar2, "");
        notifyBottomButton.post(new NotifyBottomButton.RunnableC79567a(notifyBottomButton, valueOf, valueOf2, dVar, eVar2));
        C39162r.m79460a("toast_show", new C33744d().mo59980a("toast_mode", this.f178559b.f153853c).mo59983a("toast_type", "copyright_permission_introduction").f79943a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC79570a(Activity activity, C68793c cVar) {
        super(activity);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        this.f178559b = cVar;
    }
}
