package com.p2082ss.android.ugc.aweme.comment.gift;

import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.MissingFormatArgumentException;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.g */
public final class C36464g extends RecyclerView.AbstractC1350a<C36466h> {

    /* renamed from: a */
    GiftStruct[] f86190a = new GiftStruct[0];

    /* renamed from: b */
    final int f86191b;

    /* renamed from: c */
    private long f86192c = -1;

    /* renamed from: d */
    private final LayoutInflater f86193d;

    /* renamed from: e */
    private final Fragment f86194e;

    /* renamed from: f */
    private final ActivityC0945e f86195f;

    /* renamed from: g */
    private final GiftViewModel f86196g;

    /* renamed from: h */
    private final String f86197h;

    /* renamed from: i */
    private final String f86198i;

    /* renamed from: j */
    private final String f86199j;

    /* renamed from: k */
    private final String f86200k;

    static {
        Covode.recordClassIndex(43762);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C36466h onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m74221a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f86190a.length;
    }

    /* renamed from: a */
    public final void mo63792a(long j) {
        this.f86192c = j;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C36466h hVar, int i) {
        List<String> list;
        String str;
        String quantityString;
        List<String> urlList;
        String str2;
        C36466h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        GiftStruct giftStruct = this.f86190a[i];
        long j = this.f86192c;
        if (giftStruct != null) {
            hVar2.f86202a = giftStruct;
            UrlModel imageList = giftStruct.getImageList();
            if (imageList != null) {
                list = imageList.getUrlList();
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                View findViewById = hVar2.itemView.findViewById(R.id.ba8);
                C89219l.m154716b(findViewById, "");
                SmartImageView smartImageView = (SmartImageView) findViewById;
                UrlModel imageList2 = giftStruct.getImageList();
                if (!(imageList2 == null || (urlList = imageList2.getUrlList()) == null || (str2 = (String) C89070n.m154583g((List) urlList)) == null)) {
                    C20766v a = C20761r.m39061a(str2);
                    a.f49092E = smartImageView;
                    a.f49125v = EnumC20767w.CENTER_INSIDE;
                    a.mo34186c();
                }
            }
            View findViewById2 = hVar2.f86205d.findViewById(R.id.b_r);
            C89219l.m154716b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            try {
                str = hVar2.f86206e.getResources().getQuantityString(R.plurals.ir, giftStruct.getDiamondCount(), Integer.valueOf(giftStruct.getDiamondCount()));
                C89219l.m154716b(str, "");
            } catch (MissingFormatArgumentException unused) {
                if (giftStruct.getDiamondCount() <= 1) {
                    quantityString = hVar2.f86206e.getResources().getQuantityString(R.plurals.ij, 1, 1);
                } else {
                    quantityString = hVar2.f86206e.getResources().getQuantityString(R.plurals.ij, 2, 2);
                }
                C89219l.m154716b(quantityString, "");
                str = giftStruct.getDiamondCount() + ' ' + quantityString;
            }
            textView.setText(str);
            View findViewById3 = hVar2.f86205d.findViewById(R.id.bab);
            C89219l.m154716b(findViewById3, "");
            TuxTextView tuxTextView = (TuxTextView) findViewById3;
            tuxTextView.setMinTextSize(10.0f);
            tuxTextView.setText(giftStruct.getName());
            if (giftStruct.getId() == j) {
                hVar2.f86205d.setBackgroundResource(R.drawable.lv);
            } else {
                hVar2.f86205d.setBackground(null);
            }
            hVar2.f86203b = j;
            hVar2.f86205d.setVisibility(0);
            return;
        }
        hVar2.f86205d.setVisibility(4);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m74221a(C36464g gVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10033);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(gVar.f86193d, R.layout.il, null, false);
        C89219l.m154716b(a2, "");
        C36466h hVar = new C36466h(a2, gVar.f86194e, gVar.f86195f, gVar.f86197h, gVar.f86196g, gVar.f86198i, gVar.f86199j, gVar.f86200k);
        Point point = new Point();
        int b = (int) C13628n.m24520b(gVar.f86195f, 24.0f);
        WindowManager windowManager = gVar.f86195f.getWindowManager();
        C89219l.m154716b(windowManager, "");
        windowManager.getDefaultDisplay().getSize(point);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((point.x - b) / 4, (int) C13628n.m24520b(gVar.f86195f, 100.0f));
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        view.setLayoutParams(aVar);
        C36466h hVar2 = hVar;
        try {
            if (hVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(hVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) hVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(hVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = hVar2.getClass().getName();
        MethodCollector.m26664o(10033);
        return hVar2;
    }

    public C36464g(Fragment fragment, ActivityC0945e eVar, GiftViewModel giftViewModel, String str, String str2, String str3, String str4) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(giftViewModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f86194e = fragment;
        this.f86195f = eVar;
        this.f86196g = giftViewModel;
        this.f86197h = str;
        this.f86198i = str2;
        this.f86199j = str3;
        this.f86200k = str4;
        LayoutInflater from = LayoutInflater.from(eVar);
        C89219l.m154716b(from, "");
        this.f86193d = from;
        this.f86191b = 8;
        giftViewModel.mo63841b().observe(eVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.gift.C36464g.C364651 */

            /* renamed from: a */
            final /* synthetic */ C36464g f86201a;

            static {
                Covode.recordClassIndex(43763);
            }

            {
                this.f86201a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                GiftStruct giftStruct = (GiftStruct) obj;
                if (giftStruct != null) {
                    this.f86201a.mo63792a(giftStruct.getId());
                } else {
                    this.f86201a.mo63792a(-1);
                }
            }
        });
    }
}
