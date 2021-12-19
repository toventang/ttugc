package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.table.EnumC23274a;
import com.bytedance.tux.table.EnumC23277b;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.header.TuxTableHeader;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71148e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.p3818a.C71119b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71351b;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1728f;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d */
public final class C71136d extends Fragment implements AbstractC23185a {

    /* renamed from: m */
    public static final C71139a f159350m = new C71139a((byte) 0);

    /* renamed from: a */
    public RecyclerView f159351a;

    /* renamed from: b */
    public C71119b f159352b;

    /* renamed from: c */
    C23226a f159353c;

    /* renamed from: d */
    public TuxTextCell f159354d;

    /* renamed from: e */
    public TuxTextView f159355e;

    /* renamed from: f */
    public TuxTableHeader f159356f;

    /* renamed from: g */
    public DuetStickerRecommendViewModel f159357g;

    /* renamed from: h */
    public C1728f f159358h;

    /* renamed from: i */
    public C71148e f159359i;

    /* renamed from: j */
    public final LinkedHashSet<User> f159360j;

    /* renamed from: k */
    public final boolean f159361k;

    /* renamed from: l */
    public final VideoPublishEditModel f159362l;

    /* renamed from: n */
    private View f159363n;

    /* renamed from: o */
    private final C71351b f159364o;

    /* renamed from: p */
    private HashMap f159365p;

