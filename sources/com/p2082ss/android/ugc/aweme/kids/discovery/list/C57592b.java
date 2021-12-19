package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.discovery.list.C57594c;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57559a;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57561c;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.b */
public final class C57592b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final C57593a f131475b = new C57593a((byte) 0);

    /* renamed from: a */
    final List<C57559a> f131476a = new ArrayList();

    static {
        Covode.recordClassIndex(67550);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return 2147483644;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104314a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.b$a */
    public static final class C57593a {
        static {
            Covode.recordClassIndex(67551);
        }

        private C57593a() {
        }

        public /* synthetic */ C57593a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f131476a.size();
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m104314a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(1080);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ack, viewGroup, false);
        C89219l.m154716b(a2, "");
        C57594c cVar = new C57594c(a2);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(1080);
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        String str3;
        C57561c cVar;
        C57561c cVar2;
        MethodCollector.m26663i(1140);
        C89219l.m154721d(viewHolder, "");
        C57559a aVar = this.f131476a.get(i);
        C57594c cVar3 = (C57594c) viewHolder;
        if (aVar != null) {
            View view = cVar3.itemView;
            C89219l.m154716b(view, "");
            int i2 = 0;
            C34729o.m70955a(view.findViewById(R.id.dnb), 0);
            C57561c cVar4 = aVar.f131396b;
            if (cVar3.f131479a == null) {
                cVar3.f131479a = new C57590a(cVar3.f131480b);
                C57590a aVar2 = cVar3.f131479a;
                if (aVar2 == null) {
                    C89219l.m154710a("mAdapter");
                }
                aVar2.f131466d = aVar;
                View view2 = new View(cVar3.f131480b);
                view2.setLayoutParams(new ViewGroup.LayoutParams((int) C13628n.m24520b(cVar3.f131480b, 14.0f), -1));
                C57590a aVar3 = cVar3.f131479a;
                if (aVar3 == null) {
                    C89219l.m154710a("mAdapter");
                }
                aVar3.mo61480a(view2);
                View view3 = cVar3.itemView;
                C89219l.m154716b(view3, "");
                RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.dof);
                C89219l.m154716b(recyclerView, "");
                C57590a aVar4 = cVar3.f131479a;
                if (aVar4 == null) {
                    C89219l.m154710a("mAdapter");
                }
                recyclerView.setAdapter(aVar4);
            }
            if (cVar4 != null) {
                View view4 = cVar3.itemView;
                C89219l.m154716b(view4, "");
                ImageView imageView = (ImageView) view4.findViewById(R.id.alv);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(8);
                if (C80537hk.m139613a(cVar4.f131404d)) {
                    String str4 = cVar4.f131404d;
                    if (str4 == null) {
                        C89219l.m154715b();
                    }
                    C20766v a = C20761r.m39061a(str4);
                    View view5 = cVar3.itemView;
                    C89219l.m154716b(view5, "");
                    a.f49092E = (SmartImageView) view5.findViewById(R.id.c0t);
                    a.mo34186c();
                } else {
                    View view6 = cVar3.itemView;
                    C89219l.m154716b(view6, "");
                    ((SmartImageView) view6.findViewById(R.id.c0t)).setImageResource(2131233006);
                }
                if (!TextUtils.isEmpty(cVar4.f131405e)) {
                    View view7 = cVar3.itemView;
                    C89219l.m154716b(view7, "");
                    TuxTextView tuxTextView = (TuxTextView) view7.findViewById(R.id.f6k);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setText(cVar4.f131405e);
                    View view8 = cVar3.itemView;
                    C89219l.m154716b(view8, "");
                    TuxTextView tuxTextView2 = (TuxTextView) view8.findViewById(R.id.f6k);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                } else {
                    View view9 = cVar3.itemView;
                    C89219l.m154716b(view9, "");
                    TuxTextView tuxTextView3 = (TuxTextView) view9.findViewById(R.id.f6k);
                    C89219l.m154716b(tuxTextView3, "");
                    tuxTextView3.setVisibility(8);
                }
                View view10 = cVar3.itemView;
                C89219l.m154716b(view10, "");
                TuxTextView tuxTextView4 = (TuxTextView) view10.findViewById(R.id.f63);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText(cVar4.f131402b);
                C57590a aVar5 = cVar3.f131479a;
                if (aVar5 == null) {
                    C89219l.m154710a("mAdapter");
                }
                aVar5.f131469g = cVar4.f131401a;
                C57590a aVar6 = cVar3.f131479a;
                if (aVar6 == null) {
                    C89219l.m154710a("mAdapter");
                }
                aVar6.f131468f = 0;
                C57590a aVar7 = cVar3.f131479a;
                if (aVar7 == null) {
                    C89219l.m154710a("mAdapter");
                }
                aVar7.f131470h = cVar4.f131402b;
                C57590a aVar8 = cVar3.f131479a;
                if (aVar8 == null) {
                    C89219l.m154710a("mAdapter");
                }
                aVar8.f131471i = cVar4.f131403c;
                View view11 = cVar3.itemView;
                C89219l.m154716b(view11, "");
                TuxTextView tuxTextView5 = (TuxTextView) view11.findViewById(R.id.f3e);
                C89219l.m154716b(tuxTextView5, "");
                if (aVar.f131396b.f131403c != 1) {
                    i2 = 8;
                }
                tuxTextView5.setVisibility(i2);
                View view12 = cVar3.itemView;
                C89219l.m154716b(view12, "");
                ((TuxTextView) view12.findViewById(R.id.f3e)).setOnClickListener(new C57594c.View$OnClickListenerC57596b(cVar3, cVar4));
            }
            C57590a aVar9 = cVar3.f131479a;
            if (aVar9 == null) {
                C89219l.m154710a("mAdapter");
            }
            IReportAwemeManager iReportAwemeManager = C57594c.f131477d;
            List<? extends Aweme> list = aVar.f131395a;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            aVar9.mo62377b_(iReportAwemeManager.mo94624a(list));
        }
        cVar3.f131481c = true;
        if (cVar3.f131479a != null) {
            C57590a aVar10 = cVar3.f131479a;
            if (aVar10 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar10.f131467e = true;
        }
        if (aVar == null || (cVar2 = aVar.f131396b) == null || cVar2.f131403c != 1) {
            str = "show_trending_content";
            str2 = "trending_content_id";
        } else {
            str = "show_category";
            str2 = "category_id";
        }
        C33743c a2 = new C33743c().mo59976a("enter_from", "discovery").mo59974a("order", Integer.valueOf(i));
        if (aVar == null || (cVar = aVar.f131396b) == null) {
            str3 = null;
        } else {
            str3 = cVar.f131401a;
        }
        C57355f.m103962a(str, a2.mo59976a(str2, str3).mo59977a());
        MethodCollector.m26664o(1140);
    }
}
