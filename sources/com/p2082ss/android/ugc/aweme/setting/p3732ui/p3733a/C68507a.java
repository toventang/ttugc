package com.p2082ss.android.ugc.aweme.setting.p3732ui.p3733a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.page.privacy.sug.SuggestAccountSetApi;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4519d.p4520a.p4532e.C88060b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a */
public final class C68507a extends C26614b {

    /* renamed from: c */
    public static final C68508a f153323c = new C68508a((byte) 0);

    /* renamed from: a */
    public boolean f153324a = true;

    /* renamed from: b */
    public AbstractC88412b f153325b;

    /* renamed from: d */
    private boolean f153326d = true;

    /* renamed from: e */
    private SparseArray f153327e;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$e */
    static final class View$OnClickListenerC68512e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC68512e f153331a = new View$OnClickListenerC68512e();

        static {
            Covode.recordClassIndex(80765);
        }

        View$OnClickListenerC68512e() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(80760);
    }

    /* renamed from: a */
    private View m120966a(int i) {
        if (this.f153327e == null) {
            this.f153327e = new SparseArray();
        }
        View view = (View) this.f153327e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f153327e.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$a */
    public static final class C68508a {
        static {
            Covode.recordClassIndex(80761);
        }

        private C68508a() {
        }

        public /* synthetic */ C68508a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$c */
    static final class C68510c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68507a f153329a;

        static {
            Covode.recordClassIndex(80763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68510c(C68507a aVar) {
            super(0);
            this.f153329a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f153329a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f153327e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$b */
    public static final class C68509b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C68507a f153328a;

        static {
            Covode.recordClassIndex(80762);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68509b(C68507a aVar) {
            this.f153328a = aVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i;
            Resources resources;
            C89219l.m154721d(textPaint, "");
            Context context = this.f153328a.getContext();
            if (context == null || (resources = context.getResources()) == null) {
                i = 0;
            } else {
                i = resources.getColor(R.color.bh);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C39162r.m79462a("confirm_link_privacy_pop_up", C89387v.m154943a("click", "result"));
            C68507a.m120967a(this.f153328a).dispose();
            C68507a aVar = this.f153328a;
            boolean z = aVar.f153324a;
            Context context = aVar.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            TuxTextCell tuxTextCell = new TuxTextCell(context, null, 0, 6);
            Context context2 = aVar.getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context2, "");
            AbstractC23293c.C23309j jVar = new AbstractC23293c.C23309j(context2);
            jVar.mo37959c(z);
            jVar.mo37957a(new C68514g(jVar));
            tuxTextCell.setAccessory(jVar);
            tuxTextCell.setIcon((C22999a) null);
            tuxTextCell.setTitle(aVar.getString(R.string.dm0));
            tuxTextCell.setSubtitle(aVar.getString(R.string.dlz));
            tuxTextCell.setOnClickListener(new C68517h(tuxTextCell));
            C23226a.C23227a aVar2 = new C23226a.C23227a();
            TuxNavBar.C23179a aVar3 = new TuxNavBar.C23179a();
            C23194g gVar = new C23194g();
            String string = aVar.getString(R.string.cb0);
            C89219l.m154716b(string, "");
            TuxNavBar.C23179a b = aVar3.mo37731a(gVar.mo37753a(string)).mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C68510c(aVar)));
            b.f54919d = true;
            aVar2.mo37818a(b).mo37816a(tuxTextCell).mo37815a(new DialogInterface$OnDismissListenerC68518i(aVar)).f55057a.show(aVar.getChildFragmentManager(), "PrivacyDialog");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$d */
    static final class C68511d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C68507a f153330a;

        static {
            Covode.recordClassIndex(80764);
        }

        C68511d(C68507a aVar) {
            this.f153330a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f153330a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$i */
    static final class DialogInterface$OnDismissListenerC68518i implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C68507a f153338a;

        static {
            Covode.recordClassIndex(80771);
        }

        DialogInterface$OnDismissListenerC68518i(C68507a aVar) {
            this.f153338a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f153338a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$h */
    static final class C68517h extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxTextCell f153337a;

        static {
            Covode.recordClassIndex(80770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68517h(TuxTextCell tuxTextCell) {
            super(1);
            this.f153337a = tuxTextCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            C23226a.C23228b.m43787a(this.f153337a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC88412b m120967a(C68507a aVar) {
        AbstractC88412b bVar = aVar.f153325b;
        if (bVar == null) {
            C89219l.m154710a("disposable");
        }
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.a0w);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$f */
    static final class View$OnClickListenerC68513f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68507a f153332a;

        static {
            Covode.recordClassIndex(80766);
        }

        View$OnClickListenerC68513f(C68507a aVar) {
            this.f153332a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79462a("confirm_link_privacy_pop_up", C89387v.m154943a("close", "result"));
            C68507a.m120967a(this.f153332a).dispose();
            this.f153332a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a.a$g */
    static final class C68514g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC23293c.C23309j f153333a;

        static {
            Covode.recordClassIndex(80767);
        }

        C68514g(AbstractC23293c.C23309j jVar) {
            this.f153333a = jVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
            String str;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            int i = 1;
            C39162r.m79462a("account_auth_switch", C89387v.m154943a("link", "account_type"), C89387v.m154943a(str, "to_status"), C89387v.m154943a("link_pop_up", "enter_from"));
            if (!z) {
                i = 2;
            }
            C89219l.m154721d("sug_to_who_share_link", "");
            ((SuggestAccountSetApi.RealApi) SuggestAccountSetApi.f152897a.getValue()).setSuggestPrivacySettings("sug_to_who_share_link", i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C685151.f153334a, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.p3733a.C68507a.C68514g.C685162 */

                /* renamed from: a */
                final /* synthetic */ C68514g f153335a;

                static {
                    Covode.recordClassIndex(80769);
                }

                {
                    this.f153335a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C88060b.m153136a("SuggestAccountPrivacyGuideDialog", "dz[setSuggestPrivacySettings failed]", null);
                    this.f153335a.f153333a.mo37959c(!z);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f153326d = arguments.getBoolean("is_sharer");
            this.f153324a = arguments.getBoolean("privacy_toggle");
        }
        AbstractC88412b d = AbstractC88979t.m154310b((Object) true).mo143295e(10, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C68511d(this));
        C89219l.m154716b(d, "");
        this.f153325b = d;
        ((LinearLayout) m120966a(R.id.acq)).setOnClickListener(View$OnClickListenerC68512e.f153331a);
        ((TuxIconView) m120966a(R.id.a6u)).setOnClickListener(new View$OnClickListenerC68513f(this));
        TuxTextView tuxTextView = (TuxTextView) m120966a(R.id.bn3);
        C89219l.m154716b(tuxTextView, "");
        if (this.f153324a) {
            string = getString(R.string.cb0);
            C89219l.m154716b(string, "");
            if (this.f153326d) {
                string2 = getString(R.string.cvl);
                C89219l.m154716b(string2, "");
            } else {
                string2 = getString(R.string.cvk);
                C89219l.m154716b(string2, "");
            }
        } else {
            string = getString(R.string.caz);
            C89219l.m154716b(string, "");
            if (this.f153326d) {
                string2 = getString(R.string.cvj);
                C89219l.m154716b(string2, "");
            } else {
                string2 = getString(R.string.cvi);
                C89219l.m154716b(string2, "");
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        if (this.f153324a) {
            spannableStringBuilder.append((CharSequence) " ");
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C68509b(this), 0, string.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        tuxTextView.setText(spannableStringBuilder);
        TuxTextView tuxTextView2 = (TuxTextView) m120966a(R.id.bn3);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.axs, viewGroup, false);
    }
}
