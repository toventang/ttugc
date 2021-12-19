package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17238d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.p1998c.p1999a.C27254p;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.livedata.SlideData;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.api.C36269c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2485b.C36294a;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37080bx;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36952a;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b;
import com.p2082ss.android.ugc.aweme.comment.util.C37187a;
import com.p2082ss.android.ugc.aweme.comment.util.C37216s;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.FadeImageView;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49988u;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49979o;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49981p;
import com.p2082ss.android.ugc.aweme.forward.p3004a.C51414a;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.p3538o.C62690a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.b */
public class C37035b extends AbstractC18234b implements AbstractC36413a, AbstractC36953b, AbstractC90252i, AbstractC90253j {

    /* renamed from: D */
    private static String f87224D;

    /* renamed from: E */
    private static String f87225E;

    /* renamed from: A */
    private boolean f87226A;

    /* renamed from: B */
    private boolean f87227B;

    /* renamed from: C */
    private boolean f87228C;

    /* renamed from: F */
    private boolean f87229F;

    /* renamed from: a */
    ViewGroup f87230a;

    /* renamed from: b */
    TuxTextView f87231b;

    /* renamed from: c */
    View f87232c;

    /* renamed from: d */
    MentionEditText f87233d;

    /* renamed from: e */
    TuxIconView f87234e;

    /* renamed from: j */
    TuxIconView f87235j;

    /* renamed from: k */
    TuxIconView f87236k;

    /* renamed from: l */
    FadeImageView f87237l;

    /* renamed from: m */
    TuxTextView f87238m;

    /* renamed from: n */
    ConstraintLayout f87239n;

    /* renamed from: o */
    View f87240o;

    /* renamed from: p */
    View f87241p;

    /* renamed from: q */
    AppCompatCheckBox f87242q;

    /* renamed from: r */
    public AbstractC49988u f87243r;

    /* renamed from: s */
    public AbstractC36952a f87244s;

    /* renamed from: t */
    C36274b f87245t;

    /* renamed from: u */
    public AbstractC36430c f87246u;

    /* renamed from: v */
    public String f87247v;

    /* renamed from: w */
    String f87248w = "";

    /* renamed from: x */
    private View f87249x;

    /* renamed from: y */
    private C37004a f87250y;

    /* renamed from: z */
    private IVideoGiftService f87251z;

