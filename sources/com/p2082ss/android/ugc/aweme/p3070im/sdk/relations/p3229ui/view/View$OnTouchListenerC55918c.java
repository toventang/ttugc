package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.C54346b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55212h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c */
public class View$OnTouchListenerC55918c implements View.OnTouchListener {

    /* renamed from: u */
    public static final C55919a f127530u = new C55919a((byte) 0);

    /* renamed from: a */
    private TextWatcher f127531a;

    /* renamed from: b */
    private View.OnClickListener f127532b;

    /* renamed from: c */
    private AbstractC55867a.AbstractC55870a f127533c;

    /* renamed from: g */
    public SharePackage f127534g;

    /* renamed from: h */
    public BaseContent f127535h;

    /* renamed from: i */
    public boolean f127536i;

    /* renamed from: j */
    protected EditText f127537j;

    /* renamed from: k */
    protected ImageView f127538k;

    /* renamed from: l */
    protected TuxStatusView f127539l;

    /* renamed from: m */
    protected RecyclerView f127540m;

    /* renamed from: n */
    protected ImTextTitleBar f127541n;

    /* renamed from: o */
    public AbstractC55867a f127542o;

    /* renamed from: p */
    public String f127543p;

    /* renamed from: q */
    public String f127544q = "";

    /* renamed from: r */
    public AbstractC55920b f127545r;

    /* renamed from: s */
    public final Activity f127546s;

    /* renamed from: t */
    public final View f127547t;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$b */
    public interface AbstractC55920b {
        static {
            Covode.recordClassIndex(65712);
        }

        /* renamed from: a */
        void mo92758a();

        /* renamed from: a */
        void mo92759a(String str);
    }

    static {
        Covode.recordClassIndex(65710);
    }

