package com.bytedance.android.live.wallet.p414b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.livesetting.wallet.LiveFirstRechargeUpgradePackageSetting;
import com.bytedance.android.livesdk.model.C9899p;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.b.a */
public final class C6306a extends Fragment {

    /* renamed from: c */
    public static final C6307a f15773c = new C6307a((byte) 0);

    /* renamed from: a */
    public int f15774a = R.layout.b8b;

    /* renamed from: b */
    public int f15775b = R.layout.b9v;

    /* renamed from: d */
    private ImageView f15776d;

    /* renamed from: e */
    private TextView f15777e;

    /* renamed from: f */
    private LinearLayout f15778f;

    /* renamed from: g */
    private HashMap f15779g;

    static {
        Covode.recordClassIndex(7022);
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a$a */
    public static final class C6307a {
        static {
            Covode.recordClassIndex(7023);
        }

        private C6307a() {
        }

        public /* synthetic */ C6307a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f15779g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a$b */
    static final class C6308b {

        /* renamed from: a */
        final ImageView f15780a;

        /* renamed from: b */
        final TextView f15781b;

        /* renamed from: c */
        final View f15782c;

        /* renamed from: d */
        private final View f15783d;

        static {
            Covode.recordClassIndex(7024);
        }

        public C6308b(View view) {
            C89219l.m154721d(view, "");
            this.f15783d = view;
            View findViewById = view.findViewById(R.id.bz2);
            C89219l.m154716b(findViewById, "");
            this.f15780a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.f2p);
            C89219l.m154716b(findViewById2, "");
            this.f15781b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.djv);
            C89219l.m154716b(findViewById3, "");
            this.f15782c = findViewById3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        MethodCollector.m26663i(10182);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f15776d = (ImageView) view.findViewById(R.id.bz1);
        this.f15777e = (TextView) view.findViewById(R.id.f2q);
        this.f15778f = (LinearLayout) view.findViewById(R.id.cea);
        C9899p value = LiveFirstRechargeUpgradePackageSetting.INSTANCE.getValue();
        if (value == null) {
            MethodCollector.m26664o(10182);
            return;
        }
        ImageModel imageModel = value.f23968b;
        if (imageModel != null) {
            C3951p.m9622a(this.f15776d, imageModel, 0);
        }
        C9698b bVar = value.f23967a;
        if (bVar != null) {
            C7557c.m15538a(bVar, "");
            TextView textView = this.f15777e;
            if (textView != null) {
                textView.setText(C7557c.m15538a(bVar, ""));
            }
        }
        List<C9899p.C9900a> list = value.f23969c;
        C89219l.m154716b(list, "");
        if (!list.isEmpty()) {
            List<C9899p.C9900a> list2 = value.f23969c;
            C89219l.m154716b(list2, "");
            int i2 = 0;
            for (T t : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                View a = C1764a.m5927a(getLayoutInflater(), this.f15775b, this.f15778f, false);
                C89219l.m154716b(a, "");
                C6308b bVar2 = new C6308b(a);
                C89219l.m154716b(t2, "");
                if (i2 == value.f23969c.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                C89219l.m154721d(t2, "");
                View view2 = bVar2.f15782c;
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
                ImageModel imageModel2 = t2.f23971b;
                if (imageModel2 != null) {
                    C3951p.m9622a(bVar2.f15780a, imageModel2, 0);
                }
                C9698b bVar3 = t2.f23970a;
                if (bVar3 != null) {
                    bVar2.f15781b.setText(C7557c.m15538a(bVar3, ""));
                }
                LinearLayout linearLayout = this.f15778f;
                if (linearLayout != null) {
                    linearLayout.addView(a);
                }
                i2 = i3;
            }
        }
        MethodCollector.m26664o(10182);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, this.f15774a, viewGroup, false);
    }
}