    static {
        Covode.recordClassIndex(44389);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(60, new RunnableC90250g(C37035b.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(5, new RunnableC90250g(C37035b.class, "onCommentEvent", C36387c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(51, new RunnableC90250g(C37035b.class, "onEvent", C34572c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(145, new RunnableC90250g(C37035b.class, "onAfterLoginInEvent", C33491f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: k */
    public final void mo63697k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: n */
    public final Comment mo64435n() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    public void onEvent(C51414a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: p */
    public final int mo64438p() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63684a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f87233d.setText(str);
            this.f87233d.setEnabled(false);
            this.f87228C = true;
            this.f87234e.setVisibility(8);
            this.f87236k.setVisibility(8);
            this.f87238m.setVisibility(0);
            f87224D = str;
            f87225E = str2;
            Aweme l = mo64541l();
            if (!C37699a.m76213P(l)) {
                this.f87238m.setOnClickListener(null);
                return;
            }
            this.f87238m.setOnClickListener(new View$OnClickListenerC37152f(this, str2, l, l.getCommerceVideoAuthInfo()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63685a(boolean z) {
        if (af_()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f87240o.getLayoutParams();
            if (z) {
                if (this.f87230a.getVisibility() == 8 && C76706a.m134287m(mo64541l())) {
                    AbstractC36952a aVar = this.f87244s;
                    if (aVar == null || !aVar.mo64422j()) {
                        this.f87230a.setVisibility(0);
                        C34729o.m70955a(this.f87241p, 0);
                        marginLayoutParams.height = getContext().getResources().getDimensionPixelOffset(R.dimen.ds);
                        if (C33403c.f79374d) {
                            marginLayoutParams.height += C33403c.f79375e;
                        }
                        this.f87240o.setLayoutParams(marginLayoutParams);
                    }
                }
            } else if (this.f87230a.getVisibility() == 0) {
                this.f87230a.setVisibility(8);
                this.f87241p.setVisibility(8);
                marginLayoutParams.height = 1;
                this.f87240o.setLayoutParams(marginLayoutParams);
                mo63693g();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64425a(String str) {
        this.f87240o.setVisibility(4);
        m74662a(8);
        AbstractC36430c cVar = this.f87246u;
        if (cVar != null) {
            cVar.mo63766c();
        }
        m74664a(false, false, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64426a(String str, int i) {
        String aid;
        Aweme l = mo64541l();
        String str2 = this.f87247v;
        String str3 = "";
        if (l == null) {
            aid = str3;
        } else {
            aid = l.getAid();
            str3 = l.getAuthorUid();
        }
        C36539b.m74370a(str, i, str2, aid, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: c */
    public final void mo63688c() {
        f87225E = null;
        f87224D = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: g */
    public final void mo63693g() {
        af_();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: m */
    public final Aweme mo64434m() {
        return mo64541l();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f43437f = false;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b
    public final boolean af_() {
        if (!super.af_() || getContext() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Aweme mo64541l() {
        AbstractC36952a aVar = this.f87244s;
        if (aVar != null) {
            return aVar.mo64420h();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: o */
    public final String mo64436o() {
        AbstractC36952a aVar = this.f87244s;
        if (aVar != null) {
            return aVar.mo64421i();
        }
        return "";
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f87244s = null;
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: r */
    private C37048bj m74666r() {
        if (getActivity() == null) {
            return null;
        }
        return (C37048bj) getActivity().getSupportFragmentManager().mo3551a("comment_page");
    }

    /* renamed from: s */
    private String m74667s() {
        AbstractC36952a aVar = this.f87244s;
        if (aVar == null || aVar.mo64420h() == null) {
            return "";
        }
        return this.f87244s.mo64420h().getAid();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: d */
    public final void mo63690d() {
        this.f87226A = true;
        View view = this.f87240o;
        if (view != null) {
            view.setVisibility(4);
            this.f87240o.setEnabled(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: e */
    public final void mo63692e() {
        int i = 0;
        this.f87226A = false;
        View view = this.f87240o;
        if (view != null) {
            if (this.f87227B) {
                i = 4;
            }
            view.setVisibility(i);
            this.f87240o.setEnabled(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: i */
    public final void mo63695i() {
        Fragment a;
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragmentManager != null && (a = fragmentManager.mo3551a("comment_input_tag")) != null) {
            fragmentManager.mo3552a().mo3455a(a).mo3473c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: h */
    public final void mo63694h() {
        View view = this.f87249x;
        if (view != null && this.f87233d != null && view.getVisibility() == 0) {
            this.f87249x.setVisibility(8);
            this.f87233d.setEnabled(true);
            this.f87233d.setFocusable(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: j */
    public final void mo63696j() {
        boolean a = C39223a.m79589c().mo68606a(3);
        if (this.f87229F != a && this.f87245t != null) {
            this.f87229F = a;
            if (a) {
                this.f87250y.mo64516a();
                this.f87231b.setVisibility(0);
            }
            this.f87245t.mo63497b(this.f87229F);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f87229F) {
            this.f87250y.mo64516a();
            this.f87231b.setVisibility(0);
        }
        mo63686b();
        mo63684a(f87224D, f87225E);
        m74662a(9);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: b */
    public final void mo63686b() {
        if (af_()) {
            boolean z = true;
            if (!C31575b.m65865g().isLogin()) {
                this.f87233d.setFocusable(false);
            } else {
                this.f87233d.setFocusable(true);
                this.f87233d.setFocusableInTouchMode(true);
                this.f87233d.requestFocus();
            }
            Aweme l = mo64541l();
            if (l == null || !l.isProhibited()) {
                this.f87233d.setEnabled(true);
                C36274b bVar = this.f87245t;
                if (bVar != null) {
                    bVar.mo63466a();
                    Editable text = this.f87233d.getText();
                    boolean a = m74665a(l);
                    if (text == null || text.length() <= 0) {
                        z = false;
                    }
                    m74664a(a, false, z);
                    return;
                }
                return;
            }
            this.f87233d.setEnabled(false);
            this.f87233d.setHint(R.string.akw);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: q */
    public final boolean mo64439q() {
        Aweme h;
        if (!af_() || getActivity() == null || !C31575b.m65865g().isLogin()) {
            return false;
        }
        final Aweme l = mo64541l();
        if (C58956a.m108315a(l)) {
            new C79459a(getContext()).mo123052a(C58956a.m108314a(l, R.string.h8k)).mo123053a();
            return false;
        }
        if (l != null) {
            if (!l.isCanPlay()) {
                if (l.isImage()) {
                    new C23144b(this).mo37640e(R.string.civ).mo37637b();
                } else {
                    new C23144b(this).mo37640e(R.string.h8k).mo37637b();
                }
                return false;
            } else if (l.getStatus() != null && l.getStatus().isDelete()) {
                new C23144b(this).mo37640e(R.string.h6z).mo37637b();
                return false;
            } else if (l.getStatus() != null && !l.getStatus().isAllowComment()) {
                new C23144b(this).mo37640e(R.string.a8t).mo37637b();
                return false;
            }
        }
        if (!C80636z.m139818c(l) || C80636z.m139820e(l) || (l.getAuthor() != null && TextUtils.equals(l.getAuthor().getUid(), C31575b.m65865g().getCurUser().getUid()))) {
            AbstractC36952a aVar = this.f87244s;
            if (aVar != null && aVar.mo64420h() != null && (h = this.f87244s.mo64420h()) != null && h.getStatus() != null && h.getStatus().getPrivateStatus() == 1 && h.getAuthor() != null && TextUtils.equals(h.getAuthor().getUid(), C31575b.m65865g().getCurUser().getUid())) {
                if (l != null) {
                    this.f87243r.mo85027a(l, 0);
                    new C17197a.C17200a(getContext()).mo27194b(R.string.et1).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37035b.DialogInterface$OnClickListenerC370383 */

                        static {
                            Covode.recordClassIndex(44392);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C39162r.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(l.getAid()));
                        }
                    }, false).mo27190a(R.string.cta, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37035b.DialogInterface$OnClickListenerC370372 */

                        static {
                            Covode.recordClassIndex(44391);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C37035b.this.f87243r.mo57616a(l.getAid(), 1);
                            C39162r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(l.getAid()));
                        }
                    }, false).mo27193a().mo27184b();
                }
                return false;
            } else if (l == null || !l.isAwemeFromXiGua()) {
                return true;
            } else {
                return false;
            }
        } else {
            new C23144b(this).mo37640e(R.string.c14).mo37637b();
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63682a() {
        if (this.f87233d != null && !this.f87228C) {
            mo63693g();
            Aweme l = mo64541l();
            if (l == null || !l.isProhibited()) {
                boolean z = true;
                this.f87233d.setEnabled(true);
                C36274b bVar = this.f87245t;
                if (bVar != null) {
                    bVar.mo63466a();
                    Editable text = this.f87233d.getText();
                    boolean a = m74665a(l);
                    if (text == null || text.length() <= 0) {
                        z = false;
                    }
                    m74664a(a, z, false);
                    this.f87245t.mo63512k();
                    return;
                }
                return;
            }
            this.f87233d.setEnabled(false);
            this.f87233d.setHint(R.string.akw);
        }
    }

    @AbstractC90264r
    public void onAfterLoginInEvent(C33491f fVar) {
        ViewGroup viewGroup = this.f87230a;
    }

    @AbstractC90264r
    public void onEvent(C34572c cVar) {
        ViewGroup viewGroup = this.f87230a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo64540h(boolean z) {
        mo63685a(!z);
    }

    /* renamed from: a */
    private void m74662a(int i) {
        AbstractC36952a aVar = this.f87244s;
        if (aVar != null) {
            aVar.mo63634a(new C49672ag(i));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: d */
    public final void mo63691d(boolean z) {
        View view = this.f87240o;
        if (view != null) {
            view.post(new RunnableC37154h(this, z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo64539g(boolean z) {
        mo63685a(!z);
    }

    /* renamed from: a */
    private static C13624l.EnumC13625a m74661a(Context context) {
        if (C58029j.f132252d != C13624l.EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132252d;
        }
        C13624l.EnumC13625a c = C13624l.m24487c(context);
        C58029j.f132252d = c;
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64428b(String str) {
        String aid;
        Aweme l = mo64541l();
        String str2 = this.f87247v;
        String str3 = "";
        if (l == null) {
            aid = str3;
        } else {
            aid = l.getAid();
            str3 = l.getAuthorUid();
        }
        C36539b.m74372a(str, str2, aid, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64432f(boolean z) {
        if (z) {
            ForwardStatisticsServiceImpl.m95759b().mo86846a(mo64436o(), mo64541l(), "detail", "click_original");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: g */
    public final void mo64433g(Comment comment) {
        mo63682a();
        if (comment != null && comment.getFakeGiftId() != 0) {
            m74663a(true, comment, 0);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87245t = new C36274b(this, hashCode(), this);
        this.f87251z = VideoGiftService.m120814l();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63683a(float f) {
        int i;
        View view = this.f87240o;
        if (view != null) {
            view.setAlpha(f);
            View view2 = this.f87240o;
            boolean z = false;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
            if (f > 0.0f) {
                z = true;
            }
            mo63685a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: c */
    public final void mo63689c(boolean z) {
        int i;
        View view = this.f87249x;
        if (view != null && this.f87233d != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.f87233d.setEnabled(!z);
            this.f87233d.setFocusable(!z);
            Aweme l = mo64541l();
            if (l != null && this.f87249x.getVisibility() == 0) {
                this.f87249x.setOnClickListener(new View$OnClickListenerC37155i(this, l));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64430e(boolean z) {
        MentionEditText mentionEditText;
        this.f87240o.setVisibility(0);
        m74664a(false, false, !TextUtils.isEmpty(this.f87233d.getText()));
        m74662a(9);
        AbstractC36430c cVar = this.f87246u;
        if (cVar != null) {
            cVar.mo63767d();
        }
        if (this.f87245t != null && (mentionEditText = this.f87233d) != null) {
            C36274b.m73917a(mentionEditText, (int) R.color.a9);
        }
    }

    @AbstractC90264r
    public void onCommentEvent(C36387c cVar) {
        C36274b bVar;
        if (cVar.f86061a == 8) {
            Object obj = cVar.f86062b;
            Aweme l = mo64541l();
            if (l != null && l.getAid() != null && l.getAid().equals(obj) && (bVar = this.f87245t) != null) {
                bVar.mo63466a();
                m74664a(m74665a(l), false, false);
            }
        }
    }

    @AbstractC90264r
    public void onDislikeAwemeEvent(C49678f fVar) {
        float f;
        if (getActivity() != null && fVar.f114345e == getActivity().hashCode() && fVar.f114342b == 2) {
            if (fVar.f114341a) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            ViewGroup viewGroup = this.f87230a;
            C17238d.m31812a(viewGroup, viewGroup.getAlpha(), f);
            View view = this.f87241p;
            C17238d.m31812a(view, view.getAlpha(), f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64431f(Comment comment) {
        if (comment == null || C27254p.m54261a(comment.getGiftEffectPath()) || comment.getFakeGiftId() == 0) {
            C37048bj r = m74666r();
            if (r != null) {
                r.mo63704a(comment);
            }
            if (C46920f.m90223c()) {
                AbstractC81915c.m141874a(new C62690a(1, comment));
                return;
            }
            return;
        }
        C37080bx.C37081a.m74800a(comment).show(getActivity().getSupportFragmentManager().mo3552a(), "GiftAnimationFragment");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: b */
    public final void mo63687b(boolean z) {
        float f;
        View view = this.f87240o;
        if (view == null) {
            this.f87227B = z;
            return;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        if (z) {
            this.f87240o.setVisibility(4);
        }
        this.f87240o.post(new RunnableC37153g(this, z));
    }

    /* renamed from: a */
    private static boolean m74665a(Aweme aweme) {
        if (aweme == null || aweme.isProhibited() || aweme.getCommentSetting() == C36294a.f85805d) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        int commentSetting = author.getCommentSetting();
        int commentSetting2 = aweme.getCommentSetting();
        if (commentSetting == C36294a.f85805d || commentSetting2 == C36294a.f85805d) {
            return true;
        }
        if (AccountService.m65215a().mo57069e().isMe(author.getUid())) {
            if (AccountService.m65215a().mo57069e().getCurUser().getCommentSetting() == C36294a.f85805d || aweme.getCommentSetting() == C36294a.f85805d) {
                return true;
            }
            return false;
        } else if (commentSetting == C36294a.f85803b && !C80636z.m139820e(aweme)) {
            return true;
        } else {
            if (commentSetting != C36294a.f85804c || C80636z.m139821f(aweme)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64429e(Comment comment) {
        if (af_() && getActivity() != null) {
            String awemeId = comment.getAwemeId();
            if (TextUtils.isEmpty(awemeId)) {
                awemeId = m74667s();
            }
            new C79459a(getContext()).mo123050a(R.string.al7).mo123053a();
            mo63682a();
            AwemeService.m70060b().mo60688c(awemeId);
            Aweme l = mo64541l();
            if (l != null && l.isAd() && TextUtils.equals(awemeId, l.getAid())) {
                AdCommentDependImpl.m75903b().mo59057a(getContext(), l, "comment_sign");
                C18129a.m33746a("draw_ad", UGCMonitor.EVENT_COMMENT, l.getAwemeRawAd()).mo28900b("refer", "comment_sign").mo28897a("anchor_id", C37187a.m75152b(l)).mo28897a("room_id", C37187a.m75151a(l)).mo28902c();
            }
            List<TextExtraStruct> textExtra = comment.getTextExtra();
            String awemeId2 = comment.getAwemeId();
            if (awemeId2 == null) {
                awemeId2 = m74667s();
            }
            if (!(textExtra == null || this.f87245t == null)) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    Iterator<User> it = this.f87245t.f85733d.iterator();
                    while (it.hasNext()) {
                        User next = it.next();
                        if (TextUtils.equals(next.getUid(), textExtraStruct.getUserId())) {
                            int atType = next.getAtType();
                            if (atType == 3) {
                                getContext();
                                C39162r.m79457a("comment_at", "follow", awemeId2, next.getUid());
                            } else if (atType == 1) {
                                getContext();
                                C39162r.m79457a("comment_at", "search", awemeId2, next.getUid());
                            } else if (atType == 4) {
                                getContext();
                                C39162r.m79457a("comment_at", "recent", awemeId2, next.getUid());
                            }
                        }
                    }
                }
            }
            AbstractC81915c.m141874a(new C36387c(3, new Object[]{awemeId, comment.clone()}));
            C37048bj r = m74666r();
            if (r != null) {
                comment.setIgnoreToast(true);
                r.mo63705a(comment, false);
            }
            if (comment.getGift() != null) {
                m74663a(true, comment, 0);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.f87231b.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
        TuxTextView tuxTextView = this.f87231b;
        String str2 = getString(R.string.ajd) + " ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + getString(R.string.h_a));
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37035b.C370361 */

            static {
                Covode.recordClassIndex(44390);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                C39223a.m79589c().mo68602a(C37035b.this.getContext(), "float_comment");
            }
        }, str2.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.a9)), str2.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), str2.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        this.f87231b.setMovementMethod(new LinkMovementMethod());
        C36274b bVar = this.f87245t;
        if (bVar != null) {
            MentionEditText mentionEditText = this.f87233d;
            TuxIconView tuxIconView = this.f87234e;
            TuxIconView tuxIconView2 = this.f87236k;
            TuxIconView tuxIconView3 = this.f87235j;
            TuxTextView tuxTextView2 = this.f87231b;
            Aweme l = mo64541l();
            if (l != null) {
                str = l.getAid();
            } else {
                str = "";
            }
            bVar.mo63476a(mentionEditText, tuxIconView, tuxIconView2, tuxIconView3, tuxTextView2, str, this.f87247v);
        }
        boolean a = C39223a.m79589c().mo68606a(3);
        this.f87229F = a;
        this.f87245t.mo63497b(a);
        if (this.f87229F) {
            this.f87250y.mo64516a();
            this.f87231b.setVisibility(0);
        }
        this.f87233d.setCursorVisible(false);
        this.f87242q.setVisibility(8);
        this.f87238m.setVisibility(8);
        this.f87237l.setOnClickListener(new View$OnClickListenerC37100c(this));
        this.f87230a.setBackgroundResource(R.drawable.b2y);
        MentionEditText mentionEditText2 = this.f87233d;
        mentionEditText2.setTextColor(mentionEditText2.getResources().getColor(R.color.a_));
        MentionEditText mentionEditText3 = this.f87233d;
        mentionEditText3.setHintTextColor(mentionEditText3.getResources().getColor(R.color.ln));
        this.f87233d.setTextAlignment(5);
        C33403c.m68506a(this.f87230a, this.f87241p, this.f87249x);
        m74664a(m74665a(mo64541l()), false, false);
        if (this.f87226A) {
            mo63690d();
        }
        mo63687b(this.f87227B);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            SlideData slideData = (SlideData) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SlideData.class);
            if (slideData.f81656a == null) {
                slideData.f81656a = new C1213t<>();
            }
            slideData.f81656a.observe(this, new C37127d(this));
            if (slideData.f81657b == null) {
                slideData.f81657b = new C1213t<>();
            }
            slideData.f81657b.observe(this, new C37151e(this));
        }
        if (!C76706a.m134287m(mo64541l())) {
            mo63685a(false);
        }
        AbstractC36952a aVar = this.f87244s;
        if (aVar != null && aVar.mo64422j()) {
            mo63685a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64427b(Exception exc, int i, Comment comment) {
        int i2;
        C36269c.m73911a(this.f87233d.getContext(), exc, (int) R.string.ak4);
        C37048bj r = m74666r();
        if (r != null) {
            comment.setIgnoreToast(true);
            r.mo63707a(exc, i, comment);
        } else if (comment == null) {
            return;
        }
        if (comment.getFakeGiftId() != 0) {
            try {
                i2 = ((C34480a) exc).getErrorCode();
            } catch (Exception unused) {
                i2 = 0;
            }
            m74663a(false, comment, i2);
        }
    }

    /* renamed from: a */
    private void m74664a(boolean z, boolean z2, boolean z3) {
        C36274b bVar;
        this.f87234e.setTintColorRes(R.attr.ac);
        this.f87236k.setTintColorRes(R.attr.ac);
        if (this.f87235j != null) {
            if (this.f87251z.mo108903a(mo64541l())) {
                this.f87235j.setTintColorRes(R.attr.ac);
                this.f87235j.setVisibility(0);
            } else {
                this.f87235j.setVisibility(8);
            }
        }
        if (z) {
            this.f87234e.setVisibility(8);
            this.f87236k.setVisibility(8);
            this.f87250y.mo64518a(false, false, false);
            return;
        }
        this.f87234e.setVisibility(0);
        this.f87236k.setVisibility(0);
        this.f87250y.mo64518a(z3, z2, false);
        if (!(z3 || this.f87233d == null || (bVar = this.f87245t) == null)) {
            bVar.mo63466a();
        }
        MentionEditText mentionEditText = this.f87233d;
        if (mentionEditText != null) {
            mentionEditText.setFocusable(true);
            this.f87233d.setFocusableInTouchMode(true);
            this.f87233d.requestFocus();
        }
    }

    /* renamed from: a */
    private void m74663a(boolean z, Comment comment, int i) {
        long id;
        if (mo64541l() != null && comment != null) {
            C33744d a = new C33744d().mo59983a("enter_from", this.f87247v).mo59983a("group_id", C59208ac.m108771e(mo64541l())).mo59983a("author_id", C59208ac.m108758a(mo64541l())).mo59980a("is_success", z ? 1 : 0);
            if (comment.getGift() == null) {
                id = comment.getFakeGiftId();
            } else {
                id = comment.getGift().getId();
            }
            C33744d a2 = a.mo59981a("gift_id", id).mo59980a("is_follow", C37216s.m75210b(mo64541l())).mo59980a("is_like", C37216s.m75209a(mo64541l())).mo59980a("is_comment", !C27254p.m54261a(comment.getText()) ? 1 : 0);
            if (i != 0) {
                a2.mo59980a("error_code", i);
                a2.mo59982a("newtork_condition", m74661a(getContext()));
            }
            if (!this.f87248w.isEmpty()) {
                a2.mo59983a("enter_method", this.f87248w);
            } else if (!this.f87245t.f85744o.isEmpty()) {
                a2.mo59983a("enter_method", this.f87245t.f85744o);
            } else {
                a2.mo59983a("enter_method", "send_button");
            }
            this.f87248w = "";
            C39162r.m79460a("send_gift", a2.f79943a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1870c.m6046a(getActivity(), R.layout.ie, viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13628n.m24504a(getActivity()), -2);
            layoutParams.addRule(12);
            a.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C13628n.m24504a(getActivity()), -2);
            layoutParams2.gravity = 80;
            a.setLayoutParams(layoutParams2);
        } else {
            a.setLayoutParams(new ViewGroup.LayoutParams(C13628n.m24504a(getActivity()), -2));
        }
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f87230a = (ViewGroup) a.findViewById(R.id.ark);
        this.f87231b = (TuxTextView) a.findViewById(R.id.a95);
        this.f87232c = a.findViewById(R.id.c3x);
        this.f87233d = (MentionEditText) a.findViewById(R.id.a9f);
        this.f87234e = (TuxIconView) a.findViewById(R.id.bsk);
        this.f87235j = (TuxIconView) a.findViewById(R.id.bvw);
        this.f87236k = (TuxIconView) a.findViewById(R.id.bv9);
        this.f87237l = (FadeImageView) a.findViewById(R.id.a_a);
        this.f87238m = (TuxTextView) a.findViewById(R.id.a__);
        this.f87239n = (ConstraintLayout) a.findViewById(R.id.a9e);
        this.f87250y = new C37004a(this.f87239n);
        this.f87249x = a.findViewById(R.id.eo);
        this.f87240o = a.findViewById(R.id.acf);
        this.f87241p = a.findViewById(R.id.edz);
        this.f87242q = (AppCompatCheckBox) a.findViewById(R.id.a2b);
        C49981p pVar = new C49981p(getActivity());
        this.f87243r = pVar;
        pVar.mo67838a(new C49979o());
        this.f87250y.mo64517a(false, 0);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64424a(int i, int i2, String str, String str2, boolean z) {
        AbstractC36952a aVar = this.f87244s;
        if (aVar != null) {
            aVar.mo64412a(i2);
        }
        if (TextUtils.equals(str2, "button_send")) {
            m74662a(57);
        } else {
            m74662a(11);
        }
        m74664a(false, true, false);
    }
}
