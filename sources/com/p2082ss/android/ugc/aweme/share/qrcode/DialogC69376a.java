package com.p2082ss.android.ugc.aweme.share.qrcode;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23008e;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import com.p2082ss.android.ugc.aweme.share.qrcode.p3772a.C69389a;
import com.p2082ss.android.ugc.aweme.share.qrcode.p3773b.C69393a;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.trill.R;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.a */
public final class DialogC69376a extends Dialog {

    /* renamed from: d */
    public static final C69377a f154979d = new C69377a((byte) 0);

    /* renamed from: a */
    public QRCodeSquareView f154980a;

    /* renamed from: b */
    public View f154981b;

    /* renamed from: c */
    public final String f154982c;

    /* renamed from: e */
    private ShareChannelBar f154983e;

    /* renamed from: f */
    private View f154984f;

    /* renamed from: g */
    private LinearLayout f154985g;

    /* renamed from: h */
    private final String f154986h;

    /* renamed from: i */
    private final long f154987i;

    /* renamed from: j */
    private final int f154988j;

    /* renamed from: k */
    private final String f154989k;

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$g */
    static final class View$OnClickListenerC69384g implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC69384g f154997a = new View$OnClickListenerC69384g();

        static {
            Covode.recordClassIndex(81717);
        }

        View$OnClickListenerC69384g() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$j */
    static final class View$OnClickListenerC69387j implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC69387j f155000a = new View$OnClickListenerC69387j();

        static {
            Covode.recordClassIndex(81720);
        }

        View$OnClickListenerC69387j() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(81709);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$a */
    public static final class C69377a {
        static {
            Covode.recordClassIndex(81710);
        }

        private C69377a() {
        }

        public /* synthetic */ C69377a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$k */
    static final class C69388k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f155001a;

