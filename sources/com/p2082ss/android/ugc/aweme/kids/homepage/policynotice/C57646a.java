package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3356b.C57655a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57656a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57658c;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3358d.C57659a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.C57681a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.DialogC57693b;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.PolicyNoticeActivity;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a */
public final class C57646a {

    /* renamed from: a */
    public static C57663a f131565a;

    /* renamed from: b */
    public static C57663a f131566b;

    /* renamed from: c */
    public static C57663a f131567c;

    /* renamed from: d */
    public static C57663a f131568d;

    /* renamed from: e */
    public static List<C57663a> f131569e = C89086z.INSTANCE;

    /* renamed from: f */
    public static final C57646a f131570f = new C57646a();

    private C57646a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a$a */
    static final class C57647a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57664b f131571a;

        static {
            Covode.recordClassIndex(67611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57647a(C57664b bVar) {
            super(0);
            this.f131571a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89219l.m154714a((Object) this.f131571a.f131618k, (Object) true)) {
                new Handler().postDelayed(RunnableC576481.f131572a, 500);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a$b */
    public static final class CallableC57649b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f131573a;

        static {
            Covode.recordClassIndex(67613);
        }

        CallableC57649b(Context context) {
            this.f131573a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context context = this.f131573a;
            C57663a aVar = C57646a.f131566b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            new DialogC57693b(context, aVar).show();
            C57646a.f131566b = null;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a$c */
    public static final class CallableC57650c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f131574a;

        static {
            Covode.recordClassIndex(67614);
        }

        CallableC57650c(Context context) {
            this.f131574a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context context = this.f131574a;
            C57663a aVar = C57646a.f131567c;
            if (aVar == null) {
                C89219l.m154715b();
            }
            new C57681a(context, aVar).mo95013a();
            C57646a.f131567c = null;
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(67610);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a$d */
    public static final class C57651d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f131575a;

        /* renamed from: b */
        final /* synthetic */ String f131576b;

        /* renamed from: c */
        final /* synthetic */ PolicyBodyLinkList f131577c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f131578d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f131579e;

        /* renamed from: f */
        final /* synthetic */ int f131580f;

        /* renamed from: g */
        final /* synthetic */ int f131581g;

        static {
            Covode.recordClassIndex(67615);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            Boolean bool;
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f131575a, this.f131576b).withParam(C57655a.f131588a, true).open();
            PolicyBodyLinkList policyBodyLinkList = this.f131577c;
            Boolean bool2 = null;
            if (policyBodyLinkList != null) {
                bool = policyBodyLinkList.getApprove();
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                this.f131578d.invoke(new C57664b(null, null, null, null, this.f131577c.getOperation(), null, null, null, null, 1983));
            }
            PolicyBodyLinkList policyBodyLinkList2 = this.f131577c;
            if (policyBodyLinkList2 != null) {
                bool2 = policyBodyLinkList2.getDismiss();
            }
            if (C89219l.m154714a((Object) bool2, (Object) true)) {
                this.f131579e.invoke();
            }
        }

        C57651d(Context context, String str, PolicyBodyLinkList policyBodyLinkList, AbstractC89172b bVar, AbstractC89171a aVar, int i, int i2) {
            this.f131575a = context;
            this.f131576b = str;
            this.f131577c = policyBodyLinkList;
            this.f131578d = bVar;
            this.f131579e = aVar;
            this.f131580f = i;
            this.f131581g = i2;
        }
    }

    /* renamed from: a */
    public static void m104375a(Context context) {
        C89219l.m154721d(context, "");
        if (f131568d != null) {
            m104376a(context, new Intent(context, PolicyNoticeActivity.class));
        } else if (f131565a != null) {
            C57663a aVar = f131565a;
            if (aVar == null) {
                C89219l.m154715b();
            }
            AbstractC81915c.m141874a(new C57658c(aVar));
            f131565a = null;
        } else if (f131566b != null) {
            C1731i.m5640b(new CallableC57649b(context), C1731i.f5564c);
        } else if (f131567c != null) {
            C1731i.m5640b(new CallableC57650c(context), C1731i.f5564c);
        }
    }

    /* renamed from: a */
    private static void m104376a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m104377a(C57663a aVar, C57664b bVar) {
        String str;
        String str2;
        String str3;
        C89219l.m154721d(bVar, "");
        C57659a aVar2 = new C57659a();
        if (aVar != null) {
            str = aVar.getBusiness();
            str2 = aVar.getPolicyVersion();
            str3 = aVar.getStyle();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        String str4 = bVar.f131612e;
        Integer num = bVar.f131614g;
        C57647a aVar3 = new C57647a(bVar);
        C89219l.m154721d(aVar3, "");
        aVar2.mo94959a().policyNoticeApprove(str, str2, str3, str4, num).mo5534a(new C57659a.C57662c(aVar3, System.currentTimeMillis()), C1731i.f5564c, null);
    }

    /* renamed from: a */
    private static void m104379a(String str, Context context) {
        T t;
        String style;
        Iterator<T> it = f131569e.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (!C89219l.m154714a((Object) t.getBusiness(), (Object) str));
        T t2 = t;
        if (t2 != null && (style = t2.getStyle()) != null) {
            switch (style.hashCode()) {
                case -1383228885:
                    if (style.equals("bottom")) {
                        new DialogC57693b(context, t2).show();
                        return;
                    }
                    return;
                case 111185:
                    if (style.equals("pop")) {
                        new C57681a(context, t2).mo95013a();
                        return;
                    }
                    return;
                case 97526364:
                    if (style.equals("float")) {
                        AbstractC81915c.m141874a(new C57658c(t2));
                        return;
                    }
                    return;
                case 110066619:
                    if (style.equals("fullscreen")) {
                        f131568d = t2;
                        m104376a(context, new Intent(context, PolicyNoticeActivity.class));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static void m104378a(C57664b bVar, Context context, AbstractC89172b<? super C57664b, C89391z> bVar2, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(aVar, "");
        String str = bVar.f131610c;
        int hashCode = str.hashCode();
        if (hashCode != -1052618729) {
            if (hashCode != -172220347) {
                if (hashCode != 3277) {
                    if (hashCode == 111185 && str.equals("pop")) {
                        m104379a(bVar.f131615h, context);
                    }
                } else if (str.equals("h5")) {
                    SmartRouter.buildRoute(context, "aweme://webview/?url=" + bVar.f131611d).open();
                }
            } else if (str.equals("callback")) {
                bVar2.invoke(bVar);
            }
        } else if (str.equals("native")) {
            SmartRouter.buildRoute(context, bVar.f131611d).open();
        }
        if (bVar.f131613f) {
            bVar2.invoke(bVar);
        }
        if (C89219l.m154714a((Object) bVar.f131616i, (Object) true)) {
            aVar.invoke();
        }
        if (C89219l.m154714a((Object) bVar.f131617j, (Object) true)) {
            JSONObject put = new JSONObject().put("eventName", "cancel_post_success");
            C89219l.m154716b(put, "");
            AbstractC81915c.m141874a(new C57656a("notification", put));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder m104374a(android.content.Context r17, java.lang.String r18, java.util.List<com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList> r19, p4600h.p4611f.p4612a.AbstractC89172b<? super com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b, p4600h.C89391z> r20, p4600h.p4611f.p4612a.AbstractC89171a<p4600h.C89391z> r21) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.C57646a.m104374a(android.content.Context, java.lang.String, java.util.List, h.f.a.b, h.f.a.a):android.text.SpannableStringBuilder");
    }
}
