package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36224e;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36389e;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f;
import com.p2082ss.android.ugc.aweme.comment.p2495i.AbstractC36496e;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37130dc;
import com.p2082ss.android.ugc.aweme.comment.util.C37201k;
import com.p2082ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.feed.AbstractC48309ae;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.story.AbstractC76590b;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bj */
public final class C37048bj extends AbstractC18234b implements AbstractC36418d, AbstractC36419e {

    /* renamed from: t */
    protected static long f87274t;

    /* renamed from: A */
    private View f87275A;

    /* renamed from: B */
    private Widget f87276B;

    /* renamed from: C */
    private ViewGroup f87277C;

    /* renamed from: D */
    private AbstractC49691s<C49672ag> f87278D;

    /* renamed from: E */
    private boolean f87279E = false;

    /* renamed from: F */
    private long f87280F;

    /* renamed from: G */
    private long f87281G;

    /* renamed from: H */
    private boolean f87282H = false;

    /* renamed from: a */
    ViewPager f87283a;

    /* renamed from: b */
    public List<Fragment> f87284b;

    /* renamed from: c */
    public List<Integer> f87285c;

    /* renamed from: d */
    protected AbstractC48309ae f87286d;

    /* renamed from: e */
    protected DataCenter f87287e;

    /* renamed from: j */
    protected C36224e f87288j;

    /* renamed from: k */
    protected C33947e f87289k;

    /* renamed from: l */
    protected C36500h f87290l = new C36500h("");

    /* renamed from: m */
    protected Aweme f87291m;

    /* renamed from: n */
    public boolean f87292n = false;

    /* renamed from: o */
    public boolean f87293o = false;

    /* renamed from: p */
    public boolean f87294p = false;

    /* renamed from: q */
    public int f87295q = -1;

    /* renamed from: r */
    public long f87296r;

    /* renamed from: s */
    public String f87297s = "";

    /* renamed from: u */
    private CommentNestedLayout f87298u;

    /* renamed from: v */
    private ImageView f87299v;

    /* renamed from: w */
    private ImageView f87300w;

    /* renamed from: x */
    private TuxTextView f87301x;

    /* renamed from: y */
    private ViewGroup f87302y;

    /* renamed from: z */
    private DmtTabLayout f87303z;

    static {
        Covode.recordClassIndex(44402);
    }

