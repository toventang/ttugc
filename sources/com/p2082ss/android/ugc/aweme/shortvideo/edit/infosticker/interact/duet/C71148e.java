package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23191e;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.navigation.p1723a.EnumC23193f;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71136d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.p3818a.C71123c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71351b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71362e;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;
import com.p2082ss.android.ugc.tools.view.widget.AVStatusView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1728f;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e */
public final class C71148e extends Fragment implements AbstractC23185a, AbstractC71357c {

    /* renamed from: l */
    public static final C71150a f159372l = new C71150a((byte) 0);

    /* renamed from: a */
    public RecyclerView f159373a;

    /* renamed from: b */
    public C71123c f159374b;

    /* renamed from: c */
    public EditText f159375c;

    /* renamed from: d */
    public ImageButton f159376d;

    /* renamed from: e */
    public TuxTextView f159377e;

    /* renamed from: f */
    public View f159378f;

    /* renamed from: g */
    public C1728f f159379g;

    /* renamed from: h */
    public List<? extends User> f159380h;

    /* renamed from: i */
    public C71351b.C71352a.C71353a f159381i;

    /* renamed from: j */
    public final LinkedHashSet<User> f159382j;

    /* renamed from: k */
    public final AbstractC89183m<User, Boolean, C89391z> f159383k;

    /* renamed from: m */
    private boolean f159384m;

    /* renamed from: n */
    private DuetStickerSearchViewModel f159385n;

    /* renamed from: o */
    private final AbstractC89244h f159386o;

    /* renamed from: p */
    private final AbstractC89244h f159387p;

    /* renamed from: q */
    private final C71351b f159388q;

    /* renamed from: r */
    private HashMap f159389r;

    static {
        Covode.recordClassIndex(83654);
    }

    /* renamed from: f */
    public final HashSet<String> mo112462f() {
        return (HashSet) this.f159386o.getValue();
    }

