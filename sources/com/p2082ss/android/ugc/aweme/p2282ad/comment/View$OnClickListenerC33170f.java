package com.p2082ss.android.ugc.aweme.p2282ad.comment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.C33168a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33138c;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33163m;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.View$OnClickListenerC33149a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.f */
public final class View$OnClickListenerC33170f extends LinearLayout implements View.OnClickListener, AbstractC1214u<C33942b> {

    /* renamed from: a */
    public C38214ac f78819a;

    /* renamed from: b */
    public Aweme f78820b;

    /* renamed from: c */
    public C33163m f78821c;

    /* renamed from: d */
    public AbstractC33138c f78822d;

    /* renamed from: e */
    private CircleImageView f78823e;

    /* renamed from: f */
    private TuxTextView f78824f;

    /* renamed from: g */
    private TuxTextView f78825g;

    /* renamed from: h */
    private TuxTextView f78826h;

    /* renamed from: i */
    private TuxTextView f78827i;

    /* renamed from: j */
    private TuxTextView f78828j;

    /* renamed from: k */
    private boolean f78829k;

    /* renamed from: l */
    private DataCenter f78830l;

    /* renamed from: m */
    private final float f78831m;

    static {
        Covode.recordClassIndex(39989);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: d */
    private final void m67983d() {
        String str;
        TuxTextView tuxTextView = this.f78825g;
        if (tuxTextView != null) {
            C38214ac acVar = this.f78819a;
            if (acVar != null) {
                str = acVar.title;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    /* renamed from: e */
    private final void m67984e() {
        String str;
        TuxTextView tuxTextView = this.f78826h;
        if (tuxTextView != null) {
            C38214ac acVar = this.f78819a;
            if (acVar != null) {
                str = acVar.tipsText;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    /* renamed from: g */
    private final void m67986g() {
        IAdCommentDepend iAdCommentDepend = C33168a.f78817a;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.mo59055a(getContext(), this.f78819a, this.f78820b);
        }
    }

    /* renamed from: i */
    private final void m67988i() {
        if (m67987h()) {
            boolean z = this.f78829k;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.f$a */
    public static final class C33171a implements View$OnClickListenerC33149a.AbstractC33150a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC33170f f78832a;

        static {
            Covode.recordClassIndex(39990);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.View$OnClickListenerC33149a.AbstractC33150a
        /* renamed from: a */
        public final void mo59009a() {
            C33163m mVar = this.f78832a.f78821c;
            if (mVar != null) {
                mVar.mo59038a();
            }
            AbstractC33138c cVar = this.f78832a.f78822d;
            if (cVar != null) {
                cVar.mo58998a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.View$OnClickListenerC33149a.AbstractC33150a
        /* renamed from: c */
        public final void mo59011c() {
            String str;
            IAdCommentDepend iAdCommentDepend = C33168a.f78817a;
            if (iAdCommentDepend != null) {
                Context context = this.f78832a.getContext();
                Aweme aweme = this.f78832a.f78820b;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                iAdCommentDepend.mo59060a(context, str);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.View$OnClickListenerC33149a.AbstractC33150a
        /* renamed from: b */
        public final void mo59010b() {
            String str;
            IAdCommentDepend iAdCommentDepend = C33168a.f78817a;
            if (iAdCommentDepend != null) {
                Context context = this.f78832a.getContext();
                String a = C33168a.f78817a.mo59051a();
                C38214ac acVar = this.f78832a.f78819a;
                if (acVar != null) {
                    str = acVar.webUrl;
                } else {
                    str = null;
                }
                iAdCommentDepend.mo59061a(context, a, str);
            }
            this.f78832a.mo59072a("otherclick", "plan");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33171a(View$OnClickListenerC33170f fVar) {
            this.f78832a = fVar;
        }
    }

    /* renamed from: a */
    private final void m67979a() {
        m67981b();
        m67982c();
        m67983d();
        m67984e();
        m67985f();
        m67988i();
    }

    /* renamed from: b */
    private final void m67981b() {
        String str;
        TuxTextView tuxTextView = this.f78824f;
        if (tuxTextView != null) {
            C38214ac acVar = this.f78819a;
            if (acVar != null) {
                str = acVar.source;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.f78824f;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(43);
        }
    }

    /* renamed from: f */
    private final void m67985f() {
        String str;
        TuxTextView tuxTextView = this.f78827i;
        if (tuxTextView != null) {
            C38214ac acVar = this.f78819a;
            if (acVar != null) {
                str = acVar.buttonText;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        C62023a.m112168a(this.f78827i);
    }

    /* renamed from: h */
    private final boolean m67987h() {
        String str;
        C38214ac acVar = this.f78819a;
        String str2 = null;
        if (acVar != null) {
            str = acVar.downloadUrl;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C38214ac acVar2 = this.f78819a;
        if (acVar2 != null) {
            str2 = acVar2.type;
        }
        if (TextUtils.equals(str2, "app")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m67982c() {
        UrlModel urlModel;
        C24246a aVar;
        C24250e eVar;
        C24246a aVar2;
        C24250e eVar2;
        CircleImageView circleImageView = this.f78823e;
        if (!(circleImageView == null || (aVar2 = (C24246a) circleImageView.getHierarchy()) == null || (eVar2 = aVar2.f57470a) == null)) {
            eVar2.mo39985c((float) C34728n.m70946a(0.5d));
        }
        CircleImageView circleImageView2 = this.f78823e;
        if (!(circleImageView2 == null || (aVar = (C24246a) circleImageView2.getHierarchy()) == null || (eVar = aVar.f57470a) == null)) {
            eVar.f57504f = C0643b.m2378c(getContext(), R.color.b6);
        }
        CircleImageView circleImageView3 = this.f78823e;
        C38214ac acVar = this.f78819a;
        if (acVar != null) {
            urlModel = acVar.avatarIcon;
        } else {
            urlModel = null;
        }
        C34577e.m70592a(circleImageView3, urlModel);
    }

    public final void setOnDislikeCommentAdListener(AbstractC33138c cVar) {
        C89219l.m154721d(cVar, "");
        this.f78822d = cVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f78830l = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60190a("comment_aweme_and_link", this, true).mo60190a("comment_dialog_state", this, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private View$OnClickListenerC33170f(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13755);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a9m, this);
        this.f78824f = (TuxTextView) inflate.findViewById(R.id.title);
        this.f78823e = (CircleImageView) inflate.findViewById(R.id.nz);
        this.f78825g = (TuxTextView) inflate.findViewById(R.id.acq);
        this.f78826h = (TuxTextView) inflate.findViewById(R.id.c9z);
        this.f78827i = (TuxTextView) inflate.findViewById(R.id.en3);
        this.f78828j = (TuxTextView) inflate.findViewById(R.id.emu);
        TuxTextView tuxTextView = this.f78827i;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(this);
        }
        TuxTextView tuxTextView2 = this.f78826h;
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f78823e;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        TuxTextView tuxTextView3 = this.f78824f;
        if (tuxTextView3 != null) {
            tuxTextView3.setOnClickListener(this);
        }
        TuxTextView tuxTextView4 = this.f78825g;
        if (tuxTextView4 != null) {
            tuxTextView4.setOnClickListener(this);
        }
        setOnClickListener(this);
        this.f78831m = C13628n.m24520b(context, 51.5f);
        MethodCollector.m26664o(13755);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        C89378p pVar;
        Aweme aweme;
        C38214ac acVar;
        if (bVar != null) {
            String str = bVar.f80277a;
            int hashCode = str.hashCode();
            if (hashCode != -2103039046) {
                if (hashCode == 1823087802 && str.equals("comment_dialog_state")) {
                    boolean a = bVar.mo60212a();
                    if (a == null) {
                        a = false;
                    }
                    if (C89219l.m154714a(a, (Object) 5)) {
                        C33163m mVar = this.f78821c;
                        if (mVar != null) {
                            mVar.mo59038a();
                        }
                    } else if (C89219l.m154714a(a, (Object) 3)) {
                        C33163m mVar2 = this.f78821c;
                        if (mVar2 != null) {
                            mVar2.mo59038a();
                        }
                    } else if (C89219l.m154714a(a, (Object) 6)) {
                        C33163m mVar3 = this.f78821c;
                        if (mVar3 != null) {
                            mVar3.mo59038a();
                        }
                    } else if (C89219l.m154714a(a, (Object) 7)) {
                        m67988i();
                    } else {
                        C89219l.m154714a(a, (Object) 8);
                    }
                }
            } else if (str.equals("comment_aweme_and_link") && (pVar = (C89378p) bVar.mo60212a()) != null && (aweme = (Aweme) pVar.getFirst()) != null) {
                this.f78820b = aweme;
                C89378p pVar2 = (C89378p) bVar.mo60212a();
                if (pVar2 != null && (acVar = (C38214ac) pVar2.getSecond()) != null) {
                    this.f78819a = acVar;
                    Aweme aweme2 = this.f78820b;
                    if (aweme2 == null) {
                        C89219l.m154715b();
                    }
                    mo59071a(acVar, aweme2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.comment.View$OnClickListenerC33170f.onClick(android.view.View):void");
    }

    public /* synthetic */ View$OnClickListenerC33170f(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo59071a(C38214ac acVar, Aweme aweme) {
        C89219l.m154721d(acVar, "");
        C89219l.m154721d(aweme, "");
        this.f78819a = acVar;
        this.f78820b = aweme;
        m67979a();
    }

    /* renamed from: a */
    public final void mo59072a(String str, String str2) {
        IAdCommentDepend iAdCommentDepend = C33168a.f78817a;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.mo59064a(str, getContext(), this.f78819a, this.f78820b, str2);
        }
    }
}
