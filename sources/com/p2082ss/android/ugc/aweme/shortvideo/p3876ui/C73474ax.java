package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.als.C2564l;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.geofencing.PublishSettingItem;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel.VideoPublishViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ax */
public class C73474ax extends Fragment {

    /* renamed from: c */
    public static final C73475a f165081c = new C73475a((byte) 0);

    /* renamed from: a */
    public C73630e f165082a;

    /* renamed from: b */
    public C2564l<Boolean> f165083b;

    /* renamed from: d */
    private View f165084d;

    /* renamed from: e */
    private RecyclerView f165085e;

    /* renamed from: f */
    private PublishSettingItem f165086f;

    /* renamed from: g */
    private TextView f165087g;

    /* renamed from: h */
    private HashMap f165088h;

    static {
        Covode.recordClassIndex(86211);
    }

    /* renamed from: a */
    public void mo116075a() {
        HashMap hashMap = this.f165088h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo116075a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ax$a */
    public static final class C73475a {
        static {
            Covode.recordClassIndex(86212);
        }

        private C73475a() {
        }

        public /* synthetic */ C73475a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final VideoPublishViewModel m129620b() {
        JediViewModel a = C20531t.m38716a(requireActivity()).mo33800a(VideoPublishViewModel.class);
        C89219l.m154716b(a, "");
        return (VideoPublishViewModel) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ax$c */
    public static final class View$OnClickListenerC73477c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73474ax f165090a;

        /* renamed from: b */
        final /* synthetic */ boolean f165091b;

        static {
            Covode.recordClassIndex(86214);
        }

        View$OnClickListenerC73477c(C73474ax axVar, boolean z) {
            this.f165090a = axVar;
            this.f165091b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C63253l.f143623a.mo73330z().mo93819a(this.f165090a.getActivity(), this.f165091b);
        }
    }

    /* renamed from: a */
    public final void mo116077a(boolean z) {
        if (z) {
            PublishSettingItem publishSettingItem = this.f165086f;
            if (publishSettingItem != null) {
                publishSettingItem.setSubtitle(R.string.g0c);
                return;
            }
            return;
        }
        PublishSettingItem publishSettingItem2 = this.f165086f;
        if (publishSettingItem2 != null) {
            publishSettingItem2.setSubtitle("");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ax$b */
    public static final class View$OnClickListenerC73476b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73474ax f165089a;

        static {
            Covode.recordClassIndex(86213);
        }

        View$OnClickListenerC73476b(C73474ax axVar) {
            this.f165089a = axVar;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f165089a.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                supportFragmentManager.mo3562c();
            }
            C2564l<Boolean> lVar = this.f165089a.f165083b;
            if (lVar == null) {
                C89219l.m154710a("fromPublishSettingPanel");
            }
            lVar.mo7018a((Boolean) true);
        }
    }

    /* renamed from: a */
    public void mo116076a(View view) {
        TextView textView;
        boolean z;
        boolean z2;
        C89219l.m154721d(view, "");
        this.f165084d = view.findViewById(R.id.bu7);
        this.f165085e = (RecyclerView) view.findViewById(R.id.je);
        this.f165083b = m129620b().f165711d;
        View view2 = this.f165084d;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC73476b(this));
        }
        PublishSettingItem publishSettingItem = (PublishSettingItem) view.findViewById(R.id.vy);
        this.f165086f = publishSettingItem;
        String str = null;
        if (publishSettingItem != null) {
            textView = publishSettingItem.getBottomHintTextView();
        } else {
            textView = null;
        }
        this.f165087g = textView;
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.a3g);
            }
            textView.setText(str);
        }
        PublishSettingItem publishSettingItem2 = this.f165086f;
        if (publishSettingItem2 != null) {
            publishSettingItem2.setVisibility(8);
        }
        TextView textView2 = this.f165087g;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_enable_sponsor");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("key_general_music");
        } else {
            z2 = false;
        }
        if (z) {
            PublishSettingItem publishSettingItem3 = this.f165086f;
            if (publishSettingItem3 != null) {
                publishSettingItem3.setVisibility(0);
            }
            PublishSettingItem publishSettingItem4 = this.f165086f;
            if (publishSettingItem4 != null) {
                publishSettingItem4.setDrawableLeft(2131232431);
            }
            PublishSettingItem publishSettingItem5 = this.f165086f;
            if (publishSettingItem5 != null) {
                publishSettingItem5.setTitle(R.string.a3c);
            }
            String h = C63253l.f143623a.mo73330z().mo93830h();
            if (TextUtils.equals(h, "1") || TextUtils.equals(h, "2")) {
                mo116077a(true);
            } else {
                mo116077a(false);
            }
            PublishSettingItem publishSettingItem6 = this.f165086f;
            if (publishSettingItem6 != null) {
                publishSettingItem6.setDrawableRight(2131230993);
            }
            TextView textView3 = this.f165087g;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            C39162r.onEventV3("tcm_bctoggle_show");
            PublishSettingItem publishSettingItem7 = this.f165086f;
            if (publishSettingItem7 != null) {
                publishSettingItem7.setOnClickListener(new View$OnClickListenerC73477c(this, z2));
            }
        }
        List<C72683v> list = m129620b().f165708a;
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.f165085e;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f165085e;
        if (recyclerView2 != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            recyclerView2.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        RecyclerView recyclerView3 = this.f165085e;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        C73630e eVar = new C73630e(list);
        this.f165082a = eVar;
        RecyclerView recyclerView4 = this.f165085e;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(eVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.agr, viewGroup, false);
        C89219l.m154716b(a, "");
        mo116076a(a);
        return a;
    }
}