        static {
            Covode.recordClassIndex(81721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69388k(DialogC69376a aVar) {
            super(0);
            this.f155001a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Context context = this.f155001a.getContext();
            C89219l.m154716b(context, "");
            C69393a.C69394a.m122582a(context, this.f155001a.f154981b, this.f155001a.f154980a, true, false, (C69393a.C69394a.AbstractC69395a) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$f */
    public static final class C69382f implements AbstractC69681f {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f154994a;

        static {
            Covode.recordClassIndex(81715);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69382f(DialogC69376a aVar) {
            this.f154994a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
        /* renamed from: a_ */
        public final void mo87413a_(AbstractC69581b bVar) {
            C89219l.m154721d(bVar, "");
            if (bVar instanceof C69389a) {
                DialogC69376a aVar = this.f154994a;
                Context context = aVar.getContext();
                C89219l.m154716b(context, "");
                Activity a = C69124b.m122223a(context);
                if (a != null) {
                    C69011av.m121890a(a, new C69388k(aVar));
                }
            } else {
                C68960a.m121644a().mo109504a(bVar.mo109548a(), 0);
                Context context2 = this.f154994a.getContext();
                C89219l.m154716b(context2, "");
                C69393a.C69394a.m122582a(context2, this.f154994a.f154981b, this.f154994a.f154980a, false, true, (C69393a.C69394a.AbstractC69395a) new C69383a(this, bVar));
            }
            QRCodeSquareView qRCodeSquareView = this.f154994a.f154980a;
            if (qRCodeSquareView != null && qRCodeSquareView.f155027b) {
                this.f154994a.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$f$a */
        public static final class C69383a implements C69393a.C69394a.AbstractC69395a {

            /* renamed from: a */
            final /* synthetic */ C69382f f154995a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f154996b;

            static {
                Covode.recordClassIndex(81716);
            }

            C69383a(C69382f fVar, AbstractC69581b bVar) {
                this.f154995a = fVar;
                this.f154996b = bVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.share.qrcode.p3773b.C69393a.C69394a.AbstractC69395a
            /* renamed from: a */
            public final void mo109639a(Uri uri, String str, boolean z) {
                C69651l lVar;
                if (z) {
                    if (str != null) {
                        lVar = new C69651l(C69125c.m122230a(str, C17867d.m33078a()), str, null, 60);
                    } else {
                        return;
                    }
                } else if (uri != null) {
                    String a = C1762a.m5918a(this.f154995a.f154994a.getContext(), uri);
                    C89219l.m154716b(a, "");
                    lVar = new C69651l(uri, a, null, 60);
                } else {
                    return;
                }
                AbstractC69581b bVar = this.f154996b;
                String str2 = lVar.f155477g;
                if (str2 == null) {
                    str2 = "";
                }
                lVar.mo109799a("content_url", str2);
                lVar.mo109799a("media_type", "image/png");
                Context context = this.f154995a.f154994a.getContext();
                C89219l.m154716b(context, "");
                bVar.mo109550a(lVar, context);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$b */
    static final class View$OnClickListenerC69378b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f154990a;

        static {
            Covode.recordClassIndex(81711);
        }

        View$OnClickListenerC69378b(DialogC69376a aVar) {
            this.f154990a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f154990a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$h */
    static final class View$OnClickListenerC69385h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f154998a;

        static {
            Covode.recordClassIndex(81718);
        }

        View$OnClickListenerC69385h(DialogC69376a aVar) {
            this.f154998a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f154998a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$i */
    static final class View$OnClickListenerC69386i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f154999a;

        static {
            Covode.recordClassIndex(81719);
        }

        View$OnClickListenerC69386i(DialogC69376a aVar) {
            this.f154999a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f154999a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$e */
    static final class C69381e extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f154993a;

        static {
            Covode.recordClassIndex(81714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69381e(DialogC69376a aVar) {
            super(1);
            this.f154993a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            Context context = this.f154993a.getContext();
            C89219l.m154716b(context, "");
            return Boolean.valueOf(!bVar2.mo109557b(context));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$c */
    static final class C69379c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC69376a f154991a;

        static {
            Covode.recordClassIndex(81712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69379c(DialogC69376a aVar) {
            super(1);
            this.f154991a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            String str = this.f154991a.f154982c;
            int hashCode = str.hashCode();
            if (hashCode != -1890252483) {
                if (hashCode != 112100) {
                    if (hashCode == 104263205 && str.equals("music")) {
                        i = R.raw.icon_music_note;
                        aVar2.f54431a = i;
                        aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
                        Resources system2 = Resources.getSystem();
                        C89219l.m154709a((Object) system2, "");
                        aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
                        return C89391z.f203057a;
                    }
                } else if (str.equals("qna")) {
                    i = R.raw.icon_qa_ltr;
                    aVar2.f54431a = i;
                    aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system3.getDisplayMetrics()));
                    Resources system22 = Resources.getSystem();
                    C89219l.m154709a((Object) system22, "");
                    aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system22.getDisplayMetrics()));
                    return C89391z.f203057a;
                }
            } else if (str.equals("sticker")) {
                i = R.raw.icon_effect;
                aVar2.f54431a = i;
                aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
                Resources system32 = Resources.getSystem();
                C89219l.m154709a((Object) system32, "");
                aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system32.getDisplayMetrics()));
                Resources system222 = Resources.getSystem();
                C89219l.m154709a((Object) system222, "");
                aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system222.getDisplayMetrics()));
                return C89391z.f203057a;
            }
            i = R.raw.icon_number;
            aVar2.f54431a = i;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            Resources system322 = Resources.getSystem();
            C89219l.m154709a((Object) system322, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system322.getDisplayMetrics()));
            Resources system2222 = Resources.getSystem();
            C89219l.m154709a((Object) system2222, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2222.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$d */
    static final class C69380d extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C69380d f154992a = new C69380d();

        static {
            Covode.recordClassIndex(81713);
        }

        C69380d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.w);
            eVar2.f54467f = Integer.valueOf((int) R.attr.an);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54465d = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54469h = C89241a.m154730a(TypedValue.applyDimension(1, 44.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 44.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 44.0f, system4.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0300  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 860
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.qrcode.DialogC69376a.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DialogC69376a(Context context, String str, long j, String str2, int i, String str3) {
        super(context, R.style.a1a);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f154986h = str;
        this.f154987i = j;
        this.f154982c = str2;
        this.f154988j = i;
        this.f154989k = str3;
    }

    public /* synthetic */ DialogC69376a(Context context, String str, long j, String str2, int i, String str3, byte b) {
        this(context, str, j, str2, i, str3);
    }
}
