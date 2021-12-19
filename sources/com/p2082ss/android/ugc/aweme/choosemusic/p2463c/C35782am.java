package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

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
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35718l;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35957aa;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
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

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.am */
public final class C35782am extends AbstractC34586a implements AbstractC1214u<C33942b> {

    /* renamed from: c */
    public static final C35783a f84450c = new C35783a((byte) 0);

    /* renamed from: a */
    public String f84451a;

    /* renamed from: b */
    String f84452b;

    /* renamed from: d */
    private DmtTabLayout f84453d;

    /* renamed from: e */
    private RtlViewPager f84454e;

    /* renamed from: j */
    private TextTitleBar f84455j;

    /* renamed from: k */
    private TuxStatusView f84456k;

    /* renamed from: l */
    private C35718l f84457l;

    /* renamed from: m */
    private String f84458m;

    /* renamed from: n */
    private boolean f84459n;

    /* renamed from: o */
    private String f84460o;

    /* renamed from: p */
    private int f84461p;

    /* renamed from: q */
    private DataCenter f84462q;

    /* renamed from: r */
    private C35899b f84463r;

    /* renamed from: s */
    private int f84464s;

    /* renamed from: t */
    private int f84465t;

    /* renamed from: u */
    private int f84466u;

    /* renamed from: v */
    private HashMap f84467v;

