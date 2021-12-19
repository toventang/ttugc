package com.p2082ss.android.ugc.aweme.mix.addfeed;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.p1230a.C17638b;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.p1615s.p1616a.C22112a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59388b;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59404d;
import com.p2082ss.android.ugc.aweme.mix.p3449d.C59530a;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment */
public final class AddFeedToMixFragment extends Fragment implements AbstractC59378c, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C59337c f135565i = new C59337c((byte) 0);

    /* renamed from: a */
    public Aweme f135566a;

    /* renamed from: b */
    public String f135567b = "";

    /* renamed from: c */
    public boolean f135568c;

    /* renamed from: d */
    public AbstractC59388b f135569d;

    /* renamed from: e */
    public String f135570e = "";

    /* renamed from: f */
    public String f135571f = "";

    /* renamed from: g */
    public String f135572g = "";

    /* renamed from: h */
    public boolean f135573h;

    /* renamed from: j */
    private final AbstractC89244h f135574j = C89250i.m154773a((AbstractC89171a) new C59349n(this));

    /* renamed from: k */
    private TuxNavBar.C23179a f135575k;

    /* renamed from: l */
    private final AbstractC89172b<C59340f, C89391z> f135576l = new C59347l(this);

    /* renamed from: m */
    private SparseArray f135577m;

    static {
        Covode.recordClassIndex(69714);
    }

    /* renamed from: a */
    public final View mo96995a(int i) {
        if (this.f135577m == null) {
            this.f135577m = new SparseArray();
        }
        View view = (View) this.f135577m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f135577m.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final GetMixListViewModel mo96996a() {
        return (GetMixListViewModel) this.f135574j.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(108, new RunnableC90250g(AddFeedToMixFragment.class, "onCreateMixListSuccess", C59404d.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$c */
    public static final class C59337c {
        static {
            Covode.recordClassIndex(69722);
        }

        private C59337c() {
        }

        public /* synthetic */ C59337c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$b */
    public static final class C59336b extends C59338d {

        /* renamed from: a */
        public UrlModel f135587a;

        /* renamed from: b */
        public int f135588b;

        /* renamed from: c */
        public String f135589c;

        /* renamed from: d */
        public boolean f135590d;

        static {
            Covode.recordClassIndex(69721);
        }

        @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.C59338d
        /* renamed from: a */
        public final boolean mo97010a() {
            return this.f135590d;
        }

        private C59336b() {
            super((byte) 0);
            this.f135587a = null;
            this.f135588b = 0;
            this.f135589c = null;
            this.f135590d = false;
        }

        public final int hashCode() {
            int i;
            UrlModel urlModel = this.f135587a;
            int i2 = 0;
            if (urlModel != null) {
                i = urlModel.hashCode();
            } else {
                i = 0;
            }
            int i3 = ((i * 31) + this.f135588b) * 31;
            String str = this.f135589c;
            if (str != null) {
                i2 = str.hashCode();
            }
            int i4 = (i3 + i2) * 31;
            boolean z = this.f135590d;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            return i4 + i5;
        }

        public final String toString() {
            return "AddFeedToMixListItem(cover=" + this.f135587a + ", type=" + this.f135588b + ", mixId=" + this.f135589c + ", select=" + this.f135590d + ")";
        }

        public /* synthetic */ C59336b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.C59338d
        /* renamed from: a */
        public final void mo97009a(boolean z) {
            this.f135590d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59336b)) {
                return false;
            }
            C59336b bVar = (C59336b) obj;
            if (!C89219l.m154714a(this.f135587a, bVar.f135587a) || this.f135588b != bVar.f135588b || !C89219l.m154714a((Object) this.f135589c, (Object) bVar.f135589c) || this.f135590d != bVar.f135590d) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$d */
    public static class C59338d implements AbstractC17641a {

        /* renamed from: a */
        private boolean f135591a;

        /* renamed from: e */
        public String f135592e;

        static {
            Covode.recordClassIndex(69723);
        }

        @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
        /* renamed from: c */
        public final Object mo28111c(AbstractC17641a aVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo97010a() {
            return this.f135591a;
        }

        private C59338d() {
            this.f135591a = false;
            this.f135592e = null;
        }

        public /* synthetic */ C59338d(byte b) {
            this();
        }

        /* renamed from: a */
        public void mo97009a(boolean z) {
            this.f135591a = z;
        }

        @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
        /* renamed from: b */
        public final boolean mo28110b(AbstractC17641a aVar) {
            return aVar.equals(this);
        }

        @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
        /* renamed from: a */
        public final boolean mo28109a(AbstractC17641a aVar) {
            return aVar.equals(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$i */
    static final class C59343i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135602a;

        /* renamed from: b */
        final /* synthetic */ View f135603b;

        static {
            Covode.recordClassIndex(69728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59343i(AddFeedToMixFragment addFeedToMixFragment, View view) {
            super(0);
            this.f135602a = addFeedToMixFragment;
            this.f135603b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r1.f135602a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.C59343i.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$h */
    static final class C59342h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135600a;

        /* renamed from: b */
        final /* synthetic */ View f135601b;

        static {
            Covode.recordClassIndex(69727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59342h(AddFeedToMixFragment addFeedToMixFragment, View view) {
            super(0);
            this.f135600a = addFeedToMixFragment;
            this.f135601b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AddFeedToMixFragment.m109044a(this.f135601b);
            this.f135600a.mo97000b();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f135577m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$n */
    static final class C59349n extends AbstractC89220m implements AbstractC89171a<GetMixListViewModel> {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135611a;

        static {
            Covode.recordClassIndex(69734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59349n(AddFeedToMixFragment addFeedToMixFragment) {
            super(0);
            this.f135611a = addFeedToMixFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GetMixListViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f135611a, (C1175ad.AbstractC1177b) null).mo3983a(GetMixListViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnKeyListener(View$OnKeyListenerC59348m.f135610a);
        }
    }

    /* renamed from: b */
    public final void mo97000b() {
        try {
            AbstractC0952i fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.mo3552a().mo3451a(R.anim.dq, R.anim.dx).mo3455a(this).mo3476d();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$AddFeedToMixListCell */
    public static final class AddFeedToMixListCell extends PowerCell<C59336b> {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f135578a = {new C89232y(AddFeedToMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0)};

        /* renamed from: b */
        private final AbstractC89248d f135579b = new C59331a(this);

        static {
            Covode.recordClassIndex(69715);
        }

        /* renamed from: a */
        public final AbstractC59378c mo97002a() {
            return (AbstractC59378c) this.f135579b.mo23374a(this, f135578a[0]);
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$AddFeedToMixListCell$a */
        public static final class C59331a implements AbstractC89248d<Object, AbstractC59378c> {

            /* renamed from: a */
            final /* synthetic */ PowerCell f135580a;

            static {
                Covode.recordClassIndex(69716);
            }

            public C59331a(PowerCell powerCell) {
                this.f135580a = powerCell;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
                if (r0 == null) goto L_0x004b;
             */
            @Override // p4600h.p4616h.AbstractC89248d
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ com.p2082ss.android.ugc.aweme.mix.addfeed.AbstractC59378c mo23374a(java.lang.Object r6, p4600h.p4620k.AbstractC89286i r7) {
                /*
                // Method dump skipped, instructions count: 149
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.AddFeedToMixListCell.C59331a.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        /* renamed from: a */
        public final View mo23349a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.akd, viewGroup, false);
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$AddFeedToMixListCell$b */
        static final class View$OnClickListenerC59332b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AddFeedToMixListCell f135581a;

            /* renamed from: b */
            final /* synthetic */ C59336b f135582b;

            static {
                Covode.recordClassIndex(69717);
            }

            View$OnClickListenerC59332b(AddFeedToMixListCell addFeedToMixListCell, C59336b bVar) {
                this.f135581a = addFeedToMixListCell;
                this.f135582b = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.CheckBox");
                CheckBox checkBox = (CheckBox) view;
                if (!checkBox.isChecked()) {
                    GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.m32713b(this.f135581a, GetMixListViewModel.class);
                    if (getMixListViewModel == null || !getMixListViewModel.f135661j) {
                        checkBox.setChecked(!checkBox.isChecked());
                        return;
                    }
                    GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.m32713b(this.f135581a, GetMixListViewModel.class);
                    if (getMixListViewModel2 != null) {
                        getMixListViewModel2.mo97042a(-1, (C59338d) null);
                    }
                }
                AbstractC59378c a = this.f135581a.mo97002a();
                if (a != null) {
                    a.mo96999a(new C59340f(checkBox.isChecked(), this.f135582b.f135589c, this.f135581a.getAdapterPosition(), this.f135582b));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$AddFeedToMixListCell$d */
        static final class View$OnClickListenerC59334d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AddFeedToMixListCell f135585a;

            static {
                Covode.recordClassIndex(69719);
            }

            View$OnClickListenerC59334d(AddFeedToMixListCell addFeedToMixListCell) {
                this.f135585a = addFeedToMixListCell;
            }

            public final void onClick(View view) {
                Context context;
                String str;
                String str2;
                Aweme aweme;
                ClickAgent.onClick(view);
                if (view != null && (context = view.getContext()) != null) {
                    Bundle bundle = new Bundle();
                    GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.m32713b(this.f135585a, GetMixListViewModel.class);
                    if (!(getMixListViewModel == null || (aweme = getMixListViewModel.f135658g) == null)) {
                        bundle.putSerializable("key_mix_add_aweme_info", aweme);
                    }
                    IMixFeedService k = MixFeedService.m109435k();
                    GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.m32713b(this.f135585a, GetMixListViewModel.class);
                    if (getMixListViewModel2 == null || (str = getMixListViewModel2.f135659h) == null) {
                        str = "";
                    }
                    GetMixListViewModel getMixListViewModel3 = (GetMixListViewModel) PowerCell.m32713b(this.f135585a, GetMixListViewModel.class);
                    if (getMixListViewModel3 == null || (str2 = getMixListViewModel3.f135660i) == null) {
                        str2 = "";
                    }
                    k.mo97312a(context, bundle, 3, str, str2);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$AddFeedToMixListCell$c */
        static final class View$OnClickListenerC59333c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AddFeedToMixListCell f135583a;

            /* renamed from: b */
            final /* synthetic */ C59336b f135584b;

            static {
                Covode.recordClassIndex(69718);
            }

            View$OnClickListenerC59333c(AddFeedToMixListCell addFeedToMixListCell, C59336b bVar) {
                this.f135583a = addFeedToMixListCell;
                this.f135584b = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f135583a.itemView;
                C89219l.m154716b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.brd);
                C89219l.m154716b(appCompatCheckBox, "");
                if (appCompatCheckBox.isChecked()) {
                    GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.m32713b(this.f135583a, GetMixListViewModel.class);
                    if (getMixListViewModel != null && getMixListViewModel.f135661j) {
                        GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.m32713b(this.f135583a, GetMixListViewModel.class);
                        if (getMixListViewModel2 != null) {
                            getMixListViewModel2.mo97042a(-1, (C59338d) null);
                        }
                    } else {
                        return;
                    }
                }
                View view3 = this.f135583a.itemView;
                C89219l.m154716b(view3, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.brd);
                C89219l.m154716b(appCompatCheckBox2, "");
                View view4 = this.f135583a.itemView;
                C89219l.m154716b(view4, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.brd);
                C89219l.m154716b(appCompatCheckBox3, "");
                appCompatCheckBox2.setChecked(true ^ appCompatCheckBox3.isChecked());
                AbstractC59378c a = this.f135583a.mo97002a();
                if (a != null) {
                    View view5 = this.f135583a.itemView;
                    C89219l.m154716b(view5, "");
                    AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) view5.findViewById(R.id.brd);
                    C89219l.m154716b(appCompatCheckBox4, "");
                    a.mo96999a(new C59340f(appCompatCheckBox4.isChecked(), this.f135584b.f135589c, this.f135583a.getAdapterPosition(), this.f135584b));
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
        @Override // com.bytedance.ies.powerlist.PowerCell
        /* renamed from: a */
        public final /* synthetic */ void mo23350a(C59336b bVar) {
            C59336b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            int i = bVar2.f135588b;
            if (i == 0) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                ((TuxIconView) view.findViewById(R.id.br5)).setBackgroundResource(2131233252);
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                ((TuxTextView) view2.findViewById(R.id.br9)).setTuxFont(42);
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                ((TuxTextView) view3.findViewById(R.id.br9)).setText(R.string.aw0);
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view4.findViewById(R.id.brd);
                C89219l.m154716b(appCompatCheckBox, "");
                appCompatCheckBox.setVisibility(8);
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                ((AutoRTLImageView) view5.findViewById(R.id.bre)).setBackgroundResource(2131233241);
                View view6 = this.itemView;
                C89219l.m154716b(view6, "");
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view6.findViewById(R.id.bre);
                C89219l.m154716b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(0);
                this.itemView.setOnClickListener(new View$OnClickListenerC59334d(this));
            } else if (i == 1) {
                View view7 = this.itemView;
                C89219l.m154716b(view7, "");
                ((TuxIconView) view7.findViewById(R.id.br5)).setBackgroundResource(2131233256);
                View view8 = this.itemView;
                C89219l.m154716b(view8, "");
                ((TuxTextView) view8.findViewById(R.id.br9)).setTuxFont(41);
                View view9 = this.itemView;
                C89219l.m154716b(view9, "");
                TuxTextView tuxTextView = (TuxTextView) view9.findViewById(R.id.br9);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(bVar2.f135592e);
                View view10 = this.itemView;
                C89219l.m154716b(view10, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view10.findViewById(R.id.brd);
                C89219l.m154716b(appCompatCheckBox2, "");
                appCompatCheckBox2.setChecked(bVar2.f135590d);
                View view11 = this.itemView;
                C89219l.m154716b(view11, "");
                ((AppCompatCheckBox) view11.findViewById(R.id.brd)).setOnClickListener(new View$OnClickListenerC59332b(this, bVar2));
                View view12 = this.itemView;
                C89219l.m154716b(view12, "");
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) view12.findViewById(R.id.bre);
                C89219l.m154716b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(8);
                View view13 = this.itemView;
                C89219l.m154716b(view13, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view13.findViewById(R.id.brd);
                C89219l.m154716b(appCompatCheckBox3, "");
                appCompatCheckBox3.setVisibility(0);
                this.itemView.setOnClickListener(new View$OnClickListenerC59333c(this, bVar2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$a */
    public static final class C59335a {

        /* renamed from: a */
        public boolean f135586a;

        static {
            Covode.recordClassIndex(69720);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C59335a) && this.f135586a == ((C59335a) obj).f135586a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f135586a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "AddButtonPowerData(buttonEnabled=" + this.f135586a + ")";
        }

        public C59335a(boolean z) {
            this.f135586a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$k */
    public static final class C59346k extends C22112a {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135608a;

        static {
            Covode.recordClassIndex(69731);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59346k(AddFeedToMixFragment addFeedToMixFragment) {
            this.f135608a = addFeedToMixFragment;
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36298a(Exception exc) {
            super.mo36298a(exc);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f135608a.mo96995a(R.id.gy);
            if (dmtStatusView != null) {
                dmtStatusView.mo27387h();
            }
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36299a(boolean z) {
            super.mo36299a(z);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f135608a.mo96995a(R.id.gy);
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$g */
    static final class View$OnClickListenerC59341g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135599a;

        static {
            Covode.recordClassIndex(69726);
        }

        View$OnClickListenerC59341g(AddFeedToMixFragment addFeedToMixFragment) {
            this.f135599a = addFeedToMixFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f135599a.mo96996a().mo97043b();
        }
    }

    /* renamed from: a */
    public static void m109044a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) m109043a(view.getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j */
    static final class View$OnClickListenerC59344j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135604a;

        /* renamed from: b */
        final /* synthetic */ View f135605b;

        static {
            Covode.recordClassIndex(69729);
        }

        View$OnClickListenerC59344j(AddFeedToMixFragment addFeedToMixFragment, View view) {
            this.f135604a = addFeedToMixFragment;
            this.f135605b = view;
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j$a */
        public static final class C59345a implements AbstractC59387a {

            /* renamed from: a */
            final /* synthetic */ Aweme f135606a;

            /* renamed from: b */
            final /* synthetic */ View$OnClickListenerC59344j f135607b;

            static {
                Covode.recordClassIndex(69730);
            }

            @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a
            /* renamed from: b */
            public final void mo84871b(boolean z) {
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a
            /* renamed from: a */
            public final void mo84870a(boolean r4) {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f135607b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r1 = r0.f135604a
                    r0 = 2131362666(0x7f0a036a, float:1.834512E38)
                    android.view.View r1 = r1.mo96995a(r0)
                    com.bytedance.tux.button.TuxButton r1 = (com.bytedance.tux.button.TuxButton) r1
                    r0 = 0
                    r1.setLoading(r0)
                    if (r4 == 0) goto L_0x0046
                    com.ss.android.ugc.aweme.feed.model.PlayListInfo r1 = new com.ss.android.ugc.aweme.feed.model.PlayListInfo
                    r1.<init>()
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f135607b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f135604a
                    java.lang.String r0 = r0.f135567b
                    r1.setMixId(r0)
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f135607b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f135604a
                    java.lang.String r0 = r0.f135570e
                    r1.setMixName(r0)
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f135607b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f135604a
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f135566a
                    if (r0 == 0) goto L_0x0034
                    r0.playlist_info = r1
                L_0x0034:
                    com.ss.android.ugc.aweme.mix.b.j r2 = new com.ss.android.ugc.aweme.mix.b.j
                    r1 = 1
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f135606a
                    r2.<init>(r1, r0)
                    com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r2)
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f135607b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f135604a
                    com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                L_0x0046:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.View$OnClickListenerC59344j.C59345a.mo84870a(boolean):void");
            }

            C59345a(Aweme aweme, View$OnClickListenerC59344j jVar) {
                this.f135606a = aweme;
                this.f135607b = jVar;
            }
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            boolean z2 = true;
            if (this.f135604a.getActivity() != null) {
                if (this.f135604a.f135568c) {
                    AbstractC59388b bVar = this.f135604a.f135569d;
                    if (bVar != null) {
                        bVar.chooseMixResult(this.f135604a.f135567b, this.f135604a.f135570e);
                    }
                    this.f135604a.mo97000b();
                } else {
                    ((TuxButton) this.f135604a.mo96995a(R.id.ww)).setLoading(true);
                    Aweme aweme = this.f135604a.f135566a;
                    if (aweme != null) {
                        ActivityC0945e activity = this.f135604a.getActivity();
                        if (activity == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity, "");
                        Aweme aweme2 = this.f135604a.f135566a;
                        if (aweme2 == null) {
                            C89219l.m154715b();
                        }
                        String str2 = this.f135604a.f135567b;
                        if (str2 == null) {
                            C89219l.m154715b();
                        }
                        C59530a.m109170a(activity, aweme2, str2, MixFeedApi.EnumC59386b.VIDEOADD.getOperation(), new C59345a(aweme, this), this.f135604a.f135571f, this.f135604a.f135572g);
                    }
                }
                AddFeedToMixFragment.m109044a(this.f135605b);
            }
            AddFeedToMixFragment addFeedToMixFragment = this.f135604a;
            if (TextUtils.isEmpty(addFeedToMixFragment.f135567b) || TextUtils.isEmpty(addFeedToMixFragment.f135570e)) {
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(addFeedToMixFragment.f135567b) || TextUtils.isEmpty(addFeedToMixFragment.f135570e)) {
                z2 = false;
            }
            if (z) {
                str = "exist";
            } else if (z2) {
                str = "new";
            } else {
                str = "";
            }
            String str3 = addFeedToMixFragment.f135567b;
            String str4 = addFeedToMixFragment.f135571f;
            C89219l.m154721d(str, "");
            C39162r.m79460a("add_split_to_playlist", new C33744d().mo59983a("playlist_id", str3).mo59983a("playlist_status", str).mo59983a("enter_from", str4).f79943a);
            if (C89219l.m154714a((Object) str, (Object) "new")) {
                C59330a.m109038b(addFeedToMixFragment.f135571f, addFeedToMixFragment.f135572g);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCreateMixListSuccess(C59404d dVar) {
        C89219l.m154721d(dVar, "");
        if (!dVar.f135701e && dVar.f135697a && !TextUtils.isEmpty(dVar.f135699c) && !TextUtils.isEmpty(dVar.f135698b)) {
            ((DmtStatusView) mo96995a(R.id.gy)).mo27384f();
            GetMixListViewModel a = mo96996a();
            String str = dVar.f135699c;
            C89219l.m154721d(str, "");
            a.f135657f = str;
            a.f135652a = -1;
            a.f135653b = null;
            mo96996a().mo97043b();
            if (!TextUtils.isEmpty(dVar.f135699c)) {
                this.f135567b = dVar.f135699c;
                this.f135570e = dVar.f135698b;
                TuxButton tuxButton = (TuxButton) mo96995a(R.id.ww);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setEnabled(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AbstractC59378c
    /* renamed from: a */
    public final void mo96997a(C59335a aVar) {
        C89219l.m154721d(aVar, "");
        TuxButton tuxButton = (TuxButton) mo96995a(R.id.ww);
        if (tuxButton != null) {
            tuxButton.setEnabled(aVar.f135586a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        boolean z;
        String str2;
        String str3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str4 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_add_mix_aweme");
        } else {
            serializable = null;
        }
        this.f135566a = (Aweme) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("key_choosed_mix_id");
        } else {
            str = null;
        }
        this.f135567b = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str4 = arguments3.getString("key_choosed_mix_name");
        }
        this.f135570e = str4;
        mo96996a().f135658g = this.f135566a;
        GetMixListViewModel a = mo96996a();
        String str5 = this.f135567b;
        if (str5 == null) {
            str5 = "";
        }
        C89219l.m154721d(str5, "");
        a.f135657f = str5;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z = arguments4.getBoolean("key_full_scrren", false);
        } else {
            z = false;
        }
        this.f135568c = z;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str2 = arguments5.getString("enter_from")) == null) {
            str2 = "";
        }
        this.f135571f = str2;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (str3 = arguments6.getString("enter_method")) == null) {
            str3 = "";
        }
        this.f135572g = str3;
        GetMixListViewModel a2 = mo96996a();
        String str6 = this.f135571f;
        String str7 = this.f135572g;
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        a2.f135659h = str6;
        a2.f135660i = str7;
        if (this.f135568c) {
            mo96996a().f135654c = false;
            mo96996a().f135661j = true;
        }
        if (SplitVideoServiceImpl.m120147a().showPlayList() || SplitVideoServiceImpl.m120147a().playListAutoTake()) {
            mo96996a().f135655d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$l */
    static final class C59347l extends AbstractC89220m implements AbstractC89172b<C59340f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddFeedToMixFragment f135609a;

        static {
            Covode.recordClassIndex(69732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59347l(AddFeedToMixFragment addFeedToMixFragment) {
            super(1);
            this.f135609a = addFeedToMixFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59340f fVar) {
            boolean z;
            C59338d dVar;
            Integer num;
            C59340f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            boolean z2 = false;
            if (!this.f135609a.f135568c || !this.f135609a.f135573h) {
                z = false;
            } else {
                z = true;
            }
            TuxButton tuxButton = (TuxButton) this.f135609a.mo96995a(R.id.ww);
            C89219l.m154716b(tuxButton, "");
            if (this.f135609a.mo96996a().f135652a != -1 || fVar2.f135595a || z) {
                z2 = true;
            }
            tuxButton.setEnabled(z2);
            PowerList powerList = (PowerList) this.f135609a.mo96995a(R.id.db8);
            C89219l.m154716b(powerList, "");
            AbstractC17641a b = powerList.getState().mo28135b(fVar2.f135597c);
            if (!(b instanceof C59338d)) {
                b = null;
            }
            C59338d dVar2 = (C59338d) b;
            if (dVar2 != null) {
                dVar2.mo97009a(fVar2.f135595a);
                PowerList powerList2 = (PowerList) this.f135609a.mo96995a(R.id.db8);
                C89219l.m154716b(powerList2, "");
                powerList2.getState().mo28136b(fVar2.f135597c, dVar2);
            }
            TuxButton tuxButton2 = (TuxButton) this.f135609a.mo96995a(R.id.ww);
            C89219l.m154716b(tuxButton2, "");
            if (tuxButton2.isEnabled()) {
                TuxButton tuxButton3 = (TuxButton) this.f135609a.mo96995a(R.id.ww);
                Resources resources = this.f135609a.getResources();
                if (resources != null) {
                    num = Integer.valueOf(resources.getColor(R.color.l));
                } else {
                    num = null;
                }
                tuxButton3.setTextColor(num.intValue());
            }
            if (fVar2.f135595a && (dVar = this.f135609a.mo96996a().f135653b) != null) {
                dVar.mo97009a(true ^ dVar.mo97010a());
                PowerList powerList3 = (PowerList) this.f135609a.mo96995a(R.id.db8);
                C89219l.m154716b(powerList3, "");
                powerList3.getState().mo28136b(this.f135609a.mo96996a().f135652a, dVar);
            }
            if (fVar2.f135595a) {
                this.f135609a.f135567b = fVar2.f135596b;
                this.f135609a.f135570e = fVar2.f135598d.f135592e;
            } else {
                this.f135609a.f135567b = "";
                this.f135609a.f135570e = "";
            }
            if (fVar2.f135595a) {
                GetMixListViewModel a = this.f135609a.mo96996a();
                int i = fVar2.f135597c;
                PowerList powerList4 = (PowerList) this.f135609a.mo96995a(R.id.db8);
                C89219l.m154716b(powerList4, "");
                AbstractC17641a b2 = powerList4.getState().mo28135b(fVar2.f135597c);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.MixListItem");
                a.mo97042a(i, (C59338d) b2);
            } else {
                this.f135609a.mo96996a().mo97042a(-1, (C59338d) null);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AbstractC59378c
    /* renamed from: a */
    public final void mo96998a(C59339e eVar) {
        C89219l.m154721d(eVar, "");
        if (eVar.f135593a) {
            this.f135570e = eVar.f135594b;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AbstractC59378c
    /* renamed from: a */
    public final void mo96999a(C59340f fVar) {
        C89219l.m154721d(fVar, "");
        this.f135576l.invoke(fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$e */
    public static final class C59339e {

        /* renamed from: a */
        public boolean f135593a;

        /* renamed from: b */
        public String f135594b;

        static {
            Covode.recordClassIndex(69724);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59339e)) {
                return false;
            }
            C59339e eVar = (C59339e) obj;
            return this.f135593a == eVar.f135593a && C89219l.m154714a(this.f135594b, eVar.f135594b);
        }

        public final int hashCode() {
            boolean z = this.f135593a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.f135594b;
            return i4 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "MixNamePowerData(btnAble=" + this.f135593a + ", mixName=" + this.f135594b + ")";
        }

        public C59339e(boolean z, String str) {
            this.f135593a = z;
            this.f135594b = str;
        }
    }

    /* renamed from: a */
    private static Object m109043a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1998);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1998);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(1919);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView dmtStatusView = (DmtStatusView) mo96995a(R.id.gy);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.akt, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.bhk);
        C89219l.m154716b(findViewById, "");
        View findViewById2 = inflate.findViewById(R.id.f63);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.ev0);
        C89219l.m154716b(findViewById3, "");
        TextView textView2 = (TextView) findViewById3;
        ((AutoRTLImageView) findViewById).setBackgroundResource(2131232650);
        if (getContext() != null) {
            textView.setText(R.string.dgb);
            textView2.setVisibility(8);
        }
        C89219l.m154716b(inflate, "");
        DmtStatusView.C17269a a2 = a.mo27406b(inflate).mo27401a(R.string.fz3, new View$OnClickListenerC59341g(this));
        a2.f41304g = 0;
        dmtStatusView.setBuilder(a2);
        ((DmtStatusView) mo96995a(R.id.gy)).mo27384f();
        this.f135575k = new TuxNavBar.C23179a();
        C0792v.m2768e(view);
        TuxNavBar.C23179a aVar = this.f135575k;
        if (aVar == null) {
            C89219l.m154710a("navActions");
        }
        if (this.f135568c) {
            C23187b a3 = new C23187b().mo37738a(R.raw.icon_arrow_left_ltr);
            a3.f54930b = true;
            aVar.mo37732a(a3.mo37741a((AbstractC89171a<C89391z>) new C59342h(this, view)));
            View a4 = mo96995a(R.id.a0a);
            C89219l.m154716b(a4, "");
            a4.setVisibility(0);
            TuxButton tuxButton = (TuxButton) mo96995a(R.id.ww);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setText(getResources().getText(R.string.baq));
        } else {
            C23187b a5 = new C23187b().mo37738a(R.raw.icon_x_mark);
            a5.f54930b = true;
            aVar.mo37733b(a5.mo37741a((AbstractC89171a<C89391z>) new C59343i(this, view)));
            View a6 = mo96995a(R.id.a0a);
            C89219l.m154716b(a6, "");
            a6.setVisibility(8);
        }
        C23194g gVar = new C23194g();
        String string = getString(R.string.pa);
        C89219l.m154716b(string, "");
        aVar.mo37731a(gVar.mo37753a(string));
        TuxNavBar tuxNavBar = (TuxNavBar) mo96995a(R.id.cpv);
        TuxNavBar.C23179a aVar2 = this.f135575k;
        if (aVar2 == null) {
            C89219l.m154710a("navActions");
        }
        tuxNavBar.setNavActions(aVar2);
        ((TuxNavBar) mo96995a(R.id.cpv)).mo37727a(true);
        if (!TextUtils.isEmpty(this.f135567b) && !TextUtils.isEmpty(this.f135570e)) {
            TuxButton tuxButton2 = (TuxButton) mo96995a(R.id.ww);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setEnabled(true);
            this.f135573h = true;
        }
        RecyclerView recyclerView = (RecyclerView) mo96995a(R.id.db8);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            PowerStub g = ((PowerAdapter) adapter).mo28058g();
            if (g != null) {
                C17638b e = g.mo28103e();
                if (!e.mo28105a().containsKey(AddFeedToMixFragment.class)) {
                    e.mo28105a().put(AddFeedToMixFragment.class, this);
                } else {
                    RuntimeException runtimeException = new RuntimeException("already contains control type :" + AddFeedToMixFragment.class);
                    MethodCollector.m26664o(1919);
                    throw runtimeException;
                }
            }
            ((PowerList) mo96995a(R.id.db8)).mo28083a(AddFeedToMixListCell.class, DefaultMixListCell.class);
            ((PowerList) mo96995a(R.id.db8)).mo28082a(mo96996a().mo97040a());
            RecyclerView recyclerView2 = (RecyclerView) mo96995a(R.id.db8);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setItemAnimator(null);
            ((TuxButton) mo96995a(R.id.ww)).setOnClickListener(new View$OnClickListenerC59344j(this, view));
            ((PowerList) mo96995a(R.id.db8)).mo28081a(new C59346k(this));
            mo96996a().mo97043b();
            EventBus.m156966a(EventBus.m156962a(), this);
            MethodCollector.m26664o(1919);
            return;
        }
        C89388w wVar = new C89388w("null cannot be cast to non-null type");
        MethodCollector.m26664o(1919);
        throw wVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.akm, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$m */
    static final class View$OnKeyListenerC59348m implements View.OnKeyListener {

        /* renamed from: a */
        public static final View$OnKeyListenerC59348m f135610a = new View$OnKeyListenerC59348m();

        static {
            Covode.recordClassIndex(69733);
        }

        View$OnKeyListenerC59348m() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(keyEvent, "");
            if (i == 4 && keyEvent.getAction() == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$f */
    public static final class C59340f {

        /* renamed from: a */
        public boolean f135595a;

        /* renamed from: b */
        public String f135596b;

        /* renamed from: c */
        public int f135597c;

        /* renamed from: d */
        public C59338d f135598d;

        static {
            Covode.recordClassIndex(69725);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59340f)) {
                return false;
            }
            C59340f fVar = (C59340f) obj;
            return this.f135595a == fVar.f135595a && C89219l.m154714a(this.f135596b, fVar.f135596b) && this.f135597c == fVar.f135597c && C89219l.m154714a(this.f135598d, fVar.f135598d);
        }

        public final int hashCode() {
            boolean z = this.f135595a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.f135596b;
            int i5 = 0;
            int hashCode = (((i4 + (str != null ? str.hashCode() : 0)) * 31) + this.f135597c) * 31;
            C59338d dVar = this.f135598d;
            if (dVar != null) {
                i5 = dVar.hashCode();
            }
            return hashCode + i5;
        }

        public final String toString() {
            return "MixPowerData(btnAble=" + this.f135595a + ", selectedMixId=" + this.f135596b + ", position=" + this.f135597c + ", item=" + this.f135598d + ")";
        }

        public C59340f(boolean z, String str, int i, C59338d dVar) {
            C89219l.m154721d(dVar, "");
            this.f135595a = z;
            this.f135596b = str;
            this.f135597c = i;
            this.f135598d = dVar;
        }
    }
}