    static {
        Covode.recordClassIndex(83642);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$a */
    public static final class C71139a {
        static {
            Covode.recordClassIndex(83645);
        }

        private C71139a() {
        }

        public /* synthetic */ C71139a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Spanned m125727a(String str) {
            C89219l.m154721d(str, "");
            SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(str));
            StyleSpan[] styleSpanArr = (StyleSpan[]) valueOf.getSpans(0, str.length(), StyleSpan.class);
            C89219l.m154716b(styleSpanArr, "");
            for (StyleSpan styleSpan : styleSpanArr) {
                int spanStart = valueOf.getSpanStart(styleSpan);
                int spanEnd = valueOf.getSpanEnd(styleSpan);
                valueOf.removeSpan(styleSpan);
                valueOf.setSpan(new C23126b(62), spanStart, spanEnd, 17);
            }
            C89219l.m154716b(valueOf, "");
            return valueOf;
        }

        /* renamed from: a */
        public static String m125728a(Context context, LinkedHashSet<User> linkedHashSet) {
            C89219l.m154721d(linkedHashSet, "");
            if (context == null || linkedHashSet.isEmpty()) {
                return "";
            }
            List j = C89070n.m154590j(linkedHashSet);
            int size = j.size();
            if (size == 1) {
                String string = context.getResources().getString(R.string.bdy, "<b>" + ((User) j.get(0)).getNickname() + "</b>");
                C89219l.m154716b(string, "");
                return string;
            } else if (size != 2) {
                String quantityString = context.getResources().getQuantityString(R.plurals.b6, 2, "<b>" + ((User) j.get(0)).getNickname() + "</b>", "<b>" + (j.size() - 1) + "</b>");
                C89219l.m154716b(quantityString, "");
                return quantityString;
            } else {
                String string2 = context.getResources().getString(R.string.bdz, "<b>" + ((User) j.get(0)).getNickname() + "</b>", "<b>" + ((User) j.get(1)).getNickname() + "</b>");
                C89219l.m154716b(string2, "");
                return string2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$b */
    public static abstract class AbstractC71140b extends AbstractC23219c.C23221b {
        static {
            Covode.recordClassIndex(83646);
        }

        private AbstractC71140b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$b$a */
        public static final class C71141a extends AbstractC71140b {

            /* renamed from: a */
            public static final C71141a f159366a = new C71141a();

            private C71141a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(83647);
            }
        }

        public /* synthetic */ AbstractC71140b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$c */
    static final class C71142c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71136d f159367a;

        static {
            Covode.recordClassIndex(83648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71142c(C71136d dVar) {
            super(0);
            this.f159367a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43789a(this.f159367a, AbstractC71140b.C71141a.f159366a);
            return C89391z.f203057a;
        }
    }

    public C71136d() {
        this(new LinkedHashSet(0), false, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f159358h.mo5527c();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f159365p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        String str;
        Resources resources;
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.be2)) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        TuxNavBar.C23179a b = aVar.mo37731a(gVar.mo37753a(str)).mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C71142c(this)));
        b.f54919d = true;
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$e */
    public static final class C71144e extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ C71136d f159369a;

        static {
            Covode.recordClassIndex(83650);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71144e(C71136d dVar) {
            this.f159369a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(recyclerView, "");
            super.getItemOffsets(rect, i, recyclerView);
            if (i == 0) {
                rect.left = (int) C30745b.m63132b(this.f159369a.getContext(), 16.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$d */
    static final class C71143d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71136d f159368a;

        static {
            Covode.recordClassIndex(83649);
        }

        C71143d(C71136d dVar) {
            this.f159368a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            TuxTextView tuxTextView = this.f159368a.f159355e;
            if (tuxTextView == null) {
                C89219l.m154710a("selectUserText");
            }
            Context context = this.f159368a.getContext();
            C89219l.m154716b(linkedHashSet, "");
            tuxTextView.setText(C71139a.m125727a(C71139a.m125728a(context, linkedHashSet)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$h */
    static final class DialogInterface$OnDismissListenerC71147h implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C71136d f159371a;

        static {
            Covode.recordClassIndex(83653);
        }

        DialogInterface$OnDismissListenerC71147h(C71136d dVar) {
            this.f159371a = dVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            LinkedHashSet<User> linkedHashSet;
            C89219l.m154716b(dialogInterface, "");
            AbstractC23219c a = C23226a.C23228b.m43785a(dialogInterface);
            if (!C89219l.m154714a(a, AbstractC23219c.C23220a.f55026a) && !C89219l.m154714a(a, C71148e.AbstractC71151b.C71152a.f159391a)) {
                C71136d dVar = this.f159371a;
                C71148e eVar = dVar.f159359i;
                if (eVar == null || (linkedHashSet = eVar.f159374b.f159308a) == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                dVar.mo112454a(linkedHashSet);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$f */
    static final class C71145f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71136d f159370a;

        static {
            Covode.recordClassIndex(83651);
        }

        C71145f(C71136d dVar) {
            this.f159370a = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            List g;
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            C89219l.m154716b(iVar, "");
            if (iVar.mo5539b() || iVar.mo5544c() || !A.mo93903b()) {
                Toast makeText = Toast.makeText(this.f159370a.getContext(), "no data", 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f159370a.f159360j);
                List<User> list = ((C71351b.C71352a.C71353a) iVar.mo5545d()).f159921f;
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (TextUtils.equals(((User) next).getSecUid(), t2.getSecUid())) {
                            if (next != null) {
                            }
                        }
                    }
                    arrayList2.add(t);
                }
                arrayList.addAll(arrayList2);
                C71119b bVar = this.f159370a.f159352b;
                List<String> list2 = ((C71351b.C71352a.C71353a) iVar.mo5545d()).f159922g;
                C89219l.m154721d(list2, "");
                bVar.f159300f = list2;
                if (arrayList.size() > 15) {
                    g = C89070n.m154585g((Collection) C89070n.m154571d((Iterable) arrayList, 15));
                } else {
                    g = C89070n.m154585g((Collection) arrayList);
                }
                g.add(new User());
                this.f159370a.f159352b.f159301g.addAll(g);
                this.f159370a.f159352b.notifyDataSetChanged();
                RecyclerView recyclerView = this.f159370a.f159351a;
                if (recyclerView == null) {
                    C89219l.m154710a("recommendUserRecyclerView");
                }
                recyclerView.mo4413b(0);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cd, code lost:
        r9.add(r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112454a(java.util.LinkedHashSet<com.p2082ss.android.ugc.aweme.profile.model.User> r11) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71136d.mo112454a(java.util.LinkedHashSet):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.d$g */
    static final /* synthetic */ class C71146g extends C89217j implements AbstractC89183m<User, Boolean, C89391z> {
        static {
            Covode.recordClassIndex(83652);
        }

        C71146g(C71136d dVar) {
            super(2, dVar, C71136d.class, "mobSelectUser", "mobSelectUser(Lcom/ss/android/ugc/aweme/profile/model/User;Z)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(User user, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((C71136d) this.receiver).mo112453a(user, booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo112453a(User user, boolean z) {
        String str;
        String str2;
        if (user != null) {
            C84425b bVar = new C84425b();
            C89219l.m154716b(bVar, "");
            VideoPublishEditModel videoPublishEditModel = this.f159362l;
            String str3 = null;
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.creationId;
            } else {
                str = null;
            }
            bVar.mo129406a("creation_id", str);
            AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
            if (e != null) {
                str3 = e.mo58660c();
            }
            C84425b a = bVar.mo129406a("user_id", str3).mo129406a("invite_user_id", user.getUid());
            if (z) {
                str2 = "click head";
            } else {
                str2 = "search";
            }
            a.mo129406a("click_method", str2);
            C39162r.m79460a("invite_people_to_duet", bVar.f188764a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Resources resources;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            View view2 = getView();
            Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.View");
            this.f159363n = view2;
            if (view2 == null) {
                C89219l.m154710a("rootView");
            }
            View findViewById = view2.findViewById(R.id.apu);
            C89219l.m154716b(findViewById, "");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f159351a = recyclerView;
            if (recyclerView == null) {
                C89219l.m154710a("recommendUserRecyclerView");
            }
            recyclerView.mo4415b(new C71144e(this));
            View view3 = this.f159363n;
            if (view3 == null) {
                C89219l.m154710a("rootView");
            }
            View findViewById2 = view3.findViewById(R.id.bpy);
            C89219l.m154716b(findViewById2, "");
            TuxTableHeader tuxTableHeader = (TuxTableHeader) findViewById2;
            this.f159356f = tuxTableHeader;
            if (tuxTableHeader == null) {
                C89219l.m154710a("inviteHeader");
            }
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.bdx)) == null) {
                str = "Invite people to Duet";
            }
            tuxTableHeader.setTitle(str);
            TuxTableHeader tuxTableHeader2 = this.f159356f;
            if (tuxTableHeader2 == null) {
                C89219l.m154710a("inviteHeader");
            }
            tuxTableHeader2.setHeaderSize(EnumC23274a.SMALL);
            TuxTableHeader tuxTableHeader3 = this.f159356f;
            if (tuxTableHeader3 == null) {
                C89219l.m154710a("inviteHeader");
            }
            tuxTableHeader3.setShowSeparator(true);
            RecyclerView recyclerView2 = this.f159351a;
            if (recyclerView2 == null) {
                C89219l.m154710a("recommendUserRecyclerView");
            }
            recyclerView2.setAdapter(this.f159352b);
            View view4 = this.f159363n;
            if (view4 == null) {
                C89219l.m154710a("rootView");
            }
            View findViewById3 = view4.findViewById(R.id.apc);
            C89219l.m154716b(findViewById3, "");
            TuxTextCell tuxTextCell = (TuxTextCell) findViewById3;
            this.f159354d = tuxTextCell;
            if (tuxTextCell == null) {
                C89219l.m154710a("useMicSwitch");
            }
            tuxTextCell.setWithSeparator(false);
            TuxTextCell tuxTextCell2 = this.f159354d;
            if (tuxTextCell2 == null) {
                C89219l.m154710a("useMicSwitch");
            }
            tuxTextCell2.setInset(EnumC23277b.PADDING_16);
            TuxTextCell tuxTextCell3 = this.f159354d;
            if (tuxTextCell3 == null) {
                C89219l.m154710a("useMicSwitch");
            }
            tuxTextCell3.setIcon((C22999a) null);
            TuxTextCell tuxTextCell4 = this.f159354d;
            if (tuxTextCell4 == null) {
                C89219l.m154710a("useMicSwitch");
            }
            AbstractC23293c.AbstractC23296b accessory = tuxTextCell4.getAccessory();
            if (!(accessory instanceof AbstractC23293c.C23309j)) {
                accessory = null;
            }
            AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) accessory;
            if (eVar != null) {
                eVar.mo37959c(this.f159361k);
            }
            View view5 = this.f159363n;
            if (view5 == null) {
                C89219l.m154710a("rootView");
            }
            View findViewById4 = view5.findViewById(R.id.apw);
            C89219l.m154716b(findViewById4, "");
            TuxTextView tuxTextView = (TuxTextView) findViewById4;
            this.f159355e = tuxTextView;
            if (tuxTextView == null) {
                C89219l.m154710a("selectUserText");
            }
            tuxTextView.setText(C71139a.m125727a(C71139a.m125728a(getContext(), this.f159360j)));
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.mo4356b(0);
            RecyclerView recyclerView3 = this.f159351a;
            if (recyclerView3 == null) {
                C89219l.m154710a("recommendUserRecyclerView");
            }
            recyclerView3.setLayoutManager(linearLayoutManager);
            this.f159364o.mo112836a().mo5534a(new C71145f(this), C1731i.f5564c, this.f159358h.mo5526b());
        }
        AbstractC1174ac a = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(DuetStickerRecommendViewModel.class);
        C89219l.m154716b(a, "");
        DuetStickerRecommendViewModel duetStickerRecommendViewModel = (DuetStickerRecommendViewModel) a;
        this.f159357g = duetStickerRecommendViewModel;
        C71119b bVar = this.f159352b;
        if (duetStickerRecommendViewModel == null) {
            C89219l.m154710a("duetStickerRecommendViewModel");
        }
        bVar.f159298d = duetStickerRecommendViewModel;
        DuetStickerRecommendViewModel duetStickerRecommendViewModel2 = this.f159357g;
        if (duetStickerRecommendViewModel2 == null) {
            C89219l.m154710a("duetStickerRecommendViewModel");
        }
        duetStickerRecommendViewModel2.f159283a.observe(this, new C71143d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.e9, viewGroup, false);
    }

    public C71136d(LinkedHashSet<User> linkedHashSet, boolean z, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(linkedHashSet, "");
        this.f159360j = linkedHashSet;
        this.f159361k = z;
        this.f159362l = videoPublishEditModel;
        this.f159352b = new C71119b();
        this.f159358h = new C1728f();
        C71351b bVar = new C71351b();
        boolean z2 = true;
        bVar.f159912a = true;
        this.f159364o = bVar;
        this.f159352b.f159299e = new AbstractC89183m<User, Boolean, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71136d.C711371 */

            static {
                Covode.recordClassIndex(83643);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(User user, Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                ((C71136d) this.receiver).mo112453a(user, booleanValue);
                return C89391z.f203057a;
            }
        };
        this.f159352b.f159295a.addAll(linkedHashSet);
        C71119b bVar2 = this.f159352b;
        bVar2.f159297c = bVar2.f159295a.size() < 30 ? false : z2;
        this.f159352b.f159296b = new AbstractC89171a<C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71136d.C711382 */

            static {
                Covode.recordClassIndex(83644);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                Activity activity;
                C71136d dVar = (C71136d) this.receiver;
                C71148e eVar = new C71148e(dVar.f159352b.f159295a, new C71146g(dVar));
                dVar.f159359i = eVar;
                dVar.f159353c = new C23226a.C23227a().mo37812a(1).mo37821b(C70636dh.m124836e(dVar.getContext()) - C70636dh.m124833c(dVar.getContext())).mo37823c().mo37815a(new DialogInterface$OnDismissListenerC71147h(dVar)).mo37822b(false).mo37817a(eVar).f55057a;
                C23226a aVar = dVar.f159353c;
                if (aVar != null) {
                    Context context = dVar.getContext();
                    AbstractC0952i iVar = null;
                    if (context != null) {
                        while (true) {
                            if (!(context instanceof Activity)) {
                                if (context instanceof ContextWrapper) {
                                    context = ((ContextWrapper) context).getBaseContext();
                                    if (context == null) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                activity = (Activity) context;
                                break;
                            }
                        }
                    }
                    activity = null;
                    if (!(activity instanceof ActivityC0945e)) {
                        activity = null;
                    }
                    ActivityC0945e eVar2 = (ActivityC0945e) activity;
                    if (eVar2 != null) {
                        iVar = eVar2.getSupportFragmentManager();
                    }
                    aVar.show(iVar, "DuetSearchUserDialog");
                }
                return C89391z.f203057a;
            }
        };
    }
}
