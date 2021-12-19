package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57186j;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57292p;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.u */
public final class C57228u extends AbstractC34586a implements AbstractC1214u<C33942b> {

    /* renamed from: a */
    public static final C57229a f130359a = new C57229a((byte) 0);

    /* renamed from: b */
    private DmtTabLayout f130360b;

    /* renamed from: c */
    private RtlViewPager f130361c;

    /* renamed from: d */
    private TextTitleBar f130362d;

    /* renamed from: e */
    private TuxStatusView f130363e;

    /* renamed from: j */
    private C57186j f130364j;

    /* renamed from: k */
    private String f130365k;

    /* renamed from: l */
    private String f130366l;

    /* renamed from: m */
    private String f130367m;

    /* renamed from: n */
    private boolean f130368n;

    /* renamed from: o */
    private String f130369o;

    /* renamed from: p */
    private int f130370p;

    /* renamed from: q */
    private DataCenter f130371q;

    /* renamed from: r */
    private C57238a f130372r;

    /* renamed from: s */
    private int f130373s;

    /* renamed from: t */
    private int f130374t;

    /* renamed from: u */
    private HashMap f130375u;

    static {
        Covode.recordClassIndex(67133);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.u$a */
    public static final class C57229a {
        static {
            Covode.recordClassIndex(67134);
        }

        private C57229a() {
        }

        public /* synthetic */ C57229a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.u$d */
    public static final class C57232d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57228u f130378a;

        static {
            Covode.recordClassIndex(67137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57232d(C57228u uVar) {
            super(0);
            this.f130378a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f130378a.mo94452b();
            this.f130378a.mo94450a();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f130375u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo94450a() {
        C57238a aVar = this.f130372r;
        if (aVar != null) {
            aVar.mo94460b(this.f130365k, this.f130370p);
        }
    }

    /* renamed from: b */
    public final void mo94452b() {
        TuxStatusView tuxStatusView = this.f130363e;
        if (tuxStatusView == null) {
            C89219l.m154710a("dmtStatusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f130363e;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("dmtStatusView");
        }
        tuxStatusView2.mo37867a();
    }

    /* renamed from: c */
    private void m103788c() {
        TuxStatusView tuxStatusView = this.f130363e;
        if (tuxStatusView == null) {
            C89219l.m154710a("dmtStatusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f130363e;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("dmtStatusView");
        }
        tuxStatusView2.setStatus(C79440a.m138171b(new TuxStatusView.C23263c(), new C57232d(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.u$b */
    public static final class C57230b implements DmtTabLayout.AbstractC17289c {

        /* renamed from: a */
        final /* synthetic */ C57228u f130376a;

        static {
            Covode.recordClassIndex(67135);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57230b(C57228u uVar) {
            this.f130376a = uVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: a */
        public final void mo27574a(DmtTabLayout.C17294f fVar) {
            if (fVar != null && fVar.f41525f != null) {
                View view = fVar.f41525f;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.choosemusic.view.MusicTabItemView");
                ((C57292p) view).mo94493a();
            }
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: b */
        public final void mo27575b(DmtTabLayout.C17294f fVar) {
            Integer num;
            Resources resources;
            if (!(fVar == null || fVar.f41525f == null)) {
                View view = fVar.f41525f;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.choosemusic.view.MusicTabItemView");
                C57292p pVar = (C57292p) view;
                Context context = pVar.f130516a;
                if (!(context == null || (resources = context.getResources()) == null)) {
                    pVar.setTextColor(resources.getColor(R.color.c2));
                }
            }
            C57228u uVar = this.f130376a;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f41524e);
            } else {
                num = null;
            }
            uVar.mo94451a(num);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.u$c */
    public static final class C57231c implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C57228u f130377a;

        static {
            Covode.recordClassIndex(67136);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57231c(C57228u uVar) {
            this.f130377a = uVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            if (this.f130377a.getActivity() != null) {
                ActivityC0945e activity = this.f130377a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    private static NetworkInfo m103784a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f130365k = arguments.getString("music_class_id");
            this.f130366l = arguments.getString("music_class_name");
            this.f130367m = arguments.getString("music_class_enter_from");
            this.f130368n = arguments.getBoolean("music_class_is_hot", false);
            this.f130369o = arguments.getString("music_class_enter_method");
            this.f130373s = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.f130370p = arguments.getInt("music_class_level");
        }
    }

    /* renamed from: a */
    private static boolean m103787a(Context context) {
        if (context != null) {
            try {
                Object a = m103785a(context, "connectivity");
                if (a != null) {
                    NetworkInfo a2 = m103784a((ConnectivityManager) a);
                    if (a2 == null || !a2.isAvailable()) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: a */
    public final void mo94451a(Integer num) {
        ArrayList<C57221p> arrayList;
        C57221p pVar = null;
        if (num != null) {
            int intValue = num.intValue();
            C57186j jVar = this.f130364j;
            if (!(jVar == null || (arrayList = jVar.f130212a) == null)) {
                pVar = arrayList.get(intValue);
            }
        }
        if (pVar instanceof C57221p) {
            RecyclerView.AbstractC1350a k = pVar.mo94421k();
            if (k instanceof C57174b) {
                ((C57174b) k).mo94375l();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        C33935b<String, Object> bVar2;
        List<C57110d> list;
        ArrayList<C57110d> arrayList;
        C57110d dVar;
        ArrayList<C57110d> arrayList2;
        C33942b bVar3 = bVar;
        if (bVar3 != null) {
            String str = bVar3.f80277a;
            int hashCode = str.hashCode();
            if (hashCode != -314811087) {
                if (hashCode == -252789122 && str.equals("second_level_music_list")) {
                    TuxStatusView tuxStatusView = this.f130363e;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("dmtStatusView");
                    }
                    tuxStatusView.setVisibility(8);
                    DataCenter dataCenter = this.f130371q;
                    if (dataCenter != null) {
                        bVar2 = (C33935b) dataCenter.mo60192a("second_level_music_list");
                        if (bVar2 != null) {
                            list = (List) bVar2.mo60174a("list_collection_data");
                        }
                        list = null;
                    } else {
                        bVar2 = null;
                        list = null;
                    }
                    if (C13603b.m24435a((Collection) list)) {
                        TuxStatusView tuxStatusView2 = this.f130363e;
                        if (tuxStatusView2 == null) {
                            C89219l.m154710a("dmtStatusView");
                        }
                        tuxStatusView2.setVisibility(0);
                        TuxStatusView tuxStatusView3 = this.f130363e;
                        if (tuxStatusView3 == null) {
                            C89219l.m154710a("dmtStatusView");
                        }
                        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                        String string = getString(R.string.cm7);
                        C89219l.m154716b(string, "");
                        tuxStatusView3.setStatus(cVar.mo37878a((CharSequence) string));
                        return;
                    }
                    if (list != null) {
                        int i = 0;
                        for (C57110d dVar2 : list) {
                            C57186j jVar = this.f130364j;
                            if (!(jVar == null || (arrayList2 = jVar.f130213b) == null)) {
                                arrayList2.add(dVar2);
                            }
                            if (this.f130370p == 1) {
                                if (i == 0) {
                                    C57186j jVar2 = this.f130364j;
                                    if (jVar2 != null) {
                                        jVar2.mo94385a(dVar2.f130024a, dVar2.f130025b, dVar2.f130028e, bVar2);
                                    }
                                } else {
                                    C57186j jVar3 = this.f130364j;
                                    if (jVar3 != null) {
                                        jVar3.mo94385a(dVar2.f130024a, dVar2.f130025b, dVar2.f130028e, null);
                                    }
                                }
                            }
                            i++;
                        }
                    }
                    RtlViewPager rtlViewPager = this.f130361c;
                    if (rtlViewPager == null) {
                        C89219l.m154710a("mSecondLevelViewPager");
                    }
                    rtlViewPager.setAdapter(this.f130364j);
                    DmtTabLayout dmtTabLayout = this.f130360b;
                    if (dmtTabLayout == null) {
                        C89219l.m154710a("mSecondLevelTabLayout");
                    }
                    RtlViewPager rtlViewPager2 = this.f130361c;
                    if (rtlViewPager2 == null) {
                        C89219l.m154710a("mSecondLevelViewPager");
                    }
                    dmtTabLayout.setupWithViewPager(rtlViewPager2);
                    DmtTabLayout dmtTabLayout2 = this.f130360b;
                    if (dmtTabLayout2 == null) {
                        C89219l.m154710a("mSecondLevelTabLayout");
                    }
                    int tabCount = dmtTabLayout2.getTabCount();
                    for (int i2 = 0; i2 < tabCount; i2++) {
                        C57292p pVar = new C57292p(getContext());
                        C57186j jVar4 = this.f130364j;
                        String str2 = (jVar4 == null || (arrayList = jVar4.f130213b) == null || (dVar = arrayList.get(i2)) == null) ? null : dVar.f130025b;
                        DmtTabLayout dmtTabLayout3 = this.f130360b;
                        if (dmtTabLayout3 == null) {
                            C89219l.m154710a("mSecondLevelTabLayout");
                        }
                        DmtTabLayout.C17294f b = dmtTabLayout3.mo27529b(i2);
                        pVar.setText(str2);
                        if (b != null) {
                            b.mo27590a(pVar);
                            b.f41520a = str2;
                        }
                        if (i2 == 0) {
                            pVar.mo94493a();
                        }
                        DmtTabLayout dmtTabLayout4 = this.f130360b;
                        if (dmtTabLayout4 == null) {
                            C89219l.m154710a("mSecondLevelTabLayout");
                        }
                        int tabCount2 = dmtTabLayout4.getTabCount();
                        DmtTabLayout dmtTabLayout5 = this.f130360b;
                        if (dmtTabLayout5 == null) {
                            C89219l.m154710a("mSecondLevelTabLayout");
                        }
                        View d = dmtTabLayout5.mo27533d(i2);
                        if (d != null) {
                            if (i2 == 0) {
                                if (tabCount2 == 1) {
                                    int i3 = this.f130374t;
                                    m103786a(d, i3, i3);
                                } else {
                                    m103786a(d, this.f130374t, -1);
                                }
                            } else if (i2 == tabCount2 - 1) {
                                m103786a(d, -1, this.f130374t);
                            }
                        }
                    }
                    DmtTabLayout dmtTabLayout6 = this.f130360b;
                    if (dmtTabLayout6 == null) {
                        C89219l.m154710a("mSecondLevelTabLayout");
                    }
                    dmtTabLayout6.mo27521a(new C57230b(this));
                }
            } else if (str.equals("status_second_level_music_list")) {
                Integer num = (Integer) bVar3.mo60212a();
                if (num == null || num.intValue() != 0) {
                    m103788c();
                }
            }
        }
    }

    /* renamed from: a */
    private static Object m103785a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5886);
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
                    MethodCollector.m26664o(5886);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RtlViewPager rtlViewPager = this.f130361c;
        if (rtlViewPager == null) {
            C89219l.m154710a("mSecondLevelViewPager");
        }
        rtlViewPager.setOffscreenPageLimit(1);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        this.f130364j = new C57186j(childFragmentManager, this.f130365k, this.f130366l, this.f130367m, this.f130373s, this.f130368n, this.f130369o, this.f130370p);
        DmtTabLayout dmtTabLayout = this.f130360b;
        if (dmtTabLayout == null) {
            C89219l.m154710a("mSecondLevelTabLayout");
        }
        dmtTabLayout.setTabMode(0);
        DmtTabLayout dmtTabLayout2 = this.f130360b;
        if (dmtTabLayout2 == null) {
            C89219l.m154710a("mSecondLevelTabLayout");
        }
        dmtTabLayout2.setTabMaxWidth(Integer.MAX_VALUE);
        if (!m103787a(getContext())) {
            m103788c();
        } else {
            mo94450a();
        }
    }

    /* renamed from: a */
    private static void m103786a(View view, int i, int i2) {
        if (i != -1 || i2 != -1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i != -1) {
                int i3 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(i);
            }
            if (i2 != -1) {
                int i4 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginEnd(i2);
            }
            view.setLayoutParams(marginLayoutParams);
            view.invalidate();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.add, viewGroup, false);
        View findViewById = a.findViewById(R.id.dt6);
        C89219l.m154716b(findViewById, "");
        this.f130360b = (DmtTabLayout) findViewById;
        View findViewById2 = a.findViewById(R.id.dt9);
        C89219l.m154716b(findViewById2, "");
        this.f130361c = (RtlViewPager) findViewById2;
        View findViewById3 = a.findViewById(R.id.co_);
        C89219l.m154716b(findViewById3, "");
        this.f130363e = (TuxStatusView) findViewById3;
        View findViewById4 = a.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById4, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById4;
        this.f130362d = textTitleBar;
        if (textTitleBar == null) {
            C89219l.m154710a("textTitleBar");
        }
        textTitleBar.setOnTitleBarClickListener(new C57231c(this));
        TextTitleBar textTitleBar2 = this.f130362d;
        if (textTitleBar2 == null) {
            C89219l.m154710a("textTitleBar");
        }
        textTitleBar2.setColorMode(0);
        TextTitleBar textTitleBar3 = this.f130362d;
        if (textTitleBar3 == null) {
            C89219l.m154710a("textTitleBar");
        }
        textTitleBar3.setTitle(this.f130366l);
        mo94452b();
        this.f130374t = (int) C13628n.m24520b(getActivity(), 16.0f);
        if (this.f130371q == null) {
            this.f130371q = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        }
        DataCenter dataCenter = this.f130371q;
        if (dataCenter != null) {
            dataCenter.mo60189a("status_second_level_music_list", (AbstractC1214u<C33942b>) this);
        }
        DataCenter dataCenter2 = this.f130371q;
        if (dataCenter2 != null) {
            dataCenter2.mo60189a("second_level_music_list", (AbstractC1214u<C33942b>) this);
        }
        this.f130372r = new C57238a(getContext(), this.f130371q);
        return a;
    }
}