    static {
        Covode.recordClassIndex(43021);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.am$a */
    public static final class C35783a {
        static {
            Covode.recordClassIndex(43022);
        }

        private C35783a() {
        }

        public /* synthetic */ C35783a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.am$d */
    public static final class C35786d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35782am f84470a;

        static {
            Covode.recordClassIndex(43025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35786d(C35782am amVar) {
            super(0);
            this.f84470a = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f84470a.mo62861b();
            this.f84470a.mo62859a();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f84467v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo62859a() {
        C35899b bVar = this.f84463r;
        if (bVar != null) {
            bVar.mo63027b(this.f84458m, this.f84461p, this.f84466u);
        }
    }

    /* renamed from: b */
    public final void mo62861b() {
        TuxStatusView tuxStatusView = this.f84456k;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f84456k;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView2.mo37867a();
    }

    /* renamed from: c */
    private void m73027c() {
        TuxStatusView tuxStatusView = this.f84456k;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f84456k;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView2.setStatus(C79440a.m138171b(new TuxStatusView.C23263c(), new C35786d(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.am$b */
    public static final class C35784b implements DmtTabLayout.AbstractC17289c {

        /* renamed from: a */
        final /* synthetic */ C35782am f84468a;

        static {
            Covode.recordClassIndex(43023);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35784b(C35782am amVar) {
            this.f84468a = amVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: b */
        public final void mo27575b(DmtTabLayout.C17294f fVar) {
            Integer num;
            Resources resources;
            if (!(fVar == null || fVar.f41525f == null)) {
                View view = fVar.f41525f;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.MusicTabItemView");
                C35957aa aaVar = (C35957aa) view;
                Context context = aaVar.f84876a;
                if (!(context == null || (resources = context.getResources()) == null)) {
                    aaVar.setTextColor(resources.getColor(R.color.c2));
                }
            }
            C35782am amVar = this.f84468a;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f41524e);
            } else {
                num = null;
            }
            amVar.mo62860a(num);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: a */
        public final void mo27574a(DmtTabLayout.C17294f fVar) {
            if (fVar != null) {
                if (fVar.f41525f != null) {
                    View view = fVar.f41525f;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.MusicTabItemView");
                    ((C35957aa) view).mo63091a();
                }
                if (fVar.f41520a != null && (fVar.f41520a instanceof String)) {
                    C35782am amVar = this.f84468a;
                    String str = amVar.f84451a;
                    Object obj = fVar.f41520a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj;
                    C33744d a = new C33744d().mo59983a("enter_from", amVar.f84452b);
                    if (str == null) {
                        str = "";
                    }
                    C33744d a2 = a.mo59983a("category_name", str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    C39162r.m79460a("change_song_language_tab", a2.mo59983a("tab_name", str2).f79943a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.am$c */
    public static final class C35785c implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C35782am f84469a;

        static {
            Covode.recordClassIndex(43024);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35785c(C35782am amVar) {
            this.f84469a = amVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            if (this.f84469a.getActivity() != null) {
                ActivityC0945e activity = this.f84469a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    private static NetworkInfo m73023a(ConnectivityManager connectivityManager) {
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
            this.f84458m = arguments.getString("music_class_id");
            this.f84451a = arguments.getString("music_class_name");
            this.f84452b = arguments.getString("music_class_enter_from");
            this.f84459n = arguments.getBoolean("music_class_is_hot", false);
            this.f84460o = arguments.getString("music_class_enter_method");
            this.f84464s = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.f84461p = arguments.getInt("music_class_level");
            this.f84466u = arguments.getInt("sound_page_scene", 0);
        }
    }

    /* renamed from: a */
    private static boolean m73026a(Context context) {
        if (context != null) {
            try {
                Object a = m73024a(context, "connectivity");
                if (a != null) {
                    NetworkInfo a2 = m73023a((ConnectivityManager) a);
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
    public final void mo62860a(Integer num) {
        ArrayList<C35771af> arrayList;
        C35771af afVar = null;
        if (num != null) {
            int intValue = num.intValue();
            C35718l lVar = this.f84457l;
            if (!(lVar == null || (arrayList = lVar.f84252a) == null)) {
                afVar = arrayList.get(intValue);
            }
        }
        if (afVar instanceof C35771af) {
            RecyclerView.AbstractC1350a k = afVar.mo62887k();
            if (k instanceof C35703b) {
                ((C35703b) k).mo62745a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        C33935b<String, Object> bVar2;
        List<MusicCollectionItem> list;
        ArrayList<MusicCollectionItem> arrayList;
        MusicCollectionItem musicCollectionItem;
        ArrayList<MusicCollectionItem> arrayList2;
        C33942b bVar3 = bVar;
        if (bVar3 != null) {
            String str = bVar3.f80277a;
            int hashCode = str.hashCode();
            if (hashCode != -314811087) {
                if (hashCode == -252789122 && str.equals("second_level_music_list")) {
                    TuxStatusView tuxStatusView = this.f84456k;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("statusView");
                    }
                    tuxStatusView.setVisibility(8);
                    DataCenter dataCenter = this.f84462q;
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
                        TuxStatusView tuxStatusView2 = this.f84456k;
                        if (tuxStatusView2 == null) {
                            C89219l.m154710a("statusView");
                        }
                        tuxStatusView2.setVisibility(0);
                        TuxStatusView tuxStatusView3 = this.f84456k;
                        if (tuxStatusView3 == null) {
                            C89219l.m154710a("statusView");
                        }
                        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                        String string = getString(R.string.cm7);
                        C89219l.m154716b(string, "");
                        tuxStatusView3.setStatus(cVar.mo37878a((CharSequence) string));
                        return;
                    }
                    if (list != null) {
                        int i = 0;
                        for (MusicCollectionItem musicCollectionItem2 : list) {
                            C35718l lVar = this.f84457l;
                            if (!(lVar == null || (arrayList2 = lVar.f84253b) == null)) {
                                arrayList2.add(musicCollectionItem2);
                            }
                            if (this.f84461p == 1) {
                                if (i == 0) {
                                    C35718l lVar2 = this.f84457l;
                                    if (lVar2 != null) {
                                        lVar2.mo62763a(musicCollectionItem2.mcId, musicCollectionItem2.mcName, musicCollectionItem2.isHot, bVar2, this.f84466u);
                                    }
                                } else {
                                    C35718l lVar3 = this.f84457l;
                                    if (lVar3 != null) {
                                        lVar3.mo62763a(musicCollectionItem2.mcId, musicCollectionItem2.mcName, musicCollectionItem2.isHot, null, this.f84466u);
                                    }
                                }
                            }
                            i++;
                        }
                    }
                    RtlViewPager rtlViewPager = this.f84454e;
                    if (rtlViewPager == null) {
                        C89219l.m154710a("mSecondLevelViewPager");
                    }
                    rtlViewPager.setAdapter(this.f84457l);
                    DmtTabLayout dmtTabLayout = this.f84453d;
                    if (dmtTabLayout == null) {
                        C89219l.m154710a("mSecondLevelTabLayout");
                    }
                    RtlViewPager rtlViewPager2 = this.f84454e;
                    if (rtlViewPager2 == null) {
                        C89219l.m154710a("mSecondLevelViewPager");
                    }
                    dmtTabLayout.setupWithViewPager(rtlViewPager2);
                    DmtTabLayout dmtTabLayout2 = this.f84453d;
                    if (dmtTabLayout2 == null) {
                        C89219l.m154710a("mSecondLevelTabLayout");
                    }
                    int tabCount = dmtTabLayout2.getTabCount();
                    for (int i2 = 0; i2 < tabCount; i2++) {
                        C35957aa aaVar = new C35957aa(getContext());
                        C35718l lVar4 = this.f84457l;
                        String str2 = (lVar4 == null || (arrayList = lVar4.f84253b) == null || (musicCollectionItem = arrayList.get(i2)) == null) ? null : musicCollectionItem.mcName;
                        DmtTabLayout dmtTabLayout3 = this.f84453d;
                        if (dmtTabLayout3 == null) {
                            C89219l.m154710a("mSecondLevelTabLayout");
                        }
                        DmtTabLayout.C17294f b = dmtTabLayout3.mo27529b(i2);
                        aaVar.setText(str2);
                        if (b != null) {
                            b.mo27590a(aaVar);
                            b.f41520a = str2;
                        }
                        if (i2 == 0) {
                            aaVar.mo63091a();
                        }
                        DmtTabLayout dmtTabLayout4 = this.f84453d;
                        if (dmtTabLayout4 == null) {
                            C89219l.m154710a("mSecondLevelTabLayout");
                        }
                        int tabCount2 = dmtTabLayout4.getTabCount();
                        DmtTabLayout dmtTabLayout5 = this.f84453d;
                        if (dmtTabLayout5 == null) {
                            C89219l.m154710a("mSecondLevelTabLayout");
                        }
                        View d = dmtTabLayout5.mo27533d(i2);
                        if (d != null) {
                            if (i2 == 0) {
                                if (tabCount2 == 1) {
                                    int i3 = this.f84465t;
                                    m73025a(d, i3, i3);
                                } else {
                                    m73025a(d, this.f84465t, -1);
                                }
                            } else if (i2 == tabCount2 - 1) {
                                m73025a(d, -1, this.f84465t);
                            }
                        }
                    }
                    DmtTabLayout dmtTabLayout6 = this.f84453d;
                    if (dmtTabLayout6 == null) {
                        C89219l.m154710a("mSecondLevelTabLayout");
                    }
                    dmtTabLayout6.mo27521a(new C35784b(this));
                }
            } else if (str.equals("status_second_level_music_list")) {
                Integer num = (Integer) bVar3.mo60212a();
                if (num == null || num.intValue() != 0) {
                    m73027c();
                }
            }
        }
    }

    /* renamed from: a */
    private static Object m73024a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2235);
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
                    MethodCollector.m26664o(2235);
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
        RtlViewPager rtlViewPager = this.f84454e;
        if (rtlViewPager == null) {
            C89219l.m154710a("mSecondLevelViewPager");
        }
        rtlViewPager.setOffscreenPageLimit(1);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        this.f84457l = new C35718l(childFragmentManager, this.f84458m, this.f84451a, this.f84452b, this.f84464s, this.f84459n, this.f84460o, this.f84461p);
        DmtTabLayout dmtTabLayout = this.f84453d;
        if (dmtTabLayout == null) {
            C89219l.m154710a("mSecondLevelTabLayout");
        }
        dmtTabLayout.setTabMode(0);
        DmtTabLayout dmtTabLayout2 = this.f84453d;
        if (dmtTabLayout2 == null) {
            C89219l.m154710a("mSecondLevelTabLayout");
        }
        dmtTabLayout2.setTabMaxWidth(Integer.MAX_VALUE);
        if (!m73026a(getContext())) {
            m73027c();
        } else {
            mo62859a();
        }
    }

    /* renamed from: a */
    private static void m73025a(View view, int i, int i2) {
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
        View a = C1764a.m5927a(layoutInflater, R.layout.a1k, viewGroup, false);
        View findViewById = a.findViewById(R.id.dt6);
        C89219l.m154716b(findViewById, "");
        this.f84453d = (DmtTabLayout) findViewById;
        View findViewById2 = a.findViewById(R.id.dt9);
        C89219l.m154716b(findViewById2, "");
        this.f84454e = (RtlViewPager) findViewById2;
        View findViewById3 = a.findViewById(R.id.co_);
        C89219l.m154716b(findViewById3, "");
        this.f84456k = (TuxStatusView) findViewById3;
        View findViewById4 = a.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById4, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById4;
        this.f84455j = textTitleBar;
        if (textTitleBar == null) {
            C89219l.m154710a("textTitleBar");
        }
        textTitleBar.setOnTitleBarClickListener(new C35785c(this));
        TextTitleBar textTitleBar2 = this.f84455j;
        if (textTitleBar2 == null) {
            C89219l.m154710a("textTitleBar");
        }
        textTitleBar2.setColorMode(0);
        TextTitleBar textTitleBar3 = this.f84455j;
        if (textTitleBar3 == null) {
            C89219l.m154710a("textTitleBar");
        }
        textTitleBar3.setTitle(this.f84451a);
        mo62861b();
        this.f84465t = (int) C13628n.m24520b(getActivity(), 16.0f);
        if (this.f84462q == null) {
            this.f84462q = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        }
        DataCenter dataCenter = this.f84462q;
        if (dataCenter != null) {
            dataCenter.mo60189a("status_second_level_music_list", (AbstractC1214u<C33942b>) this);
        }
        DataCenter dataCenter2 = this.f84462q;
        if (dataCenter2 != null) {
            dataCenter2.mo60189a("second_level_music_list", (AbstractC1214u<C33942b>) this);
        }
        this.f84463r = new C35899b(getContext(), this.f84462q);
        return a;
    }
}