    /* renamed from: g */
    public final C71362e mo112463g() {
        return (C71362e) this.f159387p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c
    /* renamed from: i */
    public final void mo112465i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c
    /* renamed from: j */
    public final void mo112466j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$a */
    public static final class C71150a {
        static {
            Covode.recordClassIndex(83656);
        }

        private C71150a() {
        }

        public /* synthetic */ C71150a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$b */
    public static abstract class AbstractC71151b extends AbstractC23219c.C23221b {
        static {
            Covode.recordClassIndex(83657);
        }

        private AbstractC71151b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$b$a */
        public static final class C71152a extends AbstractC71151b {

            /* renamed from: a */
            public static final C71152a f159391a = new C71152a();

            private C71152a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(83658);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$b$b */
        public static final class C71153b extends AbstractC71151b {

            /* renamed from: a */
            public static final C71153b f159392a = new C71153b();

            private C71153b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(83659);
            }
        }

        public /* synthetic */ AbstractC71151b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$e */
    static final class C71156e extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C71156e f159395a = new C71156e();

        static {
            Covode.recordClassIndex(83662);
        }

        C71156e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$j */
    static final class C71161j extends AbstractC89220m implements AbstractC89171a<C71362e> {

        /* renamed from: a */
        public static final C71161j f159400a = new C71161j();

        static {
            Covode.recordClassIndex(83667);
        }

        C71161j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71362e invoke() {
            return new C71362e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$c */
    static final class C71154c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71148e f159393a;

        static {
            Covode.recordClassIndex(83660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71154c(C71148e eVar) {
            super(0);
            this.f159393a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43789a(this.f159393a, AbstractC71151b.C71152a.f159391a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$d */
    static final class C71155d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71148e f159394a;

        static {
            Covode.recordClassIndex(83661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71155d(C71148e eVar) {
            super(0);
            this.f159394a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43789a(this.f159394a, AbstractC71151b.C71153b.f159392a);
            return C89391z.f203057a;
        }
    }

    public C71148e() {
        this(new LinkedHashSet(0), null);
    }

    /* renamed from: b */
    public final RecyclerView mo112458b() {
        RecyclerView recyclerView = this.f159373a;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public final ImageButton mo112459c() {
        ImageButton imageButton = this.f159376d;
        if (imageButton == null) {
            C89219l.m154710a("clearSearchInput");
        }
        return imageButton;
    }

    /* renamed from: d */
    public final TuxTextView mo112460d() {
        TuxTextView tuxTextView = this.f159377e;
        if (tuxTextView == null) {
            C89219l.m154710a("duetSearchUserNoticeText");
        }
        return tuxTextView;
    }

    /* renamed from: e */
    public final View mo112461e() {
        View view = this.f159378f;
        if (view == null) {
            C89219l.m154710a("lineView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f159379g.mo5527c();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f159389r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: h */
    public final C67681g mo112464h() {
        return new C67681g(6, null, this.f159374b.f159315h, "at_user", 20, C89070n.m154590j(mo112462f()));
    }

    /* renamed from: k */
    private void m125729k() {
        if (!mo112463g().mo112788c()) {
            mo112463g().f159791c = this;
        }
        this.f159388q.mo112836a().mo5534a(new C71160i(this), C1731i.f5564c, this.f159379g.mo5526b());
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        String str;
        String str2;
        String str3;
        Resources resources;
        Resources resources2;
        Resources resources3;
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        AbstractC23189c[] cVarArr = new AbstractC23189c[1];
        C23191e eVar = new C23191e();
        Context context = getContext();
        if (context == null || (resources3 = context.getResources()) == null || (str = resources3.getString(R.string.bdo)) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        cVarArr[0] = eVar.mo37749a(str).mo37746a(EnumC23193f.SECONDARY).mo37747a((AbstractC89171a<C89391z>) new C71154c(this));
        TuxNavBar.C23179a a = aVar.mo37732a(cVarArr);
        C23194g gVar = new C23194g();
        Context context2 = getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (str2 = resources2.getString(R.string.a7c)) == null) {
            str2 = "";
        }
        C89219l.m154716b(str2, "");
        TuxNavBar.C23179a a2 = a.mo37731a(gVar.mo37753a(str2));
        AbstractC23189c[] cVarArr2 = new AbstractC23189c[1];
        C23191e eVar2 = new C23191e();
        Context context3 = getContext();
        if (context3 == null || (resources = context3.getResources()) == null || (str3 = resources.getString(R.string.baq)) == null) {
            str3 = "";
        }
        C89219l.m154716b(str3, "");
        cVarArr2[0] = eVar2.mo37749a(str3).mo37747a((AbstractC89171a<C89391z>) new C71155d(this));
        return a2.mo37733b(cVarArr2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$h */
    public static final class C71159h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C71148e f159398a;

        static {
            Covode.recordClassIndex(83665);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71159h(C71148e eVar) {
            this.f159398a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r0.length() != 0) goto L_0x0011;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x000f
                java.lang.String r0 = r3.toString()
                r1 = 0
                if (r0 == 0) goto L_0x000f
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                r1 = 8
            L_0x0011:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f159398a
                android.widget.ImageButton r0 = r0.mo112459c()
                int r0 = r0.getVisibility()
                if (r0 == r1) goto L_0x0026
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f159398a
                android.widget.ImageButton r0 = r0.mo112459c()
                r0.setVisibility(r1)
            L_0x0026:
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r1, r0)
                java.lang.CharSequence r0 = p4600h.p4622m.C89361p.m154910b(r1)
                java.lang.String r1 = r0.toString()
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f159398a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c r0 = r0.f159374b
                java.lang.String r0 = r0.f159315h
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r1)
                if (r0 == 0) goto L_0x0044
                return
            L_0x0044:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f159398a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.c r0 = r0.f159374b
                r0.mo112429a(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e r0 = r2.f159398a
                r0.mo112457a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71148e.C71159h.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$g */
    static final class View$OnClickListenerC71158g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71148e f159397a;

        static {
            Covode.recordClassIndex(83664);
        }

        View$OnClickListenerC71158g(C71148e eVar) {
            this.f159397a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f159397a.f159375c;
            if (editText == null) {
                C89219l.m154710a("searchEditText");
            }
            editText.setText(new Editable.Factory().newEditable(""));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$f */
    static final class C71157f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71148e f159396a;

        static {
            Covode.recordClassIndex(83663);
        }

        C71157f(C71148e eVar) {
            this.f159396a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            if (linkedHashSet == null || linkedHashSet.isEmpty()) {
                this.f159396a.mo112460d().setVisibility(8);
                this.f159396a.mo112461e().setVisibility(8);
                return;
            }
            this.f159396a.mo112460d().setVisibility(0);
            this.f159396a.mo112461e().setVisibility(0);
            this.f159396a.mo112460d().setText(C71136d.C71139a.m125727a(C71136d.C71139a.m125728a(this.f159396a.getContext(), linkedHashSet)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$k */
    public static final class C71162k<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71148e f159401a;

        static {
            Covode.recordClassIndex(83668);
        }

        C71162k(C71148e eVar) {
            this.f159401a = eVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5539b() && !iVar.mo5544c()) {
                this.f159401a.f159374b.f159310c.clear();
                this.f159401a.f159374b.f159310c.addAll((Collection) iVar.mo5545d());
                this.f159401a.f159374b.notifyDataSetChanged();
                this.f159401a.mo112458b().mo4413b(0);
            }
            this.f159401a.mo112463g().mo112786a(true, this.f159401a.mo112464h());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.e$i */
    public static final class C71160i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71148e f159399a;

        static {
            Covode.recordClassIndex(83666);
        }

        C71160i(C71148e eVar) {
            this.f159399a = eVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Iterable iterable;
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            C89219l.m154716b(iVar, "");
            if (iVar.mo5539b() || iVar.mo5544c() || !A.mo93903b()) {
                Toast makeText = Toast.makeText(this.f159399a.getContext(), "no data", 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            } else {
                C71148e eVar = this.f159399a;
                C71351b.C71352a.C71353a aVar = (C71351b.C71352a.C71353a) iVar.mo5545d();
                eVar.f159381i = aVar;
                if (aVar != null) {
                    eVar.f159380h = aVar.f159921f;
                }
                C71351b.C71352a.C71353a aVar2 = this.f159399a.f159381i;
                if (aVar2 == null || (iterable = aVar2.f159921f) == null) {
                    iterable = new ArrayList();
                }
                this.f159399a.f159374b.f159310c.clear();
                this.f159399a.f159374b.f159311d.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(this.f159399a.f159374b.f159308a);
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    User user = (User) obj;
                    Iterator<T> it = this.f159399a.f159374b.f159308a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (TextUtils.equals(next.getSecUid(), user.getSecUid())) {
                            if (next != null) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
                linkedHashSet.addAll(arrayList);
                this.f159399a.f159374b.f159310c.addAll(linkedHashSet);
                this.f159399a.f159374b.notifyDataSetChanged();
                this.f159399a.mo112458b().mo4413b(0);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c
    /* renamed from: a */
    public final void mo112456a(C67683h hVar) {
        String userId;
        C89219l.m154721d(hVar, "");
        this.f159374b.mo129698e();
        this.f159384m = false;
        if (this.f159374b.f159315h.length() == 0) {
            C71123c cVar = this.f159374b;
            if (cVar.f189768n != null) {
                ((AVStatusView) cVar.f189768n.itemView).mo129847c();
            }
            cVar.f189764j = 1;
            return;
        }
        ArrayList<C67679e> arrayList = this.f159374b.f159311d;
        arrayList.clear();
        List<? extends C67679e> list = hVar.f151688a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                C71351b bVar = this.f159388q;
                String userId2 = t.f151672g.getUserId();
                if (userId2 == null) {
                    userId2 = "";
                }
                if (!bVar.mo112838a(userId2)) {
                    arrayList2.add(t);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        }
        List<String> list2 = this.f159374b.f159309b;
        list2.clear();
        List<? extends C67679e> list3 = hVar.f151688a;
        if (list3 != null) {
            for (T t2 : list3) {
                if (t2.f151672g.getMentionBlockType() == 1 && (userId = t2.f151672g.getUserId()) != null) {
                    list2.add(userId);
                }
            }
        }
        this.f159374b.notifyDataSetChanged();
        mo112462f().addAll(this.f159374b.mo112430b());
    }

    /* renamed from: a */
    public final void mo112457a(String str) {
        C89219l.m154721d(str, "");
        mo112462f().clear();
        this.f159374b.mo112429a(str);
        if (!TextUtils.isEmpty(str)) {
            if (!mo112463g().mo112788c()) {
                mo112463g().f159791c = this;
            }
            ArrayList arrayList = new ArrayList();
            C71351b.C71352a.C71353a aVar = this.f159381i;
            if (aVar != null) {
                arrayList.addAll(aVar.f159916a);
                arrayList.addAll(aVar.f159917b);
                arrayList.addAll(aVar.f159916a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                User user = (User) obj;
                if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                    arrayList2.add(obj);
                }
            }
            this.f159388q.mo112837a(str, arrayList2).mo5534a(new C71162k(this), C1731i.f5564c, this.f159379g.mo5526b());
            return;
        }
        List<? extends User> list = this.f159380h;
        if (list == null || list.isEmpty()) {
            m125729k();
            return;
        }
        this.f159374b.f159310c.clear();
        this.f159374b.f159311d.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f159374b.f159308a);
        Collection collection = this.f159380h;
        if (collection == null) {
            collection = new ArrayList();
        }
        linkedHashSet.addAll(collection);
        this.f159374b.f159310c.addAll(linkedHashSet);
        this.f159374b.notifyDataSetChanged();
        RecyclerView recyclerView = this.f159373a;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.mo4413b(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.profile.model.User, ? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C71148e(LinkedHashSet<User> linkedHashSet, AbstractC89183m<? super User, ? super Boolean, C89391z> mVar) {
        C89219l.m154721d(linkedHashSet, "");
        this.f159382j = linkedHashSet;
        this.f159383k = mVar;
        this.f159374b = new C71123c();
        this.f159379g = new C1728f();
        this.f159386o = C89250i.m154773a((AbstractC89171a) C71156e.f159395a);
        this.f159387p = C89250i.m154773a((AbstractC89171a) C71161j.f159400a);
        C71351b bVar = new C71351b();
        boolean z = true;
        bVar.f159912a = true;
        this.f159388q = bVar;
        this.f159374b.f159314g = mVar;
        this.f159374b.f159308a.addAll(linkedHashSet);
        C71123c cVar = this.f159374b;
        cVar.f159312e = cVar.f159308a.size() < 30 ? false : z;
        this.f159374b.f189769o = new AbstractC84926c.AbstractC84928a(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71148e.C711491 */

            /* renamed from: a */
            final /* synthetic */ C71148e f159390a;

            static {
                Covode.recordClassIndex(83655);
            }

            {
                this.f159390a = r1;
            }

            @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c.AbstractC84928a
            /* renamed from: a */
            public final void mo112467a() {
                this.f159390a.mo112462f().size();
                this.f159390a.f159374b.mo129697d();
                this.f159390a.mo112463g().mo112786a(false, this.f159390a.mo112464h());
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1213t<LinkedHashSet<User>> tVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.apv);
        C89219l.m154716b(findViewById, "");
        this.f159373a = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.apr);
        C89219l.m154716b(findViewById2, "");
        this.f159375c = (EditText) findViewById2;
        View findViewById3 = view.findViewById(R.id.ape);
        C89219l.m154716b(findViewById3, "");
        this.f159376d = (ImageButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.apt);
        C89219l.m154716b(findViewById4, "");
        this.f159377e = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.aps);
        C89219l.m154716b(findViewById5, "");
        this.f159378f = findViewById5;
        RecyclerView recyclerView = this.f159373a;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.setAdapter(this.f159374b);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(1);
        RecyclerView recyclerView2 = this.f159373a;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        DuetStickerSearchViewModel duetStickerSearchViewModel = (DuetStickerSearchViewModel) C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(DuetStickerSearchViewModel.class);
        this.f159385n = duetStickerSearchViewModel;
        if (!(duetStickerSearchViewModel == null || (tVar = duetStickerSearchViewModel.f159284a) == null)) {
            tVar.observe(this, new C71157f(this));
        }
        DuetStickerSearchViewModel duetStickerSearchViewModel2 = this.f159385n;
        if (duetStickerSearchViewModel2 != null) {
            duetStickerSearchViewModel2.mo112413a(this.f159374b.f159308a);
        }
        this.f159374b.f159313f = this.f159385n;
        ImageButton imageButton = this.f159376d;
        if (imageButton == null) {
            C89219l.m154710a("clearSearchInput");
        }
        imageButton.setOnClickListener(new View$OnClickListenerC71158g(this));
        EditText editText = this.f159375c;
        if (editText == null) {
            C89219l.m154710a("searchEditText");
        }
        editText.addTextChangedListener(new C71159h(this));
        m125729k();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.e7, viewGroup, false);
    }
}
