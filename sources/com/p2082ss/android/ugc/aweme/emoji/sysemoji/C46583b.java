package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b */
public final class C46583b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public C46605i f108611a;

    /* renamed from: b */
    public int f108612b;

    /* renamed from: c */
    private final AbstractC89244h f108613c = C89250i.m154773a((AbstractC89171a) C46587c.f108618a);

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b$b */
    public static final class C46585b extends RecyclerView.ViewHolder {

        /* renamed from: b */
        public static final C46586a f108616b = new C46586a((byte) 0);

        /* renamed from: a */
        final TextView f108617a;

        static {
            Covode.recordClassIndex(55175);
        }

        /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b$b$a */
        public static final class C46586a {
            static {
                Covode.recordClassIndex(55176);
            }

            private C46586a() {
            }

            public /* synthetic */ C46586a(byte b) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46585b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.auk);
            C89219l.m154716b(findViewById, "");
            this.f108617a = (TextView) findViewById;
        }
    }

    static {
        Covode.recordClassIndex(55173);
    }

    /* renamed from: a */
    public final List<C46584a> mo79182a() {
        return (List) this.f108613c.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89913a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b$c */
    static final class C46587c extends AbstractC89220m implements AbstractC89171a<List<C46584a>> {

        /* renamed from: a */
        public static final C46587c f108618a = new C46587c();

        static {
            Covode.recordClassIndex(55177);
        }

        C46587c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C46584a> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return mo79182a().size();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b$a */
    public static final class C46584a {

        /* renamed from: a */
        public final String f108614a;

        /* renamed from: b */
        public boolean f108615b = false;

        static {
            Covode.recordClassIndex(55174);
        }

        public C46584a(String str) {
            C89219l.m154721d(str, "");
            this.f108614a = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C46585b) {
            C46585b bVar = (C46585b) viewHolder;
            C46584a aVar = mo79182a().get(i);
            C89219l.m154721d(aVar, "");
            bVar.f108617a.setText(aVar.f108614a);
            if (aVar.f108615b) {
                bVar.f108617a.setBackgroundResource(R.drawable.bmj);
            } else {
                bVar.f108617a.setBackgroundResource(R.drawable.bmi);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89913a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11001);
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C89219l.m154721d(context, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.z5, null, false);
        C89219l.m154716b(a2, "");
        C46585b bVar = new C46585b(a2);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(11001);
        return bVar;
    }
}
