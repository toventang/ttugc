package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.C72911a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.C72919d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3865a.C72883b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3867c.C72894a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.views.ChallengeViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o */
public final class C73050o extends C72919d {

    /* renamed from: f */
    public static final C73051a f163932f = new C73051a((byte) 0);

    /* renamed from: a */
    TabLayout f163933a;

    /* renamed from: b */
    public ChallengeViewPager f163934b;

    /* renamed from: c */
    PollStruct f163935c;

    /* renamed from: d */
    public AbstractC73052b f163936d;

    /* renamed from: e */
    public AbstractC72925f f163937e;

    /* renamed from: g */
    private View f163938g;

    /* renamed from: h */
    private C72883b f163939h;

    /* renamed from: i */
    private TextView f163940i;

    /* renamed from: j */
    private ImageView f163941j;

    /* renamed from: k */
    private SparseArray f163942k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o$b */
    public interface AbstractC73052b {
        static {
            Covode.recordClassIndex(85755);
        }

        /* renamed from: a */
        void mo115482a();
    }

    static {
        Covode.recordClassIndex(85753);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o$a */
    public static final class C73051a {
        static {
            Covode.recordClassIndex(85754);
        }

        private C73051a() {
        }

        public /* synthetic */ C73051a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C73050o m128953a(PollStruct pollStruct) {
            List<PollStruct.OptionsBean> options;
            if (pollStruct == null || (options = pollStruct.getOptions()) == null || options.size() < 2) {
                return null;
            }
            C73050o oVar = new C73050o();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_poll", pollStruct);
            oVar.setArguments(bundle);
            return oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o$f */
    public static final class C73056f implements TabLayout.AbstractC26717c {
        static {
            Covode.recordClassIndex(85759);
        }

        C73056f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: a */
        public final void mo9936a(TabLayout.C26722f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f63312f;
            } else {
                view = null;
            }
            C73064q qVar = (C73064q) view;
            if (qVar != null) {
                qVar.setSelect(true);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: b */
        public final void mo9937b(TabLayout.C26722f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f63312f;
            } else {
                view = null;
            }
            C73064q qVar = (C73064q) view;
            if (qVar != null) {
                qVar.setSelect(false);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f163942k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o$d */
    static final class RunnableC73054d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73050o f163944a;

        static {
            Covode.recordClassIndex(85757);
        }

        RunnableC73054d(C73050o oVar) {
            this.f163944a = oVar;
        }

        public final void run() {
            View view;
            String str;
            long j;
            View view2;
            List<PollStruct.OptionsBean> options;
            PollStruct.OptionsBean optionsBean;
            List<PollStruct.OptionsBean> options2;
            PollStruct.OptionsBean optionsBean2;
            String optionText;
            List<PollStruct.OptionsBean> options3;
            PollStruct.OptionsBean optionsBean3;
            List<PollStruct.OptionsBean> options4;
            PollStruct.OptionsBean optionsBean4;
            C73050o oVar = this.f163944a;
            ChallengeViewPager challengeViewPager = oVar.f163934b;
            if (challengeViewPager == null) {
                C89219l.m154715b();
            }
            int currentItem = challengeViewPager.getCurrentItem();
            if (oVar.getContext() != null) {
                TabLayout tabLayout = oVar.f163933a;
                if (tabLayout != null) {
                    tabLayout.setupWithViewPager(oVar.f163934b);
                }
                int i = 1;
                C73064q qVar = new C73064q(oVar.getContext(), true);
                qVar.setLayoutParams(new TableLayout.LayoutParams(-1, -1));
                qVar.setPadding(0, 0, 0, 0);
                TabLayout tabLayout2 = oVar.f163933a;
                if (tabLayout2 == null) {
                    C89219l.m154715b();
                }
                TabLayout.C26722f tabAt = tabLayout2.getTabAt(0);
                if (tabAt != null) {
                    tabAt.mo44368a(qVar);
                }
                C73064q qVar2 = new C73064q(oVar.getContext(), false);
                qVar2.setLayoutParams(new TableLayout.LayoutParams(-1, -1));
                qVar2.setPadding(0, 0, 0, 0);
                TabLayout tabLayout3 = oVar.f163933a;
                if (tabLayout3 == null) {
                    C89219l.m154715b();
                }
                TabLayout.C26722f tabAt2 = tabLayout3.getTabAt(1);
                if (tabAt2 != null) {
                    tabAt2.mo44368a(qVar2);
                }
                TabLayout tabLayout4 = oVar.f163933a;
                if (tabLayout4 == null) {
                    C89219l.m154715b();
                }
                tabLayout4.addOnTabSelectedListener(new C73056f());
                TabLayout tabLayout5 = oVar.f163933a;
                if (tabLayout5 == null) {
                    C89219l.m154715b();
                }
                TabLayout.C26722f tabAt3 = tabLayout5.getTabAt(0);
                View view3 = null;
                if (tabAt3 != null) {
                    view = tabAt3.f63312f;
                } else {
                    view = null;
                }
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollTabView");
                C73064q qVar3 = (C73064q) view;
                PollStruct pollStruct = oVar.f163935c;
                String str2 = "";
                if (pollStruct == null || (options4 = pollStruct.getOptions()) == null || (optionsBean4 = options4.get(0)) == null || (str = optionsBean4.getOptionText()) == null) {
                    str = str2;
                }
                PollStruct pollStruct2 = oVar.f163935c;
                long j2 = 0;
                if (pollStruct2 == null || (options3 = pollStruct2.getOptions()) == null || (optionsBean3 = options3.get(0)) == null) {
                    j = 0;
                } else {
                    j = optionsBean3.getPollCount();
                }
                qVar3.mo115489a(str, j);
                TabLayout tabLayout6 = oVar.f163933a;
                if (tabLayout6 == null) {
                    C89219l.m154715b();
                }
                TabLayout.C26722f tabAt4 = tabLayout6.getTabAt(1);
                if (tabAt4 != null) {
                    view2 = tabAt4.f63312f;
                } else {
                    view2 = null;
                }
                Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollTabView");
                C73064q qVar4 = (C73064q) view2;
                PollStruct pollStruct3 = oVar.f163935c;
                if (!(pollStruct3 == null || (options2 = pollStruct3.getOptions()) == null || (optionsBean2 = options2.get(1)) == null || (optionText = optionsBean2.getOptionText()) == null)) {
                    str2 = optionText;
                }
                PollStruct pollStruct4 = oVar.f163935c;
                if (!(pollStruct4 == null || (options = pollStruct4.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
                    j2 = optionsBean.getPollCount();
                }
                qVar4.mo115489a(str2, j2);
                TabLayout tabLayout7 = oVar.f163933a;
                if (tabLayout7 == null) {
                    C89219l.m154715b();
                }
                if (currentItem == 1) {
                    i = 0;
                }
                TabLayout.C26722f tabAt5 = tabLayout7.getTabAt(i);
                if (tabAt5 != null) {
                    view3 = tabAt5.f63312f;
                }
                Objects.requireNonNull(view3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollTabView");
                ((C73064q) view3).setSelect(false);
                TabLayout tabLayout8 = oVar.f163933a;
                if (tabLayout8 == null) {
                    C89219l.m154715b();
                }
                tabLayout8.setSelectedTabIndicatorHeight(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o$e */
    static final class View$OnClickListenerC73055e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73050o f163945a;

        static {
            Covode.recordClassIndex(85758);
        }

        View$OnClickListenerC73055e(C73050o oVar) {
            this.f163945a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163945a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AbstractC73052b bVar = this.f163936d;
        if (bVar != null) {
            bVar.mo115482a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setStyle(0, R.style.z0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.f163935c = (PollStruct) serializable;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.google.android.material.bottomsheet.C26614b, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.C72919d, androidx.appcompat.app.C0242i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        onCreateDialog.setOnShowListener(new DialogInterface$OnShowListenerC73053c(this));
        return onCreateDialog;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o$c */
    static final class DialogInterface$OnShowListenerC73053c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C73050o f163943a;

        static {
            Covode.recordClassIndex(85756);
        }

        DialogInterface$OnShowListenerC73053c(C73050o oVar) {
            this.f163943a = oVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ChallengeViewPager challengeViewPager = this.f163943a.f163934b;
            View view = challengeViewPager;
            while (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof CoordinatorLayout.C0560e) || !(((CoordinatorLayout.C0560e) layoutParams).f2416a instanceof ViewPagerBottomSheetBehavior)) {
                    ViewParent parent = view.getParent();
                    if (parent != null && (parent instanceof View)) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                } else {
                    challengeViewPager.addOnPageChangeListener(new C72911a.C72912a(challengeViewPager, view, (byte) 0));
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        try {
            super.show(iVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.biw, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f163938g = a;
        if (a == null) {
            C89219l.m154710a("rootView");
        }
        this.f163933a = (TabLayout) a.findViewById(R.id.eee);
        View view = this.f163938g;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        this.f163934b = (ChallengeViewPager) view.findViewById(R.id.fgn);
        View view2 = this.f163938g;
        if (view2 == null) {
            C89219l.m154710a("rootView");
        }
        this.f163940i = (TextView) view2.findViewById(R.id.title);
        View view3 = this.f163938g;
        if (view3 == null) {
            C89219l.m154710a("rootView");
        }
        this.f163941j = (ImageView) view3.findViewById(R.id.bu5);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        C72883b bVar = new C72883b(childFragmentManager);
        this.f163939h = bVar;
        bVar.f163545a.add(C72894a.C72895a.m128734a(0, this.f163935c));
        C72883b bVar2 = this.f163939h;
        if (bVar2 == null) {
            C89219l.m154715b();
        }
        bVar2.f163545a.add(C72894a.C72895a.m128734a(1, this.f163935c));
        C72883b bVar3 = this.f163939h;
        if (bVar3 == null) {
            C89219l.m154715b();
        }
        Fragment fragment = bVar3.f163545a.get(0);
        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment");
        ((C72894a) fragment).f163559b = this.f163937e;
        C72883b bVar4 = this.f163939h;
        if (bVar4 == null) {
            C89219l.m154715b();
        }
        Fragment fragment2 = bVar4.f163545a.get(1);
        Objects.requireNonNull(fragment2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment");
        ((C72894a) fragment2).f163559b = this.f163937e;
        ChallengeViewPager challengeViewPager = this.f163934b;
        if (challengeViewPager != null) {
            challengeViewPager.setPagingEnable(false);
        }
        ChallengeViewPager challengeViewPager2 = this.f163934b;
        if (challengeViewPager2 != null) {
            challengeViewPager2.setAdapter(this.f163939h);
        }
        TabLayout tabLayout = this.f163933a;
        if (tabLayout != null) {
            tabLayout.post(new RunnableC73054d(this));
        }
        PollStruct pollStruct = this.f163935c;
        long j2 = 0;
        if (pollStruct == null || (options2 = pollStruct.getOptions()) == null || (optionsBean2 = options2.get(0)) == null) {
            j = 0;
        } else {
            j = optionsBean2.getPollCount();
        }
        PollStruct pollStruct2 = this.f163935c;
        if (!(pollStruct2 == null || (options = pollStruct2.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
            j2 = optionsBean.getPollCount();
        }
        String a2 = C53437b.m98615a(j + j2);
        TextView textView = this.f163940i;
        if (textView != null) {
            String string = getResources().getString(R.string.ha9);
            C89219l.m154716b(string, "");
            String a3 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{a2}, 1));
            C89219l.m154716b(a3, "");
            textView.setText(a3);
        }
        ImageView imageView = this.f163941j;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC73055e(this));
        }
        View view4 = this.f163938g;
        if (view4 == null) {
            C89219l.m154710a("rootView");
        }
        return view4;
    }
}