    /* renamed from: a */
    public void mo92782a(List<Integer> list, List<String> list2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$a */
    public static final class C55919a {
        static {
            Covode.recordClassIndex(65711);
        }

        private C55919a() {
        }

        public /* synthetic */ C55919a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public void mo92781a(List<? extends IMContact> list, CharSequence charSequence) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(charSequence, "");
        if (C55196f.m100911a(this.f127546s)) {
            this.f127536i = true;
            AbstractC55867a aVar = this.f127542o;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo92719a((List<IMContact>) list, charSequence);
            mo92784c();
        }
    }

    /* renamed from: a */
    public final boolean mo92792a(IMContact iMContact) {
        if (iMContact instanceof IMConversation) {
            return true;
        }
        IMUser a = C55083f.m100745a(iMContact);
        if (a == null) {
            return false;
        }
        if (!TextUtils.equals(a.getUid(), C55197c.m100919b()) && a.getFollowStatus() != 2) {
            SharePackage sharePackage = this.f127534g;
            if (sharePackage == null) {
                C89219l.m154715b();
            }
            int i = sharePackage.f155492i.getInt("aweme_type");
            SharePackage sharePackage2 = this.f127534g;
            if (sharePackage2 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.equals(sharePackage2.f155487d, "pic")) {
                RecyclerView recyclerView = this.f127540m;
                if (recyclerView == null) {
                    C89219l.m154710a("mRecyclerView");
                }
                new C23144b(recyclerView).mo37640e(R.string.cfr).mo37637b();
                return false;
            }
            SharePackage sharePackage3 = this.f127534g;
            if (sharePackage3 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.equals(sharePackage3.f155487d, "gif") && (i == 501 || i == 502)) {
                RecyclerView recyclerView2 = this.f127540m;
                if (recyclerView2 == null) {
                    C89219l.m154710a("mRecyclerView");
                }
                new C23144b(recyclerView2).mo37640e(R.string.cdp).mo37637b();
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$j */
    public static final class C55933j implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127564a;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$j$b */
        static final class C55935b implements C55949a.AbstractC55950a {

            /* renamed from: a */
            public static final C55935b f127566a = new C55935b();

            static {
                Covode.recordClassIndex(65727);
            }

            C55935b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a.AbstractC55950a
            /* renamed from: a */
            public final void mo92808a(String str) {
            }
        }

        static {
            Covode.recordClassIndex(65725);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            this.f127564a.mo92801k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55933j(View$OnTouchListenerC55918c cVar) {
            this.f127564a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int i) {
            IMContact[] iMContactArr;
            if (this.f127564a.f127542o != null) {
                AbstractC55867a aVar = this.f127564a.f127542o;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                if (aVar.f127346f.size() > 0) {
                    Activity activity = this.f127564a.f127546s;
                    SharePackage sharePackage = this.f127564a.f127534g;
                    AbstractC55867a aVar2 = this.f127564a.f127542o;
                    if (aVar2 != null) {
                        iMContactArr = aVar2.mo92721a();
                    } else {
                        iMContactArr = null;
                    }
                    C55949a.m101796a(activity, sharePackage, iMContactArr, this.f127564a.f127543p, new C55934a(this), C55935b.f127566a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$j$a */
        static final class C55934a implements C55949a.AbstractC55950a {

            /* renamed from: a */
            final /* synthetic */ C55933j f127565a;

            static {
                Covode.recordClassIndex(65726);
            }

            C55934a(C55933j jVar) {
                this.f127565a = jVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x007a, code lost:
                if (r2 != null) goto L_0x0039;
             */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a.AbstractC55950a
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo92808a(java.lang.String r7) {
                /*
                // Method dump skipped, instructions count: 132
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c.C55933j.C55934a.mo92808a(java.lang.String):void");
            }
        }
    }

    /* renamed from: g */
    public final void mo92797g() {
        AbstractC55867a aVar = this.f127542o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$c */
    public static final class RunnableC55921c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127548a;

        static {
            Covode.recordClassIndex(65713);
        }

        RunnableC55921c(View$OnTouchListenerC55918c cVar) {
            this.f127548a = cVar;
        }

        public final void run() {
            AbstractC55920b bVar = this.f127548a.f127545r;
            if (bVar != null) {
                bVar.mo92758a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final EditText mo92794d() {
        EditText editText = this.f127537j;
        if (editText == null) {
            C89219l.m154710a("mSearchEt");
        }
        return editText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final ImageView mo92795e() {
        ImageView imageView = this.f127538k;
        if (imageView == null) {
            C89219l.m154710a("mBtnClear");
        }
        return imageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final RecyclerView mo92796f() {
        RecyclerView recyclerView = this.f127540m;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: l */
    public final void mo92802l() {
        ImageView imageView = this.f127538k;
        if (imageView == null) {
            C89219l.m154710a("mBtnClear");
        }
        imageView.performClick();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$d */
    public static final class C55922d implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127549a;

        static {
            Covode.recordClassIndex(65714);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            C39115e.m79412a(this.f127549a.f127546s, this.f127549a.mo92794d());
            this.f127549a.f127546s.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55922d(View$OnTouchListenerC55918c cVar) {
            this.f127549a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$k */
    public static final class C55936k implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127567a;

        static {
            Covode.recordClassIndex(65728);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            C39115e.m79412a(this.f127567a.f127546s, this.f127567a.mo92794d());
            this.f127567a.f127546s.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55936k(View$OnTouchListenerC55918c cVar) {
            this.f127567a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int i) {
            C0484a aVar = new C0484a();
            aVar.put("enter_from", "contact_list");
            aVar.put("enter_method", "click_multi_choose_button");
            C39162r.m79460a("enter_multi_choose_contact", aVar);
            this.f127567a.mo92800j();
        }
    }

    /* renamed from: m */
    public final void mo92803m() {
        TextWatcher textWatcher = this.f127531a;
        if (textWatcher != null) {
            EditText editText = this.f127537j;
            if (editText == null) {
                C89219l.m154710a("mSearchEt");
            }
            editText.removeTextChangedListener(textWatcher);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo92783b() {
        boolean z;
        IImplService d = C55076b.m100725d();
        if (this.f127534g != null) {
            z = true;
        } else {
            z = false;
        }
        AbstractC55867a relationListAdapter = d.getRelationListAdapter(z);
        this.f127542o = relationListAdapter;
        if (relationListAdapter != null) {
            relationListAdapter.f127350j = new RunnableC55921c(this);
        }
        AbstractC55867a aVar = this.f127542o;
        if (aVar != null) {
            aVar.f127351k = this.f127533c;
        }
        AbstractC55867a aVar2 = this.f127542o;
        if (aVar2 != null) {
            aVar2.f127342b = C55212h.m100953a(this.f127534g);
        }
        RecyclerView recyclerView = this.f127540m;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setAdapter(this.f127542o);
    }

    /* renamed from: i */
    public final void mo92799i() {
        if (this.f127541n != null) {
            if (this.f127534g != null) {
                mo92783b();
            }
            if (this.f127534g == null) {
                ImTextTitleBar imTextTitleBar = this.f127541n;
                if (imTextTitleBar == null) {
                    C89219l.m154710a("titleBar");
                }
                imTextTitleBar.setTitle(R.string.ch2);
                ImTextTitleBar imTextTitleBar2 = this.f127541n;
                if (imTextTitleBar2 == null) {
                    C89219l.m154710a("titleBar");
                }
                View rightView = imTextTitleBar2.getRightView();
                C89219l.m154716b(rightView, "");
                rightView.setVisibility(8);
                ImTextTitleBar imTextTitleBar3 = this.f127541n;
                if (imTextTitleBar3 == null) {
                    C89219l.m154710a("titleBar");
                }
                imTextTitleBar3.setLeftText(R.string.ccu);
                return;
            }
            ImTextTitleBar imTextTitleBar4 = this.f127541n;
            if (imTextTitleBar4 == null) {
                C89219l.m154710a("titleBar");
            }
            imTextTitleBar4.setTitle(R.string.ch3);
            ImTextTitleBar imTextTitleBar5 = this.f127541n;
            if (imTextTitleBar5 == null) {
                C89219l.m154710a("titleBar");
            }
            View rightView2 = imTextTitleBar5.getRightView();
            C89219l.m154716b(rightView2, "");
            rightView2.setVisibility(0);
            mo92801k();
        }
    }

    /* renamed from: a */
    public void mo92779a() {
        View findViewById = this.f127547t.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById, "");
        this.f127541n = (ImTextTitleBar) findViewById;
        View findViewById2 = this.f127547t.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById2, "");
        this.f127539l = (TuxStatusView) findViewById2;
        View findViewById3 = this.f127547t.findViewById(R.id.drm);
        C89219l.m154716b(findViewById3, "");
        EditText editText = (EditText) findViewById3;
        this.f127537j = editText;
        if (editText == null) {
            C89219l.m154710a("mSearchEt");
        }
        editText.setTag("relation_search_tag");
        EditText editText2 = this.f127537j;
        if (editText2 == null) {
            C89219l.m154710a("mSearchEt");
        }
        editText2.setHint(R.string.c_j);
        View findViewById4 = this.f127547t.findViewById(R.id.x7);
        C89219l.m154716b(findViewById4, "");
        this.f127538k = (ImageView) findViewById4;
        View findViewById5 = this.f127547t.findViewById(R.id.dgl);
        C89219l.m154716b(findViewById5, "");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f127540m = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.f127540m;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView2.mo4405a(new C55924f(this, this.f127546s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo92784c() {
        TuxStatusView tuxStatusView = this.f127539l;
        if (tuxStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView.setVisibility(8);
        AbstractC55867a aVar = this.f127542o;
        if (aVar == null || aVar.getItemCount() != 0) {
            TuxStatusView tuxStatusView2 = this.f127539l;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("mStatusView");
            }
            tuxStatusView2.setVisibility(8);
            return;
        }
        if (this.f127536i) {
            TuxStatusView.C23263c b = C79440a.m138170b(new TuxStatusView.C23263c());
            TuxStatusView tuxStatusView3 = this.f127539l;
            if (tuxStatusView3 == null) {
                C89219l.m154710a("mStatusView");
            }
            tuxStatusView3.setStatus(b);
        } else {
            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C55937l.f127568a));
            String string = this.f127546s.getString(R.string.cge);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a2 = a.mo37879a(string);
            String string2 = this.f127546s.getString(R.string.cgd);
            C89219l.m154716b(string2, "");
            TuxStatusView.C23263c a3 = a2.mo37878a((CharSequence) string2);
            TuxStatusView tuxStatusView4 = this.f127539l;
            if (tuxStatusView4 == null) {
                C89219l.m154710a("mStatusView");
            }
            tuxStatusView4.setStatus(a3);
        }
        TuxStatusView tuxStatusView5 = this.f127539l;
        if (tuxStatusView5 == null) {
            C89219l.m154710a("mStatusView");
        }
        tuxStatusView5.setVisibility(0);
    }

    /* renamed from: h */
    public final void mo92798h() {
        int i;
        AbstractC55867a aVar = this.f127542o;
        if (aVar != null) {
            i = aVar.f127346f.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            ImTextTitleBar imTextTitleBar = this.f127541n;
            if (imTextTitleBar == null) {
                C89219l.m154710a("titleBar");
            }
            StringBuilder append = new StringBuilder().append(this.f127546s.getString(R.string.cdu)).append("(");
            AbstractC55867a aVar2 = this.f127542o;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            imTextTitleBar.setRightText(append.append(aVar2.f127346f.size()).append(")").toString());
            ImTextTitleBar imTextTitleBar2 = this.f127541n;
            if (imTextTitleBar2 == null) {
                C89219l.m154710a("titleBar");
            }
            View rightView = imTextTitleBar2.getRightView();
            C89219l.m154716b(rightView, "");
            rightView.setEnabled(true);
            ImTextTitleBar imTextTitleBar3 = this.f127541n;
            if (imTextTitleBar3 == null) {
                C89219l.m154710a("titleBar");
            }
            TextView rightTexView = imTextTitleBar3.getRightTexView();
            C89219l.m154716b(rightTexView, "");
            TextPaint paint = rightTexView.getPaint();
            C89219l.m154716b(paint, "");
            paint.setFakeBoldText(true);
            ImTextTitleBar imTextTitleBar4 = this.f127541n;
            if (imTextTitleBar4 == null) {
                C89219l.m154710a("titleBar");
            }
            imTextTitleBar4.setRightTextColor(this.f127546s.getResources().getColor(R.color.bh));
            return;
        }
        ImTextTitleBar imTextTitleBar5 = this.f127541n;
        if (imTextTitleBar5 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar5.setRightText(R.string.cdu);
        ImTextTitleBar imTextTitleBar6 = this.f127541n;
        if (imTextTitleBar6 == null) {
            C89219l.m154710a("titleBar");
        }
        View rightView2 = imTextTitleBar6.getRightView();
        C89219l.m154716b(rightView2, "");
        rightView2.setEnabled(false);
        ImTextTitleBar imTextTitleBar7 = this.f127541n;
        if (imTextTitleBar7 == null) {
            C89219l.m154710a("titleBar");
        }
        TextView rightTexView2 = imTextTitleBar7.getRightTexView();
        C89219l.m154716b(rightTexView2, "");
        TextPaint paint2 = rightTexView2.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setFakeBoldText(false);
        ImTextTitleBar imTextTitleBar8 = this.f127541n;
        if (imTextTitleBar8 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar8.setRightTextColor(this.f127546s.getResources().getColor(R.color.ap));
    }

    /* renamed from: j */
    public final void mo92800j() {
        ImTextTitleBar imTextTitleBar = this.f127541n;
        if (imTextTitleBar == null) {
            C89219l.m154710a("titleBar");
        }
        TextView rightTexView = imTextTitleBar.getRightTexView();
        C89219l.m154716b(rightTexView, "");
        TextPaint paint = rightTexView.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFakeBoldText(false);
        ImTextTitleBar imTextTitleBar2 = this.f127541n;
        if (imTextTitleBar2 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar2.setLeftText(R.string.a8y);
        ImTextTitleBar imTextTitleBar3 = this.f127541n;
        if (imTextTitleBar3 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar3.setRightText(R.string.cdu);
        ImTextTitleBar imTextTitleBar4 = this.f127541n;
        if (imTextTitleBar4 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar4.setTitle(R.string.ch1);
        ImTextTitleBar imTextTitleBar5 = this.f127541n;
        if (imTextTitleBar5 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar5.setRightTextColor(this.f127546s.getResources().getColor(R.color.ap));
        ImTextTitleBar imTextTitleBar6 = this.f127541n;
        if (imTextTitleBar6 == null) {
            C89219l.m154710a("titleBar");
        }
        View rightView = imTextTitleBar6.getRightView();
        C89219l.m154716b(rightView, "");
        rightView.setEnabled(false);
        AbstractC55867a aVar = this.f127542o;
        if (aVar != null) {
            aVar.mo92720a(true);
        }
        ImTextTitleBar imTextTitleBar7 = this.f127541n;
        if (imTextTitleBar7 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar7.setOnTitlebarClickListener(new C55933j(this));
    }

    /* renamed from: k */
    public final void mo92801k() {
        ImTextTitleBar imTextTitleBar = this.f127541n;
        if (imTextTitleBar == null) {
            C89219l.m154710a("titleBar");
        }
        TextView rightTexView = imTextTitleBar.getRightTexView();
        C89219l.m154716b(rightTexView, "");
        TextPaint paint = rightTexView.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFakeBoldText(false);
        ImTextTitleBar imTextTitleBar2 = this.f127541n;
        if (imTextTitleBar2 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar2.setLeftText(R.string.ccu);
        ImTextTitleBar imTextTitleBar3 = this.f127541n;
        if (imTextTitleBar3 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar3.setTitle(R.string.ch3);
        ImTextTitleBar imTextTitleBar4 = this.f127541n;
        if (imTextTitleBar4 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar4.setRightText(R.string.ch0);
        ImTextTitleBar imTextTitleBar5 = this.f127541n;
        if (imTextTitleBar5 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar5.setRightTextColor(this.f127546s.getResources().getColor(R.color.bx));
        ImTextTitleBar imTextTitleBar6 = this.f127541n;
        if (imTextTitleBar6 == null) {
            C89219l.m154710a("titleBar");
        }
        View rightView = imTextTitleBar6.getRightView();
        C89219l.m154716b(rightView, "");
        rightView.setEnabled(true);
        AbstractC55867a aVar = this.f127542o;
        if (aVar != null) {
            aVar.mo92720a(false);
        }
        ImTextTitleBar imTextTitleBar7 = this.f127541n;
        if (imTextTitleBar7 == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar7.setOnTitlebarClickListener(new C55936k(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$i */
    public static final class C55932i implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127563a;

        static {
            Covode.recordClassIndex(65724);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55932i(View$OnTouchListenerC55918c cVar) {
            this.f127563a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
            String obj = editable.toString();
            AbstractC55920b bVar = this.f127563a.f127545r;
            if (bVar != null) {
                bVar.mo92759a(obj);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            if (!TextUtils.isEmpty(charSequence) && this.f127563a.mo92795e().getVisibility() == 8) {
                this.f127563a.mo92795e().setVisibility(0);
            } else if (TextUtils.isEmpty(charSequence) && this.f127563a.mo92795e().getVisibility() == 0) {
                this.f127563a.mo92795e().setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92785a(EditText editText) {
        C89219l.m154721d(editText, "");
        this.f127537j = editText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92786a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        this.f127538k = imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$l */
    public static final class C55937l extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C55937l f127568a = new C55937l();

        static {
            Covode.recordClassIndex(65729);
        }

        C55937l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_person;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$g */
    static final class View$OnClickListenerC55925g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127552a;

        static {
            Covode.recordClassIndex(65717);
        }

        View$OnClickListenerC55925g(View$OnTouchListenerC55918c cVar) {
            this.f127552a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            if (C55196f.m100911a(view.getContext()) && C89219l.m154714a(view, this.f127552a.mo92795e())) {
                this.f127552a.mo92794d().setText("");
                this.f127552a.mo92794d().clearFocus();
                C39115e.m79412a(this.f127552a.f127546s, this.f127552a.mo92794d());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92787a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f127540m = recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92788a(TuxStatusView tuxStatusView) {
        C89219l.m154721d(tuxStatusView, "");
        this.f127539l = tuxStatusView;
    }

    /* renamed from: b */
    public final void mo92793b(IMContact iMContact) {
        String str;
        if (this.f127535h == null) {
            str = "chat_list";
        } else {
            str = "chat_forward";
        }
        C55708a.m101453a(C55708a.f127082a, this.f127534g, iMContact, false, str, 0, null, null, 112);
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            Long valueOf = Long.valueOf(uid);
            C89219l.m154716b(valueOf, "");
            String a = AbstractC17427b.C17428a.m32309a(valueOf.longValue());
            C89219l.m154716b(uid, "");
            m101725a(a, uid);
        } else if (iMContact instanceof IMConversation) {
            String conversationId = ((IMConversation) iMContact).getConversationId();
            C89219l.m154716b(conversationId, "");
            m101725a(conversationId, "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92789a(ImTextTitleBar imTextTitleBar) {
        C89219l.m154721d(imTextTitleBar, "");
        this.f127541n = imTextTitleBar;
    }

    /* renamed from: a */
    public void mo92780a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        if (C55196f.m100911a(this.f127546s)) {
            this.f127536i = false;
            AbstractC55867a aVar = this.f127542o;
            if (aVar != null) {
                aVar.mo92718a((List<IMContact>) list);
            }
            mo92784c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$f */
    public static final class C55924f extends C51425a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127551a;

        static {
            Covode.recordClassIndex(65716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55924f(View$OnTouchListenerC55918c cVar, Context context) {
            super(context);
            this.f127551a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            C39115e.m79412a(this.f127551a.f127546s, this.f127551a.mo92794d());
        }
    }

    /* renamed from: a */
    private final void m101725a(String str, String str2) {
        BaseContent baseContent = this.f127535h;
        if (baseContent != null) {
            String a = C55231t.m100997a(baseContent.generateSharePackage().f155487d);
            if (!TextUtils.isEmpty(a)) {
                C55940a.m101787a(a, str, str2, C55197c.m100919b().toString());
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        EditText editText = this.f127537j;
        if (editText == null) {
            C89219l.m154710a("mSearchEt");
        }
        if (!C89219l.m154714a(view, editText) || motionEvent.getAction() != 1) {
            return false;
        }
        if (this.f127535h != null) {
            str = "forward";
        } else if (this.f127534g != null) {
            str = "share";
        } else {
            str = "contact";
        }
        C55059b.m100693b(str);
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$h */
    static final class C55926h implements AbstractC55867a.AbstractC55870a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127553a;

        static {
            Covode.recordClassIndex(65718);
        }

        C55926h(View$OnTouchListenerC55918c cVar) {
            this.f127553a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0107  */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.AbstractC55870a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo92728a(android.view.View r11, int r12) {
            /*
            // Method dump skipped, instructions count: 354
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c.C55926h.mo92728a(android.view.View, int):void");
        }
    }

    /* renamed from: a */
    public final void mo92790a(IMContact iMContact, boolean z) {
        String str;
        String str2;
        Bundle bundle;
        String string;
        Bundle bundle2;
        SharePackage sharePackage = this.f127534g;
        String str3 = null;
        if (sharePackage != null) {
            str = sharePackage.f155487d;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "game")) {
            new C23144b(this.f127546s).mo37640e(R.string.ch9).mo37637b();
            return;
        }
        SharePackage sharePackage2 = this.f127534g;
        if (sharePackage2 != null) {
            str3 = sharePackage2.f155487d;
        }
        SharePackage sharePackage3 = this.f127534g;
        String str4 = "";
        if (sharePackage3 == null || (bundle2 = sharePackage3.f155492i) == null || (str2 = bundle2.getString("enter_from")) == null) {
            str2 = str4;
        }
        SharePackage sharePackage4 = this.f127534g;
        if (!(sharePackage4 == null || (bundle = sharePackage4.f155492i) == null || (string = bundle.getString("enter_method")) == null)) {
            str4 = string;
        }
        AbstractC81915c.m141874a(new C56257j(iMContact, z, str3, str2, str4, this.f127544q));
    }

    /* renamed from: a */
    public final void mo92791a(String str, BaseContent baseContent) {
        C89219l.m154721d(baseContent, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.Companion.obtain(str));
        }
        AbstractC55867a aVar = this.f127542o;
        if (aVar != null) {
            IMContact[] a = aVar.mo92721a();
            boolean z = false;
            if (!(a == null || a.length == 0)) {
                for (String str2 : C55082e.m100741a(a)) {
                    C54346b.m99660a(str2, "");
                    C17438g.C17439a.m32347a().mo27820b(str2).mo27816a(arrayList).mo27818a();
                }
                IMContact iMContact = a[0];
                if (a.length > 1) {
                    z = true;
                }
                mo92790a(iMContact, z);
            }
        }
        if (C55196f.m100911a(this.f127546s)) {
            this.f127546s.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$e */
    static final class View$OnKeyListenerC55923e implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC55918c f127550a;

        static {
            Covode.recordClassIndex(65715);
        }

        View$OnKeyListenerC55923e(View$OnTouchListenerC55918c cVar) {
            this.f127550a = cVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            C39115e.m79412a(this.f127550a.f127546s, this.f127550a.mo92794d());
            return true;
        }
    }

    public View$OnTouchListenerC55918c(Activity activity, View view, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        this.f127546s = activity;
        this.f127547t = view;
        mo92779a();
        if (this.f127532b == null) {
            this.f127532b = new View$OnClickListenerC55925g(this);
        }
        if (this.f127531a == null) {
            this.f127531a = new C55932i(this);
        }
        if (this.f127533c == null) {
            this.f127533c = new C55926h(this);
        }
        ImTextTitleBar imTextTitleBar = this.f127541n;
        if (imTextTitleBar == null) {
            C89219l.m154710a("titleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new C55922d(this));
        ImageView imageView = this.f127538k;
        if (imageView == null) {
            C89219l.m154710a("mBtnClear");
        }
        imageView.setOnClickListener(this.f127532b);
        EditText editText = this.f127537j;
        if (editText == null) {
            C89219l.m154710a("mSearchEt");
        }
        editText.addTextChangedListener(this.f127531a);
        EditText editText2 = this.f127537j;
        if (editText2 == null) {
            C89219l.m154710a("mSearchEt");
        }
        editText2.setOnKeyListener(new View$OnKeyListenerC55923e(this));
        EditText editText3 = this.f127537j;
        if (editText3 == null) {
            C89219l.m154710a("mSearchEt");
        }
        editText3.setOnTouchListener(this);
        mo92783b();
        if (z) {
            ImTextTitleBar imTextTitleBar2 = this.f127541n;
            if (imTextTitleBar2 == null) {
                C89219l.m154710a("titleBar");
            }
            imTextTitleBar2.setVisibility(8);
        }
    }
}
