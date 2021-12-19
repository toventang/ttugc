package com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.livesdk.p643ui.C10939d;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity */
public final class LinkAnchorAddActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C72483a f162479b = new C72483a((byte) 0);

    /* renamed from: a */
    public KeyListener f162480a;

    /* renamed from: c */
    private final AbstractC89244h f162481c = C89250i.m154773a((AbstractC89171a) new C72497k(this));

    /* renamed from: d */
    private SparseArray f162482d;

    static {
        Covode.recordClassIndex(85159);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f162482d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f162482d == null) {
            this.f162482d = new SparseArray();
        }
        View view = (View) this.f162482d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f162482d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final LinkAnchorViewModel mo114753a() {
        return (LinkAnchorViewModel) this.f162481c.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$a */
    public static final class C72483a {
        static {
            Covode.recordClassIndex(85160);
        }

        private C72483a() {
        }

        public /* synthetic */ C72483a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$k */
    static final class C72497k extends AbstractC89220m implements AbstractC89171a<LinkAnchorViewModel> {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162497a;

        static {
            Covode.recordClassIndex(85174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72497k(LinkAnchorAddActivity linkAnchorAddActivity) {
            super(0);
            this.f162497a = linkAnchorAddActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkAnchorViewModel invoke() {
            LinkAnchorAddActivity linkAnchorAddActivity = this.f162497a;
            C89219l.m154721d(linkAnchorAddActivity, "");
            AbstractC1174ac a = C1181ae.m3881a(linkAnchorAddActivity, (C1175ad.AbstractC1177b) null).mo3983a(LinkAnchorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$c */
    public static final class C72486c extends C10939d {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162485a;

        static {
            Covode.recordClassIndex(85163);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72486c(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162485a = linkAnchorAddActivity;
        }

        @Override // com.bytedance.android.livesdk.p643ui.C10939d
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                LinkAnchorViewModel a = this.f162485a.mo114753a();
                String obj = charSequence.toString();
                C89219l.m154721d(obj, "");
                a.f162503e = true;
                a.f162499a.setValue(C89361p.m154910b((CharSequence) obj).toString());
                a.f162500b.setValue(EnumC72507c.INITIAL);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$e */
    static final class View$OnClickListenerC72488e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162487a;

        static {
            Covode.recordClassIndex(85165);
        }

        View$OnClickListenerC72488e(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162487a = linkAnchorAddActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f162487a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$f */
    static final class View$OnClickListenerC72489f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162488a;

        static {
            Covode.recordClassIndex(85166);
        }

        View$OnClickListenerC72489f(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162488a = linkAnchorAddActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$f$a */
        static final class View$OnClickListenerC72490a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DmtEditText f162489a;

            /* renamed from: b */
            final /* synthetic */ View$OnClickListenerC72489f f162490b;

            static {
                Covode.recordClassIndex(85167);
            }

            View$OnClickListenerC72490a(DmtEditText dmtEditText, View$OnClickListenerC72489f fVar) {
                this.f162489a = dmtEditText;
                this.f162490b = fVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f162489a.setKeyListener(this.f162490b.f162488a.f162480a);
                this.f162489a.setEllipsize(null);
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DmtEditText dmtEditText = (DmtEditText) this.f162488a._$_findCachedViewById(R.id.ja);
            if (!(dmtEditText == null || dmtEditText.getKeyListener() == null)) {
                this.f162488a.f162480a = dmtEditText.getKeyListener();
                dmtEditText.setKeyListener(null);
                dmtEditText.setEllipsize(TextUtils.TruncateAt.END);
                dmtEditText.setOnClickListener(new View$OnClickListenerC72490a(dmtEditText, this));
            }
            LinkAnchorAddActivity linkAnchorAddActivity = this.f162488a;
            String value = linkAnchorAddActivity.mo114753a().f162499a.getValue();
            if (value == null) {
                value = "";
            }
            C89219l.m154716b(value, "");
            AddWikiActivity.C81638a.m141514a(linkAnchorAddActivity, value, C89041ag.m154421a(C89387v.m154943a("anchor_type", "News"), C89387v.m154943a("title", this.f162488a.getString(R.string.tn)), C89387v.m154943a("noRedirect", "true")), C89041ag.m154415a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$h */
    static final class C72492h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162492a;

        static {
            Covode.recordClassIndex(85169);
        }

        C72492h(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162492a = linkAnchorAddActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (str != null) {
                TuxTextView tuxTextView = (TuxTextView) this.f162492a._$_findCachedViewById(R.id.jc);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$i */
    static final class C72493i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162493a;

        static {
            Covode.recordClassIndex(85170);
        }

        C72493i(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162493a = linkAnchorAddActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (C89219l.m154714a((Object) bool, (Object) true) && bool != null) {
                bool.booleanValue();
                this.f162493a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$j */
    static final class C72494j extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C72494j f162494a = new C72494j();

        static {
            Covode.recordClassIndex(85171);
        }

        C72494j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C724951.f162495a);
            baseActivityViewModel2.config(C724962.f162496a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onCreate", true);
        activityConfiguration(C72494j.f162494a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.au);
        mo114753a().f162500b.observe(this, new C72484b(this));
        ((DmtEditText) _$_findCachedViewById(R.id.ja)).addTextChangedListener(new C72486c(this));
        ((DmtEditText) _$_findCachedViewById(R.id.ja)).setOnFocusChangeListener(new View$OnFocusChangeListenerC72487d(this));
        ((TuxTextView) _$_findCachedViewById(R.id.cs8)).setOnClickListener(new View$OnClickListenerC72488e(this));
        ((TuxCompoundIconTextView) _$_findCachedViewById(R.id.jd)).setOnClickListener(new View$OnClickListenerC72489f(this));
        ((LinearLayout) _$_findCachedViewById(R.id.cs7)).setOnTouchListener(new View$OnTouchListenerC72491g(this));
        mo114753a().f162501c.observe(this, new C72492h(this));
        mo114753a().f162502d.observe(this, new C72493i(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$b */
    static final class C72484b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162483a;

        static {
            Covode.recordClassIndex(85161);
        }

        C72484b(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162483a = linkAnchorAddActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC72507c cVar = (EnumC72507c) obj;
            LinkAnchorAddActivity linkAnchorAddActivity = this.f162483a;
            TuxTextView tuxTextView = (TuxTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.jc);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            TuxCompoundIconTextView tuxCompoundIconTextView = (TuxCompoundIconTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.jd);
            C89219l.m154716b(tuxCompoundIconTextView, "");
            tuxCompoundIconTextView.setVisibility(8);
            linkAnchorAddActivity._$_findCachedViewById(R.id.jb).setBackgroundColor(C0643b.m2378c(linkAnchorAddActivity, R.color.b0));
            ProgressBar progressBar = (ProgressBar) linkAnchorAddActivity._$_findCachedViewById(R.id.j_);
            C89219l.m154716b(progressBar, "");
            progressBar.setVisibility(8);
            ImageView imageView = (ImageView) linkAnchorAddActivity._$_findCachedViewById(R.id.j9);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
            ((TuxTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.j8)).setTextColor(C0643b.m2378c(linkAnchorAddActivity, R.color.bz));
            ((TuxTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.j8)).setOnClickListener(null);
            if (cVar != null) {
                int i = C72503a.f162509a[cVar.ordinal()];
                if (i == 1) {
                    ProgressBar progressBar2 = (ProgressBar) this.f162483a._$_findCachedViewById(R.id.j_);
                    C89219l.m154716b(progressBar2, "");
                    progressBar2.setVisibility(0);
                    ImageView imageView2 = (ImageView) this.f162483a._$_findCachedViewById(R.id.j9);
                    C89219l.m154716b(imageView2, "");
                    imageView2.setVisibility(8);
                } else if (i == 2) {
                    TuxTextView tuxTextView2 = (TuxTextView) this.f162483a._$_findCachedViewById(R.id.jc);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                    this.f162483a._$_findCachedViewById(R.id.jb).setBackgroundColor(C0643b.m2378c(this.f162483a, R.color.bd));
                } else if (i == 3) {
                    TuxCompoundIconTextView tuxCompoundIconTextView2 = (TuxCompoundIconTextView) this.f162483a._$_findCachedViewById(R.id.jd);
                    C89219l.m154716b(tuxCompoundIconTextView2, "");
                    tuxCompoundIconTextView2.setVisibility(0);
                    ProgressBar progressBar3 = (ProgressBar) this.f162483a._$_findCachedViewById(R.id.j_);
                    C89219l.m154716b(progressBar3, "");
                    progressBar3.setVisibility(8);
                    ImageView imageView3 = (ImageView) this.f162483a._$_findCachedViewById(R.id.j9);
                    C89219l.m154716b(imageView3, "");
                    imageView3.setVisibility(0);
                    ((TuxTextView) this.f162483a._$_findCachedViewById(R.id.j8)).setTextColor(C0643b.m2378c(this.f162483a, R.color.bh));
                    ((TuxTextView) this.f162483a._$_findCachedViewById(R.id.j8)).setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity.C72484b.View$OnClickListenerC724851 */

                        /* renamed from: a */
                        final /* synthetic */ C72484b f162484a;

                        static {
                            Covode.recordClassIndex(85162);
                        }

                        {
                            this.f162484a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            LinkAnchorViewModel a = this.f162484a.f162483a.mo114753a();
                            if (C80538hl.m139614a(a.f162499a.getValue()) && a.f162500b.getValue() == EnumC72507c.VALIDATED) {
                                String b = new C27910f().mo46674b(C89041ag.m154412a(C89387v.m154943a("add_from", 2)));
                                int type = EnumC31359ab.NEWS.getTYPE();
                                C89219l.m154716b(b, "");
                                AbstractC81915c.m141874a(new C37609a(new C39053a(type, b, C17867d.m33078a().getString(R.string.tj), null, 1, null, null, false, a.f162499a.getValue(), null, null, null, null, 7912, null)));
                                a.f162502d.postValue(true);
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$d */
    static final class View$OnFocusChangeListenerC72487d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162486a;

        static {
            Covode.recordClassIndex(85164);
        }

        View$OnFocusChangeListenerC72487d(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162486a = linkAnchorAddActivity;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                C38754l.m78612b(this.f162486a, view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity$g */
    static final class View$OnTouchListenerC72491g implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ LinkAnchorAddActivity f162491a;

        static {
            Covode.recordClassIndex(85168);
        }

        View$OnTouchListenerC72491g(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f162491a = linkAnchorAddActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            LinkAnchorAddActivity linkAnchorAddActivity = this.f162491a;
            C38754l.m78612b(linkAnchorAddActivity, linkAnchorAddActivity._$_findCachedViewById(R.id.ja));
            return true;
        }
    }
}