    /* renamed from: a */
    public final void mo64554a(String str, int i) {
        if (m74717k() || m74714h()) {
            C39162r.m79460a("enter_author_reaction_panel", new C33744d().mo59983a("enter_method", m74705a(str)).mo59983a("enter_from", this.f87290l.getEventType()).mo59983a("tab_name", m74704a(i)).mo59983a("group_id", this.f87290l.getAid()).mo59983a("story_type", C76706a.m134278d(this.f87291m) ? "story" : UGCMonitor.TYPE_POST).mo59983a("story_collection_id", C76706a.m134276b(this.f87291m)).mo59981a("vv_cnt", this.f87291m.getStatistics().getPlayCount()).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo64555a(String str, String str2, int i, long j) {
        if (m74717k() || m74714h()) {
            C39162r.m79460a("close_author_reaction_panel", new C33744d().mo59983a("enter_method", m74705a(str)).mo59983a("enter_from", this.f87290l.getEventType()).mo59983a("tab_name", m74704a(i)).mo59983a("group_id", this.f87290l.getAid()).mo59981a("duration", j).mo59983a("exit_method", str2).mo59983a("story_type", C76706a.m134278d(this.f87291m) ? "story" : UGCMonitor.TYPE_POST).mo59983a("story_collection_id", C76706a.m134276b(this.f87291m)).mo59981a("vv_cnt", this.f87291m.getStatistics().getPlayCount()).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e
    /* renamed from: a */
    public final void mo63710a(AbstractC36420f fVar) {
        DmtTabLayout dmtTabLayout;
        int indexOf = this.f87284b.indexOf(fVar);
        if (indexOf >= 0 && (dmtTabLayout = this.f87303z) != null) {
            dmtTabLayout.mo27529b(indexOf).mo27591a(fVar.mo63724d());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e, com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final boolean mo63708a() {
        CommentNestedLayout commentNestedLayout;
        return isVisible() && (commentNestedLayout = this.f87298u) != null && commentNestedLayout.mo64851a();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63706a(AbstractC49691s<C49672ag> sVar) {
        this.f87278D = sVar;
        List<Fragment> list = this.f87284b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f87284b) {
                if (fragment instanceof AbstractC36418d) {
                    ((AbstractC36418d) fragment).mo63706a(sVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63705a(Comment comment, boolean z) {
        List<Fragment> list = this.f87284b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f87284b) {
                if (fragment instanceof AbstractC36418d) {
                    ((AbstractC36418d) fragment).mo63705a(comment, z);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63704a(Comment comment) {
        List<Fragment> list = this.f87284b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f87284b) {
                if (fragment instanceof AbstractC36418d) {
                    ((AbstractC36418d) fragment).mo63704a(comment);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63707a(Exception exc, int i, Comment comment) {
        List<Fragment> list = this.f87284b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f87284b) {
                if (fragment instanceof AbstractC36418d) {
                    ((AbstractC36418d) fragment).mo63707a(exc, i, comment);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e
    /* renamed from: b */
    public final void mo63713b() {
        CommentNestedLayout commentNestedLayout = this.f87298u;
        if (commentNestedLayout != null) {
            commentNestedLayout.mo64852b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e
    /* renamed from: d */
    public final boolean mo63716d() {
        CommentNestedLayout commentNestedLayout = this.f87298u;
        if (commentNestedLayout == null || commentNestedLayout.f87909c == null || !commentNestedLayout.f87912f) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C33947e eVar = this.f87289k;
        if (eVar != null) {
            eVar.mo60222b(this.f87276B);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f87280F = System.currentTimeMillis();
    }

    /* renamed from: g */
    private void m74713g() {
        this.f87287e.mo60191a("comment_aweme_and_params", new C89378p(this.f87291m, this.f87290l));
    }

    /* renamed from: h */
    private boolean m74714h() {
        Aweme aweme;
        if (!C46920f.m90221a() || (aweme = this.f87291m) == null || C76706a.m134278d(aweme) || !C80580in.m139681a(this.f87291m.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m74717k() {
        Aweme aweme = this.f87291m;
        if (aweme == null || !C80580in.m139681a(aweme.getAuthorUid()) || !C76706a.m134278d(this.f87291m)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m74718l() {
        if (m74714h()) {
            if (m74724r()) {
                m74721o();
            }
        } else if (m74710b(1)) {
            m74721o();
        }
    }

    /* renamed from: m */
    private void m74719m() {
        if (m74715i()) {
            if (m74723q()) {
                m74721o();
            }
        } else if (m74710b(2)) {
            m74721o();
        }
    }

    /* renamed from: n */
    private void m74720n() {
        if (m74716j()) {
            if (m74722p()) {
                m74721o();
            }
        } else if (m74710b(3)) {
            m74721o();
        }
    }

    /* renamed from: e */
    public final long mo64556e() {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f87296r;
        long j2 = this.f87281G;
        if (currentTimeMillis > j2) {
            j = currentTimeMillis - j2;
        } else {
            j = 0;
        }
        this.f87296r = 0;
        this.f87280F = 0;
        this.f87281G = 0;
        return j;
    }

    /* renamed from: i */
    private boolean m74715i() {
        if (!((Boolean) C76660b.f172057b.getValue()).booleanValue() || !C76706a.m134278d(this.f87291m) || "story_archive".equals(this.f87290l.getEnterFrom()) || !C80580in.m139681a(this.f87291m.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m74716j() {
        if (!((Boolean) C76660b.f172056a.getValue()).booleanValue() || !C76706a.m134278d(this.f87291m) || "story_archive".equals(this.f87290l.getEnterFrom()) || !C80580in.m139681a(this.f87291m.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m74724r() {
        if (this.f87285c.contains(1)) {
            return false;
        }
        this.f87284b.add(C37130dc.C37131a.m74895a(requireActivity(), this.f87290l, this.f87291m, this));
        this.f87285c.add(1);
        C36224e eVar = this.f87288j;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e
    /* renamed from: c */
    public final void mo63715c() {
        if (this.f87298u != null) {
            AbstractC48309ae onShowHeightChangeListener = this.f87290l.getOnShowHeightChangeListener();
            this.f87286d = onShowHeightChangeListener;
            this.f87298u.setOnShowHeightChangeListener(onShowHeightChangeListener);
            this.f87298u.mo64850a(true, true);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f87279E) {
            this.f87279E = false;
        } else if (mo63708a() && this.f87280F != 0) {
            this.f87281G += System.currentTimeMillis() - this.f87280F;
            this.f87280F = 0;
        }
    }

    /* renamed from: o */
    private void m74721o() {
        Iterator<Fragment> it = this.f87284b.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next instanceof AbstractC36420f) {
                AbstractC36420f fVar = (AbstractC36420f) next;
                if (this.f87284b.size() == 1) {
                    z = true;
                }
                fVar.mo63723c(z);
            }
        }
        if (this.f87284b.size() > 1) {
            this.f87303z.setVisibility(0);
            this.f87303z.setSelectedTabIndicatorHeight(C34728n.m70946a(2.0d));
            this.f87275A.setVisibility(0);
            return;
        }
        this.f87303z.setVisibility(8);
        this.f87275A.setVisibility(8);
    }

    /* renamed from: p */
    private boolean m74722p() {
        if (this.f87285c.contains(3)) {
            return false;
        }
        AbstractC76590b b = C77260g.f173332a.mo120151b(this.f87291m.getAid(), this.f87290l.getInsertVid());
        b.mo120282b(this.f87291m);
        ((AbstractC36420f) b.mo120281a()).mo63718a(this.f87290l);
        ((AbstractC36420f) b.mo120281a()).mo63717a(this);
        this.f87284b.add(0, b.mo120281a());
        this.f87285c.add(0, 3);
        C36224e eVar = this.f87288j;
        if (eVar == null) {
            return true;
        }
        eVar.notifyDataSetChanged();
        return true;
    }

    /* renamed from: q */
    private boolean m74723q() {
        if (this.f87285c.contains(2)) {
            return false;
        }
        AbstractC76590b b = C77260g.f173332a.mo120150b(this.f87291m.getAid());
        b.mo120282b(this.f87291m);
        ((AbstractC36420f) b.mo120281a()).mo63718a(this.f87290l);
        ((AbstractC36420f) b.mo120281a()).mo63717a(this);
        this.f87284b.add(0, b.mo120281a());
        this.f87285c.add(0, 2);
        C36224e eVar = this.f87288j;
        if (eVar == null) {
            return true;
        }
        eVar.notifyDataSetChanged();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e
    /* renamed from: a */
    public final void mo63711a(boolean z) {
        CommentNestedLayout commentNestedLayout = this.f87298u;
        if (commentNestedLayout != null) {
            commentNestedLayout.mo64849a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e
    /* renamed from: b */
    public final void mo63714b(boolean z) {
        int i;
        ImageView imageView = this.f87299v;
        if (imageView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static C37048bj m74703a(Context context) {
        ActivityC0945e b = m74708b(context);
        if (b == null) {
            return null;
        }
        Fragment a = b.getSupportFragmentManager().mo3551a("comment_page");
        if (a instanceof C37048bj) {
            return (C37048bj) a;
        }
        return null;
    }

    /* renamed from: b */
    private static ActivityC0945e m74708b(Context context) {
        while (context != null) {
            if (context instanceof ActivityC0945e) {
                return (ActivityC0945e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: c */
    private static C37048bj m74711c(C36500h hVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("id", hVar);
        C37048bj bjVar = new C37048bj();
        bjVar.setArguments(bundle);
        return bjVar;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f87290l = (C36500h) arguments.getSerializable("id");
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C36179e.m73732a("CommentListPageFragment onSaveInstanceState");
        bundle.putBoolean("should_remove", true);
        bundle.putSerializable("page_param", this.f87290l);
    }

    /* renamed from: a */
    private String m74704a(int i) {
        List<Integer> list = this.f87285c;
        if (list != null && list.size() == 1) {
            i = 0;
        } else if (C13603b.m24435a((Collection) this.f87285c) || i < 0 || i >= this.f87285c.size()) {
            return "";
        }
        return AbstractC36496e.m74292a(this.f87285c.get(i).intValue());
    }

    /* renamed from: b */
    private boolean m74710b(int i) {
        if (!C13603b.m24435a((Collection) this.f87285c) && this.f87288j != null) {
            for (int i2 = 0; i2 < this.f87285c.size(); i2++) {
                if (this.f87285c.get(i2).intValue() == i) {
                    this.f87285c.remove(i2);
                    this.f87284b.remove(i2);
                    this.f87288j.notifyDataSetChanged();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private String m74705a(String str) {
        if (!TextUtils.isEmpty(str) || !TextUtils.equals(this.f87290l.getEventType(), "notification_page")) {
            return str;
        }
        return "click_notification";
    }

    /* renamed from: c */
    private void m74712c(boolean z) {
        if (z) {
            if (this.f87296r == 0) {
                this.f87296r = System.currentTimeMillis();
            }
            this.f87294p = true;
            if (!this.f87293o) {
                mo64554a(this.f87290l.getEnterMethod(), this.f87295q);
                this.f87293o = true;
            }
        } else if (this.f87296r != 0) {
            this.f87294p = false;
            mo64555a(this.f87290l.getEnterMethod(), "close", this.f87295q, mo64556e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            boolean z = bundle.getBoolean("should_remove", false);
            this.f87279E = z;
            if (z) {
                mo63711a(false);
                getFragmentManager().mo3552a().mo3455a(this).mo3473c();
                return;
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof C36500h) {
                this.f87290l = (C36500h) serializable;
                this.f87291m = AwemeService.m70060b().mo60684b(this.f87290l.getAid());
            }
        }
    }

    /* renamed from: b */
    private void m74709b(C36500h hVar) {
        boolean z;
        if (TextUtils.equals(hVar.getAid(), this.f87290l.getAid()) && hVar.isCommentClose() == this.f87290l.isCommentClose() && hVar.isCommentLimited() == this.f87290l.isCommentLimited() && hVar.isEnableComment() == this.f87290l.isEnableComment()) {
            z = false;
        } else {
            z = true;
        }
        C51423a.m95784a(3, "CommentLog", "CommentListPageFragment: resetPageParam() => differentAweme = ".concat(String.valueOf(z)));
        if (!z) {
            C51423a.m95791b(3, "CommentLog", "CommentListPageFragment: resetPageParam() => differentAweme = false, new aid = " + hVar.getAid());
            if (!TextUtils.equals(hVar.getEnterMethod(), this.f87290l.getEnterMethod())) {
                this.f87290l.setEnterMethod(hVar.getEnterMethod());
            }
            m74706a(hVar);
            for (int i = 0; i < this.f87285c.size(); i++) {
                if (this.f87284b.get(i) instanceof AbstractC36418d) {
                    ((AbstractC36420f) this.f87284b.get(i)).mo63718a(hVar);
                }
            }
            return;
        }
        this.f87290l = hVar;
        if (getContext() != null) {
            this.f87277C.setVisibility(8);
        }
        m74718l();
        m74719m();
        m74720n();
        if (this.f87290l.getLocatePageType() < 0) {
            this.f87290l.setLocatePageType(0);
        }
        m74706a(this.f87290l);
        if (!C13603b.m24435a((Collection) this.f87284b)) {
            for (Fragment fragment : this.f87284b) {
                if (fragment instanceof AbstractC36420f) {
                    ((AbstractC36420f) fragment).mo63718a(hVar);
                }
            }
        }
        m74713g();
    }

    /* renamed from: a */
    private void m74706a(C36500h hVar) {
        if (hVar != null && hVar.getLocatePageType() >= 0) {
            if (!C13603b.m24435a((Collection) this.f87285c)) {
                int locatePageType = hVar.getLocatePageType();
                for (int i = 0; i < this.f87285c.size(); i++) {
                    if (this.f87285c.get(i).intValue() == locatePageType) {
                        if (this.f87283a != null && this.f87288j.getCount() > i) {
                            this.f87293o = false;
                            this.f87282H = true;
                            this.f87283a.setCurrentItem(i, false);
                            ((AbstractC36420f) this.f87284b.get(i)).mo63720a(true);
                            this.f87295q = i;
                            this.f87282H = false;
                            return;
                        } else {
                            return;
                        }
                    }
                }
            } else if (this.f87283a != null && this.f87288j.getCount() > 0) {
                this.f87283a.setCurrentItem(0, false);
                ((AbstractC36420f) this.f87284b.get(0)).mo63720a(true);
            }
        }
    }

    /* renamed from: a */
    private void m74707a(Aweme aweme) {
        if (this.f87291m != aweme) {
            this.f87291m = aweme;
            if (!C13603b.m24435a((Collection) this.f87284b)) {
                for (Fragment fragment : this.f87284b) {
                    if (fragment instanceof AbstractC36420f) {
                        ((AbstractC36420f) fragment).mo63719a(aweme);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo64553a(Boolean bool) {
        if (bool.booleanValue()) {
            if (getActivity() != null) {
                AbstractC81915c.m141874a(new C36389e(1, getActivity().hashCode()));
            }
            List<Fragment> list = this.f87284b;
            if (list == null || list.isEmpty()) {
                return null;
            }
            for (Fragment fragment : this.f87284b) {
                if (fragment instanceof AbstractC36420f) {
                    getActivity();
                    ((AbstractC36420f) fragment).mo63725h();
                }
            }
            m74712c(true);
            return null;
        }
        if (getActivity() != null) {
            AbstractC81915c.m141874a(new C36389e(0, getActivity().hashCode()));
        }
        List<Fragment> list2 = this.f87284b;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        for (Fragment fragment2 : this.f87284b) {
            if (fragment2 instanceof AbstractC36420f) {
                getActivity();
                ((AbstractC36420f) fragment2).mo63726i();
            }
        }
        m74712c(false);
        return null;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f87287e = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        C33947e a = C33947e.m69516a(this, view);
        this.f87289k = a;
        a.mo60218a(this.f87287e);
        Widget b = AdCommentDependImpl.m75903b().mo59069b(new C37050bk(this));
        this.f87276B = b;
        this.f87289k.mo60216a(R.id.acl, b);
        m74713g();
        this.f87284b = new LinkedList();
        this.f87285c = new LinkedList();
        m74719m();
        m74720n();
        boolean z = true;
        if (!C76660b.m134250j() || !C76706a.m134278d(this.f87291m) || !C80580in.m139681a(this.f87291m.getAuthorUid())) {
            if (this.f87284b.size() != 0 || m74714h()) {
                z = false;
            }
            C36500h hVar = this.f87290l;
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("id", hVar);
            bundle2.putBoolean("key_show_title", z);
            C37157k kVar = new C37157k();
            kVar.setArguments(bundle2);
            kVar.mo64706b(this.f87291m);
            C36500h hVar2 = this.f87290l;
            if (hVar2 != null) {
                kVar.f87622b = hVar2;
            }
            kVar.f87628l = this.f87300w;
            kVar.f87629m = this.f87301x;
            kVar.mo63717a(this);
            kVar.mo63706a(this.f87278D);
            this.f87284b.add(kVar);
            this.f87285c.add(0);
        }
        m74718l();
        m74721o();
        C36224e eVar = new C36224e(getChildFragmentManager(), this.f87284b, this.f87285c);
        this.f87288j = eVar;
        this.f87283a.setAdapter(eVar);
        this.f87303z.setupWithViewPager(this.f87283a);
        this.f87303z.mo27521a(new DmtTabLayout.AbstractC17289c() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37048bj.C370491 */

            static {
                Covode.recordClassIndex(44403);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: b */
            public final void mo27575b(DmtTabLayout.C17294f fVar) {
                String str;
                String str2;
                new StringBuilder("onTabUnselected tab = ").append((Object) fVar.f41522c).append(", current tab type is ").append(C37048bj.this.f87285c.get(fVar.f41524e));
                C37048bj bjVar = C37048bj.this;
                int intValue = bjVar.f87285c.get(fVar.f41524e).intValue();
                if (intValue == 2) {
                    str = "like_list";
                } else if (intValue != 3) {
                    str = "";
                } else {
                    str = "view_list";
                }
                bjVar.f87297s = str;
                if (C37048bj.this.f87296r != 0) {
                    C37048bj bjVar2 = C37048bj.this;
                    if (bjVar2.f87292n) {
                        str2 = "click_label";
                    } else {
                        str2 = "slide";
                    }
                    bjVar2.mo64555a(str2, "change_tab", fVar.f41524e, C37048bj.this.mo64556e());
                }
                ((AbstractC36420f) C37048bj.this.f87284b.get(fVar.f41524e)).mo63720a(false);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: a */
            public final void mo27574a(DmtTabLayout.C17294f fVar) {
                String enterMethod;
                String enterFrom = C37048bj.this.f87290l.getEnterFrom();
                new StringBuilder("onTabSelected tab = ").append((Object) fVar.f41522c).append(" enterFrom is = ").append(enterFrom).append(", enterMethod = ").append(C37048bj.this.f87290l.getEnterMethod());
                C37048bj.this.f87296r = System.currentTimeMillis();
                C37048bj bjVar = C37048bj.this;
                if (!bjVar.f87294p) {
                    enterMethod = C37048bj.this.f87290l.getEnterMethod();
                } else if (C37048bj.this.f87292n) {
                    enterMethod = "click_label";
                } else {
                    enterMethod = "slide";
                }
                bjVar.mo64554a(enterMethod, fVar.f41524e);
                C37048bj.this.f87295q = fVar.f41524e;
                if (C37048bj.this.f87284b.get(fVar.f41524e) instanceof C37157k) {
                    ((C37157k) C37048bj.this.f87284b.get(fVar.f41524e)).f87622b.setTempEnterMethod(C37048bj.this.f87297s);
                }
                ((AbstractC36420f) C37048bj.this.f87284b.get(fVar.f41524e)).mo63720a(true);
                C37048bj.this.f87292n = false;
                C37048bj.this.f87293o = true;
            }
        });
        this.f87303z.setOnTabClickListener(new C37055bp(this));
        m74706a(this.f87290l);
        mo63715c();
    }

    /* renamed from: a */
    public static C37048bj m74702a(Activity activity, Aweme aweme, C36500h hVar) {
        if (!(activity == null || aweme == null || activity.isFinishing())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - f87274t <= 300) {
                C51423a.m95784a(6, "CommentLog", "CommentListPageFragment: showCommentList(): cancel because open again too fast");
                return null;
            }
            f87274t = elapsedRealtime;
            C51423a.m95791b(4, "CommentLog", "CommentListPageFragment: showCommentList() aid = " + aweme.getAid());
            try {
                boolean c = MSAdaptionService.m97895c().mo89377c(activity);
                Fragment a = MSAdaptionService.m97895c().mo89366a();
                if (!c || a == null) {
                    AbstractC0952i supportFragmentManager = ((ActivityC0945e) activity).getSupportFragmentManager();
                    C37048bj bjVar = (C37048bj) supportFragmentManager.mo3551a("comment_page");
                    if (bjVar == null) {
                        C37201k.m75182a(true, hVar.getEventType(), C37201k.m75178a(aweme, hVar));
                        C37048bj c2 = m74711c(hVar);
                        c2.m74707a(aweme);
                        supportFragmentManager.mo3552a().mo3454a(R.id.bba, c2, "comment_page").mo3473c();
                        return c2;
                    }
                    C37201k.m75182a(false, hVar.getEventType(), C37201k.m75178a(aweme, hVar));
                    bjVar.m74707a(aweme);
                    bjVar.m74709b(hVar);
                    bjVar.mo63715c();
                    return bjVar;
                }
                AbstractC0952i fragmentManager = a.getFragmentManager();
                C37048bj bjVar2 = (C37048bj) fragmentManager.mo3551a("comment_page");
                if (bjVar2 != null) {
                    fragmentManager.mo3552a().mo3455a(bjVar2).mo3473c();
                }
                C37201k.m75182a(true, hVar.getEventType(), C37201k.m75178a(aweme, hVar));
                C37048bj c3 = m74711c(hVar);
                c3.m74707a(aweme);
                fragmentManager.mo3552a().mo3454a(R.id.b41, c3, "comment_page").mo3473c();
                return c3;
            } catch (Exception e) {
                C36179e.m73732a("CommentListFragment.showCommentList() error in try/catch. ErrorMessage: " + e.getMessage());
                C51423a.m95786a(e);
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.i_, viewGroup, false);
        this.f87298u = (CommentNestedLayout) a.findViewById(R.id.dnh);
        this.f87283a = (ViewPager) a.findViewById(R.id.dmd);
        this.f87302y = (ViewGroup) a.findViewById(R.id.b3y);
        this.f87275A = a.findViewById(R.id.fht);
        this.f87299v = (ImageView) a.findViewById(R.id.pi);
        this.f87300w = (ImageView) a.findViewById(R.id.r2);
        this.f87301x = (TuxTextView) a.findViewById(R.id.r6);
        DmtTabLayout dmtTabLayout = (DmtTabLayout) a.findViewById(R.id.ee7);
        this.f87303z = dmtTabLayout;
        dmtTabLayout.setTabMargin(12);
        this.f87277C = (ViewGroup) a.findViewById(R.id.acl);
        this.f87283a.setOffscreenPageLimit(3);
        this.f87298u.setCommentContainer(this.f87283a);
        this.f87298u.setScrollableContainer(new C37051bl(this));
        this.f87298u.setVisibleChangedListener(new C37052bm(this));
        this.f87298u.setPreScrollChangeListener(new C37053bn(this));
        this.f87299v.setOnClickListener(new View$OnClickListenerC37054bo(this));
        return a;
    }
}
